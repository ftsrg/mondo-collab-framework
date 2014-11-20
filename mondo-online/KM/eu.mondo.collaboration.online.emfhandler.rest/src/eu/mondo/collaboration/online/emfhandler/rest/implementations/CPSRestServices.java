package eu.mondo.collaboration.online.emfhandler.rest.implementations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipselabs.emfjson.EMFJs;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.json.JSONArray;
import org.json.JSONObject;

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
		String pathToResFolder = "D:/Eclipse/Eclipse_EE/workspace_EE/eu.mondo.collaboration.online.emfhandler.rest/res/";
		final File folder = new File(pathToResFolder);
		Integer id = 0;
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("wtspec", new XMIResourceFactoryImpl());
	    // Obtain a new resource set
	    ResourceSet resourceSet = new ResourceSetImpl();
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsResourceFactoryImpl());
	    
	    Map<String, Object> options = new HashMap<String, Object>();
	    options.put(EMFJs.OPTION_INDENT_OUTPUT, true);
	    options.put(EMFJs.OPTION_SERIALIZE_TYPE, false);
	    
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
			    
			    final TreeIterator<EObject> contentIterator=(TreeIterator<EObject>)resource.getAllContents();
			    EObject WTRoot = (EObject) resource.getContents().get(0);
			    jsonResource.getContents().add(WTRoot);
			    String model = null;
			    try {
					jsonResource.save(options);
					BufferedReader inputStream = new BufferedReader(new FileReader(jsonFileName));
					model = inputStream.readLine();
					JSONObject jsonModel = new JSONObject();
					jsonModel.put("name", modelName);
					jsonModel.put("model", model);
					this.modelsInJson.put(jsonModel);
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
  		}
	}
	/*
	public static void printAttributeValues(EObject object) {
		  EClass eClass = object.eClass();
		  System.out.println(eClass.getName());
		  for (Iterator iter =
		       eClass.getEAllAttributes().iterator(); iter.hasNext(); ) {
		    EAttribute attribute = (EAttribute)iter.next();
		    Object value = object.eGet(attribute);

		    System.out.print("  " + attribute.getName() + " : ");
		    if (object.eIsSet(attribute))
		      System.out.println(value);
		    else
		      System.out.println(value + " (default)");
		}
	}
	*/
}

