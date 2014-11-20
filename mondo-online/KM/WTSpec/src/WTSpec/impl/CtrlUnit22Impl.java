/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit22;
import WTSpec.WTCFault;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTCParam;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit22</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit22Impl#getInput__iYawStatus <em>Input iYaw Status</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit22Impl#getInput__iTwistAngle <em>Input iTwist Angle</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit22Impl#getInput__iMaxTwistCW <em>Input iMax Twist CW</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit22Impl#getInput__iMaxTwistCCW <em>Input iMax Twist CCW</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit22Impl#getOutput__oMaxTwistPreCommand <em>Output oMax Twist Pre Command</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit22Impl#getParameter__pMaxTwistHysteresis <em>Parameter pMax Twist Hysteresis</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit22Impl#getFault__fTwistExcessiveCW <em>Fault fTwist Excessive CW</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit22Impl#getFault__fTwistExcessiveCCW <em>Fault fTwist Excessive CCW</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit22Impl extends wtcImpl implements CtrlUnit22 {
	/**
	 * The cached value of the '{@link #getInput__iYawStatus() <em>Input iYaw Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iYawStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iYawStatus;

	/**
	 * The cached value of the '{@link #getInput__iTwistAngle() <em>Input iTwist Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iTwistAngle()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iTwistAngle;

	/**
	 * The cached value of the '{@link #getInput__iMaxTwistCW() <em>Input iMax Twist CW</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iMaxTwistCW()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iMaxTwistCW;

	/**
	 * The cached value of the '{@link #getInput__iMaxTwistCCW() <em>Input iMax Twist CCW</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iMaxTwistCCW()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iMaxTwistCCW;

	/**
	 * The cached value of the '{@link #getOutput__oMaxTwistPreCommand() <em>Output oMax Twist Pre Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oMaxTwistPreCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oMaxTwistPreCommand;

	/**
	 * The cached value of the '{@link #getParameter__pMaxTwistHysteresis() <em>Parameter pMax Twist Hysteresis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pMaxTwistHysteresis()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pMaxTwistHysteresis;

	/**
	 * The cached value of the '{@link #getFault__fTwistExcessiveCW() <em>Fault fTwist Excessive CW</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fTwistExcessiveCW()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fTwistExcessiveCW;

	/**
	 * The cached value of the '{@link #getFault__fTwistExcessiveCCW() <em>Fault fTwist Excessive CCW</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fTwistExcessiveCCW()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fTwistExcessiveCCW;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit22Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit22();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iYawStatus() {
		if (input__iYawStatus != null && input__iYawStatus.eIsProxy()) {
			InternalEObject oldInput__iYawStatus = (InternalEObject)input__iYawStatus;
			input__iYawStatus = (WTCInput)eResolveProxy(oldInput__iYawStatus);
			if (input__iYawStatus != oldInput__iYawStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT22__INPUT_IYAW_STATUS, oldInput__iYawStatus, input__iYawStatus));
			}
		}
		return input__iYawStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iYawStatus() {
		return input__iYawStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iYawStatus(WTCInput newInput__iYawStatus) {
		WTCInput oldInput__iYawStatus = input__iYawStatus;
		input__iYawStatus = newInput__iYawStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT22__INPUT_IYAW_STATUS, oldInput__iYawStatus, input__iYawStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iTwistAngle() {
		if (input__iTwistAngle != null && input__iTwistAngle.eIsProxy()) {
			InternalEObject oldInput__iTwistAngle = (InternalEObject)input__iTwistAngle;
			input__iTwistAngle = (WTCInput)eResolveProxy(oldInput__iTwistAngle);
			if (input__iTwistAngle != oldInput__iTwistAngle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT22__INPUT_ITWIST_ANGLE, oldInput__iTwistAngle, input__iTwistAngle));
			}
		}
		return input__iTwistAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iTwistAngle() {
		return input__iTwistAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iTwistAngle(WTCInput newInput__iTwistAngle) {
		WTCInput oldInput__iTwistAngle = input__iTwistAngle;
		input__iTwistAngle = newInput__iTwistAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT22__INPUT_ITWIST_ANGLE, oldInput__iTwistAngle, input__iTwistAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iMaxTwistCW() {
		if (input__iMaxTwistCW != null && input__iMaxTwistCW.eIsProxy()) {
			InternalEObject oldInput__iMaxTwistCW = (InternalEObject)input__iMaxTwistCW;
			input__iMaxTwistCW = (WTCInput)eResolveProxy(oldInput__iMaxTwistCW);
			if (input__iMaxTwistCW != oldInput__iMaxTwistCW) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT22__INPUT_IMAX_TWIST_CW, oldInput__iMaxTwistCW, input__iMaxTwistCW));
			}
		}
		return input__iMaxTwistCW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iMaxTwistCW() {
		return input__iMaxTwistCW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iMaxTwistCW(WTCInput newInput__iMaxTwistCW) {
		WTCInput oldInput__iMaxTwistCW = input__iMaxTwistCW;
		input__iMaxTwistCW = newInput__iMaxTwistCW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT22__INPUT_IMAX_TWIST_CW, oldInput__iMaxTwistCW, input__iMaxTwistCW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iMaxTwistCCW() {
		if (input__iMaxTwistCCW != null && input__iMaxTwistCCW.eIsProxy()) {
			InternalEObject oldInput__iMaxTwistCCW = (InternalEObject)input__iMaxTwistCCW;
			input__iMaxTwistCCW = (WTCInput)eResolveProxy(oldInput__iMaxTwistCCW);
			if (input__iMaxTwistCCW != oldInput__iMaxTwistCCW) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT22__INPUT_IMAX_TWIST_CCW, oldInput__iMaxTwistCCW, input__iMaxTwistCCW));
			}
		}
		return input__iMaxTwistCCW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iMaxTwistCCW() {
		return input__iMaxTwistCCW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iMaxTwistCCW(WTCInput newInput__iMaxTwistCCW) {
		WTCInput oldInput__iMaxTwistCCW = input__iMaxTwistCCW;
		input__iMaxTwistCCW = newInput__iMaxTwistCCW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT22__INPUT_IMAX_TWIST_CCW, oldInput__iMaxTwistCCW, input__iMaxTwistCCW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oMaxTwistPreCommand() {
		if (output__oMaxTwistPreCommand != null && output__oMaxTwistPreCommand.eIsProxy()) {
			InternalEObject oldOutput__oMaxTwistPreCommand = (InternalEObject)output__oMaxTwistPreCommand;
			output__oMaxTwistPreCommand = (WTCOutput)eResolveProxy(oldOutput__oMaxTwistPreCommand);
			if (output__oMaxTwistPreCommand != oldOutput__oMaxTwistPreCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT22__OUTPUT_OMAX_TWIST_PRE_COMMAND, oldOutput__oMaxTwistPreCommand, output__oMaxTwistPreCommand));
			}
		}
		return output__oMaxTwistPreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oMaxTwistPreCommand() {
		return output__oMaxTwistPreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oMaxTwistPreCommand(WTCOutput newOutput__oMaxTwistPreCommand) {
		WTCOutput oldOutput__oMaxTwistPreCommand = output__oMaxTwistPreCommand;
		output__oMaxTwistPreCommand = newOutput__oMaxTwistPreCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT22__OUTPUT_OMAX_TWIST_PRE_COMMAND, oldOutput__oMaxTwistPreCommand, output__oMaxTwistPreCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pMaxTwistHysteresis() {
		if (parameter__pMaxTwistHysteresis != null && parameter__pMaxTwistHysteresis.eIsProxy()) {
			InternalEObject oldParameter__pMaxTwistHysteresis = (InternalEObject)parameter__pMaxTwistHysteresis;
			parameter__pMaxTwistHysteresis = (WTCParam)eResolveProxy(oldParameter__pMaxTwistHysteresis);
			if (parameter__pMaxTwistHysteresis != oldParameter__pMaxTwistHysteresis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT22__PARAMETER_PMAX_TWIST_HYSTERESIS, oldParameter__pMaxTwistHysteresis, parameter__pMaxTwistHysteresis));
			}
		}
		return parameter__pMaxTwistHysteresis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pMaxTwistHysteresis() {
		return parameter__pMaxTwistHysteresis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pMaxTwistHysteresis(WTCParam newParameter__pMaxTwistHysteresis) {
		WTCParam oldParameter__pMaxTwistHysteresis = parameter__pMaxTwistHysteresis;
		parameter__pMaxTwistHysteresis = newParameter__pMaxTwistHysteresis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT22__PARAMETER_PMAX_TWIST_HYSTERESIS, oldParameter__pMaxTwistHysteresis, parameter__pMaxTwistHysteresis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fTwistExcessiveCW() {
		if (fault__fTwistExcessiveCW != null && fault__fTwistExcessiveCW.eIsProxy()) {
			InternalEObject oldFault__fTwistExcessiveCW = (InternalEObject)fault__fTwistExcessiveCW;
			fault__fTwistExcessiveCW = (WTCFault)eResolveProxy(oldFault__fTwistExcessiveCW);
			if (fault__fTwistExcessiveCW != oldFault__fTwistExcessiveCW) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT22__FAULT_FTWIST_EXCESSIVE_CW, oldFault__fTwistExcessiveCW, fault__fTwistExcessiveCW));
			}
		}
		return fault__fTwistExcessiveCW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fTwistExcessiveCW() {
		return fault__fTwistExcessiveCW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fTwistExcessiveCW(WTCFault newFault__fTwistExcessiveCW) {
		WTCFault oldFault__fTwistExcessiveCW = fault__fTwistExcessiveCW;
		fault__fTwistExcessiveCW = newFault__fTwistExcessiveCW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT22__FAULT_FTWIST_EXCESSIVE_CW, oldFault__fTwistExcessiveCW, fault__fTwistExcessiveCW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fTwistExcessiveCCW() {
		if (fault__fTwistExcessiveCCW != null && fault__fTwistExcessiveCCW.eIsProxy()) {
			InternalEObject oldFault__fTwistExcessiveCCW = (InternalEObject)fault__fTwistExcessiveCCW;
			fault__fTwistExcessiveCCW = (WTCFault)eResolveProxy(oldFault__fTwistExcessiveCCW);
			if (fault__fTwistExcessiveCCW != oldFault__fTwistExcessiveCCW) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT22__FAULT_FTWIST_EXCESSIVE_CCW, oldFault__fTwistExcessiveCCW, fault__fTwistExcessiveCCW));
			}
		}
		return fault__fTwistExcessiveCCW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fTwistExcessiveCCW() {
		return fault__fTwistExcessiveCCW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fTwistExcessiveCCW(WTCFault newFault__fTwistExcessiveCCW) {
		WTCFault oldFault__fTwistExcessiveCCW = fault__fTwistExcessiveCCW;
		fault__fTwistExcessiveCCW = newFault__fTwistExcessiveCCW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT22__FAULT_FTWIST_EXCESSIVE_CCW, oldFault__fTwistExcessiveCCW, fault__fTwistExcessiveCCW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT22__INPUT_IYAW_STATUS:
				if (resolve) return getInput__iYawStatus();
				return basicGetInput__iYawStatus();
			case WTSpecPackage.CTRL_UNIT22__INPUT_ITWIST_ANGLE:
				if (resolve) return getInput__iTwistAngle();
				return basicGetInput__iTwistAngle();
			case WTSpecPackage.CTRL_UNIT22__INPUT_IMAX_TWIST_CW:
				if (resolve) return getInput__iMaxTwistCW();
				return basicGetInput__iMaxTwistCW();
			case WTSpecPackage.CTRL_UNIT22__INPUT_IMAX_TWIST_CCW:
				if (resolve) return getInput__iMaxTwistCCW();
				return basicGetInput__iMaxTwistCCW();
			case WTSpecPackage.CTRL_UNIT22__OUTPUT_OMAX_TWIST_PRE_COMMAND:
				if (resolve) return getOutput__oMaxTwistPreCommand();
				return basicGetOutput__oMaxTwistPreCommand();
			case WTSpecPackage.CTRL_UNIT22__PARAMETER_PMAX_TWIST_HYSTERESIS:
				if (resolve) return getParameter__pMaxTwistHysteresis();
				return basicGetParameter__pMaxTwistHysteresis();
			case WTSpecPackage.CTRL_UNIT22__FAULT_FTWIST_EXCESSIVE_CW:
				if (resolve) return getFault__fTwistExcessiveCW();
				return basicGetFault__fTwistExcessiveCW();
			case WTSpecPackage.CTRL_UNIT22__FAULT_FTWIST_EXCESSIVE_CCW:
				if (resolve) return getFault__fTwistExcessiveCCW();
				return basicGetFault__fTwistExcessiveCCW();
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
			case WTSpecPackage.CTRL_UNIT22__INPUT_IYAW_STATUS:
				setInput__iYawStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT22__INPUT_ITWIST_ANGLE:
				setInput__iTwistAngle((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT22__INPUT_IMAX_TWIST_CW:
				setInput__iMaxTwistCW((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT22__INPUT_IMAX_TWIST_CCW:
				setInput__iMaxTwistCCW((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT22__OUTPUT_OMAX_TWIST_PRE_COMMAND:
				setOutput__oMaxTwistPreCommand((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT22__PARAMETER_PMAX_TWIST_HYSTERESIS:
				setParameter__pMaxTwistHysteresis((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT22__FAULT_FTWIST_EXCESSIVE_CW:
				setFault__fTwistExcessiveCW((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT22__FAULT_FTWIST_EXCESSIVE_CCW:
				setFault__fTwistExcessiveCCW((WTCFault)newValue);
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
			case WTSpecPackage.CTRL_UNIT22__INPUT_IYAW_STATUS:
				setInput__iYawStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT22__INPUT_ITWIST_ANGLE:
				setInput__iTwistAngle((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT22__INPUT_IMAX_TWIST_CW:
				setInput__iMaxTwistCW((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT22__INPUT_IMAX_TWIST_CCW:
				setInput__iMaxTwistCCW((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT22__OUTPUT_OMAX_TWIST_PRE_COMMAND:
				setOutput__oMaxTwistPreCommand((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT22__PARAMETER_PMAX_TWIST_HYSTERESIS:
				setParameter__pMaxTwistHysteresis((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT22__FAULT_FTWIST_EXCESSIVE_CW:
				setFault__fTwistExcessiveCW((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT22__FAULT_FTWIST_EXCESSIVE_CCW:
				setFault__fTwistExcessiveCCW((WTCFault)null);
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
			case WTSpecPackage.CTRL_UNIT22__INPUT_IYAW_STATUS:
				return input__iYawStatus != null;
			case WTSpecPackage.CTRL_UNIT22__INPUT_ITWIST_ANGLE:
				return input__iTwistAngle != null;
			case WTSpecPackage.CTRL_UNIT22__INPUT_IMAX_TWIST_CW:
				return input__iMaxTwistCW != null;
			case WTSpecPackage.CTRL_UNIT22__INPUT_IMAX_TWIST_CCW:
				return input__iMaxTwistCCW != null;
			case WTSpecPackage.CTRL_UNIT22__OUTPUT_OMAX_TWIST_PRE_COMMAND:
				return output__oMaxTwistPreCommand != null;
			case WTSpecPackage.CTRL_UNIT22__PARAMETER_PMAX_TWIST_HYSTERESIS:
				return parameter__pMaxTwistHysteresis != null;
			case WTSpecPackage.CTRL_UNIT22__FAULT_FTWIST_EXCESSIVE_CW:
				return fault__fTwistExcessiveCW != null;
			case WTSpecPackage.CTRL_UNIT22__FAULT_FTWIST_EXCESSIVE_CCW:
				return fault__fTwistExcessiveCCW != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit22Impl
