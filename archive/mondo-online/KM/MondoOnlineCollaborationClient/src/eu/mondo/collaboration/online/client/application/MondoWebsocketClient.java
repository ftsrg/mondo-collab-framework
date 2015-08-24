package eu.mondo.collaboration.online.client.application;

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
    			System.out.println("modelTransferComplete...");
    			this.application.getCollaborationPage().setModelTransferComplete(true);
    		} else if(operation.equals("updateModel")) {
        		System.out.println("updateModel...");
				this.application.getCollaborationPage().setModel(
					message.getJSONObject("model")
				);
    		} else if(operation.equals("modifyModel")) {
        		System.out.println("modifyModel...");
				this.application.getCollaborationPage().modifyModel(
					message.getJSONObject("data")
				);
    		} else if(operation.equals("updatePositions")) {
        		System.out.println("updatePositions... - " + message.toString());
				this.application.getCollaborationPage().setPositions(
					message.getJSONObject("positions")
				);
    		} else if(operation.equals("updateNodePosition")) {
        		System.out.println("updateNodePosition...");
				this.application.getCollaborationPage().moveNode(
					message.getJSONObject("nodeData")
				);
    		} else if(operation.equals("updateSessions")) {
        		System.out.println("updateSessions...");
				this.application.getSessionSelectionPage().setSessionsList(
					message.getJSONArray("sessions")
				);
    		} else if(operation.equals("updateUsers")) {
        		System.out.println("updateUsers...");
				this.application.getCollaborationPage().setUsersList(
					message.getJSONArray("users")
				);
    		} else if(operation.equals("leaveSession")) {
        		System.out.println("leaveSession...");
				this.application.leaveSession();
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
	
	public void loadAvailableSessions() {
		try {
			JSONObject request = new JSONObject();
			request.put("operation", "getSessions");
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

	public void startSession(String sessionId) {
		try {
			JSONObject request = new JSONObject();
			request.put("operation", "startSession");
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

	public void finishSession(String sessionId) {
		try {
			JSONObject request = new JSONObject();
			request.put("operation", "finishSession");
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
}
