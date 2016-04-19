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

package org.mondo.collaboration.security.lens.bx.online;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.incquery.runtime.base.api.BaseIndexOptions;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.modelobfuscator.api.DataTypeObfuscator;
import org.mondo.collaboration.security.lens.arbiter.LockArbiter;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter;
import org.mondo.collaboration.security.lens.bx.AbortReason.DenialReason;
import org.mondo.collaboration.security.lens.bx.LensTransformationExecution;
import org.mondo.collaboration.security.lens.bx.RelationalLensXform;
import org.mondo.collaboration.security.lens.context.MondoLensScope;
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence.UniqueIDScheme;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence.UniqueIDSchemeFactory;
import org.mondo.collaboration.security.lens.emf.ModelIndexer;
import org.mondo.collaboration.security.lens.util.ILiveRelation.Listener;
import org.mondo.collaboration.security.lens.util.LiveTable;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.AccessControlModel;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.User;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

/**
 * An online synchronization session for a variable number of users ('legs'), between the single gold model and a front model for each leg.
 * @author Bergmann Gabor
 *
 */
// TODO: use Transactional EMF
public class OnlineCollaborationSession {
	public static final URI FAKE_MAIN_RESOURCE_URI = URI.createURI("file://" +
			"org.mondo.collaboration.security.lens.bx.fake-path" + File.separator + 
			"org.mondo.collaboration.security.lens.bx.fake-root-resource");

	private final Logger logger = Logger.getLogger(OnlineCollaborationSession.class);
	
	private final URI goldConfinementURI;
	private final ResourceSet goldResourceSet;
	private final UniqueIDSchemeFactory uniqueIDFactory;
	private Resource policyResource;
	private Resource lockResource;
	private final SecurityArbiter arbiter;
	private final LockArbiter lockArbiter;
	private final ModelIndexer goldIndexer;
	
	public Map<String, Set<String>> getLockMappingsToUsers() {
		Map<String, Set<String>> lockNamesToUsers = new HashMap<String, Set<String>>();
		Map<org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Lock, Set<String>> lockAndOwnerNames = lockArbiter.getLockOwnerNames();
		Set<org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Lock> keySet = lockAndOwnerNames.keySet();
		for (org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Lock l: keySet) {
			lockNamesToUsers.put(l.getPattern().getName(), lockAndOwnerNames.get(l));
		}
		return lockNamesToUsers;
	}
	
	private final String ownerUsername;
	private final String ownerPassword;
	
	private final Set<Leg> legs = new HashSet<>(); 
	
	protected final long AUTOSAVE_DELAY = 30 * 1000; // 5 min
	protected boolean canSave = false;
	
	/**
	 * For serializing concurrent modifications by Legs
	 */
    Lock mutex = new ReentrantLock();

	public Resource getPolicyResource() {
		return policyResource;
	}
	
	public Resource getLockResource() {
		return lockResource;
	}

	/**
	 * @param goldConfinementURI the writable area in the folder hierarchy for the gold model
	 * @param goldResourceSet the gold model
	 * @param uniqueIDFactory the scheme for identifying model elements
	 * @param policyResource the resource of the initial policy model
	 * @param lockResource the resource of the initial lock model, can be null if no locks used
	 * @throws IncQueryException 
	 */
	public OnlineCollaborationSession(URI goldConfinementURI, ResourceSet goldResourceSet,
			UniqueIDSchemeFactory uniqueIDFactory, Resource policyResource, Resource lockResource, String ownerUsername, String ownerPassword) throws IncQueryException {
		super();
		this.goldConfinementURI = goldConfinementURI;
		this.goldResourceSet = goldResourceSet;
		this.uniqueIDFactory = uniqueIDFactory;
		this.policyResource = policyResource;
		this.lockResource = lockResource;
		
		AccessControlModel accessControlModel = (AccessControlModel) policyResource.getContents().get(0);
		arbiter = new SecurityArbiter(
				accessControlModel.getPolicy(), 
				null /*user*/, 
				ImmutableSet.of(goldResourceSet), 
				new BaseIndexOptions());
		
		lockArbiter = LockArbiter.create(arbiter, lockResource);
		
		goldIndexer = new ModelIndexer(
        		goldConfinementURI,
        		goldResourceSet,
        		EMFScope.extractUnderlyingEMFIndex(arbiter.getPolicyQueryEngine()));
		
		this.ownerPassword = ownerPassword;
		this.ownerUsername = ownerUsername;
		
		Thread autosaveThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					while(true) {
						if(canSave) {
							for (Resource resource : goldResourceSet.getResources()) {
								resource.save(Collections.emptyMap());
								logger.info("Auto-save executed for URI: " + resource.getURI().toString());
							}
							canSave = false;
						}
						Thread.sleep(AUTOSAVE_DELAY);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		autosaveThread.start();
	}
	
	
	/**
	 * Reinitialize the session with a new policy and lock resource
	 * @param policyResource the resource of the new policy model
	 * @param lockResource the resource of the new lock model, can be null if no locks used
	 * @throws IncQueryException
	 */
	public void reinitializeWith(Resource policyResource, Resource lockResource) throws IncQueryException {
		this.policyResource = policyResource;
		this.lockResource = lockResource;
		
		if (logger.isDebugEnabled())
			logger.debug(String.format("Reinitializing online session with policy resource %s and lock resource %s", 
				policyResource == null ? "<null>" : policyResource.getURI(), 
				lockResource == null ? "<null>" : lockResource.getURI()));
		
		arbiter.reinitializeWith(policyResource);
		lockArbiter.reinitializeWith(lockResource);
		
		for (Leg leg : legs) {
			leg.reinitialize();
		}
	}
	
	public URI getGoldConfinementURI() {
		return goldConfinementURI;
	}
	
	public ResourceSet getGoldResourceSet() {
		return goldResourceSet;
	}
	
	public Set<Leg> getLegs() {
		return Collections.unmodifiableSet(legs);
	}
	
	public UniqueIDSchemeFactory getUniqueIDFactory() {
		return uniqueIDFactory;
	}
	
	public String getOwnerPassword() {
		return ownerPassword;
	}
	
	public String getOwnerUsername() {
		return ownerUsername;
	}
	
	/**
	 * The "leg" of the session specific to a single user.
	 * <p> Modifications of the front model should be indicated with {@link #atomicallyModify(Callable)}
	 * 
	 * <p> For Transactional EMF or other model-level R/W access control, subclass and override methods 
	 *     to acquire appropriate permissions.
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
		private RelationalLensXform lens;
		private Map<CorrespondenceKey, LiveTable> correspondenceTables;
		
		private Set<Object> uniqueIdentifiers;
		private ModelIndexer frontIndexer;
		private UniqueIDScheme goldObjectToUniqueIdentifier;
		private UniqueIDScheme frontObjectToUniqueIdentifier;
		private LiveTable correspondenceTable;

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
					FAKE_MAIN_RESOURCE_URI.appendSegment(userName));
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
			
			legs.add(this);
			setupScope(startWithGet);
			setupLens(startWithGet);
		}
		
		/**
		 * Sets up the bidirectional lens transformation between the front model of the Leg and the common gold model.
		 * <p> Must read the front model. For Transactional EMF or other model-level R/W access control, 
		 *        subclass and override to wrap in a read-enabled transaction.
		 */
		protected void setupLens(boolean startWithGet) {
			User user = SecurityArbiter.getUserByName((AccessControlModel) arbiter.getPolicy().eContainer(), userName);
			if (user == null)
				throw new IllegalArgumentException(String.format("User of name %s not found in MACL resource %s", userName, getPolicyResource().getURI()));
			
			lens = new RelationalLensXform(scope, user, stringObfuscator);
			
			if (startWithGet) {
			    overWriteFromGold();
			}

		} 

		/**
		 * Sets up the preliminaries.
		 * <p> Must read the front model if startWithGet is false. For Transactional EMF or other model-level R/W access control, 
		 *        subclass and override to wrap in a read-enabled transaction.
		 */
		protected void setupScope(boolean startWithGet) {
			frontIndexer = new ModelIndexer(
	        		frontConfinementURI,
	        		frontResourceSet);

			goldObjectToUniqueIdentifier = uniqueIDFactory.apply(goldConfinementURI);
			frontObjectToUniqueIdentifier = uniqueIDFactory.apply(frontConfinementURI);
			
			if (startWithGet) {
				correspondenceTable = new LiveTable();
			}	else {
				Map<Object, Collection<EObject>> goldIndex = EObjectCorrespondence.applyObjectToUniqueIdentifier(goldIndexer, goldObjectToUniqueIdentifier);
				Map<Object, Collection<EObject>> frontIndex = EObjectCorrespondence.applyObjectToUniqueIdentifier(frontIndexer, frontObjectToUniqueIdentifier);
				correspondenceTable = EObjectCorrespondence.buildEObjectCorrespondenceTable(goldIndex, frontIndex);
			}
			
			uniqueIdentifiers = Sets.newHashSet();
			correspondenceTable.addListener(new FlatTuple(null, null), new Listener() {
				
				@Override
				public void accept(Tuple t, Boolean addition) {
					if(addition) {
						Object goldId = goldObjectToUniqueIdentifier.apply((EObject)t.get(0));
						Object frontId = frontObjectToUniqueIdentifier.apply((EObject)t.get(1));
						if(goldId != null)
							uniqueIdentifiers.add(goldId);
						if(frontId != null)
							uniqueIdentifiers.add(frontId);
					}
					else {
						Object goldId = goldObjectToUniqueIdentifier.apply((EObject)t.get(0));
						Object frontId = frontObjectToUniqueIdentifier.apply((EObject)t.get(1));
						if(goldId != null)
							uniqueIdentifiers.remove(goldId);
						if(frontId != null)
							uniqueIdentifiers.remove(frontId);
						}
				}
			});
			
			
			correspondenceTables = new EnumMap<CorrespondenceKey, LiveTable>(CorrespondenceKey.class);
	        correspondenceTables.put(CorrespondenceKey.EOBJECT, correspondenceTable);
	        
			scope = new MondoLensScope(arbiter, lockArbiter, goldIndexer, frontIndexer, correspondenceTables);
		}
		
		/**
		 * Wipe existing lens transformation if access control model is changed
		 */
		public void reinitialize() {
			lens.dispose();
			setupLens(true);
		}
		
		
        /**
         * Uses the GET transformation of the lens to update the front model so that it reflects the contents of the gold model.
         * <p> May write to the front model. For Transactional EMF or other model-level R/W access control, 
         *      subclass and override to wrap in a write-enabled transaction.
         */
		public void overWriteFromGold() {
            LensTransformationExecution propagatingExecution = lens.doGet();
            
            // propagation error
            if (propagatingExecution.isAborted()) {
                // this must be an exception abort, because GET, so we just rethrow the stored runtime exception
                propagatingExecution.extractDenialReason();
                
                // should not reach this
                throw new IllegalStateException();
            }
		}
		
		/**
		 * Use this method to indicate user modifications of the front model.
		 * <p> If client can wrap all user modifications to this front model into a single callback, 
		 *    then serializability is automatically enforced.
		 * 
		 * @param modificationTransaction a callback that encloses the actual modifications to the front model. 
		 *    Can be null if it is not possible to enclose modifications; 
		 *    serializability must be ensured separately in that case.
		 * @throws InvocationTargetException if the modification transaction throws an exception
		 */
		public DenialReason atomicallyModify(Callable<?> modificationTransaction) throws InvocationTargetException {
            mutex.lock();
            try {
				try {
					if (modificationTransaction != null) 
					    modificationTransaction.call();
				} catch (Exception e) {
//				    // try to roll back
//					overWriteFromGold(); 
					throw new InvocationTargetException(e);
				}
				
                final LensTransformationExecution lensExecution = propagateToGold(); 
                return lensExecution.extractDenialReason();             
            } finally {
                mutex.unlock();
            }
		}

		/**
		 * Assumption: called within a write-enabled transaction for this Leg. 
		 * If the modification is denied, the transaction must be rolled back by the client.
		 * 
		 * @return the reason the modification was denied, or null if it was successful
		 * @throws ConcurrentModificationException if another Leg thread has preempted this modification
		 */
		public DenialReason trySubmitModification() {
		    if (!mutex.tryLock()) {
		        // another Leg has acquired the mutex and is performing modifications
		        throw new ConcurrentModificationException();
		    }		        
		    // acquired
		    try {
		        // synchronized(this)?
		        
                final LensTransformationExecution lensExecution = propagateToGold(); 
                return lensExecution.extractDenialReason();		        
		    } finally {
		        mutex.unlock();
		    }
		}

        protected LensTransformationExecution propagateToGold() {
            final LensTransformationExecution lensExecution = 
                    lens.doPutback(true /* restore previous gold model if permission is denied */);
            
            // propagate successful PUTBACK to the other front models   
            if (!lensExecution.isAborted()) {  
            	canSave = true;
                for (Leg leg : legs) {
                    leg.overWriteFromGold();
                }
            }
            return lensExecution;
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
		    legs.remove(this);
		}

		public UniqueIDScheme getUniqueIDScheme() {
			return frontObjectToUniqueIdentifier;
		}
		
		public Map<CorrespondenceKey, LiveTable> getCorrespondenceTables() {
			return correspondenceTables;
		}
		public Set<Object> getUniqueIdentifiers() {
			return ImmutableSet.copyOf(uniqueIdentifiers);
		}
	}
		
}
