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

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.matchers.tuple.TupleMask;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.SetMultimap;

/**
 * Maintains a set of Tuples, and builds indexes on it on demand.
 * @author Bergmann Gabor
 *
 */
public class LiveTable {
	
	private Set<Tuple> tuples = new LinkedHashSet<>();
	private Map<TupleMask, Index> indexes = new HashMap<>();
	private Map<TupleMask, Dispatcher> dispatchers = new HashMap<>();
	
	public boolean addTuple(Tuple t) {
		final boolean changed = tuples.add(t);
		if (changed) {
			dispatchUpdate(t, true);
		}
		return changed;
	}
	public boolean removeTuple(Tuple t) {
		final boolean changed = tuples.remove(t);
		if (changed) {
			dispatchUpdate(t, false);
		}
		return changed;
	}
	
	public Set<Tuple> getTuplesForSeed(Tuple seed) {
		Index index = getOrCreateIndex(seedToMask(seed));
		return index.get(seed);
	}
	
	public boolean addListener(Tuple seed, Listener listener) {
		Dispatcher dispatcher = getOrCreateDispatcher(seedToMask(seed));
		return dispatcher.addListener(seed, listener);
	}
	public boolean removeListener(Tuple seed, Listener listener) {
		Dispatcher dispatcher = getOrCreateDispatcher(seedToMask(seed));
		return dispatcher.removeListener(seed, listener);
	}

	private Index getOrCreateIndex(TupleMask mask) {
		Index index = indexes.get(mask);
		if (index == null) {
			index = new Index(mask);
			indexes.put(mask, index);
			for (Tuple tuple : tuples) {
				index.update(tuple, true);
			}
		}
		return index;
	}
	private Dispatcher getOrCreateDispatcher(TupleMask mask) {
		Dispatcher dispatcher = dispatchers.get(mask);
		if (dispatcher == null) {
			dispatcher = new Dispatcher(mask);
			dispatchers.put(mask, dispatcher);
		}
		return dispatcher;
	}
	private void dispatchUpdate(Tuple t, boolean addition) {
		for (Index index : indexes.values()) {
			index.update(t, addition);			
		}
		for (Dispatcher dispatcher : dispatchers.values()) {
			dispatcher.update(t, addition);
		}
	}
	private TupleMask seedToMask(Tuple seed) {
		final int arity = seed.getSize();
		boolean[] keep = new boolean[arity];
		for (int i = 0; i < arity; ++i)
			keep[i] = (null != seed.get(i));
		return new TupleMask(keep);
	}
	
	/**
	 * Callback interface that is notified of tuple updates. 
	 * Invocations indicate the tuple and an additional boolean set to true for addition and false for removal of tuple.
	 * @author Bergmann Gabor
	 */
	public static interface Listener extends BiConsumer<Tuple, Boolean> {}
	
	private class Index {
		private SetMultimap<Tuple, Tuple> tuplesBySignature = LinkedHashMultimap.<Tuple, Tuple>create();
		private TupleMask mask;

		public Index(TupleMask mask) {
			this.mask = mask;
		}

		public Set<Tuple> get(Tuple seed) {
			final Tuple signature = mask.transform(seed);
			return tuplesBySignature.get(signature);
		}

		public void update(Tuple t, boolean addition) {
			final Tuple signature = mask.transform(t);
			if (addition)
				tuplesBySignature.put(signature, t);
			else
				tuplesBySignature.remove(signature, t);
		}
	}
	
	private class Dispatcher {
		private SetMultimap<Tuple, Listener> listenersBySignature = LinkedHashMultimap.<Tuple, Listener>create();
		private TupleMask mask;

		public Dispatcher(TupleMask mask) {
			super();
			this.mask = mask;
		}
		
		public void update(Tuple t, boolean addition) {
			final Tuple signature = mask.transform(t);
			for (Listener listener : listenersBySignature.get(signature)) {
				listener.accept(t, addition);
			}
		}
		
		public boolean addListener(Tuple seed, Listener listener) {
			return listenersBySignature.put(mask.transform(seed), listener);
		}
		public boolean removeListener(Tuple seed, Listener listener) {
			return listenersBySignature.remove(mask.transform(seed), listener);
		}
		
	}

}
