/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit133;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit133} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit133ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit133ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iYawStatusPropertyDescriptor(object);
			addInput__iYawCurrent1PropertyDescriptor(object);
			addInput__iYawCurrent2PropertyDescriptor(object);
			addInput__iYawCurrent3PropertyDescriptor(object);
			addInput__iYawCurrent4PropertyDescriptor(object);
			addInput__iOverloadAlarmCounterPropertyDescriptor(object);
			addOutput__oOverloadAlarmCounterPropertyDescriptor(object);
			addParameter__pMaximumTorquePropertyDescriptor(object);
			addParameter__pMinimumTorquePropertyDescriptor(object);
			addParameter__pTorqueDifferenceLimitPropertyDescriptor(object);
			addFault__fFaultPropertyDescriptor(object);
			addTimer__tTimerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iYaw Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iYawStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit133_Input__iYawStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit133_Input__iYawStatus_feature", "_UI_CtrlUnit133_type"),
				 WTSpecPackage.Literals.CTRL_UNIT133__INPUT_IYAW_STATUS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iYaw Current1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iYawCurrent1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit133_Input__iYawCurrent1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit133_Input__iYawCurrent1_feature", "_UI_CtrlUnit133_type"),
				 WTSpecPackage.Literals.CTRL_UNIT133__INPUT_IYAW_CURRENT1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iYaw Current2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iYawCurrent2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit133_Input__iYawCurrent2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit133_Input__iYawCurrent2_feature", "_UI_CtrlUnit133_type"),
				 WTSpecPackage.Literals.CTRL_UNIT133__INPUT_IYAW_CURRENT2,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iYaw Current3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iYawCurrent3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit133_Input__iYawCurrent3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit133_Input__iYawCurrent3_feature", "_UI_CtrlUnit133_type"),
				 WTSpecPackage.Literals.CTRL_UNIT133__INPUT_IYAW_CURRENT3,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iYaw Current4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iYawCurrent4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit133_Input__iYawCurrent4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit133_Input__iYawCurrent4_feature", "_UI_CtrlUnit133_type"),
				 WTSpecPackage.Literals.CTRL_UNIT133__INPUT_IYAW_CURRENT4,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iOverload Alarm Counter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iOverloadAlarmCounterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit133_Input__iOverloadAlarmCounter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit133_Input__iOverloadAlarmCounter_feature", "_UI_CtrlUnit133_type"),
				 WTSpecPackage.Literals.CTRL_UNIT133__INPUT_IOVERLOAD_ALARM_COUNTER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oOverload Alarm Counter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oOverloadAlarmCounterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit133_Output__oOverloadAlarmCounter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit133_Output__oOverloadAlarmCounter_feature", "_UI_CtrlUnit133_type"),
				 WTSpecPackage.Literals.CTRL_UNIT133__OUTPUT_OOVERLOAD_ALARM_COUNTER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pMaximum Torque feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pMaximumTorquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit133_Parameter__pMaximumTorque_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit133_Parameter__pMaximumTorque_feature", "_UI_CtrlUnit133_type"),
				 WTSpecPackage.Literals.CTRL_UNIT133__PARAMETER_PMAXIMUM_TORQUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pMinimum Torque feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pMinimumTorquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit133_Parameter__pMinimumTorque_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit133_Parameter__pMinimumTorque_feature", "_UI_CtrlUnit133_type"),
				 WTSpecPackage.Literals.CTRL_UNIT133__PARAMETER_PMINIMUM_TORQUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pTorque Difference Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pTorqueDifferenceLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit133_Parameter__pTorqueDifferenceLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit133_Parameter__pTorqueDifferenceLimit_feature", "_UI_CtrlUnit133_type"),
				 WTSpecPackage.Literals.CTRL_UNIT133__PARAMETER_PTORQUE_DIFFERENCE_LIMIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fFault feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fFaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit133_Fault__fFault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit133_Fault__fFault_feature", "_UI_CtrlUnit133_type"),
				 WTSpecPackage.Literals.CTRL_UNIT133__FAULT_FFAULT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tTimer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tTimerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit133_Timer__tTimer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit133_Timer__tTimer_feature", "_UI_CtrlUnit133_type"),
				 WTSpecPackage.Literals.CTRL_UNIT133__TIMER_TTIMER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit133.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit133"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit133)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit133_type") :
			getString("_UI_CtrlUnit133_type") + " " + label;
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
