package eu.mondo.collaboration.server.mondo_server;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;



import eu.mondo.collaboration.messages.MessageToClientEncoder;
import eu.mondo.collaboration.messages.MessageToServer;
import eu.mondo.collaboration.messages.MessageToServerDecoder;
import eu.mondo.collaboration.primitives.OfflineCollaborationPrimitive;

@ServerEndpoint(
	value = "/", 
	encoders = MessageToClientEncoder.class, 
	decoders = MessageToServerDecoder.class
)
public class MondoServer {
	private List<Session> clients = new ArrayList<Session>();
	 
	@OnOpen
	public void onOpen(final Session session) {
		clients.add(session);
		System.out.println("Server: session openend");
	}
 
	@OnMessage
	public void processUpload(ByteBuffer buffer, boolean last, Session session) {
		FileChannel out = null;
		String filePath = "D:/receivedSampleFile.txt";
		try {
	    	System.out.println("Saving file.");
			out = new FileOutputStream(filePath).getChannel();
		    out.write(buffer);
		    out.close();
		    System.out.println("Successfully written file.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO Exception :( failed to save file on server side");
			e.printStackTrace();
		}
	}

	@OnMessage
	public void onMessage(final Session session, final MessageToServer message) {
		System.out.println("Server received message.");
		System.out.println("Requested operation: " + message.getPrimitive());
		System.out.println("Info: " + message.getInfo());
		
		executeCollaborationPrimitive(message.getPrimitive());
		
		/*
		System.out.println("Server received message. Prim: " + primitive);
		try {
			for (Session s : session.getOpenSessions()) {
				if (s.isOpen()) {
					s.getBasicRemote().sendObject(message);
				}
			}
		} catch (IOException | EncodeException e) {
			log.log(Level.WARNING, "onMessage failed", e);
		}
		*/
	}
	
	private void executeCollaborationPrimitive(OfflineCollaborationPrimitive primitive) {
		switch(primitive) {
		case CHECKOUT: 
			System.out.println("TODO implementation of CHECKOUT");
			break;
		case MERGE: 
			System.out.println("TODO implementation of MERGE");
			break;
		case UPDATE: 
			System.out.println("TODO implementation of UPDATE");
			break;
		case COMMIT: 
			System.out.println("TODO implementation of COMMIT");
			break;
		case LOCK: 
			System.out.println("TODO implementation of LOCK");
			break;
		case UNLOCK: 
			System.out.println("TODO implementation of UNLOCK");
			break;
		case LIST_LOCKS: 
			System.out.println("TODO implementation of LIST_LOCKS");
			break;
		case LOG: 
			System.out.println("TODO implementation of LOG");
			break;
		case CHANGE_PERMISSION: 
			System.out.println("TODO implementation of CHANGE_PERMISSION");
			break;
	}
		
	}

	@OnClose
	public void onClose(final Session session) {
		clients.remove(session);
		System.out.println("Session closed.");
	}
}
