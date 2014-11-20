/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit69;
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
 * An implementation of the model object '<em><b>Ctrl Unit69</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit69Impl#getInput__iLocalMaxPower <em>Input iLocal Max Power</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit69Impl#getInput__iRemoteMaxPower <em>Input iRemote Max Power</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit69Impl#getInput__iTorqueControlMaxPower <em>Input iTorque Control Max Power</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit69Impl#getOutput__oMaxPower <em>Output oMax Power</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit69Impl#getParameter__pMaxPower <em>Parameter pMax Power</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit69Impl extends wtcImpl implements CtrlUnit69 {
	/**
	 * The cached value of the '{@link #getInput__iLocalMaxPower() <em>Input iLocal Max Power</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iLocalMaxPower()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iLocalMaxPower;

	/**
	 * The cached value of the '{@link #getInput__iRemoteMaxPower() <em>Input iRemote Max Power</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iRemoteMaxPower()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iRemoteMaxPower;

	/**
	 * The cached value of the '{@link #getInput__iTorqueControlMaxPower() <em>Input iTorque Control Max Power</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iTorqueControlMaxPower()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iTorqueControlMaxPower;

	/**
	 * The cached value of the '{@link #getOutput__oMaxPower() <em>Output oMax Power</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oMaxPower()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oMaxPower;

	/**
	 * The cached value of the '{@link #getParameter__pMaxPower() <em>Parameter pMax Power</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pMaxPower()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pMaxPower;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit69Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit69();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iLocalMaxPower() {
		if (input__iLocalMaxPower != null && input__iLocalMaxPower.eIsProxy()) {
			InternalEObject oldInput__iLocalMaxPower = (InternalEObject)input__iLocalMaxPower;
			input__iLocalMaxPower = (WTCInput)eResolveProxy(oldInput__iLocalMaxPower);
			if (input__iLocalMaxPower != oldInput__iLocalMaxPower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT69__INPUT_ILOCAL_MAX_POWER, oldInput__iLocalMaxPower, input__iLocalMaxPower));
			}
		}
		return input__iLocalMaxPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iLocalMaxPower() {
		return input__iLocalMaxPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iLocalMaxPower(WTCInput newInput__iLocalMaxPower) {
		WTCInput oldInput__iLocalMaxPower = input__iLocalMaxPower;
		input__iLocalMaxPower = newInput__iLocalMaxPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT69__INPUT_ILOCAL_MAX_POWER, oldInput__iLocalMaxPower, input__iLocalMaxPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iRemoteMaxPower() {
		if (input__iRemoteMaxPower != null && input__iRemoteMaxPower.eIsProxy()) {
			InternalEObject oldInput__iRemoteMaxPower = (InternalEObject)input__iRemoteMaxPower;
			input__iRemoteMaxPower = (WTCInput)eResolveProxy(oldInput__iRemoteMaxPower);
			if (input__iRemoteMaxPower != oldInput__iRemoteMaxPower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT69__INPUT_IREMOTE_MAX_POWER, oldInput__iRemoteMaxPower, input__iRemoteMaxPower));
			}
		}
		return input__iRemoteMaxPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iRemoteMaxPower() {
		return input__iRemoteMaxPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iRemoteMaxPower(WTCInput newInput__iRemoteMaxPower) {
		WTCInput oldInput__iRemoteMaxPower = input__iRemoteMaxPower;
		input__iRemoteMaxPower = newInput__iRemoteMaxPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT69__INPUT_IREMOTE_MAX_POWER, oldInput__iRemoteMaxPower, input__iRemoteMaxPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iTorqueControlMaxPower() {
		if (input__iTorqueControlMaxPower != null && input__iTorqueControlMaxPower.eIsProxy()) {
			InternalEObject oldInput__iTorqueControlMaxPower = (InternalEObject)input__iTorqueControlMaxPower;
			input__iTorqueControlMaxPower = (WTCInput)eResolveProxy(oldInput__iTorqueControlMaxPower);
			if (input__iTorqueControlMaxPower != oldInput__iTorqueControlMaxPower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT69__INPUT_ITORQUE_CONTROL_MAX_POWER, oldInput__iTorqueControlMaxPower, input__iTorqueControlMaxPower));
			}
		}
		return input__iTorqueControlMaxPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iTorqueControlMaxPower() {
		return input__iTorqueControlMaxPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iTorqueControlMaxPower(WTCInput newInput__iTorqueControlMaxPower) {
		WTCInput oldInput__iTorqueControlMaxPower = input__iTorqueControlMaxPower;
		input__iTorqueControlMaxPower = newInput__iTorqueControlMaxPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT69__INPUT_ITORQUE_CONTROL_MAX_POWER, oldInput__iTorqueControlMaxPower, input__iTorqueControlMaxPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oMaxPower() {
		if (output__oMaxPower != null && output__oMaxPower.eIsProxy()) {
			InternalEObject oldOutput__oMaxPower = (InternalEObject)output__oMaxPower;
			output__oMaxPower = (WTCOutput)eResolveProxy(oldOutput__oMaxPower);
			if (output__oMaxPower != oldOutput__oMaxPower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT69__OUTPUT_OMAX_POWER, oldOutput__oMaxPower, output__oMaxPower));
			}
		}
		return output__oMaxPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oMaxPower() {
		return output__oMaxPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oMaxPower(WTCOutput newOutput__oMaxPower) {
		WTCOutput oldOutput__oMaxPower = output__oMaxPower;
		output__oMaxPower = newOutput__oMaxPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT69__OUTPUT_OMAX_POWER, oldOutput__oMaxPower, output__oMaxPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pMaxPower() {
		if (parameter__pMaxPower != null && parameter__pMaxPower.eIsProxy()) {
			InternalEObject oldParameter__pMaxPower = (InternalEObject)parameter__pMaxPower;
			parameter__pMaxPower = (WTCParam)eResolveProxy(oldParameter__pMaxPower);
			if (parameter__pMaxPower != oldParameter__pMaxPower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT69__PARAMETER_PMAX_POWER, oldParameter__pMaxPower, parameter__pMaxPower));
			}
		}
		return parameter__pMaxPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pMaxPower() {
		return parameter__pMaxPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pMaxPower(WTCParam newParameter__pMaxPower) {
		WTCParam oldParameter__pMaxPower = parameter__pMaxPower;
		parameter__pMaxPower = newParameter__pMaxPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT69__PARAMETER_PMAX_POWER, oldParameter__pMaxPower, parameter__pMaxPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT69__INPUT_ILOCAL_MAX_POWER:
				if (resolve) return getInput__iLocalMaxPower();
				return basicGetInput__iLocalMaxPower();
			case WTSpecPackage.CTRL_UNIT69__INPUT_IREMOTE_MAX_POWER:
				if (resolve) return getInput__iRemoteMaxPower();
				return basicGetInput__iRemoteMaxPower();
			case WTSpecPackage.CTRL_UNIT69__INPUT_ITORQUE_CONTROL_MAX_POWER:
				if (resolve) return getInput__iTorqueControlMaxPower();
				return basicGetInput__iTorqueControlMaxPower();
			case WTSpecPackage.CTRL_UNIT69__OUTPUT_OMAX_POWER:
				if (resolve) return getOutput__oMaxPower();
				return basicGetOutput__oMaxPower();
			case WTSpecPackage.CTRL_UNIT69__PARAMETER_PMAX_POWER:
				if (resolve) return getParameter__pMaxPower();
				return basicGetParameter__pMaxPower();
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
			case WTSpecPackage.CTRL_UNIT69__INPUT_ILOCAL_MAX_POWER:
				setInput__iLocalMaxPower((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT69__INPUT_IREMOTE_MAX_POWER:
				setInput__iRemoteMaxPower((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT69__INPUT_ITORQUE_CONTROL_MAX_POWER:
				setInput__iTorqueControlMaxPower((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT69__OUTPUT_OMAX_POWER:
				setOutput__oMaxPower((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT69__PARAMETER_PMAX_POWER:
				setParameter__pMaxPower((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT69__INPUT_ILOCAL_MAX_POWER:
				setInput__iLocalMaxPower((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT69__INPUT_IREMOTE_MAX_POWER:
				setInput__iRemoteMaxPower((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT69__INPUT_ITORQUE_CONTROL_MAX_POWER:
				setInput__iTorqueControlMaxPower((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT69__OUTPUT_OMAX_POWER:
				setOutput__oMaxPower((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT69__PARAMETER_PMAX_POWER:
				setParameter__pMaxPower((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT69__INPUT_ILOCAL_MAX_POWER:
				return input__iLocalMaxPower != null;
			case WTSpecPackage.CTRL_UNIT69__INPUT_IREMOTE_MAX_POWER:
				return input__iRemoteMaxPower != null;
			case WTSpecPackage.CTRL_UNIT69__INPUT_ITORQUE_CONTROL_MAX_POWER:
				return input__iTorqueControlMaxPower != null;
			case WTSpecPackage.CTRL_UNIT69__OUTPUT_OMAX_POWER:
				return output__oMaxPower != null;
			case WTSpecPackage.CTRL_UNIT69__PARAMETER_PMAX_POWER:
				return parameter__pMaxPower != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit69Impl
