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
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.incquery.runtime.api.IncQueryEngine
import org.eclipse.incquery.runtime.evm.api.Activation
import org.eclipse.incquery.runtime.evm.api.Context
import org.eclipse.incquery.runtime.evm.api.RuleEngine
import org.eclipse.incquery.runtime.evm.api.RuleSpecification
import org.eclipse.incquery.runtime.evm.specific.RuleEngines
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple
import org.eclipse.viatra.modelobfuscator.api.DataTypeObfuscator
import org.eclipse.xtend.lib.annotations.Accessors
import org.mondo.collaboration.security.lens.arbiter.Asset
import org.mondo.collaboration.security.lens.arbiter.AuthorizationQueries
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter.OperationKind
import org.mondo.collaboration.security.lens.context.MondoLensScope
import org.mondo.collaboration.security.lens.context.keys.CollabLensModelInputKey
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey
import org.mondo.collaboration.security.lens.context.keys.WhichModel
import org.mondo.collaboration.security.lens.emf.ModelFactInputKey
import org.mondo.collaboration.security.lens.relational.ActionStep
import org.mondo.collaboration.security.lens.relational.ManipulableTemplate
import org.mondo.collaboration.security.lens.relational.QueryTemplate
import org.mondo.collaboration.security.lens.relational.RelationalRuleSpecification
import org.mondo.collaboration.security.lens.relational.RelationalTransformationSpecification
import org.mondo.collaboration.security.lens.relational.RuleOperationalization
import org.mondo.collaboration.security.lens.util.RuleGeneratorExtensions
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.User
import org.eclipse.xtend.lib.annotations.Data

import static org.mondo.collaboration.security.lens.context.keys.WhichModel.*
import static org.mondo.collaboration.security.lens.emf.ModelFactInputKey.*
import org.eclipse.incquery.runtime.api.IPatternMatch
import org.apache.log4j.Logger
import org.mondo.collaboration.security.lens.bx.AbortReason.DenialReason
import org.mondo.collaboration.security.lens.bx.LensTransformationExecution.UndoableManipulationAction
import org.mondo.collaboration.security.lens.bx.AbortReason.WriteAuthorizationDenial
import org.mondo.collaboration.security.lens.arbiter.LockArbiter
import org.mondo.collaboration.security.lens.bx.AbortReason.LockViolationDenial
import org.mondo.collaboration.security.lens.arbiter.LockArbiter.LockMonitoringSession
import org.mondo.collaboration.security.lens.arbiter.Asset.ReferenceAsset
import org.eclipse.incquery.runtime.api.AdvancedIncQueryEngine

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
	@Accessors(PUBLIC_GETTER) DataTypeObfuscator<String> stringObfuscator

	@Accessors(PUBLIC_GETTER) AuthorizationQueries authorizationQueries
	AdvancedIncQueryEngine engine
	
	new(MondoLensScope scope, User user, DataTypeObfuscator<String> stringObfuscator) {
		super(scope.manipulables, scope.queriables)
		this.user = user
		this.scope = scope
		this.stringObfuscator = stringObfuscator
		
		this.engine = AdvancedIncQueryEngine.createUnmanagedEngine(scope)
		this.authorizationQueries = scope.arbiter.instantiateAuthorizationQuerySpecificationsForUser(user)

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
	
	private long nextTransformationSequenceID = 0; 
	
	public def doGet() {
		val trExec = new LensTransformationExecution(this, '''GET.«nextTransformationSequenceID++»''')
		fireAllRules(getRuleEngineForGet, trExec)	
		trExec	
	}
	public def doPutback(boolean rollbackGoldIfDenied) {
		val trExec = new LensTransformationExecution(this, '''PUTBACK.«nextTransformationSequenceID++»''')
		
		val LockArbiter.LockMonitoringSession lockSession =	scope.lockArbiter.openSession(user.name)
		try {
			fireAllRules(getRuleEngineForPutback, trExec)		
			
			if (trExec.abortReason == null) {
				val violation = lockSession.anyLockViolation
				if (violation != null) {
					trExec.abort(new LockViolationDenial(user.name, violation.key, violation.value))
				}
			}
		} finally {
			lockSession.close();
		}
		
		if (rollbackGoldIfDenied && trExec.abortReason instanceof DenialReason) {
			val undoStack = trExec.undoStack
			
			if (trExec.logger.isDebugEnabled) {
				trExec.logger.debug('''Attempting to undo «undoStack.size» operations after PUTBACK «trExec.executionSequenceID» aborted''')
			}
			
			var UndoableManipulationAction toBeUndone;
			while ({toBeUndone = undoStack.pollLast; toBeUndone!= null}) {
				val manipulable = getManipulable(toBeUndone.manipulableKey)
				val updateTuple = toBeUndone.updateTuple
				if (toBeUndone.insertion) // do the opposite 
					manipulable.retractTuple(updateTuple) 
				else 
					manipulable.assertTuple(updateTuple)				
			}
		}
		
		trExec
	}
	
	def fireAllRules(RuleEngine engine, LensTransformationExecution trExec) {
		val context = Context::create
		context.put(LensTransformationExecution.name, trExec)
		
		var Activation activation = engine.nextActivation
		while (!(trExec.isAborted) && activation != null) { 
			activation.fire(context)
			activation = engine.nextActivation
		}
	}
	
	public def getQueries() {
		ImmutableSet::copyOf(Iterables::concat(authorizationQueries.allQueries, Iterables::concat(ruleOperationalizations.map[queries])))
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
		if (ruleEngineForPutback == null) {
			ruleEngineForPutback = createRuleEngine(ruleOperationalizations.map[rulesForPutback])
		}
		return ruleEngineForPutback
	}
	
	
	private def createRuleEngine(Iterable<Set<RuleSpecification>> rules) {
			val ruleEngine = RuleEngines::createIncQueryRuleEngine(getIncQueryEngine())
			ruleEngine.conflictResolver = priorityResolver
			Iterables::concat(rules).forEach[rule | ruleEngine.addRule(rule)]
			return ruleEngine
	}
	
	

	def getIncQueryEngine() {
		engine
	}
	
	private def inModel(ModelFactInputKey inputkey, WhichModel model) {
		new CollabLensModelInputKey(inputkey, model)
	}

	def addRules() {
		rules += new RelationalRuleSpecification => [
			name = "resources"
			priority = 10
			gold += new ManipulableTemplate(
				RESOURCE_KEY.inModel(GOLD), #[varGoldResource, varRelativeURI]
			)
			front += new ManipulableTemplate(
				RESOURCE_KEY.inModel(FRONT), #[varFrontResource, varRelativeURI]
			)
		]
		rules += new RelationalRuleSpecification => [
			name = "objects"
			priority = 20
			gold += new ManipulableTemplate(
				EOBJECT_KEY.inModel(GOLD), #[varGoldEObject, varEClass]
			)
			correspondence += new ManipulableTemplate(
				CorrespondenceKey.EOBJECT, #[varGoldEObject, varFrontEObject]
			)
			front += new ManipulableTemplate(
				EOBJECT_KEY.inModel(FRONT), #[varFrontEObject, varEClass]
			)
			readAuthorization += checkReadAuthorization(Asset.ObjectAsset, varGoldEObject)
			writeAuthorization += checkWriteAuthorization(Asset.ObjectAsset, varGoldEObject)
		]
		rules += new RelationalRuleSpecification => [
			name = "rootObjects"
			priority = 30
			gold += new ManipulableTemplate(
				RESOURCE_ROOT_CONTENTS_KEY.inModel(GOLD), #[varGoldResource, varGoldEObject]
			)
			mappingCondition += new ManipulableTemplate(
				CorrespondenceKey.EOBJECT, #[varGoldEObject, varFrontEObject]
			)
			// TODO resue mapped from earlier rule
			mappingCondition += new ManipulableTemplate(
				RESOURCE_KEY.inModel(GOLD), #[varGoldResource, varRelativeURI]
			)
			mappingCondition += new ManipulableTemplate(
				RESOURCE_KEY.inModel(FRONT), #[varFrontResource, varRelativeURI]
			)
			front += new ManipulableTemplate(
				RESOURCE_ROOT_CONTENTS_KEY.inModel(FRONT), #[varFrontResource, varFrontEObject]
			)
			// TODO reuse
			readAuthorization += checkReadAuthorization(Asset.ObjectAsset, varGoldEObject)
			writeAuthorization += checkWriteAuthorization(Asset.ObjectAsset, varGoldEObject)
		]
		rules += new RelationalRuleSpecification => [
			name = "references"
			priority = 40
			gold += new ManipulableTemplate(
				REFERENCE_KEY.inModel(GOLD), #[varGoldSrc, varEReference, varGoldTrg]
			)
			mappingCondition += new ManipulableTemplate(
				CorrespondenceKey.EOBJECT, #[varGoldSrc, varFrontSrc]
			)
			mappingCondition += new ManipulableTemplate(
				CorrespondenceKey.EOBJECT, #[varGoldTrg, varFrontTrg]
			)
			front += new ManipulableTemplate(
				REFERENCE_KEY.inModel(FRONT), #[varFrontSrc, varEReference, varFrontTrg]
			)
			readAuthorization += checkReadAuthorization(Asset.ReferenceAsset, varGoldSrc, varEReference, varGoldTrg)
			writeAuthorization += checkWriteAuthorization(Asset.ReferenceAsset, varGoldSrc, varEReference, varGoldTrg)
			additivePreAuthorization += preAuthorizeReferenceAddition()
		]
		rules += new RelationalRuleSpecification => [
			name = "attributes"
			priority = 50
			gold += new ManipulableTemplate(
				ATTRIBUTE_KEY.inModel(GOLD), #[varGoldEObject, varEAttribute, varGoldValue]
			)
			mappingCondition += new ManipulableTemplate(
				CorrespondenceKey.EOBJECT, #[varGoldEObject, varFrontEObject]
			)
			mappingCondition += QueryTemplate::fromConstrainer(#[varGoldValue, varFrontValue]) [ body | 
//				new Equality(body, body.getOrCreateVariableByName(varGoldValue), body.getOrCreateVariableByName(varFrontValue))
				new PatternMatchCounter(body, 
					new FlatTuple(body.getOrCreateVariableByName(varGoldEObject), body.getOrCreateVariableByName(varEAttribute)), 
					authorizationQueries.effectivelyObfuscatedAttribute.internalQueryRepresentation, 
					body.getOrCreateVariableByName(varIsObfuscated)
				) 
				new ExpressionEvaluation(body, new IExpressionEvaluator(){
					override evaluateExpression(IValueProvider provider) throws Exception {
						val feature = provider.getValue(varEAttribute)
						val isObfuscated = provider.getValue(varIsObfuscated)
						val goldValue = provider.getValue(varGoldValue)
						
						if (feature instanceof EAttribute && isObfuscated instanceof Number) {
							if (1 == (isObfuscated as Number).intValue && goldValue instanceof String)
								return stringObfuscator.obfuscateData(goldValue as String)
							else 
								return goldValue
						} else {
							return null
						}
					}
					override getInputParameterNames() {
						#[varEAttribute, varIsObfuscated, varGoldValue]
					}
					override getShortDescription() {
						'''Obfuscates gold value into front value'''
					}
				}, body.getOrCreateVariableByName(varFrontValue))
				new ExpressionEvaluation(body, new IExpressionEvaluator(){
					override evaluateExpression(IValueProvider provider) throws Exception {
						val feature = provider.getValue(varEAttribute)
						val isObfuscated = provider.getValue(varIsObfuscated)
						val frontValue = provider.getValue(varFrontValue)
						
						if (feature instanceof EAttribute && isObfuscated instanceof Number) {
							if (1 == (isObfuscated as Number).intValue && frontValue instanceof String)
								// there is no putback of obfuscated attributes, this could be ignored
								return stringObfuscator.restoreData(frontValue as String) 
							else 
								return frontValue
						} else {
							return null
						}
					}
					override getInputParameterNames() {
						#[varEAttribute, varIsObfuscated, varFrontValue]
					}
					override getShortDescription() {
						'''Deobfuscates front value into gold value'''
					}
				}, body.getOrCreateVariableByName(varGoldValue))
			]
			front += new ManipulableTemplate(
				ATTRIBUTE_KEY.inModel(FRONT), #[varFrontEObject, varEAttribute, varFrontValue]
			)
			readAuthorization += checkReadAuthorization(Asset.AttributeAsset, varGoldEObject, varEAttribute)
			writeAuthorization += checkWriteAuthorization(Asset.AttributeAsset, varGoldEObject, varEAttribute)
		]
	}
	
	
	def ActionStep checkWriteAuthorization(Class<? extends Asset> assetClass, String... assetVariables) {
		val authDeniedQuery = authorizationQueries.effectivelyDeniedQuery.get(assetClass).get(OperationKind::WRITE)
		val authDeniedMatcher = authDeniedQuery.getMatcher(incQueryEngine)
		return [
			val Object[] valueArray = assetVariables.map[name | variables.get(name)]
			val authMatch = authDeniedQuery.newMatch(valueArray)
			if (authDeniedMatcher.hasMatch(authMatch)) {
				transformationExecution.abort(new WriteAuthorizationDenial(user, assetClass, authMatch))
			}
		]
	}
	
	def ActionStep preAuthorizeReferenceAddition() { // varGoldSrc, varEReference, varGoldTrg
		val unreassignableSrcQuery = authorizationQueries.unReassignableSrcReference
		val unreassignableTrgQuery = authorizationQueries.unReassignableTrgReference
		val unreassignableSrcMatcher = unreassignableSrcQuery.getMatcher(incQueryEngine)
		val unreassignableTrgMatcher = unreassignableTrgQuery.getMatcher(incQueryEngine)
		return [
			val unreassignableSrcMatch = unreassignableSrcQuery.newMatch(variables.get(varGoldSrc), variables.get(varEReference))
			if (unreassignableSrcMatcher.hasMatch(unreassignableSrcMatch)) {
				transformationExecution.abort(new WriteAuthorizationDenial(user, ReferenceAsset, unreassignableSrcMatch))
			}
			val unreassignableTrgMatch = unreassignableTrgQuery.newMatch(variables.get(varEReference), variables.get(varGoldTrg))
			if (unreassignableTrgMatcher.hasMatch(unreassignableTrgMatch)) {
				transformationExecution.abort(new WriteAuthorizationDenial(user, ReferenceAsset, unreassignableTrgMatch))
			}
		]
	}
	
	
	def QueryTemplate checkReadAuthorization(Class<? extends Asset> assetClass, String... assetVariables) {
		authorizationQueries.effectivelyDeniedQuery.get(assetClass).get(OperationKind::READ).negativeCall(assetVariables)
	}
	
	def void dispose() {
		engine.dispose
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
	static val varIsObfuscated = "isObfuscated"
	
		
}
