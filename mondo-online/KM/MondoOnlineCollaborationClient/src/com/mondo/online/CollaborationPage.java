package com.mondo.online;

import org.json.JSONObject;

import com.mondo.online.collaborationcontroller.CollaborationComponent;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Notification;

public class CollaborationPage extends AbsoluteLayout implements View {

	public static final String NAME = "Collaboration";
	
	Navigator navigator;
	private Application application;
	
	private CollaborationComponent cc;
	
	public CollaborationPage(final Navigator navigator, Application application) {
		System.out.println("Construct CollaborationPage");
		this.navigator = navigator;
		this.application = application; 
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
		this.application.getWebsocketClient().getModel();
	}

	public CollaborationComponent getCollaborationComponent() {
		return this.cc;
	}

	public void setModel(JSONObject jsonModel) {
		this.cc.setModel(jsonModel);
	}

	public void publishModel(JSONObject newModel) {
		this.application.getWebsocketClient().pushModel(newModel);
	}
}
