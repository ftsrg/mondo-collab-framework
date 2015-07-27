package org.mondo.collaboration.online.emfhandler.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private ServiceRegistration<OnlineResource> registration;
	
	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		registration = bundleContext.registerService(OnlineResource.class, new OnlineResource(), null);
		
		ResourceBundle rb = ResourceBundle.getBundle("modelspath");
		String inputPath = rb.getString("input_path");
		String outputPath = rb.getString("output_path");
		String tmpPath = rb.getString("temporary_folder_path");
		
		if(!inputPath.equals("") && inputPath != null) {
			if(!new File(inputPath).exists()) {
				System.out.println("Path \"" + inputPath + "\" does not exist.");
				return;
			}
			OnlineResource.inputFolderPath = inputPath;
		} else {
			System.out.println("Missing definition of input models' folder path from \"modelspath.properties\" file.");
		}
		
		if(!outputPath.equals("") && outputPath != null) {
			if(!new File(outputPath).exists()) {
				System.out.println("Path \"" + outputPath + "\" does not exist.");
				return;
			}
			OnlineResource.outputFolderPath = outputPath;
		} else {
			System.out.println("Missing definition of output models' folder from \"modelspath.properties\" file.");
		}
		
		if(!tmpPath.equals("") && tmpPath != null) {
			if(!new File(tmpPath).exists()) {
				System.out.println("Path \"" + tmpPath + "\" does not exist.");
				return;
			}
			OnlineResource.tmpFolderPath = tmpPath;
		} else {
			System.out.println("Missing definition of temporary folder path from \"modelspath.properties\" file.");
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		registration.unregister();
	}
}
