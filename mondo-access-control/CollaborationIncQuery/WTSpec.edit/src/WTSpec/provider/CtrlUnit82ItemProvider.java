/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit82;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit82} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit82ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit82ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iVarInputPropertyDescriptor(object);
			addInput__iWriteTwistAngleRequestPropertyDescriptor(object);
			addInput__iNewTwistAngleValuePropertyDescriptor(object);
			addOutput__oVarOutputPropertyDescriptor(object);
			addParameter__pMinDifferenceToConsiderPropertyDescriptor(object);
			addTimer__tSyncDelayPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iVar Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iVarInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit82_Input__iVarInput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit82_Input__iVarInput_feature", "_UI_CtrlUnit82_type"),
				 WTSpecPackage.Literals.CTRL_UNIT82__INPUT_IVAR_INPUT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iWrite Twist Angle Request feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iWriteTwistAngleRequestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit82_Input__iWriteTwistAngleRequest_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit82_Input__iWriteTwistAngleRequest_feature", "_UI_CtrlUnit82_type"),
				 WTSpecPackage.Literals.CTRL_UNIT82__INPUT_IWRITE_TWIST_ANGLE_REQUEST,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iNew Twist Angle Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iNewTwistAngleValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit82_Input__iNewTwistAngleValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit82_Input__iNewTwistAngleValue_feature", "_UI_CtrlUnit82_type"),
				 WTSpecPackage.Literals.CTRL_UNIT82__INPUT_INEW_TWIST_ANGLE_VALUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oVar Output feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oVarOutputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit82_Output__oVarOutput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit82_Output__oVarOutput_feature", "_UI_CtrlUnit82_type"),
				 WTSpecPackage.Literals.CTRL_UNIT82__OUTPUT_OVAR_OUTPUT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pMin Difference To Consider feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pMinDifferenceToConsiderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit82_Parameter__pMinDifferenceToConsider_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit82_Parameter__pMinDifferenceToConsider_feature", "_UI_CtrlUnit82_type"),
				 WTSpecPackage.Literals.CTRL_UNIT82__PARAMETER_PMIN_DIFFERENCE_TO_CONSIDER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tSync Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tSyncDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit82_Timer__tSyncDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit82_Timer__tSyncDelay_feature", "_UI_CtrlUnit82_type"),
				 WTSpecPackage.Literals.CTRL_UNIT82__TIMER_TSYNC_DELAY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit82.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit82"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit82)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit82_type") :
			getString("_UI_CtrlUnit82_type") + " " + label;
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
