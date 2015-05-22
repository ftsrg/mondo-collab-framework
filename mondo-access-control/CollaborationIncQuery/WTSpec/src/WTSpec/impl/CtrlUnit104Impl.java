/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit104;
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
 * An implementation of the model object '<em><b>Ctrl Unit104</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit104Impl#getInput__iOrder <em>Input iOrder</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit104Impl#getOutput__oOrder <em>Output oOrder</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit104Impl#getTimer__tTimer <em>Timer tTimer</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit104Impl#getTimer__tDelay <em>Timer tDelay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit104Impl extends wtcImpl implements CtrlUnit104 {
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
	 * The cached value of the '{@link #getOutput__oOrder() <em>Output oOrder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOrder;

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
	 * The cached value of the '{@link #getTimer__tDelay() <em>Timer tDelay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tDelay()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tDelay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit104Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT104;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT104__INPUT_IORDER, oldInput__iOrder, input__iOrder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT104__INPUT_IORDER, oldInput__iOrder, input__iOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOrder() {
		if (output__oOrder != null && output__oOrder.eIsProxy()) {
			InternalEObject oldOutput__oOrder = (InternalEObject)output__oOrder;
			output__oOrder = (WTCOutput)eResolveProxy(oldOutput__oOrder);
			if (output__oOrder != oldOutput__oOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT104__OUTPUT_OORDER, oldOutput__oOrder, output__oOrder));
			}
		}
		return output__oOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOrder() {
		return output__oOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOrder(WTCOutput newOutput__oOrder) {
		WTCOutput oldOutput__oOrder = output__oOrder;
		output__oOrder = newOutput__oOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT104__OUTPUT_OORDER, oldOutput__oOrder, output__oOrder));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT104__TIMER_TTIMER, oldTimer__tTimer, timer__tTimer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT104__TIMER_TTIMER, oldTimer__tTimer, timer__tTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tDelay() {
		if (timer__tDelay != null && timer__tDelay.eIsProxy()) {
			InternalEObject oldTimer__tDelay = (InternalEObject)timer__tDelay;
			timer__tDelay = (WTCTimer)eResolveProxy(oldTimer__tDelay);
			if (timer__tDelay != oldTimer__tDelay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT104__TIMER_TDELAY, oldTimer__tDelay, timer__tDelay));
			}
		}
		return timer__tDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tDelay() {
		return timer__tDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tDelay(WTCTimer newTimer__tDelay) {
		WTCTimer oldTimer__tDelay = timer__tDelay;
		timer__tDelay = newTimer__tDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT104__TIMER_TDELAY, oldTimer__tDelay, timer__tDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT104__INPUT_IORDER:
				if (resolve) return getInput__iOrder();
				return basicGetInput__iOrder();
			case WTSpecPackage.CTRL_UNIT104__OUTPUT_OORDER:
				if (resolve) return getOutput__oOrder();
				return basicGetOutput__oOrder();
			case WTSpecPackage.CTRL_UNIT104__TIMER_TTIMER:
				if (resolve) return getTimer__tTimer();
				return basicGetTimer__tTimer();
			case WTSpecPackage.CTRL_UNIT104__TIMER_TDELAY:
				if (resolve) return getTimer__tDelay();
				return basicGetTimer__tDelay();
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
			case WTSpecPackage.CTRL_UNIT104__INPUT_IORDER:
				setInput__iOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT104__OUTPUT_OORDER:
				setOutput__oOrder((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT104__TIMER_TTIMER:
				setTimer__tTimer((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT104__TIMER_TDELAY:
				setTimer__tDelay((WTCTimer)newValue);
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
			case WTSpecPackage.CTRL_UNIT104__INPUT_IORDER:
				setInput__iOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT104__OUTPUT_OORDER:
				setOutput__oOrder((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT104__TIMER_TTIMER:
				setTimer__tTimer((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT104__TIMER_TDELAY:
				setTimer__tDelay((WTCTimer)null);
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
			case WTSpecPackage.CTRL_UNIT104__INPUT_IORDER:
				return input__iOrder != null;
			case WTSpecPackage.CTRL_UNIT104__OUTPUT_OORDER:
				return output__oOrder != null;
			case WTSpecPackage.CTRL_UNIT104__TIMER_TTIMER:
				return timer__tTimer != null;
			case WTSpecPackage.CTRL_UNIT104__TIMER_TDELAY:
				return timer__tDelay != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit104Impl
