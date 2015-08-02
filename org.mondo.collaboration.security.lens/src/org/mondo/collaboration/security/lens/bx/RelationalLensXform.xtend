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

import com.google.common.collect.ImmutableSet
import com.google.common.collect.Iterables
import java.util.Set
import org.eclipse.incquery.runtime.api.IQuerySpecification
import org.eclipse.incquery.runtime.api.IncQueryEngine
import org.eclipse.incquery.runtime.evm.api.Activation
import org.eclipse.incquery.runtime.evm.api.Context
import org.eclipse.incquery.runtime.evm.api.RuleEngine
import org.eclipse.incquery.runtime.evm.api.RuleSpecification
import org.eclipse.incquery.runtime.evm.specific.RuleEngines
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple
import org.eclipse.xtend.lib.annotations.Accessors
import org.mondo.collaboration.security.lens.arbiter.Asset
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter.OperationKind
import org.mondo.collaboration.security.lens.context.MondoLensScope
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey
import org.mondo.collaboration.security.lens.context.keys.EObjectKey
import org.mondo.collaboration.security.lens.context.keys.EObjectReferenceKey
import org.mondo.collaboration.security.lens.context.keys.SecurityJudgementKey
import org.mondo.collaboration.security.lens.relational.ActionStep
import org.mondo.collaboration.security.lens.relational.ManipulableTemplate
import org.mondo.collaboration.security.lens.relational.QueryTemplate
import org.mondo.collaboration.security.lens.relational.RelationalRuleSpecification
import org.mondo.collaboration.security.lens.relational.RelationalTransformationSpecification
import org.mondo.collaboration.security.lens.relational.RuleOperationalization
import org.mondo.collaboration.security.lens.util.RuleGeneratorExtensions
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.RuleType
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.User
import org.mondo.collaboration.security.lens.context.keys.ResourceKey
import org.mondo.collaboration.security.lens.context.keys.ResourceRootContentsKey
import org.mondo.collaboration.security.lens.context.keys.EObjectAttributeKey
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality

/**
 * The lens (bidirectional asymmetric view-update mapping) between a gold model and a front model, 
 * obeying an access control policy.
 * 
 * @author Bergmann Gabor
 *
 */
 
public class RelationalLensXform extends RelationalTransformationSpecification {
	static val coreName = RelationalLensXform.canonicalName
	
	
	@Accessors(PUBLIC_GETTER) User user
	@Accessors(PUBLIC_GETTER) MondoLensScope scope
	
	new(MondoLensScope scope, User user) {
		super(scope.manipulables, scope.queriables)
		this.user = user
		this.scope = scope
		
		addRules
		operationalize
	}
	
	
	override getFullyQualifiedName() {
		'''«coreName».{user='«user.name»'}'''
	}
	
	private Set<RuleOperationalization> ruleOperationalizations
	
	private def operationalize() {
		ruleOperationalizations = ImmutableSet::copyOf(rules.map[operationalize(this)])
	}
	
	public def doGet() {
		fireAllRules(getRuleEngineForGet)		
	}
	public def doPutback() {
		fireAllRules(getRuleEngineForPutback)		
	}
	
	def fireAllRules(RuleEngine engine) {
		val context = Context::create
		var Activation activation = engine.nextActivation
		while (activation != null) { 
			activation.fire(context)
			activation = engine.nextActivation
		}
	}
	
	public def getQueries() {
		ImmutableSet::copyOf(Iterables::concat(ruleOperationalizations.map[queries]))
	}
	
	private RuleEngine ruleEngineForGet
	public def getRuleEngineForGet() {
		if (ruleEngineForGet == null) {
			ruleEngineForGet = createRuleEngine(ruleOperationalizations.map[rulesForGet])
		}
		return ruleEngineForGet
	}
	private RuleEngine ruleEngineForPutback
	public def getRuleEngineForPutback() {
		if (ruleEngineForGet == null) {
			ruleEngineForGet = createRuleEngine(ruleOperationalizations.map[rulesForPutback])
		}
		return ruleEngineForGet
	}
	
	
	private def createRuleEngine(Iterable<Set<RuleSpecification>> rules) {
			val ruleEngine = RuleEngines::createIncQueryRuleEngine(IncQueryEngine::on(scope))
			ruleEngine.conflictResolver = priorityResolver
			Iterables::concat(rules).forEach[rule | ruleEngine.addRule(rule)]
			return ruleEngine
	}
	
	
	def addRules() {
		rules += new RelationalRuleSpecification => [
			name = "resources"
			priority = 10
			gold += new ManipulableTemplate(
				ResourceKey.GOLD, #[varGoldResource, varRelativeURI]
			)
			front += new ManipulableTemplate(
				ResourceKey.FRONT, #[varFrontResource, varRelativeURI]
			)
		]
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
			readAuthorization += checkReadAuthorization(Asset.ObjectAsset, varGoldEObject)
			writeAuthorization += checkWriteAuthorization(Asset.ObjectAsset, varGoldEObject)
		]
		rules += new RelationalRuleSpecification => [
			name = "rootObjects"
			priority = 30
			gold += new ManipulableTemplate(
				ResourceRootContentsKey.GOLD, #[varGoldResource, varGoldEObject]
			)
			condition += new ManipulableTemplate(
				CorrespondenceKey.EOBJECT, #[varGoldEObject, varFrontEObject]
			)
			// TODO resue mapped from earlier rule
			condition += new ManipulableTemplate(
				ResourceKey.GOLD, #[varGoldResource, varRelativeURI]
			)
			condition += new ManipulableTemplate(
				ResourceKey.FRONT, #[varFrontResource, varRelativeURI]
			)
			front += new ManipulableTemplate(
				ResourceRootContentsKey.FRONT, #[varFrontResource, varFrontEObject]
			)
			// TODO reuse
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
			)
			condition += new ManipulableTemplate(
				CorrespondenceKey.EOBJECT, #[varGoldTrg, varFrontTrg]
			)
			front += new ManipulableTemplate(
				EObjectReferenceKey.FRONT, #[varFrontSrc, varEReference, varFrontTrg]
			)
			readAuthorization += checkReadAuthorization(Asset.ReferenceAsset, varGoldSrc, varEReference, varGoldTrg)
			writeAuthorization += checkWriteAuthorization(Asset.ReferenceAsset, varGoldSrc, varEReference, varGoldTrg)
		]
		rules += new RelationalRuleSpecification => [
			name = "attributes"
			priority = 50
			gold += new ManipulableTemplate(
				EObjectAttributeKey.GOLD, #[varGoldEObject, varEAttribute, varGoldValue]
			)
			condition += new ManipulableTemplate(
				CorrespondenceKey.EOBJECT, #[varGoldEObject, varFrontEObject]
			)
			condition += QueryTemplate::fromConstrainer(#[varGoldValue, varFrontValue]) [ body | 
				// TODO add obfuscation, move to security check
				new Equality(body, body.getOrCreateVariableByName(varGoldValue), body.getOrCreateVariableByName(varFrontValue))
			]
			front += new ManipulableTemplate(
				EObjectAttributeKey.FRONT, #[varFrontEObject, varEAttribute, varFrontValue]
			)
			readAuthorization += checkReadAuthorization(Asset.AttributeAsset, varGoldEObject, varEAttribute)
			writeAuthorization += checkWriteAuthorization(Asset.AttributeAsset, varGoldEObject, varEAttribute)
		]
	}
	
	
	def ActionStep checkWriteAuthorization(Class<? extends Asset> assetClass, String... assetVariables) {
		return [
			val Object[] valueArray = Iterables::concat(assetVariables.map[name | variables.get(name)], #[user, RuleType::DENY])
			val seed = new FlatTuple(valueArray)
			val secRelation = getQueriable(new SecurityJudgementKey(OperationKind.WRITE, assetClass))
			val denyJudgements = secRelation.getTuplesForSeed(seed)
			if (! denyJudgements.isEmpty) {
				throw new RuntimeException('''No write authorization to «assetClass.simpleName» for «seed»''');
			}
		]
	}
	def QueryTemplate checkReadAuthorization(Class<? extends Asset> assetClass, String... assetVariables) {
		negativeCall(assetClass.readDeniedHelperPattern(assetVariables))
	}
	// TODO cache
	def IQuerySpecification readDeniedHelperPattern(Class<? extends Asset> assetClass, String... assetVariables) {
		composeQuery('''«fullyQualifiedName».readDenied.«assetClass.simpleName»''', 
			#[QueryTemplate::fromConstrainer(assetVariables)[ body |
				val Object[] variableArray = Iterables::concat(assetVariables, #[varUser, varJudgement]).map[body.getOrCreateVariableByName(it)]
				new TypeConstraint(body, 
					new FlatTuple(variableArray), 
					new SecurityJudgementKey(OperationKind.READ, assetClass)
				)
				new ConstantValue(body, body.getOrCreateVariableByName(varUser), user)			
				new ConstantValue(body, body.getOrCreateVariableByName(varJudgement), RuleType::DENY)
			]]
		)
	}
//		return new GenericMondoLensQuerySpecification(new BaseMondoLensPQuery(
//			'''«fullyQualifiedName».readDenied.«assetClass.simpleName»''',
//			makePParameterList(assetVariables) //, #[varUser])
//		) {
//			override protected doGetContainedBodies() throws QueryInitializationException {
//				singleBody(#{[ body |
//					val Object[] variableArray = Iterables::concat(assetVariables, #[varUser, varJudgement]).map[body.getOrCreateVariableByName(it)]
//					new TypeConstraint(body, 
//						new FlatTuple(variableArray), 
//						new SecurityJudgementKey(OperationKind.READ, assetClass)
//					)
//					new ConstantValue(body, body.getOrCreateVariableByName(varUser), user)			
//					new ConstantValue(body, body.getOrCreateVariableByName(varJudgement), RuleType::DENY)
//				]})
//			}
//		})
//	}
//	// static queries shared by all lens instances
//	val readDeniedQueries = #{
//		Asset.ObjectAsset -> Asset.ObjectAsset.readDeniedHelperPattern(varGoldEObject),
//		Asset.ReferenceAsset -> Asset.ReferenceAsset.readDeniedHelperPattern(varGoldSrc, varEReference, varGoldTrg),
//		Asset.AttributeAsset -> Asset.AttributeAsset.readDeniedHelperPattern(varGoldEObject, varEAttribute)
//	}
	
	extension RuleGeneratorExtensions extendUtil = RuleGeneratorExtensions::INSTANCE
	
	
	static val varGoldResource = "goldResource"
	static val varFrontResource = "frontResource"
	static val varRelativeURI = "relativeURI"
	
	static val varGoldEObject = "goldEObject"
	static val varFrontEObject = "frontEObject"
	static val varEClass = "eClass"
	
	static val varGoldSrc = "goldSrc"
	static val varGoldTrg = "goldTrg"
	static val varFrontSrc = "frontSrc"
	static val varFrontTrg = "frontTrg"
	static val varEReference = "eReference"
	
	static val varEAttribute = "eAttribute"
	static val varGoldValue = "goldValue"
	static val varFrontValue = "frontValue"
	
	static val varUser = "user"
	static val varJudgement = "judgement"
	
	
		
}
