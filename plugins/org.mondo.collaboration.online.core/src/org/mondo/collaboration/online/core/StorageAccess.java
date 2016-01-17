package org.mondo.collaboration.online.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.URI;
import org.mondo.collaboration.online.core.StorageModel.NodeType;
import org.mondo.collaboration.online.core.StorageModel.StorageModelNode;

/**
 * Classes inherited from StorageAccess responsible for accessing to the
 * underlying repositories.
 * 
 * @author Csaba Debreceni
 *
 */
public class StorageAccess {

	protected final String username;
	protected final String password;
	
	private Logger logger = Logger.getLogger(StorageAccess.class);
	
	public StorageAccess(String username, String password) throws FileNotFoundException, IOException {
		this.username = username;
		this.password = password;
		
		logger.info("Storage access is created for " + username);
	}

	public static final String SVN_LIST_COMMAND = "svn list %s --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_CHECKOUT_COMMAND = "svn checkout %s --depth empty --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_CLEANUP_COMMAND = "svn cleanup --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_UPDATE_COMMAND = "svn up %s --username=%s --password=%s --non-interactive --no-auth-cache";
	public static final String SVN_LOG_COMMAND = "svn log %s --username=%s --password=%s --non-interactive --no-auth-cache";
	
	public static final String ERROR_SVN_LOGIN = "Authentication failed";
	
	/**
	 * Testing the credentials. This is not required for other methods to be
	 * called as they also use the credentials.
	 * 
	 * @return true if the login was successful, otherwise false
	 */
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
		logger.error("-> Response: OK");
		return null;
	}

	private Collection<String> internalLoginProcess() throws Exception {
		return internalExecuteProcess(String.format(SVN_LOG_COMMAND, getRepository(), getUsername(), getPassword()));
	}

	/**
	 * Provides a storage model which stores the element of the repository.
	 * 
	 * @return
	 * @throws Exception 
	 */
	public StorageModel explore() throws Exception {
		return new StorageModel(this);
	}

	/**
	 * Explores the repository in context of the path.
	 * 
	 * @param path
	 *            in the repository
	 * @throws Exception 
	 */
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

	public URI startSession(String path) throws Exception {
		return URI.createFileURI(internalCheckoutFile(path));
	}
	
	private String internalCheckoutFile(String path) throws Exception {
		Assert.isLegal(path.endsWith(getExtension()));
		URI fullUri = URI.createURI(path);
		String file = fullUri.lastSegment();
		String folder = replaceLast(path, file, "");
		String temp = folder.replaceFirst(getRepository(), getTempFolder());
		
		internalExecuteProcess(String.format(SVN_CHECKOUT_COMMAND, folder, getUsername(), getPassword()), new String[] {}, new File(getTempFolder()));
		internalExecuteProcess(String.format(SVN_UPDATE_COMMAND, file, getUsername(), getPassword()), new String[] {}, new File(temp));
		
		return temp+file;
	}
	
	private Collection<String> internalExecuteProcess(String cmd) throws Exception {
		return internalExecuteProcess(cmd, new String[] {}, null);
	}
	
	private Collection<String> internalExecuteProcess(String cmd, String[] args, File ctx) throws Exception {
		logger.info("Process executing:");
		logger.info("-> Command: "+ cmd);
		logger.info("-> Context: "+ (ctx == null ? "@null" : ctx.getPath()));
		
		List<String> list = new ArrayList<String>();
		String line;
		Process p = Runtime.getRuntime().exec(cmd, args, ctx);
		{
			BufferedReader bre = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			while ((line = bre.readLine()) != null) {
				list.add(line);
				logger.info("---> Error: " + line);
			}
			bre.close();
		}
		
		if(!list.isEmpty())
			return list;
		
		{
			BufferedReader bri = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((line = bri.readLine()) != null) {
				list.add(line);
				logger.info("---> Response: " + line);
			}
			bri.close();
		}
		p.waitFor();
		logger.info("Process finished");
		return list;
	}
	
	private String replaceLast(String original, String from, String to) {
		int lastIndexOf = original.lastIndexOf(from);
		return new StringBuilder(original).replace(lastIndexOf, lastIndexOf+from.length(), to).toString();
	}
	
	/**
	 * Getter for username
	 * 
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Getter for password
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	public String getRepository() {
		String ret =  Activator.getDefault().getBundle().getBundleContext().getProperty("mondo.repository.gold");
		return ret == null ? "http://mondo.inf.mit.bme.hu/svn/wt-demo" : ret;
	}
	
	public String getExtension() {
		String ret = Activator.getDefault().getBundle().getBundleContext().getProperty("mondo.extension");
		return ret == null ? "wtspec4m" : ret;
	}

	public String getTempFolder() {
		String ret = Activator.getDefault().getBundle().getBundleContext().getProperty("mondo.temporary.folder");
		return ret == null ? "/mondo/online/temp" : ret;
	}
}
