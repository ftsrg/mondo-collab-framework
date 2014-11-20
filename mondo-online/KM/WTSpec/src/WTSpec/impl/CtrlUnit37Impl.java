/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit37;
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
 * An implementation of the model object '<em><b>Ctrl Unit37</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit37Impl#getInput__iInput <em>Input iInput</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit37Impl#getInput__iBadInputQuality <em>Input iBad Input Quality</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit37Impl#getInput__iDontCheckInput <em>Input iDont Check Input</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit37Impl#getOutput__oSendReset <em>Output oSend Reset</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit37Impl#getFault__fFault <em>Fault fFault</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit37Impl#getTimer__tCheckInputDelay <em>Timer tCheck Input Delay</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit37Impl#getBhvParam__bpLogicType <em>Bhv Param bp Logic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit37Impl extends wtcImpl implements CtrlUnit37 {
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
	 * The cached value of the '{@link #getInput__iBadInputQuality() <em>Input iBad Input Quality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iBadInputQuality()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iBadInputQuality;

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
	 * The cached value of the '{@link #getOutput__oSendReset() <em>Output oSend Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oSendReset()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oSendReset;

	/**
	 * The cached value of the '{@link #getFault__fFault() <em>Fault fFault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fFault()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fFault;

	/**
	 * The cached value of the '{@link #getTimer__tCheckInputDelay() <em>Timer tCheck Input Delay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tCheckInputDelay()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tCheckInputDelay;

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
	protected CtrlUnit37Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit37();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT37__INPUT_IINPUT, oldInput__iInput, input__iInput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT37__INPUT_IINPUT, oldInput__iInput, input__iInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iBadInputQuality() {
		if (input__iBadInputQuality != null && input__iBadInputQuality.eIsProxy()) {
			InternalEObject oldInput__iBadInputQuality = (InternalEObject)input__iBadInputQuality;
			input__iBadInputQuality = (WTCInput)eResolveProxy(oldInput__iBadInputQuality);
			if (input__iBadInputQuality != oldInput__iBadInputQuality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT37__INPUT_IBAD_INPUT_QUALITY, oldInput__iBadInputQuality, input__iBadInputQuality));
			}
		}
		return input__iBadInputQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iBadInputQuality() {
		return input__iBadInputQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iBadInputQuality(WTCInput newInput__iBadInputQuality) {
		WTCInput oldInput__iBadInputQuality = input__iBadInputQuality;
		input__iBadInputQuality = newInput__iBadInputQuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT37__INPUT_IBAD_INPUT_QUALITY, oldInput__iBadInputQuality, input__iBadInputQuality));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT37__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT37__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oSendReset() {
		if (output__oSendReset != null && output__oSendReset.eIsProxy()) {
			InternalEObject oldOutput__oSendReset = (InternalEObject)output__oSendReset;
			output__oSendReset = (WTCOutput)eResolveProxy(oldOutput__oSendReset);
			if (output__oSendReset != oldOutput__oSendReset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT37__OUTPUT_OSEND_RESET, oldOutput__oSendReset, output__oSendReset));
			}
		}
		return output__oSendReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oSendReset() {
		return output__oSendReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oSendReset(WTCOutput newOutput__oSendReset) {
		WTCOutput oldOutput__oSendReset = output__oSendReset;
		output__oSendReset = newOutput__oSendReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT37__OUTPUT_OSEND_RESET, oldOutput__oSendReset, output__oSendReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fFault() {
		if (fault__fFault != null && fault__fFault.eIsProxy()) {
			InternalEObject oldFault__fFault = (InternalEObject)fault__fFault;
			fault__fFault = (WTCFault)eResolveProxy(oldFault__fFault);
			if (fault__fFault != oldFault__fFault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT37__FAULT_FFAULT, oldFault__fFault, fault__fFault));
			}
		}
		return fault__fFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fFault() {
		return fault__fFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fFault(WTCFault newFault__fFault) {
		WTCFault oldFault__fFault = fault__fFault;
		fault__fFault = newFault__fFault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT37__FAULT_FFAULT, oldFault__fFault, fault__fFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tCheckInputDelay() {
		if (timer__tCheckInputDelay != null && timer__tCheckInputDelay.eIsProxy()) {
			InternalEObject oldTimer__tCheckInputDelay = (InternalEObject)timer__tCheckInputDelay;
			timer__tCheckInputDelay = (WTCTimer)eResolveProxy(oldTimer__tCheckInputDelay);
			if (timer__tCheckInputDelay != oldTimer__tCheckInputDelay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT37__TIMER_TCHECK_INPUT_DELAY, oldTimer__tCheckInputDelay, timer__tCheckInputDelay));
			}
		}
		return timer__tCheckInputDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tCheckInputDelay() {
		return timer__tCheckInputDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tCheckInputDelay(WTCTimer newTimer__tCheckInputDelay) {
		WTCTimer oldTimer__tCheckInputDelay = timer__tCheckInputDelay;
		timer__tCheckInputDelay = newTimer__tCheckInputDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT37__TIMER_TCHECK_INPUT_DELAY, oldTimer__tCheckInputDelay, timer__tCheckInputDelay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT37__BHV_PARAM_BP_LOGIC_TYPE, oldBhvParam__bpLogicType, bhvParam__bpLogicType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT37__INPUT_IINPUT:
				if (resolve) return getInput__iInput();
				return basicGetInput__iInput();
			case WTSpecPackage.CTRL_UNIT37__INPUT_IBAD_INPUT_QUALITY:
				if (resolve) return getInput__iBadInputQuality();
				return basicGetInput__iBadInputQuality();
			case WTSpecPackage.CTRL_UNIT37__INPUT_IDONT_CHECK_INPUT:
				if (resolve) return getInput__iDontCheckInput();
				return basicGetInput__iDontCheckInput();
			case WTSpecPackage.CTRL_UNIT37__OUTPUT_OSEND_RESET:
				if (resolve) return getOutput__oSendReset();
				return basicGetOutput__oSendReset();
			case WTSpecPackage.CTRL_UNIT37__FAULT_FFAULT:
				if (resolve) return getFault__fFault();
				return basicGetFault__fFault();
			case WTSpecPackage.CTRL_UNIT37__TIMER_TCHECK_INPUT_DELAY:
				if (resolve) return getTimer__tCheckInputDelay();
				return basicGetTimer__tCheckInputDelay();
			case WTSpecPackage.CTRL_UNIT37__BHV_PARAM_BP_LOGIC_TYPE:
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
			case WTSpecPackage.CTRL_UNIT37__INPUT_IINPUT:
				setInput__iInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT37__INPUT_IBAD_INPUT_QUALITY:
				setInput__iBadInputQuality((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT37__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT37__OUTPUT_OSEND_RESET:
				setOutput__oSendReset((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT37__FAULT_FFAULT:
				setFault__fFault((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT37__TIMER_TCHECK_INPUT_DELAY:
				setTimer__tCheckInputDelay((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT37__BHV_PARAM_BP_LOGIC_TYPE:
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
			case WTSpecPackage.CTRL_UNIT37__INPUT_IINPUT:
				setInput__iInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT37__INPUT_IBAD_INPUT_QUALITY:
				setInput__iBadInputQuality((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT37__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT37__OUTPUT_OSEND_RESET:
				setOutput__oSendReset((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT37__FAULT_FFAULT:
				setFault__fFault((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT37__TIMER_TCHECK_INPUT_DELAY:
				setTimer__tCheckInputDelay((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT37__BHV_PARAM_BP_LOGIC_TYPE:
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
			case WTSpecPackage.CTRL_UNIT37__INPUT_IINPUT:
				return input__iInput != null;
			case WTSpecPackage.CTRL_UNIT37__INPUT_IBAD_INPUT_QUALITY:
				return input__iBadInputQuality != null;
			case WTSpecPackage.CTRL_UNIT37__INPUT_IDONT_CHECK_INPUT:
				return input__iDontCheckInput != null;
			case WTSpecPackage.CTRL_UNIT37__OUTPUT_OSEND_RESET:
				return output__oSendReset != null;
			case WTSpecPackage.CTRL_UNIT37__FAULT_FFAULT:
				return fault__fFault != null;
			case WTSpecPackage.CTRL_UNIT37__TIMER_TCHECK_INPUT_DELAY:
				return timer__tCheckInputDelay != null;
			case WTSpecPackage.CTRL_UNIT37__BHV_PARAM_BP_LOGIC_TYPE:
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

} //CtrlUnit37Impl
