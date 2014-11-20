package eu.mondo.collaboration.online.client.application;

import java.io.IOException;
import java.net.URI;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.WebSocketContainer;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

import eu.mondo.collaboration.online.client.modelcontroller.CollaborationComponent;

@SuppressWarnings("serial")
@Title("MONDO")
@Theme("mondoonlinecollaborationclient")
public class Application extends UI {

	Navigator navigator;

	private User user; 
	private MondoWebsocketClient websocketClient;
	
	private LoginPage loginPage;
	private SessionSelectionPage sessionSelectionPage;
	private CollaborationPage collaborationPage;
	
	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = Application.class)
	public static class Servlet extends VaadinServlet {
 
	}

	@Override
	protected void init(VaadinRequest request) {
		try {
			System.out.println("Init Application...");
			// initialize connection with the web socket server
			// Create a navigator to control the views
			navigator = new Navigator(this, this); 
			this.websocketClient = new MondoWebsocketClient(this);
			WebSocketContainer container = ContainerProvider.getWebSocketContainer();
	        String uri = "ws://localhost:8080/MondoOnlineCollaborationServer/mondoonlineserver";
			container.connectToServer(this.websocketClient, URI.create(uri));
			System.out.println("Connection established!");

			this.loginPage = new LoginPage(navigator, this);
			this.sessionSelectionPage = new SessionSelectionPage(navigator, this);
			this.collaborationPage = new CollaborationPage(navigator, this);
	
			// Create and register the views
			navigator.addView(LoginPage.NAME, loginPage);
			navigator.addView(SessionSelectionPage.NAME, sessionSelectionPage);
			navigator.addView(CollaborationPage.NAME, collaborationPage);
			System.out.println("Client init Done!");
			navigator.navigateTo(LoginPage.NAME);
	        setPollInterval(1000);
		} catch (DeploymentException e) {
			Notification.show(
				"Failed to connect to server.",
	            "<DeploymentException>",
	            Notification.Type.WARNING_MESSAGE
	        );
			e.printStackTrace();
		} catch (IOException e) {
			Notification.show(
				"Failed to connect to server.",
	            "<IOException>",
	            Notification.Type.WARNING_MESSAGE
	        );
			e.printStackTrace();
		}
	}
	
	public void bindUser(String name, String password) {
		this.user = new User(name, password);
	}
	
	public User getUser() {
		return this.user;
	}
	
	public void unbindUser() {
		this.user = null;
	}
	
	public MondoWebsocketClient getWebsocketClient() {
		return this.websocketClient;
	}
	
	public CollaborationPage getCollaborationPage() {
		return this.collaborationPage;
	}

	public SessionSelectionPage getSessionSelectionPage() {
		return this.sessionSelectionPage;
	}

	public void leaveSession() {
		navigator.navigateTo(SessionSelectionPage.NAME);
		navigator.removeView(CollaborationPage.NAME);
		this.collaborationPage = new CollaborationPage(navigator, this);
		navigator.addView(CollaborationPage.NAME, this.collaborationPage);
	}
}
