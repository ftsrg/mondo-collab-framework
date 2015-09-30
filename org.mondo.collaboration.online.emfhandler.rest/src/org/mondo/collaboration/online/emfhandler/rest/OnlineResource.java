package org.mondo.collaboration.online.emfhandler.rest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

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
	
	public static String workingCopyPath;
	public static String repositoryUrl;

	private static SVNHandler svn = new SVNHandler();
	
	@POST
	@Path("/getModelsForUser")
	@Produces("apllication/json")
	public String getModels2(String userData) throws Exception {
		JSONObject user = new JSONObject(userData);
		String userName = user.getString("userName");
		System.out.println("Retrieving models for user: " + userName);
		svn.initNewSVNClientManager(userName, user.getString("password"));
		svn.checkoutOrUpdate(userName);
		return svn.loadRepositoryStructure(userName).toString();
	}

	@POST
	@Path("/loadModel")
	@Produces("application/json")
	public String loadModel(String sessionDataString) throws Exception {
		JSONObject sessionData = new JSONObject(sessionDataString);
		String userId = sessionData.getString("userId");
		String selectedModelPath = svn.getWorkingCopyPathByUserId(userId) + File.separator + sessionData.getString("modelPath");
		System.out.println("Load model: " + selectedModelPath);
		return parseEMFModelToJSON(selectedModelPath);
	}
	
	@GET
	@Path("/getModels")
	@Produces("application/json")
	public String getModels() throws Exception {
		loadModelAsResource();
		System.out.println("sending models...");
		return this.modelsInJson.toString();
	}

	private String parseEMFModelToJSON(String modelPath) {
		System.out.println("Parse emf model: " + modelPath);
		final File modelFile = new File(modelPath);
		String modelName = modelPath.substring(
			modelPath.lastIndexOf(File.separator) + 1, 
			modelPath.indexOf(".wtspec4m")
		);
		Integer id = 0;
		
	    // Obtain a new resource set
	    ResourceSet resourceSet = new ResourceSetImpl();
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsonResourceFactory());
	    
	    Map<String, Object> options = new HashMap<String, Object>();
	    options.put(EMFJs.OPTION_INDENT_OUTPUT, false);
	    options.put(EMFJs.OPTION_SERIALIZE_TYPE, true);
	    try {
		    if(!modelFile.exists()) {
				System.out.println(modelFile.getCanonicalPath() + " not found.");
		    	return "";
		    }
	    	
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
				inputStream.close();
				return jsonModel.toString();
			} catch (JSONException e) {
				e.printStackTrace();
			}
	    } catch (IOException e) {
			e.printStackTrace();
		}
		return "failed";
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
	public String persistModel(String saveDetailsString) throws Exception {
		System.out.println("Model handler service / persist model...");
		System.out.println(saveDetailsString);
		JSONObject saveDetails = new JSONObject(saveDetailsString);
		
		String jsonFileName = saveDetails.getString("title") + ".json";
		String jsonPath = OnlineResource.tmpFolderPath + jsonFileName;
		
		createJsonFile(jsonPath, saveDetails.getJSONObject("model").toString());
		
	    // Obtain a new resource set
	    ResourceSet resourceSet = new ResourceSetImpl();
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsonResourceFactory());
	    
	    Map<String, Object> loadOptions = new HashMap<String, Object>();
	    loadOptions.put(EMFJs.OPTION_ROOT_ELEMENT, WTSpec4MPackage.eINSTANCE.getWTSystem());
	    
	    System.out.println("JSON PATH: " + jsonPath);

	    URI uri = URI.createURI("file:///" + jsonPath, false);
	    Resource jsonResource = resourceSet.getResource(uri, true);
	    jsonResource.load(loadOptions);
	    JSONObject user = saveDetails.getJSONObject("user");
	    String wtspecFileName = "file:///" + workingCopyPath + user.getString("name") + File.separator + saveDetails.getString("modelPath");
	    Resource wtspecResource = resourceSet.createResource(URI.createURI(wtspecFileName));
	    
	    Map<String, Object> saveOptions = new HashMap<String, Object>();
	    saveOptions.put(EMFJs.OPTION_INDENT_OUTPUT, true);
	    saveOptions.put(EMFJs.OPTION_SERIALIZE_TYPE, false);
	    
	    EObject WTSystem = (EObject) jsonResource.getContents().get(0);
	    wtspecResource.getContents().add(WTSystem);
	    wtspecResource.save(saveOptions);
	    svn.commit(user.getString("name"), saveDetails.getString("commitMessage"));
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
	
	public static SVNHandler getSVNHandler() {
		return svn;
	}
}
