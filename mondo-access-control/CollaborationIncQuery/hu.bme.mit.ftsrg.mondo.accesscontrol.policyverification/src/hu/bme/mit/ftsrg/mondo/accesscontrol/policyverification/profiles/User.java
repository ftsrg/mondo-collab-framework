package hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.profiles;

public class User {
	private String userName;
	private Role role;
	
	public User(String userName) {
		this.userName = userName;
		this.role = null;
	}
	public void setRole(Role role){
		this.role = role;
	}
	public Role getRole(){
		return role;
	}
	public String getName(){
		return userName;
	}
}
