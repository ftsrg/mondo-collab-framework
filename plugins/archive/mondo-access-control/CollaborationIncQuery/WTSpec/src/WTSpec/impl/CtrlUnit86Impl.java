/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit86;
import WTSpec.WTCErrorReaction;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit86</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit86Impl#getInput__iPitchHwStandby <em>Input iPitch Hw Standby</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit86Impl#getInput__iPitchHwFault <em>Input iPitch Hw Fault</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit86Impl#getInput__iPitchStopCommand <em>Input iPitch Stop Command</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit86Impl#getInput__iPitchBrakePosition <em>Input iPitch Brake Position</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit86Impl#getOutput__oBrakes <em>Output oBrakes</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit86Impl#getOutput__oPitchNormalOrder <em>Output oPitch Normal Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit86Impl#getOutput__oPitchEmergencyOrder <em>Output oPitch Emergency Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit86Impl#getOutput__oPitchTestUCapOrder <em>Output oPitch Test UCap Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit86Impl#getErrorReaction__erEmergency <em>Error Reaction er Emergency</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit86Impl#getErrorReaction__erSecurityLine <em>Error Reaction er Security Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit86Impl extends wtcImpl implements CtrlUnit86 {
	/**
	 * The cached value of the '{@link #getInput__iPitchHwStandby() <em>Input iPitch Hw Standby</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPitchHwStandby()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPitchHwStandby;

	/**
	 * The cached value of the '{@link #getInput__iPitchHwFault() <em>Input iPitch Hw Fault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPitchHwFault()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPitchHwFault;

	/**
	 * The cached value of the '{@link #getInput__iPitchStopCommand() <em>Input iPitch Stop Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPitchStopCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPitchStopCommand;

	/**
	 * The cached value of the '{@link #getInput__iPitchBrakePosition() <em>Input iPitch Brake Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPitchBrakePosition()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPitchBrakePosition;

	/**
	 * The cached value of the '{@link #getOutput__oBrakes() <em>Output oBrakes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oBrakes()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oBrakes;

	/**
	 * The cached value of the '{@link #getOutput__oPitchNormalOrder() <em>Output oPitch Normal Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPitchNormalOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPitchNormalOrder;

	/**
	 * The cached value of the '{@link #getOutput__oPitchEmergencyOrder() <em>Output oPitch Emergency Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPitchEmergencyOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPitchEmergencyOrder;

	/**
	 * The cached value of the '{@link #getOutput__oPitchTestUCapOrder() <em>Output oPitch Test UCap Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPitchTestUCapOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPitchTestUCapOrder;

	/**
	 * The cached value of the '{@link #getErrorReaction__erEmergency() <em>Error Reaction er Emergency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorReaction__erEmergency()
	 * @generated
	 * @ordered
	 */
	protected WTCErrorReaction errorReaction__erEmergency;

	/**
	 * The cached value of the '{@link #getErrorReaction__erSecurityLine() <em>Error Reaction er Security Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorReaction__erSecurityLine()
	 * @generated
	 * @ordered
	 */
	protected WTCErrorReaction errorReaction__erSecurityLine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit86Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT86;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPitchHwStandby() {
		if (input__iPitchHwStandby != null && input__iPitchHwStandby.eIsProxy()) {
			InternalEObject oldInput__iPitchHwStandby = (InternalEObject)input__iPitchHwStandby;
			input__iPitchHwStandby = (WTCInput)eResolveProxy(oldInput__iPitchHwStandby);
			if (input__iPitchHwStandby != oldInput__iPitchHwStandby) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_HW_STANDBY, oldInput__iPitchHwStandby, input__iPitchHwStandby));
			}
		}
		return input__iPitchHwStandby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPitchHwStandby() {
		return input__iPitchHwStandby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPitchHwStandby(WTCInput newInput__iPitchHwStandby) {
		WTCInput oldInput__iPitchHwStandby = input__iPitchHwStandby;
		input__iPitchHwStandby = newInput__iPitchHwStandby;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_HW_STANDBY, oldInput__iPitchHwStandby, input__iPitchHwStandby));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPitchHwFault() {
		if (input__iPitchHwFault != null && input__iPitchHwFault.eIsProxy()) {
			InternalEObject oldInput__iPitchHwFault = (InternalEObject)input__iPitchHwFault;
			input__iPitchHwFault = (WTCInput)eResolveProxy(oldInput__iPitchHwFault);
			if (input__iPitchHwFault != oldInput__iPitchHwFault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_HW_FAULT, oldInput__iPitchHwFault, input__iPitchHwFault));
			}
		}
		return input__iPitchHwFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPitchHwFault() {
		return input__iPitchHwFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPitchHwFault(WTCInput newInput__iPitchHwFault) {
		WTCInput oldInput__iPitchHwFault = input__iPitchHwFault;
		input__iPitchHwFault = newInput__iPitchHwFault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_HW_FAULT, oldInput__iPitchHwFault, input__iPitchHwFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPitchStopCommand() {
		if (input__iPitchStopCommand != null && input__iPitchStopCommand.eIsProxy()) {
			InternalEObject oldInput__iPitchStopCommand = (InternalEObject)input__iPitchStopCommand;
			input__iPitchStopCommand = (WTCInput)eResolveProxy(oldInput__iPitchStopCommand);
			if (input__iPitchStopCommand != oldInput__iPitchStopCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_STOP_COMMAND, oldInput__iPitchStopCommand, input__iPitchStopCommand));
			}
		}
		return input__iPitchStopCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPitchStopCommand() {
		return input__iPitchStopCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPitchStopCommand(WTCInput newInput__iPitchStopCommand) {
		WTCInput oldInput__iPitchStopCommand = input__iPitchStopCommand;
		input__iPitchStopCommand = newInput__iPitchStopCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_STOP_COMMAND, oldInput__iPitchStopCommand, input__iPitchStopCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPitchBrakePosition() {
		if (input__iPitchBrakePosition != null && input__iPitchBrakePosition.eIsProxy()) {
			InternalEObject oldInput__iPitchBrakePosition = (InternalEObject)input__iPitchBrakePosition;
			input__iPitchBrakePosition = (WTCInput)eResolveProxy(oldInput__iPitchBrakePosition);
			if (input__iPitchBrakePosition != oldInput__iPitchBrakePosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_BRAKE_POSITION, oldInput__iPitchBrakePosition, input__iPitchBrakePosition));
			}
		}
		return input__iPitchBrakePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPitchBrakePosition() {
		return input__iPitchBrakePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPitchBrakePosition(WTCInput newInput__iPitchBrakePosition) {
		WTCInput oldInput__iPitchBrakePosition = input__iPitchBrakePosition;
		input__iPitchBrakePosition = newInput__iPitchBrakePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_BRAKE_POSITION, oldInput__iPitchBrakePosition, input__iPitchBrakePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oBrakes() {
		if (output__oBrakes != null && output__oBrakes.eIsProxy()) {
			InternalEObject oldOutput__oBrakes = (InternalEObject)output__oBrakes;
			output__oBrakes = (WTCOutput)eResolveProxy(oldOutput__oBrakes);
			if (output__oBrakes != oldOutput__oBrakes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT86__OUTPUT_OBRAKES, oldOutput__oBrakes, output__oBrakes));
			}
		}
		return output__oBrakes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oBrakes() {
		return output__oBrakes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oBrakes(WTCOutput newOutput__oBrakes) {
		WTCOutput oldOutput__oBrakes = output__oBrakes;
		output__oBrakes = newOutput__oBrakes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT86__OUTPUT_OBRAKES, oldOutput__oBrakes, output__oBrakes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPitchNormalOrder() {
		if (output__oPitchNormalOrder != null && output__oPitchNormalOrder.eIsProxy()) {
			InternalEObject oldOutput__oPitchNormalOrder = (InternalEObject)output__oPitchNormalOrder;
			output__oPitchNormalOrder = (WTCOutput)eResolveProxy(oldOutput__oPitchNormalOrder);
			if (output__oPitchNormalOrder != oldOutput__oPitchNormalOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_NORMAL_ORDER, oldOutput__oPitchNormalOrder, output__oPitchNormalOrder));
			}
		}
		return output__oPitchNormalOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPitchNormalOrder() {
		return output__oPitchNormalOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPitchNormalOrder(WTCOutput newOutput__oPitchNormalOrder) {
		WTCOutput oldOutput__oPitchNormalOrder = output__oPitchNormalOrder;
		output__oPitchNormalOrder = newOutput__oPitchNormalOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_NORMAL_ORDER, oldOutput__oPitchNormalOrder, output__oPitchNormalOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPitchEmergencyOrder() {
		if (output__oPitchEmergencyOrder != null && output__oPitchEmergencyOrder.eIsProxy()) {
			InternalEObject oldOutput__oPitchEmergencyOrder = (InternalEObject)output__oPitchEmergencyOrder;
			output__oPitchEmergencyOrder = (WTCOutput)eResolveProxy(oldOutput__oPitchEmergencyOrder);
			if (output__oPitchEmergencyOrder != oldOutput__oPitchEmergencyOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_EMERGENCY_ORDER, oldOutput__oPitchEmergencyOrder, output__oPitchEmergencyOrder));
			}
		}
		return output__oPitchEmergencyOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPitchEmergencyOrder() {
		return output__oPitchEmergencyOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPitchEmergencyOrder(WTCOutput newOutput__oPitchEmergencyOrder) {
		WTCOutput oldOutput__oPitchEmergencyOrder = output__oPitchEmergencyOrder;
		output__oPitchEmergencyOrder = newOutput__oPitchEmergencyOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_EMERGENCY_ORDER, oldOutput__oPitchEmergencyOrder, output__oPitchEmergencyOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPitchTestUCapOrder() {
		if (output__oPitchTestUCapOrder != null && output__oPitchTestUCapOrder.eIsProxy()) {
			InternalEObject oldOutput__oPitchTestUCapOrder = (InternalEObject)output__oPitchTestUCapOrder;
			output__oPitchTestUCapOrder = (WTCOutput)eResolveProxy(oldOutput__oPitchTestUCapOrder);
			if (output__oPitchTestUCapOrder != oldOutput__oPitchTestUCapOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_TEST_UCAP_ORDER, oldOutput__oPitchTestUCapOrder, output__oPitchTestUCapOrder));
			}
		}
		return output__oPitchTestUCapOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPitchTestUCapOrder() {
		return output__oPitchTestUCapOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPitchTestUCapOrder(WTCOutput newOutput__oPitchTestUCapOrder) {
		WTCOutput oldOutput__oPitchTestUCapOrder = output__oPitchTestUCapOrder;
		output__oPitchTestUCapOrder = newOutput__oPitchTestUCapOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_TEST_UCAP_ORDER, oldOutput__oPitchTestUCapOrder, output__oPitchTestUCapOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction getErrorReaction__erEmergency() {
		if (errorReaction__erEmergency != null && errorReaction__erEmergency.eIsProxy()) {
			InternalEObject oldErrorReaction__erEmergency = (InternalEObject)errorReaction__erEmergency;
			errorReaction__erEmergency = (WTCErrorReaction)eResolveProxy(oldErrorReaction__erEmergency);
			if (errorReaction__erEmergency != oldErrorReaction__erEmergency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT86__ERROR_REACTION_ER_EMERGENCY, oldErrorReaction__erEmergency, errorReaction__erEmergency));
			}
		}
		return errorReaction__erEmergency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction basicGetErrorReaction__erEmergency() {
		return errorReaction__erEmergency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorReaction__erEmergency(WTCErrorReaction newErrorReaction__erEmergency) {
		WTCErrorReaction oldErrorReaction__erEmergency = errorReaction__erEmergency;
		errorReaction__erEmergency = newErrorReaction__erEmergency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT86__ERROR_REACTION_ER_EMERGENCY, oldErrorReaction__erEmergency, errorReaction__erEmergency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction getErrorReaction__erSecurityLine() {
		if (errorReaction__erSecurityLine != null && errorReaction__erSecurityLine.eIsProxy()) {
			InternalEObject oldErrorReaction__erSecurityLine = (InternalEObject)errorReaction__erSecurityLine;
			errorReaction__erSecurityLine = (WTCErrorReaction)eResolveProxy(oldErrorReaction__erSecurityLine);
			if (errorReaction__erSecurityLine != oldErrorReaction__erSecurityLine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT86__ERROR_REACTION_ER_SECURITY_LINE, oldErrorReaction__erSecurityLine, errorReaction__erSecurityLine));
			}
		}
		return errorReaction__erSecurityLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction basicGetErrorReaction__erSecurityLine() {
		return errorReaction__erSecurityLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorReaction__erSecurityLine(WTCErrorReaction newErrorReaction__erSecurityLine) {
		WTCErrorReaction oldErrorReaction__erSecurityLine = errorReaction__erSecurityLine;
		errorReaction__erSecurityLine = newErrorReaction__erSecurityLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT86__ERROR_REACTION_ER_SECURITY_LINE, oldErrorReaction__erSecurityLine, errorReaction__erSecurityLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_HW_STANDBY:
				if (resolve) return getInput__iPitchHwStandby();
				return basicGetInput__iPitchHwStandby();
			case WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_HW_FAULT:
				if (resolve) return getInput__iPitchHwFault();
				return basicGetInput__iPitchHwFault();
			case WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_STOP_COMMAND:
				if (resolve) return getInput__iPitchStopCommand();
				return basicGetInput__iPitchStopCommand();
			case WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_BRAKE_POSITION:
				if (resolve) return getInput__iPitchBrakePosition();
				return basicGetInput__iPitchBrakePosition();
			case WTSpecPackage.CTRL_UNIT86__OUTPUT_OBRAKES:
				if (resolve) return getOutput__oBrakes();
				return basicGetOutput__oBrakes();
			case WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_NORMAL_ORDER:
				if (resolve) return getOutput__oPitchNormalOrder();
				return basicGetOutput__oPitchNormalOrder();
			case WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_EMERGENCY_ORDER:
				if (resolve) return getOutput__oPitchEmergencyOrder();
				return basicGetOutput__oPitchEmergencyOrder();
			case WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_TEST_UCAP_ORDER:
				if (resolve) return getOutput__oPitchTestUCapOrder();
				return basicGetOutput__oPitchTestUCapOrder();
			case WTSpecPackage.CTRL_UNIT86__ERROR_REACTION_ER_EMERGENCY:
				if (resolve) return getErrorReaction__erEmergency();
				return basicGetErrorReaction__erEmergency();
			case WTSpecPackage.CTRL_UNIT86__ERROR_REACTION_ER_SECURITY_LINE:
				if (resolve) return getErrorReaction__erSecurityLine();
				return basicGetErrorReaction__erSecurityLine();
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
			case WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_HW_STANDBY:
				setInput__iPitchHwStandby((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_HW_FAULT:
				setInput__iPitchHwFault((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_STOP_COMMAND:
				setInput__iPitchStopCommand((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_BRAKE_POSITION:
				setInput__iPitchBrakePosition((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT86__OUTPUT_OBRAKES:
				setOutput__oBrakes((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_NORMAL_ORDER:
				setOutput__oPitchNormalOrder((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_EMERGENCY_ORDER:
				setOutput__oPitchEmergencyOrder((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_TEST_UCAP_ORDER:
				setOutput__oPitchTestUCapOrder((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT86__ERROR_REACTION_ER_EMERGENCY:
				setErrorReaction__erEmergency((WTCErrorReaction)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT86__ERROR_REACTION_ER_SECURITY_LINE:
				setErrorReaction__erSecurityLine((WTCErrorReaction)newValue);
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
			case WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_HW_STANDBY:
				setInput__iPitchHwStandby((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_HW_FAULT:
				setInput__iPitchHwFault((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_STOP_COMMAND:
				setInput__iPitchStopCommand((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_BRAKE_POSITION:
				setInput__iPitchBrakePosition((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT86__OUTPUT_OBRAKES:
				setOutput__oBrakes((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_NORMAL_ORDER:
				setOutput__oPitchNormalOrder((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_EMERGENCY_ORDER:
				setOutput__oPitchEmergencyOrder((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_TEST_UCAP_ORDER:
				setOutput__oPitchTestUCapOrder((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT86__ERROR_REACTION_ER_EMERGENCY:
				setErrorReaction__erEmergency((WTCErrorReaction)null);
				return;
			case WTSpecPackage.CTRL_UNIT86__ERROR_REACTION_ER_SECURITY_LINE:
				setErrorReaction__erSecurityLine((WTCErrorReaction)null);
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
			case WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_HW_STANDBY:
				return input__iPitchHwStandby != null;
			case WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_HW_FAULT:
				return input__iPitchHwFault != null;
			case WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_STOP_COMMAND:
				return input__iPitchStopCommand != null;
			case WTSpecPackage.CTRL_UNIT86__INPUT_IPITCH_BRAKE_POSITION:
				return input__iPitchBrakePosition != null;
			case WTSpecPackage.CTRL_UNIT86__OUTPUT_OBRAKES:
				return output__oBrakes != null;
			case WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_NORMAL_ORDER:
				return output__oPitchNormalOrder != null;
			case WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_EMERGENCY_ORDER:
				return output__oPitchEmergencyOrder != null;
			case WTSpecPackage.CTRL_UNIT86__OUTPUT_OPITCH_TEST_UCAP_ORDER:
				return output__oPitchTestUCapOrder != null;
			case WTSpecPackage.CTRL_UNIT86__ERROR_REACTION_ER_EMERGENCY:
				return errorReaction__erEmergency != null;
			case WTSpecPackage.CTRL_UNIT86__ERROR_REACTION_ER_SECURITY_LINE:
				return errorReaction__erSecurityLine != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit86Impl
