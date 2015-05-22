/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit61;
import WTSpec.WTCErrorReaction;
import WTSpec.WTCFault;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTCTimer;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit61</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit61Impl#getInput__iInverterToOnOrder <em>Input iInverter To On Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit61Impl#getInput__iInverterReadyRef <em>Input iInverter Ready Ref</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit61Impl#getInput__iRemoteResetOrder <em>Input iRemote Reset Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit61Impl#getInput__iInverterTorqueReg <em>Input iInverter Torque Reg</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit61Impl#getInput__iInverterHwState <em>Input iInverter Hw State</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit61Impl#getInput__iResetOrder <em>Input iReset Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit61Impl#getInput__iMotorizing <em>Input iMotorizing</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit61Impl#getOutput__oInverterToOn <em>Output oInverter To On</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit61Impl#getOutput__oInverterResetCommand <em>Output oInverter Reset Command</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit61Impl#getOutput__oInverterTorqueRef <em>Output oInverter Torque Ref</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit61Impl#getOutput__oInverterResetAlarms <em>Output oInverter Reset Alarms</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit61Impl#getFault__fEtherCAT <em>Fault fEther CAT</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit61Impl#getTimer__tResetTime <em>Timer tReset Time</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit61Impl#getTimer__tDelayBetweenResets <em>Timer tDelay Between Resets</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit61Impl#getErrorReaction__erStop <em>Error Reaction er Stop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit61Impl extends wtcImpl implements CtrlUnit61 {
	/**
	 * The cached value of the '{@link #getInput__iInverterToOnOrder() <em>Input iInverter To On Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInverterToOnOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInverterToOnOrder;

	/**
	 * The cached value of the '{@link #getInput__iInverterReadyRef() <em>Input iInverter Ready Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInverterReadyRef()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInverterReadyRef;

	/**
	 * The cached value of the '{@link #getInput__iRemoteResetOrder() <em>Input iRemote Reset Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iRemoteResetOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iRemoteResetOrder;

	/**
	 * The cached value of the '{@link #getInput__iInverterTorqueReg() <em>Input iInverter Torque Reg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInverterTorqueReg()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInverterTorqueReg;

	/**
	 * The cached value of the '{@link #getInput__iInverterHwState() <em>Input iInverter Hw State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInverterHwState()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInverterHwState;

	/**
	 * The cached value of the '{@link #getInput__iResetOrder() <em>Input iReset Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iResetOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iResetOrder;

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
	 * The cached value of the '{@link #getOutput__oInverterToOn() <em>Output oInverter To On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oInverterToOn()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oInverterToOn;

	/**
	 * The cached value of the '{@link #getOutput__oInverterResetCommand() <em>Output oInverter Reset Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oInverterResetCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oInverterResetCommand;

	/**
	 * The cached value of the '{@link #getOutput__oInverterTorqueRef() <em>Output oInverter Torque Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oInverterTorqueRef()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oInverterTorqueRef;

	/**
	 * The cached value of the '{@link #getOutput__oInverterResetAlarms() <em>Output oInverter Reset Alarms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oInverterResetAlarms()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oInverterResetAlarms;

	/**
	 * The cached value of the '{@link #getFault__fEtherCAT() <em>Fault fEther CAT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fEtherCAT()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fEtherCAT;

	/**
	 * The cached value of the '{@link #getTimer__tResetTime() <em>Timer tReset Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tResetTime()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tResetTime;

	/**
	 * The cached value of the '{@link #getTimer__tDelayBetweenResets() <em>Timer tDelay Between Resets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tDelayBetweenResets()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tDelayBetweenResets;

	/**
	 * The cached value of the '{@link #getErrorReaction__erStop() <em>Error Reaction er Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorReaction__erStop()
	 * @generated
	 * @ordered
	 */
	protected WTCErrorReaction errorReaction__erStop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit61Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT61;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInverterToOnOrder() {
		if (input__iInverterToOnOrder != null && input__iInverterToOnOrder.eIsProxy()) {
			InternalEObject oldInput__iInverterToOnOrder = (InternalEObject)input__iInverterToOnOrder;
			input__iInverterToOnOrder = (WTCInput)eResolveProxy(oldInput__iInverterToOnOrder);
			if (input__iInverterToOnOrder != oldInput__iInverterToOnOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_TO_ON_ORDER, oldInput__iInverterToOnOrder, input__iInverterToOnOrder));
			}
		}
		return input__iInverterToOnOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInverterToOnOrder() {
		return input__iInverterToOnOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInverterToOnOrder(WTCInput newInput__iInverterToOnOrder) {
		WTCInput oldInput__iInverterToOnOrder = input__iInverterToOnOrder;
		input__iInverterToOnOrder = newInput__iInverterToOnOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_TO_ON_ORDER, oldInput__iInverterToOnOrder, input__iInverterToOnOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInverterReadyRef() {
		if (input__iInverterReadyRef != null && input__iInverterReadyRef.eIsProxy()) {
			InternalEObject oldInput__iInverterReadyRef = (InternalEObject)input__iInverterReadyRef;
			input__iInverterReadyRef = (WTCInput)eResolveProxy(oldInput__iInverterReadyRef);
			if (input__iInverterReadyRef != oldInput__iInverterReadyRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_READY_REF, oldInput__iInverterReadyRef, input__iInverterReadyRef));
			}
		}
		return input__iInverterReadyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInverterReadyRef() {
		return input__iInverterReadyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInverterReadyRef(WTCInput newInput__iInverterReadyRef) {
		WTCInput oldInput__iInverterReadyRef = input__iInverterReadyRef;
		input__iInverterReadyRef = newInput__iInverterReadyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_READY_REF, oldInput__iInverterReadyRef, input__iInverterReadyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iRemoteResetOrder() {
		if (input__iRemoteResetOrder != null && input__iRemoteResetOrder.eIsProxy()) {
			InternalEObject oldInput__iRemoteResetOrder = (InternalEObject)input__iRemoteResetOrder;
			input__iRemoteResetOrder = (WTCInput)eResolveProxy(oldInput__iRemoteResetOrder);
			if (input__iRemoteResetOrder != oldInput__iRemoteResetOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT61__INPUT_IREMOTE_RESET_ORDER, oldInput__iRemoteResetOrder, input__iRemoteResetOrder));
			}
		}
		return input__iRemoteResetOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iRemoteResetOrder() {
		return input__iRemoteResetOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iRemoteResetOrder(WTCInput newInput__iRemoteResetOrder) {
		WTCInput oldInput__iRemoteResetOrder = input__iRemoteResetOrder;
		input__iRemoteResetOrder = newInput__iRemoteResetOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT61__INPUT_IREMOTE_RESET_ORDER, oldInput__iRemoteResetOrder, input__iRemoteResetOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInverterTorqueReg() {
		if (input__iInverterTorqueReg != null && input__iInverterTorqueReg.eIsProxy()) {
			InternalEObject oldInput__iInverterTorqueReg = (InternalEObject)input__iInverterTorqueReg;
			input__iInverterTorqueReg = (WTCInput)eResolveProxy(oldInput__iInverterTorqueReg);
			if (input__iInverterTorqueReg != oldInput__iInverterTorqueReg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_TORQUE_REG, oldInput__iInverterTorqueReg, input__iInverterTorqueReg));
			}
		}
		return input__iInverterTorqueReg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInverterTorqueReg() {
		return input__iInverterTorqueReg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInverterTorqueReg(WTCInput newInput__iInverterTorqueReg) {
		WTCInput oldInput__iInverterTorqueReg = input__iInverterTorqueReg;
		input__iInverterTorqueReg = newInput__iInverterTorqueReg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_TORQUE_REG, oldInput__iInverterTorqueReg, input__iInverterTorqueReg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInverterHwState() {
		if (input__iInverterHwState != null && input__iInverterHwState.eIsProxy()) {
			InternalEObject oldInput__iInverterHwState = (InternalEObject)input__iInverterHwState;
			input__iInverterHwState = (WTCInput)eResolveProxy(oldInput__iInverterHwState);
			if (input__iInverterHwState != oldInput__iInverterHwState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_HW_STATE, oldInput__iInverterHwState, input__iInverterHwState));
			}
		}
		return input__iInverterHwState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInverterHwState() {
		return input__iInverterHwState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInverterHwState(WTCInput newInput__iInverterHwState) {
		WTCInput oldInput__iInverterHwState = input__iInverterHwState;
		input__iInverterHwState = newInput__iInverterHwState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_HW_STATE, oldInput__iInverterHwState, input__iInverterHwState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iResetOrder() {
		if (input__iResetOrder != null && input__iResetOrder.eIsProxy()) {
			InternalEObject oldInput__iResetOrder = (InternalEObject)input__iResetOrder;
			input__iResetOrder = (WTCInput)eResolveProxy(oldInput__iResetOrder);
			if (input__iResetOrder != oldInput__iResetOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT61__INPUT_IRESET_ORDER, oldInput__iResetOrder, input__iResetOrder));
			}
		}
		return input__iResetOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iResetOrder() {
		return input__iResetOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iResetOrder(WTCInput newInput__iResetOrder) {
		WTCInput oldInput__iResetOrder = input__iResetOrder;
		input__iResetOrder = newInput__iResetOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT61__INPUT_IRESET_ORDER, oldInput__iResetOrder, input__iResetOrder));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT61__INPUT_IMOTORIZING, oldInput__iMotorizing, input__iMotorizing));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT61__INPUT_IMOTORIZING, oldInput__iMotorizing, input__iMotorizing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oInverterToOn() {
		if (output__oInverterToOn != null && output__oInverterToOn.eIsProxy()) {
			InternalEObject oldOutput__oInverterToOn = (InternalEObject)output__oInverterToOn;
			output__oInverterToOn = (WTCOutput)eResolveProxy(oldOutput__oInverterToOn);
			if (output__oInverterToOn != oldOutput__oInverterToOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_TO_ON, oldOutput__oInverterToOn, output__oInverterToOn));
			}
		}
		return output__oInverterToOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oInverterToOn() {
		return output__oInverterToOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oInverterToOn(WTCOutput newOutput__oInverterToOn) {
		WTCOutput oldOutput__oInverterToOn = output__oInverterToOn;
		output__oInverterToOn = newOutput__oInverterToOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_TO_ON, oldOutput__oInverterToOn, output__oInverterToOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oInverterResetCommand() {
		if (output__oInverterResetCommand != null && output__oInverterResetCommand.eIsProxy()) {
			InternalEObject oldOutput__oInverterResetCommand = (InternalEObject)output__oInverterResetCommand;
			output__oInverterResetCommand = (WTCOutput)eResolveProxy(oldOutput__oInverterResetCommand);
			if (output__oInverterResetCommand != oldOutput__oInverterResetCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_RESET_COMMAND, oldOutput__oInverterResetCommand, output__oInverterResetCommand));
			}
		}
		return output__oInverterResetCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oInverterResetCommand() {
		return output__oInverterResetCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oInverterResetCommand(WTCOutput newOutput__oInverterResetCommand) {
		WTCOutput oldOutput__oInverterResetCommand = output__oInverterResetCommand;
		output__oInverterResetCommand = newOutput__oInverterResetCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_RESET_COMMAND, oldOutput__oInverterResetCommand, output__oInverterResetCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oInverterTorqueRef() {
		if (output__oInverterTorqueRef != null && output__oInverterTorqueRef.eIsProxy()) {
			InternalEObject oldOutput__oInverterTorqueRef = (InternalEObject)output__oInverterTorqueRef;
			output__oInverterTorqueRef = (WTCOutput)eResolveProxy(oldOutput__oInverterTorqueRef);
			if (output__oInverterTorqueRef != oldOutput__oInverterTorqueRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_TORQUE_REF, oldOutput__oInverterTorqueRef, output__oInverterTorqueRef));
			}
		}
		return output__oInverterTorqueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oInverterTorqueRef() {
		return output__oInverterTorqueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oInverterTorqueRef(WTCOutput newOutput__oInverterTorqueRef) {
		WTCOutput oldOutput__oInverterTorqueRef = output__oInverterTorqueRef;
		output__oInverterTorqueRef = newOutput__oInverterTorqueRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_TORQUE_REF, oldOutput__oInverterTorqueRef, output__oInverterTorqueRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oInverterResetAlarms() {
		if (output__oInverterResetAlarms != null && output__oInverterResetAlarms.eIsProxy()) {
			InternalEObject oldOutput__oInverterResetAlarms = (InternalEObject)output__oInverterResetAlarms;
			output__oInverterResetAlarms = (WTCOutput)eResolveProxy(oldOutput__oInverterResetAlarms);
			if (output__oInverterResetAlarms != oldOutput__oInverterResetAlarms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_RESET_ALARMS, oldOutput__oInverterResetAlarms, output__oInverterResetAlarms));
			}
		}
		return output__oInverterResetAlarms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oInverterResetAlarms() {
		return output__oInverterResetAlarms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oInverterResetAlarms(WTCOutput newOutput__oInverterResetAlarms) {
		WTCOutput oldOutput__oInverterResetAlarms = output__oInverterResetAlarms;
		output__oInverterResetAlarms = newOutput__oInverterResetAlarms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_RESET_ALARMS, oldOutput__oInverterResetAlarms, output__oInverterResetAlarms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fEtherCAT() {
		if (fault__fEtherCAT != null && fault__fEtherCAT.eIsProxy()) {
			InternalEObject oldFault__fEtherCAT = (InternalEObject)fault__fEtherCAT;
			fault__fEtherCAT = (WTCFault)eResolveProxy(oldFault__fEtherCAT);
			if (fault__fEtherCAT != oldFault__fEtherCAT) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT61__FAULT_FETHER_CAT, oldFault__fEtherCAT, fault__fEtherCAT));
			}
		}
		return fault__fEtherCAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fEtherCAT() {
		return fault__fEtherCAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fEtherCAT(WTCFault newFault__fEtherCAT) {
		WTCFault oldFault__fEtherCAT = fault__fEtherCAT;
		fault__fEtherCAT = newFault__fEtherCAT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT61__FAULT_FETHER_CAT, oldFault__fEtherCAT, fault__fEtherCAT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tResetTime() {
		if (timer__tResetTime != null && timer__tResetTime.eIsProxy()) {
			InternalEObject oldTimer__tResetTime = (InternalEObject)timer__tResetTime;
			timer__tResetTime = (WTCTimer)eResolveProxy(oldTimer__tResetTime);
			if (timer__tResetTime != oldTimer__tResetTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT61__TIMER_TRESET_TIME, oldTimer__tResetTime, timer__tResetTime));
			}
		}
		return timer__tResetTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tResetTime() {
		return timer__tResetTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tResetTime(WTCTimer newTimer__tResetTime) {
		WTCTimer oldTimer__tResetTime = timer__tResetTime;
		timer__tResetTime = newTimer__tResetTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT61__TIMER_TRESET_TIME, oldTimer__tResetTime, timer__tResetTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tDelayBetweenResets() {
		if (timer__tDelayBetweenResets != null && timer__tDelayBetweenResets.eIsProxy()) {
			InternalEObject oldTimer__tDelayBetweenResets = (InternalEObject)timer__tDelayBetweenResets;
			timer__tDelayBetweenResets = (WTCTimer)eResolveProxy(oldTimer__tDelayBetweenResets);
			if (timer__tDelayBetweenResets != oldTimer__tDelayBetweenResets) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT61__TIMER_TDELAY_BETWEEN_RESETS, oldTimer__tDelayBetweenResets, timer__tDelayBetweenResets));
			}
		}
		return timer__tDelayBetweenResets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tDelayBetweenResets() {
		return timer__tDelayBetweenResets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tDelayBetweenResets(WTCTimer newTimer__tDelayBetweenResets) {
		WTCTimer oldTimer__tDelayBetweenResets = timer__tDelayBetweenResets;
		timer__tDelayBetweenResets = newTimer__tDelayBetweenResets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT61__TIMER_TDELAY_BETWEEN_RESETS, oldTimer__tDelayBetweenResets, timer__tDelayBetweenResets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction getErrorReaction__erStop() {
		if (errorReaction__erStop != null && errorReaction__erStop.eIsProxy()) {
			InternalEObject oldErrorReaction__erStop = (InternalEObject)errorReaction__erStop;
			errorReaction__erStop = (WTCErrorReaction)eResolveProxy(oldErrorReaction__erStop);
			if (errorReaction__erStop != oldErrorReaction__erStop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT61__ERROR_REACTION_ER_STOP, oldErrorReaction__erStop, errorReaction__erStop));
			}
		}
		return errorReaction__erStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction basicGetErrorReaction__erStop() {
		return errorReaction__erStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorReaction__erStop(WTCErrorReaction newErrorReaction__erStop) {
		WTCErrorReaction oldErrorReaction__erStop = errorReaction__erStop;
		errorReaction__erStop = newErrorReaction__erStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT61__ERROR_REACTION_ER_STOP, oldErrorReaction__erStop, errorReaction__erStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_TO_ON_ORDER:
				if (resolve) return getInput__iInverterToOnOrder();
				return basicGetInput__iInverterToOnOrder();
			case WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_READY_REF:
				if (resolve) return getInput__iInverterReadyRef();
				return basicGetInput__iInverterReadyRef();
			case WTSpecPackage.CTRL_UNIT61__INPUT_IREMOTE_RESET_ORDER:
				if (resolve) return getInput__iRemoteResetOrder();
				return basicGetInput__iRemoteResetOrder();
			case WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_TORQUE_REG:
				if (resolve) return getInput__iInverterTorqueReg();
				return basicGetInput__iInverterTorqueReg();
			case WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_HW_STATE:
				if (resolve) return getInput__iInverterHwState();
				return basicGetInput__iInverterHwState();
			case WTSpecPackage.CTRL_UNIT61__INPUT_IRESET_ORDER:
				if (resolve) return getInput__iResetOrder();
				return basicGetInput__iResetOrder();
			case WTSpecPackage.CTRL_UNIT61__INPUT_IMOTORIZING:
				if (resolve) return getInput__iMotorizing();
				return basicGetInput__iMotorizing();
			case WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_TO_ON:
				if (resolve) return getOutput__oInverterToOn();
				return basicGetOutput__oInverterToOn();
			case WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_RESET_COMMAND:
				if (resolve) return getOutput__oInverterResetCommand();
				return basicGetOutput__oInverterResetCommand();
			case WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_TORQUE_REF:
				if (resolve) return getOutput__oInverterTorqueRef();
				return basicGetOutput__oInverterTorqueRef();
			case WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_RESET_ALARMS:
				if (resolve) return getOutput__oInverterResetAlarms();
				return basicGetOutput__oInverterResetAlarms();
			case WTSpecPackage.CTRL_UNIT61__FAULT_FETHER_CAT:
				if (resolve) return getFault__fEtherCAT();
				return basicGetFault__fEtherCAT();
			case WTSpecPackage.CTRL_UNIT61__TIMER_TRESET_TIME:
				if (resolve) return getTimer__tResetTime();
				return basicGetTimer__tResetTime();
			case WTSpecPackage.CTRL_UNIT61__TIMER_TDELAY_BETWEEN_RESETS:
				if (resolve) return getTimer__tDelayBetweenResets();
				return basicGetTimer__tDelayBetweenResets();
			case WTSpecPackage.CTRL_UNIT61__ERROR_REACTION_ER_STOP:
				if (resolve) return getErrorReaction__erStop();
				return basicGetErrorReaction__erStop();
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
			case WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_TO_ON_ORDER:
				setInput__iInverterToOnOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_READY_REF:
				setInput__iInverterReadyRef((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IREMOTE_RESET_ORDER:
				setInput__iRemoteResetOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_TORQUE_REG:
				setInput__iInverterTorqueReg((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_HW_STATE:
				setInput__iInverterHwState((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IRESET_ORDER:
				setInput__iResetOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IMOTORIZING:
				setInput__iMotorizing((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_TO_ON:
				setOutput__oInverterToOn((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_RESET_COMMAND:
				setOutput__oInverterResetCommand((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_TORQUE_REF:
				setOutput__oInverterTorqueRef((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_RESET_ALARMS:
				setOutput__oInverterResetAlarms((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT61__FAULT_FETHER_CAT:
				setFault__fEtherCAT((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT61__TIMER_TRESET_TIME:
				setTimer__tResetTime((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT61__TIMER_TDELAY_BETWEEN_RESETS:
				setTimer__tDelayBetweenResets((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT61__ERROR_REACTION_ER_STOP:
				setErrorReaction__erStop((WTCErrorReaction)newValue);
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
			case WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_TO_ON_ORDER:
				setInput__iInverterToOnOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_READY_REF:
				setInput__iInverterReadyRef((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IREMOTE_RESET_ORDER:
				setInput__iRemoteResetOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_TORQUE_REG:
				setInput__iInverterTorqueReg((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_HW_STATE:
				setInput__iInverterHwState((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IRESET_ORDER:
				setInput__iResetOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IMOTORIZING:
				setInput__iMotorizing((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_TO_ON:
				setOutput__oInverterToOn((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_RESET_COMMAND:
				setOutput__oInverterResetCommand((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_TORQUE_REF:
				setOutput__oInverterTorqueRef((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_RESET_ALARMS:
				setOutput__oInverterResetAlarms((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT61__FAULT_FETHER_CAT:
				setFault__fEtherCAT((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT61__TIMER_TRESET_TIME:
				setTimer__tResetTime((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT61__TIMER_TDELAY_BETWEEN_RESETS:
				setTimer__tDelayBetweenResets((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT61__ERROR_REACTION_ER_STOP:
				setErrorReaction__erStop((WTCErrorReaction)null);
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
			case WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_TO_ON_ORDER:
				return input__iInverterToOnOrder != null;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_READY_REF:
				return input__iInverterReadyRef != null;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IREMOTE_RESET_ORDER:
				return input__iRemoteResetOrder != null;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_TORQUE_REG:
				return input__iInverterTorqueReg != null;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IINVERTER_HW_STATE:
				return input__iInverterHwState != null;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IRESET_ORDER:
				return input__iResetOrder != null;
			case WTSpecPackage.CTRL_UNIT61__INPUT_IMOTORIZING:
				return input__iMotorizing != null;
			case WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_TO_ON:
				return output__oInverterToOn != null;
			case WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_RESET_COMMAND:
				return output__oInverterResetCommand != null;
			case WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_TORQUE_REF:
				return output__oInverterTorqueRef != null;
			case WTSpecPackage.CTRL_UNIT61__OUTPUT_OINVERTER_RESET_ALARMS:
				return output__oInverterResetAlarms != null;
			case WTSpecPackage.CTRL_UNIT61__FAULT_FETHER_CAT:
				return fault__fEtherCAT != null;
			case WTSpecPackage.CTRL_UNIT61__TIMER_TRESET_TIME:
				return timer__tResetTime != null;
			case WTSpecPackage.CTRL_UNIT61__TIMER_TDELAY_BETWEEN_RESETS:
				return timer__tDelayBetweenResets != null;
			case WTSpecPackage.CTRL_UNIT61__ERROR_REACTION_ER_STOP:
				return errorReaction__erStop != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit61Impl
