///*******************************************************************************
// * Copyright (c) 2004-2015 Gabor Bergmann and Daniel Varro
// * All rights reserved. This program and the accompanying materials
// * are made available under the terms of the Eclipse Public License v1.0
// * which accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// *
// * Contributors:
// *    Gabor Bergmann - initial API and implementation
// *******************************************************************************/
//
//package org.mondo.collaboration.security.lens.correspondence;
//
//import org.eclipse.emf.ecore.EAnnotation;
//import org.eclipse.emf.ecore.EFactory;
//import org.eclipse.emf.ecore.ENamedElement;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.EPackage;
//
///**
// * Provides unique ID to Ecore models.
// * @author Bergmann Gabor
// *
// */
//public class EcoreUniqueIDFunction extends ComposableIDFunction {
//	@Override
//	public Object tryApply(EObject input) {
//		if (input instanceof EPackage) {
//			return ((EPackage) input).getNsURI();
//		} 
//		if (input instanceof EFactory) {
//			final EFactory eFactory = (EFactory) input;
//			return "Factory$" + apply(eFactory.getEPackage());
//		}
//		if (input instanceof EAnnotation) {
//			final EAnnotation annotation = (EAnnotation) input;
//			return annotation.getSource() + "@$" + apply(annotation.getEModelElement());
//		}
//		if (input instanceof ENamedElement) {
//			final ENamedElement named = (ENamedElement) input;
//			return named.getName() + "$$" + apply(named.eContainer());
//		}
//		return null;
//	}
//}