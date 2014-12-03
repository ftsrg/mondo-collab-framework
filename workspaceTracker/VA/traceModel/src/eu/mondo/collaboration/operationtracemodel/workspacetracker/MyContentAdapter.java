package eu.mondo.collaboration.operationtracemodel.workspacetracker;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;

public class MyContentAdapter extends EContentAdapter{

	private ResourceSet resourceSet2;
	private WorkspaceTracker operationTraceModel;
	public MyContentAdapter(ResourceSet resourceSet, URI traceUri){
		super();
		this.resourceSet2 = resourceSet;
		operationTraceModel = new WorkspaceTracker(this.resourceSet2, traceUri, false);
	}
	
	public MyContentAdapter(ResourceSet resourceSet, URI traceUri, boolean isExisitTrace){
		super();
		this.resourceSet2 = resourceSet;
		operationTraceModel = new WorkspaceTracker(this.resourceSet2, traceUri, isExisitTrace);
	}
	
	@SuppressWarnings("unchecked")
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if (notification.getNotifier() instanceof Resource) {
			if(!((Resource)notification.getNotifier()).isModified()){
				operationTraceModel.endCommand();
				try {
					this.getTraceModel().save(Collections.EMPTY_MAP);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			switch(notification.getEventType()) {
			case Notification.ADD :			
				if(notification.getFeature() instanceof EAttribute){
					operationTraceModel.insertStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), true);
				} else if(notification.getFeature() instanceof EReference || notification.getFeature() == null) {
					operationTraceModel.insertStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), false);
				}
				break;
			case Notification.ADD_MANY :
				for(Object o : (Collection<Object>)(notification.getNewValue())){
					if(notification.getFeature() instanceof EAttribute){
						operationTraceModel.insertStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), o, true);
					} else if(notification.getFeature() instanceof EReference) {
						operationTraceModel.insertStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), o, false);
					}
				}
				break;
			case Notification.SET :
				if(notification.getOldValue() != null && notification.getNewValue() !=null && !notification.getOldValue().equals(notification.getNewValue())) {
					if(notification.getFeature() instanceof EAttribute){
						operationTraceModel.updateStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldValue(), notification.getNewValue(), true);
					} else if(notification.getFeature() instanceof EReference) {
						operationTraceModel.updateStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldValue(), notification.getNewValue(), false);
	
					}
				} else if(notification.getOldValue() == null) {
					if(notification.getFeature() instanceof EAttribute){
						operationTraceModel.insertStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), true);
					} else if(notification.getFeature() instanceof EReference) {
						if(((EReference)notification.getFeature()).isContainment()) {
							operationTraceModel.insertStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), false);
						} else {
							operationTraceModel.updateStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldValue(), notification.getNewValue(), false);
						}
					}
				} else if (notification.getNewValue() == null) {
					if(notification.getFeature() instanceof EAttribute){
						operationTraceModel.removeStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldValue(), true);
					} else if(notification.getFeature() instanceof EReference) {
						operationTraceModel.removeStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), false);
					}
				}
				break;	
			case Notification.REMOVE :
				if(notification.getFeature() instanceof EAttribute){
					operationTraceModel.removeStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldValue(), true);
				} else if(notification.getFeature() instanceof EReference) {
					operationTraceModel.removeStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldValue(), false);
				}
				break;	
			case Notification.REMOVE_MANY :
				for(Object o : (Collection<Object>)(notification.getNewValue())){
					if(notification.getFeature() instanceof EAttribute){
						operationTraceModel.removeStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), o, true);
					} else if(notification.getFeature() instanceof EReference) {
						operationTraceModel.removeStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), o, false);
					}
				}
				break;
			case Notification.UNSET:
				if(notification.getFeature() instanceof EAttribute){
					operationTraceModel.removeStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldValue(), true);
				} else if(notification.getFeature() instanceof EReference) {
					operationTraceModel.removeStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldValue(), false);
				}
				break;	
			case Notification.MOVE:
				//System.out.println(notification.getOldValue());
				
				if(notification.getFeature() instanceof EAttribute){
					operationTraceModel.moveStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), (Integer)notification.getOldValue(), notification.getPosition(), true);
				} else if(notification.getFeature() instanceof EReference) {
					operationTraceModel.moveStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), (Integer)notification.getOldValue(), notification.getPosition(), false);
				}
				break;
			default: break;
			}
		}
	}
	
	public Resource getTraceModel() {
		return operationTraceModel.getTraceModel();
	}
}
