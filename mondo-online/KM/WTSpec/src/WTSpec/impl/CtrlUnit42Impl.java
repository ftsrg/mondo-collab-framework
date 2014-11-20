/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit42;
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
 * An implementation of the model object '<em><b>Ctrl Unit42</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit42Impl#getInput__iInput <em>Input iInput</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit42Impl#getInput__iDontCheckInput <em>Input iDont Check Input</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit42Impl#getOutput__oActive <em>Output oActive</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit42Impl#getOutput__oPulsing <em>Output oPulsing</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit42Impl#getTimer__tDelay <em>Timer tDelay</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit42Impl#getTimer__tActive <em>Timer tActive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit42Impl extends wtcImpl implements CtrlUnit42 {
	/**
	 * The cached value of the '{@link #getInput__iInput() <em>Input iInput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInput()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInput;

	/**
	 * The cached value of the '{@link #getInput__iDontCheckInput() <em>Input iDont Check Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iDontCheckInput()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iDontCheckInput;

	/**
	 * The cached value of the '{@link #getOutput__oActive() <em>Output oActive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oActive()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oActive;

	/**
	 * The cached value of the '{@link #getOutput__oPulsing() <em>Output oPulsing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPulsing()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPulsing;

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
	 * The cached value of the '{@link #getTimer__tActive() <em>Timer tActive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tActive()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tActive;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit42Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit42();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInput() {
		if (input__iInput != null && input__iInput.eIsProxy()) {
			InternalEObject oldInput__iInput = (InternalEObject)input__iInput;
			input__iInput = (WTCInput)eResolveProxy(oldInput__iInput);
			if (input__iInput != oldInput__iInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT42__INPUT_IINPUT, oldInput__iInput, input__iInput));
			}
		}
		return input__iInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInput() {
		return input__iInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInput(WTCInput newInput__iInput) {
		WTCInput oldInput__iInput = input__iInput;
		input__iInput = newInput__iInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT42__INPUT_IINPUT, oldInput__iInput, input__iInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iDontCheckInput() {
		if (input__iDontCheckInput != null && input__iDontCheckInput.eIsProxy()) {
			InternalEObject oldInput__iDontCheckInput = (InternalEObject)input__iDontCheckInput;
			input__iDontCheckInput = (WTCInput)eResolveProxy(oldInput__iDontCheckInput);
			if (input__iDontCheckInput != oldInput__iDontCheckInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT42__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
			}
		}
		return input__iDontCheckInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iDontCheckInput() {
		return input__iDontCheckInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iDontCheckInput(WTCInput newInput__iDontCheckInput) {
		WTCInput oldInput__iDontCheckInput = input__iDontCheckInput;
		input__iDontCheckInput = newInput__iDontCheckInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT42__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oActive() {
		if (output__oActive != null && output__oActive.eIsProxy()) {
			InternalEObject oldOutput__oActive = (InternalEObject)output__oActive;
			output__oActive = (WTCOutput)eResolveProxy(oldOutput__oActive);
			if (output__oActive != oldOutput__oActive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT42__OUTPUT_OACTIVE, oldOutput__oActive, output__oActive));
			}
		}
		return output__oActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oActive() {
		return output__oActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oActive(WTCOutput newOutput__oActive) {
		WTCOutput oldOutput__oActive = output__oActive;
		output__oActive = newOutput__oActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT42__OUTPUT_OACTIVE, oldOutput__oActive, output__oActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPulsing() {
		if (output__oPulsing != null && output__oPulsing.eIsProxy()) {
			InternalEObject oldOutput__oPulsing = (InternalEObject)output__oPulsing;
			output__oPulsing = (WTCOutput)eResolveProxy(oldOutput__oPulsing);
			if (output__oPulsing != oldOutput__oPulsing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT42__OUTPUT_OPULSING, oldOutput__oPulsing, output__oPulsing));
			}
		}
		return output__oPulsing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPulsing() {
		return output__oPulsing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPulsing(WTCOutput newOutput__oPulsing) {
		WTCOutput oldOutput__oPulsing = output__oPulsing;
		output__oPulsing = newOutput__oPulsing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT42__OUTPUT_OPULSING, oldOutput__oPulsing, output__oPulsing));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT42__TIMER_TDELAY, oldTimer__tDelay, timer__tDelay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT42__TIMER_TDELAY, oldTimer__tDelay, timer__tDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tActive() {
		if (timer__tActive != null && timer__tActive.eIsProxy()) {
			InternalEObject oldTimer__tActive = (InternalEObject)timer__tActive;
			timer__tActive = (WTCTimer)eResolveProxy(oldTimer__tActive);
			if (timer__tActive != oldTimer__tActive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT42__TIMER_TACTIVE, oldTimer__tActive, timer__tActive));
			}
		}
		return timer__tActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tActive() {
		return timer__tActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tActive(WTCTimer newTimer__tActive) {
		WTCTimer oldTimer__tActive = timer__tActive;
		timer__tActive = newTimer__tActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT42__TIMER_TACTIVE, oldTimer__tActive, timer__tActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT42__INPUT_IINPUT:
				if (resolve) return getInput__iInput();
				return basicGetInput__iInput();
			case WTSpecPackage.CTRL_UNIT42__INPUT_IDONT_CHECK_INPUT:
				if (resolve) return getInput__iDontCheckInput();
				return basicGetInput__iDontCheckInput();
			case WTSpecPackage.CTRL_UNIT42__OUTPUT_OACTIVE:
				if (resolve) return getOutput__oActive();
				return basicGetOutput__oActive();
			case WTSpecPackage.CTRL_UNIT42__OUTPUT_OPULSING:
				if (resolve) return getOutput__oPulsing();
				return basicGetOutput__oPulsing();
			case WTSpecPackage.CTRL_UNIT42__TIMER_TDELAY:
				if (resolve) return getTimer__tDelay();
				return basicGetTimer__tDelay();
			case WTSpecPackage.CTRL_UNIT42__TIMER_TACTIVE:
				if (resolve) return getTimer__tActive();
				return basicGetTimer__tActive();
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
			case WTSpecPackage.CTRL_UNIT42__INPUT_IINPUT:
				setInput__iInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT42__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT42__OUTPUT_OACTIVE:
				setOutput__oActive((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT42__OUTPUT_OPULSING:
				setOutput__oPulsing((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT42__TIMER_TDELAY:
				setTimer__tDelay((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT42__TIMER_TACTIVE:
				setTimer__tActive((WTCTimer)newValue);
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
			case WTSpecPackage.CTRL_UNIT42__INPUT_IINPUT:
				setInput__iInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT42__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT42__OUTPUT_OACTIVE:
				setOutput__oActive((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT42__OUTPUT_OPULSING:
				setOutput__oPulsing((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT42__TIMER_TDELAY:
				setTimer__tDelay((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT42__TIMER_TACTIVE:
				setTimer__tActive((WTCTimer)null);
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
			case WTSpecPackage.CTRL_UNIT42__INPUT_IINPUT:
				return input__iInput != null;
			case WTSpecPackage.CTRL_UNIT42__INPUT_IDONT_CHECK_INPUT:
				return input__iDontCheckInput != null;
			case WTSpecPackage.CTRL_UNIT42__OUTPUT_OACTIVE:
				return output__oActive != null;
			case WTSpecPackage.CTRL_UNIT42__OUTPUT_OPULSING:
				return output__oPulsing != null;
			case WTSpecPackage.CTRL_UNIT42__TIMER_TDELAY:
				return timer__tDelay != null;
			case WTSpecPackage.CTRL_UNIT42__TIMER_TACTIVE:
				return timer__tActive != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit42Impl
