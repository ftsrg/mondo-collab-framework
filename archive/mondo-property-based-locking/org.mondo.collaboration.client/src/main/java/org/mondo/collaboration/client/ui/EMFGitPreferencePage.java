package org.mondo.collaboration.client.ui;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.mondo.collaboration.client.Activator;
import org.mondo.collaboration.client.preference.Preferences;

public class EMFGitPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {

	private Text serverAddress;
	private Button serverPooling;
	private Text poolingInterval;

	public EMFGitPreferencePage() {

	}

	public EMFGitPreferencePage(String title) {
		super(title);

	}

	public EMFGitPreferencePage(String title, ImageDescriptor image) {
		super(title, image);

	}

	@Override
	public void init(IWorkbench workbench) {

	}

	@Override
	protected IPreferenceStore doGetPreferenceStore() {

		return Activator.getPreferences();
	}

	@Override
	public boolean performOk() {

		storeValues();

		return super.performOk();
	}

	@Override
	protected void performApply() {
		storeValues();

		super.performApply();
	}

	@Override
	protected void performDefaults() {
		initializeDefaults();

		super.performDefaults();
	}

	@Override
	protected Control createContents(Composite parent) {

		Composite c = new Composite(parent, SWT.NONE);
		c.setLayout(new GridLayout(2, true));

		Label serverAddressText = new Label(c, SWT.LEFT);
		serverAddressText.setText("Server Address:");

		serverAddress = new Text(c, SWT.SINGLE | SWT.LEAD | SWT.BORDER);

		int columns = 15;
		GC gc = new GC(serverAddress);
		FontMetrics fm = gc.getFontMetrics();
		int width = columns * fm.getAverageCharWidth();
		int height = fm.getHeight();
		gc.dispose();
		serverAddress.setSize(serverAddress.computeSize(width, height));

		Label serverPoolingText = new Label(c, SWT.LEFT);
		serverPoolingText.setText("Server Pooling:");

		serverPooling = new Button(c, SWT.CHECK);

		Label poolingIntervalText = new Label(c, SWT.LEFT);
		poolingIntervalText.setText("Pooling Interval (ms):");

		poolingInterval = new Text(c, SWT.SINGLE | SWT.LEAD | SWT.BORDER);

		poolingInterval.addListener(SWT.Verify, new Listener() {
			@Override
			public void handleEvent(Event e) {
				String string = e.text;
				char[] chars = new char[string.length()];
				string.getChars(0, chars.length, chars, 0);
				for (int i = 0; i < chars.length; i++) {
					if (!('0' <= chars[i] && chars[i] <= '9')) {
						e.doit = false;
						return;
					}
				}
			}
		});

		columns = 8;
		gc = new GC(poolingInterval);
		fm = gc.getFontMetrics();
		width = columns * fm.getAverageCharWidth();
		height = fm.getHeight();
		gc.dispose();
		poolingInterval.setSize(poolingInterval.computeSize(width, height));

		initializeValues();

		return new Composite(parent, SWT.NULL);
	}

	private void initializeValues() {
		IPreferenceStore store = doGetPreferenceStore();
		serverAddress.setText(store.getString(Preferences.SERVER_ADDRESS));
		serverPooling
				.setSelection(store.getBoolean(Preferences.POOLING_ENABLE));
		poolingInterval.setText(Integer.toString(store
				.getInt(Preferences.POOLING_INTERVAL)));
	}

	private void storeValues() {
		IPreferenceStore store = doGetPreferenceStore();

		store.setValue(Preferences.SERVER_ADDRESS, serverAddress.getText());
		store.setValue(Preferences.POOLING_ENABLE, serverPooling.getSelection());
		store.setValue(Preferences.POOLING_INTERVAL,
				Integer.parseInt(poolingInterval.getText()));

	}

	private void initializeDefaults() {
		IPreferenceStore store = doGetPreferenceStore();

		serverAddress.setText(store
				.getDefaultString(Preferences.SERVER_ADDRESS));

		serverPooling.setSelection(store
				.getDefaultBoolean(Preferences.POOLING_ENABLE));

		poolingInterval.setText(Integer.toString(store
				.getDefaultInt(Preferences.POOLING_INTERVAL)));
	}

}
