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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.mondo.collaboration.security.lens.context.keys.ResourceKey;
import org.mondo.collaboration.security.lens.emf.ModelIndexer;

/**
 * @author Bergmann Gabor
 * @see ResourceKey
 */
public class ResourceManipulator extends BaseEMFManipulable {

	/**
	 * @param model
	 */
	public ResourceManipulator(ModelIndexer model) {
		super(model);
	}

	@Override
	public Tuple retractTuple(Tuple tuple) {
		final Resource resource = (Resource) tuple.get(0);
		if (resource == null || tuple.get(1) == null)
			throw new UnsupportedOperationException(tuple.toString());
//		final URI relativeURI = (URI) tuple.get(1);
		
		//resource.getContents().clear();
		resource.unload();
		//root.getResources().remove(resource);
		return tuple;
	}

	@Override
	public Tuple assertTuple(Tuple seed) {
//		final Resource resource = (Resource) seed.get(0);
		final URI relativeURI = (URI) seed.get(1);
		if (relativeURI == null || seed.get(0) != null) 
			throw new IllegalArgumentException(seed.toString());
		
		URI uri = model.getUriRelativiser().relativePathToURI(relativeURI);
		Resource resource = root.getResource(uri, true);
		return new FlatTuple(resource, relativeURI);
	}

}
