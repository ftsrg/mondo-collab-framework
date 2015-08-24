package eu.mondo.collaboration.online.server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ServerEndpoint("/mondoonlineserver")
public class CollaborationServerApplication {
	private static Set<Session> connections = 
	    Collections.synchronizedSet(new HashSet<Session>());
	
	private static List<CollaborationSession> sessions;
	
	// assign connections to collaboration session IDs once they join it
	private static HashMap<String, List<Session>> sessionsConnections;
	
	public CollaborationServerApplication() {
		System.out.println("Initialize server...");
		if(sessions == null) {
			System.out.println("Load models...");
			try {
				this.initSessions();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void initSessions() throws MalformedURLException {
		System.out.println("Initalizing sessions...");
		sessionsConnections = new HashMap<String, List<Session>>();
		sessions = new ArrayList<CollaborationSession>();
		Integer id = 0;

		try {
			URL url = new URL("http://localhost:8070/services/modelHandler/getModels");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setDoInput(true);
			conn.setDoOutput(false);
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			line = br.readLine();
			JSONArray modelz = new JSONArray(line);
			System.out.println("modelz size: " + modelz.length());
			for(int i = 0; i < modelz.length(); i++) {
				JSONObject currModel = modelz.getJSONObject(i);
				System.out.println(currModel.toString());
				CollaborationSession newSession = new CollaborationSession(
	        		id.toString(), 
	        		(String) currModel.get("name"),
	        		CollaborationSession.STATE_READY
	        	);
				newSession.setModel(currModel.getJSONObject("model"));
	        	sessions.add(newSession);
	        	sessionsConnections.put(id.toString(), new ArrayList<Session>());
	        	id++;
			}
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Sessions initialized.");
	}

	@OnOpen
	public void onOpen(Session connection) {
		connections.add(connection);
	    System.out.println("num of clients: " + connections.size());
	}
	
	@OnMessage
	public void onMessage(String message, Session connection) 
		throws IOException {
		try {
			System.out.println("OnMessage - server");
			JSONObject request = new JSONObject(message);
			String operation = request.getString("operation");

			System.out.println("Process request: " + operation);
			if(operation.equals("getSessions")) {
				System.out.println("sendSessions...");
				this.sendSessions(connection);
			} else if(operation.equals("startSession")) {
				System.out.println("startSession...");
				String sessionId = request.getString("sessionId");
				if(this.startSession(sessionId)) {
					this.publishSessions();
				}
			} else if(operation.equals("finishSession")) {
				System.out.println("finishSession...");
				String sessionId = request.getString("sessionId");
				if(this.finishSession(sessionId)) {
					this.publishSessions();
				}
			} else if(operation.equals("joinSession")) {
				System.out.println("joinSession...");
				JSONObject user = request.getJSONObject("user");
				User newUser = new User(
					user.getString("name"),
					user.getString("password")
				);
				String sessionId = request.getString("sessionId");
				if(this.addUserToSession(newUser, sessionId)) {
					List<Session> conns = sessionsConnections.get(sessionId);
					conns.add(connection);
					sessionsConnections.put(sessionId, conns);
					if(positionsInitialized(sessionId)) {
						this.sendPositions(sessionId, connection);
					}
					this.sendModel(sessionId, connection);
					this.publishUsers(sessionId);
					this.notifyClient(connection);
				}
			} else if(operation.equals("leaveSession")) {
				System.out.println("leaveSession...");
				JSONObject user = request.getJSONObject("user");
				User userToRemove = new User(
					user.getString("name"),
					user.getString("password")
				);
				String sessionId = request.getString("sessionId");
				if(this.removeUserFromSession(userToRemove, sessionId)) {
					List<Session> conns = sessionsConnections.get(sessionId);
					conns.remove(connection);
					sessionsConnections.put(sessionId, conns);
					this.publishUsers(sessionId);
				}
			} else if(operation.equals("getModel")) {
				System.out.println("getModel...");
				String sessionId = request.getString("sessionId");
				if(this.positionsInitialized(sessionId)) {
					this.sendPositions(sessionId, connection);
				} 
				this.sendModel(sessionId, connection);
			} else if(operation.equals("modifyModel")) {
				System.out.println("modifyModel...");
				if(this.modifyModel(request)) {
					this.publishModification(
						request.getString("sessionId"), 
						connection,
						request.getJSONObject("data")
					);
				}
			} else if(operation.equals("publishModel")) {
				System.out.println("publishModel...");
				String sessionId = request.getString("sessionId");
				String newModel = request.getString("model");
				if(this.setModel(sessionId, new JSONObject(newModel))) {
					this.publishModel(sessionId, connection, newModel);
				}
			} else if(operation.equals("publishPositions")) {
				System.out.println("publishPositions...");
				String sessionId = request.getString("sessionId");
				String positions = request.getString("positions");
				this.setPositions(sessionId, positions);
				this.setPositionsInitialized(sessionId);
			} else if(operation.equals("publishNodePosition")) {
				System.out.println("publishNodePosition...");
				String sessionId = request.getString("sessionId");
				JSONObject nodeData = new JSONObject(request.getString("nodeData"));
				if(this.setNodePosition(sessionId, nodeData)) {
					this.publishNodePosition(sessionId, connection, nodeData);
				}
			}
		} catch (JSONException e1) {
			e1.printStackTrace();
		}   
	}


	private void publishModification(String sessionId, Session source, JSONObject modificationData) {
		try {
			JSONObject request = new JSONObject();
			request.put("operation", "modifyModel");
			request.put("data", modificationData);
			List<Session> conns = sessionsConnections.get(sessionId);
			synchronized(conns) {
				for(Session connection : conns) {
					if(!source.getId().equals(connection.getId())) {
						System.out.println("Sending modification data to: " + connection.getId());
						this.sendRequestInParts(request, connection);
					}
				}
		    } 
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	private boolean modifyModel(JSONObject request) {
		try {
			String sessionId = request.getString("sessionId");
			for(CollaborationSession s: sessions) {
				if(s.getId().equals(sessionId)) {
					JSONObject results = ModelModifier.modifyModel(
						s.getModel(), 
						s.getPositions(), 
						request.getJSONObject("data")
					); 
					if(results != null) {
						Object newModel = results.get("model");
						Object newPositions = results.get("positions");
						if(!newModel.equals("none")) {
							s.setModel((JSONObject) newModel);
						}
						if(!newPositions.equals("none")) {
							s.setPositions((JSONObject) newPositions);
						}
					}
					return true;
				}
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return false;
	}

	private void notifyClient(Session connection) {
		try {
			JSONObject request = new JSONObject();
			request.put("operation", "modelTransferComplete");
			this.sendRequestInParts(request, connection);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void publishNodePosition(String sessionId, Session source, JSONObject nodeData) {
		// publish node position only for those who are in the same collaboration session
		List<Session> relevantConnections = sessionsConnections.get(sessionId);
        // Iterate over the connected sessions
		synchronized(relevantConnections){
			System.out.println("Publishing new node position: " + nodeData);
	    	// and broadcast the received message
			for(Session conn : relevantConnections){
				if(!conn.getId().equals(source.getId())) {
					this.sendNodePosition(sessionId, conn, nodeData);
				}
			}
	    } 
	}

	private void setPositionsInitialized(String sessionId) {
		for(CollaborationSession s: sessions) {
			if(s.getId().equals(sessionId)) {
				s.setPositionsInitialized(true);
			}
		}
	}

	private boolean positionsInitialized(String sessionId) {
		for(CollaborationSession s: sessions) {
			if(s.getId().equals(sessionId)) {
				return s.isInitialized();
			}
		}
		return false;
	}

	private boolean setNodePosition(String sessionId, JSONObject nodeData) {
		for(CollaborationSession s: sessions) {
			if(s.getId().equals(sessionId)) {
				JSONObject positions = s.getPositions();
				for(int i = 0; i < positions.length(); i++) {
					try {
						// the key is the id of the node
						positions.put(
							nodeData.getString("node"), 
							nodeData.getJSONObject("newPosition")
						);
						s.setPositions(positions);
						return true;
					} catch (JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return false;
	}
	
	private void publishUsers(String sessionId) {
		try {
			JSONObject request = new JSONObject();
			JSONArray users = this.getJsonUsersOfSession(sessionId);
			request.put("operation", "updateUsers");
			request.put("users", users);
			List<Session> conns = sessionsConnections.get(sessionId);
			synchronized(conns){
				System.out.println("Publishing users: " + users.toString());
				for(Session connection : conns){
					System.out.println("Send users to: " + connection.getId());
					this.sendRequestInParts(request, connection);
					// connection.getBasicRemote().sendText(request.toString());
				}
		    } 
		} catch (JSONException e) {
			e.printStackTrace();
		} 
	}

	private JSONArray getJsonUsersOfSession(String sessionId) {
		try {
			JSONArray jsonUsers = new JSONArray();
			for(CollaborationSession s: sessions) {
				if(s.getId().equals(sessionId)) {
					for(User u: s.getUsers()) {
						JSONObject jsonUser = new JSONObject();
						jsonUser.put("name", u.getUserName());
						jsonUser.put("password", u.getPassword());
						jsonUsers.put(jsonUser);
					}
				}
			}
			return jsonUsers;
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}

	private boolean addUserToSession(User newUser, String sessionId) {
		for(CollaborationSession s: sessions) {
			if(s.getId().equals(sessionId)) {
				s.addUser(newUser);
				return true;
			}
		}
		return false;
	}
	  
	private boolean removeUserFromSession(User userToRemove, String sessionId) {
		for(CollaborationSession s: sessions) {
			if(s.getId().equals(sessionId)) {
				System.out.println("removing user - " + userToRemove.getUserName());
				System.out.println(sessions.get(sessions.indexOf(s)).getUsers().size());
				sessions.get(sessions.indexOf(s)).removeUser(userToRemove);
				System.out.println(sessions.get(sessions.indexOf(s)).getUsers().size());
				return true;
			}
		}
		return false;
	}
	
	private void publishSessions() {
		try {
			JSONObject request = new JSONObject();
			JSONArray jsonSessions = this.prepareSessionsToSend();
			request.put("operation", "updateSessions");
			request.put("sessions", jsonSessions);
			synchronized(connections){
				System.out.println("Publishing sessions: " + jsonSessions.toString());
				for(Session connection : connections){
					System.out.println("Send sessions to: " + connection.getId());
					this.sendRequestInParts(request, connection);
					// connection.getBasicRemote().sendText(request.toString());
				}
		    } 
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
	}

	private boolean startSession(String sessionId) {
		System.out.println("Sessions before :" + this.prepareSessionsToSend().toString());
		for(CollaborationSession s: sessions) {
			if(s.getId().equals(sessionId)) {
				s.startSession();
				return true;
			}
		}
		System.out.println("Sessions after: " + this.prepareSessionsToSend().toString());
		return false;
	}

	private boolean finishSession(String sessionId) {
		for(CollaborationSession s: sessions) {
			if(s.getId().equals(sessionId)) {
				// kick users
				List<Session> relevantConnections = sessionsConnections.get(sessionId);
				synchronized(relevantConnections){
					try {
						JSONObject request = new JSONObject();
						request.put("operation", "leaveSession");
						for(Session conn: relevantConnections){
							this.sendRequestInParts(request, conn);
						}
					} catch (JSONException e) {
						e.printStackTrace();
					} 
			    } 
				persistModel(sessionId, s.getTitle(), s.getModel());
				s.finishSession();
				return true;
			}
		}
		return false;
	}

	private void persistModel(String sessionId, String title, JSONObject model) {
		System.out.println("Persisting model...");
		try {
			JSONObject postData = new JSONObject();
			postData.put("id", sessionId);
			postData.put("title", title);
			postData.put("model", model);

			String postDataString = postData.toString();
			
			URL url = new URL("http://localhost:8070/services/modelHandler/persistModel");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.addRequestProperty("id", sessionId);
			conn.addRequestProperty("title", title);
			conn.addRequestProperty("model", model.toString());
			conn.setRequestMethod("POST");
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setRequestProperty("Content-Length", "" + Integer.toString(postDataString.getBytes().length));
			
			DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
			wr.writeBytes(postDataString);
			wr.flush();
			wr.close();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			line = br.readLine();
			br.close();
			System.out.println("Service response: " + line);
			conn.disconnect();

			System.out.println("Model saved.");
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private void sendModel(String sessionId, Session connection) {
		try {
			JSONObject model = null;
			for(CollaborationSession s: sessions) {
				if(s.getId().equals(sessionId)) {
					model = s.getModel();
					break;
				}
			}
			System.out.println("Send model to: " + connection.getId());
			
			JSONObject request = new JSONObject();
			request.put("operation", "updateModel");
			request.put("model", model);
			this.sendRequestInParts(request, connection);
			// connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException e1) {
			e1.printStackTrace();
		} 	
	} 
	
	private void sendNodePosition(String sessionId, Session conn, JSONObject nodeData) {
		try {
			JSONObject request = new JSONObject();
			request.put("operation", "updateNodePosition");
			request.put("nodeData", nodeData);
			this.sendRequestInParts(request, conn);
		} catch (JSONException e1) {
			e1.printStackTrace();
		} 
		
	}
	
	private void sendPositions(String sessionId, Session connection) {
		try {
			JSONObject positions = null;
			for(CollaborationSession s: sessions) {
				if(s.getId().equals(sessionId)) {
					positions = s.getPositions();
					break;
				}
			}
			System.out.println("Send positions to: " + connection.getId());
			System.out.println(positions.toString());
			JSONObject request = new JSONObject();
			request.put("operation", "updatePositions");
			request.put("positions", positions);
			this.sendRequestInParts(request, connection);
			// connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException e1) {
			e1.printStackTrace();
		} 	
	} 
 
	private void sendRequestInParts(JSONObject request, Session connection) {
		String messageToSend = request.toString();
		connection.getAsyncRemote().sendText(messageToSend);
		/*
		int maxLengthOfParts = 2000;
		List<String> messageParts = splitString(messageToSend, maxLengthOfParts);
		try
		{
			for(int partIndex = 0; partIndex < messageParts.size(); partIndex++) {
				String part = messageParts.get(partIndex);
				boolean isLast = false;
				if(partIndex + 1 == messageParts.size()) {
					isLast = true;
				}
				connection.getBasicRemote().sendText(part, isLast);
			}
		}
		catch (IOException e)
		{
		    e.printStackTrace(System.err);
		}
		*/
	}
	
	private void sendSessions(Session connection) {
		try {
			// prepare data for CollaborationSessions
			JSONArray jsonSessions = this.prepareSessionsToSend();
			System.out.println("Send open sessions list to: " + connection.getId());
			JSONObject request = new JSONObject();
			request.put("operation", "updateSessions");
			request.put("sessions", jsonSessions);
			this.sendRequestInParts(request, connection);
			// connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		} 
	}

	private JSONArray prepareSessionsToSend() {
		try {
			JSONArray jsonSessions = new JSONArray();
			for (CollaborationSession s: sessions) {
	        	JSONObject session = new JSONObject();
	        	
				session.put("id", s.getId());
	        	session.put("title", s.getTitle());
	        	session.put("state", s.getState());
	        	jsonSessions.put(session);
		    }
			return jsonSessions;
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void publishModel(String sessionId, Session source, String newModel) {
		// publish model only for those who are in the same collaboration session
		List<Session> relevantConnections = sessionsConnections.get(sessionId);
        // Iterate over the connected sessions
		synchronized(relevantConnections){
			System.out.println("Publishing model: " + newModel);
	    	// and broadcast the received message
			for(Session conn : relevantConnections){
				if(!conn.getId().equals(source.getId())) {
					this.sendModel(sessionId, conn);
				}
			}
	    } 
	}

	private void setPositions(String sessionId, String newPositions) {
		try {
			this.setPositions(sessionId, new JSONObject(newPositions));
		} catch (JSONException e) {
			e.printStackTrace();
	    }
	}
	
	private boolean setModel(String sessionId, JSONObject newModel) {
		for(CollaborationSession s: sessions) {
			if(s.getId().equals(sessionId)) {
				s.setModel(newModel);
				return true;
			}
		}
		return false;
	}
	
	private void setPositions(String sessionId, JSONObject newPositions) {
		for(CollaborationSession s: sessions) {
			if(s.getId().equals(sessionId)) {
				s.setPositions(newPositions);
				return;
			}
		}
	}

	@OnClose
	public void onClose(Session connection) {
	    // Remove session from the connected sessions set
		System.out.println("removing connection from websocket...");
		connections.remove(connection);
	}
}
