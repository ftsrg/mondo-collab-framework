package com.mondo.online.collaborationcontroller;

import com.vaadin.shared.ui.JavaScriptComponentState;

public class SharedState extends JavaScriptComponentState {
    public String value;

    public String model;
    
	public void setValue(String value) {
		this.value = value;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
}