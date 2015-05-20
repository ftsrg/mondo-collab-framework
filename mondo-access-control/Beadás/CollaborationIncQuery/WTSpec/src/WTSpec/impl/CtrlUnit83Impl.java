/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit83;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit83</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit83Impl#getInput__iPinSafetyCmd <em>Input iPin Safety Cmd</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit83Impl#getInput__iPinAutoCmd <em>Input iPin Auto Cmd</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit83Impl#getInput__iPinManualCmd <em>Input iPin Manual Cmd</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit83Impl#getInput__iLockingSet <em>Input iLocking Set</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit83Impl#getInput__iManualMode <em>Input iManual Mode</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit83Impl#getInput__iSafetyBlock <em>Input iSafety Block</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit83Impl#getOutput__oPinEnable <em>Output oPin Enable</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit83Impl#getOutput__oPinExtend <em>Output oPin Extend</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit83Impl#getOutput__oPinRetract <em>Output oPin Retract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit83Impl extends wtcImpl implements CtrlUnit83 {
	/**
	 * The cached value of the '{@link #getInput__iPinSafetyCmd() <em>Input iPin Safety Cmd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPinSafetyCmd()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPinSafetyCmd;

	/**
	 * The cached value of the '{@link #getInput__iPinAutoCmd() <em>Input iPin Auto Cmd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPinAutoCmd()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPinAutoCmd;

	/**
	 * The cached value of the '{@link #getInput__iPinManualCmd() <em>Input iPin Manual Cmd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPinManualCmd()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPinManualCmd;

	/**
	 * The cached value of the '{@link #getInput__iLockingSet() <em>Input iLocking Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iLockingSet()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iLockingSet;

	/**
	 * The cached value of the '{@link #getInput__iManualMode() <em>Input iManual Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iManualMode()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iManualMode;

	/**
	 * The cached value of the '{@link #getInput__iSafetyBlock() <em>Input iSafety Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iSafetyBlock()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iSafetyBlock;

	/**
	 * The cached value of the '{@link #getOutput__oPinEnable() <em>Output oPin Enable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPinEnable()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPinEnable;

	/**
	 * The cached value of the '{@link #getOutput__oPinExtend() <em>Output oPin Extend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPinExtend()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPinExtend;

	/**
	 * The cached value of the '{@link #getOutput__oPinRetract() <em>Output oPin Retract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPinRetract()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPinRetract;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit83Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT83;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPinSafetyCmd() {
		if (input__iPinSafetyCmd != null && input__iPinSafetyCmd.eIsProxy()) {
			InternalEObject oldInput__iPinSafetyCmd = (InternalEObject)input__iPinSafetyCmd;
			input__iPinSafetyCmd = (WTCInput)eResolveProxy(oldInput__iPinSafetyCmd);
			if (input__iPinSafetyCmd != oldInput__iPinSafetyCmd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_SAFETY_CMD, oldInput__iPinSafetyCmd, input__iPinSafetyCmd));
			}
		}
		return input__iPinSafetyCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPinSafetyCmd() {
		return input__iPinSafetyCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPinSafetyCmd(WTCInput newInput__iPinSafetyCmd) {
		WTCInput oldInput__iPinSafetyCmd = input__iPinSafetyCmd;
		input__iPinSafetyCmd = newInput__iPinSafetyCmd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_SAFETY_CMD, oldInput__iPinSafetyCmd, input__iPinSafetyCmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPinAutoCmd() {
		if (input__iPinAutoCmd != null && input__iPinAutoCmd.eIsProxy()) {
			InternalEObject oldInput__iPinAutoCmd = (InternalEObject)input__iPinAutoCmd;
			input__iPinAutoCmd = (WTCInput)eResolveProxy(oldInput__iPinAutoCmd);
			if (input__iPinAutoCmd != oldInput__iPinAutoCmd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_AUTO_CMD, oldInput__iPinAutoCmd, input__iPinAutoCmd));
			}
		}
		return input__iPinAutoCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPinAutoCmd() {
		return input__iPinAutoCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPinAutoCmd(WTCInput newInput__iPinAutoCmd) {
		WTCInput oldInput__iPinAutoCmd = input__iPinAutoCmd;
		input__iPinAutoCmd = newInput__iPinAutoCmd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_AUTO_CMD, oldInput__iPinAutoCmd, input__iPinAutoCmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPinManualCmd() {
		if (input__iPinManualCmd != null && input__iPinManualCmd.eIsProxy()) {
			InternalEObject oldInput__iPinManualCmd = (InternalEObject)input__iPinManualCmd;
			input__iPinManualCmd = (WTCInput)eResolveProxy(oldInput__iPinManualCmd);
			if (input__iPinManualCmd != oldInput__iPinManualCmd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_MANUAL_CMD, oldInput__iPinManualCmd, input__iPinManualCmd));
			}
		}
		return input__iPinManualCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPinManualCmd() {
		return input__iPinManualCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPinManualCmd(WTCInput newInput__iPinManualCmd) {
		WTCInput oldInput__iPinManualCmd = input__iPinManualCmd;
		input__iPinManualCmd = newInput__iPinManualCmd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_MANUAL_CMD, oldInput__iPinManualCmd, input__iPinManualCmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iLockingSet() {
		if (input__iLockingSet != null && input__iLockingSet.eIsProxy()) {
			InternalEObject oldInput__iLockingSet = (InternalEObject)input__iLockingSet;
			input__iLockingSet = (WTCInput)eResolveProxy(oldInput__iLockingSet);
			if (input__iLockingSet != oldInput__iLockingSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT83__INPUT_ILOCKING_SET, oldInput__iLockingSet, input__iLockingSet));
			}
		}
		return input__iLockingSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iLockingSet() {
		return input__iLockingSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iLockingSet(WTCInput newInput__iLockingSet) {
		WTCInput oldInput__iLockingSet = input__iLockingSet;
		input__iLockingSet = newInput__iLockingSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT83__INPUT_ILOCKING_SET, oldInput__iLockingSet, input__iLockingSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iManualMode() {
		if (input__iManualMode != null && input__iManualMode.eIsProxy()) {
			InternalEObject oldInput__iManualMode = (InternalEObject)input__iManualMode;
			input__iManualMode = (WTCInput)eResolveProxy(oldInput__iManualMode);
			if (input__iManualMode != oldInput__iManualMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT83__INPUT_IMANUAL_MODE, oldInput__iManualMode, input__iManualMode));
			}
		}
		return input__iManualMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iManualMode() {
		return input__iManualMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iManualMode(WTCInput newInput__iManualMode) {
		WTCInput oldInput__iManualMode = input__iManualMode;
		input__iManualMode = newInput__iManualMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT83__INPUT_IMANUAL_MODE, oldInput__iManualMode, input__iManualMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iSafetyBlock() {
		if (input__iSafetyBlock != null && input__iSafetyBlock.eIsProxy()) {
			InternalEObject oldInput__iSafetyBlock = (InternalEObject)input__iSafetyBlock;
			input__iSafetyBlock = (WTCInput)eResolveProxy(oldInput__iSafetyBlock);
			if (input__iSafetyBlock != oldInput__iSafetyBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT83__INPUT_ISAFETY_BLOCK, oldInput__iSafetyBlock, input__iSafetyBlock));
			}
		}
		return input__iSafetyBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iSafetyBlock() {
		return input__iSafetyBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iSafetyBlock(WTCInput newInput__iSafetyBlock) {
		WTCInput oldInput__iSafetyBlock = input__iSafetyBlock;
		input__iSafetyBlock = newInput__iSafetyBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT83__INPUT_ISAFETY_BLOCK, oldInput__iSafetyBlock, input__iSafetyBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPinEnable() {
		if (output__oPinEnable != null && output__oPinEnable.eIsProxy()) {
			InternalEObject oldOutput__oPinEnable = (InternalEObject)output__oPinEnable;
			output__oPinEnable = (WTCOutput)eResolveProxy(oldOutput__oPinEnable);
			if (output__oPinEnable != oldOutput__oPinEnable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_ENABLE, oldOutput__oPinEnable, output__oPinEnable));
			}
		}
		return output__oPinEnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPinEnable() {
		return output__oPinEnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPinEnable(WTCOutput newOutput__oPinEnable) {
		WTCOutput oldOutput__oPinEnable = output__oPinEnable;
		output__oPinEnable = newOutput__oPinEnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_ENABLE, oldOutput__oPinEnable, output__oPinEnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPinExtend() {
		if (output__oPinExtend != null && output__oPinExtend.eIsProxy()) {
			InternalEObject oldOutput__oPinExtend = (InternalEObject)output__oPinExtend;
			output__oPinExtend = (WTCOutput)eResolveProxy(oldOutput__oPinExtend);
			if (output__oPinExtend != oldOutput__oPinExtend) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_EXTEND, oldOutput__oPinExtend, output__oPinExtend));
			}
		}
		return output__oPinExtend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPinExtend() {
		return output__oPinExtend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPinExtend(WTCOutput newOutput__oPinExtend) {
		WTCOutput oldOutput__oPinExtend = output__oPinExtend;
		output__oPinExtend = newOutput__oPinExtend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_EXTEND, oldOutput__oPinExtend, output__oPinExtend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPinRetract() {
		if (output__oPinRetract != null && output__oPinRetract.eIsProxy()) {
			InternalEObject oldOutput__oPinRetract = (InternalEObject)output__oPinRetract;
			output__oPinRetract = (WTCOutput)eResolveProxy(oldOutput__oPinRetract);
			if (output__oPinRetract != oldOutput__oPinRetract) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_RETRACT, oldOutput__oPinRetract, output__oPinRetract));
			}
		}
		return output__oPinRetract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPinRetract() {
		return output__oPinRetract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPinRetract(WTCOutput newOutput__oPinRetract) {
		WTCOutput oldOutput__oPinRetract = output__oPinRetract;
		output__oPinRetract = newOutput__oPinRetract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_RETRACT, oldOutput__oPinRetract, output__oPinRetract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_SAFETY_CMD:
				if (resolve) return getInput__iPinSafetyCmd();
				return basicGetInput__iPinSafetyCmd();
			case WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_AUTO_CMD:
				if (resolve) return getInput__iPinAutoCmd();
				return basicGetInput__iPinAutoCmd();
			case WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_MANUAL_CMD:
				if (resolve) return getInput__iPinManualCmd();
				return basicGetInput__iPinManualCmd();
			case WTSpecPackage.CTRL_UNIT83__INPUT_ILOCKING_SET:
				if (resolve) return getInput__iLockingSet();
				return basicGetInput__iLockingSet();
			case WTSpecPackage.CTRL_UNIT83__INPUT_IMANUAL_MODE:
				if (resolve) return getInput__iManualMode();
				return basicGetInput__iManualMode();
			case WTSpecPackage.CTRL_UNIT83__INPUT_ISAFETY_BLOCK:
				if (resolve) return getInput__iSafetyBlock();
				return basicGetInput__iSafetyBlock();
			case WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_ENABLE:
				if (resolve) return getOutput__oPinEnable();
				return basicGetOutput__oPinEnable();
			case WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_EXTEND:
				if (resolve) return getOutput__oPinExtend();
				return basicGetOutput__oPinExtend();
			case WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_RETRACT:
				if (resolve) return getOutput__oPinRetract();
				return basicGetOutput__oPinRetract();
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
			case WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_SAFETY_CMD:
				setInput__iPinSafetyCmd((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_AUTO_CMD:
				setInput__iPinAutoCmd((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_MANUAL_CMD:
				setInput__iPinManualCmd((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT83__INPUT_ILOCKING_SET:
				setInput__iLockingSet((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT83__INPUT_IMANUAL_MODE:
				setInput__iManualMode((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT83__INPUT_ISAFETY_BLOCK:
				setInput__iSafetyBlock((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_ENABLE:
				setOutput__oPinEnable((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_EXTEND:
				setOutput__oPinExtend((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_RETRACT:
				setOutput__oPinRetract((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_SAFETY_CMD:
				setInput__iPinSafetyCmd((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_AUTO_CMD:
				setInput__iPinAutoCmd((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_MANUAL_CMD:
				setInput__iPinManualCmd((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT83__INPUT_ILOCKING_SET:
				setInput__iLockingSet((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT83__INPUT_IMANUAL_MODE:
				setInput__iManualMode((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT83__INPUT_ISAFETY_BLOCK:
				setInput__iSafetyBlock((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_ENABLE:
				setOutput__oPinEnable((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_EXTEND:
				setOutput__oPinExtend((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_RETRACT:
				setOutput__oPinRetract((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_SAFETY_CMD:
				return input__iPinSafetyCmd != null;
			case WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_AUTO_CMD:
				return input__iPinAutoCmd != null;
			case WTSpecPackage.CTRL_UNIT83__INPUT_IPIN_MANUAL_CMD:
				return input__iPinManualCmd != null;
			case WTSpecPackage.CTRL_UNIT83__INPUT_ILOCKING_SET:
				return input__iLockingSet != null;
			case WTSpecPackage.CTRL_UNIT83__INPUT_IMANUAL_MODE:
				return input__iManualMode != null;
			case WTSpecPackage.CTRL_UNIT83__INPUT_ISAFETY_BLOCK:
				return input__iSafetyBlock != null;
			case WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_ENABLE:
				return output__oPinEnable != null;
			case WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_EXTEND:
				return output__oPinExtend != null;
			case WTSpecPackage.CTRL_UNIT83__OUTPUT_OPIN_RETRACT:
				return output__oPinRetract != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit83Impl
