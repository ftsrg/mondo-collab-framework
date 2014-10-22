package com.example.mondowebappvaadin7;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;


public class LoginPage extends AbsoluteLayout implements View {

	public static final String NAME = "LoginPage";
	
	Navigator navigator;
	
	public LoginPage(final Navigator navigator) {
		this.navigator = navigator;
		setSizeFull();
		
		Label textUserName = new Label();
		textUserName.setValue("User name:");
		textUserName.setWidth("110px");
		textUserName.setHeight("30px");
		addComponent(textUserName, "left: 18px; top: 10px;");
		
		TextField inputUserName = new TextField();
		inputUserName.setWidth("150px");
		inputUserName.setHeight("30px");
		addComponent(inputUserName, "left: 110px; top: 10px;");
		
		Label textPassword = new Label();
		textPassword.setValue("Password:");
		textPassword.setWidth("110px");
		textPassword.setHeight("30px");
		addComponent(textPassword, "left: 18px; top: 50px;");
		
		TextField inputPassword = new TextField();
		inputPassword.setWidth("150px");
		inputPassword.setHeight("30px");
		addComponent(inputPassword, "left: 110px; top: 50px;");
		
		Button buttonWait = new Button("Wait");
		addComponent(buttonWait, "left: 40px; top: 100px;");
		
		Button buttonLogin = new Button("Login");
		boolean isAuthorized = this.authenticate();
		buttonLogin.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				if(isAuthorized) {
					navigator.navigateTo(SessionSelection.NAME);
				}
			}
		});
		addComponent(buttonLogin, "left: 130px; top: 100px;");
	}

	private boolean authenticate() {
		return true;
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
	}
	
}
