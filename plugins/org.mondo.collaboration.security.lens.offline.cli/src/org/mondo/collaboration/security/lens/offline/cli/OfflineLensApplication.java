package org.mondo.collaboration.security.lens.offline.cli;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.mondo.collaboration.security.lens.relational.LensTransformationExecution.DenialReason;

public class OfflineLensApplication implements IApplication {


	@Override
	public Object start(IApplicationContext context) throws Exception {
		String[] argArray = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);

		final DenialReason denialReason = OfflineLensGlue.invokeOfflineLens(argArray);
        if (null == denialReason) {
		    return IApplication.EXIT_OK;
        } else {
            System.err.println(denialReason.prettyPrintProblem());
		    return -1;
        }
	}


	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
