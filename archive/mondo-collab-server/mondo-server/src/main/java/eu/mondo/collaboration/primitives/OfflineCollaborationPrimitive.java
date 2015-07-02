package eu.mondo.collaboration.primitives;

public enum OfflineCollaborationPrimitive {
	CHECKOUT,
	MERGE,  
	UPDATE,
	COMMIT,
	LOCK,
	UNLOCK,
	LIST_LOCKS,
	LOG,
	CHANGE_PERMISSION;
	
	public static OfflineCollaborationPrimitive getValue(String value) {
		switch(value) {
			case "CHECKOUT": 
				return CHECKOUT;
			case "MERGE": 
				return MERGE;
			case "UPDATE": 
				return UPDATE;
			case "COMMIT": 
				return COMMIT;
			case "LOCK": 
				return LOCK;
			case "UNLOCK": 
				return UNLOCK;
			case "LIST_LOCKS": 
				return LIST_LOCKS;
			case "LOG": 
				return LOG;
			case "CHANGE_PERMISSION": 
				return CHANGE_PERMISSION;
		}
		return null;
	}
}
