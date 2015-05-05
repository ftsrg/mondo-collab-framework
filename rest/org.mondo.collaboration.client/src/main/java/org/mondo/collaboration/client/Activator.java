package org.mondo.collaboration.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xml.type.impl.XMLTypeFactoryImpl;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "mondo.collab.client"; //$NON-NLS-1$
	static Client client;

	// The shared instance
	private static Activator plugin;

	private static String localRepoPath = "D:\\emfgit_local\\projects\\";
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	public void start(BundleContext context) throws Exception {
		plugin = this;

		client = new Client();
		{
			String url = "http://localhost:9090/services/emfgit";

			WebResource resource = client.resource(url);
			try {
				Builder builder = resource.accept("application/json");
				String helloString = builder.get(String.class);
				System.out.println(helloString);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IResourceChangeListener listener = new IResourceChangeListener() {
			public void resourceChanged(IResourceChangeEvent event) {
				System.out.println("IResourceChangeListener");
			}
		};
		workspace.addResourceChangeListener(listener);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public static Client getClient() {
		return client;
	}

	public static String getLocalRepositoryPath() {
		return localRepoPath;
	}

	public static boolean modelFolderIsEmpty(String projectName) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		String modelDirPath = workspace.getRoot().getLocation().toString() + "/" + projectName + "/model/";
		File modelDir = new File(modelDirPath);
		if(modelDir.exists()) {
			String[] models = modelDir.list();
			if(models.length < 1) {
				return true;
			}
		}
		return false;
	}

	// returns the merged model of the altered model in the project
	// and the corresponding model in the local repository
	public static File merge(String projectName, String branchName, boolean returnRepoFile /*TODO del*/) {
		// retrieval of the altered model
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		String modelDirPath = workspace.getRoot().getLocation().toString() + "/" + projectName + "/model/";
		System.out.println("workspace model dir: " + modelDirPath);
		File modelDir = new File(modelDirPath);

		// get the first file in the directory
		String[] models = modelDir.list();
		if(models.length < 1) {
			System.out.println("No files found in " + modelDir);
			return null;
		}
		
		String alteredModelPath = modelDirPath + "/" + models[0];
		System.out.println("alteredModelPath " + alteredModelPath);
		File workingCopyModel = new File(alteredModelPath);
		
		ResourceSet resourceSet = new ResourceSetImpl(); 
		URI fileURI = URI.createFileURI(alteredModelPath); 
		Resource resource = resourceSet.getResource(fileURI, true); 
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("key", new XMLTypeFactoryImpl());
		
		// retrieval of model in the local repository
		String repoModelPath = Activator.getLocalRepositoryPath() + projectName + "\\" + models[0];
		System.out.println(repoModelPath);
		File repoModel = new File(repoModelPath);
		
		return returnRepoFile ? repoModel : workingCopyModel;
	}
	
	public static String getBranchName(String projectName) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		File workspaceDirectory = workspace.getRoot().getLocation().toFile();
		File branchDir = new File(workspaceDirectory.getPath() + "\\" + projectName + "\\" 
			+ "\\branch\\");
		if(branchDir.exists()) {
			File[] files = branchDir.listFiles();
			return files[0].getName();
		}
		return null;
	}
	
	public static void saveFile(File fileToSave, String savePath) {
		try {
			System.out.println(savePath.substring(0, savePath.lastIndexOf("\\")));
			createOrCleanDir(savePath.substring(0, savePath.lastIndexOf("\\")));
			byte[] bytes = readContentIntoByteArray(fileToSave);
			FileOutputStream fos = new FileOutputStream(savePath);
			fos.write(bytes);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createOrCleanDir(String path) {
		File dir = new File(path);
		if(dir.exists()) {
			File[] files = dir.listFiles();
		    if(files!=null) { //some JVMs return null for empty dirs
		        for(File f: files) {
		            if(f.isDirectory()) {
		            	createOrCleanDir(f.getPath());
		            } else {
		                f.delete();
		            }
		        }
		    }
		    dir.delete();
		}
		dir.mkdirs();
	}
	
	private static byte[] readContentIntoByteArray(File file) {
		 FileInputStream fileInputStream = null;
		 byte[] bFile = new byte[(int) file.length()];
		 try {
			//convert file into array of bytes
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(bFile);
			fileInputStream.close();
		 }
		 catch (Exception e) {
		    e.printStackTrace();
		 }
		 return bFile;
	}
}
