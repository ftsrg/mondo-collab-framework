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

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit88;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * This is the item provider adapter for a {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit88} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit88ItemProvider
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
	public CtrlUnit88ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iPthResetCommandPropertyDescriptor(object);
			addInput__iPthResetOrderPropertyDescriptor(object);
			addOutput__oPthResetCommandPropertyDescriptor(object);
			addOutput__oPthResetOrderPropertyDescriptor(object);
			addOutput__oPthResetPropertyDescriptor(object);
			addTimer__tResetTimerPropertyDescriptor(object);
			addTimer__tTimeBetweenResetsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iPth Reset Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPthResetCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit88_Input__iPthResetCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit88_Input__iPthResetCommand_feature", "_UI_CtrlUnit88_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit88_Input__iPthResetCommand(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iPth Reset Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iPthResetOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit88_Input__iPthResetOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit88_Input__iPthResetOrder_feature", "_UI_CtrlUnit88_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit88_Input__iPthResetOrder(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPth Reset Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPthResetCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit88_Output__oPthResetCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit88_Output__oPthResetCommand_feature", "_UI_CtrlUnit88_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit88_Output__oPthResetCommand(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPth Reset Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPthResetOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit88_Output__oPthResetOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit88_Output__oPthResetOrder_feature", "_UI_CtrlUnit88_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit88_Output__oPthResetOrder(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPth Reset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPthResetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit88_Output__oPthReset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit88_Output__oPthReset_feature", "_UI_CtrlUnit88_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit88_Output__oPthReset(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tReset Timer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tResetTimerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit88_Timer__tResetTimer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit88_Timer__tResetTimer_feature", "_UI_CtrlUnit88_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit88_Timer__tResetTimer(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tTime Between Resets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tTimeBetweenResetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit88_Timer__tTimeBetweenResets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit88_Timer__tTimeBetweenResets_feature", "_UI_CtrlUnit88_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit88_Timer__tTimeBetweenResets(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit88.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit88"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit88)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit88_type") :
			getString("_UI_CtrlUnit88_type") + " " + label;
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
