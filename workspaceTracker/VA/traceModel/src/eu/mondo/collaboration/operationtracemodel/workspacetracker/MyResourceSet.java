package eu.mondo.collaboration.operationtracemodel.workspacetracker;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import eu.mondo.collaboration.operationtracemodel.Command;
import eu.mondo.collaboration.operationtracemodel.InsertAttribute;
import eu.mondo.collaboration.operationtracemodel.InsertReference;
import eu.mondo.collaboration.operationtracemodel.OperationtracemodelFactory;
import eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage;
import eu.mondo.collaboration.operationtracemodel.RemoveAttribute;
import eu.mondo.collaboration.operationtracemodel.RemoveReference;
import eu.mondo.collaboration.operationtracemodel.Step;
import eu.mondo.collaboration.operationtracemodel.Trace;
import eu.mondo.collaboration.operationtracemodel.UpdateAttribute;
import eu.mondo.collaboration.operationtracemodel.UpdateReference;


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
		resource = this.myCreateResource(URI.createURI("models/trace.operationtracemodel", true), false);
		resource.getContents().add(trace);
		trace.setCementary(OperationtracemodelFactory.eINSTANCE.createCemetary());
		
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
	
	private void newStep(EObject element, EStructuralFeature feature, int type) {
		Step tmp = null;
		
		if (type == 1) {
			tmp = OperationtracemodelFactory.eINSTANCE.createInsertAttribute();		
		} else if (type == 2){
			tmp = OperationtracemodelFactory.eINSTANCE.createInsertReference();
		} else if (type == 3) {
			tmp = OperationtracemodelFactory.eINSTANCE.createUpdateAttribute();
		} else if(type == 4 ) {
			tmp = OperationtracemodelFactory.eINSTANCE.createInsertReference();
		} else if (type == 5) {
			tmp = OperationtracemodelFactory.eINSTANCE.createRemoveAttribute();
		} else if (type == 6) {
			tmp = OperationtracemodelFactory.eINSTANCE.createRemoveReference();
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
		step.setElement(element);
		step.setFeature( feature);
		
	}
	
	public void insertStep(EObject element, EStructuralFeature feature, Object newValue, boolean isAttribute) {
		if(isAttribute){
			newStep(element, feature, 1);
			((InsertAttribute) step).setNewValue(newValue);
		} else {
			newStep(element, feature, 2);
			((InsertReference) step).setNewValue((EObject) newValue);
		}

	}
	
	public void updateStep(EObject element, EStructuralFeature feature, Object oldValue, Object newValue, boolean isAttribute) {
		if (isAttribute){
			newStep(element, feature, 3);
			((UpdateAttribute)step).setOldValue(oldValue);
			((UpdateAttribute)step).setNewValue(newValue);
		} else {
			newStep(element, feature, 4);
			((UpdateReference)step).setOldValue((EObject)oldValue);
			((UpdateReference)step).setNewValue((EObject)newValue);
		}
		
	}
	
	public void deleteStep(EObject element, EStructuralFeature feature, Object oldValue, boolean isAttribute) {
		if(isAttribute){
			 newStep(element, feature, 5);
			 ((RemoveAttribute)step).setOldValue(oldValue);
		} else  {
			newStep(element, feature, 6);
			trace.getCementary().getRemovedElements().add((EObject)oldValue);
			((RemoveReference)step).setOldValue((EObject)oldValue);
		}
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
