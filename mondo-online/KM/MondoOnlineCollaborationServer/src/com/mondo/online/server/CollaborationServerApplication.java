package com.mondo.online.server;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
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
	
	private static Set<Session> clients = 
	    Collections.synchronizedSet(new HashSet<Session>());
	
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
	
	@OnMessage
	public void onMessage(String message, Session session) 
		throws IOException {
	    
		synchronized(clients){
			System.out.println("setting model to: " + message);
			try {
				CollaborationServerApplication.model = new JSONObject(message);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      // Iterate over the connected sessions
	    	// and broadcast the received message
			for(Session client : clients){
				if (!client.equals(session)){
					System.out.println("Push to: " + client.getId());
					client.getBasicRemote().sendText(message);
				}
			}
	    }
	}
	  
	@OnOpen
	public void onOpen (Session session) {
		// Add session to the connected sessions set
	    clients.add(session);
	    System.out.println("num of clients: " + clients.size());
	    try {
			session.getBasicRemote().sendText(CollaborationServerApplication.model.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@OnClose
	public void onClose (Session session) {
	    // Remove session from the connected sessions set
		clients.remove(session);
	}
	
	private void loadModel() throws JSONException {
		// load dummy model
		JSONObject model = new JSONObject();
		JSONArray nodes = new JSONArray();
		int[] posXs = {100, 250, 175, 280, 130};
		int[] posYs = {500, 500, 250, 380, 650};
		for (int i = 0; i < 5; i++) {
			JSONObject node = new JSONObject();
			node.put("elementType", 1);
			node.put("id", "" + i);
			node.put("label", "Node " + i);
			node.put("SomeAttribute", "Some value " + i);
			node.put("x", posXs[i]);
			node.put("y", posYs[i]);
			nodes.put(node);
		}
		model.put("nodes", nodes);

		JSONArray edges = new JSONArray();
		for (int i = 0; i < 3; i++) {
			JSONObject edge = new JSONObject();
			edge.put("elementType", 2);
			edge.put("id", "edge_" + i);
			edge.put("from", "" + i);
			edge.put("to", "" + (i + 1));
			edge.put("name", "connection " + i);
			edges.put(edge);
		}
		JSONObject edge = new JSONObject();
		edge.put("elementType", 2);
		edge.put("id", "edge_3");
		edge.put("from", "0");
		edge.put("to", "4");
		edge.put("name", "connection 4");
		JSONObject edge2 = new JSONObject();
		edge2.put("elementType", 2);
		edge2.put("id", "edge_4");
		edge2.put("from", "2");
		edge2.put("to", "4");
		edge2.put("name", "connection 5");

		JSONObject edge3 = new JSONObject();
		edge3.put("elementType", 2);
		edge3.put("id", "edge_5");
		edge3.put("from", "3");
		edge3.put("to", "4");
		edge3.put("name", "connection 6");

		edges.put(edge);
		edges.put(edge2);
		edges.put(edge3);
		model.put("nodes", nodes);
		model.put("edges", edges);
		
		CollaborationServerApplication.model = model;
	}
}
