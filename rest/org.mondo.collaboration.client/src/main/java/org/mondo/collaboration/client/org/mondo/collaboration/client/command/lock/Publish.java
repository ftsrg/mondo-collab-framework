package org.mondo.collaboration.client.org.mondo.collaboration.client.command.lock;

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
		try {
			 
			Thread .currentThread ().setContextClassLoader(this.getClass().getClassLoader()); 
			
		//	Client client = ClientBuilder.newClient();
			
			Client client = org.mondo.collaboration.client.org.mondo.collaboration.client.Activator.getClient();
	
			String url="http://localhost:9090/services/emfgit";
			
			
			for(IFile item:getProjectsLockFiles())
			{
				 
			WebResource resource = client.resource(url).path("/upload").queryParam("projectName", getProjectName())
					.queryParam("fileName", item.getName());
				
				File fileToUpload=item.getRawLocation().makeAbsolute().toFile();
				
				
				Builder aa = resource.entity(fileToUpload,MediaType.APPLICATION_OCTET_STREAM );
				aa.post();

			}
	 
		  } catch (Exception e) {
	 
			e.printStackTrace();
	 
		  }
	}
//	
//	private void broadcastUploadEvent()
//	{
//		Client client=org.mondo.collaboration.client.org.mondo.collaboration.client.Activator.getClient();
//		
//		String url="http://localhost:9090/services/broadcast";
//		
//		WebTarget target = client.target(url).queryParam("message", "testMessage");
//		
//		Response response=target.request(MediaType.TEXT_PLAIN).get();
//		
//		System.out.println(	response.toString());
//	
//	}

	public Object execute(ExecutionEvent event) throws ExecutionException {

			uploadFiles();
		
			
		return null;
	}

	public boolean isEnabled() {

		return true;
	}

	public boolean isHandled() {
		return true;
	}

	public void removeHandlerListener(IHandlerListener handlerListener) {
	
	}
	
	

	public ArrayList<IFile> getProjectsLockFiles() {

		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window != null) {
			IStructuredSelection selection = (IStructuredSelection) window
					.getSelectionService().getSelection();
			Object firstElement = selection.getFirstElement();
			if (firstElement instanceof IAdaptable) {
				IProject project = (IProject) ((IAdaptable) firstElement)
						.getAdapter(IProject.class);
				
				IPath path = project.getFullPath();
				IResource folder=project.getFolder("lock");
				
				return getAllFile(folder);
			}
		}
		
		return null;
	}
	
	
	ArrayList<IFile> files;
	public ArrayList<IFile> getAllFile(IResource item)
	{
		 files=new ArrayList<IFile>();
		
		 travelResources(item);
		
		 return files;
	}
	
	private void travelResources(IResource resource)
	{
		
		if(resource.getType()==IResource.FILE)
		{
			files.add((IFile) resource);
			System.out.println(resource.getFullPath());
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
				e.printStackTrace();
			}
		}
	}
	
	
	public static String getProjectName() {

		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window != null) {
			IStructuredSelection selection = (IStructuredSelection) window
					.getSelectionService().getSelection();
			Object firstElement = selection.getFirstElement();
			if (firstElement instanceof IAdaptable) {
				IProject project = (IProject) ((IAdaptable) firstElement)
						.getAdapter(IProject.class);
				
				return project.getName();
			}
		}
		
		return null;
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
