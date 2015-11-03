/*******************************************************************************
 * Copyright (c) 2010-2015, Ádám Szigethy, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Ádám Szigethy - initial API and implementation
 *******************************************************************************/
package org.mondo.collaboration.security.lens.test.algorithm;

import static org.junit.Assert.*;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import es.ikerlan.WTSpec4M.WTSpec4MFactory;
import es.ikerlan.WTSpec4M.WTSystem;

/**
 * @author Ádám Szigethy
 *
 */
public class DenyOverridesTest extends AbstractTestBase {

    @Before
    public void setUp() throws Exception {
        initGoldModel();
        initFrontModel();
        initPolicyModel();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws IncQueryException {
        
        execute(Type.GET);        
    
    }

    private void initGoldModel() {
        goldResourceSet = new ResourceSetImpl();
        Resource goldResource = goldResourceSet.createResource(goldConfinementURI);
        
        WTSystem system = WTSpec4MFactory.eINSTANCE.createWTSystem();
        //TODO: create model
        
        goldResource.getContents().add(system);
    }
    
    private void initFrontModel() {
        frontResourceSet = new ResourceSetImpl();
        frontResourceSet.createResource(frontConfinementURI);
    }
    
    private void initPolicyModel() {
        //TODO: implement this method
    }
}
