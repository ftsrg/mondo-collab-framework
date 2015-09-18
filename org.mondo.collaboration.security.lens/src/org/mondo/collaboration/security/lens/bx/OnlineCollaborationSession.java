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

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
 * An online synchronization session for a variable number of users ('legs'), between the single gold model and a front model for each leg.
 * @author Bergmann Gabor
 *
 */
// TODO: use Transactional EMF
public class OnlineCollaborationSession {
	private static final URI FAKE_MAIN_RESOURCE_URI = URI.createFileURI(
			"org.mondo.collaboration.security.lens.bx.fake-path" + File.pathSeparator + 
			"org.mondo.collaboration.security.lens.bx.fake-root-resource");

	private final URI goldConfinementURI;
	private final ResourceSet goldResourceSet;
	private final UniqueIDSchemeFactory uniqueIDFactory;
	private final Resource policyResource;
	private final SecurityArbiter arbiter;
	private final ModelIndexer goldIndexer;
	private final AccessControlModel accessControlModel;
	
	private final Map<String, Leg> legsByUserName = new HashMap<>(); 
	
	/**
	 * @param goldConfinementURI the writable area in the folder hierarchy for the gold model
	 * @param goldResourceSet the gold model
	 * @param uniqueIDFactory the scheme for identifying model elements
	 * @param policyResource the resource of the policy model
	 * @throws IncQueryException 
	 */
	public OnlineCollaborationSession(URI goldConfinementURI, ResourceSet goldResourceSet,
			UniqueIDSchemeFactory uniqueIDFactory, Resource policyResource) throws IncQueryException {
		super();
		this.goldConfinementURI = goldConfinementURI;
		this.goldResourceSet = goldResourceSet;
		this.uniqueIDFactory = uniqueIDFactory;
		this.policyResource = policyResource;
		
		accessControlModel = (AccessControlModel) policyResource.getContents().get(0);
		arbiter = new SecurityArbiter(
				accessControlModel.getPolicy(), 
				null /*user*/, 
				ImmutableSet.of(goldResourceSet), 
				new BaseIndexOptions());
		
		goldIndexer = new ModelIndexer(
        		goldConfinementURI,
        		goldResourceSet,
        		EMFScope.extractUnderlyingEMFIndex(arbiter.getPolicyQueryEngine()));
	}

	/**
	 * The "leg" of the session specific to a single user.
	 * <p> Modifications of the front model should be wrapped in {@link #atomicallyModify(Callable)}
	 * 
	 * @author Bergmann Gabor
	 *
	 */
	class Leg {
		private final String userName;
		private DataTypeObfuscator<String> stringObfuscator;
		
		private final URI frontConfinementURI;
		private final ResourceSet frontResourceSet;
		
		private final RelationalLensXform lens;

		/**
		 * Creates an in-memory front model for the user.
		 * @param userName the name of the user for which the online synchronization is conducted
		 * @param stringObfuscator the attribute obfuscator seeded for the specific user
		 */
		public Leg(String userName, DataTypeObfuscator<String> stringObfuscator) {
			this(userName, stringObfuscator,
					new ResourceSetImpl(), 
					FAKE_MAIN_RESOURCE_URI);
		}
		
		/**
		 * Use {@link #OnlineCollaborationSession(String, DataTypeObfuscator)} instead 
		 * unless you want to fine-tune the front model. 
		 * 
		 * @param userName the name of the user for which the online synchronization is conducted
		 * @param stringObfuscator the attribute obfuscator seeded for the specific user
		 * @param frontConfinementURI the writable area in the folder hierarchy for the front model
		 * @param frontResourceSet preinitialized front model
		 */
		private Leg(String userName, DataTypeObfuscator<String> stringObfuscator, 
				ResourceSet frontResourceSet, 
				URI frontConfinementURI) {
			super();
			this.userName = userName;
			this.stringObfuscator = stringObfuscator;
			this.frontConfinementURI = frontConfinementURI;
			this.frontResourceSet = frontResourceSet;
			
			legsByUserName.put(userName, this);
			this.lens = setupLens();
		}
		
		/**
		 * @return
		 */
		private RelationalLensXform setupLens() {
			User user = SecurityArbiter.getUserByName(accessControlModel, userName);
			if (user == null)
				throw new IllegalArgumentException(String.format("User of name %s not found in MACL resource %s", userName, policyResource.getURI()));

			ModelIndexer frontIndexer = new ModelIndexer(
	        		frontConfinementURI,
	        		frontResourceSet);

			// if using in-memory resource with fake URI, then front model is initially empty, no need to gather EObject correspondences
			LiveTable correspondenceTable = frontConfinementURI == FAKE_MAIN_RESOURCE_URI ? new LiveTable() :	
				EObjectCorrespondence.buildEObjectCorrespondenceTable(
					goldIndexer, 
					uniqueIDFactory.apply(goldConfinementURI),
					frontIndexer, 
					uniqueIDFactory.apply(frontConfinementURI)
				);
	        Map<CorrespondenceKey, LiveTable> correspondenceTables = new EnumMap<CorrespondenceKey, LiveTable>(CorrespondenceKey.class);
	        correspondenceTables.put(CorrespondenceKey.EOBJECT, correspondenceTable);
	        
			MondoLensScope scope = new MondoLensScope(arbiter, goldIndexer, frontIndexer, correspondenceTables);
			
			return new RelationalLensXform(scope, user, stringObfuscator);
		}
		
		/**
		 * Use this method to wrap modifications of the front model.
		 * @throws InvocationTargetException if the modification transaction throws an exception
		 */
		public <T> T atomicallyModify(Callable<T> modificationTransaction) throws InvocationTargetException {
			T result;
			synchronized (OnlineCollaborationSession.this) {
				try {
					result = modificationTransaction.call();
				} catch (Exception e) {
					// TODO roll back & return
					throw new InvocationTargetException(e);
				}
				
				lens.doPutback();
				// TODO roll back & return if failed
				
				for (Leg leg : legsByUserName.values()) {
					//if (leg != Leg.this) {
						leg.lens.doGet();
					//}
				}				
				// TODO transactional, handle write access denial, roll back modification with a get
			}
			
			return result;
		}

		public String getUserName() {
			return userName;
		}

		public ResourceSet getFrontResourceSet() {
			return frontResourceSet;
		}
		
	}
	
}
