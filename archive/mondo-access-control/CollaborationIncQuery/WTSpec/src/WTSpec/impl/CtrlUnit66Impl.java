/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit66;
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
 * An implementation of the model object '<em><b>Ctrl Unit66</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit66Impl#getInput__iMaintenancePreventiveButton <em>Input iMaintenance Preventive Button</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit66Impl#getInput__iMaintenanceCorrectiveButton <em>Input iMaintenance Corrective Button</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit66Impl#getInput__iDontCheckInput <em>Input iDont Check Input</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit66Impl#getOutput__oMaintenanceStatus <em>Output oMaintenance Status</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit66Impl#getFault__fMaintenancePreventive <em>Fault fMaintenance Preventive</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit66Impl#getFault__fMaintenanceCorrective <em>Fault fMaintenance Corrective</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit66Impl extends wtcImpl implements CtrlUnit66 {
	/**
	 * The cached value of the '{@link #getInput__iMaintenancePreventiveButton() <em>Input iMaintenance Preventive Button</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iMaintenancePreventiveButton()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iMaintenancePreventiveButton;

	/**
	 * The cached value of the '{@link #getInput__iMaintenanceCorrectiveButton() <em>Input iMaintenance Corrective Button</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iMaintenanceCorrectiveButton()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iMaintenanceCorrectiveButton;

	/**
	 * The cached value of the '{@link #getInput__iDontCheckInput() <em>Input iDont Check Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iDontCheckInput()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iDontCheckInput;

	/**
	 * The cached value of the '{@link #getOutput__oMaintenanceStatus() <em>Output oMaintenance Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oMaintenanceStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oMaintenanceStatus;

	/**
	 * The cached value of the '{@link #getFault__fMaintenancePreventive() <em>Fault fMaintenance Preventive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fMaintenancePreventive()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fMaintenancePreventive;

	/**
	 * The cached value of the '{@link #getFault__fMaintenanceCorrective() <em>Fault fMaintenance Corrective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fMaintenanceCorrective()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fMaintenanceCorrective;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit66Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT66;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iMaintenancePreventiveButton() {
		if (input__iMaintenancePreventiveButton != null && input__iMaintenancePreventiveButton.eIsProxy()) {
			InternalEObject oldInput__iMaintenancePreventiveButton = (InternalEObject)input__iMaintenancePreventiveButton;
			input__iMaintenancePreventiveButton = (WTCInput)eResolveProxy(oldInput__iMaintenancePreventiveButton);
			if (input__iMaintenancePreventiveButton != oldInput__iMaintenancePreventiveButton) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT66__INPUT_IMAINTENANCE_PREVENTIVE_BUTTON, oldInput__iMaintenancePreventiveButton, input__iMaintenancePreventiveButton));
			}
		}
		return input__iMaintenancePreventiveButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iMaintenancePreventiveButton() {
		return input__iMaintenancePreventiveButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iMaintenancePreventiveButton(WTCInput newInput__iMaintenancePreventiveButton) {
		WTCInput oldInput__iMaintenancePreventiveButton = input__iMaintenancePreventiveButton;
		input__iMaintenancePreventiveButton = newInput__iMaintenancePreventiveButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT66__INPUT_IMAINTENANCE_PREVENTIVE_BUTTON, oldInput__iMaintenancePreventiveButton, input__iMaintenancePreventiveButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iMaintenanceCorrectiveButton() {
		if (input__iMaintenanceCorrectiveButton != null && input__iMaintenanceCorrectiveButton.eIsProxy()) {
			InternalEObject oldInput__iMaintenanceCorrectiveButton = (InternalEObject)input__iMaintenanceCorrectiveButton;
			input__iMaintenanceCorrectiveButton = (WTCInput)eResolveProxy(oldInput__iMaintenanceCorrectiveButton);
			if (input__iMaintenanceCorrectiveButton != oldInput__iMaintenanceCorrectiveButton) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT66__INPUT_IMAINTENANCE_CORRECTIVE_BUTTON, oldInput__iMaintenanceCorrectiveButton, input__iMaintenanceCorrectiveButton));
			}
		}
		return input__iMaintenanceCorrectiveButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iMaintenanceCorrectiveButton() {
		return input__iMaintenanceCorrectiveButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iMaintenanceCorrectiveButton(WTCInput newInput__iMaintenanceCorrectiveButton) {
		WTCInput oldInput__iMaintenanceCorrectiveButton = input__iMaintenanceCorrectiveButton;
		input__iMaintenanceCorrectiveButton = newInput__iMaintenanceCorrectiveButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT66__INPUT_IMAINTENANCE_CORRECTIVE_BUTTON, oldInput__iMaintenanceCorrectiveButton, input__iMaintenanceCorrectiveButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iDontCheckInput() {
		if (input__iDontCheckInput != null && input__iDontCheckInput.eIsProxy()) {
			InternalEObject oldInput__iDontCheckInput = (InternalEObject)input__iDontCheckInput;
			input__iDontCheckInput = (WTCInput)eResolveProxy(oldInput__iDontCheckInput);
			if (input__iDontCheckInput != oldInput__iDontCheckInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT66__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
			}
		}
		return input__iDontCheckInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iDontCheckInput() {
		return input__iDontCheckInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iDontCheckInput(WTCInput newInput__iDontCheckInput) {
		WTCInput oldInput__iDontCheckInput = input__iDontCheckInput;
		input__iDontCheckInput = newInput__iDontCheckInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT66__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oMaintenanceStatus() {
		if (output__oMaintenanceStatus != null && output__oMaintenanceStatus.eIsProxy()) {
			InternalEObject oldOutput__oMaintenanceStatus = (InternalEObject)output__oMaintenanceStatus;
			output__oMaintenanceStatus = (WTCOutput)eResolveProxy(oldOutput__oMaintenanceStatus);
			if (output__oMaintenanceStatus != oldOutput__oMaintenanceStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT66__OUTPUT_OMAINTENANCE_STATUS, oldOutput__oMaintenanceStatus, output__oMaintenanceStatus));
			}
		}
		return output__oMaintenanceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oMaintenanceStatus() {
		return output__oMaintenanceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oMaintenanceStatus(WTCOutput newOutput__oMaintenanceStatus) {
		WTCOutput oldOutput__oMaintenanceStatus = output__oMaintenanceStatus;
		output__oMaintenanceStatus = newOutput__oMaintenanceStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT66__OUTPUT_OMAINTENANCE_STATUS, oldOutput__oMaintenanceStatus, output__oMaintenanceStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fMaintenancePreventive() {
		if (fault__fMaintenancePreventive != null && fault__fMaintenancePreventive.eIsProxy()) {
			InternalEObject oldFault__fMaintenancePreventive = (InternalEObject)fault__fMaintenancePreventive;
			fault__fMaintenancePreventive = (WTCFault)eResolveProxy(oldFault__fMaintenancePreventive);
			if (fault__fMaintenancePreventive != oldFault__fMaintenancePreventive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT66__FAULT_FMAINTENANCE_PREVENTIVE, oldFault__fMaintenancePreventive, fault__fMaintenancePreventive));
			}
		}
		return fault__fMaintenancePreventive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fMaintenancePreventive() {
		return fault__fMaintenancePreventive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fMaintenancePreventive(WTCFault newFault__fMaintenancePreventive) {
		WTCFault oldFault__fMaintenancePreventive = fault__fMaintenancePreventive;
		fault__fMaintenancePreventive = newFault__fMaintenancePreventive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT66__FAULT_FMAINTENANCE_PREVENTIVE, oldFault__fMaintenancePreventive, fault__fMaintenancePreventive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fMaintenanceCorrective() {
		if (fault__fMaintenanceCorrective != null && fault__fMaintenanceCorrective.eIsProxy()) {
			InternalEObject oldFault__fMaintenanceCorrective = (InternalEObject)fault__fMaintenanceCorrective;
			fault__fMaintenanceCorrective = (WTCFault)eResolveProxy(oldFault__fMaintenanceCorrective);
			if (fault__fMaintenanceCorrective != oldFault__fMaintenanceCorrective) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT66__FAULT_FMAINTENANCE_CORRECTIVE, oldFault__fMaintenanceCorrective, fault__fMaintenanceCorrective));
			}
		}
		return fault__fMaintenanceCorrective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fMaintenanceCorrective() {
		return fault__fMaintenanceCorrective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fMaintenanceCorrective(WTCFault newFault__fMaintenanceCorrective) {
		WTCFault oldFault__fMaintenanceCorrective = fault__fMaintenanceCorrective;
		fault__fMaintenanceCorrective = newFault__fMaintenanceCorrective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT66__FAULT_FMAINTENANCE_CORRECTIVE, oldFault__fMaintenanceCorrective, fault__fMaintenanceCorrective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT66__INPUT_IMAINTENANCE_PREVENTIVE_BUTTON:
				if (resolve) return getInput__iMaintenancePreventiveButton();
				return basicGetInput__iMaintenancePreventiveButton();
			case WTSpecPackage.CTRL_UNIT66__INPUT_IMAINTENANCE_CORRECTIVE_BUTTON:
				if (resolve) return getInput__iMaintenanceCorrectiveButton();
				return basicGetInput__iMaintenanceCorrectiveButton();
			case WTSpecPackage.CTRL_UNIT66__INPUT_IDONT_CHECK_INPUT:
				if (resolve) return getInput__iDontCheckInput();
				return basicGetInput__iDontCheckInput();
			case WTSpecPackage.CTRL_UNIT66__OUTPUT_OMAINTENANCE_STATUS:
				if (resolve) return getOutput__oMaintenanceStatus();
				return basicGetOutput__oMaintenanceStatus();
			case WTSpecPackage.CTRL_UNIT66__FAULT_FMAINTENANCE_PREVENTIVE:
				if (resolve) return getFault__fMaintenancePreventive();
				return basicGetFault__fMaintenancePreventive();
			case WTSpecPackage.CTRL_UNIT66__FAULT_FMAINTENANCE_CORRECTIVE:
				if (resolve) return getFault__fMaintenanceCorrective();
				return basicGetFault__fMaintenanceCorrective();
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
			case WTSpecPackage.CTRL_UNIT66__INPUT_IMAINTENANCE_PREVENTIVE_BUTTON:
				setInput__iMaintenancePreventiveButton((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT66__INPUT_IMAINTENANCE_CORRECTIVE_BUTTON:
				setInput__iMaintenanceCorrectiveButton((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT66__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT66__OUTPUT_OMAINTENANCE_STATUS:
				setOutput__oMaintenanceStatus((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT66__FAULT_FMAINTENANCE_PREVENTIVE:
				setFault__fMaintenancePreventive((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT66__FAULT_FMAINTENANCE_CORRECTIVE:
				setFault__fMaintenanceCorrective((WTCFault)newValue);
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
			case WTSpecPackage.CTRL_UNIT66__INPUT_IMAINTENANCE_PREVENTIVE_BUTTON:
				setInput__iMaintenancePreventiveButton((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT66__INPUT_IMAINTENANCE_CORRECTIVE_BUTTON:
				setInput__iMaintenanceCorrectiveButton((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT66__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT66__OUTPUT_OMAINTENANCE_STATUS:
				setOutput__oMaintenanceStatus((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT66__FAULT_FMAINTENANCE_PREVENTIVE:
				setFault__fMaintenancePreventive((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT66__FAULT_FMAINTENANCE_CORRECTIVE:
				setFault__fMaintenanceCorrective((WTCFault)null);
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
			case WTSpecPackage.CTRL_UNIT66__INPUT_IMAINTENANCE_PREVENTIVE_BUTTON:
				return input__iMaintenancePreventiveButton != null;
			case WTSpecPackage.CTRL_UNIT66__INPUT_IMAINTENANCE_CORRECTIVE_BUTTON:
				return input__iMaintenanceCorrectiveButton != null;
			case WTSpecPackage.CTRL_UNIT66__INPUT_IDONT_CHECK_INPUT:
				return input__iDontCheckInput != null;
			case WTSpecPackage.CTRL_UNIT66__OUTPUT_OMAINTENANCE_STATUS:
				return output__oMaintenanceStatus != null;
			case WTSpecPackage.CTRL_UNIT66__FAULT_FMAINTENANCE_PREVENTIVE:
				return fault__fMaintenancePreventive != null;
			case WTSpecPackage.CTRL_UNIT66__FAULT_FMAINTENANCE_CORRECTIVE:
				return fault__fMaintenanceCorrective != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit66Impl
