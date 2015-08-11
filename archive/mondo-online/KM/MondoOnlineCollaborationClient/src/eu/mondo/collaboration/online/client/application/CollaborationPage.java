package eu.mondo.collaboration.online.client.application;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

import eu.mondo.collaboration.online.client.modelcontroller.CollaborationComponent;

public class CollaborationPage extends AbsoluteLayout implements View {

	public static final String NAME = "Collaboration";
	
	private Navigator navigator;
	private Application application;
	
	private CollaborationComponent cc;
	
	private String sessionId;
	
	private List<User> users;
	
	private boolean initialized = false;
	
	private Label titleLabel = null;
	
	public CollaborationPage(final Navigator navigator, Application application) {
		if(!initialized) {
			System.out.println("Construct CollaborationPage");
			this.navigator = navigator;
			this.application = application;
			this.sessionId = null;
			this.users = new ArrayList<User>();
			setSizeFull();
			
			Button buttonLeave = new Button("Leave"); 
			buttonLeave.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					leaveSession();
				}
			});
			buttonLeave.setHeight("30px");
			addComponent(buttonLeave, "left: 27px; top: 5px;");
			
			Button buttonUndo = new Button("Undo"); 
			buttonUndo.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					cc.undo();
				}
			});
			buttonUndo.setHeight("30px");
			addComponent(buttonUndo, "left: 27px; top: 40px;");
			
			Button buttonRedo= new Button("Redo"); 
			buttonRedo.addClickListener(new Button.ClickListener() {
				public void buttonClick(ClickEvent event) {
					cc.redo();
				} 
			});
			buttonRedo.setHeight("30px");
			addComponent(buttonRedo, "left: 115px; top: 40px;");
			
			CollaborationComponent collabComponent = new CollaborationComponent(this);
		
			// Process a value input by the user from the client-side
			collabComponent.addValueChangeListener(
			        new CollaborationComponent.ValueChangeListener() {
			    @Override
			    public void valueChange() {
			        Notification.show("Value: " + collabComponent.getValue());
			    }
			});
			this.cc = collabComponent;
			addComponent(this.cc, "top: 45px;");
			this.initialized = true;
		}
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

	private void leaveSession() {
		this.removeComponent(this.titleLabel);
		this.navigator.navigateTo(SessionSelectionPage.NAME);
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
		this.titleLabel = new Label("Session: " + title);
		this.titleLabel.setDebugId("title");
		addComponent(titleLabel, "left: 130px; top: 10px;");
	}
	
	public boolean isInitialized() {
		return this.initialized;
	}
}
