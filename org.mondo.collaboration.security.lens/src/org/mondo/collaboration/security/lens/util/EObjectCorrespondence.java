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

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

import org.eclipse.emf.ecore.EObject;

/**
 * Maintains weak references, unlike Google Collect's BiMap.
 * 
 * @author Bergmann Gabor
 *
 */
public class EObjectCorrespondence {
	
	private WeakHashMap<EObject, WeakReference<EObject>> sourceToTarget = new WeakHashMap<EObject, WeakReference<EObject>>();
	private WeakHashMap<EObject, WeakReference<EObject>> targetToSource = new WeakHashMap<EObject, WeakReference<EObject>>();
	
	public EObject getTarget(EObject source) {
		WeakReference<EObject> weakReference = sourceToTarget.get(source);
		if (weakReference != null) 
			return weakReference.get(); 
		else 
			return null;
	}
	
	public EObject getSource(EObject target) {
		WeakReference<EObject> weakReference = targetToSource.get(target);
		if (weakReference != null) 
			return weakReference.get(); 
		else 
			return null;
	}
	/**
	 * Add this mapping, and forcibly removes any pre-existing mapping for the same elements.
	 * @return true if the mapping was changed as a consequence.
	 */
	public boolean addMapping(EObject source, EObject target) {
		WeakReference<EObject> oldTrgRef = 
				sourceToTarget.put(source, new WeakReference<EObject>(target));
		WeakReference<EObject> oldSrcRef = 
				targetToSource.put(target, new WeakReference<EObject>(source));
		
		boolean changed = true;
		
		if (oldTrgRef != null) {
			final EObject oldTrg = oldTrgRef.get();
			if (oldTrg != null) {
				if (oldTrg == target) {
					changed = false;
				} else {
					targetToSource.remove(oldTrg);
				}
			}
		}
		if (oldSrcRef != null) {
			final EObject oldSrc = oldSrcRef.get();
			if (oldSrc != null) {
				if (oldSrc == source) {
					changed = false;
				} else {
					targetToSource.remove(oldSrc);
				}
			}
		}
		return changed;
	}
	
}
