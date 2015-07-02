/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit88;
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
 * An implementation of the model object '<em><b>Ctrl Unit88</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit88Impl#getInput__iPthResetCommand <em>Input iPth Reset Command</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit88Impl#getInput__iPthResetOrder <em>Input iPth Reset Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit88Impl#getOutput__oPthResetCommand <em>Output oPth Reset Command</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit88Impl#getOutput__oPthResetOrder <em>Output oPth Reset Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit88Impl#getOutput__oPthReset <em>Output oPth Reset</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit88Impl#getTimer__tResetTimer <em>Timer tReset Timer</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit88Impl#getTimer__tTimeBetweenResets <em>Timer tTime Between Resets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit88Impl extends wtcImpl implements CtrlUnit88 {
	/**
	 * The cached value of the '{@link #getInput__iPthResetCommand() <em>Input iPth Reset Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPthResetCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPthResetCommand;

	/**
	 * The cached value of the '{@link #getInput__iPthResetOrder() <em>Input iPth Reset Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPthResetOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPthResetOrder;

	/**
	 * The cached value of the '{@link #getOutput__oPthResetCommand() <em>Output oPth Reset Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPthResetCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPthResetCommand;

	/**
	 * The cached value of the '{@link #getOutput__oPthResetOrder() <em>Output oPth Reset Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPthResetOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPthResetOrder;

	/**
	 * The cached value of the '{@link #getOutput__oPthReset() <em>Output oPth Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPthReset()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPthReset;

	/**
	 * The cached value of the '{@link #getTimer__tResetTimer() <em>Timer tReset Timer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tResetTimer()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tResetTimer;

	/**
	 * The cached value of the '{@link #getTimer__tTimeBetweenResets() <em>Timer tTime Between Resets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tTimeBetweenResets()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tTimeBetweenResets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit88Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit88();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPthResetCommand() {
		if (input__iPthResetCommand != null && input__iPthResetCommand.eIsProxy()) {
			InternalEObject oldInput__iPthResetCommand = (InternalEObject)input__iPthResetCommand;
			input__iPthResetCommand = (WTCInput)eResolveProxy(oldInput__iPthResetCommand);
			if (input__iPthResetCommand != oldInput__iPthResetCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT88__INPUT_IPTH_RESET_COMMAND, oldInput__iPthResetCommand, input__iPthResetCommand));
			}
		}
		return input__iPthResetCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPthResetCommand() {
		return input__iPthResetCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPthResetCommand(WTCInput newInput__iPthResetCommand) {
		WTCInput oldInput__iPthResetCommand = input__iPthResetCommand;
		input__iPthResetCommand = newInput__iPthResetCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT88__INPUT_IPTH_RESET_COMMAND, oldInput__iPthResetCommand, input__iPthResetCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPthResetOrder() {
		if (input__iPthResetOrder != null && input__iPthResetOrder.eIsProxy()) {
			InternalEObject oldInput__iPthResetOrder = (InternalEObject)input__iPthResetOrder;
			input__iPthResetOrder = (WTCInput)eResolveProxy(oldInput__iPthResetOrder);
			if (input__iPthResetOrder != oldInput__iPthResetOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT88__INPUT_IPTH_RESET_ORDER, oldInput__iPthResetOrder, input__iPthResetOrder));
			}
		}
		return input__iPthResetOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPthResetOrder() {
		return input__iPthResetOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPthResetOrder(WTCInput newInput__iPthResetOrder) {
		WTCInput oldInput__iPthResetOrder = input__iPthResetOrder;
		input__iPthResetOrder = newInput__iPthResetOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT88__INPUT_IPTH_RESET_ORDER, oldInput__iPthResetOrder, input__iPthResetOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPthResetCommand() {
		if (output__oPthResetCommand != null && output__oPthResetCommand.eIsProxy()) {
			InternalEObject oldOutput__oPthResetCommand = (InternalEObject)output__oPthResetCommand;
			output__oPthResetCommand = (WTCOutput)eResolveProxy(oldOutput__oPthResetCommand);
			if (output__oPthResetCommand != oldOutput__oPthResetCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET_COMMAND, oldOutput__oPthResetCommand, output__oPthResetCommand));
			}
		}
		return output__oPthResetCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPthResetCommand() {
		return output__oPthResetCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPthResetCommand(WTCOutput newOutput__oPthResetCommand) {
		WTCOutput oldOutput__oPthResetCommand = output__oPthResetCommand;
		output__oPthResetCommand = newOutput__oPthResetCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET_COMMAND, oldOutput__oPthResetCommand, output__oPthResetCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPthResetOrder() {
		if (output__oPthResetOrder != null && output__oPthResetOrder.eIsProxy()) {
			InternalEObject oldOutput__oPthResetOrder = (InternalEObject)output__oPthResetOrder;
			output__oPthResetOrder = (WTCOutput)eResolveProxy(oldOutput__oPthResetOrder);
			if (output__oPthResetOrder != oldOutput__oPthResetOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET_ORDER, oldOutput__oPthResetOrder, output__oPthResetOrder));
			}
		}
		return output__oPthResetOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPthResetOrder() {
		return output__oPthResetOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPthResetOrder(WTCOutput newOutput__oPthResetOrder) {
		WTCOutput oldOutput__oPthResetOrder = output__oPthResetOrder;
		output__oPthResetOrder = newOutput__oPthResetOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET_ORDER, oldOutput__oPthResetOrder, output__oPthResetOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPthReset() {
		if (output__oPthReset != null && output__oPthReset.eIsProxy()) {
			InternalEObject oldOutput__oPthReset = (InternalEObject)output__oPthReset;
			output__oPthReset = (WTCOutput)eResolveProxy(oldOutput__oPthReset);
			if (output__oPthReset != oldOutput__oPthReset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET, oldOutput__oPthReset, output__oPthReset));
			}
		}
		return output__oPthReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPthReset() {
		return output__oPthReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPthReset(WTCOutput newOutput__oPthReset) {
		WTCOutput oldOutput__oPthReset = output__oPthReset;
		output__oPthReset = newOutput__oPthReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET, oldOutput__oPthReset, output__oPthReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tResetTimer() {
		if (timer__tResetTimer != null && timer__tResetTimer.eIsProxy()) {
			InternalEObject oldTimer__tResetTimer = (InternalEObject)timer__tResetTimer;
			timer__tResetTimer = (WTCTimer)eResolveProxy(oldTimer__tResetTimer);
			if (timer__tResetTimer != oldTimer__tResetTimer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT88__TIMER_TRESET_TIMER, oldTimer__tResetTimer, timer__tResetTimer));
			}
		}
		return timer__tResetTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tResetTimer() {
		return timer__tResetTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tResetTimer(WTCTimer newTimer__tResetTimer) {
		WTCTimer oldTimer__tResetTimer = timer__tResetTimer;
		timer__tResetTimer = newTimer__tResetTimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT88__TIMER_TRESET_TIMER, oldTimer__tResetTimer, timer__tResetTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tTimeBetweenResets() {
		if (timer__tTimeBetweenResets != null && timer__tTimeBetweenResets.eIsProxy()) {
			InternalEObject oldTimer__tTimeBetweenResets = (InternalEObject)timer__tTimeBetweenResets;
			timer__tTimeBetweenResets = (WTCTimer)eResolveProxy(oldTimer__tTimeBetweenResets);
			if (timer__tTimeBetweenResets != oldTimer__tTimeBetweenResets) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT88__TIMER_TTIME_BETWEEN_RESETS, oldTimer__tTimeBetweenResets, timer__tTimeBetweenResets));
			}
		}
		return timer__tTimeBetweenResets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tTimeBetweenResets() {
		return timer__tTimeBetweenResets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tTimeBetweenResets(WTCTimer newTimer__tTimeBetweenResets) {
		WTCTimer oldTimer__tTimeBetweenResets = timer__tTimeBetweenResets;
		timer__tTimeBetweenResets = newTimer__tTimeBetweenResets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT88__TIMER_TTIME_BETWEEN_RESETS, oldTimer__tTimeBetweenResets, timer__tTimeBetweenResets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT88__INPUT_IPTH_RESET_COMMAND:
				if (resolve) return getInput__iPthResetCommand();
				return basicGetInput__iPthResetCommand();
			case WTSpecPackage.CTRL_UNIT88__INPUT_IPTH_RESET_ORDER:
				if (resolve) return getInput__iPthResetOrder();
				return basicGetInput__iPthResetOrder();
			case WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET_COMMAND:
				if (resolve) return getOutput__oPthResetCommand();
				return basicGetOutput__oPthResetCommand();
			case WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET_ORDER:
				if (resolve) return getOutput__oPthResetOrder();
				return basicGetOutput__oPthResetOrder();
			case WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET:
				if (resolve) return getOutput__oPthReset();
				return basicGetOutput__oPthReset();
			case WTSpecPackage.CTRL_UNIT88__TIMER_TRESET_TIMER:
				if (resolve) return getTimer__tResetTimer();
				return basicGetTimer__tResetTimer();
			case WTSpecPackage.CTRL_UNIT88__TIMER_TTIME_BETWEEN_RESETS:
				if (resolve) return getTimer__tTimeBetweenResets();
				return basicGetTimer__tTimeBetweenResets();
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
			case WTSpecPackage.CTRL_UNIT88__INPUT_IPTH_RESET_COMMAND:
				setInput__iPthResetCommand((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT88__INPUT_IPTH_RESET_ORDER:
				setInput__iPthResetOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET_COMMAND:
				setOutput__oPthResetCommand((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET_ORDER:
				setOutput__oPthResetOrder((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET:
				setOutput__oPthReset((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT88__TIMER_TRESET_TIMER:
				setTimer__tResetTimer((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT88__TIMER_TTIME_BETWEEN_RESETS:
				setTimer__tTimeBetweenResets((WTCTimer)newValue);
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
			case WTSpecPackage.CTRL_UNIT88__INPUT_IPTH_RESET_COMMAND:
				setInput__iPthResetCommand((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT88__INPUT_IPTH_RESET_ORDER:
				setInput__iPthResetOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET_COMMAND:
				setOutput__oPthResetCommand((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET_ORDER:
				setOutput__oPthResetOrder((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET:
				setOutput__oPthReset((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT88__TIMER_TRESET_TIMER:
				setTimer__tResetTimer((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT88__TIMER_TTIME_BETWEEN_RESETS:
				setTimer__tTimeBetweenResets((WTCTimer)null);
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
			case WTSpecPackage.CTRL_UNIT88__INPUT_IPTH_RESET_COMMAND:
				return input__iPthResetCommand != null;
			case WTSpecPackage.CTRL_UNIT88__INPUT_IPTH_RESET_ORDER:
				return input__iPthResetOrder != null;
			case WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET_COMMAND:
				return output__oPthResetCommand != null;
			case WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET_ORDER:
				return output__oPthResetOrder != null;
			case WTSpecPackage.CTRL_UNIT88__OUTPUT_OPTH_RESET:
				return output__oPthReset != null;
			case WTSpecPackage.CTRL_UNIT88__TIMER_TRESET_TIMER:
				return timer__tResetTimer != null;
			case WTSpecPackage.CTRL_UNIT88__TIMER_TTIME_BETWEEN_RESETS:
				return timer__tTimeBetweenResets != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit88Impl
