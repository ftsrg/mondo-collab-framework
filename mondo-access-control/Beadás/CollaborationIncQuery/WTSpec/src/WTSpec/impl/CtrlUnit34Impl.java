/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit34;
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
 * An implementation of the model object '<em><b>Ctrl Unit34</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit34Impl#getInput__iInput <em>Input iInput</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit34Impl#getInput__iFeedback <em>Input iFeedback</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit34Impl#getOutput__oFaultOn <em>Output oFault On</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit34Impl#getOutput__oFaultOff <em>Output oFault Off</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit34Impl#getTimer__tDelayOn <em>Timer tDelay On</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit34Impl#getTimer__tDelayOff <em>Timer tDelay Off</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit34Impl#getBhvParam__bpLogicType <em>Bhv Param bp Logic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit34Impl extends wtcImpl implements CtrlUnit34 {
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
	 * The cached value of the '{@link #getInput__iFeedback() <em>Input iFeedback</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iFeedback()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iFeedback;

	/**
	 * The cached value of the '{@link #getOutput__oFaultOn() <em>Output oFault On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oFaultOn()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oFaultOn;

	/**
	 * The cached value of the '{@link #getOutput__oFaultOff() <em>Output oFault Off</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oFaultOff()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oFaultOff;

	/**
	 * The cached value of the '{@link #getTimer__tDelayOn() <em>Timer tDelay On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tDelayOn()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tDelayOn;

	/**
	 * The cached value of the '{@link #getTimer__tDelayOff() <em>Timer tDelay Off</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tDelayOff()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tDelayOff;

	/**
	 * The default value of the '{@link #getBhvParam__bpLogicType() <em>Bhv Param bp Logic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpLogicType()
	 * @generated
	 * @ordered
	 */
	protected static final String BHV_PARAM_BP_LOGIC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBhvParam__bpLogicType() <em>Bhv Param bp Logic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpLogicType()
	 * @generated
	 * @ordered
	 */
	protected String bhvParam__bpLogicType = BHV_PARAM_BP_LOGIC_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit34Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT34;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT34__INPUT_IINPUT, oldInput__iInput, input__iInput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT34__INPUT_IINPUT, oldInput__iInput, input__iInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iFeedback() {
		if (input__iFeedback != null && input__iFeedback.eIsProxy()) {
			InternalEObject oldInput__iFeedback = (InternalEObject)input__iFeedback;
			input__iFeedback = (WTCInput)eResolveProxy(oldInput__iFeedback);
			if (input__iFeedback != oldInput__iFeedback) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT34__INPUT_IFEEDBACK, oldInput__iFeedback, input__iFeedback));
			}
		}
		return input__iFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iFeedback() {
		return input__iFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iFeedback(WTCInput newInput__iFeedback) {
		WTCInput oldInput__iFeedback = input__iFeedback;
		input__iFeedback = newInput__iFeedback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT34__INPUT_IFEEDBACK, oldInput__iFeedback, input__iFeedback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oFaultOn() {
		if (output__oFaultOn != null && output__oFaultOn.eIsProxy()) {
			InternalEObject oldOutput__oFaultOn = (InternalEObject)output__oFaultOn;
			output__oFaultOn = (WTCOutput)eResolveProxy(oldOutput__oFaultOn);
			if (output__oFaultOn != oldOutput__oFaultOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT34__OUTPUT_OFAULT_ON, oldOutput__oFaultOn, output__oFaultOn));
			}
		}
		return output__oFaultOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oFaultOn() {
		return output__oFaultOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oFaultOn(WTCOutput newOutput__oFaultOn) {
		WTCOutput oldOutput__oFaultOn = output__oFaultOn;
		output__oFaultOn = newOutput__oFaultOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT34__OUTPUT_OFAULT_ON, oldOutput__oFaultOn, output__oFaultOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oFaultOff() {
		if (output__oFaultOff != null && output__oFaultOff.eIsProxy()) {
			InternalEObject oldOutput__oFaultOff = (InternalEObject)output__oFaultOff;
			output__oFaultOff = (WTCOutput)eResolveProxy(oldOutput__oFaultOff);
			if (output__oFaultOff != oldOutput__oFaultOff) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT34__OUTPUT_OFAULT_OFF, oldOutput__oFaultOff, output__oFaultOff));
			}
		}
		return output__oFaultOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oFaultOff() {
		return output__oFaultOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oFaultOff(WTCOutput newOutput__oFaultOff) {
		WTCOutput oldOutput__oFaultOff = output__oFaultOff;
		output__oFaultOff = newOutput__oFaultOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT34__OUTPUT_OFAULT_OFF, oldOutput__oFaultOff, output__oFaultOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tDelayOn() {
		if (timer__tDelayOn != null && timer__tDelayOn.eIsProxy()) {
			InternalEObject oldTimer__tDelayOn = (InternalEObject)timer__tDelayOn;
			timer__tDelayOn = (WTCTimer)eResolveProxy(oldTimer__tDelayOn);
			if (timer__tDelayOn != oldTimer__tDelayOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT34__TIMER_TDELAY_ON, oldTimer__tDelayOn, timer__tDelayOn));
			}
		}
		return timer__tDelayOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tDelayOn() {
		return timer__tDelayOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tDelayOn(WTCTimer newTimer__tDelayOn) {
		WTCTimer oldTimer__tDelayOn = timer__tDelayOn;
		timer__tDelayOn = newTimer__tDelayOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT34__TIMER_TDELAY_ON, oldTimer__tDelayOn, timer__tDelayOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tDelayOff() {
		if (timer__tDelayOff != null && timer__tDelayOff.eIsProxy()) {
			InternalEObject oldTimer__tDelayOff = (InternalEObject)timer__tDelayOff;
			timer__tDelayOff = (WTCTimer)eResolveProxy(oldTimer__tDelayOff);
			if (timer__tDelayOff != oldTimer__tDelayOff) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT34__TIMER_TDELAY_OFF, oldTimer__tDelayOff, timer__tDelayOff));
			}
		}
		return timer__tDelayOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tDelayOff() {
		return timer__tDelayOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tDelayOff(WTCTimer newTimer__tDelayOff) {
		WTCTimer oldTimer__tDelayOff = timer__tDelayOff;
		timer__tDelayOff = newTimer__tDelayOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT34__TIMER_TDELAY_OFF, oldTimer__tDelayOff, timer__tDelayOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBhvParam__bpLogicType() {
		return bhvParam__bpLogicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBhvParam__bpLogicType(String newBhvParam__bpLogicType) {
		String oldBhvParam__bpLogicType = bhvParam__bpLogicType;
		bhvParam__bpLogicType = newBhvParam__bpLogicType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT34__BHV_PARAM_BP_LOGIC_TYPE, oldBhvParam__bpLogicType, bhvParam__bpLogicType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT34__INPUT_IINPUT:
				if (resolve) return getInput__iInput();
				return basicGetInput__iInput();
			case WTSpecPackage.CTRL_UNIT34__INPUT_IFEEDBACK:
				if (resolve) return getInput__iFeedback();
				return basicGetInput__iFeedback();
			case WTSpecPackage.CTRL_UNIT34__OUTPUT_OFAULT_ON:
				if (resolve) return getOutput__oFaultOn();
				return basicGetOutput__oFaultOn();
			case WTSpecPackage.CTRL_UNIT34__OUTPUT_OFAULT_OFF:
				if (resolve) return getOutput__oFaultOff();
				return basicGetOutput__oFaultOff();
			case WTSpecPackage.CTRL_UNIT34__TIMER_TDELAY_ON:
				if (resolve) return getTimer__tDelayOn();
				return basicGetTimer__tDelayOn();
			case WTSpecPackage.CTRL_UNIT34__TIMER_TDELAY_OFF:
				if (resolve) return getTimer__tDelayOff();
				return basicGetTimer__tDelayOff();
			case WTSpecPackage.CTRL_UNIT34__BHV_PARAM_BP_LOGIC_TYPE:
				return getBhvParam__bpLogicType();
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
			case WTSpecPackage.CTRL_UNIT34__INPUT_IINPUT:
				setInput__iInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT34__INPUT_IFEEDBACK:
				setInput__iFeedback((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT34__OUTPUT_OFAULT_ON:
				setOutput__oFaultOn((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT34__OUTPUT_OFAULT_OFF:
				setOutput__oFaultOff((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT34__TIMER_TDELAY_ON:
				setTimer__tDelayOn((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT34__TIMER_TDELAY_OFF:
				setTimer__tDelayOff((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT34__BHV_PARAM_BP_LOGIC_TYPE:
				setBhvParam__bpLogicType((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT34__INPUT_IINPUT:
				setInput__iInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT34__INPUT_IFEEDBACK:
				setInput__iFeedback((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT34__OUTPUT_OFAULT_ON:
				setOutput__oFaultOn((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT34__OUTPUT_OFAULT_OFF:
				setOutput__oFaultOff((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT34__TIMER_TDELAY_ON:
				setTimer__tDelayOn((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT34__TIMER_TDELAY_OFF:
				setTimer__tDelayOff((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT34__BHV_PARAM_BP_LOGIC_TYPE:
				setBhvParam__bpLogicType(BHV_PARAM_BP_LOGIC_TYPE_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT34__INPUT_IINPUT:
				return input__iInput != null;
			case WTSpecPackage.CTRL_UNIT34__INPUT_IFEEDBACK:
				return input__iFeedback != null;
			case WTSpecPackage.CTRL_UNIT34__OUTPUT_OFAULT_ON:
				return output__oFaultOn != null;
			case WTSpecPackage.CTRL_UNIT34__OUTPUT_OFAULT_OFF:
				return output__oFaultOff != null;
			case WTSpecPackage.CTRL_UNIT34__TIMER_TDELAY_ON:
				return timer__tDelayOn != null;
			case WTSpecPackage.CTRL_UNIT34__TIMER_TDELAY_OFF:
				return timer__tDelayOff != null;
			case WTSpecPackage.CTRL_UNIT34__BHV_PARAM_BP_LOGIC_TYPE:
				return BHV_PARAM_BP_LOGIC_TYPE_EDEFAULT == null ? bhvParam__bpLogicType != null : !BHV_PARAM_BP_LOGIC_TYPE_EDEFAULT.equals(bhvParam__bpLogicType);
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
		result.append(" (BhvParam__bpLogicType: ");
		result.append(bhvParam__bpLogicType);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit34Impl
