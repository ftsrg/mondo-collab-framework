package com.offline.workspaceTracker;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


public class MyContentAdapter2 extends EContentAdapter{

	private ResourceSet resourceSet2;
	private OperationTraceModel operationTraceModel;
	public MyContentAdapter2(ResourceSet resourceSet, URI traceUri){
		super();
		this.resourceSet2 = resourceSet;
		operationTraceModel = new OperationTraceModel(this.resourceSet2, traceUri, false);
	}
	
	public MyContentAdapter2(ResourceSet resourceSet, URI traceUri, boolean isExisitTrace){
		super();
		this.resourceSet2 = resourceSet;
		operationTraceModel = new OperationTraceModel(this.resourceSet2, traceUri, isExisitTrace);
	}
	
	@SuppressWarnings("unchecked")
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		switch(notification.getEventType()) {
		case Notification.ADD :
			
			if(notification.getFeature() instanceof EAttribute){
				operationTraceModel.insertStep((Notifier)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), true);
			} else if(notification.getFeature() instanceof EReference || notification.getFeature() == null) {
				operationTraceModel.insertStep((Notifier)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), false);
			}
			break;
		case Notification.ADD_MANY :
			for(Object o : (Collection<Object>)(notification.getNewValue())){
				if(notification.getFeature() instanceof EAttribute){
					operationTraceModel.insertStep((Notifier)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), o, true);
				} else if(notification.getFeature() instanceof EReference) {
					operationTraceModel.insertStep((Notifier)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), o, false);
				}
			}
			break;
		case Notification.SET :
			if(notification.getOldValue() != null && notification.getNewValue() !=null && !notification.getOldValue().equals(notification.getNewValue())) {
				if(notification.getFeature() instanceof EAttribute){
					operationTraceModel.updateStep((Notifier)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldValue(), notification.getNewValue(), true);
				} else if(notification.getFeature() instanceof EReference) {
					operationTraceModel.updateStep((Notifier)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldValue(), notification.getNewValue(), false);

				}
			} else if(notification.getOldValue() == null) {
				if(notification.getFeature() instanceof EAttribute){
					operationTraceModel.insertStep((Notifier)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), true);
				} else if(notification.getFeature() instanceof EReference) {
					operationTraceModel.insertStep((Notifier)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), false);
				}
			} else if (notification.getNewValue() == null) {
				if(notification.getFeature() instanceof EAttribute){
					operationTraceModel.deleteStep((Notifier)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldValue(), true);
				} else if(notification.getFeature() instanceof EReference) {
					operationTraceModel.deleteStep((Notifier)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), false);
				}
			}
			break;	
		case Notification.REMOVE :
			if(notification.getFeature() instanceof EAttribute){
				operationTraceModel.deleteStep((Notifier)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldValue(), true);
			} else if(notification.getFeature() instanceof EReference) {
				operationTraceModel.deleteStep((Notifier)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldValue(), false);
			}
			break;	
		case 6 :
			operationTraceModel.endCommand();
			break;	
		default: break;
		}
		System.out.println("save trace");
		//if (notification.getNewValue() !=null)
		try {
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		    Map<String, Object> m = reg.getExtensionToFactoryMap();
		    m.put("operationtracemodel", new XMIResourceFactoryImpl());
			this.getTraceModel().save(System.out,Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Resource getTraceModel() {
		return operationTraceModel.getTraceModel();
	}
}
