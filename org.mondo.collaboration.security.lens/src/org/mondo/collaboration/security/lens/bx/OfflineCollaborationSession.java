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

package org.mondo.collaboration.security.lens.bx;

import java.io.IOException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.incquery.runtime.base.api.BaseIndexOptions;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.modelobfuscator.api.DataTypeObfuscator;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter;
import org.mondo.collaboration.security.lens.context.MondoLensScope;
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence.UniqueIDSchemeFactory;
import org.mondo.collaboration.security.lens.emf.ModelIndexer;
import org.mondo.collaboration.security.lens.util.LiveTable;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.AccessControlModel;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.User;

import com.google.common.collect.ImmutableSet;

/**
 * An offline synchronization session for a single user, between the gold model and a single front model.
 * @author Bergmann Gabor
 *
 */
public class OfflineCollaborationSession {
	
	
	private final URI goldConfinementURI;
	private final ResourceSet goldResourceSet;
	private final URI frontConfinementURI;
	private final ResourceSet frontResourceSet;
	private final UniqueIDSchemeFactory uniqueIDFactory;
	private final Resource policyResource;
	private final String userName;
	private DataTypeObfuscator<String> stringObfuscator;
	
	private final RelationalLensXform lens;
	
	/**
	 * @param goldConfinementURI the writable area in the folder hierarchy for the gold model
	 * @param goldResourceSet the gold model
	 * @param frontConfinementURI the writable area in the folder hierarchy for the front model
	 * @param frontResourceSet the front model
	 * @param uniqueIDFactory the scheme for identifying model elements
	 * @param policyResource the resource of the policy model
	 * @param userName the name of the user for which the offline map is conducted
	 * @param stringObfuscator the attribute obfuscator seeded for the specific user
	 * @throws IncQueryException 
	 */
	public OfflineCollaborationSession(
			URI goldConfinementURI, ResourceSet goldResourceSet, 
			URI frontConfinementURI, ResourceSet frontResourceSet,
			EObjectCorrespondence.UniqueIDSchemeFactory uniqueIDFactory,
			Resource policyResource, 
			String userName,
			DataTypeObfuscator<String> stringObfuscator) throws IncQueryException {
		super();
		this.goldConfinementURI = goldConfinementURI;
		this.goldResourceSet = goldResourceSet;
		this.frontConfinementURI = frontConfinementURI;
		this.frontResourceSet = frontResourceSet;
		this.uniqueIDFactory = uniqueIDFactory;
		this.policyResource = policyResource;
		this.userName = userName;
		this.stringObfuscator = stringObfuscator;
		
		this.lens = setupLens();
	}


	public RelationalLensXform setupLens() throws IncQueryException {
		AccessControlModel accessControlModel = (AccessControlModel) policyResource.getContents().get(0);
		User user = SecurityArbiter.getUserByName(accessControlModel, userName);
		if (user == null)
			throw new IllegalArgumentException(String.format("User of name %s not found in MACL resource %s", userName, policyResource.getURI()));
		
		SecurityArbiter arbiter = new SecurityArbiter(
				accessControlModel.getPolicy(), 
				user, 
				ImmutableSet.of(goldResourceSet), 
				new BaseIndexOptions());

		// security container: parent folder of main resource?
		ModelIndexer goldIndexer = new ModelIndexer(
        		goldConfinementURI,
        		goldResourceSet,
        		EMFScope.extractUnderlyingEMFIndex(arbiter.getPolicyQueryEngine()));
        
		// security container: parent folder of main resource?
		ModelIndexer frontIndexer = new ModelIndexer(
        		frontConfinementURI,
        		frontResourceSet);
        
        
		LiveTable correspondenceTable = EObjectCorrespondence.buildEObjectCorrespondenceTable(
					goldIndexer, 
					uniqueIDFactory.apply(goldConfinementURI),
					frontIndexer, 
					uniqueIDFactory.apply(frontConfinementURI)
		);
        Map<CorrespondenceKey, LiveTable> correspondenceTables = new EnumMap<CorrespondenceKey, LiveTable>(CorrespondenceKey.class);
        correspondenceTables.put(CorrespondenceKey.EOBJECT, correspondenceTable);
        //correspondenceTables.put(CorrespondenceKey.RESOURCE, new LiveTable());
        
		MondoLensScope scope = new MondoLensScope(arbiter, goldIndexer, frontIndexer, correspondenceTables);
		
		return new RelationalLensXform(scope, user, stringObfuscator);
	}
	
	
	/**
	 * Performs the GET transformation and saves the front model
	 * @throws IOException 
	 */
	public void doGetAndSave() throws IOException {
		lens.doGet();
		
		saveResources(frontResourceSet, frontConfinementURI);
	}

	/**
	 * Performs the PUTBACK transformation and saves the front model
	 * @throws IOException 
	 */
	public void doPutbackAndSave() throws IOException {
		lens.doPutback();
		
		saveResources(goldResourceSet, goldConfinementURI);
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


	public Resource getPolicyResource() {
		return policyResource;
	}

	public String getUserName() {
		return userName;
	}

	public RelationalLensXform getLens() {
		return lens;
	}

}
