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

package org.mondo.collaboration.security.lens.util

import org.mondo.collaboration.security.lens.relational.RuleOperationalization
import org.eclipse.incquery.runtime.api.IQuerySpecification
import com.google.common.collect.Iterables
import org.eclipse.incquery.runtime.evm.specific.event.IncQueryActivationStateEnum
import org.eclipse.incquery.runtime.evm.specific.Jobs
import org.mondo.collaboration.security.lens.relational.ManipulableTemplate
import com.google.common.collect.ImmutableSet
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter
import com.google.common.collect.ImmutableList
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter
import org.eclipse.incquery.runtime.matchers.psystem.PBody
import org.eclipse.incquery.runtime.matchers.psystem.queries.PQuery
import org.mondo.collaboration.security.lens.relational.RelationalRuleSpecification
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall
import org.mondo.collaboration.security.lens.relational.RuleExecutionEnvironment
import org.mondo.collaboration.security.lens.relational.RelationalTransformationSpecification
import org.eclipse.incquery.runtime.api.IPatternMatch
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple
import org.eclipse.incquery.runtime.evm.specific.Rules
import org.eclipse.incquery.runtime.evm.specific.Lifecycles

/**
 * Utilities for constructing precondition queries and actions during the operationalization of relational transformation specifications. 
 * @author Bergmann Gabor
 *
 */
public class OperationalizationExtensions {
	public static val OperationalizationExtensions INSTANCE = new OperationalizationExtensions;
	
	public def createEVMRule(RuleOperationalization ruleOp, IQuerySpecification query, int priority, Iterable<RelationalRuleSpecification.ActionStep>... actions) {
		val transformation = ruleOp.transformation
		val allActions = Iterables::concat(actions)
		val job = Jobs::newStatelessJob(IncQueryActivationStateEnum::APPEARED) [ match |
			// TODO logger
			System::out.println('''*** executing «ruleOp.rule.name» on «match»''')
			val environment = transformation.initRHS(match)
			allActions.forEach[apply(environment)]
		]
		val rule = Rules::newMatcherRuleSpecification(query, Lifecycles::getDefault(false, false), #{job})
		transformation.assignPriority(rule, priority)
		return rule
	}
	public def gatherParameters(Iterable<ManipulableTemplate>... templates) {
		val allTemplates = Iterables::concat(templates)
		val setOfUniqueVariables = ImmutableSet::copyOf(Iterables::concat(allTemplates.map[argumentVariables]))
		makePParameterList(setOfUniqueVariables)
	}
	public def makePParameterList(Iterable<String>... uniqueVariables) {
		ImmutableList.copyOf(Iterables::concat(uniqueVariables).map[new PParameter(it)])
	}
	public def singleBody(PQuery query, Iterable<? extends RelationalRuleSpecification.ConstrainerTemplate>... constrainers) {
		val allConstrainers = Iterables::concat(constrainers)
		val body = new PBody(query)
		
		body.exportedParameters = query.parameters.map[ param | 
			new ExportedParameter(body, body.getOrCreateVariableByName(param.name), param.name)
		]
		
		allConstrainers.forEach[apply(body)]
		
		return #{body}
	}
	public def RelationalRuleSpecification.ConstrainerTemplate positiveCall(IQuerySpecification called) {
		[ body |
			val Object[] arguments = called.parameterNames.map[name | body.getOrCreateVariableByName(name)]
			new PositivePatternCall(body, new FlatTuple(arguments), called.internalQueryRepresentation)
		]
	}
	public def RelationalRuleSpecification.ConstrainerTemplate negativeCall(IQuerySpecification called) {
		[ body |
			val Object[] arguments = called.parameterNames.map[name | body.getOrCreateVariableByName(name)]
			new NegativePatternCall(body, new FlatTuple(arguments), called.internalQueryRepresentation)
		]
	}
	public def initRHS(RelationalTransformationSpecification transformation, IPatternMatch match) {
		new RuleExecutionEnvironment(transformation) => [
			match.parameterNames.forEach[name | variables.put(name, match.get(name))]
		]
	}
}