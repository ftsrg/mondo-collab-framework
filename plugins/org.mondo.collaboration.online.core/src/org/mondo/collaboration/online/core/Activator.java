package org.mondo.collaboration.online.core;
import java.net.URL;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
import org.mondo.collaboration.security.lens.bx.OnlineCollaborationSession;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.google.common.collect.Maps;

public class Activator extends Plugin implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.mondo.collaboration.online.core"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private Logger logger = Logger.getLogger(Activator.class);
	
	private static Map<URI, OnlineCollaborationSession> modelSessions = Maps.newHashMap();
	 
	/**
	 * The constructor
	 */
	public Activator() {
	}

	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		URL confURL = getBundle().getEntry("log4j.properties");
		PropertyConfigurator.configure(FileLocator.toFileURL(confURL).getFile());
		
		logger.info(PLUGIN_ID + " is activated");
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
		logger.info(PLUGIN_ID + " is stopped");
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	public static Map<URI, OnlineCollaborationSession> getModelSessions() {
		return modelSessions;
	}
}
