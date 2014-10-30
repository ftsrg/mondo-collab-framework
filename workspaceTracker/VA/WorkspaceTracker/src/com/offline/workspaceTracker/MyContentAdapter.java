package com.offline.workspaceTracker;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;


public class MyContentAdapter extends EContentAdapter{

	private MyResourceSet myResourceSet;
	public MyContentAdapter(MyResourceSet myResourceSet){
		super();
		this.myResourceSet = myResourceSet;
	}
	
	@SuppressWarnings("unchecked")
	public void notifyChanged(Notification notification) {
		
		super.notifyChanged(notification);
		switch(notification.getEventType()) {
		case Notification.ADD :
			myResourceSet.insertStep(notification.getNotifier(), notification.getNewValue());
			break;
		case Notification.ADD_MANY :
			for(Object o : (Collection<Object>)(notification.getNewValue())){
				myResourceSet.insertStep(notification.getNotifier(), o);
			}
			
			break;
		case Notification.SET :
			if(notification.getOldValue() == null || !notification.getOldValue().equals(notification.getNewValue())) {
				myResourceSet.updateStep(notification.getNotifier(), notification.getFeature(), notification.getOldValue(), notification.getNewValue());
			}
			break;	
		case Notification.REMOVE :
			myResourceSet.deleteStep(notification.getNotifier(), notification.getOldValue());
			break;	
		case 6 :
			myResourceSet.endCommand();
			break;	
		default: break;
		}
		if (notification.getNewValue() !=null)
  	  System.out.println(notification.getEventType() + ": " + notification.getNewValue().getClass() + ": " +notification.getNotifier());
    }
}
