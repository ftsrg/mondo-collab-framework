/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit117;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCTimer;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit117</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit117Impl#getInput__iYawBrakeCommand <em>Input iYaw Brake Command</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit117Impl#getInput__iYawElectrobrakeStatus <em>Input iYaw Electrobrake Status</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit117Impl#getInput__iYawHydraulicbrakeStatus <em>Input iYaw Hydraulicbrake Status</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit117Impl#getInput__iInhibitYaw <em>Input iInhibit Yaw</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit117Impl#getOutput__oYawBrakeStatus <em>Output oYaw Brake Status</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit117Impl#getOutput__oYawElectrobrakeOrder <em>Output oYaw Electrobrake Order</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit117Impl#getOutput__oYawHydraulicbrakeOrder <em>Output oYaw Hydraulicbrake Order</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit117Impl#getOutput__oBrakesSetProblem <em>Output oBrakes Set Problem</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit117Impl#getOutput__oBrakesLiftedProblem <em>Output oBrakes Lifted Problem</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit117Impl#getTimer__tYawBrakeActionsDelay <em>Timer tYaw Brake Actions Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit117Impl extends wtcImpl implements CtrlUnit117 {
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
	 * The cached value of the '{@link #getInput__iYawElectrobrakeStatus() <em>Input iYaw Electrobrake Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iYawElectrobrakeStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iYawElectrobrakeStatus;

	/**
	 * The cached value of the '{@link #getInput__iYawHydraulicbrakeStatus() <em>Input iYaw Hydraulicbrake Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iYawHydraulicbrakeStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iYawHydraulicbrakeStatus;

	/**
	 * The cached value of the '{@link #getInput__iInhibitYaw() <em>Input iInhibit Yaw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInhibitYaw()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInhibitYaw;

	/**
	 * The cached value of the '{@link #getOutput__oYawBrakeStatus() <em>Output oYaw Brake Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oYawBrakeStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oYawBrakeStatus;

	/**
	 * The cached value of the '{@link #getOutput__oYawElectrobrakeOrder() <em>Output oYaw Electrobrake Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oYawElectrobrakeOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oYawElectrobrakeOrder;

	/**
	 * The cached value of the '{@link #getOutput__oYawHydraulicbrakeOrder() <em>Output oYaw Hydraulicbrake Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oYawHydraulicbrakeOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oYawHydraulicbrakeOrder;

	/**
	 * The cached value of the '{@link #getOutput__oBrakesSetProblem() <em>Output oBrakes Set Problem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oBrakesSetProblem()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oBrakesSetProblem;

	/**
	 * The cached value of the '{@link #getOutput__oBrakesLiftedProblem() <em>Output oBrakes Lifted Problem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oBrakesLiftedProblem()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oBrakesLiftedProblem;

	/**
	 * The cached value of the '{@link #getTimer__tYawBrakeActionsDelay() <em>Timer tYaw Brake Actions Delay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tYawBrakeActionsDelay()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tYawBrakeActionsDelay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit117Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit117();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_BRAKE_COMMAND, oldInput__iYawBrakeCommand, input__iYawBrakeCommand));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_BRAKE_COMMAND, oldInput__iYawBrakeCommand, input__iYawBrakeCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iYawElectrobrakeStatus() {
		if (input__iYawElectrobrakeStatus != null && input__iYawElectrobrakeStatus.eIsProxy()) {
			InternalEObject oldInput__iYawElectrobrakeStatus = (InternalEObject)input__iYawElectrobrakeStatus;
			input__iYawElectrobrakeStatus = (WTCInput)eResolveProxy(oldInput__iYawElectrobrakeStatus);
			if (input__iYawElectrobrakeStatus != oldInput__iYawElectrobrakeStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_ELECTROBRAKE_STATUS, oldInput__iYawElectrobrakeStatus, input__iYawElectrobrakeStatus));
			}
		}
		return input__iYawElectrobrakeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iYawElectrobrakeStatus() {
		return input__iYawElectrobrakeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iYawElectrobrakeStatus(WTCInput newInput__iYawElectrobrakeStatus) {
		WTCInput oldInput__iYawElectrobrakeStatus = input__iYawElectrobrakeStatus;
		input__iYawElectrobrakeStatus = newInput__iYawElectrobrakeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_ELECTROBRAKE_STATUS, oldInput__iYawElectrobrakeStatus, input__iYawElectrobrakeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iYawHydraulicbrakeStatus() {
		if (input__iYawHydraulicbrakeStatus != null && input__iYawHydraulicbrakeStatus.eIsProxy()) {
			InternalEObject oldInput__iYawHydraulicbrakeStatus = (InternalEObject)input__iYawHydraulicbrakeStatus;
			input__iYawHydraulicbrakeStatus = (WTCInput)eResolveProxy(oldInput__iYawHydraulicbrakeStatus);
			if (input__iYawHydraulicbrakeStatus != oldInput__iYawHydraulicbrakeStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_HYDRAULICBRAKE_STATUS, oldInput__iYawHydraulicbrakeStatus, input__iYawHydraulicbrakeStatus));
			}
		}
		return input__iYawHydraulicbrakeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iYawHydraulicbrakeStatus() {
		return input__iYawHydraulicbrakeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iYawHydraulicbrakeStatus(WTCInput newInput__iYawHydraulicbrakeStatus) {
		WTCInput oldInput__iYawHydraulicbrakeStatus = input__iYawHydraulicbrakeStatus;
		input__iYawHydraulicbrakeStatus = newInput__iYawHydraulicbrakeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_HYDRAULICBRAKE_STATUS, oldInput__iYawHydraulicbrakeStatus, input__iYawHydraulicbrakeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInhibitYaw() {
		if (input__iInhibitYaw != null && input__iInhibitYaw.eIsProxy()) {
			InternalEObject oldInput__iInhibitYaw = (InternalEObject)input__iInhibitYaw;
			input__iInhibitYaw = (WTCInput)eResolveProxy(oldInput__iInhibitYaw);
			if (input__iInhibitYaw != oldInput__iInhibitYaw) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT117__INPUT_IINHIBIT_YAW, oldInput__iInhibitYaw, input__iInhibitYaw));
			}
		}
		return input__iInhibitYaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInhibitYaw() {
		return input__iInhibitYaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInhibitYaw(WTCInput newInput__iInhibitYaw) {
		WTCInput oldInput__iInhibitYaw = input__iInhibitYaw;
		input__iInhibitYaw = newInput__iInhibitYaw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT117__INPUT_IINHIBIT_YAW, oldInput__iInhibitYaw, input__iInhibitYaw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oYawBrakeStatus() {
		if (output__oYawBrakeStatus != null && output__oYawBrakeStatus.eIsProxy()) {
			InternalEObject oldOutput__oYawBrakeStatus = (InternalEObject)output__oYawBrakeStatus;
			output__oYawBrakeStatus = (WTCOutput)eResolveProxy(oldOutput__oYawBrakeStatus);
			if (output__oYawBrakeStatus != oldOutput__oYawBrakeStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_BRAKE_STATUS, oldOutput__oYawBrakeStatus, output__oYawBrakeStatus));
			}
		}
		return output__oYawBrakeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oYawBrakeStatus() {
		return output__oYawBrakeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oYawBrakeStatus(WTCOutput newOutput__oYawBrakeStatus) {
		WTCOutput oldOutput__oYawBrakeStatus = output__oYawBrakeStatus;
		output__oYawBrakeStatus = newOutput__oYawBrakeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_BRAKE_STATUS, oldOutput__oYawBrakeStatus, output__oYawBrakeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oYawElectrobrakeOrder() {
		if (output__oYawElectrobrakeOrder != null && output__oYawElectrobrakeOrder.eIsProxy()) {
			InternalEObject oldOutput__oYawElectrobrakeOrder = (InternalEObject)output__oYawElectrobrakeOrder;
			output__oYawElectrobrakeOrder = (WTCOutput)eResolveProxy(oldOutput__oYawElectrobrakeOrder);
			if (output__oYawElectrobrakeOrder != oldOutput__oYawElectrobrakeOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_ELECTROBRAKE_ORDER, oldOutput__oYawElectrobrakeOrder, output__oYawElectrobrakeOrder));
			}
		}
		return output__oYawElectrobrakeOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oYawElectrobrakeOrder() {
		return output__oYawElectrobrakeOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oYawElectrobrakeOrder(WTCOutput newOutput__oYawElectrobrakeOrder) {
		WTCOutput oldOutput__oYawElectrobrakeOrder = output__oYawElectrobrakeOrder;
		output__oYawElectrobrakeOrder = newOutput__oYawElectrobrakeOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_ELECTROBRAKE_ORDER, oldOutput__oYawElectrobrakeOrder, output__oYawElectrobrakeOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oYawHydraulicbrakeOrder() {
		if (output__oYawHydraulicbrakeOrder != null && output__oYawHydraulicbrakeOrder.eIsProxy()) {
			InternalEObject oldOutput__oYawHydraulicbrakeOrder = (InternalEObject)output__oYawHydraulicbrakeOrder;
			output__oYawHydraulicbrakeOrder = (WTCOutput)eResolveProxy(oldOutput__oYawHydraulicbrakeOrder);
			if (output__oYawHydraulicbrakeOrder != oldOutput__oYawHydraulicbrakeOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_HYDRAULICBRAKE_ORDER, oldOutput__oYawHydraulicbrakeOrder, output__oYawHydraulicbrakeOrder));
			}
		}
		return output__oYawHydraulicbrakeOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oYawHydraulicbrakeOrder() {
		return output__oYawHydraulicbrakeOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oYawHydraulicbrakeOrder(WTCOutput newOutput__oYawHydraulicbrakeOrder) {
		WTCOutput oldOutput__oYawHydraulicbrakeOrder = output__oYawHydraulicbrakeOrder;
		output__oYawHydraulicbrakeOrder = newOutput__oYawHydraulicbrakeOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_HYDRAULICBRAKE_ORDER, oldOutput__oYawHydraulicbrakeOrder, output__oYawHydraulicbrakeOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oBrakesSetProblem() {
		if (output__oBrakesSetProblem != null && output__oBrakesSetProblem.eIsProxy()) {
			InternalEObject oldOutput__oBrakesSetProblem = (InternalEObject)output__oBrakesSetProblem;
			output__oBrakesSetProblem = (WTCOutput)eResolveProxy(oldOutput__oBrakesSetProblem);
			if (output__oBrakesSetProblem != oldOutput__oBrakesSetProblem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT117__OUTPUT_OBRAKES_SET_PROBLEM, oldOutput__oBrakesSetProblem, output__oBrakesSetProblem));
			}
		}
		return output__oBrakesSetProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oBrakesSetProblem() {
		return output__oBrakesSetProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oBrakesSetProblem(WTCOutput newOutput__oBrakesSetProblem) {
		WTCOutput oldOutput__oBrakesSetProblem = output__oBrakesSetProblem;
		output__oBrakesSetProblem = newOutput__oBrakesSetProblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT117__OUTPUT_OBRAKES_SET_PROBLEM, oldOutput__oBrakesSetProblem, output__oBrakesSetProblem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oBrakesLiftedProblem() {
		if (output__oBrakesLiftedProblem != null && output__oBrakesLiftedProblem.eIsProxy()) {
			InternalEObject oldOutput__oBrakesLiftedProblem = (InternalEObject)output__oBrakesLiftedProblem;
			output__oBrakesLiftedProblem = (WTCOutput)eResolveProxy(oldOutput__oBrakesLiftedProblem);
			if (output__oBrakesLiftedProblem != oldOutput__oBrakesLiftedProblem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT117__OUTPUT_OBRAKES_LIFTED_PROBLEM, oldOutput__oBrakesLiftedProblem, output__oBrakesLiftedProblem));
			}
		}
		return output__oBrakesLiftedProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oBrakesLiftedProblem() {
		return output__oBrakesLiftedProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oBrakesLiftedProblem(WTCOutput newOutput__oBrakesLiftedProblem) {
		WTCOutput oldOutput__oBrakesLiftedProblem = output__oBrakesLiftedProblem;
		output__oBrakesLiftedProblem = newOutput__oBrakesLiftedProblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT117__OUTPUT_OBRAKES_LIFTED_PROBLEM, oldOutput__oBrakesLiftedProblem, output__oBrakesLiftedProblem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tYawBrakeActionsDelay() {
		if (timer__tYawBrakeActionsDelay != null && timer__tYawBrakeActionsDelay.eIsProxy()) {
			InternalEObject oldTimer__tYawBrakeActionsDelay = (InternalEObject)timer__tYawBrakeActionsDelay;
			timer__tYawBrakeActionsDelay = (WTCTimer)eResolveProxy(oldTimer__tYawBrakeActionsDelay);
			if (timer__tYawBrakeActionsDelay != oldTimer__tYawBrakeActionsDelay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT117__TIMER_TYAW_BRAKE_ACTIONS_DELAY, oldTimer__tYawBrakeActionsDelay, timer__tYawBrakeActionsDelay));
			}
		}
		return timer__tYawBrakeActionsDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tYawBrakeActionsDelay() {
		return timer__tYawBrakeActionsDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tYawBrakeActionsDelay(WTCTimer newTimer__tYawBrakeActionsDelay) {
		WTCTimer oldTimer__tYawBrakeActionsDelay = timer__tYawBrakeActionsDelay;
		timer__tYawBrakeActionsDelay = newTimer__tYawBrakeActionsDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT117__TIMER_TYAW_BRAKE_ACTIONS_DELAY, oldTimer__tYawBrakeActionsDelay, timer__tYawBrakeActionsDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_BRAKE_COMMAND:
				if (resolve) return getInput__iYawBrakeCommand();
				return basicGetInput__iYawBrakeCommand();
			case WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_ELECTROBRAKE_STATUS:
				if (resolve) return getInput__iYawElectrobrakeStatus();
				return basicGetInput__iYawElectrobrakeStatus();
			case WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_HYDRAULICBRAKE_STATUS:
				if (resolve) return getInput__iYawHydraulicbrakeStatus();
				return basicGetInput__iYawHydraulicbrakeStatus();
			case WTSpecPackage.CTRL_UNIT117__INPUT_IINHIBIT_YAW:
				if (resolve) return getInput__iInhibitYaw();
				return basicGetInput__iInhibitYaw();
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_BRAKE_STATUS:
				if (resolve) return getOutput__oYawBrakeStatus();
				return basicGetOutput__oYawBrakeStatus();
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_ELECTROBRAKE_ORDER:
				if (resolve) return getOutput__oYawElectrobrakeOrder();
				return basicGetOutput__oYawElectrobrakeOrder();
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_HYDRAULICBRAKE_ORDER:
				if (resolve) return getOutput__oYawHydraulicbrakeOrder();
				return basicGetOutput__oYawHydraulicbrakeOrder();
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OBRAKES_SET_PROBLEM:
				if (resolve) return getOutput__oBrakesSetProblem();
				return basicGetOutput__oBrakesSetProblem();
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OBRAKES_LIFTED_PROBLEM:
				if (resolve) return getOutput__oBrakesLiftedProblem();
				return basicGetOutput__oBrakesLiftedProblem();
			case WTSpecPackage.CTRL_UNIT117__TIMER_TYAW_BRAKE_ACTIONS_DELAY:
				if (resolve) return getTimer__tYawBrakeActionsDelay();
				return basicGetTimer__tYawBrakeActionsDelay();
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
			case WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_BRAKE_COMMAND:
				setInput__iYawBrakeCommand((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_ELECTROBRAKE_STATUS:
				setInput__iYawElectrobrakeStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_HYDRAULICBRAKE_STATUS:
				setInput__iYawHydraulicbrakeStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT117__INPUT_IINHIBIT_YAW:
				setInput__iInhibitYaw((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_BRAKE_STATUS:
				setOutput__oYawBrakeStatus((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_ELECTROBRAKE_ORDER:
				setOutput__oYawElectrobrakeOrder((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_HYDRAULICBRAKE_ORDER:
				setOutput__oYawHydraulicbrakeOrder((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OBRAKES_SET_PROBLEM:
				setOutput__oBrakesSetProblem((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OBRAKES_LIFTED_PROBLEM:
				setOutput__oBrakesLiftedProblem((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT117__TIMER_TYAW_BRAKE_ACTIONS_DELAY:
				setTimer__tYawBrakeActionsDelay((WTCTimer)newValue);
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
			case WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_BRAKE_COMMAND:
				setInput__iYawBrakeCommand((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_ELECTROBRAKE_STATUS:
				setInput__iYawElectrobrakeStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_HYDRAULICBRAKE_STATUS:
				setInput__iYawHydraulicbrakeStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT117__INPUT_IINHIBIT_YAW:
				setInput__iInhibitYaw((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_BRAKE_STATUS:
				setOutput__oYawBrakeStatus((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_ELECTROBRAKE_ORDER:
				setOutput__oYawElectrobrakeOrder((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_HYDRAULICBRAKE_ORDER:
				setOutput__oYawHydraulicbrakeOrder((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OBRAKES_SET_PROBLEM:
				setOutput__oBrakesSetProblem((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OBRAKES_LIFTED_PROBLEM:
				setOutput__oBrakesLiftedProblem((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT117__TIMER_TYAW_BRAKE_ACTIONS_DELAY:
				setTimer__tYawBrakeActionsDelay((WTCTimer)null);
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
			case WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_BRAKE_COMMAND:
				return input__iYawBrakeCommand != null;
			case WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_ELECTROBRAKE_STATUS:
				return input__iYawElectrobrakeStatus != null;
			case WTSpecPackage.CTRL_UNIT117__INPUT_IYAW_HYDRAULICBRAKE_STATUS:
				return input__iYawHydraulicbrakeStatus != null;
			case WTSpecPackage.CTRL_UNIT117__INPUT_IINHIBIT_YAW:
				return input__iInhibitYaw != null;
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_BRAKE_STATUS:
				return output__oYawBrakeStatus != null;
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_ELECTROBRAKE_ORDER:
				return output__oYawElectrobrakeOrder != null;
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OYAW_HYDRAULICBRAKE_ORDER:
				return output__oYawHydraulicbrakeOrder != null;
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OBRAKES_SET_PROBLEM:
				return output__oBrakesSetProblem != null;
			case WTSpecPackage.CTRL_UNIT117__OUTPUT_OBRAKES_LIFTED_PROBLEM:
				return output__oBrakesLiftedProblem != null;
			case WTSpecPackage.CTRL_UNIT117__TIMER_TYAW_BRAKE_ACTIONS_DELAY:
				return timer__tYawBrakeActionsDelay != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit117Impl
