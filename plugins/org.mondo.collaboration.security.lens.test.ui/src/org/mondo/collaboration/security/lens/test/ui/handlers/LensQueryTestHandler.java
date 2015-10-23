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

package org.mondo.collaboration.security.lens.test.ui.handlers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.runtime.api.GenericPatternMatch;
import org.eclipse.incquery.runtime.api.GenericPatternMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.BasePQuery;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.mondo.collaboration.security.lens.arbiter.Asset.ObjectAsset;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter.OperationKind;
import org.mondo.collaboration.security.lens.context.GenericMondoLensQuerySpecification;
import org.mondo.collaboration.security.lens.context.MondoLensScope;
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey;
import org.mondo.collaboration.security.lens.context.keys.EObjectKey;
import org.mondo.collaboration.security.lens.context.keys.ResourceKey;
import org.mondo.collaboration.security.lens.context.keys.SecurityJudgementKey;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.Role;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.RuleType;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * @author Bergmann Gabor
 *
 */
public class LensQueryTestHandler extends AbstractLensTestHandler {

	@Override
	protected void doTest(MondoLensScope scope, IFile policyFile, IFile goldFile, IFile frontFile,
			Resource policyResource, Resource goldResource, Resource frontResource) throws Exception 
	{
		IncQueryEngine engine = IncQueryEngine.on(scope);
		printMatchSet(engine.getMatcher(Q_MAPPED_RESOURCE));
		printMatchSet(engine.getMatcher(Q_OBJECT_PERMITTED));
		printMatchSet(engine.getMatcher(Q_GET_OBJECT_MAPPED));
		printMatchSet(engine.getMatcher(Q_GET_OBJECT_ADD_LHS));
		printMatchSet(engine.getMatcher(Q_GET_OBJECT_REMOVE_LHS));
		printMatchSet(engine.getMatcher(Q_PUTBACK_OBJECT_MAPPED));
		printMatchSet(engine.getMatcher(Q_PUTBACK_OBJECT_ADD_LHS));
		printMatchSet(engine.getMatcher(Q_PUTBACK_OBJECT_REMOVE_LHS));
	}

	private void printMatchSet(GenericPatternMatcher matcher) {
		System.out.println();
		System.out.println("-----------------");
		System.out.println("Matches of query: " + matcher.getPatternName());
		for (GenericPatternMatch match : matcher.getAllMatches()) {
			System.out.println("\t" + match.prettyPrint());
		}
	}
	
	public static final GenericMondoLensQuerySpecification Q_OBJECT_PERMITTED = new GenericMondoLensQuerySpecification(new BasePQuery() {
		
		private List<PParameter> parameters = Lists.newArrayList(
				new PParameter("object"),
				new PParameter("role")
			);
		
		@Override
		public List<PParameter> getParameters() {
			return parameters;
		}
		
		@Override
		public String getFullyQualifiedName() {
			return "org.mondo.collaboration.security.lens.test.queries.qObjectPermitted";
		}
		
		@Override
		protected Set<PBody> doGetContainedBodies() throws QueryInitializationException {
			Set<PBody> bodies = Sets.newLinkedHashSet();
			{
				PBody body = new PBody(this);
				bodies.add(body);
				
				PVariable var_object = body.getOrCreateVariableByName("object");
				PVariable var_role = body.getOrCreateVariableByName("role");
				body.setExportedParameters(Arrays.<ExportedParameter>asList(
						new ExportedParameter(body, var_object, "x"),
						new ExportedParameter(body, var_role, "y")/*,
			      		new ExportedParameter(body, var_y, "z")*/
						));
				PVariable var_judgement = body.getOrCreateVariableByName("judgement");
				
				new TypeConstraint(body, new FlatTuple(var_object, var_role, var_judgement), 
						new SecurityJudgementKey(OperationKind.READ, ObjectAsset.class));
				
				new ConstantValue(body, var_judgement, RuleType.PERMIT);
			}
			return bodies;
		}
	});
	
	public static final GenericMondoLensQuerySpecification Q_MAPPED_RESOURCE = new GenericMondoLensQuerySpecification(new BasePQuery() {
		
		private List<PParameter> parameters = Lists.newArrayList(
				new PParameter("goldResource"),
				new PParameter("frontResource")
			);
		
		@Override
		public List<PParameter> getParameters() {
			return parameters;
		}
		
		@Override
		public String getFullyQualifiedName() {
			return "org.mondo.collaboration.security.lens.test.queries.qMappedResource";
		}
		
		@Override
		protected Set<PBody> doGetContainedBodies() throws QueryInitializationException {
			Set<PBody> bodies = Sets.newLinkedHashSet();
			{
				PBody body = new PBody(this);
				bodies.add(body);
				
				PVariable var_goldResource = body.getOrCreateVariableByName("goldResource");
				PVariable var_frontResource = body.getOrCreateVariableByName("frontResource");
				body.setExportedParameters(Arrays.<ExportedParameter>asList(
						new ExportedParameter(body, var_goldResource, "goldResource"),
						new ExportedParameter(body, var_frontResource, "frontResource")/*,
			      		new ExportedParameter(body, var_y, "z")*/
						));
				PVariable var_relativeURI = body.getOrCreateVariableByName("relativeURI");
				
				new TypeConstraint(body, new FlatTuple(var_goldResource, var_relativeURI), 
						ResourceKey.GOLD);
				new TypeConstraint(body, new FlatTuple(var_frontResource, var_relativeURI), 
						ResourceKey.FRONT);
			}
			return bodies;
		}
	});
	
	public static final GenericMondoLensQuerySpecification Q_PUTBACK_OBJECT_MAPPED = new GenericMondoLensQuerySpecification(new BasePQuery() {
		
		private List<PParameter> parameters = Lists.newArrayList(
				new PParameter("goldObject"),
				new PParameter("frontObject"),
				new PParameter("eClass")
			);
		
		@Override
		public List<PParameter> getParameters() {
			return parameters;
		}
		
		@Override
		public String getFullyQualifiedName() {
			return "org.mondo.collaboration.security.lens.test.queries.qPutbackObjectMapped";
		}
		
		@Override
		protected Set<PBody> doGetContainedBodies() throws QueryInitializationException {
			Set<PBody> bodies = Sets.newLinkedHashSet();
			{
				PBody body = new PBody(this);
				bodies.add(body);
				
				PVariable var_gold = body.getOrCreateVariableByName("goldObject");
				PVariable var_front = body.getOrCreateVariableByName("frontObject");
				PVariable var_eClass = body.getOrCreateVariableByName("eClass");
				body.setExportedParameters(Arrays.<ExportedParameter>asList(
						new ExportedParameter(body, var_gold, "goldObject"),
						new ExportedParameter(body, var_front, "frontObject"),
			      		new ExportedParameter(body, var_eClass, "eClass")
						));
//				PVariable var_role = body.getOrCreateVariableByName("role");
//				PVariable var_judgement = body.getOrCreateVariableByName("judgement");
			
				new TypeConstraint(body, new FlatTuple(var_gold, var_eClass), 
						EObjectKey.GOLD);
				new TypeConstraint(body, new FlatTuple(var_front, var_eClass), 
						EObjectKey.FRONT);
				new TypeConstraint(body, new FlatTuple(var_gold, var_front), 
						CorrespondenceKey.EOBJECT);
				
//				new TypeConstraint(body, new FlatTuple(var_gold, var_role, var_judgement), 
//						new SecurityJudgementKey(OperationKind.READ, ObjectAsset.class));
//				new ConstantValue(body, var_judgement, RuleType.PERMIT);
//				new ExpressionEvaluation(body, new IExpressionEvaluator() {
//					@Override
//					public String getShortDescription() {
//						return "role is bob";
//					}
//					
//					@Override
//					public Iterable<String> getInputParameterNames() {
//						return Collections.singleton("role");
//					}
//					@Override
//					public Object evaluateExpression(IValueProvider provider) throws Exception {
//						final Role role = (Role) provider.getValue("role");
//						return "bob".equals(role.getName());
//					}
//				}, null);
			}
			return bodies;
		}
	});
	
	public static final GenericMondoLensQuerySpecification Q_PUTBACK_OBJECT_REMOVE_LHS = new GenericMondoLensQuerySpecification(new BasePQuery() {
		
		private List<PParameter> parameters = Lists.newArrayList(
				new PParameter("goldObject"),
				new PParameter("eClass")
			);
		
		@Override
		public List<PParameter> getParameters() {
			return parameters;
		}
		
		@Override
		public String getFullyQualifiedName() {
			return "org.mondo.collaboration.security.lens.test.queries.qPutbackObjectRemoveLHS";
		}
		
		@Override
		protected Set<PBody> doGetContainedBodies() throws QueryInitializationException {
			Set<PBody> bodies = Sets.newLinkedHashSet();
			{
				PBody body = new PBody(this);
				bodies.add(body);
				
				PVariable var_gold = body.getOrCreateVariableByName("goldObject");
				PVariable var_eClass = body.getOrCreateVariableByName("eClass");
				body.setExportedParameters(Arrays.<ExportedParameter>asList(
						new ExportedParameter(body, var_gold, "goldObject"),
			      		new ExportedParameter(body, var_eClass, "eClass")
						));
				PVariable var_front = body.getOrCreateVariableByName("_frontObject");
//				PVariable var_role = body.getOrCreateVariableByName("role");
//				PVariable var_judgement = body.getOrCreateVariableByName("judgement");
			
				new TypeConstraint(body, new FlatTuple(var_gold, var_eClass), 
						EObjectKey.GOLD);
//				new TypeConstraint(body, new FlatTuple(var_front, var_eClass), 
//						EObjectKey.FRONT);
//				new TypeConstraint(body, new FlatTuple(var_gold, var_front), 
//						CorrespondenceKey.EOBJECT);
				
//				new TypeConstraint(body, new FlatTuple(var_gold, var_role, var_judgement), 
//						new SecurityJudgementKey(OperationKind.READ, ObjectAsset.class));
//				new ConstantValue(body, var_judgement, RuleType.PERMIT);
//				new ExpressionEvaluation(body, new IExpressionEvaluator() {
//					@Override
//					public String getShortDescription() {
//						return "role is bob";
//					}
//					
//					@Override
//					public Iterable<String> getInputParameterNames() {
//						return Collections.singleton("role");
//					}
//					@Override
//					public Object evaluateExpression(IValueProvider provider) throws Exception {
//						final Role role = (Role) provider.getValue("role");
//						return "bob".equals(role.getName());
//					}
//				}, null);
				
				new NegativePatternCall(body, new FlatTuple(var_gold, var_front, var_eClass), 
						Q_PUTBACK_OBJECT_MAPPED.getInternalQueryRepresentation());
			}
			return bodies;
		}
	});
	
	public static final GenericMondoLensQuerySpecification Q_PUTBACK_OBJECT_ADD_LHS = new GenericMondoLensQuerySpecification(new BasePQuery() {
		
		private List<PParameter> parameters = Lists.newArrayList(
				new PParameter("frontObject"),
				new PParameter("eClass")
			);
		
		@Override
		public List<PParameter> getParameters() {
			return parameters;
		}
		
		@Override
		public String getFullyQualifiedName() {
			return "org.mondo.collaboration.security.lens.test.queries.qPutbackObjectAddLHS";
		}
		
		@Override
		protected Set<PBody> doGetContainedBodies() throws QueryInitializationException {
			Set<PBody> bodies = Sets.newLinkedHashSet();
			{
				PBody body = new PBody(this);
				bodies.add(body);
				
				PVariable var_front = body.getOrCreateVariableByName("frontObject");
				PVariable var_eClass = body.getOrCreateVariableByName("eClass");
				body.setExportedParameters(Arrays.<ExportedParameter>asList(
						new ExportedParameter(body, var_front, "frontObject"),
			      		new ExportedParameter(body, var_eClass, "eClass")
						));
				PVariable var_gold = body.getOrCreateVariableByName("_goldObject");
//				PVariable var_role = body.getOrCreateVariableByName("role");
//				PVariable var_judgement = body.getOrCreateVariableByName("judgement");
			
//				new TypeConstraint(body, new FlatTuple(var_gold, var_eClass), 
//						EObjectKey.GOLD);
				new TypeConstraint(body, new FlatTuple(var_front, var_eClass), 
						EObjectKey.FRONT);
//				new TypeConstraint(body, new FlatTuple(var_gold, var_front), 
//						CorrespondenceKey.EOBJECT);
				
//				new TypeConstraint(body, new FlatTuple(var_gold, var_role, var_judgement), 
//						new SecurityJudgementKey(OperationKind.READ, ObjectAsset.class));
//				new ConstantValue(body, var_judgement, RuleType.PERMIT);
//				new ExpressionEvaluation(body, new IExpressionEvaluator() {
//					@Override
//					public String getShortDescription() {
//						return "role is bob";
//					}
//					
//					@Override
//					public Iterable<String> getInputParameterNames() {
//						return Collections.singleton("role");
//					}
//					@Override
//					public Object evaluateExpression(IValueProvider provider) throws Exception {
//						final Role role = (Role) provider.getValue("role");
//						return "bob".equals(role.getName());
//					}
//				}, null);
				
				new NegativePatternCall(body, new FlatTuple(var_gold, var_front, var_eClass), 
						Q_PUTBACK_OBJECT_MAPPED.getInternalQueryRepresentation());
			}
			return bodies;
		}
	});
	
	
	public static final GenericMondoLensQuerySpecification Q_GET_OBJECT_MAPPED = new GenericMondoLensQuerySpecification(new BasePQuery() {
		
		private List<PParameter> parameters = Lists.newArrayList(
				new PParameter("goldObject"),
				new PParameter("frontObject"),
				new PParameter("eClass")
			);
		
		@Override
		public List<PParameter> getParameters() {
			return parameters;
		}
		
		@Override
		public String getFullyQualifiedName() {
			return "org.mondo.collaboration.security.lens.test.queries.qGetObjectMapped";
		}
		
		@Override
		protected Set<PBody> doGetContainedBodies() throws QueryInitializationException {
			Set<PBody> bodies = Sets.newLinkedHashSet();
			{
				PBody body = new PBody(this);
				bodies.add(body);
				
				PVariable var_gold = body.getOrCreateVariableByName("goldObject");
				PVariable var_front = body.getOrCreateVariableByName("frontObject");
				PVariable var_eClass = body.getOrCreateVariableByName("eClass");
				body.setExportedParameters(Arrays.<ExportedParameter>asList(
						new ExportedParameter(body, var_gold, "goldObject"),
						new ExportedParameter(body, var_front, "frontObject"),
			      		new ExportedParameter(body, var_eClass, "eClass")
						));
				PVariable var_role = body.getOrCreateVariableByName("role");
				PVariable var_judgement = body.getOrCreateVariableByName("judgement");
			
				new TypeConstraint(body, new FlatTuple(var_gold, var_eClass), 
						EObjectKey.GOLD);
				new TypeConstraint(body, new FlatTuple(var_front, var_eClass), 
						EObjectKey.FRONT);
				new TypeConstraint(body, new FlatTuple(var_gold, var_front), 
						CorrespondenceKey.EOBJECT);
				
				new TypeConstraint(body, new FlatTuple(var_gold, var_role, var_judgement), 
						new SecurityJudgementKey(OperationKind.READ, ObjectAsset.class));
				new ConstantValue(body, var_judgement, RuleType.PERMIT);
				new ExpressionEvaluation(body, new IExpressionEvaluator() {
					@Override
					public String getShortDescription() {
						return "role is bob";
					}
					
					@Override
					public Iterable<String> getInputParameterNames() {
						return Collections.singleton("role");
					}
					@Override
					public Object evaluateExpression(IValueProvider provider) throws Exception {
						final Role role = (Role) provider.getValue("role");
						return "bob".equals(role.getName());
					}
				}, null);
			}
			return bodies;
		}
	});
	
	public static final GenericMondoLensQuerySpecification Q_GET_OBJECT_ADD_LHS = new GenericMondoLensQuerySpecification(new BasePQuery() {
		
		private List<PParameter> parameters = Lists.newArrayList(
				new PParameter("goldObject"),
				new PParameter("eClass")
			);
		
		@Override
		public List<PParameter> getParameters() {
			return parameters;
		}
		
		@Override
		public String getFullyQualifiedName() {
			return "org.mondo.collaboration.security.lens.test.queries.qGetObjectAddLHS";
		}
		
		@Override
		protected Set<PBody> doGetContainedBodies() throws QueryInitializationException {
			Set<PBody> bodies = Sets.newLinkedHashSet();
			{
				PBody body = new PBody(this);
				bodies.add(body);
				
				PVariable var_gold = body.getOrCreateVariableByName("goldObject");
				PVariable var_eClass = body.getOrCreateVariableByName("eClass");
				body.setExportedParameters(Arrays.<ExportedParameter>asList(
						new ExportedParameter(body, var_gold, "goldObject"),
			      		new ExportedParameter(body, var_eClass, "eClass")
						));
				PVariable var_front = body.getOrCreateVariableByName("_frontObject");
				PVariable var_role = body.getOrCreateVariableByName("role");
				PVariable var_judgement = body.getOrCreateVariableByName("judgement");
			
				new TypeConstraint(body, new FlatTuple(var_gold, var_eClass), 
						EObjectKey.GOLD);
//				new TypeConstraint(body, new FlatTuple(var_front, var_eClass), 
//						EObjectKey.FRONT);
//				new TypeConstraint(body, new FlatTuple(var_gold, var_front), 
//						CorrespondenceKey.EOBJECT);
				
				new TypeConstraint(body, new FlatTuple(var_gold, var_role, var_judgement), 
						new SecurityJudgementKey(OperationKind.READ, ObjectAsset.class));
				new ConstantValue(body, var_judgement, RuleType.PERMIT);
				new ExpressionEvaluation(body, new IExpressionEvaluator() {
					@Override
					public String getShortDescription() {
						return "role is bob";
					}
					
					@Override
					public Iterable<String> getInputParameterNames() {
						return Collections.singleton("role");
					}
					@Override
					public Object evaluateExpression(IValueProvider provider) throws Exception {
						final Role role = (Role) provider.getValue("role");
						return "bob".equals(role.getName());
					}
				}, null);
				
				new NegativePatternCall(body, new FlatTuple(var_gold, var_front, var_eClass), 
						Q_GET_OBJECT_MAPPED.getInternalQueryRepresentation());
			}
			return bodies;
		}
	});
	
	public static final GenericMondoLensQuerySpecification Q_GET_OBJECT_REMOVE_LHS = new GenericMondoLensQuerySpecification(new BasePQuery() {
		
		private List<PParameter> parameters = Lists.newArrayList(
				new PParameter("frontObject"),
				new PParameter("eClass")
			);
		
		@Override
		public List<PParameter> getParameters() {
			return parameters;
		}
		
		@Override
		public String getFullyQualifiedName() {
			return "org.mondo.collaboration.security.lens.test.queries.qGetObjectRemoveLHS";
		}
		
		@Override
		protected Set<PBody> doGetContainedBodies() throws QueryInitializationException {
			Set<PBody> bodies = Sets.newLinkedHashSet();
			{
				PBody body = new PBody(this);
				bodies.add(body);
				
				PVariable var_front = body.getOrCreateVariableByName("frontObject");
				PVariable var_eClass = body.getOrCreateVariableByName("eClass");
				body.setExportedParameters(Arrays.<ExportedParameter>asList(
						new ExportedParameter(body, var_front, "frontObject"),
			      		new ExportedParameter(body, var_eClass, "eClass")
						));
				PVariable var_gold = body.getOrCreateVariableByName("_goldObject");
//				PVariable var_role = body.getOrCreateVariableByName("role");
//				PVariable var_judgement = body.getOrCreateVariableByName("judgement");
			
//				new TypeConstraint(body, new FlatTuple(var_gold, var_eClass), 
//						EObjectKey.GOLD);
				new TypeConstraint(body, new FlatTuple(var_front, var_eClass), 
						EObjectKey.FRONT);
//				new TypeConstraint(body, new FlatTuple(var_gold, var_front), 
//						CorrespondenceKey.EOBJECT);
				
//				new TypeConstraint(body, new FlatTuple(var_gold, var_role, var_judgement), 
//						new SecurityJudgementKey(OperationKind.READ, ObjectAsset.class));
//				new ConstantValue(body, var_judgement, RuleType.PERMIT);
//				new ExpressionEvaluation(body, new IExpressionEvaluator() {
//					@Override
//					public String getShortDescription() {
//						return "role is bob";
//					}
//					
//					@Override
//					public Iterable<String> getInputParameterNames() {
//						return Collections.singleton("role");
//					}
//					@Override
//					public Object evaluateExpression(IValueProvider provider) throws Exception {
//						final Role role = (Role) provider.getValue("role");
//						return "bob".equals(role.getName());
//					}
//				}, null);
				
				new NegativePatternCall(body, new FlatTuple(var_gold, var_front, var_eClass), 
						Q_GET_OBJECT_MAPPED.getInternalQueryRepresentation());
			}
			return bodies;
		}
	});
	
}
