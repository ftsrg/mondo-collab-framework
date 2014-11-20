/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit75;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit75} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit75ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit75ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iMaintenanceStatusPropertyDescriptor(object);
			addInput__iFlBrakesPropertyDescriptor(object);
			addInput__iWTGStoppedPropertyDescriptor(object);
			addInput__iGridErrorPropertyDescriptor(object);
			addInput__iReTwistingPropertyDescriptor(object);
			addInput__iHiWindPropertyDescriptor(object);
			addInput__iHiGustPropertyDescriptor(object);
			addInput__iLowWindPropertyDescriptor(object);
			addInput__iBackWindPropertyDescriptor(object);
			addInput__iEnEstelaPropertyDescriptor(object);
			addOutput__oOpcTurbineStatusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_CtrlUnit75_Input__iMaintenanceStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit75_Input__iMaintenanceStatus_feature", "_UI_CtrlUnit75_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit75_Input__iMaintenanceStatus(),
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
				 getString("_UI_CtrlUnit75_Input__iFlBrakes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit75_Input__iFlBrakes_feature", "_UI_CtrlUnit75_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit75_Input__iFlBrakes(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iWTG Stopped feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iWTGStoppedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit75_Input__iWTGStopped_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit75_Input__iWTGStopped_feature", "_UI_CtrlUnit75_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit75_Input__iWTGStopped(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iGrid Error feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iGridErrorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit75_Input__iGridError_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit75_Input__iGridError_feature", "_UI_CtrlUnit75_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit75_Input__iGridError(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iRe Twisting feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iReTwistingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit75_Input__iReTwisting_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit75_Input__iReTwisting_feature", "_UI_CtrlUnit75_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit75_Input__iReTwisting(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iHi Wind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iHiWindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit75_Input__iHiWind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit75_Input__iHiWind_feature", "_UI_CtrlUnit75_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit75_Input__iHiWind(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iHi Gust feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iHiGustPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit75_Input__iHiGust_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit75_Input__iHiGust_feature", "_UI_CtrlUnit75_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit75_Input__iHiGust(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iLow Wind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iLowWindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit75_Input__iLowWind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit75_Input__iLowWind_feature", "_UI_CtrlUnit75_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit75_Input__iLowWind(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iBack Wind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iBackWindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit75_Input__iBackWind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit75_Input__iBackWind_feature", "_UI_CtrlUnit75_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit75_Input__iBackWind(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iEn Estela feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iEnEstelaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit75_Input__iEnEstela_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit75_Input__iEnEstela_feature", "_UI_CtrlUnit75_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit75_Input__iEnEstela(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oOpc Turbine Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oOpcTurbineStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit75_Output__oOpcTurbineStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit75_Output__oOpcTurbineStatus_feature", "_UI_CtrlUnit75_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit75_Output__oOpcTurbineStatus(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit75.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit75"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit75)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit75_type") :
			getString("_UI_CtrlUnit75_type") + " " + label;
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
