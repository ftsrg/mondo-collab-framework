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

package org.mondo.collaboration.security.lens.relational

import com.google.common.collect.ImmutableMap
import java.util.Map
import java.util.Set
import org.eclipse.incquery.runtime.evm.api.RuleSpecification
import org.eclipse.incquery.runtime.evm.specific.resolver.FixedPriorityConflictResolver
import org.eclipse.incquery.runtime.matchers.context.IInputKey
import org.mondo.collaboration.security.lens.util.ILiveRelation
import org.mondo.collaboration.security.lens.util.IManipulableRelation

/**
 * Specifices a collection of relational rule specifications 
 * 	that are to be operationalized together.
 * @author Bergmann Gabor
 *
 */
public abstract class RelationalTransformationSpecification {
	// @Accessors(PUBLIC_GETTER)
	protected Set<RelationalRuleSpecification> rules = newHashSet()
	
	private final Map<IInputKey, IManipulableRelation> manipulables;
	private final Map<IInputKey, ILiveRelation> queriables;
	protected final FixedPriorityConflictResolver priorityResolver = new FixedPriorityConflictResolver;
	
	public new (Map<IInputKey, ? extends IManipulableRelation> manipulables, Map<IInputKey, ? extends ILiveRelation> queriables) {
		this.manipulables = ImmutableMap.copyOf(manipulables)
		this.queriables = ImmutableMap.copyOf(queriables)
	}
	
	/**
	 * Manipulable base relations.
	 */
	def IManipulableRelation getManipulable(IInputKey key) {manipulables.get(key)}
	
	/**
	 * Queryable base relations.
	 */
	def ILiveRelation getQueriable(IInputKey key) {queriables.get(key)}
	
	/**
	 * Assigns priority to rule specification.
	 */
	def void assignPriority(RuleSpecification rule, int priority) {priorityResolver.setPriority(rule, priority)}

	/**
	 * Returns a qualified name for the transformation specification
	 */
	def abstract String getFullyQualifiedName()
	
}