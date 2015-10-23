package eu.mondo.collaboration.accessprotocol.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class UserSession {
	protected static User loggedInUser = null;

	/**
	 * Read in the userId of the user
	 */
	public static void loadUserData() {
		Properties prop = new Properties();
		InputStream input = null;
		try {
			URL url = new URL("platform:/plugin/CollaborationAccessProtocolPlugin/config.properties");
			input = url.openConnection().getInputStream();
			prop.load(input);
			loggedInUser = new User(prop.getProperty("userId"));
		} catch (IOException ex) {
			ex.printStackTrace();
			loggedInUser = null;
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * Returns with the current user object
	 * @return
	 */
	public static User getCurrentUser(){
		return loggedInUser;
	}
}
