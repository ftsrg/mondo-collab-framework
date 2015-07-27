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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
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
	URIRelativiser uriRelativiser;
	
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
	
	LiveTable indexedResources = new LiveTable();
	LiveTable indexedResourceRootContents = new LiveTable(); 
	LiveTable indexedEObjects = new LiveTable(); 
	LiveTable indexedEObjectReferences = new LiveTable(); 
	LiveTable indexedEObjectAttributes = new LiveTable();
	
	public URI getBaseURI() {
		return baseURI;
	}
	public ResourceSet getRoot() {
		return root;
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
	
	EMFModelComprehension comprehension = new EMFModelComprehension(new BaseIndexOptions(false, true));
	
	private EContentAdapter adapter;
	

}
