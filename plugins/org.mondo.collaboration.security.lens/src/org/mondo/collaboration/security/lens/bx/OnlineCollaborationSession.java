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
import org.mondo.collaboration.security.lens.relational.LensTransformationExecution;
import org.mondo.collaboration.security.lens.relational.LensTransformationExecution.AbortReason;
import org.mondo.collaboration.security.lens.relational.LensTransformationExecution.ExceptionAbort;
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
	public static final URI FAKE_MAIN_RESOURCE_URI = URI.createFileURI(
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
	 * @return null if Leg does not exist yet and bust be created
	 */
	public Leg getExistingLeg(String userName) {
	    return legsByUserName.get(userName);
	}
	
	
	/**
	 * The "leg" of the session specific to a single user.
	 * <p> Modifications of the front model should be wrapped in {@link #atomicallyModify(Callable)}
	 * 
	 * @author Bergmann Gabor
	 *
	 */
	public class Leg {
		private final String userName;
		private DataTypeObfuscator<String> stringObfuscator;
		
		private final URI frontConfinementURI;
		private final ResourceSet frontResourceSet;
		
		private MondoLensScope scope;
		private final RelationalLensXform lens;

		/**
		 * Creates an in-memory front model for the user and immediately synchronizes the gold model onto it.
		 * @param userName the name of the user for which the online synchronization is conducted
		 * @param stringObfuscator the attribute obfuscator seeded for the specific user
		 * @throws InvocationTargetException 
		 */
		public Leg(String userName, DataTypeObfuscator<String> stringObfuscator) throws InvocationTargetException {
			this(userName, stringObfuscator,
			        true,
					new ResourceSetImpl(), 
					FAKE_MAIN_RESOURCE_URI);
		}
		
		/**
		 * Creates a 
		 * <p> Use {@link #OnlineCollaborationSession(String, DataTypeObfuscator)} instead 
		 * unless you want to fine-tune the front model. 
		 * 
		 * @param userName the name of the user for which the online synchronization is conducted
		 * @param stringObfuscator the attribute obfuscator seeded for the specific user
		 * @param startWithGet whether to immediately initialize model contents by a GET (overwrites existing content)
		 * @param frontConfinementURI the writable area in the folder hierarchy for the front model
		 * @param frontResourceSet preinitialized front model
		 * @throws InvocationTargetException 
		 */
		public Leg(String userName, DataTypeObfuscator<String> stringObfuscator,
		        boolean startWithGet, 
				ResourceSet frontResourceSet, 
				URI frontConfinementURI) throws InvocationTargetException {
			super();
			this.userName = userName;
			this.stringObfuscator = stringObfuscator;
			this.frontConfinementURI = frontConfinementURI;
			this.frontResourceSet = frontResourceSet;
			
			legsByUserName.put(userName, this);
			this.lens = setupLens(startWithGet);
			
			if (startWithGet) {
			    overWriteFromGold();
			}
		}
		
		/**
		 * @return
		 */
		private RelationalLensXform setupLens(boolean startWithGet) {
			User user = SecurityArbiter.getUserByName(accessControlModel, userName);
			if (user == null)
				throw new IllegalArgumentException(String.format("User of name %s not found in MACL resource %s", userName, policyResource.getURI()));

			ModelIndexer frontIndexer = new ModelIndexer(
	        		frontConfinementURI,
	        		frontResourceSet);

			// if using in-memory resource with fake URI, then front model is initially empty, no need to gather EObject correspondences
			LiveTable correspondenceTable = startWithGet ? new LiveTable() :	
				EObjectCorrespondence.buildEObjectCorrespondenceTable(
					goldIndexer, 
					uniqueIDFactory.apply(goldConfinementURI),
					frontIndexer, 
					uniqueIDFactory.apply(frontConfinementURI)
				);
	        Map<CorrespondenceKey, LiveTable> correspondenceTables = new EnumMap<CorrespondenceKey, LiveTable>(CorrespondenceKey.class);
	        correspondenceTables.put(CorrespondenceKey.EOBJECT, correspondenceTable);
	        
			scope = new MondoLensScope(arbiter, goldIndexer, frontIndexer, correspondenceTables);
			
			return new RelationalLensXform(scope, user, stringObfuscator);
		}
		
		
		public void overWriteFromGold() throws InvocationTargetException {
            LensTransformationExecution propagatingExecution = 
                    lens.doGet();
            
            // propagation error
            if (propagatingExecution.isAborted()) {
                final AbortReason abortReason = propagatingExecution.getAbortReason();
                if (abortReason instanceof ExceptionAbort) { // this must be an exception abort, because GET
                    throw new InvocationTargetException(((ExceptionAbort) abortReason).getException());
                }
                
                // should not reach this
                throw new RuntimeException();
            }
		}
		
		/**
		 * Use this method to perform modifications of the front model.
		 * <p> For Transactional EMF, client must enclose the invocation of this method 
		 *    within nested write transactions for all of the front models.  
		 * <p> If client can wrap all user modifications to this front model into a single callback, 
		 *    then serializability is automatically enforced.
		 * 
		 * @param modificationTransaction a callback that encloses the actual modifications to the front model. 
		 *    Can be null if it is not possible to enclose modifications; 
		 *    serializability must be ensured separately in that case.
		 * @throws InvocationTargetException if the modification transaction throws an exception
		 */
		public <T> T atomicallyModify(Callable<T> modificationTransaction) throws InvocationTargetException {
			T result;
			synchronized (OnlineCollaborationSession.this) {
				try {
					result = modificationTransaction == null ? null : modificationTransaction.call();
				} catch (Exception e) {
//				    // try to roll back
//					this.lens.doGet(); 
					throw new InvocationTargetException(e);
				}
				
				final LensTransformationExecution lensExecution = 
				        lens.doPutback(true /* restore previous gold model if permission is denied */);
				
				// propagate successful PUTBACK to the other front models	
				if (!lensExecution.isAborted()) { 		
				    for (Leg leg : legsByUserName.values()) {
				        leg.overWriteFromGold();
				    }				
				}
			}
			
			return result;
		}

		public String getUserName() {
			return userName;
		}

		public ResourceSet getFrontResourceSet() {
			return frontResourceSet;
		}

		public MondoLensScope getScope() {
			return scope;
		}

		public void dispose() {
		    legsByUserName.remove(userName);
		}

		
	}
	
}
