/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit9;
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
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit9} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit9ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit9ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iValueToCheckPropertyDescriptor(object);
			addInput__iDontCheckInputPropertyDescriptor(object);
			addInput__iLimitValuePropertyDescriptor(object);
			addInput__iLimitResetPropertyDescriptor(object);
			addOutput__oLimitReachedPropertyDescriptor(object);
			addParameter__pLimitValuePropertyDescriptor(object);
			addParameter__pLimitResetPropertyDescriptor(object);
			addTimer__tDelayPropertyDescriptor(object);
			addBhvParam__bpModePropertyDescriptor(object);
			addBhvParam__bpLimitsTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iValue To Check feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iValueToCheckPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit9_Input__iValueToCheck_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit9_Input__iValueToCheck_feature", "_UI_CtrlUnit9_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit9_Input__iValueToCheck(),
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
				 getString("_UI_CtrlUnit9_Input__iDontCheckInput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit9_Input__iDontCheckInput_feature", "_UI_CtrlUnit9_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit9_Input__iDontCheckInput(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iLimit Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iLimitValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit9_Input__iLimitValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit9_Input__iLimitValue_feature", "_UI_CtrlUnit9_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit9_Input__iLimitValue(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iLimit Reset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iLimitResetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit9_Input__iLimitReset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit9_Input__iLimitReset_feature", "_UI_CtrlUnit9_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit9_Input__iLimitReset(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oLimit Reached feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oLimitReachedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit9_Output__oLimitReached_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit9_Output__oLimitReached_feature", "_UI_CtrlUnit9_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit9_Output__oLimitReached(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pLimit Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pLimitValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit9_Parameter__pLimitValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit9_Parameter__pLimitValue_feature", "_UI_CtrlUnit9_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit9_Parameter__pLimitValue(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pLimit Reset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pLimitResetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit9_Parameter__pLimitReset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit9_Parameter__pLimitReset_feature", "_UI_CtrlUnit9_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit9_Parameter__pLimitReset(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tDelay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit9_Timer__tDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit9_Timer__tDelay_feature", "_UI_CtrlUnit9_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit9_Timer__tDelay(),
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
				 getString("_UI_CtrlUnit9_BhvParam__bpMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit9_BhvParam__bpMode_feature", "_UI_CtrlUnit9_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit9_BhvParam__bpMode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bhv Param bp Limits Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBhvParam__bpLimitsTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit9_BhvParam__bpLimitsType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit9_BhvParam__bpLimitsType_feature", "_UI_CtrlUnit9_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit9_BhvParam__bpLimitsType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit9.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit9"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit9)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit9_type") :
			getString("_UI_CtrlUnit9_type") + " " + label;
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

		switch (notification.getFeatureID(CtrlUnit9.class)) {
			case WTSpecPackage.CTRL_UNIT9__BHV_PARAM_BP_MODE:
			case WTSpecPackage.CTRL_UNIT9__BHV_PARAM_BP_LIMITS_TYPE:
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
