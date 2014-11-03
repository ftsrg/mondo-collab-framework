/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit79;
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
 * An implementation of the model object '<em><b>Ctrl Unit79</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit79Impl#getInput__iOverPressureCmd <em>Input iOver Pressure Cmd</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit79Impl#getOutput__oYawBrakeHighPressureCmd <em>Output oYaw Brake High Pressure Cmd</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit79Impl#getFault__fYawBrakeBlock <em>Fault fYaw Brake Block</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit79Impl#getFault__fYawBrakeLoose <em>Fault fYaw Brake Loose</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit79Impl#getFault__fYawBrakeActive <em>Fault fYaw Brake Active</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit79Impl#getFault__fWarning <em>Fault fWarning</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit79Impl#getFault__fFault <em>Fault fFault</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit79Impl#getDecisionSequence__dsCommands <em>Decision Sequence ds Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit79Impl extends wtcImpl implements CtrlUnit79 {
	/**
	 * The cached value of the '{@link #getInput__iOverPressureCmd() <em>Input iOver Pressure Cmd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iOverPressureCmd()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iOverPressureCmd;

	/**
	 * The cached value of the '{@link #getOutput__oYawBrakeHighPressureCmd() <em>Output oYaw Brake High Pressure Cmd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oYawBrakeHighPressureCmd()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oYawBrakeHighPressureCmd;

	/**
	 * The cached value of the '{@link #getFault__fYawBrakeBlock() <em>Fault fYaw Brake Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fYawBrakeBlock()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fYawBrakeBlock;

	/**
	 * The cached value of the '{@link #getFault__fYawBrakeLoose() <em>Fault fYaw Brake Loose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fYawBrakeLoose()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fYawBrakeLoose;

	/**
	 * The cached value of the '{@link #getFault__fYawBrakeActive() <em>Fault fYaw Brake Active</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fYawBrakeActive()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fYawBrakeActive;

	/**
	 * The cached value of the '{@link #getFault__fWarning() <em>Fault fWarning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fWarning()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fWarning;

	/**
	 * The cached value of the '{@link #getFault__fFault() <em>Fault fFault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fFault()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fFault;

	/**
	 * The default value of the '{@link #getDecisionSequence__dsCommands() <em>Decision Sequence ds Commands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionSequence__dsCommands()
	 * @generated
	 * @ordered
	 */
	protected static final String DECISION_SEQUENCE_DS_COMMANDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecisionSequence__dsCommands() <em>Decision Sequence ds Commands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionSequence__dsCommands()
	 * @generated
	 * @ordered
	 */
	protected String decisionSequence__dsCommands = DECISION_SEQUENCE_DS_COMMANDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit79Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT79;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iOverPressureCmd() {
		if (input__iOverPressureCmd != null && input__iOverPressureCmd.eIsProxy()) {
			InternalEObject oldInput__iOverPressureCmd = (InternalEObject)input__iOverPressureCmd;
			input__iOverPressureCmd = (WTCInput)eResolveProxy(oldInput__iOverPressureCmd);
			if (input__iOverPressureCmd != oldInput__iOverPressureCmd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT79__INPUT_IOVER_PRESSURE_CMD, oldInput__iOverPressureCmd, input__iOverPressureCmd));
			}
		}
		return input__iOverPressureCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iOverPressureCmd() {
		return input__iOverPressureCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iOverPressureCmd(WTCInput newInput__iOverPressureCmd) {
		WTCInput oldInput__iOverPressureCmd = input__iOverPressureCmd;
		input__iOverPressureCmd = newInput__iOverPressureCmd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT79__INPUT_IOVER_PRESSURE_CMD, oldInput__iOverPressureCmd, input__iOverPressureCmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oYawBrakeHighPressureCmd() {
		if (output__oYawBrakeHighPressureCmd != null && output__oYawBrakeHighPressureCmd.eIsProxy()) {
			InternalEObject oldOutput__oYawBrakeHighPressureCmd = (InternalEObject)output__oYawBrakeHighPressureCmd;
			output__oYawBrakeHighPressureCmd = (WTCOutput)eResolveProxy(oldOutput__oYawBrakeHighPressureCmd);
			if (output__oYawBrakeHighPressureCmd != oldOutput__oYawBrakeHighPressureCmd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT79__OUTPUT_OYAW_BRAKE_HIGH_PRESSURE_CMD, oldOutput__oYawBrakeHighPressureCmd, output__oYawBrakeHighPressureCmd));
			}
		}
		return output__oYawBrakeHighPressureCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oYawBrakeHighPressureCmd() {
		return output__oYawBrakeHighPressureCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oYawBrakeHighPressureCmd(WTCOutput newOutput__oYawBrakeHighPressureCmd) {
		WTCOutput oldOutput__oYawBrakeHighPressureCmd = output__oYawBrakeHighPressureCmd;
		output__oYawBrakeHighPressureCmd = newOutput__oYawBrakeHighPressureCmd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT79__OUTPUT_OYAW_BRAKE_HIGH_PRESSURE_CMD, oldOutput__oYawBrakeHighPressureCmd, output__oYawBrakeHighPressureCmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fYawBrakeBlock() {
		if (fault__fYawBrakeBlock != null && fault__fYawBrakeBlock.eIsProxy()) {
			InternalEObject oldFault__fYawBrakeBlock = (InternalEObject)fault__fYawBrakeBlock;
			fault__fYawBrakeBlock = (WTCFault)eResolveProxy(oldFault__fYawBrakeBlock);
			if (fault__fYawBrakeBlock != oldFault__fYawBrakeBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_BLOCK, oldFault__fYawBrakeBlock, fault__fYawBrakeBlock));
			}
		}
		return fault__fYawBrakeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fYawBrakeBlock() {
		return fault__fYawBrakeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fYawBrakeBlock(WTCFault newFault__fYawBrakeBlock) {
		WTCFault oldFault__fYawBrakeBlock = fault__fYawBrakeBlock;
		fault__fYawBrakeBlock = newFault__fYawBrakeBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_BLOCK, oldFault__fYawBrakeBlock, fault__fYawBrakeBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fYawBrakeLoose() {
		if (fault__fYawBrakeLoose != null && fault__fYawBrakeLoose.eIsProxy()) {
			InternalEObject oldFault__fYawBrakeLoose = (InternalEObject)fault__fYawBrakeLoose;
			fault__fYawBrakeLoose = (WTCFault)eResolveProxy(oldFault__fYawBrakeLoose);
			if (fault__fYawBrakeLoose != oldFault__fYawBrakeLoose) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_LOOSE, oldFault__fYawBrakeLoose, fault__fYawBrakeLoose));
			}
		}
		return fault__fYawBrakeLoose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fYawBrakeLoose() {
		return fault__fYawBrakeLoose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fYawBrakeLoose(WTCFault newFault__fYawBrakeLoose) {
		WTCFault oldFault__fYawBrakeLoose = fault__fYawBrakeLoose;
		fault__fYawBrakeLoose = newFault__fYawBrakeLoose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_LOOSE, oldFault__fYawBrakeLoose, fault__fYawBrakeLoose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fYawBrakeActive() {
		if (fault__fYawBrakeActive != null && fault__fYawBrakeActive.eIsProxy()) {
			InternalEObject oldFault__fYawBrakeActive = (InternalEObject)fault__fYawBrakeActive;
			fault__fYawBrakeActive = (WTCFault)eResolveProxy(oldFault__fYawBrakeActive);
			if (fault__fYawBrakeActive != oldFault__fYawBrakeActive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_ACTIVE, oldFault__fYawBrakeActive, fault__fYawBrakeActive));
			}
		}
		return fault__fYawBrakeActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fYawBrakeActive() {
		return fault__fYawBrakeActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fYawBrakeActive(WTCFault newFault__fYawBrakeActive) {
		WTCFault oldFault__fYawBrakeActive = fault__fYawBrakeActive;
		fault__fYawBrakeActive = newFault__fYawBrakeActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_ACTIVE, oldFault__fYawBrakeActive, fault__fYawBrakeActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fWarning() {
		if (fault__fWarning != null && fault__fWarning.eIsProxy()) {
			InternalEObject oldFault__fWarning = (InternalEObject)fault__fWarning;
			fault__fWarning = (WTCFault)eResolveProxy(oldFault__fWarning);
			if (fault__fWarning != oldFault__fWarning) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT79__FAULT_FWARNING, oldFault__fWarning, fault__fWarning));
			}
		}
		return fault__fWarning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fWarning() {
		return fault__fWarning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fWarning(WTCFault newFault__fWarning) {
		WTCFault oldFault__fWarning = fault__fWarning;
		fault__fWarning = newFault__fWarning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT79__FAULT_FWARNING, oldFault__fWarning, fault__fWarning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fFault() {
		if (fault__fFault != null && fault__fFault.eIsProxy()) {
			InternalEObject oldFault__fFault = (InternalEObject)fault__fFault;
			fault__fFault = (WTCFault)eResolveProxy(oldFault__fFault);
			if (fault__fFault != oldFault__fFault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT79__FAULT_FFAULT, oldFault__fFault, fault__fFault));
			}
		}
		return fault__fFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fFault() {
		return fault__fFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fFault(WTCFault newFault__fFault) {
		WTCFault oldFault__fFault = fault__fFault;
		fault__fFault = newFault__fFault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT79__FAULT_FFAULT, oldFault__fFault, fault__fFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecisionSequence__dsCommands() {
		return decisionSequence__dsCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionSequence__dsCommands(String newDecisionSequence__dsCommands) {
		String oldDecisionSequence__dsCommands = decisionSequence__dsCommands;
		decisionSequence__dsCommands = newDecisionSequence__dsCommands;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT79__DECISION_SEQUENCE_DS_COMMANDS, oldDecisionSequence__dsCommands, decisionSequence__dsCommands));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT79__INPUT_IOVER_PRESSURE_CMD:
				if (resolve) return getInput__iOverPressureCmd();
				return basicGetInput__iOverPressureCmd();
			case WTSpecPackage.CTRL_UNIT79__OUTPUT_OYAW_BRAKE_HIGH_PRESSURE_CMD:
				if (resolve) return getOutput__oYawBrakeHighPressureCmd();
				return basicGetOutput__oYawBrakeHighPressureCmd();
			case WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_BLOCK:
				if (resolve) return getFault__fYawBrakeBlock();
				return basicGetFault__fYawBrakeBlock();
			case WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_LOOSE:
				if (resolve) return getFault__fYawBrakeLoose();
				return basicGetFault__fYawBrakeLoose();
			case WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_ACTIVE:
				if (resolve) return getFault__fYawBrakeActive();
				return basicGetFault__fYawBrakeActive();
			case WTSpecPackage.CTRL_UNIT79__FAULT_FWARNING:
				if (resolve) return getFault__fWarning();
				return basicGetFault__fWarning();
			case WTSpecPackage.CTRL_UNIT79__FAULT_FFAULT:
				if (resolve) return getFault__fFault();
				return basicGetFault__fFault();
			case WTSpecPackage.CTRL_UNIT79__DECISION_SEQUENCE_DS_COMMANDS:
				return getDecisionSequence__dsCommands();
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
			case WTSpecPackage.CTRL_UNIT79__INPUT_IOVER_PRESSURE_CMD:
				setInput__iOverPressureCmd((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT79__OUTPUT_OYAW_BRAKE_HIGH_PRESSURE_CMD:
				setOutput__oYawBrakeHighPressureCmd((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_BLOCK:
				setFault__fYawBrakeBlock((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_LOOSE:
				setFault__fYawBrakeLoose((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_ACTIVE:
				setFault__fYawBrakeActive((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT79__FAULT_FWARNING:
				setFault__fWarning((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT79__FAULT_FFAULT:
				setFault__fFault((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT79__DECISION_SEQUENCE_DS_COMMANDS:
				setDecisionSequence__dsCommands((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT79__INPUT_IOVER_PRESSURE_CMD:
				setInput__iOverPressureCmd((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT79__OUTPUT_OYAW_BRAKE_HIGH_PRESSURE_CMD:
				setOutput__oYawBrakeHighPressureCmd((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_BLOCK:
				setFault__fYawBrakeBlock((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_LOOSE:
				setFault__fYawBrakeLoose((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_ACTIVE:
				setFault__fYawBrakeActive((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT79__FAULT_FWARNING:
				setFault__fWarning((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT79__FAULT_FFAULT:
				setFault__fFault((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT79__DECISION_SEQUENCE_DS_COMMANDS:
				setDecisionSequence__dsCommands(DECISION_SEQUENCE_DS_COMMANDS_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT79__INPUT_IOVER_PRESSURE_CMD:
				return input__iOverPressureCmd != null;
			case WTSpecPackage.CTRL_UNIT79__OUTPUT_OYAW_BRAKE_HIGH_PRESSURE_CMD:
				return output__oYawBrakeHighPressureCmd != null;
			case WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_BLOCK:
				return fault__fYawBrakeBlock != null;
			case WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_LOOSE:
				return fault__fYawBrakeLoose != null;
			case WTSpecPackage.CTRL_UNIT79__FAULT_FYAW_BRAKE_ACTIVE:
				return fault__fYawBrakeActive != null;
			case WTSpecPackage.CTRL_UNIT79__FAULT_FWARNING:
				return fault__fWarning != null;
			case WTSpecPackage.CTRL_UNIT79__FAULT_FFAULT:
				return fault__fFault != null;
			case WTSpecPackage.CTRL_UNIT79__DECISION_SEQUENCE_DS_COMMANDS:
				return DECISION_SEQUENCE_DS_COMMANDS_EDEFAULT == null ? decisionSequence__dsCommands != null : !DECISION_SEQUENCE_DS_COMMANDS_EDEFAULT.equals(decisionSequence__dsCommands);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (DecisionSequence__dsCommands: ");
		result.append(decisionSequence__dsCommands);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit79Impl
