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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;

/**
 * The input keys of various model fact kinds.
 * @author Bergmann Gabor
 *
 */
public enum ModelFactInputKey implements IInputKey {
    /**
     * Tuples of 
     * ({@link EObject}, {@link EClass}).
     */
    EOBJECT_KEY,
    /**
     * Tuples of 
     * ({@link EObject}, {@link EReference}, {@link EObject}).
     */
    REFERENCE_KEY,
    /**
     * Tuples of 
     * ({@link EObject}, {@link EAttribute}, attribute slot value).
     */
    ATTRIBUTE_KEY,
    /**
     * Tuples of 
     * ({@link Resource}, relative path).
     */
    RESOURCE_KEY,
    /**
     * Tuples of 
     * ({@link Resource}, {@link EObject}).
     */
    RESOURCE_ROOT_CONTENTS_KEY;

    @Override
    public String getPrettyPrintableName() {
        return getStringID();
    }

    @Override
    public boolean isEnumerable() {
        return true;
    }

    @Override
    public String getStringID() {
        return toString();
    }

    @Override
    public int getArity() {
       switch (this) {
       case EOBJECT_KEY:
       case RESOURCE_KEY:
       case RESOURCE_ROOT_CONTENTS_KEY:
           return 2;
       case ATTRIBUTE_KEY:
       case REFERENCE_KEY:
           return 3;
       default:
           throw new IllegalArgumentException();
       }
    }

}
