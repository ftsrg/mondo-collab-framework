/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit66;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit66} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit66ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit66ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iMaintenancePreventiveButtonPropertyDescriptor(object);
			addInput__iMaintenanceCorrectiveButtonPropertyDescriptor(object);
			addInput__iDontCheckInputPropertyDescriptor(object);
			addOutput__oMaintenanceStatusPropertyDescriptor(object);
			addFault__fMaintenancePreventivePropertyDescriptor(object);
			addFault__fMaintenanceCorrectivePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iMaintenance Preventive Button feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iMaintenancePreventiveButtonPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit66_Input__iMaintenancePreventiveButton_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit66_Input__iMaintenancePreventiveButton_feature", "_UI_CtrlUnit66_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit66_Input__iMaintenancePreventiveButton(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iMaintenance Corrective Button feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iMaintenanceCorrectiveButtonPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit66_Input__iMaintenanceCorrectiveButton_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit66_Input__iMaintenanceCorrectiveButton_feature", "_UI_CtrlUnit66_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit66_Input__iMaintenanceCorrectiveButton(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iDont Check Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iDontCheckInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit66_Input__iDontCheckInput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit66_Input__iDontCheckInput_feature", "_UI_CtrlUnit66_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit66_Input__iDontCheckInput(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oMaintenance Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oMaintenanceStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit66_Output__oMaintenanceStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit66_Output__oMaintenanceStatus_feature", "_UI_CtrlUnit66_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit66_Output__oMaintenanceStatus(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fMaintenance Preventive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fMaintenancePreventivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit66_Fault__fMaintenancePreventive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit66_Fault__fMaintenancePreventive_feature", "_UI_CtrlUnit66_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit66_Fault__fMaintenancePreventive(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fMaintenance Corrective feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fMaintenanceCorrectivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit66_Fault__fMaintenanceCorrective_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit66_Fault__fMaintenanceCorrective_feature", "_UI_CtrlUnit66_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit66_Fault__fMaintenanceCorrective(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit66.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit66"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit66)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit66_type") :
			getString("_UI_CtrlUnit66_type") + " " + label;
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
