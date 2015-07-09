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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.incquery.runtime.base.api.BaseIndexOptions;
import org.eclipse.incquery.runtime.base.comprehension.EMFModelComprehension;
import org.eclipse.incquery.runtime.base.comprehension.EMFVisitor;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.mondo.collaboration.security.lens.util.LiveTable;

/**
 * Connects a given EMF model to the security lens.
 * @author Bergmann Gabor
 *
 */
public class CollaborativeEMFModelIndexer {
	private URI baseURI;
	private ResourceSet root;
	//private Resource unrootedElements = new XMIResourceImpl();
	
	public CollaborativeEMFModelIndexer(URI baseURI, ResourceSet root) {
		super();
		this.baseURI = baseURI;
		this.root = root;
	}
	
	private LiveTable indexedResources = new LiveTable();
	private LiveTable indexedResourceRootContents = new LiveTable(); 
	private LiveTable indexedEObjects = new LiveTable(); 
	private LiveTable indexedEObjectReferences = new LiveTable(); 
	private LiveTable indexedEObjectAttributes = new LiveTable();
	
	public URI getBaseURI() {
		return baseURI;
	}
	public ResourceSet getRoot() {
		return root;
	}
	public LiveTable getIndexedResources() {
		return indexedResources;
	}
	public LiveTable getIndexedResourceRootContents() {
		return indexedResourceRootContents;
	}
	public LiveTable getIndexedEObjects() {
		return indexedEObjects;
	}
	public LiveTable getIndexedEObjectReferences() {
		return indexedEObjectReferences;
	}
	public LiveTable getIndexedEObjectAttributes() {
		return indexedEObjectAttributes;
	} 
	
	private EMFModelComprehension comprehension = new EMFModelComprehension(new BaseIndexOptions(false, true));
	
	private class Visitor extends EMFVisitor {

		private final boolean isInsertion;
		private final boolean isNotification;

		public Visitor(boolean isInsertion, boolean isNotification) {
			super(true);
			this.isInsertion = isInsertion;
			this.isNotification = isNotification;
		}
		
		@Override
		public boolean pruneSubtrees(Resource source) {
			return true;
		}
		@Override
		public boolean pruneFeature(EStructuralFeature feature) {
			return true;
		}
		
		@Override
		public void visitElement(EObject source) {
			Tuple t = new FlatTuple(source, source.eClass());
			updateIndex(indexedEObjects, t);
		}
		
		@Override
		public void visitResource(Resource resource) {
			Tuple t = new FlatTuple(resource, uriToRelativePath(resource.getURI()));
			updateIndex(indexedResources, t);
		}
		
		@Override
		public void visitTopElementInResource(Resource resource, EObject element) {
			Tuple t = new FlatTuple(resource, element);
			updateIndex(indexedResourceRootContents, t);
		}

		@Override
		public void visitAttribute(EObject source, EAttribute feature, Object target) {
			updateFeature(indexedEObjectAttributes, source, feature, target);
		}
		@Override
		public void visitInternalContainment(EObject source, EReference feature, EObject target) {
			updateFeature(indexedEObjectReferences, source, feature, target);
		}
		@Override
		public void visitNonContainmentReference(EObject source, EReference feature, EObject target) {
			updateFeature(indexedEObjectReferences, source, feature, target);
		}
		@Override
		public void visitProxyReference(EObject source, EReference reference, EObject targetObject, Integer position) {
			updateFeature(indexedEObjectReferences, source, reference, targetObject);
		}
		
		private void updateFeature(LiveTable index, EObject source, EStructuralFeature feature, Object target) {
			if (target!=null && feature.isChangeable() && !feature.isDerived() && (isNotification || source.eIsSet(feature))) {
				Tuple t = new FlatTuple(source, feature, target);
				updateIndex(index, t);
			}
		}
		private void updateIndex(final LiveTable index, Tuple t) {
			if (isInsertion)
				index.addTuple(t);
			else
				index.removeTuple(t);
		}
	}
	
	private EContentAdapter adapter = new EContentAdapter() {
		@Override
		protected void addAdapter(Notifier notifier) {
			traverseNotifier(notifier, true);
		}
		@Override
		protected void removeAdapter(Notifier notifier) {
			traverseNotifier(notifier, false);
		};
	
		private void traverseNotifier(Notifier notifier, boolean isInsertion) {
			final Visitor visitor = new Visitor(isInsertion, false);
			if (notifier instanceof Resource) {
				visitor.visitResource((Resource) notifier);
			} else if (notifier instanceof EObject) {
				final EObject eObject = (EObject) notifier;
				comprehension.traverseObject(visitor, eObject);
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
        	final Object oFeature = notification.getFeature();
			if (notifier instanceof ResourceSet) {
				// ignore
			} else {
				Object oldValue = notification.getOldValue();
				Object newValue = notification.getNewValue();
				final int eventType = notification.getEventType();
				if (notifier instanceof Resource) {
					handleResourceNotification((Resource)notifier, eventType, oldValue, newValue);
				} else {
					handleFeatureNotification((EObject)notifier, (EStructuralFeature)oFeature, eventType, oldValue, newValue);
				}
			}
		}
		
	};
	
	private URI uriToRelativePath(URI resourceURI) {
		final URI relative = resourceURI.deresolve(baseURI, false, true, true);
		if (!relative.isRelative()) { // wow, an absolute reference
			//if (relative.isFile() || relative.isPlatformResource() || relative.isArchive() || relative.host() != null) {
			if (! relative.isPlatformPlugin()) { // only plugin absolute URIs are allowed
				// this is breaking the sandbox...
				throw new IllegalArgumentException(
						"Resource URI: " + resourceURI + 
						"is trying to leave the confines of the base URI: " + baseURI);
				// TODO handle better, e.g. return null and skip resource entirely.
			}
		}
		return relative;
	}
	private URI relativePathToURI(URI relativeURI) {
		return relativeURI.resolve(baseURI, false);
	}

}
