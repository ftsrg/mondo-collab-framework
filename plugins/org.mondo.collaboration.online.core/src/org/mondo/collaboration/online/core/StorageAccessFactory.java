package org.mondo.collaboration.online.core;

public class StorageAccessFactory {

	public static final Type type = Type.SVN;
	
	public enum Type {
		SVN, Dummy
	}
	
	public static StorageAccess createStorageAccess(String username, String password, String repository) throws Exception {
		if(type == Type.SVN) {
			return new StorageAccessSvn(username, password, repository);
		} else {
			return new StorageAccessDummy(username, password, repository);
		}
	}
	
}
