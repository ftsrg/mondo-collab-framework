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
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@JavaScript({ 
	"app://VAADIN/client/visjs/vis.js",
	"app://VAADIN/client/jquery/jquery-2.1.0.min.js",
	"collaboration-connector.js", "collaborationcomponent.js" 
})
@StyleSheet({ 
	"app://VAADIN/client/visjs/vis.css",
	"app://VAADIN/client/MondoOnline.css" 
})
public class CollaborationComponent extends AbstractJavaScriptComponent {
	public interface ValueChangeListener extends Serializable {
		void valueChange();
	}

	ArrayList<ValueChangeListener> listeners = new ArrayList<ValueChangeListener>();

	public void addValueChangeListener(ValueChangeListener listener) {
		listeners.add(listener);
	}

	public void setValue(String value) {
		getState().value = value;
	}

	public String getValue() {
		return getState().value;
	}

	public void setModel(JSONObject model) {
		getState().model = model;
	}

	public JSONObject getModel() {
		return getState().model;
	}

	@Override
	protected SharedState getState() {
		return (SharedState) super.getState();
	}

	public CollaborationComponent() {
		addFunction("addElement", new JavaScriptFunction() {
			@Override
			public void call(JSONArray arguments) throws JSONException {
				JSONObject node = arguments.getJSONObject(0);
				
				// TODO validate action
				JSONObject newModel = getState().model;
				newModel.getJSONArray("nodes").put(node);
				getState().setModel(newModel);
			}
		});
		
		addFunction("editElement", new JavaScriptFunction() {
			@Override
			public void call(JSONArray arguments) throws JSONException {
				JSONObject nodes = arguments.getJSONObject(0);
				JSONObject originalNode = nodes.getJSONObject("originalNode");
				JSONObject editedNode = nodes.getJSONObject("editedNode");
				
				// TODO validate action
				JSONObject newModel = getState().model;
				JSONArray nodesInSharedModel = getState().model.getJSONArray("nodes");
				for(int i = 0; i < nodesInSharedModel.length(); i++) {
					JSONObject currentNode = nodesInSharedModel.getJSONObject(i);
					if(currentNode.get("id").equals(originalNode.get("id"))) {
						JSONArray newNodes = nodesInSharedModel;
						newNodes.put(i, editedNode);
						newModel.put("nodes", newNodes);
						getState().setModel(newModel);
						break;
					}
				}
			}
		});

		// deletes noeds and edges
		addFunction("deleteElement", new JavaScriptFunction() {
			@Override
			public void call(JSONArray arguments) throws JSONException {
				JSONObject data = arguments.getJSONObject(0);
				String nodeId = data.getString("nodeId");
				JSONArray edgeIds = data.getJSONArray("edgeIds");
				
				// TODO validate action
				JSONObject newModel = getState().model;
				
				// delete node
				JSONArray nodesInSharedModel = getState().model.getJSONArray("nodes");
				JSONArray newNodes = new JSONArray();
				for(int i = 0; i < nodesInSharedModel.length(); i++) {
					JSONObject currentNode = nodesInSharedModel.getJSONObject(i);
					if(!currentNode.get("id").equals(nodeId)) {
						newNodes.put(currentNode);
					}
				}
				
				// delete edges
				JSONArray edgesInSharedModel = getState().model.getJSONArray("edges");
				JSONArray newEdges = new JSONArray();
				for(int i = 0; i < edgesInSharedModel.length(); i++) {
					JSONObject currentEdge = edgesInSharedModel.getJSONObject(i);
					boolean goodToGo = true;
					for(int j = 0; j < edgeIds.length(); j++){
						if(currentEdge.get("id").equals(edgeIds.get(j))) {
							goodToGo = false;
							break;
						}
					}
					if(goodToGo) {
						newEdges.put(currentEdge);
					}
				}
				newModel.put("nodes", newNodes);
				newModel.put("edges", newEdges);
				getState().setModel(newModel);
				
			}
		});
		
		addFunction("loadModel", new JavaScriptFunction() {
			@Override
			public void call(JSONArray arguments) throws JSONException {
				// load dummy model
				JSONObject model = new JSONObject();
				JSONArray nodes = new JSONArray();
				int[] posXs = {100, 250, 175, 280, 130};
				int[] posYs = {500, 500, 250, 380, 650};
				for (int i = 0; i < 5; i++) {
					JSONObject node = new JSONObject();
					node.put("id", "" + i);
					node.put("label", "Node " + i);
					node.put("SomeAttribute", "Some value " + i);
					node.put("x", posXs[i]);
					node.put("y", posYs[i]);
					nodes.put(node);
				}
				model.put("nodes", nodes);

				JSONArray edges = new JSONArray();
				for (int i = 0; i < 3; i++) {
					JSONObject edge = new JSONObject();
					edge.put("id", "edge_" + i);
					edge.put("from", "" + i);
					edge.put("to", "" + (i + 1));
					edge.put("name", "connection " + i);
					edges.put(edge);
				}
				JSONObject edge = new JSONObject();
				edge.put("id", "edge_3");
				edge.put("from", "0");
				edge.put("to", "4");
				edge.put("name", "connection 4");
				JSONObject edge2 = new JSONObject();
				edge2.put("id", "edge_4");
				edge2.put("from", "2");
				edge2.put("to", "4");
				edge2.put("name", "connection 5");

				JSONObject edge3 = new JSONObject();
				edge3.put("id", "edge_5");
				edge3.put("from", "3");
				edge3.put("to", "4");
				edge3.put("name", "connection 6");

				edges.put(edge);
				edges.put(edge2);
				edges.put(edge3);
				model.put("nodes", nodes);
				model.put("edges", edges);

				getState().setModel(model);
			}
		});
	}
}