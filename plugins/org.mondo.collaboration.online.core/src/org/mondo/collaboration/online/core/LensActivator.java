package org.mondo.collaboration.online.core;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.incquery.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.mondo.collaboration.security.lens.bx.online.OnlineCollaborationSession;
import org.mondo.collaboration.security.lens.bx.online.OnlineCollaborationSession.Leg;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence;
import org.mondo.collaboration.security.macl.xtext.AccessControlLanguageStandaloneSetup;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.google.common.collect.Maps;

public class LensActivator extends Plugin implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.mondo.collaboration.online.core"; //$NON-NLS-1$
	public static final String LENS_COMMAND_TITLE = "Lens Command"; //$NON-NLS-1$
	public static final String LENS_COMMAND_DESCRIPTION = "This is a command executed by the lens transformation. It cannot be reverted."; //$NON-NLS-1$

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

		AccessControlLanguageStandaloneSetup.doSetup();
		EMFPatternLanguageStandaloneSetup.doSetup();

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

	/**
	 * Initializes an {@link OnlineCollaborationSession} and stores in
	 * {@link LensActivator#getModelSessions()} map
	 * 
	 * @param goldURI
	 *            that points to the gold model
	 * @param sa
	 *            that provides policy model configuration
	 */
	public static void initializeSession(URI goldURI, StorageAccess sa) {
		logger.info(String.format("Lens is creating for uri: %s", goldURI.toString()));
		try {
			Resource policyModel = sa.loadPolicyModel();
			ResourceSetImpl rSet = new ResourceSetImpl();
			rSet.getResource(goldURI, true);
			OnlineCollaborationSession onlineCollaborationSession = new OnlineCollaborationSession(goldURI, rSet,
					EObjectCorrespondence.getRegisteredIDProviderFactory(), policyModel);
			modelSessions.put(goldURI, onlineCollaborationSession);
		} catch (IncQueryException | CoreException e) {
			logger.error("Error during online session initialization", e);
		}

	}

	/**
	 * Returns user specific front {@link Leg}
	 * 
	 * @return user specific front {@link Leg}
	 */
	public static Leg getOrCreateResource(URI goldURI, EditingDomain domain, ILegCallback callback, StorageAccess sa) {
		logger.info(String.format("Leg is creating for user: %s uri: %s", sa.getUsername(), goldURI.toString()));
		try {
			Leg leg = new OnlineLeg(getModelSessions().get(goldURI), sa.getUsername(), sa.getObfuscator(), true, domain,
					OnlineCollaborationSession.FAKE_MAIN_RESOURCE_URI, callback);
			logger.info("Successfully finished");
			return leg;
		} catch (InvocationTargetException e) {
			logger.error("Error during lens execution", e);
		}
		return null;
	}

}
