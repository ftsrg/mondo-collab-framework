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

import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.incquery.runtime.api.AdvancedIncQueryEngine;
import org.eclipse.incquery.runtime.api.GenericPatternGroup;
import org.eclipse.incquery.runtime.api.IMatchUpdateListener;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.base.api.BaseIndexOptions;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.LeftInheritanceTuple;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.mondo.collaboration.security.lens.util.ILiveRelation;
import org.mondo.collaboration.security.lens.util.LiveTable;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.Binding;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.ConflictResolutionTypes;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.Group;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.Policy;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.Role;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.Rule;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.RuleRights;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.RuleType;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.User;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.ValueBind;

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
 *   'asset-tuple' identifies the asset (see {@link Asset#toTuple()}), role is a user/group, and judgement is the {@link RuleType} of the prevailing judgement. 
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
	
	private final Policy policy;
	private Role roleRestriction;
	private Set<? extends Notifier> goldModelRoots; 
	
	private RuleConflictResolver ruleConflictResolver;
	private AdvancedIncQueryEngine policyQueryEngine;
	private SpecificationBuilder specBuilder;
	
	private Map<Rule, Asset.Factory> assetFactories = new HashMap<>();
	
	/**
	 * @param policy the policy describing the security rules to be applied
	 * @param roleRestriction if not null, only this role will be considered; if null, all roles will be considered
	 * @param goldModelRoots the roots of the gold model
	 * @param indexOptions 
	 * @throws IncQueryException 
	 */
	public SecurityArbiter(Policy policy, Role roleRestriction, Set<? extends Notifier> goldModelRoots, BaseIndexOptions indexOptions) throws IncQueryException {
		super();
		this.policy = policy;
		this.roleRestriction = roleRestriction;
		this.goldModelRoots = goldModelRoots;
		
		if (ConflictResolutionTypes.FIRST_APPLICABLE != policy.getType())
			throw new UnsupportedOperationException(
					"Unsupported conflict resolution: " + policy.getType());
		this.ruleConflictResolver = new FirstApplicableResolution(policy);

		policyQueryEngine = AdvancedIncQueryEngine.from(IncQueryEngine.on(new EMFScope(goldModelRoots, indexOptions)));
		this.specBuilder = new SpecificationBuilder();
		
		Set<IQuerySpecification<?>> ruleQueries = new HashSet<>();
		for (Rule rule : policy.getRules()) {
			preprocessRules(rule, ruleQueries);
		}
		new GenericPatternGroup(ruleQueries).prepare(policyQueryEngine);
		for (final Rule rule : policy.getRules()) {
			initRuleListeners(rule);
		}
		
	}


	private void preprocessRules(Rule rule, Set<IQuerySpecification<?>> ruleQueryAccumulator) throws IncQueryException {
		for (Binding binding : rule.getBindings()) {
			if (!(binding.getValue() instanceof ValueBind))
				throw new UnsupportedOperationException(
						"Unsupported binding " + binding.getValue() + " in rule " + rule.getName());
		}
		
		IQuerySpecification<? extends IncQueryMatcher<? extends IPatternMatch>> query = 
				specBuilder.getOrCreateSpecification(rule.getPattern());
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
	 * @return null if no rules applicable, or the 'type' of the most prioritized applicable rule otherwise
	 */
	public RuleType getPrevailingJudgement(OperationKind op, Role role, Asset asset) {
		Set<SecurityRuleJudgement> judgements = getConflictingJudgements(op, role, asset);
		return getPrevailingJudgementInternal(judgements);
	}

	private RuleType getPrevailingJudgementInternal(Set<SecurityRuleJudgement> judgements) {
		if (judgements.isEmpty()) return null;
		return judgements.iterator().next().getRule().getType();
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
	
	public ILiveRelation getResultsAsLiveRelation(OperationKind op, Class<? extends Asset> assetClass) {
		return getResultsAsLiveTable(op, assetClass);
	}

	private LiveTable getResultsAsLiveTable(OperationKind op, Class<? extends Asset> assetClass) {
		return results.get(op).get(assetClass);
	}

	private EnumMap<RuleRights, Set<OperationKind>> rightsToOps = new EnumMap<>(RuleRights.class);
	{
		rightsToOps.put(RuleRights.READ, ImmutableSet.of(OperationKind.READ));
		rightsToOps.put(RuleRights.WRITE, ImmutableSet.of(OperationKind.WRITE));
		rightsToOps.put(RuleRights.READ_WRITE, ImmutableSet.of(OperationKind.READ, OperationKind.WRITE));
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
			for (OperationKind op : rightsToOps.get(rule.getRights())) {
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
		
		RuleType oldPrevailing = getPrevailingJudgementInternal(judgements);
		if (addition) {
			judgements.add(judgement);
		} else {
			judgements.remove(judgement);			
			if (judgements.isEmpty())
				currentRights.get(op).remove(role, asset);
		}
		RuleType newPrevailing = getPrevailingJudgementInternal(judgements);
		
		if (oldPrevailing != newPrevailing) {
			if (oldPrevailing != null) 
				updateResults(op, role, asset, oldPrevailing, false);
			if (newPrevailing != null) 
				updateResults(op, role, asset, newPrevailing, true);
		}
		
	}
	
	private void updateResults(OperationKind op, Role role, Asset asset, RuleType prevailing, boolean isAddition) {
		Tuple resultTuple = new LeftInheritanceTuple(asset.toTuple(), new Object[]{role, prevailing});
		
		LiveTable table = getResultsAsLiveTable(op, asset.getClass());
		table.updateTuple(resultTuple, isAddition);
	}

	/**
	 * "lesser" judgement overrides bigger judgement
	 */
	public static interface RuleConflictResolver extends Comparator<SecurityRuleJudgement> {} 

}
