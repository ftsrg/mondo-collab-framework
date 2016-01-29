package org.mondo.collaboration.security.lens.offline.daemon.application;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.equinox.http.servlet.ExtendedHttpService;
import org.mondo.collaboration.security.lens.offline.daemon.servlet.LocalityFilter;
import org.mondo.collaboration.security.lens.offline.daemon.servlet.OfflineLensDaemonServlet;
import org.mondo.collaboration.security.lens.offline.daemon.servlet.OfflineLensLocalDaemonHandler;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpService;

public class Application implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		
		BundleContext bContext = org.mondo.collaboration.security.lens.offline.daemon.product.Activator.getContext();
		ServiceReference<ExtendedHttpService> serviceReference = bContext.getServiceReference(ExtendedHttpService.class);
		ExtendedHttpService httpService = bContext.getService(serviceReference);
		
		httpService.registerServlet(
				"/thrift-local/lens-daemon", 
				new OfflineLensDaemonServlet(), 
				null, 
				null);
		httpService.registerFilter(
				"/thrift-local", 
				new LocalityFilter(), 
				null, 
				null);
		
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {

	}

}
