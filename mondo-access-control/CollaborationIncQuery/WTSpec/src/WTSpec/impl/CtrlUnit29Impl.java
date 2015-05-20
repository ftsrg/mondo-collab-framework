/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit29;
import WTSpec.WTCFault;
import WTSpec.WTCInput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit29</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit29Impl#getInput__iDigitalInput <em>Input iDigital Input</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit29Impl#getInput__iDontCheckInput <em>Input iDont Check Input</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit29Impl#getFault__fFault <em>Fault fFault</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit29Impl#getBhvParam__bpResetMode <em>Bhv Param bp Reset Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit29Impl extends wtcImpl implements CtrlUnit29 {
	/**
	 * The cached value of the '{@link #getInput__iDigitalInput() <em>Input iDigital Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iDigitalInput()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iDigitalInput;

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
	 * The cached value of the '{@link #getFault__fFault() <em>Fault fFault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fFault()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fFault;

	/**
	 * The default value of the '{@link #getBhvParam__bpResetMode() <em>Bhv Param bp Reset Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpResetMode()
	 * @generated
	 * @ordered
	 */
	protected static final String BHV_PARAM_BP_RESET_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBhvParam__bpResetMode() <em>Bhv Param bp Reset Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpResetMode()
	 * @generated
	 * @ordered
	 */
	protected String bhvParam__bpResetMode = BHV_PARAM_BP_RESET_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit29Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iDigitalInput() {
		if (input__iDigitalInput != null && input__iDigitalInput.eIsProxy()) {
			InternalEObject oldInput__iDigitalInput = (InternalEObject)input__iDigitalInput;
			input__iDigitalInput = (WTCInput)eResolveProxy(oldInput__iDigitalInput);
			if (input__iDigitalInput != oldInput__iDigitalInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT29__INPUT_IDIGITAL_INPUT, oldInput__iDigitalInput, input__iDigitalInput));
			}
		}
		return input__iDigitalInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iDigitalInput() {
		return input__iDigitalInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iDigitalInput(WTCInput newInput__iDigitalInput) {
		WTCInput oldInput__iDigitalInput = input__iDigitalInput;
		input__iDigitalInput = newInput__iDigitalInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT29__INPUT_IDIGITAL_INPUT, oldInput__iDigitalInput, input__iDigitalInput));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT29__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT29__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT29__FAULT_FFAULT, oldFault__fFault, fault__fFault));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT29__FAULT_FFAULT, oldFault__fFault, fault__fFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBhvParam__bpResetMode() {
		return bhvParam__bpResetMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBhvParam__bpResetMode(String newBhvParam__bpResetMode) {
		String oldBhvParam__bpResetMode = bhvParam__bpResetMode;
		bhvParam__bpResetMode = newBhvParam__bpResetMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT29__BHV_PARAM_BP_RESET_MODE, oldBhvParam__bpResetMode, bhvParam__bpResetMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT29__INPUT_IDIGITAL_INPUT:
				if (resolve) return getInput__iDigitalInput();
				return basicGetInput__iDigitalInput();
			case WTSpecPackage.CTRL_UNIT29__INPUT_IDONT_CHECK_INPUT:
				if (resolve) return getInput__iDontCheckInput();
				return basicGetInput__iDontCheckInput();
			case WTSpecPackage.CTRL_UNIT29__FAULT_FFAULT:
				if (resolve) return getFault__fFault();
				return basicGetFault__fFault();
			case WTSpecPackage.CTRL_UNIT29__BHV_PARAM_BP_RESET_MODE:
				return getBhvParam__bpResetMode();
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
			case WTSpecPackage.CTRL_UNIT29__INPUT_IDIGITAL_INPUT:
				setInput__iDigitalInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT29__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT29__FAULT_FFAULT:
				setFault__fFault((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT29__BHV_PARAM_BP_RESET_MODE:
				setBhvParam__bpResetMode((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT29__INPUT_IDIGITAL_INPUT:
				setInput__iDigitalInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT29__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT29__FAULT_FFAULT:
				setFault__fFault((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT29__BHV_PARAM_BP_RESET_MODE:
				setBhvParam__bpResetMode(BHV_PARAM_BP_RESET_MODE_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT29__INPUT_IDIGITAL_INPUT:
				return input__iDigitalInput != null;
			case WTSpecPackage.CTRL_UNIT29__INPUT_IDONT_CHECK_INPUT:
				return input__iDontCheckInput != null;
			case WTSpecPackage.CTRL_UNIT29__FAULT_FFAULT:
				return fault__fFault != null;
			case WTSpecPackage.CTRL_UNIT29__BHV_PARAM_BP_RESET_MODE:
				return BHV_PARAM_BP_RESET_MODE_EDEFAULT == null ? bhvParam__bpResetMode != null : !BHV_PARAM_BP_RESET_MODE_EDEFAULT.equals(bhvParam__bpResetMode);
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
		result.append(" (BhvParam__bpResetMode: ");
		result.append(bhvParam__bpResetMode);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit29Impl
