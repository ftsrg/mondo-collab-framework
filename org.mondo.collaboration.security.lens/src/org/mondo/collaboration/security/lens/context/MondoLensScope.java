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

import java.util.Map;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.scope.IEngineContext;
import org.eclipse.incquery.runtime.api.scope.IIndexingErrorListener;
import org.eclipse.incquery.runtime.api.scope.IncQueryScope;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter;
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey;
import org.mondo.collaboration.security.lens.emf.ModelIndexer;
import org.mondo.collaboration.security.lens.util.LiveTable;

/**
 * Scope for the query engine driving the lens transformations
 * @author Bergmann Gabor
 *
 */
public class MondoLensScope extends IncQueryScope {
	
	private SecurityArbiter arbiter;
	private ModelIndexer goldIndexer;
	private ModelIndexer frontIndexer;
	private Map<CorrespondenceKey, LiveTable> correspondenceTables;


	public MondoLensScope(SecurityArbiter arbiter, ModelIndexer goldIndexer, ModelIndexer frontIndexer, Map<CorrespondenceKey, LiveTable> correspondenceTables) {
		this.arbiter = arbiter;
		this.goldIndexer = goldIndexer;
		this.frontIndexer = frontIndexer;
		this.correspondenceTables = correspondenceTables;
	}
	

	@Override
	protected IEngineContext createEngineContext(IncQueryEngine engine, IIndexingErrorListener errorListener, org.apache.log4j.Logger logger) {
		return new MondoLensEngineContext(this, engine, errorListener, logger);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arbiter == null) ? 0 : arbiter.hashCode());
		result = prime * result + ((correspondenceTables == null) ? 0 : correspondenceTables.hashCode());
		result = prime * result + ((frontIndexer == null) ? 0 : frontIndexer.hashCode());
		result = prime * result + ((goldIndexer == null) ? 0 : goldIndexer.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof MondoLensScope))
			return false;
		MondoLensScope other = (MondoLensScope) obj;
		if (arbiter == null) {
			if (other.arbiter != null)
				return false;
		} else if (!arbiter.equals(other.arbiter))
			return false;
		if (correspondenceTables == null) {
			if (other.correspondenceTables != null)
				return false;
		} else if (!correspondenceTables.equals(other.correspondenceTables))
			return false;
		if (frontIndexer == null) {
			if (other.frontIndexer != null)
				return false;
		} else if (!frontIndexer.equals(other.frontIndexer))
			return false;
		if (goldIndexer == null) {
			if (other.goldIndexer != null)
				return false;
		} else if (!goldIndexer.equals(other.goldIndexer))
			return false;
		return true;
	}


	public SecurityArbiter getArbiter() {
		return arbiter;
	}


	public ModelIndexer getGoldIndexer() {
		return goldIndexer;
	}


	public ModelIndexer getFrontIndexer() {
		return frontIndexer;
	}


	public Map<CorrespondenceKey, LiveTable> getCorrespondenceTables() {
		return correspondenceTables;
	}
	
	
	

}
