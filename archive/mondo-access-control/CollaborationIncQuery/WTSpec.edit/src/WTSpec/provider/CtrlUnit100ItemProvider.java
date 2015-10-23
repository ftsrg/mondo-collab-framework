/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit100;
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
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit100} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit100ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit100ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iPinPositionPropertyDescriptor(object);
			addOutput__oPinSafetyCmdPropertyDescriptor(object);
			addParameter__pPinNoBackPosPropertyDescriptor(object);
			addParameter__pPinExtendedPosPropertyDescriptor(object);
			addParameter__pPinRetractedPosPropertyDescriptor(object);
			addParameter__pPinHysteresisPropertyDescriptor(object);
			addBhvParam__bpModePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iPin Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPinPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit100_Input__iPinPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit100_Input__iPinPosition_feature", "_UI_CtrlUnit100_type"),
				 WTSpecPackage.Literals.CTRL_UNIT100__INPUT_IPIN_POSITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPin Safety Cmd feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPinSafetyCmdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit100_Output__oPinSafetyCmd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit100_Output__oPinSafetyCmd_feature", "_UI_CtrlUnit100_type"),
				 WTSpecPackage.Literals.CTRL_UNIT100__OUTPUT_OPIN_SAFETY_CMD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pPin No Back Pos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pPinNoBackPosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit100_Parameter__pPinNoBackPos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit100_Parameter__pPinNoBackPos_feature", "_UI_CtrlUnit100_type"),
				 WTSpecPackage.Literals.CTRL_UNIT100__PARAMETER_PPIN_NO_BACK_POS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pPin Extended Pos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pPinExtendedPosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit100_Parameter__pPinExtendedPos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit100_Parameter__pPinExtendedPos_feature", "_UI_CtrlUnit100_type"),
				 WTSpecPackage.Literals.CTRL_UNIT100__PARAMETER_PPIN_EXTENDED_POS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pPin Retracted Pos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pPinRetractedPosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit100_Parameter__pPinRetractedPos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit100_Parameter__pPinRetractedPos_feature", "_UI_CtrlUnit100_type"),
				 WTSpecPackage.Literals.CTRL_UNIT100__PARAMETER_PPIN_RETRACTED_POS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pPin Hysteresis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pPinHysteresisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit100_Parameter__pPinHysteresis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit100_Parameter__pPinHysteresis_feature", "_UI_CtrlUnit100_type"),
				 WTSpecPackage.Literals.CTRL_UNIT100__PARAMETER_PPIN_HYSTERESIS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bhv Param bp Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBhvParam__bpModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit100_BhvParam__bpMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit100_BhvParam__bpMode_feature", "_UI_CtrlUnit100_type"),
				 WTSpecPackage.Literals.CTRL_UNIT100__BHV_PARAM_BP_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit100.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit100"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit100)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit100_type") :
			getString("_UI_CtrlUnit100_type") + " " + label;
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

		switch (notification.getFeatureID(CtrlUnit100.class)) {
			case WTSpecPackage.CTRL_UNIT100__BHV_PARAM_BP_MODE:
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
