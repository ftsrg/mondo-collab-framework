/*******************************************************************************
 * Copyright (c) 2010-2015, Adam Szigethy, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Adam Szigethy - initial API and implementation
 *******************************************************************************/
package org.mondo.collaboration.security.lens.test.algorithm;

import static org.junit.Assert.*;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import es.ikerlan.WTSpec4M.Subsystem;
import es.ikerlan.WTSpec4M.WTCtrl;
import es.ikerlan.WTSpec4M.WTCtrlInput;
import es.ikerlan.WTSpec4M.WTCtrlOutput;
import es.ikerlan.WTSpec4M.WTSpec4MFactory;
import es.ikerlan.WTSpec4M.WTSystem;

/**
 * @author Adam Szigethy
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
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put("xmi",new XMIResourceFactoryImpl());
    	
        goldResourceSet = new ResourceSetImpl();
        Resource goldResource = goldResourceSet.createResource(goldConfinementURI);
        
       // create and set model elements
        WTSystem system = WTSpec4MFactory.eINSTANCE.createWTSystem();
        system.setId("WT1");
        system.setModel("model");
        system.setName("TestSystem");
        system.setVersion("1.0");
        
        Subsystem subSystem = WTSpec4MFactory.eINSTANCE.createSubsystem();
        subSystem.setId("SubSystem1");
        subSystem.setName("SubSystem1");
        
        WTCtrl control = WTSpec4MFactory.eINSTANCE.createWTCtrl();
        control.setId("Control1");
        control.setName("Control1");
        
        WTCtrlInput input = WTSpec4MFactory.eINSTANCE.createSystemInput();
        input.setId("Input1");
        input.setName("Input1");
        
        WTCtrlOutput output = WTSpec4MFactory.eINSTANCE.createSystemOutput();
        output.setId("Output1");
        output.setName("Output1");
        
        // set element references
        system.getSubsystems().add(subSystem);
        subSystem.getWtctrls().add(control);
        control.setInput(input);
        control.setOutput(output);
        
        
        goldResource.getContents().add(system);
    }
    
    private void initFrontModel() {
        frontResourceSet = new ResourceSetImpl();
        frontResourceSet.createResource(frontConfinementURI);
    }
    
    private void initPolicyModel() {
      //  policyResource = loadPolicyModel(, securityQueryPaths)
    }
}
