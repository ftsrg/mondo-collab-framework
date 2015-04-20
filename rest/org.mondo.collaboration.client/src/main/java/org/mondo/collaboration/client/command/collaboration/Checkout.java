package org.mondo.collaboration.client.command.collaboration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.ws.rs.core.MediaType;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.mondo.collaboration.client.Activator;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Checkout implements IHandler {

	public void addHandlerListener(IHandlerListener arg0) {
		// TODO Auto-generated method stub
	}

	public void dispose() {
		// TODO Auto-generated method stub
	}

	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		String projectName = "mondo_test";
		
		Client client = Activator.getClient();
		String url = "http://localhost:9090/services/emfgit/collaboration";
		WebResource resource = client.resource(url).path("checkout")
			.queryParam("projectName", projectName);
		
		File receivedModel = resource.accept(MediaType.APPLICATION_OCTET_STREAM).get(File.class);
		
		if(receivedModel != null) {
			ClientResponse head = resource.head();
			
			String modelFileName = head.getHeaders().get("filename").get(0);
			System.out.println("modelFileName: " + modelFileName);
			// save to local repository
			String savePath = Activator.getLocalRepositoryPath() + projectName + "\\" + modelFileName;
			System.out.println("Saving model to local repository: " + savePath);
			saveFile(receivedModel, savePath);

			// save model into runtime project 
			IWorkspace workspace = ResourcesPlugin.getWorkspace(); 
			File workspaceDirectory = workspace.getRoot().getLocation().toFile();
			savePath = workspaceDirectory.getPath() + "\\" + projectName + "\\model\\" + modelFileName;
			System.out.println("Saving model to runtime project: " + savePath);
			saveFile(receivedModel, savePath);
		} else {
			System.out.println("No model received.");
		}
		
		return null;
	}

	private void saveFile(File fileToSave, String savePath) {
		try {
			byte[] bytes = readContentIntoByteArray(fileToSave);
			FileOutputStream fos = new FileOutputStream(savePath);
			fos.write(bytes);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private byte[] readContentIntoByteArray(File file) {
		 FileInputStream fileInputStream = null;
		 byte[] bFile = new byte[(int) file.length()];
		 try {
			//convert file into array of bytes
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(bFile);
			fileInputStream.close();
		 }
		 catch (Exception e) {
		    e.printStackTrace();
		 }
		 return bFile;
	}
	
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return Activator.modelFolderIsEmpty("mondo_test");
	}

	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	public void removeHandlerListener(IHandlerListener arg0) {
		// TODO Auto-generated method stub
	}
}
