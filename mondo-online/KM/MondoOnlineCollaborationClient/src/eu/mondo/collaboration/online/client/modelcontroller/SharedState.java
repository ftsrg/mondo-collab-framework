package eu.mondo.collaboration.online.client.modelcontroller;

import org.json.JSONObject;

import com.vaadin.shared.ui.JavaScriptComponentState;

public class SharedState extends JavaScriptComponentState {
    public String value;

    public JSONObject model;
    
	public void setValue(String value) {
		this.value = value;
	}
	
	public void setModel(JSONObject newModel) {
		System.out.println("shared state setmodel to: " + newModel.toString());
		this.model = newModel;
	}
} 