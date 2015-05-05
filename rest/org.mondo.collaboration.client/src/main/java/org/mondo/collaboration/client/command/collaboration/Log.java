package org.mondo.collaboration.client.command.collaboration;

import java.util.ArrayList;

import javax.ws.rs.core.MediaType;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.mondo.collaboration.client.Activator;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class Log implements IHandler {

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
		Client client = Activator.getClient();
		String url = "http://localhost:9090/services/emfgit/collaboration";
		WebResource resource = client.resource(url).path("logs")
			.queryParam("projectName", projectName)
			.queryParam("branchName", branchName);
		
		String allLogs = resource.accept(MediaType.APPLICATION_JSON).get(String.class);
		String[] splitLogs = decodeLogs(allLogs);
		for(String log : splitLogs) {
			System.out.println(log);
		}
		return null;
	}

	public String[] decodeLogs(String allLogs) {
		return allLogs.split("\\|");
	}
	
	@Override
	public boolean isEnabled() {
		String projectName = "mondo_test";
		String branchName = Activator.getBranchName(projectName);
		if(branchName == null) {
			branchName = "";
		}
		return Activator.user.isSet() && !Activator.modelFolderIsEmpty(projectName + "/" + branchName);
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
