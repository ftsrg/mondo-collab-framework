package org.mondo.collaboration.offline.management.servlet;

import javax.servlet.http.HttpServletRequest;

import org.apache.thrift.TException;

import uk.ac.york.mondo.integration.api.GoldRepoNotFound;
import uk.ac.york.mondo.integration.api.OfflineCollaborationInternalError;
import uk.ac.york.mondo.integration.api.UnauthorizedRepositoryOperation;
import uk.ac.york.mondo.integration.api.utils.APIUtils.ThriftProtocol;
import uk.ac.york.mondo.integration.api.OfflineCollaboration.Iface;

/*******************************************************************************
 * Copyright (c) 2016 Budapest University of Technology and Economics.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabor Bergmann - initial API and implementation
 *******************************************************************************/
public class OfflineCollaborationHandler implements Iface {

	private ThriftProtocol protocol;
	private HttpServletRequest httpRequest;

	public OfflineCollaborationHandler(ThriftProtocol protocol, HttpServletRequest httpRequest) {
		this.protocol = protocol;
		this.httpRequest = httpRequest;
	}
	/**
	 * Only to be used from {@link OfflineManagementThriftProcessorFactory} to retrieve the
	 * original process map.
	 */
	OfflineCollaborationHandler() {
		this(null, null);
	}


	@Override
	public void regenerateFrontRepositories(String goldRepoURL) throws GoldRepoNotFound,
			UnauthorizedRepositoryOperation, OfflineCollaborationInternalError, TException {
		System.out.println("regenerateFrontRepositories call");
		System.out.println("\tfor repo " + goldRepoURL);
		if (httpRequest == null)
			System.out.println("\trequest is NULL!!!!! ");
		else if (httpRequest.getUserPrincipal() == null)
			System.out.println("\tuser principal is NULL!!!!! ");
		else
			System.out.println("\tby user " + httpRequest.getUserPrincipal().getName());
	}

	@Override
	public String getMyFrontRepositoryURL(String goldRepoURL) throws GoldRepoNotFound,
			UnauthorizedRepositoryOperation, OfflineCollaborationInternalError, TException {
		System.out.println("getMyFrontRepositoryURL call");
		System.out.println("\tfor repo " + goldRepoURL);
		if (httpRequest == null)
			System.out.println("\trequest is NULL!!!!! ");
		else if (httpRequest.getUserPrincipal() == null)
			System.out.println("\tuser principal is NULL!!!!! ");
		else
			System.out.println("\tby user " + httpRequest.getUserPrincipal().getName());
		return "fake://url.org";
	}

}