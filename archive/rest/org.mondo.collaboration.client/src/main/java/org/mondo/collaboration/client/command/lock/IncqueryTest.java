package org.mondo.collaboration.client.command.lock;

import java.util.ArrayList;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.mondo.collaboration.client.incquery.QueryGenerator;

public class IncqueryTest implements IHandler{

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		
		QueryGenerator queryGen=new QueryGenerator();
		
		ArrayList<IFile> emfFiels = Publish.getFilesFromProjectsDir("emf");
		
		for (IFile iFile : emfFiels) {
			
			if(iFile.getName().startsWith("BUTE"))
			{
				String eiq="C:\\eclipseModelling0405\\runtime-EclipseApplication\\eee\\lock\\simple.eiq";
				
				queryGen.setModelFilePath(iFile.getFullPath().toString());
				queryGen.setEiqFilePath(eiq);
				queryGen.setPatternFQN("school.schools");
				queryGen.run();
			}
		}
		
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub
		
	}

}
