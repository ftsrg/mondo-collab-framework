package eu.mondo.collaboration.operationtracemodel.workspacetracker;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;


public class MyContentAdapter extends EContentAdapter{

	private MyResourceSet myResourceSet;
	public MyContentAdapter(MyResourceSet myResourceSet){
		super();
		this.myResourceSet = myResourceSet;
	}
	
	@SuppressWarnings("unchecked")
	public void notifyChanged(Notification notification) {
		System.out.println(Notification.REMOVE_MANY);
		System.out.println(notification.getNotifier().getClass() + ":" + notification.getFeature());
		super.notifyChanged(notification);
		switch(notification.getEventType()) {
		case Notification.ADD :
			
			if(notification.getFeature() instanceof EAttribute){
				myResourceSet.insertStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), true);
			} else if(notification.getFeature() instanceof EReference || notification.getFeature() == null) {
				myResourceSet.insertStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), false);
			}
			break;
		case Notification.ADD_MANY :
			for(Object o : (Collection<Object>)(notification.getNewValue())){
				if(notification.getFeature() instanceof EAttribute){
					myResourceSet.insertStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), o, true);
				} else if(notification.getFeature() instanceof EReference) {
					myResourceSet.insertStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), o, false);
				}
			}
			break;
		case Notification.SET :
			if(notification.getOldValue() != null && notification.getNewValue() !=null && !notification.getOldValue().equals(notification.getNewValue())) {
				if(notification.getFeature() instanceof EAttribute){
					myResourceSet.updateStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldValue(), notification.getNewValue(), true);
				} else if(notification.getFeature() instanceof EReference) {
					myResourceSet.updateStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldValue(), notification.getNewValue(), false);

				}
			} else if(notification.getOldValue() == null) {
				if(notification.getFeature() instanceof EAttribute){
					myResourceSet.insertStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), true);
				} else if(notification.getFeature() instanceof EReference) {
					myResourceSet.insertStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), false);
				}
			} else if (notification.getNewValue() == null) {
				if(notification.getFeature() instanceof EAttribute){
					myResourceSet.deleteStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldValue(), true);
				} else if(notification.getFeature() instanceof EReference) {
					myResourceSet.deleteStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), false);
				}
			}
			break;	
		case Notification.REMOVE :
			if(notification.getFeature() instanceof EAttribute){
				myResourceSet.deleteStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getOldValue(), true);
			} else if(notification.getFeature() instanceof EReference) {
				myResourceSet.deleteStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), notification.getNewValue(), false);
			}
			break;	
		case 6 :
			for(Object o : (Collection<Object>)(notification.getNewValue())){
				if(notification.getFeature() instanceof EAttribute){
					myResourceSet.deleteStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), o, true);
				} else if(notification.getFeature() instanceof EReference) {
					myResourceSet.deleteStep((EObject)notification.getNotifier(), (EStructuralFeature)notification.getFeature(), o, false);
				}
			}
			break;
		default: break;
		}
		//if (notification.getNewValue() !=null)
  	  System.out.println(notification.getEventType() + ": " + notification.getOldValue() + ": " +notification.getNotifier());
    }
}
