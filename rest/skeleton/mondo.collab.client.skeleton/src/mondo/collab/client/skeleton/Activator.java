package mondo.collab.client.skeleton;

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
	public static final String PLUGIN_ID = "mondo.collab.client.skeleton"; //$NON-NLS-1$

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

		Client c = new Client();
		{
			String url = "http://152.66.159.233:8070/modelHandler/getModels";
		
			WebResource resource = c.resource(url);
			try{
				Builder builder = resource.accept("application/json");
				String helloString = builder.get(String.class);
				System.out.println(helloString);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		String url = "http://152.66.159.233:8070/modelHandler/setModel";
		WebResource resource = c.resource(url);
		try{
			Builder builder = resource.accept("application/json");
			builder.post("hello there");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
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
