package hu.bme.mit.ftsrg.xacml.access_control.profiles;

import java.util.HashSet;

public class Role {
	private String name;
	private HashSet<User> users;
	
	public Role(String name){
		this.name = name;
	}
	
	public String getRoleName(){
		return name;
	}
	
	/*public boolean addUser(User user){
		if(users.contains(user)){
			return false;
		} else {
			users.add(user);
			return true;
		}
	}
	
	public boolean removeUser(User user){
		if(users.contains(user)){
			users.remove(user);
			return true;
		} else {
			return false;
		}
	}*/
}
