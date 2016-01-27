package org.mondo.collaboration.security.lens.offline.daemon.servlet;

import java.util.List;

import org.apache.thrift.TException;
import org.eclipse.equinox.app.IApplication;
import org.mondo.collaboration.security.lens.bx.AbortReason.DenialReason;
import org.mondo.collaboration.security.lens.bx.offline.OfflineLensGlue;
import org.mondo.collaboration.security.lens.bx.offline.OfflineLensParametrizationException;
import org.mondo.collaboration.security.lens.offline.daemon.api.LensDenied;
import org.mondo.collaboration.security.lens.offline.daemon.api.LensIllegalParametrization;
import org.mondo.collaboration.security.lens.offline.daemon.api.LensInternalError;
import org.mondo.collaboration.security.lens.offline.daemon.api.OfflineLensLocalDaemon.Iface;

public class OfflineLensLocalDaemonHandler implements Iface {

	@Override
	public void invokeOfflineLens(List<String> cliArguments)
			throws LensIllegalParametrization, LensInternalError, LensDenied, TException {
		
		String[] argArray = cliArguments.toArray(new String[cliArguments.size()]);
		
		try {
    		final DenialReason denialReason = OfflineLensGlue.invokeOfflineLens(argArray);
            if (null == denialReason) {
    		    return;
            } else {
    		    throw new LensDenied(denialReason.prettyPrintProblem());
            }
        } catch (OfflineLensParametrizationException ex) {
		    throw new LensIllegalParametrization(ex.getMessage());
		} catch (Exception ex) {
		    throw new LensInternalError(ex.getMessage());
		}

	}

}
