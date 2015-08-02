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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.mondo.collaboration.security.lens.context.keys.EObjectKey;
import org.mondo.collaboration.security.lens.emf.ModelIndexer;

/**
 * @author Bergmann Gabor
 * @see EObjectKey
 */
public class EObjectManipulator extends BaseEMFManipulable {


	/**
	 * @param model
	 */
	public EObjectManipulator(ModelIndexer model) {
		super(model);
	}

	@Override
	public Tuple retractTuple(Tuple tuple) {
		final EObject element = (EObject) tuple.get(0);
		final EClass clazz = (EClass) tuple.get(1);
		if (element==null || element.eClass() != clazz)
			throw new UnsupportedOperationException(tuple.toString());
		// TODO not entirely correct
		if (!dummyResource.getContents().remove(element))
			throw new UnsupportedOperationException(tuple.toString());
		return tuple;
	}

	@Override
	public Tuple assertTuple(Tuple seed) {
		//final EObject element = (EObject) seed.get(0);
		final EClass clazz = (EClass) seed.get(1);
		if (seed.get(0) != null || clazz == null) 
			throw new IllegalArgumentException(seed.toString());

		EObject instance = clazz.getEPackage().getEFactoryInstance().create(clazz);
		dummyResource.getContents().add(instance);
		
		return new FlatTuple(instance, clazz);
	}

}
