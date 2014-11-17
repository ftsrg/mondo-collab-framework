package com.mondo.online.server;

public class User {
	private String name;
	private String password;
	private String id;
	
	public User(String name, String password) {
		this.name = name;
		this.password = password;
		this.id = name;
	}
	
	public String getUserName() {
		return this.name;
	}
	
	public String getUserId() {
		return this.id;
	}
	
	public String getPassword() {
		return this.password;
	}
}
