package org.mondo.collaboration.offline.management.servlet;

import org.apache.thrift.TException;

import uk.ac.york.mondo.integration.api.GoldRepoNotFound;
import uk.ac.york.mondo.integration.api.OfflineCollaborationInternalError;
import uk.ac.york.mondo.integration.api.UnauthorizedRepositoryOperation;
import uk.ac.york.mondo.integration.api.OfflineCollaboration.Iface;

public class OfflineCollaborationHandler implements Iface {

	@Override
	public void regenerateFrontRepositories(String goldRepoURL) throws GoldRepoNotFound,
			UnauthorizedRepositoryOperation, OfflineCollaborationInternalError, TException {
		// TODO Auto-generated method stub

	}

	@Override
	public String getMyFrontRepositoryURL(String goldRepoURL) throws GoldRepoNotFound,
			UnauthorizedRepositoryOperation, OfflineCollaborationInternalError, TException {
		// TODO Auto-generated method stub
		return null;
	}

}