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

import java.util.Set;
import java.util.function.BiConsumer;

import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;

/**
 * Represents a read-only live view of a dynamic set of {@link Tuple}s. 
 * 
 * <p> Contained tuples that conform to a given <i>seed</i> can be queried. Listeners can be registered that are notified of changes to the relation.  
 * <p> Contained tuples consist of non-null elements. Returned results are filtered by seeds, which are tuples potentially containing null elements.  
 * A contained tuple conforms to the given seed iff it matches every non-null element of the seed tuple.
 * @author Bergmann Gabor
 *
 */
public interface ILiveRelation {

	/**
	 * Retrieves the set of all tuples that conform to the given <i>seed</i>.
	 * @param seed a tuple potentially containing null values, used to restrict the output. 
	 * @return the set of tuples of the relation that match every non-null element of the seed tuple (and take arbitrary values where the corresponding field of the seed is null).
	 */
	Set<Tuple> getTuplesForSeed(Tuple seed);

	
	/**
	 * Callback interface that is notified of tuple updates. 
	 * Invocations indicate the tuple and an additional boolean set to true for addition and false for removal of tuple.
	 * @author Bergmann Gabor
	 */
	public static interface Listener extends BiConsumer<Tuple, Boolean> {}
	
	/**
	 * Registers a listener for future updates to the relation.
	 * <p> The listener will be notified whenever the result of {@link #getTuplesForSeed(Tuple)} changes (for the given seed). 
	 * @param seed filters the set of tuples for which notification is delivered. 
	 * @param listener the listener to be registered
	 * @return true if the listener was new
	 */
	boolean addListener(Tuple seed, Listener listener);

	/**
	 * Unregisters a listener from future updates to the relation.
	 * @param seed filters the set of tuples for which notification is delivered. 
	 * @param listener the listener to be unregistered
	 * @return true if the listener was registered for the given seed
	 */
	boolean removeListener(Tuple seed, Listener listener);

}