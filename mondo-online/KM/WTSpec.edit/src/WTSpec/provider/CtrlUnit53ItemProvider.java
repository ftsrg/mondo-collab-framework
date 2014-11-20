/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit53;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit53} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit53ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit53ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iMachineStatusIndicatorPropertyDescriptor(object);
			addInput__iStopConditionIndicatorPropertyDescriptor(object);
			addInput__iManualByPassPropertyDescriptor(object);
			addInput__iMotorizingPropertyDescriptor(object);
			addInput__iFlagIntoWindPropertyDescriptor(object);
			addInput__iProtectionConditionPropertyDescriptor(object);
			addInput__iEmergencyConditionPropertyDescriptor(object);
			addInput__iDeenergizeConditionPropertyDescriptor(object);
			addOutput__oAutoStopCommandPropertyDescriptor(object);
			addFault__fRunFaultPropertyDescriptor(object);
			addTimer__tStartDelayPropertyDescriptor(object);
			addTimer__tCheckRunFaultPropertyDescriptor(object);
			addErrorReaction__erMotorizingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iMachine Status Indicator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iMachineStatusIndicatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit53_Input__iMachineStatusIndicator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit53_Input__iMachineStatusIndicator_feature", "_UI_CtrlUnit53_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit53_Input__iMachineStatusIndicator(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iStop Condition Indicator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iStopConditionIndicatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit53_Input__iStopConditionIndicator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit53_Input__iStopConditionIndicator_feature", "_UI_CtrlUnit53_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit53_Input__iStopConditionIndicator(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iManual By Pass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iManualByPassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit53_Input__iManualByPass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit53_Input__iManualByPass_feature", "_UI_CtrlUnit53_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit53_Input__iManualByPass(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iMotorizing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iMotorizingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit53_Input__iMotorizing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit53_Input__iMotorizing_feature", "_UI_CtrlUnit53_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit53_Input__iMotorizing(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iFlag Into Wind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iFlagIntoWindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit53_Input__iFlagIntoWind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit53_Input__iFlagIntoWind_feature", "_UI_CtrlUnit53_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit53_Input__iFlagIntoWind(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iProtection Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iProtectionConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit53_Input__iProtectionCondition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit53_Input__iProtectionCondition_feature", "_UI_CtrlUnit53_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit53_Input__iProtectionCondition(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iEmergency Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iEmergencyConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit53_Input__iEmergencyCondition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit53_Input__iEmergencyCondition_feature", "_UI_CtrlUnit53_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit53_Input__iEmergencyCondition(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iDeenergize Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iDeenergizeConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit53_Input__iDeenergizeCondition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit53_Input__iDeenergizeCondition_feature", "_UI_CtrlUnit53_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit53_Input__iDeenergizeCondition(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oAuto Stop Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oAutoStopCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit53_Output__oAutoStopCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit53_Output__oAutoStopCommand_feature", "_UI_CtrlUnit53_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit53_Output__oAutoStopCommand(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fRun Fault feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fRunFaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit53_Fault__fRunFault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit53_Fault__fRunFault_feature", "_UI_CtrlUnit53_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit53_Fault__fRunFault(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tStart Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tStartDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit53_Timer__tStartDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit53_Timer__tStartDelay_feature", "_UI_CtrlUnit53_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit53_Timer__tStartDelay(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tCheck Run Fault feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tCheckRunFaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit53_Timer__tCheckRunFault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit53_Timer__tCheckRunFault_feature", "_UI_CtrlUnit53_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit53_Timer__tCheckRunFault(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Reaction er Motorizing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorReaction__erMotorizingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit53_ErrorReaction__erMotorizing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit53_ErrorReaction__erMotorizing_feature", "_UI_CtrlUnit53_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit53_ErrorReaction__erMotorizing(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit53.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit53"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit53)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit53_type") :
			getString("_UI_CtrlUnit53_type") + " " + label;
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
