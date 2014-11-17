package com.mondo.online;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.mondo.online.collaborationcontroller.CollaborationComponent;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;

public class CollaborationPage extends AbsoluteLayout implements View {

	public static final String NAME = "Collaboration";
	
	private Navigator navigator;
	private Application application;
	
	private CollaborationComponent cc;
	
	private String sessionId;
	
	private List<User> users;
	
	public CollaborationPage(final Navigator navigator, Application application) {
		System.out.println("Construct CollaborationPage");
		this.navigator = navigator;
		this.application = application;
		this.sessionId = null;
		this.users = new ArrayList<User>();
		setSizeFull();
		
		CollaborationComponent collabComponent = new CollaborationComponent(this);

		// Set the value from server- side
		collabComponent.setValue("Server-side value");

		// Process a value input by the user from the client-side
		collabComponent.addValueChangeListener(
		        new CollaborationComponent.ValueChangeListener() {
		    @Override
		    public void valueChange() {
		        Notification.show("Value: " + collabComponent.getValue());
		    }
		});
		this.cc = collabComponent;
		addComponent(this.cc);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		this.loadModel();
	}

	private void loadModel() {
		this.application.getWebsocketClient().getModel(this.sessionId);
	}

	public CollaborationComponent getCollaborationComponent() {
		return this.cc;
	}

	public void setModel(JSONObject jsonModel) {
		this.cc.setModel(jsonModel);
	}

	public void publishModel(JSONObject newModel) {
		this.application.getWebsocketClient().publishModel(
			this.sessionId,
			newModel
		);
	}
	
	public void setSessionId(String newSessionId) {
		this.sessionId = newSessionId;
	}
	
	public String getSessionId() {
		return this.sessionId;
	}

	public void setUsersList(JSONArray jsonUsers) {
		try {
			List<User> newUsers = new ArrayList<User>();
			for(int i = 0; i < jsonUsers.length(); i++) {
				JSONObject jsonUser;
				jsonUser = jsonUsers.getJSONObject(i);
				User u = new User(jsonUser.getString("name"), "");
				newUsers.add(u);
			}
			this.users = newUsers;
			this.updateUsersList();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void updateUsersList() {
		System.out.println("TODO: implement update users list!");
	}

	public void setTitle(String title) {
		Label titleLabel = new Label(title);
		titleLabel.setDebugId("title");
		addComponent(titleLabel, "left: 40px; top: 5px;");
	}
}
