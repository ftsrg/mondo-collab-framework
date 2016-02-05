package org.mondo.collaboration.online.rap.widgets;

import org.eclipse.rap.rwt.RWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;
import org.mondo.collaboration.online.rap.UINotifierManager;

import com.google.common.util.concurrent.FutureCallback;

public class ModelLogView extends ViewPart {

	private Composite container;
	private FillLayout layout;
	
	public static final String ID = "org.mondo.collaboration.online.rap.widgets.ModelLog";
	private Text logText;
	private static String lineDelimiter;
	private static String completeLog = "";
	

	public static final String EVENT_UPDATE_LOG = "org.mondo.collaboration.online.rap.widgets.ModelExplorer.update.log";
	
	public Display getDisplay(){
		if(logText == null){
			return null;
		}
		return logText.getDisplay();
	}
	
	public ModelLogView() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		container = new Composite(parent, SWT.NONE | SWT.V_SCROLL | SWT.H_SCROLL);
		layout = new FillLayout(SWT.NONE | SWT.V_SCROLL | SWT.H_SCROLL);
		container.setLayout(layout);

		logText= new Text(container, SWT.NONE | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
		
		logText.setEditable(false);
		
		lineDelimiter = logText.getLineDelimiter();
		
		UINotifierManager.register(EVENT_UPDATE_LOG, RWT.getUISession(), new UpdateLog());

		RWT.getUISession().setAttribute("dummy", this);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
	
	public static void setLogString(String completeLog){
		ModelLogView.completeLog = completeLog;
	}

	public static String getCompleteLogString() {
		return completeLog;
	}

	public void refresh() {
		logText.setText(completeLog);		
	}

	// TODO it might cause a problem on different platforms
	public static String getLineDelimiter() {
		return lineDelimiter;
	}
	

	public class UpdateLog implements FutureCallback<Object> {
		@Override
		public void onFailure(Throwable arg0) {
		}
		
		@Override
		public void onSuccess(Object param) {
			
			Display display = logText.getDisplay();
			display.asyncExec(new Runnable() {
				
				@Override
				public void run() {
					logText.setText(completeLog);
				}
			});
		}
	}

}
