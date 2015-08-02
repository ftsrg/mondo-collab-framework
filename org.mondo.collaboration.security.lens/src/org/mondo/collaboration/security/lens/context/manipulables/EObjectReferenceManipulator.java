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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.mondo.collaboration.security.lens.context.keys.EObjectReferenceKey;
import org.mondo.collaboration.security.lens.emf.ModelIndexer;

/**
 * @author Bergmann Gabor
 * @see EObjectReferenceKey
 *
 */
public class EObjectReferenceManipulator extends BaseEMFManipulable {


	/**
	 * @param model
	 */
	public EObjectReferenceManipulator(ModelIndexer model) {
		super(model);
	}

	@Override
	public Tuple retractTuple(Tuple tuple) {
		final EObject element = (EObject) tuple.get(0);
		final EReference feature = (EReference) tuple.get(1);
		final EObject value = (EObject) tuple.get(2);
		if (element == null || feature == null || value == null) 
			throw new UnsupportedOperationException(tuple.toString());
		
		if (feature.isContainment()) {
			if (value.eContainer() != element)
				throw new UnsupportedOperationException(tuple.toString());
			model.cheapMoveTo(value, dummyResource, dummyResource.getContents());
		} else {
			EObjectAttributeManipulator.retractFeatureSetting(element, feature, value);
		}
		return tuple;
		
	}

	@Override
	public Tuple assertTuple(Tuple seed) {
		final EObject element = (EObject) seed.get(0);
		final EReference feature = (EReference) seed.get(1);
		final EObject value = (EObject) seed.get(2);
		if (element == null || feature == null || value == null) 
			throw new UnsupportedOperationException(seed.toString());
		
		if (feature.isContainment()) {
			model.cheapMoveTo(value, element, feature);
		} else {
			EObjectAttributeManipulator.assertFeatureSetting(element, feature, value);
		}
		return seed;
	}

}
