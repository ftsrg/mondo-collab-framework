package eu.mondo.collaboration.accessprotocol.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import eu.mondo.collaboration.accessprotocol.control.PEPHelper;
import eu.mondo.collaboration.accessprotocol.control.XACMLHelper;
import eu.mondo.collaboration.accessprotocol.utils.User;
import eu.mondo.collaboration.accessprotocol.utils.UserSession;
import eu.mondo.collaboration.offline.client.ClientSideInterface;


public class CheckoutAction implements IObjectActionDelegate {
	
	private Shell shell;
	
	/**
	 * Constructor for PullAction.
	 */
	public CheckoutAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		User user = UserSession.getCurrentUser();
		String request = XACMLHelper.createCheckoutRequest(user.getId());
		boolean checkoutSuccess = PEPHelper.checkAccessByRequest(request);
		System.out.println("========================");
		if(checkoutSuccess){
			System.out.println("CHECKOUT SUCCESS!");
			ClientSideInterface.checkout(request);
		} else {
			System.out.println("CHECKOUT DENIED!");
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {

	}

}
