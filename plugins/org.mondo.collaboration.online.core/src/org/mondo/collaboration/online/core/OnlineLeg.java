package org.mondo.collaboration.online.core;

import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.viatra.modelobfuscator.api.DataTypeObfuscator;
import org.mondo.collaboration.security.lens.bx.online.OnlineCollaborationSession;
import org.mondo.collaboration.security.lens.bx.online.OnlineCollaborationSession.Leg;

public class OnlineLeg extends Leg {

	private static Logger logger = Logger.getLogger(LensActivator.class);

	protected boolean initialized = false;
	protected ILegCallback callback;
	protected EditingDomain editingDomain;
	
	public OnlineLeg(OnlineCollaborationSession onlineCollaborationSession, String userName,
			DataTypeObfuscator<String> stringObfuscator, boolean startWithGet, EditingDomain editingDomain,
			URI frontConfinementURI, ILegCallback callback) throws InvocationTargetException {
		onlineCollaborationSession.super(userName, stringObfuscator, startWithGet, editingDomain.getResourceSet(), frontConfinementURI);
		
		this.editingDomain = editingDomain;
		this.callback = callback;
		
		initialized = true;
	}
	
	@Override
	public void overWriteFromGold() {
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
					callback.callback();
				}
			};
			editingDomain.getCommandStack().execute(cmd);
		}
	}
	
	protected void internalOverWriteFromGold() {
		super.overWriteFromGold();
	}
	
	public abstract class LegCommand extends AbstractCommand {

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
