package org.mondo.collaboration.security.lens.offline.cli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.incquery.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.viatra.modelobfuscator.util.StringObfuscator;
import org.mondo.collaboration.security.lens.bx.OfflineCollaborationSession;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence.UniqueIDSchemeFactory;
import org.mondo.collaboration.security.lens.emf.EMFUtil;
import org.mondo.collaboration.security.lens.util.uri.URIWorkspaceMappingsHelper;
import org.mondo.collaboration.security.macl.xtext.AccessControlLanguageStandaloneSetup;

public class OfflineLensApplication implements IApplication {

	private static final String GOLD_MODEL_ROOTS_PATH_OPTION 		= "-gold";
	private static final String FRONT_MODEL_ROOTS_PATH_OPTION 		= "-front";
	private static final String ACCESS_CONTROL_MODEL_PATH_OPTION	= "-macl";
	private static final String SECURITY_QUERIES_PATH_OPTION 		= "-eiq";
	private static final String REPOSITORY_ROOT_PATH_OPTION 		= "-repositoryRoot";
	private static final String WORKSPACE_MAPPING_PATH_OPTION 		= "-workspaceMapping";
	private static final String PATH_VALUE 							= "<path>";
	private static final String USER_NAME_OPTION 					= "-userName";
	private static final String USER_VALUE      			 		= "<userName>";
	private static final String OBFUSCATOR_SEED_OPTION 				= "-obfuscatorSeed";
	private static final String OBFUSCATOR_SALT_OPTION 				= "-obfuscatorSalt";
	private static final String OBFUSCATOR_PREFIX_OPTION 			= "-obfuscatorPrefix";
	private static final String STRING_VALUE      			 		= "<string>";
    private static final String UNIQUE_ID_SCHEME_OPTION             = "-uniqueIDScheme";
    private static final String EXTENSION_VALUE                     = "<extensionIdentifier>";
	private static final String PERFORM_GET_SWITCH 					= "-performGet";
	private static final String PERFORM_PUTBACK_SWITCH 		 		= "-performPutback";
	
	private String repositoryRootPath;
	private Map<String, String> workspaceMappings;


	@Override
	public Object start(IApplicationContext context) throws Exception {
		String[] argArray = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);

		List<String> goldPaths  		=  getRequiredCLIOptionValues(argArray, GOLD_MODEL_ROOTS_PATH_OPTION, 		PATH_VALUE);
		List<String> frontPaths 		=  getRequiredCLIOptionValues(argArray, FRONT_MODEL_ROOTS_PATH_OPTION, 		PATH_VALUE);
		List<String> securityQueryPaths =  getRequiredCLIOptionValues(argArray, SECURITY_QUERIES_PATH_OPTION, 		PATH_VALUE);
		String policyPath  				=  getSingletonCLIOptionValue(argArray, ACCESS_CONTROL_MODEL_PATH_OPTION,	PATH_VALUE);
        String userName                 =  getSingletonCLIOptionValue(argArray, USER_NAME_OPTION,                   USER_VALUE);
        String uniqueIDSchemeExtension  =  getSingletonCLIOptionValue(argArray, UNIQUE_ID_SCHEME_OPTION,            EXTENSION_VALUE);
		String obfuscatorSeed 			=  getOptionalCLIOptionValue( argArray, OBFUSCATOR_SEED_OPTION, 			STRING_VALUE, null);
		String obfuscatorSalt 			=  getOptionalCLIOptionValue( argArray, OBFUSCATOR_SALT_OPTION, 			STRING_VALUE, "");
		String obfuscatorPrefix 		=  getOptionalCLIOptionValue( argArray, OBFUSCATOR_PREFIX_OPTION, 			STRING_VALUE, "");
		String workspaceMappingPath     =  getOptionalCLIOptionValue( argArray, WORKSPACE_MAPPING_PATH_OPTION, 		PATH_VALUE, null);
		       repositoryRootPath       =  getOptionalCLIOptionValue( argArray, REPOSITORY_ROOT_PATH_OPTION, 		PATH_VALUE, ".");

		boolean performGet = getCLISwitch(argArray, PERFORM_GET_SWITCH);
		boolean performPutback = getCLISwitch(argArray, PERFORM_PUTBACK_SWITCH);
		if (!(performGet ^ performPutback)) {
			throw new IllegalArgumentException(String.format("Specify either switch %s or %s", PERFORM_GET_SWITCH, PERFORM_PUTBACK_SWITCH));
		}
		
		StringObfuscator stringObfuscator = null; 
		if (obfuscatorSeed == null) {
			System.out.println("[MondoOfflineCollaborationLens] WARNING: option -" + OBFUSCATOR_SEED_OPTION + " not specified, obfuctation will fail if attempted");
		} else {
			stringObfuscator = new StringObfuscator(obfuscatorSeed, obfuscatorSalt, obfuscatorPrefix);
		}
		
		URI goldConfinementURI = URI.createFileURI(goldPaths.get(0));
		URI frontConfinementURI = URI.createFileURI(frontPaths.get(0));
		
		if (workspaceMappingPath != null) {
			workspaceMappings = URIWorkspaceMappingsHelper.readProjectNameToRelativePathFromProperties(workspaceMappingPath);
		} else {
			workspaceMappings = Collections.emptyMap();
		}
		
		EMFPatternLanguageStandaloneSetup.doSetup();
		AccessControlLanguageStandaloneSetup.doSetup();
		
		ResourceSet goldResourceSet 	= loadModelRoots(goldPaths); // TODO use resourceSetProvider?
		ResourceSet frontResourceSet 	= loadModelRoots(frontPaths); // TODO use resourceSetProvider?
		Resource policyResource 		= loadPolicyModel(policyPath, securityQueryPaths); // TODO use resourceSetProvider?
		
		final UniqueIDSchemeFactory uniqueIDSchemeFactory = EObjectCorrespondence.getRegisteredIDProviderFactory(uniqueIDSchemeExtension);
		if (uniqueIDSchemeFactory == null) {
            throw new IllegalArgumentException(String.format("Unique ID scheme provided by extension %s not found", uniqueIDSchemeExtension));
		}
		
		System.out.println();
		System.out.println("[MondoOfflineCollaborationLens] Setting up lens...");
		
		OfflineCollaborationSession session = 
				new OfflineCollaborationSession(
						goldConfinementURI, 
						goldResourceSet, 
						frontConfinementURI, 
						frontResourceSet,
						uniqueIDSchemeFactory,
						policyResource, 
						userName,
						stringObfuscator);

		try {
			System.out.println("[MondoOfflineCollaborationLens] Starting transformation...");
			
			if (performGet)
				session.doGetAndSave();
			else if (performPutback)
				session.doPutbackAndSave();
			
			System.out.println("[MondoOfflineCollaborationLens] Done.");
			return IApplication.EXIT_OK;
		} catch (Exception ex) {
			System.out.println("[MondoOfflineCollaborationLens] Aborted.");
			ex.printStackTrace();
			return -1;
		}
		
	}

	private ResourceSet loadModelRoots(List<String> paths) {
		ResourceSet model = newResourceSet();
		for (String path : paths) {
			getResourceAtPath(model, path);
		}
		return model;
	}

	private ResourceSetImpl newResourceSet() {
		final ResourceSetImpl resourceSet = new ResourceSetImpl();
		URIWorkspaceMappingsHelper.applyLocalMappings(resourceSet, repositoryRootPath, workspaceMappings);
		return resourceSet;
	}
	private Resource loadPolicyModel(String policyPath, List<String> securityQueryPaths) {
		ResourceSet model = newResourceSet();
		for (String eiqPath : securityQueryPaths) {
			getResourceAtPath(model, eiqPath);
		}
		return getResourceAtPath(model, policyPath);
	}
	private Resource getResourceAtPath(ResourceSet model, String path) {
		final URI fileURI = URI.createFileURI(path);
		return EMFUtil.getOrCreateResource(model, fileURI);
	}
	
	private static String getSingletonCLIOptionValue(String[] argArray, String optionKey, String valuePlaceHolder) {
		List<String> values = getRequiredCLIOptionValues(argArray, optionKey, valuePlaceHolder);
		checkSingleton(optionKey, valuePlaceHolder, values);
		return values.get(0);
	}

	private static List<String> getRequiredCLIOptionValues(String[] argArray, String optionKey, String valuePlaceHolder) {
		List<String> values = getCLIOptionValues(argArray, optionKey);
		checkMissing(optionKey, valuePlaceHolder, values);
		return values;
	}

	private static String getOptionalCLIOptionValue(String[] argArray, String optionKey, String valuePlaceHolder, String defaultValue) {
		List<String> values = getCLIOptionValues(argArray, optionKey);
		checkSingleton(optionKey, valuePlaceHolder, values);
		if (values.isEmpty())
			return defaultValue;
		else 
			return values.get(0);
	}
	
	private static void checkSingleton(String optionKey, String valuePlaceHolder, List<String> values) throws IllegalArgumentException {
		if (values.size() > 1) {
			throw new IllegalArgumentException(String.format("Ambiguous value for singleton parameter %s %s", optionKey, valuePlaceHolder));
		}
	}
	
	private static void checkMissing(String optionKey, String valuePlaceHolder, List<String> values)
			throws IllegalArgumentException {
		if (values.isEmpty()) {
			throw new IllegalArgumentException(String.format("Missing required parameter %s %s", optionKey, valuePlaceHolder));
		}
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
