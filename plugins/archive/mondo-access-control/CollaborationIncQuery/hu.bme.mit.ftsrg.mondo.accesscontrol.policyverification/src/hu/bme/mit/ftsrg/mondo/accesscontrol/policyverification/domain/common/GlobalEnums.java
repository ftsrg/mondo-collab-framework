package hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain.common;

import hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain.common.GlobalEnums;

public interface GlobalEnums {
	public static enum Permission {
		DENY,
		ALLOW
	}
	public static enum Target {
		GROUP,
		USER
	}
	
	public static <T extends Enum<?>> T searchEnum(Class<T> enumeration, String search) {
		for (T each : enumeration.getEnumConstants()) {
	        if (each.name().compareToIgnoreCase(search) == 0) {
	            return each;
	        }
	    }
		return null;
	}
	
	/**
	 * Visszaadja egy jogosultság ellentétét
	 * @param permission
	 * @return
	 */
	public static Permission getInverseParmission(Permission permission){
		switch (permission) {
		case ALLOW:
			return Permission.DENY;
		case DENY:
		default:
			return Permission.ALLOW;
		}
	}
}
