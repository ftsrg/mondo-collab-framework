package eu.mondo.collaboration.online.client.modelcontroller;

import org.json.JSONObject;

public class ExecutedOperation {
	private JSONObject oldValue;
	private JSONObject newValue;
	private String operation;

	public void setOldValue(JSONObject _oldValue) {
		this.oldValue = _oldValue;
	}
	
	public void setNewValue(JSONObject _newValue) {
		this.newValue = _newValue;
	}
	
	public void setOperation(String _operation) {
		this.operation = _operation;
	}
	
	public JSONObject getOldValue() {
		return this.oldValue;
	}
	
	public JSONObject getNewValue() {
		return this.newValue;
	}
	
	public String getOperation() {
		return this.operation;
	}
}
