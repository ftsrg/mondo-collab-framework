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

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import com.google.common.collect.Multimaps;
// * Maintains weak references, unlike Google Collect's BiMap.

/**
 * 
 * @author Bergmann Gabor
 *
 */
public class EObjectCorrespondence {

	/**
	 * Builds a correspondence table between two models based on unique identifiers.
	 */
	public static LiveTable buildEObjectCorrespondenceTable(
			ResourceSet goldModel, ResourceSet frontModel,
			final Function<EObject, Object> objectToUniqueIdentifier) {
		final LiveTable table = new LiveTable();
		
		Map<Object, Collection<EObject>> goldIndex = 
				Multimaps.index(Iterators.filter(goldModel.getAllContents(), EObject.class), objectToUniqueIdentifier).asMap();
		Map<Object, Collection<EObject>> frontIndex = 
				Multimaps.index(Iterators.filter(frontModel.getAllContents(), EObject.class), objectToUniqueIdentifier).asMap();
		
		for (Entry<Object, Collection<EObject>> goldEntry : goldIndex.entrySet()) {
			final Collection<EObject> golds = goldEntry.getValue();
			final Object goldKey = goldEntry.getKey();
			checkIndexBucket("GOLD", goldKey, golds);
			
			Collection<EObject> fronts = frontIndex.get(goldKey);
			if (fronts != null) {
				checkIndexBucket("FRONT", goldKey, fronts);
				FlatTuple tuple = new FlatTuple(
						golds.iterator().next(),
						fronts.iterator().next());
				table.updateTuple(tuple, true);
			}
		}
		
		return table;
	}

	static void checkIndexBucket(final String modelName, final Object indexKey, final Collection<EObject> indexValues) {
		if (indexValues.size() != 1) {
			throw new IllegalStateException(String.format(
					"Error establishing correspondence in %s model : " +
					" unique key %s associated with %d values %s", 
					modelName,
					indexKey.toString(),
					indexValues.size(),
					indexValues.toArray().toString()
				));					
		}
	}
	
//	private WeakHashMap<EObject, WeakReference<EObject>> sourceToTarget = new WeakHashMap<EObject, WeakReference<EObject>>();
//	private WeakHashMap<EObject, WeakReference<EObject>> targetToSource = new WeakHashMap<EObject, WeakReference<EObject>>();
//	
//	public EObject getTarget(EObject source) {
//		WeakReference<EObject> weakReference = sourceToTarget.get(source);
//		if (weakReference != null) 
//			return weakReference.get(); 
//		else 
//			return null;
//	}
//	
//	public EObject getSource(EObject target) {
//		WeakReference<EObject> weakReference = targetToSource.get(target);
//		if (weakReference != null) 
//			return weakReference.get(); 
//		else 
//			return null;
//	}
//	/**
//	 * Add this mapping, and forcibly removes any pre-existing mapping for the same elements.
//	 * @return true if the mapping was changed as a consequence.
//	 */
//	public boolean addMapping(EObject source, EObject target) {
//		WeakReference<EObject> oldTrgRef = 
//				sourceToTarget.put(source, new WeakReference<EObject>(target));
//		WeakReference<EObject> oldSrcRef = 
//				targetToSource.put(target, new WeakReference<EObject>(source));
//		
//		boolean changed = true;
//		
//		if (oldTrgRef != null) {
//			final EObject oldTrg = oldTrgRef.get();
//			if (oldTrg != null) {
//				if (oldTrg == target) {
//					changed = false;
//				} else {
//					targetToSource.remove(oldTrg);
//				}
//			}
//		}
//		if (oldSrcRef != null) {
//			final EObject oldSrc = oldSrcRef.get();
//			if (oldSrc != null) {
//				if (oldSrc == source) {
//					changed = false;
//				} else {
//					targetToSource.remove(oldSrc);
//				}
//			}
//		}
//		return changed;
//	}
	
}
