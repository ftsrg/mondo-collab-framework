package org.mondo.collaboration.online.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.viatra.modelobfuscator.api.DataTypeObfuscator;
import org.eclipse.viatra.modelobfuscator.util.StringObfuscator;
import org.mondo.collaboration.online.core.StorageModel.StorageModelNode;

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
	public abstract Collection<StorageModelNode> explore(String path, StorageModelNode parent) throws Exception;

	public abstract URI startSession(String path) throws Exception;

	public Resource loadPolicyModel() {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		resourceSet.getResource(getInternalEiqFile(), true);
		return resourceSet.getResource(getInternalMaclFile(), true);
	}

	protected Collection<String> internalExecuteProcess(String cmd) throws Exception {
		return internalExecuteProcess(cmd, new String[] {}, null);
	}

	protected Collection<String> internalExecuteProcess(String cmd, String[] args, File ctx) {
		logger.info("Process executing:");
		logger.info("-> Command: " + cmd);
		logger.info("-> Context: " + (ctx == null ? "@null" : ctx.getPath()));

		List<String> list = new ArrayList<String>();
		try {
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
	
			if (!list.isEmpty())
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
		} catch (Exception e) {
			logger.error("Process failed", e);
		}
		return list;
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
		String ret = LensActivator.getDefault().getBundle().getBundleContext().getProperty("mondo.repository.gold");
		return ret == null ? "http://127.0.0.1/svn/wt-demo" : ret;
	}

	/**
	 * Returns the lens specific extension
	 * 
	 * @return the lens specific extension
	 */
	public static String getExtension() {
		String ret = LensActivator.getDefault().getBundle().getBundleContext().getProperty("mondo.extension");
		return ret == null ? "wtspec4m" : ret;
	}

	/**
	 * Returns a temporary folder, where the application can store files
	 * 
	 * @return a temporary folder, where the application can store files
	 */
	public static String getTempFolder() {
		String ret = LensActivator.getDefault().getBundle().getBundleContext().getProperty("mondo.temporary.folder");
		return ret == null ? "/mondo/online/temp" : ret;
	}

	/**
	 * Returns the Eiq file location to be check out
	 * 
	 * @return the Eiq file location to be check out
	 */
	public static String getEiqFile() {
		String ret = LensActivator.getDefault().getBundle().getBundleContext().getProperty("mondo.eiq");
		return ret == null ? "http://127.0.0.1/svn/wt-demo/macl.project/src/macl/project/queries.eiq" : ret;
	}

	/**
	 * Returns the MACL file location to be check out
	 * 
	 * @return the MACL file location to be check out
	 */
	public static String getMaclFile() {
		String ret = LensActivator.getDefault().getBundle().getBundleContext().getProperty("mondo.macl");
		return ret == null ? "http://127.0.0.1/svn/wt-demo/macl.project/src/macl/project/rules.macl" : ret;
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
	 * Returns the user specific obfuscator
	 * 
	 * @return the user specific obfuscator
	 */
	public DataTypeObfuscator<String> getObfuscator() {
		return obfuscator;
	}
}
