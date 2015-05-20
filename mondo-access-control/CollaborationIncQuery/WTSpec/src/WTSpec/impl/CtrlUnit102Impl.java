/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit102;
import WTSpec.WTCFault;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit102</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit102Impl#getInput__iOriginalStatus <em>Input iOriginal Status</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit102Impl#getInput__iResetRequest <em>Input iReset Request</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit102Impl#getOutput__oFilteredStatus <em>Output oFiltered Status</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit102Impl#getFault__fFault <em>Fault fFault</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit102Impl extends wtcImpl implements CtrlUnit102 {
	/**
	 * The cached value of the '{@link #getInput__iOriginalStatus() <em>Input iOriginal Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iOriginalStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iOriginalStatus;

	/**
	 * The cached value of the '{@link #getInput__iResetRequest() <em>Input iReset Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iResetRequest()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iResetRequest;

	/**
	 * The cached value of the '{@link #getOutput__oFilteredStatus() <em>Output oFiltered Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oFilteredStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oFilteredStatus;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit102Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT102;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iOriginalStatus() {
		if (input__iOriginalStatus != null && input__iOriginalStatus.eIsProxy()) {
			InternalEObject oldInput__iOriginalStatus = (InternalEObject)input__iOriginalStatus;
			input__iOriginalStatus = (WTCInput)eResolveProxy(oldInput__iOriginalStatus);
			if (input__iOriginalStatus != oldInput__iOriginalStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT102__INPUT_IORIGINAL_STATUS, oldInput__iOriginalStatus, input__iOriginalStatus));
			}
		}
		return input__iOriginalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iOriginalStatus() {
		return input__iOriginalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iOriginalStatus(WTCInput newInput__iOriginalStatus) {
		WTCInput oldInput__iOriginalStatus = input__iOriginalStatus;
		input__iOriginalStatus = newInput__iOriginalStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT102__INPUT_IORIGINAL_STATUS, oldInput__iOriginalStatus, input__iOriginalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iResetRequest() {
		if (input__iResetRequest != null && input__iResetRequest.eIsProxy()) {
			InternalEObject oldInput__iResetRequest = (InternalEObject)input__iResetRequest;
			input__iResetRequest = (WTCInput)eResolveProxy(oldInput__iResetRequest);
			if (input__iResetRequest != oldInput__iResetRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT102__INPUT_IRESET_REQUEST, oldInput__iResetRequest, input__iResetRequest));
			}
		}
		return input__iResetRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iResetRequest() {
		return input__iResetRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iResetRequest(WTCInput newInput__iResetRequest) {
		WTCInput oldInput__iResetRequest = input__iResetRequest;
		input__iResetRequest = newInput__iResetRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT102__INPUT_IRESET_REQUEST, oldInput__iResetRequest, input__iResetRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oFilteredStatus() {
		if (output__oFilteredStatus != null && output__oFilteredStatus.eIsProxy()) {
			InternalEObject oldOutput__oFilteredStatus = (InternalEObject)output__oFilteredStatus;
			output__oFilteredStatus = (WTCOutput)eResolveProxy(oldOutput__oFilteredStatus);
			if (output__oFilteredStatus != oldOutput__oFilteredStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT102__OUTPUT_OFILTERED_STATUS, oldOutput__oFilteredStatus, output__oFilteredStatus));
			}
		}
		return output__oFilteredStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oFilteredStatus() {
		return output__oFilteredStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oFilteredStatus(WTCOutput newOutput__oFilteredStatus) {
		WTCOutput oldOutput__oFilteredStatus = output__oFilteredStatus;
		output__oFilteredStatus = newOutput__oFilteredStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT102__OUTPUT_OFILTERED_STATUS, oldOutput__oFilteredStatus, output__oFilteredStatus));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT102__FAULT_FFAULT, oldFault__fFault, fault__fFault));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT102__FAULT_FFAULT, oldFault__fFault, fault__fFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT102__INPUT_IORIGINAL_STATUS:
				if (resolve) return getInput__iOriginalStatus();
				return basicGetInput__iOriginalStatus();
			case WTSpecPackage.CTRL_UNIT102__INPUT_IRESET_REQUEST:
				if (resolve) return getInput__iResetRequest();
				return basicGetInput__iResetRequest();
			case WTSpecPackage.CTRL_UNIT102__OUTPUT_OFILTERED_STATUS:
				if (resolve) return getOutput__oFilteredStatus();
				return basicGetOutput__oFilteredStatus();
			case WTSpecPackage.CTRL_UNIT102__FAULT_FFAULT:
				if (resolve) return getFault__fFault();
				return basicGetFault__fFault();
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
			case WTSpecPackage.CTRL_UNIT102__INPUT_IORIGINAL_STATUS:
				setInput__iOriginalStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT102__INPUT_IRESET_REQUEST:
				setInput__iResetRequest((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT102__OUTPUT_OFILTERED_STATUS:
				setOutput__oFilteredStatus((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT102__FAULT_FFAULT:
				setFault__fFault((WTCFault)newValue);
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
			case WTSpecPackage.CTRL_UNIT102__INPUT_IORIGINAL_STATUS:
				setInput__iOriginalStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT102__INPUT_IRESET_REQUEST:
				setInput__iResetRequest((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT102__OUTPUT_OFILTERED_STATUS:
				setOutput__oFilteredStatus((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT102__FAULT_FFAULT:
				setFault__fFault((WTCFault)null);
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
			case WTSpecPackage.CTRL_UNIT102__INPUT_IORIGINAL_STATUS:
				return input__iOriginalStatus != null;
			case WTSpecPackage.CTRL_UNIT102__INPUT_IRESET_REQUEST:
				return input__iResetRequest != null;
			case WTSpecPackage.CTRL_UNIT102__OUTPUT_OFILTERED_STATUS:
				return output__oFilteredStatus != null;
			case WTSpecPackage.CTRL_UNIT102__FAULT_FFAULT:
				return fault__fFault != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit102Impl
