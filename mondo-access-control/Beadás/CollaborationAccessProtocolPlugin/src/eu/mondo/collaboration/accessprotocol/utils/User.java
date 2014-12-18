package eu.mondo.collaboration.accessprotocol.utils;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String userId;
	private List<Role> roles;
	
	public User(String userId) {
		this.userId = userId;
		this.roles = new ArrayList<Role>();
	}
	public void setRole(Role role){
		this.roles.add(role);
	}
	public List<Role> getRole(){
		return roles;
	}
	public String getId(){
		return userId;
	}
}
