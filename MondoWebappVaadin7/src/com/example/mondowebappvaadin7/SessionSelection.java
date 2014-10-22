package com.example.mondowebappvaadin7;

import org.json.JSONArray;
import org.json.JSONObject;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Table;

public class SessionSelection extends AbsoluteLayout implements View {
	
    public static final String NAME = "SessionSelection";
    
	Navigator navigator;

	public SessionSelection(final Navigator navigator) {
		setSizeFull();
		
		Table sessionsTable = this.initSessionsTable();
		addComponent(sessionsTable, "left: 10px; top: 40px;");
		Button button = new Button("Join session");
		button.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				Object rowId = sessionsTable.getValue();
				if(rowId != null) {
					int sessionId = ((Integer)sessionsTable.getContainerProperty(rowId,"ID").getValue()).intValue();
					navigator.navigateTo(Collaboration.NAME);
				} else {
					Notification.show("Please select a session");
				}
			}
		});
		
		addComponent(button, "left: 20px; top: 350px");
	}

	private Table initSessionsTable() {
		Table sessionsTable = new Table("Available sessions:");
		sessionsTable.setWidth("200px");
		sessionsTable.setHeight("300px");
		sessionsTable.addContainerProperty("Name", String.class, null);
		sessionsTable.addContainerProperty("ID",  Integer.class, null);
		sessionsTable.setSelectable(true);
		Session[] sessions = this.getSessions();
		int rowNum = 2;
		for(Session s: sessions) {
			sessionsTable.addItem(new Object[]{s.title, s.id}, rowNum);
			rowNum++;
		}
		return sessionsTable;
	}

	private Session[] getSessions() {
		Session[] sessions = new Session[400];
		for(int i = 0; i < 400; i++) {
			sessions[i] = new Session(i, "Session " + i);
		}
		return sessions;
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}
