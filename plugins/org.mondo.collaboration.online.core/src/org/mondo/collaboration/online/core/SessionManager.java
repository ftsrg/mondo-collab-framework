package org.mondo.collaboration.online.core;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.util.concurrent.FutureCallback;

public class SessionManager {

	private static Multimap<String, FutureCallback<Object>> notifiers = ArrayListMultimap.create();	
	
	public static void registerCallback(String eventId, FutureCallback<Object> callback) {
		notifiers.put(eventId, callback);
	}
	
	public static void removeCallback(String eventId, FutureCallback<Object> callback) {
		notifiers.remove(eventId, callback);
	}
	
	public static void notifyError(String eventId, Throwable e) {
		notify(eventId, null, true, e);
	}
	
	public static void notifySuccess(String eventId, Object param) {
		notify(eventId, param, false, null);
	}
	
	public static void notify(String eventId, Object param, boolean error, Throwable e) {
		for (FutureCallback<Object> callback : notifiers.get(eventId)) {
			if(error) {
				callback.onFailure(e);
			} else {
				callback.onSuccess(param);
			}
		}
	}
}
