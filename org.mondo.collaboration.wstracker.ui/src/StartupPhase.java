import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.mondo.collaboration.wstracker.ui.AddAdapterHandler;


public class StartupPhase implements IStartup {

	@Override
	public void earlyStartup() {
		registerHandler();
	}
	
	private void registerHandler() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		workbench.addWindowListener(addWindowListener());
		if(workbench.getActiveWorkbenchWindow() != null) {
			IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
			windowListener(window);
		}
		
	}

	private void windowListener(IWorkbenchWindow window) {
		window.addPageListener(addPageListener());
		if(window.getActivePage() != null) {
			IWorkbenchPage page = window.getActivePage();
			pageListener(page);
		}
	}

	private void pageListener(IWorkbenchPage page) {
		page.addPartListener(addPartListener());
		if(page.getActiveEditor() != null) {
			IEditorPart activeEditor = page.getActiveEditor();
			addAdapter(activeEditor);
		}
	}

	private IWindowListener addWindowListener() {
		return new IWindowListener() {
			
			@Override
			public void windowOpened(IWorkbenchWindow window) {
				windowListener(window);
			}
			
			@Override
			public void windowDeactivated(IWorkbenchWindow window) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(IWorkbenchWindow window) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(IWorkbenchWindow window) {
				windowListener(window);
			}
		};
	}

	private IPartListener addPartListener() {
		return new IPartListener() {
			
			@Override
			public void partOpened(IWorkbenchPart part) {
				addAdapter(part);
			}
			
			@Override
			public void partDeactivated(IWorkbenchPart part) {
			}
			
			@Override
			public void partClosed(IWorkbenchPart part) {
				if(part instanceof IEditingDomainProvider) {
					EditingDomain domain = ((IEditingDomainProvider) part).getEditingDomain();
					AddAdapterHandler.removeAdapterHandler(domain);
				}
			}
			
			@Override
			public void partBroughtToTop(IWorkbenchPart part) {
			}
			
			@Override
			public void partActivated(IWorkbenchPart part) {
				addAdapter(part);
			}
		};
	}

	private IPageListener addPageListener() {
		return new IPageListener() {
			
			@Override
			public void pageOpened(IWorkbenchPage page) {
				pageListener(page);
			}

			@Override
			public void pageClosed(IWorkbenchPage page) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void pageActivated(IWorkbenchPage page) {
				pageListener(page);
			}
		};
	}
	
	private void addAdapter(IWorkbenchPart part) {
		if(part instanceof IEditingDomainProvider) {
			EditingDomain domain = ((IEditingDomainProvider) part).getEditingDomain();
			AddAdapterHandler.addAdapterHandler(domain);
		}
	}
}
