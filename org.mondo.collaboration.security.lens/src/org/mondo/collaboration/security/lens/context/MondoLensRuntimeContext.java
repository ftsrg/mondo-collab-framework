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
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

import org.eclipse.incquery.runtime.matchers.context.IInputKey;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.mondo.collaboration.security.lens.arbiter.Asset;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter.OperationKind;
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey;
import org.mondo.collaboration.security.lens.context.keys.EObjectAttributeKey;
import org.mondo.collaboration.security.lens.context.keys.EObjectKey;
import org.mondo.collaboration.security.lens.context.keys.EObjectReferenceKey;
import org.mondo.collaboration.security.lens.context.keys.ResourceKey;
import org.mondo.collaboration.security.lens.context.keys.ResourceRootContentsKey;
import org.mondo.collaboration.security.lens.context.keys.SecurityJudgementKey;
import org.mondo.collaboration.security.lens.emf.ModelIndexer;
import org.mondo.collaboration.security.lens.util.ILiveRelation;
import org.mondo.collaboration.security.lens.util.LiveTable;
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
		return create(engineContext, scope.getArbiter(), scope.getGoldIndexer(), scope.getFrontIndexer(), scope.getCorrespondenceTables());
	}
	private static MondoLensRuntimeContext create(MondoLensEngineContext engineContext, SecurityArbiter arbiter, ModelIndexer goldIndexer, ModelIndexer frontIndexer, Map<CorrespondenceKey, LiveTable> correspondenceTables) {
		Map<IInputKey, ILiveRelation> liveRelations = new HashMap<IInputKey, ILiveRelation>();
		
		liveRelations.putAll(correspondenceTables);
		liveRelations.put(EObjectAttributeKey.FRONT, frontIndexer.getIndexedEObjectAttributes());
		liveRelations.put(EObjectAttributeKey.GOLD, goldIndexer.getIndexedEObjectAttributes());
		liveRelations.put(EObjectKey.FRONT, frontIndexer.getIndexedEObjects());
		liveRelations.put(EObjectKey.GOLD, goldIndexer.getIndexedEObjects());
		liveRelations.put(EObjectReferenceKey.FRONT, frontIndexer.getIndexedEObjectReferences());
		liveRelations.put(EObjectReferenceKey.GOLD, goldIndexer.getIndexedEObjectReferences());
		liveRelations.put(ResourceKey.FRONT, frontIndexer.getIndexedResources());
		liveRelations.put(ResourceKey.GOLD, goldIndexer.getIndexedResources());
		liveRelations.put(ResourceRootContentsKey.FRONT, frontIndexer.getIndexedResourceRootContents());
		liveRelations.put(ResourceRootContentsKey.GOLD, goldIndexer.getIndexedResourceRootContents());
		for (Class<? extends Asset> assetClass : Asset.getKinds()) {
			for (OperationKind op : OperationKind.values()) {
				ILiveRelation liveRelation = arbiter.getResultsAsLiveRelation(op, assetClass);
				final SecurityJudgementKey key = new SecurityJudgementKey(op, assetClass);
				liveRelations.put(key, liveRelation);
			}
		}		
		return new MondoLensRuntimeContext(engineContext, liveRelations);
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


	
	
}
