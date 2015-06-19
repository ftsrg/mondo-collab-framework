package org.mondo.collaboration.client.command.collaboration;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.mondo.collaboration.client.Activator;
import org.mondo.collaboration.client.views.PasswordDialog;

public class SetUser implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		PasswordDialog dialog = new PasswordDialog(shell);
		if (dialog.open() == Window.OK) {
			String usernameText = dialog.getUser();
			String password = new String(dialog.getPassword());
			Activator.user.setUsername(usernameText);
			Activator.user.setPassword(password);
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener arg0) {
		// TODO Auto-generated method stub
		
	}
}
