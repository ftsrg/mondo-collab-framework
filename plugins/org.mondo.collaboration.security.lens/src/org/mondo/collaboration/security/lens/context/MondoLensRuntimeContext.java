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

package org.mondo.collaboration.security.lens.context;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

import org.eclipse.incquery.runtime.matchers.context.IInputKey;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.mondo.collaboration.security.lens.util.ILiveRelation;
import org.mondo.collaboration.security.lens.util.LiveTableBasedRuntimeContext;

/**
 * @author Bergmann Gabor
 *
 */
public class MondoLensRuntimeContext extends LiveTableBasedRuntimeContext {

	private MondoLensEngineContext engineContext;

	private MondoLensRuntimeContext(MondoLensEngineContext engineContext, Map<IInputKey, ? extends ILiveRelation> aggregatedTables) {
		super(MondoLensMetaContext.INSTANCE, aggregatedTables);
		this.engineContext = engineContext;
	}
	
	public static MondoLensRuntimeContext create(MondoLensEngineContext engineContext, MondoLensScope scope) {
		return new MondoLensRuntimeContext(engineContext, scope.getQueriables());
	}

	@Override
	public <V> V coalesceTraversals(Callable<V> callable) throws InvocationTargetException {
		return engineContext.getBaseIndexInternal().coalesceTraversals(callable);
	}

	@Override
	public boolean isCoalescing() {
		return false;
	}

	@Override
	public boolean isIndexed(IInputKey key) {
		return true;
	}

	@Override
	public void ensureIndexed(IInputKey key) {
	}

	@Override
	public Object wrapElement(Object externalElement) {
		return externalElement;
	}

	@Override
	public Object unwrapElement(Object internalElement) {
		return internalElement;
	}

	@Override
	public Tuple wrapTuple(Tuple externalElements) {
		return externalElements;
	}

	@Override
	public Tuple unwrapTuple(Tuple internalElements) {
		return internalElements;
	}


	public Set<IInputKey> getInputKeys() {
		return this.aggregatedTables.keySet();
	}
	
}
