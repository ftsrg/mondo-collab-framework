package org.mondo.collaboration.online.rap;

import org.eclipse.rap.rwt.service.UISession;
import org.eclipse.rap.rwt.service.UISessionEvent;
import org.eclipse.rap.rwt.service.UISessionListener;
import org.mondo.collaboration.online.core.NotifierManager;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.util.concurrent.FutureCallback;

public class UINotifierManager {

	
	public static void register(String eventId, UISession session, FutureCallback<Object> callback) {
		NotifierManager.registerCallback(eventId, callback);
		
		UISessionListener listener = new UISessionListener() {
			
			@Override
			public void beforeDestroy(UISessionEvent event) {
				UINotifierManager.unregister(eventId, session, callback);
			}
		};
		session.addUISessionListener(listener);
	}
	
	public static void unregister(String eventId, UISession session, FutureCallback<Object> callback) {
		NotifierManager.removeCallback(eventId, callback);
	}
	
	public static void notifyError(String eventId, Throwable e) {
		NotifierManager.notify(eventId, null, true, e);
	}
	
	public static void notifySuccess(String eventId, Object param) {
		NotifierManager.notify(eventId, param, false, null);
	}
}
