/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit89;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit89} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit89ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit89ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iAngleReference1PropertyDescriptor(object);
			addInput__iAngleReference2PropertyDescriptor(object);
			addInput__iAngleReference3PropertyDescriptor(object);
			addInput__iSpeedReferencePropertyDescriptor(object);
			addInput__iAccelerationReferencePropertyDescriptor(object);
			addInput__iPitchManualControlPropertyDescriptor(object);
			addInput__iPitchManualAnglePropertyDescriptor(object);
			addInput__iMaintenanceStatusPropertyDescriptor(object);
			addInput__iGeneratorSpeedPropertyDescriptor(object);
			addInput__iPitchBrakedPropertyDescriptor(object);
			addOutput__oPitchAngleRef1PropertyDescriptor(object);
			addOutput__oPitchAngleRef2PropertyDescriptor(object);
			addOutput__oPitchAngleRef3PropertyDescriptor(object);
			addOutput__oPitchSpeedRefPropertyDescriptor(object);
			addOutput__oPitchAccelerationRefPropertyDescriptor(object);
			addOutput__oPitchStopCommandPropertyDescriptor(object);
			addParameter__pGeneratorSpeedPropertyDescriptor(object);
			addParameter__pPitchBrakeAnglePropertyDescriptor(object);
			addParameter__pPitchStdSpeedPropertyDescriptor(object);
			addParameter__pPitchStdAccelerationPropertyDescriptor(object);
			addFault__fManualStopPropertyDescriptor(object);
			addTimer__tMaxStopOperationLengthPropertyDescriptor(object);
			addErrorReaction__erStopPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iAngle Reference1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iAngleReference1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Input__iAngleReference1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Input__iAngleReference1_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__INPUT_IANGLE_REFERENCE1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iAngle Reference2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iAngleReference2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Input__iAngleReference2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Input__iAngleReference2_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__INPUT_IANGLE_REFERENCE2,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iAngle Reference3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iAngleReference3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Input__iAngleReference3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Input__iAngleReference3_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__INPUT_IANGLE_REFERENCE3,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iSpeed Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iSpeedReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Input__iSpeedReference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Input__iSpeedReference_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__INPUT_ISPEED_REFERENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iAcceleration Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iAccelerationReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Input__iAccelerationReference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Input__iAccelerationReference_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__INPUT_IACCELERATION_REFERENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iPitch Manual Control feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPitchManualControlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Input__iPitchManualControl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Input__iPitchManualControl_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__INPUT_IPITCH_MANUAL_CONTROL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iPitch Manual Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPitchManualAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Input__iPitchManualAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Input__iPitchManualAngle_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__INPUT_IPITCH_MANUAL_ANGLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iMaintenance Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iMaintenanceStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Input__iMaintenanceStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Input__iMaintenanceStatus_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__INPUT_IMAINTENANCE_STATUS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iGenerator Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iGeneratorSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Input__iGeneratorSpeed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Input__iGeneratorSpeed_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__INPUT_IGENERATOR_SPEED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iPitch Braked feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPitchBrakedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Input__iPitchBraked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Input__iPitchBraked_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__INPUT_IPITCH_BRAKED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPitch Angle Ref1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPitchAngleRef1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Output__oPitchAngleRef1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Output__oPitchAngleRef1_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPitch Angle Ref2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPitchAngleRef2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Output__oPitchAngleRef2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Output__oPitchAngleRef2_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF2,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPitch Angle Ref3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPitchAngleRef3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Output__oPitchAngleRef3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Output__oPitchAngleRef3_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF3,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPitch Speed Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPitchSpeedRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Output__oPitchSpeedRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Output__oPitchSpeedRef_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__OUTPUT_OPITCH_SPEED_REF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPitch Acceleration Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPitchAccelerationRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Output__oPitchAccelerationRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Output__oPitchAccelerationRef_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__OUTPUT_OPITCH_ACCELERATION_REF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPitch Stop Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPitchStopCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Output__oPitchStopCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Output__oPitchStopCommand_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__OUTPUT_OPITCH_STOP_COMMAND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pGenerator Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pGeneratorSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Parameter__pGeneratorSpeed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Parameter__pGeneratorSpeed_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__PARAMETER_PGENERATOR_SPEED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pPitch Brake Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pPitchBrakeAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Parameter__pPitchBrakeAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Parameter__pPitchBrakeAngle_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__PARAMETER_PPITCH_BRAKE_ANGLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pPitch Std Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pPitchStdSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Parameter__pPitchStdSpeed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Parameter__pPitchStdSpeed_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__PARAMETER_PPITCH_STD_SPEED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pPitch Std Acceleration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pPitchStdAccelerationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Parameter__pPitchStdAcceleration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Parameter__pPitchStdAcceleration_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__PARAMETER_PPITCH_STD_ACCELERATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fManual Stop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fManualStopPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Fault__fManualStop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Fault__fManualStop_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__FAULT_FMANUAL_STOP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tMax Stop Operation Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tMaxStopOperationLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_Timer__tMaxStopOperationLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_Timer__tMaxStopOperationLength_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__TIMER_TMAX_STOP_OPERATION_LENGTH,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Reaction er Stop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorReaction__erStopPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit89_ErrorReaction__erStop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit89_ErrorReaction__erStop_feature", "_UI_CtrlUnit89_type"),
				 WTSpecPackage.Literals.CTRL_UNIT89__ERROR_REACTION_ER_STOP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit89.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit89"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit89)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit89_type") :
			getString("_UI_CtrlUnit89_type") + " " + label;
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
