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

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit63;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * This is the item provider adapter for a {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit63} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CtrlUnit63ItemProvider
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
	public CtrlUnit63ItemProvider(AdapterFactory adapterFactory) {
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

			addInput__iAzimuthPropertyDescriptor(object);
			addInput__iOrderPropertyDescriptor(object);
			addInput__iTargetHolePropertyDescriptor(object);
			addInput__iInvReadyRefPropertyDescriptor(object);
			addInput__iEncoderSpeedPropertyDescriptor(object);
			addInput__iInductiveSensor1PropertyDescriptor(object);
			addInput__iInductiveSensor2PropertyDescriptor(object);
			addOutput__oMotorTorquePropertyDescriptor(object);
			addOutput__oMotorSensePropertyDescriptor(object);
			addOutput__oFlIntoPositionPropertyDescriptor(object);
			addOutput__oStatusFromDllPropertyDescriptor(object);
			addOutput__oPositionSetpointPropertyDescriptor(object);
			addOutput__oTorqueAvePropertyDescriptor(object);
			addOutput__oErrorAvePropertyDescriptor(object);
			addOutput__oSpeedAvePropertyDescriptor(object);
			addOutput__oWrefPropertyDescriptor(object);
			addOutput__oTargetPositionPropertyDescriptor(object);
			addOutput__oKeepStatePropertyDescriptor(object);
			addOutput__oSeekStatePropertyDescriptor(object);
			addOutput__oMotorizePropertyDescriptor(object);
			addOutput__oRealObjetivePropertyDescriptor(object);
			addOutput__oControlModePropertyDescriptor(object);
			addParameter__pOffsetPropertyDescriptor(object);
			addParameter__pEncoderOffsetPropertyDescriptor(object);
			addParameter__pNextHoleDegreesPropertyDescriptor(object);
			addParameter__pPosRate1PropertyDescriptor(object);
			addParameter__pPosRate2PropertyDescriptor(object);
			addParameter__pMaxSpeedPropertyDescriptor(object);
			addParameter__pSampleTimePropertyDescriptor(object);
			addParameter__pMaxTorquePropertyDescriptor(object);
			addParameter__pAverageTimePropertyDescriptor(object);
			addParameter__pSpeedAverageTimePropertyDescriptor(object);
			addParameter__pMaxAccelerationPropertyDescriptor(object);
			addParameter__pKppPropertyDescriptor(object);
			addParameter__pKpsPropertyDescriptor(object);
			addParameter__pKisPropertyDescriptor(object);
			addParameter__pFilterOKPropertyDescriptor(object);
			addParameter__pFilterFreqPropertyDescriptor(object);
			addParameter__pFilterDampPropertyDescriptor(object);
			addParameter__pKp2PropertyDescriptor(object);
			addParameter__pKp1PropertyDescriptor(object);
			addParameter__pKi1PropertyDescriptor(object);
			addParameter__pKi2PropertyDescriptor(object);
			addParameter__pPosBandPropertyDescriptor(object);
			addBhvParam__bpControlModePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input iAzimuth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iAzimuthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Input__iAzimuth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Input__iAzimuth_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Input__iAzimuth(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iOrder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Input__iOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Input__iOrder_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Input__iOrder(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iTarget Hole feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iTargetHolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Input__iTargetHole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Input__iTargetHole_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Input__iTargetHole(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInv Ready Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInvReadyRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Input__iInvReadyRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Input__iInvReadyRef_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Input__iInvReadyRef(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iEncoder Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iEncoderSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Input__iEncoderSpeed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Input__iEncoderSpeed_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Input__iEncoderSpeed(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInductive Sensor1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInductiveSensor1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Input__iInductiveSensor1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Input__iInductiveSensor1_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Input__iInductiveSensor1(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input iInductive Sensor2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput__iInductiveSensor2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Input__iInductiveSensor2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Input__iInductiveSensor2_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Input__iInductiveSensor2(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oMotor Torque feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oMotorTorquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Output__oMotorTorque_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Output__oMotorTorque_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Output__oMotorTorque(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oMotor Sense feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oMotorSensePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Output__oMotorSense_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Output__oMotorSense_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Output__oMotorSense(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oFl Into Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oFlIntoPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Output__oFlIntoPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Output__oFlIntoPosition_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Output__oFlIntoPosition(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oStatus From Dll feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oStatusFromDllPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Output__oStatusFromDll_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Output__oStatusFromDll_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Output__oStatusFromDll(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oPosition Setpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oPositionSetpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Output__oPositionSetpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Output__oPositionSetpoint_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Output__oPositionSetpoint(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oTorque Ave feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oTorqueAvePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Output__oTorqueAve_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Output__oTorqueAve_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Output__oTorqueAve(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oError Ave feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oErrorAvePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Output__oErrorAve_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Output__oErrorAve_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Output__oErrorAve(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oSpeed Ave feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oSpeedAvePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Output__oSpeedAve_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Output__oSpeedAve_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Output__oSpeedAve(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oWref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oWrefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Output__oWref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Output__oWref_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Output__oWref(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oTarget Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oTargetPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Output__oTargetPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Output__oTargetPosition_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Output__oTargetPosition(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oKeep State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oKeepStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Output__oKeepState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Output__oKeepState_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Output__oKeepState(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oSeek State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oSeekStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Output__oSeekState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Output__oSeekState_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Output__oSeekState(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oMotorize feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oMotorizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Output__oMotorize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Output__oMotorize_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Output__oMotorize(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oReal Objetive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oRealObjetivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Output__oRealObjetive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Output__oRealObjetive_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Output__oRealObjetive(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output oControl Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput__oControlModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Output__oControlMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Output__oControlMode_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Output__oControlMode(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pOffset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pOffset_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pOffset(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pEncoder Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pEncoderOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pEncoderOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pEncoderOffset_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pEncoderOffset(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pNext Hole Degrees feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pNextHoleDegreesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pNextHoleDegrees_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pNextHoleDegrees_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pNextHoleDegrees(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pPos Rate1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pPosRate1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pPosRate1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pPosRate1_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pPosRate1(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pPos Rate2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pPosRate2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pPosRate2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pPosRate2_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pPosRate2(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pMax Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pMaxSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pMaxSpeed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pMaxSpeed_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pMaxSpeed(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pSample Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pSampleTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pSampleTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pSampleTime_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pSampleTime(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pMax Torque feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pMaxTorquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pMaxTorque_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pMaxTorque_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pMaxTorque(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pAverage Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pAverageTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pAverageTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pAverageTime_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pAverageTime(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pSpeed Average Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pSpeedAverageTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pSpeedAverageTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pSpeedAverageTime_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pSpeedAverageTime(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pMax Acceleration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pMaxAccelerationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pMaxAcceleration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pMaxAcceleration_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pMaxAcceleration(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pKpp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pKppPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pKpp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pKpp_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pKpp(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pKps feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pKpsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pKps_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pKps_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pKps(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pKis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pKisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pKis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pKis_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pKis(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pFilter OK feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pFilterOKPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pFilterOK_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pFilterOK_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pFilterOK(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pFilter Freq feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pFilterFreqPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pFilterFreq_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pFilterFreq_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pFilterFreq(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pFilter Damp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pFilterDampPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pFilterDamp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pFilterDamp_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pFilterDamp(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pKp2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pKp2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pKp2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pKp2_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pKp2(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pKp1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pKp1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pKp1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pKp1_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pKp1(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pKi1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pKi1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pKi1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pKi1_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pKi1(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pKi2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pKi2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pKi2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pKi2_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pKi2(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameter pPos Band feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameter__pPosBandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_Parameter__pPosBand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_Parameter__pPosBand_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_Parameter__pPosBand(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bhv Param bp Control Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBhvParam__bpControlModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CtrlUnit63_BhvParam__bpControlMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CtrlUnit63_BhvParam__bpControlMode_feature", "_UI_CtrlUnit63_type"),
				 WTSpecPackage.eINSTANCE.getCtrlUnit63_BhvParam__bpControlMode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CtrlUnit63.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CtrlUnit63"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CtrlUnit63)object).getSysId();
		return label == null || label.length() == 0 ?
			getString("_UI_CtrlUnit63_type") :
			getString("_UI_CtrlUnit63_type") + " " + label;
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

		switch (notification.getFeatureID(CtrlUnit63.class)) {
			case WTSpecPackage.CTRL_UNIT63__BHV_PARAM_BP_CONTROL_MODE:
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
