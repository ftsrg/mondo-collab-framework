package hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain.common;

import java.util.List;

public class PolicySet implements GlobalEnums{
	protected Permission defaultPermission;
	protected Permission permissionOverride;
	protected Target targetType;
	protected String guid;
	protected List<Policy> policies;
	
	public PolicySet(PolicySet policySet){
		this.defaultPermission = policySet.getDefaultPermission();
		this.permissionOverride = policySet.getPermissionOverride();
		this.targetType = policySet.getTargetType();
		this.guid = policySet.getGuid();
		this.policies = policySet.getPolicies();
	}
	public PolicySet(Target targetType, String guid, List<Policy> policies) {
		this.defaultPermission = null;
		this.permissionOverride = Permission.DENY;
		this.targetType = targetType;
		this.guid = guid;
		this.policies = policies;
	}
	public PolicySet(Target targetType, String guid, List<Policy> policies, Permission permissionOverride) {
		this.defaultPermission = null;
		this.permissionOverride = permissionOverride;
		this.targetType = targetType;
		this.guid = guid;
		this.policies = policies;
	}
	public PolicySet(Target targetType, String guid, List<Policy> policies, Permission permissionOverride, Permission defaultPermission) {
		this.defaultPermission = defaultPermission;
		this.permissionOverride = permissionOverride;
		this.targetType = targetType;
		this.guid = guid;
		this.policies = policies;
	}
		
	public Permission getDefaultPermission() {
		return defaultPermission;
	}

	public Permission getPermissionOverride() {
		return permissionOverride;
	}

	public Target getTargetType() {
		return targetType;
	}

	public String getGuid() {
		return guid;
	}

	public List<Policy> getPolicies() {
		return policies;
	}

}
