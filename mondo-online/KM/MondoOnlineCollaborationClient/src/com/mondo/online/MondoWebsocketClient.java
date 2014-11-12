package com.mondo.online;

import java.io.IOException;

import javax.websocket.ClientEndpoint;
import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ClientEndpoint
public class MondoWebsocketClient {
	private Session connection;
	
	private Application application;
	
	public MondoWebsocketClient(Application application) {
		this.application = application;
	}
	
	@OnOpen
    public void onOpen(Session conn) {
		this.connection = conn;
        System.out.println("Connected to endpoint: " + conn.getBasicRemote());
        System.out.println("Max message length: "  + conn.getMaxTextMessageBufferSize());
    }
	
	@OnMessage
    public void processMessage(String rawMessage) {
    	try {
    		JSONObject message = new JSONObject(rawMessage);
    		System.out.println("Recieved message: " + message.toString());
    		String operation = message.getString("operation");
    		if(operation.equals("updateModel")) {
        		System.out.println("updateModel...");
				this.application.getCollaborationPage().setModel(
					message.getJSONObject("model")
				);
	    		System.out.println("recieved model: " + message);
	    		System.out.println("Model length: " + message.length());
    		} else if(operation.equals("updateOpenSessions")) {
        		System.out.println("updateOpenSessions...");
				this.application.getSessionSelectionPage().setSessionsList(
					message.getJSONArray("sessions")
				);
    		}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	@OnError
    public void processError(Throwable t) {
        t.printStackTrace();
    }
    
    @OnClose
    public void onClose(Session userSession, CloseReason reason) {
        System.out.println("closing websocket by client");
        this.connection = null;
    }

    
	public void pushModel(JSONObject newModel) {
		try {
			JSONObject request = new JSONObject();
			request.put("operation", "publishModel");
			request.put("model", newModel);
		
			System.out.println("Sending message to endpoint: " + request.toString());
			this.connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void loadOpenSessions() {
		try {
			JSONObject request = new JSONObject();
			request.put("operation", "getOpenSessions");
			System.out.println("Sending message to server: " + request.toString());
			this.connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getModel() {
		try {
			JSONObject request = new JSONObject();
			request.put("operation", "getModel");
			System.out.println("Sending message to server: " + request.toString());
			this.connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
