package org.mondo.collaboration.online.core;

import java.net.URL;

import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.viatra.query.patternlanguage.PatternLanguageStandaloneSetup;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.mondo.collaboration.policy.RulesStandaloneSetup;
import org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLockingStandaloneSetup;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class LensActivator extends Plugin implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.mondo.collaboration.online.core"; //$NON-NLS-1$
	
	// The shared instance
	private static LensActivator plugin;

	/**
	 * The constructor
	 */
	public LensActivator() {

	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

//		URL confURL = getBundle().getEntry("log4j.properties");
//		PropertyConfigurator.configure(FileLocator.toFileURL(confURL).getFile());

		RulesStandaloneSetup.doSetup();
		MondoPropertyBasedLockingStandaloneSetup.doSetup();
		PatternLanguageStandaloneSetup.doSetup();
		EMFPatternLanguageStandaloneSetup.doSetup();
		
		LensSessionManager.initializeHttpSessionListener();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static LensActivator getDefault() {
		return plugin;
	}
}
