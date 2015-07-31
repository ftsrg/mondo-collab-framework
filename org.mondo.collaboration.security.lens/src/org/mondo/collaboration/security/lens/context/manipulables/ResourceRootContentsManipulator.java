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

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;

/**
 * @author Bergmann Gabor
 *
 */
public class ResourceRootContentsManipulator extends AbstractEMFManipulable {

	/**
	 * @param root
	 */
	public ResourceRootContentsManipulator(Notifier root) {
		super(root);
	}

	@Override
	public boolean retractTuple(Tuple tuple) {
		final Resource resource = (Resource) tuple.get(0);
		return resource.getContents().remove(tuple.get(1));
		// TODO preserve root element?
	}

	@Override
	public Tuple assertTuple(Tuple seed) {
		final Resource resource = (Resource) seed.get(0);
		resource.getContents().add((EObject) seed.get(1));
		return seed;
		// TODO preserve root element?
	}

}
