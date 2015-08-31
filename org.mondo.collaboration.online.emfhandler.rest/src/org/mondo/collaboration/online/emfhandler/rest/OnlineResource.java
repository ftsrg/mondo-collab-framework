package org.mondo.collaboration.online.emfhandler.rest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emfjson.EMFJs;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import es.ikerlan.WTSpec4M.WTSpec4MPackage;

@Path("/modelHandler")
public class OnlineResource {

	private JSONArray modelsInJson;
	public static String inputFolderPath;
	public static String outputFolderPath;
	public static String tmpFolderPath;

	
	@GET
	@Path("/getModels")
	@Produces("application/json")
	public String getModels() throws Exception {
		loadModelAsResource();
		System.out.println("sending models...");
		return this.modelsInJson.toString();
	}

	private void loadModelAsResource() throws JSONException {
		System.out.println("Reading them models...");
		this.modelsInJson = new JSONArray();
		final File folder = new File(OnlineResource.inputFolderPath);
		Integer id = 0;
		
	    // Obtain a new resource set
	    ResourceSet resourceSet = new ResourceSetImpl();
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsonResourceFactory());
	    
	    Map<String, Object> options = new HashMap<String, Object>();
	    options.put(EMFJs.OPTION_INDENT_OUTPUT, false);
	    options.put(EMFJs.OPTION_SERIALIZE_TYPE, true);
	    if(!folder.exists()) {
	    	System.out.println(folder + " folder does not exist.");
	    	return;
	    }
		for (final File fileEntry : folder.listFiles()) {
	        if (!fileEntry.isDirectory()) {
	        	String modelFileName = fileEntry.getName();
	        	String modelName = modelFileName.substring(0, modelFileName.indexOf(".wtspec4m"));
	        	String modelPath = OnlineResource.inputFolderPath + modelFileName; 
	        	id++;
	      
			    // Get the resource
			    Resource resource = resourceSet.getResource(URI
			        .createURI("file:///" + modelPath), true);
			    
			    String jsonFileName = "MondoModelHandler/tmp/" + modelName + ".json";
			    Resource jsonResource = resourceSet.createResource(URI.createURI(jsonFileName));
			    
			    EObject WTRoot = (EObject) resource.getContents().get(0);
			    jsonResource.getContents().add(WTRoot);
			    String model = null;
			    try {
					jsonResource.save(options);
					BufferedReader inputStream = new BufferedReader(new FileReader(jsonFileName));
					model = inputStream.readLine();
					JSONObject jsonModel = new JSONObject();
					jsonModel.put("name", modelName);
					jsonModel.put("model", new JSONObject(model));
					this.modelsInJson.put(jsonModel);
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
  		}
	}

	@POST
	@Path("/persistModel")
	@Produces("application/json")
	public String persistModel(String modelDataString) throws Exception {
		System.out.println("Model handler service / persist model...");
		System.out.println(modelDataString);
		JSONObject modelData = new JSONObject(modelDataString);
		
		String jsonFileName = modelData.getString("title") + ".json";
		String jsonPath = OnlineResource.tmpFolderPath + jsonFileName;
		
		createJsonFile(jsonPath, modelData.getJSONObject("model").toString());
		
	    // Obtain a new resource set
	    ResourceSet resourceSet = new ResourceSetImpl();
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsonResourceFactory());
	    
	    Map<String, Object> loadOptions = new HashMap<String, Object>();
	    loadOptions.put(EMFJs.OPTION_ROOT_ELEMENT, WTSpec4MPackage.eINSTANCE.getWTSystem());
	    
	    System.out.println("JSON PATH: " + jsonPath);

	    URI uri = URI.createURI("file:///" + jsonPath, false);
	    Resource jsonResource = resourceSet.getResource(uri, true);
	    jsonResource.load(loadOptions);
	    
	    String wtspecFileName = "file:///" + OnlineResource.outputFolderPath + modelData.getString("title") + ".wtspec4m";
	    Resource wtspecResource = resourceSet.createResource(URI.createURI(wtspecFileName));
	    
	    Map<String, Object> saveOptions = new HashMap<String, Object>();
	    saveOptions.put(EMFJs.OPTION_INDENT_OUTPUT, true);
	    saveOptions.put(EMFJs.OPTION_SERIALIZE_TYPE, false);
	    
	    EObject WTSystem = (EObject) jsonResource.getContents().get(0);
	    wtspecResource.getContents().add(WTSystem);
	    wtspecResource.save(saveOptions);
		return "succes";
	}
	
	private void createJsonFile(String path, String data) {
        try {
    		FileWriter writer = new FileWriter(path);
            writer.write(data);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
	}
	/*
	// EClass attribute of json objects have to be the first attribute
	private JSONObject workaroundEClassBug(JSONObject obj) {
		try {
			Map mapObj = new LinkedHashMap();
			mapObj.put("eClass", (String) obj.get("eClass"));
			obj.remove("eClass");
			for(String attr : JSONObject.getNames(obj)) {
				if(obj.get(attr) instanceof JSONArray) {
					JSONArray fixedArray = new JSONArray();
					JSONArray arrToFix = obj.getJSONArray(attr);
					for(int i = 0; i < arrToFix.length(); i++) {
						Object currObj = arrToFix.get(i); 
						if(currObj instanceof JSONObject) {
							currObj = workaroundEClassBug((JSONObject) currObj);
						}
						fixedArray.put(currObj);
					}
					mapObj.put(attr, fixedArray);
				} else {
					mapObj.put(attr, obj.get(attr));
				}
			}
			return (JSONObject) mapObj;
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}*/
}
