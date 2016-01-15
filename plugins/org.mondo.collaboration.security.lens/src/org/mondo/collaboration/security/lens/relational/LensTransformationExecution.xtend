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

package org.mondo.collaboration.security.lens.relational

import org.mondo.collaboration.security.lens.bx.RelationalLensXform
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.incquery.runtime.matchers.context.IInputKey
import org.eclipse.incquery.runtime.matchers.tuple.Tuple
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Deque
import java.util.ArrayDeque
import org.apache.log4j.Logger
import org.eclipse.incquery.runtime.api.IPatternMatch
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.User

/**
 * Tracks a single get / putback execution 
 * @author Bergmann Gabor
 *
 */
@Accessors
public class LensTransformationExecution {
	val RelationalLensXform transformation
	val String executionSequenceID
	
	val executionFullID = '''«transformation.fullyQualifiedName».«executionSequenceID»'''
	val	logger = Logger::getLogger(executionFullID)	
	val undoStack = new ArrayDeque<UndoableManipulationAction>
	
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
	
	/**
	 * Represent the reason the lens execution has been aborted.
	 * Must either be a {@link RuntimeExceptionAbort} or a {@link DenialReason}.
	 */
	public static interface AbortReason {
		public def void logAbortion(Logger logger, String executionFullID)
	}
	/**
	 * Lens Execution has been aborted due to an internal error.
	 */
	@Data
	public static class RuntimeExceptionAbort implements AbortReason {
		val RuntimeException exception
		val IPatternMatch lhsMatch
		
		override logAbortion(Logger logger, String executionFullID) {
			logger.error(
			'''Aborting execution of «executionFullID» when invoking rule for «lhsMatch.prettyPrint» due to exception: «exception.message»''', 
			exception)
		}
		
	}
	/**
	 * Lens Execution has been aborted because a lock or authorization has been denied.
	 */
	public static interface DenialReason extends AbortReason {
		def String prettyPrintProblem();
		
	}
}