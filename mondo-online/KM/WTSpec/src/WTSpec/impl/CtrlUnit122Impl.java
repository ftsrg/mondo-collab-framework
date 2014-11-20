/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit122;
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
 * An implementation of the model object '<em><b>Ctrl Unit122</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit122Impl#getInput__iYawCommand <em>Input iYaw Command</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit122Impl#getInput__iYawBrakeStatus <em>Input iYaw Brake Status</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit122Impl#getInput__iInhibitYaw <em>Input iInhibit Yaw</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit122Impl#getOutput__oYawStatus <em>Output oYaw Status</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit122Impl#getOutput__oYawBrakeCommand <em>Output oYaw Brake Command</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit122Impl#getOutput__oYawCwOrder <em>Output oYaw Cw Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit122Impl#getOutput__oYawCcwOrder <em>Output oYaw Ccw Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit122Impl#getTimer__tDelayYawingControl <em>Timer tDelay Yawing Control</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit122Impl#getTimer__tDelayYawingToStop <em>Timer tDelay Yawing To Stop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit122Impl extends wtcImpl implements CtrlUnit122 {
	/**
	 * The cached value of the '{@link #getInput__iYawCommand() <em>Input iYaw Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iYawCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iYawCommand;

	/**
	 * The cached value of the '{@link #getInput__iYawBrakeStatus() <em>Input iYaw Brake Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iYawBrakeStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iYawBrakeStatus;

	/**
	 * The cached value of the '{@link #getInput__iInhibitYaw() <em>Input iInhibit Yaw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInhibitYaw()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInhibitYaw;

	/**
	 * The cached value of the '{@link #getOutput__oYawStatus() <em>Output oYaw Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oYawStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oYawStatus;

	/**
	 * The cached value of the '{@link #getOutput__oYawBrakeCommand() <em>Output oYaw Brake Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oYawBrakeCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oYawBrakeCommand;

	/**
	 * The cached value of the '{@link #getOutput__oYawCwOrder() <em>Output oYaw Cw Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oYawCwOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oYawCwOrder;

	/**
	 * The cached value of the '{@link #getOutput__oYawCcwOrder() <em>Output oYaw Ccw Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oYawCcwOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oYawCcwOrder;

	/**
	 * The cached value of the '{@link #getTimer__tDelayYawingControl() <em>Timer tDelay Yawing Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tDelayYawingControl()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tDelayYawingControl;

	/**
	 * The cached value of the '{@link #getTimer__tDelayYawingToStop() <em>Timer tDelay Yawing To Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tDelayYawingToStop()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tDelayYawingToStop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit122Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit122();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iYawCommand() {
		if (input__iYawCommand != null && input__iYawCommand.eIsProxy()) {
			InternalEObject oldInput__iYawCommand = (InternalEObject)input__iYawCommand;
			input__iYawCommand = (WTCInput)eResolveProxy(oldInput__iYawCommand);
			if (input__iYawCommand != oldInput__iYawCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT122__INPUT_IYAW_COMMAND, oldInput__iYawCommand, input__iYawCommand));
			}
		}
		return input__iYawCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iYawCommand() {
		return input__iYawCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iYawCommand(WTCInput newInput__iYawCommand) {
		WTCInput oldInput__iYawCommand = input__iYawCommand;
		input__iYawCommand = newInput__iYawCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT122__INPUT_IYAW_COMMAND, oldInput__iYawCommand, input__iYawCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iYawBrakeStatus() {
		if (input__iYawBrakeStatus != null && input__iYawBrakeStatus.eIsProxy()) {
			InternalEObject oldInput__iYawBrakeStatus = (InternalEObject)input__iYawBrakeStatus;
			input__iYawBrakeStatus = (WTCInput)eResolveProxy(oldInput__iYawBrakeStatus);
			if (input__iYawBrakeStatus != oldInput__iYawBrakeStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT122__INPUT_IYAW_BRAKE_STATUS, oldInput__iYawBrakeStatus, input__iYawBrakeStatus));
			}
		}
		return input__iYawBrakeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iYawBrakeStatus() {
		return input__iYawBrakeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iYawBrakeStatus(WTCInput newInput__iYawBrakeStatus) {
		WTCInput oldInput__iYawBrakeStatus = input__iYawBrakeStatus;
		input__iYawBrakeStatus = newInput__iYawBrakeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT122__INPUT_IYAW_BRAKE_STATUS, oldInput__iYawBrakeStatus, input__iYawBrakeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInhibitYaw() {
		if (input__iInhibitYaw != null && input__iInhibitYaw.eIsProxy()) {
			InternalEObject oldInput__iInhibitYaw = (InternalEObject)input__iInhibitYaw;
			input__iInhibitYaw = (WTCInput)eResolveProxy(oldInput__iInhibitYaw);
			if (input__iInhibitYaw != oldInput__iInhibitYaw) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT122__INPUT_IINHIBIT_YAW, oldInput__iInhibitYaw, input__iInhibitYaw));
			}
		}
		return input__iInhibitYaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInhibitYaw() {
		return input__iInhibitYaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInhibitYaw(WTCInput newInput__iInhibitYaw) {
		WTCInput oldInput__iInhibitYaw = input__iInhibitYaw;
		input__iInhibitYaw = newInput__iInhibitYaw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT122__INPUT_IINHIBIT_YAW, oldInput__iInhibitYaw, input__iInhibitYaw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oYawStatus() {
		if (output__oYawStatus != null && output__oYawStatus.eIsProxy()) {
			InternalEObject oldOutput__oYawStatus = (InternalEObject)output__oYawStatus;
			output__oYawStatus = (WTCOutput)eResolveProxy(oldOutput__oYawStatus);
			if (output__oYawStatus != oldOutput__oYawStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_STATUS, oldOutput__oYawStatus, output__oYawStatus));
			}
		}
		return output__oYawStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oYawStatus() {
		return output__oYawStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oYawStatus(WTCOutput newOutput__oYawStatus) {
		WTCOutput oldOutput__oYawStatus = output__oYawStatus;
		output__oYawStatus = newOutput__oYawStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_STATUS, oldOutput__oYawStatus, output__oYawStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oYawBrakeCommand() {
		if (output__oYawBrakeCommand != null && output__oYawBrakeCommand.eIsProxy()) {
			InternalEObject oldOutput__oYawBrakeCommand = (InternalEObject)output__oYawBrakeCommand;
			output__oYawBrakeCommand = (WTCOutput)eResolveProxy(oldOutput__oYawBrakeCommand);
			if (output__oYawBrakeCommand != oldOutput__oYawBrakeCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_BRAKE_COMMAND, oldOutput__oYawBrakeCommand, output__oYawBrakeCommand));
			}
		}
		return output__oYawBrakeCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oYawBrakeCommand() {
		return output__oYawBrakeCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oYawBrakeCommand(WTCOutput newOutput__oYawBrakeCommand) {
		WTCOutput oldOutput__oYawBrakeCommand = output__oYawBrakeCommand;
		output__oYawBrakeCommand = newOutput__oYawBrakeCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_BRAKE_COMMAND, oldOutput__oYawBrakeCommand, output__oYawBrakeCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oYawCwOrder() {
		if (output__oYawCwOrder != null && output__oYawCwOrder.eIsProxy()) {
			InternalEObject oldOutput__oYawCwOrder = (InternalEObject)output__oYawCwOrder;
			output__oYawCwOrder = (WTCOutput)eResolveProxy(oldOutput__oYawCwOrder);
			if (output__oYawCwOrder != oldOutput__oYawCwOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_CW_ORDER, oldOutput__oYawCwOrder, output__oYawCwOrder));
			}
		}
		return output__oYawCwOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oYawCwOrder() {
		return output__oYawCwOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oYawCwOrder(WTCOutput newOutput__oYawCwOrder) {
		WTCOutput oldOutput__oYawCwOrder = output__oYawCwOrder;
		output__oYawCwOrder = newOutput__oYawCwOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_CW_ORDER, oldOutput__oYawCwOrder, output__oYawCwOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oYawCcwOrder() {
		if (output__oYawCcwOrder != null && output__oYawCcwOrder.eIsProxy()) {
			InternalEObject oldOutput__oYawCcwOrder = (InternalEObject)output__oYawCcwOrder;
			output__oYawCcwOrder = (WTCOutput)eResolveProxy(oldOutput__oYawCcwOrder);
			if (output__oYawCcwOrder != oldOutput__oYawCcwOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_CCW_ORDER, oldOutput__oYawCcwOrder, output__oYawCcwOrder));
			}
		}
		return output__oYawCcwOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oYawCcwOrder() {
		return output__oYawCcwOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oYawCcwOrder(WTCOutput newOutput__oYawCcwOrder) {
		WTCOutput oldOutput__oYawCcwOrder = output__oYawCcwOrder;
		output__oYawCcwOrder = newOutput__oYawCcwOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_CCW_ORDER, oldOutput__oYawCcwOrder, output__oYawCcwOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tDelayYawingControl() {
		if (timer__tDelayYawingControl != null && timer__tDelayYawingControl.eIsProxy()) {
			InternalEObject oldTimer__tDelayYawingControl = (InternalEObject)timer__tDelayYawingControl;
			timer__tDelayYawingControl = (WTCTimer)eResolveProxy(oldTimer__tDelayYawingControl);
			if (timer__tDelayYawingControl != oldTimer__tDelayYawingControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT122__TIMER_TDELAY_YAWING_CONTROL, oldTimer__tDelayYawingControl, timer__tDelayYawingControl));
			}
		}
		return timer__tDelayYawingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tDelayYawingControl() {
		return timer__tDelayYawingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tDelayYawingControl(WTCTimer newTimer__tDelayYawingControl) {
		WTCTimer oldTimer__tDelayYawingControl = timer__tDelayYawingControl;
		timer__tDelayYawingControl = newTimer__tDelayYawingControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT122__TIMER_TDELAY_YAWING_CONTROL, oldTimer__tDelayYawingControl, timer__tDelayYawingControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tDelayYawingToStop() {
		if (timer__tDelayYawingToStop != null && timer__tDelayYawingToStop.eIsProxy()) {
			InternalEObject oldTimer__tDelayYawingToStop = (InternalEObject)timer__tDelayYawingToStop;
			timer__tDelayYawingToStop = (WTCTimer)eResolveProxy(oldTimer__tDelayYawingToStop);
			if (timer__tDelayYawingToStop != oldTimer__tDelayYawingToStop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT122__TIMER_TDELAY_YAWING_TO_STOP, oldTimer__tDelayYawingToStop, timer__tDelayYawingToStop));
			}
		}
		return timer__tDelayYawingToStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tDelayYawingToStop() {
		return timer__tDelayYawingToStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tDelayYawingToStop(WTCTimer newTimer__tDelayYawingToStop) {
		WTCTimer oldTimer__tDelayYawingToStop = timer__tDelayYawingToStop;
		timer__tDelayYawingToStop = newTimer__tDelayYawingToStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT122__TIMER_TDELAY_YAWING_TO_STOP, oldTimer__tDelayYawingToStop, timer__tDelayYawingToStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT122__INPUT_IYAW_COMMAND:
				if (resolve) return getInput__iYawCommand();
				return basicGetInput__iYawCommand();
			case WTSpecPackage.CTRL_UNIT122__INPUT_IYAW_BRAKE_STATUS:
				if (resolve) return getInput__iYawBrakeStatus();
				return basicGetInput__iYawBrakeStatus();
			case WTSpecPackage.CTRL_UNIT122__INPUT_IINHIBIT_YAW:
				if (resolve) return getInput__iInhibitYaw();
				return basicGetInput__iInhibitYaw();
			case WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_STATUS:
				if (resolve) return getOutput__oYawStatus();
				return basicGetOutput__oYawStatus();
			case WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_BRAKE_COMMAND:
				if (resolve) return getOutput__oYawBrakeCommand();
				return basicGetOutput__oYawBrakeCommand();
			case WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_CW_ORDER:
				if (resolve) return getOutput__oYawCwOrder();
				return basicGetOutput__oYawCwOrder();
			case WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_CCW_ORDER:
				if (resolve) return getOutput__oYawCcwOrder();
				return basicGetOutput__oYawCcwOrder();
			case WTSpecPackage.CTRL_UNIT122__TIMER_TDELAY_YAWING_CONTROL:
				if (resolve) return getTimer__tDelayYawingControl();
				return basicGetTimer__tDelayYawingControl();
			case WTSpecPackage.CTRL_UNIT122__TIMER_TDELAY_YAWING_TO_STOP:
				if (resolve) return getTimer__tDelayYawingToStop();
				return basicGetTimer__tDelayYawingToStop();
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
			case WTSpecPackage.CTRL_UNIT122__INPUT_IYAW_COMMAND:
				setInput__iYawCommand((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT122__INPUT_IYAW_BRAKE_STATUS:
				setInput__iYawBrakeStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT122__INPUT_IINHIBIT_YAW:
				setInput__iInhibitYaw((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_STATUS:
				setOutput__oYawStatus((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_BRAKE_COMMAND:
				setOutput__oYawBrakeCommand((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_CW_ORDER:
				setOutput__oYawCwOrder((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_CCW_ORDER:
				setOutput__oYawCcwOrder((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT122__TIMER_TDELAY_YAWING_CONTROL:
				setTimer__tDelayYawingControl((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT122__TIMER_TDELAY_YAWING_TO_STOP:
				setTimer__tDelayYawingToStop((WTCTimer)newValue);
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
			case WTSpecPackage.CTRL_UNIT122__INPUT_IYAW_COMMAND:
				setInput__iYawCommand((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT122__INPUT_IYAW_BRAKE_STATUS:
				setInput__iYawBrakeStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT122__INPUT_IINHIBIT_YAW:
				setInput__iInhibitYaw((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_STATUS:
				setOutput__oYawStatus((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_BRAKE_COMMAND:
				setOutput__oYawBrakeCommand((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_CW_ORDER:
				setOutput__oYawCwOrder((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_CCW_ORDER:
				setOutput__oYawCcwOrder((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT122__TIMER_TDELAY_YAWING_CONTROL:
				setTimer__tDelayYawingControl((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT122__TIMER_TDELAY_YAWING_TO_STOP:
				setTimer__tDelayYawingToStop((WTCTimer)null);
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
			case WTSpecPackage.CTRL_UNIT122__INPUT_IYAW_COMMAND:
				return input__iYawCommand != null;
			case WTSpecPackage.CTRL_UNIT122__INPUT_IYAW_BRAKE_STATUS:
				return input__iYawBrakeStatus != null;
			case WTSpecPackage.CTRL_UNIT122__INPUT_IINHIBIT_YAW:
				return input__iInhibitYaw != null;
			case WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_STATUS:
				return output__oYawStatus != null;
			case WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_BRAKE_COMMAND:
				return output__oYawBrakeCommand != null;
			case WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_CW_ORDER:
				return output__oYawCwOrder != null;
			case WTSpecPackage.CTRL_UNIT122__OUTPUT_OYAW_CCW_ORDER:
				return output__oYawCcwOrder != null;
			case WTSpecPackage.CTRL_UNIT122__TIMER_TDELAY_YAWING_CONTROL:
				return timer__tDelayYawingControl != null;
			case WTSpecPackage.CTRL_UNIT122__TIMER_TDELAY_YAWING_TO_STOP:
				return timer__tDelayYawingToStop != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit122Impl
