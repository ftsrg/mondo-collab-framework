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

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit85;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * This is the item provider adapter for a {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit85} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit85ItemProvider
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
	public CtrlUnit85ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iPitchAngle1PropertyDescriptor(object);
			addInput__iPitchAngle2PropertyDescriptor(object);
			addInput__iPitchAngle3PropertyDescriptor(object);
			addOutput__oPitchBrakePositionPropertyDescriptor(object);
			addParameter__pPitchMaxBrakeAnglePropertyDescriptor(object);
			addParameter__pPitchMinBrakeAnglePropertyDescriptor(object);
			addParameter__pPitchBrakeAngleHysteresisPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iPitch Angle1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPitchAngle1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit85_Input__iPitchAngle1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit85_Input__iPitchAngle1_feature", "_UI_CtrlUnit85_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit85_Input__iPitchAngle1(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iPitch Angle2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPitchAngle2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit85_Input__iPitchAngle2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit85_Input__iPitchAngle2_feature", "_UI_CtrlUnit85_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit85_Input__iPitchAngle2(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iPitch Angle3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPitchAngle3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit85_Input__iPitchAngle3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit85_Input__iPitchAngle3_feature", "_UI_CtrlUnit85_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit85_Input__iPitchAngle3(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPitch Brake Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPitchBrakePositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit85_Output__oPitchBrakePosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit85_Output__oPitchBrakePosition_feature", "_UI_CtrlUnit85_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit85_Output__oPitchBrakePosition(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pPitch Max Brake Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pPitchMaxBrakeAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit85_Parameter__pPitchMaxBrakeAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit85_Parameter__pPitchMaxBrakeAngle_feature", "_UI_CtrlUnit85_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit85_Parameter__pPitchMaxBrakeAngle(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pPitch Min Brake Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pPitchMinBrakeAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit85_Parameter__pPitchMinBrakeAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit85_Parameter__pPitchMinBrakeAngle_feature", "_UI_CtrlUnit85_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit85_Parameter__pPitchMinBrakeAngle(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pPitch Brake Angle Hysteresis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pPitchBrakeAngleHysteresisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit85_Parameter__pPitchBrakeAngleHysteresis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit85_Parameter__pPitchBrakeAngleHysteresis_feature", "_UI_CtrlUnit85_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit85_Parameter__pPitchBrakeAngleHysteresis(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit85.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit85"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit85)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit85_type") :
			getString("_UI_CtrlUnit85_type") + " " + label;
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
