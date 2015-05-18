package org.mondo.collaboration.client.command;

import java.io.File;
import java.util.ArrayList;

import javax.ws.rs.core.MediaType;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.json.simple.JSONArray;
import org.mondo.collaboration.client.Marker;
import org.mondo.collaboration.client.Utils;
import org.mondo.collaboration.client.preference.Preferences;
import org.mondo.collaboration.client.projectNature.EMFGitProjectnatureHandler;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.core.osgi.Activator;


public class Publish implements IHandler {

	public void addHandlerListener(IHandlerListener handlerListener) {

	}

	public void dispose() {
	
	}
	
	private void uploadFiles()
	{
		
			Client client = org.mondo.collaboration.client.Activator.getClient();
	
			String url=Preferences.ServerAddress;
			
			String projectID=EMFGitProjectnatureHandler.getProjectID(Utils.getSelectedProject());
			
			for(IFile item:getProjectsLockFiles())
			{
			
				WebResource resource = client.resource(url).path("/upload").queryParam("projectID", projectID)
					.queryParam("fileName", item.getName());
				
				File fileToUpload=item.getRawLocation().makeAbsolute().toFile();
				
				Builder post = resource.entity(fileToUpload,MediaType.APPLICATION_OCTET_STREAM );
				post.post();

			}
	 
		  
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {

		
		try{
			uploadFiles();
			Marker.cancelPublishProblem();
		}catch(Exception e)
		{
			e.printStackTrace();
			Marker.showPublishProblem();
		}
			
		return null;
	}

	public boolean isEnabled() {

		return EMFGitProjectnatureHandler.isProjectHasEMFGitNature(Utils.getSelectedProject());
	}

	public boolean isHandled() {
		return true;
	}

	public void removeHandlerListener(IHandlerListener handlerListener) {
	
	}
	
	

	public ArrayList<IFile> getProjectsLockFiles() {
		
		
		String selectedProject=Utils.getSelectedProjectName();
		IFolder lockDir=Utils.getProjectLockDir(selectedProject);
		
		return getAllFile(lockDir);
		
	}

	
	
	static ArrayList<IFile> files;
	public static ArrayList<IFile> getAllFile(IResource item)
	{
		 files=new ArrayList<IFile>();
		
		 travelResources(item);
		
		 return files;
	}
	
	private static void travelResources(IResource resource)
	{
		
		if(resource.getType()==IResource.FILE)
		{
			files.add((IFile) resource);
			
		}
		else if(resource.getType()==IResource.FOLDER)
		{
			try {
				for(IResource item : ((IFolder) resource).members()  )
				{
					travelResources(item);
				}
			} catch (CoreException e) {
				
				//silently fail
			//	e.printStackTrace();
			}
		}
	}
	
	
	
	
	public static ArrayList<String> convertJsonArrayToArrayList(JSONArray arr)
	{
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < arr.size(); i++){
		    list.add((String) arr.get(i));
		}
		
		return list;
	}
	

}
