package eu.mondo.collaboration.messages;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

import eu.mondo.collaboration.primitives.OfflineCollaborationPrimitive;
 
public class MessageToClientDecoder implements Decoder.Text<MessageToClient> {
	@Override
	public void init(final EndpointConfig config) {
	}
 
	@Override
	public void destroy() {
	}
 
	@Override
	public MessageToClient decode(final String textMessage) throws DecodeException {
		System.out.println("Server decode: " + textMessage);
		MessageToClient message = new MessageToClient();
		JsonObject obj = Json.createReader(new StringReader(textMessage))
			.readObject();
		
		message.setCommand(obj.getString("command"));
		
		return message;
	}
 
	@Override
	public boolean willDecode(final String s) {
		return true;
	}
}