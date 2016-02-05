package org.mondo.collaboration.online.rap;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.rap.rwt.service.UISession;
import org.eclipse.rap.rwt.service.UISessionEvent;
import org.eclipse.rap.rwt.service.UISessionListener;
import org.mondo.collaboration.online.core.LensSessionManager;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class UISessionManager {
	
	private static volatile Table<URI, UISession, String> activeUsers = HashBasedTable.create();
	
	public static final String EVENT_USER_ONLINE = "org.mondo.collaboration.online.rap.UISessionManager.user.online";
	public static final String EVENT_USER_INACTIVE = "org.mondo.collaboration.online.rap.UISessionManager.user.inactive";

	public static Collection<String> getActiveUsers(URI uri) {
		return activeUsers.row(uri).values();
	}
	
	public static Collection<String> getInactiveUsers(URI uri) {
		return LensSessionManager.getUsersForURI(uri).stream().filter(user -> !getActiveUsers(uri).contains(user)).collect(Collectors.toSet());
	}
	
	public static void register(URI uri, String username, UISession session) {
		boolean newOnline = !activeUsers.row(uri).containsValue(username);
		activeUsers.put(uri, session, username);
		if(newOnline) {
			UINotifierManager.notifySuccess(EVENT_USER_ONLINE, new Entry<URI, String>(uri, username));
		}
		session.addUISessionListener(new RemoveSessionListener());
	}
	
	public static void remove(URI uri, String username, UISession session) {
		activeUsers.remove(uri, session);
		boolean wentInactive = !activeUsers.row(uri).containsValue(username);
		if(wentInactive) {
			UINotifierManager.notifySuccess(EVENT_USER_INACTIVE, new Entry<URI, String>(uri, username));
		} 
	}
	
	private static final class RemoveSessionListener implements UISessionListener {
		@Override
		public void beforeDestroy(UISessionEvent event) {
			String username = activeUsers.column(event.getUISession()).values().iterator().next();
			activeUsers.column(event.getUISession()).clear();
			if(!activeUsers.values().contains(username))
				UINotifierManager.notifySuccess(EVENT_USER_INACTIVE, username);
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
