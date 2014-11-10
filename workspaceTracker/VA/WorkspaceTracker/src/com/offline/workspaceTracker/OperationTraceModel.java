package com.offline.workspaceTracker;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import operationtracemodel.Command;
import operationtracemodel.InsertAttribute;
import operationtracemodel.InsertReference;
import operationtracemodel.OperationtracemodelFactory;
import operationtracemodel.RemoveAttribute;
import operationtracemodel.RemoveReference;
import operationtracemodel.RemovedElement;
import operationtracemodel.Step;
import operationtracemodel.Trace;
import operationtracemodel.UpdateAttribute;
import operationtracemodel.UpdateReference;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class OperationTraceModel {
	private Resource traceModel;
	private Trace trace;
	private Command command;
	private Step step;
	
	public OperationTraceModel(ResourceSet resourceSet, URI uri, boolean isExsits){
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("operationtracemodel", new XMIResourceFactoryImpl());
		if(isExsits) {
			traceModel = resourceSet.getResource(uri, false);
			trace = (Trace)traceModel.getContents().get(0);
			command = ((Trace)traceModel.getContents().get(0)).getLastCommand();
			step = command.getSteps().get(0);
			while (step.getNextStep() != null) {
				step = step.getNextStep();
			}
		} else {
			traceModel = resourceSet.createResource(uri);
			trace = OperationtracemodelFactory.eINSTANCE.createTrace();
			traceModel.getContents().add(trace);
			trace.setCementary(OperationtracemodelFactory.eINSTANCE.createCemetary());
		}
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
		step.setFeature(feature);
		
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
			RemovedElement e = OperationtracemodelFactory.eINSTANCE.createRemovedElement();
			e.setRemovedElement((EObject)oldValue);
			((RemoveReference)step).setOldValue(e);
			trace.getCementary().getRemovedElement().add(e);
		}
	}
	
	public void saveTrace() {
		try {
			traceModel.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Resource getTraceModel() {
		return traceModel;
	}
	
	
}
