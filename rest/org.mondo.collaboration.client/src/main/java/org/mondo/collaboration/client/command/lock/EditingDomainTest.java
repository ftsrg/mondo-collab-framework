package org.mondo.collaboration.client.command.lock;

import java.util.EventObject;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.PlatformUI;

import school.presentation.SchoolEditor;
import school.provider.SchoolEditPlugin;

public class EditingDomainTest implements IHandler{

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		
		
		IEditorReference[] editors = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
	    .getActivePage().getEditorReferences();
		
		for(IEditorReference editor: editors)
		{
			System.out.println(editor.getName());
			IEditorPart editorPart = editor.getEditor(true);
			
			
			
			editorPart.addPropertyListener(new IPropertyListener() {
				
				@Override
				public void propertyChanged(Object source, int propId) {
					System.out.println("IPropertyListener");
					System.out.println(source.toString());
					
				}
			});
			
			if(editorPart instanceof SchoolEditor )
			{
				System.out.println("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
				
				SchoolEditor t=(SchoolEditor) editorPart;
				
		
				
				
				EditingDomain domain = t.getEditingDomain();
				
				
				
				
				domain.getCommandStack().addCommandStackListener(new CommandStackListener() {
					
					@Override
					public void commandStackChanged(EventObject event) {
						System.out.println("commandStackListener");
					}
				});
			}
		
			
		}
			//editorPart.
		
		
		
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub
		
	}

}
