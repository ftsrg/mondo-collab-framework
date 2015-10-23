/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit35;
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
 * An implementation of the model object '<em><b>Ctrl Unit35</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit35Impl#getInput__iFeedback <em>Input iFeedback</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit35Impl#getOutput__oOutput <em>Output oOutput</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit35Impl#getFault__fFaultOn <em>Fault fFault On</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit35Impl#getFault__fFaultOff <em>Fault fFault Off</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit35Impl#getTimer__tDelayOn <em>Timer tDelay On</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit35Impl#getTimer__tDelayOff <em>Timer tDelay Off</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit35Impl#getBhvParam__bpLogicType <em>Bhv Param bp Logic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit35Impl extends wtcImpl implements CtrlUnit35 {
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
	 * The cached value of the '{@link #getOutput__oOutput() <em>Output oOutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOutput()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOutput;

	/**
	 * The cached value of the '{@link #getFault__fFaultOn() <em>Fault fFault On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fFaultOn()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fFaultOn;

	/**
	 * The cached value of the '{@link #getFault__fFaultOff() <em>Fault fFault Off</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fFaultOff()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fFaultOff;

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
	protected CtrlUnit35Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT35;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT35__INPUT_IFEEDBACK, oldInput__iFeedback, input__iFeedback));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT35__INPUT_IFEEDBACK, oldInput__iFeedback, input__iFeedback));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT35__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT35__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fFaultOn() {
		if (fault__fFaultOn != null && fault__fFaultOn.eIsProxy()) {
			InternalEObject oldFault__fFaultOn = (InternalEObject)fault__fFaultOn;
			fault__fFaultOn = (WTCFault)eResolveProxy(oldFault__fFaultOn);
			if (fault__fFaultOn != oldFault__fFaultOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT35__FAULT_FFAULT_ON, oldFault__fFaultOn, fault__fFaultOn));
			}
		}
		return fault__fFaultOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fFaultOn() {
		return fault__fFaultOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fFaultOn(WTCFault newFault__fFaultOn) {
		WTCFault oldFault__fFaultOn = fault__fFaultOn;
		fault__fFaultOn = newFault__fFaultOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT35__FAULT_FFAULT_ON, oldFault__fFaultOn, fault__fFaultOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fFaultOff() {
		if (fault__fFaultOff != null && fault__fFaultOff.eIsProxy()) {
			InternalEObject oldFault__fFaultOff = (InternalEObject)fault__fFaultOff;
			fault__fFaultOff = (WTCFault)eResolveProxy(oldFault__fFaultOff);
			if (fault__fFaultOff != oldFault__fFaultOff) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT35__FAULT_FFAULT_OFF, oldFault__fFaultOff, fault__fFaultOff));
			}
		}
		return fault__fFaultOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fFaultOff() {
		return fault__fFaultOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fFaultOff(WTCFault newFault__fFaultOff) {
		WTCFault oldFault__fFaultOff = fault__fFaultOff;
		fault__fFaultOff = newFault__fFaultOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT35__FAULT_FFAULT_OFF, oldFault__fFaultOff, fault__fFaultOff));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT35__TIMER_TDELAY_ON, oldTimer__tDelayOn, timer__tDelayOn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT35__TIMER_TDELAY_ON, oldTimer__tDelayOn, timer__tDelayOn));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT35__TIMER_TDELAY_OFF, oldTimer__tDelayOff, timer__tDelayOff));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT35__TIMER_TDELAY_OFF, oldTimer__tDelayOff, timer__tDelayOff));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT35__BHV_PARAM_BP_LOGIC_TYPE, oldBhvParam__bpLogicType, bhvParam__bpLogicType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT35__INPUT_IFEEDBACK:
				if (resolve) return getInput__iFeedback();
				return basicGetInput__iFeedback();
			case WTSpecPackage.CTRL_UNIT35__OUTPUT_OOUTPUT:
				if (resolve) return getOutput__oOutput();
				return basicGetOutput__oOutput();
			case WTSpecPackage.CTRL_UNIT35__FAULT_FFAULT_ON:
				if (resolve) return getFault__fFaultOn();
				return basicGetFault__fFaultOn();
			case WTSpecPackage.CTRL_UNIT35__FAULT_FFAULT_OFF:
				if (resolve) return getFault__fFaultOff();
				return basicGetFault__fFaultOff();
			case WTSpecPackage.CTRL_UNIT35__TIMER_TDELAY_ON:
				if (resolve) return getTimer__tDelayOn();
				return basicGetTimer__tDelayOn();
			case WTSpecPackage.CTRL_UNIT35__TIMER_TDELAY_OFF:
				if (resolve) return getTimer__tDelayOff();
				return basicGetTimer__tDelayOff();
			case WTSpecPackage.CTRL_UNIT35__BHV_PARAM_BP_LOGIC_TYPE:
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
			case WTSpecPackage.CTRL_UNIT35__INPUT_IFEEDBACK:
				setInput__iFeedback((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT35__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT35__FAULT_FFAULT_ON:
				setFault__fFaultOn((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT35__FAULT_FFAULT_OFF:
				setFault__fFaultOff((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT35__TIMER_TDELAY_ON:
				setTimer__tDelayOn((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT35__TIMER_TDELAY_OFF:
				setTimer__tDelayOff((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT35__BHV_PARAM_BP_LOGIC_TYPE:
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
			case WTSpecPackage.CTRL_UNIT35__INPUT_IFEEDBACK:
				setInput__iFeedback((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT35__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT35__FAULT_FFAULT_ON:
				setFault__fFaultOn((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT35__FAULT_FFAULT_OFF:
				setFault__fFaultOff((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT35__TIMER_TDELAY_ON:
				setTimer__tDelayOn((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT35__TIMER_TDELAY_OFF:
				setTimer__tDelayOff((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT35__BHV_PARAM_BP_LOGIC_TYPE:
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
			case WTSpecPackage.CTRL_UNIT35__INPUT_IFEEDBACK:
				return input__iFeedback != null;
			case WTSpecPackage.CTRL_UNIT35__OUTPUT_OOUTPUT:
				return output__oOutput != null;
			case WTSpecPackage.CTRL_UNIT35__FAULT_FFAULT_ON:
				return fault__fFaultOn != null;
			case WTSpecPackage.CTRL_UNIT35__FAULT_FFAULT_OFF:
				return fault__fFaultOff != null;
			case WTSpecPackage.CTRL_UNIT35__TIMER_TDELAY_ON:
				return timer__tDelayOn != null;
			case WTSpecPackage.CTRL_UNIT35__TIMER_TDELAY_OFF:
				return timer__tDelayOff != null;
			case WTSpecPackage.CTRL_UNIT35__BHV_PARAM_BP_LOGIC_TYPE:
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

} //CtrlUnit35Impl
