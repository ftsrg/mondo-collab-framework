/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit22;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit22} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit22ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit22ItemProvider(AdapterFactory adapterFactory) {
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
			addInput__iTwistAnglePropertyDescriptor(object);
			addInput__iMaxTwistCWPropertyDescriptor(object);
			addInput__iMaxTwistCCWPropertyDescriptor(object);
			addOutput__oMaxTwistPreCommandPropertyDescriptor(object);
			addParameter__pMaxTwistHysteresisPropertyDescriptor(object);
			addFault__fTwistExcessiveCWPropertyDescriptor(object);
			addFault__fTwistExcessiveCCWPropertyDescriptor(object);
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
				 getString("_UI_CtrlUnit22_Input__iYawStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit22_Input__iYawStatus_feature", "_UI_CtrlUnit22_type"),
				 WTSpecPackage.Literals.CTRL_UNIT22__INPUT_IYAW_STATUS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iTwist Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iTwistAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit22_Input__iTwistAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit22_Input__iTwistAngle_feature", "_UI_CtrlUnit22_type"),
				 WTSpecPackage.Literals.CTRL_UNIT22__INPUT_ITWIST_ANGLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iMax Twist CW feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iMaxTwistCWPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit22_Input__iMaxTwistCW_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit22_Input__iMaxTwistCW_feature", "_UI_CtrlUnit22_type"),
				 WTSpecPackage.Literals.CTRL_UNIT22__INPUT_IMAX_TWIST_CW,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iMax Twist CCW feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iMaxTwistCCWPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit22_Input__iMaxTwistCCW_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit22_Input__iMaxTwistCCW_feature", "_UI_CtrlUnit22_type"),
				 WTSpecPackage.Literals.CTRL_UNIT22__INPUT_IMAX_TWIST_CCW,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oMax Twist Pre Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oMaxTwistPreCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit22_Output__oMaxTwistPreCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit22_Output__oMaxTwistPreCommand_feature", "_UI_CtrlUnit22_type"),
				 WTSpecPackage.Literals.CTRL_UNIT22__OUTPUT_OMAX_TWIST_PRE_COMMAND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pMax Twist Hysteresis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pMaxTwistHysteresisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit22_Parameter__pMaxTwistHysteresis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit22_Parameter__pMaxTwistHysteresis_feature", "_UI_CtrlUnit22_type"),
				 WTSpecPackage.Literals.CTRL_UNIT22__PARAMETER_PMAX_TWIST_HYSTERESIS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fTwist Excessive CW feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fTwistExcessiveCWPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit22_Fault__fTwistExcessiveCW_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit22_Fault__fTwistExcessiveCW_feature", "_UI_CtrlUnit22_type"),
				 WTSpecPackage.Literals.CTRL_UNIT22__FAULT_FTWIST_EXCESSIVE_CW,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fTwist Excessive CCW feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fTwistExcessiveCCWPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit22_Fault__fTwistExcessiveCCW_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit22_Fault__fTwistExcessiveCCW_feature", "_UI_CtrlUnit22_type"),
				 WTSpecPackage.Literals.CTRL_UNIT22__FAULT_FTWIST_EXCESSIVE_CCW,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit22.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit22"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit22)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit22_type") :
			getString("_UI_CtrlUnit22_type") + " " + label;
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
