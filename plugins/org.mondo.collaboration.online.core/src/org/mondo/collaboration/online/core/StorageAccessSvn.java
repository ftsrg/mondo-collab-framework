package org.mondo.collaboration.online.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
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
	public static final String SVN_LOCK_COMMAND = "svn lock %s --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_UNLOCK_COMMAND = "svn unlock %s --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_COMMIT_COMMAND = "svn commit %s -m \"%s\" --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_STATUS_COMMAND = "svn status %s --username=%s --password=%s --non-interactive --no-auth-cache";
	
	public static final String SVN_DEFAULT_MESSAGE = "Committed by %s at %s";	
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
	public Collection<StorageModelNode> explore(StorageModel model, String path, StorageModelNode parent, String gold) {
		List<StorageModelNode> nodes = new ArrayList<StorageModelNode>();
		Collection<String> entries = Collections.emptyList();
		try {
			entries = internalExecuteProcess(String.format(SVN_LIST_COMMAND, path, getUsername(), getPassword()));
		} catch (Exception e) {
			logger.error(e, e);
		}
		
		for (String entry : entries) {
			if(entry.endsWith("/")) {
				entry = entry.substring(0, entry.length()-1);
				nodes.add(new StorageModelNode(model, entry, path + "/" + entry, NodeType.Folder, parent, this, gold + "/" + entry));
			}
			if(entry.endsWith(getExtension())) {
				nodes.add(new StorageModelNode(model, entry, path + "/" + entry, checkType(path + "/" + entry), parent, this, gold + "/" + entry));
			}
		}
		return nodes;
	}

	
	NodeType checkType(String url) {
		URI uri = URI.createFileURI(internalCheckoutFile(url, false));
		if(new File(uri.toFileString()).exists()) {
			return internalStatus(uri.toFileString());
		} else {
			return NodeType.NoModification;
		}
	}
	
	// TODO decide whether modification status should be stored
	public NodeType internalStatus(String path) {
		URI fullUri = URI.createFileURI(path);
		String file = fullUri.lastSegment();
		String folder = replaceLast(path, file, "");
		
		Collection<String> result = internalExecuteProcess(String.format(SVN_STATUS_COMMAND, file, getUsername(), getPassword()), new String[] {}, new File(folder));
		if(result.isEmpty())
			return NodeType.NoModification;
		return NodeType.NoModification;
	}
	
	@Override
	public StorageModelNode updateNode(String path) {
		String entryPath = replaceFirst(path, getTempFolder(), getRepository()).replace(File.separator, "/");
		StorageModelNode storageModelNode = explore().getNodeMapping().get(entryPath);
		storageModelNode.setType(checkType(entryPath));
		return storageModelNode;
	}
	
	@Override
	public StorageModelNode updateNode(StorageModelNode node) {
		node.setType(checkType(node.getPath()));
		return node;
	}
	
	@Override
	public URI startSession(String path) throws Exception {
		Assert.isLegal(path.endsWith(getExtension()));
		internalEiq = URI.createFileURI(internalCheckoutFile(getEiqFile()));
		internalMacl = URI.createFileURI(internalCheckoutFile(getMaclFile()));
		String filePath = internalCheckoutFile(path);
		internalLockFile(filePath);
		return URI.createFileURI(filePath);
	}

	private void internalLockFile(String path) {
		URI fullUri = URI.createURI(path);
		String file = fullUri.lastSegment();
		String folder = replaceLast(path, file, "");
		
		internalExecuteProcess(String.format(SVN_LOCK_COMMAND, file, getUsername(), getPassword()), new String[] {}, new File(folder));
	}
	
	private String internalCheckoutFile(String path) throws Exception {
		return internalCheckoutFile(path, true);
	}
	
	private String internalCheckoutFile(String path, boolean doCheckout) {
		URI fullUri = URI.createURI(path);
		String file = fullUri.lastSegment();
		String folder = replaceLast(path, file, "");
		String temp = replaceFirst(folder, getRepository(), getTempFolder()).replace("/", File.separator);
		
		if(doCheckout) {
			if(!new File(temp).exists())
				internalExecuteProcess(String.format(SVN_CHECKOUT_COMMAND, folder, temp, getUsername(), getPassword()), new String[] {}, new File(getTempFolder()));
			internalExecuteProcess(String.format(SVN_UPDATE_COMMAND, file, getUsername(), getPassword()), new String[] {}, new File(temp));
		}
		return temp+file;
	}
	
	@Override
	public void finishSession(String path) {
		Date date= new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		internalFinishSession(path, String.format(SVN_DEFAULT_MESSAGE, getUsername(), dateFormat.format(date)));
	}
	
	protected String internalFinishSession(String path, String msg) {
		URI fullUri = URI.createURI(path);
		String file = fullUri.lastSegment();
		String folder = replaceLast(path, file, "");
		String temp = replaceFirst(folder, getRepository(), getTempFolder()).replace("/", File.separator);
		
		internalExecuteProcess(String.format(SVN_COMMIT_COMMAND, file, msg, getUsername(), getPassword()), new String[] {}, new File(temp));
		internalExecuteProcess(String.format(SVN_UNLOCK_COMMAND, file, getUsername(), getPassword()), new String[] {}, new File(temp));
		
		return "Success";
	}
	
	protected String replaceLast(String original, String from, String to) {
		int lastIndexOf = original.lastIndexOf(from);
		return new StringBuilder(original).replace(lastIndexOf, lastIndexOf+from.length(), to).toString();
	}
	
	protected String replaceFirst(String original, String from, String to) {
		int firstIndexOf = original.indexOf(from);
		return new StringBuilder(original).replace(firstIndexOf, firstIndexOf+from.length(), to).toString();
	}
	
	@Override
	protected URI getInternalEiqFile() {
		return internalEiq;
	}


	@Override
	protected URI getInternalMaclFile() {
		return internalMacl;
	}


	@Override
	public void commit(String path, String msg) {
		URI fullUri = URI.createURI(path);
		String file = fullUri.lastSegment();
		String folder = replaceLast(fullUri.toFileString(), file, "");
		
		internalExecuteProcess(String.format(SVN_COMMIT_COMMAND, file, msg, getUsername(), getPassword()), new String[] {}, new File(folder));
	}
}
