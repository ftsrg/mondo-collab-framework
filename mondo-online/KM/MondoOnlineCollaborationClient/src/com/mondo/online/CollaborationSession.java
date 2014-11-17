package com.mondo.online;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

public class CollaborationSession {

	public static final int STATE_CLOSED = 1;
	public static final int STATE_OPEN = 2;
	public static final int STATE_FINISHED = 3;
	
	private String id;
	private String title;
	private int state;
	
	private JSONObject model;
	
	private List<User> users;
	
	public CollaborationSession(String id, String title, int state) {
		this.id = id;
		this.title = title;
		this.users = new ArrayList<User>();
		this.state = state;
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

	public int getState() {
		return this.state;
	}
	
	public void startSession() {
		this.state = CollaborationSession.STATE_OPEN;
	}
	
	public void finishSession() {
		this.state = CollaborationSession.STATE_FINISHED;
	}
	
	public static String getSessionStateString(int state) {
		if(state == CollaborationSession.STATE_CLOSED) {
			return "CLOSED";
		} else if(state == CollaborationSession.STATE_OPEN) {
			return "OPEN";
		} else if(state == CollaborationSession.STATE_FINISHED) {
			return "FINISHED";
		}
		return "";
	}
	
	public static int getSessionStateByString(String state) {
		if(state == "CLOSED") {
			return CollaborationSession.STATE_CLOSED;
		} else if(state == "OPEN") {
			return CollaborationSession.STATE_OPEN;
		} else if(state == "FINISHED") {
			return CollaborationSession.STATE_FINISHED;
		}
		return 0;
	}
	
	public JSONObject getModel() {
		return this.model;
	}
	
	public void setModel(JSONObject newModel) {
		this.model = newModel;
	}
}

 