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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * Tuples of ({@link EObject}, {@link EAttribute}, attribute slot value).
 * @author Bergmann Gabor
 *
 */
public enum EObjectAttributeKey implements CollabLensInputKey {
	GOLD,
	FRONT;
	
	@Override
	public String getPrettyPrintableName() {
		return getStringID();
	}

	@Override
	public String getStringID() {
		return name()+"$EObject.attribute";
	}

	@Override
	public int getArity() {
		return 3;
	}

	@Override
	public boolean isEnumerable() {
		return true;
	}
}
