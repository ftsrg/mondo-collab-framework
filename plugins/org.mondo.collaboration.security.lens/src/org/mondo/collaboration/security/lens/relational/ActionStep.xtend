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

package org.mondo.collaboration.security.lens.relational

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1

/**
 * Represents an imperative step that can be used in a rule postcondition
 */
public abstract class ActionStep implements Procedure1<RuleExecutionEnvironment> {
	
//	def protected Object getVariableValue(RuleExecutionEnvironment environment, String variableName) {
//		environment.variables.get(variableName)
//	}  
//	def protected Object getVariableValueNonNull(RuleExecutionEnvironment environment, String variableName) {
//		val value = environment.getVariableValue(variableName)
//		if (value == null)
//			throw new IllegalStateException('''Variable "«variableName»" has no value.''')
//		value
//	}  
}
