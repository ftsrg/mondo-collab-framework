package org.mondo.collaboration.online.core;
import java.net.URL;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.mondo.collaboration.security.lens.bx.OnlineCollaborationSession;
import org.mondo.collaboration.security.lens.bx.OnlineCollaborationSession.Leg;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.google.common.collect.Maps;

public class LensActivator extends Plugin implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.mondo.collaboration.online.core"; //$NON-NLS-1$

	// The shared instance
	private static LensActivator plugin;
	
	private static Logger logger = Logger.getLogger(LensActivator.class);
	
	private static Map<URI, OnlineCollaborationSession> modelSessions = Maps.newHashMap();
	 
	/**
	 * The constructor
	 */
	public LensActivator() {
		
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
	public static LensActivator getDefault() {
		return plugin;
	}
	
	public static Map<URI, OnlineCollaborationSession> getModelSessions() {
		return modelSessions;
	}
	
	public static void initializeSession(URI goldURI, ResourceSet resourceSet) {
		
		// TODO resourcePolicy

		try {
			OnlineCollaborationSession onlineCollaborationSession = new OnlineCollaborationSession(goldURI, resourceSet, EObjectCorrespondence.getRegisteredIDProviderFactory(), null);
			modelSessions.put(goldURI, onlineCollaborationSession);
		} catch (IncQueryException | CoreException e) {
			logger.error("Error during online session initialization",e);
		}
		
	}
	
	public static Resource getOrCreateResource(URI goldURI) {
		// TODO provide username here
		// TODO provide DataTypeObfuscator
		Leg leg = getModelSessions().get(goldURI).new Leg("Alice", null);
		// We assume that the root resource is the first in this list
		return leg.getFrontResourceSet().getResources().get(0);
	}
	
}
