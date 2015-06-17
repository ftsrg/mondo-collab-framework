package org.mondo.collaboration.client.command.collaboration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import javax.ws.rs.core.MediaType;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.mondo.collaboration.client.Activator;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Update implements IHandler {

	public void addHandlerListener(IHandlerListener arg0) {
		// TODO Auto-generated method stub
	}

	public void dispose() {
		// TODO Auto-generated method stub
	}

	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		String projectName = Activator.getProjectNameFromUser();
		Client client = Activator.getClient();
		String url = "http://localhost:9090/services/emfgit/collaboration";
		
		System.out.println("Executing update...");
		if(projectName == null || projectName.equals("")) {
			System.out.println("Invalid project name. Checkout failed.");
			return null;
		}
		
		WebResource resource = client.resource(url).path("update")
			.queryParam("projectName", projectName);
		
		File receivedModel = resource.accept(MediaType.APPLICATION_OCTET_STREAM).get(File.class);
		
		if(receivedModel != null) {
			ClientResponse head = resource.head();
			
			String modelFileName = head.getHeaders().get("filename").get(0);
			System.out.println("modelFileName: " + modelFileName);
			String localRepoName = projectName;

			// save to temp dir for three-way merge
			String remoteModelName = new StringBuilder(modelFileName).insert(modelFileName.lastIndexOf('.') - 1, ".new").toString();
			String localRepoModelPath = Activator.getLocalRepositoryPath() + localRepoName + "\\" + remoteModelName;
			
			// get working copy path from runtime project 
			String workingCopyFolderPath = "";
			ISelectionService service = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
			ISelection selection = service.getSelection();
			if(selection instanceof StructuredSelection) {
				StructuredSelection treeSelection = (StructuredSelection) selection;
				Iterator iterator = treeSelection.iterator();
				while (iterator.hasNext()) {
					Object next = iterator.next();
					if(next instanceof IResource) {
						IResource iResource = (IResource) next;
						workingCopyFolderPath = iResource.getLocation().toString() + "\\";
					}
				}
			}
			Activator.saveFile(receivedModel, workingCopyFolderPath + remoteModelName);
			EObject mergedModel = null;
			try {
				mergedModel = Activator.merge(URI.createURI(workingCopyFolderPath + modelFileName + ".changeset"), URI.createURI(localRepoModelPath), URI.createURI(workingCopyFolderPath + remoteModelName));
			} catch (IncQueryException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Saving model to runtime project: " + localRepoModelPath);
			ResourceSet rSetLocal = new ResourceSetImpl();
			Resource local = rSetLocal.createResource(URI.createURI(localRepoModelPath));
			local.getContents().add(mergedModel);
			try {
				local.save(Collections.emptyMap());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Resource ws = rSetLocal.createResource(URI.createURI(workingCopyFolderPath + modelFileName));
			ws.getContents().add(mergedModel);
			try {
				ws.save(Collections.emptyMap());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("No model received.");
		}
		
		return null;
	}

	public boolean isEnabled() {
		String projectName = "mondo_test";
		String branchName = Activator.getBranchName(projectName);
		if(branchName == null) {
			branchName = "";
		}
		return Activator.user.isSet() && !Activator.modelFolderIsEmpty(projectName + "/" + branchName);
	}

	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	public void removeHandlerListener(IHandlerListener arg0) {
		// TODO Auto-generated method stub
	}
}
