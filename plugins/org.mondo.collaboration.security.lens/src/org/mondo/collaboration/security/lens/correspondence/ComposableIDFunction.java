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

import java.util.Set;

import org.eclipse.emf.ecore.EObject;

/**
 * Unique ID function, several of which can be assembled (using {@link #dispatchTo(ComposableIDFunction...)}) 
 * 	to form a part of a composite strategy. 
 * <p> If no provided strategy matches, then the default object reference is used as the identifier function. 
 * See {@link ElseComplain} if the scheme needs to be strict instead and complain for unmatched elements.
 * 
 * @author Bergmann Gabor
 * 
 *
 */
public abstract class ComposableIDFunction implements EObjectCorrespondence.UniqueIDScheme {

	@Override
	public Object apply(EObject input) {
		Object result = tryApply(input);
		return result == null ? input : result;
	}
	
	/**
	 * Assign unique ID to objects for establishing correspondence. 
	 * Same as {@link #apply(EObject)}, except that it returns null if no ID is available, 
	 * so that function can be composed with others that may be applicable to this input.
	 */
	public abstract Object tryApply(EObject input);
	
	/**
	 * Form a composite ID strategy that dispatches ID application attempts to the given component functions.
	 * The first function to be applicable (in the order provided) will yield the result of the composite function. 
	 */
	public static ComposableIDFunction dispatchTo(final ComposableIDFunction... components) {
		return new DispatchingIDFunction(components);
	}

	private static class DispatchingIDFunction extends ComposableIDFunction {
		private final ComposableIDFunction[] components;
		
		private DispatchingIDFunction(ComposableIDFunction[] components) {
			this.components = components;
		}
		
		@Override
		public Object tryApply(EObject input) {
			for (ComposableIDFunction component : components) {
				Object result = component.tryApply(input);
				if (result != null) return result;
			}
			return null;
		}

		@Override
		public Object generateUniqueId(EObject input, Set<Object> reserved) {
			for (ComposableIDFunction component : components) {
				Object result = component.generateUniqueId(input, reserved);
				if (result != null) return result;
			}
			return null;
		}

		@Override
		public void setUniqueId(EObject target, Object uniqueId) {
			for (ComposableIDFunction component : components) {
				component.setUniqueId(target, uniqueId);
			}
		}
	}
	
	public static class ElseComplain extends ComposableIDFunction {
	    @Override
	    public Object tryApply(EObject input) {
	        throw new IllegalArgumentException("No unique identifier could be constructed for " + input);
	    }

		@Override
		public Object generateUniqueId(EObject input, Set<Object> reserved) {
		    throw new IllegalArgumentException("No unique identifier could be generated for " + input);
		}

		@Override
		public void setUniqueId(EObject target, Object uniqueId) {
		    throw new IllegalArgumentException("Unique identifier could not be set for " + target);
		}
	}
}
