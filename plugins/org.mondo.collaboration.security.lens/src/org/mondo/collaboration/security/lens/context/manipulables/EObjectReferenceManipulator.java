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
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.mondo.collaboration.security.lens.emf.ModelFactInputKey;
import org.mondo.collaboration.security.lens.emf.ModelIndexer;

/**
 * @author Bergmann Gabor
 * @see ModelFactInputKey#REFERENCE_KEY
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
    public IInputKey getInputKey() {
        return ModelFactInputKey.REFERENCE_KEY;
    }

	@Override
	public Tuple retractTuple(Tuple tuple) {
		final EObject element = (EObject) tuple.get(0);
		final EReference feature = (EReference) tuple.get(1);
		final EObject value = (EObject) tuple.get(2);
		if (element == null || feature == null || value == null) 
			throw new UnsupportedOperationException(tuple.toString());
		
		if (feature.isContainment()) {
			unroot(tuple, value, feature, element);
		} else if (feature.isContainer()) {
			unroot(tuple, element, feature.getEOpposite(), value);
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
			move(seed, element, feature, value);
		} else if (feature.isContainer()) {
			move(seed, value, feature.getEOpposite(), element);
		} else {
			EObjectAttributeManipulator.assertFeatureSetting(element, feature, value);
		}
		return seed;
	}

	private void move(Tuple tuple, final EObject newContainer, final EReference feature, final EObject containedObject) {
//		if (feature.isResolveProxies()) { 
//			if (newContainer.eResource() != containedObject.eResource())
//				throw new UnsupportedOperationException("Cross-resource containment not supported yet: " + tuple);
////			// explicitly workaround cross-resource containment by moving to destination resource first
////			final Resource destinationResource = newContainer.eResource();
////			model.cheapMoveTo(containedObject, destinationResource, destinationResource.getContents());
//		}
		model.cheapMoveTo(containedObject, newContainer, feature);
	}

	private void unroot(Tuple tuple, final EObject containedObject, final EReference oldContainmentReference, final EObject oldContainer)
			throws UnsupportedOperationException 
	{
		if (containedObject.eContainer() != oldContainer)
			throw new UnsupportedOperationException(tuple.toString());
//		EReference oldContainmentFeature = containedElement.eContainmentFeature();
//		if (oldContainmentReference != null && oldContainmentReference.isResolveProxies()) {
//			if (newContainer.eResource() != containedObject.eResource())
//				throw new UnsupportedOperationException("Cross-resource containment not supported yet: " + tuple);
////			// explicitly workaround cross-resource containment by moving to departure resource root first
////			final Resource departureResource = oldContainer.eResource();
////			model.cheapMoveTo(containedObject, departureResource, departureResource.getContents());
//		}
		model.cheapUnroot(containedObject);
	}
	
}
