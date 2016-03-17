package org.mondo.collaboration.offline.management.client.ui;

import java.util.Dictionary;

import javax.annotation.ManagedBean;

import org.apache.log4j.Logger;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;
import org.mondo.collaboration.offline.management.cli.OfflineCollaborationManagementCommandProvider;
import org.mondo.collaboration.offline.management.client.ui.MONDOServerView.SimpleCredentialsDialog;
import org.osgi.framework.Bundle;

import uk.ac.york.mondo.integration.api.dt.prefs.CredentialsStore;
import uk.ac.york.mondo.integration.api.dt.prefs.CredentialsStore.Credentials;
import uk.ac.york.mondo.integration.api.dt.prefs.Server;
import uk.ac.york.mondo.integration.api.dt.prefs.ServerStore;

public class MONDOServerView extends ViewPart {

	private static final String CUSTOM_URL_TEXT = "Custom URL...";
	public static final String ID = "org.mondo.collaboration.offline.management.client.ui.MONDOView"; //$NON-NLS-1$
	private Text frontRepoURL;
	private Text userName;
	private Text customURL;

	private static Logger logger = Logger.getLogger(MONDOServerView.class);

	public MONDOServerView() {
	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {

		Composite userDataComposite = new Composite(parent, SWT.NONE);
		userDataComposite.setLayout(new GridLayout(1, false));
		// TODO what should happen here? Call thrift API? How?

		Button btnGetMyFront = new Button(userDataComposite, SWT.NONE);
		btnGetMyFront.setSize(111, 31);

		btnGetMyFront.setText("Get username and front URL");

		Label lblUser = new Label(userDataComposite, SWT.NONE);
		lblUser.setSize(166, 17);
		lblUser.setText("Username set in preferences:");

		userName = new Text(userDataComposite, SWT.BORDER);
		userName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		userName.setSize(54, 27);
		userName.setEditable(false);

		Label lblFrontRepoUrl = new Label(userDataComposite, SWT.NONE);
		lblFrontRepoUrl.setSize(86, 17);
		lblFrontRepoUrl.setText("Front repo URL:");

		frontRepoURL = new Text(userDataComposite, SWT.BORDER);
		frontRepoURL.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		frontRepoURL.setSize(54, 27);
		frontRepoURL.setEditable(false);

		Button btnResetFromGold = new Button(userDataComposite, SWT.NONE);
		btnResetFromGold.setSize(129, 31);
		btnResetFromGold.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageDialog.openInformation(getSite().getShell(), "Info", "Reset from gold pressed");
			}
		});
		btnResetFromGold.setText("Reset from gold repo");

		Composite serversComposite = new Composite(parent, SWT.NONE);
		serversComposite.setLayout(new GridLayout(1, false));

		Label lblListOfMondo = new Label(serversComposite, SWT.NONE);
		lblListOfMondo.setSize(128, 17);
		lblListOfMondo.setText("List of MONDO servers");

		List list = new List(serversComposite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		list.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		Button btnReloadListOf = new Button(serversComposite, SWT.NONE);
		btnReloadListOf.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				loadListOfServers(list);
			}
		});
		btnReloadListOf.setText("Reload list of servers");

		Label lblYouAnAdd = new Label(serversComposite, SWT.WRAP | SWT.LEFT);
		lblYouAnAdd.setLayoutData(new GridData(SWT.HORIZONTAL, SWT.TOP, true, false, 1, 1));
		lblYouAnAdd.setText(
				"You an add further servers under the Mondo servers preference page, or connect to a given URL here:");

		customURL = new Text(serversComposite, SWT.BORDER);
		customURL.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		loadListOfServers(list);
		
		userName.setEnabled(false);
		list.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				for (String url : list.getSelection()) {
					if(CUSTOM_URL_TEXT.equals(url)){
						userName.setEnabled(false);
						userName.setText("");
						frontRepoURL.setText("");
						return;
					}
				}
				userName.setEnabled(true);
				frontRepoURL.setText("");
				userName.setText("");
				return;
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		btnGetMyFront.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				String[] selection = list.getSelection();
				Credentials credentials;
				String managementURL;
				if (selection != null && selection.length > 0) {
					credentials = getCredentials(selection[0]);
					userName.setText(credentials.getUsername());
					managementURL = selection[0];
				} else {
					credentials = null;
					managementURL = "";
				}

				CommandInterpreter commandInterpreter = new CommandInterpreter() {

					private int argumentIndex = 0;
					private String user;
					private String pass;

					@Override
					public String nextArgument() {
						String argument = null;
						user = credentials.getUsername();
						pass = credentials.getPassword();
						if(argumentIndex == 0){
							if ("".equals(user) && "".equals(pass)) {
								// TODO get credentials for custom url
								SimpleCredentialsDialog simpleCredentialsDialog = new SimpleCredentialsDialog(Display.getCurrent().getActiveShell());
								simpleCredentialsDialog.open();
								user = simpleCredentialsDialog.getUser();
								pass = simpleCredentialsDialog.getPassword();
							}
						}
						switch (argumentIndex) {
						case 0:
							// "managementUrl";
							argument = CUSTOM_URL_TEXT.equals(managementURL) ? customURL.getText() : managementURL;
							break;
						case 1:
							// "username";
							argument = user;
							break;
						case 2:
							// "password";
							argument = pass;
							break;
						case 3:
							// "goldRepositoryUrl";
							argument = "placeholder.unused.dummy.url";
							break;

						default:
							break;
						}
						argumentIndex++;
						return argument;
					}

					@Override
					public Object execute(String cmd) {
						return null;
					}

					@Override
					public void print(Object o) {
					}

					@Override
					public void println() {
					}

					@Override
					public void println(Object o) {
					}

					@Override
					public void printStackTrace(Throwable t) {
					}

					@Override
					public void printDictionary(Dictionary<?, ?> dic, String title) {
					}

					@Override
					public void printBundleResource(Bundle bundle, String resource) {
					}

				};

				OfflineCollaborationManagementCommandProvider commandProvider = new OfflineCollaborationManagementCommandProvider();
				try {
					frontRepoURL.setText( (String) commandProvider._offlineCollaborationGetMyFrontRepositoryURL(commandInterpreter));
				} catch (Exception e1) {
					String message = "Could not get front repository URL from server " + managementURL;
					logger.error(message);
					frontRepoURL.setText(message);
				}
			}
			
			
		});
		
		createActions();
		initializeToolBar();
		initializeMenu();
	}

	private void loadListOfServers(List list) {
		ServerStore serverStore = new ServerStore(
				uk.ac.york.mondo.integration.api.dt.Activator.getDefault().getPreferenceStore());
		java.util.List<Server> servers = serverStore.readAllServers();

		list.removeAll();
		
		list.add(CUSTOM_URL_TEXT);

		list.setSelection(0); // by default select option "Custom URL"

		for (Server server : servers) {
			list.add(server.getBaseURL());
		}
		userName.setEnabled(false);
		userName.setText("");
		frontRepoURL.setText("");
	}

	private Credentials getCredentials(String serverURL) {
		CredentialsStore.Credentials creds = null;

		if (CUSTOM_URL_TEXT.equals(serverURL)) {
			return new Credentials("", "");
		}

		ServerStore serverStore = new ServerStore(
				uk.ac.york.mondo.integration.api.dt.Activator.getDefault().getPreferenceStore());
		java.util.List<Server> servers = serverStore.readAllServers();

		for (Server server : servers) {
			if (serverURL.equals(server.getBaseURL())) {
				try {
					creds = uk.ac.york.mondo.integration.api.dt.Activator.getDefault().getCredentialsStore()
							.get(server.getBaseURL());
				} catch (Exception e1) {
					logger.warn("Could not load credentials for server with URL " + serverURL);
				}

			}
		}

		return creds;
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		IToolBarManager toolbarManager = getViewSite().getActionBars().getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		IMenuManager menuManager = getViewSite().getActionBars().getMenuManager();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}
	
	public class SimpleCredentialsDialog extends Dialog {
		  private Text userText;
		  private Text passwordText;
		  private String user = "";
		  private String password = "";

		  public SimpleCredentialsDialog(Shell parentShell) {
		    super(parentShell);
		  }

		@Override
		protected Control createDialogArea(Composite parent) {
			Composite container = (Composite) super.createDialogArea(parent);
			GridLayout layout = new GridLayout(2, false);
			container.setLayout(layout);

			Label userLabel = new Label(container, SWT.NONE);
			userLabel.setText("Username:");

			userText = new Text(container, SWT.BORDER);
			userText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			userText.setText(user);

			Label passwordLabel = new Label(container, SWT.NONE);
//			passwordLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
			passwordLabel.setText("Password:");

			passwordText = new Text(container, SWT.BORDER | SWT.PASSWORD);
			passwordText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			passwordText.setText(password);

			return container;
		}

		public String getUser() {
			return user;
		}

		public String getPassword() {
			return password;
		}

		@Override
		protected void okPressed() {
			user = userText.getText();
			password = passwordText.getText();
			super.okPressed();
		}

	}
	
}
