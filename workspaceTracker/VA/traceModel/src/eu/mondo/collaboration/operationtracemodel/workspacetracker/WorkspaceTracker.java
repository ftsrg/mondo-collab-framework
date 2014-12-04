package eu.mondo.collaboration.operationtracemodel.workspacetracker;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import eu.mondo.collaboration.operationtracemodel.Command;
import eu.mondo.collaboration.operationtracemodel.InsertAttribute;
import eu.mondo.collaboration.operationtracemodel.InsertReference;
import eu.mondo.collaboration.operationtracemodel.Move;
import eu.mondo.collaboration.operationtracemodel.MoveAttribute;
import eu.mondo.collaboration.operationtracemodel.MoveReference;
import eu.mondo.collaboration.operationtracemodel.OperationtracemodelFactory;
import eu.mondo.collaboration.operationtracemodel.RemoveAttribute;
import eu.mondo.collaboration.operationtracemodel.RemoveReference;
import eu.mondo.collaboration.operationtracemodel.Step;
import eu.mondo.collaboration.operationtracemodel.Trace;
import eu.mondo.collaboration.operationtracemodel.UpdateAttribute;
import eu.mondo.collaboration.operationtracemodel.UpdateReference;

public class WorkspaceTracker {
	private Resource traceModel;
	private Trace trace;
	private Command command;
	private Step step;

	public WorkspaceTracker(ResourceSet resourceSet, URI uri, boolean isExsits) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("operationtracemodel", new XMIResourceFactoryImpl());
		if (isExsits) {
			System.out.println();
			System.out.println(Platform.getLocation() + uri.toPlatformString(true));
			System.out.println(new File(Platform.getLocation() + uri.toPlatformString(true))
					.isFile());
			if (!new File(Platform.getLocation() + uri.toPlatformString(true))
					.isFile()) {
				traceModel = resourceSet.createResource(uri);
				trace = OperationtracemodelFactory.eINSTANCE.createTrace();
				traceModel.getContents().add(trace);
				trace.setCemetary(OperationtracemodelFactory.eINSTANCE
						.createCemetary());
			} else {
				traceModel = resourceSet.getResource(uri, true);
				trace = (Trace) traceModel.getContents().get(0);
				command = ((Trace) traceModel.getContents().get(0))
						.getLastCommand();
				step = command.getSteps().get(0);
				while (step.getNextStep() != null) {
					step = step.getNextStep();
				}
			}
		} else {
			traceModel = resourceSet.createResource(uri);
			trace = OperationtracemodelFactory.eINSTANCE.createTrace();
			traceModel.getContents().add(trace);
			trace.setCemetary(OperationtracemodelFactory.eINSTANCE
					.createCemetary());
		}
	}

	public WorkspaceTracker(ResourceSet resourceSet, URI uri) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("operationtracemodel", new XMIResourceFactoryImpl());
		traceModel = resourceSet.createResource(uri);
		trace = OperationtracemodelFactory.eINSTANCE.createTrace();
		traceModel.getContents().add(trace);
		trace.setCemetary(OperationtracemodelFactory.eINSTANCE.createCemetary());
	}

	public void endCommand() {
		trace.setLastCommand(command);
	}

	private void newStep(EObject element, EStructuralFeature feature,
			Step newStep) {
		if (command == null) {
			command = OperationtracemodelFactory.eINSTANCE.createCommand();
			trace.getCommands().add(command);
			trace.setFirstCommand(command);
			step = newStep;
			command.getSteps().add(step);
			command.setFirstStep(step);
		} else if (command.equals(trace.getLastCommand())) {
			command = OperationtracemodelFactory.eINSTANCE.createCommand();
			trace.getCommands().add(command);
			trace.getLastCommand().setNextCommand(command);
			step.setNextStep(newStep);
			step = newStep;
			command.getSteps().add(step);
			command.setFirstStep(step);
		} else {
			step.setNextStep(newStep);
			step = newStep;
			command.getSteps().add(step);
		}
		step.setElement(element);
		step.setFeature(feature);

	}

	public void insertStep(EObject element, EStructuralFeature feature,
			Object newValue, boolean isAttribute) {
		if (isAttribute) {
			Step step = OperationtracemodelFactory.eINSTANCE
					.createInsertAttribute();
			newStep(element, feature, step);
			((InsertAttribute) step).setNewValue(newValue);
		} else {
			Step step = OperationtracemodelFactory.eINSTANCE
					.createInsertReference();
			newStep(element, feature, step);
			((InsertReference) step).setNewValue((EObject) newValue);
		}

	}

	public void updateStep(EObject element, EStructuralFeature feature,
			Object oldValue, Object newValue, boolean isAttribute) {
		if (isAttribute) {
			Step step = OperationtracemodelFactory.eINSTANCE
					.createUpdateAttribute();
			newStep(element, feature, step);
			((UpdateAttribute) step).setOldValue(oldValue);
			((UpdateAttribute) step).setNewValue(newValue);
		} else {
			Step step = OperationtracemodelFactory.eINSTANCE
					.createUpdateReference();
			newStep(element, feature, step);
			((UpdateReference) step).setOldValue((EObject) oldValue);
			((UpdateReference) step).setNewValue((EObject) newValue);
		}

	}

	public void removeStep(EObject element, EStructuralFeature feature,
			Object oldValue, boolean isAttribute) {
		if (isAttribute) {
			Step step = OperationtracemodelFactory.eINSTANCE
					.createRemoveAttribute();
			newStep(element, feature, step);
			((RemoveAttribute) step).setOldValue(oldValue);
		} else {
			Step step = OperationtracemodelFactory.eINSTANCE
					.createRemoveReference();
			newStep(element, feature, step);
			if (((EReference) feature).isContainment()) {
				trace.getCemetary().getRemovedElements()
						.add((EObject) oldValue);
			}
			((RemoveReference) step).setOldValue((EObject) oldValue);
		}
	}

	public void moveStep(EObject element, EStructuralFeature feature,
			Object movedElement, int oldIndex, int newIndex, boolean isAttribute) {
		if (isAttribute) {
			Step step = OperationtracemodelFactory.eINSTANCE
					.createMoveAttribute();
			newStep(element, feature, step);
			((MoveAttribute) step).setMovedElement(movedElement);
		} else {
			Step step = OperationtracemodelFactory.eINSTANCE
					.createMoveReference();
			newStep(element, feature, step);
			((MoveReference) step).setMovedElement((EObject) movedElement);
		}
		((Move) step).setOldIndex(oldIndex);
		((Move) step).setNewIndex(newIndex);

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
