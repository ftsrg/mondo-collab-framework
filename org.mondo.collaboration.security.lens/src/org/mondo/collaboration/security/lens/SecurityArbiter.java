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

import java.util.Comparator;
import java.util.EnumMap;
import java.util.TreeSet;

import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.Policy;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.Role;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.RuleType;

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
	
	private Policy policy;
	
	public SecurityArbiter(Policy policy) {
		super();
		this.policy = policy;
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
		TreeSet<SecurityRuleJudgement> judgements = getConflictingJudgements(op, role, asset);
		if (judgements.isEmpty()) return null;
		return judgements.iterator().next().getRule().getType();
	}

	public TreeSet<SecurityRuleJudgement> getConflictingJudgements(Operation op, Role role, Asset asset) {
		TreeSet<SecurityRuleJudgement> judgements = currentRights.get(op).get(role, asset);
		if (judgements == null) {
			judgements = new TreeSet<>(ruleConflictResolver);
			currentRights.get(op).put(role, asset, judgements);
		}
		return judgements;
	}
	
	/**
	 * "lesser" judgement overrides bigger judgement
	 */
	private Comparator<SecurityRuleJudgement> ruleConflictResolver;
	
	

}
