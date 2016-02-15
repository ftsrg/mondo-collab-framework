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

package org.mondo.collaboration.security.lens.correspondence;

import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Derives element IDs based on their EMF URIs. 
 * If a base URI is given, the local URI relative to that base URI is considered, and the ID function is only applicable to URIs relative to that base.
 * @author Bergmann Gabor
 */
public class URIBasedIDFunction extends ComposableIDFunction {
	
	private URI baseURI; 
	
	/**
	 * @param baseURI the root URI, or null if no relativisation is to be done
	 */
	public URIBasedIDFunction(URI baseURI) {
		super();
		this.baseURI = baseURI;
	}


	@Override
	public Object tryApply(EObject input) {
		final Resource eResource = input.eResource();
		if (eResource == null) return null;
		
		final String uriFragment = eResource.getURIFragment(input);
		
		URI resourceURI = eResource.getURI();
		if (resourceURI == null) return null;
		
		if (baseURI != null) {
			resourceURI = resourceURI.deresolve(baseURI, false, true, true);
			if (resourceURI == null || !resourceURI.isRelative()) return null;
		}
		
		return resourceURI.toString() + "#" + uriFragment;
	}


	@Override
	public Object generateUniqueId(EObject input, Set<Object> reserved) {
		return null;
	}


	@Override
	public void setUniqueId(EObject target, Object uniqueId) {
		return;		
	}

}
