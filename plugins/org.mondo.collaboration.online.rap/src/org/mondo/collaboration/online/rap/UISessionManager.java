package org.mondo.collaboration.online.rap;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.rap.rwt.service.UISession;
import org.eclipse.rap.rwt.service.UISessionEvent;
import org.eclipse.rap.rwt.service.UISessionListener;
import org.mondo.collaboration.online.core.LensSessionManager;
import org.mondo.collaboration.online.core.NotifierManager;
import org.mondo.collaboration.online.core.OnlineLeg;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.common.collect.Table;
import com.google.common.util.concurrent.FutureCallback;

public class UISessionManager {
	
	private static volatile Table<URI, UISession, String> usersConnectedToUriWithUISession = HashBasedTable.create();
	private static volatile Multimap<String, UISession> usersWithUISession = ArrayListMultimap.create();
	
	public static final String EVENT_USER_ONLINE = "org.mondo.collaboration.online.rap.UISessionManager.user.online";
	public static final String EVENT_USER_INACTIVE = "org.mondo.collaboration.online.rap.UISessionManager.user.inactive";
	public static final String EVENT_USER_OFFLINE = "org.mondo.collaboration.online.rap.UISessionManager.user.offline";
	public static final String EVENT_USER_REMOVED = "org.mondo.collaboration.online.rap.UISessionManager.user.removed";
	
	public static final Logger logger = Logger.getLogger(UISessionManager.class);
	
	static {
		NotifierManager.registerCallback(LensSessionManager.EVENT_REGISTER, new RegisteredUser());
		NotifierManager.registerCallback(LensSessionManager.EVENT_UNREGISTER, new UnregisteredUser());
		NotifierManager.registerCallback(LensSessionManager.EVENT_WHITEBOARD_LEG_CLOSED_BY_USER, new LegClosed());
	}
	
	/**
	 * List of the active users. A user is active, if he/she has an active {@link UISession} and {@link HttpSession}
	 */
	public static Collection<String> getActiveUsers(URI uri) {
		if(uri == null) return Collections.emptyList();
		return usersConnectedToUriWithUISession.row(uri).values().stream().filter(user -> LensSessionManager.getUsersForURI(uri).contains(user)).collect(Collectors.toSet());
	}
	
	/**
	 * List of the inactive users. A user is inactive, if he/she has an active {@link UISession} but his/her {@link HttpSession} is destroyed.
	 */
	public static Collection<String> getInactiveUsers(URI uri) {
		if(uri == null) return Collections.emptyList();
		return usersConnectedToUriWithUISession.row(uri).values().stream().filter(user -> !LensSessionManager.getUsersForURI(uri).contains(user)).collect(Collectors.toSet());
	}
	
	/**
	 * List of the offline users. A user is offline, if he/she has an active {@link HttpSession} but his/her {@link UISession} is destroyed.
	 */
	public static Collection<String> getOfflineUsers(URI uri) {
		if(uri == null) return Collections.emptyList();
		return LensSessionManager.getUsersForURI(uri).stream().filter(user -> !getActiveUsers(uri).contains(user)).collect(Collectors.toSet());
	}
	
	public static void register(URI uri, String username, UISession session) {
		boolean newOnline = !usersConnectedToUriWithUISession.row(uri).containsValue(username);
		usersConnectedToUriWithUISession.put(uri, session, username);
		usersWithUISession.put(username, session);
		if(newOnline) {
			UINotifierManager.notifySuccess(EVENT_USER_ONLINE, new Entry<URI, String>(uri, username));
			logger.info("User online:" + username + " - uri: " + uri);
		}
		session.addUISessionListener(new RemoveSessionListener());
	}
	
	public static void remove(URI uri, String username, UISession session) {
		usersConnectedToUriWithUISession.remove(uri, session);
		usersWithUISession.remove(username, session);
		boolean offline = !usersConnectedToUriWithUISession.row(uri).containsValue(username);
		if(offline) {
			UINotifierManager.notifySuccess(EVENT_USER_OFFLINE, new Entry<URI, String>(uri, username));
			logger.info("User offline:" + username + " - uri: " + uri);
		} 
	}
	
	private static final class RegisteredUser implements FutureCallback<Object> {
		@Override
		public void onSuccess(Object arg0) {
			OnlineLeg leg = (OnlineLeg) arg0;
			String username = leg.getUserName();
			URI uri = leg.getOnlineCollaborationSession().getGoldConfinementURI();
			UINotifierManager.notifySuccess(EVENT_USER_ONLINE, new Entry<URI, String>(uri, username));
			logger.info("User online again:" + username + " - uri: " + uri);
		}

		@Override
		public void onFailure(Throwable arg0) {}
	}

	private static final class UnregisteredUser implements FutureCallback<Object> {
		@Override
		public void onSuccess(Object arg0) {
			String username = (String) arg0;
			Set<URI> uriSet = LensSessionManager.getURIsForUser(username);
			Collection<UISession> uiSessions = usersWithUISession.get(username);
			iterate: for (URI uri : uriSet) {
				for (UISession uiSession : uiSessions) {
						if(usersConnectedToUriWithUISession.contains(uri, uiSession)) {
							UINotifierManager.notifySuccess(EVENT_USER_INACTIVE, new Entry<URI, String>(uri, username));
							logger.info("User became inactive:" + username + " - uri: " + uri);
							break iterate;
						}
				}
				UINotifierManager.notifySuccess(EVENT_USER_REMOVED, new Entry<URI, String>(uri, username));
				logger.info("User removed automatically:" + username + " - uri: " + uri);
			}
		}

		@Override
		public void onFailure(Throwable arg0) {}
	}
	
	private static final class LegClosed implements FutureCallback<Object> {
		@Override
		public void onSuccess(Object arg0) {
			OnlineLeg leg = (OnlineLeg) arg0;
			String username = leg.getUserName();
			URI uri = leg.getOnlineCollaborationSession().getGoldConfinementURI();
			UINotifierManager.notifySuccess(EVENT_USER_REMOVED, new Entry<URI, String>(uri, username));
			logger.info("User closed session:" + username + " - uri: " + uri);
		}

		@Override
		public void onFailure(Throwable arg0) {}
	}

	@SuppressWarnings("serial")
	private static final class RemoveSessionListener implements UISessionListener {
		@Override
		public void beforeDestroy(UISessionEvent event) {
			String username = (String) event.getUISession().getAttribute("username");
			usersWithUISession.remove(username, event.getUISession());
			ImmutableSet<URI> uriSet = ImmutableSet.copyOf(usersConnectedToUriWithUISession.column(event.getUISession()).keySet());
			for (URI uri : uriSet) {
				usersConnectedToUriWithUISession.remove(event.getUISession(), uri);
				if (!usersConnectedToUriWithUISession.values().contains(username)) {
					UINotifierManager.notifySuccess(EVENT_USER_OFFLINE, new Entry<URI, String>(uri, username));
					logger.info("UISession destroyed for user:" + username + " - uri: " + uri);
				}
			}
		}
	}

	public static class Entry<K,V> {
		
		private K key;
		private V value;

		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		public K getKey() {
			return key;
		}
		
		public V getValue() {
			return value;
		}
	}
}
