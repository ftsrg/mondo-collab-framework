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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mondo.collaboration.policy.rules.Rule;

/**
 * @author Bergmann Gabor
 *
 */
public class FirstApplicableResolution implements SecurityArbiter.RuleConflictResolver {
	
	private Map<Rule, Integer> ruleToIndex = new HashMap<Rule, Integer>();

	public FirstApplicableResolution(List<Rule> rules) {
		super();
		
		int index = 0;
		for (Rule rule : rules) {
			ruleToIndex.put(rule, index++);
		}
	}

	@Override
	public int compare(SecurityRuleJudgement arg0, SecurityRuleJudgement arg1) {
		return getIndex(arg0) - getIndex(arg1);
	}

	public Integer getIndex(SecurityRuleJudgement arg0) {
		return ruleToIndex.get(arg0.getRule());
	}

}
