package hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain.common;

import java.io.File;

public class Policy implements GlobalEnums {

	private String name;
	private Permission permission;
	private File query;
	private String pattern;
	
	public Policy(Policy policy){
		this.name = policy.getName();
		this.permission = policy.getPermission();
		this.query = policy.getQuery();
		this.pattern = policy.getPattern();
	}
	public Policy(String name, File query, String pattern){
		this.name = name;
		this.permission = Permission.DENY;
		this.query = query;
		this.pattern = pattern;
	}
	
	public Policy(String name, Permission permission, File query, String pattern){
		this.name = name;
		this.permission = permission;
		this.query = query;
		this.pattern = pattern;
	}
		
	public String getName() {
		return name;
	}

	public Permission getPermission() {
		return permission;
	}

	public File getQuery() {
		return query;
	}

	public String getPattern() {
		return pattern;
	}

	
}
