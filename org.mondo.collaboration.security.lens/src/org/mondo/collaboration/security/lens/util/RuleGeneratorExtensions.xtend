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

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableSet
import com.google.common.collect.Iterables
import java.util.Collections
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
import org.mondo.collaboration.security.lens.context.BaseMondoLensPQuery
import org.mondo.collaboration.security.lens.context.GenericMondoLensQuerySpecification
import org.mondo.collaboration.security.lens.relational.ActionStep
import org.mondo.collaboration.security.lens.relational.QueryTemplate
import org.mondo.collaboration.security.lens.relational.RelationalTransformationSpecification
import org.mondo.collaboration.security.lens.relational.RuleExecutionEnvironment
import org.mondo.collaboration.security.lens.relational.RuleOperationalization
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1
import java.util.Arrays
import com.google.common.collect.Lists

/**
 * Utilities for constructing precondition queries and actions during the operationalization of relational transformation specifications. 
 * @author Bergmann Gabor
 *
 */
public class RuleGeneratorExtensions {
	public static val RuleGeneratorExtensions INSTANCE = new RuleGeneratorExtensions;
	
	// rules
	public def createEVMRule(RuleOperationalization ruleOp, IQuerySpecification query, int priority, Iterable<ActionStep>... actions) {
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
	public def initRHS(RelationalTransformationSpecification transformation, IPatternMatch match) {
		new RuleExecutionEnvironment(transformation) => [
			match.parameterNames.forEach[name | variables.put(name, match.get(name))]
		]
	}

	// queries
	public def composeQuery(String queryFullyQualifiedName, Iterable<? extends QueryTemplate>... templates) {
		new GenericMondoLensQuerySpecification(new BaseMondoLensPQuery(
			queryFullyQualifiedName,
			gatherParameters(templates)
		) {
			override protected doGetContainedBodies() throws QueryInitializationException {
				singleBody(templates)
			}
		})		
	}
	public def gatherParameters(Iterable<? extends QueryTemplate>... templates) {
		val allTemplates = Iterables::concat(templates)
		val setOfUniqueVariables = ImmutableSet::copyOf(Iterables::concat(allTemplates.map[variables]))
		makePParameterList(setOfUniqueVariables)
	}
	public def makePParameterList(Iterable<String>... uniqueVariables) {
		ImmutableList.copyOf(Iterables::concat(uniqueVariables).map[new PParameter(it)])
	}
	public def singleBody(PQuery query, Iterable<? extends Procedure1<PBody>>... constrainers) {
		val allConstrainers = Iterables::concat(constrainers)
		val body = new PBody(query)
		
		body.exportedParameters = query.parameters.map[ param | 
			new ExportedParameter(body, body.getOrCreateVariableByName(param.name), param.name)
		]
		
		allConstrainers.forEach[apply(body)]
		
		return #{body}
	}
	
	// constraints
	public def QueryTemplate positiveCall(IQuerySpecification called, Iterable<String> actualParameterVariables) {
		QueryTemplate::fromConstrainer(called.parameterNames) [ body |
			val Object[] arguments = actualParameterVariables.map[name | body.getOrCreateVariableByName(name)]
			new PositivePatternCall(body, new FlatTuple(arguments), called.internalQueryRepresentation)
		]
	}
	public def QueryTemplate positiveCallKeepNames(IQuerySpecification called) {
		called.positiveCall(called.parameterNames)
	}
	public def QueryTemplate negativeCall(IQuerySpecification called, Iterable<String> actualParameterVariables) {
		QueryTemplate::fromConstrainer(Collections::emptyList) [ body |
			val Object[] arguments = actualParameterVariables.map[name | body.getOrCreateVariableByName(name)]
			new NegativePatternCall(body, new FlatTuple(arguments), called.internalQueryRepresentation)
		]
	}
	public def QueryTemplate negativeCallKeepNames(IQuerySpecification called) {
		called.negativeCall(called.parameterNames)
	}
	
}