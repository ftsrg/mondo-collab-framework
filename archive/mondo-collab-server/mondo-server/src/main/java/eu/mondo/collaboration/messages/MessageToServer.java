package eu.mondo.collaboration.messages;

import eu.mondo.collaboration.primitives.OfflineCollaborationPrimitive;

public class MessageToServer {
	private OfflineCollaborationPrimitive primitive;
	private String info;
	
	public void setPrimitive(OfflineCollaborationPrimitive primitive) {
		this.primitive = primitive;
	}
	
	public OfflineCollaborationPrimitive getPrimitive() {
		return this.primitive;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
	
	public String getInfo() {
		return this.info;
	}
}
