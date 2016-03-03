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
import java.util.Map.Entry;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.scope.IEngineContext;
import org.eclipse.incquery.runtime.api.scope.IIndexingErrorListener;
import org.eclipse.incquery.runtime.api.scope.IncQueryScope;
import org.eclipse.incquery.runtime.matchers.context.IInputKey;
import org.mondo.collaboration.security.lens.arbiter.Asset;
import org.mondo.collaboration.security.lens.arbiter.LockArbiter;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter.OperationKind;
import org.mondo.collaboration.security.lens.context.keys.CollabLensModelInputKey;
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey;
import org.mondo.collaboration.security.lens.context.keys.SecurityJudgementKey;
import org.mondo.collaboration.security.lens.context.keys.WhichModel;
import org.mondo.collaboration.security.lens.context.manipulables.BaseKeyAwareManipulable;
import org.mondo.collaboration.security.lens.context.manipulables.DebuggableManipulableWrapper;
import org.mondo.collaboration.security.lens.context.manipulables.EObjectAttributeManipulator;
import org.mondo.collaboration.security.lens.context.manipulables.EObjectManipulator;
import org.mondo.collaboration.security.lens.context.manipulables.EObjectReferenceManipulator;
import org.mondo.collaboration.security.lens.context.manipulables.ResourceManipulator;
import org.mondo.collaboration.security.lens.context.manipulables.ResourceRootContentsManipulator;
import org.mondo.collaboration.security.lens.emf.ModelFactInputKey;
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
	private LockArbiter lockArbiter;
	private ModelIndexer goldIndexer;
	private ModelIndexer frontIndexer;
	private Map<CorrespondenceKey, LiveTable> correspondenceTables;


	public MondoLensScope(SecurityArbiter arbiter, LockArbiter lockArbiter, ModelIndexer goldIndexer, ModelIndexer frontIndexer, Map<CorrespondenceKey, LiveTable> correspondenceTables) {
		this.arbiter = arbiter;
		this.lockArbiter = lockArbiter;
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

	public LockArbiter getLockArbiter() {
		return lockArbiter;
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
		
		for (ModelFactInputKey factInputKey : ModelFactInputKey.values()) {
            liveRelations.put(new CollabLensModelInputKey(factInputKey, WhichModel.GOLD), 
                    goldIndexer.getLiveIndexRelations().get(factInputKey));
            liveRelations.put(new CollabLensModelInputKey(factInputKey, WhichModel.FRONT), 
                    frontIndexer.getLiveIndexRelations().get(factInputKey));
        }
		
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
		Map<IInputKey, IManipulableRelation> manipulables = new HashMap<IInputKey, IManipulableRelation>();
		
		for (Entry<CorrespondenceKey, LiveTable> entry : correspondenceTables.entrySet()) {
			wrapForDebug(entry.getKey(), entry.getValue()).putInto(manipulables);
		}
		for (ModelFactInputKey modelFactKey : ModelFactInputKey.values()) {
            wrapForDebug(
                    new CollabLensModelInputKey(modelFactKey, WhichModel.GOLD), 
                    createManipulator(modelFactKey, goldIndexer)
            ).putInto(manipulables);
            wrapForDebug(
                    new CollabLensModelInputKey(modelFactKey, WhichModel.FRONT), 
                    createManipulator(modelFactKey, frontIndexer)
            ).putInto(manipulables);
        }
				
		return manipulables;
	}

    private IManipulableRelation createManipulator(ModelFactInputKey modelFactKey, ModelIndexer model) {
        switch(modelFactKey) {
        case ATTRIBUTE_KEY:
            return new EObjectAttributeManipulator(model);
        case EOBJECT_KEY:
            return new EObjectManipulator(model);
        case REFERENCE_KEY:
            return new EObjectReferenceManipulator(model);
        case RESOURCE_KEY:
            return new ResourceManipulator(model);
        case RESOURCE_ROOT_CONTENTS_KEY:
            return new ResourceRootContentsManipulator(model);
        default:
            throw new IllegalArgumentException();
        }
    }


    private static BaseKeyAwareManipulable wrapForDebug(IInputKey key, IManipulableRelation wrapped) {
		return new DebuggableManipulableWrapper(wrapped, key);
	}
}
