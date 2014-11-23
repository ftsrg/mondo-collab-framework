/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.provider;


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

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.Subsystem;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecFactory;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * This is the item provider adapter for a {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.Subsystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsystemItemProvider
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
	public SubsystemItemProvider(AdapterFactory adapterFactory) {
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
			addDescriptionPropertyDescriptor(object);
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
				 getString("_UI_Subsystem_sysId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subsystem_sysId_feature", "_UI_Subsystem_type"),
				 WTSpecPackage.eINSTANCE.getSubsystem_SysId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Subsystem_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Subsystem_description_feature", "_UI_Subsystem_type"),
				 WTSpecPackage.eINSTANCE.getSubsystem_Description(),
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
			childrenFeatures.add(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs());
			childrenFeatures.add(WTSpecPackage.eINSTANCE.getSubsystem_ItsSubsystems());
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
	 * This returns Subsystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Subsystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Subsystem)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_Subsystem_type") :
			getString("_UI_Subsystem_type") + " " + label;
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

		switch (notification.getFeatureID(Subsystem.class)) {
			case WTSpecPackage.SUBSYSTEM__SYS_ID:
			case WTSpecPackage.SUBSYSTEM__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WTSpecPackage.SUBSYSTEM__ITS_WT_CS:
			case WTSpecPackage.SUBSYSTEM__ITS_SUBSYSTEMS:
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
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit1()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit2()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit3()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit4()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit5()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit6()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit7()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit8()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit9()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit10()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit11()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit12()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit13()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit14()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit15()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit16()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit17()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit18()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit19()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit20()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit21()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit22()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit23()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit24()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit25()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit26()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit27()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit28()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit29()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit30()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit31()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit32()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit33()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit34()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit35()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit36()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit37()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit38()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit39()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit40()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit41()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit42()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit43()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit44()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit45()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit46()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit47()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit48()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit49()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit50()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit51()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit52()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit53()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit54()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit55()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit56()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit57()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit58()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit59()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit60()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit61()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit62()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit63()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit64()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit65()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit66()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit67()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit68()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit69()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit70()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit71()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit72()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit73()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit74()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit75()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit76()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit77()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit78()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit79()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit80()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit81()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit82()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit83()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit84()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit85()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit86()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit87()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit88()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit89()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit90()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit91()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit92()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit93()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit94()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit95()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit96()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit97()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit98()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit99()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit100()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit101()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit102()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit103()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit104()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit105()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit106()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit107()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit108()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit109()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit110()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit111()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit112()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit113()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit114()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit115()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit116()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit117()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit118()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit119()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit120()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit121()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit122()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit123()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit124()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit125()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit126()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit127()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit128()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit129()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit130()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit131()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit132()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsWTCs(),
				 WTSpecFactory.eINSTANCE.createCtrlUnit133()));

		newChildDescriptors.add
			(createChildParameter
				(WTSpecPackage.eINSTANCE.getSubsystem_ItsSubsystems(),
				 WTSpecFactory.eINSTANCE.createSubsystem()));
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
