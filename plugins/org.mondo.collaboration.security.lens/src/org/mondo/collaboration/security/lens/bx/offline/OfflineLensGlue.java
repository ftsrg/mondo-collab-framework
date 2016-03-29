/*******************************************************************************
 * Copyright (c) 2004-2016 Gabor Bergmann and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabor Bergmann - initial API and implementation
 *******************************************************************************/

package org.mondo.collaboration.security.lens.bx.offline;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.incquery.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.modelobfuscator.util.StringObfuscator;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter;
import org.mondo.collaboration.security.lens.bx.AbortReason.DenialReason;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence.UniqueIDSchemeFactory;
import org.mondo.collaboration.security.lens.emf.EMFUtil;
import org.mondo.collaboration.security.lens.util.uri.URIWorkspaceMappingsHelper;
import org.mondo.collaboration.security.macl.xtext.AccessControlLanguageStandaloneSetup;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.AccessControlModel;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.Policy;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.User;
import org.mondo.collaboration.security.mpbl.xtext.MondoPropertyBasedLockingStandaloneSetup;
import org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.PropertyBasedLockingModel;

/**
 * Glue code that takes a list of string parameters, configures and executes an org.mondo.collaboration.security.lens.bx.offline collaboration lens, and returns the results.
 * @author Bergmann Gabor
 *
 */
public class OfflineLensGlue {
    
    private static AtomicLong nextSessionSequenceID = new AtomicLong();
    
    /**
     * Parameterizes the lens and executes it for the given argument array
     * @return null if the transformation was successful, or an object describing why it was denied
     * @throws Exception if anything goes bad in the meantime
     */
    public static DenialReason invokeOfflineLens(String[] argArray) throws Exception {
        final long currentSequenceID = nextSessionSequenceID.incrementAndGet();
        Logger logger = Logger.getLogger(OfflineLensGlue.class.getName() + "." + currentSequenceID);
                
        try {
            if (logger.isInfoEnabled()) logger.info("Parsing arguments: " + Arrays.toString(argArray));
            OfflineLensGlue lensGlue = new OfflineLensGlue(argArray, logger);
            
            if (logger.isInfoEnabled()) logger.info("Starting transformation...");
            
            DenialReason denialReason = null;
            if (lensGlue.performGet)
                denialReason = lensGlue.session.doGetAndSave();
            else if (lensGlue.performPutback)
               denialReason =  lensGlue.session.doPutbackAndSave();
            
            if (logger.isInfoEnabled()) logger.info(denialReason == null ? "Done (success)." : "Done (denied).");
            return denialReason;
        } catch (Exception ex) {
            logger.error("Aborted.", ex);
            throw ex;
        }
    }

    
    private static final String GOLD_MODEL_ROOTS_PATH_OPTION        = "-gold";
    private static final String FRONT_MODEL_ROOTS_PATH_OPTION       = "-front";
    private static final String ACCESS_CONTROL_MODEL_PATH_OPTION    = "-macl";
    private static final String LOCK_MODEL_PATH_OPTION    			= "-mpbl";
    private static final String SECURITY_QUERIES_PATH_OPTION        = "-eiq";
    private static final String GOLD_REPOSITORY_ROOT_PATH_OPTION    = "-goldRepositoryRoot";
    private static final String FRONT_REPOSITORY_ROOT_PATH_OPTION   = "-frontRepositoryRoot";
    private static final String GOLD_WORKSPACE_MAPPING_PATH_OPTION  = "-goldWorkspaceMapping";
    private static final String FRONT_WORKSPACE_MAPPING_PATH_OPTION = "-frontWorkspaceMapping";
    private static final String PATH_VALUE                          = "<path>";
    private static final String USER_NAME_OPTION                    = "-userName";
    private static final String USER_VALUE                          = "<userName>";
    private static final String OBFUSCATOR_SEED_OPTION              = "-obfuscatorSeed";
    private static final String OBFUSCATOR_SALT_OPTION              = "-obfuscatorSalt";
    private static final String OBFUSCATOR_PREFIX_OPTION            = "-obfuscatorPrefix";
    private static final String STRING_VALUE                        = "<string>";
    private static final String UNIQUE_ID_SCHEME_OPTION             = "-uniqueIDScheme";
    private static final String EXTENSION_VALUE                     = "<extensionIdentifier>";
    private static final String PERFORM_GET_SWITCH                  = "-performGet";
    private static final String PERFORM_PUTBACK_SWITCH              = "-performPutback";
    
    private Logger logger;
    
    private boolean performGet;
    private boolean performPutback;
    
    private OfflineCollaborationSession session;

    static {
        EMFPatternLanguageStandaloneSetup.doSetup();
        AccessControlLanguageStandaloneSetup.doSetup();
        MondoPropertyBasedLockingStandaloneSetup.doSetup();
    }
    
    private OfflineLensGlue(String[] argArray, Logger logger) throws FileNotFoundException, IOException, IncQueryException, CoreException {
        this.logger = logger;        
        
        List<String> goldPaths          	=  getRequiredCLIOptionValues(argArray, GOLD_MODEL_ROOTS_PATH_OPTION,      		PATH_VALUE);
        List<String> frontPaths         	=  getRequiredCLIOptionValues(argArray, FRONT_MODEL_ROOTS_PATH_OPTION,      	PATH_VALUE);
        List<String> securityQueryPaths 	=  getRequiredCLIOptionValues(argArray, SECURITY_QUERIES_PATH_OPTION,       	PATH_VALUE);
        String policyPath              	 	=  getSingletonCLIOptionValue(argArray, ACCESS_CONTROL_MODEL_PATH_OPTION,  	 	PATH_VALUE);
        String userName                	 	=  getSingletonCLIOptionValue(argArray, USER_NAME_OPTION,                   	USER_VALUE);
        String uniqueIDSchemeExtension 	 	=  getSingletonCLIOptionValue(argArray, UNIQUE_ID_SCHEME_OPTION,            	EXTENSION_VALUE);
        String lockFilePath           		=  getOptionalCLIOptionValue( argArray, LOCK_MODEL_PATH_OPTION,             	PATH_VALUE, null);
        String obfuscatorSeed         	  	=  getOptionalCLIOptionValue( argArray, OBFUSCATOR_SEED_OPTION,             	STRING_VALUE, null);
        String obfuscatorSalt        	   	=  getOptionalCLIOptionValue( argArray, OBFUSCATOR_SALT_OPTION,             	STRING_VALUE, "");
        String obfuscatorPrefix         	=  getOptionalCLIOptionValue( argArray, OBFUSCATOR_PREFIX_OPTION,           	STRING_VALUE, "");
        String goldWorkspaceMappingPath		=  getOptionalCLIOptionValue( argArray, GOLD_WORKSPACE_MAPPING_PATH_OPTION,		PATH_VALUE, null);
        String frontWorkspaceMappingPath	=  getOptionalCLIOptionValue( argArray, FRONT_WORKSPACE_MAPPING_PATH_OPTION,	PATH_VALUE, null);
        String goldRepositoryRootPath       =  getOptionalCLIOptionValue( argArray, GOLD_REPOSITORY_ROOT_PATH_OPTION,       PATH_VALUE, ".");
        String frontRepositoryRootPath      =  getOptionalCLIOptionValue( argArray, FRONT_REPOSITORY_ROOT_PATH_OPTION,      PATH_VALUE, ".");

        performGet = getCLISwitch(argArray, PERFORM_GET_SWITCH);
        performPutback = getCLISwitch(argArray, PERFORM_PUTBACK_SWITCH);
        if (!(performGet ^ performPutback)) {
            throw new OfflineLensParametrizationException(String.format("Specify either switch %s or %s", PERFORM_GET_SWITCH, PERFORM_PUTBACK_SWITCH));
        }
        
    
        StringObfuscator stringObfuscator = null; 
        if (obfuscatorSeed == null) {
            logger.warn("WARNING: option -" + OBFUSCATOR_SEED_OPTION + " not specified, obfuctation will fail if attempted");
        } else {
            stringObfuscator = new StringObfuscator(obfuscatorSeed, obfuscatorSalt);
        }
        
        URI goldConfinementURI = URI.createFileURI(goldPaths.get(0));
        URI frontConfinementURI = URI.createFileURI(frontPaths.get(0));
        
        final Map<String, String> goldWorkspaceMappings = 
            	(goldWorkspaceMappingPath != null) ?
                	URIWorkspaceMappingsHelper.readProjectNameToRelativePathFromProperties(goldWorkspaceMappingPath)
            	: Collections.emptyMap();
        final Map<String, String> frontWorkspaceMappings = 
            	(frontWorkspaceMappingPath != null) ?
                	URIWorkspaceMappingsHelper.readProjectNameToRelativePathFromProperties(frontWorkspaceMappingPath)
            	: Collections.emptyMap();
        
        ResourceSet goldResourceSet     = loadModelRoots(goldPaths, performGet, goldRepositoryRootPath, goldWorkspaceMappings); // TODO use resourceSetProvider?
        ResourceSet frontResourceSet    = loadModelRoots(frontPaths, performPutback, frontRepositoryRootPath, frontWorkspaceMappings); // TODO use resourceSetProvider?
        Resource policyResource         = loadQueryBasedModel(policyPath, securityQueryPaths); // TODO use resourceSetProvider?
        Resource lockResource        	= lockFilePath == null ? null : 
        	getResourceAtPath(policyResource.getResourceSet(), lockFilePath, true); // TODO unshare resourceSet?
        
        final UniqueIDSchemeFactory uniqueIDSchemeFactory = EObjectCorrespondence.getRegisteredIDProviderFactory(uniqueIDSchemeExtension);
        if (uniqueIDSchemeFactory == null) {
            throw new OfflineLensParametrizationException(String.format("Unique ID scheme provided by extension %s not found", uniqueIDSchemeExtension));
        }
        
        final EList<EObject> policyModelContents = policyResource.getContents();
        if (policyModelContents.isEmpty())
            throw new OfflineLensParametrizationException(String.format("Empty or non-existing MACL resource %s", policyResource.getURI()));
        AccessControlModel accessControlModel;
        try {
            accessControlModel = (AccessControlModel) policyModelContents.get(0);
        } catch (ClassCastException ex) {
            throw new OfflineLensParametrizationException(String.format("Could not interpret as an access control model: MACL resource %s", policyResource.getURI()));
        }
        final Policy policy = accessControlModel.getPolicy();
        if (policy == null)
            throw new OfflineLensParametrizationException(String.format("No access control policy defined in MACL resource %s", policyResource.getURI()));
        
        User user = SecurityArbiter.getUserByName(accessControlModel, userName);
        if (user == null)
            throw new OfflineLensParametrizationException(String.format("User of name %s not found in MACL resource %s", userName, policyResource.getURI()));
        
        PropertyBasedLockingModel lockModel = null;
        if (lockFilePath != null) {
        	final EList<EObject> lockModelContents = lockResource.getContents();
        	if (lockModelContents.isEmpty())
        		throw new OfflineLensParametrizationException(String.format("Empty or non-existing MPBL resource %s", lockResource.getURI()));
        	try {
        		lockModel = (PropertyBasedLockingModel) lockModelContents.get(0);
        	} catch (ClassCastException ex) {
        		throw new OfflineLensParametrizationException(String.format("Could not interpret as a locking model: MPBL resource %s", lockResource.getURI()));
        	}                	
        }
        
        if (logger.isDebugEnabled()) logger.debug("Setting up lens...");
        
		session = new OfflineCollaborationSession(
                goldConfinementURI, 
                goldResourceSet, 
                frontConfinementURI, 
                frontResourceSet,
                uniqueIDSchemeFactory,
                policy, 
                user,
                lockModel, 
                stringObfuscator);
    }
    
    
    private ResourceSet loadModelRoots(List<String> paths, boolean mustExist, String repositoryRootPath, Map<String, String> workspaceMappings) {
        ResourceSet model = newResourceSet();
        URIWorkspaceMappingsHelper.applyLocalMappings(model, repositoryRootPath, workspaceMappings);
        for (String path : paths) {
            getResourceAtPath(model, path, mustExist);
        }
        return model;
    }

    private ResourceSetImpl newResourceSet() {
        final ResourceSetImpl resourceSet = new ResourceSetImpl();
        return resourceSet;
    }
    private Resource loadQueryBasedModel(String queryBasedModelPath, List<String> securityQueryPaths) {
        ResourceSet model = newResourceSet();
        for (String eiqPath : securityQueryPaths) {
            getResourceAtPath(model, eiqPath, true);
        }
        return getResourceAtPath(model, queryBasedModelPath, true);
    }
    private Resource getResourceAtPath(ResourceSet model, String path, boolean mustExist) {
        final URI fileURI = URI.createFileURI(path);
        if (mustExist) {
            Resource resource = EMFUtil.getExistingResource(model, fileURI);
            if (resource == null)
                throw new OfflineLensParametrizationException("File not found: " + path);
            return resource;
        }
        else return EMFUtil.getOrCreateResource(model, fileURI);
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
    
    private static void checkSingleton(String optionKey, String valuePlaceHolder, List<String> values) throws OfflineLensParametrizationException {
        if (values.size() > 1) {
            throw new OfflineLensParametrizationException(String.format("Ambiguous value for singleton parameter %s %s", optionKey, valuePlaceHolder));
        }
    }
    
    private static void checkMissing(String optionKey, String valuePlaceHolder, List<String> values)
            throws OfflineLensParametrizationException {
        if (values.isEmpty()) {
            throw new OfflineLensParametrizationException(String.format("Missing required parameter %s %s", optionKey, valuePlaceHolder));
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

}
