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
	private URI baseURI;
	private ResourceSet root;
	//private Resource unrootedElements = new XMIResourceImpl();
	
	public ModelIndexer(URI baseURI, ResourceSet root) {
		super();
		this.baseURI = baseURI;
		this.root = root;
		
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
	
	URI uriToRelativePath(URI resourceURI) {
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
	URI relativePathToURI(URI relativeURI) {
		return relativeURI.resolve(baseURI, false);
	}

}
