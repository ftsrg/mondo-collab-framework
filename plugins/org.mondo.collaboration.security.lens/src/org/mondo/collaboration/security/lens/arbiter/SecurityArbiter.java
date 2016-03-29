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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.incquery.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.AdvancedIncQueryEngine;
import org.eclipse.incquery.runtime.api.GenericPatternGroup;
import org.eclipse.incquery.runtime.api.IMatchUpdateListener;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.base.api.BaseIndexOptions;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.LeftInheritanceTuple;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.mondo.collaboration.security.lens.util.ILiveRelation;
import org.mondo.collaboration.security.lens.util.LiveTable;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.AccessControlModel;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.ConflictResolutionTypes;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.Policy;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.RuleRef;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.Binding;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.Group;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.Role;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.Rule;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.User;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.ValueBind;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Table;

/**
 * For both READ/WRITE operations and all {@link Asset} types, 
 * 	 the arbiter publishes a {@link LiveTable} of the current best judgement whether a given user can access the asset,
 *   based on a rule conflict resolver sorting out the continuously updated set of matches of macl rules, 
 *   as specified by a given {@link Policy} and evaluated over the given roots of the 'gold' model.
 * 
 * <p> For each {@link OperationKind} and subclass of {@link Asset}, the table returned by {@link #getResultsAsLiveTable(OperationKind, Class)}
 *   will contain tuples conforming to the schema ( asset-tuple ; role ; judgement ), where
 *   'asset-tuple' identifies the asset (see {@link Asset#toTuple()}), role is a user/group, and judgement is the {@link AccessControlVerdict} of the prevailing judgement. 
 *   
 * <p> Note that no entry is created for the default case, when no security rules match at all. 
 * 
 * <p> TODO: Can we make the assumption that RuleConflictResolver can be Comparator<Rule>, 
 * 	i.e. not depend on the match and the asset? In this case, currentRights can be restructured as an
 *   <pre>EnumMap < OperationKind, Table < Role, Asset, Multimap < Rule, IPatternMatch > > > </pre>
 *  where
 *   the contained Multimaps are created as
 *   <pre>Multimaps.newSetMultimap(new TreeMap(comparator), (() => new HashSet) )</pre>
 *  which would be more efficient, since multiple justifications for the same judgement do not have to be
 *  compared against each other.
 * 
 * @author Bergmann Gabor
 *
 */
public class SecurityArbiter { /*received through {@link #updateJudgement(OperationKind, Role, Asset, SecurityRuleJudgement, boolean)}. */

	public static SecurityArbiter create(
			Resource policyResource, 
			ResourceSet goldResourceSet,
			User userFilter) throws IncQueryException 
	{
		Policy policyModel = extractPolicyElement(policyResource);
		SecurityArbiter arbiter = new SecurityArbiter(
				policyModel, 
				userFilter, 
				ImmutableSet.of(goldResourceSet), 
				new BaseIndexOptions());
		return arbiter;
	}


	private static Policy extractPolicyElement(Resource policyResource) {
		AccessControlModel accessControlModel = (AccessControlModel) policyResource.getContents().get(0);
		Policy policyModel = accessControlModel.getPolicy();
		return policyModel;
	}	
	
	public static enum OperationKind {
		READ,
		WRITE
	}
	/*public static enum AccessDecision {
		PERMITTED,
		DENIED,
		DEFAULT
	}*/
	
	
	private Map<OperationKind, Map<Class<? extends Asset>, LiveTable>> results = new EnumMap<>(OperationKind.class);
	{
		for (OperationKind operationKind : OperationKind.values()) {
			final HashMap<Class<? extends Asset>, LiveTable> opResults = new HashMap<Class<? extends Asset>, LiveTable>();
			results.put(operationKind, opResults);
			for (Class<? extends Asset> assetClass : Asset.getKinds()) {
				opResults.put(assetClass, new LiveTable());
			}			
		}		
	}
	private EnumMap<OperationKind, Table<Role, Asset, TreeSet<SecurityRuleJudgement>>> currentRights = new EnumMap<>(OperationKind.class);
	{
		for (OperationKind op : OperationKind.values()) {
			currentRights.put(op, HashBasedTable.<Role, Asset, TreeSet<SecurityRuleJudgement>>create());
		}
	}
	
	private Role roleRestriction;
	private Set<? extends Notifier> goldModelRoots; 
	private BaseIndexOptions indexOptions;
	

	
	private Policy policy;
	private AdvancedIncQueryEngine policyQueryEngine;
	private SpecificationBuilder specBuilder;
	private RuleConflictResolver ruleConflictResolver;
	private Map<Rule, Asset.Factory> assetFactories;
	
	/**
	 * @param policy the initial policy describing the security rules to be applied
	 * @param roleRestriction if not null, only this role will be considered; if null, all roles will be considered
	 * @param goldModelRoots the roots of the gold model
	 * @param indexOptions 
	 * @throws IncQueryException 
	 */
	public SecurityArbiter(Policy policy, Role roleRestriction, Set<? extends Notifier> goldModelRoots, BaseIndexOptions indexOptions) throws IncQueryException {
		super();
		this.roleRestriction = roleRestriction;
		this.goldModelRoots = goldModelRoots;
		this.indexOptions = indexOptions;

		reinitializeWith(policy);
		
	}


	/**
	 * Call if there is a new access control policy to parse. 
	 * @param policyResource the new policy describing the security rules to be applied
	 */
	public void reinitializeWith(Resource policyResource) throws IncQueryException {
		reinitializeWith(extractPolicyElement(policyResource));
	}
	
	/**
	 * Call if there is a new access control policy to parse. 
	 * @param policy the new policy describing the security rules to be applied
	 */
	public void reinitializeWith(Policy policy) throws IncQueryException {
		this.policy = policy;
		
		// clear up internal data structures
		for (OperationKind operationKind : OperationKind.values()) {
			for (Class<? extends Asset> assetClass : Asset.getKinds()) {
				results.get(operationKind).get(assetClass).clear();
			}			
		}		
		for (OperationKind op : OperationKind.values()) {
			currentRights.get(op).clear();
		}
		assetFactories = new HashMap<>();
		
		List<Rule> rules = new ArrayList<>();
		for (EObject ruleObject : policy.getRules()) {
			if (ruleObject instanceof Rule) {
				rules.add((Rule) ruleObject);
			} else if (ruleObject instanceof RuleRef) {
				final Rule rule = ((RuleRef) ruleObject).getRule();
				if (rule != null) rules.add(rule);
			}
		}
		
		if (ConflictResolutionTypes.FIRST_APPLICABLE != policy.getType())
			throw new UnsupportedOperationException(
					"Unsupported conflict resolution: " + policy.getType());
		this.ruleConflictResolver = new FirstApplicableResolution(rules);

		if (policyQueryEngine != null) 
			policyQueryEngine.wipe();
		else 
			policyQueryEngine = AdvancedIncQueryEngine.createUnmanagedEngine(
					new EMFScope(this.goldModelRoots, this.indexOptions));
		this.specBuilder = new SpecificationBuilder();
		
		Set<IQuerySpecification<?>> ruleQueries = new HashSet<>();
		for (Rule rule : rules) {
			preprocessRules(rule, ruleQueries);
		}
		new GenericPatternGroup(ruleQueries).prepare(policyQueryEngine);
		for (final Rule rule : rules) {
			initRuleListeners(rule);
		}
	}


	private void preprocessRules(Rule rule, Set<IQuerySpecification<?>> ruleQueryAccumulator) throws IncQueryException {
		for (Binding binding : rule.getBindings()) {
			if (!(binding.getValue() instanceof ValueBind))
				throw new UnsupportedOperationException(
						"Unsupported binding " + binding.getValue() + " in rule " + rule.getName());
		}
		
		final Pattern pattern = rule.getPattern();
		if (pattern == null || pattern.eIsProxy())
			throw new IllegalArgumentException("Cannot resolve query of rule: " + rule.getName());
		
		IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> query = 
				specBuilder.getOrCreateSpecification(pattern);
		ruleQueryAccumulator.add(query);
		
		assetFactories.put(rule, Asset.factoryFrom(query));
	}

	private void initRuleListeners(final Rule rule) throws IncQueryException {
		IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> query = 
				specBuilder.getOrCreateSpecification(rule.getPattern());

		final IncQueryMatcher<? extends IPatternMatch> matcher = policyQueryEngine.getMatcher(query);
		
		policyQueryEngine.addMatchUpdateListener(matcher, new IMatchUpdateListener<IPatternMatch>() {
			@Override
			public void notifyAppearance(IPatternMatch match) {
				reactToMatchUpdate(match, rule, true);
			}
			@Override
			public void notifyDisappearance(IPatternMatch match) {
				reactToMatchUpdate(match, rule, false);
			}
		}, true);
	}

	
	/**
	 * @return null if no rules applicable, or the verdict of the most prioritized applicable rule otherwise
	 */
	public AccessControlVerdict getPrevailingJudgement(OperationKind op, Role role, Asset asset) {
		Set<SecurityRuleJudgement> judgements = getConflictingJudgements(op, role, asset);
		return getPrevailingJudgementInternal(judgements, op);
	}

	private AccessControlVerdict getPrevailingJudgementInternal(Set<SecurityRuleJudgement> judgements, OperationKind op) {
		if (judgements.isEmpty()) return null;
		
		final SecurityRuleJudgement relevantJudgement = judgements.iterator().next();
		Map<OperationKind, AccessControlVerdict> interpretedRule = AccessControlVerdict.interpret(relevantJudgement.getRule());
		return interpretedRule.get(op);
	}

	public Set<SecurityRuleJudgement> getConflictingJudgements(OperationKind op, Role role, Asset asset) {
		Set<SecurityRuleJudgement> judgements = currentRights.get(op).get(role, asset);
//		if (judgements == null) {
//			judgements = new TreeSet<>(ruleConflictResolver);
//			currentRights.get(op).put(role, asset, judgements);
//		}
		if (judgements == null)
			judgements = Collections.emptySet();
		return judgements;
	}
	
	
	
//	public Map<Operation, Map<Class<? extends Asset>, LiveTable>> getResults() {
//		return results;
//	}
	
	public Policy getPolicy() {
		return policy;
	}


	public ILiveRelation getResultsAsLiveRelation(OperationKind op, Class<? extends Asset> assetClass) {
		return getResultsAsLiveTable(op, assetClass);
	}

	private LiveTable getResultsAsLiveTable(OperationKind op, Class<? extends Asset> assetClass) {
		return results.get(op).get(assetClass);
	}
	
	private void reactToMatchUpdate(IPatternMatch match, Rule rule, boolean isAddition) {
		// filter according to binding, only ValueBindings are supported now, only as string
		for (Binding binding : rule.getBindings()) {
			ValueBind boundValue = (ValueBind) binding.getValue();
			Object matchedValue = match.get(binding.getParam().getName());
			
			if (! matchedValue.toString().equals(boundValue.getValue()))
				return;
		}
		
		Set<? extends Asset> assets = assetFactories.get(rule).apply(match);
		for (Asset asset : assets) {	
			Map<OperationKind, AccessControlVerdict> interpretation = AccessControlVerdict.interpret(rule);
			for (OperationKind op : interpretation.keySet()) {
				for (Role role : rule.getRoles()) {
					updateJudgement(op, role, asset, new SecurityRuleJudgement(rule, asset, match), isAddition);
				}				
			}
		}
		
	}
	
	/**
	 * If role is a group, users are updated as well.
	 */
	protected void updateJudgement(OperationKind op, Role role, Asset asset, SecurityRuleJudgement judgement, boolean addition) {
		updateJudgementInternal(op, role, asset, judgement, addition);
		if (role instanceof Group) {
			for (User user : ((Group) role).getUsers()) {
				updateJudgementInternal(op, user, asset, judgement, addition);
			}
		}
	}
	
	private void updateJudgementInternal(OperationKind op, Role role, Asset asset, SecurityRuleJudgement judgement, boolean addition) {
		if (roleRestriction != null && role != roleRestriction) return;
		
		TreeSet<SecurityRuleJudgement> judgements = currentRights.get(op).get(role, asset);
		if (judgements == null) {
			judgements = new TreeSet<>(ruleConflictResolver);
			currentRights.get(op).put(role, asset, judgements);
		}
		
		AccessControlVerdict oldPrevailing = getPrevailingJudgementInternal(judgements, op);
		if (addition) {
			judgements.add(judgement);
		} else {
			judgements.remove(judgement);			
			if (judgements.isEmpty())
				currentRights.get(op).remove(role, asset);
		}
		AccessControlVerdict newPrevailing = getPrevailingJudgementInternal(judgements, op);
		
		if (oldPrevailing != newPrevailing) {
			if (oldPrevailing != null) 
				updateResults(op, role, asset, oldPrevailing, false);
			if (newPrevailing != null) 
				updateResults(op, role, asset, newPrevailing, true);
		}
		
	}
	
	private void updateResults(OperationKind op, Role role, Asset asset, AccessControlVerdict prevailingVerdict, boolean isAddition) {
		Tuple resultTuple = new LeftInheritanceTuple(asset.toTuple(), new Object[]{role, prevailingVerdict});
		
		LiveTable table = getResultsAsLiveTable(op, asset.getClass());
		table.updateTuple(resultTuple, isAddition);
	}

	/**
	 * "lesser" judgement overrides bigger judgement
	 */
	public static interface RuleConflictResolver extends Comparator<SecurityRuleJudgement> {}

	/**
	 * Convenience method: finds the given user in the access control model.
	 */
	public static User getUserByName(AccessControlModel accessControlModel, String userName) {
		for (Role role : accessControlModel.getRoles()) {
			if (role instanceof User && userName.equals(role.getName()))
				return (User) role;
		}
		
		return null;
	}

	public AdvancedIncQueryEngine getPolicyQueryEngine() {
		return policyQueryEngine;
	} 

	public AuthorizationQueries instantiateAuthorizationQuerySpecificationsForUser(User user) {
		return new AuthorizationQueries(user);
	}
	
	
	public SpecificationBuilder getSpecBuilder() {
		return specBuilder;
	}

}
