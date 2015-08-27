/*
 * generated by Xtext
 */
package org.mondo.collaboration.security.macl.xtext.rule.scoping

import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.Binding
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.Rule

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 *
 */
class MACLRuleScopeProvider extends org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider {

	def scope_Binding_param(Binding binding, EReference ref) {
		val rule = binding.eContainer as Rule
		
		return Scopes::scopeFor(rule.pattern.parameters)
	}	

}