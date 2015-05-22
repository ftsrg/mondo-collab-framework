/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit4;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit4} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit4ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit4ItemProvider(AdapterFactory adapterFactory) {
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
			addParameter__pAlarmCountLimitPropertyDescriptor(object);
			addParameter__pTimePeriodPropertyDescriptor(object);
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
				 getString("_UI_CtrlUnit4_Input__iStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit4_Input__iStatus_feature", "_UI_CtrlUnit4_type"),
				 WTSpecPackage.Literals.CTRL_UNIT4__INPUT_ISTATUS,
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
				 getString("_UI_CtrlUnit4_Input__iOverloadAlarm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit4_Input__iOverloadAlarm_feature", "_UI_CtrlUnit4_type"),
				 WTSpecPackage.Literals.CTRL_UNIT4__INPUT_IOVERLOAD_ALARM,
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
				 getString("_UI_CtrlUnit4_Input__iAlarmCounter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit4_Input__iAlarmCounter_feature", "_UI_CtrlUnit4_type"),
				 WTSpecPackage.Literals.CTRL_UNIT4__INPUT_IALARM_COUNTER,
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
				 getString("_UI_CtrlUnit4_Output__oAlarmCounter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit4_Output__oAlarmCounter_feature", "_UI_CtrlUnit4_type"),
				 WTSpecPackage.Literals.CTRL_UNIT4__OUTPUT_OALARM_COUNTER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pAlarm Count Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pAlarmCountLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit4_Parameter__pAlarmCountLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit4_Parameter__pAlarmCountLimit_feature", "_UI_CtrlUnit4_type"),
				 WTSpecPackage.Literals.CTRL_UNIT4__PARAMETER_PALARM_COUNT_LIMIT,
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
				 getString("_UI_CtrlUnit4_Parameter__pTimePeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit4_Parameter__pTimePeriod_feature", "_UI_CtrlUnit4_type"),
				 WTSpecPackage.Literals.CTRL_UNIT4__PARAMETER_PTIME_PERIOD,
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
				 getString("_UI_CtrlUnit4_Fault__fOverload_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit4_Fault__fOverload_feature", "_UI_CtrlUnit4_type"),
				 WTSpecPackage.Literals.CTRL_UNIT4__FAULT_FOVERLOAD,
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
				 getString("_UI_CtrlUnit4_Timer__tSyncDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit4_Timer__tSyncDelay_feature", "_UI_CtrlUnit4_type"),
				 WTSpecPackage.Literals.CTRL_UNIT4__TIMER_TSYNC_DELAY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit4.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit4"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit4)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit4_type") :
			getString("_UI_CtrlUnit4_type") + " " + label;
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
