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

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit23;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * This is the item provider adapter for a {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit23} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit23ItemProvider
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
	public CtrlUnit23ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iWindSpeedPropertyDescriptor(object);
			addInput__iInverterPowerPropertyDescriptor(object);
			addOutput__oRelationErrorPropertyDescriptor(object);
			addParameter__pWindSpeedLimitPropertyDescriptor(object);
			addParameter__pInverterPowerLimitPropertyDescriptor(object);
			addTimer__tWindMinimumTimePropertyDescriptor(object);
			addTimer__tPowerAndWindMinimumTimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iWind Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iWindSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit23_Input__iWindSpeed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit23_Input__iWindSpeed_feature", "_UI_CtrlUnit23_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit23_Input__iWindSpeed(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInverter Power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInverterPowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit23_Input__iInverterPower_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit23_Input__iInverterPower_feature", "_UI_CtrlUnit23_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit23_Input__iInverterPower(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oRelation Error feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oRelationErrorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit23_Output__oRelationError_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit23_Output__oRelationError_feature", "_UI_CtrlUnit23_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit23_Output__oRelationError(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pWind Speed Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pWindSpeedLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit23_Parameter__pWindSpeedLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit23_Parameter__pWindSpeedLimit_feature", "_UI_CtrlUnit23_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit23_Parameter__pWindSpeedLimit(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pInverter Power Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pInverterPowerLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit23_Parameter__pInverterPowerLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit23_Parameter__pInverterPowerLimit_feature", "_UI_CtrlUnit23_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit23_Parameter__pInverterPowerLimit(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tWind Minimum Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tWindMinimumTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit23_Timer__tWindMinimumTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit23_Timer__tWindMinimumTime_feature", "_UI_CtrlUnit23_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit23_Timer__tWindMinimumTime(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tPower And Wind Minimum Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tPowerAndWindMinimumTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit23_Timer__tPowerAndWindMinimumTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit23_Timer__tPowerAndWindMinimumTime_feature", "_UI_CtrlUnit23_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit23_Timer__tPowerAndWindMinimumTime(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit23.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit23"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit23)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit23_type") :
			getString("_UI_CtrlUnit23_type") + " " + label;
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
