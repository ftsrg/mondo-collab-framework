package org.mondo.collaboration.online.rap.widgets;

import java.util.Hashtable;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.eclipse.equinox.http.servlet.HttpServiceServlet;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	private static final HttpSessionListenerImplementation SERVICE_LISTENER = new HttpSessionListenerImplementation();

	private static final class HttpSessionListenerImplementation implements HttpSessionListener {
		@Override
		public void sessionDestroyed(HttpSessionEvent se) {
			System.out.println("Destroyed");
		}

		@Override
		public void sessionCreated(HttpSessionEvent se) {
			System.out.println("Created");
		}
	}

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
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		init();
		plugin = this;
	}

	public static void init() {
		BundleContext bundleContext = FrameworkUtil.getBundle(HttpServiceServlet.class).getBundleContext();
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_LISTENER, Boolean.TRUE.toString());
		properties.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_SELECT, "("+HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME+"=*)");
		bundleContext.registerService(new String[] {HttpSessionListener.class.getName()}, SERVICE_LISTENER, properties);
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
