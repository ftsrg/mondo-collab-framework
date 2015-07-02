/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit94;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit94</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit94Impl#getInput__iResetOrder <em>Input iReset Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit94Impl#getOutput__oValueToReset <em>Output oValue To Reset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit94Impl extends wtcImpl implements CtrlUnit94 {
	/**
	 * The cached value of the '{@link #getInput__iResetOrder() <em>Input iReset Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iResetOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iResetOrder;

	/**
	 * The cached value of the '{@link #getOutput__oValueToReset() <em>Output oValue To Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oValueToReset()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oValueToReset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit94Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit94();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iResetOrder() {
		if (input__iResetOrder != null && input__iResetOrder.eIsProxy()) {
			InternalEObject oldInput__iResetOrder = (InternalEObject)input__iResetOrder;
			input__iResetOrder = (WTCInput)eResolveProxy(oldInput__iResetOrder);
			if (input__iResetOrder != oldInput__iResetOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT94__INPUT_IRESET_ORDER, oldInput__iResetOrder, input__iResetOrder));
			}
		}
		return input__iResetOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iResetOrder() {
		return input__iResetOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iResetOrder(WTCInput newInput__iResetOrder) {
		WTCInput oldInput__iResetOrder = input__iResetOrder;
		input__iResetOrder = newInput__iResetOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT94__INPUT_IRESET_ORDER, oldInput__iResetOrder, input__iResetOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oValueToReset() {
		if (output__oValueToReset != null && output__oValueToReset.eIsProxy()) {
			InternalEObject oldOutput__oValueToReset = (InternalEObject)output__oValueToReset;
			output__oValueToReset = (WTCOutput)eResolveProxy(oldOutput__oValueToReset);
			if (output__oValueToReset != oldOutput__oValueToReset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT94__OUTPUT_OVALUE_TO_RESET, oldOutput__oValueToReset, output__oValueToReset));
			}
		}
		return output__oValueToReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oValueToReset() {
		return output__oValueToReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oValueToReset(WTCOutput newOutput__oValueToReset) {
		WTCOutput oldOutput__oValueToReset = output__oValueToReset;
		output__oValueToReset = newOutput__oValueToReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT94__OUTPUT_OVALUE_TO_RESET, oldOutput__oValueToReset, output__oValueToReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT94__INPUT_IRESET_ORDER:
				if (resolve) return getInput__iResetOrder();
				return basicGetInput__iResetOrder();
			case WTSpecPackage.CTRL_UNIT94__OUTPUT_OVALUE_TO_RESET:
				if (resolve) return getOutput__oValueToReset();
				return basicGetOutput__oValueToReset();
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
			case WTSpecPackage.CTRL_UNIT94__INPUT_IRESET_ORDER:
				setInput__iResetOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT94__OUTPUT_OVALUE_TO_RESET:
				setOutput__oValueToReset((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT94__INPUT_IRESET_ORDER:
				setInput__iResetOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT94__OUTPUT_OVALUE_TO_RESET:
				setOutput__oValueToReset((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT94__INPUT_IRESET_ORDER:
				return input__iResetOrder != null;
			case WTSpecPackage.CTRL_UNIT94__OUTPUT_OVALUE_TO_RESET:
				return output__oValueToReset != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit94Impl
