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
		String branchName = Activator.getBranchName(projectName);
		File mergedModel = Activator.merge(projectName, branchName, false);
		Client client = Activator.getClient();
		String url = "http://localhost:9090/services/emfgit/collaboration";
		
		if(mergedModel == null) {
			System.out.println("Diff is null.");
			return null;
		}
		
		try {
			InputStream fileInStream = new FileInputStream(mergedModel);
			String sContentDisposition = "attachment; filename=\"" + mergedModel.getName()+"\"";
			WebResource resource = client.resource(url)
				.path("commit")
				.queryParam("projectName", projectName)
				.queryParam("branchName", branchName);
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

	@Override
	public boolean isEnabled() {
		String projectName = "mondo_test";
		String branchName = Activator.getBranchName(projectName);
		if(branchName == null) {
			branchName = "";
		}
		return !Activator.modelFolderIsEmpty(projectName + "/" + branchName);
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
