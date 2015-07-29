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

import org.eclipse.xtend.lib.annotations.Data
import java.util.Map
import org.eclipse.incquery.runtime.matchers.context.IInputKey
import org.mondo.collaboration.security.lens.util.IManipulableRelation
import org.mondo.collaboration.security.lens.util.ILiveRelation

/**
 * The runtime execution context of a transformation rule
 * @author Bergmann Gabor
 *
 */
@Data
class RuleExecutionEnvironment {
	/**
	 * The set of rule variable values, keyed by variable name. 
	 * Modifiable by {@link org.mondo.collaboration.security.lens.relational.RelationalRule$ActionStep}s.
	 */
	Map<String, Object> variables
	
	/**
	 * Manipulable base relations.
	 */
	Map<IInputKey, IManipulableRelation> manipulables
	
	/**
	 * Queryable base relations.
	 */
	Map<IInputKey, ILiveRelation> queryables
}