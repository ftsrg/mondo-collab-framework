package org.mondo.collaboration.client.command.collaboration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
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
		System.out.println("Executing checkout...");
		String projectName = getProjectNameFromUser();
		if(projectName == null || projectName.equals("")) {
			System.out.println("Invalid project name. Checkout failed.");
			return null;
		}
		
		Client client = Activator.getClient();
		String url = "http://localhost:9090/services/emfgit/collaboration";
		
		WebResource resource = client.resource(url).path("branches")
			.queryParam("projectName", projectName);
			
		String branchesInfo = resource.accept(MediaType.APPLICATION_JSON).get(String.class);
		String selectedBranch = null;
		if(branchesInfo != null) {
			System.out.println("Received branches.");
			String[] branches = branchesInfo.split(";");
		    selectedBranch = (String) JOptionPane.showInputDialog(
		    	null, 
		    	"Please select a branch",
		        "Available branches", 
		        JOptionPane.QUESTION_MESSAGE, 
		        null, 
		        branches,
		        branches[0]
		    );
		}
		System.out.println("Selected branch: " + selectedBranch);
	    
		resource = client.resource(url).path("checkout")
			.queryParam("projectName", projectName)
			.queryParam("branchName", selectedBranch);
		
		File receivedModel = resource.accept(MediaType.APPLICATION_OCTET_STREAM).get(File.class);
		
		if(receivedModel != null) {
			ClientResponse head = resource.head();
			
			String modelFileName = head.getHeaders().get("filename").get(0);
			System.out.println("modelFileName: " + modelFileName);
			String localRepoName = projectName;
			if(selectedBranch != null) {
				localRepoName += "\\" + selectedBranch;
			} else {
				localRepoName += "\\master";
			}
			// save to local repository
			String savePath = Activator.getLocalRepositoryPath() + localRepoName + "\\" + modelFileName;
			System.out.println("Saving model to local repository: " + savePath);
			Activator.saveFile(receivedModel, savePath);

			// save model into runtime project 
			IWorkspace workspace = ResourcesPlugin.getWorkspace(); 
			File workspaceDirectory = workspace.getRoot().getLocation().toFile();
			savePath = workspaceDirectory.getPath() + "\\" + projectName + "\\model\\" + modelFileName;
			System.out.println("Saving model to runtime project: " + savePath);
			Activator.saveFile(receivedModel, savePath);
			File branchFile = new File(workspaceDirectory.getPath() + "\\" + projectName + "\\" 
				+ "\\branch\\" + selectedBranch);
			try {
				branchFile.mkdirs();
				branchFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("No model received.");
		}
		
		return null;
	}

	private String getProjectNameFromUser() {
		JPanel panel = new JPanel();
		
		JLabel projectLabel = new JLabel("Project name:");
		JTextField projectField = new JTextField(10);
		panel.add(projectLabel);
		panel.add(projectField);
		
		String[] options = new String[]{"OK", "Cancel"};
		int option = JOptionPane.showOptionDialog(null, panel, "Checkout project",
             JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
             null, options, options[1]);
		
		if(option == 0) { // pressing OK button
			return projectField.getText();
		}
		return null;
	}

	public boolean isEnabled() {
		return Activator.user.isSet();
	}

	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	public void removeHandlerListener(IHandlerListener arg0) {
		// TODO Auto-generated method stub
	}
}
