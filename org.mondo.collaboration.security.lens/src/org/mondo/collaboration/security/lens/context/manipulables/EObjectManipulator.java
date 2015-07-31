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
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;

/**
 * @author Bergmann Gabor
 *
 */
public class EObjectManipulator extends AbstractEMFManipulable {

	public EObjectManipulator(Notifier root) {
		super(root);
	}

	@Override
	public boolean retractTuple(Tuple tuple) {
		return false;
	}

	@Override
	public Tuple assertTuple(Tuple seed) {
		// TODO Auto-generated method stub
		return null;
	}

}
