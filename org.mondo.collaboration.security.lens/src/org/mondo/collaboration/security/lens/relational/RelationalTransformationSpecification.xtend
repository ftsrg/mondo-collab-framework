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

import java.util.Set
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Specifices a collection of relational rule specifications 
 * 	that are to be operationalized together.
 * @author Bergmann Gabor
 *
 */
public abstract class RelationalTransformationSpecification {
	@Accessors(PUBLIC_GETTER)
	protected Set<RelationalRuleSpecification> rules = newHashSet()

	/**
	 * Returns a qualified name for the transformation specification
	 */
	def abstract String getFullyQualifiedName()
}