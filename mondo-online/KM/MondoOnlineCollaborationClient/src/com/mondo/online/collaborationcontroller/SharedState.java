package com.mondo.online.collaborationcontroller;

import org.json.JSONObject;

import com.vaadin.shared.ui.JavaScriptComponentState;

public class SharedState extends JavaScriptComponentState {
    public String value;

    public JSONObject model;
    
	public void setValue(String value) {
		this.value = value;
	}
	
	public void setModel(JSONObject model) {
		System.out.println(model);
		this.model = model;
	}
}