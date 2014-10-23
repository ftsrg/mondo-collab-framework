package com.mondo.online;

import com.mondo.online.collaborationcontroller.CollaborationComponent;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Notification;

public class CollaborationPage extends AbsoluteLayout implements View {

	public static final String NAME = "Collaboration";
	
	Navigator navigator;
	
	public CollaborationPage(final Navigator navigator) {
		this.navigator = navigator;
		setSizeFull();
		
		final CollaborationComponent cc = new CollaborationComponent();

		// Set the value from server-side
		cc.setValue("Server-side value");

		// Process a value input by the user from the client-side
		cc.addValueChangeListener(
		        new CollaborationComponent.ValueChangeListener() {
		    @Override
		    public void valueChange() {
		        Notification.show("Value: " + cc.getValue());
		    }
		});

		addComponent(cc);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		
	}
}
