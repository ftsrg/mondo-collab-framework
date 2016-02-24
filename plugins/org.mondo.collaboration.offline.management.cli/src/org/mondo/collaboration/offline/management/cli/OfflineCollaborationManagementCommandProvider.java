package org.mondo.collaboration.offline.management.cli;

import org.apache.thrift.transport.TTransportException;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

import uk.ac.york.mondo.integration.api.OfflineCollaboration;
import uk.ac.york.mondo.integration.api.OfflineCollaboration.Client;
import uk.ac.york.mondo.integration.api.utils.APIUtils;
import uk.ac.york.mondo.integration.api.utils.APIUtils.ThriftProtocol;


public class OfflineCollaborationManagementCommandProvider implements CommandProvider {
	
	@Override
	public String getHelp() {
		StringBuffer sbuf = new StringBuffer();
		sbuf.append("---OFFLINE COLLABORATION MANAGEMENT (commands are case insensitive, <> means required, [] means optional)---\n\t");
		sbuf.append("offlineCollaborationHelp - lists all the available commands for the Offline Collaboration Management Interface\n");
		sbuf.append("offlineCollaborationRegenerateFrontRepositories <managementUrl> <username> <password> <goldRepositoryUrl> - regenerate all front repositories based on the gold repository\n\t");
		sbuf.append("offlineCollaborationGetMyFrontRepositoryURL <managementUrl> <username> <password> <goldRepositoryUrl> - retrieve the front repository URL for the given user\n\t");
		return sbuf.toString();
	}
	
	public Object _offlineCollaborationRegenerateFrontRepositories(CommandInterpreter intp) throws Exception {
		ParsedArguments parsedArguments = new ParsedArguments(intp);
		Client client = parsedArguments.connect();
		try {
			client.regenerateFrontRepositories(parsedArguments.goldRepositoryUrl);
			return "Success.";
		} finally {
			client.getInputProtocol().getTransport().close();			
		}
	}
	public Object _offlineCollaborationGetMyFrontRepositoryURL(CommandInterpreter intp) throws Exception {
		ParsedArguments parsedArguments = new ParsedArguments(intp);
		Client client = parsedArguments.connect();
		try {
			return client.getMyFrontRepositoryURL(parsedArguments.goldRepositoryUrl);
		} finally {
			client.getInputProtocol().getTransport().close();			
		}
	}
	public Object _offlineCollaborationHelp(CommandInterpreter intp) {
		return getHelp();
	}
	

	
	private static class ParsedArguments {
		String managementUrl;
		String userName;
		String password;
		String goldRepositoryUrl;
		
		public ParsedArguments(CommandInterpreter intp) {
			managementUrl = nextRequiredArgument(intp, "managementUrl");
			userName = nextRequiredArgument(intp, "username");
			password = nextRequiredArgument(intp, "password");
			goldRepositoryUrl = nextRequiredArgument(intp, "goldRepositoryUrl");
		}
		
		private String nextRequiredArgument(CommandInterpreter intp, String argumentName) {
			String value = intp.nextArgument();
			if (value == null) {
				throw new IllegalArgumentException(
					String.format("Required argument '%s' has not been provided", argumentName));
			}
			return value;
		}

		public OfflineCollaboration.Client connect() throws Exception {
			ThriftProtocol clientProtocol = ThriftProtocol.guessFromURL(managementUrl);
			
			Client client = APIUtils.connectTo(OfflineCollaboration.Client.class, managementUrl, clientProtocol, userName, password);
			return client;
		}
	}
	
}
