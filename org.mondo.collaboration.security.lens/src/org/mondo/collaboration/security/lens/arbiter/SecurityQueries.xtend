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

/**
 * Queries for security checks.
 * @author Bergmann Gabor
 *
 */
 @Data
class SecurityQueries {
	User user
	
	val String fullyQualifiedName = 
		'''«SecurityQueries.canonicalName».{user='«user.name»'}'''
	
	
	@Accessors(PUBLIC_GETTER) 
	val Map<Class<? extends Asset>, Map<OperationKind, IQuerySpecification>> explicitDenialQuery = #{
		prepareExplicitlyDeniedHelperPatterns(ObjectAsset, varGoldEObject),
		prepareExplicitlyDeniedHelperPatterns(ReferenceAsset, varGoldSrc, varEReference, varGoldTrg),
		prepareExplicitlyDeniedHelperPatterns(AttributeAsset, varGoldEObject, varEAttribute)
	}
		
	private def Pair<Class<? extends Asset>, Map<OperationKind, IQuerySpecification>> prepareExplicitlyDeniedHelperPatterns(Class<? extends Asset> assetClass, String... assetVariables) {
		assetClass -> Collections::unmodifiableMap(Maps::asMap(ImmutableSet::copyOf(OperationKind.values)) [prepareExplicitlyDeniedHelperPattern(assetClass, assetVariables)])
	}
	
	private def IQuerySpecification prepareExplicitlyDeniedHelperPattern(OperationKind op, Class<? extends Asset> assetClass, String... assetVariables) {
		composeQuery('''«fullyQualifiedName».«op».explcitlyDenied.«assetClass.simpleName»''', 
			#[QueryTemplate::fromConstrainer(assetVariables)[ body |
				val Object[] variableArray = Iterables::concat(assetVariables, #[varUser, varJudgement]).map[body.getOrCreateVariableByName(it)]
				new TypeConstraint(body, 
					new FlatTuple(variableArray), 
					new SecurityJudgementKey(op, assetClass)
				)
				new ConstantValue(body, body.getOrCreateVariableByName(varUser), user)			
				new ConstantValue(body, body.getOrCreateVariableByName(varJudgement), RuleType::DENY)
			]]
		)
	}
	
	extension RuleGeneratorExtensions extendUtil = RuleGeneratorExtensions::INSTANCE

	static val varGoldEObject = "goldEObject"
	static val varGoldSrc = "goldSrc"
	static val varGoldTrg = "goldTrg"
	
	static val varUser = "user"
	static val varJudgement = "judgement"
	
	static val varEReference = "eReference"
	static val varEAttribute = "eAttribute"
}