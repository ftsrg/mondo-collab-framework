package org.mondo.collaboration.online.client.application;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.vaadin.annotations.StyleSheet;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.Window;

@StyleSheet({ 
	"app://VAADIN/client/SessionSelectionPage.css" 
})
public class SessionSelectionPage extends AbsoluteLayout implements View {
	
    public static final String NAME = "SessionSelection";
    
	private Navigator navigator;

	private Application application;

	private List<CollaborationSession> sessions;
	
	private Table sessionsTable;
	
	public SessionSelectionPage(final Navigator navigator, Application application) {
		System.out.println("Construct SessionSelectionPage");
		this.application = application;
		this.sessions = new ArrayList<CollaborationSession>();
		this.navigator = navigator;
		setSizeFull();
		initSessionsView();
	}
	
	private void loadSessions() {
		this.application.getWebsocketClient().loadAvailableSessions();
	}

	public void setSessionsList(JSONArray jsonSessions) {
		this.sessions.clear();
		this.sessionsTable.removeAllItems();
		try {
			for(int i = 0; i < jsonSessions.length(); i++) {
				String id = jsonSessions.getJSONObject(i).getString("id");
				String title = jsonSessions.getJSONObject(i).getString("title");
				int state = jsonSessions.getJSONObject(i).getInt("state");
				CollaborationSession newSession = new CollaborationSession(id, title, state);
				this.sessions.add(newSession);
				this.sessionsTable.addItem(new Object[]{
					id, 
					title,
					state
					}, this.sessions.size() - 1
				);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	private void updateSessionsView() {
		
//		this.application.getUI().getSession().lock();
//		try {
//			this.removeAllComponents();
//		} finally {
//			this.application.getUI().getSession().unlock();
//		}
//
//		this.initSessionsView();
		// Panel sessionSelection = this.initSessionsView();
		//addComponent(sessionSelection); //, "left: 10px; top: 40px;");
		
	}
	
	private void initSessionsView() {
		// CustomLayout custom = new CustomLayout("sessionSelectionPage");
		this.sessionsTable = new Table();
		this.sessionsTable.setId("table_sessions");
		this.sessionsTable.setWidth((float) 31.05, Unit.EM);
		this.sessionsTable.setHeight(17, Unit.EM);
		this.sessionsTable.addContainerProperty("ID",  String.class, null);
		this.sessionsTable.addContainerProperty("Name", String.class, null);
		this.sessionsTable.addContainerProperty("State", String.class, null);
		this.sessionsTable.setSelectable(true);
		
//		int rowNum = 2;
//		for(CollaborationSession s: this.sessions) {
//			String state = CollaborationSession.getSessionStateString(s.getState());
//			this.sessionsTable.addItem(new Object[]{
//				s.getId(), 
//				s.getTitle(), 
//				state
//				}, rowNum
//			);
//			rowNum++;
//		}

		// custom.addComponent(this.sessionsTable, "sessionsTable");
		Button buttonLogout = new Button("Log out"); 
		Button buttonJoinSession = new Button("Join session");
		Button buttonStartSession = new Button("Start session");
		Button buttonFinishSession = new Button("Finish session");
		
		buttonLogout.setId("button_logout");
		buttonJoinSession.setId("button_joinSession");
		buttonStartSession.setId("button_startSession");
		buttonFinishSession.setId("button_finishSession");
		
		buttonLogout.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				logout();
			}
		});
		buttonJoinSession.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				joinSelectedSession();
			}
		});
		buttonStartSession.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				navigateToStartNewSessionPage();
			}
		});
		buttonFinishSession.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				showCommitPopup();
			}
		});
		addComponent(this.sessionsTable);
		addComponent(buttonFinishSession);
		addComponent(buttonStartSession);
		addComponent(buttonJoinSession);
		addComponent(buttonLogout);
	}
	
	protected void joinSelectedSession() {
		Object rowId = sessionsTable.getValue();
		if(rowId != null) {
			String sessionId = ((String) sessionsTable.getContainerProperty(rowId, "ID").getValue());
			int state = CollaborationSession.getSessionStateByString(
				(String) sessionsTable.getContainerProperty(rowId, "State").getValue()
			);
			if(state == CollaborationSession.STATE_OPEN) {
				String title = (String) sessionsTable.getContainerProperty(rowId, "Name").getValue();
				joinSession(sessionId, title);
			} else {
				Notification.show("Selected session is closed.");
			}
		} else {
			Notification.show("Please select a session");
		}
	}	
	
	protected void showCommitPopup() {
		Window popup = new Window("Commit message");
		popup.setId("popup_commitMessage");

		TextArea msgArea = new TextArea();
		msgArea.setId("text_commitMsg");
		msgArea.setWordwrap(true);
		
		Button btnCancel = new Button("Cancel");
		Button btnProceed = new Button("Proceed");
		btnCancel.setId("button_cancel");
		btnProceed.setId("button_proceed");
		
		btnCancel.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				popup.setVisible(false);
				popup.detach();
			}
		});
		
		btnProceed.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				String commitMessage = msgArea.getValue();
				System.out.println("Commit msg: " + commitMessage);
				popup.setVisible(false);
				popup.detach();
				finishSelectedSession(commitMessage);
			}
		});
		
		AbsoluteLayout popupLayout = new AbsoluteLayout();
		
		popupLayout.addComponent(btnProceed);
		popupLayout.addComponent(btnCancel);
		popupLayout.addComponent(msgArea);
		popup.setContent(popupLayout);
		popup.center();
		this.application.getUI().addWindow(popup);
	}

	private void finishSelectedSession(String commitMessage) {
		Object rowId = sessionsTable.getValue();
		if(rowId != null) {
			String sessionId = ((String) sessionsTable.getContainerProperty(rowId, "ID").getValue());
			if(!application.getUser().leadsSession(sessionId)) {
				Notification.show("Only its leader may finish a session.");
				return;
			}
			int state = CollaborationSession.getSessionStateByString(
				(String) sessionsTable.getContainerProperty(rowId, "State").getValue()
			);
			if(state == CollaborationSession.STATE_OPEN) {
				try {
					JSONObject user = new JSONObject();
					user.put("name", this.application.getUser().getUserName());
					user.put("password", this.application.getUser().getPassword());
					this.application.getWebsocketClient().finishSession(
						sessionId,
						commitMessage,
						user
					);
				} catch (JSONException e) {
					e.printStackTrace();
				}
			} else {
				Notification.show("Selected session is not in open state.");
			}
		} else {
			Notification.show("Please select a session");
		}
	}
	
	protected void joinSession(String sessionId, String title) {
		this.application.initCollaborationPage();
		this.application.getWebsocketClient().joinSession(
			this.application.getUser(), 
			sessionId
		);
		this.application.getCollaborationPage().setSessionId(sessionId);
		this.application.getCollaborationPage().setTitle(title);
		this.navigator.navigateTo(CollaborationPage.NAME);
	}

	private void logout() {
		this.application.unbindUser();
		this.navigator.navigateTo(LoginPage.NAME);
	}
	
	private void navigateToStartNewSessionPage() {
		this.navigator.navigateTo(StartNewSessionPage.NAME);
	}
	
	public void addSession(JSONObject jsonSession, JSONObject jsonUser) {
		try {
			CollaborationSession newSession = new CollaborationSession(
				sessions.size() + "", 
				jsonSession.getString("name"), 
				CollaborationSession.STATE_OPEN
			);
			newSession.setModel(jsonSession.getJSONObject("model"));
			
			this.sessions.add(newSession);
			String state = CollaborationSession.getSessionStateString(newSession.getState());
			String rowNum = (sessions.size() - 1) + "";
			this.sessionsTable.addItem(new Object[]{
				newSession.getId(), 
				newSession.getTitle(), 
				state
				}, rowNum
			);
			User leader = new User(jsonUser.getString("name"), "");
			if(this.application.getUser() == null) {
				return;
			}
			if(User.usersEqual(leader, this.application.getUser())) {
				this.application.getUser().addSessionId(newSession.getId());
			}
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
	}

	public void finishSession(String sessionId) {
		this.sessionsTable.getItem(sessionId).getItemProperty("State").setValue(
			CollaborationSession.getSessionStateString(CollaborationSession.STATE_FINISHED));
		for(CollaborationSession session : this.sessions) {
			if(session.getId().equals(sessionId)) {
				session.finishSession();
			}
		}
		
	}
}
