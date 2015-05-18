package org.mondo.collaboration.client.command;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.mondo.collaboration.client.Activator;
import org.mondo.collaboration.client.Utils;
import org.mondo.collaboration.client.preference.Preferences;
import org.mondo.collaboration.client.projectNature.EMFGitProjectnatureHandler;

import com.google.common.io.Files;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class Download implements IHandler {

	
	public static final String ID="org.mondo.collaboration.client.org.mondo.collaboration.client.command.lock.Download";
	
	public void addHandlerListener(IHandlerListener handlerListener) {
	

	}

	public void dispose() {
		
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IProject selectedProject= Utils.getSelectedProject();
		
		syncLockFiles(selectedProject);
		 
		return null;
	}
	
	public void syncLockFiles(IProject selectedProject)
	{
		
		String selectedPorjectName=selectedProject.getName();
		String selectProjectID=EMFGitProjectnatureHandler.getProjectID(selectedProject);
		
		Utils.createLocksDirIfNotExists(selectedPorjectName);
		
		 Map<String, Long> listToDownload = getServersLockFiles(selectedProject);
		
		IFolder lockDir= Utils.getProjectLockDir(selectedPorjectName);
		 
		 for( String key:  listToDownload.keySet())
		 {
			 Long serversModDate=listToDownload.get(key);
			 
			Long localModDate=lockDir.getFile(key).getRawLocation().toFile().lastModified();
			 
			if(serversModDate>localModDate)
			{
				File downloadedFile=downloadFile(selectProjectID, key);
				saveFile(downloadedFile, selectedPorjectName,key);
			}
			
		 }
	}
	
	private File downloadFile(String projectID,String fileName)
	{
		
		Client client=Activator.getClient();
		
		String url=Preferences.ServerAddress;
		
		WebResource resource = client.resource(url).path("/download").queryParam("projectID", projectID)
		.queryParam("filename", fileName);
		
		
				
		File response=resource.accept(MediaType.APPLICATION_OCTET_STREAM).get(File.class);
		
		return response;
	}
	private void saveFile(File fileToSave,String projectName,String fileName)
	{
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = myWorkspaceRoot.getProject(projectName);
		
		IFolder locksDir = project.getFolder("lock");
		
		IFile fileToCreate = locksDir.getFile(fileName);
		
		if(!fileToCreate.exists())
		{
			try {
				fileToCreate.create(new ByteArrayInputStream(new byte[0]), true, Utils.getProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		try {
			Files.copy(fileToSave, fileToCreate.getLocation().toFile());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	private Map<String, Long> getServersLockFiles(IProject selectedProject)
	{
		Client client=Activator.getClient();
		
		String url=Preferences.ServerAddress;
		
		
		String projectID=EMFGitProjectnatureHandler.getProjectID(selectedProject);
		
		WebResource resource=client.resource(url).path("/projectFiles").queryParam("projectID", projectID );
		
		String response= resource.accept(MediaType.APPLICATION_JSON).get(String.class);
		
		JSONObject filesModDate=(JSONObject) JSONValue.parse(response);
		
		
		return Utils.convertJsonObjectToMap(filesModDate);
		
	}
	
	
	public boolean isEnabled() {
		return EMFGitProjectnatureHandler.isProjectHasEMFGitNature(Utils.getSelectedProject());
	}

	public boolean isHandled() {
		return true;
	}


	public void removeHandlerListener(IHandlerListener handlerListener) {
		
	}

}
