package org.mondo.collaboration.online.rap.widgets;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
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

import com.google.common.util.concurrent.FutureCallback;

import swing2swt.layout.BorderLayout;

public abstract class WhiteboardGenericView extends ViewPart {
	
	public WhiteboardGenericView() {
	}

	public static final String EVENT_NEW_MESSAGE = "org.mondo.collaboration.online.rap.widgets.WhiteboardChatView.new.message";

	/**
	 * @return the static map stored for the log/chat messages
	 */
	protected abstract Map<URI, String> getMessages();
	
	private Text txtMessagePool;
	private URI currentURI;
	private Text txtMessage;

	// TODO specializations should register an instance of the
	// AddToWhiteboard implementation class and the RemoveFromWhiteboard class
	
	// Static initializer for registering the global changes.
	static {
		// These should be added in the implementation classes
		// UINotifierManager.register(LensSessionManager.EVENT_SESSION_OPENED, RWT.getUISession(), new AddToWhiteboard());
		// UINotifierManager.register(LensSessionManager.EVENT_SESSION_CLOSED, RWT.getUISession(), new RemoveFromWhiteboard());
	}

	protected void updateView(URI uri) {
		this.currentURI = uri;
		if (getMessages().containsKey(uri)) {
			txtMessagePool.getDisplay().asyncExec(new Runnable() {
				@Override
				public void run() {
					txtMessagePool.setText(getMessages().get(uri));
					txtMessagePool.update();
				}
			});
		}
	}

	protected void updateView() {
		txtMessagePool.getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				txtMessagePool.setText(getMessages().get(currentURI));
				txtMessagePool.update();
			}
		});
	}
	
	private void sendMessage() {
		String message = txtMessage.getText();
		if(message != null && !message.trim().isEmpty()) {
			StringBuilder sb = new StringBuilder();
			
			sb.append("#");
			Date now = new Date();
		    String strDate = ModelExplorer.DATE_FORMAT.format(now);
		    sb.append(strDate);
		    sb.append(" ");
			sb.append(ModelExplorer.getCurrentStorageAccess().getUsername());
			sb.append(": ");
			sb.append(message);
			sb.append(System.lineSeparator());
			
			String fullMessage = getMessages().get(currentURI);
			fullMessage = sb.toString().concat(fullMessage);
			getMessages().put(currentURI, fullMessage);
			UINotifierManager.notifySuccess(EVENT_NEW_MESSAGE, currentURI);
			
			txtMessage.setText("");
		}
	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {

		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new BorderLayout(0, 0));
		{
			Composite composite = new Composite(container, SWT.NONE);
			composite.setLayoutData(BorderLayout.SOUTH);
			composite.setLayout(new BorderLayout(0, 0));

			txtMessage = new Text(composite, SWT.BORDER);
			txtMessage.setLayoutData(BorderLayout.CENTER);
			

			txtMessage.addKeyListener(new KeyAdapter() {

				@Override
				public void keyPressed(KeyEvent e) {
					super.keyPressed(e);
					if (e.keyCode == SWT.CR || e.keyCode == SWT.KEYPAD_CR) { 
						sendMessage();
					}
				}

			});

			Button btnSend = new Button(composite, SWT.None);
			btnSend.setLayoutData(BorderLayout.EAST);
			btnSend.setText("Send");
			btnSend.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseUp(MouseEvent e) {
					super.mouseUp(e);
					sendMessage();
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

	protected void initializeView() {
		getViewSite().getWorkbenchWindow().getActivePage().addPartListener(new PartListenerImplementation());
		if(getViewSite().getWorkbenchWindow().getActivePage().getActiveEditor() != null) {
			IEditorInput input = getViewSite().getWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput();
			if(input instanceof URIEditorInput) {
				updateView(((URIEditorInput) input).getURI());
			}
		} else {
			txtMessage.setEnabled(false);
		}
		UINotifierManager.register(getNewMessageEventId(), RWT.getUISession(), new NewMessageArrived(this));
	}

	/**
	 * 
	 * @return the event ID for which an update is needed
	 */
	protected abstract String getNewMessageEventId();

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
	

	private static final class NewMessageArrived implements FutureCallback<Object> {

		private WhiteboardGenericView view;

		public NewMessageArrived(WhiteboardGenericView view) {
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

	private abstract static class GenericWhiteboardCallback implements FutureCallback<Object>{
		protected static WhiteboardGenericView viewInstance;

		public void setMessageSource(WhiteboardGenericView view){
			viewInstance = view;
		}
	}
	
	protected static class RemoveFromWhiteboard extends GenericWhiteboardCallback {
		@Override
		public void onSuccess(Object arg0) {
			viewInstance.getMessages().remove(arg0);
		}

		@Override
		public void onFailure(Throwable arg0) {
		}
	}

	protected abstract static class AddToWhiteboard extends GenericWhiteboardCallback {
		
		public abstract String getViewKind();
		
		@Override
		public void onSuccess(Object arg0) {
			URI uri = (URI) arg0;
			viewInstance.getMessages().put(uri, getViewKind() + " started for uri " + uri.toFileString());
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

	
}
