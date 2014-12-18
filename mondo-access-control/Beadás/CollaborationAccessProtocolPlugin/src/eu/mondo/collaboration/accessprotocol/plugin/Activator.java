package eu.mondo.collaboration.accessprotocol.plugin;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import eu.mondo.collaboration.accessprotocol.control.PDPHelper;
import eu.mondo.collaboration.accessprotocol.utils.UserSession;


public class Activator implements BundleActivator {
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Plugin started");
		PDPHelper.initPDP();
		UserSession.loadUserData();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		
	}

}