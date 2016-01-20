/*******************************************************************************
 * Copyright (c) 2004-2016 Gabor Bergmann and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabor Bergmann - initial API and implementation
 *******************************************************************************/

package org.mondo.collaboration.security.lens.bx.offline;

/**
 * The offline security lens was parameterized incorrectly.
 * @author Bergmann Gabor
 *
 */
public class OfflineLensParametrizationException extends IllegalArgumentException {

    /**
     * 
     */
    private static final long serialVersionUID = -986962121356053657L;

    /**
     * @param s
     */
    public OfflineLensParametrizationException(String s) {
        super(s);
    }

    
    
}
