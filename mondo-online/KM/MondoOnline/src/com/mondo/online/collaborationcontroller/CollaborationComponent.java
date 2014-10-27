package com.mondo.online.collaborationcontroller;

import java.io.Serializable;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.vaadin.annotations.JavaScript;
import com.vaadin.annotations.StyleSheet;
import com.vaadin.ui.AbstractJavaScriptComponent;
import com.vaadin.ui.JavaScriptFunction;

@JavaScript({
	"app://VAADIN/visjs/vis.js", 
	"collaboration-connector.js",
	"collaborationcomponent.js"
})
@StyleSheet({"app://VAADIN/visjs/vis.css"})
public class CollaborationComponent extends AbstractJavaScriptComponent {
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
    protected SharedState getState() {
        return (SharedState) super.getState();
    }
    
    public CollaborationComponent() {
        addFunction("editElement", new JavaScriptFunction() {
            @Override
            public void call(JSONArray arguments)
                    throws JSONException {
            	System.out.println("Server-side editElement");
            	System.out.println(arguments.toString());
            }
        });
        
        addFunction("loadModel", new JavaScriptFunction() {
            @Override
            public void call(JSONArray arguments)
                    throws JSONException {
            	System.out.println("Server-side loadModel");
                JSONObject model = new JSONObject();
                JSONArray nodes = new JSONArray();
                for(int i = 0; i < 5; i++) {
                	JSONObject node  = new JSONObject();
                	node.put("id", i);
                	node.put("label", "Nodey " + i);
                	node.put("Prop1", "Some prop");
                    nodes.put(node);
                }
                model.put("nodes", nodes);
                
                JSONArray edges = new JSONArray();
                for(int i = 0; i < 3; i++) {
                	JSONObject edge  = new JSONObject();
                	edge.put("from", i);
                	edge.put("to", i + 1);
                	edge.put("name", "connection " + i);
                	edges.put(edge);
                }
                JSONObject edge  = new JSONObject();
            	edge.put("from", 0);
            	edge.put("to", 4);
            	edge.put("name", "connection 4");
            	JSONObject edge2  = new JSONObject();
            	edge2.put("from", 1);
            	edge2.put("to", 4);
            	edge2.put("name", "connection 5");
            	
            	JSONObject edge3  = new JSONObject();
            	edge3.put("from", 3);
            	edge3.put("to", 4);
            	edge3.put("name", "connection 6");
            	
            	edges.put(edge);
            	edges.put(edge2);
            	edges.put(edge3);
                model.put("nodes", nodes);
                model.put("edges", edges);
                
                getState().setModel(model.toString());
            }
        });
    }
}