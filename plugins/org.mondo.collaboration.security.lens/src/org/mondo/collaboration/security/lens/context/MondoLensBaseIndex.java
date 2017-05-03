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
import java.util.concurrent.Callable;

import org.eclipse.viatra.query.runtime.api.scope.IBaseIndex;
import org.eclipse.viatra.query.runtime.api.scope.IIndexingErrorListener;
import org.eclipse.viatra.query.runtime.api.scope.IInstanceObserver;
import org.eclipse.viatra.query.runtime.api.scope.ViatraBaseIndexChangeListener;

/**
 * @author Bergmann Gabor
 *
 */
public class MondoLensBaseIndex implements IBaseIndex {

	private MondoLensScope scope;

	public MondoLensBaseIndex(MondoLensScope scope) {
		this.scope = scope;
	}

	@Override
	public <V> V coalesceTraversals(Callable<V> callable) throws InvocationTargetException {
		try {
			return callable.call();
		} catch (Exception e) {
			throw new InvocationTargetException(e);
		}
	}

	@Override
	public void addBaseIndexChangeListener(ViatraBaseIndexChangeListener listener) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeBaseIndexChangeListener(ViatraBaseIndexChangeListener listener) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void resampleDerivedFeatures() {
	}

	@Override
	public boolean addIndexingErrorListener(IIndexingErrorListener listener) {
		return true;
	}

	@Override
	public boolean removeIndexingErrorListener(IIndexingErrorListener listener) {
		return true;
	}

	@Override
	public boolean addInstanceObserver(IInstanceObserver observer, Object observedObject) {
		return true;
	}

	@Override
	public boolean removeInstanceObserver(IInstanceObserver observer, Object observedObject) {
		return true;
	}

}
