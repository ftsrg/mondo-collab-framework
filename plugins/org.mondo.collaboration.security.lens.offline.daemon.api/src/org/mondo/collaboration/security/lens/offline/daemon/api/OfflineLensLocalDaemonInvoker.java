package org.mondo.collaboration.security.lens.offline.daemon.api;

import java.util.Arrays;

import javax.swing.event.ListSelectionEvent;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.mondo.collaboration.security.lens.offline.daemon.api.OfflineLensLocalDaemon.Client;

public class OfflineLensLocalDaemonInvoker {
	public static final int PORT = 6789; 
	private static String getURLForPort(int port) {
		return "http://127.0.0.1:" + port + "/thrift-local/lens-daemon";
	}
	
	private Client client;
	private TTransport transport;

	public OfflineLensLocalDaemonInvoker(int port) throws TTransportException {
		transport = openTransportForClient(port);
		client = new Client(new TTupleProtocol(transport));
	}
	public static TTransport openTransportForClient(int port) throws TTransportException {
		final THttpClient transport = new THttpClient(getURLForPort(port));
		transport.open();		
		return transport;
	}
	public void invoke(String[] args) throws LensIllegalParametrization, LensInternalError, LensDenied, TException {
		client.invokeOfflineLens(Arrays.asList(args));
		
		transport.close();
	}
	
	public static void main(String[] args) {
		try {
			OfflineLensLocalDaemonInvoker invoker = new OfflineLensLocalDaemonInvoker(PORT);
			invoker.invoke(args);
		} catch (LensIllegalParametrization e) {
            System.err.println(
            		"Aborted due to incorrect parametrization - "
            				+ e.getErrorMessage());
            System.exit(-1);
		} catch (LensInternalError e) {
            System.err.println(
            		"Aborted due to internal error (see server log for details) - " 
            				+ e.getErrorMessage());
            System.exit(-2);
		} catch (LensDenied e) {
            System.err.println(e.getProblemDescription());
            System.exit(-3);
		} catch (TException e) {
            System.err.println(
            		"Aborted due to Apache Thrift problem - "
            				+ e.getMessage());
			e.printStackTrace();
			System.exit(-10);
		}
	}

}
