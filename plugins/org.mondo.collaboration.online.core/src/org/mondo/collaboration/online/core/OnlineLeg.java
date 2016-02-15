package org.mondo.collaboration.online.core;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.viatra.modelobfuscator.api.DataTypeObfuscator;
import org.mondo.collaboration.security.lens.bx.AbortReason.DenialReason;
import org.mondo.collaboration.security.lens.bx.online.OnlineCollaborationSession;
import org.mondo.collaboration.security.lens.bx.online.OnlineCollaborationSession.Leg;
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey;
import org.mondo.collaboration.security.lens.util.LiveTable;

public class OnlineLeg extends Leg {

	public static final String EVENT_UPDATE = "org.mondo.collaboration.online.core.OnlineLeg.update";
	public static final String EVENT_SAVE = "org.mondo.collaboration.online.core.OnlineLeg.save";
	
	public static final String COMMAND_TITLE = "Lens Command"; //$NON-NLS-1$
	public static final String COMMAND_DESCRIPTION = "This is a command executed by the lens transformation. It cannot be reverted."; //$NON-NLS-1$

	
	private static Logger logger = Logger.getLogger(OnlineLeg.class);

	protected boolean initialized = false;
	protected AdapterFactoryEditingDomain editingDomain;

	protected OnlineCollaborationSession onlineCollaborationSession;

	public OnlineLeg(OnlineCollaborationSession onlineCollaborationSession, String userName,
			DataTypeObfuscator<String> stringObfuscator, boolean startWithGet, AdapterFactoryEditingDomain editingDomain,
			URI frontConfinementURI) 
					throws InvocationTargetException {
		onlineCollaborationSession.super(userName, stringObfuscator, startWithGet, editingDomain.getResourceSet(), frontConfinementURI);
		
		this.onlineCollaborationSession = onlineCollaborationSession;
		this.editingDomain = editingDomain;
		
		initialized = true;
	}
	
	
	boolean noUpdate;
	@Override
	public void overWriteFromGold() {
		if(noUpdate) {
			noUpdate = false;
			return;
		}
			
		if(!initialized) {
			internalOverWriteFromGold();
		} else {
			logger.info("Lens command is creating");
			Command cmd = new LegCommand() {
				@Override
				public void execute() {
					logger.info("Lens command is executing");
					internalOverWriteFromGold();
					logger.info("Callback method is calling");
					NotifierManager.notifySuccess(EVENT_UPDATE, null);
				}
			};
			editingDomain.getCommandStack().execute(cmd);
		}
	}
	
	@Override
	public DenialReason trySubmitModification() {
		noUpdate = true;
		return super.trySubmitModification();
	}
	
	protected void internalOverWriteFromGold() {
		super.overWriteFromGold();
	}
	
	public OnlineCollaborationSession getOnlineCollaborationSession() {
		return onlineCollaborationSession;
	}
	
	public ResourceSet getGoldResourceSet() {
		return onlineCollaborationSession.getGoldResourceSet();
	}
	
	public AdapterFactoryEditingDomain getEditingDomain() {
		return editingDomain;
	}
	
	public abstract class LegCommand extends AbstractCommand {

		@Override
		public String getLabel() {
			return COMMAND_TITLE;
		}
		
		@Override
		public String getDescription() {
			return COMMAND_DESCRIPTION;
		}
		
		@Override
		protected boolean prepare() {
			return true;
		}
		
		@Override
		public void redo() {
			execute();
		}
		
		@Override
		public boolean canUndo() {
			return false;
		}
	}
	
	public class CreateCommand extends CreateChildCommand {

		final Command setIdCommand;
		
		public CreateCommand(EditingDomain domain, EObject owner, 
				EStructuralFeature containerfeature, 
				Object child, Collection<?> selection, EAttribute idAttribute) {
			super(domain, owner, containerfeature, child, selection);
			this.setIdCommand = createSetIdCommand(idAttribute, (EObject)child);
		}
		
		public CreateCommand(EditingDomain domain, EObject owner, 
				EStructuralFeature containerFeature, Object child,
				Collection<?> selection, EAttribute idAttribute, Helper helper) {
			super(domain, owner, containerFeature, child, selection, helper);
			this.setIdCommand = createSetIdCommand(idAttribute, (EObject)child);
		}
		
		public CreateCommand(EditingDomain domain, EObject owner, 
				EStructuralFeature containerFeature, Object child
				, EAttribute idAttribute, int index, Collection<?> selection) {
			super(domain, owner, containerFeature, child, index, selection);
			this.setIdCommand = createSetIdCommand(idAttribute, (EObject)child);
		}
		
		public CreateCommand(EditingDomain domain, EObject owner,
				EStructuralFeature containerFeature, 
				Object child, EAttribute idAttribute, int index,
				Collection<?> selection, Helper helper) {
			super(domain, owner, containerFeature, child, index, selection, helper);
			this.setIdCommand = createSetIdCommand(idAttribute, (EObject)child);
		}

		@Override
		public void execute() {
			super.execute();
			setIdCommand.execute();
		}
		
		@Override
		public void undo() {
			setIdCommand.undo();
			super.undo();
		}
		
		protected Command createSetIdCommand(EAttribute idAttribute, EObject child) {
			if(idAttribute == null || child == null) {
				return UnexecutableCommand.INSTANCE;
			}
			
			LiveTable table = getCorrespondenceTables().get(CorrespondenceKey.EOBJECT);
//			table.g
			Object value = getUniqueIDScheme().generateUniqueId(child, null);
			return SetCommand.create(domain, child, idAttribute, value);
		}		
	}
}
