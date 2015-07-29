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

package org.mondo.collaboration.security.lens.bx

import com.google.common.collect.Iterables
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple
import org.eclipse.xtend.lib.annotations.Accessors
import org.mondo.collaboration.security.lens.arbiter.Asset
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter.OperationKind
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey
import org.mondo.collaboration.security.lens.context.keys.EObjectKey
import org.mondo.collaboration.security.lens.context.keys.EObjectReferenceKey
import org.mondo.collaboration.security.lens.context.keys.SecurityJudgementKey
import org.mondo.collaboration.security.lens.relational.ManipulableTemplate
import org.mondo.collaboration.security.lens.relational.RelationalRuleSpecification
import org.mondo.collaboration.security.lens.relational.RelationalTransformationSpecification
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.RuleType
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.User

/**
 * @author Bergmann Gabor
 *
 */
 @Accessors(PUBLIC_GETTER)
class RelationalLensXform extends RelationalTransformationSpecification {
	User user
	new (User user) {
		this.user = user
		addRules
	}
	
	override getFullyQualifiedName() {
		'''«this.class.canonicalName».{«user.name»}'''
	}
	
	def addRules() {
		rules += new RelationalRuleSpecification => [
			name = "objects"
			priority = 20
			gold += new ManipulableTemplate(
				EObjectKey.GOLD, #[varGoldEObject, varEClass]
			)
			correspondence += new ManipulableTemplate(
				CorrespondenceKey.EOBJECT, #[varGoldEObject, varFrontEObject]
			)
			front += new ManipulableTemplate(
				EObjectKey.FRONT, #[varFrontEObject, varEClass]
			)
			// TODO neg find ::DENY
			readAuthorization += checkReadAuthorization(Asset.ObjectAsset, varGoldEObject)
			writeAuthorization += checkWriteAuthorization(Asset.ObjectAsset, varGoldEObject)
		]
		rules += new RelationalRuleSpecification => [
			name = "references"
			priority = 40
			gold += new ManipulableTemplate(
				EObjectReferenceKey.GOLD, #[varGoldSrc, varEReference, varGoldTrg]
			)
			condition += new ManipulableTemplate(
				CorrespondenceKey.EOBJECT, #[varGoldSrc, varFrontSrc]
			).asConstrainer
			condition += new ManipulableTemplate(
				CorrespondenceKey.EOBJECT, #[varGoldTrg, varFrontTrg]
			).asConstrainer
			front += new ManipulableTemplate(
				EObjectReferenceKey.FRONT, #[varFrontSrc, varEReference, varFrontTrg]
			)
			// TODO neg find ::DENY
			readAuthorization += checkReadAuthorization(Asset.ReferenceAsset, varGoldSrc, varEReference, varGoldTrg)
			writeAuthorization += checkWriteAuthorization(Asset.ReferenceAsset, varGoldSrc, varEReference, varGoldTrg)
		]
	}
	
	
	def RelationalRuleSpecification.ConstrainerTemplate checkReadAuthorization(Class<? extends Asset> assetClass, String... assetVariables) {
		return [ body |
			val Object[] valueArray = Iterables::concat(assetVariables, #[varUser, varJudgement]).map[body.getOrCreateVariableByName(it)]
			new TypeConstraint(body, 
				new FlatTuple(valueArray), 
				new SecurityJudgementKey(OperationKind.READ, assetClass)
			)
			new ConstantValue(body, body.getOrCreateVariableByName(varUser), user)			
			new ConstantValue(body, body.getOrCreateVariableByName(varJudgement), RuleType::PERMIT)
		]
	}
	def RelationalRuleSpecification.ActionStep checkWriteAuthorization(Class<? extends Asset> assetClass, String... assetVariables) {
		return [
			val Object[] valueArray = Iterables::concat(assetVariables.map[name | variables.get(name)], #[user, RuleType::DENY])
			val seed = new FlatTuple(valueArray)
			val secRelation = queryables.get(new SecurityJudgementKey(OperationKind.WRITE, assetClass))
			val denyJudgements = secRelation.getTuplesForSeed(seed)
			if (! denyJudgements.isEmpty) {
				throw new RuntimeException('''No write authorization to «assetClass.simpleName» for «seed»''');
			}
		]
	}
	
	static val varGoldEObject = "goldEObject"
	static val varFrontEObject = "frontEObject"
	static val varEClass = "eClass"
	static val varUser = "user"
	static val varJudgement = "judgement"
	
	static val varGoldSrc = "goldSrc"
	static val varGoldTrg = "goldTrg"
	static val varFrontSrc = "frontSrc"
	static val varFrontTrg = "frontTrg"
	static val varEReference = "eReference"
	
}
