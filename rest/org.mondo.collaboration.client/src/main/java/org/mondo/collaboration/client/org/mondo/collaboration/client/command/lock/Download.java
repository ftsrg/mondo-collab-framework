package org.mondo.collaboration.client.org.mondo.collaboration.client.command.lock;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.mondo.collaboration.client.org.mondo.collaboration.client.Activator;

public class Download implements IHandler {

	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
	
		
		
//		createLocksDirIfNotExists(Publish.getProjectName());
//		 ArrayList<String> listToDownload = getProjectFiles();
//		
//		 
//		
//		for(String item: listToDownload)
//		{
//			System.out.println(item);
//			File downloadedFile=downloadFile(Publish.getProjectName(), item);
//			saveFile(downloadedFile, Publish.getProjectName(), item);
//			
//		}
//		
		
		
		return null;
	}
	
//	private File downloadFile(String projectName,String fileName)
//	{
//		
//		Client client=Activator.getClient();
//		
//		String url="http://localhost:9090/services/emfgit";
//		
//		
//		WebTarget target=client.target(url).path("/download").queryParam("projectName", Publish.getProjectName())
//				.queryParam("filename", fileName);
//				
//	
//		File response=	target.request(MediaType.APPLICATION_OCTET_STREAM)
//			.get(File.class);
//		
//		System.out.println(response.getAbsolutePath());
//		
//		return response;
//	}
//	private void saveFile(File fileToSave,String projectName,String fileName)
//	{
//		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
//		IProject myWebProject = myWorkspaceRoot.getProject(projectName);
//		
//		IFolder locksDir = myWebProject.getFolder(Activator.lockDirName);
//		
//		IFile fileToCreate = locksDir.getFile(fileName);
//		
//		if(!fileToCreate.exists())
//		{
//			try {
//				fileToCreate.create(new ByteArrayInputStream(new byte[0]), true, getProgressMonitor());
//			} catch (CoreException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		
//		
//		try {
//			copyFile(fileToSave,  fileToCreate.getLocation().toFile() );
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		
//		
//	}
//	
//	private ArrayList<String> getProjectFiles()
//	{
//		Client client=Activator.getClient();
//		
//		String url="http://localhost:9090/services/emfgit";
//		
//		
//		WebTarget target=client.target(url).path("/projectFiles").queryParam("projectName", Publish.getProjectName());
//				
//	
//		String response=	target.request(MediaType.APPLICATION_JSON)
//			.get(String.class);
//		
//		
//		JSONArray jsa=(JSONArray) JSONValue.parse(response);
//		
//		
//		return Publish.convertJsonArrayToArrayList(jsa);
//		
//	}
	
//	public void createLocksDirIfNotExists(String projectName)
//	{
//		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
//		IProject myWebProject = myWorkspaceRoot.getProject(projectName);
//		
//		IFolder locksDir = myWebProject.getFolder(Activator.lockDirName);
//		
//		if(!locksDir.exists())
//		{
//			try {
//				locksDir.create(IResource.NONE, true, getProgressMonitor());
//			} catch (CoreException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
	
	private IProgressMonitor getProgressMonitor()
	{
		
		return new IProgressMonitor() {
			
			public void worked(int work) {
				// TODO Auto-generated method stub
				
			}
			
			public void subTask(String name) {
				// TODO Auto-generated method stub
				
			}
			
			public void setTaskName(String name) {
				// TODO Auto-generated method stub
				
			}
			
			public void setCanceled(boolean value) {
				// TODO Auto-generated method stub
				
			}
			
			public boolean isCanceled() {
				// TODO Auto-generated method stub
				return false;
			}
			
			public void internalWorked(double work) {
				// TODO Auto-generated method stub
				
			}
			
			public void done() {
				// TODO Auto-generated method stub
				
			}
			
			public void beginTask(String name, int totalWork) {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	public static void copyFile(File sourceFile, File destFile) throws IOException {
	    if(!destFile.exists()) {
	        destFile.createNewFile();
	    }

	    FileChannel source = null;
	    FileChannel destination = null;

	    try {
	        source = new FileInputStream(sourceFile).getChannel();
	        destination = new FileOutputStream(destFile).getChannel();
	        destination.transferFrom(source, 0, source.size());
	    }
	    finally {
	        if(source != null) {
	            source.close();
	        }
	        if(destination != null) {
	            destination.close();
	        }
	    }
	}
	
	public boolean isEnabled() {
		return true;
	}

	public boolean isHandled() {
		return true;
	}


	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
