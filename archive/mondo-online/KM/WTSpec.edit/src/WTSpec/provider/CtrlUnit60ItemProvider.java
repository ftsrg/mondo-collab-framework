/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit60;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit60} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit60ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit60ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iDisconnectPropertyDescriptor(object);
			addInput__iStopCommandPropertyDescriptor(object);
			addInput__iPitchBrakedPropertyDescriptor(object);
			addInput__iInverterRpmPropertyDescriptor(object);
			addInput__iReadyForOnPropertyDescriptor(object);
			addInput__iReadyForRunPropertyDescriptor(object);
			addInput__iReadyForRefPropertyDescriptor(object);
			addInput__iResetOrderPropertyDescriptor(object);
			addInput__iForceInvOffPropertyDescriptor(object);
			addInput__iSafetyInputPropertyDescriptor(object);
			addOutput__oInverterRunPropertyDescriptor(object);
			addOutput__oInverterToOnPropertyDescriptor(object);
			addParameter__pInverterConnSpeedPropertyDescriptor(object);
			addParameter__pInverterConnSpeedHysteresisPropertyDescriptor(object);
			addFault__fReconnectWarningPropertyDescriptor(object);
			addFault__fReadyRefWarningPropertyDescriptor(object);
			addTimer__tConnectionPropertyDescriptor(object);
			addTimer__tRunningDelayPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iDisconnect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iDisconnectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Input__iDisconnect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Input__iDisconnect_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Input__iDisconnect(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iStop Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iStopCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Input__iStopCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Input__iStopCommand_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Input__iStopCommand(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iPitch Braked feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPitchBrakedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Input__iPitchBraked_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Input__iPitchBraked_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Input__iPitchBraked(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInverter Rpm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInverterRpmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Input__iInverterRpm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Input__iInverterRpm_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Input__iInverterRpm(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iReady For On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iReadyForOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Input__iReadyForOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Input__iReadyForOn_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Input__iReadyForOn(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iReady For Run feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iReadyForRunPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Input__iReadyForRun_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Input__iReadyForRun_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Input__iReadyForRun(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iReady For Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iReadyForRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Input__iReadyForRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Input__iReadyForRef_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Input__iReadyForRef(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iReset Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iResetOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Input__iResetOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Input__iResetOrder_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Input__iResetOrder(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iForce Inv Off feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iForceInvOffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Input__iForceInvOff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Input__iForceInvOff_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Input__iForceInvOff(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iSafety Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iSafetyInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Input__iSafetyInput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Input__iSafetyInput_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Input__iSafetyInput(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oInverter Run feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oInverterRunPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Output__oInverterRun_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Output__oInverterRun_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Output__oInverterRun(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oInverter To On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oInverterToOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Output__oInverterToOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Output__oInverterToOn_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Output__oInverterToOn(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pInverter Conn Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pInverterConnSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Parameter__pInverterConnSpeed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Parameter__pInverterConnSpeed_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Parameter__pInverterConnSpeed(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pInverter Conn Speed Hysteresis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pInverterConnSpeedHysteresisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Parameter__pInverterConnSpeedHysteresis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Parameter__pInverterConnSpeedHysteresis_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Parameter__pInverterConnSpeedHysteresis(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fReconnect Warning feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fReconnectWarningPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Fault__fReconnectWarning_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Fault__fReconnectWarning_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Fault__fReconnectWarning(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fReady Ref Warning feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fReadyRefWarningPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Fault__fReadyRefWarning_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Fault__fReadyRefWarning_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Fault__fReadyRefWarning(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tConnection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tConnectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Timer__tConnection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Timer__tConnection_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Timer__tConnection(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tRunning Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tRunningDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit60_Timer__tRunningDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit60_Timer__tRunningDelay_feature", "_UI_CtrlUnit60_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit60_Timer__tRunningDelay(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit60.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit60"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit60)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit60_type") :
			getString("_UI_CtrlUnit60_type") + " " + label;
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
