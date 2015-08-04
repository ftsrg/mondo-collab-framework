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

import java.util.List;

import org.eclipse.incquery.runtime.matchers.psystem.queries.BasePQuery;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;

/**
 * Generic PQuery useful for lens queries
 * @author Bergmann Gabor
 *
 */
public abstract class BaseMondoLensPQuery extends BasePQuery {
	private final String fullyQualifiedName;
	private final List<PParameter> parameters;

	public BaseMondoLensPQuery(String fullyQualifiedName, List<PParameter> parameters) {
		super();
		this.fullyQualifiedName = fullyQualifiedName;
		this.parameters = parameters;
	}
	
	@Override
	public String getFullyQualifiedName() {
		return fullyQualifiedName;
	}
	@Override
	public List<PParameter> getParameters() {
		return parameters;
	}
}
