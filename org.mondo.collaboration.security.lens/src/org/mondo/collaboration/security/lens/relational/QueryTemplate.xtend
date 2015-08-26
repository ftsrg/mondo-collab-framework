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

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1
import org.eclipse.incquery.runtime.matchers.psystem.PBody

/**
 * Generates constraints into rule precondition patterns, also exposing the variables to which it can bind value.
 */
public abstract class QueryTemplate implements Procedure1<PBody> {
	public abstract def Iterable<String> getDeducedVariables()
	
	public static def QueryTemplate fromConstrainer(Iterable<String> deducedVariableNames, Procedure1<PBody> constrainer) {
		return new QueryTemplate() {
			override getDeducedVariables() {
				deducedVariableNames
			}
			override apply(PBody p) {
				constrainer.apply(p)
			}
		}
	}
	
}
