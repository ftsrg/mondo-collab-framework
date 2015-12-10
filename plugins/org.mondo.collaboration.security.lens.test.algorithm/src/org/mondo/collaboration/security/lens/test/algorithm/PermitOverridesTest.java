package org.mondo.collaboration.security.lens.test.algorithm;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mondo.collaboration.security.lens.test.algorithm.AbstractTestBase.Type;
import org.mondo.collaboration.security.macl.xtext.AccessControlLanguageStandaloneSetup;

import es.ikerlan.WTSpec4M.Subsystem;
import es.ikerlan.WTSpec4M.SystemInput;
import es.ikerlan.WTSpec4M.SystemOutput;
import es.ikerlan.WTSpec4M.WTCtrl;
import es.ikerlan.WTSpec4M.WTSpec4MFactory;
import es.ikerlan.WTSpec4M.WTSystem;

public class PermitOverridesTest extends AbstractTestBase {

	@Before
	public void setUp() throws Exception {
		initGoldModel();
		initFrontModel();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void sameAssetPermitAll() throws IncQueryException {
		
		String policyPath = "D:\\Modelling\\git\\mondo-collab-framework\\plugins\\"
				+ "org.mondo.collaboration.security.lens.test.algorithm\\src\\org\\"
				+ "mondo\\collaboration\\security\\lens\\test\\algorithm\\permitOverridesRulesPermitAll.macl";

		String firstQueryPath = "D:\\Modelling\\git\\mondo-collab-framework\\plugins\\"
				+ "org.mondo.collaboration.security.lens.test.algorithm\\src\\org\\mondo\\"
				+ "collaboration\\security\\lens\\test\\algorithm\\queries.eiq";
		
		initPolicyModel(policyPath,firstQueryPath);
		
		execute(Type.GET);        
		
		//create frontResource
		Resource frontResource = frontResourceSet.getResources().get(0);
		WTSystem system = (WTSystem) frontResource.getContents().get(0);
		
		//subsystem tests
		assertTrue(system.getSubsystems().size() == 1);
		assertTrue(system.getSubsystems().get(0).getId() == "SubSystem1");
		
		//WTControl tests
		assertTrue(system.getSubsystems().get(0).getWtctrls().size() == 1);
		assertTrue(system.getSubsystems().get(0).getWtctrls().get(0).getId() == "Control1");
		
		//permitAll tests
		Assert.assertEquals(1, system.getOutputs().size());
		Assert.assertEquals(1, system.getInputs().size());
		
		Assert.assertEquals("Output1", system.getOutputs().get(0).getId());
		Assert.assertEquals("Output1", system.getOutputs().get(0).getName());
		Assert.assertNotEquals(null, system.getSubsystems().get(0).getWtctrls().get(0).getOutput());
		Assert.assertEquals("Output1", system.getSubsystems().get(0).getWtctrls().get(0).getOutput().getId());
		Assert.assertEquals("Output1", system.getSubsystems().get(0).getWtctrls().get(0).getOutput().getName());
		
		Assert.assertEquals("Input1", system.getInputs().get(0).getId());
		Assert.assertEquals("Input1", system.getInputs().get(0).getName());
		Assert.assertNotEquals(null, system.getSubsystems().get(0).getWtctrls().get(0).getInput());
		Assert.assertEquals("Input1", system.getSubsystems().get(0).getWtctrls().get(0).getInput().getId());
		Assert.assertEquals("Input1", system.getSubsystems().get(0).getWtctrls().get(0).getInput().getName());
	
	}
	
	@Test
	public void differentAssetPermitInputs() throws IncQueryException {
		
		String policyPath = "D:\\Modelling\\git\\mondo-collab-framework\\plugins\\"
				+ "org.mondo.collaboration.security.lens.test.algorithm\\src\\org\\"
				+ "mondo\\collaboration\\security\\lens\\test\\algorithm\\permitOverridesRulesPermitInputs.macl";

		String firstQueryPath = "D:\\Modelling\\git\\mondo-collab-framework\\plugins\\"
				+ "org.mondo.collaboration.security.lens.test.algorithm\\src\\org\\mondo\\"
				+ "collaboration\\security\\lens\\test\\algorithm\\queries.eiq";
		
		initPolicyModel(policyPath,firstQueryPath);
		
		execute(Type.GET);        
		
		//create frontResource
		Resource frontResource = frontResourceSet.getResources().get(0);
		WTSystem system = (WTSystem) frontResource.getContents().get(0);
		
		//subsystem tests
		assertTrue(system.getSubsystems().size() == 1);
		assertTrue(system.getSubsystems().get(0).getId() == "SubSystem1");
		
		//WTControl tests
		assertTrue(system.getSubsystems().get(0).getWtctrls().size() == 1);
		assertTrue(system.getSubsystems().get(0).getWtctrls().get(0).getId() == "Control1");
		
		//permitInput tests
		Assert.assertEquals(1, system.getOutputs().size());
		Assert.assertEquals(1, system.getInputs().size());
		
		Assert.assertEquals("Output1", system.getOutputs().get(0).getId());
		Assert.assertEquals("Output1", system.getOutputs().get(0).getName());
		Assert.assertNotEquals(null, system.getSubsystems().get(0).getWtctrls().get(0).getOutput());
		Assert.assertEquals("Output1", system.getSubsystems().get(0).getWtctrls().get(0).getOutput().getId());
		Assert.assertEquals("Output1", system.getSubsystems().get(0).getWtctrls().get(0).getOutput().getName());
		
		Assert.assertEquals("Input1", system.getInputs().get(0).getId());
		Assert.assertEquals(null, system.getInputs().get(0).getName());
		Assert.assertEquals(null, system.getSubsystems().get(0).getWtctrls().get(0).getInput());
	}
	
	@Test
	public void differentAssetPermitAttribute() throws IncQueryException {
		
		String policyPath = "D:\\Modelling\\git\\mondo-collab-framework\\plugins\\"
				+ "org.mondo.collaboration.security.lens.test.algorithm\\src\\org\\"
				+ "mondo\\collaboration\\security\\lens\\test\\algorithm\\permitOverridesRulesPermitAttribute.macl";

		String firstQueryPath = "D:\\Modelling\\git\\mondo-collab-framework\\plugins\\"
				+ "org.mondo.collaboration.security.lens.test.algorithm\\src\\org\\mondo\\"
				+ "collaboration\\security\\lens\\test\\algorithm\\queries.eiq";
		
		initPolicyModel(policyPath,firstQueryPath);
		
		execute(Type.GET);        
		
		//create frontResource
		Resource frontResource = frontResourceSet.getResources().get(0);
		WTSystem system = (WTSystem) frontResource.getContents().get(0);
		
		//subsystem tests
		assertTrue(system.getSubsystems().size() == 1);
		assertTrue(system.getSubsystems().get(0).getId() == "SubSystem1");
		
		//WTControl tests
		assertTrue(system.getSubsystems().get(0).getWtctrls().size() == 1);
		assertTrue(system.getSubsystems().get(0).getWtctrls().get(0).getId() == "Control1");
		
		//permitAttribute tests
		Assert.assertEquals(1, system.getOutputs().size());
		Assert.assertEquals(1, system.getInputs().size());
		
		Assert.assertEquals("Output1", system.getOutputs().get(0).getId());
		Assert.assertEquals("Output1", system.getOutputs().get(0).getName());
		Assert.assertNotEquals(null, system.getSubsystems().get(0).getWtctrls().get(0).getOutput());
		Assert.assertEquals("Output1", system.getSubsystems().get(0).getWtctrls().get(0).getOutput().getId());
		Assert.assertEquals("Output1", system.getSubsystems().get(0).getWtctrls().get(0).getOutput().getName());
		
		Assert.assertEquals("Input1", system.getInputs().get(0).getId());
		Assert.assertEquals("Input1", system.getInputs().get(0).getName());
		Assert.assertEquals(null, system.getSubsystems().get(0).getWtctrls().get(0).getInput());
		
	}
	
	@Test
	public void differentAssetPermitReference() throws IncQueryException {
		
		String policyPath = "D:\\Modelling\\git\\mondo-collab-framework\\plugins\\"
				+ "org.mondo.collaboration.security.lens.test.algorithm\\src\\org\\"
				+ "mondo\\collaboration\\security\\lens\\test\\algorithm\\permitOverridesRulesPermitReference.macl";

		String firstQueryPath = "D:\\Modelling\\git\\mondo-collab-framework\\plugins\\"
				+ "org.mondo.collaboration.security.lens.test.algorithm\\src\\org\\mondo\\"
				+ "collaboration\\security\\lens\\test\\algorithm\\queries.eiq";
		
		initPolicyModel(policyPath,firstQueryPath);
		
		execute(Type.GET);        
		
		//create frontResource
		Resource frontResource = frontResourceSet.getResources().get(0);
		WTSystem system = (WTSystem) frontResource.getContents().get(0);
		
		//subsystem tests
		assertTrue(system.getSubsystems().size() == 1);
		assertTrue(system.getSubsystems().get(0).getId() == "SubSystem1");
		
		//WTControl tests
		assertTrue(system.getSubsystems().get(0).getWtctrls().size() == 1);
		assertTrue(system.getSubsystems().get(0).getWtctrls().get(0).getId() == "Control1");
		
		//permitRefference tests
		Assert.assertEquals(1, system.getOutputs().size());
		Assert.assertEquals(1, system.getInputs().size());
		
		Assert.assertEquals("Output1", system.getOutputs().get(0).getId());
		Assert.assertEquals("Output1", system.getOutputs().get(0).getName());
		Assert.assertNotEquals(null, system.getSubsystems().get(0).getWtctrls().get(0).getOutput());
		Assert.assertEquals("Output1", system.getSubsystems().get(0).getWtctrls().get(0).getOutput().getId());
		Assert.assertEquals("Output1", system.getSubsystems().get(0).getWtctrls().get(0).getOutput().getName());
		
		Assert.assertEquals("Input1", system.getInputs().get(0).getId()); //TODO kell-e attribútumokat deny-olni?
		Assert.assertEquals(null, system.getInputs().get(0).getName());
		Assert.assertNotEquals(null, system.getSubsystems().get(0).getWtctrls().get(0).getInput());
		Assert.assertEquals("Input1", system.getSubsystems().get(0).getWtctrls().get(0).getInput().getId());
		Assert.assertEquals(null, system.getSubsystems().get(0).getWtctrls().get(0).getInput().getName());

		
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


		AccessControlLanguageStandaloneSetup.doSetup();

		List<String> securityQueryPaths = new ArrayList<String>();
		securityQueryPaths.add(firstQueryPath);
		policyResource = loadPolicyModel(policyPath, securityQueryPaths);
	}

}
