package eu.mondo.collaboration.online.client.modelcontroller;

import org.json.JSONException;
import org.json.JSONObject;

public class ExecutedOperation {
	private JSONObject oldValue;
	private JSONObject newValue;
	private String operation;
	private String note;
	
	public void setOldValue(JSONObject _oldValue) {
		try {
			this.oldValue = new JSONObject(_oldValue.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	public void setNewValue(JSONObject _newValue) {
		try {
			this.newValue = new JSONObject(_newValue.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	public void setOperation(String _operation) {
		this.operation = _operation;
	}
	
	public void setNote(String _note) {
		this.note = _note;
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
	
	public String getNote() {
		return this.note;
	}
}
