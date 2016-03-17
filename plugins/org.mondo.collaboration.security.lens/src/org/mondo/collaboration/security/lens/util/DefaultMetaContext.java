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

package org.mondo.collaboration.security.lens.util;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.context.IQueryMetaContext;
import org.eclipse.viatra.query.runtime.matchers.context.InputKeyImplication;

/**
 * Gives the default answers for all input keys.
 * @author Bergmann Gabor
 *
 */
public class DefaultMetaContext implements IQueryMetaContext {

	@Override
	public boolean isEnumerable(IInputKey key) {
		return true;
	}

	@Override
	public boolean isStateless(IInputKey key) {
		return false;
	}

	@Override
	public Collection<InputKeyImplication> getImplications(IInputKey implyingKey) {
		return Collections.emptySet();
	}

	@Override
	public Map<Set<Integer>, Set<Integer>> getFunctionalDependencies(IInputKey key) {
		return Collections.emptyMap();
	}

}
