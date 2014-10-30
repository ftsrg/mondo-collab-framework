package hu.bme.mit.ftsrg.xacml.access_control.action;

import hu.bme.mit.ftsrg.xacml.access_control.profiles.User;

public abstract class Command {
	private String object;
	private User user;
	
	public Command(User user, String object){
		this.user = user;
		this.object = object;
	}
	
	public abstract String getAction();
	public String getObject(){
		return object;
	}
	public String getUserName(){
		return user.getName();
	}

	@Override
	public String toString() {
		return user.getName() + ": " + "[" + getObject() + "] object" + "[" + getAction() + "] action ";
	}
	
	
}
