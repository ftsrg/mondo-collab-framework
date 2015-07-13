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

import org.eclipse.emf.ecore.resource.Resource;

/**
 * Tuples of ({@link Resource}, relative path).
 * @author Bergmann Gabor
 *
 */
public enum ResourceKey implements CollabLensInputKey {
	
	GOLD,
	FRONT;
	
	@Override
	public String getPrettyPrintableName() {
		return getStringID();
	}

	@Override
	public String getStringID() {
		return name()+"$Resource";
	}

	@Override
	public int getArity() {
		return 2;
	}

	@Override
	public boolean isEnumerable() {
		return true;
	}
}
