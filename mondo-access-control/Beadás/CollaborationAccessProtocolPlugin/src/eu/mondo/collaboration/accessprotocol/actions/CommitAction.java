package eu.mondo.collaboration.accessprotocol.actions;

import java.util.ArrayList;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import eu.mondo.collaboration.accessprotocol.control.AccessControlHelper;
import eu.mondo.collaboration.accessprotocol.control.PEPHelper;
import eu.mondo.collaboration.accessprotocol.utils.StepByUser;
import eu.mondo.collaboration.offline.client.ClientSideInterface;

public class CommitAction implements IObjectActionDelegate {
	
	private Shell shell;
	
	/**
	 * Constructor for PullAction.
	 */
	public CommitAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		ArrayList<StepByUser> stepQueue = AccessControlHelper.loadWorkspaceTracker();
		boolean commitSuccess = PEPHelper.checkPermissionForSteps(stepQueue);
		if(commitSuccess){
			if(ClientSideInterface.commit(stepQueue)){
				MessageDialog.openInformation(shell, "MONDO Collaboration", "Commit was successfully!");
			}
		} else {
			MessageDialog.openError(shell, "MONDO Collaboration Error", "Permission denied! You do not have permision to commit these changes.");
		}
		
		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {

	}
}
