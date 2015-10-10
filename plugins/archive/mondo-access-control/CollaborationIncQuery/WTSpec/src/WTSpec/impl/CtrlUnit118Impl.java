/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit118;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit118</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit118Impl#getInput__iYawBrakeStatus <em>Input iYaw Brake Status</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit118Impl#getInput__iRetwistPreCommand <em>Input iRetwist Pre Command</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit118Impl#getInput__iYawBrakeCommand <em>Input iYaw Brake Command</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit118Impl#getOutput__oYawHydraulicbrake2Order <em>Output oYaw Hydraulicbrake2 Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit118Impl extends wtcImpl implements CtrlUnit118 {
	/**
	 * The cached value of the '{@link #getInput__iYawBrakeStatus() <em>Input iYaw Brake Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iYawBrakeStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iYawBrakeStatus;

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
	 * The cached value of the '{@link #getInput__iYawBrakeCommand() <em>Input iYaw Brake Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iYawBrakeCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iYawBrakeCommand;

	/**
	 * The cached value of the '{@link #getOutput__oYawHydraulicbrake2Order() <em>Output oYaw Hydraulicbrake2 Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oYawHydraulicbrake2Order()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oYawHydraulicbrake2Order;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit118Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT118;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iYawBrakeStatus() {
		if (input__iYawBrakeStatus != null && input__iYawBrakeStatus.eIsProxy()) {
			InternalEObject oldInput__iYawBrakeStatus = (InternalEObject)input__iYawBrakeStatus;
			input__iYawBrakeStatus = (WTCInput)eResolveProxy(oldInput__iYawBrakeStatus);
			if (input__iYawBrakeStatus != oldInput__iYawBrakeStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT118__INPUT_IYAW_BRAKE_STATUS, oldInput__iYawBrakeStatus, input__iYawBrakeStatus));
			}
		}
		return input__iYawBrakeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iYawBrakeStatus() {
		return input__iYawBrakeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iYawBrakeStatus(WTCInput newInput__iYawBrakeStatus) {
		WTCInput oldInput__iYawBrakeStatus = input__iYawBrakeStatus;
		input__iYawBrakeStatus = newInput__iYawBrakeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT118__INPUT_IYAW_BRAKE_STATUS, oldInput__iYawBrakeStatus, input__iYawBrakeStatus));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT118__INPUT_IRETWIST_PRE_COMMAND, oldInput__iRetwistPreCommand, input__iRetwistPreCommand));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT118__INPUT_IRETWIST_PRE_COMMAND, oldInput__iRetwistPreCommand, input__iRetwistPreCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iYawBrakeCommand() {
		if (input__iYawBrakeCommand != null && input__iYawBrakeCommand.eIsProxy()) {
			InternalEObject oldInput__iYawBrakeCommand = (InternalEObject)input__iYawBrakeCommand;
			input__iYawBrakeCommand = (WTCInput)eResolveProxy(oldInput__iYawBrakeCommand);
			if (input__iYawBrakeCommand != oldInput__iYawBrakeCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT118__INPUT_IYAW_BRAKE_COMMAND, oldInput__iYawBrakeCommand, input__iYawBrakeCommand));
			}
		}
		return input__iYawBrakeCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iYawBrakeCommand() {
		return input__iYawBrakeCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iYawBrakeCommand(WTCInput newInput__iYawBrakeCommand) {
		WTCInput oldInput__iYawBrakeCommand = input__iYawBrakeCommand;
		input__iYawBrakeCommand = newInput__iYawBrakeCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT118__INPUT_IYAW_BRAKE_COMMAND, oldInput__iYawBrakeCommand, input__iYawBrakeCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oYawHydraulicbrake2Order() {
		if (output__oYawHydraulicbrake2Order != null && output__oYawHydraulicbrake2Order.eIsProxy()) {
			InternalEObject oldOutput__oYawHydraulicbrake2Order = (InternalEObject)output__oYawHydraulicbrake2Order;
			output__oYawHydraulicbrake2Order = (WTCOutput)eResolveProxy(oldOutput__oYawHydraulicbrake2Order);
			if (output__oYawHydraulicbrake2Order != oldOutput__oYawHydraulicbrake2Order) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT118__OUTPUT_OYAW_HYDRAULICBRAKE2_ORDER, oldOutput__oYawHydraulicbrake2Order, output__oYawHydraulicbrake2Order));
			}
		}
		return output__oYawHydraulicbrake2Order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oYawHydraulicbrake2Order() {
		return output__oYawHydraulicbrake2Order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oYawHydraulicbrake2Order(WTCOutput newOutput__oYawHydraulicbrake2Order) {
		WTCOutput oldOutput__oYawHydraulicbrake2Order = output__oYawHydraulicbrake2Order;
		output__oYawHydraulicbrake2Order = newOutput__oYawHydraulicbrake2Order;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT118__OUTPUT_OYAW_HYDRAULICBRAKE2_ORDER, oldOutput__oYawHydraulicbrake2Order, output__oYawHydraulicbrake2Order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT118__INPUT_IYAW_BRAKE_STATUS:
				if (resolve) return getInput__iYawBrakeStatus();
				return basicGetInput__iYawBrakeStatus();
			case WTSpecPackage.CTRL_UNIT118__INPUT_IRETWIST_PRE_COMMAND:
				if (resolve) return getInput__iRetwistPreCommand();
				return basicGetInput__iRetwistPreCommand();
			case WTSpecPackage.CTRL_UNIT118__INPUT_IYAW_BRAKE_COMMAND:
				if (resolve) return getInput__iYawBrakeCommand();
				return basicGetInput__iYawBrakeCommand();
			case WTSpecPackage.CTRL_UNIT118__OUTPUT_OYAW_HYDRAULICBRAKE2_ORDER:
				if (resolve) return getOutput__oYawHydraulicbrake2Order();
				return basicGetOutput__oYawHydraulicbrake2Order();
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
			case WTSpecPackage.CTRL_UNIT118__INPUT_IYAW_BRAKE_STATUS:
				setInput__iYawBrakeStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT118__INPUT_IRETWIST_PRE_COMMAND:
				setInput__iRetwistPreCommand((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT118__INPUT_IYAW_BRAKE_COMMAND:
				setInput__iYawBrakeCommand((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT118__OUTPUT_OYAW_HYDRAULICBRAKE2_ORDER:
				setOutput__oYawHydraulicbrake2Order((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT118__INPUT_IYAW_BRAKE_STATUS:
				setInput__iYawBrakeStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT118__INPUT_IRETWIST_PRE_COMMAND:
				setInput__iRetwistPreCommand((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT118__INPUT_IYAW_BRAKE_COMMAND:
				setInput__iYawBrakeCommand((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT118__OUTPUT_OYAW_HYDRAULICBRAKE2_ORDER:
				setOutput__oYawHydraulicbrake2Order((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT118__INPUT_IYAW_BRAKE_STATUS:
				return input__iYawBrakeStatus != null;
			case WTSpecPackage.CTRL_UNIT118__INPUT_IRETWIST_PRE_COMMAND:
				return input__iRetwistPreCommand != null;
			case WTSpecPackage.CTRL_UNIT118__INPUT_IYAW_BRAKE_COMMAND:
				return input__iYawBrakeCommand != null;
			case WTSpecPackage.CTRL_UNIT118__OUTPUT_OYAW_HYDRAULICBRAKE2_ORDER:
				return output__oYawHydraulicbrake2Order != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit118Impl
