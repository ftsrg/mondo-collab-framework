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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit43;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * This is the item provider adapter for a {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit43} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit43ItemProvider
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
	public CtrlUnit43ItemProvider(AdapterFactory adapterFactory) {
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
			addInput__iDontCheckInputPropertyDescriptor(object);
			addOutput__oOutputPropertyDescriptor(object);
			addOutput__oOutDivPropertyDescriptor(object);
			addOutput__oOutModPropertyDescriptor(object);
			addParameter__pDivPropertyDescriptor(object);
			addParameter__pParam1PropertyDescriptor(object);
			addParameter__pParam2PropertyDescriptor(object);
			addBhvParam__bpTypePropertyDescriptor(object);
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
				 getString("_UI_CtrlUnit43_Input__iInput1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit43_Input__iInput1_feature", "_UI_CtrlUnit43_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit43_Input__iInput1(),
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
				 getString("_UI_CtrlUnit43_Input__iInput2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit43_Input__iInput2_feature", "_UI_CtrlUnit43_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit43_Input__iInput2(),
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
				 getString("_UI_CtrlUnit43_Input__iDontCheckInput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit43_Input__iDontCheckInput_feature", "_UI_CtrlUnit43_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit43_Input__iDontCheckInput(),
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
				 getString("_UI_CtrlUnit43_Output__oOutput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit43_Output__oOutput_feature", "_UI_CtrlUnit43_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit43_Output__oOutput(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oOut Div feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oOutDivPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit43_Output__oOutDiv_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit43_Output__oOutDiv_feature", "_UI_CtrlUnit43_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit43_Output__oOutDiv(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oOut Mod feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oOutModPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit43_Output__oOutMod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit43_Output__oOutMod_feature", "_UI_CtrlUnit43_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit43_Output__oOutMod(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pDiv feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pDivPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit43_Parameter__pDiv_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit43_Parameter__pDiv_feature", "_UI_CtrlUnit43_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit43_Parameter__pDiv(),
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
				 getString("_UI_CtrlUnit43_Parameter__pParam1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit43_Parameter__pParam1_feature", "_UI_CtrlUnit43_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit43_Parameter__pParam1(),
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
				 getString("_UI_CtrlUnit43_Parameter__pParam2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit43_Parameter__pParam2_feature", "_UI_CtrlUnit43_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit43_Parameter__pParam2(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bhv Param bp Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBhvParam__bpTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit43_BhvParam__bpType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit43_BhvParam__bpType_feature", "_UI_CtrlUnit43_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit43_BhvParam__bpType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit43.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit43"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit43)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit43_type") :
			getString("_UI_CtrlUnit43_type") + " " + label;
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

		switch (notification.getFeatureID(CtrlUnit43.class)) {
			case WTSpecPackage.CTRL_UNIT43__BHV_PARAM_BP_TYPE:
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
