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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence.UniqueIDScheme;
import org.mondo.collaboration.security.lens.correspondence.EObjectCorrespondence.UniqueIDSchemeFactory;

/**
 * Provides a default unique ID function for EMF models.
 * <p> Mechanism: <ul>
 * <li> For elemnts under a given base URI string, constructs a relative URI as unique ID.
 * <li> For other elements, uses their absolute URI string if available.
 * <li> For elements not in a {@link Resource} or in one without an URI, defaults to the element itself.
 * </ul>
 * @author Bergmann Gabor
 *
 */
public class DefaultEMFUniqueIDFunctions {
	
	public static ComposableIDFunction forBaseURI(URI baseURI) {
		return ComposableIDFunction.dispatchTo(
				new EcoreUniqueIDFunction(),
				new URIBasedIDFunction(baseURI), 
				new URIBasedIDFunction(null));
	}
	
	public static enum Factory implements UniqueIDSchemeFactory {
		INSTANCE;

		@Override
		public UniqueIDScheme apply(URI input) {
			return DefaultEMFUniqueIDFunctions.forBaseURI(input);
		}
	}

}
