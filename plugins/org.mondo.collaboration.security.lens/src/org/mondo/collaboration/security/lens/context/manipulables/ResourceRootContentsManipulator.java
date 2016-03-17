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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.mondo.collaboration.security.lens.emf.ModelFactInputKey;
import org.mondo.collaboration.security.lens.emf.ModelIndexer;

/**
 * @author Bergmann Gabor
 * @see ModelFactInputKey#RESOURCE_ROOT_CONTENTS_KEY
 */
public class ResourceRootContentsManipulator extends BaseEMFManipulable {


	/**
	 * @param model
	 */
	public ResourceRootContentsManipulator(ModelIndexer model) {
		super(model);
	}
    
    @Override
    public IInputKey getInputKey() {
        return ModelFactInputKey.RESOURCE_ROOT_CONTENTS_KEY;
    }

	@Override
	public Tuple retractTuple(Tuple tuple) {
		final Resource resource = (Resource) tuple.get(0);
		final Object object = tuple.get(1);
		if (resource == null || object == null)
			throw new UnsupportedOperationException(tuple.toString());
		
		if (resource.getContents().contains(object)) {
			model.cheapUnroot((EObject) object);
			return tuple;
		} else throw new UnsupportedOperationException(tuple.toString());
	}

	@Override
	public Tuple assertTuple(Tuple seed) {
		final Resource resource = (Resource) seed.get(0);
		final EObject element = (EObject) seed.get(1);
		if (resource == null || element == null)
			throw new UnsupportedOperationException(seed.toString());
		
		model.cheapMoveTo(element, resource, resource.getContents());
		return seed;
	}

}
