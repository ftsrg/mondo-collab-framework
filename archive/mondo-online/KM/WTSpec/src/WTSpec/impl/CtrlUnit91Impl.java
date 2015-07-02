/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit91;
import WTSpec.WTCFault;
import WTSpec.WTCInput;
import WTSpec.WTCParam;
import WTSpec.WTCTimer;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit91</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit91Impl#getInput__iTemp <em>Input iTemp</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit91Impl#getInput__iDontCheckInput <em>Input iDont Check Input</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit91Impl#getInput__iLimitError <em>Input iLimit Error</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit91Impl#getParameter__pLimitReset <em>Parameter pLimit Reset</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit91Impl#getFault__fError <em>Fault fError</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit91Impl#getTimer__tDelay <em>Timer tDelay</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit91Impl#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit91Impl extends wtcImpl implements CtrlUnit91 {
	/**
	 * The cached value of the '{@link #getInput__iTemp() <em>Input iTemp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iTemp()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iTemp;

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
	 * The cached value of the '{@link #getInput__iLimitError() <em>Input iLimit Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iLimitError()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iLimitError;

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
	 * The cached value of the '{@link #getFault__fError() <em>Fault fError</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fError()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fError;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit91Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit91();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iTemp() {
		if (input__iTemp != null && input__iTemp.eIsProxy()) {
			InternalEObject oldInput__iTemp = (InternalEObject)input__iTemp;
			input__iTemp = (WTCInput)eResolveProxy(oldInput__iTemp);
			if (input__iTemp != oldInput__iTemp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT91__INPUT_ITEMP, oldInput__iTemp, input__iTemp));
			}
		}
		return input__iTemp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iTemp() {
		return input__iTemp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iTemp(WTCInput newInput__iTemp) {
		WTCInput oldInput__iTemp = input__iTemp;
		input__iTemp = newInput__iTemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT91__INPUT_ITEMP, oldInput__iTemp, input__iTemp));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT91__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT91__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iLimitError() {
		if (input__iLimitError != null && input__iLimitError.eIsProxy()) {
			InternalEObject oldInput__iLimitError = (InternalEObject)input__iLimitError;
			input__iLimitError = (WTCInput)eResolveProxy(oldInput__iLimitError);
			if (input__iLimitError != oldInput__iLimitError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT91__INPUT_ILIMIT_ERROR, oldInput__iLimitError, input__iLimitError));
			}
		}
		return input__iLimitError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iLimitError() {
		return input__iLimitError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iLimitError(WTCInput newInput__iLimitError) {
		WTCInput oldInput__iLimitError = input__iLimitError;
		input__iLimitError = newInput__iLimitError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT91__INPUT_ILIMIT_ERROR, oldInput__iLimitError, input__iLimitError));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT91__PARAMETER_PLIMIT_RESET, oldParameter__pLimitReset, parameter__pLimitReset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT91__PARAMETER_PLIMIT_RESET, oldParameter__pLimitReset, parameter__pLimitReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fError() {
		if (fault__fError != null && fault__fError.eIsProxy()) {
			InternalEObject oldFault__fError = (InternalEObject)fault__fError;
			fault__fError = (WTCFault)eResolveProxy(oldFault__fError);
			if (fault__fError != oldFault__fError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT91__FAULT_FERROR, oldFault__fError, fault__fError));
			}
		}
		return fault__fError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fError() {
		return fault__fError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fError(WTCFault newFault__fError) {
		WTCFault oldFault__fError = fault__fError;
		fault__fError = newFault__fError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT91__FAULT_FERROR, oldFault__fError, fault__fError));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT91__TIMER_TDELAY, oldTimer__tDelay, timer__tDelay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT91__TIMER_TDELAY, oldTimer__tDelay, timer__tDelay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT91__BHV_PARAM_BP_MODE, oldBhvParam__bpMode, bhvParam__bpMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT91__INPUT_ITEMP:
				if (resolve) return getInput__iTemp();
				return basicGetInput__iTemp();
			case WTSpecPackage.CTRL_UNIT91__INPUT_IDONT_CHECK_INPUT:
				if (resolve) return getInput__iDontCheckInput();
				return basicGetInput__iDontCheckInput();
			case WTSpecPackage.CTRL_UNIT91__INPUT_ILIMIT_ERROR:
				if (resolve) return getInput__iLimitError();
				return basicGetInput__iLimitError();
			case WTSpecPackage.CTRL_UNIT91__PARAMETER_PLIMIT_RESET:
				if (resolve) return getParameter__pLimitReset();
				return basicGetParameter__pLimitReset();
			case WTSpecPackage.CTRL_UNIT91__FAULT_FERROR:
				if (resolve) return getFault__fError();
				return basicGetFault__fError();
			case WTSpecPackage.CTRL_UNIT91__TIMER_TDELAY:
				if (resolve) return getTimer__tDelay();
				return basicGetTimer__tDelay();
			case WTSpecPackage.CTRL_UNIT91__BHV_PARAM_BP_MODE:
				return getBhvParam__bpMode();
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
			case WTSpecPackage.CTRL_UNIT91__INPUT_ITEMP:
				setInput__iTemp((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT91__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT91__INPUT_ILIMIT_ERROR:
				setInput__iLimitError((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT91__PARAMETER_PLIMIT_RESET:
				setParameter__pLimitReset((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT91__FAULT_FERROR:
				setFault__fError((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT91__TIMER_TDELAY:
				setTimer__tDelay((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT91__BHV_PARAM_BP_MODE:
				setBhvParam__bpMode((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT91__INPUT_ITEMP:
				setInput__iTemp((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT91__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT91__INPUT_ILIMIT_ERROR:
				setInput__iLimitError((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT91__PARAMETER_PLIMIT_RESET:
				setParameter__pLimitReset((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT91__FAULT_FERROR:
				setFault__fError((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT91__TIMER_TDELAY:
				setTimer__tDelay((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT91__BHV_PARAM_BP_MODE:
				setBhvParam__bpMode(BHV_PARAM_BP_MODE_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT91__INPUT_ITEMP:
				return input__iTemp != null;
			case WTSpecPackage.CTRL_UNIT91__INPUT_IDONT_CHECK_INPUT:
				return input__iDontCheckInput != null;
			case WTSpecPackage.CTRL_UNIT91__INPUT_ILIMIT_ERROR:
				return input__iLimitError != null;
			case WTSpecPackage.CTRL_UNIT91__PARAMETER_PLIMIT_RESET:
				return parameter__pLimitReset != null;
			case WTSpecPackage.CTRL_UNIT91__FAULT_FERROR:
				return fault__fError != null;
			case WTSpecPackage.CTRL_UNIT91__TIMER_TDELAY:
				return timer__tDelay != null;
			case WTSpecPackage.CTRL_UNIT91__BHV_PARAM_BP_MODE:
				return BHV_PARAM_BP_MODE_EDEFAULT == null ? bhvParam__bpMode != null : !BHV_PARAM_BP_MODE_EDEFAULT.equals(bhvParam__bpMode);
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
		result.append(')');
		return result.toString();
	}

} //CtrlUnit91Impl
