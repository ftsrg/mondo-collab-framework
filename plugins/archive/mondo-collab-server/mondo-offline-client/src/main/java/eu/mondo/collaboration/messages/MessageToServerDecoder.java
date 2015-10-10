package eu.mondo.collaboration.messages;

import java.io.StringReader;
 

import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

import eu.mondo.collaboration.primitives.OfflineCollaborationPrimitive;
 
public class MessageToServerDecoder implements Decoder.Text<MessageToServer> {
	@Override
	public void init(final EndpointConfig config) {
	}
 
	@Override
	public void destroy() {
	}
 
	@Override
	public MessageToServer decode(final String textMessage) throws DecodeException {
		MessageToServer message = new MessageToServer();
		JsonObject obj = Json.createReader(new StringReader(textMessage))
			.readObject();
		message.setPrimitive(
			OfflineCollaborationPrimitive.getValue(obj.getString("primitive"))
		);
		message.setInfo(obj.getString("info"));
		return message;
	}
 
	@Override
	public boolean willDecode(final String s) {
		return true;
	}
}