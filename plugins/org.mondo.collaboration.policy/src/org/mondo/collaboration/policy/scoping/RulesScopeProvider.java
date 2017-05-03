package org.mondo.collaboration.policy.scoping;

import java.util.ArrayList;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.ClassType;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Pattern;
import org.eclipse.viatra.query.patternlanguage.patternLanguage.Variable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.mondo.collaboration.policy.rules.*;

import com.google.common.collect.Lists;

public class RulesScopeProvider extends AbstractRulesScopeProvider {
	
    @Override
    public IScope getScope(EObject context, EReference reference) {
    	if(reference == RulesPackage.eINSTANCE.getRule_Pattern() && context instanceof Rule){
    		return getScopeRule_Pattern(context, reference);
    	}
    	if((reference == RulesPackage.eINSTANCE.getBinding_Variable() && context instanceof Binding) ||
    	   (reference == RulesPackage.eINSTANCE.getObjectFact_Variable() && context instanceof ObjectFact) ||
    	   (reference == RulesPackage.eINSTANCE.getReferenceFact_SourceVar() && context instanceof ReferenceFact) ||
    	   (reference == RulesPackage.eINSTANCE.getReferenceFact_TargetVar() && context instanceof ReferenceFact) ||
    	   (reference == RulesPackage.eINSTANCE.getAttributeFact_Variable() && context instanceof AttributeFact)){
    		return getScopeVariable(context, reference);
    	}
    	if(reference == RulesPackage.eINSTANCE.getReferenceFact_Reference() && context instanceof ReferenceFact){
    		return getScopeReferenceFact_Reference(context, reference);
    	}
    	if(reference == RulesPackage.eINSTANCE.getAttributeFact_Attribute() && context instanceof AttributeFact){
    		return getScopeAttributeFact_Attribute(context, reference);
    	}
    	/*if(reference == RulesPackage.eINSTANCE.getObjectBind_Object() && context instanceof ObjectBind){
    		return getScopeObjectBind_Object(context, reference);
    	}
    	if(reference == RulesPackage.eINSTANCE.getEnumBind_Enumliteral() && context instanceof EnumBind){
    		return getScopeEnumBind_Enumliteral(context, reference);
    	}*/
    	return super.getScope(context, reference);
    }
    
    private TreeIterator<EObject> getResourceContent(EObject context, String extension){
		Resource contextResource = context.eResource();
		String newURI = contextResource.getURI().toString().replace(".rules", extension);
	    Resource otherResource = contextResource.getResourceSet().getResource(URI.createURI(newURI), true);
	    return otherResource.getAllContents();
	}

	private IScope getScopeRule_Pattern(EObject context, EReference reference){
	    TreeIterator<EObject> iterator = getResourceContent(context, ".vql");
	    ArrayList<Pattern> patterns = Lists.newArrayList();
	    while(iterator.hasNext()){
	    	EObject eObject = iterator.next();
	    	if(eObject instanceof Pattern){
				Pattern pattern = (Pattern) eObject;
				patterns.add(pattern);
	    	}
	    }
		return Scopes.scopeFor(patterns);
	}
	
	private IScope getScopeVariable(EObject context, EReference reference){
		Rule rule = (Rule) context.eContainer();
		EList<Variable> variables = rule.getPattern().getParameters();
		return Scopes.scopeFor(variables);
	}
	
	private IScope getScopeReferenceFact_Reference(EObject context, EReference reference){
	    ReferenceFact refFact = (ReferenceFact) context;
	    ClassType sourceClassType = (ClassType) refFact.getSourceVar().getType();
	    ClassType targetClassType = (ClassType) refFact.getTargetVar().getType();
	    EClass sourceParamClass = (EClass) sourceClassType.getClassname();
	    EClassifier targetParamClassifier = targetClassType.getClassname();
	    ArrayList<EReference> refs = Lists.newArrayList();;
	    Iterator<EReference> iter = sourceParamClass.getEAllReferences().iterator();
	    while(iter.hasNext()){
	    	EReference ref = iter.next();
	    	if(ref.getEType() == targetParamClassifier){
	    		refs.add(ref);
	    	}
	    }
	    return Scopes.scopeFor(refs);
	}
	
	private IScope getScopeAttributeFact_Attribute(EObject context, EReference reference){
		AttributeFact attrFact = (AttributeFact) context;
	    ClassType varClassType = (ClassType) attrFact.getVariable().getType();
	    EClass varClass = (EClass) varClassType.getClassname();
	    return Scopes.scopeFor(varClass.getEAllAttributes());
	}
	
	/*private IScope getScopeObjectBind_Object(EObject context, EReference reference){
		EObject container = context.eContainer();
		while(!(container instanceof Model)){
			container = container.eContainer();
		}
		Model model = (Model) container;
		String importURI = model.getInstanceModel().getImportURI();
		String extension = importURI.substring(importURI.lastIndexOf('.'));
		
	    TreeIterator<EObject> iterator = getResourceContent(context, extension);
	    
	    Binding binding = (Binding) context.eContainer();
	    ClassType varClassType = (ClassType) binding.getVariable().getType();
	    EClass varClass = (EClass) varClassType.getClassname();
	    String varClassName = varClass.getName();
	    
	    ArrayList<EObject> objects = Lists.newArrayList();
	    while(iterator.hasNext()){
	    	EObject eObject = iterator.next();
	    	String eObjectClassName = eObject.eClass().getName();
	    	if(eObjectClassName.equals(varClassName)){
	    	    objects.add(eObject);
	    	}
	    }
	    return Scopes.scopeFor(objects);
	}
	
	private IScope getScopeEnumBind_Enumliteral(EObject context, EReference reference){
	    Binding binding = (Binding) context.eContainer();
	    ClassType varClassType = (ClassType) binding.getVariable().getType();
	    EClassifier varClassifier = varClassType.getClassname();
	    
	    if(varClassifier instanceof EEnum){
	    	EEnum enumeration = (EEnum) varClassifier;
	    	EList<EEnumLiteral> eLiterals = enumeration.getELiterals();
	    	return Scopes.scopeFor(eLiterals);
	    } else {
	    	return null;
	    }
	}*/
}	
