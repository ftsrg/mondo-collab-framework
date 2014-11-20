/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit117;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit117} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit117ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit117ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iYawBrakeCommandPropertyDescriptor(object);
			addInput__iYawElectrobrakeStatusPropertyDescriptor(object);
			addInput__iYawHydraulicbrakeStatusPropertyDescriptor(object);
			addInput__iInhibitYawPropertyDescriptor(object);
			addOutput__oYawBrakeStatusPropertyDescriptor(object);
			addOutput__oYawElectrobrakeOrderPropertyDescriptor(object);
			addOutput__oYawHydraulicbrakeOrderPropertyDescriptor(object);
			addOutput__oBrakesSetProblemPropertyDescriptor(object);
			addOutput__oBrakesLiftedProblemPropertyDescriptor(object);
			addTimer__tYawBrakeActionsDelayPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iYaw Brake Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iYawBrakeCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit117_Input__iYawBrakeCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit117_Input__iYawBrakeCommand_feature", "_UI_CtrlUnit117_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit117_Input__iYawBrakeCommand(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iYaw Electrobrake Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iYawElectrobrakeStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit117_Input__iYawElectrobrakeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit117_Input__iYawElectrobrakeStatus_feature", "_UI_CtrlUnit117_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit117_Input__iYawElectrobrakeStatus(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iYaw Hydraulicbrake Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iYawHydraulicbrakeStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit117_Input__iYawHydraulicbrakeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit117_Input__iYawHydraulicbrakeStatus_feature", "_UI_CtrlUnit117_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit117_Input__iYawHydraulicbrakeStatus(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInhibit Yaw feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInhibitYawPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit117_Input__iInhibitYaw_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit117_Input__iInhibitYaw_feature", "_UI_CtrlUnit117_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit117_Input__iInhibitYaw(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oYaw Brake Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oYawBrakeStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit117_Output__oYawBrakeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit117_Output__oYawBrakeStatus_feature", "_UI_CtrlUnit117_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit117_Output__oYawBrakeStatus(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oYaw Electrobrake Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oYawElectrobrakeOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit117_Output__oYawElectrobrakeOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit117_Output__oYawElectrobrakeOrder_feature", "_UI_CtrlUnit117_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit117_Output__oYawElectrobrakeOrder(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oYaw Hydraulicbrake Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oYawHydraulicbrakeOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit117_Output__oYawHydraulicbrakeOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit117_Output__oYawHydraulicbrakeOrder_feature", "_UI_CtrlUnit117_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit117_Output__oYawHydraulicbrakeOrder(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oBrakes Set Problem feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oBrakesSetProblemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit117_Output__oBrakesSetProblem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit117_Output__oBrakesSetProblem_feature", "_UI_CtrlUnit117_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit117_Output__oBrakesSetProblem(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oBrakes Lifted Problem feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oBrakesLiftedProblemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit117_Output__oBrakesLiftedProblem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit117_Output__oBrakesLiftedProblem_feature", "_UI_CtrlUnit117_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit117_Output__oBrakesLiftedProblem(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tYaw Brake Actions Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tYawBrakeActionsDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit117_Timer__tYawBrakeActionsDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit117_Timer__tYawBrakeActionsDelay_feature", "_UI_CtrlUnit117_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit117_Timer__tYawBrakeActionsDelay(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit117.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit117"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit117)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit117_type") :
			getString("_UI_CtrlUnit117_type") + " " + label;
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
