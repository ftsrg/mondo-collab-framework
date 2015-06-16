package org.mondo.collaboration.client;

public class User {
	
	private String username;
	private String password;
	private boolean isSet;
	
	public User() {
		this.isSet = false;
	}
	
	public void setUsername(String newUsername) {
		if(!newUsername.equals("")) {
			this.isSet = true;
		} else {
			this.isSet = false;
		}
		this.username = newUsername;
	}
	
	public void setPassword(String newPassword) {
		this.password = newPassword;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public boolean isSet() {
		return this.isSet;
	}
}
