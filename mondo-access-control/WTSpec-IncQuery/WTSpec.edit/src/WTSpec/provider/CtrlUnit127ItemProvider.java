/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit127;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit127} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit127ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit127ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iLowWindActivePropertyDescriptor(object);
			addInput__iWindDirectionRelAvgPropertyDescriptor(object);
			addInput__iTwistAnglePropertyDescriptor(object);
			addInput__iInhibitAutoYawPropertyDescriptor(object);
			addOutput__oRelWindPreCommandPropertyDescriptor(object);
			addOutput__oFlagIntoWindPropertyDescriptor(object);
			addOutput__oExcessiveYawingTimePropertyDescriptor(object);
			addParameter__pWindDirectionTolerancePropertyDescriptor(object);
			addParameter__pYawFilterTimePropertyDescriptor(object);
			addParameter__pYawStopAngleLimitPropertyDescriptor(object);
			addTimer__tMaximumTimeYawingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iLow Wind Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iLowWindActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit127_Input__iLowWindActive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit127_Input__iLowWindActive_feature", "_UI_CtrlUnit127_type"),
				 WTSpecPackage.Literals.CTRL_UNIT127__INPUT_ILOW_WIND_ACTIVE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iWind Direction Rel Avg feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iWindDirectionRelAvgPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit127_Input__iWindDirectionRelAvg_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit127_Input__iWindDirectionRelAvg_feature", "_UI_CtrlUnit127_type"),
				 WTSpecPackage.Literals.CTRL_UNIT127__INPUT_IWIND_DIRECTION_REL_AVG,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_CtrlUnit127_Input__iTwistAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit127_Input__iTwistAngle_feature", "_UI_CtrlUnit127_type"),
				 WTSpecPackage.Literals.CTRL_UNIT127__INPUT_ITWIST_ANGLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInhibit Auto Yaw feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInhibitAutoYawPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit127_Input__iInhibitAutoYaw_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit127_Input__iInhibitAutoYaw_feature", "_UI_CtrlUnit127_type"),
				 WTSpecPackage.Literals.CTRL_UNIT127__INPUT_IINHIBIT_AUTO_YAW,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oRel Wind Pre Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oRelWindPreCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit127_Output__oRelWindPreCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit127_Output__oRelWindPreCommand_feature", "_UI_CtrlUnit127_type"),
				 WTSpecPackage.Literals.CTRL_UNIT127__OUTPUT_OREL_WIND_PRE_COMMAND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oFlag Into Wind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oFlagIntoWindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit127_Output__oFlagIntoWind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit127_Output__oFlagIntoWind_feature", "_UI_CtrlUnit127_type"),
				 WTSpecPackage.Literals.CTRL_UNIT127__OUTPUT_OFLAG_INTO_WIND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oExcessive Yawing Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oExcessiveYawingTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit127_Output__oExcessiveYawingTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit127_Output__oExcessiveYawingTime_feature", "_UI_CtrlUnit127_type"),
				 WTSpecPackage.Literals.CTRL_UNIT127__OUTPUT_OEXCESSIVE_YAWING_TIME,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pWind Direction Tolerance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pWindDirectionTolerancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit127_Parameter__pWindDirectionTolerance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit127_Parameter__pWindDirectionTolerance_feature", "_UI_CtrlUnit127_type"),
				 WTSpecPackage.Literals.CTRL_UNIT127__PARAMETER_PWIND_DIRECTION_TOLERANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pYaw Filter Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pYawFilterTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit127_Parameter__pYawFilterTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit127_Parameter__pYawFilterTime_feature", "_UI_CtrlUnit127_type"),
				 WTSpecPackage.Literals.CTRL_UNIT127__PARAMETER_PYAW_FILTER_TIME,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pYaw Stop Angle Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pYawStopAngleLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit127_Parameter__pYawStopAngleLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit127_Parameter__pYawStopAngleLimit_feature", "_UI_CtrlUnit127_type"),
				 WTSpecPackage.Literals.CTRL_UNIT127__PARAMETER_PYAW_STOP_ANGLE_LIMIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tMaximum Time Yawing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tMaximumTimeYawingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit127_Timer__tMaximumTimeYawing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit127_Timer__tMaximumTimeYawing_feature", "_UI_CtrlUnit127_type"),
				 WTSpecPackage.Literals.CTRL_UNIT127__TIMER_TMAXIMUM_TIME_YAWING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit127.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit127"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit127)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit127_type") :
			getString("_UI_CtrlUnit127_type") + " " + label;
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
