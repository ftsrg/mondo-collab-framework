package com.example.mondowebappvaadin7.js;

import com.vaadin.shared.ui.JavaScriptComponentState;

public class MyComponentState extends JavaScriptComponentState {
    public String value;

    public String model;
    
	public void setValue(String value) {
		this.value = value;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
}