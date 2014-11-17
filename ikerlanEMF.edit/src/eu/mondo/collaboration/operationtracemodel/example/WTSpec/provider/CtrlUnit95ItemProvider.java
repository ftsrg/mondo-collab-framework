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

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit95;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * This is the item provider adapter for a {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit95} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit95ItemProvider
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
	public CtrlUnit95ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iTwistAnglePropertyDescriptor(object);
			addInput__iAccessStatePropertyDescriptor(object);
			addOutput__oTwistAngleLeftLimitPropertyDescriptor(object);
			addOutput__oTwistAngleRightLimitPropertyDescriptor(object);
			addOutput__oRetwistPreCommandPropertyDescriptor(object);
			addFault__fTwistExcessiveCWPropertyDescriptor(object);
			addFault__fTwistExcessiveCCWPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iTwist Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iTwistAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit95_Input__iTwistAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit95_Input__iTwistAngle_feature", "_UI_CtrlUnit95_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit95_Input__iTwistAngle(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iAccess State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iAccessStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit95_Input__iAccessState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit95_Input__iAccessState_feature", "_UI_CtrlUnit95_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit95_Input__iAccessState(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oTwist Angle Left Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oTwistAngleLeftLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit95_Output__oTwistAngleLeftLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit95_Output__oTwistAngleLeftLimit_feature", "_UI_CtrlUnit95_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit95_Output__oTwistAngleLeftLimit(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oTwist Angle Right Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oTwistAngleRightLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit95_Output__oTwistAngleRightLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit95_Output__oTwistAngleRightLimit_feature", "_UI_CtrlUnit95_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit95_Output__oTwistAngleRightLimit(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oRetwist Pre Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oRetwistPreCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit95_Output__oRetwistPreCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit95_Output__oRetwistPreCommand_feature", "_UI_CtrlUnit95_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit95_Output__oRetwistPreCommand(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fTwist Excessive CW feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fTwistExcessiveCWPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit95_Fault__fTwistExcessiveCW_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit95_Fault__fTwistExcessiveCW_feature", "_UI_CtrlUnit95_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit95_Fault__fTwistExcessiveCW(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fTwist Excessive CCW feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fTwistExcessiveCCWPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit95_Fault__fTwistExcessiveCCW_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit95_Fault__fTwistExcessiveCCW_feature", "_UI_CtrlUnit95_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit95_Fault__fTwistExcessiveCCW(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit95.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit95"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit95)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit95_type") :
			getString("_UI_CtrlUnit95_type") + " " + label;
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
