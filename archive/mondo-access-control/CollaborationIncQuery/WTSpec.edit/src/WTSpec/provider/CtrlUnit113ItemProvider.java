/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit113;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit113} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit113ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit113ItemProvider(AdapterFactory adapterFactory) {
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
			addInput__iWindSpeedAveragePropertyDescriptor(object);
			addOutput__oExcessiveWindAccelerationPropertyDescriptor(object);
			addParameter__pConsideredTimePropertyDescriptor(object);
			addParameter__pWindAccelerationLimitPropertyDescriptor(object);
			addParameter__pHiWindLimitResetPropertyDescriptor(object);
			addParameter__pMaxAbsoluteWindSpeedPropertyDescriptor(object);
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
				 getString("_UI_CtrlUnit113_Input__iWindSpeed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit113_Input__iWindSpeed_feature", "_UI_CtrlUnit113_type"),
				 WTSpecPackage.Literals.CTRL_UNIT113__INPUT_IWIND_SPEED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iWind Speed Average feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iWindSpeedAveragePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit113_Input__iWindSpeedAverage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit113_Input__iWindSpeedAverage_feature", "_UI_CtrlUnit113_type"),
				 WTSpecPackage.Literals.CTRL_UNIT113__INPUT_IWIND_SPEED_AVERAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oExcessive Wind Acceleration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oExcessiveWindAccelerationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit113_Output__oExcessiveWindAcceleration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit113_Output__oExcessiveWindAcceleration_feature", "_UI_CtrlUnit113_type"),
				 WTSpecPackage.Literals.CTRL_UNIT113__OUTPUT_OEXCESSIVE_WIND_ACCELERATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pConsidered Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pConsideredTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit113_Parameter__pConsideredTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit113_Parameter__pConsideredTime_feature", "_UI_CtrlUnit113_type"),
				 WTSpecPackage.Literals.CTRL_UNIT113__PARAMETER_PCONSIDERED_TIME,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pWind Acceleration Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pWindAccelerationLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit113_Parameter__pWindAccelerationLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit113_Parameter__pWindAccelerationLimit_feature", "_UI_CtrlUnit113_type"),
				 WTSpecPackage.Literals.CTRL_UNIT113__PARAMETER_PWIND_ACCELERATION_LIMIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pHi Wind Limit Reset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pHiWindLimitResetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit113_Parameter__pHiWindLimitReset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit113_Parameter__pHiWindLimitReset_feature", "_UI_CtrlUnit113_type"),
				 WTSpecPackage.Literals.CTRL_UNIT113__PARAMETER_PHI_WIND_LIMIT_RESET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pMax Absolute Wind Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pMaxAbsoluteWindSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit113_Parameter__pMaxAbsoluteWindSpeed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit113_Parameter__pMaxAbsoluteWindSpeed_feature", "_UI_CtrlUnit113_type"),
				 WTSpecPackage.Literals.CTRL_UNIT113__PARAMETER_PMAX_ABSOLUTE_WIND_SPEED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit113.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit113"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit113)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit113_type") :
			getString("_UI_CtrlUnit113_type") + " " + label;
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
