package org.mondo.collaboration.online.rap.widgets;

import org.eclipse.rap.rwt.RWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import org.mondo.collaboration.online.rap.UINotifierManager;

import com.google.common.util.concurrent.FutureCallback;

public class CurrentUserView extends ViewPart {

	private Label label;
	private static final String CURRENT_USER_FORMAT = "Current user: %s";
	private static final String NO_LOGGED_USER = "-";
	
	private String username = NO_LOGGED_USER;
	
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
	public void init(IViewSite site, IMemento memento) throws PartInitException {
		if(memento != null)
			username = memento.getString("username");
		super.init(site, memento);
	}
	
	@Override
	public void createPartControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.None);
		composite.setLayout(new FillLayout());
		{
			label = new Label(composite, SWT.None);
			setCurrentUser(username);
		}
		
		
		UINotifierManager.register(ModelExplorer.EVENT_USER_LOGGED_IN, RWT.getUISession(), new SetCurrentUser());
	}

	protected void setCurrentUser(String newUsername) {
		label.getDisplay().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				if(!newUsername.equals(RWT.getUISession().getHttpSession().getAttribute(ModelExplorer.USERNAME)))
					return;
				
				username = newUsername;
				label.setText(String.format(CURRENT_USER_FORMAT, username));
				label.update();
			}
		});
	}
	
	@Override
	public void setFocus() {
		label.setFocus();
	}

	@Override
	public void saveState(IMemento memento) {
		memento.putString("username", username);
		super.saveState(memento);
	}
	
}
