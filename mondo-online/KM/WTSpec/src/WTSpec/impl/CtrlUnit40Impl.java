/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit40;
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
 * An implementation of the model object '<em><b>Ctrl Unit40</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit40Impl#getInput__iOrder <em>Input iOrder</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit40Impl#getOutput__oOutput <em>Output oOutput</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit40Impl#getTimer__tTimer <em>Timer tTimer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit40Impl extends wtcImpl implements CtrlUnit40 {
	/**
	 * The cached value of the '{@link #getInput__iOrder() <em>Input iOrder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iOrder;

	/**
	 * The cached value of the '{@link #getOutput__oOutput() <em>Output oOutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOutput()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOutput;

	/**
	 * The cached value of the '{@link #getTimer__tTimer() <em>Timer tTimer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tTimer()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tTimer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit40Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit40();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iOrder() {
		if (input__iOrder != null && input__iOrder.eIsProxy()) {
			InternalEObject oldInput__iOrder = (InternalEObject)input__iOrder;
			input__iOrder = (WTCInput)eResolveProxy(oldInput__iOrder);
			if (input__iOrder != oldInput__iOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT40__INPUT_IORDER, oldInput__iOrder, input__iOrder));
			}
		}
		return input__iOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iOrder() {
		return input__iOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iOrder(WTCInput newInput__iOrder) {
		WTCInput oldInput__iOrder = input__iOrder;
		input__iOrder = newInput__iOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT40__INPUT_IORDER, oldInput__iOrder, input__iOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOutput() {
		if (output__oOutput != null && output__oOutput.eIsProxy()) {
			InternalEObject oldOutput__oOutput = (InternalEObject)output__oOutput;
			output__oOutput = (WTCOutput)eResolveProxy(oldOutput__oOutput);
			if (output__oOutput != oldOutput__oOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT40__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
			}
		}
		return output__oOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOutput() {
		return output__oOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOutput(WTCOutput newOutput__oOutput) {
		WTCOutput oldOutput__oOutput = output__oOutput;
		output__oOutput = newOutput__oOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT40__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tTimer() {
		if (timer__tTimer != null && timer__tTimer.eIsProxy()) {
			InternalEObject oldTimer__tTimer = (InternalEObject)timer__tTimer;
			timer__tTimer = (WTCTimer)eResolveProxy(oldTimer__tTimer);
			if (timer__tTimer != oldTimer__tTimer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT40__TIMER_TTIMER, oldTimer__tTimer, timer__tTimer));
			}
		}
		return timer__tTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tTimer() {
		return timer__tTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tTimer(WTCTimer newTimer__tTimer) {
		WTCTimer oldTimer__tTimer = timer__tTimer;
		timer__tTimer = newTimer__tTimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT40__TIMER_TTIMER, oldTimer__tTimer, timer__tTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT40__INPUT_IORDER:
				if (resolve) return getInput__iOrder();
				return basicGetInput__iOrder();
			case WTSpecPackage.CTRL_UNIT40__OUTPUT_OOUTPUT:
				if (resolve) return getOutput__oOutput();
				return basicGetOutput__oOutput();
			case WTSpecPackage.CTRL_UNIT40__TIMER_TTIMER:
				if (resolve) return getTimer__tTimer();
				return basicGetTimer__tTimer();
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
			case WTSpecPackage.CTRL_UNIT40__INPUT_IORDER:
				setInput__iOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT40__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT40__TIMER_TTIMER:
				setTimer__tTimer((WTCTimer)newValue);
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
			case WTSpecPackage.CTRL_UNIT40__INPUT_IORDER:
				setInput__iOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT40__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT40__TIMER_TTIMER:
				setTimer__tTimer((WTCTimer)null);
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
			case WTSpecPackage.CTRL_UNIT40__INPUT_IORDER:
				return input__iOrder != null;
			case WTSpecPackage.CTRL_UNIT40__OUTPUT_OOUTPUT:
				return output__oOutput != null;
			case WTSpecPackage.CTRL_UNIT40__TIMER_TTIMER:
				return timer__tTimer != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit40Impl
