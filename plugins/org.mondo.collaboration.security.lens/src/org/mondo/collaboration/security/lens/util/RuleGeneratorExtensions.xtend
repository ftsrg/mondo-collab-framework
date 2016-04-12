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

import com.google.common.base.Preconditions
import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableSet
import com.google.common.collect.Iterables
import com.google.common.collect.Lists
import com.google.common.collect.Maps
import com.google.common.collect.Sets
import java.util.Arrays
import java.util.Collections
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.incquery.runtime.api.IPatternMatch
import org.eclipse.incquery.runtime.api.IQuerySpecification
import org.eclipse.incquery.runtime.evm.specific.Jobs
import org.eclipse.incquery.runtime.evm.specific.Lifecycles
import org.eclipse.incquery.runtime.evm.specific.Rules
import org.eclipse.incquery.runtime.evm.specific.event.IncQueryActivationStateEnum
import org.eclipse.incquery.runtime.matchers.context.IInputKey
import org.eclipse.incquery.runtime.matchers.psystem.PBody
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter
import org.eclipse.incquery.runtime.matchers.psystem.queries.PQuery
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1
import org.mondo.collaboration.security.lens.context.BaseMondoLensPQuery
import org.mondo.collaboration.security.lens.context.GenericMondoLensQuerySpecification
import org.mondo.collaboration.security.lens.relational.ActionStep
import org.mondo.collaboration.security.lens.relational.ManipulableTemplate
import org.mondo.collaboration.security.lens.relational.QueryTemplate
import org.mondo.collaboration.security.lens.relational.RelationalTransformationSpecification
import org.mondo.collaboration.security.lens.relational.RuleExecutionEnvironment
import org.mondo.collaboration.security.lens.relational.RuleOperationalization
import org.apache.log4j.Logger
import org.eclipse.incquery.runtime.evm.api.Job
import org.eclipse.incquery.runtime.evm.api.Activation
import org.eclipse.incquery.runtime.evm.api.Context
import org.eclipse.incquery.runtime.api.IncQueryMatcher
import org.mondo.collaboration.security.lens.bx.LensTransformationExecution
import org.mondo.collaboration.security.lens.bx.AbortReason.RuntimeExceptionAbort
import org.eclipse.xtext.xbase.lib.Functions.Function1

/**
 * Utilities for constructing precondition queries and actions during the operationalization of relational transformation specifications. 
 * @author Bergmann Gabor
 *
 */
public class RuleGeneratorExtensions {
	public static val RuleGeneratorExtensions INSTANCE = new RuleGeneratorExtensions;
	
	// rules
	public def <Match extends IPatternMatch> createEVMRule(
		RuleOperationalization ruleOp, 
		IQuerySpecification<? extends IncQueryMatcher<Match>> query, 
		int priority, 
		Iterable<ActionStep>... actions
	) {
		val transformation = ruleOp.transformation
		val allActions = Iterables::concat(actions)
		val Job<Match> job = new Job<Match>(IncQueryActivationStateEnum::APPEARED) {
			
			override protected execute(Activation<? extends Match> activation, Context context) {
				val match = activation.atom
				val LensTransformationExecution trExecution = context.get(LensTransformationExecution.name) as LensTransformationExecution
				
				if (trExecution.logger.isDebugEnabled) {
					trExecution.logger.debug('''*** executing «ruleOp.rule.name» on «match»''')
				}
				val environment = trExecution.initRHS(match)
				for (currentAction: allActions) {
					currentAction.apply(environment)
					if (trExecution.aborted) return;
				}
			}
			
			override protected handleError(Activation<? extends Match> activation, Exception exception, Context context) {
				val match = activation.atom
				val LensTransformationExecution trExecution = context.get(LensTransformationExecution.name) as LensTransformationExecution
				val runtimeException = 
					if (exception instanceof RuntimeException) 
						exception 
					else // can this happen at all?
						new RuntimeException(exception)
				trExecution.abort(new RuntimeExceptionAbort(runtimeException, match))
			}
		}
		val rule = Rules::<Match>newMatcherRuleSpecification(query, Lifecycles::getDefault(false, false), #{job})
		transformation.assignPriority(rule, priority)
		return rule
	}
	public def initRHS(LensTransformationExecution trExecution, IPatternMatch match) {
		new RuleExecutionEnvironment(trExecution) => [
			match.parameterNames.forEach[name | variables.put(name, match.get(name))]
		]
	}

	// queries
	public def composeQuery(String queryFullyQualifiedName, Iterable<? extends QueryTemplate>... conjunctiveTemplates) {
		val allTemplates = Iterables::concat(conjunctiveTemplates)
		composeParametrizableQuery(queryFullyQualifiedName, gatherParameters(allTemplates)) [
			#{singleBody(allTemplates)}
		]
	}
	public def composeDisjunctiveQuery(String queryFullyQualifiedName, Iterable<? extends QueryTemplate>... disjunctiveTemplates) {
		composeParametrizableQuery(queryFullyQualifiedName, gatherParameters(disjunctiveTemplates)) [
			ImmutableSet.copyOf(disjunctiveTemplates.map[template | singleBody(template)])
		]
	}
	public def composeParametrizableQuery(String queryFullyQualifiedName, Iterable<String> uniqueParameterVariables, Function1<PQuery, Set<PBody>> bodiesTemplate) {
		new GenericMondoLensQuerySpecification(new BaseMondoLensPQuery(
			queryFullyQualifiedName,
			makePParameterList(uniqueParameterVariables)
		) {
			override protected doGetContainedBodies() throws QueryInitializationException {
				bodiesTemplate.apply(this)
			}
		})		
	}
	public def gatherParameters(Iterable<? extends QueryTemplate>... disjunctiveTemplates) {
		val setOfUniqueVariablesPerBody = disjunctiveTemplates.map[bodyTemplates | ImmutableSet::copyOf(Iterables::concat(bodyTemplates.map[deducedVariables])) as Set<String>]
		val commonVariables = setOfUniqueVariablesPerBody.reduce [ x, y | Sets::intersection(x,y)]
		commonVariables
	}
	public def makePParameterList(Iterable<String> uniqueVariables) {
		ImmutableList.copyOf(uniqueVariables.map[new PParameter(it)])
	}
	public def singleBody(PQuery query, Iterable<? extends Procedure1<PBody>> constrainers) {
		val body = new PBody(query)
		
		body.exportedParameters = query.parameters.map[ param | 
			new ExportedParameter(body, body.getOrCreateVariableByName(param.name), param.name)
		]
		
		constrainers.forEach[apply(body)]
		
		return body
	}
	
	// constraints
	public def QueryTemplate typeConstraint(IInputKey key, Iterable<String> variableNames) {
		new ManipulableTemplate(key, variableNames.toList)
	}
	
	
	private def QueryTemplate positiveCall(PQuery called, Iterable<String> actualParameterVariables) {
		QueryTemplate::fromConstrainer(actualParameterVariables) [ body |
			val Object[] arguments = actualParameterVariables.map[name | body.getOrCreateVariableByName(name)]
			new PositivePatternCall(body, new FlatTuple(arguments), called)
		]
	}
	private def QueryTemplate positiveCall(PQuery called, Map<String, String> parameterSubstitutions) {
		called.positiveCall(substituteParameters(called, parameterSubstitutions))
	}
	
	public def QueryTemplate positiveCall(IQuerySpecification called, Map<String, String> parameterSubstitutions) {
		called.internalQueryRepresentation.positiveCall(parameterSubstitutions)
	}
	public def QueryTemplate positiveRecursiveCall(Map<String, String> parameterSubstitutions) {
		QueryTemplate::fromConstrainer(parameterSubstitutions.values.toList) [ body |
			body.pattern.positiveCall(parameterSubstitutions).apply(body)
		]
	}
	public def QueryTemplate positiveCallKeepNames(IQuerySpecification called) {
		called.internalQueryRepresentation.positiveCall(called.internalQueryRepresentation.parameterNamesSafe)
	}
	
	private def QueryTemplate negativeCall(PQuery called, Iterable<String> actualParameterVariables) {
		QueryTemplate::fromConstrainer(Collections::emptyList) [ body |
			val Object[] arguments = actualParameterVariables.map[name | body.getOrCreateVariableByName(name)]
			new NegativePatternCall(body, new FlatTuple(arguments), called)
		]
	}
	public def QueryTemplate negativeCall(IQuerySpecification called, Iterable<String> actualParameterVariables) {
		called.internalQueryRepresentation.negativeCall(actualParameterVariables)
	}
	public def QueryTemplate negativeCall(IQuerySpecification called, Map<String, String> parameterSubstitutions) {
		val pQuery = called.internalQueryRepresentation
		pQuery.negativeCall(substituteParameters(pQuery, parameterSubstitutions))
	}
	public def QueryTemplate negativeCallKeepNames(IQuerySpecification called) {
		called.negativeCall(called.internalQueryRepresentation.parameterNamesSafe)
	}
	
	private def substituteParameters(PQuery calledQuery, Map<String, String> parameterSubstitutions) {
		val substitutionsCorrect = ImmutableSet::copyOf(calledQuery.parameterNamesSafe).equals(parameterSubstitutions.keySet)
		if(!substitutionsCorrect) {
			throw new IllegalArgumentException(
				'''Parameters of query «calledQuery.fullyQualifiedName» are [«calledQuery.parameterNamesSafe.join(", ")»], ''' +
				'''but called with substitutions {«parameterSubstitutions.entrySet.map['''«key» -> «value»'''].join(", ")»}.'''
			)
		}
		calledQuery.parameterNamesSafe.map[parameterSubstitutions.get(it)]
	}
	
	private def parameterNamesSafe(PQuery calledQuery) {
		calledQuery.parameters.map[param | (param as PParameter).name]
	}
	
}