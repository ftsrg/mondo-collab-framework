/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit123;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit123</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit123Impl#getInput__iUpperStatus <em>Input iUpper Status</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit123Impl#getInput__iLowerStatus <em>Input iLower Status</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit123Impl#getOutput__oBrakeStatus <em>Output oBrake Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit123Impl extends wtcImpl implements CtrlUnit123 {
	/**
	 * The cached value of the '{@link #getInput__iUpperStatus() <em>Input iUpper Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iUpperStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iUpperStatus;

	/**
	 * The cached value of the '{@link #getInput__iLowerStatus() <em>Input iLower Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iLowerStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iLowerStatus;

	/**
	 * The cached value of the '{@link #getOutput__oBrakeStatus() <em>Output oBrake Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oBrakeStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oBrakeStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit123Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit123();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iUpperStatus() {
		if (input__iUpperStatus != null && input__iUpperStatus.eIsProxy()) {
			InternalEObject oldInput__iUpperStatus = (InternalEObject)input__iUpperStatus;
			input__iUpperStatus = (WTCInput)eResolveProxy(oldInput__iUpperStatus);
			if (input__iUpperStatus != oldInput__iUpperStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT123__INPUT_IUPPER_STATUS, oldInput__iUpperStatus, input__iUpperStatus));
			}
		}
		return input__iUpperStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iUpperStatus() {
		return input__iUpperStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iUpperStatus(WTCInput newInput__iUpperStatus) {
		WTCInput oldInput__iUpperStatus = input__iUpperStatus;
		input__iUpperStatus = newInput__iUpperStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT123__INPUT_IUPPER_STATUS, oldInput__iUpperStatus, input__iUpperStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iLowerStatus() {
		if (input__iLowerStatus != null && input__iLowerStatus.eIsProxy()) {
			InternalEObject oldInput__iLowerStatus = (InternalEObject)input__iLowerStatus;
			input__iLowerStatus = (WTCInput)eResolveProxy(oldInput__iLowerStatus);
			if (input__iLowerStatus != oldInput__iLowerStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT123__INPUT_ILOWER_STATUS, oldInput__iLowerStatus, input__iLowerStatus));
			}
		}
		return input__iLowerStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iLowerStatus() {
		return input__iLowerStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iLowerStatus(WTCInput newInput__iLowerStatus) {
		WTCInput oldInput__iLowerStatus = input__iLowerStatus;
		input__iLowerStatus = newInput__iLowerStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT123__INPUT_ILOWER_STATUS, oldInput__iLowerStatus, input__iLowerStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oBrakeStatus() {
		if (output__oBrakeStatus != null && output__oBrakeStatus.eIsProxy()) {
			InternalEObject oldOutput__oBrakeStatus = (InternalEObject)output__oBrakeStatus;
			output__oBrakeStatus = (WTCOutput)eResolveProxy(oldOutput__oBrakeStatus);
			if (output__oBrakeStatus != oldOutput__oBrakeStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT123__OUTPUT_OBRAKE_STATUS, oldOutput__oBrakeStatus, output__oBrakeStatus));
			}
		}
		return output__oBrakeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oBrakeStatus() {
		return output__oBrakeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oBrakeStatus(WTCOutput newOutput__oBrakeStatus) {
		WTCOutput oldOutput__oBrakeStatus = output__oBrakeStatus;
		output__oBrakeStatus = newOutput__oBrakeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT123__OUTPUT_OBRAKE_STATUS, oldOutput__oBrakeStatus, output__oBrakeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT123__INPUT_IUPPER_STATUS:
				if (resolve) return getInput__iUpperStatus();
				return basicGetInput__iUpperStatus();
			case WTSpecPackage.CTRL_UNIT123__INPUT_ILOWER_STATUS:
				if (resolve) return getInput__iLowerStatus();
				return basicGetInput__iLowerStatus();
			case WTSpecPackage.CTRL_UNIT123__OUTPUT_OBRAKE_STATUS:
				if (resolve) return getOutput__oBrakeStatus();
				return basicGetOutput__oBrakeStatus();
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
			case WTSpecPackage.CTRL_UNIT123__INPUT_IUPPER_STATUS:
				setInput__iUpperStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT123__INPUT_ILOWER_STATUS:
				setInput__iLowerStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT123__OUTPUT_OBRAKE_STATUS:
				setOutput__oBrakeStatus((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT123__INPUT_IUPPER_STATUS:
				setInput__iUpperStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT123__INPUT_ILOWER_STATUS:
				setInput__iLowerStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT123__OUTPUT_OBRAKE_STATUS:
				setOutput__oBrakeStatus((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT123__INPUT_IUPPER_STATUS:
				return input__iUpperStatus != null;
			case WTSpecPackage.CTRL_UNIT123__INPUT_ILOWER_STATUS:
				return input__iLowerStatus != null;
			case WTSpecPackage.CTRL_UNIT123__OUTPUT_OBRAKE_STATUS:
				return output__oBrakeStatus != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit123Impl
