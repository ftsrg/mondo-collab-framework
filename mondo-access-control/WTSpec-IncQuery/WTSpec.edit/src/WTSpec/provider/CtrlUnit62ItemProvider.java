/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit62;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit62} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit62ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit62ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iInverterTorqueRefPropertyDescriptor(object);
			addInput__iInverterTorqueRefLockingPropertyDescriptor(object);
			addInput__iMotorizingPropertyDescriptor(object);
			addOutput__oInverterTorqueRefFinalPropertyDescriptor(object);
			addOutput__oInverterMotorizeCommandPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iInverter Torque Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInverterTorqueRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit62_Input__iInverterTorqueRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit62_Input__iInverterTorqueRef_feature", "_UI_CtrlUnit62_type"),
				 WTSpecPackage.Literals.CTRL_UNIT62__INPUT_IINVERTER_TORQUE_REF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInverter Torque Ref Locking feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInverterTorqueRefLockingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit62_Input__iInverterTorqueRefLocking_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit62_Input__iInverterTorqueRefLocking_feature", "_UI_CtrlUnit62_type"),
				 WTSpecPackage.Literals.CTRL_UNIT62__INPUT_IINVERTER_TORQUE_REF_LOCKING,
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
				 getString("_UI_CtrlUnit62_Input__iMotorizing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit62_Input__iMotorizing_feature", "_UI_CtrlUnit62_type"),
				 WTSpecPackage.Literals.CTRL_UNIT62__INPUT_IMOTORIZING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oInverter Torque Ref Final feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oInverterTorqueRefFinalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit62_Output__oInverterTorqueRefFinal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit62_Output__oInverterTorqueRefFinal_feature", "_UI_CtrlUnit62_type"),
				 WTSpecPackage.Literals.CTRL_UNIT62__OUTPUT_OINVERTER_TORQUE_REF_FINAL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oInverter Motorize Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oInverterMotorizeCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit62_Output__oInverterMotorizeCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit62_Output__oInverterMotorizeCommand_feature", "_UI_CtrlUnit62_type"),
				 WTSpecPackage.Literals.CTRL_UNIT62__OUTPUT_OINVERTER_MOTORIZE_COMMAND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit62.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit62"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit62)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit62_type") :
			getString("_UI_CtrlUnit62_type") + " " + label;
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
