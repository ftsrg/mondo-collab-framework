/*******************************************************************************
 * Copyright (c) 2004-2015 Gabor Bergmann and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabor Bergmann - initial API and implementation
 *******************************************************************************/

package org.mondo.collaboration.security.lens.bx.offline;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.incquery.runtime.base.api.BaseIndexOptions;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.modelobfuscator.api.DataTypeObfuscator;
import org.mondo.collaboration.security.lens.arbiter.LockArbiter;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter;
import org.mondo.collaboration.security.lens.bx.AbortReason.DenialReason;
import org.mondo.collaboration.security.lens.bx.LensTransformationExecution;
import org.mondo.collaboration.security.lens.bx.RelationalLensXform;
import org.mondo.collaboration.security.lens.context.MondoLensScope;
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence.UniqueIDSchemeFactory;
import org.mondo.collaboration.security.lens.emf.ModelIndexer;
import org.mondo.collaboration.security.lens.util.LiveTable;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.Policy;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.User;
import org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.PropertyBasedLockingModel;

import com.google.common.collect.ImmutableSet;

/**
 * An org.mondo.collaboration.security.lens.bx.offline synchronization session for a single user, between the gold model and a single front model.
 * @author Bergmann Gabor
 *
 */
public class OfflineCollaborationSession {
	
	
	private final URI goldConfinementURI;
	private final ResourceSet goldResourceSet;
	private final URI frontConfinementURI;
	private final ResourceSet frontResourceSet;
	private final UniqueIDSchemeFactory uniqueIDFactory;
	private User user;
	private Policy policy;
	private PropertyBasedLockingModel lockingModel;
	private DataTypeObfuscator<String> stringObfuscator;
	
	private final RelationalLensXform lens;
	
	/**
	 * @param goldConfinementURI the writable area in the folder hierarchy for the gold model
	 * @param goldResourceSet the gold model
	 * @param frontConfinementURI the writable area in the folder hierarchy for the front model
	 * @param frontResourceSet the front model
	 * @param uniqueIDFactory the scheme for identifying model elements
	 * @param policy the policy model determining access control privileges
	 * @param user the user for which the org.mondo.collaboration.security.lens.bx.offline mapping is conducted
	 * @param lockingModel the model containing locks  (optional)
	 * @param stringObfuscator the attribute obfuscator seeded for the specific user
	 * @throws IncQueryException 
	 */
	public OfflineCollaborationSession(
			URI goldConfinementURI, ResourceSet goldResourceSet, 
			URI frontConfinementURI, ResourceSet frontResourceSet,
			EObjectCorrespondence.UniqueIDSchemeFactory uniqueIDFactory,
			Policy policy, 
			User user,
			PropertyBasedLockingModel lockingModel,
			DataTypeObfuscator<String> stringObfuscator) throws IncQueryException {
		super();
		this.goldConfinementURI = goldConfinementURI;
		this.goldResourceSet = goldResourceSet;
		this.frontConfinementURI = frontConfinementURI;
		this.frontResourceSet = frontResourceSet;
		this.uniqueIDFactory = uniqueIDFactory;
        this.policy = policy;
        this.user = user;
		this.lockingModel = lockingModel;
		this.stringObfuscator = stringObfuscator;
		
		this.lens = setupLens();
	}


	public RelationalLensXform setupLens() throws IncQueryException {
		
        SecurityArbiter arbiter = new SecurityArbiter(
				policy, 
				user, 
				ImmutableSet.of(goldResourceSet), 
				new BaseIndexOptions());
        LockArbiter lockArbiter = new LockArbiter(
        		arbiter, 
        		lockingModel);

		// security container: parent folder of main resource?
		ModelIndexer goldIndexer = new ModelIndexer(
        		goldConfinementURI,
        		goldResourceSet,
        		EMFScope.extractUnderlyingEMFIndex(arbiter.getPolicyQueryEngine()));
        
		// security container: parent folder of main resource?
		ModelIndexer frontIndexer = new ModelIndexer(
        		frontConfinementURI,
        		frontResourceSet);
        
		Map<Object, Collection<EObject>> goldIndex = EObjectCorrespondence.applyObjectToUniqueIdentifier(goldIndexer, uniqueIDFactory.apply(goldConfinementURI));
		Map<Object, Collection<EObject>> frontIndex = EObjectCorrespondence.applyObjectToUniqueIdentifier(frontIndexer, uniqueIDFactory.apply(frontConfinementURI));
		
        
		LiveTable correspondenceTable = EObjectCorrespondence.buildEObjectCorrespondenceTable(goldIndex,frontIndex);
        Map<CorrespondenceKey, LiveTable> correspondenceTables = new EnumMap<CorrespondenceKey, LiveTable>(CorrespondenceKey.class);
        
        correspondenceTables.put(CorrespondenceKey.EOBJECT, correspondenceTable);
        //correspondenceTables.put(CorrespondenceKey.RESOURCE, new LiveTable());
        
		MondoLensScope scope = new MondoLensScope(arbiter, lockArbiter, goldIndexer, frontIndexer, correspondenceTables);
		
		return new RelationalLensXform(scope, user, stringObfuscator);
	}
	
	
	/**
	 * Performs the GET transformation and saves the front model
	 * @return null if successful, the reason for failure otherwise
	 * @throws IOException 
	 */
	public DenialReason doGetAndSave() throws IOException {
        final LensTransformationExecution lensExecution = 
                lens.doGet();
		
        if (! lensExecution.isAborted()) 
            saveResources(frontResourceSet, frontConfinementURI);
        
        return lensExecution.extractDenialReason();
	}

	/**
	 * Performs the PUTBACK transformation and saves the front model
	 * @return 
     * @return null if successful, the reason for failure otherwise
	 * @throws IOException 
	 */
	public DenialReason doPutbackAndSave() throws IOException {
		final LensTransformationExecution lensExecution = 
		        lens.doPutback(false /* no need to roll back, will be discarded instead */);
		
		if (! lensExecution.isAborted()) 
		    saveResources(goldResourceSet, goldConfinementURI);
        
        return lensExecution.extractDenialReason();
	}

	/**
	 * Saves those resources of the ResourceSet that fall within specified confinement boundaries
	 * @throws IOException 
	 */
	public static void saveResources(ResourceSet resourceSet, URI confinementURI) throws IOException {
		for (Resource resource : resourceSet.getResources()) {
			if (resource.isLoaded() && isconfined(resource, confinementURI))
				resource.save(Collections.emptyMap());
		}
	}

	/**
	 * Determines whether the given resource is confined below the given URI.
	 */
	public static boolean isconfined(Resource resource, URI confinementURI) {
		URI resourceURI = resource.getURI();
		
		final URI deresolved = resourceURI.deresolve(confinementURI, false, true, true);
		return deresolved.isRelative();
	}


	public URI getGoldConfinementURI() {
		return goldConfinementURI;
	}


	public ResourceSet getGoldResourceSet() {
		return goldResourceSet;
	}


	public URI getFrontConfinementURI() {
		return frontConfinementURI;
	}


	public ResourceSet getFrontResourceSet() {
		return frontResourceSet;
	}

	public Policy getPolicy() {
        return policy;
    }

	public User getUser() {
        return user;
    }


    public RelationalLensXform getLens() {
		return lens;
	}

}
