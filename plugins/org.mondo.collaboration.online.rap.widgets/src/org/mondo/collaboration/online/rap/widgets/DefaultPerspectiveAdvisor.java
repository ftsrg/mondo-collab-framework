package org.mondo.collaboration.online.rap.widgets;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class DefaultPerspectiveAdvisor {

	public static void openDefaultViews() throws PartInitException {
		openView(CurrentUserView.ID);
	}
	
	public static void hideDefaultViews() {
		hideView(CurrentUserView.ID);
		hideView(WhiteboardChatView.ID);
		hideView(ModelLogView.ID);
		hideView(IPageLayout.ID_PROP_SHEET);
	}
	
	public static void openModelRelatedViews() throws PartInitException {
		openView(WhiteboardChatView.ID);
		openView(ModelLogView.ID);
		openView(IPageLayout.ID_PROP_SHEET);
	}
	
	public static void hideModelRelatedViews() {
		hideView(WhiteboardChatView.ID);
		hideView(ModelLogView.ID);
		hideView(IPageLayout.ID_PROP_SHEET);
	}
	
	private static void openView(String id) throws PartInitException {
		IWorkbenchPage activePage = getActivePage();
		activePage.showView(id);
	}
	
	private static void hideView(String id) {
		IWorkbenchPage activePage = getActivePage();
		IViewPart view = activePage.findView(id);
		activePage.hideView(view);
	}

	private static IWorkbenchPage getActivePage() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();
		return activePage;
	}
	
}
