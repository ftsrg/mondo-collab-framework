package org.mondo.collaboration.client.projectNature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class EMFGitPorjectNature implements IProjectNature{

	
	public static final String ID="org.mondo.collaboration.client.EMFGitNature";
	
	private IProject project;
	@Override
	public void configure() throws CoreException {
	}

	@Override
	public void deconfigure() throws CoreException {
		
	}

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project=project;
		
	}

}
