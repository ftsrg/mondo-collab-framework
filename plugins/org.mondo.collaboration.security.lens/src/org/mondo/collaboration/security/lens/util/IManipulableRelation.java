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

package org.mondo.collaboration.security.lens.util;

import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;

/**
 * Represents a write-only interface of a dynamic set of {@link Tuple}s. 
 * <p> Contained tuples consist of non-null elements. 
 * 
 * <p> Any operation may be refused by throwing an {@link UnsupportedOperationException},
 *  e.g. if some elements of the argument to {@link #assertTuple(Tuple)} can't be null. 
 *  
 * @author Bergmann Gabor
 *
 */
public interface IManipulableRelation {

	/**
	 * Removes one given tuple from the relation, filling out any null fields with non-null values.
	 * @param seed a tuple that binds values to some fields of the newly inserted tuple, to influence what tuple should actually be removed
	 * @return the tuple that was actually removed, consisting of non-null elements (and conforming to the seed where the seed is non-null)
	 */
	public Tuple retractTuple(Tuple seed);
	
	/**
	 * Adds the given tuple to the relation, filling out any null fields with non-null values.
	 * @param seed a tuple that binds values to some fields of the newly inserted tuple, to influence what tuple should actually be added
	 * @return the tuple that was actually inserted, consisting of non-null elements (and conforming to the seed where the seed is non-null)
	 */
	public Tuple assertTuple(Tuple seed);
}
