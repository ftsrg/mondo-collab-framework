/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit24;
import WTSpec.WTCFault;
import WTSpec.WTCInput;
import WTSpec.WTCParam;
import WTSpec.WTCTimer;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit24</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit24Impl#getInput__iInverterReady <em>Input iInverter Ready</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit24Impl#getInput__iInverterPower <em>Input iInverter Power</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit24Impl#getInput__iAlgorithmCommand <em>Input iAlgorithm Command</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit24Impl#getParameter__pPowerLimit <em>Parameter pPower Limit</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit24Impl#getFault__fYawProblem <em>Fault fYaw Problem</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit24Impl#getTimer__tDelayProblemNotify <em>Timer tDelay Problem Notify</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit24Impl#getDecisionSequence__dsDecisionTree <em>Decision Sequence ds Decision Tree</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit24Impl extends wtcImpl implements CtrlUnit24 {
	/**
	 * The cached value of the '{@link #getInput__iInverterReady() <em>Input iInverter Ready</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInverterReady()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInverterReady;

	/**
	 * The cached value of the '{@link #getInput__iInverterPower() <em>Input iInverter Power</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInverterPower()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInverterPower;

	/**
	 * The cached value of the '{@link #getInput__iAlgorithmCommand() <em>Input iAlgorithm Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iAlgorithmCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iAlgorithmCommand;

	/**
	 * The cached value of the '{@link #getParameter__pPowerLimit() <em>Parameter pPower Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPowerLimit()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPowerLimit;

	/**
	 * The cached value of the '{@link #getFault__fYawProblem() <em>Fault fYaw Problem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fYawProblem()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fYawProblem;

	/**
	 * The cached value of the '{@link #getTimer__tDelayProblemNotify() <em>Timer tDelay Problem Notify</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tDelayProblemNotify()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tDelayProblemNotify;

	/**
	 * The default value of the '{@link #getDecisionSequence__dsDecisionTree() <em>Decision Sequence ds Decision Tree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionSequence__dsDecisionTree()
	 * @generated
	 * @ordered
	 */
	protected static final String DECISION_SEQUENCE_DS_DECISION_TREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecisionSequence__dsDecisionTree() <em>Decision Sequence ds Decision Tree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionSequence__dsDecisionTree()
	 * @generated
	 * @ordered
	 */
	protected String decisionSequence__dsDecisionTree = DECISION_SEQUENCE_DS_DECISION_TREE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit24Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit24();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInverterReady() {
		if (input__iInverterReady != null && input__iInverterReady.eIsProxy()) {
			InternalEObject oldInput__iInverterReady = (InternalEObject)input__iInverterReady;
			input__iInverterReady = (WTCInput)eResolveProxy(oldInput__iInverterReady);
			if (input__iInverterReady != oldInput__iInverterReady) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT24__INPUT_IINVERTER_READY, oldInput__iInverterReady, input__iInverterReady));
			}
		}
		return input__iInverterReady;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInverterReady() {
		return input__iInverterReady;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInverterReady(WTCInput newInput__iInverterReady) {
		WTCInput oldInput__iInverterReady = input__iInverterReady;
		input__iInverterReady = newInput__iInverterReady;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT24__INPUT_IINVERTER_READY, oldInput__iInverterReady, input__iInverterReady));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInverterPower() {
		if (input__iInverterPower != null && input__iInverterPower.eIsProxy()) {
			InternalEObject oldInput__iInverterPower = (InternalEObject)input__iInverterPower;
			input__iInverterPower = (WTCInput)eResolveProxy(oldInput__iInverterPower);
			if (input__iInverterPower != oldInput__iInverterPower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT24__INPUT_IINVERTER_POWER, oldInput__iInverterPower, input__iInverterPower));
			}
		}
		return input__iInverterPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInverterPower() {
		return input__iInverterPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInverterPower(WTCInput newInput__iInverterPower) {
		WTCInput oldInput__iInverterPower = input__iInverterPower;
		input__iInverterPower = newInput__iInverterPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT24__INPUT_IINVERTER_POWER, oldInput__iInverterPower, input__iInverterPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iAlgorithmCommand() {
		if (input__iAlgorithmCommand != null && input__iAlgorithmCommand.eIsProxy()) {
			InternalEObject oldInput__iAlgorithmCommand = (InternalEObject)input__iAlgorithmCommand;
			input__iAlgorithmCommand = (WTCInput)eResolveProxy(oldInput__iAlgorithmCommand);
			if (input__iAlgorithmCommand != oldInput__iAlgorithmCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT24__INPUT_IALGORITHM_COMMAND, oldInput__iAlgorithmCommand, input__iAlgorithmCommand));
			}
		}
		return input__iAlgorithmCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iAlgorithmCommand() {
		return input__iAlgorithmCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iAlgorithmCommand(WTCInput newInput__iAlgorithmCommand) {
		WTCInput oldInput__iAlgorithmCommand = input__iAlgorithmCommand;
		input__iAlgorithmCommand = newInput__iAlgorithmCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT24__INPUT_IALGORITHM_COMMAND, oldInput__iAlgorithmCommand, input__iAlgorithmCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPowerLimit() {
		if (parameter__pPowerLimit != null && parameter__pPowerLimit.eIsProxy()) {
			InternalEObject oldParameter__pPowerLimit = (InternalEObject)parameter__pPowerLimit;
			parameter__pPowerLimit = (WTCParam)eResolveProxy(oldParameter__pPowerLimit);
			if (parameter__pPowerLimit != oldParameter__pPowerLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT24__PARAMETER_PPOWER_LIMIT, oldParameter__pPowerLimit, parameter__pPowerLimit));
			}
		}
		return parameter__pPowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPowerLimit() {
		return parameter__pPowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPowerLimit(WTCParam newParameter__pPowerLimit) {
		WTCParam oldParameter__pPowerLimit = parameter__pPowerLimit;
		parameter__pPowerLimit = newParameter__pPowerLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT24__PARAMETER_PPOWER_LIMIT, oldParameter__pPowerLimit, parameter__pPowerLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fYawProblem() {
		if (fault__fYawProblem != null && fault__fYawProblem.eIsProxy()) {
			InternalEObject oldFault__fYawProblem = (InternalEObject)fault__fYawProblem;
			fault__fYawProblem = (WTCFault)eResolveProxy(oldFault__fYawProblem);
			if (fault__fYawProblem != oldFault__fYawProblem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT24__FAULT_FYAW_PROBLEM, oldFault__fYawProblem, fault__fYawProblem));
			}
		}
		return fault__fYawProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fYawProblem() {
		return fault__fYawProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fYawProblem(WTCFault newFault__fYawProblem) {
		WTCFault oldFault__fYawProblem = fault__fYawProblem;
		fault__fYawProblem = newFault__fYawProblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT24__FAULT_FYAW_PROBLEM, oldFault__fYawProblem, fault__fYawProblem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tDelayProblemNotify() {
		if (timer__tDelayProblemNotify != null && timer__tDelayProblemNotify.eIsProxy()) {
			InternalEObject oldTimer__tDelayProblemNotify = (InternalEObject)timer__tDelayProblemNotify;
			timer__tDelayProblemNotify = (WTCTimer)eResolveProxy(oldTimer__tDelayProblemNotify);
			if (timer__tDelayProblemNotify != oldTimer__tDelayProblemNotify) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT24__TIMER_TDELAY_PROBLEM_NOTIFY, oldTimer__tDelayProblemNotify, timer__tDelayProblemNotify));
			}
		}
		return timer__tDelayProblemNotify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tDelayProblemNotify() {
		return timer__tDelayProblemNotify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tDelayProblemNotify(WTCTimer newTimer__tDelayProblemNotify) {
		WTCTimer oldTimer__tDelayProblemNotify = timer__tDelayProblemNotify;
		timer__tDelayProblemNotify = newTimer__tDelayProblemNotify;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT24__TIMER_TDELAY_PROBLEM_NOTIFY, oldTimer__tDelayProblemNotify, timer__tDelayProblemNotify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecisionSequence__dsDecisionTree() {
		return decisionSequence__dsDecisionTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionSequence__dsDecisionTree(String newDecisionSequence__dsDecisionTree) {
		String oldDecisionSequence__dsDecisionTree = decisionSequence__dsDecisionTree;
		decisionSequence__dsDecisionTree = newDecisionSequence__dsDecisionTree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT24__DECISION_SEQUENCE_DS_DECISION_TREE, oldDecisionSequence__dsDecisionTree, decisionSequence__dsDecisionTree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT24__INPUT_IINVERTER_READY:
				if (resolve) return getInput__iInverterReady();
				return basicGetInput__iInverterReady();
			case WTSpecPackage.CTRL_UNIT24__INPUT_IINVERTER_POWER:
				if (resolve) return getInput__iInverterPower();
				return basicGetInput__iInverterPower();
			case WTSpecPackage.CTRL_UNIT24__INPUT_IALGORITHM_COMMAND:
				if (resolve) return getInput__iAlgorithmCommand();
				return basicGetInput__iAlgorithmCommand();
			case WTSpecPackage.CTRL_UNIT24__PARAMETER_PPOWER_LIMIT:
				if (resolve) return getParameter__pPowerLimit();
				return basicGetParameter__pPowerLimit();
			case WTSpecPackage.CTRL_UNIT24__FAULT_FYAW_PROBLEM:
				if (resolve) return getFault__fYawProblem();
				return basicGetFault__fYawProblem();
			case WTSpecPackage.CTRL_UNIT24__TIMER_TDELAY_PROBLEM_NOTIFY:
				if (resolve) return getTimer__tDelayProblemNotify();
				return basicGetTimer__tDelayProblemNotify();
			case WTSpecPackage.CTRL_UNIT24__DECISION_SEQUENCE_DS_DECISION_TREE:
				return getDecisionSequence__dsDecisionTree();
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
			case WTSpecPackage.CTRL_UNIT24__INPUT_IINVERTER_READY:
				setInput__iInverterReady((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT24__INPUT_IINVERTER_POWER:
				setInput__iInverterPower((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT24__INPUT_IALGORITHM_COMMAND:
				setInput__iAlgorithmCommand((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT24__PARAMETER_PPOWER_LIMIT:
				setParameter__pPowerLimit((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT24__FAULT_FYAW_PROBLEM:
				setFault__fYawProblem((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT24__TIMER_TDELAY_PROBLEM_NOTIFY:
				setTimer__tDelayProblemNotify((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT24__DECISION_SEQUENCE_DS_DECISION_TREE:
				setDecisionSequence__dsDecisionTree((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT24__INPUT_IINVERTER_READY:
				setInput__iInverterReady((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT24__INPUT_IINVERTER_POWER:
				setInput__iInverterPower((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT24__INPUT_IALGORITHM_COMMAND:
				setInput__iAlgorithmCommand((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT24__PARAMETER_PPOWER_LIMIT:
				setParameter__pPowerLimit((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT24__FAULT_FYAW_PROBLEM:
				setFault__fYawProblem((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT24__TIMER_TDELAY_PROBLEM_NOTIFY:
				setTimer__tDelayProblemNotify((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT24__DECISION_SEQUENCE_DS_DECISION_TREE:
				setDecisionSequence__dsDecisionTree(DECISION_SEQUENCE_DS_DECISION_TREE_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT24__INPUT_IINVERTER_READY:
				return input__iInverterReady != null;
			case WTSpecPackage.CTRL_UNIT24__INPUT_IINVERTER_POWER:
				return input__iInverterPower != null;
			case WTSpecPackage.CTRL_UNIT24__INPUT_IALGORITHM_COMMAND:
				return input__iAlgorithmCommand != null;
			case WTSpecPackage.CTRL_UNIT24__PARAMETER_PPOWER_LIMIT:
				return parameter__pPowerLimit != null;
			case WTSpecPackage.CTRL_UNIT24__FAULT_FYAW_PROBLEM:
				return fault__fYawProblem != null;
			case WTSpecPackage.CTRL_UNIT24__TIMER_TDELAY_PROBLEM_NOTIFY:
				return timer__tDelayProblemNotify != null;
			case WTSpecPackage.CTRL_UNIT24__DECISION_SEQUENCE_DS_DECISION_TREE:
				return DECISION_SEQUENCE_DS_DECISION_TREE_EDEFAULT == null ? decisionSequence__dsDecisionTree != null : !DECISION_SEQUENCE_DS_DECISION_TREE_EDEFAULT.equals(decisionSequence__dsDecisionTree);
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
		result.append(" (DecisionSequence__dsDecisionTree: ");
		result.append(decisionSequence__dsDecisionTree);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit24Impl
