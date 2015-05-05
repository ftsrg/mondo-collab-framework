package org.mondo.collaboration.server;

import org.eclipse.jgit.api.Git;

public class GitInstance {

	private String name;
	private Git git; 
	
	public GitInstance(String _name, Git _git) {
		this.name = _name;
		this.git = _git;
	}
	
	public void setName(String _name) {
		this.name = _name;
	}
	
	public void setGitInstance(Git _git) {
		this.git = _git;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Git getGitInstance() {
		return this.git;
	}
}
