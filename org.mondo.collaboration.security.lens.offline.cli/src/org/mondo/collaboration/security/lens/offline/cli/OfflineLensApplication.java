package org.mondo.collaboration.security.lens.offline.cli;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.mondo.collaboration.security.lens.bx.OfflineCollaborationSession;
import org.mondo.collaboration.security.lens.correspondence.DefaultEMFUniqueIDFunctions;
import org.mondo.collaboration.security.lens.correspondence.DefaultEMFUniqueIDFunctions.Factory;

public class OfflineLensApplication implements IApplication {

	private static final String GOLD_MODEL_ROOTS_PATH_OPTION 		= "-gold";
	private static final String FRONT_MODEL_ROOTS_PATH_OPTION 		= "-front";
	private static final String ACCESS_CONTROL_MODEL_PATH_OPTION	= "-macl";
	private static final String PATH_VALUE 							= "<path>";
	private static final String USER_NAME_OPTION 					= "-user";
	private static final String USER_VALUE      			 		= "<userName>";
	private static final String PERFORM_GET_SWITCH 					= "-perform-get";
	private static final String PERFORM_PUTBACK_SWITCH 		 		= "-perform-putback";


	@Override
	public Object start(IApplicationContext context) throws Exception {
		String[] argArray = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);

		List<String> goldPaths  =  getRequiredCLIOptionValues(argArray, GOLD_MODEL_ROOTS_PATH_OPTION, 		PATH_VALUE);
		List<String> frontPaths =  getRequiredCLIOptionValues(argArray, FRONT_MODEL_ROOTS_PATH_OPTION, 		PATH_VALUE);
		String policyPath  		=  getSingletonCLIOptionValue(argArray, ACCESS_CONTROL_MODEL_PATH_OPTION,	PATH_VALUE);
		String userName 		=  getSingletonCLIOptionValue(argArray, USER_NAME_OPTION, 					USER_VALUE);

		boolean performGet = getCLISwitch(argArray, PERFORM_GET_SWITCH);
		boolean performPutback = getCLISwitch(argArray, PERFORM_PUTBACK_SWITCH);
		if (!(performGet ^ performPutback)) {
			throw new IllegalArgumentException(String.format("Specify either switch %s or %s", PERFORM_GET_SWITCH, PERFORM_PUTBACK_SWITCH));
		}
		
		
		URI goldConfinementURI = URI.createFileURI(goldPaths.get(0));
		URI frontConfinementURI = URI.createFileURI(frontPaths.get(0));
		
		ResourceSet goldResourceSet 	= loadModelRoots(goldPaths); // TODO use resourceSetProvider?
		ResourceSet frontResourceSet 	= loadModelRoots(frontPaths); // TODO use resourceSetProvider?
		Resource policyResource 		= loadPolicyModel(policyPath); // TODO use resourceSetProvider?
		
		// TODO unique ID provider factory?
		final Factory uniqueIDSchemeFactory = DefaultEMFUniqueIDFunctions.Factory.INSTANCE;
		
		OfflineCollaborationSession session = 
				new OfflineCollaborationSession(
						goldConfinementURI, 
						goldResourceSet, 
						frontConfinementURI, 
						frontResourceSet,
						uniqueIDSchemeFactory,
						policyResource, 
						userName);
		if (performGet)
			session.doGetAndSave();
		else if (performPutback)
			session.doPutbackAndSave();
		
		return IApplication.EXIT_OK;
	}

	private ResourceSet loadModelRoots(List<String> paths) {
		ResourceSet model = new ResourceSetImpl();
		for (String path : paths) {
			model.getResource(URI.createFileURI(path), true);
		}
		return model;
	}
	private Resource loadPolicyModel(String path) {
		ResourceSet model = new ResourceSetImpl();
		return model.getResource(URI.createFileURI(path), true);
	}
	
	private static String getSingletonCLIOptionValue(String[] argArray, String optionKey, String valuePlaceHolder) {
		List<String> values = getRequiredCLIOptionValues(argArray, optionKey, valuePlaceHolder);
		if (values.size() > 1) {
			throw new IllegalArgumentException(String.format("Ambiguous value for singleton parameter %s %s", optionKey, valuePlaceHolder));
		}
		return values.get(0);
	}

	private static List<String> getRequiredCLIOptionValues(String[] argArray, String optionKey, String valuePlaceHolder) {
		List<String> values = getCLIOptionValues(argArray, optionKey);
		if (values.isEmpty()) {
			throw new IllegalArgumentException(String.format("Missing required parameter %s %s", optionKey, valuePlaceHolder));
		}
		return values;
	}

	public static List<String> getCLIOptionValues(String[] argArray, String optionKey) {
		ArrayList<String> results = new ArrayList<String>();
		
		int skipTheLast = argArray.length - 1;
		for (int i = 0; i < skipTheLast; i++) {
			String arg = argArray[i];
			if (arg.equals(optionKey))
				results.add(argArray[++i]);
		}
		
		return results;
	}
	public static boolean getCLISwitch(String[] argArray, String switchKey) {
		for (int i = 0; i < argArray.length; i++) {
			String arg = argArray[i];
			if (arg.equals(switchKey))
				return true;
		}
		
		return false;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
