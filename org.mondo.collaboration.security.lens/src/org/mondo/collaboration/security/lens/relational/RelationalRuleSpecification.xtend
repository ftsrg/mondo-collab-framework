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

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableSet
import com.google.common.collect.Iterables
import java.util.List
import org.eclipse.incquery.runtime.api.IMatchProcessor
import org.eclipse.incquery.runtime.api.IPatternMatch
import org.eclipse.incquery.runtime.api.IQuerySpecification
import org.eclipse.incquery.runtime.evm.specific.Jobs
import org.eclipse.incquery.runtime.evm.specific.Lifecycles
import org.eclipse.incquery.runtime.evm.specific.Rules
import org.eclipse.incquery.runtime.evm.specific.event.IncQueryActivationStateEnum
import org.eclipse.incquery.runtime.matchers.psystem.PBody
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter
import org.eclipse.incquery.runtime.matchers.psystem.queries.PQuery
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1
import org.mondo.collaboration.security.lens.context.BaseMondoLensPQuery
import org.mondo.collaboration.security.lens.context.GenericMondoLensQuerySpecification

import static extension org.mondo.collaboration.security.lens.relational.RelationalRuleSpecification.*
import org.mondo.collaboration.security.lens.util.OperationalizationExtensions

/**
 * A class representing a high-level, relational specification of a bidirectional transformation rule 
 * @author Bergmann Gabor
 *
 */
@Accessors
public class RelationalRuleSpecification {
	String name
	int priority
	
	List<ManipulableTemplate> gold = newArrayList()
	List<ManipulableTemplate> correspondence = newArrayList()
	List<ManipulableTemplate> front = newArrayList()
	
	List<ConstrainerTemplate> condition = newArrayList()
	List<ConstrainerTemplate> readAuthorization = newArrayList()
	List<ActionStep> writeAuthorization = newArrayList()
	
	extension OperationalizationExtensions extendUtil = OperationalizationExtensions::INSTANCE
	
	/**
	 * Generates constraints into rule precondition patterns.
	 */
	public static abstract class ConstrainerTemplate implements Procedure1<PBody> {}
	/**
	 * Represents an imperative step that can be used in a rule postcondition
	 */
	public static abstract class ActionStep implements Procedure1<RuleExecutionEnvironment> {}
	
		
	public def operationalize(RelationalTransformationSpecification transformation) {
		val goldReadable = new GenericMondoLensQuerySpecification(new BaseMondoLensPQuery(
			'''«transformation.fullyQualifiedName».«name».goldReadable''',
			gatherParameters(gold)
		) {
			override protected doGetContainedBodies() throws QueryInitializationException {
				singleBody(
					gold.map[asConstrainer], 
					readAuthorization
				)
			}
		})
		val mapped = new GenericMondoLensQuerySpecification(new BaseMondoLensPQuery(
			'''«transformation.fullyQualifiedName».«name».mapped''',
			gatherParameters(gold, correspondence, front)
		) {
			override protected doGetContainedBodies() throws QueryInitializationException {
				singleBody(
					#[positiveCall(goldReadable)], 
					condition, 
					correspondence.map[asConstrainer], 
					front.map[asConstrainer]
				)
			}
		})
		val getAddLHS = new GenericMondoLensQuerySpecification(new BaseMondoLensPQuery(
			'''«transformation.fullyQualifiedName».«name».get.add.LHS''',
			gatherParameters(gold)
		) {
			override protected doGetContainedBodies() throws QueryInitializationException {
				singleBody(
					condition, 
					#[
						positiveCall(goldReadable), 
						negativeCall(mapped)
					]
				)
			}
		})
		val getRemoveLHS = new GenericMondoLensQuerySpecification(new BaseMondoLensPQuery(
			'''«transformation.fullyQualifiedName».«name».get.remove.LHS''',
			gatherParameters(front)
		) {
			override protected doGetContainedBodies() throws QueryInitializationException {
				singleBody(
					front.map[asConstrainer], 
					condition, 
					#[negativeCall(mapped)]
				)
			}
		})
		
		return new RuleOperationalization(transformation, this) => [
			queries += goldReadable
			queries += mapped
			queries += getAddLHS
			queries += getRemoveLHS
			rulesForGet += createEVMRule(getAddLHS, 1 * priority,
					front.map[asAssertAction],
					correspondence.map[asAssertAction]
				)
			rulesForGet += createEVMRule(getRemoveLHS, -1 * priority,
					front.map[asRetractAction],
					correspondence.map[asRetractAction]
				)
		// TODO putback
		]
	}
	
}