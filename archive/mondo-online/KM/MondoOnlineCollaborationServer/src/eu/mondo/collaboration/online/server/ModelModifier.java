package eu.mondo.collaboration.online.server;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ModelModifier {

	public static void addElement(JSONObject element, JSONObject model, JSONObject positions) throws JSONException {
		System.out.println("Adding element - " + element.toString());
		JSONObject newPosition = new JSONObject();
		newPosition.put("x", element.get("x"));
		newPosition.put("y", element.get("y"));
		JSONObject nodePositionData = new JSONObject();
		nodePositionData.put("node", element.get("name"));
		nodePositionData.put("newPosition", newPosition);
		element.remove("x");
		element.remove("y");
		JSONObject newModel = model;
		System.out.println("add: " + element.toString());
		System.out.println("Model: " + newModel);
		// if root's child
		if(!element.has("parentName") || element.getString("parentName").equals("")) {
			// if no children with this type
			newModel = connectElementToRootNode(newModel, element);
		} else {
			newModel = tryToInsertIntoSubtree(newModel, element);
		}
		
		JSONObject newPositions = alterNodePosition(nodePositionData, positions);
		JSONObject result = new JSONObject();
		result.put("model", newModel);
		result.put("positions", newPositions);
		// publishModel(newModel);
	}
	
	public static JSONObject editElement(JSONObject elements, JSONObject model, JSONObject positions) throws JSONException {
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
		result.put("positions", positions);
		return result;
	}
	
	private static JSONObject renamePositionId(JSONObject original, JSONObject edited, JSONObject positions) {
		try {
			if(positions.has(original.getString("id"))){
				positions.put(original.getString("id"), edited.getString("id"));
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return positions;
	}

	public static JSONObject deleteElement(JSONObject nodeToDelete, JSONObject model) throws JSONException {
		// TODO validate action
		JSONObject newModel = model;
		newModel = tryToDeleteInSubtree(newModel, nodeToDelete);
		return newModel;
	}
	
	public static JSONObject alterNodePosition(JSONObject nodeData, JSONObject positions) {
		System.out.println("alter node position - " + nodeData.toString());
		System.out.println("node positions: " + positions.toString());
		try {
			positions.put(
				nodeData.getString("node"), 
				nodeData.getJSONObject("newPosition")
			);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
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
	
	private static JSONObject tryToInsertIntoSubtree(JSONObject node, JSONObject element) {
		List<String> subtreeIdentifiers = getSubtreeIdentifiers(node);
		for(String identifier: subtreeIdentifiers) {
			try {
				JSONArray subtree = node.getJSONArray(identifier);
				for(int i = 0; i < subtree.length(); i++) {
					JSONObject currentNode = subtree.getJSONObject(i);
					boolean success = false;
					if(currentNode.getString("name").equals(element.getString("parentName"))) {
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
					if(currentNode.getString("name").equals(original.getString("name"))) {
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
	
}
