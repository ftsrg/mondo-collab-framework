package org.mondo.collaboration.client.projectNature;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IProject;
import org.mondo.collaboration.client.Utils;

public class AddEMFGitNature implements IHandler{

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		
	}

	@Override
	public void dispose() {
	
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IProject project=Utils.getSelectedProject();
		
		EMFGitProjectnatureHandler.setNatureToProject(project);
		
		return null;
	}

	@Override
	public boolean isEnabled() {
		
		IProject project=Utils.getSelectedProject();
		
		return !EMFGitProjectnatureHandler.isProjectHasEMFGitNature(project);
	}

	@Override
	public boolean isHandled() {
		
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		
		
	}

}
