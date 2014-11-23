/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit119;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit119</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit119Impl#getInput__iManualYawBrakePreCommand <em>Input iManual Yaw Brake Pre Command</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit119Impl#getInput__iAutoYawBrakePreCommand <em>Input iAuto Yaw Brake Pre Command</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit119Impl#getOutput__oYawBrakeCommand <em>Output oYaw Brake Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit119Impl extends wtcImpl implements CtrlUnit119 {
	/**
	 * The cached value of the '{@link #getInput__iManualYawBrakePreCommand() <em>Input iManual Yaw Brake Pre Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iManualYawBrakePreCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iManualYawBrakePreCommand;

	/**
	 * The cached value of the '{@link #getInput__iAutoYawBrakePreCommand() <em>Input iAuto Yaw Brake Pre Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iAutoYawBrakePreCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iAutoYawBrakePreCommand;

	/**
	 * The cached value of the '{@link #getOutput__oYawBrakeCommand() <em>Output oYaw Brake Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oYawBrakeCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oYawBrakeCommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit119Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit119();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iManualYawBrakePreCommand() {
		if (input__iManualYawBrakePreCommand != null && input__iManualYawBrakePreCommand.eIsProxy()) {
			InternalEObject oldInput__iManualYawBrakePreCommand = (InternalEObject)input__iManualYawBrakePreCommand;
			input__iManualYawBrakePreCommand = (WTCInput)eResolveProxy(oldInput__iManualYawBrakePreCommand);
			if (input__iManualYawBrakePreCommand != oldInput__iManualYawBrakePreCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT119__INPUT_IMANUAL_YAW_BRAKE_PRE_COMMAND, oldInput__iManualYawBrakePreCommand, input__iManualYawBrakePreCommand));
			}
		}
		return input__iManualYawBrakePreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iManualYawBrakePreCommand() {
		return input__iManualYawBrakePreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iManualYawBrakePreCommand(WTCInput newInput__iManualYawBrakePreCommand) {
		WTCInput oldInput__iManualYawBrakePreCommand = input__iManualYawBrakePreCommand;
		input__iManualYawBrakePreCommand = newInput__iManualYawBrakePreCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT119__INPUT_IMANUAL_YAW_BRAKE_PRE_COMMAND, oldInput__iManualYawBrakePreCommand, input__iManualYawBrakePreCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iAutoYawBrakePreCommand() {
		if (input__iAutoYawBrakePreCommand != null && input__iAutoYawBrakePreCommand.eIsProxy()) {
			InternalEObject oldInput__iAutoYawBrakePreCommand = (InternalEObject)input__iAutoYawBrakePreCommand;
			input__iAutoYawBrakePreCommand = (WTCInput)eResolveProxy(oldInput__iAutoYawBrakePreCommand);
			if (input__iAutoYawBrakePreCommand != oldInput__iAutoYawBrakePreCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT119__INPUT_IAUTO_YAW_BRAKE_PRE_COMMAND, oldInput__iAutoYawBrakePreCommand, input__iAutoYawBrakePreCommand));
			}
		}
		return input__iAutoYawBrakePreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iAutoYawBrakePreCommand() {
		return input__iAutoYawBrakePreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iAutoYawBrakePreCommand(WTCInput newInput__iAutoYawBrakePreCommand) {
		WTCInput oldInput__iAutoYawBrakePreCommand = input__iAutoYawBrakePreCommand;
		input__iAutoYawBrakePreCommand = newInput__iAutoYawBrakePreCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT119__INPUT_IAUTO_YAW_BRAKE_PRE_COMMAND, oldInput__iAutoYawBrakePreCommand, input__iAutoYawBrakePreCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oYawBrakeCommand() {
		if (output__oYawBrakeCommand != null && output__oYawBrakeCommand.eIsProxy()) {
			InternalEObject oldOutput__oYawBrakeCommand = (InternalEObject)output__oYawBrakeCommand;
			output__oYawBrakeCommand = (WTCOutput)eResolveProxy(oldOutput__oYawBrakeCommand);
			if (output__oYawBrakeCommand != oldOutput__oYawBrakeCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT119__OUTPUT_OYAW_BRAKE_COMMAND, oldOutput__oYawBrakeCommand, output__oYawBrakeCommand));
			}
		}
		return output__oYawBrakeCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oYawBrakeCommand() {
		return output__oYawBrakeCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oYawBrakeCommand(WTCOutput newOutput__oYawBrakeCommand) {
		WTCOutput oldOutput__oYawBrakeCommand = output__oYawBrakeCommand;
		output__oYawBrakeCommand = newOutput__oYawBrakeCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT119__OUTPUT_OYAW_BRAKE_COMMAND, oldOutput__oYawBrakeCommand, output__oYawBrakeCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT119__INPUT_IMANUAL_YAW_BRAKE_PRE_COMMAND:
				if (resolve) return getInput__iManualYawBrakePreCommand();
				return basicGetInput__iManualYawBrakePreCommand();
			case WTSpecPackage.CTRL_UNIT119__INPUT_IAUTO_YAW_BRAKE_PRE_COMMAND:
				if (resolve) return getInput__iAutoYawBrakePreCommand();
				return basicGetInput__iAutoYawBrakePreCommand();
			case WTSpecPackage.CTRL_UNIT119__OUTPUT_OYAW_BRAKE_COMMAND:
				if (resolve) return getOutput__oYawBrakeCommand();
				return basicGetOutput__oYawBrakeCommand();
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
			case WTSpecPackage.CTRL_UNIT119__INPUT_IMANUAL_YAW_BRAKE_PRE_COMMAND:
				setInput__iManualYawBrakePreCommand((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT119__INPUT_IAUTO_YAW_BRAKE_PRE_COMMAND:
				setInput__iAutoYawBrakePreCommand((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT119__OUTPUT_OYAW_BRAKE_COMMAND:
				setOutput__oYawBrakeCommand((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT119__INPUT_IMANUAL_YAW_BRAKE_PRE_COMMAND:
				setInput__iManualYawBrakePreCommand((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT119__INPUT_IAUTO_YAW_BRAKE_PRE_COMMAND:
				setInput__iAutoYawBrakePreCommand((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT119__OUTPUT_OYAW_BRAKE_COMMAND:
				setOutput__oYawBrakeCommand((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT119__INPUT_IMANUAL_YAW_BRAKE_PRE_COMMAND:
				return input__iManualYawBrakePreCommand != null;
			case WTSpecPackage.CTRL_UNIT119__INPUT_IAUTO_YAW_BRAKE_PRE_COMMAND:
				return input__iAutoYawBrakePreCommand != null;
			case WTSpecPackage.CTRL_UNIT119__OUTPUT_OYAW_BRAKE_COMMAND:
				return output__oYawBrakeCommand != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit119Impl
