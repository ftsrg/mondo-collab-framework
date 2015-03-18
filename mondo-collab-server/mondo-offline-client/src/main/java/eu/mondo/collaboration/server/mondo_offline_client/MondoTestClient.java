package eu.mondo.collaboration.server.mondo_offline_client;

import java.io.Console;
import java.io.StringReader;
import java.net.URI;
import java.net.URISyntaxException;

import javax.json.Json;
import javax.json.JsonObject;

import eu.mondo.collaboration.messages.MessageToServer;
import eu.mondo.collaboration.primitives.OfflineCollaborationPrimitive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.EncodeException;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
 
public class MondoTestClient {
 
    public Session session;
 
    public static void main(String args[]){
    	 try {
    		MondoOfflineClient client = new MondoOfflineClient(
         		new URI("ws://localhost:8080/mondo-server/")
         	);
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String primitive = "";
            do {
            	primitive = br.readLine();
            	if(primitive.equals("file")) {
                	client.sendFile();
                } else if(OfflineCollaborationPrimitive.getValue(primitive).equals(null)) {
            		System.out.println("Primitive not found..");
            	} else if(!primitive.equals("exit")) {
            		MessageToServer msg = new MessageToServer();
            		msg.setPrimitive(OfflineCollaborationPrimitive.getValue(primitive));
            		msg.setInfo("Some info");
                	client.sendMessage(msg);
                }
 
            } while(!primitive.equals("exit"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
