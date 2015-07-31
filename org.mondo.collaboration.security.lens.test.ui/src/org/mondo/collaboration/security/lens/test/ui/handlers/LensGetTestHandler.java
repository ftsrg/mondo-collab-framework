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
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.mondo.collaboration.security.lens.bx.RelationalLensXform;
import org.mondo.collaboration.security.lens.context.MondoLensScope;
import org.mondo.collaboration.security.macl.xtext.mondoAccessControlLanguage.AccessControlModel;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.Role;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.User;

/**
 * @author Bergmann Gabor
 *
 */
public class LensGetTestHandler extends AbstractLensTestHandler {

	@Override
	protected void doTest(MondoLensScope scope, IFile policyFile, IFile goldFile, IFile frontFile,
			Resource policyResource, Resource goldResource, Resource frontResource) throws Exception 
	{
		final AccessControlModel policyModel = (AccessControlModel) policyResource.getContents().get(0);
		User user = null;
		for (Role role : policyModel.getRoles()) {
			if ("bob".equals(role.getName())) {
				user = (User) role;
			}
		}
		if (user == null) 
			throw new IllegalStateException("no bob found");
		
		RelationalLensXform lens = new RelationalLensXform(scope, user);
		
		IncQueryEngine iqEngine = IncQueryEngine.on(scope);
		for (IQuerySpecification query : lens.getQueries()) {
			printMatchSet(iqEngine.getMatcher(query));
		}
		
		///
		lens.doGet();
		
	}
	
	private void printMatchSet(IncQueryMatcher<? extends IPatternMatch> matcher) {
		System.out.println();
		System.out.println("-----------------");
		System.out.println("Matches of query: " + matcher.getPatternName());
		for (IPatternMatch match : matcher.getAllMatches()) {
			System.out.println("\t" + match.prettyPrint());
		}
	}

}
