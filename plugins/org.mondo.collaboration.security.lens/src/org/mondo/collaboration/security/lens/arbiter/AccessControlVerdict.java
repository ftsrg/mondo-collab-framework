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

import java.util.Map;

import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter.OperationKind;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.Rule;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.RuleConstraint;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.RuleRights;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.RuleType;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

/**
 * Represents a verdict of allowing, denying or obfuscating a specific operation.
 * @author Bergmann Gabor
 *
 */
public enum AccessControlVerdict {
	PERMITTED,
	DENIED,
	OBFUSCATED;
	
	/**
	 * @return the verdict the rule gives for various operations; no entry is returned for an operation if the rule does not concern it
	 */
	public static Map<OperationKind, AccessControlVerdict> interpret(Rule rule) {
		final RuleConstraint ruleConstraint = rule.getContraint();
		if (ruleConstraint == null) { // obfuscate rule
			return OBFUSCATE_INTERPRETATION;
		} else {
			final RuleType ruleType = ruleConstraint.getType();
			RuleRights rights = ruleConstraint.getRights();
			return REGULAR_INTERPRETATIONS.get(ruleType).get(rights);
		}
	}
	
	private static final Map<OperationKind, AccessControlVerdict> OBFUSCATE_INTERPRETATION =
			Maps.immutableEnumMap(ImmutableMap.of(
				OperationKind.READ, OBFUSCATED, 
				OperationKind.WRITE, DENIED
			));
	private static final Map<RuleType, Map<RuleRights, Map<OperationKind, AccessControlVerdict>>> REGULAR_INTERPRETATIONS =
			Maps.immutableEnumMap(ImmutableMap.of(
				RuleType.DENY, buildRegularInterpretations(DENIED), 
				RuleType.PERMIT, buildRegularInterpretations(PERMITTED)
			));
	private static Map<RuleRights, Map<OperationKind, AccessControlVerdict>> buildRegularInterpretations(AccessControlVerdict verdict) {
		return 	Maps.immutableEnumMap(ImmutableMap.<RuleRights, Map<OperationKind, AccessControlVerdict>>of(
				RuleRights.READ, Maps.immutableEnumMap(ImmutableMap.of(OperationKind.READ, verdict)), 
				RuleRights.WRITE, Maps.immutableEnumMap(ImmutableMap.of(OperationKind.WRITE, verdict)), 
				RuleRights.READ_WRITE, Maps.immutableEnumMap(ImmutableMap.of(OperationKind.READ, verdict, OperationKind.WRITE, verdict))
			));
	}
	
}
