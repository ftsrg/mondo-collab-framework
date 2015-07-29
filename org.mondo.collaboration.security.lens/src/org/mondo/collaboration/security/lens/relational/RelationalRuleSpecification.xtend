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
import org.eclipse.incquery.runtime.matchers.psystem.PBody
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1

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
	
	List<ConstrainerTemplate> condition = newArrayList()
	List<ConstrainerTemplate> readAuthorization = newArrayList()
	List<ActionStep> writeAuthorization = newArrayList()
	
	/**
	 * Generates constraints into rule precondition patterns.
	 */
	public static abstract class ConstrainerTemplate implements Procedure1<PBody> {}
	/**
	 * Represents an imperative step that can be used in a rule postcondition
	 */
	public static abstract class ActionStep implements Procedure1<RuleExecutionEnvironment> {}
}