package eu.mondo.collaboration.online.server;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ModelModifier {

	private static List<String> basicElements = new ArrayList<String>();
	
	private static boolean initialized = false;
	
	public static JSONObject modifyModel(JSONObject model, JSONObject positions, JSONObject modificationData) {
		if(!initialized) {
			basicElements.add("outputs");
			basicElements.add("inputs");
			basicElements.add("params");
			initialized = true;
		}
		
		JSONObject results = null; 
		try {
			String type = modificationData.getString("modificationType");
			System.out.println("Executing modification on server: " + type);
			System.out.println("on " + modificationData.toString());
			switch(type) {
				case "addNode":
					results = addNode(modificationData, model, positions);
					break;
				case "edit":
					results = editNode(modificationData, model, positions);
					break;
				case "delete":
					results = deleteNode(modificationData, model);
					break;
				case "move":
					results = moveNode(modificationData, positions);
					break;
				case "addEdge":
					results = addEdge(modificationData, model, positions);
					break;
				default:
					System.out.println("Unknown modification type: " + type);
					break;	
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		System.out.println("Modification results: " + results.toString());
		return results;
	}
	
	private static JSONObject addNode(JSONObject element, JSONObject model, JSONObject positions) throws JSONException {
		JSONObject newPosition = new JSONObject();
		newPosition.put("x", element.get("x"));
		newPosition.put("y", element.get("y"));
		JSONObject nodePositionData = new JSONObject();
		nodePositionData.put("node", element.get("id"));
		nodePositionData.put("newPosition", newPosition);
		JSONObject newModel = model;
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
		if(wtctrlsToRestore != null) {
			newModel = updateWtctrlsReferences(element, newModel, "add", wtctrlsToRestore, model);
		}
		JSONObject moveResult = moveNode(nodePositionData, positions);
		JSONObject result = new JSONObject();
		result.put("model", newModel);
		result.put("positions", moveResult.getJSONObject("positions"));
		return result;
	}
	
	private static JSONObject editNode(JSONObject elements, JSONObject model, JSONObject positions) throws JSONException {
		JSONObject original = elements.getJSONObject("original");
		JSONObject edited = elements.getJSONObject("edited");
		JSONObject newModel = model;
		newModel = tryToUpdateSubtree(newModel, original, edited);
		// alter set of positions as well
		JSONObject newPositions = null;
		if(!original.getString("id").equals(edited.getString("id"))) {
			newPositions = renamePositionId(original, edited, positions);
		} else {
			newPositions = positions;
		}
		JSONObject result = new JSONObject();
		result.put("model", newModel);
		result.put("positions", newPositions);
		return result;
	}
	
	private static JSONObject deleteNode(JSONObject nodeToDelete, JSONObject model) throws JSONException {
		// TODO validate action
		JSONObject newModel = model;
		newModel = tryToDeleteInSubtree(newModel, nodeToDelete);
		boolean isBasic = basicElements.contains(nodeToDelete.getString("nodeType"));
		if(isBasic) {
			JSONArray nothing = new JSONArray();
			newModel = updateWtctrlsReferences(nodeToDelete, newModel, "delete", nothing, model);
		}
		JSONObject results = new JSONObject();
		results.put("model", newModel);
		results.put("positions", "none");
		return results;
	}
	
	private static JSONObject moveNode(JSONObject nodeData, JSONObject positions) {
		JSONObject results = new JSONObject();
		try {
			positions.put(
				nodeData.getString("node"), 
				nodeData.getJSONObject("newPosition")
			);
			results.put("model", "none");
			results.put("positions", positions);
			System.out.println("new positions on server: " + positions.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return results;
	}
	
	public static JSONObject addEdge(JSONObject newEdgeData, JSONObject model, JSONObject positions) {
		System.out.println("New edge: " + newEdgeData.toString());
		
		try {
			JSONObject sourceNode = newEdgeData.getJSONObject("sourceNode");
			JSONObject targetNode = newEdgeData.getJSONObject("targetNode");
			// basic element to wtctrl
			if((basicElements.contains(sourceNode.getString("nodeType")) 
			&& targetNode.getString("nodeType").equals("wtctrls"))) {
				System.out.println("basic element to wtctrl");
				addReferenceToWtctrl(targetNode, sourceNode, model, positions);
			} else 
			// wtctrl to basic element or subsystem
			if(sourceNode.getString("nodeType").equals("wtctrls")
			&& basicElements.contains(targetNode.getString("nodeType"))) {
				System.out.println("wtctrl to basic element");
				addReferenceToWtctrl(sourceNode, targetNode, model, positions);
			} else 
			// wtctrl to subsystem
			if(sourceNode.getString("nodeType").equals("wtctrls")
			&& targetNode.getString("nodeType").equals("subsystems")) {
				System.out.println("wtctrl to subsystem");
				connectAsChildAndParent(sourceNode, targetNode, model, positions);
			} else 
			// subsystem to wtrctrl
			if(sourceNode.getString("nodeType").equals("subsystems")
			&& targetNode.getString("nodeType").equals("wtctrls")) {
				System.out.println("subsystem to wtctrl");
				connectAsChildAndParent(targetNode, sourceNode, model, positions);
			} else
			// subsystem to subsystem or wtctrl
			if(sourceNode.getString("nodeType").equals("subsystems")
			&& targetNode.getString("nodeType").equals("subsystems")) {
				System.out.println("subsystem to subsystems");
				connectAsChildAndParent(targetNode, sourceNode, model, positions);
			} 
			
			JSONObject results = new JSONObject();
			results.put("model", model);
			results.put("positions", positions);
			return results;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private static void addReferenceToWtctrl(JSONObject wtctrl, JSONObject referencedObject, JSONObject model, JSONObject positions) {
		try {
			deleteNode(wtctrl, model);
			
			String refObjectType = referencedObject.getString("nodeType");
			String referenceString = "//@" + refObjectType + "." + referencedObject.getString("indexOfReferencedObject");
			JSONObject ref = new JSONObject();
			ref.put("$ref", referenceString);
			wtctrl.put(refObjectType.substring(0, refObjectType.length() - 1), ref);
			
			JSONObject pos = positions.getJSONObject(wtctrl.getString("id"));
			wtctrl.put("x", pos.getInt("x"));
			wtctrl.put("y", pos.getInt("y"));
			
			addNode(wtctrl, model, positions);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void connectAsChildAndParent(JSONObject child, JSONObject parent, 
			JSONObject model, JSONObject positions) throws JSONException {
		deleteNode(child, model);
		
		child.put("parentId", parent.getString("id"));
		
		JSONObject pos = positions.getJSONObject(child.getString("id"));
		child.put("x", pos.getInt("x"));
		child.put("y", pos.getInt("y"));
		addNode(child, model, positions);
	}
	
	private static JSONObject renamePositionId(JSONObject original, JSONObject edited, JSONObject positions) {
		try {
			if(positions.has(original.getString("id"))) {
				positions.put(original.getString("id"), edited.getString("id"));
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return positions;
	}

	private static List<String> getSubtreeIdentifiers(JSONObject object) {
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
	
	private static JSONObject connectElementToRootNode(JSONObject node, JSONObject element) {
		try {
			String typeSetName = element.getString("nodeType");
			JSONObject newElement =  new JSONObject();
			
			// TODO set additional EMF properties
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
	
	private static JSONObject tryToInsertIntoSubtree(JSONObject node, JSONObject element) {
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
	
	private static JSONObject tryToUpdateSubtree(JSONObject node, JSONObject original, JSONObject edited) {
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
	
	private static JSONObject tryToDeleteInSubtree(JSONObject node, JSONObject nodeToDelete) {
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
	private static JSONObject updateWtctrlsReferences(JSONObject object, JSONObject subModel, String operation, JSONArray wtctrlsToRestore, JSONObject wholeModel) {
		try {
			int indexOfReferredObject = Integer.parseInt(object.getString("indexOfReferencedObject"));
			String type = object.getString("nodeType");
			type = type.substring(0, type.length() - 1);
			JSONObject updatedModel = new JSONObject(subModel.toString());
			
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
							}/* else if(operation.equals("add")) {
								int newIndex = referencedIndex + 1;
								if(referencedIndex == indexOfReferredObject) {
									String replacement = stringToCheck.replaceAll(
										stringToCheck.substring(stringToCheck.indexOf(".") + 1), 
										newIndex + ""
									);
									wtctrls.getJSONObject(i).getJSONObject(type).put("$ref", replacement);
								} 
							}*/
						} else if(operation.equals("add")) {
							JSONObject wtctrlToRestore = getWtctrlById(
								wtctrlsToRestore, 
								wtctrls.getJSONObject(i).getString("id")
							);
							if(wtctrlToRestore != null) {
								int newIndex = getNumberOfElements(type + "s", wholeModel) - 1;
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
							wtctrlsToRestore,
							wholeModel
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
		return subModel;
	}
	
	private static JSONObject getWtctrlById(JSONArray wtctrlsToRestore, String id) {
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
	
	private static JSONArray removeItemFromJsonArray(JSONArray array, int index) {
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
	
	private static JSONObject updateNode(JSONObject original, JSONObject edited) {
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
	
	
	private static void copyWTSpecificProperties(JSONObject from, JSONObject to) {
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
	
	private static int getNumberOfElements(String typeName, JSONObject model) {
		int num = 0;
		try {
			if(model.has(typeName)) {
				num = model.getJSONArray(typeName).length();
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return num;
	}
	
	private static List<String> getWTSpecificProperties(String type) {
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
