/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit61;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit61} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit61ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit61ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iInverterToOnOrderPropertyDescriptor(object);
			addInput__iInverterReadyRefPropertyDescriptor(object);
			addInput__iRemoteResetOrderPropertyDescriptor(object);
			addInput__iInverterTorqueRegPropertyDescriptor(object);
			addInput__iInverterHwStatePropertyDescriptor(object);
			addInput__iResetOrderPropertyDescriptor(object);
			addInput__iMotorizingPropertyDescriptor(object);
			addOutput__oInverterToOnPropertyDescriptor(object);
			addOutput__oInverterResetCommandPropertyDescriptor(object);
			addOutput__oInverterTorqueRefPropertyDescriptor(object);
			addOutput__oInverterResetAlarmsPropertyDescriptor(object);
			addFault__fEtherCATPropertyDescriptor(object);
			addTimer__tResetTimePropertyDescriptor(object);
			addTimer__tDelayBetweenResetsPropertyDescriptor(object);
			addErrorReaction__erStopPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iInverter To On Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInverterToOnOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit61_Input__iInverterToOnOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit61_Input__iInverterToOnOrder_feature", "_UI_CtrlUnit61_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit61_Input__iInverterToOnOrder(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInverter Ready Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInverterReadyRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit61_Input__iInverterReadyRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit61_Input__iInverterReadyRef_feature", "_UI_CtrlUnit61_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit61_Input__iInverterReadyRef(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iRemote Reset Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iRemoteResetOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit61_Input__iRemoteResetOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit61_Input__iRemoteResetOrder_feature", "_UI_CtrlUnit61_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit61_Input__iRemoteResetOrder(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInverter Torque Reg feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInverterTorqueRegPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit61_Input__iInverterTorqueReg_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit61_Input__iInverterTorqueReg_feature", "_UI_CtrlUnit61_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit61_Input__iInverterTorqueReg(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInverter Hw State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInverterHwStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit61_Input__iInverterHwState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit61_Input__iInverterHwState_feature", "_UI_CtrlUnit61_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit61_Input__iInverterHwState(),
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
				 getString("_UI_CtrlUnit61_Input__iResetOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit61_Input__iResetOrder_feature", "_UI_CtrlUnit61_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit61_Input__iResetOrder(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iMotorizing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iMotorizingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit61_Input__iMotorizing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit61_Input__iMotorizing_feature", "_UI_CtrlUnit61_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit61_Input__iMotorizing(),
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
				 getString("_UI_CtrlUnit61_Output__oInverterToOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit61_Output__oInverterToOn_feature", "_UI_CtrlUnit61_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit61_Output__oInverterToOn(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oInverter Reset Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oInverterResetCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit61_Output__oInverterResetCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit61_Output__oInverterResetCommand_feature", "_UI_CtrlUnit61_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit61_Output__oInverterResetCommand(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oInverter Torque Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oInverterTorqueRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit61_Output__oInverterTorqueRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit61_Output__oInverterTorqueRef_feature", "_UI_CtrlUnit61_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit61_Output__oInverterTorqueRef(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oInverter Reset Alarms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oInverterResetAlarmsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit61_Output__oInverterResetAlarms_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit61_Output__oInverterResetAlarms_feature", "_UI_CtrlUnit61_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit61_Output__oInverterResetAlarms(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fEther CAT feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fEtherCATPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit61_Fault__fEtherCAT_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit61_Fault__fEtherCAT_feature", "_UI_CtrlUnit61_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit61_Fault__fEtherCAT(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tReset Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tResetTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit61_Timer__tResetTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit61_Timer__tResetTime_feature", "_UI_CtrlUnit61_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit61_Timer__tResetTime(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tDelay Between Resets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tDelayBetweenResetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit61_Timer__tDelayBetweenResets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit61_Timer__tDelayBetweenResets_feature", "_UI_CtrlUnit61_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit61_Timer__tDelayBetweenResets(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Reaction er Stop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorReaction__erStopPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit61_ErrorReaction__erStop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit61_ErrorReaction__erStop_feature", "_UI_CtrlUnit61_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit61_ErrorReaction__erStop(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit61.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit61"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit61)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit61_type") :
			getString("_UI_CtrlUnit61_type") + " " + label;
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
