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

package org.mondo.collaboration.security.lens.emf;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * @author Bergmann Gabor
 *
 */
class EMFAdapter extends EContentAdapter {
	private final ModelIndexer modelIndexer;

	EMFAdapter(ModelIndexer modelIndexer) {
		this.modelIndexer = modelIndexer;
	}

	@Override
	protected void addAdapter(Notifier notifier) {
		traverseNotifier(notifier, true);
	}

	@Override
	protected void removeAdapter(Notifier notifier) {
		traverseNotifier(notifier, false);
	}

	private void traverseNotifier(Notifier notifier, boolean isInsertion) {
		final Visitor visitor = new Visitor(modelIndexer, isInsertion, false);
		if (notifier instanceof Resource) {
			visitor.visitResource((Resource) notifier);
		} else if (notifier instanceof EObject) {
			final EObject eObject = (EObject) notifier;
			modelIndexer.comprehension.traverseObject(visitor, eObject);
			if (eObject.eContainer() == null) {
				final Resource resource = eObject.eResource();
				if (resource != null)
					visitor.visitTopElementInResource(resource, eObject);
			}
		}
	}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		final Object notifier = notification.getNotifier();
		if (notifier instanceof ResourceSet) {
			// ignore
		} else {
			Object oldValue = notification.getOldValue();
			Object newValue = notification.getNewValue();
			if (notifier instanceof Resource) {
				handleResourceNotification(notification, (Resource)notifier, oldValue, newValue);
			} else if (notifier instanceof EObject) {
				final Object oFeature = notification.getFeature();
				if (oFeature instanceof EStructuralFeature) {
					handleFeatureNotification(notification, (EObject)notifier, (EStructuralFeature)oFeature, oldValue, newValue);
				}
			}
		}
	}

	private void handleFeatureNotification(Notification notification, EObject notifier, EStructuralFeature feature,
			Object oldValue, Object newValue) 
	{
		switch (notification.getEventType()) {
		case Notification.ADD:
			updateFeature(notifier, feature, newValue, true);
			break;
		case Notification.ADD_MANY:
			for (Object element: (Collection<?>) newValue)
				updateFeature(notifier, feature, element, true);
			break;
		case Notification.REMOVE:
		case Notification.UNSET:
			updateFeature(notifier, feature, oldValue, false);
			break;
		case Notification.REMOVE_MANY:
			for (Object element: (Collection<?>) oldValue)
				updateFeature(notifier, feature, element, false);
			break;
		case Notification.RESOLVE:
		case Notification.SET:
			updateFeature(notifier, feature, oldValue, false);
			updateFeature(notifier, feature, newValue, true);
			break;
		default:
			// do nothing
		}
	}

	private void handleResourceNotification(Notification notification, Resource notifier, Object oldValue, Object newValue) {
		if (notification.getFeatureID(Resource.class) == Resource.RESOURCE__CONTENTS) {
			switch (notification.getEventType()) {
			case Notification.ADD:
				updateResourceRoot(notifier, newValue, true);
				break;
			case Notification.ADD_MANY:
				for (Object element: (Collection<?>) newValue)
					updateResourceRoot(notifier, element, true);
				break;
			case Notification.REMOVE:
				updateResourceRoot(notifier, oldValue, false);
				break;
			case Notification.REMOVE_MANY:
				for (Object element: (Collection<?>) oldValue)
					updateResourceRoot(notifier, element, false);
				break;
			case Notification.RESOLVE:
				updateResourceRoot(notifier, oldValue, false);
				updateResourceRoot(notifier, newValue, true);
				break;
			default:
				// do nothing
			}
		}
	}

	private void updateResourceRoot(Resource resource, Object topObject, boolean isInsertion) {
		if (topObject != null)
			modelIndexer.getIndexedResourceRootContents().updateTuple(new FlatTuple(resource, topObject), isInsertion);
	}
	
	private void updateFeature(EObject source, EStructuralFeature feature, Object value, boolean isInsertion) {
		if (value != null) {
			if (feature instanceof EReference)
				modelIndexer.getIndexedEObjectReferences().updateTuple(new FlatTuple(source, feature, value), isInsertion);
			else if (feature instanceof EAttribute)
				modelIndexer.getIndexedEObjectAttributes().updateTuple(new FlatTuple(source, feature, value), isInsertion);
		}			
	}


}