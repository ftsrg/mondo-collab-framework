/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit68;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit68</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit68Impl#getInput__iValue1 <em>Input iValue1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit68Impl#getInput__iValue2 <em>Input iValue2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit68Impl#getOutput__oResult <em>Output oResult</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit68Impl#getBhvParam__bpOperationType <em>Bhv Param bp Operation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit68Impl extends wtcImpl implements CtrlUnit68 {
	/**
	 * The cached value of the '{@link #getInput__iValue1() <em>Input iValue1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iValue1()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iValue1;

	/**
	 * The cached value of the '{@link #getInput__iValue2() <em>Input iValue2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iValue2()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iValue2;

	/**
	 * The cached value of the '{@link #getOutput__oResult() <em>Output oResult</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oResult()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oResult;

	/**
	 * The default value of the '{@link #getBhvParam__bpOperationType() <em>Bhv Param bp Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpOperationType()
	 * @generated
	 * @ordered
	 */
	protected static final String BHV_PARAM_BP_OPERATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBhvParam__bpOperationType() <em>Bhv Param bp Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpOperationType()
	 * @generated
	 * @ordered
	 */
	protected String bhvParam__bpOperationType = BHV_PARAM_BP_OPERATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit68Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit68();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iValue1() {
		if (input__iValue1 != null && input__iValue1.eIsProxy()) {
			InternalEObject oldInput__iValue1 = (InternalEObject)input__iValue1;
			input__iValue1 = (WTCInput)eResolveProxy(oldInput__iValue1);
			if (input__iValue1 != oldInput__iValue1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT68__INPUT_IVALUE1, oldInput__iValue1, input__iValue1));
			}
		}
		return input__iValue1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iValue1() {
		return input__iValue1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iValue1(WTCInput newInput__iValue1) {
		WTCInput oldInput__iValue1 = input__iValue1;
		input__iValue1 = newInput__iValue1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT68__INPUT_IVALUE1, oldInput__iValue1, input__iValue1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iValue2() {
		if (input__iValue2 != null && input__iValue2.eIsProxy()) {
			InternalEObject oldInput__iValue2 = (InternalEObject)input__iValue2;
			input__iValue2 = (WTCInput)eResolveProxy(oldInput__iValue2);
			if (input__iValue2 != oldInput__iValue2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT68__INPUT_IVALUE2, oldInput__iValue2, input__iValue2));
			}
		}
		return input__iValue2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iValue2() {
		return input__iValue2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iValue2(WTCInput newInput__iValue2) {
		WTCInput oldInput__iValue2 = input__iValue2;
		input__iValue2 = newInput__iValue2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT68__INPUT_IVALUE2, oldInput__iValue2, input__iValue2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oResult() {
		if (output__oResult != null && output__oResult.eIsProxy()) {
			InternalEObject oldOutput__oResult = (InternalEObject)output__oResult;
			output__oResult = (WTCOutput)eResolveProxy(oldOutput__oResult);
			if (output__oResult != oldOutput__oResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT68__OUTPUT_ORESULT, oldOutput__oResult, output__oResult));
			}
		}
		return output__oResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oResult() {
		return output__oResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oResult(WTCOutput newOutput__oResult) {
		WTCOutput oldOutput__oResult = output__oResult;
		output__oResult = newOutput__oResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT68__OUTPUT_ORESULT, oldOutput__oResult, output__oResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBhvParam__bpOperationType() {
		return bhvParam__bpOperationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBhvParam__bpOperationType(String newBhvParam__bpOperationType) {
		String oldBhvParam__bpOperationType = bhvParam__bpOperationType;
		bhvParam__bpOperationType = newBhvParam__bpOperationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT68__BHV_PARAM_BP_OPERATION_TYPE, oldBhvParam__bpOperationType, bhvParam__bpOperationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT68__INPUT_IVALUE1:
				if (resolve) return getInput__iValue1();
				return basicGetInput__iValue1();
			case WTSpecPackage.CTRL_UNIT68__INPUT_IVALUE2:
				if (resolve) return getInput__iValue2();
				return basicGetInput__iValue2();
			case WTSpecPackage.CTRL_UNIT68__OUTPUT_ORESULT:
				if (resolve) return getOutput__oResult();
				return basicGetOutput__oResult();
			case WTSpecPackage.CTRL_UNIT68__BHV_PARAM_BP_OPERATION_TYPE:
				return getBhvParam__bpOperationType();
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
			case WTSpecPackage.CTRL_UNIT68__INPUT_IVALUE1:
				setInput__iValue1((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT68__INPUT_IVALUE2:
				setInput__iValue2((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT68__OUTPUT_ORESULT:
				setOutput__oResult((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT68__BHV_PARAM_BP_OPERATION_TYPE:
				setBhvParam__bpOperationType((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT68__INPUT_IVALUE1:
				setInput__iValue1((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT68__INPUT_IVALUE2:
				setInput__iValue2((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT68__OUTPUT_ORESULT:
				setOutput__oResult((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT68__BHV_PARAM_BP_OPERATION_TYPE:
				setBhvParam__bpOperationType(BHV_PARAM_BP_OPERATION_TYPE_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT68__INPUT_IVALUE1:
				return input__iValue1 != null;
			case WTSpecPackage.CTRL_UNIT68__INPUT_IVALUE2:
				return input__iValue2 != null;
			case WTSpecPackage.CTRL_UNIT68__OUTPUT_ORESULT:
				return output__oResult != null;
			case WTSpecPackage.CTRL_UNIT68__BHV_PARAM_BP_OPERATION_TYPE:
				return BHV_PARAM_BP_OPERATION_TYPE_EDEFAULT == null ? bhvParam__bpOperationType != null : !BHV_PARAM_BP_OPERATION_TYPE_EDEFAULT.equals(bhvParam__bpOperationType);
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
		result.append(" (BhvParam__bpOperationType: ");
		result.append(bhvParam__bpOperationType);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit68Impl
