/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit130;
import WTSpec.WTCFault;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit130</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit130Impl#getOutput__oYawBrakeHighPressureCmd <em>Output oYaw Brake High Pressure Cmd</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit130Impl#getFault__fOverpressure <em>Fault fOverpressure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit130Impl extends wtcImpl implements CtrlUnit130 {
	/**
	 * The cached value of the '{@link #getOutput__oYawBrakeHighPressureCmd() <em>Output oYaw Brake High Pressure Cmd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oYawBrakeHighPressureCmd()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oYawBrakeHighPressureCmd;

	/**
	 * The cached value of the '{@link #getFault__fOverpressure() <em>Fault fOverpressure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fOverpressure()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fOverpressure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit130Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit130();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oYawBrakeHighPressureCmd() {
		if (output__oYawBrakeHighPressureCmd != null && output__oYawBrakeHighPressureCmd.eIsProxy()) {
			InternalEObject oldOutput__oYawBrakeHighPressureCmd = (InternalEObject)output__oYawBrakeHighPressureCmd;
			output__oYawBrakeHighPressureCmd = (WTCOutput)eResolveProxy(oldOutput__oYawBrakeHighPressureCmd);
			if (output__oYawBrakeHighPressureCmd != oldOutput__oYawBrakeHighPressureCmd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT130__OUTPUT_OYAW_BRAKE_HIGH_PRESSURE_CMD, oldOutput__oYawBrakeHighPressureCmd, output__oYawBrakeHighPressureCmd));
			}
		}
		return output__oYawBrakeHighPressureCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oYawBrakeHighPressureCmd() {
		return output__oYawBrakeHighPressureCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oYawBrakeHighPressureCmd(WTCOutput newOutput__oYawBrakeHighPressureCmd) {
		WTCOutput oldOutput__oYawBrakeHighPressureCmd = output__oYawBrakeHighPressureCmd;
		output__oYawBrakeHighPressureCmd = newOutput__oYawBrakeHighPressureCmd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT130__OUTPUT_OYAW_BRAKE_HIGH_PRESSURE_CMD, oldOutput__oYawBrakeHighPressureCmd, output__oYawBrakeHighPressureCmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fOverpressure() {
		if (fault__fOverpressure != null && fault__fOverpressure.eIsProxy()) {
			InternalEObject oldFault__fOverpressure = (InternalEObject)fault__fOverpressure;
			fault__fOverpressure = (WTCFault)eResolveProxy(oldFault__fOverpressure);
			if (fault__fOverpressure != oldFault__fOverpressure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT130__FAULT_FOVERPRESSURE, oldFault__fOverpressure, fault__fOverpressure));
			}
		}
		return fault__fOverpressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fOverpressure() {
		return fault__fOverpressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fOverpressure(WTCFault newFault__fOverpressure) {
		WTCFault oldFault__fOverpressure = fault__fOverpressure;
		fault__fOverpressure = newFault__fOverpressure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT130__FAULT_FOVERPRESSURE, oldFault__fOverpressure, fault__fOverpressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT130__OUTPUT_OYAW_BRAKE_HIGH_PRESSURE_CMD:
				if (resolve) return getOutput__oYawBrakeHighPressureCmd();
				return basicGetOutput__oYawBrakeHighPressureCmd();
			case WTSpecPackage.CTRL_UNIT130__FAULT_FOVERPRESSURE:
				if (resolve) return getFault__fOverpressure();
				return basicGetFault__fOverpressure();
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
			case WTSpecPackage.CTRL_UNIT130__OUTPUT_OYAW_BRAKE_HIGH_PRESSURE_CMD:
				setOutput__oYawBrakeHighPressureCmd((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT130__FAULT_FOVERPRESSURE:
				setFault__fOverpressure((WTCFault)newValue);
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
			case WTSpecPackage.CTRL_UNIT130__OUTPUT_OYAW_BRAKE_HIGH_PRESSURE_CMD:
				setOutput__oYawBrakeHighPressureCmd((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT130__FAULT_FOVERPRESSURE:
				setFault__fOverpressure((WTCFault)null);
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
			case WTSpecPackage.CTRL_UNIT130__OUTPUT_OYAW_BRAKE_HIGH_PRESSURE_CMD:
				return output__oYawBrakeHighPressureCmd != null;
			case WTSpecPackage.CTRL_UNIT130__FAULT_FOVERPRESSURE:
				return fault__fOverpressure != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit130Impl
