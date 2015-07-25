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

import java.util.Map;
import java.util.Set;

import org.eclipse.incquery.runtime.matchers.context.IInputKey;
import org.eclipse.incquery.runtime.matchers.context.IQueryMetaContext;
import org.eclipse.incquery.runtime.matchers.context.IQueryRuntimeContext;
import org.eclipse.incquery.runtime.matchers.context.IQueryRuntimeContextListener;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;

/**
 * A default implementation of runtime context that dispatches input keys to {@link ILiveRelation}s.
 * @author Bergmann Gabor
 *
 */
public abstract class LiveTableBasedRuntimeContext implements IQueryRuntimeContext {
	
	private IQueryMetaContext metacontext;
	protected Map<IInputKey, ? extends ILiveRelation> aggregatedTables;

	public LiveTableBasedRuntimeContext(IQueryMetaContext metacontext, Map<IInputKey, ? extends ILiveRelation> aggregatedTables) {
		super();
		this.metacontext = metacontext;
		this.aggregatedTables = ImmutableMap.copyOf(aggregatedTables);
	}

	@Override
	public IQueryMetaContext getMetaContext() {
		return metacontext;
	}
	
	private Set<Tuple> getTuples(IInputKey key, Tuple seed) {
		return aggregatedTables.get(key).getTuplesForSeed(seed);
	}

	@Override
	public int countTuples(IInputKey key, Tuple seed) {
		return getTuples(key, seed).size();
	}

	@Override
	public Iterable<Tuple> enumerateTuples(IInputKey key, Tuple seed) {
		return getTuples(key, seed);
	}


	@Override
	public Iterable<? extends Object> enumerateValues(IInputKey key, Tuple seed) {
		int i = 0;
		while (seed.get(i) != null) ++i;
		final int position = i;
		
		return Iterables.transform(getTuples(key, seed), new Function<Tuple, Object>() {
			@Override
			public Object apply(Tuple t) {
				return t.get(position);
			}
			
		});
	}

	@Override
	public boolean containsTuple(IInputKey key, Tuple seed) {
		return !getTuples(key, seed).isEmpty();
	}

	@Override
	public void addUpdateListener(final IInputKey key, Tuple seed, final IQueryRuntimeContextListener listener) {
		aggregatedTables.get(key).addListener(seed, new LiveTableListener(key, listener));
	}

	@Override
	public void removeUpdateListener(IInputKey key, Tuple seed, IQueryRuntimeContextListener listener) {
		aggregatedTables.get(key).removeListener(seed, new LiveTableListener(key, listener));
	}

	/**
	 * Has equals() and hashCode() based on its two fields, so instances created on-the-fly can be used as hashmap keys.
	 * @author Bergmann Gabor
	 *
	 */
	private static class LiveTableListener implements ILiveRelation.Listener {
		private final IInputKey key;
		private final IQueryRuntimeContextListener listener;

		private LiveTableListener(IInputKey key, IQueryRuntimeContextListener listener) {
			this.key = key;
			this.listener = listener;
		}

		@Override
		public void accept(Tuple t, Boolean u) {
			listener.update(key, t, u);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((key == null) ? 0 : key.hashCode());
			result = prime * result + ((listener == null) ? 0 : listener.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (!(obj instanceof LiveTableListener))
				return false;
			LiveTableListener other = (LiveTableListener) obj;
			if (key == null) {
				if (other.key != null)
					return false;
			} else if (!key.equals(other.key))
				return false;
			if (listener == null) {
				if (other.listener != null)
					return false;
			} else if (!listener.equals(other.listener))
				return false;
			return true;
		}
		
	}

	
}
