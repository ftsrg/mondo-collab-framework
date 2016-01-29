package org.mondo.collaboration.online.rap.widgets;

import org.eclipse.rap.rwt.service.UISession;
import org.eclipse.rap.rwt.service.UISessionEvent;
import org.eclipse.rap.rwt.service.UISessionListener;
import org.mondo.collaboration.online.core.SessionManager;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.util.concurrent.FutureCallback;

public class UISessionManager {

	private static Table<String, UISession, UISessionListener> table = HashBasedTable.create();
	
	public static void register(String eventId, UISession session, FutureCallback<Object> callback) {
		SessionManager.registerCallback(eventId, callback);
		
		UISessionListener listener = new UISessionListener() {
			
			@Override
			public void beforeDestroy(UISessionEvent event) {
				UISessionManager.unregister(eventId, session, callback);
			}
		};
		
		table.put(eventId, session, listener);
		session.addUISessionListener(listener);
	}
	
	public static void unregister(String eventId, UISession session, FutureCallback<Object> callback) {
		SessionManager.removeCallback(eventId, callback);
		UISessionListener listener = table.get(eventId,session);
		session.removeUISessionListener(listener);
		table.remove(eventId, session);
	}
}
