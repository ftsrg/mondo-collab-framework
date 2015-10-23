/**
 */
package WTSpec.provider;


import WTSpec.CtrlUnit24;
import WTSpec.WTSpecPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link WTSpec.CtrlUnit24} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit24ItemProvider extends wtcItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit24ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iInverterReadyPropertyDescriptor(object);
			addInput__iInverterPowerPropertyDescriptor(object);
			addInput__iAlgorithmCommandPropertyDescriptor(object);
			addParameter__pPowerLimitPropertyDescriptor(object);
			addFault__fYawProblemPropertyDescriptor(object);
			addTimer__tDelayProblemNotifyPropertyDescriptor(object);
			addDecisionSequence__dsDecisionTreePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iInverter Ready feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInverterReadyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit24_Input__iInverterReady_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit24_Input__iInverterReady_feature", "_UI_CtrlUnit24_type"),
				 WTSpecPackage.Literals.CTRL_UNIT24__INPUT_IINVERTER_READY,
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
				 getString("_UI_CtrlUnit24_Input__iInverterPower_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit24_Input__iInverterPower_feature", "_UI_CtrlUnit24_type"),
				 WTSpecPackage.Literals.CTRL_UNIT24__INPUT_IINVERTER_POWER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iAlgorithm Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iAlgorithmCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit24_Input__iAlgorithmCommand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit24_Input__iAlgorithmCommand_feature", "_UI_CtrlUnit24_type"),
				 WTSpecPackage.Literals.CTRL_UNIT24__INPUT_IALGORITHM_COMMAND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pPower Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pPowerLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit24_Parameter__pPowerLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit24_Parameter__pPowerLimit_feature", "_UI_CtrlUnit24_type"),
				 WTSpecPackage.Literals.CTRL_UNIT24__PARAMETER_PPOWER_LIMIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault fYaw Problem feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault__fYawProblemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit24_Fault__fYawProblem_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit24_Fault__fYawProblem_feature", "_UI_CtrlUnit24_type"),
				 WTSpecPackage.Literals.CTRL_UNIT24__FAULT_FYAW_PROBLEM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timer tDelay Problem Notify feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimer__tDelayProblemNotifyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit24_Timer__tDelayProblemNotify_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit24_Timer__tDelayProblemNotify_feature", "_UI_CtrlUnit24_type"),
				 WTSpecPackage.Literals.CTRL_UNIT24__TIMER_TDELAY_PROBLEM_NOTIFY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decision Sequence ds Decision Tree feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecisionSequence__dsDecisionTreePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit24_DecisionSequence__dsDecisionTree_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit24_DecisionSequence__dsDecisionTree_feature", "_UI_CtrlUnit24_type"),
				 WTSpecPackage.Literals.CTRL_UNIT24__DECISION_SEQUENCE_DS_DECISION_TREE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit24.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit24"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit24)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit24_type") :
			getString("_UI_CtrlUnit24_type") + " " + label;
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

		switch (notification.getFeatureID(CtrlUnit24.class)) {
			case WTSpecPackage.CTRL_UNIT24__DECISION_SEQUENCE_DS_DECISION_TREE:
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
