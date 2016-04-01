package org.mondo.collaboration.online.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.viatra.modelobfuscator.api.DataTypeObfuscator;
import org.eclipse.viatra.modelobfuscator.util.StringObfuscator;
import org.mondo.collaboration.online.core.StorageModel.StorageModelNode;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

/**
 * Classes inherited from StorageAccess responsible for accessing to the
 * underlying repositories.
 * 
 * @author Csaba Debreceni
 *
 */
public abstract class StorageAccess {

	protected final String username;
	protected final String password;

	protected final StringObfuscator obfuscator;

	private Logger logger = Logger.getLogger(StorageAccess.class);
	private StorageModel model;

	public static final String[] DEFAULT_EXTENSIONS = new String[] { "macl", "mpbl", "eiq" };
	
	public StorageAccess(String username, String password) throws FileNotFoundException, IOException {
		this.username = username;
		this.password = password;

		obfuscator = new StringObfuscator(UUID.randomUUID().toString(), username);

		logger.info("Storage access is created for " + username);
	}

	/**
	 * Testing the credentials. This is not required for other methods to be
	 * called as they also use the credentials.
	 * 
	 * @return null if the login was successful, otherwise the error message to
	 *         be displayed for the user
	 */
	public abstract String login();

	/**
	 * Provides a storage model which stores the element of the repository.
	 * 
	 * @return
	 * @throws Exception
	 */
	public StorageModel explore() {
		if(this.model == null) {
			this.model = new StorageModel(this);
		}
		return this.model;
	}

	/**
	 * Explores the repository in context of the path.
	 * 
	 * @param path
	 *            in the repository
	 * @param gold 
	 * 			  model file location in the repository
	 * @throws Exception
	 */
	public abstract Collection<StorageModelNode> explore(StorageModel model, String path, StorageModelNode parent, String gold);

	public abstract URI startSession(String path) throws Exception;

	public abstract FileStatus checkFileStatus(String path) throws Exception;
	
	public List<Resource> loadPolicyAndLockModels() {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		resourceSet.getResource(getInternalEiqFile(), true);
		Resource policy = resourceSet.getResource(getInternalMaclFile(), true);
		Resource lock = resourceSet.getResource(getInternalMpblFile(), true);
		ArrayList<Resource> policyAndLock = Lists.newArrayList();
		policyAndLock.add(policy);
		policyAndLock.add(lock);
		return policyAndLock;
	}

	protected ExecutionResponse internalExecuteProcess(String cmd) throws Exception {
		return internalExecuteProcess(new String[] {cmd}, new String[] {}, null);
	}

	protected ExecutionResponse internalExecuteProcess(String cmd, String[] args, File ctx) {
		return internalExecuteProcess(new String[] {cmd}, args, ctx);
	}
	protected ExecutionResponse internalExecuteProcess(String[] cmd, String[] args, File ctx) {
		logger.info("Process executing:");
		for (String command : cmd) {
			logger.info("-> Command: " + command);
		}
		logger.info("-> Context: " + (ctx == null ? "@null" : ctx.getPath()));

		List<String> responseList = new ArrayList<String>();
		List<String> errorList = new ArrayList<String>();
		try {
			String line;
			Process p = cmd.length == 1 ? Runtime.getRuntime().exec(cmd[0], args, ctx) : Runtime.getRuntime().exec(cmd, args, ctx);
			{
				BufferedReader bre = new BufferedReader(new InputStreamReader(p.getErrorStream()));
				while ((line = bre.readLine()) != null) {
					errorList.add(line);
					logger.info("---> Error: " + line);
				}
				bre.close();
			}
			{
				BufferedReader bri = new BufferedReader(new InputStreamReader(p.getInputStream()));
				while ((line = bri.readLine()) != null) {
					responseList.add(line);
					logger.info("---> Response: " + line);
				}
				bri.close();
			}
			p.waitFor();
			logger.info("Process finished");
		} catch (Exception e) {
			logger.error("Process failed", e);
		}
		return new ExecutionResponse(errorList, responseList);
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

	/**
	 * Returns the repository location
	 * 
	 * @return the repository location
	 */
	public static String getRepository() {
		String retBundle = LensActivator.getDefault().getBundle().getBundleContext().getProperty("mondo.repository.gold");
		String retSystem = System.getProperty("mondo.repository.gold");
		return retBundle == null ? retSystem : retBundle;
	}

	/**
	 * Returns the lens specific extension
	 * 
	 * @return the lens specific extension
	 */
	public static String[] getExtensions() {
		String retBundle = LensActivator.getDefault().getBundle().getBundleContext().getProperty("mondo.extensions");
		String retSystem = System.getProperty("mondo.extensions");
		List<String> retExtensions = Lists.newArrayList(retBundle == null ? retSystem.split(",") : retBundle.split(","));
		retExtensions.addAll(Arrays.asList(DEFAULT_EXTENSIONS));
		return retExtensions.toArray(new String[0]);
	}

	/**
	 * Returns a temporary folder, where the application can store files
	 * 
	 * @return a temporary folder, where the application can store files
	 */
	public static String getTempFolder() {
		String retBundle = LensActivator.getDefault().getBundle().getBundleContext().getProperty("mondo.workspace.folder");
		String retSystem = System.getProperty("mondo.workspace.folder");
		return retBundle == null ? retSystem : retBundle;
	}

	/**
	 * Returns the Eiq file location to be check out
	 * 
	 * @return the Eiq file location to be check out
	 */
	public static String getEiqFile() {
		String retBundle = LensActivator.getDefault().getBundle().getBundleContext().getProperty("mondo.eiq");
		String retSystem = System.getProperty("mondo.eiq");
		return retBundle == null ? retSystem : retBundle;
	}

	/**
	 * Returns the MACL file location to be check out
	 * 
	 * @return the MACL file location to be check out
	 */
	public static String getMaclFile() {
		String retBundle = LensActivator.getDefault().getBundle().getBundleContext().getProperty("mondo.macl");
		String retSystem = System.getProperty("mondo.macl");
		return retBundle == null ? retSystem : retBundle;
	}
	
	/**
	 * Returns the MPBL file location to be check out
	 * 
	 * @return the MPBL file location to be check out
	 */
	public static String getMpblFile() {
		String retBundle = LensActivator.getDefault().getBundle().getBundleContext().getProperty("mondo.mpbl");
		String retSystem = System.getProperty("mondo.mpbl");
		return retBundle == null ? retSystem : retBundle;
	}

	/**
	 * Returns the path of Eiq file on the file system.
	 * 
	 * @return the path of Eiq file on the file system.
	 */
	protected abstract URI getInternalEiqFile();

	/**
	 * Returns the path of Macl file on the file system.
	 * 
	 * @return the path of Macl file on the file system.
	 */
	protected abstract URI getInternalMaclFile();
	
	/**
	 * Returns the path of MPBL file on the file system.
	 * 
	 * @return the path of MPBL file on the file system.
	 */
	protected abstract URI getInternalMpblFile();

	/**
	 * Returns the user specific obfuscator
	 * 
	 * @return the user specific obfuscator
	 */
	public DataTypeObfuscator<String> getObfuscator() {
		return obfuscator;
	}
	
	/**
	 * Finishes the session.
	 */
	public abstract void finishSession(URI goldConfimentUri, String ownerUsername, String ownerPassword);
	
	/**
	 * Commits the changes made to the model.
	 * @param path to the model
	 */
	public abstract ExecutionResponse commit(String path, String message, OnlineLeg leg);
	
	/**
	 * Commits the changes made to the model.
	 * @param path to the model
	 */
	public abstract ExecutionResponse commit(String path, String message, String username, String password);
	
	/**
	 * Commits the changes made to the model.
	 * @param path to the model
	 */
	public abstract ExecutionResponse revert(String path, String username, String password);
	
	public static enum FileStatus {
		Modified, Normal
	}
	
	/**
	 * This class represents the response of an executed command.
	 * 
	 * @author Csaba Debreceni
	 *
	 */
	public static class ExecutionResponse {
		List<String> errorList;
		List<String> responseList;
		
		public ExecutionResponse(List<String> errorList, List<String> responseList) {
			super();
			this.errorList = errorList;
			this.responseList = responseList;
		}
		
		public List<String> getErrorList() {
			return ImmutableList.copyOf(errorList);
		}
		
		public List<String> getResponseList() {
			return ImmutableList.copyOf(responseList);
		}
		
		public boolean hasError() {
			return !errorList.isEmpty();
		}
		
	}

	
}
