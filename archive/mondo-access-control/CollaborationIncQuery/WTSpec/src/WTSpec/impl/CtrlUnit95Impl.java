/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit95;
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
 * An implementation of the model object '<em><b>Ctrl Unit95</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit95Impl#getInput__iTwistAngle <em>Input iTwist Angle</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit95Impl#getInput__iAccessState <em>Input iAccess State</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit95Impl#getOutput__oTwistAngleLeftLimit <em>Output oTwist Angle Left Limit</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit95Impl#getOutput__oTwistAngleRightLimit <em>Output oTwist Angle Right Limit</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit95Impl#getOutput__oRetwistPreCommand <em>Output oRetwist Pre Command</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit95Impl#getFault__fTwistExcessiveCW <em>Fault fTwist Excessive CW</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit95Impl#getFault__fTwistExcessiveCCW <em>Fault fTwist Excessive CCW</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit95Impl extends wtcImpl implements CtrlUnit95 {
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
	 * The cached value of the '{@link #getInput__iAccessState() <em>Input iAccess State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iAccessState()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iAccessState;

	/**
	 * The cached value of the '{@link #getOutput__oTwistAngleLeftLimit() <em>Output oTwist Angle Left Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oTwistAngleLeftLimit()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oTwistAngleLeftLimit;

	/**
	 * The cached value of the '{@link #getOutput__oTwistAngleRightLimit() <em>Output oTwist Angle Right Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oTwistAngleRightLimit()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oTwistAngleRightLimit;

	/**
	 * The cached value of the '{@link #getOutput__oRetwistPreCommand() <em>Output oRetwist Pre Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oRetwistPreCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oRetwistPreCommand;

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
	protected CtrlUnit95Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT95;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT95__INPUT_ITWIST_ANGLE, oldInput__iTwistAngle, input__iTwistAngle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT95__INPUT_ITWIST_ANGLE, oldInput__iTwistAngle, input__iTwistAngle));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT95__INPUT_IACCESS_STATE, oldInput__iAccessState, input__iAccessState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT95__INPUT_IACCESS_STATE, oldInput__iAccessState, input__iAccessState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oTwistAngleLeftLimit() {
		if (output__oTwistAngleLeftLimit != null && output__oTwistAngleLeftLimit.eIsProxy()) {
			InternalEObject oldOutput__oTwistAngleLeftLimit = (InternalEObject)output__oTwistAngleLeftLimit;
			output__oTwistAngleLeftLimit = (WTCOutput)eResolveProxy(oldOutput__oTwistAngleLeftLimit);
			if (output__oTwistAngleLeftLimit != oldOutput__oTwistAngleLeftLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT95__OUTPUT_OTWIST_ANGLE_LEFT_LIMIT, oldOutput__oTwistAngleLeftLimit, output__oTwistAngleLeftLimit));
			}
		}
		return output__oTwistAngleLeftLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oTwistAngleLeftLimit() {
		return output__oTwistAngleLeftLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oTwistAngleLeftLimit(WTCOutput newOutput__oTwistAngleLeftLimit) {
		WTCOutput oldOutput__oTwistAngleLeftLimit = output__oTwistAngleLeftLimit;
		output__oTwistAngleLeftLimit = newOutput__oTwistAngleLeftLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT95__OUTPUT_OTWIST_ANGLE_LEFT_LIMIT, oldOutput__oTwistAngleLeftLimit, output__oTwistAngleLeftLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oTwistAngleRightLimit() {
		if (output__oTwistAngleRightLimit != null && output__oTwistAngleRightLimit.eIsProxy()) {
			InternalEObject oldOutput__oTwistAngleRightLimit = (InternalEObject)output__oTwistAngleRightLimit;
			output__oTwistAngleRightLimit = (WTCOutput)eResolveProxy(oldOutput__oTwistAngleRightLimit);
			if (output__oTwistAngleRightLimit != oldOutput__oTwistAngleRightLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT95__OUTPUT_OTWIST_ANGLE_RIGHT_LIMIT, oldOutput__oTwistAngleRightLimit, output__oTwistAngleRightLimit));
			}
		}
		return output__oTwistAngleRightLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oTwistAngleRightLimit() {
		return output__oTwistAngleRightLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oTwistAngleRightLimit(WTCOutput newOutput__oTwistAngleRightLimit) {
		WTCOutput oldOutput__oTwistAngleRightLimit = output__oTwistAngleRightLimit;
		output__oTwistAngleRightLimit = newOutput__oTwistAngleRightLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT95__OUTPUT_OTWIST_ANGLE_RIGHT_LIMIT, oldOutput__oTwistAngleRightLimit, output__oTwistAngleRightLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oRetwistPreCommand() {
		if (output__oRetwistPreCommand != null && output__oRetwistPreCommand.eIsProxy()) {
			InternalEObject oldOutput__oRetwistPreCommand = (InternalEObject)output__oRetwistPreCommand;
			output__oRetwistPreCommand = (WTCOutput)eResolveProxy(oldOutput__oRetwistPreCommand);
			if (output__oRetwistPreCommand != oldOutput__oRetwistPreCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT95__OUTPUT_ORETWIST_PRE_COMMAND, oldOutput__oRetwistPreCommand, output__oRetwistPreCommand));
			}
		}
		return output__oRetwistPreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oRetwistPreCommand() {
		return output__oRetwistPreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oRetwistPreCommand(WTCOutput newOutput__oRetwistPreCommand) {
		WTCOutput oldOutput__oRetwistPreCommand = output__oRetwistPreCommand;
		output__oRetwistPreCommand = newOutput__oRetwistPreCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT95__OUTPUT_ORETWIST_PRE_COMMAND, oldOutput__oRetwistPreCommand, output__oRetwistPreCommand));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT95__FAULT_FTWIST_EXCESSIVE_CW, oldFault__fTwistExcessiveCW, fault__fTwistExcessiveCW));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT95__FAULT_FTWIST_EXCESSIVE_CW, oldFault__fTwistExcessiveCW, fault__fTwistExcessiveCW));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT95__FAULT_FTWIST_EXCESSIVE_CCW, oldFault__fTwistExcessiveCCW, fault__fTwistExcessiveCCW));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT95__FAULT_FTWIST_EXCESSIVE_CCW, oldFault__fTwistExcessiveCCW, fault__fTwistExcessiveCCW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT95__INPUT_ITWIST_ANGLE:
				if (resolve) return getInput__iTwistAngle();
				return basicGetInput__iTwistAngle();
			case WTSpecPackage.CTRL_UNIT95__INPUT_IACCESS_STATE:
				if (resolve) return getInput__iAccessState();
				return basicGetInput__iAccessState();
			case WTSpecPackage.CTRL_UNIT95__OUTPUT_OTWIST_ANGLE_LEFT_LIMIT:
				if (resolve) return getOutput__oTwistAngleLeftLimit();
				return basicGetOutput__oTwistAngleLeftLimit();
			case WTSpecPackage.CTRL_UNIT95__OUTPUT_OTWIST_ANGLE_RIGHT_LIMIT:
				if (resolve) return getOutput__oTwistAngleRightLimit();
				return basicGetOutput__oTwistAngleRightLimit();
			case WTSpecPackage.CTRL_UNIT95__OUTPUT_ORETWIST_PRE_COMMAND:
				if (resolve) return getOutput__oRetwistPreCommand();
				return basicGetOutput__oRetwistPreCommand();
			case WTSpecPackage.CTRL_UNIT95__FAULT_FTWIST_EXCESSIVE_CW:
				if (resolve) return getFault__fTwistExcessiveCW();
				return basicGetFault__fTwistExcessiveCW();
			case WTSpecPackage.CTRL_UNIT95__FAULT_FTWIST_EXCESSIVE_CCW:
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
			case WTSpecPackage.CTRL_UNIT95__INPUT_ITWIST_ANGLE:
				setInput__iTwistAngle((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT95__INPUT_IACCESS_STATE:
				setInput__iAccessState((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT95__OUTPUT_OTWIST_ANGLE_LEFT_LIMIT:
				setOutput__oTwistAngleLeftLimit((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT95__OUTPUT_OTWIST_ANGLE_RIGHT_LIMIT:
				setOutput__oTwistAngleRightLimit((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT95__OUTPUT_ORETWIST_PRE_COMMAND:
				setOutput__oRetwistPreCommand((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT95__FAULT_FTWIST_EXCESSIVE_CW:
				setFault__fTwistExcessiveCW((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT95__FAULT_FTWIST_EXCESSIVE_CCW:
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
			case WTSpecPackage.CTRL_UNIT95__INPUT_ITWIST_ANGLE:
				setInput__iTwistAngle((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT95__INPUT_IACCESS_STATE:
				setInput__iAccessState((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT95__OUTPUT_OTWIST_ANGLE_LEFT_LIMIT:
				setOutput__oTwistAngleLeftLimit((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT95__OUTPUT_OTWIST_ANGLE_RIGHT_LIMIT:
				setOutput__oTwistAngleRightLimit((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT95__OUTPUT_ORETWIST_PRE_COMMAND:
				setOutput__oRetwistPreCommand((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT95__FAULT_FTWIST_EXCESSIVE_CW:
				setFault__fTwistExcessiveCW((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT95__FAULT_FTWIST_EXCESSIVE_CCW:
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
			case WTSpecPackage.CTRL_UNIT95__INPUT_ITWIST_ANGLE:
				return input__iTwistAngle != null;
			case WTSpecPackage.CTRL_UNIT95__INPUT_IACCESS_STATE:
				return input__iAccessState != null;
			case WTSpecPackage.CTRL_UNIT95__OUTPUT_OTWIST_ANGLE_LEFT_LIMIT:
				return output__oTwistAngleLeftLimit != null;
			case WTSpecPackage.CTRL_UNIT95__OUTPUT_OTWIST_ANGLE_RIGHT_LIMIT:
				return output__oTwistAngleRightLimit != null;
			case WTSpecPackage.CTRL_UNIT95__OUTPUT_ORETWIST_PRE_COMMAND:
				return output__oRetwistPreCommand != null;
			case WTSpecPackage.CTRL_UNIT95__FAULT_FTWIST_EXCESSIVE_CW:
				return fault__fTwistExcessiveCW != null;
			case WTSpecPackage.CTRL_UNIT95__FAULT_FTWIST_EXCESSIVE_CCW:
				return fault__fTwistExcessiveCCW != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit95Impl
