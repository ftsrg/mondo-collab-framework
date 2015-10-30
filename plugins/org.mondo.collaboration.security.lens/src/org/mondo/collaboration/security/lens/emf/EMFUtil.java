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

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * Utility class for EMF manipulation.
 * @author Bergmann Gabor
 *
 */
public class EMFUtil {
	
	public static Resource getOrCreateResource(ResourceSet resourceSet, URI resourceURI) {
		if (resourceURI.isFile() && !(new File(resourceURI.toFileString()).exists())) {
			return resourceSet.createResource(resourceURI);			
		} else {
			return resourceSet.getResource(resourceURI, true);			
		}
		
	}

}
