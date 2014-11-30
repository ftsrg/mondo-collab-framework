package eu.mondo.collaboration.workspaceTrackerMenu.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import eu.mondo.collaboration.operationtracemodel.workspacetracker.MyContentAdapter;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SampleHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public SampleHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = win.getActivePage();
		IEditorPart editorPart = page.getActiveEditor();
		  if (editorPart instanceof IEditingDomainProvider) {
              IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) editorPart;
              ResourceSet result;
              result = editingDomainProvider.getEditingDomain().getResourceSet();
              System.out.println(result.getResources().get(0));
              Resource resource = result.getResources().get(0);
              resource.eAdapters().add(new MyContentAdapter(resource.getResourceSet(), URI.createURI("models/trace.operationtracemodel", true), false));

          }
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"Testelek",
				"Hello, Eclipse world");
		return null;
	}
}
