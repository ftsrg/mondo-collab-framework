/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit48;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit48} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit48ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit48ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iTemp1PropertyDescriptor(object);
			addInput__iTemp2PropertyDescriptor(object);
			addInput__iTemp3PropertyDescriptor(object);
			addOutput__oFanPropertyDescriptor(object);
			addParameter__pTempLimit1PropertyDescriptor(object);
			addParameter__pTempLimit2PropertyDescriptor(object);
			addParameter__pTempLimit3PropertyDescriptor(object);
			addFault__fFault1PropertyDescriptor(object);
			addErrorReaction__erReaction1PropertyDescriptor(object);
			addErrorReaction__erReaction2PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iTemp1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iTemp1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit48_Input__iTemp1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit48_Input__iTemp1_feature", "_UI_CtrlUnit48_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit48_Input__iTemp1(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iTemp2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iTemp2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit48_Input__iTemp2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit48_Input__iTemp2_feature", "_UI_CtrlUnit48_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit48_Input__iTemp2(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iTemp3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iTemp3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit48_Input__iTemp3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit48_Input__iTemp3_feature", "_UI_CtrlUnit48_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit48_Input__iTemp3(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oFan feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oFanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit48_Output__oFan_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit48_Output__oFan_feature", "_UI_CtrlUnit48_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit48_Output__oFan(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pTemp Limit1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pTempLimit1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit48_Parameter__pTempLimit1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit48_Parameter__pTempLimit1_feature", "_UI_CtrlUnit48_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit48_Parameter__pTempLimit1(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pTemp Limit2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pTempLimit2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit48_Parameter__pTempLimit2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit48_Parameter__pTempLimit2_feature", "_UI_CtrlUnit48_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit48_Parameter__pTempLimit2(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pTemp Limit3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pTempLimit3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit48_Parameter__pTempLimit3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit48_Parameter__pTempLimit3_feature", "_UI_CtrlUnit48_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit48_Parameter__pTempLimit3(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fFault1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fFault1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit48_Fault__fFault1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit48_Fault__fFault1_feature", "_UI_CtrlUnit48_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit48_Fault__fFault1(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Reaction er Reaction1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorReaction__erReaction1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit48_ErrorReaction__erReaction1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit48_ErrorReaction__erReaction1_feature", "_UI_CtrlUnit48_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit48_ErrorReaction__erReaction1(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Error Reaction er Reaction2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addErrorReaction__erReaction2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit48_ErrorReaction__erReaction2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit48_ErrorReaction__erReaction2_feature", "_UI_CtrlUnit48_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit48_ErrorReaction__erReaction2(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit48.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit48"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit48)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit48_type") :
			getString("_UI_CtrlUnit48_type") + " " + label;
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
