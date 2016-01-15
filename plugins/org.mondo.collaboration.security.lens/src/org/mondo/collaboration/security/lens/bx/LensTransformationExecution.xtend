/*******************************************************************************
 * Copyright (c) 2004-2016 Gabor Bergmann and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabor Bergmann - initial API and implementation
 *******************************************************************************/

package org.mondo.collaboration.security.lens.bx

import java.util.ArrayDeque
import org.apache.log4j.Logger
import org.eclipse.incquery.runtime.matchers.context.IInputKey
import org.eclipse.incquery.runtime.matchers.tuple.Tuple
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data
import org.mondo.collaboration.security.lens.bx.AbortReason.DenialReason
import org.mondo.collaboration.security.lens.bx.AbortReason.RuntimeExceptionAbort

/**
 * Tracks a single get / putback execution 
 * @author Bergmann Gabor
 *
 */
@Accessors
public class LensTransformationExecution {
	val RelationalLensXform transformation
	val String executionSequenceID
	val String executionFullID
	val	Logger logger
	val undoStack = new ArrayDeque<UndoableManipulationAction>
	
	public new(RelationalLensXform transformation, String executionSequenceID) {
		this.transformation = transformation
		this.executionSequenceID = executionSequenceID
		this.executionFullID = '''«transformation.fullyQualifiedName».«executionSequenceID»'''
		this.logger = Logger::getLogger(executionFullID)	
	}
	
	
	
	/**
	 * Null as long as transformation execution is not aborted
	 */
	@Accessors(PUBLIC_GETTER) AbortReason abortReason 
	
	public def boolean isAborted() {
		abortReason != null
	}
	public def void abort(AbortReason reason) {
		abortReason = reason
		reason.logAbortion(logger, executionFullID)
	}
	
	/**
	 * If the transformation was aborted due to a denial, the denial reason is returned.
	 * If aborted due to a runtime exception instead, the exception is thrown again.
	 * If the transformation was not aborted, null is returned
	 */
	public def extractDenialReason() {
		if (abortReason instanceof RuntimeExceptionAbort) 
			throw abortReason.exception
		else
			return abortReason as DenialReason
	}

	@Data
	/**
	 * Represent an elementary modification that can be rolled back if necessary.
	 */
	public static class UndoableManipulationAction {
		IInputKey manipulableKey
		Tuple updateTuple
		boolean isInsertion
	}
	
}