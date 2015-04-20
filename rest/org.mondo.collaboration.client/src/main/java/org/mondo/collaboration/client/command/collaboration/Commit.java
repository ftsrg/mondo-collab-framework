package org.mondo.collaboration.client.command.collaboration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.ws.rs.core.MediaType;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xml.type.impl.XMLTypeFactoryImpl;
import org.mondo.collaboration.client.Activator;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;

public class Commit implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		String projectName = "mondo_test";
		File diff = getDiff(projectName);
		Client client = Activator.getClient();
		String url = "http://localhost:9090/services/emfgit/collaboration";
		
		if(diff == null) {
			System.out.println("Diff is null.");
			return null;
		}
		
		try {
			InputStream fileInStream = new FileInputStream(diff);
			String sContentDisposition = "attachment; filename=\"" + diff.getName()+"\"";
			WebResource resource = client.resource(url).path("commit");
			ClientResponse response = resource.type(MediaType.APPLICATION_OCTET_STREAM)
                .header("Content-Disposition", sContentDisposition)
                .post(ClientResponse.class, fileInStream); 
			System.out.println("response: " + response.getStatus());
			// System.out.println("Commit response: " + resp);
		} catch(UniformInterfaceException e) {
			System.out.println("POST failed - " + e.getMessage());
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// returns the diff calculated from the altered model in the project
	// and the corresponding model in the local repository
	private File getDiff(String projectName) {
		// retrieval of the altered model
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		String modelDirPath = workspace.getRoot().getLocation().toString() + "/" + projectName + "/model/";
		System.out.println("workspace model dir: " + modelDirPath);
		File modelDir = new File(modelDirPath);

		// get the first file in the directory
		String[] models = modelDir.list();
		if(models.length < 1) {
			System.out.println("No files found in " + modelDir);
			return null;
		}
		
		String alteredModelPath = modelDirPath + "/" + models[0];
		System.out.println("alteredModelPath " + alteredModelPath);
		File alteredModel = new File(alteredModelPath);
		
		ResourceSet resourceSet = new ResourceSetImpl(); 
		URI fileURI = URI.createFileURI(alteredModelPath); 
		Resource resource = resourceSet.getResource(fileURI, true); 
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("key", new XMLTypeFactoryImpl());
		
		// retrieval of model in the local repository
		String repoModelPath = Activator.getLocalRepositoryPath() + projectName + "\\" + models[0];
		System.out.println(repoModelPath);
		File oldModel = new File(repoModelPath);
		
		return alteredModel;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return !Activator.modelFolderIsEmpty("mondo_test");
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener arg0) {
		// TODO Auto-generated method stub
		
	}

}
