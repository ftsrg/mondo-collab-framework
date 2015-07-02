/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit49;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit49} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit49ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit49ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iInput1PropertyDescriptor(object);
			addInput__iInput2PropertyDescriptor(object);
			addInput__iInput3PropertyDescriptor(object);
			addInput__iInput4PropertyDescriptor(object);
			addOutput__oOutputFan1PropertyDescriptor(object);
			addOutput__oOutputFan2PropertyDescriptor(object);
			addParameter__pParam1PropertyDescriptor(object);
			addParameter__pParam2PropertyDescriptor(object);
			addParameter__pParam3PropertyDescriptor(object);
			addParameter__pParam4PropertyDescriptor(object);
			addFault__fFault1PropertyDescriptor(object);
			addTimer__tTimer1PropertyDescriptor(object);
			addErrorReaction__eReaction1PropertyDescriptor(object);
			addErrorReaction__eReaction2PropertyDescriptor(object);
			addGuard__gGuardErrorsPropertyDescriptor(object);
			addGuard__gGuardNoErrorsPropertyDescriptor(object);
			addGuard__gGuardOffToHiPropertyDescriptor(object);
			addGuard__gGuardHiToOffPropertyDescriptor(object);
			addGuard__gGuardOffToLowPropertyDescriptor(object);
			addGuard__gGuardLowToOffPropertyDescriptor(object);
			addGuard__gGuardLowToHiPropertyDescriptor(object);
			addGuard__gGuardHiToLowPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iInput1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInput1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Input__iInput1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Input__iInput1_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__INPUT_IINPUT1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInput2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInput2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Input__iInput2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Input__iInput2_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__INPUT_IINPUT2,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInput3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInput3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Input__iInput3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Input__iInput3_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__INPUT_IINPUT3,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInput4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInput4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Input__iInput4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Input__iInput4_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__INPUT_IINPUT4,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oOutput Fan1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oOutputFan1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Output__oOutputFan1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Output__oOutputFan1_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__OUTPUT_OOUTPUT_FAN1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oOutput Fan2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oOutputFan2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Output__oOutputFan2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Output__oOutputFan2_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__OUTPUT_OOUTPUT_FAN2,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pParam1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pParam1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Parameter__pParam1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Parameter__pParam1_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__PARAMETER_PPARAM1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pParam2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pParam2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Parameter__pParam2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Parameter__pParam2_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__PARAMETER_PPARAM2,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pParam3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pParam3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Parameter__pParam3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Parameter__pParam3_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__PARAMETER_PPARAM3,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pParam4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pParam4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Parameter__pParam4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Parameter__pParam4_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__PARAMETER_PPARAM4,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fFault1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fFault1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Fault__fFault1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Fault__fFault1_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__FAULT_FFAULT1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tTimer1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tTimer1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Timer__tTimer1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Timer__tTimer1_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__TIMER_TTIMER1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Reaction eReaction1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorReaction__eReaction1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_ErrorReaction__eReaction1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_ErrorReaction__eReaction1_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__ERROR_REACTION_EREACTION1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Reaction eReaction2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorReaction__eReaction2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_ErrorReaction__eReaction2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_ErrorReaction__eReaction2_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__ERROR_REACTION_EREACTION2,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guard gGuard Errors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuard__gGuardErrorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Guard__gGuardErrors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Guard__gGuardErrors_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__GUARD_GGUARD_ERRORS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guard gGuard No Errors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuard__gGuardNoErrorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Guard__gGuardNoErrors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Guard__gGuardNoErrors_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__GUARD_GGUARD_NO_ERRORS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guard gGuard Off To Hi feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuard__gGuardOffToHiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Guard__gGuardOffToHi_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Guard__gGuardOffToHi_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__GUARD_GGUARD_OFF_TO_HI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guard gGuard Hi To Off feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuard__gGuardHiToOffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Guard__gGuardHiToOff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Guard__gGuardHiToOff_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__GUARD_GGUARD_HI_TO_OFF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guard gGuard Off To Low feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuard__gGuardOffToLowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Guard__gGuardOffToLow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Guard__gGuardOffToLow_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__GUARD_GGUARD_OFF_TO_LOW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guard gGuard Low To Off feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuard__gGuardLowToOffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Guard__gGuardLowToOff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Guard__gGuardLowToOff_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__GUARD_GGUARD_LOW_TO_OFF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guard gGuard Low To Hi feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuard__gGuardLowToHiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Guard__gGuardLowToHi_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Guard__gGuardLowToHi_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__GUARD_GGUARD_LOW_TO_HI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guard gGuard Hi To Low feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuard__gGuardHiToLowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit49_Guard__gGuardHiToLow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit49_Guard__gGuardHiToLow_feature", "_UI_CtrlUnit49_type"),
				 WTSpecPackage.Literals.CTRL_UNIT49__GUARD_GGUARD_HI_TO_LOW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit49.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit49"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit49)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit49_type") :
			getString("_UI_CtrlUnit49_type") + " " + label;
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

		switch (notification.getFeatureID(CtrlUnit49.class)) {
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_ERRORS:
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_NO_ERRORS:
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_OFF_TO_HI:
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_HI_TO_OFF:
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_OFF_TO_LOW:
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_LOW_TO_OFF:
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_LOW_TO_HI:
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_HI_TO_LOW:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
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
