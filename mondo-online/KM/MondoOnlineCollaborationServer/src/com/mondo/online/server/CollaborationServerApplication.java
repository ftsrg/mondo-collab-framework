package com.mondo.online.server;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
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
	static private JSONObject model = null;
	
	private static Set<Session> connections = 
	    Collections.synchronizedSet(new HashSet<Session>());
	
	private List<CollaborationSession> sessions;
	
	public CollaborationServerApplication() {
		try {
			if(CollaborationServerApplication.model == null) {
				this.loadModel();
				System.out.println("Model loadeddd.");
			} else {
				System.out.println("No init required.");
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@OnOpen
	public void onOpen(Session connection) {
		// Add session to the connected sessions set
		connections.add(connection);
	    System.out.println("num of clients: " + connections.size());
	}
	
	@OnMessage
	public void onMessage(String message, Session connection) 
		throws IOException {
		try {
			JSONObject request = new JSONObject(message);
			String operation = request.getString("operation");

			System.out.println("Process request: " + operation);
			if(operation.equals("publishModel")) {
				System.out.println("publishModel...");
				String newModel = request.getString("model");
				this.publishModel(newModel);
			} else if(operation.equals("getOpenSessions")) {
				System.out.println("sendOpenSessions...");
				this.sendOpenSessions(connection);
			} else if(operation.equals("getModel")) {
				System.out.println("getModel...");
				this.sendModel(connection);
			}
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}   
	}
	  
	private void sendModel(Session connection) {
		try {
			System.out.println("Send model to: " + connection.getId());
			JSONObject request = new JSONObject();
			request.put("operation", "updateModel");
			request.put("model", CollaborationServerApplication.model);
			connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	// TODO body should be for initializing available sessions
	private void sendOpenSessions(Session connection) {
		String pathToResFolder = "D:\\Eclipse\\Eclipse_EE\\workspace_EE\\MondoOnlineCollaborationServer\\res";
		final File folder = new File(pathToResFolder);
		try {
			// prepare data for CollaborationSession s
			JSONArray sessions = new JSONArray();
			
			int id = 0;
			for (final File fileEntry : folder.listFiles()) {
		        if (!fileEntry.isDirectory()) {
		        	String modelPath = pathToResFolder + fileEntry.getName(); 
		        	JSONObject session = new JSONObject();
		        	session.put("id", id);
		        	session.put("title", fileEntry.getName());
		        	session.put("title", fileEntry.getName());
		        	sessions.put(session);
		        	id++;
		        }
		    }
			System.out.println("Send open sessions list to: " + connection.getId());
			JSONObject request = new JSONObject();
			request.put("operation", "updateOpenSessions");
			request.put("sessions", sessions);
			connection.getBasicRemote().sendText(request.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void publishModel(String newModel) {
		try {
			CollaborationServerApplication.model = new JSONObject(newModel);
	        // Iterate over the connected sessions
			synchronized(connections){
				System.out.println("Publishing model: " + newModel);
		    	// and broadcast the received message
				for(Session connection : connections){
					if (!connections.equals(connection)){
						this.sendModel(connection);
					}
				}
		    } 
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		ResourceSet resSet = new ResourceSetImpl();

	    // Get the resource
	    Resource resource = resSet.getResource(URI
	        .createURI("res/WTSpec2.0.ecore"), true);
	    System.out.println(resource.toString());
	}
	*/
	
	private void loadModel() throws JSONException {
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

		CollaborationServerApplication.model = newModel;
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
