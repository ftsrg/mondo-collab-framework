package eu.mondo.collaboration.messages;

import javax.json.Json;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;
 
public class MessageToClientEncoder implements Encoder.Text<MessageToClient> {
	@Override
	public void init(final EndpointConfig config) {
	}
 
	@Override
	public void destroy() {
	}
 
	@Override
	public String encode(final MessageToClient message) throws EncodeException {
		return Json.createObjectBuilder()
			.add("command", message.getCommand()).build()
			.toString();
	}

}