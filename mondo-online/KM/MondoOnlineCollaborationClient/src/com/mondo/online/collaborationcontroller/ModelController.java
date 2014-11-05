package com.mondo.online.collaborationcontroller;

import java.io.IOException;

import javax.websocket.ClientEndpoint;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

import org.json.JSONException;
import org.json.JSONObject;

@ClientEndpoint
public class ModelController {
	
	private static Session session;
	
	static private CollaborationComponent cc;
	
	@OnOpen
    public void onOpen(Session session) {
		ModelController.session = session;
        System.out.println("Connected to endpoint: " + session.getBasicRemote());
    }
    
    @OnMessage
    public void processMessage(String message) {
    	try {
    		System.out.println("recieved model: " + message);
			ModelController.cc.setModel(new JSONObject(message));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @OnError
    public void processError(Throwable t) {
        t.printStackTrace();
    }
    
    public static void setCollaborationComponent(CollaborationComponent newCC) {
    	cc = newCC;
    }
    
    public static void updateModel(String model) {
        System.out.println("Sending message to endpoint: " + model);
        try {
			session.getBasicRemote().sendText(model);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
