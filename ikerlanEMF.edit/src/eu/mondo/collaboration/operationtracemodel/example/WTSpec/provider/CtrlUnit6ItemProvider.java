/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit6;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * This is the item provider adapter for a {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit6} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit6ItemProvider
	extends wtcItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit6ItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInput__iStatusPropertyDescriptor(object);
			addInput__iOverloadAlarmPropertyDescriptor(object);
			addInput__iAlarmCounterPropertyDescriptor(object);
			addOutput__oAlarmCounterPropertyDescriptor(object);
			addParameter__pTimePeriodPropertyDescriptor(object);
			addParameter__pOverloadTimeLimitPropertyDescriptor(object);
			addFault__fOverloadPropertyDescriptor(object);
			addTimer__tSyncDelayPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iStatus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit6_Input__iStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit6_Input__iStatus_feature", "_UI_CtrlUnit6_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit6_Input__iStatus(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iOverload Alarm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iOverloadAlarmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit6_Input__iOverloadAlarm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit6_Input__iOverloadAlarm_feature", "_UI_CtrlUnit6_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit6_Input__iOverloadAlarm(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iAlarm Counter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iAlarmCounterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit6_Input__iAlarmCounter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit6_Input__iAlarmCounter_feature", "_UI_CtrlUnit6_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit6_Input__iAlarmCounter(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oAlarm Counter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oAlarmCounterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit6_Output__oAlarmCounter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit6_Output__oAlarmCounter_feature", "_UI_CtrlUnit6_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit6_Output__oAlarmCounter(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pTime Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pTimePeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit6_Parameter__pTimePeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit6_Parameter__pTimePeriod_feature", "_UI_CtrlUnit6_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit6_Parameter__pTimePeriod(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pOverload Time Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pOverloadTimeLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit6_Parameter__pOverloadTimeLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit6_Parameter__pOverloadTimeLimit_feature", "_UI_CtrlUnit6_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit6_Parameter__pOverloadTimeLimit(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fOverload feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fOverloadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit6_Fault__fOverload_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit6_Fault__fOverload_feature", "_UI_CtrlUnit6_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit6_Fault__fOverload(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tSync Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tSyncDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit6_Timer__tSyncDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit6_Timer__tSyncDelay_feature", "_UI_CtrlUnit6_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit6_Timer__tSyncDelay(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit6.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit6"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit6)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit6_type") :
			getString("_UI_CtrlUnit6_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
