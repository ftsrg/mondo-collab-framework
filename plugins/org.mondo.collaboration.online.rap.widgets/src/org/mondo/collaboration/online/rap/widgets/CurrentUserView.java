package org.mondo.collaboration.online.rap.widgets;

import org.eclipse.rap.rwt.RWT;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.mondo.collaboration.online.rap.UINotifierManager;

import com.google.common.util.concurrent.FutureCallback;

public class CurrentUserView extends ViewPart {

	private Label label;
	private static final String CURRENT_USER_FORMAT = "Current user: %s";
	private static final String NO_LOGGED_USER = "-";

	private String username = NO_LOGGED_USER;
	private Button logout;

	public static final String ID = "org.mondo.collaboration.online.rap.widgets.CurrentUserView";

	private final class SetCurrentUser implements FutureCallback<Object> {
		@Override
		public void onSuccess(Object arg0) {
			setCurrentUser((String) arg0);
		}

		@Override
		public void onFailure(Throwable arg0) {
		}
	}

	@Override
	public void init(IViewSite site, IMemento memento) throws PartInitException {
		if (memento != null)
			username = memento.getString("username");
		super.init(site, memento);
	}

	@Override
	public void createPartControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.None);
		FillLayout layout = new FillLayout();
		layout.type = SWT.VERTICAL;
		composite.setLayout(layout);
		{
			label = new Label(composite, SWT.None);
			setCurrentUser(username);

			logout = new Button(composite, SWT.None);
			logout.setText("Logout");
			logout.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseUp(MouseEvent e) {
					super.mouseUp(e);
					logout();
				}
			});
			logout.setVisible(false);
		}

		UINotifierManager.register(ModelExplorer.EVENT_USER_LOGGED_IN, RWT.getUISession(), new SetCurrentUser());
	}

	protected void logout() {

		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();

		activePage.closeAllEditors(true);
		try {
			ModelExplorer.logout();
		} catch (PartInitException e) {
			e.printStackTrace();
		}

		label.setText("");
		label.update();

		logout.setVisible(false);

	}

	protected void setCurrentUser(Object newUsername) {
		label.getDisplay().asyncExec(new Runnable() {

			@Override
			public void run() {
				if (!newUsername.equals(RWT.getUISession().getHttpSession().getAttribute(ModelExplorer.USERNAME)))
					return;

				username = (String) newUsername;
				label.setText(String.format(CURRENT_USER_FORMAT, username));
				label.update();

				logout.setVisible(true);
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
