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

import java.util.Map;

import org.eclipse.incquery.runtime.matchers.context.IInputKey;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.mondo.collaboration.security.lens.util.IManipulableRelation;

/**
 * @author Bergmann Gabor
 *
 */
public class DebugManipulable implements IManipulableRelation {
	
	final IInputKey key;
	
	public DebugManipulable(IInputKey key) {
		super();
		this.key = key;
	}

	public void putInto(Map<IInputKey, IManipulableRelation> manipulables) {
		manipulables.put(key, this);
	}
	
	@Override
	public boolean retractTuple(Tuple tuple) {
		System.out.println(
				"\t\t" + 
				key.getPrettyPrintableName() + 
				"\t\t-- " + 
				tuple);
		return true;
	}

	@Override
	public Tuple assertTuple(Tuple seed) {
		Object[] elements = seed.getElements().clone();
		for (int i=0; i< elements.length; ++i)
			if (elements[i] == null)
				elements[i] = "unique_" + ++nextID;
		final FlatTuple inserted = new FlatTuple(elements);
		System.out.println(
				"\t\t" + 
				key.getPrettyPrintableName() + 
				"\t\t++ " + 
				seed + 
				" --> " + 
				inserted);
		return inserted;
	}
	
	static long nextID = 0;

}
