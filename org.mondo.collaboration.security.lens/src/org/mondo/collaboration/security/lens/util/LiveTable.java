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
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

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
	
	public boolean addTuple(Tuple t) {
		final boolean changed = tuples.add(t);
		if (changed) {
			dispatchNotify(t, true);
		}
		return changed;
	}
	public boolean removeTuple(Tuple t) {
		final boolean changed = tuples.remove(t);
		if (changed) {
			dispatchNotify(t, false);
		}
		return changed;
	}

	public Set<Tuple> getTuplesForSeed(Tuple seed) {
		Index index = getOrCreateIndex(seedToMask(seed));
		return index.get(seed);
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
	private void dispatchNotify(Tuple t, boolean addition) {
		for (Iterator<Index> iterator = indexes.values().iterator(); iterator.hasNext();) {
			Index index = iterator.next();
			index.update(t, addition);
		}
		// TODO external notifications
	}
	private TupleMask seedToMask(Tuple seed) {
		final int arity = seed.getSize();
		boolean[] keep = new boolean[arity];
		for (int i = 0; i < arity; ++i)
			keep[i] = (null != seed.get(i));
		return new TupleMask(keep);
	}
	
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

}
