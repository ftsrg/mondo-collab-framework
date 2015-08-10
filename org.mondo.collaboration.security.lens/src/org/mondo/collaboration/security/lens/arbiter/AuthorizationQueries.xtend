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

package org.mondo.collaboration.security.lens.arbiter

import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.User
import org.eclipse.xtend.lib.annotations.Data
import org.mondo.collaboration.security.lens.util.RuleGeneratorExtensions
import org.eclipse.incquery.runtime.api.IQuerySpecification
import org.mondo.collaboration.security.lens.relational.QueryTemplate
import com.google.common.collect.Iterables
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple
import org.mondo.collaboration.security.lens.context.keys.SecurityJudgementKey
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter.OperationKind
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.RuleType
import org.mondo.collaboration.security.lens.arbiter.Asset.ObjectAsset
import org.mondo.collaboration.security.lens.arbiter.Asset.ReferenceAsset
import org.mondo.collaboration.security.lens.arbiter.Asset.AttributeAsset
import java.util.EnumMap
import com.google.common.collect.ImmutableMap
import java.util.Map
import com.google.common.collect.Maps
import com.google.common.collect.ImmutableSet
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Collections
import org.mondo.collaboration.security.lens.context.keys.EObjectReferenceKey
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider
import java.util.List
import org.eclipse.emf.ecore.EReference

/**
 * Queries for security checks.
 * @author Bergmann Gabor
 *
 */
 @Data
class AuthorizationQueries {
	User user
	
	val String fullyQualifiedName = 
		'''«AuthorizationQueries.canonicalName».{user='«user.name»'}'''
		
	
	@Accessors(PUBLIC_GETTER) 
	val Map<Class<? extends Asset>, Map<OperationKind, IQuerySpecification>> explicitDenialQuery = #{
		prepareExplicitlyDeniedHelperPatterns(ObjectAsset, varEObject),
		prepareExplicitlyDeniedHelperPatterns(ReferenceAsset, varSrc, varEReference, varTrg),
		prepareExplicitlyDeniedHelperPatterns(AttributeAsset, varEObject, varEAttribute)
	}
		
	
	def goldContainmentReference(List<String> variableNames) {
		QueryTemplate::fromConstrainer(variableNames) [ body |
			typeConstraint(EObjectReferenceKey.GOLD, variableNames).apply(body)
			
			val referenceVariableName = variableNames.get(1)
			new ExpressionEvaluation(body, new IExpressionEvaluator(){
				override evaluateExpression(IValueProvider provider) throws Exception {
					val feature = provider.getValue(referenceVariableName)
					if (feature instanceof EReference) {
						return feature.isContainment
					} else return false;
				}
				override getInputParameterNames() {
					#[referenceVariableName]
				}
				override getShortDescription() {
					'''Check that «referenceVariableName» is a containment reference'''
				}
			}, null)
		]
	}
	 	
	val IQuerySpecification effectivelyInvisibleObject = 
		composeDisjunctiveQuery('''«fullyQualifiedName».«OperationKind::READ».effectivelyDenied.«ObjectAsset.simpleName»''',
			#[
				explicitDenialQuery.get(ObjectAsset).get(OperationKind::READ)
					.positiveCall(#{varEObject -> varEObject})
			],#[
				explicitDenialQuery.get(ReferenceAsset).get(OperationKind::READ)
					.positiveCall(#{varSrc -> varContainer, varEReference -> varEReference, varTrg -> varEObject}),
				goldContainmentReference(#[varContainer, varEReference, varEObject])
			],#[
				positiveRecursiveCall(#{varEObject -> varContainer}),
				goldContainmentReference(#[varContainer, varEReference, varEObject])
			]
		)	
		
	@Accessors(PUBLIC_GETTER) 
	val Map<Class<? extends Asset>, Map<OperationKind, IQuerySpecification>> effectivelyDeniedQuery = #{
		ObjectAsset -> #{
			OperationKind::READ -> effectivelyInvisibleObject,
			OperationKind::WRITE -> composeDisjunctiveQuery('''«fullyQualifiedName».«OperationKind::WRITE».effectivelyDenied.«ObjectAsset.simpleName»''',
				#[
					explicitDenialQuery.get(ObjectAsset).get(OperationKind::WRITE).positiveCall(#{varEObject -> varEObject})
				],#[
					effectivelyInvisibleObject.positiveCallKeepNames
				]
			)
		}
	}
		
		
	private def Pair<Class<? extends Asset>, Map<OperationKind, IQuerySpecification>> prepareExplicitlyDeniedHelperPatterns(Class<? extends Asset> assetClass, String... assetVariables) {
		assetClass -> Collections::unmodifiableMap(Maps::asMap(ImmutableSet::copyOf(OperationKind.values)) [prepareExplicitlyDeniedHelperPattern(assetClass, assetVariables)])
	}
	
	private def IQuerySpecification prepareExplicitlyDeniedHelperPattern(OperationKind op, Class<? extends Asset> assetClass, String... assetVariables) {
		composeQuery('''«fullyQualifiedName».«op».explicitlyDenied.«assetClass.simpleName»''', 
			#[QueryTemplate::fromConstrainer(assetVariables)[ body |
				typeConstraint(new SecurityJudgementKey(op, assetClass), Iterables::concat(assetVariables, #[varUser, varJudgement])).apply(body)
				new ConstantValue(body, body.getOrCreateVariableByName(varUser), user)			
				new ConstantValue(body, body.getOrCreateVariableByName(varJudgement), RuleType::DENY)
			]]
		)
	}
	
	extension RuleGeneratorExtensions extendUtil = RuleGeneratorExtensions::INSTANCE

	public static val varEObject = "eObject"
	public static val varSrc = "src"
	public static val varTrg = "trg"
	public static val varContainer = "container"
	
	public static val varJudgement = "judgement"
	public static val varUser = "user"
	
	public static val varEReference = "eReference"
	public static val varEAttribute = "eAttribute"
}