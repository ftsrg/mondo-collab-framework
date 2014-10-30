package com.offline.workspaceTracker;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

import operationtracemodel.Command;
import operationtracemodel.Delete;
import operationtracemodel.Element;
import operationtracemodel.Insert;
import operationtracemodel.OperationtracemodelFactory;
import operationtracemodel.OperationtracemodelPackage;
import operationtracemodel.Step;
import operationtracemodel.Trace;
import operationtracemodel.Update;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;



public class MyResourceSet extends ResourceSetImpl{
	
	private Resource resource;
	private Trace trace;
	private Command command;
	private Step step;
	private MyContentAdapter myContentAdapter;
	
	public MyResourceSet(){
		super();
		
	    OperationtracemodelPackage.eINSTANCE.eClass();
	    
	    // Register the XMI resource factory for the .website extension
	    myContentAdapter = new MyContentAdapter(this);
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("operationtracemodel", new XMIResourceFactoryImpl());
		command = null;
		trace = OperationtracemodelFactory.eINSTANCE.createTrace();
		//System.out.println(this.myCreateResource(URI.createURI("website/trace.operationtracemodel",true), false));
		resource = this.myCreateResource(URI.createURI("website/trace.operationtracemodel", true), false);
		resource.getContents().add(trace);
		trace.setCementary(OperationtracemodelFactory.eINSTANCE.createCementary());
		
	}
	
	public Resource createResource(URI uri) {
		return myCreateResource(uri, true);
		
	}
	
	public Resource myCreateResource(URI uri, boolean hasNotification) {
		Resource resource = super.createResource(uri);
		if(hasNotification) {
			resource.eAdapters().add(myContentAdapter);
		}
		return resource;
		
	}
	
	public Resource myGetResource(URI uri, boolean loadOnDemand, boolean hasNotification){
		Resource resource = super.getResource(uri, loadOnDemand);
		if(hasNotification) {
			resource.eAdapters().add(myContentAdapter);
		}
		return resource;
	}
	
	public void endCommand() {
		trace.setLastCommand(command);
	}
	
	private void newStep(int type) {
		Step tmp = null;
		
		if (type == 1) {
			tmp = OperationtracemodelFactory.eINSTANCE.createInsert();
		} else if (type == 2) {
			tmp = OperationtracemodelFactory.eINSTANCE.createUpdate();
		} else if (type == 3) {
			tmp = OperationtracemodelFactory.eINSTANCE.createDelete();
		}
		if(command == null) {
			command = OperationtracemodelFactory.eINSTANCE.createCommand();
			trace.getCommands().add(command);
			trace.setFirstCommand(command);
			step = tmp;
			command.getSteps().add(step);
			command.setFirstStep(step);
		}else if(command.equals(trace.getLastCommand())){
			command = OperationtracemodelFactory.eINSTANCE.createCommand();
			trace.getCommands().add(command);
			trace.getLastCommand().setNextCommand(command);
			step.setNextStep(tmp);
			step = tmp;
			command.getSteps().add(step);
			command.setFirstStep(step);
		} else {		
			step.setNextStep(tmp);
			step = tmp;
			command.getSteps().add(step);
		}
		
	}
	
	public void insertStep(Object element, Object inserted) {
		newStep(1);
		System.out.println(inserted);
		System.out.println(element);

		if(!(element instanceof Resource)){
		step.setElement((EObject)element);
		}
		((Insert) step).setInserted((EObject) inserted);

	}
	
	public void updateStep(Object element, Object updated, Object oldValue, Object newValue) {
		newStep(2);
		if(!(element instanceof Resource)){
			step.setElement((EObject)element);
		}		
		System.out.println(oldValue);
		((Update)step).setAtribute((EObject)updated);
		/*if (oldValue instanceof EObject){
			((Update)step).setOldValue((EObject)oldValue);
		} else if (oldValue instanceof Serializable){
			((Update)step).setOldValue((Serializable)oldValue);
		}
		if (newValue instanceof EObject){
			((Update)step).setNewValue((EObject)newValue);
		} else if (newValue instanceof Serializable){
			((Update)step).setNewValue((Serializable)newValue);
		}*/

	}
	
	public void deleteStep(Object element, Object deleted) {
		newStep(3);
		//step.setElement(element);
		Element e = OperationtracemodelFactory.eINSTANCE.createElement();
		e.setElement((EObject) deleted);
		trace.getCementary().getDeleted().add(e);
		((Delete)step).setDeleted(e);
	}
	
	public void saveTrace() {
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
