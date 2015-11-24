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
 * Static helper for URI confinement.
 * @author Bergmann Gabor
 *
 */
public class URIConfinementHelper {
	/**
	 * If the checked URI is within the confines (hierarchical namespace) of the given base URI, returns the resolved URI. 
	 * Otherwise, throws an exception.
	 */
	public static URI uriToRelativePathConfinementChecked(
			URI checkedURI, 
			URI baseURI, 
			boolean pluginURIAllowed, 
			String uriNameInException) throws URIConfinementException 
	{
		final URI relative = checkedURI.deresolve(baseURI, false, true, true);
		if (!relative.isRelative() ||
		        (relative.segmentCount() > 0 && (
		                ".".equals(relative.segment(0)) || 
		                "..".equals(relative.segment(0))
		        ))
		    ) 
		{  // wow, a non-confined reference
			
			// are plugin absolute URIs allowed?
			if (! (pluginURIAllowed && relative.isPlatformPlugin())) {
				// this is breaking the sandbox...
				throw new URIConfinementException(relative, baseURI, uriNameInException);
				// TODO handle better, e.g. return null and skip resource entirely.				
			}
			
		}
		return relative;
	}
}
