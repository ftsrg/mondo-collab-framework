/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit53;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCErrorReaction;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCFault;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCTimer;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit53</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit53Impl#getInput__iMachineStatusIndicator <em>Input iMachine Status Indicator</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit53Impl#getInput__iStopConditionIndicator <em>Input iStop Condition Indicator</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit53Impl#getInput__iManualByPass <em>Input iManual By Pass</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit53Impl#getInput__iMotorizing <em>Input iMotorizing</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit53Impl#getInput__iFlagIntoWind <em>Input iFlag Into Wind</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit53Impl#getInput__iProtectionCondition <em>Input iProtection Condition</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit53Impl#getInput__iEmergencyCondition <em>Input iEmergency Condition</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit53Impl#getInput__iDeenergizeCondition <em>Input iDeenergize Condition</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit53Impl#getOutput__oAutoStopCommand <em>Output oAuto Stop Command</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit53Impl#getFault__fRunFault <em>Fault fRun Fault</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit53Impl#getTimer__tStartDelay <em>Timer tStart Delay</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit53Impl#getTimer__tCheckRunFault <em>Timer tCheck Run Fault</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit53Impl#getErrorReaction__erMotorizing <em>Error Reaction er Motorizing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit53Impl extends wtcImpl implements CtrlUnit53 {
	/**
	 * The cached value of the '{@link #getInput__iMachineStatusIndicator() <em>Input iMachine Status Indicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iMachineStatusIndicator()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iMachineStatusIndicator;

	/**
	 * The cached value of the '{@link #getInput__iStopConditionIndicator() <em>Input iStop Condition Indicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iStopConditionIndicator()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iStopConditionIndicator;

	/**
	 * The cached value of the '{@link #getInput__iManualByPass() <em>Input iManual By Pass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iManualByPass()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iManualByPass;

	/**
	 * The cached value of the '{@link #getInput__iMotorizing() <em>Input iMotorizing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iMotorizing()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iMotorizing;

	/**
	 * The cached value of the '{@link #getInput__iFlagIntoWind() <em>Input iFlag Into Wind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iFlagIntoWind()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iFlagIntoWind;

	/**
	 * The cached value of the '{@link #getInput__iProtectionCondition() <em>Input iProtection Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iProtectionCondition()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iProtectionCondition;

	/**
	 * The cached value of the '{@link #getInput__iEmergencyCondition() <em>Input iEmergency Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iEmergencyCondition()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iEmergencyCondition;

	/**
	 * The cached value of the '{@link #getInput__iDeenergizeCondition() <em>Input iDeenergize Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iDeenergizeCondition()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iDeenergizeCondition;

	/**
	 * The cached value of the '{@link #getOutput__oAutoStopCommand() <em>Output oAuto Stop Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oAutoStopCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oAutoStopCommand;

	/**
	 * The cached value of the '{@link #getFault__fRunFault() <em>Fault fRun Fault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fRunFault()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fRunFault;

	/**
	 * The cached value of the '{@link #getTimer__tStartDelay() <em>Timer tStart Delay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tStartDelay()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tStartDelay;

	/**
	 * The cached value of the '{@link #getTimer__tCheckRunFault() <em>Timer tCheck Run Fault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tCheckRunFault()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tCheckRunFault;

	/**
	 * The cached value of the '{@link #getErrorReaction__erMotorizing() <em>Error Reaction er Motorizing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorReaction__erMotorizing()
	 * @generated
	 * @ordered
	 */
	protected WTCErrorReaction errorReaction__erMotorizing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit53Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit53();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iMachineStatusIndicator() {
		if (input__iMachineStatusIndicator != null && input__iMachineStatusIndicator.eIsProxy()) {
			InternalEObject oldInput__iMachineStatusIndicator = (InternalEObject)input__iMachineStatusIndicator;
			input__iMachineStatusIndicator = (WTCInput)eResolveProxy(oldInput__iMachineStatusIndicator);
			if (input__iMachineStatusIndicator != oldInput__iMachineStatusIndicator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT53__INPUT_IMACHINE_STATUS_INDICATOR, oldInput__iMachineStatusIndicator, input__iMachineStatusIndicator));
			}
		}
		return input__iMachineStatusIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iMachineStatusIndicator() {
		return input__iMachineStatusIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iMachineStatusIndicator(WTCInput newInput__iMachineStatusIndicator) {
		WTCInput oldInput__iMachineStatusIndicator = input__iMachineStatusIndicator;
		input__iMachineStatusIndicator = newInput__iMachineStatusIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT53__INPUT_IMACHINE_STATUS_INDICATOR, oldInput__iMachineStatusIndicator, input__iMachineStatusIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iStopConditionIndicator() {
		if (input__iStopConditionIndicator != null && input__iStopConditionIndicator.eIsProxy()) {
			InternalEObject oldInput__iStopConditionIndicator = (InternalEObject)input__iStopConditionIndicator;
			input__iStopConditionIndicator = (WTCInput)eResolveProxy(oldInput__iStopConditionIndicator);
			if (input__iStopConditionIndicator != oldInput__iStopConditionIndicator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT53__INPUT_ISTOP_CONDITION_INDICATOR, oldInput__iStopConditionIndicator, input__iStopConditionIndicator));
			}
		}
		return input__iStopConditionIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iStopConditionIndicator() {
		return input__iStopConditionIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iStopConditionIndicator(WTCInput newInput__iStopConditionIndicator) {
		WTCInput oldInput__iStopConditionIndicator = input__iStopConditionIndicator;
		input__iStopConditionIndicator = newInput__iStopConditionIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT53__INPUT_ISTOP_CONDITION_INDICATOR, oldInput__iStopConditionIndicator, input__iStopConditionIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iManualByPass() {
		if (input__iManualByPass != null && input__iManualByPass.eIsProxy()) {
			InternalEObject oldInput__iManualByPass = (InternalEObject)input__iManualByPass;
			input__iManualByPass = (WTCInput)eResolveProxy(oldInput__iManualByPass);
			if (input__iManualByPass != oldInput__iManualByPass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT53__INPUT_IMANUAL_BY_PASS, oldInput__iManualByPass, input__iManualByPass));
			}
		}
		return input__iManualByPass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iManualByPass() {
		return input__iManualByPass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iManualByPass(WTCInput newInput__iManualByPass) {
		WTCInput oldInput__iManualByPass = input__iManualByPass;
		input__iManualByPass = newInput__iManualByPass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT53__INPUT_IMANUAL_BY_PASS, oldInput__iManualByPass, input__iManualByPass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iMotorizing() {
		if (input__iMotorizing != null && input__iMotorizing.eIsProxy()) {
			InternalEObject oldInput__iMotorizing = (InternalEObject)input__iMotorizing;
			input__iMotorizing = (WTCInput)eResolveProxy(oldInput__iMotorizing);
			if (input__iMotorizing != oldInput__iMotorizing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT53__INPUT_IMOTORIZING, oldInput__iMotorizing, input__iMotorizing));
			}
		}
		return input__iMotorizing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iMotorizing() {
		return input__iMotorizing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iMotorizing(WTCInput newInput__iMotorizing) {
		WTCInput oldInput__iMotorizing = input__iMotorizing;
		input__iMotorizing = newInput__iMotorizing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT53__INPUT_IMOTORIZING, oldInput__iMotorizing, input__iMotorizing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iFlagIntoWind() {
		if (input__iFlagIntoWind != null && input__iFlagIntoWind.eIsProxy()) {
			InternalEObject oldInput__iFlagIntoWind = (InternalEObject)input__iFlagIntoWind;
			input__iFlagIntoWind = (WTCInput)eResolveProxy(oldInput__iFlagIntoWind);
			if (input__iFlagIntoWind != oldInput__iFlagIntoWind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT53__INPUT_IFLAG_INTO_WIND, oldInput__iFlagIntoWind, input__iFlagIntoWind));
			}
		}
		return input__iFlagIntoWind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iFlagIntoWind() {
		return input__iFlagIntoWind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iFlagIntoWind(WTCInput newInput__iFlagIntoWind) {
		WTCInput oldInput__iFlagIntoWind = input__iFlagIntoWind;
		input__iFlagIntoWind = newInput__iFlagIntoWind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT53__INPUT_IFLAG_INTO_WIND, oldInput__iFlagIntoWind, input__iFlagIntoWind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iProtectionCondition() {
		if (input__iProtectionCondition != null && input__iProtectionCondition.eIsProxy()) {
			InternalEObject oldInput__iProtectionCondition = (InternalEObject)input__iProtectionCondition;
			input__iProtectionCondition = (WTCInput)eResolveProxy(oldInput__iProtectionCondition);
			if (input__iProtectionCondition != oldInput__iProtectionCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT53__INPUT_IPROTECTION_CONDITION, oldInput__iProtectionCondition, input__iProtectionCondition));
			}
		}
		return input__iProtectionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iProtectionCondition() {
		return input__iProtectionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iProtectionCondition(WTCInput newInput__iProtectionCondition) {
		WTCInput oldInput__iProtectionCondition = input__iProtectionCondition;
		input__iProtectionCondition = newInput__iProtectionCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT53__INPUT_IPROTECTION_CONDITION, oldInput__iProtectionCondition, input__iProtectionCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iEmergencyCondition() {
		if (input__iEmergencyCondition != null && input__iEmergencyCondition.eIsProxy()) {
			InternalEObject oldInput__iEmergencyCondition = (InternalEObject)input__iEmergencyCondition;
			input__iEmergencyCondition = (WTCInput)eResolveProxy(oldInput__iEmergencyCondition);
			if (input__iEmergencyCondition != oldInput__iEmergencyCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT53__INPUT_IEMERGENCY_CONDITION, oldInput__iEmergencyCondition, input__iEmergencyCondition));
			}
		}
		return input__iEmergencyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iEmergencyCondition() {
		return input__iEmergencyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iEmergencyCondition(WTCInput newInput__iEmergencyCondition) {
		WTCInput oldInput__iEmergencyCondition = input__iEmergencyCondition;
		input__iEmergencyCondition = newInput__iEmergencyCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT53__INPUT_IEMERGENCY_CONDITION, oldInput__iEmergencyCondition, input__iEmergencyCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iDeenergizeCondition() {
		if (input__iDeenergizeCondition != null && input__iDeenergizeCondition.eIsProxy()) {
			InternalEObject oldInput__iDeenergizeCondition = (InternalEObject)input__iDeenergizeCondition;
			input__iDeenergizeCondition = (WTCInput)eResolveProxy(oldInput__iDeenergizeCondition);
			if (input__iDeenergizeCondition != oldInput__iDeenergizeCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT53__INPUT_IDEENERGIZE_CONDITION, oldInput__iDeenergizeCondition, input__iDeenergizeCondition));
			}
		}
		return input__iDeenergizeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iDeenergizeCondition() {
		return input__iDeenergizeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iDeenergizeCondition(WTCInput newInput__iDeenergizeCondition) {
		WTCInput oldInput__iDeenergizeCondition = input__iDeenergizeCondition;
		input__iDeenergizeCondition = newInput__iDeenergizeCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT53__INPUT_IDEENERGIZE_CONDITION, oldInput__iDeenergizeCondition, input__iDeenergizeCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oAutoStopCommand() {
		if (output__oAutoStopCommand != null && output__oAutoStopCommand.eIsProxy()) {
			InternalEObject oldOutput__oAutoStopCommand = (InternalEObject)output__oAutoStopCommand;
			output__oAutoStopCommand = (WTCOutput)eResolveProxy(oldOutput__oAutoStopCommand);
			if (output__oAutoStopCommand != oldOutput__oAutoStopCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT53__OUTPUT_OAUTO_STOP_COMMAND, oldOutput__oAutoStopCommand, output__oAutoStopCommand));
			}
		}
		return output__oAutoStopCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oAutoStopCommand() {
		return output__oAutoStopCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oAutoStopCommand(WTCOutput newOutput__oAutoStopCommand) {
		WTCOutput oldOutput__oAutoStopCommand = output__oAutoStopCommand;
		output__oAutoStopCommand = newOutput__oAutoStopCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT53__OUTPUT_OAUTO_STOP_COMMAND, oldOutput__oAutoStopCommand, output__oAutoStopCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fRunFault() {
		if (fault__fRunFault != null && fault__fRunFault.eIsProxy()) {
			InternalEObject oldFault__fRunFault = (InternalEObject)fault__fRunFault;
			fault__fRunFault = (WTCFault)eResolveProxy(oldFault__fRunFault);
			if (fault__fRunFault != oldFault__fRunFault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT53__FAULT_FRUN_FAULT, oldFault__fRunFault, fault__fRunFault));
			}
		}
		return fault__fRunFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fRunFault() {
		return fault__fRunFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fRunFault(WTCFault newFault__fRunFault) {
		WTCFault oldFault__fRunFault = fault__fRunFault;
		fault__fRunFault = newFault__fRunFault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT53__FAULT_FRUN_FAULT, oldFault__fRunFault, fault__fRunFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tStartDelay() {
		if (timer__tStartDelay != null && timer__tStartDelay.eIsProxy()) {
			InternalEObject oldTimer__tStartDelay = (InternalEObject)timer__tStartDelay;
			timer__tStartDelay = (WTCTimer)eResolveProxy(oldTimer__tStartDelay);
			if (timer__tStartDelay != oldTimer__tStartDelay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT53__TIMER_TSTART_DELAY, oldTimer__tStartDelay, timer__tStartDelay));
			}
		}
		return timer__tStartDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tStartDelay() {
		return timer__tStartDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tStartDelay(WTCTimer newTimer__tStartDelay) {
		WTCTimer oldTimer__tStartDelay = timer__tStartDelay;
		timer__tStartDelay = newTimer__tStartDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT53__TIMER_TSTART_DELAY, oldTimer__tStartDelay, timer__tStartDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tCheckRunFault() {
		if (timer__tCheckRunFault != null && timer__tCheckRunFault.eIsProxy()) {
			InternalEObject oldTimer__tCheckRunFault = (InternalEObject)timer__tCheckRunFault;
			timer__tCheckRunFault = (WTCTimer)eResolveProxy(oldTimer__tCheckRunFault);
			if (timer__tCheckRunFault != oldTimer__tCheckRunFault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT53__TIMER_TCHECK_RUN_FAULT, oldTimer__tCheckRunFault, timer__tCheckRunFault));
			}
		}
		return timer__tCheckRunFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tCheckRunFault() {
		return timer__tCheckRunFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tCheckRunFault(WTCTimer newTimer__tCheckRunFault) {
		WTCTimer oldTimer__tCheckRunFault = timer__tCheckRunFault;
		timer__tCheckRunFault = newTimer__tCheckRunFault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT53__TIMER_TCHECK_RUN_FAULT, oldTimer__tCheckRunFault, timer__tCheckRunFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction getErrorReaction__erMotorizing() {
		if (errorReaction__erMotorizing != null && errorReaction__erMotorizing.eIsProxy()) {
			InternalEObject oldErrorReaction__erMotorizing = (InternalEObject)errorReaction__erMotorizing;
			errorReaction__erMotorizing = (WTCErrorReaction)eResolveProxy(oldErrorReaction__erMotorizing);
			if (errorReaction__erMotorizing != oldErrorReaction__erMotorizing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT53__ERROR_REACTION_ER_MOTORIZING, oldErrorReaction__erMotorizing, errorReaction__erMotorizing));
			}
		}
		return errorReaction__erMotorizing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction basicGetErrorReaction__erMotorizing() {
		return errorReaction__erMotorizing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorReaction__erMotorizing(WTCErrorReaction newErrorReaction__erMotorizing) {
		WTCErrorReaction oldErrorReaction__erMotorizing = errorReaction__erMotorizing;
		errorReaction__erMotorizing = newErrorReaction__erMotorizing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT53__ERROR_REACTION_ER_MOTORIZING, oldErrorReaction__erMotorizing, errorReaction__erMotorizing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT53__INPUT_IMACHINE_STATUS_INDICATOR:
				if (resolve) return getInput__iMachineStatusIndicator();
				return basicGetInput__iMachineStatusIndicator();
			case WTSpecPackage.CTRL_UNIT53__INPUT_ISTOP_CONDITION_INDICATOR:
				if (resolve) return getInput__iStopConditionIndicator();
				return basicGetInput__iStopConditionIndicator();
			case WTSpecPackage.CTRL_UNIT53__INPUT_IMANUAL_BY_PASS:
				if (resolve) return getInput__iManualByPass();
				return basicGetInput__iManualByPass();
			case WTSpecPackage.CTRL_UNIT53__INPUT_IMOTORIZING:
				if (resolve) return getInput__iMotorizing();
				return basicGetInput__iMotorizing();
			case WTSpecPackage.CTRL_UNIT53__INPUT_IFLAG_INTO_WIND:
				if (resolve) return getInput__iFlagIntoWind();
				return basicGetInput__iFlagIntoWind();
			case WTSpecPackage.CTRL_UNIT53__INPUT_IPROTECTION_CONDITION:
				if (resolve) return getInput__iProtectionCondition();
				return basicGetInput__iProtectionCondition();
			case WTSpecPackage.CTRL_UNIT53__INPUT_IEMERGENCY_CONDITION:
				if (resolve) return getInput__iEmergencyCondition();
				return basicGetInput__iEmergencyCondition();
			case WTSpecPackage.CTRL_UNIT53__INPUT_IDEENERGIZE_CONDITION:
				if (resolve) return getInput__iDeenergizeCondition();
				return basicGetInput__iDeenergizeCondition();
			case WTSpecPackage.CTRL_UNIT53__OUTPUT_OAUTO_STOP_COMMAND:
				if (resolve) return getOutput__oAutoStopCommand();
				return basicGetOutput__oAutoStopCommand();
			case WTSpecPackage.CTRL_UNIT53__FAULT_FRUN_FAULT:
				if (resolve) return getFault__fRunFault();
				return basicGetFault__fRunFault();
			case WTSpecPackage.CTRL_UNIT53__TIMER_TSTART_DELAY:
				if (resolve) return getTimer__tStartDelay();
				return basicGetTimer__tStartDelay();
			case WTSpecPackage.CTRL_UNIT53__TIMER_TCHECK_RUN_FAULT:
				if (resolve) return getTimer__tCheckRunFault();
				return basicGetTimer__tCheckRunFault();
			case WTSpecPackage.CTRL_UNIT53__ERROR_REACTION_ER_MOTORIZING:
				if (resolve) return getErrorReaction__erMotorizing();
				return basicGetErrorReaction__erMotorizing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT53__INPUT_IMACHINE_STATUS_INDICATOR:
				setInput__iMachineStatusIndicator((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT53__INPUT_ISTOP_CONDITION_INDICATOR:
				setInput__iStopConditionIndicator((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IMANUAL_BY_PASS:
				setInput__iManualByPass((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IMOTORIZING:
				setInput__iMotorizing((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IFLAG_INTO_WIND:
				setInput__iFlagIntoWind((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IPROTECTION_CONDITION:
				setInput__iProtectionCondition((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IEMERGENCY_CONDITION:
				setInput__iEmergencyCondition((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IDEENERGIZE_CONDITION:
				setInput__iDeenergizeCondition((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT53__OUTPUT_OAUTO_STOP_COMMAND:
				setOutput__oAutoStopCommand((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT53__FAULT_FRUN_FAULT:
				setFault__fRunFault((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT53__TIMER_TSTART_DELAY:
				setTimer__tStartDelay((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT53__TIMER_TCHECK_RUN_FAULT:
				setTimer__tCheckRunFault((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT53__ERROR_REACTION_ER_MOTORIZING:
				setErrorReaction__erMotorizing((WTCErrorReaction)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT53__INPUT_IMACHINE_STATUS_INDICATOR:
				setInput__iMachineStatusIndicator((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT53__INPUT_ISTOP_CONDITION_INDICATOR:
				setInput__iStopConditionIndicator((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IMANUAL_BY_PASS:
				setInput__iManualByPass((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IMOTORIZING:
				setInput__iMotorizing((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IFLAG_INTO_WIND:
				setInput__iFlagIntoWind((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IPROTECTION_CONDITION:
				setInput__iProtectionCondition((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IEMERGENCY_CONDITION:
				setInput__iEmergencyCondition((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IDEENERGIZE_CONDITION:
				setInput__iDeenergizeCondition((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT53__OUTPUT_OAUTO_STOP_COMMAND:
				setOutput__oAutoStopCommand((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT53__FAULT_FRUN_FAULT:
				setFault__fRunFault((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT53__TIMER_TSTART_DELAY:
				setTimer__tStartDelay((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT53__TIMER_TCHECK_RUN_FAULT:
				setTimer__tCheckRunFault((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT53__ERROR_REACTION_ER_MOTORIZING:
				setErrorReaction__erMotorizing((WTCErrorReaction)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT53__INPUT_IMACHINE_STATUS_INDICATOR:
				return input__iMachineStatusIndicator != null;
			case WTSpecPackage.CTRL_UNIT53__INPUT_ISTOP_CONDITION_INDICATOR:
				return input__iStopConditionIndicator != null;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IMANUAL_BY_PASS:
				return input__iManualByPass != null;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IMOTORIZING:
				return input__iMotorizing != null;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IFLAG_INTO_WIND:
				return input__iFlagIntoWind != null;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IPROTECTION_CONDITION:
				return input__iProtectionCondition != null;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IEMERGENCY_CONDITION:
				return input__iEmergencyCondition != null;
			case WTSpecPackage.CTRL_UNIT53__INPUT_IDEENERGIZE_CONDITION:
				return input__iDeenergizeCondition != null;
			case WTSpecPackage.CTRL_UNIT53__OUTPUT_OAUTO_STOP_COMMAND:
				return output__oAutoStopCommand != null;
			case WTSpecPackage.CTRL_UNIT53__FAULT_FRUN_FAULT:
				return fault__fRunFault != null;
			case WTSpecPackage.CTRL_UNIT53__TIMER_TSTART_DELAY:
				return timer__tStartDelay != null;
			case WTSpecPackage.CTRL_UNIT53__TIMER_TCHECK_RUN_FAULT:
				return timer__tCheckRunFault != null;
			case WTSpecPackage.CTRL_UNIT53__ERROR_REACTION_ER_MOTORIZING:
				return errorReaction__erMotorizing != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit53Impl
