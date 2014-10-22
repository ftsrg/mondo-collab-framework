package com.example.mondowebappvaadin7.js;

import java.io.Serializable;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.vaadin.annotations.JavaScript;
import com.vaadin.ui.AbstractJavaScriptComponent;
import com.vaadin.ui.JavaScriptFunction;

@JavaScript({"mylibrary.js", "mycomponent-connector.js"})
public class MyComponent extends AbstractJavaScriptComponent {
    public interface ValueChangeListener extends Serializable {
        void valueChange();
    }
    ArrayList<ValueChangeListener> listeners =
            new ArrayList<ValueChangeListener>();
    public void addValueChangeListener(
                   ValueChangeListener listener) {
        listeners.add(listener);
    }
    
    public void setValue(String value) {
        getState().value = value;
    }
    
    public String getValue() {
        return getState().value; 
    }
    
    public void setModel(String model) {
        getState().model = model;
    }
    
    public String getModel() {
        return getState().model; 
    }

    @Override
    protected MyComponentState getState() {
        return (MyComponentState) super.getState();
    }
    
    public MyComponent() {
        addFunction("onClick", new JavaScriptFunction() {
            @Override
            public void call(JSONArray arguments)
                    throws JSONException {
            	System.out.println("Server-side onClick");
                getState().setValue(arguments.getString(0));
                for (ValueChangeListener listener: listeners)
                    listener.valueChange();
            }
        });
        
        addFunction("loadModel", new JavaScriptFunction() {
            @Override
            public void call(JSONArray arguments)
                    throws JSONException {
            	System.out.println("Server-side loadModel");
                JSONObject model = new JSONObject();
                JSONArray nodes  = new JSONArray();
                for(int i = 0; i < 3; i++) {
                	JSONObject node  = new JSONObject();
                	node.put("id", "node" + i);
                	node.put("name", "Node " + i);
                    nodes.put(node);
                }
                model.put("nodes", nodes);
                
                getState().setModel(model.toString());
            }
        });
    }
}