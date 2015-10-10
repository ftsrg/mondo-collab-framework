package eu.mondo.collaboration.server.mondo_offline_client;

import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.websocket.ClientEndpoint;
import javax.websocket.CloseReason;
import javax.websocket.ContainerProvider;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

import eu.mondo.collaboration.messages.MessageToServer;
import eu.mondo.collaboration.messages.MessageToServerDecoder;
import eu.mondo.collaboration.messages.MessageToServerEncoder;
 
@ClientEndpoint( 
	encoders = MessageToServerEncoder.class, 
	decoders = MessageToServerDecoder.class
)
public class MondoOfflineClient {
	private Session userSession = null;
	private MessageToServerEncoder encoder = new MessageToServerEncoder();
	
	public MondoOfflineClient(final URI endpointURI) {
		try {
			WebSocketContainer container = ContainerProvider.getWebSocketContainer();
			container.connectToServer(this, endpointURI);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@OnOpen
	public void onOpen(final Session userSession) {
		System.out.println("Client: connected to server");
		this.userSession = userSession;
	}
 
	@OnClose
	public void onClose(final Session userSession, final CloseReason reason) {
		System.out.println("Client: session closed. Reason: " + reason.getReasonPhrase());
		this.userSession = null;
	}
 
	@OnMessage
	public void onMessage(final String message) {
		System.out.println("Client: received msg: " + message);
	}
 
	public void sendMessage(final MessageToServer msg) {
		userSession.getAsyncRemote().sendObject(msg);
	}
	
	public void sendFile() {
		Path path = FileSystems.getDefault().getPath("D:/mondo_server/sampleFile.txt");
		try {
			byte[] fileContent = Files.readAllBytes(path);
			System.out.println("Successfully read file. Length: " + fileContent.length);
			ByteBuffer byteBuffer = ByteBuffer.allocate(fileContent.length);
			byteBuffer.put(fileContent);
			this.userSession.getBasicRemote().sendBinary(byteBuffer);
		} catch (IOException e) {
			System.out.println("something went wrong");
			e.printStackTrace();
		}
	}
}