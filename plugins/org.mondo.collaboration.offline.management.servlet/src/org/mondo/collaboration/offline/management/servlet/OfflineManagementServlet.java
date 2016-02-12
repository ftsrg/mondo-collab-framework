package org.mondo.collaboration.offline.management.servlet;

import javax.servlet.Servlet;

import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.server.TServlet;

import uk.ac.york.mondo.integration.api.OfflineCollaboration;
import uk.ac.york.mondo.integration.api.Users;

public class OfflineManagementServlet extends TServlet implements Servlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6509336680278155129L;

	
	public OfflineManagementServlet() throws Exception {
		super(new OfflineCollaboration.Processor<OfflineCollaboration.Iface>(new OfflineCollaborationHandler()), new TJSONProtocol.Factory());
	}
	
	// TODO authenticate
}
