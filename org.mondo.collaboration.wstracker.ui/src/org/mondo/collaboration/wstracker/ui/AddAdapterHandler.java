package org.mondo.collaboration.wstracker.ui;

import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.mondo.collaboration.wstracker.adapter.WSTrackerContentAdapter;

import com.google.common.collect.Maps;

public class AddAdapterHandler extends AbstractHandler implements IHandler {

	private IWorkbenchPage activePage;
	private static Map<EditingDomain, WSTrackerContentAdapter> map = Maps.newHashMap();

	public AddAdapterHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		@SuppressWarnings("deprecation")
		IEditorPart[] editors = activePage.getEditors();
		for (IEditorPart part : editors) {
			if (part instanceof IEditingDomainProvider) {
				IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) part;
				EditingDomain editingDomain = editingDomainProvider.getEditingDomain();
				addAdapterHandler(editingDomain);	
			}
		}
		return null;
	}

	public static void addAdapterHandler(EditingDomain domain) {
		if(!map.containsKey(domain))
			map.put(domain, new WSTrackerContentAdapter(domain));
	}

	public static void removeAdapterHandler(EditingDomain domain) {
		if(!map.containsKey(domain))
			return;
		WSTrackerContentAdapter adapter = map.get(domain);
		for(Resource r : domain.getResourceSet().getResources()) {
			r.eAdapters().remove(adapter);
			Logger.getLogger(WSTrackerContentAdapter.class).info("Adapter removed from resource:" + r.getURI());
		}
		map.remove(domain);
	}
	
}
