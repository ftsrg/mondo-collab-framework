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

package org.mondo.collaboration.security.lens;

import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Set;
import java.util.TreeSet;

import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.Group;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.Policy;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.Role;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.RuleType;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.User;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

/**
 * @author Bergmann Gabor
 *
 */
public class SecurityArbiter {
	public static enum Operation {
		READ,
		WRITE
	}
	/*public static enum AccessDecision {
		PERMITTED,
		DENIED,
		DEFAULT
	}*/
	
	private final Policy policy;
	private Role roleRestriction;
	
	/**
	 * @param policy
	 * @param roleRestriction if not null, only this role will be considered; if null, all roles will be considered
	 */
	public SecurityArbiter(Policy policy, Role roleRestriction) {
		super();
		this.policy = policy;
		this.roleRestriction = roleRestriction;
		this.ruleConflictResolver = new FirstApplicableResolution(policy);
	}

	
	private EnumMap<Operation, Table<Role, Asset, TreeSet<SecurityRuleJudgement>>> currentRights = new EnumMap<>(Operation.class); 
	{
		for (Operation op : Operation.values()) {
			currentRights.put(op, HashBasedTable.<Role, Asset, TreeSet<SecurityRuleJudgement>>create());
		}
	}
	
	/**
	 * @return null if no rules applicable, or the 'type' of the most prioritized applicable rule otherwise
	 */
	public RuleType getPrevailingJudgement(Operation op, Role role, Asset asset) {
		Set<SecurityRuleJudgement> judgements = getConflictingJudgements(op, role, asset);
		return getPrevailingJudgementInternal(judgements);
	}

	private RuleType getPrevailingJudgementInternal(Set<SecurityRuleJudgement> judgements) {
		if (judgements.isEmpty()) return null;
		return judgements.iterator().next().getRule().getType();
	}

	public Set<SecurityRuleJudgement> getConflictingJudgements(Operation op, Role role, Asset asset) {
		Set<SecurityRuleJudgement> judgements = currentRights.get(op).get(role, asset);
//		if (judgements == null) {
//			judgements = new TreeSet<>(ruleConflictResolver);
//			currentRights.get(op).put(role, asset, judgements);
//		}
		if (judgements == null)
			judgements = Collections.emptySet();
		return judgements;
	}
	
	/**
	 * If role is a group, users are updated as well.
	 */
	public void updateJudgement(Operation op, Role role, Asset asset, SecurityRuleJudgement judgement, boolean addition) {
		updateJudgementInternal(op, role, asset, judgement, addition);
		if (role instanceof Group) {
			for (User user : ((Group) role).getUsers()) {
				updateJudgementInternal(op, user, asset, judgement, addition);
			}
		}
	}
	
	private void updateJudgementInternal(Operation op, Role role, Asset asset, SecurityRuleJudgement judgement, boolean addition) {
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
			// TODO notifications			
			// if (oldPrevailing != null) send(...);
			// if (newPrevailing != null) send(...);
		}
		
	}
	
	/**
	 * "lesser" judgement overrides bigger judgement
	 */
	private Comparator<SecurityRuleJudgement> ruleConflictResolver;
	
	

}
