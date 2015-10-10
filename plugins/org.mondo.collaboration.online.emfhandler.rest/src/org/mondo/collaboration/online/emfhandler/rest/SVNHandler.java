package org.mondo.collaboration.online.emfhandler.rest;

import java.io.File;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.tmatesoft.svn.core.SVNDepth;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.auth.ISVNAuthenticationManager;
import org.tmatesoft.svn.core.internal.io.dav.DAVRepositoryFactory;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.io.SVNRepositoryFactory;
import org.tmatesoft.svn.core.wc.ISVNOptions;
import org.tmatesoft.svn.core.wc.SVNClientManager;
import org.tmatesoft.svn.core.wc.SVNCommitPacket;
import org.tmatesoft.svn.core.wc.SVNUpdateClient;
import org.tmatesoft.svn.core.wc.SVNWCUtil;
import org.tmatesoft.svn.core.wc2.SvnCommitPacket;

public class SVNHandler {

	private String repositoryUrl;
	private String workingCopyPath;

	private HashMap<String, SVNClientManager> svnClients = new HashMap<String, SVNClientManager>();
	
	public void init() {
		System.out.println("Initializing SVN handler..");
		DAVRepositoryFactory.setup();
		// initSVNClientManager();
		// checkoutOrUpdate();
	}

	public void initNewSVNClientManager(String userName, String password) {
		try {
			SVNURL url = SVNURL.parseURIDecoded(this.repositoryUrl);
			SVNRepository repository = SVNRepositoryFactory.create(url, null);

			ISVNOptions myOptions = SVNWCUtil.createDefaultOptions(true);
			ISVNAuthenticationManager myAuthManager = 
				SVNWCUtil.createDefaultAuthenticationManager(userName, password);
			repository.setAuthenticationManager(myAuthManager);
			SVNClientManager clientManager = SVNClientManager.newInstance(myOptions, myAuthManager);
			svnClients.put(userName, clientManager);
		} catch (SVNException e) {
			e.printStackTrace();
		}
	}
	
	public void setRepositoryUrl(String newUrl) {
		this.repositoryUrl = newUrl;
	}
	
	public void setWorkingCopyPath(String newPath) {
		this.workingCopyPath = newPath;
	}
	
	public void checkoutOrUpdate(String userName) {
		System.out.println("Checking out/updating repository from url [" + repositoryUrl + "] for user [" + userName + "]");
		SVNUpdateClient updateClient = svnClients.get(userName).getUpdateClient();
	
		updateClient.setIgnoreExternals(false);
	    SVNURL url;
		try {
			String workingCopyOfUser = getWorkingCopyPathByUserId(userName);
			url = SVNURL.parseURIDecoded(this.repositoryUrl);
			File destPath = new File(workingCopyOfUser);
		    boolean isRecursive = true;
		    long revisionNumber = updateClient.doCheckout(url, destPath, null, null, isRecursive);
		    System.out.println("Success! [Revision: " + revisionNumber + "]");
		} catch (SVNException e) {
			e.printStackTrace();
		}
	}
	
	public void commit(String userName, String commitMessage) {
		System.out.println("Committing user repo: " + userName + ", message: [" + commitMessage + "]");
		File[] files = {new File(this.workingCopyPath + File.separator + userName)};
		try {
			svnClients.get(userName).getCommitClient()
				.doCommit(files, false, commitMessage, false, true);
		} catch (SVNException e) {
			e.printStackTrace();
		}
	}
	
	public String getWorkingCopyPathByUserId(String userName) {
		return this.workingCopyPath + userName;
	}
	
	public JSONArray loadRepositoryStructure(String userName) {
		System.out.println("Loading repository structure...");
		JSONArray availableModels = new JSONArray();
		extractDirectoryContents(
			new File(this.getWorkingCopyPathByUserId(userName)), 
			availableModels, 
			""
		);
		System.out.println("results: ");
		try {
			for(int i = 0; i < availableModels.length(); i++) {
				System.out.println(availableModels.getString(i));
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return availableModels;
	}
	
	private void extractDirectoryContents(File dir, JSONArray availableModels, String currentPath) {
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				String dricetoryName = file.getName();
				extractDirectoryContents(file, availableModels, currentPath + dricetoryName + File.separator);
			} else {
				String fileName = file.getName();
				if(fileName.endsWith(".wtspec4m")) {
					availableModels.put(currentPath + fileName);
				}
			}
		}
	}
}
