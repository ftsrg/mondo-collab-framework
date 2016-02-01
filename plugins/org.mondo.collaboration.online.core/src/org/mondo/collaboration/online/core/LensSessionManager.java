package org.mondo.collaboration.online.core;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

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
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;

public class LensSessionManager {

	private static final Logger logger = Logger.getLogger(LensSessionManager.class);
	private static Table<String, URI, OnlineLeg> table = HashBasedTable.create();
	private static Map<HttpSession, String> mapping = Maps.newHashMap();
	
	
	public static final String EVENT_REGISTER = "org.mondo.collaboration.online.core.LensSessionManager.register";
	public static final String EVENT_UNREGISTER = "org.mondo.collaboration.online.core.LensSessionManager.unregister";
	public static final String EVENT_LEG_CLOSED_BY_USER = "org.mondo.collaboration.online.core.LensSessionManager.leg_closed_by_user";
	
	
	/**
	 * This method is called when a new user joins to an {@link OnlineCollaborationSession}
	 * @param user is the name of the user
	 * @param session is the {@link HttpSession}
	 * @param uri of the gold model
	 * @param leg is the created lens for session in the name of the user
	 */
	public static void register(String user, HttpSession session, URI uri, OnlineLeg leg) {
		table.put(user, uri, leg);
		mapping.put(session, user);
		NotifierManager.notifySuccess(EVENT_REGISTER, leg);
	}
	
	/**
	 * This method is called by the {@link HttpSessionListener} when a session is destroyed.
	 * @param session that is destroyed
	 */
	protected static void unregister(HttpSession session) {
		String user = mapping.get(session);
		mapping.remove(session);
		
		if(!mapping.containsValue(user)) {
			Collection<OnlineLeg> legs = Lists.newArrayList(table.row(user).values());
			for (OnlineLeg onlineLeg : legs) {
				table.row(user).values().remove(onlineLeg);
				onlineLeg.dispose();
			}
			NotifierManager.notifySuccess(EVENT_UNREGISTER, user);
		}
	}
	
	/**
	 * This method is called by the clients (e.g. closing an editor).
	 * @param user is someone who close the leg.
	 * @param uri is URI of gold resource.
	 * @param leg is the leg to be closed.
	 * @param session is the session on which the close action happened
	 */
	public static void close(String user, HttpSession session, URI uri, OnlineLeg leg) {
		mapping.remove(session);
		if(!mapping.containsValue(user)) {
			leg.dispose();
			table.remove(user, uri);
			NotifierManager.notifySuccess(EVENT_LEG_CLOSED_BY_USER, leg);
		}
		mapping.put(session, user);
	}
	
	public static OnlineLeg getExistingLeg(String user, HttpSession session, URI goldURI) {
		OnlineLeg leg = table.get(user, goldURI);
		if(leg != null) {
			logger.info("Existing leg is returned for "+ goldURI.toFileString());
			mapping.put(session, user);
		}
		else {
			logger.info("No leg exists for "+goldURI.toFileString());
		}
			
		return leg;
	}
	
	public static OnlineLeg createLeg(URI goldURI, StorageAccess sa, AdapterFactoryEditingDomain domain, HttpSession session) {
		OnlineCollaborationSession collabSession;
		if(table.column(goldURI).isEmpty()) {
			logger.info("New session has to be initialized for " + goldURI.toFileString());
			collabSession = createSession(goldURI, sa);
		}
		else {
			collabSession = table.column(goldURI).values().iterator().next().getOnlineCollaborationSession();
		}
		
		try {
			logger.info(String.format("Leg is creating for user: %s uri: %s", sa.getUsername(), goldURI.toString()));
			OnlineLeg leg = new OnlineLeg(collabSession, sa.getUsername(), sa.getObfuscator(), true, domain, OnlineCollaborationSession.FAKE_MAIN_RESOURCE_URI);
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

			Resource policyModel = sa.loadPolicyModel();
			ResourceSetImpl rSet = new ResourceSetImpl();
			rSet.getResource(goldURI, true);
			OnlineCollaborationSession onlineCollaborationSession = new OnlineCollaborationSession(goldURI, rSet,
					EObjectCorrespondence.getRegisteredIDProviderFactory(), policyModel);
			
			logger.info("Lens created");
			return onlineCollaborationSession;
		} catch (IncQueryException | CoreException e) {
			logger.error("Error during online session initialization", e);
		}
		return null;
	}
	
	public static final HttpSessionListenerImplementation SERVICE_LISTENER = new HttpSessionListenerImplementation();

	private static final class HttpSessionListenerImplementation implements HttpSessionListener {
		
		private static final Logger logger = Logger.getLogger(HttpSessionListenerImplementation.class);
				
		@Override
		public void sessionDestroyed(HttpSessionEvent se) {
			logger.info("Http Session Remove");
			HttpSession session = se.getSession();
			LensSessionManager.unregister(session);
		}

		@Override
		public void sessionCreated(HttpSessionEvent se) {
			logger.info("Http Session Created");
		}
	}

	public static void initializeHttpSessionListener() {
		BundleContext bundleContext = FrameworkUtil.getBundle(HttpServiceServlet.class).getBundleContext();
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_LISTENER, Boolean.TRUE.toString());
		properties.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_SELECT, "("+HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME+"=*)");
		bundleContext.registerService(new String[] {HttpSessionListener.class.getName()}, SERVICE_LISTENER, properties);
	}
	
}
