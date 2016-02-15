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

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * Provides unique ID to Ecore models.
 * @author Bergmann Gabor
 *
 */
public class EcoreUniqueIDFunction extends ComposableIDFunction {
	@Override
	public Object tryApply(EObject input) {
		if (input instanceof EPackage) {
			final String nsURI = ((EPackage) input).getNsURI();
			if (nsURI != null) return nsURI + "$$Package";
		} else if (input instanceof EFactory) {
			final EFactory eFactory = (EFactory) input;
			final Object parentURI = tryApply(eFactory.getEPackage());
			if (parentURI instanceof String) return parentURI + "$$Factory";
		} else if (input instanceof EAnnotation) {
			final EAnnotation annotation = (EAnnotation) input;
			final Object parentURI = tryApply(annotation.getEModelElement());
			if (parentURI instanceof String) return parentURI + "$$@" + annotation.getSource();
		} else if (input instanceof ENamedElement) {
			final ENamedElement named = (ENamedElement) input;
			final Object parentURI = tryApply(named.eContainer());
			if (parentURI instanceof String) return parentURI + "$$/" + named.eClass().getName() + ":" + named.getName();
		} else if (input instanceof EGenericType) {
			final EGenericType genType = (EGenericType) input;
			final Object parentURI = tryApply(genType.eContainer());
			final Object rawURI = tryApply(genType.getERawType());
			if (parentURI instanceof String && rawURI instanceof String) 
				return parentURI + "$$GenericType<>" + rawURI;
		}
		return null;
	}

	@Override
	public Object generateUniqueId(EObject input, Set<Object> reserved) {
		return null;
	}

	@Override
	public void setUniqueId(EObject target, Object uniqueId) {
		return;
	}
}