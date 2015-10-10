/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit76;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit76</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit76Impl#getInput__iCtrlYawBrakeStatus <em>Input iCtrl Yaw Brake Status</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit76Impl#getOutput__oOpcYawBrakeStatus <em>Output oOpc Yaw Brake Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit76Impl extends wtcImpl implements CtrlUnit76 {
	/**
	 * The cached value of the '{@link #getInput__iCtrlYawBrakeStatus() <em>Input iCtrl Yaw Brake Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iCtrlYawBrakeStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iCtrlYawBrakeStatus;

	/**
	 * The cached value of the '{@link #getOutput__oOpcYawBrakeStatus() <em>Output oOpc Yaw Brake Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOpcYawBrakeStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOpcYawBrakeStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit76Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT76;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iCtrlYawBrakeStatus() {
		if (input__iCtrlYawBrakeStatus != null && input__iCtrlYawBrakeStatus.eIsProxy()) {
			InternalEObject oldInput__iCtrlYawBrakeStatus = (InternalEObject)input__iCtrlYawBrakeStatus;
			input__iCtrlYawBrakeStatus = (WTCInput)eResolveProxy(oldInput__iCtrlYawBrakeStatus);
			if (input__iCtrlYawBrakeStatus != oldInput__iCtrlYawBrakeStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT76__INPUT_ICTRL_YAW_BRAKE_STATUS, oldInput__iCtrlYawBrakeStatus, input__iCtrlYawBrakeStatus));
			}
		}
		return input__iCtrlYawBrakeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iCtrlYawBrakeStatus() {
		return input__iCtrlYawBrakeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iCtrlYawBrakeStatus(WTCInput newInput__iCtrlYawBrakeStatus) {
		WTCInput oldInput__iCtrlYawBrakeStatus = input__iCtrlYawBrakeStatus;
		input__iCtrlYawBrakeStatus = newInput__iCtrlYawBrakeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT76__INPUT_ICTRL_YAW_BRAKE_STATUS, oldInput__iCtrlYawBrakeStatus, input__iCtrlYawBrakeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOpcYawBrakeStatus() {
		if (output__oOpcYawBrakeStatus != null && output__oOpcYawBrakeStatus.eIsProxy()) {
			InternalEObject oldOutput__oOpcYawBrakeStatus = (InternalEObject)output__oOpcYawBrakeStatus;
			output__oOpcYawBrakeStatus = (WTCOutput)eResolveProxy(oldOutput__oOpcYawBrakeStatus);
			if (output__oOpcYawBrakeStatus != oldOutput__oOpcYawBrakeStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT76__OUTPUT_OOPC_YAW_BRAKE_STATUS, oldOutput__oOpcYawBrakeStatus, output__oOpcYawBrakeStatus));
			}
		}
		return output__oOpcYawBrakeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOpcYawBrakeStatus() {
		return output__oOpcYawBrakeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOpcYawBrakeStatus(WTCOutput newOutput__oOpcYawBrakeStatus) {
		WTCOutput oldOutput__oOpcYawBrakeStatus = output__oOpcYawBrakeStatus;
		output__oOpcYawBrakeStatus = newOutput__oOpcYawBrakeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT76__OUTPUT_OOPC_YAW_BRAKE_STATUS, oldOutput__oOpcYawBrakeStatus, output__oOpcYawBrakeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT76__INPUT_ICTRL_YAW_BRAKE_STATUS:
				if (resolve) return getInput__iCtrlYawBrakeStatus();
				return basicGetInput__iCtrlYawBrakeStatus();
			case WTSpecPackage.CTRL_UNIT76__OUTPUT_OOPC_YAW_BRAKE_STATUS:
				if (resolve) return getOutput__oOpcYawBrakeStatus();
				return basicGetOutput__oOpcYawBrakeStatus();
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
			case WTSpecPackage.CTRL_UNIT76__INPUT_ICTRL_YAW_BRAKE_STATUS:
				setInput__iCtrlYawBrakeStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT76__OUTPUT_OOPC_YAW_BRAKE_STATUS:
				setOutput__oOpcYawBrakeStatus((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT76__INPUT_ICTRL_YAW_BRAKE_STATUS:
				setInput__iCtrlYawBrakeStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT76__OUTPUT_OOPC_YAW_BRAKE_STATUS:
				setOutput__oOpcYawBrakeStatus((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT76__INPUT_ICTRL_YAW_BRAKE_STATUS:
				return input__iCtrlYawBrakeStatus != null;
			case WTSpecPackage.CTRL_UNIT76__OUTPUT_OOPC_YAW_BRAKE_STATUS:
				return output__oOpcYawBrakeStatus != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit76Impl
