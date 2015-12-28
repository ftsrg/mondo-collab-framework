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

package org.mondo.collaboration.security.lens.context.keys;

import org.mondo.collaboration.security.lens.emf.ModelFactInputKey;

/**
 * Wraps an input key of either the front or the gold model.
 * @author Bergmann Gabor
 *
 */
public class CollabLensModelInputKey implements CollabLensInputKey {
    
    private ModelFactInputKey wrappedKey;
    private WhichModel whichModel;
    

    @Override
    public String getPrettyPrintableName() {
        return getStringID();
    }

    @Override
    public String getStringID() {
        return whichModel + "$" + wrappedKey;
    }

    @Override
    public int getArity() {
        return wrappedKey.getArity();
    }

    @Override
    public boolean isEnumerable() {
        return wrappedKey.isEnumerable();
    }
    
    /**
     * @param wrappedKey
     * @param whichModel
     */
    public CollabLensModelInputKey(ModelFactInputKey wrappedKey, WhichModel whichModel) {
        super();
        this.wrappedKey = wrappedKey;
        this.whichModel = whichModel;
    }

    public ModelFactInputKey getWrappedKey() {
        return wrappedKey;
    }

    public WhichModel getWhichModel() {
        return whichModel;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((whichModel == null) ? 0 : whichModel.hashCode());
        result = prime * result + ((wrappedKey == null) ? 0 : wrappedKey.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof CollabLensModelInputKey)) {
            return false;
        }
        CollabLensModelInputKey other = (CollabLensModelInputKey) obj;
        if (whichModel != other.whichModel) {
            return false;
        }
        if (wrappedKey != other.wrappedKey) {
            return false;
        }
        return true;
    }
    
    

}
