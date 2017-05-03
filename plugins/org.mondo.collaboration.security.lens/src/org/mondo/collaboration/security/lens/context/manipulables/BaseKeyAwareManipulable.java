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

package org.mondo.collaboration.security.lens.context.manipulables;

import java.util.Map;

import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.mondo.collaboration.security.lens.util.IManipulableRelation;

/**
 * A manipulable that knows its input key.
 * @author Bergmann Gabor
 *
 */
public abstract class BaseKeyAwareManipulable implements IManipulableRelation {

	public abstract IInputKey getInputKey();

	public void putInto(Map<IInputKey, IManipulableRelation> manipulables) {
		manipulables.put(getInputKey(), this);
	}
	
}