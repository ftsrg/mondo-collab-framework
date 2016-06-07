package org.mondo.collaboration.online.rap.widgets;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.mondo.collaboration.online.core.LensSessionManager;
import org.mondo.collaboration.online.core.StorageAccess;
import org.mondo.collaboration.online.core.StorageAccess.ExecutionResponse;
import org.mondo.collaboration.online.core.StorageAccess.FileStatus;
import org.mondo.collaboration.online.core.StorageAccessFactory;
import org.mondo.collaboration.online.core.StorageModel;
import org.mondo.collaboration.online.core.StorageModel.NodeType;
import org.mondo.collaboration.online.core.StorageModel.StorageModelNode;
import org.mondo.collaboration.online.rap.UINotifierManager;
import org.mondo.collaboration.online.rap.UISessionManager;

/**
 * @author Csaba Debreceni
 *
 */
public class ModelExplorer extends ViewPart {

	public static final String STORAGEACCESS = "storageaccess";
	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";
	public static final String REPOSITORY = "repository";
	public static final String ID = "org.mondo.collaboration.online.rap.widgets.ModelExplorer";
	public static final String EVENT_UPDATE_PATH = "org.mondo.collaboration.online.rap.widgets.ModelExplorer.update.path";
	public static final String EVENT_USER_LOGGED_IN = "org.mondo.collaboration.online.rap.widgets.ModelExplorer.user.logged.in";
	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat();

	private Text repositoryField;
	private Text passwordField;
	private Text usernameField;

	private Composite container;
	private ModelExplorerContentProvider contentProvider = new ModelExplorerContentProvider();
	private ModelExplorerLabelProvider labelProvider = new ModelExplorerLabelProvider();
	private TreeViewer treeViewer;
	private Composite loginForm;
	private Composite modelExplorer;
	private StackLayout layout;
	private StorageAccess access;
	private Button remember;
	private boolean switchViews;

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {

		container = new Composite(parent, SWT.None);
		layout = new StackLayout();
		container.setLayout(layout);

		modelExplorer = createModelExplorer(container);
		modelExplorer.setVisible(false);
		loginForm = createLoginForm(container);
		loginForm.setVisible(true);

		if (retrieveHttpSession()) {
			try {
				processLogin(usernameField.getText(), passwordField.getText(), repositoryField.getText(), true);
				layout.topControl = modelExplorer;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			layout.topControl = loginForm;
		}


		if(switchViews) {
			switchViews = false;
			switchViews(access.explore());
		}

		registerContexMenu();
	}

	private void registerContexMenu() {
		MenuManager menuMgr = new MenuManager();

		Menu menu = menuMgr.createContextMenu(treeViewer.getControl());
		menuMgr.addMenuListener(new IMenuListener() {
			private static final long serialVersionUID = -3268347794188925637L;

			@Override
			public void menuAboutToShow(IMenuManager manager) {
				IWorkbench wb = PlatformUI.getWorkbench();
				if (treeViewer.getSelection().isEmpty()) {
					return;
				}

				if (treeViewer.getSelection() instanceof IStructuredSelection) {
					StorageModelNode node = getFirstSelection();
					if (node.getType() != NodeType.Folder) {

						manager.add(new Action() {

							private static final long serialVersionUID = 1L;

							@Override
							public String getText() {
								return "Open in editor";
							}

							public void run() {
								openEditor(wb, node.getPath());
							};
						});
					}
				}
			}
		});
		menuMgr.setRemoveAllWhenShown(true);
		treeViewer.getControl().setMenu(menu);
	}

	private StorageModelNode getFirstSelection() {
		IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();
		StorageModelNode node = (StorageModelNode) selection.getFirstElement();
		return node;
	}

	private Composite createModelExplorer(Composite parent) {
		final Composite explorer = new Composite(parent, SWT.None);
		explorer.setLayout(new FillLayout());

		treeViewer = new TreeViewer(explorer);
		treeViewer.setLabelProvider(labelProvider);
		treeViewer.setContentProvider(contentProvider);
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				IWorkbench wb = PlatformUI.getWorkbench();
				// IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
				if (treeViewer.getSelection().isEmpty()) {
					return;
				}

				if (treeViewer.getSelection() instanceof IStructuredSelection) {
					StorageModelNode node = getFirstSelection();
					if (node.getType() != NodeType.Folder) {
						openEditor(wb, node.getPath());
					}
				}
			}
		});

		return explorer;
	}

	private Composite createLoginForm(final Composite parent) {
		final Composite loginPanel = new Composite(parent, SWT.None);
		loginPanel.setLayout(new GridLayout());

		final GridLayout layout = (GridLayout) loginPanel.getLayout();
		layout.numColumns = 2;

		final Label repositoryLabel = new Label(loginPanel, SWT.RIGHT);
		repositoryLabel.setText("Gold Repository: "); //$NON-NLS-1$
		repositoryField = new Text(loginPanel, SWT.SINGLE | SWT.BORDER);


		final Label usernameLabel = new Label(loginPanel, SWT.RIGHT);
		usernameLabel.setText("Username: "); //$NON-NLS-1$
		usernameField = new Text(loginPanel, SWT.SINGLE | SWT.BORDER);

		final GridData data = new GridData(SWT.FILL, SWT.CENTER, true, false);
		usernameField.setLayoutData(data);
		repositoryField.setLayoutData(data);

		final Label passwordLabel = new Label(loginPanel, SWT.RIGHT);
		passwordLabel.setText("Password: "); //$NON-NLS-1$
		passwordField = new Text(loginPanel, SWT.SINGLE | SWT.BORDER | SWT.PASSWORD);
		passwordField.setLayoutData(data);

		remember = new Button(loginPanel, SWT.CHECK);
		remember.setText("Remember me"); //$NON-NLS-1$
		remember.setVisible(false);
		final Button login = new Button(loginPanel, SWT.CENTER);
		login.setText("Login"); //$NON-NLS-1$
		login.setLayoutData(data);

		login.addListener(SWT.Selection, new Listener() {

			private static final long serialVersionUID = 1L;

			@Override
			public void handleEvent(Event event) {
				try {
					processLogin(usernameField.getText(), passwordField.getText(), repositoryField.getText(), false);
				} catch (Exception e) {
					showMessage(parent, "Exception", e.getMessage(), SWT.ERROR | SWT.ABORT);
				}
			}
		});
		retrieveHttpSession();
		return loginPanel;
	}

	protected int showMessage(Composite container, String title, String message, int style) {
		MessageBox messageBox = new MessageBox(container.getShell(), style);
		messageBox.setMessage(message);
		messageBox.setText(title);

		return messageBox.open();
	}

	protected void processLogin(String username, String password, String repository, boolean internal) {
		try {
			internalValidateStorageAccess(username, password, repository);
			String loginReason = access.login();
			if (loginReason != null && !internal) {
				showMessage(container, "Login failed", loginReason, SWT.ERROR | SWT.RETRY);
				return;
			}

			// if(remember.getSelection()) {
			// internalStoreUserData();
			// }

			internalStoreHttpSession(username, password, repository);

			StorageModel storageModel = access.explore();
			if(treeViewer != null) {
				switchViews(storageModel);
			} else {
				switchViews = true;
			}
			UINotifierManager.notifySuccess(EVENT_USER_LOGGED_IN, username);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void switchViews(StorageModel storageModel) {
		treeViewer.setInput(storageModel);
		modelExplorer.setVisible(true);
		loginForm.setVisible(false);
		layout.topControl = modelExplorer;
	}

	private void internalValidateStorageAccess(String username, String password, String repository) throws Exception {
		StorageAccess currentStorageAccess = getCurrentStorageAccess();
		if (currentStorageAccess == null || !(currentStorageAccess.getUsername().equals(username)
				&& currentStorageAccess.getPassword().equals(password))) {
			access = StorageAccessFactory.createStorageAccess(username, password, repository);
		} else {
			access = currentStorageAccess;
		}

	}

	private boolean retrieveHttpSession() {
		Object username = RWT.getUISession().getHttpSession().getAttribute(USERNAME);
		Object password = RWT.getUISession().getHttpSession().getAttribute(PASSWORD);
		Object repository = RWT.getUISession().getHttpSession().getAttribute(REPOSITORY);

		if (username != null && password != null) {
			usernameField.setText((String) username);
			passwordField.setText((String) password);
			repositoryField.setText((String)repository);
			return true;
		}
		return false;
	}

	private void internalStoreHttpSession(String username, String password, String repository) {
		RWT.getUISession().getHttpSession().setAttribute(USERNAME, username);
		RWT.getUISession().getHttpSession().setAttribute(PASSWORD, password);
		RWT.getUISession().getHttpSession().setAttribute(REPOSITORY, repository);
		RWT.getUISession().getHttpSession().setAttribute(STORAGEACCESS, access);
	}

	// private void internalStoreUserData() throws Exception {
	// RWT.getSettingStore().setAttribute(USERNAME, usernameField.getText());
	// RWT.getSettingStore().setAttribute(PASSWORD, passwordField.getText());
	// }

	@Override
	public void setFocus() {
		repositoryField.setFocus();
	}

	public boolean openEditor(IWorkbench workbench, String path) {
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();

		URI uri;
		try {
			uri = access.startSession(path);

			if(!LensSessionManager.getUriSet().contains(uri)) {
				if (access.checkFileStatus(path) == FileStatus.Modified) {
					handleModifiedFile(path, workbenchWindow.getShell());					
				}
			}
		} catch (Exception e) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace();
			e.printStackTrace(pw);
			showMessage(container, "Error", sw.toString(), SWT.ERROR);
			return false;
		}

		IEditorDescriptor editorDescriptor = EditUIUtil.getDefaultEditor(uri, null);
		if (editorDescriptor == null) {
			MessageDialog.openError(workbenchWindow.getShell(), "Error", "No editor is registered");
			return false;
		} else {
			try {
				page.openEditor(new URIEditorInput(uri), editorDescriptor.getId());
			} catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), "Error", exception.getMessage());
				return false;
			}
		}
		return true;
	}

	private boolean handleModifiedFile(String path, Shell shell) {

		MessageDialog dialog = new MessageDialog(shell, "Previously Modified Model", null,
				"The model, you are opening, is previously modified in a different session. You can commit the changes immediately, discard them, or open in the editor.",
				MessageDialog.WARNING, new String[] { "Commit", "Discard", "Open" }, 0);

		int result = dialog.open();
		if(result == 0) {
			CommitMessageDialog commitMessageDialog = new CommitMessageDialog(shell);
			int resultCommitMessage = commitMessageDialog.open();
			if(resultCommitMessage == MessageDialog.OK) {
				String message = commitMessageDialog.getCommitMessage();
				ExecutionResponse response = access.commit(path, message, access.getUsername(), access.getPassword());
				if(!response.getErrorList().isEmpty()) {
					access.revert(path, access.getUsername(), access.getPassword());
					MessageBox messageBox = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
					messageBox.setMessage("An error occurred during commit (maybe conlifts), thus the model is reverted.");
					messageBox.open();
				}
			}
			else {
				return false;
			}
		} else if (result == 1) {
			access.revert(path, access.getUsername(), access.getPassword());
		} else {
			return false;
		}

		return true;
	}

	@Override
	public void saveState(IMemento memento) {
		super.saveState(memento);

		if (!usernameField.getText().trim().isEmpty() && !passwordField.getText().trim().isEmpty() && !repositoryField.getText().trim().isEmpty()) {
			memento.putString(USERNAME, usernameField.getText());
			memento.putString(PASSWORD, passwordField.getText());
			memento.putString(REPOSITORY, repositoryField.getText());
		}
	}

	@Override
	public void init(IViewSite site, IMemento memento) throws PartInitException {
		super.init(site, memento);
		if (memento == null)
			return;
		if (memento.getString(USERNAME) != null && memento.getString(PASSWORD) != null) {
			try {
				RWT.getUISession().getHttpSession().setAttribute(STORAGEACCESS, StorageAccessFactory
						.createStorageAccess(memento.getString(USERNAME), memento.getString(PASSWORD), memento.getString(REPOSITORY)));
				RWT.getUISession().getHttpSession().setAttribute(USERNAME, memento.getString(USERNAME));
				RWT.getUISession().getHttpSession().setAttribute(PASSWORD, memento.getString(PASSWORD));
				RWT.getUISession().getHttpSession().setAttribute(REPOSITORY, memento.getString(REPOSITORY));
				processLogin(memento.getString(USERNAME), memento.getString(PASSWORD), memento.getString(REPOSITORY), true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static StorageAccess getCurrentStorageAccess() {
		return (StorageAccess) RWT.getUISession().getHttpSession().getAttribute(STORAGEACCESS);
	}
	
	public static void logout() throws PartInitException {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();
		IViewPart modelExplorer = activePage.findView(ModelExplorer.ID);
		if(modelExplorer == null) {
			modelExplorer = activePage.showView(ModelExplorer.ID);
		}
		if(modelExplorer != null) {
			((ModelExplorer) modelExplorer).logoutInternal();
		}
	}
	
	private void logoutInternal() {
		StorageAccess storageAccess = getCurrentStorageAccess();
		
		RWT.getUISession().getHttpSession().removeAttribute(USERNAME);
		RWT.getUISession().getHttpSession().removeAttribute(PASSWORD);
		RWT.getUISession().getHttpSession().removeAttribute(REPOSITORY);
		RWT.getUISession().getHttpSession().removeAttribute(STORAGEACCESS);
		
		modelExplorer.setVisible(false);
		loginForm.setVisible(true);
		layout.topControl = loginForm;
		
		UINotifierManager.notifySuccess(UISessionManager.EVENT_USER_REMOVED, storageAccess.getUsername());
	}
}
