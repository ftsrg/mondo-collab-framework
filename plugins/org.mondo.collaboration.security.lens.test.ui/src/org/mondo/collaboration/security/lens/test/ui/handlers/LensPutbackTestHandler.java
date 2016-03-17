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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.mondo.collaboration.security.lens.bx.RelationalLensXform;
import org.mondo.collaboration.security.lens.context.MondoLensScope;

/**
 * @author Bergmann Gabor
 *
 */
public class LensPutbackTestHandler extends AbstractLensTestHandler {

	@Override
	protected void doTest(MondoLensScope scope, IFile policyFile, IFile goldFile, IFile frontFile,
			Resource policyResource, Resource goldResource, Resource frontResource) throws Exception 
	{
		RelationalLensXform lens = setupLensForBob(scope, policyResource);
		
		ViatraQueryEngine iqEngine = IncQueryEngine.on(scope);
		for (IQuerySpecification query : lens.getQueries()) {
			printMatchSet(iqEngine.getMatcher(query));
		}
		
		///
		lens.doPutback(true);
	}

}
