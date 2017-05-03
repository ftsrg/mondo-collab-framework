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

import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.mondo.collaboration.policy.rules.Rule;

/**
 * Immutable object representing that the given security rule is applicable to the object or feature setting 
 * identified by the given asset, as justified by the given pattern match.
 * @author Bergmann Gabor
 *
 */
public class SecurityRuleJudgement {
	
	private Rule rule;
	private Asset asset;
	private IPatternMatch justification;
	
	/**
	 * @param rule
	 * @param ruleCase
	 * @param justification
	 */
	public SecurityRuleJudgement(Rule rule, Asset asset, IPatternMatch justification) {
		super();
		this.rule = rule;
		this.asset = asset;
		this.justification = justification;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((justification == null) ? 0 : justification.hashCode());
		result = prime * result + ((rule == null) ? 0 : rule.hashCode());
		result = prime * result + ((asset == null) ? 0 : asset.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SecurityRuleJudgement))
			return false;
		SecurityRuleJudgement other = (SecurityRuleJudgement) obj;
		if (justification == null) {
			if (other.justification != null)
				return false;
		} else if (!justification.equals(other.justification))
			return false;
		if (rule == null) {
			if (other.rule != null)
				return false;
		} else if (!rule.equals(other.rule))
			return false;
		if (asset == null) {
			if (other.asset != null)
				return false;
		} else if (!asset.equals(other.asset))
			return false;
		return true;
	}
	
	public Rule getRule() {
		return rule;
	}
	public Asset getAsset() {
		return asset;
	}
	public IPatternMatch getJustification() {
		return justification;
	}

	
	
}
