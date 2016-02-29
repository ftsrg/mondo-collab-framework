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

import org.apache.log4j.Logger;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.scope.IBaseIndex;
import org.eclipse.incquery.runtime.api.scope.IEngineContext;
import org.eclipse.incquery.runtime.api.scope.IIndexingErrorListener;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.context.IQueryRuntimeContext;

/**
 * @author Bergmann Gabor
 *
 */
public class MondoLensEngineContext implements IEngineContext {


	private MondoLensScope scope;
	private IncQueryEngine engine;
	private IIndexingErrorListener errorListener;
	private Logger logger;

	private MondoLensRuntimeContext runtimeContext;
	private MondoLensBaseIndex baseIndex;

	public MondoLensEngineContext(MondoLensScope scope, IncQueryEngine engine,
			IIndexingErrorListener errorListener, Logger logger) {
				this.scope = scope;
				this.engine = engine;
				this.errorListener = errorListener;
				this.logger = logger;
	}

	@Override
	public IBaseIndex getBaseIndex() throws IncQueryException {
		return getBaseIndexInternal();
	}

	IBaseIndex getBaseIndexInternal() {
		if (baseIndex == null) {
			baseIndex = new MondoLensBaseIndex(scope);
		}
		return baseIndex;
	}

	@Override
	public void initializeBackends(IQueryBackendInitializer initializer) throws IncQueryException {
		initializer.initializeWith(getRuntimeContext());
	}
//	@Override
//	public IQueryRuntimeContext getQueryRuntimeContext() throws IncQueryException {
//		return getRuntimeContext();
//	}

	private IQueryRuntimeContext getRuntimeContext() {
		if (runtimeContext == null) {
			runtimeContext = MondoLensRuntimeContext.create(this, scope);
		}
		return runtimeContext;
	}

	@Override
	public void dispose() {

	}


}
