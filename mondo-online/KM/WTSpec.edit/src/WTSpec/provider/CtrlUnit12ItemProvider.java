/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit12;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit12} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit12ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit12ItemProvider(AdapterFactory adapterFactory) {
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
			addInput__iInductivePropertyDescriptor(object);
			addInput__iFlInPositionPropertyDescriptor(object);
			addInput__iLockingOrderPropertyDescriptor(object);
			addInput__iLockingSetPropertyDescriptor(object);
			addOutput__oPinAutoCmdPropertyDescriptor(object);
			addParameter__pPinNoBackPosPropertyDescriptor(object);
			addParameter__pPinExtendedPosPropertyDescriptor(object);
			addParameter__pPinRetractedPosPropertyDescriptor(object);
			addParameter__pPinHysteresisPropertyDescriptor(object);
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
				 getString("_UI_CtrlUnit12_Input__iPinPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit12_Input__iPinPosition_feature", "_UI_CtrlUnit12_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit12_Input__iPinPosition(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInductive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInductivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit12_Input__iInductive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit12_Input__iInductive_feature", "_UI_CtrlUnit12_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit12_Input__iInductive(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iFl In Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iFlInPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit12_Input__iFlInPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit12_Input__iFlInPosition_feature", "_UI_CtrlUnit12_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit12_Input__iFlInPosition(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iLocking Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iLockingOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit12_Input__iLockingOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit12_Input__iLockingOrder_feature", "_UI_CtrlUnit12_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit12_Input__iLockingOrder(),
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
				 getString("_UI_CtrlUnit12_Input__iLockingSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit12_Input__iLockingSet_feature", "_UI_CtrlUnit12_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit12_Input__iLockingSet(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPin Auto Cmd feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPinAutoCmdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit12_Output__oPinAutoCmd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit12_Output__oPinAutoCmd_feature", "_UI_CtrlUnit12_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit12_Output__oPinAutoCmd(),
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
				 getString("_UI_CtrlUnit12_Parameter__pPinNoBackPos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit12_Parameter__pPinNoBackPos_feature", "_UI_CtrlUnit12_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit12_Parameter__pPinNoBackPos(),
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
				 getString("_UI_CtrlUnit12_Parameter__pPinExtendedPos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit12_Parameter__pPinExtendedPos_feature", "_UI_CtrlUnit12_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit12_Parameter__pPinExtendedPos(),
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
				 getString("_UI_CtrlUnit12_Parameter__pPinRetractedPos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit12_Parameter__pPinRetractedPos_feature", "_UI_CtrlUnit12_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit12_Parameter__pPinRetractedPos(),
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
				 getString("_UI_CtrlUnit12_Parameter__pPinHysteresis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit12_Parameter__pPinHysteresis_feature", "_UI_CtrlUnit12_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit12_Parameter__pPinHysteresis(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit12.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit12"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit12)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit12_type") :
			getString("_UI_CtrlUnit12_type") + " " + label;
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
