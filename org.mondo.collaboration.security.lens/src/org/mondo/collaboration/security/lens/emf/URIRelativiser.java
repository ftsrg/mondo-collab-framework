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

/**
 * A facility for converting URIs relative to a base URI.
 * @author Bergmann Gabor
 *
 */
public class URIRelativiser {
	private URI baseURI;
	
	public URIRelativiser(URI baseURI) {
		super();
		this.baseURI = baseURI;
	}
	
	public URI uriToRelativePath(URI resourceURI) {
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
	public URI relativePathToURI(URI relativeURI) {
		return relativeURI.resolve(baseURI, false);
	}
	
}
