package eu.mondo.collaboration.workspaceTrackerMenu.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import eu.mondo.collaboration.operationtracemodel.workspacetracker.WTContentAdapter;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SampleHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	IPartListener partListener;
	IWorkbenchPage page;
	public SampleHandler() {
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
		page = win.getActivePage();
		partListener  = new IPartListener() {
			
			
			public void partActivated(IWorkbenchPart part) {
				// TODO Auto-generated method stub
				
			}
			public void partBroughtToTop(IWorkbenchPart part) {
				// TODO Auto-generated method stub
				
			}
			public void partClosed(IWorkbenchPart part) {
				// TODO Auto-generated method stub
				
			}
			public void partDeactivated(IWorkbenchPart part) {
				// TODO Auto-generated method stub
				
			}
			public void partOpened(IWorkbenchPart part) {
				if (part instanceof IEditingDomainProvider) {
		              IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) part;
		              ResourceSet resourceSet;
		              resourceSet = editingDomainProvider.getEditingDomain().getResourceSet();
		              Resource resource = resourceSet.getResources().get(0);
		              String path = resource.getURI().toString().replaceAll(resource.getURI().lastSegment(), resource.getURI().lastSegment().replaceAll("\\.", "_")) + ".operationtracemodel";
		              resource.eAdapters().add(new WTContentAdapter(resource.getResourceSet(), URI.createURI(path, true), true));
				 }						
			}
		
		};
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		
		Command command = event.getCommand();
		boolean oldValue = HandlerUtil.toggleCommandState(command);
		
		
		if(oldValue) {
			@SuppressWarnings("deprecation")
			IEditorPart[] editors = page.getEditors();
			for (IEditorPart editor : editors) {
				if (editor instanceof IEditingDomainProvider) {
		              IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) editor;
		              ResourceSet resourceSet;
		              resourceSet = editingDomainProvider.getEditingDomain().getResourceSet();
		              Resource resource = resourceSet.getResources().get(0);
		              for (Adapter adapter : resource.eAdapters()) {
		            	  if( adapter instanceof WTContentAdapter) {
		            		  resource.eAdapters().remove(adapter);
		            	  }
		              }
				 }	
			}
			page.removePartListener(partListener);
		} else {
			@SuppressWarnings("deprecation")
			IEditorPart[] editors = page.getEditors();
			for (IEditorPart editor : editors) {
				if (editor instanceof IEditingDomainProvider) {
		              IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) editor;
		              ResourceSet resourceSet;
		              resourceSet = editingDomainProvider.getEditingDomain().getResourceSet();
		              Resource resource = resourceSet.getResources().get(0);
		              String path = resource.getURI().toString().replaceAll(resource.getURI().lastSegment(), resource.getURI().lastSegment().replaceAll("\\.", "_")) + ".operationtracemodel";
		              resource.eAdapters().add(new WTContentAdapter(resource.getResourceSet(), URI.createURI(path, true), true));
				 }	
			}
			page.addPartListener(partListener);
		}

		return null;
	}
}
