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

package org.mondo.collaboration.security.lens.context.manipulables;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.mondo.collaboration.security.lens.emf.ModelIndexer;
import org.mondo.collaboration.security.lens.util.IManipulableRelation;

/**
 * Abstract base class of EMF manipulables.
 * @author Bergmann Gabor
 *
 */
public abstract class BaseEMFManipulable extends BaseKeyAwareManipulable implements IManipulableRelation {

	ModelIndexer model;
	ResourceSet root;
//	Resource dummyResource;

	public BaseEMFManipulable(ModelIndexer model) {
		super();
		this.model = model;
//		this.dummyResource = model.getDummyResource();
		this.root = model.getRoot();
	}

}
