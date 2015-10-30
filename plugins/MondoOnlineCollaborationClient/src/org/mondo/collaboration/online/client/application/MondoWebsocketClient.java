package org.mondo.collaboration.online.client.application;

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
		System.out.println("OnMessage - finished transmission");
    	try {
    		JSONObject message = new JSONObject(rawMessage);
    		String operation = message.getString("operation");
    		System.out.println("Operation: " + operation);
    		if(operation.equals("modelTransferComplete")) {
    			this.application.getCollaborationPage().setModelTransferComplete(true);
    		} else if(operation.equals("updateModel")) {
				this.application.getCollaborationPage().setModel(
					message.getJSONObject("model")
				);
    		} else if(operation.equals("modifyModel")) {
				this.application.getCollaborationPage().modifyModel(
					message.getJSONObject("data")
				);
    		} else if(operation.equals("updatePositions")) {
				this.application.getCollaborationPage().setPositions(
					message.getJSONObject("positions")
				);
    		} else if(operation.equals("updateNodePosition")) {
				this.application.getCollaborationPage().moveNode(
					message.getJSONObject("nodeData")
				);
    		} else if(operation.equals("updateSessions")) {
				this.application.getSessionSelectionPage().setSessionsList(
					message.getJSONArray("sessions")
				);
    		} else if(operation.equals("updateUsers")) {
				this.application.getCollaborationPage().setUsersList(
					message.getJSONArray("users")
				);
    		} else if(operation.equals("leaveSession")) {
				this.application.leaveSession();
    		} else if(operation.equals("avaialbleModelsForuser")) {
				this.application.getStartNewSessionPage().setAvailableSessions(
					message.getJSONArray("models")
				);
    		} else if(operation.equals("newSession")) {
				this.application.getSessionSelectionPage().addSession(
					message.getJSONObject("collaborationSession"),
					message.getString("leader")
				);
    		} else if(operation.equals("finishSession")) {
				this.application.getSessionSelectionPage().finishSession(
					message.getString("sessionId")
				);
    		} else if(operation.equals("checkoutFailed")) {
    			this.application.getStartNewSessionPage().checkoutFailed();
    		}
		} catch (JSONException e) {
			e.printStackTrace();
		}
    }
	
	@OnError
    public void processError(Throwable t) {
        t.printStackTrace();
    }
    
    @OnClose
    public void onClose(Session userSession, CloseReason reason) {
        System.out.println("Closing websocket by client");
        this.connection = null;
    }

	public void publishModel(String sessionId, JSONObject newModel) {
		try {
			JSONObject request = new JSONObject();
			request.put("operation", "publishModel");
			request.put("model", newModel);
			request.put("sessionId", sessionId);
			System.out.println("Sending new model to endpoint.");
			this.connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void publishPositions(String sessionId, JSONObject newPositions) {
		try {
			JSONObject request = new JSONObject();
			request.put("operation", "publishPositions");
			request.put("positions", newPositions);
			request.put("sessionId", sessionId);
			this.connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getModel(String sessionId) {
		System.out.println("sessionId -- " + sessionId);
		try {
			JSONObject request = new JSONObject();
			request.put("operation", "getModel");
			request.put("sessionId", sessionId);
			System.out.println("Sending message to server: " + request.toString());
			this.connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public void joinSession(User user, String sessionId) {
		try {
			JSONObject jsonUser = new JSONObject();
			jsonUser.put("name", user.getUserName());
			jsonUser.put("password", user.getPassword());
			JSONObject request = new JSONObject();
			request.put("operation", "joinSession");
			request.put("user", jsonUser);
			request.put("sessionId", sessionId);
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

	public void startSession(JSONObject startSessionData) {
		try {
			JSONObject request = new JSONObject();
			request.put("operation", "startSession");
			request.put("startSessionData", startSessionData);
			System.out.println("Sending message to server: " + request.toString());
			this.connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public void finishSession(String sessionId, String commitMessage, JSONObject user) {
		try {
			JSONObject request = new JSONObject();
			request.put("operation", "finishSession");
			request.put("sessionId", sessionId);
			request.put("commitMessage", commitMessage);
			request.put("user", user);
			System.out.println("Sending message to server: " + request.toString());
			this.connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public void publishNodePosition(JSONObject nodeData, String sessionId) {
		try {
			JSONObject request = new JSONObject();
			request.put("operation", "publishNodePosition");
			request.put("nodeData", nodeData);
			request.put("sessionId", sessionId);
			System.out.println("Sending message to server: " + request.toString());
			this.connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public void leaveSession(User user, String sessionId) {
		try {
			JSONObject jsonUser = new JSONObject();
			jsonUser.put("name", user.getUserName());
			jsonUser.put("password", user.getPassword());
			JSONObject request = new JSONObject();
			request.put("operation", "leaveSession");
			request.put("sessionId", sessionId);
			request.put("user", jsonUser);
			System.out.println("Sending message to server: " + request.toString());
			this.connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public void publishModification(String sessionId, JSONObject data) {
		try {
			JSONObject request = new JSONObject();
			request.put("operation", "modifyModel");
			request.put("sessionId", sessionId);
			request.put("data", data);
			System.out.println("Sending message to server: " + request.toString());
			this.connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void getAvailableModelsForUser(String userName, String password) {
		try {
			JSONObject request = new JSONObject();
			request.put("operation", "getAvailableModelsForUser");
			request.put("userName", userName);
			request.put("password", password);
			System.out.println("Sending message to server: " + request.toString());
			this.connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException | IOException e) {
			e.printStackTrace();
		}
	}

	public void getSessions() {
		try {
			System.out.println("Retreiving sessions for client.");
			JSONObject request = new JSONObject();
			request.put("operation", "getSessions");
			this.connection.getBasicRemote().sendText(request.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
}
