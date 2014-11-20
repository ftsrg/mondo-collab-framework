/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit41;
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
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit41} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit41ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit41ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iInput1PropertyDescriptor(object);
			addInput__iInput2PropertyDescriptor(object);
			addInput__iInput3PropertyDescriptor(object);
			addOutput__oOutputPropertyDescriptor(object);
			addParameter__pParam1PropertyDescriptor(object);
			addParameter__pParam2PropertyDescriptor(object);
			addParameter__pParam3PropertyDescriptor(object);
			addFault__fFault1PropertyDescriptor(object);
			addFault__fFault2PropertyDescriptor(object);
			addFault__fFault3PropertyDescriptor(object);
			addErrorReaction__eReaction1PropertyDescriptor(object);
			addErrorReaction__eReaction2PropertyDescriptor(object);
			addGuard__gGuardToMainPropertyDescriptor(object);
			addGuard__gGuardFromMainPropertyDescriptor(object);
			addGuard__gGuardToOnPropertyDescriptor(object);
			addGuard__gGuardToOffPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iInput1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInput1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit41_Input__iInput1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit41_Input__iInput1_feature", "_UI_CtrlUnit41_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit41_Input__iInput1(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInput2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInput2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit41_Input__iInput2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit41_Input__iInput2_feature", "_UI_CtrlUnit41_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit41_Input__iInput2(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInput3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInput3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit41_Input__iInput3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit41_Input__iInput3_feature", "_UI_CtrlUnit41_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit41_Input__iInput3(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oOutput feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oOutputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit41_Output__oOutput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit41_Output__oOutput_feature", "_UI_CtrlUnit41_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit41_Output__oOutput(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pParam1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pParam1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit41_Parameter__pParam1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit41_Parameter__pParam1_feature", "_UI_CtrlUnit41_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit41_Parameter__pParam1(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pParam2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pParam2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit41_Parameter__pParam2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit41_Parameter__pParam2_feature", "_UI_CtrlUnit41_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit41_Parameter__pParam2(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pParam3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pParam3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit41_Parameter__pParam3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit41_Parameter__pParam3_feature", "_UI_CtrlUnit41_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit41_Parameter__pParam3(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fFault1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fFault1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit41_Fault__fFault1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit41_Fault__fFault1_feature", "_UI_CtrlUnit41_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit41_Fault__fFault1(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fFault2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fFault2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit41_Fault__fFault2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit41_Fault__fFault2_feature", "_UI_CtrlUnit41_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit41_Fault__fFault2(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fFault3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fFault3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit41_Fault__fFault3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit41_Fault__fFault3_feature", "_UI_CtrlUnit41_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit41_Fault__fFault3(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Reaction eReaction1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorReaction__eReaction1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit41_ErrorReaction__eReaction1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit41_ErrorReaction__eReaction1_feature", "_UI_CtrlUnit41_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit41_ErrorReaction__eReaction1(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Reaction eReaction2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorReaction__eReaction2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit41_ErrorReaction__eReaction2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit41_ErrorReaction__eReaction2_feature", "_UI_CtrlUnit41_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit41_ErrorReaction__eReaction2(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guard gGuard To Main feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuard__gGuardToMainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit41_Guard__gGuardToMain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit41_Guard__gGuardToMain_feature", "_UI_CtrlUnit41_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit41_Guard__gGuardToMain(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guard gGuard From Main feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuard__gGuardFromMainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit41_Guard__gGuardFromMain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit41_Guard__gGuardFromMain_feature", "_UI_CtrlUnit41_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit41_Guard__gGuardFromMain(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guard gGuard To On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuard__gGuardToOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit41_Guard__gGuardToOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit41_Guard__gGuardToOn_feature", "_UI_CtrlUnit41_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit41_Guard__gGuardToOn(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guard gGuard To Off feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuard__gGuardToOffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit41_Guard__gGuardToOff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit41_Guard__gGuardToOff_feature", "_UI_CtrlUnit41_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit41_Guard__gGuardToOff(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit41.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit41"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit41)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit41_type") :
			getString("_UI_CtrlUnit41_type") + " " + label;
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

		switch (notification.getFeatureID(CtrlUnit41.class)) {
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_MAIN:
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_FROM_MAIN:
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_ON:
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_OFF:
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
