package org.mondo.collaboration.client.preference;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.mondo.collaboration.client.Activator;
import org.mondo.collaboration.client.ServerPooler;

public class Preferences extends AbstractPreferenceInitializer {

	public static final String SERVER_ADDRESS = "SRV_ADDR";
	public static final String POOLING_ENABLE = "POOL_ENABLE";
	public static final String POOLING_INTERVAL = "POOL_INTERVAL";

	private static final String SERVER_ADDRESS_DEFAULT = "http://localhost:9090/services/emfgit";

	public static final Boolean POOLING_ENABLE_DEFAULT = true;

	public static final int POOLING_INTERVAL_DEFAULT = 5000;

	// FOR CONVIENCE VALUES SHOULD BE REFERENCED FROM HERE
	public static String ServerAddress = "";

	public static Boolean PoolingEnabled = false;

	public static int PoolingInterval = 5000;

	public Preferences() {

		IPreferenceStore prefStore = Activator.getDefault().getPreferences();

		prefStore.addPropertyChangeListener(new IPropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent event) {

				String propertyname = event.getProperty();

				if (propertyname.equals(SERVER_ADDRESS)) {
					ServerAddress = (String) event.getNewValue();
				} else if (propertyname.equals(POOLING_ENABLE)) {
					PoolingEnabled = (Boolean) event.getNewValue();

					if (PoolingEnabled) {
						ServerPooler.start();
					} else {
						ServerPooler.stop();
					}
				} else if (propertyname.equals(POOLING_INTERVAL)) {
					PoolingInterval = (int) event.getNewValue();
				}
			}
		});
	}

	public static void setProperties(IPreferenceStore prefStore) {
		ServerAddress = prefStore.getString(SERVER_ADDRESS);
		PoolingEnabled = prefStore.getBoolean(POOLING_ENABLE);
		PoolingInterval = prefStore.getInt(POOLING_INTERVAL);
	}

	@Override
	public void initializeDefaultPreferences() {

		IPreferenceStore prefStore = Activator.getDefault().getPreferences();

		prefStore.setDefault(SERVER_ADDRESS, SERVER_ADDRESS_DEFAULT);
		prefStore.setDefault(POOLING_ENABLE, POOLING_ENABLE_DEFAULT);
		prefStore.setDefault(POOLING_INTERVAL, POOLING_INTERVAL_DEFAULT);

	}

}
