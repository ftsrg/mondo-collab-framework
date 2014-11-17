/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit121;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit121</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit121Impl#getInput__iManualYawPreCommand <em>Input iManual Yaw Pre Command</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit121Impl#getInput__iMaxTwistPreCommand <em>Input iMax Twist Pre Command</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit121Impl#getInput__iRetwistPreCommand <em>Input iRetwist Pre Command</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit121Impl#getInput__iRelWindPreCommand <em>Input iRel Wind Pre Command</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit121Impl#getOutput__oYawCommand <em>Output oYaw Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit121Impl extends wtcImpl implements CtrlUnit121 {
	/**
	 * The cached value of the '{@link #getInput__iManualYawPreCommand() <em>Input iManual Yaw Pre Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iManualYawPreCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iManualYawPreCommand;

	/**
	 * The cached value of the '{@link #getInput__iMaxTwistPreCommand() <em>Input iMax Twist Pre Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iMaxTwistPreCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iMaxTwistPreCommand;

	/**
	 * The cached value of the '{@link #getInput__iRetwistPreCommand() <em>Input iRetwist Pre Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iRetwistPreCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iRetwistPreCommand;

	/**
	 * The cached value of the '{@link #getInput__iRelWindPreCommand() <em>Input iRel Wind Pre Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iRelWindPreCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iRelWindPreCommand;

	/**
	 * The cached value of the '{@link #getOutput__oYawCommand() <em>Output oYaw Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oYawCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oYawCommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit121Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit121();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iManualYawPreCommand() {
		if (input__iManualYawPreCommand != null && input__iManualYawPreCommand.eIsProxy()) {
			InternalEObject oldInput__iManualYawPreCommand = (InternalEObject)input__iManualYawPreCommand;
			input__iManualYawPreCommand = (WTCInput)eResolveProxy(oldInput__iManualYawPreCommand);
			if (input__iManualYawPreCommand != oldInput__iManualYawPreCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT121__INPUT_IMANUAL_YAW_PRE_COMMAND, oldInput__iManualYawPreCommand, input__iManualYawPreCommand));
			}
		}
		return input__iManualYawPreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iManualYawPreCommand() {
		return input__iManualYawPreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iManualYawPreCommand(WTCInput newInput__iManualYawPreCommand) {
		WTCInput oldInput__iManualYawPreCommand = input__iManualYawPreCommand;
		input__iManualYawPreCommand = newInput__iManualYawPreCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT121__INPUT_IMANUAL_YAW_PRE_COMMAND, oldInput__iManualYawPreCommand, input__iManualYawPreCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iMaxTwistPreCommand() {
		if (input__iMaxTwistPreCommand != null && input__iMaxTwistPreCommand.eIsProxy()) {
			InternalEObject oldInput__iMaxTwistPreCommand = (InternalEObject)input__iMaxTwistPreCommand;
			input__iMaxTwistPreCommand = (WTCInput)eResolveProxy(oldInput__iMaxTwistPreCommand);
			if (input__iMaxTwistPreCommand != oldInput__iMaxTwistPreCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT121__INPUT_IMAX_TWIST_PRE_COMMAND, oldInput__iMaxTwistPreCommand, input__iMaxTwistPreCommand));
			}
		}
		return input__iMaxTwistPreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iMaxTwistPreCommand() {
		return input__iMaxTwistPreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iMaxTwistPreCommand(WTCInput newInput__iMaxTwistPreCommand) {
		WTCInput oldInput__iMaxTwistPreCommand = input__iMaxTwistPreCommand;
		input__iMaxTwistPreCommand = newInput__iMaxTwistPreCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT121__INPUT_IMAX_TWIST_PRE_COMMAND, oldInput__iMaxTwistPreCommand, input__iMaxTwistPreCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iRetwistPreCommand() {
		if (input__iRetwistPreCommand != null && input__iRetwistPreCommand.eIsProxy()) {
			InternalEObject oldInput__iRetwistPreCommand = (InternalEObject)input__iRetwistPreCommand;
			input__iRetwistPreCommand = (WTCInput)eResolveProxy(oldInput__iRetwistPreCommand);
			if (input__iRetwistPreCommand != oldInput__iRetwistPreCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT121__INPUT_IRETWIST_PRE_COMMAND, oldInput__iRetwistPreCommand, input__iRetwistPreCommand));
			}
		}
		return input__iRetwistPreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iRetwistPreCommand() {
		return input__iRetwistPreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iRetwistPreCommand(WTCInput newInput__iRetwistPreCommand) {
		WTCInput oldInput__iRetwistPreCommand = input__iRetwistPreCommand;
		input__iRetwistPreCommand = newInput__iRetwistPreCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT121__INPUT_IRETWIST_PRE_COMMAND, oldInput__iRetwistPreCommand, input__iRetwistPreCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iRelWindPreCommand() {
		if (input__iRelWindPreCommand != null && input__iRelWindPreCommand.eIsProxy()) {
			InternalEObject oldInput__iRelWindPreCommand = (InternalEObject)input__iRelWindPreCommand;
			input__iRelWindPreCommand = (WTCInput)eResolveProxy(oldInput__iRelWindPreCommand);
			if (input__iRelWindPreCommand != oldInput__iRelWindPreCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT121__INPUT_IREL_WIND_PRE_COMMAND, oldInput__iRelWindPreCommand, input__iRelWindPreCommand));
			}
		}
		return input__iRelWindPreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iRelWindPreCommand() {
		return input__iRelWindPreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iRelWindPreCommand(WTCInput newInput__iRelWindPreCommand) {
		WTCInput oldInput__iRelWindPreCommand = input__iRelWindPreCommand;
		input__iRelWindPreCommand = newInput__iRelWindPreCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT121__INPUT_IREL_WIND_PRE_COMMAND, oldInput__iRelWindPreCommand, input__iRelWindPreCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oYawCommand() {
		if (output__oYawCommand != null && output__oYawCommand.eIsProxy()) {
			InternalEObject oldOutput__oYawCommand = (InternalEObject)output__oYawCommand;
			output__oYawCommand = (WTCOutput)eResolveProxy(oldOutput__oYawCommand);
			if (output__oYawCommand != oldOutput__oYawCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT121__OUTPUT_OYAW_COMMAND, oldOutput__oYawCommand, output__oYawCommand));
			}
		}
		return output__oYawCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oYawCommand() {
		return output__oYawCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oYawCommand(WTCOutput newOutput__oYawCommand) {
		WTCOutput oldOutput__oYawCommand = output__oYawCommand;
		output__oYawCommand = newOutput__oYawCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT121__OUTPUT_OYAW_COMMAND, oldOutput__oYawCommand, output__oYawCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT121__INPUT_IMANUAL_YAW_PRE_COMMAND:
				if (resolve) return getInput__iManualYawPreCommand();
				return basicGetInput__iManualYawPreCommand();
			case WTSpecPackage.CTRL_UNIT121__INPUT_IMAX_TWIST_PRE_COMMAND:
				if (resolve) return getInput__iMaxTwistPreCommand();
				return basicGetInput__iMaxTwistPreCommand();
			case WTSpecPackage.CTRL_UNIT121__INPUT_IRETWIST_PRE_COMMAND:
				if (resolve) return getInput__iRetwistPreCommand();
				return basicGetInput__iRetwistPreCommand();
			case WTSpecPackage.CTRL_UNIT121__INPUT_IREL_WIND_PRE_COMMAND:
				if (resolve) return getInput__iRelWindPreCommand();
				return basicGetInput__iRelWindPreCommand();
			case WTSpecPackage.CTRL_UNIT121__OUTPUT_OYAW_COMMAND:
				if (resolve) return getOutput__oYawCommand();
				return basicGetOutput__oYawCommand();
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
			case WTSpecPackage.CTRL_UNIT121__INPUT_IMANUAL_YAW_PRE_COMMAND:
				setInput__iManualYawPreCommand((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT121__INPUT_IMAX_TWIST_PRE_COMMAND:
				setInput__iMaxTwistPreCommand((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT121__INPUT_IRETWIST_PRE_COMMAND:
				setInput__iRetwistPreCommand((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT121__INPUT_IREL_WIND_PRE_COMMAND:
				setInput__iRelWindPreCommand((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT121__OUTPUT_OYAW_COMMAND:
				setOutput__oYawCommand((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT121__INPUT_IMANUAL_YAW_PRE_COMMAND:
				setInput__iManualYawPreCommand((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT121__INPUT_IMAX_TWIST_PRE_COMMAND:
				setInput__iMaxTwistPreCommand((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT121__INPUT_IRETWIST_PRE_COMMAND:
				setInput__iRetwistPreCommand((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT121__INPUT_IREL_WIND_PRE_COMMAND:
				setInput__iRelWindPreCommand((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT121__OUTPUT_OYAW_COMMAND:
				setOutput__oYawCommand((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT121__INPUT_IMANUAL_YAW_PRE_COMMAND:
				return input__iManualYawPreCommand != null;
			case WTSpecPackage.CTRL_UNIT121__INPUT_IMAX_TWIST_PRE_COMMAND:
				return input__iMaxTwistPreCommand != null;
			case WTSpecPackage.CTRL_UNIT121__INPUT_IRETWIST_PRE_COMMAND:
				return input__iRetwistPreCommand != null;
			case WTSpecPackage.CTRL_UNIT121__INPUT_IREL_WIND_PRE_COMMAND:
				return input__iRelWindPreCommand != null;
			case WTSpecPackage.CTRL_UNIT121__OUTPUT_OYAW_COMMAND:
				return output__oYawCommand != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit121Impl
