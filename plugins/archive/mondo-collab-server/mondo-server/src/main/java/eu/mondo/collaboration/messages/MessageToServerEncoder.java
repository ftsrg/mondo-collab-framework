package eu.mondo.collaboration.messages;

import javax.json.Json;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;
 
public class MessageToServerEncoder implements Encoder.Text<MessageToServer> {
	@Override
	public void init(final EndpointConfig config) {
	}
 
	@Override
	public void destroy() {
	}
 
	@Override
	public String encode(final MessageToServer message) throws EncodeException {
		return Json.createObjectBuilder()
			.add("primitive", message.getPrimitive().toString())
			.add("info", message.getInfo()).build()
			.toString();
	}

}