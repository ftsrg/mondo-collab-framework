package eu.mondo.collaboration.online.client.modelcontroller;

import eu.mondo.collaboration.online.client.application.CollaborationPage;

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
	"app://VAADIN/client/visjs/vis.js",
	"app://VAADIN/client/jquery/jquery-2.1.0.min.js",
	"app://VAADIN/client/GraphicalSyntaxHandler.js",
	"collaboration-connector.js", "collaborationcomponent.js" 
})
@StyleSheet({ 
	"app://VAADIN/client/visjs/vis.css",
	"app://VAADIN/client/MondoOnline.css" 
})
public class CollaborationComponent extends AbstractJavaScriptComponent {
	private ModelController mc;
	 
	private final CollaborationPage ownerPage;
	
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
		System.out.println("updating model...");
		getState().setModel(model);
	}

	public JSONObject getModel() {
		return getState().model;
	}

	@Override
	protected SharedState getState() {
		return (SharedState) super.getState();
	}
	
	/*
	private void initModelController(CollaborationComponent cc) {
	}
	*/
	
	private void updateModel(JSONObject newModel) {
		this.ownerPage.publishModel(newModel);
	}
	
	public CollaborationComponent(CollaborationPage page) {
		// initModelController(this);
		this.ownerPage = page;
		
		addFunction("addElement", new JavaScriptFunction() {
			@Override
			public void call(JSONArray arguments) throws JSONException {
				JSONObject element = arguments.getJSONObject(0);
				// System.out.println("add: " + element.toString());
				String type = null; 
				if((int) element.get("elementType") == 1) {
					type = "nodes"; 
				} else if((int) element.get("elementType") == 2) {
					type = "edges";
				}
				// TODO validate action
				JSONObject newModel = getState().model;
				newModel.getJSONArray(type).put(element);
				getState().setModel(newModel);
				updateModel(newModel);
				// System.out.println("Model after add new: " + newModel.toString());
			}
		});
		
		addFunction("editElement", new JavaScriptFunction() {
			@Override
			public void call(JSONArray arguments) throws JSONException {
				JSONObject elements = arguments.getJSONObject(0);
				JSONObject original = elements.getJSONObject("original");
				String type = null; 
				// System.out.println("Original: " + original.toString());
				if((int) original.get("elementType") == 1) {
					type = "nodes"; 
				} else if((int) original.get("elementType") == 2) {
					type = "edges";
				}
				
				if(type == null) {
					System.out.println("Invalid element type (editELement).");
					return;
				}
				
				JSONObject edited = elements.getJSONObject("edited");
				// System.out.println("Edited: " + edited.toString());
				
				// TODO validate action
				JSONObject newModel = getState().model;
				// System.out.println("Model before edit: " + newModel.toString());
				JSONArray originalElements = getState().model.getJSONArray(type);
				for(int i = 0; i < originalElements.length(); i++) {
					JSONObject currentElement = originalElements.getJSONObject(i);
					if(currentElement.get("id").equals(original.get("id"))) {
						JSONArray newElements = originalElements;
						newElements.put(i, edited);
						newModel.put(type, newElements);
						getState().setModel(newModel);
						updateModel(newModel);
						// System.out.println("Model after edit: " + newModel.toString());
						break;
					}
				}
			}
		});
		
		// deletes nodes and edges
		addFunction("deleteElement", new JavaScriptFunction() {
			@Override
			public void call(JSONArray arguments) throws JSONException {
				JSONObject data = arguments.getJSONObject(0);
				String nodeId = data.getString("nodeId");
				JSONArray edgeIds = data.getJSONArray("edgeIds");
				// System.out.println("delete: " + data.toString());
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
				// System.out.println("Model after delete: " + newModel.toString());
				getState().setModel(newModel);
				updateModel(newModel);
			}
		});
		
		addFunction("loadModel", new JavaScriptFunction() {
			@Override
			public void call(JSONArray arguments) throws JSONException {
				if(getState().model != null) {
					getState().setModel(getState().model);
				}
			}
		});
	}
}