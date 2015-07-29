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
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.incquery.runtime.matchers.context.IInputKey
import java.util.List
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple

/**
 * A tuple of variables associated with a manipulable base relation;
 * can be used both as precondition constraint and postcondition action (assert / retract).  
 */
@Data
public class ManipulableTemplate {
		IInputKey key
		List<String> argumentVariables
		
		def RelationalRuleSpecification.ConstrainerTemplate asConstrainer() {
			return [ body |
				val Object[] valueArray = argumentVariables.map[body.getOrCreateVariableByName(it)]
				new TypeConstraint(body, new FlatTuple(valueArray), key)
			]
		}
		def RelationalRuleSpecification.ActionStep asRetractAction() {
			return [ context |
				val Object[] valueArray = argumentVariables.map[context.variables.get(it)]
				context.manipulables.get(key).retractTuple(new FlatTuple(valueArray))
			]
		}
		def RelationalRuleSpecification.ActionStep asAssertAction() {
			return [ context |
				val Object[] valueArray = argumentVariables.map[context.variables.get(it)]
				val assertedTuple = context.manipulables.get(key).assertTuple(new FlatTuple(valueArray))
				for (int i : 0..< argumentVariables.size)
					context.variables.put(argumentVariables.get(i), assertedTuple.get(i))
			]
		}
}