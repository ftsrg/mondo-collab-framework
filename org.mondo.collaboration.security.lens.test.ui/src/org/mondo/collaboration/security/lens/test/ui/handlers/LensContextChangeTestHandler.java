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

package org.mondo.collaboration.security.lens.test.ui.handlers;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.runtime.matchers.context.IInputKey;
import org.eclipse.incquery.runtime.matchers.context.IQueryRuntimeContextListener;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.mondo.collaboration.security.lens.context.MondoLensRuntimeContext;
import org.mondo.collaboration.security.lens.context.MondoLensScope;
import org.mondo.collaboration.security.lens.context.keys.CorrespondenceKey;

/**
 * @author Bergmann Gabor
 *
 */
public class LensContextChangeTestHandler extends AbstractLensTestHandler {

	@Override
	protected void doTest(MondoLensScope scope, IFile policyFile, IFile goldFile, IFile frontFile,
			Resource policyResource, Resource goldResource, Resource frontResource) {
		MondoLensRuntimeContext runtimeContext = MondoLensRuntimeContext.create(null, scope);
		
		for (IInputKey key : runtimeContext.getInputKeys()) {
			final FlatTuple nullSeed = new FlatTuple(new Object[key.getArity()]);
			runtimeContext.addUpdateListener(key, nullSeed, listener);
		}
		
		scope.getCorrespondenceTables().get(CorrespondenceKey.EOBJECT).addTupleDirect(new FlatTuple("NEWLY", "ADDED"));
		
		EPackage goldPackage = (EPackage) goldResource.getContents().get(0);
		final EClassifier bClass = goldPackage.getEClassifier("B");
		goldPackage.getEClassifiers().remove(bClass);
		
		for (IInputKey key : runtimeContext.getInputKeys()) {
			final FlatTuple nullSeed = new FlatTuple(new Object[key.getArity()]);
			runtimeContext.removeUpdateListener(key, nullSeed, listener);
		}
	}

	IQueryRuntimeContextListener listener = new IQueryRuntimeContextListener() {
		@Override
		public void update(IInputKey key, Tuple updateTuple, boolean isInsertion) {
			System.out.println(
				String.format("\t%s key %s: tuple %s",
						isInsertion ? "inserted into" : "removed from",
						key.getPrettyPrintableName(),
						updateTuple
				)
			);
		}
	};
	
}
