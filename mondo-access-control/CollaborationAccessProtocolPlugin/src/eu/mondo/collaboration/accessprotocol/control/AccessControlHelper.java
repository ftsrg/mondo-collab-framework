package eu.mondo.collaboration.accessprotocol.control;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import eu.mondo.collaboration.accessprotocol.utils.StepAttribute;
import eu.mondo.collaboration.accessprotocol.utils.StepByUser;
import eu.mondo.collaboration.accessprotocol.utils.User;
import eu.mondo.collaboration.accessprotocol.utils.UserSession;
import eu.mondo.collaboration.operationtracemodel.Command;
import eu.mondo.collaboration.operationtracemodel.Step;
import eu.mondo.collaboration.operationtracemodel.Trace;
import eu.mondo.collaboration.operationtracemodel.impl.InsertAttributeImpl;
import eu.mondo.collaboration.operationtracemodel.impl.InsertReferenceImpl;
import eu.mondo.collaboration.operationtracemodel.impl.MoveAttributeImpl;
import eu.mondo.collaboration.operationtracemodel.impl.MoveReferenceImpl;
import eu.mondo.collaboration.operationtracemodel.impl.RemoveAttributeImpl;
import eu.mondo.collaboration.operationtracemodel.impl.RemoveReferenceImpl;
import eu.mondo.collaboration.operationtracemodel.impl.UpdateAttributeImpl;
import eu.mondo.collaboration.operationtracemodel.impl.UpdateReferenceImpl;
import eu.mondo.collaboration.operationtracemodel.workspacetracker.OperationTraceModel;

public class AccessControlHelper {

	public static ArrayList<StepByUser> loadWorkspaceTracker() {
		User user = UserSession.getCurrentUser();

		ArrayList<StepByUser> stepQueue = new ArrayList<StepByUser>();

		ResourceSet resSet = new ResourceSetImpl();
		OperationTraceModel operationTraceModel = new OperationTraceModel(
				resSet,
				URI.createURI("models/trace.operationtracemodel", true), true);

		Resource traceModel = operationTraceModel.getTraceModel();
		Trace trace = (Trace) traceModel.getContents().get(0);
		Command command = (Command) trace.getFirstCommand();
		if (command != null) {
			while (command != null) {
				Step step = command.getFirstStep();
				while (step != null) {
					String stepType = step.eClass().getName();

					switch (stepType) {
					case "InsertReference": {
						InsertReferenceImpl insert = (InsertReferenceImpl) step;

						EObject newValue = insert.getNewValue();
						EClass newValueClass = newValue.eClass();
						String newValueClassName = newValueClass.getName();

						ArrayList<StepAttribute> attributes = new ArrayList<StepAttribute>();
						EList<EAttribute> eAllAttributes = newValue.eClass()
								.getEAllAttributes();
						for (EAttribute eAttribute : eAllAttributes) {
							Object resultingDataType = newValue
									.eGet(eAttribute);
							if (resultingDataType != null) {
								attributes.add(new StepAttribute(eAttribute
										.getName(), resultingDataType
										.toString()));
							}
						}

						stepQueue.add(new StepByUser(user, stepType,
								newValueClassName, attributes));
						break;
					}
					case "InsertAttribute": {
						InsertAttributeImpl insert = (InsertAttributeImpl) step;

						EClass elementClass = step.getElement().eClass();
						String elementClassName = elementClass.getName();
						Object newValue = insert.getNewValue();
						String attributeName = step.getFeature().getName();

						EList<EAttribute> eAllAttributes = step.getElement()
								.eClass().getEAllAttributes();
						ArrayList<StepAttribute> attributes = new ArrayList<StepAttribute>();

						for (EAttribute eAttribute : eAllAttributes) {
							Object resultingDataType = step.getElement().eGet(
									eAttribute);
							if (resultingDataType != null) {
								attributes.add(new StepAttribute(eAttribute
										.getName(), resultingDataType
										.toString()));
							}
						}

						stepQueue.add(new StepByUser(user, stepType,
								elementClassName, attributes));
						break;
					}

					case "RemoveReference": {
						RemoveReferenceImpl remove = (RemoveReferenceImpl) step;
						EObject oldValue = remove.getOldValue();
						EClass oldValueClass = oldValue.eClass();
						String oldValueClassName = oldValueClass.getName();

						ArrayList<StepAttribute> attributes = new ArrayList<StepAttribute>();
						EList<EAttribute> eAllAttributes = oldValue.eClass()
								.getEAllAttributes();
						for (EAttribute eAttribute : eAllAttributes) {
							Object resultingDataType = oldValue
									.eGet(eAttribute);
							if (resultingDataType != null) {
								attributes.add(new StepAttribute(eAttribute
										.getName(), resultingDataType
										.toString()));
							}
						}

						stepQueue.add(new StepByUser(user, stepType,
								oldValueClassName, attributes));
						break;
					}

					case "RemoveAttribute": {
						RemoveAttributeImpl remove = (RemoveAttributeImpl) step;

						EClass elementClass = step.getElement().eClass();
						String elementClassName = elementClass.getName();
						Object oldValue = remove.getOldValue();
						String attributeName = step.getFeature().getName();

						EList<EAttribute> eAllAttributes = step.getElement()
								.eClass().getEAllAttributes();
						ArrayList<StepAttribute> attributes = new ArrayList<StepAttribute>();

						for (EAttribute eAttribute : eAllAttributes) {
							Object resultingDataType = step.getElement().eGet(
									eAttribute);
							if (resultingDataType != null) {
								attributes.add(new StepAttribute(eAttribute
										.getName(), resultingDataType
										.toString()));
							}
						}
						attributes.add(new StepAttribute(attributeName,
								oldValue.toString()));

						stepQueue.add(new StepByUser(user, stepType,
								elementClassName, attributes));
						break;
					}

					case "UpdateReference": {
						UpdateReferenceImpl update = (UpdateReferenceImpl) step;
						EObject oldValue = update.getOldValue();
						EClass oldValueClass = oldValue.eClass();
						String oldValueClassName = oldValueClass.getName();
						EObject newValue = update.getNewValue();
						EClass newValueClass = newValue.eClass();
						String newValueClassName = newValueClass.getName();

						ArrayList<StepAttribute> attributes = new ArrayList<StepAttribute>();
						EList<EAttribute> eAllAttributes = oldValue.eClass()
								.getEAllAttributes();
						for (EAttribute eAttribute : eAllAttributes) {
							Object resultingDataType = oldValue
									.eGet(eAttribute);
							if (resultingDataType != null) {
								attributes.add(new StepAttribute(eAttribute
										.getName(), resultingDataType
										.toString()));
							}
						}

						stepQueue.add(new StepByUser(user, stepType,
								newValueClassName, attributes));
						break;
					}

					case "UpdateAttribute": {
						UpdateAttributeImpl update = (UpdateAttributeImpl) step;

						EClass elementClass = step.getElement().eClass();
						String elementClassName = elementClass.getName();
						Object oldValue = update.getOldValue();
						Object newValue = update.getNewValue();
						String attributeName = step.getFeature().getName();

						EList<EAttribute> eAllAttributes = step.getElement()
								.eClass().getEAllAttributes();
						ArrayList<StepAttribute> attributes = new ArrayList<StepAttribute>();

						for (EAttribute eAttribute : eAllAttributes) {
							Object resultingDataType = step.getElement().eGet(
									eAttribute);
							if (resultingDataType != null) {
								attributes.add(new StepAttribute(eAttribute
										.getName(), resultingDataType
										.toString()));
							}
						}

						stepQueue.add(new StepByUser(user, stepType,
								elementClassName, attributes));
						break;
					}

					case "MoveReference": {
						MoveReferenceImpl move = (MoveReferenceImpl) step;
						EObject movedElement = move.getMovedElement();
						EClass movedElementClass = movedElement.eClass();
						String movedElementClassName = movedElementClass
								.getName();

						ArrayList<StepAttribute> attributes = new ArrayList<StepAttribute>();
						EList<EAttribute> eAllAttributes = movedElement
								.eClass().getEAllAttributes();
						for (EAttribute eAttribute : eAllAttributes) {
							Object resultingDataType = movedElement
									.eGet(eAttribute);
							if (resultingDataType != null) {
								attributes.add(new StepAttribute(eAttribute
										.getName(), resultingDataType
										.toString()));
							}
						}

						stepQueue.add(new StepByUser(user, stepType,
								movedElementClassName, attributes));
						break;
					}

					case "MoveAttribute": {
						MoveAttributeImpl move = (MoveAttributeImpl) step;

						EClass elementClass = step.getElement().eClass();
						String elementClassName = elementClass.getName();
						Object movedElement = move.getMovedElement();
						String attributeName = step.getFeature().getName();

						EList<EAttribute> eAllAttributes = step.getElement()
								.eClass().getEAllAttributes();
						ArrayList<StepAttribute> attributes = new ArrayList<StepAttribute>();

						for (EAttribute eAttribute : eAllAttributes) {
							Object resultingDataType = step.getElement().eGet(
									eAttribute);
							if (resultingDataType != null) {
								attributes.add(new StepAttribute(eAttribute
										.getName(), resultingDataType
										.toString()));
							}
						}
						
						stepQueue.add(new StepByUser(user, stepType,
								elementClassName, attributes));
						break;
					}

					}

					step = step.getNextStep();
				}
				command = command.getNextCommand();
			}
		}

		return stepQueue;
	}
}
