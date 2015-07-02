/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit54;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit54} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit54ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit54ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iSafetyPropertyDescriptor(object);
			addInput__iLockingOrderSelectedPropertyDescriptor(object);
			addInput__iMachineStateLPropertyDescriptor(object);
			addInput__iMachineStateUPropertyDescriptor(object);
			addInput__iMachineStateSPropertyDescriptor(object);
			addInput__iInitialConditionsPropertyDescriptor(object);
			addInput__iPinStatePropertyDescriptor(object);
			addOutput__oLockingOrderPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iSafety feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iSafetyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit54_Input__iSafety_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit54_Input__iSafety_feature", "_UI_CtrlUnit54_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit54_Input__iSafety(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iLocking Order Selected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iLockingOrderSelectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit54_Input__iLockingOrderSelected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit54_Input__iLockingOrderSelected_feature", "_UI_CtrlUnit54_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit54_Input__iLockingOrderSelected(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iMachine State L feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iMachineStateLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit54_Input__iMachineStateL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit54_Input__iMachineStateL_feature", "_UI_CtrlUnit54_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit54_Input__iMachineStateL(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iMachine State U feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iMachineStateUPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit54_Input__iMachineStateU_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit54_Input__iMachineStateU_feature", "_UI_CtrlUnit54_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit54_Input__iMachineStateU(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iMachine State S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iMachineStateSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit54_Input__iMachineStateS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit54_Input__iMachineStateS_feature", "_UI_CtrlUnit54_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit54_Input__iMachineStateS(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInitial Conditions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInitialConditionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit54_Input__iInitialConditions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit54_Input__iInitialConditions_feature", "_UI_CtrlUnit54_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit54_Input__iInitialConditions(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iPin State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPinStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit54_Input__iPinState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit54_Input__iPinState_feature", "_UI_CtrlUnit54_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit54_Input__iPinState(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oLocking Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oLockingOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit54_Output__oLockingOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit54_Output__oLockingOrder_feature", "_UI_CtrlUnit54_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit54_Output__oLockingOrder(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit54.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit54"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit54)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit54_type") :
			getString("_UI_CtrlUnit54_type") + " " + label;
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
