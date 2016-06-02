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

package org.mondo.collaboration.security.lens.correspondence;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey;
import org.mondo.collaboration.security.lens.context.manipulables.DebuggableManipulableWrapper;
import org.mondo.collaboration.security.lens.emf.ModelIndexer;
import org.mondo.collaboration.security.lens.util.LiveTable;

import com.google.common.base.Function;
import com.google.common.collect.Multimaps;
// * Maintains weak references, unlike Google Collect's BiMap.

/**
 * Responsible for initializing correspondence tables between resources.
 * @author Bergmann Gabor
 *
 */
public class EObjectCorrespondence {


	/**
	 * Assigns unique ID to objects for establishing correspondence.
	 * Never return null; return the argument if no ID is available.
	 */
	public interface UniqueIDScheme extends Function<EObject, Object> {

		/**
		 * Generate unique ID for a newly created objects
		 */
		public Object generateUniqueId(EObject input, Set<Object> reserved);

		/**
		 * Set the unique ID to the target object
		 */
		public void setUniqueId(EObject target, Object uniqueId);

	}
	/**
	 * Returns an ID scheme relative to a given BaseURI.
	 */
	public interface UniqueIDSchemeFactory extends Function<URI, UniqueIDScheme> {}

	/**
	 * @return the unique ID provider factory registered via the extension point org.mondo.collaboration.security.lens.uniqueIDSchemeFactory
	 */
	public static UniqueIDSchemeFactory getRegisteredIDProviderFactory() throws CoreException {
		if (! Platform.isRunning()) {
			throw new IllegalStateException("Platform not started yet.");
		}
		IConfigurationElement[] configurationElements =
				Platform.getExtensionRegistry().getConfigurationElementsFor(SCHEME_FACTORY_EXTENSION_POINT);
		System.out.println("Found extensions to " + SCHEME_FACTORY_EXTENSION_POINT + ": " + configurationElements.length);
		for (IConfigurationElement contribution : configurationElements) {
			System.out.println("\t " + contribution.getDeclaringExtension().getUniqueIdentifier() + " --> " + contribution);
			Object executableExtension = contribution.createExecutableExtension("scheme-factory-class");
			return (UniqueIDSchemeFactory) executableExtension;
		}
		return DefaultEMFUniqueIDFunctions.Factory.INSTANCE;
	}
	/**
	 * @param uniqueIDSchemeExtension the extension ID of the unique ID scheme to get
	 * @return the unique ID provider factory registered via the extension point org.mondo.collaboration.security.lens.uniqueIDSchemeFactory with the given extension ID, or null if not found
	 *
	 */
	public static UniqueIDSchemeFactory getRegisteredIDProviderFactory(String uniqueIDSchemeExtension) throws CoreException {
		if (! Platform.isRunning()) {
			throw new IllegalStateException("Platform not started yet.");
		}
		IConfigurationElement[] configurationElements =
				Platform.getExtensionRegistry().getConfigurationElementsFor(SCHEME_FACTORY_EXTENSION_POINT);
			System.out.println("Found extensions to " + SCHEME_FACTORY_EXTENSION_POINT + ": " + configurationElements.length);
			for (IConfigurationElement contribution : configurationElements) {
			System.out.println("\t " + contribution.getDeclaringExtension().getUniqueIdentifier() + " --> " + contribution);
			if (uniqueIDSchemeExtension.equals(contribution.getDeclaringExtension().getUniqueIdentifier())) {
				Object executableExtension = contribution.createExecutableExtension("scheme-factory-class");
			    return (UniqueIDSchemeFactory) executableExtension;
			}
		}
		// Not found
		return null;
	}
	private static final String SCHEME_FACTORY_EXTENSION_POINT = "org.mondo.collaboration.security.lens.uniqueIDSchemeFactory";

	public static Map<Object, Collection<EObject>> applyObjectToUniqueIdentifier(
			ModelIndexer indexer,
			UniqueIDScheme objectToUniqueIdentifier) {

		return Multimaps.index(indexer.getAllEObjects(), objectToUniqueIdentifier).asMap();
	}

	/**
	 * Builds a correspondence table between two models based on unique identifiers.
	 */
	public static LiveTable buildEObjectCorrespondenceTable(
			Map<Object, Collection<EObject>> goldIndex,
			Map<Object, Collection<EObject>> frontIndex)
	{
		final LiveTable table = new LiveTable();
		DebuggableManipulableWrapper manipulable = new DebuggableManipulableWrapper(table, CorrespondenceKey.EOBJECT);

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
				manipulable.assertTuple(tuple);
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
