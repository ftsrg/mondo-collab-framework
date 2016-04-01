package org.mondo.collaboration.online.core;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.equinox.http.servlet.HttpServiceServlet;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.mondo.collaboration.security.lens.bx.online.OnlineCollaborationSession;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;

public class LensSessionManager {

	private static final Logger logger = Logger.getLogger(LensSessionManager.class);
	private static volatile Table<String, URI, OnlineLeg> table = HashBasedTable.create();
	private static volatile Map<HttpSession, String> mapping = Maps.newHashMap();
	private static volatile Set<URI> uriSet = Sets.newHashSet();

	/**
	 * When an user is registered to a new {@link OnlineLeg}.
	 */
	public static final String EVENT_REGISTER = "org.mondo.collaboration.online.core.LensSessionManager.register";
	/**
	 * When an user is unregistered with all of the {@link OnlineLeg}. There is no more {@link HttpSession} related to the user.
	 */
	public static final String EVENT_UNREGISTER = "org.mondo.collaboration.online.core.LensSessionManager.unregister";
	/**
	 * When an {@link OnlineLeg} closed by a user (e.g. the user closed the editor) and there is no more session related to the URI
	 */
	public static final String EVENT_WHITEBOARD_LEG_CLOSED_BY_USER = "org.mondo.collaboration.online.core.LensSessionManager.leg_closed_by_user";
	/**
	 * When an new {@link OnlineCollaborationSession} is initialized.
	 */
	public static final String EVENT_WHITEBOARD_SESSION_OPENED = "org.mondo.collaboration.online.core.LensSessionManager.session_opened";
	/**
	 * When an {@link OnlineCollaborationSession} has no more legs.
	 */
	public static final String EVENT_WHITEBOARD_SESSION_CLOSED = "org.mondo.collaboration.online.core.LensSessionManager.session_closed";

	/**
	 * This method is called when a new user joins to an
	 * {@link OnlineCollaborationSession}
	 * 
	 * @param user
	 *            is the name of the user
	 * @param session
	 *            is the {@link HttpSession}
	 * @param uri
	 *            of the gold model
	 * @param leg
	 *            is the created lens for session in the name of the user
	 */
	public static void register(String user, HttpSession session, URI uri, OnlineLeg leg) {
		table.put(user, uri, leg);
		mapping.put(session, user);
		uriSet.add(uri);
		NotifierManager.notifySuccess(EVENT_REGISTER, leg);
	}

	/**
	 * This method is called by the {@link HttpSessionListener} when a session
	 * is destroyed. Removes the session from the session mapping. If the user
	 * has no more session, all the used legs will be disposed.
	 * 
	 * @param session
	 *            that is destroyed
	 */
	protected static void unregister(HttpSession session) {
		String user = mapping.get(session);
		if(user == null) return;
		
		mapping.remove(session);
		if (!mapping.containsValue(user)) {
			Set<Entry<URI, OnlineLeg>> entrySet = Sets.newHashSet(table.row(user).entrySet());
			for (Entry<URI, OnlineLeg> entry : entrySet) {
				OnlineCollaborationSession collaborationSession = entry.getValue().getOnlineCollaborationSession();

				table.row(user).values().remove(entry.getValue());
				entry.getValue().dispose();
				if (collaborationSession.getLegs().isEmpty()) {
					removeURI(entry.getKey(), entry.getValue());
				}
			}
			NotifierManager.notifySuccess(EVENT_UNREGISTER, user);
		}
	}

	private static void removeURI(URI uri, OnlineLeg leg) {
		uriSet.remove(uri);
		StorageAccess storageAccess = leg.getStorageAccess();
		OnlineCollaborationSession whiteboardSession = leg.getOnlineCollaborationSession();
		storageAccess.finishSession(whiteboardSession.getGoldConfinementURI(), whiteboardSession.getOwnerUsername(), whiteboardSession.getOwnerPassword());
		NotifierManager.notifySuccess(EVENT_WHITEBOARD_SESSION_CLOSED, leg);
	}

	/**
	 * This method is called by the clients (e.g. closing an editor).
	 * 
	 * @param user
	 *            is someone who close the leg.
	 * @param uri
	 *            is URI of gold resource.
	 * @param leg
	 *            is the leg to be closed.
	 * @param session
	 *            is the session on which the close action happened
	 */
	public static void close(String user, HttpSession session, URI uri, OnlineLeg leg) {
		mapping.remove(session);
		if (!mapping.containsValue(user)) {
			OnlineCollaborationSession collaborationSession = leg.getOnlineCollaborationSession();
			leg.dispose();
			if (collaborationSession.getLegs().isEmpty())
				removeURI(uri, leg);
			table.remove(user, uri);
			NotifierManager.notifySuccess(EVENT_WHITEBOARD_LEG_CLOSED_BY_USER, leg);
		}
		mapping.put(session, user);
	}

	public static OnlineLeg getExistingLeg(String user, HttpSession session, URI goldURI) {
		OnlineLeg leg = table.get(user, goldURI);
		if (leg != null) {
			logger.info("Existing leg is returned for " + goldURI.toFileString());
			mapping.put(session, user);
		} else {
			logger.info("No leg exists for " + goldURI.toFileString());
		}

		return leg;
	}

	public static OnlineLeg createLeg(URI goldURI, StorageAccess sa, AdapterFactoryEditingDomain domain,
			HttpSession session) {
		OnlineCollaborationSession collabSession;
		if (table.column(goldURI).isEmpty()) {
			logger.info("New session has to be initialized for " + goldURI.toFileString());
			collabSession = createSession(goldURI, sa);
		} else {
			collabSession = table.column(goldURI).values().iterator().next().getOnlineCollaborationSession();
		}

		try {
			logger.info(String.format("Leg is creating for user: %s uri: %s", sa.getUsername(), goldURI.toString()));
			OnlineLeg leg = new OnlineLeg(collabSession, sa, true, domain,	OnlineCollaborationSession.FAKE_MAIN_RESOURCE_URI);
			register(sa.getUsername(), session, goldURI, leg);
			logger.info("Leg created");
			return leg;
		} catch (InvocationTargetException e) {
			logger.error("Error during lens execution", e);
		}
		return null;
	}

	private static OnlineCollaborationSession createSession(URI goldURI, StorageAccess sa) {
		try {
			logger.info(String.format("Lens is creating for uri: %s", goldURI.toString()));

			List<Resource> policyModelAndLockModels = sa.loadPolicyAndLockModels();
			Resource policyModel = policyModelAndLockModels.get(0);
			Resource lockModel = policyModelAndLockModels.get(1);
			ResourceSetImpl rSet = new ResourceSetImpl();
			rSet.getResource(goldURI, true);
			OnlineCollaborationSession onlineCollaborationSession = new OnlineCollaborationSession(goldURI, rSet,
					EObjectCorrespondence.getRegisteredIDProviderFactory(), policyModel, lockModel, sa.getUsername(), sa.getPassword());

			NotifierManager.notifySuccess(EVENT_WHITEBOARD_SESSION_OPENED, goldURI);
			logger.info("Lens created");
			return onlineCollaborationSession;
		} catch (IncQueryException | CoreException e) {
			logger.error("Error during online session initialization", e);
		}
		return null;
	}

	public static final HttpSessionListenerImplementation SERVICE_LISTENER = new HttpSessionListenerImplementation();

	private static final class HttpSessionListenerImplementation implements HttpSessionListener {

		public static int MAX_INTERVAL = 15 * 60; // 15 minutes

		private static final Logger logger = Logger.getLogger(HttpSessionListenerImplementation.class);

		@Override
		public void sessionDestroyed(HttpSessionEvent se) {
			HttpSession session = se.getSession();
			LensSessionManager.unregister(session);
			logger.info("Http Session Removed");
		}

		@Override
		public void sessionCreated(HttpSessionEvent se) {
			logger.info("Http Session Created");
			HttpSession session = se.getSession();
			session.setMaxInactiveInterval(MAX_INTERVAL);
		}
	}

	/**
	 * Returns a Set view of the users contained in this manager. The set is
	 * backed by a map, so changes to the session are reflected in the set, and
	 * vice-versa. If the map is modified while an iteration over the set is in
	 * progress (except through the iterator's own remove operation), the
	 * results of the iteration are undefined. The set supports element removal,
	 * which removes the corresponding mapping from the map, via the
	 * Iterator.remove, Set.remove, removeAll, retainAll, and clear operations.
	 * It does not support the add or addAll operations.
	 * 
	 * @param goldURI
	 * @return
	 */
	public static Set<String> getUsersForURI(URI goldURI) {
		return table.column(goldURI).keySet();
	}

	/**
	 * Returns a Set view of the users contained in this manager. The set is
	 * backed by a map, so changes to the session are reflected in the set, and
	 * vice-versa. If the map is modified while an iteration over the set is in
	 * progress (except through the iterator's own remove operation), the
	 * results of the iteration are undefined. The set supports element removal,
	 * which removes the corresponding mapping from the map, via the
	 * Iterator.remove, Set.remove, removeAll, retainAll, and clear operations.
	 * It does not support the add or addAll operations.
	 * 
	 * @param goldURI
	 * @return
	 */
	public static Set<URI> getURIsForUser(String user) {
		return table.row(user).keySet();
	}
	
	public static Set<URI> getUriSet() {
		return uriSet;
	}

	public static void initializeHttpSessionListener() {
		BundleContext bundleContext = FrameworkUtil.getBundle(HttpServiceServlet.class).getBundleContext();
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_LISTENER, Boolean.TRUE.toString());
		properties.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_SELECT,
				"(" + HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME + "=*)");
		bundleContext.registerService(new String[] { HttpSessionListener.class.getName() }, SERVICE_LISTENER,
				properties);
	}
	
	public static Collection<OnlineLeg> getAllOnlineLegs(){
		return table.values();
	}
}