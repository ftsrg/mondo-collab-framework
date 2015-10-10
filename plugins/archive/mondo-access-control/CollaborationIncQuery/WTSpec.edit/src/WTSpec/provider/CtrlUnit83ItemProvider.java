/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit83;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit83} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit83ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit83ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iPinSafetyCmdPropertyDescriptor(object);
			addInput__iPinAutoCmdPropertyDescriptor(object);
			addInput__iPinManualCmdPropertyDescriptor(object);
			addInput__iLockingSetPropertyDescriptor(object);
			addInput__iManualModePropertyDescriptor(object);
			addInput__iSafetyBlockPropertyDescriptor(object);
			addOutput__oPinEnablePropertyDescriptor(object);
			addOutput__oPinExtendPropertyDescriptor(object);
			addOutput__oPinRetractPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iPin Safety Cmd feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPinSafetyCmdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit83_Input__iPinSafetyCmd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit83_Input__iPinSafetyCmd_feature", "_UI_CtrlUnit83_type"),
				 WTSpecPackage.Literals.CTRL_UNIT83__INPUT_IPIN_SAFETY_CMD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iPin Auto Cmd feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPinAutoCmdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit83_Input__iPinAutoCmd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit83_Input__iPinAutoCmd_feature", "_UI_CtrlUnit83_type"),
				 WTSpecPackage.Literals.CTRL_UNIT83__INPUT_IPIN_AUTO_CMD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iPin Manual Cmd feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPinManualCmdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit83_Input__iPinManualCmd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit83_Input__iPinManualCmd_feature", "_UI_CtrlUnit83_type"),
				 WTSpecPackage.Literals.CTRL_UNIT83__INPUT_IPIN_MANUAL_CMD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iLocking Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iLockingSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit83_Input__iLockingSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit83_Input__iLockingSet_feature", "_UI_CtrlUnit83_type"),
				 WTSpecPackage.Literals.CTRL_UNIT83__INPUT_ILOCKING_SET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iManual Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iManualModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit83_Input__iManualMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit83_Input__iManualMode_feature", "_UI_CtrlUnit83_type"),
				 WTSpecPackage.Literals.CTRL_UNIT83__INPUT_IMANUAL_MODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iSafety Block feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iSafetyBlockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit83_Input__iSafetyBlock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit83_Input__iSafetyBlock_feature", "_UI_CtrlUnit83_type"),
				 WTSpecPackage.Literals.CTRL_UNIT83__INPUT_ISAFETY_BLOCK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPin Enable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPinEnablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit83_Output__oPinEnable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit83_Output__oPinEnable_feature", "_UI_CtrlUnit83_type"),
				 WTSpecPackage.Literals.CTRL_UNIT83__OUTPUT_OPIN_ENABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPin Extend feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPinExtendPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit83_Output__oPinExtend_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit83_Output__oPinExtend_feature", "_UI_CtrlUnit83_type"),
				 WTSpecPackage.Literals.CTRL_UNIT83__OUTPUT_OPIN_EXTEND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPin Retract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPinRetractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit83_Output__oPinRetract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit83_Output__oPinRetract_feature", "_UI_CtrlUnit83_type"),
				 WTSpecPackage.Literals.CTRL_UNIT83__OUTPUT_OPIN_RETRACT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit83.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit83"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit83)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit83_type") :
			getString("_UI_CtrlUnit83_type") + " " + label;
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
