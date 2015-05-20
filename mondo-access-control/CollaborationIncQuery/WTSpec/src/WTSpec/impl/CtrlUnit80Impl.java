/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit80;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit80</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit80Impl#getInput__iAccessState <em>Input iAccess State</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit80Impl#getInput__iMaintenanceStatus <em>Input iMaintenance Status</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit80Impl#getInput__iButtonStateNC2 <em>Input iButton State NC2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit80Impl#getInput__iButtonStateTC <em>Input iButton State TC</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit80Impl#getInput__iButtonStateRemote <em>Input iButton State Remote</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit80Impl#getOutput__oButtonState <em>Output oButton State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit80Impl extends wtcImpl implements CtrlUnit80 {
	/**
	 * The cached value of the '{@link #getInput__iAccessState() <em>Input iAccess State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iAccessState()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iAccessState;

	/**
	 * The cached value of the '{@link #getInput__iMaintenanceStatus() <em>Input iMaintenance Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iMaintenanceStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iMaintenanceStatus;

	/**
	 * The cached value of the '{@link #getInput__iButtonStateNC2() <em>Input iButton State NC2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iButtonStateNC2()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iButtonStateNC2;

	/**
	 * The cached value of the '{@link #getInput__iButtonStateTC() <em>Input iButton State TC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iButtonStateTC()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iButtonStateTC;

	/**
	 * The cached value of the '{@link #getInput__iButtonStateRemote() <em>Input iButton State Remote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iButtonStateRemote()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iButtonStateRemote;

	/**
	 * The cached value of the '{@link #getOutput__oButtonState() <em>Output oButton State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oButtonState()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oButtonState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit80Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT80;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iAccessState() {
		if (input__iAccessState != null && input__iAccessState.eIsProxy()) {
			InternalEObject oldInput__iAccessState = (InternalEObject)input__iAccessState;
			input__iAccessState = (WTCInput)eResolveProxy(oldInput__iAccessState);
			if (input__iAccessState != oldInput__iAccessState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT80__INPUT_IACCESS_STATE, oldInput__iAccessState, input__iAccessState));
			}
		}
		return input__iAccessState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iAccessState() {
		return input__iAccessState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iAccessState(WTCInput newInput__iAccessState) {
		WTCInput oldInput__iAccessState = input__iAccessState;
		input__iAccessState = newInput__iAccessState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT80__INPUT_IACCESS_STATE, oldInput__iAccessState, input__iAccessState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iMaintenanceStatus() {
		if (input__iMaintenanceStatus != null && input__iMaintenanceStatus.eIsProxy()) {
			InternalEObject oldInput__iMaintenanceStatus = (InternalEObject)input__iMaintenanceStatus;
			input__iMaintenanceStatus = (WTCInput)eResolveProxy(oldInput__iMaintenanceStatus);
			if (input__iMaintenanceStatus != oldInput__iMaintenanceStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT80__INPUT_IMAINTENANCE_STATUS, oldInput__iMaintenanceStatus, input__iMaintenanceStatus));
			}
		}
		return input__iMaintenanceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iMaintenanceStatus() {
		return input__iMaintenanceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iMaintenanceStatus(WTCInput newInput__iMaintenanceStatus) {
		WTCInput oldInput__iMaintenanceStatus = input__iMaintenanceStatus;
		input__iMaintenanceStatus = newInput__iMaintenanceStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT80__INPUT_IMAINTENANCE_STATUS, oldInput__iMaintenanceStatus, input__iMaintenanceStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iButtonStateNC2() {
		if (input__iButtonStateNC2 != null && input__iButtonStateNC2.eIsProxy()) {
			InternalEObject oldInput__iButtonStateNC2 = (InternalEObject)input__iButtonStateNC2;
			input__iButtonStateNC2 = (WTCInput)eResolveProxy(oldInput__iButtonStateNC2);
			if (input__iButtonStateNC2 != oldInput__iButtonStateNC2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_NC2, oldInput__iButtonStateNC2, input__iButtonStateNC2));
			}
		}
		return input__iButtonStateNC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iButtonStateNC2() {
		return input__iButtonStateNC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iButtonStateNC2(WTCInput newInput__iButtonStateNC2) {
		WTCInput oldInput__iButtonStateNC2 = input__iButtonStateNC2;
		input__iButtonStateNC2 = newInput__iButtonStateNC2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_NC2, oldInput__iButtonStateNC2, input__iButtonStateNC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iButtonStateTC() {
		if (input__iButtonStateTC != null && input__iButtonStateTC.eIsProxy()) {
			InternalEObject oldInput__iButtonStateTC = (InternalEObject)input__iButtonStateTC;
			input__iButtonStateTC = (WTCInput)eResolveProxy(oldInput__iButtonStateTC);
			if (input__iButtonStateTC != oldInput__iButtonStateTC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_TC, oldInput__iButtonStateTC, input__iButtonStateTC));
			}
		}
		return input__iButtonStateTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iButtonStateTC() {
		return input__iButtonStateTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iButtonStateTC(WTCInput newInput__iButtonStateTC) {
		WTCInput oldInput__iButtonStateTC = input__iButtonStateTC;
		input__iButtonStateTC = newInput__iButtonStateTC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_TC, oldInput__iButtonStateTC, input__iButtonStateTC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iButtonStateRemote() {
		if (input__iButtonStateRemote != null && input__iButtonStateRemote.eIsProxy()) {
			InternalEObject oldInput__iButtonStateRemote = (InternalEObject)input__iButtonStateRemote;
			input__iButtonStateRemote = (WTCInput)eResolveProxy(oldInput__iButtonStateRemote);
			if (input__iButtonStateRemote != oldInput__iButtonStateRemote) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_REMOTE, oldInput__iButtonStateRemote, input__iButtonStateRemote));
			}
		}
		return input__iButtonStateRemote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iButtonStateRemote() {
		return input__iButtonStateRemote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iButtonStateRemote(WTCInput newInput__iButtonStateRemote) {
		WTCInput oldInput__iButtonStateRemote = input__iButtonStateRemote;
		input__iButtonStateRemote = newInput__iButtonStateRemote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_REMOTE, oldInput__iButtonStateRemote, input__iButtonStateRemote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oButtonState() {
		if (output__oButtonState != null && output__oButtonState.eIsProxy()) {
			InternalEObject oldOutput__oButtonState = (InternalEObject)output__oButtonState;
			output__oButtonState = (WTCOutput)eResolveProxy(oldOutput__oButtonState);
			if (output__oButtonState != oldOutput__oButtonState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT80__OUTPUT_OBUTTON_STATE, oldOutput__oButtonState, output__oButtonState));
			}
		}
		return output__oButtonState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oButtonState() {
		return output__oButtonState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oButtonState(WTCOutput newOutput__oButtonState) {
		WTCOutput oldOutput__oButtonState = output__oButtonState;
		output__oButtonState = newOutput__oButtonState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT80__OUTPUT_OBUTTON_STATE, oldOutput__oButtonState, output__oButtonState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT80__INPUT_IACCESS_STATE:
				if (resolve) return getInput__iAccessState();
				return basicGetInput__iAccessState();
			case WTSpecPackage.CTRL_UNIT80__INPUT_IMAINTENANCE_STATUS:
				if (resolve) return getInput__iMaintenanceStatus();
				return basicGetInput__iMaintenanceStatus();
			case WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_NC2:
				if (resolve) return getInput__iButtonStateNC2();
				return basicGetInput__iButtonStateNC2();
			case WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_TC:
				if (resolve) return getInput__iButtonStateTC();
				return basicGetInput__iButtonStateTC();
			case WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_REMOTE:
				if (resolve) return getInput__iButtonStateRemote();
				return basicGetInput__iButtonStateRemote();
			case WTSpecPackage.CTRL_UNIT80__OUTPUT_OBUTTON_STATE:
				if (resolve) return getOutput__oButtonState();
				return basicGetOutput__oButtonState();
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
			case WTSpecPackage.CTRL_UNIT80__INPUT_IACCESS_STATE:
				setInput__iAccessState((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT80__INPUT_IMAINTENANCE_STATUS:
				setInput__iMaintenanceStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_NC2:
				setInput__iButtonStateNC2((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_TC:
				setInput__iButtonStateTC((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_REMOTE:
				setInput__iButtonStateRemote((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT80__OUTPUT_OBUTTON_STATE:
				setOutput__oButtonState((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT80__INPUT_IACCESS_STATE:
				setInput__iAccessState((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT80__INPUT_IMAINTENANCE_STATUS:
				setInput__iMaintenanceStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_NC2:
				setInput__iButtonStateNC2((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_TC:
				setInput__iButtonStateTC((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_REMOTE:
				setInput__iButtonStateRemote((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT80__OUTPUT_OBUTTON_STATE:
				setOutput__oButtonState((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT80__INPUT_IACCESS_STATE:
				return input__iAccessState != null;
			case WTSpecPackage.CTRL_UNIT80__INPUT_IMAINTENANCE_STATUS:
				return input__iMaintenanceStatus != null;
			case WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_NC2:
				return input__iButtonStateNC2 != null;
			case WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_TC:
				return input__iButtonStateTC != null;
			case WTSpecPackage.CTRL_UNIT80__INPUT_IBUTTON_STATE_REMOTE:
				return input__iButtonStateRemote != null;
			case WTSpecPackage.CTRL_UNIT80__OUTPUT_OBUTTON_STATE:
				return output__oButtonState != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit80Impl
