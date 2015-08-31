package org.mondo.collaboration.online.emfhandler.rest;

import java.io.File;

import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.auth.ISVNAuthenticationManager;
import org.tmatesoft.svn.core.internal.io.dav.DAVRepositoryFactory;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.io.SVNRepositoryFactory;
import org.tmatesoft.svn.core.wc.ISVNOptions;
import org.tmatesoft.svn.core.wc.SVNClientManager;
import org.tmatesoft.svn.core.wc.SVNUpdateClient;
import org.tmatesoft.svn.core.wc.SVNWCUtil;

public class SVNHandler {

	private String repositoryUrl;
	private String workingCopyPath;
	private String username;
	private String password;

	private SVNClientManager clientManager;
	
	public void init() {
		System.out.println("Initializing SVN handler..");
		DAVRepositoryFactory.setup();
		initSVNClientManager();
		checkoutOrUpdate();
	}

	public void initSVNClientManager() {
		try {
			SVNURL url = SVNURL.parseURIDecoded(this.repositoryUrl);
			SVNRepository repository = SVNRepositoryFactory.create(url, null);

			ISVNOptions myOptions = SVNWCUtil.createDefaultOptions(true);
			ISVNAuthenticationManager myAuthManager = 
				SVNWCUtil.createDefaultAuthenticationManager(this.username, this.password);
			repository.setAuthenticationManager(myAuthManager);
			this.clientManager = SVNClientManager.newInstance(myOptions, myAuthManager);
		} catch (SVNException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setSVNConnectionDetails(String repositoryUrl, String workingCopyPath, String username, String password) {
		this.repositoryUrl = repositoryUrl;
		this.workingCopyPath = workingCopyPath;
		this.username = username;
		this.password = password;
	}
	
	public void checkoutOrUpdate() {
		System.out.println("Checking out/pdating repository from url [" + repositoryUrl + "]...");
		SVNUpdateClient updateClient = clientManager.getUpdateClient();
	
		updateClient.setIgnoreExternals(false);
	    SVNURL url;
		try {
			url = SVNURL.parseURIDecoded(this.repositoryUrl);
			File destPath = new File(this.workingCopyPath);
		    boolean isRecursive = true;
		    long revisionNumber = updateClient.doCheckout(url, destPath, null, null, isRecursive);
		    System.out.println("Success! [Revision: " + revisionNumber + "]");
		} catch (SVNException e) {
			e.printStackTrace();
		}
	}
}
