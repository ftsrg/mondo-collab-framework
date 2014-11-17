/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit86;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * This is the item provider adapter for a {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit86} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit86ItemProvider
	extends wtcItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit86ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iPitchHwStandbyPropertyDescriptor(object);
			addInput__iPitchHwFaultPropertyDescriptor(object);
			addInput__iPitchStopCommandPropertyDescriptor(object);
			addInput__iPitchBrakePositionPropertyDescriptor(object);
			addOutput__oBrakesPropertyDescriptor(object);
			addOutput__oPitchNormalOrderPropertyDescriptor(object);
			addOutput__oPitchEmergencyOrderPropertyDescriptor(object);
			addOutput__oPitchTestUCapOrderPropertyDescriptor(object);
			addErrorReaction__erEmergencyPropertyDescriptor(object);
			addErrorReaction__erSecurityLinePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iPitch Hw Standby feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPitchHwStandbyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit86_Input__iPitchHwStandby_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit86_Input__iPitchHwStandby_feature", "_UI_CtrlUnit86_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit86_Input__iPitchHwStandby(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iPitch Hw Fault feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPitchHwFaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit86_Input__iPitchHwFault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit86_Input__iPitchHwFault_feature", "_UI_CtrlUnit86_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit86_Input__iPitchHwFault(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iPitch Stop Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPitchStopCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit86_Input__iPitchStopCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit86_Input__iPitchStopCommand_feature", "_UI_CtrlUnit86_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit86_Input__iPitchStopCommand(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iPitch Brake Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPitchBrakePositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit86_Input__iPitchBrakePosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit86_Input__iPitchBrakePosition_feature", "_UI_CtrlUnit86_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit86_Input__iPitchBrakePosition(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oBrakes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oBrakesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit86_Output__oBrakes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit86_Output__oBrakes_feature", "_UI_CtrlUnit86_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit86_Output__oBrakes(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPitch Normal Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPitchNormalOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit86_Output__oPitchNormalOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit86_Output__oPitchNormalOrder_feature", "_UI_CtrlUnit86_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit86_Output__oPitchNormalOrder(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPitch Emergency Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPitchEmergencyOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit86_Output__oPitchEmergencyOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit86_Output__oPitchEmergencyOrder_feature", "_UI_CtrlUnit86_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit86_Output__oPitchEmergencyOrder(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPitch Test UCap Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPitchTestUCapOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit86_Output__oPitchTestUCapOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit86_Output__oPitchTestUCapOrder_feature", "_UI_CtrlUnit86_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit86_Output__oPitchTestUCapOrder(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Reaction er Emergency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorReaction__erEmergencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit86_ErrorReaction__erEmergency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit86_ErrorReaction__erEmergency_feature", "_UI_CtrlUnit86_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit86_ErrorReaction__erEmergency(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Reaction er Security Line feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorReaction__erSecurityLinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit86_ErrorReaction__erSecurityLine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit86_ErrorReaction__erSecurityLine_feature", "_UI_CtrlUnit86_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit86_ErrorReaction__erSecurityLine(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit86.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit86"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit86)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit86_type") :
			getString("_UI_CtrlUnit86_type") + " " + label;
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
