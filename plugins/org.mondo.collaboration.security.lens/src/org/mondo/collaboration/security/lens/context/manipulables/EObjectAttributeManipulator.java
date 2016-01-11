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

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.incquery.runtime.matchers.context.IInputKey;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.mondo.collaboration.security.lens.emf.ModelFactInputKey;
import org.mondo.collaboration.security.lens.emf.ModelIndexer;

/**
 * @author Bergmann Gabor
 * @see ModelFactInputKey#ATTRIBUTE_KEY 
 */
public class EObjectAttributeManipulator extends BaseEMFManipulable {


	/**
	 * @param model
	 */
	public EObjectAttributeManipulator(ModelIndexer model) {
		super(model);
	}
	
	@Override
	public IInputKey getInputKey() {
	    return ModelFactInputKey.ATTRIBUTE_KEY;
	}

	@Override
	public Tuple retractTuple(Tuple tuple) {
		final EObject element = (EObject) tuple.get(0);
		final EStructuralFeature feature = (EStructuralFeature) tuple.get(1);
		final Object value = tuple.get(2);
		if (element == null || feature == null || value == null) 
			throw new UnsupportedOperationException(tuple.toString());
		
		retractFeatureSetting(element, feature, value);
		
		return tuple;
	}

	public static void retractFeatureSetting(final EObject element, final EStructuralFeature feature, final Object value) {
		if (feature.isMany()) {
			if (((Collection) element.eGet(feature)).remove(value)) return;
		} else {
			Object oldValue = element.eGet(feature);
			if (value.equals(oldValue)) {
				element.eUnset(feature);
				return;
			}
		}
		throw new UnsupportedOperationException(new FlatTuple(element, feature, value).toString());
	}

	@Override
	public Tuple assertTuple(Tuple seed) {
		final EObject element = (EObject) seed.get(0);
		final EStructuralFeature feature = (EStructuralFeature) seed.get(1);
		final Object value = seed.get(2);
		if (element == null || feature == null || value == null) 
			throw new UnsupportedOperationException(seed.toString());
		
		assertFeatureSetting(element, feature, value);
		
		return seed;
	}

	public static void assertFeatureSetting(final EObject element, final EStructuralFeature feature, final Object value) {
		if (feature.isMany()) {
			((Collection) element.eGet(feature)).add(value);
		} else {
			element.eSet(feature, value);
		}
	}

}
