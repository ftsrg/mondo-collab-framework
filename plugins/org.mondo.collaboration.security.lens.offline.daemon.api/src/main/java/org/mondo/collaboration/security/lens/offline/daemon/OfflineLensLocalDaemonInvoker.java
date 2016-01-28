package org.mondo.collaboration.security.lens.offline.daemon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.mondo.collaboration.security.lens.offline.daemon.api.LensDenied;
import org.mondo.collaboration.security.lens.offline.daemon.api.LensIllegalParametrization;
import org.mondo.collaboration.security.lens.offline.daemon.api.LensInternalError;
import org.mondo.collaboration.security.lens.offline.daemon.api.OfflineLensLocalDaemon;
import org.mondo.collaboration.security.lens.offline.daemon.api.OfflineLensLocalDaemon.Client;

public class OfflineLensLocalDaemonInvoker {
	private Client client;
	private TTransport transport;

	public OfflineLensLocalDaemonInvoker(String portAndAlias) throws TTransportException {
		transport = openTransportForClient(portAndAlias);
		client = new Client(new TTupleProtocol(transport));
	}
	public static TTransport openTransportForClient(String portAndAlias) throws TTransportException {
		final THttpClient transport = new THttpClient(getURLForPortAndAlias(portAndAlias));
		transport.open();		
		return transport;
	}
	public void invoke(List<String> argList) throws LensIllegalParametrization, LensInternalError, LensDenied, TException {
		client.invokeOfflineLens(argList);
		
		transport.close();
	}
	
	private static String getURLForPortAndAlias(String portAndAlias) {
		return "http://127.0.0.1:" + portAndAlias;
	}	
	public static void main(String[] args) {
		try {
			if (args.length < 1) {
				printUsageAndQuit();
			}
			LinkedList<String> argList = new LinkedList<String>(Arrays.asList(args));
			String portAndAlias = argList.removeFirst();
			String url = getURLForPortAndAlias(portAndAlias);
			System.out.println("Connecting to " + url);
			
			OfflineLensLocalDaemonInvoker invoker = new OfflineLensLocalDaemonInvoker(portAndAlias);
			invoker.invoke(argList);
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
			System.exit(-11);
		}
	}
	
	private static final String EXAMPLE_PORT_AND_ALIAS = "8181/thrift-local/lens-daemon";
	private static void printUsageAndQuit() {
        System.err.println(
        		"Usage: <servlet-port-and-alias> <arguments-for-offline-lens>");
       System.err.println(
                "\tFirst argument is the port number of the local Lens Daemon HTTP servlet.");
        System.err.println(
                "\tThe rest of the arguments are passed to the daemon.");
        System.err.println(
        		"Connects to " + getURLForPortAndAlias("<servlet-port-and-alias>"));
        System.err.println(
        		"Example: " + EXAMPLE_PORT_AND_ALIAS + " -gold /path/to/gold etc.");
        System.err.println(
        		"\t(Will connect to " + getURLForPortAndAlias(EXAMPLE_PORT_AND_ALIAS) +  " and pass on -gold /path/to/gold etc. )");
		System.exit(-10);
	}

}
