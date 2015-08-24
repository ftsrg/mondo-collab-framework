package eu.mondo.collaboration.online.client.modelcontroller;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.vaadin.annotations.JavaScript;
import com.vaadin.annotations.StyleSheet;
import com.vaadin.ui.AbstractJavaScriptComponent;
import com.vaadin.ui.JavaScriptFunction;

import eu.mondo.collaboration.online.client.application.CollaborationPage;


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
	
	private Deque<ExecutedOperation> undoStack = new ArrayDeque<ExecutedOperation>(50);
	private Deque<ExecutedOperation> redoStack = new ArrayDeque<ExecutedOperation>(50);
	
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

	public void setPositions(JSONObject positions) {
		System.out.println("updating positions...");
		getState().modelDisplayIsInitialized = true;
		getState().positions = positions;
	}
	
	public JSONObject getModel() {
		return getState().model;
	}

	@Override
	protected SharedState getState() {
		return (SharedState) super.getState();
	}
	
	public void setModelDisplayIsInitialized(boolean value) {
		getState().modelDisplayIsInitialized = value;
	}
	
	private void publishModel(JSONObject newModel) {
		this.ownerPage.publishModel(newModel);
	}

	private void publishPositions(JSONObject newPositions) {
		this.ownerPage.publishPositions(newPositions);
	}
	
	private JSONObject updateNode(JSONObject original, JSONObject edited) {
		String[] props = JSONObject.getNames(edited);
		try {
			for(String prop: props) {
				original.put(prop, edited.get(prop));
			} 
			return original;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public CollaborationComponent(CollaborationPage page) {
		// initModelController(this);
		this.ownerPage = page;
		
		addFunction("addElement", new JavaScriptFunction() {
			@Override
			public void call(JSONArray arguments) throws JSONException {
				JSONObject element = arguments.getJSONObject(0);
				addElement(element, true);
				element.put("type", "add");
				publishModification(element);
			}
		});
		
		addFunction("editElement", new JavaScriptFunction() {
			@Override
			public void call(JSONArray arguments) throws JSONException {
				JSONObject elements = arguments.getJSONObject(0);
				editElement(elements, true);
				elements.put("type", "edit");
				publishModification(elements);
			}
		});
		
		// deletes nodes and subnodes
		addFunction("deleteElement", new JavaScriptFunction() {
			@Override
			public void call(JSONArray arguments) throws JSONException {
				JSONObject data = arguments.getJSONObject(0);
				JSONObject nodeToDelete = data.getJSONObject("node");
				deleteElement(nodeToDelete, true);
				nodeToDelete.put("type", "delete");
				publishModification(nodeToDelete);
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
		
		addFunction("publishPositions", new JavaScriptFunction() {
			@Override
			public void call(JSONArray arguments) throws JSONException {
				JSONObject positions = arguments.getJSONObject(0);
				getState().setPositions(positions);
				getState().modelDisplayIsInitialized = true;
				publishPositions(positions);
			}
		});
		
		addFunction("moveNode", new JavaScriptFunction() {
			@Override
			public void call(JSONArray arguments) throws JSONException {
				JSONObject nodeData = arguments.getJSONObject(0);
				moveNode(nodeData, true);
				nodeData.put("type", "move");
				publishModification(nodeData);
			}
		});
	}	
	
	private void publishModification(JSONObject data) {
		this.ownerPage.publishModification(data);
	}
	
	public void addElement(JSONObject element, boolean saveOperation) throws JSONException {
		System.out.println("Adding element - " + element.toString());
		JSONObject newPosition = new JSONObject();
		newPosition.put("x", element.get("x"));
		newPosition.put("y", element.get("y"));
		JSONObject nodePositionData = new JSONObject();
		nodePositionData.put("node", element.get("name"));
		nodePositionData.put("newPosition", newPosition);
		element.remove("x");
		element.remove("y");
		JSONObject newModel = getState().model;
		System.out.println("add: " + element.toString());
		System.out.println("Model: " + newModel);
		// if root's child
		if(!element.has("parentId") || element.getString("parentId").equals("")) {
			// if no children with this type
			newModel = connectElementToRootNode(newModel, element);
		} else {
			newModel = tryToInsertIntoSubtree(newModel, element);
		}
		
		if(saveOperation) {
			ExecutedOperation op = new ExecutedOperation();
			op.setNewValue(element);
			op.setOperation("addElement");
			undoStack.push(op);
			printUndoStack();
		}
		
		getState().setModel(newModel);
		moveNode(nodePositionData, false);
	}
	
	public void editElement(JSONObject elements, boolean saveOperation) throws JSONException {
		JSONObject original = elements.getJSONObject("original");
		JSONObject edited = preserveUnmodifableAttributes(original, elements.getJSONObject("edited"));
		JSONObject newModel = getState().model;
//		setParentIdInChildren(edited, edited.getString("id"));
		newModel = tryToUpdateSubtree(newModel, original, edited);
		// alter set of positions as well
		if(!original.getString("id").equals(edited.getString("id"))) {
			renamePositionId(original, edited);
		}
		if(saveOperation) {
			ExecutedOperation op = new ExecutedOperation();
			op.setOldValue(original);
			op.setNewValue(edited);
			op.setOperation("editElement");
			undoStack.push(op);
			printUndoStack();
		}
		getState().setModel(newModel);
	}
	
	private JSONObject preserveUnmodifableAttributes(JSONObject original,
			JSONObject edited) {
		JSONObject tmp = new JSONObject();
		try {
			String[] properties = JSONObject.getNames(edited);
			for(String prop : properties) {
				tmp.put(prop, edited.get(prop));
			}
			properties = JSONObject.getNames(original);
			for(String prop : properties) {
				if(!tmp.has(prop)) {
					tmp.put(prop, original.get(prop));
				}
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return tmp;
	}

	private void renamePositionId(JSONObject original, JSONObject edited) {
		try {
			JSONObject pos = getState().positions.getJSONObject(original.getString("id"));
			getState().positions.remove(original.getString("id"));
			getState().positions.put(edited.getString("id"), pos);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	public void deleteElement(JSONObject nodeToDelete, boolean saveOperation) throws JSONException {
		// TODO validate action
		JSONObject newModel = getState().model;
		newModel = tryToDeleteInSubtree(newModel, nodeToDelete);
		if(saveOperation) {
			ExecutedOperation op = new ExecutedOperation();
			op.setOldValue(nodeToDelete);
			op.setOperation("deleteElement");
			undoStack.push(op);
			printUndoStack();
		}
		
		getState().setModel(newModel);
	}
	
	public void moveNode(JSONObject nodeData, boolean saveOperation) {
		System.out.println("alter node position - " + nodeData.toString());
		System.out.println("node positions: " + getState().positions.toString());
		try {
			if(saveOperation) {
				// the key is the id of the node
				JSONObject oldPositionData = new JSONObject();
				oldPositionData.put("node", nodeData.getString("node"));
				oldPositionData.put(
					"newPosition", 
					getState().positions.getJSONObject(nodeData.getString("node"))
				);
				JSONObject newPositionData = new JSONObject();
				newPositionData.put("node", nodeData.getString("node"));
				newPositionData.put(
					"newPosition", 
					nodeData.getJSONObject("newPosition")
				);
				ExecutedOperation op = new ExecutedOperation();	
				op.setOldValue(oldPositionData);
				op.setNewValue(newPositionData);
				op.setOperation("moveElement");
				undoStack.push(op);
//				System.out.println("Print undo stack");
				printUndoStack();
			}
			getState().positions.put(
				nodeData.getString("node"), 
				nodeData.getJSONObject("newPosition")
			);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void undo() {
		if(undoStack.isEmpty()) {
			return;
		}
		ExecutedOperation operationToUndo = undoStack.pop();
		try {
			JSONObject modificationData = null;
			switch(operationToUndo.getOperation()) {
				case "addElement":
					modificationData = operationToUndo.getNewValue();
					deleteElement(modificationData, false);
					modificationData.put("type", "delete");
					break;
				case "editElement":
					// reverse
					JSONObject elements = new JSONObject();
					elements.put("original", operationToUndo.getNewValue());
					elements.put("edited", operationToUndo.getOldValue());
					editElement(elements, false);
					modificationData = elements;
					modificationData.put("type", "edit");
					break;
				case "deleteElement":
					modificationData = operationToUndo.getOldValue();
					addElement(modificationData, false);
					modificationData.put("type", "add");
					break;
				case "moveElement":
					modificationData = operationToUndo.getOldValue();
					moveNode(modificationData, false);
					modificationData.put("type", "move");
					break;
			}
			if(modificationData != null) {
				publishModification(modificationData);
			}
			System.out.println("Undoing: " + " op: " + operationToUndo.getOperation() + " | oldVal: " + operationToUndo.getOldValue() + 
					" | new: " + operationToUndo.getNewValue());
			redoStack.push(operationToUndo);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void redo() {
		if(redoStack.isEmpty()) {
			return;
		}
		ExecutedOperation operationToRedo = redoStack.pop();
		try {
			JSONObject modificationData = null;
			switch(operationToRedo.getOperation()) {
				case "addElement":
					modificationData = operationToRedo.getNewValue();
					addElement(modificationData, false);
					modificationData.put("type", "add");
					break;
				case "editElement":
					// reverse
					JSONObject elements = new JSONObject();
					elements.put("original", operationToRedo.getOldValue());
					elements.put("edited", operationToRedo.getNewValue());
					editElement(elements, false);
					modificationData = elements;
					modificationData.put("type", "edit");
					break;
				case "deleteElement":
					deleteElement(operationToRedo.getOldValue(), false);
					modificationData = operationToRedo.getOldValue();
					modificationData.put("type", "delete");
					break;
				case "moveElement":
					moveNode(operationToRedo.getNewValue(), false);
					modificationData = operationToRedo.getNewValue();
					modificationData.put("type", "move");
					break;
			}
			if(modificationData != null) {
				publishModification(modificationData);
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Redoing: " + " op: " + operationToRedo.getOperation() + " | oldVal: " + operationToRedo.getOldValue() + 
				" | new: " + operationToRedo.getNewValue());
		undoStack.push(operationToRedo);
	}
	
	private void printUndoStack() {
		for(ExecutedOperation cur : undoStack) {
			System.out.println("OP: " + cur.getOperation() + " |Old: " + cur.getOldValue() + " |new: " + cur.getNewValue());
		}
	}

	public void setModelTransferComplete(boolean value) {
		getState().modelTransferIsComplete = true;
	}
	
	public void clearUndoRedoStacks() {
		this.undoStack.clear();
		this.redoStack.clear();
	}

	public void modifyModel(JSONObject modificationData) {
		try {
			String type = modificationData.getString("type");
			System.out.println("executing operation: " + type + " on client.");
			switch(type) {
				case "add":
					this.addElement(modificationData, false);
					break;
				case "edit":
					this.editElement(modificationData, false);
					break;
				case "delete":
					this.deleteElement(modificationData, false);
					break;
				case "move":
					this.moveNode(modificationData, false);
					break;
				default:
					System.out.println("Unknown operation: " + type);
					break;
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	private List<String> getSubtreeIdentifiers(JSONObject object) {
		List<String> subtreeIdentifiers = new ArrayList<String>();
		String[] names = JSONObject.getNames(object);
		for(String name: names) {
			Object property;
			try {
				property = object.get(name);
				if(property instanceof JSONArray) {
					subtreeIdentifiers.add(name);
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return subtreeIdentifiers;
	}
	
	private JSONObject connectElementToRootNode(JSONObject node, JSONObject element) {
		try {
			String type = element.getString("type");
			String typeSetName = element.getString("type");
			JSONObject newElement =  new JSONObject();
			
			// TODO set additional EMF properties
			newElement.put("name", element.getString("name"));
			
			if(!node.has(typeSetName)) {
				JSONArray newType = new JSONArray();
				newType.put(newElement);
				node.put(typeSetName, newType);
			} else {
				node.getJSONArray(typeSetName).put(newElement);
			}
			
			return node;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private JSONObject tryToInsertIntoSubtree(JSONObject node, JSONObject element) {
		List<String> subtreeIdentifiers = getSubtreeIdentifiers(node);
		for(String identifier: subtreeIdentifiers) {
			try {
				JSONArray subtree = node.getJSONArray(identifier);
				for(int i = 0; i < subtree.length(); i++) {
					JSONObject currentNode = subtree.getJSONObject(i);
					boolean success = false;
					if(currentNode.getString("id").equals(element.getString("parentId"))) {
						currentNode = connectElementToRootNode(currentNode, element);
						node.getJSONArray(identifier).put(i, currentNode);
						success = true;
					} else {
						currentNode = tryToInsertIntoSubtree(currentNode, element);
						if(currentNode != null) {
							success = true;
						}
					}
					if(success) {
						return node;
					}
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	private JSONObject tryToUpdateSubtree(JSONObject node, JSONObject original, JSONObject edited) {
		List<String> subtreeIdentifiers = getSubtreeIdentifiers(node);
		for(String identifier: subtreeIdentifiers) {
			try {
				JSONArray subtree = node.getJSONArray(identifier);
				for(int i = 0; i < subtree.length(); i++) {
					JSONObject currentNode = subtree.getJSONObject(i);
					boolean success = false;
					if(currentNode.getString("id").equals(original.getString("id"))) {
						currentNode = updateNode(currentNode, edited);
						node.getJSONArray(identifier).put(i, currentNode);
						success = true;
					} else {
						currentNode = tryToUpdateSubtree(currentNode, original, edited);
						if(currentNode != null) {
							success = true;
						}
					}
					if(success) {
						return node;
					}
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	private JSONObject tryToDeleteInSubtree(JSONObject node, JSONObject nodeToDelete) {
		List<String> subtreeIdentifiers = getSubtreeIdentifiers(node);
		for(String identifier: subtreeIdentifiers) {
			try {
				JSONArray subtree = node.getJSONArray(identifier);
				for(int i = 0; i < subtree.length(); i++) {
					JSONObject currentNode = subtree.getJSONObject(i);
					boolean success = false;
					if(currentNode.getString("name").equals(nodeToDelete.getString("name"))) {
						JSONArray newSubtree = removeItemFromJsonArray(subtree, i);
						node.put(identifier, newSubtree);
						success = true;
					} else {
						currentNode = tryToDeleteInSubtree(currentNode, nodeToDelete);
						if(currentNode != null) {
							success = true;
						}
					}
					if(success) {
						return node;
					}
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
//	
//	private void setParentIdInChildren(JSONObject node, String parentId) {
//		String[] identifiers = JSONObject.getNames(node);
//		try {
//			for(String identifier : identifiers) {
//				JSONArray children = node.optJSONArray(identifier);
//				if(children != null) {
//					
//						for(int i = 0; i < children.length(); i++) {
//							children.getJSONObject(i).put("parentId", parentId);
//						}
//					node.put(identifier, children);
//				}
//			}
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	private JSONArray removeItemFromJsonArray(JSONArray array, int index) {
		JSONArray newArray = new JSONArray();
		try {
			for(int i = 0; i < array.length(); i++) {
				if(i != index) {
					newArray.put(array.get(i));
				} 
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newArray;
	}
}