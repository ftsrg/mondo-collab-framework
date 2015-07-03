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

package org.mondo.collaboration.security.lens

import org.eclipse.xtend.lib.annotations.Data

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EAttribute

/**
 * @author Bergmann Gabor
 *
 */
abstract class Asset {	
    @Data public static class ObjectAsset extends Asset {
		EObject object
    }
    @Data public static class ReferenceAsset extends Asset {
		EObject source
		EReference reference
		EObject target
    }
    @Data public static class AttributeAsset extends Asset {
		EObject source
		EAttribute attribute
    }
}