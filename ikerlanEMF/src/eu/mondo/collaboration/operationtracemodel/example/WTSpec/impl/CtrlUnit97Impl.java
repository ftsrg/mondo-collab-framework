/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit97;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCFault;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit97</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit97Impl#getInput__iSafetyLineGeneralStatus <em>Input iSafety Line General Status</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit97Impl#getOutput__oDontCheckEmergency <em>Output oDont Check Emergency</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit97Impl#getFault__fSecLoopOff <em>Fault fSec Loop Off</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit97Impl extends wtcImpl implements CtrlUnit97 {
	/**
	 * The cached value of the '{@link #getInput__iSafetyLineGeneralStatus() <em>Input iSafety Line General Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iSafetyLineGeneralStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iSafetyLineGeneralStatus;

	/**
	 * The cached value of the '{@link #getOutput__oDontCheckEmergency() <em>Output oDont Check Emergency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oDontCheckEmergency()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oDontCheckEmergency;

	/**
	 * The cached value of the '{@link #getFault__fSecLoopOff() <em>Fault fSec Loop Off</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fSecLoopOff()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fSecLoopOff;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit97Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit97();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iSafetyLineGeneralStatus() {
		if (input__iSafetyLineGeneralStatus != null && input__iSafetyLineGeneralStatus.eIsProxy()) {
			InternalEObject oldInput__iSafetyLineGeneralStatus = (InternalEObject)input__iSafetyLineGeneralStatus;
			input__iSafetyLineGeneralStatus = (WTCInput)eResolveProxy(oldInput__iSafetyLineGeneralStatus);
			if (input__iSafetyLineGeneralStatus != oldInput__iSafetyLineGeneralStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT97__INPUT_ISAFETY_LINE_GENERAL_STATUS, oldInput__iSafetyLineGeneralStatus, input__iSafetyLineGeneralStatus));
			}
		}
		return input__iSafetyLineGeneralStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iSafetyLineGeneralStatus() {
		return input__iSafetyLineGeneralStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iSafetyLineGeneralStatus(WTCInput newInput__iSafetyLineGeneralStatus) {
		WTCInput oldInput__iSafetyLineGeneralStatus = input__iSafetyLineGeneralStatus;
		input__iSafetyLineGeneralStatus = newInput__iSafetyLineGeneralStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT97__INPUT_ISAFETY_LINE_GENERAL_STATUS, oldInput__iSafetyLineGeneralStatus, input__iSafetyLineGeneralStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oDontCheckEmergency() {
		if (output__oDontCheckEmergency != null && output__oDontCheckEmergency.eIsProxy()) {
			InternalEObject oldOutput__oDontCheckEmergency = (InternalEObject)output__oDontCheckEmergency;
			output__oDontCheckEmergency = (WTCOutput)eResolveProxy(oldOutput__oDontCheckEmergency);
			if (output__oDontCheckEmergency != oldOutput__oDontCheckEmergency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT97__OUTPUT_ODONT_CHECK_EMERGENCY, oldOutput__oDontCheckEmergency, output__oDontCheckEmergency));
			}
		}
		return output__oDontCheckEmergency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oDontCheckEmergency() {
		return output__oDontCheckEmergency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oDontCheckEmergency(WTCOutput newOutput__oDontCheckEmergency) {
		WTCOutput oldOutput__oDontCheckEmergency = output__oDontCheckEmergency;
		output__oDontCheckEmergency = newOutput__oDontCheckEmergency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT97__OUTPUT_ODONT_CHECK_EMERGENCY, oldOutput__oDontCheckEmergency, output__oDontCheckEmergency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fSecLoopOff() {
		if (fault__fSecLoopOff != null && fault__fSecLoopOff.eIsProxy()) {
			InternalEObject oldFault__fSecLoopOff = (InternalEObject)fault__fSecLoopOff;
			fault__fSecLoopOff = (WTCFault)eResolveProxy(oldFault__fSecLoopOff);
			if (fault__fSecLoopOff != oldFault__fSecLoopOff) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT97__FAULT_FSEC_LOOP_OFF, oldFault__fSecLoopOff, fault__fSecLoopOff));
			}
		}
		return fault__fSecLoopOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fSecLoopOff() {
		return fault__fSecLoopOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fSecLoopOff(WTCFault newFault__fSecLoopOff) {
		WTCFault oldFault__fSecLoopOff = fault__fSecLoopOff;
		fault__fSecLoopOff = newFault__fSecLoopOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT97__FAULT_FSEC_LOOP_OFF, oldFault__fSecLoopOff, fault__fSecLoopOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT97__INPUT_ISAFETY_LINE_GENERAL_STATUS:
				if (resolve) return getInput__iSafetyLineGeneralStatus();
				return basicGetInput__iSafetyLineGeneralStatus();
			case WTSpecPackage.CTRL_UNIT97__OUTPUT_ODONT_CHECK_EMERGENCY:
				if (resolve) return getOutput__oDontCheckEmergency();
				return basicGetOutput__oDontCheckEmergency();
			case WTSpecPackage.CTRL_UNIT97__FAULT_FSEC_LOOP_OFF:
				if (resolve) return getFault__fSecLoopOff();
				return basicGetFault__fSecLoopOff();
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
			case WTSpecPackage.CTRL_UNIT97__INPUT_ISAFETY_LINE_GENERAL_STATUS:
				setInput__iSafetyLineGeneralStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT97__OUTPUT_ODONT_CHECK_EMERGENCY:
				setOutput__oDontCheckEmergency((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT97__FAULT_FSEC_LOOP_OFF:
				setFault__fSecLoopOff((WTCFault)newValue);
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
			case WTSpecPackage.CTRL_UNIT97__INPUT_ISAFETY_LINE_GENERAL_STATUS:
				setInput__iSafetyLineGeneralStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT97__OUTPUT_ODONT_CHECK_EMERGENCY:
				setOutput__oDontCheckEmergency((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT97__FAULT_FSEC_LOOP_OFF:
				setFault__fSecLoopOff((WTCFault)null);
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
			case WTSpecPackage.CTRL_UNIT97__INPUT_ISAFETY_LINE_GENERAL_STATUS:
				return input__iSafetyLineGeneralStatus != null;
			case WTSpecPackage.CTRL_UNIT97__OUTPUT_ODONT_CHECK_EMERGENCY:
				return output__oDontCheckEmergency != null;
			case WTSpecPackage.CTRL_UNIT97__FAULT_FSEC_LOOP_OFF:
				return fault__fSecLoopOff != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit97Impl
