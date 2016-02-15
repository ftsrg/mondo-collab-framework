package org.mondo.collaboration.online.rap.widgets;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.mondo.collaboration.online.core.StorageAccess;
import org.mondo.collaboration.online.core.StorageAccessFactory;
import org.mondo.collaboration.online.core.StorageModel;
import org.mondo.collaboration.online.core.StorageModel.NodeType;
import org.mondo.collaboration.online.core.StorageModel.StorageModelNode;
import org.mondo.collaboration.online.rap.UINotifierManager;

/**
 * @author Csaba Debreceni
 *
 */
public class ModelExplorer extends ViewPart {

	public static final String ID = "org.mondo.collaboration.online.rap.widgets.ModelExplorer";
	public static final String EVENT_UPDATE_PATH = "org.mondo.collaboration.online.rap.widgets.ModelExplorer.update.path";
	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat();
	
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
		
		if(retrieveHttpSession()) {
			try {
				processLogin(usernameField.getText(), passwordField.getText(), true);
				layout.topControl = modelExplorer;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			layout.topControl = loginForm;
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
                    if(node.getType() != NodeType.Folder) {
                    	
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
		StorageModelNode node = (StorageModelNode)selection.getFirstElement();
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
                    if(node.getType() != NodeType.Folder) {
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

		final Label usernameLabel = new Label(loginPanel, SWT.RIGHT);
		usernameLabel.setText("Username: "); //$NON-NLS-1$
		usernameField = new Text(loginPanel, SWT.SINGLE | SWT.BORDER);

		final GridData data = new GridData(SWT.FILL, SWT.CENTER, true, false);
		usernameField.setLayoutData(data);

		final Label passwordLabel = new Label(loginPanel, SWT.RIGHT);
		passwordLabel.setText("Password: "); //$NON-NLS-1$
		passwordField = new Text(loginPanel, SWT.SINGLE | SWT.BORDER | SWT.PASSWORD);
		passwordField.setLayoutData(data);

		remember = new Button(loginPanel, SWT.CHECK);
		remember.setText("Remember me"); //$NON-NLS-1$
		final Button login = new Button(loginPanel, SWT.CENTER);
		login.setText("Login"); //$NON-NLS-1$
		login.setLayoutData(data);
		
		login.addListener(SWT.Selection, new Listener() {
			
			private static final long serialVersionUID = 1L;

			@Override
			public void handleEvent(Event event) {
				try {
					processLogin(usernameField.getText(), passwordField.getText(), false);
				} catch (IOException e) {
					showMessage(parent, "Exception", e.getMessage(), SWT.ERROR | SWT.ABORT);
				}
			}
		});
		
		return loginPanel;
	}

	protected int showMessage(Composite container, String title, String message, int style) {
		MessageBox messageBox = new MessageBox(container.getShell(), style);
		messageBox.setMessage(message);
		messageBox.setText(title);
		
		return messageBox.open();
	}
	
	protected void processLogin(String username, String password, boolean internal) throws FileNotFoundException, IOException {
		access = StorageAccessFactory.createStorageAccess(username, password);
		String loginReason = access.login();
		if(loginReason != null && !internal) {
			showMessage(container, "Login failed", loginReason, SWT.ERROR | SWT.RETRY);
			return;
		}
		
		try {
			
			if(remember.getSelection()) {
				internalStoreUserData();
			}
			
			internalStoreHttpSession();
			
			StorageModel storageModel = access.explore();
			treeViewer.setInput(storageModel);
			modelExplorer.setVisible(true);
			loginForm.setVisible(false);
			layout.topControl = modelExplorer;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private boolean retrieveHttpSession() {
		Object username = RWT.getUISession().getHttpSession().getAttribute("username");
		Object password = RWT.getUISession().getHttpSession().getAttribute("password");
		
		if(username != null && password != null) {
			usernameField.setText((String)username);
			passwordField.setText((String)password);
			return true;
		}
		return false;
	}
	
	private void internalStoreHttpSession() {
		RWT.getUISession().getHttpSession().setAttribute("username", usernameField.getText());
		RWT.getUISession().getHttpSession().setAttribute("password", passwordField.getText());
		RWT.getUISession().getHttpSession().setAttribute("storageaccess", access);
	}
	
	private void internalStoreUserData() throws Exception {
		RWT.getSettingStore().setAttribute("username", usernameField.getText());
		RWT.getSettingStore().setAttribute("password", passwordField.getText());
	}
	
	@Override
	public void setFocus() {
		usernameField.setFocus();
	}	
	
	public boolean openEditor(IWorkbench workbench, String path) {
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		
		URI uri;
		try {
			uri = access.startSession(path);
		} catch (Exception e) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			showMessage(container, "Error", sw.toString(), SWT.ERROR);
			return false;
		}
		
		IEditorDescriptor editorDescriptor = EditUIUtil.getDefaultEditor(uri, null);
		if (editorDescriptor == null) {
			MessageDialog.openError(
				workbenchWindow.getShell(),
				"Error",
				"No editor is registered");
			return false;
		}
		else {
			try {
				page.openEditor(new URIEditorInput(uri), editorDescriptor.getId());
//				page.showView(ModelLogView.ID);
//				String logString = ModelLogView.getCompleteLogString();
//				if(logString.equals("")){
//					Date now = new Date();
//				    String strDate = DATE_FORMAT.format(now);
//
//					String username = ModelExplorer.getCurrentStorageAccess().getUsername();
//				    
//					ModelLogView.setLogString(strDate + " Whiteboard initialized by " + username);
//				}
//				UINotifierManager.notifySuccess(ModelLogView.EVENT_UPDATE_LOG, null);
				
			}
			catch (PartInitException exception) {
				MessageDialog.openError(
					workbenchWindow.getShell(),
					"Error",
					exception.getMessage());
				return false;
			}
		}
		return true;
	}
	
	public static StorageAccess getCurrentStorageAccess() {
		return (StorageAccess) RWT.getUISession().getHttpSession().getAttribute("storageaccess");
	}
}
