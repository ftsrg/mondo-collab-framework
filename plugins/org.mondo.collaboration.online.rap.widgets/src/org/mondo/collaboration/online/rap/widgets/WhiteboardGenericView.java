package org.mondo.collaboration.online.rap.widgets;

import java.util.Map;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.ViewPart;
import org.mondo.collaboration.online.rap.UINotifierManager;

import com.google.common.util.concurrent.FutureCallback;

public abstract class WhiteboardGenericView extends ViewPart {
	
	public WhiteboardGenericView() {
	}

	public static final String EVENT_NEW_MESSAGE = "org.mondo.collaboration.online.rap.widgets.WhiteboardChatView.new.message";

	/**
	 * @return the static map stored for the log/chat messages
	 */
	protected abstract Map<URI, String> getMessages();
	
	/**
	 * Null-safe get on the map returned by getMessages()
	 * @param uri
	 * @return
	 */
	protected String getMessages(URI uri){
		return getMessages().get(uri) == null ? "" : getMessages().get(uri);
	}
	
	protected URI currentURI;
	protected Text txtMessagePool;
	protected Text txtMessage;

	// TODO specializations should register an instance of the
	// AddToWhiteboard implementation class and the RemoveFromWhiteboard class
	
	// Static initializer for registering the global changes.
	static {
		// These should be added in the implementation classes
		// UINotifierManager.register(LensSessionManager.EVENT_SESSION_OPENED, RWT.getUISession(), new AddToWhiteboardImpl());
		// UINotifierManager.register(LensSessionManager.EVENT_SESSION_CLOSED, RWT.getUISession(), new RemoveFromWhiteboard());
	}

	protected void updateView(URI uri) {
		this.currentURI = uri;
		if (getMessages().containsKey(uri)) {
			txtMessagePool.getDisplay().asyncExec(new Runnable() {
				@Override
				public void run() {
					txtMessagePool.setText(getMessages(uri));
					txtMessagePool.update();
				}
			});
		}
	}

	protected void updateView() {
		txtMessagePool.getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				txtMessagePool.setText(getMessages(currentURI));
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
		initializeView();
	}

	protected void initializeView() {
		getViewSite().getWorkbenchWindow().getActivePage().addPartListener(new PartListenerImplementation());
		if(getViewSite().getWorkbenchWindow().getActivePage().getActiveEditor() != null) {
			IEditorInput input = getViewSite().getWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput();
			if(input instanceof URIEditorInput) {
				updateView(((URIEditorInput) input).getURI());
			}
		} else {
			if(txtMessage != null){
				txtMessage.setEnabled(false);
			}
		}
		UINotifierManager.register(getNewMessageEventId(), RWT.getUISession(), new NewMessageArrived(this));
	}

	/**
	 * 
	 * @return the event ID for which an update is needed
	 */
	protected abstract String getNewMessageEventId();

	@Override
	public void setFocus() {
	}
	

	private static final class NewMessageArrived implements FutureCallback<Object> {

		private WhiteboardGenericView view;

		public NewMessageArrived(WhiteboardGenericView view) {
			this.view = view;
		}

		@Override
		public void onSuccess(Object arg0) {
			if(view.currentURI != null && view.currentURI.equals(arg0))
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
					if(txtMessage != null){
						txtMessage.setEnabled(true);
					}
				} else {
					if(txtMessage != null){
						txtMessage.setEnabled(false);
					}
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
