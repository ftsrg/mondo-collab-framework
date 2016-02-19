package org.mondo.collaboration.online.rap.widgets;

import org.eclipse.rap.rwt.RWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;
import org.mondo.collaboration.online.rap.UINotifierManager;

import com.google.common.util.concurrent.FutureCallback;

public class CurrentUserView extends ViewPart {

	private Label label;
	private static final String CURRENT_USER_FORMAT = "Current user: %s";
	private static final String NO_LOGGED_USER = "-";
	
	public static final String ID = "org.mondo.collaboration.online.rap.widgets.CurrentUserView";
	
	private final class SetCurrentUser implements FutureCallback<Object> {
		@Override
		public void onSuccess(Object arg0) {
			setCurrentUser((String) arg0);
		}

		@Override
		public void onFailure(Throwable arg0) {}
	}

	@Override
	public void createPartControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.None);
		composite.setLayout(new FillLayout());
		{
			label = new Label(composite, SWT.None);
			setCurrentUser(NO_LOGGED_USER);
		}
		
		
		UINotifierManager.register(ModelExplorer.EVENT_USER_LOGGED_IN, RWT.getUISession(), new SetCurrentUser());
	}

	protected void setCurrentUser(String username) {
		label.getDisplay().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				label.setText(String.format(CURRENT_USER_FORMAT, username));
				label.update();
			}
		});
	}
	
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
