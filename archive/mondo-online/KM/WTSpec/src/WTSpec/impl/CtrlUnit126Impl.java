/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit126;
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
 * An implementation of the model object '<em><b>Ctrl Unit126</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit126Impl#getInput__iTorqueVal <em>Input iTorque Val</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit126Impl#getInput__iInvRol <em>Input iInv Rol</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit126Impl#getOutput__oMaxTorque <em>Output oMax Torque</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit126Impl#getOutput__oMinTorque <em>Output oMin Torque</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit126Impl#getParameter__pMaxTorque <em>Parameter pMax Torque</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit126Impl#getParameter__pMinTorque <em>Parameter pMin Torque</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit126Impl extends wtcImpl implements CtrlUnit126 {
	/**
	 * The cached value of the '{@link #getInput__iTorqueVal() <em>Input iTorque Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iTorqueVal()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iTorqueVal;

	/**
	 * The cached value of the '{@link #getInput__iInvRol() <em>Input iInv Rol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInvRol()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInvRol;

	/**
	 * The cached value of the '{@link #getOutput__oMaxTorque() <em>Output oMax Torque</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oMaxTorque()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oMaxTorque;

	/**
	 * The cached value of the '{@link #getOutput__oMinTorque() <em>Output oMin Torque</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oMinTorque()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oMinTorque;

	/**
	 * The cached value of the '{@link #getParameter__pMaxTorque() <em>Parameter pMax Torque</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pMaxTorque()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pMaxTorque;

	/**
	 * The cached value of the '{@link #getParameter__pMinTorque() <em>Parameter pMin Torque</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pMinTorque()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pMinTorque;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit126Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit126();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iTorqueVal() {
		if (input__iTorqueVal != null && input__iTorqueVal.eIsProxy()) {
			InternalEObject oldInput__iTorqueVal = (InternalEObject)input__iTorqueVal;
			input__iTorqueVal = (WTCInput)eResolveProxy(oldInput__iTorqueVal);
			if (input__iTorqueVal != oldInput__iTorqueVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT126__INPUT_ITORQUE_VAL, oldInput__iTorqueVal, input__iTorqueVal));
			}
		}
		return input__iTorqueVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iTorqueVal() {
		return input__iTorqueVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iTorqueVal(WTCInput newInput__iTorqueVal) {
		WTCInput oldInput__iTorqueVal = input__iTorqueVal;
		input__iTorqueVal = newInput__iTorqueVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT126__INPUT_ITORQUE_VAL, oldInput__iTorqueVal, input__iTorqueVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInvRol() {
		if (input__iInvRol != null && input__iInvRol.eIsProxy()) {
			InternalEObject oldInput__iInvRol = (InternalEObject)input__iInvRol;
			input__iInvRol = (WTCInput)eResolveProxy(oldInput__iInvRol);
			if (input__iInvRol != oldInput__iInvRol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT126__INPUT_IINV_ROL, oldInput__iInvRol, input__iInvRol));
			}
		}
		return input__iInvRol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInvRol() {
		return input__iInvRol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInvRol(WTCInput newInput__iInvRol) {
		WTCInput oldInput__iInvRol = input__iInvRol;
		input__iInvRol = newInput__iInvRol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT126__INPUT_IINV_ROL, oldInput__iInvRol, input__iInvRol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oMaxTorque() {
		if (output__oMaxTorque != null && output__oMaxTorque.eIsProxy()) {
			InternalEObject oldOutput__oMaxTorque = (InternalEObject)output__oMaxTorque;
			output__oMaxTorque = (WTCOutput)eResolveProxy(oldOutput__oMaxTorque);
			if (output__oMaxTorque != oldOutput__oMaxTorque) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT126__OUTPUT_OMAX_TORQUE, oldOutput__oMaxTorque, output__oMaxTorque));
			}
		}
		return output__oMaxTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oMaxTorque() {
		return output__oMaxTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oMaxTorque(WTCOutput newOutput__oMaxTorque) {
		WTCOutput oldOutput__oMaxTorque = output__oMaxTorque;
		output__oMaxTorque = newOutput__oMaxTorque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT126__OUTPUT_OMAX_TORQUE, oldOutput__oMaxTorque, output__oMaxTorque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oMinTorque() {
		if (output__oMinTorque != null && output__oMinTorque.eIsProxy()) {
			InternalEObject oldOutput__oMinTorque = (InternalEObject)output__oMinTorque;
			output__oMinTorque = (WTCOutput)eResolveProxy(oldOutput__oMinTorque);
			if (output__oMinTorque != oldOutput__oMinTorque) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT126__OUTPUT_OMIN_TORQUE, oldOutput__oMinTorque, output__oMinTorque));
			}
		}
		return output__oMinTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oMinTorque() {
		return output__oMinTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oMinTorque(WTCOutput newOutput__oMinTorque) {
		WTCOutput oldOutput__oMinTorque = output__oMinTorque;
		output__oMinTorque = newOutput__oMinTorque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT126__OUTPUT_OMIN_TORQUE, oldOutput__oMinTorque, output__oMinTorque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pMaxTorque() {
		if (parameter__pMaxTorque != null && parameter__pMaxTorque.eIsProxy()) {
			InternalEObject oldParameter__pMaxTorque = (InternalEObject)parameter__pMaxTorque;
			parameter__pMaxTorque = (WTCParam)eResolveProxy(oldParameter__pMaxTorque);
			if (parameter__pMaxTorque != oldParameter__pMaxTorque) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT126__PARAMETER_PMAX_TORQUE, oldParameter__pMaxTorque, parameter__pMaxTorque));
			}
		}
		return parameter__pMaxTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pMaxTorque() {
		return parameter__pMaxTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pMaxTorque(WTCParam newParameter__pMaxTorque) {
		WTCParam oldParameter__pMaxTorque = parameter__pMaxTorque;
		parameter__pMaxTorque = newParameter__pMaxTorque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT126__PARAMETER_PMAX_TORQUE, oldParameter__pMaxTorque, parameter__pMaxTorque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pMinTorque() {
		if (parameter__pMinTorque != null && parameter__pMinTorque.eIsProxy()) {
			InternalEObject oldParameter__pMinTorque = (InternalEObject)parameter__pMinTorque;
			parameter__pMinTorque = (WTCParam)eResolveProxy(oldParameter__pMinTorque);
			if (parameter__pMinTorque != oldParameter__pMinTorque) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT126__PARAMETER_PMIN_TORQUE, oldParameter__pMinTorque, parameter__pMinTorque));
			}
		}
		return parameter__pMinTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pMinTorque() {
		return parameter__pMinTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pMinTorque(WTCParam newParameter__pMinTorque) {
		WTCParam oldParameter__pMinTorque = parameter__pMinTorque;
		parameter__pMinTorque = newParameter__pMinTorque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT126__PARAMETER_PMIN_TORQUE, oldParameter__pMinTorque, parameter__pMinTorque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT126__INPUT_ITORQUE_VAL:
				if (resolve) return getInput__iTorqueVal();
				return basicGetInput__iTorqueVal();
			case WTSpecPackage.CTRL_UNIT126__INPUT_IINV_ROL:
				if (resolve) return getInput__iInvRol();
				return basicGetInput__iInvRol();
			case WTSpecPackage.CTRL_UNIT126__OUTPUT_OMAX_TORQUE:
				if (resolve) return getOutput__oMaxTorque();
				return basicGetOutput__oMaxTorque();
			case WTSpecPackage.CTRL_UNIT126__OUTPUT_OMIN_TORQUE:
				if (resolve) return getOutput__oMinTorque();
				return basicGetOutput__oMinTorque();
			case WTSpecPackage.CTRL_UNIT126__PARAMETER_PMAX_TORQUE:
				if (resolve) return getParameter__pMaxTorque();
				return basicGetParameter__pMaxTorque();
			case WTSpecPackage.CTRL_UNIT126__PARAMETER_PMIN_TORQUE:
				if (resolve) return getParameter__pMinTorque();
				return basicGetParameter__pMinTorque();
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
			case WTSpecPackage.CTRL_UNIT126__INPUT_ITORQUE_VAL:
				setInput__iTorqueVal((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT126__INPUT_IINV_ROL:
				setInput__iInvRol((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT126__OUTPUT_OMAX_TORQUE:
				setOutput__oMaxTorque((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT126__OUTPUT_OMIN_TORQUE:
				setOutput__oMinTorque((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT126__PARAMETER_PMAX_TORQUE:
				setParameter__pMaxTorque((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT126__PARAMETER_PMIN_TORQUE:
				setParameter__pMinTorque((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT126__INPUT_ITORQUE_VAL:
				setInput__iTorqueVal((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT126__INPUT_IINV_ROL:
				setInput__iInvRol((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT126__OUTPUT_OMAX_TORQUE:
				setOutput__oMaxTorque((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT126__OUTPUT_OMIN_TORQUE:
				setOutput__oMinTorque((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT126__PARAMETER_PMAX_TORQUE:
				setParameter__pMaxTorque((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT126__PARAMETER_PMIN_TORQUE:
				setParameter__pMinTorque((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT126__INPUT_ITORQUE_VAL:
				return input__iTorqueVal != null;
			case WTSpecPackage.CTRL_UNIT126__INPUT_IINV_ROL:
				return input__iInvRol != null;
			case WTSpecPackage.CTRL_UNIT126__OUTPUT_OMAX_TORQUE:
				return output__oMaxTorque != null;
			case WTSpecPackage.CTRL_UNIT126__OUTPUT_OMIN_TORQUE:
				return output__oMinTorque != null;
			case WTSpecPackage.CTRL_UNIT126__PARAMETER_PMAX_TORQUE:
				return parameter__pMaxTorque != null;
			case WTSpecPackage.CTRL_UNIT126__PARAMETER_PMIN_TORQUE:
				return parameter__pMinTorque != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit126Impl
