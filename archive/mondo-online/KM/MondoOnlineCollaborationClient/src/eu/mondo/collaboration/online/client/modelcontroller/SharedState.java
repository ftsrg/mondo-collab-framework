package eu.mondo.collaboration.online.client.modelcontroller;

import org.json.JSONObject;

import com.vaadin.shared.ui.JavaScriptComponentState;

public class SharedState extends JavaScriptComponentState {
    public String value;
    
    public boolean modelTransferIsComplete = false;
    
    public boolean modelDisplayIsInitialized = false;
    
    public JSONObject model;
    
    public JSONObject positions = new JSONObject();
    
	public void setValue(String value) {
		this.value = value;
	}
	
	public void setModel(JSONObject newModel) {
		System.out.println("shared state setmodel - " + newModel.toString());
		this.model = newModel;
	}
	
	public void setPositions(JSONObject newPositions) {
		System.out.println("shared state setpositions - " + newPositions.toString());
		this.positions = newPositions;
	}
	
	public void setModelDisplayIsInitizalized() {
		modelDisplayIsInitialized = true;
	}
} 