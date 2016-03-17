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
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.transformation.evm.api.RuleSpecification
import org.eclipse.xtend.lib.annotations.Data

/**
 * A class representing the operationalized form of a high-level relational rule.
 * @author Bergmann Gabor
 *
 */
@Data
class RuleOperationalization {
	RelationalTransformationSpecification transformation
	RelationalRuleSpecification rule
	
    Set<IQuerySpecification> queries = newHashSet()	
	Set<RuleSpecification> rulesForGet = newHashSet()
	Set<RuleSpecification> rulesForPutback = newHashSet()
	
}