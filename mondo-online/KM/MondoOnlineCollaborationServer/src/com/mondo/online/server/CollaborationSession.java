package com.mondo.online.server;

import java.util.ArrayList;
import java.util.List;

public class CollaborationSession {
	private String id;
	private String title;
	
	private List<User> users;
	
	private boolean isOpen;
	
	public CollaborationSession(String id, String title) {
		this.id = id;
		this.title = title;
		this.users = new ArrayList<User>();
		this.isOpen = false;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void addUser(User newUser) {
		this.users.add(newUser);
	}
	
	public List<User> getUsers() {
		return this.users;
	}
	
	public void removeUser(User userToRemove) {
		// TODO is users.remove(userToRemove) enough?
		for(User u: this.users) {
			if(u.getUserId() == userToRemove.getUserId()) {
				this.users.remove(u);
				break;
			}
		}
	}

	public boolean isOpen() {
		return this.isOpen;
	}
	
	public void startSession() {
		this.isOpen = true;
	}
	
	public void finishSession() {
		this.isOpen = false;
		// TODO persist new model
	}
}

 