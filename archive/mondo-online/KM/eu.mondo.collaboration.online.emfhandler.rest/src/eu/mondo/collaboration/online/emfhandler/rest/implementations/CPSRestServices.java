package eu.mondo.collaboration.online.emfhandler.rest.implementations;

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
import org.json.JSONObject;

import WTSpec.WTSpecPackage;
import eu.mondo.collaboration.online.emfhandler.rest.interfaces.ICPSRestServices;

@Path("/modelHandler")
public class CPSRestServices implements ICPSRestServices {

	private JSONArray modelsInJson;
	
	@Override
	@GET
	@Path("/getModels")
	@Produces("application/json")
	public String getModels() throws Exception {
		loadModelAsResource();
		System.out.println("sending models...");
		return this.modelsInJson.toString();
	}

	private void loadModelAsResource() {
		System.out.println("Reading them models...");
		this.modelsInJson = new JSONArray();
		String pathToResFolder = "D:/Eclipse/Eclipse_EE/workspace_MONDO/eu.mondo.collaboration.online.emfhandler.rest/res/";
		final File folder = new File(pathToResFolder);
		Integer id = 0;
		
	    // Obtain a new resource set
	    ResourceSet resourceSet = new ResourceSetImpl();
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsonResourceFactory());
	    
	    Map<String, Object> options = new HashMap<String, Object>();
	    options.put(EMFJs.OPTION_INDENT_OUTPUT, false);
	    options.put(EMFJs.OPTION_SERIALIZE_TYPE, true);
	    
		for (final File fileEntry : folder.listFiles()) {
	        if (!fileEntry.isDirectory()) {
	        	String modelFileName = fileEntry.getName();
	        	String modelName = modelFileName.substring(0, modelFileName.indexOf(".wtspec"));
	        	String modelPath = pathToResFolder + modelFileName; 
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

	@Override
	@POST
	@Path("/persistModel")
	@Produces("application/json")
	public String persistModel(String modelDataString)
			throws Exception {
		System.out.println("Model handler service / persist model...");
		System.out.println(modelDataString);
		JSONObject modelData = new JSONObject(modelDataString);
		
		String jsonFileName = modelData.getString("title") + ".json";
		String jsonPath = "D:/Eclipse/Eclipse_EE/Eclipse/MondoModelHandler/tmp/output/" + jsonFileName;
		createJsonFile(jsonPath, modelData.getJSONObject("model").toString());
		
	    // Obtain a new resource set
	    ResourceSet resourceSet = new ResourceSetImpl();
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsonResourceFactory());
	    
	    Map<String, Object> saveOptions = new HashMap<String, Object>();
	    saveOptions.put(EMFJs.OPTION_INDENT_OUTPUT, true);
	    saveOptions.put(EMFJs.OPTION_SERIALIZE_TYPE, false);
	    
	    Map<String, Object> loadOptions = new HashMap<String, Object>();
	    loadOptions.put(EMFJs.OPTION_ROOT_ELEMENT, WTSpecPackage.eINSTANCE.getWT());
	    
	    Resource jsonResource = resourceSet.getResource(URI
	        .createURI("file:///" + jsonPath), true);
	    jsonResource.load(loadOptions);
	    
	    String wtspecFileName = "MondoModelHandler/tmp/output/" + modelData.getString("title") + ".wtspec";
	    Resource wtspecResource = resourceSet.createResource(URI.createURI(wtspecFileName));
	    
	    EObject WTRoot = (EObject) jsonResource.getContents().get(0);
	    wtspecResource.getContents().add(WTRoot);
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
}

