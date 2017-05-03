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

import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;
import org.mondo.collaboration.policy.rules.Rule;
import org.mondo.collaboration.policy.rules.RuleConstraint;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter.OperationKind;

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
		final RuleConstraint ruleConstraint = rule.getConstraint();
		if (ruleConstraint.getAccess() == null) { // obfuscate rule
			return OBFUSCATE_INTERPRETATION;
		} else {
			final AccessibilityLevel ruleType = ruleConstraint.getAccess();
			OperationType rights = ruleConstraint.getOperation();
			return REGULAR_INTERPRETATIONS.get(ruleType).get(rights);
		}
	}
	
	private static final Map<OperationKind, AccessControlVerdict> OBFUSCATE_INTERPRETATION =
			Maps.immutableEnumMap(ImmutableMap.of(
				OperationKind.READ, OBFUSCATED, 
				OperationKind.WRITE, DENIED
			));
	private static final Map<AccessibilityLevel, Map<OperationType, Map<OperationKind, AccessControlVerdict>>> REGULAR_INTERPRETATIONS =
			Maps.immutableEnumMap(ImmutableMap.of(
				AccessibilityLevel.DENY, buildRegularInterpretations(DENIED), 
				AccessibilityLevel.ALLOW, buildRegularInterpretations(PERMITTED)
			));
	private static Map<OperationType, Map<OperationKind, AccessControlVerdict>> buildRegularInterpretations(AccessControlVerdict verdict) {
		return 	Maps.immutableEnumMap(ImmutableMap.<OperationType, Map<OperationKind, AccessControlVerdict>>of(
				OperationType.READ, Maps.immutableEnumMap(ImmutableMap.of(OperationKind.READ, verdict)), 
				OperationType.WRITE, Maps.immutableEnumMap(ImmutableMap.of(OperationKind.WRITE, verdict)), 
				OperationType.READWRITE, Maps.immutableEnumMap(ImmutableMap.of(OperationKind.READ, verdict, OperationKind.WRITE, verdict))
			));
	}
	
}
