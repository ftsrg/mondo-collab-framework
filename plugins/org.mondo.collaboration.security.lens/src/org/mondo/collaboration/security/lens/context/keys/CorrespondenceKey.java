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

package org.mondo.collaboration.security.lens.context.keys;

/**
 * Tuples of (gold, front).
 * @author Bergmann Gabor
 *
 */
public enum CorrespondenceKey implements CollabLensInputKey {

	//RESOURCE,
	EOBJECT;

	@Override
	public String getPrettyPrintableName() {
		return getStringID();
	}

	@Override
	public String getStringID() {
		return "Correspond$"+name();
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
