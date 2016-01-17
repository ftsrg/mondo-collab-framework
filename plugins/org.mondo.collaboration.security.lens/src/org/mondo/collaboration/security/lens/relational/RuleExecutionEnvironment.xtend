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

import java.util.Map
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.incquery.runtime.matchers.context.IInputKey
import org.eclipse.incquery.runtime.matchers.tuple.Tuple
import java.util.List
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple
import org.mondo.collaboration.security.lens.bx.LensTransformationExecution
import org.mondo.collaboration.security.lens.bx.LensTransformationExecution.UndoableManipulationAction

/**
 * The runtime execution context of a transformation rule
 * @author Bergmann Gabor
 *
 */
@Data
class RuleExecutionEnvironment {
	/**
	 * The transformation execution that is happening now.
	 */
	LensTransformationExecution transformationExecution
	
	/**
	 * The set of rule variable values, keyed by variable name. 
	 * Modifiable by {@link org.mondo.collaboration.security.lens.relational.RelationalRule$ActionStep}s.
	 */
	Map<String, Object> variables = newHashMap
	
	
	/**
	 * Performs the given elementary model manipulation.
	 * <p> A tuple is inserted into / retracted from the manipulable identified by the given key.
	 * <p> Members of the tuple are bound to execution environment variables (some of which may be unassigned) identified by names.
	 */
	public def Tuple performManipulation(IInputKey key, List<String> argumentVariableNames, boolean isInsertion) {
		val manipulable = transformationExecution.transformation.getManipulable(key)
		
		val Object[] seedValueArray = argumentVariableNames.map[variables.get(it)]
		val seedTuple = new FlatTuple(seedValueArray)
		
		// do the actual manipulation
		val finalTuple = if (isInsertion) manipulable.assertTuple(seedTuple) else manipulable.retractTuple(seedTuple)

		transformationExecution.undoStack.add(new UndoableManipulationAction(key, finalTuple, isInsertion))

		// record new variable values
		if (isInsertion) {
			for (int i : 0..< argumentVariableNames.size)
				variables.put(argumentVariableNames.get(i), finalTuple.get(i))
		}

		finalTuple
	}
}