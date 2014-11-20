/**
 */
package WTSpec.provider;


import WTSpec.WT;
import WTSpec.WTSpecFactory;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link WTSpec.WT} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WTItemProvider 
	extends ItemProviderAdapter
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
	public WTItemProvider(AdapterFactory adapterFactory) {
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

			addSysIdPropertyDescriptor(object);
			addModelPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sys Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSysIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WT_sysId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WT_sysId_feature", "_UI_WT_type"),
				 WTSpecPackage.eINSTANCE.getWT_SysId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WT_model_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WT_model_feature", "_UI_WT_type"),
				 WTSpecPackage.eINSTANCE.getWT_Model(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WT_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WT_version_feature", "_UI_WT_type"),
				 WTSpecPackage.eINSTANCE.getWT_Version(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WTSpecPackage.eINSTANCE.getWT_ItsSubsystems());
			childrenFeatures.add(WTSpecPackage.eINSTANCE.getWT_ItsInputs());
			childrenFeatures.add(WTSpecPackage.eINSTANCE.getWT_ItsOutputs());
			childrenFeatures.add(WTSpecPackage.eINSTANCE.getWT_ItsParams());
			childrenFeatures.add(WTSpecPackage.eINSTANCE.getWT_ItsTimers());
			childrenFeatures.add(WTSpecPackage.eINSTANCE.getWT_ItsFaults());
			childrenFeatures.add(WTSpecPackage.eINSTANCE.getWT_ItsVariables());
			childrenFeatures.add(WTSpecPackage.eINSTANCE.getWT_ItsErrorReactions());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns WT.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WT"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WT)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_WT_type") :
			getString("_UI_WT_type") + " " + label;
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

		switch (notification.getFeatureID(WT.class)) {
			case WTSpecPackage.WT__SYS_ID:
			case WTSpecPackage.WT__MODEL:
			case WTSpecPackage.WT__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WTSpecPackage.WT__ITS_SUBSYSTEMS:
			case WTSpecPackage.WT__ITS_INPUTS:
			case WTSpecPackage.WT__ITS_OUTPUTS:
			case WTSpecPackage.WT__ITS_PARAMS:
			case WTSpecPackage.WT__ITS_TIMERS:
			case WTSpecPackage.WT__ITS_FAULTS:
			case WTSpecPackage.WT__ITS_VARIABLES:
			case WTSpecPackage.WT__ITS_ERROR_REACTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getWT_ItsSubsystems(),
				 WTSpecFactory.eINSTANCE.createSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getWT_ItsInputs(),
				 WTSpecFactory.eINSTANCE.createSystemInput()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getWT_ItsOutputs(),
				 WTSpecFactory.eINSTANCE.createSystemOutput()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getWT_ItsParams(),
				 WTSpecFactory.eINSTANCE.createSystemParam()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getWT_ItsTimers(),
				 WTSpecFactory.eINSTANCE.createSystemTimer()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getWT_ItsFaults(),
				 WTSpecFactory.eINSTANCE.createSystemFault()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getWT_ItsVariables(),
				 WTSpecFactory.eINSTANCE.createSystemVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getWT_ItsErrorReactions(),
				 WTSpecFactory.eINSTANCE.createSystemErrorReaction()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WTSpec2EditPlugin.INSTANCE;
	}

}
