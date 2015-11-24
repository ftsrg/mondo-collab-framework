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

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.incquery.patternlanguage.PatternLanguageStandaloneSetup;
import org.eclipse.incquery.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mondo.collaboration.security.macl.xtext.AccessControlLanguageStandaloneSetup;

import es.ikerlan.WTSpec4M.Subsystem;
import es.ikerlan.WTSpec4M.SystemInput;
import es.ikerlan.WTSpec4M.SystemOutput;
import es.ikerlan.WTSpec4M.WTCtrl;
import es.ikerlan.WTSpec4M.WTCtrlInput;
import es.ikerlan.WTSpec4M.WTCtrlOutput;
import es.ikerlan.WTSpec4M.WTSpec4MFactory;
import es.ikerlan.WTSpec4M.WTSystem;
import org.junit.Assert;

/**
 * @author Adam Szigethy
 *
 */
public class DenyOverridesTest extends AbstractTestBase {

	@Before
	public void setUp() throws Exception {
		initGoldModel();
		initFrontModel();
		
		String policyPath = "D:\\Modelling\\git\\mondo-collab-framework\\plugins\\"
				+ "org.mondo.collaboration.security.lens.test.algorithm\\src\\org\\"
				+ "mondo\\collaboration\\security\\lens\\test\\algorithm\\permitOverridesRules.macl";

		String firstQueryPath = "D:\\Modelling\\git\\mondo-collab-framework\\plugins\\"
				+ "org.mondo.collaboration.security.lens.test.algorithm\\src\\org\\mondo\\"
				+ "collaboration\\security\\lens\\test\\algorithm\\queries.eiq";
		
		initPolicyModel(policyPath,firstQueryPath);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws IncQueryException {
		execute(Type.GET);        
		
		//create frontResource
		Resource frontResource = frontResourceSet.getResources().get(0);
		WTSystem system = (WTSystem) frontResource.getContents().get(0);
		
	/*	//subsystem tests
		assertTrue(system.getSubsystems().size() == 1);
		assertTrue(system.getSubsystems().get(0).getId() == "SubSystem1");
		
		//WTControl tests
		assertTrue(system.getSubsystems().get(0).getWtctrls().size() == 2);
//		assertTrue(system.getSubsystems().get(0).getWtctrls().get(0).getId() == "Control1");
		
		//Inputs and Output tests
		assertTrue(system.getOutputs().size() == 1);
		assertTrue(system.getInputs().size() == 0);
		assertTrue(system.getSubsystems().get(0).getWtctrls().get(0).getOutput().getId() == "Output1");
		assertTrue(system.getSubsystems().get(0).getWtctrls().get(0).getInput() == null);
		*/
		
		//DenyOverrides a,része
//		assertTrue(system.getOutputs().size() == 1);
//		assertTrue(system.getInputs().size() == 0);
//		assertTrue(system.getOutputs().get(0).getName() == null);
//		assertTrue(system.getSubsystems().get(0).getWtctrls().get(0).getInput()== null);
	
		//DenyOverrides b,része
//		assertTrue(system.getInputs().size() == 0);
//		assertTrue(system.getSubsystems().get(0).getWtctrls().get(0).getInput()== null);
		
		//DenyOverrides c,része
//		assertTrue(system.getInputs().size() == 1);
//		assertTrue(system.getInputs().get(0).getId() == "Input1");
//		assertTrue(system.getInputs().get(0).getName() == null);
//		assertTrue(system.getSubsystems().get(0).getWtctrls().get(0).getInput()== null);
		
		
		//OrderedDenyoverrides a rész
//		assertTrue(system.getInputs().size() == 1);
//		Assert.assertNotEquals(null, system.getInputs().get(0).getName());
//		Assert.assertNotEquals(null, system.getSubsystems().get(0).getWtctrls().get(0).getInput());
		
		//OrderedDenyoverrides b rész
//		assertTrue(system.getInputs().size() == 1);
//		Assert.assertEquals(null, system.getInputs().get(0).getName());
//		Assert.assertEquals(null, system.getSubsystems().get(0).getWtctrls().get(0).getInput());
		
		//OrderedDenyoverrides c rész
//		assertTrue(system.getInputs().size() == 0);

		
		//PermitOverrides a rész
//		assertTrue(system.getInputs().size() == 1);
//		Assert.assertNotEquals(null, system.getInputs().get(0).getName());
//		Assert.assertNotEquals(null, system.getSubsystems().get(0).getWtctrls().get(0).getInput());
		
		//PermitOverrides OP AD
//		assertTrue(system.getInputs().size() == 1);
//		Assert.assertEquals(null, system.getInputs().get(0).getName());
		
		//PermitOverrides OD AP
//		assertTrue(system.getInputs().size() == 1);
//		Assert.assertNotEquals(null, system.getInputs().get(0).getName());
		
		//PermitOverrides OP RD
//		assertTrue(system.getInputs().size() == 1);
//		Assert.assertEquals(null, system.getSubsystems().get(0).getWtctrls().get(0).getInput());
		
		//PermitOverrides OD RP
//		assertTrue(system.getInputs().size() == 1);
//		Assert.assertNotEquals(null, system.getSubsystems().get(0).getWtctrls().get(0).getInput());
		
//		//PermitOverrides c, rész
		assertTrue(system.getInputs().size() == 1);
		Assert.assertEquals(null, system.getInputs().get(0).getName());
//		Assert.assertNotEquals(null, system.getInputs().get(0).getName());
		Assert.assertNotEquals(null, system.getSubsystems().get(0).getWtctrls().get(0).getInput());
		
		
		
		
	}

	private void initGoldModel() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put("xmi",new XMIResourceFactoryImpl());
		
		//create goldResourceSet
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

		

		SystemInput input = WTSpec4MFactory.eINSTANCE.createSystemInput();
		input.setId("Input1");
		input.setName("Input1");

		SystemOutput output = WTSpec4MFactory.eINSTANCE.createSystemOutput();
		output.setId("Output1");
		output.setName("Output1");

		// set element references
		system.getSubsystems().add(subSystem);
		system.getOutputs().add(output);
		system.getInputs().add(input);
		
		control.setInput(input);
		control.setOutput(output);
		
		subSystem.getWtctrls().add(control);


		goldResource.getContents().add(system);
	}

	private void initFrontModel() {
		//create empty frontResourceSet
		frontResourceSet = new ResourceSetImpl();
		frontResourceSet.createResource(frontConfinementURI);
	}

	private void initPolicyModel(String policyPath,String firstQueryPath) {

		//PatternLanguageStandaloneSetup.doSetup();
		//EMFPatternLanguageStandaloneSetup.doSetup();
		AccessControlLanguageStandaloneSetup.doSetup();

		List<String> securityQueryPaths = new ArrayList<String>();
		securityQueryPaths.add(firstQueryPath);
		policyResource = loadPolicyModel(policyPath, securityQueryPaths);
	}

}
