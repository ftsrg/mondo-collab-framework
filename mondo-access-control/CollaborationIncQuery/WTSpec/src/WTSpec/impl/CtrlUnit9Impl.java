/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit9;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTCParam;
import WTSpec.WTCTimer;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit9</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit9Impl#getInput__iValueToCheck <em>Input iValue To Check</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit9Impl#getInput__iDontCheckInput <em>Input iDont Check Input</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit9Impl#getInput__iLimitValue <em>Input iLimit Value</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit9Impl#getInput__iLimitReset <em>Input iLimit Reset</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit9Impl#getOutput__oLimitReached <em>Output oLimit Reached</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit9Impl#getParameter__pLimitValue <em>Parameter pLimit Value</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit9Impl#getParameter__pLimitReset <em>Parameter pLimit Reset</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit9Impl#getTimer__tDelay <em>Timer tDelay</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit9Impl#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit9Impl#getBhvParam__bpLimitsType <em>Bhv Param bp Limits Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit9Impl extends wtcImpl implements CtrlUnit9 {
	/**
	 * The cached value of the '{@link #getInput__iValueToCheck() <em>Input iValue To Check</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iValueToCheck()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iValueToCheck;

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
	 * The cached value of the '{@link #getInput__iLimitValue() <em>Input iLimit Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iLimitValue()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iLimitValue;

	/**
	 * The cached value of the '{@link #getInput__iLimitReset() <em>Input iLimit Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iLimitReset()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iLimitReset;

	/**
	 * The cached value of the '{@link #getOutput__oLimitReached() <em>Output oLimit Reached</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oLimitReached()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oLimitReached;

	/**
	 * The cached value of the '{@link #getParameter__pLimitValue() <em>Parameter pLimit Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pLimitValue()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pLimitValue;

	/**
	 * The cached value of the '{@link #getParameter__pLimitReset() <em>Parameter pLimit Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pLimitReset()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pLimitReset;

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
	 * The default value of the '{@link #getBhvParam__bpMode() <em>Bhv Param bp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpMode()
	 * @generated
	 * @ordered
	 */
	protected static final String BHV_PARAM_BP_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBhvParam__bpMode() <em>Bhv Param bp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpMode()
	 * @generated
	 * @ordered
	 */
	protected String bhvParam__bpMode = BHV_PARAM_BP_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBhvParam__bpLimitsType() <em>Bhv Param bp Limits Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpLimitsType()
	 * @generated
	 * @ordered
	 */
	protected static final String BHV_PARAM_BP_LIMITS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBhvParam__bpLimitsType() <em>Bhv Param bp Limits Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpLimitsType()
	 * @generated
	 * @ordered
	 */
	protected String bhvParam__bpLimitsType = BHV_PARAM_BP_LIMITS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit9Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iValueToCheck() {
		if (input__iValueToCheck != null && input__iValueToCheck.eIsProxy()) {
			InternalEObject oldInput__iValueToCheck = (InternalEObject)input__iValueToCheck;
			input__iValueToCheck = (WTCInput)eResolveProxy(oldInput__iValueToCheck);
			if (input__iValueToCheck != oldInput__iValueToCheck) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT9__INPUT_IVALUE_TO_CHECK, oldInput__iValueToCheck, input__iValueToCheck));
			}
		}
		return input__iValueToCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iValueToCheck() {
		return input__iValueToCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iValueToCheck(WTCInput newInput__iValueToCheck) {
		WTCInput oldInput__iValueToCheck = input__iValueToCheck;
		input__iValueToCheck = newInput__iValueToCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT9__INPUT_IVALUE_TO_CHECK, oldInput__iValueToCheck, input__iValueToCheck));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT9__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT9__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iLimitValue() {
		if (input__iLimitValue != null && input__iLimitValue.eIsProxy()) {
			InternalEObject oldInput__iLimitValue = (InternalEObject)input__iLimitValue;
			input__iLimitValue = (WTCInput)eResolveProxy(oldInput__iLimitValue);
			if (input__iLimitValue != oldInput__iLimitValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT9__INPUT_ILIMIT_VALUE, oldInput__iLimitValue, input__iLimitValue));
			}
		}
		return input__iLimitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iLimitValue() {
		return input__iLimitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iLimitValue(WTCInput newInput__iLimitValue) {
		WTCInput oldInput__iLimitValue = input__iLimitValue;
		input__iLimitValue = newInput__iLimitValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT9__INPUT_ILIMIT_VALUE, oldInput__iLimitValue, input__iLimitValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iLimitReset() {
		if (input__iLimitReset != null && input__iLimitReset.eIsProxy()) {
			InternalEObject oldInput__iLimitReset = (InternalEObject)input__iLimitReset;
			input__iLimitReset = (WTCInput)eResolveProxy(oldInput__iLimitReset);
			if (input__iLimitReset != oldInput__iLimitReset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT9__INPUT_ILIMIT_RESET, oldInput__iLimitReset, input__iLimitReset));
			}
		}
		return input__iLimitReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iLimitReset() {
		return input__iLimitReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iLimitReset(WTCInput newInput__iLimitReset) {
		WTCInput oldInput__iLimitReset = input__iLimitReset;
		input__iLimitReset = newInput__iLimitReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT9__INPUT_ILIMIT_RESET, oldInput__iLimitReset, input__iLimitReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oLimitReached() {
		if (output__oLimitReached != null && output__oLimitReached.eIsProxy()) {
			InternalEObject oldOutput__oLimitReached = (InternalEObject)output__oLimitReached;
			output__oLimitReached = (WTCOutput)eResolveProxy(oldOutput__oLimitReached);
			if (output__oLimitReached != oldOutput__oLimitReached) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT9__OUTPUT_OLIMIT_REACHED, oldOutput__oLimitReached, output__oLimitReached));
			}
		}
		return output__oLimitReached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oLimitReached() {
		return output__oLimitReached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oLimitReached(WTCOutput newOutput__oLimitReached) {
		WTCOutput oldOutput__oLimitReached = output__oLimitReached;
		output__oLimitReached = newOutput__oLimitReached;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT9__OUTPUT_OLIMIT_REACHED, oldOutput__oLimitReached, output__oLimitReached));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pLimitValue() {
		if (parameter__pLimitValue != null && parameter__pLimitValue.eIsProxy()) {
			InternalEObject oldParameter__pLimitValue = (InternalEObject)parameter__pLimitValue;
			parameter__pLimitValue = (WTCParam)eResolveProxy(oldParameter__pLimitValue);
			if (parameter__pLimitValue != oldParameter__pLimitValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT9__PARAMETER_PLIMIT_VALUE, oldParameter__pLimitValue, parameter__pLimitValue));
			}
		}
		return parameter__pLimitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pLimitValue() {
		return parameter__pLimitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pLimitValue(WTCParam newParameter__pLimitValue) {
		WTCParam oldParameter__pLimitValue = parameter__pLimitValue;
		parameter__pLimitValue = newParameter__pLimitValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT9__PARAMETER_PLIMIT_VALUE, oldParameter__pLimitValue, parameter__pLimitValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pLimitReset() {
		if (parameter__pLimitReset != null && parameter__pLimitReset.eIsProxy()) {
			InternalEObject oldParameter__pLimitReset = (InternalEObject)parameter__pLimitReset;
			parameter__pLimitReset = (WTCParam)eResolveProxy(oldParameter__pLimitReset);
			if (parameter__pLimitReset != oldParameter__pLimitReset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT9__PARAMETER_PLIMIT_RESET, oldParameter__pLimitReset, parameter__pLimitReset));
			}
		}
		return parameter__pLimitReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pLimitReset() {
		return parameter__pLimitReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pLimitReset(WTCParam newParameter__pLimitReset) {
		WTCParam oldParameter__pLimitReset = parameter__pLimitReset;
		parameter__pLimitReset = newParameter__pLimitReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT9__PARAMETER_PLIMIT_RESET, oldParameter__pLimitReset, parameter__pLimitReset));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT9__TIMER_TDELAY, oldTimer__tDelay, timer__tDelay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT9__TIMER_TDELAY, oldTimer__tDelay, timer__tDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBhvParam__bpMode() {
		return bhvParam__bpMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBhvParam__bpMode(String newBhvParam__bpMode) {
		String oldBhvParam__bpMode = bhvParam__bpMode;
		bhvParam__bpMode = newBhvParam__bpMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT9__BHV_PARAM_BP_MODE, oldBhvParam__bpMode, bhvParam__bpMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBhvParam__bpLimitsType() {
		return bhvParam__bpLimitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBhvParam__bpLimitsType(String newBhvParam__bpLimitsType) {
		String oldBhvParam__bpLimitsType = bhvParam__bpLimitsType;
		bhvParam__bpLimitsType = newBhvParam__bpLimitsType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT9__BHV_PARAM_BP_LIMITS_TYPE, oldBhvParam__bpLimitsType, bhvParam__bpLimitsType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT9__INPUT_IVALUE_TO_CHECK:
				if (resolve) return getInput__iValueToCheck();
				return basicGetInput__iValueToCheck();
			case WTSpecPackage.CTRL_UNIT9__INPUT_IDONT_CHECK_INPUT:
				if (resolve) return getInput__iDontCheckInput();
				return basicGetInput__iDontCheckInput();
			case WTSpecPackage.CTRL_UNIT9__INPUT_ILIMIT_VALUE:
				if (resolve) return getInput__iLimitValue();
				return basicGetInput__iLimitValue();
			case WTSpecPackage.CTRL_UNIT9__INPUT_ILIMIT_RESET:
				if (resolve) return getInput__iLimitReset();
				return basicGetInput__iLimitReset();
			case WTSpecPackage.CTRL_UNIT9__OUTPUT_OLIMIT_REACHED:
				if (resolve) return getOutput__oLimitReached();
				return basicGetOutput__oLimitReached();
			case WTSpecPackage.CTRL_UNIT9__PARAMETER_PLIMIT_VALUE:
				if (resolve) return getParameter__pLimitValue();
				return basicGetParameter__pLimitValue();
			case WTSpecPackage.CTRL_UNIT9__PARAMETER_PLIMIT_RESET:
				if (resolve) return getParameter__pLimitReset();
				return basicGetParameter__pLimitReset();
			case WTSpecPackage.CTRL_UNIT9__TIMER_TDELAY:
				if (resolve) return getTimer__tDelay();
				return basicGetTimer__tDelay();
			case WTSpecPackage.CTRL_UNIT9__BHV_PARAM_BP_MODE:
				return getBhvParam__bpMode();
			case WTSpecPackage.CTRL_UNIT9__BHV_PARAM_BP_LIMITS_TYPE:
				return getBhvParam__bpLimitsType();
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
			case WTSpecPackage.CTRL_UNIT9__INPUT_IVALUE_TO_CHECK:
				setInput__iValueToCheck((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT9__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT9__INPUT_ILIMIT_VALUE:
				setInput__iLimitValue((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT9__INPUT_ILIMIT_RESET:
				setInput__iLimitReset((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT9__OUTPUT_OLIMIT_REACHED:
				setOutput__oLimitReached((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT9__PARAMETER_PLIMIT_VALUE:
				setParameter__pLimitValue((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT9__PARAMETER_PLIMIT_RESET:
				setParameter__pLimitReset((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT9__TIMER_TDELAY:
				setTimer__tDelay((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT9__BHV_PARAM_BP_MODE:
				setBhvParam__bpMode((String)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT9__BHV_PARAM_BP_LIMITS_TYPE:
				setBhvParam__bpLimitsType((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT9__INPUT_IVALUE_TO_CHECK:
				setInput__iValueToCheck((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT9__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT9__INPUT_ILIMIT_VALUE:
				setInput__iLimitValue((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT9__INPUT_ILIMIT_RESET:
				setInput__iLimitReset((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT9__OUTPUT_OLIMIT_REACHED:
				setOutput__oLimitReached((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT9__PARAMETER_PLIMIT_VALUE:
				setParameter__pLimitValue((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT9__PARAMETER_PLIMIT_RESET:
				setParameter__pLimitReset((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT9__TIMER_TDELAY:
				setTimer__tDelay((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT9__BHV_PARAM_BP_MODE:
				setBhvParam__bpMode(BHV_PARAM_BP_MODE_EDEFAULT);
				return;
			case WTSpecPackage.CTRL_UNIT9__BHV_PARAM_BP_LIMITS_TYPE:
				setBhvParam__bpLimitsType(BHV_PARAM_BP_LIMITS_TYPE_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT9__INPUT_IVALUE_TO_CHECK:
				return input__iValueToCheck != null;
			case WTSpecPackage.CTRL_UNIT9__INPUT_IDONT_CHECK_INPUT:
				return input__iDontCheckInput != null;
			case WTSpecPackage.CTRL_UNIT9__INPUT_ILIMIT_VALUE:
				return input__iLimitValue != null;
			case WTSpecPackage.CTRL_UNIT9__INPUT_ILIMIT_RESET:
				return input__iLimitReset != null;
			case WTSpecPackage.CTRL_UNIT9__OUTPUT_OLIMIT_REACHED:
				return output__oLimitReached != null;
			case WTSpecPackage.CTRL_UNIT9__PARAMETER_PLIMIT_VALUE:
				return parameter__pLimitValue != null;
			case WTSpecPackage.CTRL_UNIT9__PARAMETER_PLIMIT_RESET:
				return parameter__pLimitReset != null;
			case WTSpecPackage.CTRL_UNIT9__TIMER_TDELAY:
				return timer__tDelay != null;
			case WTSpecPackage.CTRL_UNIT9__BHV_PARAM_BP_MODE:
				return BHV_PARAM_BP_MODE_EDEFAULT == null ? bhvParam__bpMode != null : !BHV_PARAM_BP_MODE_EDEFAULT.equals(bhvParam__bpMode);
			case WTSpecPackage.CTRL_UNIT9__BHV_PARAM_BP_LIMITS_TYPE:
				return BHV_PARAM_BP_LIMITS_TYPE_EDEFAULT == null ? bhvParam__bpLimitsType != null : !BHV_PARAM_BP_LIMITS_TYPE_EDEFAULT.equals(bhvParam__bpLimitsType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (BhvParam__bpMode: ");
		result.append(bhvParam__bpMode);
		result.append(", BhvParam__bpLimitsType: ");
		result.append(bhvParam__bpLimitsType);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit9Impl
