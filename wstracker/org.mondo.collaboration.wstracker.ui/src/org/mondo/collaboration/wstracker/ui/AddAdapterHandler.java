package org.mondo.collaboration.wstracker.ui;

import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.mondo.collaboration.wstracker.adapter.WSTrackerContentAdapter;

import com.google.common.collect.Maps;

public class AddAdapterHandler extends AbstractHandler implements IHandler {

	private IWorkbenchPage activePage;
	private Map<EditingDomain, WSTrackerContentAdapter> map = Maps.newHashMap();

	public AddAdapterHandler() {
		activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		@SuppressWarnings("deprecation")
		IEditorPart[] editors = activePage.getEditors();
		for (IEditorPart part : editors) {
			if (part instanceof IEditingDomainProvider) {
				IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) part;
				EditingDomain editingDomain = editingDomainProvider.getEditingDomain();
				map.put(editingDomain, new WSTrackerContentAdapter(editingDomain));
			}
		}
		return null;
	}

}
