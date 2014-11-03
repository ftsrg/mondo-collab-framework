/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit98;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit98</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit98Impl#getInput__iSafetyLineStopped <em>Input iSafety Line Stopped</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit98Impl#getOutput__oEmergencyRearmCommand <em>Output oEmergency Rearm Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit98Impl extends wtcImpl implements CtrlUnit98 {
	/**
	 * The cached value of the '{@link #getInput__iSafetyLineStopped() <em>Input iSafety Line Stopped</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iSafetyLineStopped()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iSafetyLineStopped;

	/**
	 * The cached value of the '{@link #getOutput__oEmergencyRearmCommand() <em>Output oEmergency Rearm Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oEmergencyRearmCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oEmergencyRearmCommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit98Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT98;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iSafetyLineStopped() {
		if (input__iSafetyLineStopped != null && input__iSafetyLineStopped.eIsProxy()) {
			InternalEObject oldInput__iSafetyLineStopped = (InternalEObject)input__iSafetyLineStopped;
			input__iSafetyLineStopped = (WTCInput)eResolveProxy(oldInput__iSafetyLineStopped);
			if (input__iSafetyLineStopped != oldInput__iSafetyLineStopped) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT98__INPUT_ISAFETY_LINE_STOPPED, oldInput__iSafetyLineStopped, input__iSafetyLineStopped));
			}
		}
		return input__iSafetyLineStopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iSafetyLineStopped() {
		return input__iSafetyLineStopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iSafetyLineStopped(WTCInput newInput__iSafetyLineStopped) {
		WTCInput oldInput__iSafetyLineStopped = input__iSafetyLineStopped;
		input__iSafetyLineStopped = newInput__iSafetyLineStopped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT98__INPUT_ISAFETY_LINE_STOPPED, oldInput__iSafetyLineStopped, input__iSafetyLineStopped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oEmergencyRearmCommand() {
		if (output__oEmergencyRearmCommand != null && output__oEmergencyRearmCommand.eIsProxy()) {
			InternalEObject oldOutput__oEmergencyRearmCommand = (InternalEObject)output__oEmergencyRearmCommand;
			output__oEmergencyRearmCommand = (WTCOutput)eResolveProxy(oldOutput__oEmergencyRearmCommand);
			if (output__oEmergencyRearmCommand != oldOutput__oEmergencyRearmCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT98__OUTPUT_OEMERGENCY_REARM_COMMAND, oldOutput__oEmergencyRearmCommand, output__oEmergencyRearmCommand));
			}
		}
		return output__oEmergencyRearmCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oEmergencyRearmCommand() {
		return output__oEmergencyRearmCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oEmergencyRearmCommand(WTCOutput newOutput__oEmergencyRearmCommand) {
		WTCOutput oldOutput__oEmergencyRearmCommand = output__oEmergencyRearmCommand;
		output__oEmergencyRearmCommand = newOutput__oEmergencyRearmCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT98__OUTPUT_OEMERGENCY_REARM_COMMAND, oldOutput__oEmergencyRearmCommand, output__oEmergencyRearmCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT98__INPUT_ISAFETY_LINE_STOPPED:
				if (resolve) return getInput__iSafetyLineStopped();
				return basicGetInput__iSafetyLineStopped();
			case WTSpecPackage.CTRL_UNIT98__OUTPUT_OEMERGENCY_REARM_COMMAND:
				if (resolve) return getOutput__oEmergencyRearmCommand();
				return basicGetOutput__oEmergencyRearmCommand();
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
			case WTSpecPackage.CTRL_UNIT98__INPUT_ISAFETY_LINE_STOPPED:
				setInput__iSafetyLineStopped((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT98__OUTPUT_OEMERGENCY_REARM_COMMAND:
				setOutput__oEmergencyRearmCommand((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT98__INPUT_ISAFETY_LINE_STOPPED:
				setInput__iSafetyLineStopped((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT98__OUTPUT_OEMERGENCY_REARM_COMMAND:
				setOutput__oEmergencyRearmCommand((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT98__INPUT_ISAFETY_LINE_STOPPED:
				return input__iSafetyLineStopped != null;
			case WTSpecPackage.CTRL_UNIT98__OUTPUT_OEMERGENCY_REARM_COMMAND:
				return output__oEmergencyRearmCommand != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit98Impl
