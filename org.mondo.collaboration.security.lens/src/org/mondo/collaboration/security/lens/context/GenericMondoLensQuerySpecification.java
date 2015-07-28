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

package org.mondo.collaboration.security.lens.context;

import org.eclipse.incquery.runtime.api.GenericPatternMatcher;
import org.eclipse.incquery.runtime.api.GenericQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.scope.IncQueryScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PQuery;

/**
 * Generic query specification for mondo lens patterns.
 * @author Bergmann Gabor
 *
 */
public class GenericMondoLensQuerySpecification extends GenericQuerySpecification<GenericPatternMatcher> {

	/**
	 * @param wrappedPQuery
	 */
	public GenericMondoLensQuerySpecification(PQuery wrappedPQuery) {
		super(wrappedPQuery);
	}

	@Override
	public Class<? extends IncQueryScope> getPreferredScopeClass() {
		return MondoLensScope.class;
	}

	@Override
	protected GenericPatternMatcher instantiate(IncQueryEngine engine) throws IncQueryException {
		return defaultInstantiate(engine);
	}

}
