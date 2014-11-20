package eu.mondo.collaboration.online.server;

import java.io.BufferedReader;
import java.io.File;
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
		// this.newLoadModel();
		System.out.println("Initialize server...");
		if(sessions == null) {
			System.out.println("Load models...");
			try {
				this.initSessions();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void initSessions() throws MalformedURLException {
		System.out.println("Initalizing sessions...");
		sessionsConnections = new HashMap<String, List<Session>>();
		sessions = new ArrayList<CollaborationSession>();
		String pathToResFolder = "D:\\Eclipse\\Eclipse_EE\\workspace_EE\\MondoOnlineCollaborationServer\\res";
		final File folder = new File(pathToResFolder);
		Integer id = 0;
		for (final File fileEntry : folder.listFiles()) {
	        if (!fileEntry.isDirectory()) {
	        	String modelPath = pathToResFolder + fileEntry.getName(); 
	        	CollaborationSession newSession = new CollaborationSession(
	        		id.toString(), 
	        		fileEntry.getName(),
	        		CollaborationSession.STATE_CLOSED
	        	);
	        	sessions.add(newSession);
	        	sessionsConnections.put(id.toString(), new ArrayList<Session>());
	        	id++;
	        }
		}
		
		try {
			URL url = new URL("http://localhost:8070/modelHandler/getModels");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setDoInput(true);
			conn.setDoOutput(false);
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			line = br.readLine();
			JSONArray modelz = new JSONArray(line);
			JSONObject model1 = modelz.getJSONObject(1);
			System.out.println(model1.get("name"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("try now 6");
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
					this.sendModel(sessionId, connection);
					this.publishUsers(sessionId);
				}
			} else if(operation.equals("getModel")) {
				System.out.println("getModel...");
				String sessionId = request.getString("sessionId");
				this.sendModel(sessionId, connection);
			} else if(operation.equals("publishModel")) {
				System.out.println("publishModel...");
				String sessionId = request.getString("sessionId");
				String newModel = request.getString("model");
				this.publishModel(sessionId, newModel);
			}
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}   
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
					System.out.println("Send sessions to: " + connection.getId());
					connection.getBasicRemote().sendText(request.toString());
				}
		    } 
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private boolean addUserToSession(User newUser, String sessionId) {
		for(CollaborationSession s: sessions) {
			s.addUser(newUser);
			return true;
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
					connection.getBasicRemote().sendText(request.toString());
				}
		    } 
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private boolean startSession(String sessionId) {
		System.out.println("Sessions before :" + this.prepareSessionsToSend().toString());
		for(CollaborationSession s: sessions) {
			if(s.getId().equals(sessionId)) {
				try {
					s.setModel(this.initializeModel());
					s.startSession();
					return true;
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
							conn.getBasicRemote().sendText(request.toString());
						}
					} catch (JSONException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
			    } 
				s.finishSession();
				return true;
			}
		}
		return false;
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
			connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void sendSessions(Session connection) {
		try {
			// prepare data for CollaborationSession s
			JSONArray jsonSessions = this.prepareSessionsToSend();
			System.out.println("Send open sessions list to: " + connection.getId());
			JSONObject request = new JSONObject();
			request.put("operation", "updateSessions");
			request.put("sessions", jsonSessions);
			connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private void publishModel(String sessionId, String newModel) {
		try {
			this.setModel(sessionId, new JSONObject(newModel));
			// publish model only for those who are in the same collaboration session
			List<Session> relevantConnections = sessionsConnections.get(sessionId);
	        // Iterate over the connected sessions
			synchronized(relevantConnections){
				System.out.println("Publishing model: " + newModel);
		    	// and broadcast the received message
				for(Session conn : relevantConnections){
					this.sendModel(sessionId, conn);
				}
		    } 
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }
	}

	private void setModel(String sessionId, JSONObject newModel) {
		for(CollaborationSession s: sessions) {
			if(s.getId().equals(sessionId)) {
				s.setModel(newModel);
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
	/*
	private void newLoadModel() {
	    System.out.println("Try resourcey stuff...");
		ResourceSet resSet = new ResourceSetImpl();

	    // Get the resource
	    Resource resource = resSet.getResource(URI
	        .createURI("res/WTSpec2.0.ecore"), true);
	    System.out.println("done");
	}
	*/
	
	private JSONObject initializeModel() throws JSONException {
		// load dummy model
		JSONArray nodes = new JSONArray();
		JSONArray edges = new JSONArray();
		JSONArray newNodes = new JSONArray();
		JSONArray newEdges = new JSONArray();
		JSONObject newModel = new JSONObject();
		
		// System inputs
		JSONObject input15 = this.createNode(
			"SystemInput", "In15", "Input AI_15", "InputGroup1", 50, 400
		);
		JSONObject input2 = this.createNode(
			"SystemInput", "In2", "Input AI_2", "InputGroup1", 50, 500
		);
		JSONObject input18 = this.createNode(
			"SystemInput", "In18", "Input AI_18", "InputGroup1", 50, 600
		);
		JSONObject input48 = this.createNode(
			"SystemInput", "In48", "Input AI_48", "InputGroup2", 150, 150
		);
		JSONObject input22 = this.createNode(
			"SystemInput", "In22", "Input AI_22", "InputGroup2", 350, 150
		);
		JSONObject input73 = this.createNode(
			"SystemInput", "In73", "Input AI_73", "InputGroup2", 550, 150
		);
		
		nodes.put(input15);
		nodes.put(input2);
		nodes.put(input18);
		nodes.put(input48);
		nodes.put(input22);
		nodes.put(input73);
		
		// Subsystems
		JSONObject subSystem08 = this.createNode(
			"SubSystem", "SubSystem08", "SubSystem 08", "SubGroup1", 230, 300
		);
		JSONObject subSystem08_02 = this.createNode(
			"SubSystem", "SubSystem08_02", "SubSystem 08_02", "SubGroup1", 400, 500
		);
		JSONObject subSystem08_02_11 = this.createNode(
			"SubSystem", "SubSystem08_02_11", "SubSystem 08_02_11", "SubGroup1", 300, 650
		);
		JSONObject subSystem17 = this.createNode(
			"SubSystem", "SubSystem17", "SubSystem 17", "SubGroup2", 650, 550
		);
		nodes.put(subSystem08);
		nodes.put(subSystem08_02);
		nodes.put(subSystem08_02_11);
		nodes.put(subSystem17);
		
		// control units
		JSONObject ctrlUnit007 = this.createNode(
			"CtrlUnit", "CtrlUnit007", "CtrlUnit_007", "SubGroup1", 250, 450
		);
		JSONObject ctrlUnit18 = this.createNode(
			"CtrlUnit", "CtrlUnit18", "CtrlUnit_18", "SubGroup1", 400, 250
		);
		JSONObject ctrlUnit22 = this.createNode(
			"CtrlUnit", "CtrlUnit22", "CtrlUnit_22", "SubGroup1", 450, 300
		);
		JSONObject ctrlUnit404 = this.createNode(
			"CtrlUnit", "CtrlUnit404", "CtrlUnit_404", "SubGroup1", 500, 350
		);
		JSONObject ctrlUnit04 = this.createNode(
			"CtrlUnit", "CtrlUnit04", "CtrlUnit_04", "SubGroup1", 270, 550
		);
		JSONObject ctrlUnit05 = this.createNode(
			"CtrlUnit", "CtrlUnit05", "CtrlUnit_05", "SubGroup1", 500, 550
		);
		JSONObject ctrlUnit15 = this.createNode(
			"CtrlUnit", "CtrlUnit15", "CtrlUnit_15", "SubGroup1", 500, 650
		);
		nodes.put(ctrlUnit007);
		nodes.put(ctrlUnit18);
		nodes.put(ctrlUnit22);
		nodes.put(ctrlUnit404);
		nodes.put(ctrlUnit04);
		nodes.put(ctrlUnit05);
		nodes.put(ctrlUnit15);
		
		// System outputs
		JSONObject output007 = this.createNode(
			"SystemOutput", "Out007", "Output DO_007", "OutputGroup1", 650, 250
		);
		JSONObject output18 = this.createNode(
			"SystemOutput", "Out18", "Output DO_18", "OutputGroup1", 650, 350
		);
		JSONObject output22 = this.createNode(
			"SystemOutput", "Out22", "Output DO_22", "OutputGroup2", 630, 450
		);

		nodes.put(output007);
		nodes.put(output18);
		nodes.put(output22);
		
		// System variables
		JSONObject sysParam1 = this.createNode(
			"SystemParam", "Param1", "Parameter 1", "ParamGroup1", 300, 700
		);
		JSONObject sysParam2 = this.createNode(
			"SystemParam", "Param", "Parameter 2", "ParamGroup1", 450, 700
		);
		nodes.put(sysParam1);
		nodes.put(sysParam2);
		
		// System variables
		JSONObject sysVar1 = this.createNode(
			"SystemVariable", "Var1", "Variable 1", "VarGroup1", 650, 700
		);
		JSONObject sysVar2 = this.createNode(
			"SystemVariable", "Var2", "Variable 2", "VarGroup1", 750, 700
		);
		nodes.put(sysVar1);
		nodes.put(sysVar2);
		
		// System faults
		JSONObject sysFault1 = this.createNode(
			"SystemFault", "Fault1", "Fault 1", "FaultGroup1", 500, 750
		);
		JSONObject sysFault2 = this.createNode(
			"SystemFault", "Fault2", "Fault 2", "FaultGroup1", 600, 750
		);
		nodes.put(sysFault1);
		nodes.put(sysFault2);
		
		JSONObject edge1 = this.createEdge(
			"Contains", "Conn1", "SubSystem08", "CtrlUnit18", "Conn1", ""
		);
		JSONObject edge2 = this.createEdge(
			"Contains", "Conn2", "SubSystem08", "CtrlUnit22", "Conn2", "SubGroup1"
		);
		JSONObject edge3 = this.createEdge(
			"Contains", "Conn3", "SubSystem08", "CtrlUnit404", "Conn3", "SubGroup1"
		);
		JSONObject edge4 = this.createEdge(
			"Contains", "Conn4", "SubSystem08", "SubSystem08_02", "Conn4", "SubGroup1"
		);
		JSONObject edge5 = this.createEdge(
			"Contains", "Conn5", "SubSystem08_02", "CtrlUnit007", "Conn5", "SubGroup1"
		);
		JSONObject edge6 = this.createEdge(
			"Contains", "Conn6", "SubSystem08_02", "CtrlUnit04", "Conn6", "SubGroup1"
		);
		JSONObject edge7 = this.createEdge(
			"Contains", "Conn7", "SubSystem08_02", "CtrlUnit05", "Conn7", "SubGroup1"
		);
		JSONObject edge8 = this.createEdge(
			"Contains", "Conn8", "SubSystem08_02", "SubSystem08_02_11", "Conn8", "SubGroup1"
		);
		JSONObject edge9 = this.createEdge(
			"Contains", "Conn9", "SubSystem08_02_11", "CtrlUnit15", "Conn9", "SubGroup1"
		);
		edges.put(edge1);
		edges.put(edge2);
		edges.put(edge3);
		edges.put(edge4);
		edges.put(edge5);
		edges.put(edge6);
		edges.put(edge7);
		edges.put(edge8);
		edges.put(edge9);
				
		for(int i = 0; i < nodes.length(); i++) {
			JSONObject node = nodes.getJSONObject(i);
			node.put("elementType", 1);
			newNodes.put(node);
		}
		
		
		for(int i = 0; i < edges.length(); i++) {
			JSONObject edge = edges.getJSONObject(i);
			edge.put("elementType", 2);
			newEdges.put(edge);
		}

		newModel.put("nodes", newNodes);
		newModel.put("edges", newEdges);

		return newModel;
	}
	
	private JSONObject createNode(String type, String id, String label, String group, int x, int y) throws JSONException {
		JSONObject node = new JSONObject();
		node.put("type", type);
		node.put("id", id);
		node.put("label", label);
		node.put("group", group);
		node.put("x", x);
		node.put("y", y);
		return node;
	}
	
	private JSONObject createEdge(String type, String id, String from, String to, String name, String group) throws JSONException {
		JSONObject edge = new JSONObject();
		edge.put("type", type);
		edge.put("id", id);
		edge.put("from", from);
		edge.put("to", to);
		edge.put("name", name);
		edge.put("group", group);
		return edge;
	}
}
