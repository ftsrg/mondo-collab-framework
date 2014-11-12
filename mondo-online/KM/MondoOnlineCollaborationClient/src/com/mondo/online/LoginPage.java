package com.mondo.online;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;


public class LoginPage extends AbsoluteLayout implements View {

	public static final String NAME = "Login";
	
	private Application application;
	
	Navigator navigator;
	
	public LoginPage(final Navigator navigator, Application application) {
		System.out.println("Construct LoginPage");
		this.navigator = navigator;

		Panel panel = new Panel("Login");
		panel.setSizeUndefined();
		addComponent(panel, "left: 20px; top: 20px;");

		CustomLayout custom = new CustomLayout("loginPage");
		// custom.addStyleName("customlayoutexample");

		panel.setContent(custom);
		
		TextField username = new TextField();
		custom.addComponent(username, "username");
		TextField password = new TextField();
		custom.addComponent(password, "password");

		boolean isAuthorized = this.authenticate();
		
		Button buttonLogin = new Button("Login");
		buttonLogin.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				if(isAuthorized) {
					application.bindUser(
						username.getValue(), 
						password.getValue()
					);
					navigator.navigateTo(SessionSelectionPage.NAME);
				}
			}
		});
		this.application = application;
		custom.addComponent(buttonLogin, "buttonLogin");
	}

	private boolean authenticate() {
		return true;
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
	}
	
}

