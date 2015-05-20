/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit81;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTCParam;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit81</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit81Impl#getInput__iInput <em>Input iInput</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit81Impl#getOutput__oPercentVal <em>Output oPercent Val</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit81Impl#getParameter__pPercent <em>Parameter pPercent</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit81Impl#getParameter__pInput <em>Parameter pInput</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit81Impl#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit81Impl#getBhvParam__bpSelect <em>Bhv Param bp Select</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit81Impl extends wtcImpl implements CtrlUnit81 {
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
	 * The cached value of the '{@link #getOutput__oPercentVal() <em>Output oPercent Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPercentVal()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPercentVal;

	/**
	 * The cached value of the '{@link #getParameter__pPercent() <em>Parameter pPercent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPercent()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPercent;

	/**
	 * The cached value of the '{@link #getParameter__pInput() <em>Parameter pInput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pInput()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pInput;

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
	 * The default value of the '{@link #getBhvParam__bpSelect() <em>Bhv Param bp Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpSelect()
	 * @generated
	 * @ordered
	 */
	protected static final String BHV_PARAM_BP_SELECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBhvParam__bpSelect() <em>Bhv Param bp Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpSelect()
	 * @generated
	 * @ordered
	 */
	protected String bhvParam__bpSelect = BHV_PARAM_BP_SELECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit81Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT81;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT81__INPUT_IINPUT, oldInput__iInput, input__iInput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT81__INPUT_IINPUT, oldInput__iInput, input__iInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPercentVal() {
		if (output__oPercentVal != null && output__oPercentVal.eIsProxy()) {
			InternalEObject oldOutput__oPercentVal = (InternalEObject)output__oPercentVal;
			output__oPercentVal = (WTCOutput)eResolveProxy(oldOutput__oPercentVal);
			if (output__oPercentVal != oldOutput__oPercentVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT81__OUTPUT_OPERCENT_VAL, oldOutput__oPercentVal, output__oPercentVal));
			}
		}
		return output__oPercentVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPercentVal() {
		return output__oPercentVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPercentVal(WTCOutput newOutput__oPercentVal) {
		WTCOutput oldOutput__oPercentVal = output__oPercentVal;
		output__oPercentVal = newOutput__oPercentVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT81__OUTPUT_OPERCENT_VAL, oldOutput__oPercentVal, output__oPercentVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPercent() {
		if (parameter__pPercent != null && parameter__pPercent.eIsProxy()) {
			InternalEObject oldParameter__pPercent = (InternalEObject)parameter__pPercent;
			parameter__pPercent = (WTCParam)eResolveProxy(oldParameter__pPercent);
			if (parameter__pPercent != oldParameter__pPercent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT81__PARAMETER_PPERCENT, oldParameter__pPercent, parameter__pPercent));
			}
		}
		return parameter__pPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPercent() {
		return parameter__pPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPercent(WTCParam newParameter__pPercent) {
		WTCParam oldParameter__pPercent = parameter__pPercent;
		parameter__pPercent = newParameter__pPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT81__PARAMETER_PPERCENT, oldParameter__pPercent, parameter__pPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pInput() {
		if (parameter__pInput != null && parameter__pInput.eIsProxy()) {
			InternalEObject oldParameter__pInput = (InternalEObject)parameter__pInput;
			parameter__pInput = (WTCParam)eResolveProxy(oldParameter__pInput);
			if (parameter__pInput != oldParameter__pInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT81__PARAMETER_PINPUT, oldParameter__pInput, parameter__pInput));
			}
		}
		return parameter__pInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pInput() {
		return parameter__pInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pInput(WTCParam newParameter__pInput) {
		WTCParam oldParameter__pInput = parameter__pInput;
		parameter__pInput = newParameter__pInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT81__PARAMETER_PINPUT, oldParameter__pInput, parameter__pInput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT81__BHV_PARAM_BP_MODE, oldBhvParam__bpMode, bhvParam__bpMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBhvParam__bpSelect() {
		return bhvParam__bpSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBhvParam__bpSelect(String newBhvParam__bpSelect) {
		String oldBhvParam__bpSelect = bhvParam__bpSelect;
		bhvParam__bpSelect = newBhvParam__bpSelect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT81__BHV_PARAM_BP_SELECT, oldBhvParam__bpSelect, bhvParam__bpSelect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT81__INPUT_IINPUT:
				if (resolve) return getInput__iInput();
				return basicGetInput__iInput();
			case WTSpecPackage.CTRL_UNIT81__OUTPUT_OPERCENT_VAL:
				if (resolve) return getOutput__oPercentVal();
				return basicGetOutput__oPercentVal();
			case WTSpecPackage.CTRL_UNIT81__PARAMETER_PPERCENT:
				if (resolve) return getParameter__pPercent();
				return basicGetParameter__pPercent();
			case WTSpecPackage.CTRL_UNIT81__PARAMETER_PINPUT:
				if (resolve) return getParameter__pInput();
				return basicGetParameter__pInput();
			case WTSpecPackage.CTRL_UNIT81__BHV_PARAM_BP_MODE:
				return getBhvParam__bpMode();
			case WTSpecPackage.CTRL_UNIT81__BHV_PARAM_BP_SELECT:
				return getBhvParam__bpSelect();
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
			case WTSpecPackage.CTRL_UNIT81__INPUT_IINPUT:
				setInput__iInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT81__OUTPUT_OPERCENT_VAL:
				setOutput__oPercentVal((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT81__PARAMETER_PPERCENT:
				setParameter__pPercent((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT81__PARAMETER_PINPUT:
				setParameter__pInput((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT81__BHV_PARAM_BP_MODE:
				setBhvParam__bpMode((String)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT81__BHV_PARAM_BP_SELECT:
				setBhvParam__bpSelect((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT81__INPUT_IINPUT:
				setInput__iInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT81__OUTPUT_OPERCENT_VAL:
				setOutput__oPercentVal((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT81__PARAMETER_PPERCENT:
				setParameter__pPercent((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT81__PARAMETER_PINPUT:
				setParameter__pInput((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT81__BHV_PARAM_BP_MODE:
				setBhvParam__bpMode(BHV_PARAM_BP_MODE_EDEFAULT);
				return;
			case WTSpecPackage.CTRL_UNIT81__BHV_PARAM_BP_SELECT:
				setBhvParam__bpSelect(BHV_PARAM_BP_SELECT_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT81__INPUT_IINPUT:
				return input__iInput != null;
			case WTSpecPackage.CTRL_UNIT81__OUTPUT_OPERCENT_VAL:
				return output__oPercentVal != null;
			case WTSpecPackage.CTRL_UNIT81__PARAMETER_PPERCENT:
				return parameter__pPercent != null;
			case WTSpecPackage.CTRL_UNIT81__PARAMETER_PINPUT:
				return parameter__pInput != null;
			case WTSpecPackage.CTRL_UNIT81__BHV_PARAM_BP_MODE:
				return BHV_PARAM_BP_MODE_EDEFAULT == null ? bhvParam__bpMode != null : !BHV_PARAM_BP_MODE_EDEFAULT.equals(bhvParam__bpMode);
			case WTSpecPackage.CTRL_UNIT81__BHV_PARAM_BP_SELECT:
				return BHV_PARAM_BP_SELECT_EDEFAULT == null ? bhvParam__bpSelect != null : !BHV_PARAM_BP_SELECT_EDEFAULT.equals(bhvParam__bpSelect);
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
		result.append(", BhvParam__bpSelect: ");
		result.append(bhvParam__bpSelect);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit81Impl
