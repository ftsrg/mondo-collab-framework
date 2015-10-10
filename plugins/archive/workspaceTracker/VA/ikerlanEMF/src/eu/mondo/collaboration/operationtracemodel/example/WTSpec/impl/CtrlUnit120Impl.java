/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit120;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit120</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit120Impl#getInput__iYawCwFinalButton <em>Input iYaw Cw Final Button</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit120Impl#getInput__iYawCcwFinalButton <em>Input iYaw Ccw Final Button</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit120Impl#getOutput__oManualYawPreCommand <em>Output oManual Yaw Pre Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit120Impl extends wtcImpl implements CtrlUnit120 {
	/**
	 * The cached value of the '{@link #getInput__iYawCwFinalButton() <em>Input iYaw Cw Final Button</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iYawCwFinalButton()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iYawCwFinalButton;

	/**
	 * The cached value of the '{@link #getInput__iYawCcwFinalButton() <em>Input iYaw Ccw Final Button</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iYawCcwFinalButton()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iYawCcwFinalButton;

	/**
	 * The cached value of the '{@link #getOutput__oManualYawPreCommand() <em>Output oManual Yaw Pre Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oManualYawPreCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oManualYawPreCommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit120Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit120();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iYawCwFinalButton() {
		if (input__iYawCwFinalButton != null && input__iYawCwFinalButton.eIsProxy()) {
			InternalEObject oldInput__iYawCwFinalButton = (InternalEObject)input__iYawCwFinalButton;
			input__iYawCwFinalButton = (WTCInput)eResolveProxy(oldInput__iYawCwFinalButton);
			if (input__iYawCwFinalButton != oldInput__iYawCwFinalButton) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT120__INPUT_IYAW_CW_FINAL_BUTTON, oldInput__iYawCwFinalButton, input__iYawCwFinalButton));
			}
		}
		return input__iYawCwFinalButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iYawCwFinalButton() {
		return input__iYawCwFinalButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iYawCwFinalButton(WTCInput newInput__iYawCwFinalButton) {
		WTCInput oldInput__iYawCwFinalButton = input__iYawCwFinalButton;
		input__iYawCwFinalButton = newInput__iYawCwFinalButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT120__INPUT_IYAW_CW_FINAL_BUTTON, oldInput__iYawCwFinalButton, input__iYawCwFinalButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iYawCcwFinalButton() {
		if (input__iYawCcwFinalButton != null && input__iYawCcwFinalButton.eIsProxy()) {
			InternalEObject oldInput__iYawCcwFinalButton = (InternalEObject)input__iYawCcwFinalButton;
			input__iYawCcwFinalButton = (WTCInput)eResolveProxy(oldInput__iYawCcwFinalButton);
			if (input__iYawCcwFinalButton != oldInput__iYawCcwFinalButton) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT120__INPUT_IYAW_CCW_FINAL_BUTTON, oldInput__iYawCcwFinalButton, input__iYawCcwFinalButton));
			}
		}
		return input__iYawCcwFinalButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iYawCcwFinalButton() {
		return input__iYawCcwFinalButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iYawCcwFinalButton(WTCInput newInput__iYawCcwFinalButton) {
		WTCInput oldInput__iYawCcwFinalButton = input__iYawCcwFinalButton;
		input__iYawCcwFinalButton = newInput__iYawCcwFinalButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT120__INPUT_IYAW_CCW_FINAL_BUTTON, oldInput__iYawCcwFinalButton, input__iYawCcwFinalButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oManualYawPreCommand() {
		if (output__oManualYawPreCommand != null && output__oManualYawPreCommand.eIsProxy()) {
			InternalEObject oldOutput__oManualYawPreCommand = (InternalEObject)output__oManualYawPreCommand;
			output__oManualYawPreCommand = (WTCOutput)eResolveProxy(oldOutput__oManualYawPreCommand);
			if (output__oManualYawPreCommand != oldOutput__oManualYawPreCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT120__OUTPUT_OMANUAL_YAW_PRE_COMMAND, oldOutput__oManualYawPreCommand, output__oManualYawPreCommand));
			}
		}
		return output__oManualYawPreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oManualYawPreCommand() {
		return output__oManualYawPreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oManualYawPreCommand(WTCOutput newOutput__oManualYawPreCommand) {
		WTCOutput oldOutput__oManualYawPreCommand = output__oManualYawPreCommand;
		output__oManualYawPreCommand = newOutput__oManualYawPreCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT120__OUTPUT_OMANUAL_YAW_PRE_COMMAND, oldOutput__oManualYawPreCommand, output__oManualYawPreCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT120__INPUT_IYAW_CW_FINAL_BUTTON:
				if (resolve) return getInput__iYawCwFinalButton();
				return basicGetInput__iYawCwFinalButton();
			case WTSpecPackage.CTRL_UNIT120__INPUT_IYAW_CCW_FINAL_BUTTON:
				if (resolve) return getInput__iYawCcwFinalButton();
				return basicGetInput__iYawCcwFinalButton();
			case WTSpecPackage.CTRL_UNIT120__OUTPUT_OMANUAL_YAW_PRE_COMMAND:
				if (resolve) return getOutput__oManualYawPreCommand();
				return basicGetOutput__oManualYawPreCommand();
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
			case WTSpecPackage.CTRL_UNIT120__INPUT_IYAW_CW_FINAL_BUTTON:
				setInput__iYawCwFinalButton((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT120__INPUT_IYAW_CCW_FINAL_BUTTON:
				setInput__iYawCcwFinalButton((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT120__OUTPUT_OMANUAL_YAW_PRE_COMMAND:
				setOutput__oManualYawPreCommand((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT120__INPUT_IYAW_CW_FINAL_BUTTON:
				setInput__iYawCwFinalButton((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT120__INPUT_IYAW_CCW_FINAL_BUTTON:
				setInput__iYawCcwFinalButton((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT120__OUTPUT_OMANUAL_YAW_PRE_COMMAND:
				setOutput__oManualYawPreCommand((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT120__INPUT_IYAW_CW_FINAL_BUTTON:
				return input__iYawCwFinalButton != null;
			case WTSpecPackage.CTRL_UNIT120__INPUT_IYAW_CCW_FINAL_BUTTON:
				return input__iYawCcwFinalButton != null;
			case WTSpecPackage.CTRL_UNIT120__OUTPUT_OMANUAL_YAW_PRE_COMMAND:
				return output__oManualYawPreCommand != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit120Impl
