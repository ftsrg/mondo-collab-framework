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

package org.mondo.collaboration.security.lens.arbiter;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.AdvancedIncQueryEngine;
import org.eclipse.incquery.runtime.api.GenericPatternGroup;
import org.eclipse.incquery.runtime.api.IMatchUpdateListener;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Bind;
import org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Binding;
import org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Group;
import org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Lock;
import org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.MondoPropertyBasedLockingFactory;
import org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.PropertyBasedLockingModel;
import org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Role;
import org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.User;
import org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.ValueBind;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multimap;

/**
 * Enforces locks.
 * 
 * For each active user operation on the gold model (such as a PUTBACK), a session must be opened.
 * 
 * @author Bergmann Gabor
 *
 */
public class LockArbiter {
	
	public static LockArbiter create(SecurityArbiter arbiter, Resource lockResource) throws IncQueryException {
		return new LockArbiter(arbiter, extractLockingResource(lockResource));
	}
	
	private static PropertyBasedLockingModel extractLockingResource(Resource lockResource) {
		return lockResource == null ? null : (PropertyBasedLockingModel) lockResource.getContents().get(0);
	}



	private SecurityArbiter secArbiter;
	private PropertyBasedLockingModel lockingModel; 
	
	private Map<Lock, Set<String>> lockOwnerNames;
	// a lock is only relevant for an active user if they are not the (co)owner
	private Map<String, Set<Lock>> locksRelevantForUser;
	
	private Map<Lock, IncQueryMatcher<? extends IPatternMatch>> matcherForLock;
	private Map<Lock, IPatternMatch> bindingForLock;

	/**
	 * @param secArbiter the security arbiter
	 * @param lockingModel the initial locking model. May be null if there are no locks.
	 * @throws IncQueryException
	 */
	public LockArbiter(SecurityArbiter secArbiter, PropertyBasedLockingModel lockingModel) throws IncQueryException {
		this.secArbiter = secArbiter;
		reinitializeWith(lockingModel);
		//Set<RuleSpecification<IPatternMatch>> lockEnforcingRules = new HashSet<>();
	}

	/**
	 * Call if there is a new locking model to parse. 
	 * Do not call while there is an active {@link LockMonitoringSession}.
	 * @param lockResource the resource of the new locking model. May be null if there are no locks.
	 */
	public void reinitializeWith(Resource lockResource) throws IncQueryException {
		reinitializeWith(extractLockingResource(lockResource));
	}

	/**
	 * Call if there is a new locking model to parse. 
	 * Do not call while there is an active {@link LockMonitoringSession}.
	 * @param lockingModel the new locking model. May be null if there are no locks.
	 */
	public void reinitializeWith(PropertyBasedLockingModel lockingModel) throws IncQueryException {
		if (lockingModel == null)
			lockingModel = dummyLockingModel();
		this.lockingModel = lockingModel;
		
		lockOwnerNames = new HashMap<Lock, Set<String>>();
		locksRelevantForUser = new HashMap<String, Set<Lock>>();
		matcherForLock = new HashMap<Lock, IncQueryMatcher<? extends IPatternMatch>>();
		bindingForLock = new HashMap<Lock, IPatternMatch>();
		
		Multimap<IQuerySpecification<?>, Lock> lockQueries = HashMultimap.create();
		for (Lock lock : lockingModel.getLocks()) {
			preprocessLock(lock, lockQueries);
		}
		
		preInitializeMatchers(lockQueries);
	}

	private AdvancedIncQueryEngine getQueryEngine() {
		return this.secArbiter.getPolicyQueryEngine();
	}

	// if no locking model is provided, an empty one is used instead, with no locks
	private static PropertyBasedLockingModel dummyLockingModel() {
		return MondoPropertyBasedLockingFactory.eINSTANCE.createPropertyBasedLockingModel();
	}

	private void preprocessLock(Lock lock, Multimap<IQuerySpecification<?>, Lock> lockQueryAccumulator) throws IncQueryException {
		final Pattern pattern = lock.getPattern();
		if (pattern == null || pattern.eIsProxy())
			throw new IllegalArgumentException("Cannot resolve query of lock: " + lock);
		
		lockOwnerNames.put(lock, new HashSet<String>());
		registerLockOwnership(lock, lock.getOwner());
				
		IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> query = 
				secArbiter.getSpecBuilder().getOrCreateSpecification(pattern);
		lockQueryAccumulator.put(query, lock);
		
		IPatternMatch bindingMatch = query.newEmptyMatch();		
		for (Binding binding : lock.getBindings()) {
			Bind bindingValue = binding.getValue();
			if (bindingValue instanceof ValueBind) {
				String value = ((ValueBind) bindingValue).getValue();
				bindingMatch.set(binding.getParam().getName(), value); 
			} else throw new UnsupportedOperationException(
					"Unsupported binding " + bindingValue + " in lock " + lock);
		}
		bindingForLock.put(lock, bindingMatch.toImmutable());
	}
	private void registerLockOwnership(Lock lock, Role owner) {
		if (lockOwnerNames.get(lock).add(owner.getName())) {
			if (owner instanceof Group) {
				for (User user : ((Group) owner).getUsers()) {
					registerLockOwnership(lock, user);
				}
			}
		}
	}
	private void preInitializeMatchers(Multimap<IQuerySpecification<?>, Lock> lockQueries) throws IncQueryException {
		if (! lockQueries.isEmpty())
			new GenericPatternGroup(lockQueries.keySet()).prepare(getQueryEngine());
		for (IQuerySpecification<?> lockQuery : lockQueries.keySet()) {
			IncQueryMatcher<? extends IPatternMatch> matcher = getQueryEngine().getMatcher(lockQuery);
			for (Lock lock : lockQueries.get(lockQuery)) {
				matcherForLock.put(lock, matcher);
			}
		}
	}
	
	
	private Set<Lock> getLocksRelevantForUser(String activeUserName) {
		Set<Lock> relevantLocks = locksRelevantForUser.get(activeUserName);
		if (relevantLocks == null) {
			relevantLocks = new HashSet<Lock>();
			for (Lock lock : lockingModel.getLocks()) {
				if (! lockOwnerNames.get(lock).contains(activeUserName))
					relevantLocks.add(lock);
			}
			locksRelevantForUser.put(activeUserName, relevantLocks);
		}
		return relevantLocks;
	}

	
	public LockMonitoringSession openSession(String activeUserName) {
		return new LockMonitoringSession(activeUserName);
	}
	
	public final class LockMonitoringSession implements AutoCloseable  {
		private String activeUserName;
		private EnumMap<UpdateDirection, Multimap<Lock, IPatternMatch>> delta =
				new EnumMap<LockArbiter.UpdateDirection, Multimap<Lock,IPatternMatch>>(
						ImmutableMap.of(
								UpdateDirection.ADD, HashMultimap.create(),
								UpdateDirection.REMOVE, HashMultimap.create()								
								)
						);
		Multimap<IncQueryMatcher<? extends IPatternMatch>, MatchUpdateListener> listeners = HashMultimap.create();
		
		
		public LockMonitoringSession (String activeUserName) {
			this.activeUserName = activeUserName;
			
			for (Lock lock : getLocksRelevantForUser(activeUserName)) {
				initLockMonitoringRule(lock);
			}
			
		}

		public Entry<Lock, IPatternMatch> getAnyLockViolation() {
			if (delta.get(UpdateDirection.ADD).isEmpty()) {
				if (delta.get(UpdateDirection.REMOVE).isEmpty()) {
					return null;
				} else {				
					return delta.get(UpdateDirection.REMOVE).entries().iterator().next();
				}
			} else {				
				return delta.get(UpdateDirection.ADD).entries().iterator().next();
			}
		}
		
		@Override
		public void close() throws Exception {
			for (Entry<IncQueryMatcher<? extends IPatternMatch>, MatchUpdateListener> entry : listeners.entries()) {
				getQueryEngine().removeMatchUpdateListener(entry.getKey(), entry.getValue());
			}
		}
		
		
		private void initLockMonitoringRule(final Lock lock) { //, Set<RuleSpecification<IPatternMatch>> lockEnforcingRuleAccumulator) {
			MatchUpdateListener listener = new MatchUpdateListener(lock);
			IncQueryMatcher<? extends IPatternMatch> matcher = matcherForLock.get(lock);
			
			getQueryEngine().addMatchUpdateListener(matcher, listener, false);
			listeners.put(matcher, listener);
		}

		
		private final class MatchUpdateListener implements IMatchUpdateListener<IPatternMatch> {
			private Lock lock;
			private IPatternMatch bindingMatch;
			
			@Override
			public void notifyAppearance(IPatternMatch match) {
				processChange(match, UpdateDirection.ADD);
			}
			
			@Override
			public void notifyDisappearance(IPatternMatch match) {
				processChange(match, UpdateDirection.REMOVE);
			}
			
			private void processChange(IPatternMatch match, UpdateDirection direction) {
				if (match.isCompatibleWith(bindingMatch)) {
					// update the delta data structure
					if (! delta.get(direction.opposite()).remove(lock, match))
						delta.get(direction).put(lock, match);					
				}
			}
			
			public MatchUpdateListener(Lock lock) {
				this.lock = lock;
				bindingMatch = bindingForLock.get(lock);
			}
			
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + getOuterType().hashCode();
				result = prime * result + ((lock == null) ? 0 : lock.hashCode());
				return result;
			}
			
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				MatchUpdateListener other = (MatchUpdateListener) obj;
				if (!getOuterType().equals(other.getOuterType()))
					return false;
				if (lock == null) {
					if (other.lock != null)
						return false;
				} else if (!lock.equals(other.lock))
					return false;
				return true;
			}
			
			private LockMonitoringSession getOuterType() {
				return LockMonitoringSession.this;
			}
			
			
		}
		
	}
	
	static enum UpdateDirection {
		ADD,
		REMOVE;
		
		public UpdateDirection opposite() {
			switch(this) {
			case ADD: return REMOVE;
			case REMOVE: return ADD;
			}
			return null;
		}
	}


	public Map<Lock, Set<String>> getLockOwnerNames() {
		return lockOwnerNames;
	}

}
