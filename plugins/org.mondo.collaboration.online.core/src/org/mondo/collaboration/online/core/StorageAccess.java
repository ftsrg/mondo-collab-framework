package org.mondo.collaboration.online.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.viatra.modelobfuscator.api.DataTypeObfuscator;
import org.eclipse.viatra.modelobfuscator.util.StringObfuscator;
import org.mondo.collaboration.online.core.StorageAccess.ExecutionResponse;
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

	private static final String PATH_TO_ACCESS_CONTROL_AND_LOCK_PLUGIN_FROM_REPOSITORY_ROOT = "PATH_TO_ACCESS_CONTROL_AND_LOCK_PLUGIN_FROM_REPOSITORY_ROOT";
	private static final String PATH_TO_LOCK_RULES_FROM_REPOSITORY_ROOT = "PATH_TO_LOCK_RULES_FROM_REPOSITORY_ROOT";
	private static final String PATH_TO_ACCESS_CONTROL_RULES_FROM_REPOSITORY_ROOT = "PATH_TO_ACCESS_CONTROL_RULES_FROM_REPOSITORY_ROOT";
	private static final String PATH_TO_ACCESS_CONTROL_AND_LOCK_QUERIES_FROM_REPOSITORY_ROOT = "PATH_TO_ACCESS_CONTROL_AND_LOCK_QUERIES_FROM_REPOSITORY_ROOT";
	private static final String MODEL_EXTENSIONS = "MODEL_EXTENSIONS";
	private static final String ADMIN_USER = "ADMIN_USER";
	private static final String ADMIN_PWD = "ADMIN_PWD";
	protected final String username;
	protected final String password;
	protected String repository;
	protected String repository_structure;
	protected String admin_username;
	protected String admin_password;
	
	protected final StringObfuscator obfuscator;

	private Logger logger = Logger.getLogger(StorageAccess.class);
	private StorageModel model;

	public static final String[] DEFAULT_EXTENSIONS = new String[] { "macl", "mpbl", "eiq" };
	private Properties configProperties;
	private Properties globalProperties;
	protected Properties usersProperties;
	private String workspace;
	
	public StorageAccess(String username, String password, String repository) throws FileNotFoundException, IOException {
		logger.setLevel(Level.ALL);
		
		this.username = username;
		this.password = password;
		this.repository = repository;
		
		obfuscator = new StringObfuscator(UUID.randomUUID().toString(), username);

		String scriptsLocation = System.getProperty("mondo.scripts.folder");
		if(scriptsLocation == null) {
			logger.error("MONDO Scripts location is not set. Please set it in the server.ini file.");
		}
		if(!this.repository.endsWith("/")) {
			this.repository += "/";
		}
		if(!this.repository.startsWith("http")) {
			this.repository = "http://" + this.repository;
		}
		
		ExecutionResponse response = internalExecuteProcess("./lookup-gold-repository.sh " + this.repository, new String[0], new File(scriptsLocation));
		String responseString = response.getResponseList().get(0);
		if(responseString.contains("Could not resolve location")) {
			logger.error(responseString);
		}
		
		Path globalConfigPath = Paths.get(scriptsLocation, "..", "config", "global-config.properties");
		File globalConfigFile = globalConfigPath.toFile();
		if(!globalConfigFile.exists()) {
			logger.error("Config file not exists for " + responseString);
		}		
		globalProperties = new Properties();
		globalProperties.load(new FileInputStream(globalConfigFile));
		admin_password = globalProperties.getProperty(ADMIN_PWD);
		admin_username = globalProperties.getProperty(ADMIN_USER);
		repository_structure = globalProperties.getProperty("URL").replace("'", "") + globalProperties.getProperty("SVN_URL_PATH");
		
		Path configPath = Paths.get(scriptsLocation, "..", "config", responseString, "config.properties");
		File configFile = configPath.toFile();
		if(!configFile.exists()) {
			logger.error("Config file not exists for " + responseString);
		}		
		configProperties = new Properties();
		configProperties.load(new FileInputStream(configFile));
		
		Path userConfigPath = Paths.get(scriptsLocation, "..", "config", responseString, "gen", "user_front.properties");
		File userConfigFile = userConfigPath.toFile();
		if(!userConfigFile.exists()) {
			logger.error("Config file not exists for " + responseString);
		}		
		usersProperties = new Properties();
		usersProperties.load(new FileInputStream(userConfigFile));
		
		Path workspacePath = Paths.get(scriptsLocation, "..", "workspace", "online");
		File workspaceFile = workspacePath.toFile();
		if(!workspaceFile.exists()) {
			workspaceFile.mkdirs();
		}
		workspace = workspacePath.toString();
		if(!workspace.endsWith(File.separator)) {
			workspace += File.separator;
		}
		
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
			e.printStackTrace();
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
	public String getRepository() {
		return repository;
	}

	/**
	 * Returns the lens specific extension
	 * 
	 * @return the lens specific extension
	 */
	public String[] getExtensions() {
		List<String> retExtensions = Lists.newArrayList(configProperties.getProperty(MODEL_EXTENSIONS).split(","));
		retExtensions.addAll(Arrays.asList(DEFAULT_EXTENSIONS));
		return retExtensions.toArray(new String[0]);
	}

	/**
	 * Returns a temporary folder, where the application can store files
	 * 
	 * @return a temporary folder, where the application can store files
	 */
	public String getTempFolder() {
		return workspace;
	}

	/**
	 * Returns the Eiq file location to be check out
	 * 
	 * @return the Eiq file location to be check out
	 */
	public String getEiqFile() {
		return repository + configProperties.getProperty(PATH_TO_ACCESS_CONTROL_AND_LOCK_QUERIES_FROM_REPOSITORY_ROOT)
				.replace("$" + PATH_TO_ACCESS_CONTROL_AND_LOCK_PLUGIN_FROM_REPOSITORY_ROOT, 
						configProperties.getProperty(PATH_TO_ACCESS_CONTROL_AND_LOCK_PLUGIN_FROM_REPOSITORY_ROOT));
	}

	/**
	 * Returns the MACL file location to be check out
	 * 
	 * @return the MACL file location to be check out
	 */
	public String getMaclFile() {
		return repository + configProperties.getProperty(PATH_TO_ACCESS_CONTROL_RULES_FROM_REPOSITORY_ROOT)
				.replace("$" + PATH_TO_ACCESS_CONTROL_AND_LOCK_PLUGIN_FROM_REPOSITORY_ROOT, 
						configProperties.getProperty(PATH_TO_ACCESS_CONTROL_AND_LOCK_PLUGIN_FROM_REPOSITORY_ROOT));
		}
	
	/**
	 * Returns the MPBL file location to be check out
	 * 
	 * @return the MPBL file location to be check out
	 */
	public String getMpblFile() {
		return repository + configProperties.getProperty(PATH_TO_LOCK_RULES_FROM_REPOSITORY_ROOT)
				.replace("$" + PATH_TO_ACCESS_CONTROL_AND_LOCK_PLUGIN_FROM_REPOSITORY_ROOT, 
						configProperties.getProperty(PATH_TO_ACCESS_CONTROL_AND_LOCK_PLUGIN_FROM_REPOSITORY_ROOT));
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
