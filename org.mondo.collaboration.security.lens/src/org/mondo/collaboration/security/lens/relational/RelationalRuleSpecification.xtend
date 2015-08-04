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
import org.mondo.collaboration.security.lens.util.RuleGeneratorExtensions

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
	
	List<QueryTemplate> condition = newArrayList()
	List<QueryTemplate> readAuthorization = newArrayList()
	List<ActionStep> writeAuthorization = newArrayList()
	
	extension RuleGeneratorExtensions extendUtil = RuleGeneratorExtensions::INSTANCE
		
		
	public def operationalize(RelationalTransformationSpecification transformation) {
		val goldReadable = composeQuery('''«transformation.fullyQualifiedName».«name».goldReadable''',
			gold, 
			readAuthorization
		)
		val mapped = composeQuery('''«transformation.fullyQualifiedName».«name».mapped''',
			#[positiveCall(goldReadable)], 
			condition, 
			correspondence, 
			front
		)
		val unmappedGold = composeQuery('''«transformation.fullyQualifiedName».«name».unmappedGold''',
			condition, 
			#[
				positiveCall(goldReadable), 
				negativeCall(mapped)
			]
		)
		val unmappedFront = composeQuery('''«transformation.fullyQualifiedName».«name».unmappedFront''',
			front, 
			condition, 
			#[negativeCall(mapped)]
		)
		
		return new RuleOperationalization(transformation, this) => [
			queries += goldReadable
			queries += mapped
			queries += unmappedGold
			queries += unmappedFront
			rulesForGet += createEVMRule(unmappedGold, 1 * priority,
					front.map[asAssertAction],
					correspondence.map[asAssertAction]
				)
			rulesForGet += createEVMRule(unmappedFront, -1 * priority,
					front.map[asRetractAction],
					correspondence.map[asRetractAction]
				)
			rulesForPutback += createEVMRule(unmappedFront, 1 * priority,
					gold.map[asAssertAction],
					correspondence.map[asAssertAction],
					writeAuthorization
				)
			rulesForPutback += createEVMRule(unmappedGold, -1 * priority,
					writeAuthorization,
					correspondence.map[asRetractAction],
					gold.map[asRetractAction]
				)
		]
	}
	
}