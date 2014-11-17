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

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit122;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * This is the item provider adapter for a {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit122} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit122ItemProvider
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
	public CtrlUnit122ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iYawCommandPropertyDescriptor(object);
			addInput__iYawBrakeStatusPropertyDescriptor(object);
			addInput__iInhibitYawPropertyDescriptor(object);
			addOutput__oYawStatusPropertyDescriptor(object);
			addOutput__oYawBrakeCommandPropertyDescriptor(object);
			addOutput__oYawCwOrderPropertyDescriptor(object);
			addOutput__oYawCcwOrderPropertyDescriptor(object);
			addTimer__tDelayYawingControlPropertyDescriptor(object);
			addTimer__tDelayYawingToStopPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iYaw Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iYawCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit122_Input__iYawCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit122_Input__iYawCommand_feature", "_UI_CtrlUnit122_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit122_Input__iYawCommand(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iYaw Brake Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iYawBrakeStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit122_Input__iYawBrakeStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit122_Input__iYawBrakeStatus_feature", "_UI_CtrlUnit122_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit122_Input__iYawBrakeStatus(),
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
				 getString("_UI_CtrlUnit122_Input__iInhibitYaw_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit122_Input__iInhibitYaw_feature", "_UI_CtrlUnit122_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit122_Input__iInhibitYaw(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oYaw Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oYawStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit122_Output__oYawStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit122_Output__oYawStatus_feature", "_UI_CtrlUnit122_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit122_Output__oYawStatus(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oYaw Brake Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oYawBrakeCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit122_Output__oYawBrakeCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit122_Output__oYawBrakeCommand_feature", "_UI_CtrlUnit122_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit122_Output__oYawBrakeCommand(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oYaw Cw Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oYawCwOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit122_Output__oYawCwOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit122_Output__oYawCwOrder_feature", "_UI_CtrlUnit122_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit122_Output__oYawCwOrder(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oYaw Ccw Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oYawCcwOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit122_Output__oYawCcwOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit122_Output__oYawCcwOrder_feature", "_UI_CtrlUnit122_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit122_Output__oYawCcwOrder(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tDelay Yawing Control feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tDelayYawingControlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit122_Timer__tDelayYawingControl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit122_Timer__tDelayYawingControl_feature", "_UI_CtrlUnit122_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit122_Timer__tDelayYawingControl(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tDelay Yawing To Stop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tDelayYawingToStopPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit122_Timer__tDelayYawingToStop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit122_Timer__tDelayYawingToStop_feature", "_UI_CtrlUnit122_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit122_Timer__tDelayYawingToStop(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit122.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit122"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit122)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit122_type") :
			getString("_UI_CtrlUnit122_type") + " " + label;
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
