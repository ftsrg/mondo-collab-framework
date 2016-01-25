package org.mondo.collaboration.online.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.URI;
import org.mondo.collaboration.online.core.StorageModel.NodeType;
import org.mondo.collaboration.online.core.StorageModel.StorageModelNode;

public class StorageAccessSvn extends StorageAccess {

	public StorageAccessSvn(String username, String password) throws FileNotFoundException, IOException {
		super(username, password);
	}

	public static final String SVN_LIST_COMMAND = "svn list %s --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_CHECKOUT_COMMAND = "svn checkout %s %s --depth empty --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_CLEANUP_COMMAND = "svn cleanup --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_UPDATE_COMMAND = "svn up %s --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_LOG_COMMAND = "svn log %s --username=%s --password=%s --non-interactive --no-auth-cache";
	
	public static final String ERROR_SVN_LOGIN = "Authentication failed";
	
	private Logger logger = Logger.getLogger(StorageAccessSvn.class);
	private URI internalEiq;
	private URI internalMacl;
	
	@Override
	public String login() {
		logger.info("Login request sent in name of " + username);
		try {
			Collection<String> response = internalLoginProcess();
			if(response.contains(ERROR_SVN_LOGIN)) {
				logger.error("-> Response: " + ERROR_SVN_LOGIN);
				return ERROR_SVN_LOGIN;
			}
		} catch (Exception e) {
			logger.error("-> Response: Internal error during login", e);
		}
		logger.info("-> Response: OK");
		return null;
	}

	
	private Collection<String> internalLoginProcess() throws Exception {
		return internalExecuteProcess(String.format(SVN_LOG_COMMAND, getRepository(), getUsername(), getPassword()));
	}

	/**
	 * Explores the repository in context of the path.
	 * 
	 * @param path
	 *            in the repository
	 * @throws Exception 
	 */
	@Override
	public Collection<StorageModelNode> explore(String path, StorageModelNode parent) throws Exception {
		List<StorageModelNode> nodes = new ArrayList<StorageModelNode>();
		Collection<String> entries = internalExecuteProcess(String.format(SVN_LIST_COMMAND, path, getUsername(), getPassword()));
		
		for (String entry : entries) {
			if(entry.endsWith("/")) {
				entry = entry.substring(0, entry.length()-1);
				nodes.add(new StorageModelNode(entry, path + "/" + entry, NodeType.Folder, parent, this));
			}
			if(entry.endsWith(getExtension())) {
				nodes.add(new StorageModelNode(entry, path + "/" + entry, NodeType.ModelNoSession, parent, this));
			}
		}
		return nodes;
	}

	@Override
	public URI startSession(String path) throws Exception {
		Assert.isLegal(path.endsWith(getExtension()));
		internalEiq = URI.createFileURI(internalCheckoutFile(getEiqFile()));
		internalMacl = URI.createFileURI(internalCheckoutFile(getMaclFile()));
		return URI.createFileURI(internalCheckoutFile(path));
	}

	private String internalCheckoutFile(String path) throws Exception {
		URI fullUri = URI.createURI(path);
		String file = fullUri.lastSegment();
		String folder = replaceLast(path, file, "");
		String temp = folder.replaceFirst(getRepository(), getTempFolder());
		
		if(!new File(temp).exists())
			internalExecuteProcess(String.format(SVN_CHECKOUT_COMMAND, folder, temp, getUsername(), getPassword()), new String[] {}, new File(getTempFolder()));
		if(!new File(temp+file).exists())
			internalExecuteProcess(String.format(SVN_UPDATE_COMMAND, file, getUsername(), getPassword()), new String[] {}, new File(temp));
		
		return temp+file;
	}
	
	protected String replaceLast(String original, String from, String to) {
		int lastIndexOf = original.lastIndexOf(from);
		return new StringBuilder(original).replace(lastIndexOf, lastIndexOf+from.length(), to).toString();
	}


	@Override
	protected URI getInternalEiqFile() {
		return internalEiq;
	}


	@Override
	protected URI getInternalMaclFile() {
		return internalMacl;
	}
}
