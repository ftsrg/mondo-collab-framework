package org.mondo.collaboration.online.core;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StorageAccessFactory {

	public enum Type {
		SVN, Dummy
	}
	
	public static StorageAccess createStorageAccess(Type type, String username, String password) throws FileNotFoundException, IOException {
		if(type == Type.SVN) {
			return new StorageAccessSvn(username, password);
		} else {
			return new StorageAccessDummy(username, password);
		}
	}
	
}
