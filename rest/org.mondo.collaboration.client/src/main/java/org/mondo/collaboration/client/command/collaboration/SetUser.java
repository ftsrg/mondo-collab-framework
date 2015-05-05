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
import org.mondo.collaboration.client.Activator;

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
		JPanel panel = new JPanel();
		
		JLabel userLabel = new JLabel("User name:");
		JTextField username = new JTextField(10);
		panel.add(userLabel);
		panel.add(username);
		
		JLabel passLabel = new JLabel("Password:");
		JPasswordField pass = new JPasswordField(10);
		panel.add(passLabel);
		panel.add(pass);
		
		String[] options = new String[]{"OK", "Cancel"};
		int option = JOptionPane.showOptionDialog(null, panel, "User",
             JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
             null, options, options[1]);
		
		if(option == 0) { // pressing OK button
			String usernameText = username.getText();
			String password = new String(pass.getPassword());
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
