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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.scope.IEngineContext;
import org.eclipse.incquery.runtime.api.scope.IIndexingErrorListener;
import org.eclipse.incquery.runtime.api.scope.IncQueryScope;
import org.eclipse.incquery.runtime.matchers.context.IInputKey;
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
import org.mondo.collaboration.security.lens.context.manipulables.DebugManipulable;
import org.mondo.collaboration.security.lens.emf.ModelIndexer;
import org.mondo.collaboration.security.lens.util.ILiveRelation;
import org.mondo.collaboration.security.lens.util.IManipulableRelation;
import org.mondo.collaboration.security.lens.util.LiveTable;

/**
 * Scope for the query engine driving the lens transformations.
 * 
 * <p> Equals and hashcode are not overridden - do not reinstantiate!
 * 
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


//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((arbiter == null) ? 0 : arbiter.hashCode());
//		result = prime * result + ((correspondenceTables == null) ? 0 : correspondenceTables.hashCode());
//		result = prime * result + ((frontIndexer == null) ? 0 : frontIndexer.hashCode());
//		result = prime * result + ((goldIndexer == null) ? 0 : goldIndexer.hashCode());
//		return result;
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (!(obj instanceof MondoLensScope))
//			return false;
//		MondoLensScope other = (MondoLensScope) obj;
//		if (arbiter == null) {
//			if (other.arbiter != null)
//				return false;
//		} else if (!arbiter.equals(other.arbiter))
//			return false;
//		if (correspondenceTables == null) {
//			if (other.correspondenceTables != null)
//				return false;
//		} else if (!correspondenceTables.equals(other.correspondenceTables))
//			return false;
//		if (frontIndexer == null) {
//			if (other.frontIndexer != null)
//				return false;
//		} else if (!frontIndexer.equals(other.frontIndexer))
//			return false;
//		if (goldIndexer == null) {
//			if (other.goldIndexer != null)
//				return false;
//		} else if (!goldIndexer.equals(other.goldIndexer))
//			return false;
//		return true;
//	}


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
	
	
	private Map<IInputKey, ? extends ILiveRelation> queriables;
	public Map<IInputKey, ? extends ILiveRelation> getQueriables() {
		if (queriables == null) {
			queriables = 
					createQueriables(getArbiter(), getGoldIndexer(), getFrontIndexer(), getCorrespondenceTables());
		}
		return queriables;
	}
	private Map<IInputKey, ? extends IManipulableRelation> manipulables;
	public Map<IInputKey, ? extends IManipulableRelation> getManipulables() {
		if (manipulables == null) {
			manipulables = 
					createManipulables(getArbiter(), getGoldIndexer(), getFrontIndexer(), getCorrespondenceTables());
		}
		return manipulables;
	}
	
	private Map<IInputKey, ? extends ILiveRelation> createQueriables(SecurityArbiter arbiter,
			ModelIndexer goldIndexer, ModelIndexer frontIndexer,
			Map<CorrespondenceKey, LiveTable> correspondenceTables) 
	{
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
		return liveRelations;
	}
	
	private Map<IInputKey, ? extends IManipulableRelation> createManipulables(SecurityArbiter arbiter,
			ModelIndexer goldIndexer, ModelIndexer frontIndexer,
			Map<CorrespondenceKey, LiveTable> correspondenceTables) 
	{
		final Notifier frontRoot = frontIndexer.getRoot();
		final Notifier goldRoot = goldIndexer.getRoot();

		Map<IInputKey, IManipulableRelation> manipulables = new HashMap<IInputKey, IManipulableRelation>();
		
		manipulables.putAll(correspondenceTables);
//		manipulables.put(EObjectAttributeKey.FRONT, new EObjectAttributeManipulator(frontRoot));
//		manipulables.put(EObjectAttributeKey.GOLD, new EObjectAttributeManipulator(goldRoot));
//		manipulables.put(EObjectKey.FRONT, new EObjectManipulator(frontRoot));            
//		manipulables.put(EObjectKey.GOLD, new EObjectManipulator(goldRoot));              
//		manipulables.put(EObjectReferenceKey.FRONT, new EObjectReferenceManipulator(frontRoot));            
//		manipulables.put(EObjectReferenceKey.GOLD, new EObjectReferenceManipulator(goldRoot));              
//		manipulables.put(ResourceKey.FRONT, new ResourceManipulator(frontRoot));            
//		manipulables.put(ResourceKey.GOLD, new ResourceManipulator(goldRoot));              
//		manipulables.put(ResourceRootContentsKey.FRONT, new ResourceRootContentsManipulator(frontRoot));            
//		manipulables.put(ResourceRootContentsKey.GOLD, new ResourceRootContentsManipulator(goldRoot));              

		new DebugManipulable(EObjectAttributeKey.FRONT).putInto(manipulables);
		new DebugManipulable(EObjectAttributeKey.GOLD).putInto(manipulables);			
		new DebugManipulable(EObjectKey.FRONT).putInto(manipulables);					
		new DebugManipulable(EObjectKey.GOLD).putInto(manipulables);						
		new DebugManipulable(EObjectReferenceKey.FRONT).putInto(manipulables);			
		new DebugManipulable(EObjectReferenceKey.GOLD).putInto(manipulables);			
		new DebugManipulable(ResourceKey.FRONT).putInto(manipulables);					
		new DebugManipulable(ResourceKey.GOLD).putInto(manipulables);					
		new DebugManipulable(ResourceRootContentsKey.FRONT).putInto(manipulables);		
		new DebugManipulable(ResourceRootContentsKey.GOLD).putInto(manipulables);		
		
		return manipulables;
	}

}
