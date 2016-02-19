package org.mondo.collaboration.offline.management.servlet;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.thrift.ProcessFunction;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseProcessor;
import org.apache.thrift.TProcessor;
import org.mondo.collaboration.offline.management.servlet.util.IAuthenticatedProcessorFactory;

import uk.ac.york.mondo.integration.api.OfflineCollaboration;
import uk.ac.york.mondo.integration.api.utils.APIUtils.ThriftProtocol;

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
public class OfflineManagementThriftProcessorFactory implements IAuthenticatedProcessorFactory {
	private final ThriftProtocol protocol;
	
	@SuppressWarnings("rawtypes")
	private Map<String, ProcessFunction<OfflineCollaboration.Iface, ? extends TBase>> processMap;

	
	public OfflineManagementThriftProcessorFactory(ThriftProtocol protocol) {
		super();
		this.protocol = protocol;
		
		this.processMap = 
				new OfflineCollaboration.Processor<OfflineCollaboration.Iface>(
						new OfflineCollaborationHandler()).getProcessMapView();
	}

	@Override
	public TProcessor create(HttpServletRequest p) {
		return new TBaseProcessor<OfflineCollaboration.Iface>(
				new OfflineCollaborationHandler(protocol, p), processMap) {};
	}

	protected ThriftProtocol getProtocol() {
		return protocol;
	}
	
	
	
}
