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

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.incquery.runtime.base.api.BaseIndexOptions;
import org.eclipse.incquery.runtime.base.comprehension.EMFModelComprehension;
import org.mondo.collaboration.security.lens.util.ILiveRelation;
import org.mondo.collaboration.security.lens.util.LiveTable;

/**
 * Connects a given EMF model to the security lens.
 * <p> The EMF model is indexed and exposed as {@link LiveTable}s.
 * 
 * @author Bergmann Gabor
 *
 */
public class ModelIndexer {
	private ResourceSet root;
	//private Resource unrootedElements = new XMIResourceImpl();
	private URI baseURI;
	
	public ModelIndexer(URI baseURI, ResourceSet root) {
		super();
		this.root = root;
		this.baseURI = baseURI;

		this.uriRelativiser = new URIRelativiser(baseURI);
		
		final EMFAdapter emfAdapter = new EMFAdapter(this);
		this.adapter = emfAdapter;
		emfAdapter.addAdapter(root);
		
		root.eAdapters().add(adapter);
	}
	
	EMFModelComprehension comprehension = new EMFModelComprehension(new BaseIndexOptions(false, true));
	URIRelativiser uriRelativiser;
	Resource dummyResource = new ResourceImpl();
	
	LiveTable indexedResources = new LiveTable();
	LiveTable indexedResourceRootContents = new LiveTable(); 
	LiveTable indexedEObjects = new LiveTable(); 
	LiveTable indexedEObjectReferences = new LiveTable(); 
	LiveTable indexedEObjectAttributes = new LiveTable();
	
	public URI getBaseURI() {
		return baseURI;
	}
	public URIRelativiser getUriRelativiser() {
		return uriRelativiser;
	}

	public ResourceSet getRoot() {
		return root;
	}
	
	/**
	 * A dummy resource that contains unrooted elements, 
	 * 	i.e. model element created by a transformation but not yet placed in the actual containment hierarchy of the model, 
	 * or elements removed from the containment hierarchy but not yet deleted.  
	 */
	public Resource getDummyResource() {
		return dummyResource;
	}
	public ILiveRelation getIndexedResources() {
		return indexedResources;
	}
	public ILiveRelation getIndexedResourceRootContents() {
		return indexedResourceRootContents;
	}
	public ILiveRelation getIndexedEObjects() {
		return indexedEObjects;
	}
	public ILiveRelation getIndexedEObjectReferences() {
		return indexedEObjectReferences;
	}
	public ILiveRelation getIndexedEObjectAttributes() {
		return indexedEObjectAttributes;
	} 
	
	
	private EMFAdapter adapter;
	
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public void cheapMoveTo(EObject element, Notifier parent, EList targetContainmentReferenceList) {
    	if (element.eAdapters().contains(adapter) && parent.eAdapters().contains(adapter)) {
     		adapter.ignoreInsertionAndDeletion = element;
	    	try {
	    		targetContainmentReferenceList.add(element);
	    	} finally {
	        	adapter.ignoreInsertionAndDeletion = null;
	    	}
    	} else {
    		targetContainmentReferenceList.add(element);
    	}
    }
    
    @SuppressWarnings("rawtypes")
	public void cheapMoveTo(EObject element, EObject parent, EReference containmentFeature) {
    	if (containmentFeature.isMany())
    		cheapMoveTo(element, parent, (EList)parent.eGet(containmentFeature));
    	else if (element.eAdapters().contains(adapter) &&
    			parent.eAdapters().contains(adapter)) 
    	{
     		adapter.ignoreInsertionAndDeletion = element;
	    	try {
	    		parent.eSet(containmentFeature, element);
	    	} finally {
	        	adapter.ignoreInsertionAndDeletion = null;
	    	}
		} else {
			parent.eSet(containmentFeature, element);
		}
    }


}
