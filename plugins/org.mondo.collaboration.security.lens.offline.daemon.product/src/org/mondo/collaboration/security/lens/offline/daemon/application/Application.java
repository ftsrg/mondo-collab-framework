package org.mondo.collaboration.security.lens.offline.daemon.application;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.internal.runtime.Activator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.mondo.collaboration.security.lens.offline.daemon.servlet.OfflineLensLocalDaemonHandler;

public class Application implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {

	}

}
