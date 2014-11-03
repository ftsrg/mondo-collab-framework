package hu.bme.mit.ftsrg.xacml.access_control.action;

import hu.bme.mit.ftsrg.xacml.access_control.profiles.User;

public class Remove extends Command{
	private String object;
	private User user;
	
	public Remove(User user, String object) {
		super(user, object);
	}

	@Override
	public String getAction() {
		return "remove";
	}
}
