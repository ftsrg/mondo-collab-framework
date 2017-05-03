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

import java.util.Map;
import java.util.Set;

import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.mondo.collaboration.security.lens.context.keys.CollabLensModelInputKey;
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey;
import org.mondo.collaboration.security.lens.emf.ModelFactInputKey;
import org.mondo.collaboration.security.lens.util.DefaultMetaContext;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

/**
 * @author Bergmann Gabor
 *
 */
public class MondoLensMetaContext extends DefaultMetaContext {
    public static MondoLensMetaContext INSTANCE = new MondoLensMetaContext();
	
    private static final ImmutableMap<Set<Integer>, Set<Integer>> ONE_TO_ONE = ImmutableMap.<Set<Integer>, Set<Integer>>of(
            ImmutableSet.of(0), ImmutableSet.of(1),
            ImmutableSet.of(1), ImmutableSet.of(0)
            );
	@Override
	public Map<Set<Integer>, Set<Integer>> getFunctionalDependencies(IInputKey key) {
		if (key instanceof CorrespondenceKey) { // Correspondence is one-to-one
			return ONE_TO_ONE;
		} else if (key instanceof CollabLensModelInputKey) {
		    ModelFactInputKey wrappedKey = ((CollabLensModelInputKey) key).getWrappedKey();
		    switch (wrappedKey) {
		    case RESOURCE_KEY: // relative path is a unique identifier
		        return ONE_TO_ONE;
		    case RESOURCE_ROOT_CONTENTS_KEY: // root object determines resource
		        return ImmutableMap.<Set<Integer>, Set<Integer>>of(
		                ImmutableSet.of(1), ImmutableSet.of(0)
		                );
            case EOBJECT_KEY: // object determines class
                return ImmutableMap.<Set<Integer>, Set<Integer>>of(
                        ImmutableSet.of(0), ImmutableSet.of(1)
                        );
		    }
		}
		    
		return super.getFunctionalDependencies(key);
	}

}
