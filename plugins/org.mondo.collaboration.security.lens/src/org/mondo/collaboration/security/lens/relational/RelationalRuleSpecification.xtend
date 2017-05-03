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

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.mondo.collaboration.security.lens.util.RuleGeneratorExtensions

/**
 * A class representing a high-level, relational specification of a bidirectional transformation rule 
 * @author Bergmann Gabor
 *
 */
@Accessors
public class RelationalRuleSpecification {
	String name
	int priority
	
	List<ManipulableTemplate> gold = newArrayList()
	List<ManipulableTemplate> correspondence = newArrayList()
	List<ManipulableTemplate> front = newArrayList()
	
	List<QueryTemplate> mappingCondition = newArrayList()
	List<QueryTemplate> readAuthorization = newArrayList()
	List<ActionStep> writeAuthorization = newArrayList()
	List<ActionStep> additivePreAuthorization = newArrayList()
	
	extension RuleGeneratorExtensions extendUtil = RuleGeneratorExtensions::INSTANCE
		
		
	public def operationalize(RelationalTransformationSpecification transformation) {
		val goldReadable = composeQuery('''«transformation.fullyQualifiedName».«name».goldReadable''',
			gold, 
			readAuthorization
		)
		val mapped = composeQuery('''«transformation.fullyQualifiedName».«name».mapped''',
			#[goldReadable.positiveCallKeepNames], 
			mappingCondition, 
			correspondence, 
			front
		)
		val getAddLHS = composeQuery('''«transformation.fullyQualifiedName».«name».get.add.lhs''',
			mappingCondition,
			#[
				goldReadable.positiveCallKeepNames, 
				mapped.negativeCallKeepNames
			]
		)
		val putbackRemoveLHS = composeQuery('''«transformation.fullyQualifiedName».«name».putback.remove.lhs''',
			#[
				goldReadable.positiveCallKeepNames, 
				mapped.negativeCallKeepNames
			]
		)
		val putbackAddLHS = composeQuery('''«transformation.fullyQualifiedName».«name».putback.add.lhs''',
			front, 
			mappingCondition,
			#[mapped.negativeCallKeepNames]
		)
		val getRemoveLHS = composeQuery('''«transformation.fullyQualifiedName».«name».get.remove.lhs''',
			front, 
			#[mapped.negativeCallKeepNames]
		)
		
		return new RuleOperationalization(transformation, this) => [
			queries += goldReadable
			queries += mapped
			queries += getAddLHS
			queries += putbackRemoveLHS
			queries += putbackAddLHS
			queries += getRemoveLHS
			rulesForGet += createEVMRule(getAddLHS, 1 * priority,
					front.map[asAssertAction],
					correspondence.map[asAssertAction]
				)
			rulesForGet += createEVMRule(getRemoveLHS, -1 * priority,
					front.map[asRetractAction],
					correspondence.map[asRetractAction]
				)
			rulesForPutback += createEVMRule(putbackAddLHS, 1 * priority,
					additivePreAuthorization,
					gold.map[asAssertAction],
					correspondence.map[asAssertAction],
					writeAuthorization
				)
			rulesForPutback += createEVMRule(putbackRemoveLHS, -1 * priority,
					writeAuthorization,
					correspondence.map[asRetractAction],
					gold.map[asRetractAction]
				)
		]
	}
	
}