package org.mondo.collaboration.online.rap.widgets;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.mondo.collaboration.online.rap.widgets"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	@Override
	protected void initializeImageRegistry(ImageRegistry reg) {
		super.initializeImageRegistry(reg);

		reg.put("folder", AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, "icons/folder.gif"));
		reg.put("file", AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, "icons/model_file.gif"));
		reg.put("active", AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, "icons/active.png"));
		reg.put("inactive", AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, "icons/inactive.png"));
		reg.put("offline", AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, "icons/offline.png"));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.
	 * BundleContext)
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
