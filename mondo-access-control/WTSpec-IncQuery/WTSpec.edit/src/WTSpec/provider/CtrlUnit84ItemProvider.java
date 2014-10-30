/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit84;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit84} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit84ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit84ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iAngleGH1PropertyDescriptor(object);
			addInput__iAngleGH2PropertyDescriptor(object);
			addInput__iAngleGH3PropertyDescriptor(object);
			addInput__iStopCommandPropertyDescriptor(object);
			addInput__iFlBrakesPropertyDescriptor(object);
			addOutput__oAngleReference1PropertyDescriptor(object);
			addOutput__oAngleReference2PropertyDescriptor(object);
			addOutput__oAngleReference3PropertyDescriptor(object);
			addOutput__oSpeedReferencePropertyDescriptor(object);
			addOutput__oAccelerationReferencePropertyDescriptor(object);
			addParameter__pPitchBrakeAnglePropertyDescriptor(object);
			addParameter__pPitchStdSpeedPropertyDescriptor(object);
			addParameter__pPitchStdAccelerationPropertyDescriptor(object);
			addParameter__pPitchRegulationSpeedPropertyDescriptor(object);
			addParameter__pPitchRegulationAccelerationPropertyDescriptor(object);
			addErrorReaction__erEmergencyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iAngle GH1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iAngleGH1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit84_Input__iAngleGH1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit84_Input__iAngleGH1_feature", "_UI_CtrlUnit84_type"),
				 WTSpecPackage.Literals.CTRL_UNIT84__INPUT_IANGLE_GH1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iAngle GH2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iAngleGH2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit84_Input__iAngleGH2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit84_Input__iAngleGH2_feature", "_UI_CtrlUnit84_type"),
				 WTSpecPackage.Literals.CTRL_UNIT84__INPUT_IANGLE_GH2,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iAngle GH3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iAngleGH3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit84_Input__iAngleGH3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit84_Input__iAngleGH3_feature", "_UI_CtrlUnit84_type"),
				 WTSpecPackage.Literals.CTRL_UNIT84__INPUT_IANGLE_GH3,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iStop Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iStopCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit84_Input__iStopCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit84_Input__iStopCommand_feature", "_UI_CtrlUnit84_type"),
				 WTSpecPackage.Literals.CTRL_UNIT84__INPUT_ISTOP_COMMAND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iFl Brakes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iFlBrakesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit84_Input__iFlBrakes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit84_Input__iFlBrakes_feature", "_UI_CtrlUnit84_type"),
				 WTSpecPackage.Literals.CTRL_UNIT84__INPUT_IFL_BRAKES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oAngle Reference1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oAngleReference1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit84_Output__oAngleReference1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit84_Output__oAngleReference1_feature", "_UI_CtrlUnit84_type"),
				 WTSpecPackage.Literals.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oAngle Reference2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oAngleReference2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit84_Output__oAngleReference2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit84_Output__oAngleReference2_feature", "_UI_CtrlUnit84_type"),
				 WTSpecPackage.Literals.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE2,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oAngle Reference3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oAngleReference3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit84_Output__oAngleReference3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit84_Output__oAngleReference3_feature", "_UI_CtrlUnit84_type"),
				 WTSpecPackage.Literals.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE3,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oSpeed Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oSpeedReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit84_Output__oSpeedReference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit84_Output__oSpeedReference_feature", "_UI_CtrlUnit84_type"),
				 WTSpecPackage.Literals.CTRL_UNIT84__OUTPUT_OSPEED_REFERENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oAcceleration Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oAccelerationReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit84_Output__oAccelerationReference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit84_Output__oAccelerationReference_feature", "_UI_CtrlUnit84_type"),
				 WTSpecPackage.Literals.CTRL_UNIT84__OUTPUT_OACCELERATION_REFERENCE,
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
				 getString("_UI_CtrlUnit84_Parameter__pPitchBrakeAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit84_Parameter__pPitchBrakeAngle_feature", "_UI_CtrlUnit84_type"),
				 WTSpecPackage.Literals.CTRL_UNIT84__PARAMETER_PPITCH_BRAKE_ANGLE,
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
				 getString("_UI_CtrlUnit84_Parameter__pPitchStdSpeed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit84_Parameter__pPitchStdSpeed_feature", "_UI_CtrlUnit84_type"),
				 WTSpecPackage.Literals.CTRL_UNIT84__PARAMETER_PPITCH_STD_SPEED,
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
				 getString("_UI_CtrlUnit84_Parameter__pPitchStdAcceleration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit84_Parameter__pPitchStdAcceleration_feature", "_UI_CtrlUnit84_type"),
				 WTSpecPackage.Literals.CTRL_UNIT84__PARAMETER_PPITCH_STD_ACCELERATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pPitch Regulation Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pPitchRegulationSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit84_Parameter__pPitchRegulationSpeed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit84_Parameter__pPitchRegulationSpeed_feature", "_UI_CtrlUnit84_type"),
				 WTSpecPackage.Literals.CTRL_UNIT84__PARAMETER_PPITCH_REGULATION_SPEED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pPitch Regulation Acceleration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pPitchRegulationAccelerationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit84_Parameter__pPitchRegulationAcceleration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit84_Parameter__pPitchRegulationAcceleration_feature", "_UI_CtrlUnit84_type"),
				 WTSpecPackage.Literals.CTRL_UNIT84__PARAMETER_PPITCH_REGULATION_ACCELERATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Reaction er Emergency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorReaction__erEmergencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit84_ErrorReaction__erEmergency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit84_ErrorReaction__erEmergency_feature", "_UI_CtrlUnit84_type"),
				 WTSpecPackage.Literals.CTRL_UNIT84__ERROR_REACTION_ER_EMERGENCY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit84.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit84"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit84)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit84_type") :
			getString("_UI_CtrlUnit84_type") + " " + label;
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
