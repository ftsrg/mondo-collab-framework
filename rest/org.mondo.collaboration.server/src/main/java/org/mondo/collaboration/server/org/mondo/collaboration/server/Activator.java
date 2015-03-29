package org.mondo.collaboration.server.org.mondo.collaboration.server;

import java.io.File;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	private static BundleContext context;

	
	private ServiceRegistration<EmfgitResource> registration;
	private ServiceRegistration<BroadcasterResource> registration2;
	
	public static String serverRoot="D:\\emfgit\\";
	public static String lockDirName="locks";
	
	static BundleContext getContext() {
		return context;
	}

	 
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		
		createBaseDirIfNotExists();
		
		registration = bundleContext.registerService(EmfgitResource.class, new EmfgitResource(), null);
		registration2 = bundleContext.registerService(BroadcasterResource.class, new BroadcasterResource(), null);
		
	}

	
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		registration.unregister();
		registration2.unregister();
	}
	
	public void createBaseDirIfNotExists()
	{
		File root=new File(serverRoot);
		if(!root.exists())
		{
			root.mkdir();
		}
	}

}
