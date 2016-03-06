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

import org.apache.log4j.Logger
import org.eclipse.incquery.runtime.api.IPatternMatch
import org.eclipse.xtend.lib.annotations.Data
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.User
import org.mondo.collaboration.security.lens.arbiter.Asset
import org.mondo.collaboration.security.mpbl.xtext.mondoPropertyBasedLocking.Lock

/**
 * Represent the reason the lens execution has been aborted.
 * Must either be a {@link RuntimeExceptionAbort} or a {@link DenialReason}.
 */
public interface AbortReason {
    public def void logAbortion(Logger logger, String executionFullID)

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
	@Data
	public static class WriteAuthorizationDenial implements DenialReason {
		val User user
		val Class<? extends Asset> assetClass
		val IPatternMatch authMatch
		//val IPatternMatch lhsMatch
		
		override logAbortion(Logger logger, String executionFullID) {
			logger.warn(
			'''Aborting execution of «executionFullID»: «prettyPrintProblem»''')
		}	
		
		override prettyPrintProblem() {
			'''Permission denied - user "«user.name»" has no authorization for writing «assetClass.simpleName» at «authMatch.prettyPrint»'''
		}
		
	}
	@Data
	public static class LockViolationDenial implements DenialReason {
		val String manipulatorUserName
		val Lock lock
		val IPatternMatch violatingMatch
		//val IPatternMatch lhsMatch
		
		override logAbortion(Logger logger, String executionFullID) {
			logger.warn(
			'''Aborting execution of «executionFullID»: «prettyPrintProblem»''')
		}	
		
		override prettyPrintProblem() {
			'''Operation by user "«manipulatorUserName»" violates lock granted to «lock.owner.name» at query match «violatingMatch.prettyPrint»'''
		}
		
	}
}