/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit116;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit116</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit116Impl#getInput__iInhibitAutoYawCondition <em>Input iInhibit Auto Yaw Condition</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit116Impl#getInput__iInhibitYawCondition <em>Input iInhibit Yaw Condition</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit116Impl#getOutput__oInhibitAutoYaw <em>Output oInhibit Auto Yaw</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit116Impl#getOutput__oInhibitYaw <em>Output oInhibit Yaw</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit116Impl#getOutput__oYawStatus <em>Output oYaw Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit116Impl extends wtcImpl implements CtrlUnit116 {
	/**
	 * The cached value of the '{@link #getInput__iInhibitAutoYawCondition() <em>Input iInhibit Auto Yaw Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInhibitAutoYawCondition()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInhibitAutoYawCondition;

	/**
	 * The cached value of the '{@link #getInput__iInhibitYawCondition() <em>Input iInhibit Yaw Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInhibitYawCondition()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInhibitYawCondition;

	/**
	 * The cached value of the '{@link #getOutput__oInhibitAutoYaw() <em>Output oInhibit Auto Yaw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oInhibitAutoYaw()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oInhibitAutoYaw;

	/**
	 * The cached value of the '{@link #getOutput__oInhibitYaw() <em>Output oInhibit Yaw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oInhibitYaw()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oInhibitYaw;

	/**
	 * The cached value of the '{@link #getOutput__oYawStatus() <em>Output oYaw Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oYawStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oYawStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit116Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT116;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInhibitAutoYawCondition() {
		if (input__iInhibitAutoYawCondition != null && input__iInhibitAutoYawCondition.eIsProxy()) {
			InternalEObject oldInput__iInhibitAutoYawCondition = (InternalEObject)input__iInhibitAutoYawCondition;
			input__iInhibitAutoYawCondition = (WTCInput)eResolveProxy(oldInput__iInhibitAutoYawCondition);
			if (input__iInhibitAutoYawCondition != oldInput__iInhibitAutoYawCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT116__INPUT_IINHIBIT_AUTO_YAW_CONDITION, oldInput__iInhibitAutoYawCondition, input__iInhibitAutoYawCondition));
			}
		}
		return input__iInhibitAutoYawCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInhibitAutoYawCondition() {
		return input__iInhibitAutoYawCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInhibitAutoYawCondition(WTCInput newInput__iInhibitAutoYawCondition) {
		WTCInput oldInput__iInhibitAutoYawCondition = input__iInhibitAutoYawCondition;
		input__iInhibitAutoYawCondition = newInput__iInhibitAutoYawCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT116__INPUT_IINHIBIT_AUTO_YAW_CONDITION, oldInput__iInhibitAutoYawCondition, input__iInhibitAutoYawCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInhibitYawCondition() {
		if (input__iInhibitYawCondition != null && input__iInhibitYawCondition.eIsProxy()) {
			InternalEObject oldInput__iInhibitYawCondition = (InternalEObject)input__iInhibitYawCondition;
			input__iInhibitYawCondition = (WTCInput)eResolveProxy(oldInput__iInhibitYawCondition);
			if (input__iInhibitYawCondition != oldInput__iInhibitYawCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT116__INPUT_IINHIBIT_YAW_CONDITION, oldInput__iInhibitYawCondition, input__iInhibitYawCondition));
			}
		}
		return input__iInhibitYawCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInhibitYawCondition() {
		return input__iInhibitYawCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInhibitYawCondition(WTCInput newInput__iInhibitYawCondition) {
		WTCInput oldInput__iInhibitYawCondition = input__iInhibitYawCondition;
		input__iInhibitYawCondition = newInput__iInhibitYawCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT116__INPUT_IINHIBIT_YAW_CONDITION, oldInput__iInhibitYawCondition, input__iInhibitYawCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oInhibitAutoYaw() {
		if (output__oInhibitAutoYaw != null && output__oInhibitAutoYaw.eIsProxy()) {
			InternalEObject oldOutput__oInhibitAutoYaw = (InternalEObject)output__oInhibitAutoYaw;
			output__oInhibitAutoYaw = (WTCOutput)eResolveProxy(oldOutput__oInhibitAutoYaw);
			if (output__oInhibitAutoYaw != oldOutput__oInhibitAutoYaw) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT116__OUTPUT_OINHIBIT_AUTO_YAW, oldOutput__oInhibitAutoYaw, output__oInhibitAutoYaw));
			}
		}
		return output__oInhibitAutoYaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oInhibitAutoYaw() {
		return output__oInhibitAutoYaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oInhibitAutoYaw(WTCOutput newOutput__oInhibitAutoYaw) {
		WTCOutput oldOutput__oInhibitAutoYaw = output__oInhibitAutoYaw;
		output__oInhibitAutoYaw = newOutput__oInhibitAutoYaw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT116__OUTPUT_OINHIBIT_AUTO_YAW, oldOutput__oInhibitAutoYaw, output__oInhibitAutoYaw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oInhibitYaw() {
		if (output__oInhibitYaw != null && output__oInhibitYaw.eIsProxy()) {
			InternalEObject oldOutput__oInhibitYaw = (InternalEObject)output__oInhibitYaw;
			output__oInhibitYaw = (WTCOutput)eResolveProxy(oldOutput__oInhibitYaw);
			if (output__oInhibitYaw != oldOutput__oInhibitYaw) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT116__OUTPUT_OINHIBIT_YAW, oldOutput__oInhibitYaw, output__oInhibitYaw));
			}
		}
		return output__oInhibitYaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oInhibitYaw() {
		return output__oInhibitYaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oInhibitYaw(WTCOutput newOutput__oInhibitYaw) {
		WTCOutput oldOutput__oInhibitYaw = output__oInhibitYaw;
		output__oInhibitYaw = newOutput__oInhibitYaw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT116__OUTPUT_OINHIBIT_YAW, oldOutput__oInhibitYaw, output__oInhibitYaw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oYawStatus() {
		if (output__oYawStatus != null && output__oYawStatus.eIsProxy()) {
			InternalEObject oldOutput__oYawStatus = (InternalEObject)output__oYawStatus;
			output__oYawStatus = (WTCOutput)eResolveProxy(oldOutput__oYawStatus);
			if (output__oYawStatus != oldOutput__oYawStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT116__OUTPUT_OYAW_STATUS, oldOutput__oYawStatus, output__oYawStatus));
			}
		}
		return output__oYawStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oYawStatus() {
		return output__oYawStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oYawStatus(WTCOutput newOutput__oYawStatus) {
		WTCOutput oldOutput__oYawStatus = output__oYawStatus;
		output__oYawStatus = newOutput__oYawStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT116__OUTPUT_OYAW_STATUS, oldOutput__oYawStatus, output__oYawStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT116__INPUT_IINHIBIT_AUTO_YAW_CONDITION:
				if (resolve) return getInput__iInhibitAutoYawCondition();
				return basicGetInput__iInhibitAutoYawCondition();
			case WTSpecPackage.CTRL_UNIT116__INPUT_IINHIBIT_YAW_CONDITION:
				if (resolve) return getInput__iInhibitYawCondition();
				return basicGetInput__iInhibitYawCondition();
			case WTSpecPackage.CTRL_UNIT116__OUTPUT_OINHIBIT_AUTO_YAW:
				if (resolve) return getOutput__oInhibitAutoYaw();
				return basicGetOutput__oInhibitAutoYaw();
			case WTSpecPackage.CTRL_UNIT116__OUTPUT_OINHIBIT_YAW:
				if (resolve) return getOutput__oInhibitYaw();
				return basicGetOutput__oInhibitYaw();
			case WTSpecPackage.CTRL_UNIT116__OUTPUT_OYAW_STATUS:
				if (resolve) return getOutput__oYawStatus();
				return basicGetOutput__oYawStatus();
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
			case WTSpecPackage.CTRL_UNIT116__INPUT_IINHIBIT_AUTO_YAW_CONDITION:
				setInput__iInhibitAutoYawCondition((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT116__INPUT_IINHIBIT_YAW_CONDITION:
				setInput__iInhibitYawCondition((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT116__OUTPUT_OINHIBIT_AUTO_YAW:
				setOutput__oInhibitAutoYaw((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT116__OUTPUT_OINHIBIT_YAW:
				setOutput__oInhibitYaw((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT116__OUTPUT_OYAW_STATUS:
				setOutput__oYawStatus((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT116__INPUT_IINHIBIT_AUTO_YAW_CONDITION:
				setInput__iInhibitAutoYawCondition((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT116__INPUT_IINHIBIT_YAW_CONDITION:
				setInput__iInhibitYawCondition((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT116__OUTPUT_OINHIBIT_AUTO_YAW:
				setOutput__oInhibitAutoYaw((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT116__OUTPUT_OINHIBIT_YAW:
				setOutput__oInhibitYaw((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT116__OUTPUT_OYAW_STATUS:
				setOutput__oYawStatus((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT116__INPUT_IINHIBIT_AUTO_YAW_CONDITION:
				return input__iInhibitAutoYawCondition != null;
			case WTSpecPackage.CTRL_UNIT116__INPUT_IINHIBIT_YAW_CONDITION:
				return input__iInhibitYawCondition != null;
			case WTSpecPackage.CTRL_UNIT116__OUTPUT_OINHIBIT_AUTO_YAW:
				return output__oInhibitAutoYaw != null;
			case WTSpecPackage.CTRL_UNIT116__OUTPUT_OINHIBIT_YAW:
				return output__oInhibitYaw != null;
			case WTSpecPackage.CTRL_UNIT116__OUTPUT_OYAW_STATUS:
				return output__oYawStatus != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit116Impl
