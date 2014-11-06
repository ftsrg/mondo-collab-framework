package com.mondo.online;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Title("MONDO")
@Theme("mondoonlinecollaborationclient")
public class Application extends UI {

	Navigator navigator;

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = Application.class)
	public static class Servlet extends VaadinServlet {
 
	}

	@Override
	protected void init(VaadinRequest request) {
		// Create a navigator to control the views
		navigator = new Navigator(this, this); 

		// Create and register the views
		navigator.addView(LoginPage.NAME, new LoginPage(navigator));
		navigator.addView(SessionSelectionPage.NAME, new SessionSelectionPage(
				navigator));
		navigator.addView(CollaborationPage.NAME, new CollaborationPage(
				navigator));

		navigator.navigateTo(CollaborationPage.NAME);
        setPollInterval(1000);
	}
}
