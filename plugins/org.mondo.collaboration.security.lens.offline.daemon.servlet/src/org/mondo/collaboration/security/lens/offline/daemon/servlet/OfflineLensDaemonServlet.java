package org.mondo.collaboration.security.lens.offline.daemon.servlet;

import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.server.TServlet;
import org.mondo.collaboration.security.lens.offline.daemon.api.OfflineLensLocalDaemon;

public class OfflineLensDaemonServlet extends TServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6282978187018414657L;

	public OfflineLensDaemonServlet() {
		super(
				new OfflineLensLocalDaemon.Processor<OfflineLensLocalDaemon.Iface>(new OfflineLensLocalDaemonHandler()), 
				new TTupleProtocol.Factory());
	}
}
