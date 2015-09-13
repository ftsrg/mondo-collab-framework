package org.mondo.collaboration.security.mpbl.client.ui;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.mondo.collaboration.security.mpbl.client.ui.wizards.MondoPreferencePage;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.mondo.collaboration.security.mpbl.client.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		IPreferenceStore store = plugin.getPreferenceStore();
		
        store.setDefault(MondoPreferencePage.MONDO_ADDRESSES_PROPERTY, "http://mt.bme.hu/mondo");
        store.setDefault(MondoPreferencePage.MONDO_DELAY_PROPERTY, 10000);
        store.setDefault(MondoPreferencePage.MONDO_ENABLE_PROPERTY, true);
        store.setDefault(MondoPreferencePage.MONDO_EXTENSIONS_PROPERTY, "ecore;xmi;wtspec4m");
        store.setDefault(MondoPreferencePage.MONDO_TEMP_PROPERTY, "../temp");
        
  	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
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

}
