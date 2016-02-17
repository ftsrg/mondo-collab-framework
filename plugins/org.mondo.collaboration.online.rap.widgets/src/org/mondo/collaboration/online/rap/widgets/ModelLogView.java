package org.mondo.collaboration.online.rap.widgets;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.mondo.collaboration.online.core.LensSessionManager;
import org.mondo.collaboration.online.rap.UINotifierManager;

import com.google.common.collect.Maps;

public class ModelLogView extends WhiteboardGenericView {

	public ModelLogView() {
	}

	private static AddLogToWhiteboard addCallback;
	private static RemoveFromWhiteboard removeCallback;
	
	// Static constructor for registering the global changes.
	static {
		addCallback = new AddLogToWhiteboard();
		UINotifierManager.register(LensSessionManager.EVENT_WHITEBOARD_SESSION_OPENED, RWT.getUISession(), addCallback);
		removeCallback = new RemoveFromWhiteboard();
		UINotifierManager.register(LensSessionManager.EVENT_WHITEBOARD_SESSION_CLOSED, RWT.getUISession(), removeCallback);
	}
	
	public static final String ID = "org.mondo.collaboration.online.rap.widgets.ModelLogView";
	public static final String EVENT_UPDATE_LOG = "org.mondo.collaboration.online.rap.widgets.ModelExplorer.update.log";

	private volatile static Map<URI, String> messages = Maps.newHashMap();
	
	private Composite container;
	private FillLayout layout;
	private static String lineDelimiter;
	
	public Display getDisplay(){
		if(txtMessagePool == null){
			return null;
		}
		return txtMessagePool.getDisplay();
	}
	
	public static void addMessage(String message, URI uri){
		String fullLog = messages.get(uri);
		fullLog = message + lineDelimiter + fullLog;
		messages.put(uri, fullLog);
		
		UINotifierManager.notifySuccess(ModelLogView.EVENT_UPDATE_LOG, uri);
	}
	
	@Override
	public void createPartControl(Composite parent) {
		addCallback.setMessageSource(this);
		removeCallback.setMessageSource(this);
		
		container = new Composite(parent, SWT.NONE | SWT.V_SCROLL | SWT.H_SCROLL);
		layout = new FillLayout(SWT.NONE | SWT.V_SCROLL | SWT.H_SCROLL);
		container.setLayout(layout);

		txtMessagePool= new Text(container, SWT.NONE | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		
		txtMessagePool.setEditable(false);
		
		lineDelimiter = txtMessagePool.getLineDelimiter();
		
		super.createPartControl(parent);
	}

	// TODO it might cause a problem on different platforms
	public static String getLineDelimiter() {
		return lineDelimiter;
	}
	

	@Override
	protected Map<URI, String> getMessages() {
		return messages;
	}

	protected static class AddLogToWhiteboard extends AddToWhiteboard {
		@Override
		public String getViewKind() {
			return "Model log";
		}
	}

	@Override
	protected String getNewMessageEventId() {
		return EVENT_UPDATE_LOG;
	}
	
}
