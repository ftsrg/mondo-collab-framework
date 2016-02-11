package org.mondo.collaboration.online.rap.widgets;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.ViewPart;
import org.mondo.collaboration.online.core.LensSessionManager;
import org.mondo.collaboration.online.rap.UINotifierManager;

import com.google.common.collect.Maps;
import com.google.common.util.concurrent.FutureCallback;

import swing2swt.layout.BorderLayout;

public class WhiteboardChatView extends ViewPart {
	public WhiteboardChatView() {
	}

	private static final class NewMessageArrived implements FutureCallback<Object> {

		private WhiteboardChatView view;

		public NewMessageArrived(WhiteboardChatView view) {
			this.view = view;
		}

		@Override
		public void onSuccess(Object arg0) {
			if(view.currentURI.equals(arg0))
				view.updateView();
		}

		@Override
		public void onFailure(Throwable arg0) {
		}
	}

	private static final class RemoveClosedSession implements FutureCallback<Object> {
		@Override
		public void onSuccess(Object arg0) {
			messages.remove(arg0);
		}

		@Override
		public void onFailure(Throwable arg0) {
		}
	}

	private static final class AddNewSession implements FutureCallback<Object> {
		@Override
		public void onSuccess(Object arg0) {
			URI uri = (URI) arg0;
			messages.put(uri, "WhiteboardChat started for uri " + uri.toFileString());
		}

		@Override
		public void onFailure(Throwable arg0) {
		}
	}

	private final class PartListenerImplementation implements IPartListener {

		@Override
		public void partActivated(IWorkbenchPart part) {
			if (part instanceof EditorPart) {
				EditorPart editorPart = (EditorPart) part;
				if (editorPart.getEditorInput() instanceof URIEditorInput) {
					URIEditorInput input = (URIEditorInput) editorPart.getEditorInput();
					updateView(input.getURI());
					txtMessage.setEnabled(true);
				} else {
					txtMessage.setEnabled(false);
					txtMessagePool.setText("Message Pool");
				}
			}
		}

		@Override
		public void partBroughtToTop(IWorkbenchPart part) {
		}

		@Override
		public void partClosed(IWorkbenchPart part) {
		}

		@Override
		public void partDeactivated(IWorkbenchPart part) {
		}

		@Override
		public void partOpened(IWorkbenchPart part) {
		}

	}

	public static final String ID = "org.mondo.collaboration.online.rap.widgets.WhiteboardChatView"; //$NON-NLS-1$

	public static final String EVENT_NEW_MESSAGE = "org.mondo.collaboration.online.rap.widgets.WhiteboardChatView.new.message";

	private volatile static Map<URI, String> messages = Maps.newHashMap();

	private Text txtMessagePool;

	private URI currentURI;

	private Text txtMessage;

	// Static constructor for registering the global changes.
	static {
		UINotifierManager.register(LensSessionManager.EVENT_SESSION_OPENED, RWT.getUISession(), new AddNewSession());
		UINotifierManager.register(LensSessionManager.EVENT_SESSION_CLOSED, RWT.getUISession(),
				new RemoveClosedSession());
	}

	protected void updateView(URI uri) {
		this.currentURI = uri;
		if (messages.containsKey(uri)) {
			txtMessagePool.getDisplay().asyncExec(new Runnable() {
				@Override
				public void run() {
					txtMessagePool.setText(messages.get(uri));
					txtMessagePool.update();
				}
			});
		}
	}

	protected void updateView() {
		txtMessagePool.getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				txtMessagePool.setText(messages.get(currentURI));
				txtMessagePool.update();
			}
		});
	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {

		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new BorderLayout());
		{
			Composite composite = new Composite(container, SWT.NONE);
			composite.setLayoutData(BorderLayout.SOUTH);
			composite.setLayout(new BorderLayout());

			txtMessage = new Text(composite, SWT.BORDER);
			txtMessage.setLayoutData(BorderLayout.CENTER);

			Button btnSend = new Button(composite, SWT.None);
			btnSend.setLayoutData(BorderLayout.EAST);
			btnSend.setText("Send");
			btnSend.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseUp(MouseEvent e) {
					super.mouseUp(e);
					String message = txtMessage.getText();
					if(message != null && !message.trim().isEmpty()) {
						StringBuilder sb = new StringBuilder();
						sb.append(System.lineSeparator());
						
						sb.append("#");
						Date now = new Date();
					    String strDate = ModelExplorer.DATE_FORMAT.format(now);
					    sb.append(strDate);
					    sb.append(" ");
						sb.append(ModelExplorer.getCurrentStorageAccess().getUsername());
						sb.append(": ");
						sb.append(message);
						
						String fullMessage = messages.get(currentURI);
						fullMessage += sb.toString();
						messages.put(currentURI, fullMessage);
						UINotifierManager.notifySuccess(EVENT_NEW_MESSAGE, currentURI);
						
						txtMessage.setText("");
					}
				}
			});
		}
		{
			Composite composite = new Composite(container, SWT.NONE);
			composite.setLayoutData(BorderLayout.CENTER);
			composite.setLayout(new FillLayout());

			txtMessagePool = new Text(composite, SWT.READ_ONLY | SWT.V_SCROLL | SWT.H_SCROLL);
			txtMessagePool.setText("Message Pool");
		}

		initializeView();

		createActions();
		initializeToolBar();
		initializeMenu();
	}

	private void initializeView() {
		getViewSite().getWorkbenchWindow().getActivePage().addPartListener(new PartListenerImplementation());
		if(getViewSite().getWorkbenchWindow().getActivePage().getActiveEditor() != null) {
			IEditorInput input = getViewSite().getWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput();
			if(input instanceof URIEditorInput) {
				updateView(((URIEditorInput) input).getURI());
			}
		} else {
			txtMessage.setEnabled(false);
		}
		UINotifierManager.register(EVENT_NEW_MESSAGE, RWT.getUISession(), new NewMessageArrived(this));
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
//		IToolBarManager toolbarManager = getViewSite().getActionBars().getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
//		IMenuManager menuManager = getViewSite().getActionBars().getMenuManager();
	}

	@Override
	public void setFocus() {
		txtMessage.setFocus();
	}
}
