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

package org.mondo.collaboration.security.lens.util.uri;

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
		final URI relative = 
				URIConfinementHelper.uriToRelativePathConfinementChecked(resourceURI, baseURI, true, 
						"Resource URI");
		return relative;
	}

	public URI relativePathToURI(URI relativeURI) {
		return relativeURI.resolve(baseURI, false);
	}
	
	
}
