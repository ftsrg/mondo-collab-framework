package org.mondo.collaboration.online.client.application;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private String password;
	private String id;
	
	private List<String> leadSessionIds;
	
	public User(String name, String password) {
		this.name = name;
		this.password = password;
		this.id = name;
		this.leadSessionIds = new ArrayList<String>();
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
	
	public static boolean usersEqual(User u1, User u2) {
		if(u1.name == u2.name
		&& u1.id == u2.id) {
			return true;
		}
		return false;
	}
	
	public void addSessionId(String newId) {
		this.leadSessionIds.add(newId);
	}
	
	public boolean removeSessionId(String id) {
		if(this.leadSessionIds.contains(id)) { 
			this.leadSessionIds.remove(id);
			return true;
		}
		return false;
	}
	
	public boolean leadsSession(String sessionId) {
		return this.leadSessionIds.contains(sessionId);
	}
}
