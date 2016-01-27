package org.mondo.collaboration.online.core;

import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.viatra.modelobfuscator.api.DataTypeObfuscator;
import org.mondo.collaboration.security.lens.bx.AbortReason.DenialReason;
import org.mondo.collaboration.security.lens.bx.online.OnlineCollaborationSession;
import org.mondo.collaboration.security.lens.bx.online.OnlineCollaborationSession.Leg;

import com.google.common.util.concurrent.FutureCallback;

public class OnlineLeg extends Leg {

	private static Logger logger = Logger.getLogger(OnlineLeg.class);

	protected boolean initialized = false;
	protected FutureCallback<Object> callback;
	protected EditingDomain editingDomain;

	protected OnlineCollaborationSession onlineCollaborationSession;

	private FutureCallback<Object> callbackSave;

	
	public OnlineLeg(OnlineCollaborationSession onlineCollaborationSession, String userName,
			DataTypeObfuscator<String> stringObfuscator, boolean startWithGet, EditingDomain editingDomain,
			URI frontConfinementURI, FutureCallback<Object> callbackModification, FutureCallback<Object> callbackSave) 
					throws InvocationTargetException {
		onlineCollaborationSession.super(userName, stringObfuscator, startWithGet, editingDomain.getResourceSet(), frontConfinementURI);
		
		this.onlineCollaborationSession = onlineCollaborationSession;
		this.editingDomain = editingDomain;
		this.callback = callbackModification;
		this.callbackSave = callbackSave;
		
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
					callback.onSuccess(null);
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
	
	public void saveExecuted() {
		if(((BasicCommandStack)editingDomain.getCommandStack()).isSaveNeeded()) {
			((BasicCommandStack)editingDomain.getCommandStack()).saveIsDone();
			callbackSave.onSuccess(getGoldResourceSet().getResources().get(0).getURI().toFileString());
		}
	}
	
	public OnlineCollaborationSession getOnlineCollaborationSession() {
		return onlineCollaborationSession;
	}
	
	public ResourceSet getGoldResourceSet() {
		return onlineCollaborationSession.getGoldResourceSet();
	}
	
	public abstract class LegCommand extends AbstractCommand {

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
}
