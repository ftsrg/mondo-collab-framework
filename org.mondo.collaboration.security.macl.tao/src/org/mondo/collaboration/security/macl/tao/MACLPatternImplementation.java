package org.mondo.collaboration.security.macl.tao;
import java.util.List;
import java.util.UUID;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IParameter;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.Parameterization;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.IServiceLocator;
import org.mondo.editor.extensionpoints.IPatternImplementation;
import org.mondo.editor.extensionpoints.ValidationInfo;

import dslPatterns.MMInterface;
import dslPatterns.Pattern;
import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;

public class MACLPatternImplementation implements IPatternImplementation {

	public MACLPatternImplementation() {
	}

	@Override
	public boolean execute(EPackage ePack, PatternInstance pattern, IPath iPath) {
		IServiceLocator serviceLocator = PlatformUI.getWorkbench();
		ICommandService commandService = serviceLocator.getService(ICommandService.class);
		IHandlerService handlerService = serviceLocator.getService(IHandlerService.class);
		Command command = commandService.getCommand("org.mondo.collaboration.security.macl.tao.generation");
		try {
			IParameter parameter = command.getParameter(MACLCommandContext.ID);
			MACLCommandContext context = new MACLCommandContext(ePack, pattern, iPath);
			String contextId = UUID.randomUUID().toString();
			Activator.put(contextId, context);
			Parameterization parameterization = new Parameterization(parameter, contextId);
			ParameterizedCommand parameterizedCommand = new ParameterizedCommand(command, new Parameterization[] { parameterization });
			return (Boolean) handlerService.executeCommand(parameterizedCommand, null);
			
		} catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e1) {
			return false;
		}
	}

	@Override
	public ValidationInfo validate(EPackage ePack, PatternInstance pattern) {
		return new MACLValidator().validate(ePack, pattern);
	}

	@Override
	public List<ENamedElement> getOptimalElements(EPackage ePack, MMInterface mminterface) {
		return null;
	}

	@Override
	public boolean applyPattern(EPackage ePack, Pattern pattern, PatternInstances patternInstances) {
		return false;
	}

}
