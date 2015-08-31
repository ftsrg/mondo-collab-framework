package org.mondo.collaboration.online.client.modelcontroller;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.mondo.collaboration.online.client.application.CollaborationPage;

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
	 
	private final CollaborationPage ownerPage;
	
	private Deque<ExecutedOperation> undoStack = new ArrayDeque<ExecutedOperation>(50);
	private Deque<ExecutedOperation> redoStack = new ArrayDeque<ExecutedOperation>(50);
	
	public interface ValueChangeListener extends Serializable {
		void valueChange();
	}

	ArrayList<ValueChangeListener> listeners = new ArrayList<ValueChangeListener>();

	// WTSpec4M40 metamodel specific
	
	List<String> basicElements = new ArrayList<String>();
	
	// ---------
	
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

		this.basicElements.add("outputs");
		this.basicElements.add("inputs");
		this.basicElements.add("params");
		
		addFunction("addElement", new JavaScriptFunction() {
			@Override
			public void call(JSONArray arguments) throws JSONException {
				JSONObject element = arguments.getJSONObject(0);
				element.put("modificationType", "addNode");
				publishModification(element);
				element.remove("modificationType");
				addElement(element, true);
			}
		});
		
		addFunction("editElement", new JavaScriptFunction() {
			@Override
			public void call(JSONArray arguments) throws JSONException {
				JSONObject elements = arguments.getJSONObject(0);
				editElement(elements, true);
				elements.put("modificationType", "edit");
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
				nodeToDelete.put("modificationType", "delete");
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
				nodeData.put("modificationType", "move");
				publishModification(nodeData);
			}
		});
		
		addFunction("addEdge", new JavaScriptFunction() {
			@Override
			public void call(JSONArray arguments) throws JSONException {
				JSONObject newEdgeData = arguments.getJSONObject(0);
				addEdge(newEdgeData, true);
				newEdgeData.put("modificationType", "addEdge");
				publishModification(newEdgeData);
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
		nodePositionData.put("node", element.get("id"));
		nodePositionData.put("newPosition", newPosition);
		JSONObject newModel = getState().model;
		System.out.println("add: " + element.toString());
		System.out.println("Model: " + newModel);
		JSONArray wtctrlsToRestore = null;
		if(element.has("wtctrlsToRestore")) {
			wtctrlsToRestore = element.getJSONArray("wtctrlsToRestore");
			element.remove("wtctrlsToRestore");
		}
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
		if(wtctrlsToRestore != null) {
			newModel = updateWtctrlsReferences(element, newModel, "add", wtctrlsToRestore);
		}
		getState().setModel(newModel);
		if(wtctrlsToRestore != null) {
			element.put("wtctrlsToRestore", wtctrlsToRestore);
		}
		
		moveNode(nodePositionData, false);
	}
	
	public void editElement(JSONObject elements, boolean saveOperation) throws JSONException {
		JSONObject original = elements.getJSONObject("original");
		JSONObject edited = preserveUnmodifableAttributes(original, elements.getJSONObject("edited"));
		JSONObject newModel = getState().model;

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
		boolean isBasic = this.basicElements.contains(nodeToDelete.getString("nodeType"));
		JSONArray wtctrlsToRestore = new JSONArray();
		if(isBasic) {
			newModel = updateWtctrlsReferences(nodeToDelete, newModel, "delete", wtctrlsToRestore);
		}
		if(saveOperation) {
			ExecutedOperation op = new ExecutedOperation();
			op.setOldValue(nodeToDelete);
			op.setOperation("deleteElement");
			if(isBasic) {
				op.setNote("reference");
				op.setAdditionalData(wtctrlsToRestore);
			}
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
	
	public boolean addEdge(JSONObject newEdgeData, boolean saveOperation) {
		System.out.println("New edge: " + newEdgeData.toString());
		
		try {
			JSONObject sourceNode = newEdgeData.getJSONObject("sourceNode");
			JSONObject targetNode = newEdgeData.getJSONObject("targetNode");

			ExecutedOperation op = new ExecutedOperation();	
			
			// basic element to wtctrl
			if((this.basicElements.contains(sourceNode.getString("nodeType")) 
			&& targetNode.getString("nodeType").equals("wtctrls"))) {
				System.out.println("basic element to wtctrl");
				op.setOldValue(targetNode);
				addReferenceToWtctrl(targetNode, sourceNode);
				JSONObject newData = new JSONObject();
				newData.put("child", targetNode);
				newData.put("parent", sourceNode);
				op.setNewValue(newData);
				op.setNote("reference");
			} else 
			// wtctrl to basic element or subsystem
			if(sourceNode.getString("nodeType").equals("wtctrls")
			&& this.basicElements.contains(targetNode.getString("nodeType"))) {
				System.out.println("wtctrl to basic element");
				op.setOldValue(sourceNode);
				addReferenceToWtctrl(sourceNode, targetNode);
				JSONObject newData = new JSONObject();
				newData.put("child", sourceNode);
				newData.put("parent", targetNode);
				op.setNewValue(newData);
				op.setNote("reference");
			} else 
			// wtctrl to subsystem
			if(sourceNode.getString("nodeType").equals("wtctrls")
			&& targetNode.getString("nodeType").equals("subsystems")) {
				System.out.println("wtctrl to subsystem");
				op.setOldValue(sourceNode);
				connectAsChildAndParent(sourceNode, targetNode);
				JSONObject newData = new JSONObject();
				newData.put("child", sourceNode);
				newData.put("parent", targetNode);
				op.setNewValue(newData);
				op.setNote("subsystem");
			} else 
			// subsystem to wtrctrl
			if(sourceNode.getString("nodeType").equals("subsystems")
			&& targetNode.getString("nodeType").equals("wtctrls")) {
				System.out.println("subsystem to wtctrl");
				op.setOldValue(targetNode);
				connectAsChildAndParent(targetNode, sourceNode);
				JSONObject newData = new JSONObject();
				newData.put("child", targetNode);
				newData.put("parent", sourceNode);
				op.setNewValue(newData);
				op.setNote("subsystem");
			} else
			// subsystem to subsystem (the source will be the parent)
			if(sourceNode.getString("nodeType").equals("subsystems")
			&& targetNode.getString("nodeType").equals("subsystems")) {
				System.out.println("subsystem to subsystems");
				op.setOldValue(targetNode);
				connectAsChildAndParent(targetNode, sourceNode);
				JSONObject newData = new JSONObject();
				newData.put("child", targetNode);
				newData.put("parent", sourceNode);
				op.setNewValue(newData);
				op.setNote("subsystem");
			} else {
				return false;
			}
			if(saveOperation) {
				op.setOperation("addEdge");
				undoStack.push(op);
				printUndoStack();
			}
			return true;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	private void addReferenceToWtctrl(JSONObject wtctrl, JSONObject referencedObject) {
		try {
			deleteElement(wtctrl, false);
			
			String refObjectType = referencedObject.getString("nodeType");
			String referenceString = "//@" + refObjectType + "." + referencedObject.getString("indexOfReferencedObject");
			JSONObject ref = new JSONObject();
			ref.put("$ref", referenceString);
			wtctrl.put(refObjectType.substring(0, refObjectType.length() - 1), ref);
			
			JSONObject pos = getState().positions.getJSONObject(wtctrl.getString("id"));
			wtctrl.put("x", pos.getInt("x"));
			wtctrl.put("y", pos.getInt("y"));
			addElement(wtctrl, false);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void connectAsChildAndParent(JSONObject child, JSONObject parent) throws JSONException {
		deleteElement(child, false);
		
		child.put("parentId", parent.getString("id"));
		
		JSONObject pos = getState().positions.getJSONObject(child.getString("id"));
		child.put("x", pos.getInt("x"));
		child.put("y", pos.getInt("y"));
		
		addElement(child, false);
	}

	public void undo() {
		if(undoStack.isEmpty()) {
			return;
		}
		ExecutedOperation operationToUndo = undoStack.pop();
		System.out.println("Undoing: " + " op: " + operationToUndo.getOperation() + " | oldVal: " + operationToUndo.getOldValue() + 
				" | new: " + operationToUndo.getNewValue());
		try {
			JSONObject modificationData = null;
			switch(operationToUndo.getOperation()) {
				case "addElement":
					modificationData = operationToUndo.getNewValue();
					deleteElement(modificationData, false);
					modificationData.put("modificationType", "delete");
					break;
				case "editElement":
					// reverse
					JSONObject elements = new JSONObject();
					elements.put("original", operationToUndo.getNewValue());
					elements.put("edited", operationToUndo.getOldValue());
					editElement(elements, false);
					modificationData = elements;
					modificationData.put("modificationType", "edit");
					break;
				case "deleteElement":
					modificationData = operationToUndo.getOldValue();
					if(operationToUndo.getNote().equals("reference")) {
						modificationData.put("wtctrlsToRestore", operationToUndo.getAdditionalData());
						JSONObject pos = getState().positions.getJSONObject(modificationData.getString("id"));
						modificationData.put("x", pos.getInt("x"));
						modificationData.put("y", pos.getInt("y"));
					}
					addElement(modificationData, false);
					modificationData.put("modificationType", "addNode");
					break;
				case "moveElement":
					modificationData = operationToUndo.getOldValue();
					moveNode(modificationData, false);
					modificationData.put("modificationType", "move");
					break;
				case "addEdge":
					JSONObject newData = operationToUndo.getNewValue();
					JSONObject oldValue = operationToUndo.getOldValue();
					if(operationToUndo.getNote().equals("reference")) {
						JSONObject newValue = newData.getJSONObject("child");
						JSONObject _elements = new JSONObject();
						_elements.put("original", newValue);
						_elements.put("edited", oldValue);
						editElement(_elements, false);
						modificationData = _elements;
						modificationData.put("modificationType", "edit");
					} else if(operationToUndo.getNote().equals("subsystem")) {
						JSONObject nodeToReset = newData.getJSONObject("child"); 
						deleteElement(nodeToReset, false);
						nodeToReset.put("modificationType", "delete");
						publishModification(nodeToReset);
						
						modificationData = operationToUndo.getOldValue();
						JSONObject pos = getState().positions.getJSONObject(modificationData.getString("id"));
						modificationData.put("x", pos.getInt("x"));
						modificationData.put("y", pos.getInt("y"));
						addElement(modificationData, false);
						modificationData.put("modificationType", "addNode");
					}
					break;
			}
			if(modificationData != null) {
				publishModification(modificationData);
			}
			
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
					modificationData.put("modificationType", "addNode");
					break;
				case "editElement":
					// reverse
					JSONObject elements = new JSONObject();
					elements.put("original", operationToRedo.getOldValue());
					elements.put("edited", operationToRedo.getNewValue());
					editElement(elements, false);
					modificationData = elements;
					modificationData.put("modificationType", "edit");
					break;
				case "deleteElement":
					deleteElement(operationToRedo.getOldValue(), false);
					modificationData = operationToRedo.getOldValue();
					modificationData.put("modificationType", "delete");
					break;
				case "moveElement":
					moveNode(operationToRedo.getNewValue(), false);
					modificationData = operationToRedo.getNewValue();
					modificationData.put("modificationType", "move");
					break;
				case "addEdge":
					JSONObject newData = operationToRedo.getNewValue();
					JSONObject newEdgeData = new JSONObject();
					newEdgeData.put("sourceNode", newData.getJSONObject("parent"));
					newEdgeData.put("targetNode", newData.getJSONObject("child"));
					addEdge(newEdgeData, false);
					modificationData = newEdgeData;
					modificationData.put("modificationType", "addEdge");
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
			String type = modificationData.getString("modificationType");
			System.out.println("executing operation: " + type + " on client.");
			switch(type) {
				case "addNode":
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
				case "addEdge":
					this.addEdge(modificationData, false);
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
			String typeSetName = element.getString("nodeType");
			JSONObject newElement =  new JSONObject();
			
			copyWTSpecificProperties(element, newElement);
			
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
					if(currentNode.getString("id").equals(nodeToDelete.getString("id"))) {
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

	// updates wtctrls that reference the object of type input/output/param
	// and all those that reference an object of the same type with a higher index
	private JSONObject updateWtctrlsReferences(JSONObject object, JSONObject model, String operation, JSONArray wtctrlsToRestore) {
		try {
			int indexOfReferredObject = Integer.parseInt(object.getString("indexOfReferencedObject"));
			String type = object.getString("nodeType");
			type = type.substring(0, type.length() - 1);
			JSONObject updatedModel = new JSONObject(model.toString());
			
			for(String attr : JSONObject.getNames(updatedModel)) {
				if(attr.equals("wtctrls")) {
					JSONArray wtctrls = updatedModel.getJSONArray(attr);
					for(int i = 0; i < wtctrls.length(); i++) {
						if(wtctrls.getJSONObject(i).has(type)) {
							String stringToCheck = wtctrls.getJSONObject(i).getJSONObject(type).getString("$ref");
							int referencedIndex = Integer.parseInt(stringToCheck.substring(stringToCheck.indexOf(".") + 1));
							if(operation.equals("delete")) {
								if(referencedIndex == indexOfReferredObject) {
									wtctrlsToRestore.put(new JSONObject(wtctrls.getJSONObject(i).toString()));
									wtctrls.getJSONObject(i).remove(type);
								} else if(referencedIndex > indexOfReferredObject) {
									int newIndex = referencedIndex - 1;
									String replacement = stringToCheck.replaceAll(
										stringToCheck.substring(stringToCheck.indexOf(".") + 1), 
										newIndex + ""
									);
									wtctrls.getJSONObject(i).getJSONObject(type).put("$ref", replacement);
								}
							} /*else if(operation.equals("add")) {
								int newIndex = referencedIndex + 1;
								if(referencedIndex == indexOfReferredObject) {
									String replacement = stringToCheck.replaceAll(
										stringToCheck.substring(stringToCheck.indexOf(".") + 1), 
										newIndex + ""
									);
									wtctrls.getJSONObject(i).getJSONObject(type).put("$ref", replacement);
								} 
							}*/
						} else if(operation.equals("add")){
							JSONObject wtctrlToRestore = getWtctrlById(
								wtctrlsToRestore, 
								wtctrls.getJSONObject(i).getString("id")
							);
							if(wtctrlToRestore != null) {
								int newIndex = getNumberOfElements(type + "s") - 1;
								String refString = "//@" + type + "s." + newIndex;
								JSONObject newRef = new JSONObject();
								newRef.put("$ref", refString);
								wtctrlToRestore.put(type, newRef);
								wtctrls.put(i, wtctrlToRestore);
							}
						}
					}
					updatedModel.put("wtctrls", wtctrls);
				} else if(attr.equals("subsystems")) {
					JSONArray subsystems = updatedModel.getJSONArray(attr);
					for(int i = 0; i < subsystems.length(); i++) {
						JSONObject updatedSubsys = updateWtctrlsReferences(
							object, 
							subsystems.getJSONObject(i), 
							operation, 
							wtctrlsToRestore
						);
						subsystems.put(i, updatedSubsys);
					}
					updatedModel.put("subsystems", subsystems);
				}
			}
			return updatedModel;
		} catch (NumberFormatException | JSONException e) {
			e.printStackTrace();
		} 
		return model;
	}
	
	private JSONObject getWtctrlById(JSONArray wtctrlsToRestore, String id) {
		try {
			for(int i = 0; i < wtctrlsToRestore.length(); i++) {
				JSONObject current = wtctrlsToRestore.getJSONObject(i);
				if(wtctrlsToRestore.getJSONObject(i).getString("id").equals(id)) {
					return current;
				}
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}

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
	
	private void copyWTSpecificProperties(JSONObject from, JSONObject to) {
		try {
			List<String> attributes = getWTSpecificProperties(from.getString("nodeType"));
			for(String attr : attributes) {
				if(from.has(attr)) {
					to.put(attr, from.get(attr));
				}
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	private int getNumberOfElements(String typeName) {
		int num = 0;
		try {
			if(getState().model.has(typeName)) {
				num = getState().model.getJSONArray(typeName).length();
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
	
	private List<String> getWTSpecificProperties(String type) {
		List<String> properties = new ArrayList<String>();
		properties.add("name");
		properties.add("id");
		switch(type) {
			case "subsystems": 
				properties.add("subsystems");
				properties.add("wtctrls");
				break;
			case "wtctrls": 
				properties.add("type");
				properties.add("cycle");
				properties.add("order");
				properties.add("enabled");
				properties.add("input");
				properties.add("output");
				properties.add("param");
				break;
			case "inputs": 
				break;
			case "outputs": 
				break;
			case "params": 
				properties.add("value");
				break;
			case "alarms": 
				properties.add("activated");
				break;
			default:
				properties.clear();
				break;	
		}
		return properties;
	}
}