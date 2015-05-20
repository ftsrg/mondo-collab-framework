package eu.mondo.collaboration.accessprotocol.utils;

import java.util.ArrayList;
import java.util.List;

public class StepByUser {
	private User user;
	private String action;
	private List<StepAttribute> attributes;
	private String target;
	
	public StepByUser(User user, String action, String target,
			List<StepAttribute> attributes) {
		this.user = user;
		this.action = action;
		this.setTarget(target);
		if (attributes != null) {
			this.attributes = attributes;
		} else {
			this.attributes = new ArrayList<StepAttribute>();
		}

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUserId() {
		return user.getId();
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<StepAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<StepAttribute> attributes) {
		this.attributes = attributes;
	}


	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return user.getId() + ": " + "[" + getAction() + "] action " + "["
				+ getTarget() + "] object";
	}

}
