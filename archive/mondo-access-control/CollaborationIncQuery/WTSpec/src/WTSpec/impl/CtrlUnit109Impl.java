/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit109;
import WTSpec.WTCErrorReaction;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit109</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit109Impl#getInput__iInvHwRun <em>Input iInv Hw Run</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit109Impl#getInput__iVoltageDrop <em>Input iVoltage Drop</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit109Impl#getInput__iTorqueDemand <em>Input iTorque Demand</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit109Impl#getInput__iInvStopOrder <em>Input iInv Stop Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit109Impl#getOutput__oTorqueReference <em>Output oTorque Reference</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit109Impl#getErrorReaction__erStop <em>Error Reaction er Stop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit109Impl extends wtcImpl implements CtrlUnit109 {
	/**
	 * The cached value of the '{@link #getInput__iInvHwRun() <em>Input iInv Hw Run</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInvHwRun()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInvHwRun;

	/**
	 * The cached value of the '{@link #getInput__iVoltageDrop() <em>Input iVoltage Drop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iVoltageDrop()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iVoltageDrop;

	/**
	 * The cached value of the '{@link #getInput__iTorqueDemand() <em>Input iTorque Demand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iTorqueDemand()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iTorqueDemand;

	/**
	 * The cached value of the '{@link #getInput__iInvStopOrder() <em>Input iInv Stop Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInvStopOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInvStopOrder;

	/**
	 * The cached value of the '{@link #getOutput__oTorqueReference() <em>Output oTorque Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oTorqueReference()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oTorqueReference;

	/**
	 * The cached value of the '{@link #getErrorReaction__erStop() <em>Error Reaction er Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorReaction__erStop()
	 * @generated
	 * @ordered
	 */
	protected WTCErrorReaction errorReaction__erStop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit109Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT109;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInvHwRun() {
		if (input__iInvHwRun != null && input__iInvHwRun.eIsProxy()) {
			InternalEObject oldInput__iInvHwRun = (InternalEObject)input__iInvHwRun;
			input__iInvHwRun = (WTCInput)eResolveProxy(oldInput__iInvHwRun);
			if (input__iInvHwRun != oldInput__iInvHwRun) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT109__INPUT_IINV_HW_RUN, oldInput__iInvHwRun, input__iInvHwRun));
			}
		}
		return input__iInvHwRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInvHwRun() {
		return input__iInvHwRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInvHwRun(WTCInput newInput__iInvHwRun) {
		WTCInput oldInput__iInvHwRun = input__iInvHwRun;
		input__iInvHwRun = newInput__iInvHwRun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT109__INPUT_IINV_HW_RUN, oldInput__iInvHwRun, input__iInvHwRun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iVoltageDrop() {
		if (input__iVoltageDrop != null && input__iVoltageDrop.eIsProxy()) {
			InternalEObject oldInput__iVoltageDrop = (InternalEObject)input__iVoltageDrop;
			input__iVoltageDrop = (WTCInput)eResolveProxy(oldInput__iVoltageDrop);
			if (input__iVoltageDrop != oldInput__iVoltageDrop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT109__INPUT_IVOLTAGE_DROP, oldInput__iVoltageDrop, input__iVoltageDrop));
			}
		}
		return input__iVoltageDrop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iVoltageDrop() {
		return input__iVoltageDrop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iVoltageDrop(WTCInput newInput__iVoltageDrop) {
		WTCInput oldInput__iVoltageDrop = input__iVoltageDrop;
		input__iVoltageDrop = newInput__iVoltageDrop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT109__INPUT_IVOLTAGE_DROP, oldInput__iVoltageDrop, input__iVoltageDrop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iTorqueDemand() {
		if (input__iTorqueDemand != null && input__iTorqueDemand.eIsProxy()) {
			InternalEObject oldInput__iTorqueDemand = (InternalEObject)input__iTorqueDemand;
			input__iTorqueDemand = (WTCInput)eResolveProxy(oldInput__iTorqueDemand);
			if (input__iTorqueDemand != oldInput__iTorqueDemand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT109__INPUT_ITORQUE_DEMAND, oldInput__iTorqueDemand, input__iTorqueDemand));
			}
		}
		return input__iTorqueDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iTorqueDemand() {
		return input__iTorqueDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iTorqueDemand(WTCInput newInput__iTorqueDemand) {
		WTCInput oldInput__iTorqueDemand = input__iTorqueDemand;
		input__iTorqueDemand = newInput__iTorqueDemand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT109__INPUT_ITORQUE_DEMAND, oldInput__iTorqueDemand, input__iTorqueDemand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInvStopOrder() {
		if (input__iInvStopOrder != null && input__iInvStopOrder.eIsProxy()) {
			InternalEObject oldInput__iInvStopOrder = (InternalEObject)input__iInvStopOrder;
			input__iInvStopOrder = (WTCInput)eResolveProxy(oldInput__iInvStopOrder);
			if (input__iInvStopOrder != oldInput__iInvStopOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT109__INPUT_IINV_STOP_ORDER, oldInput__iInvStopOrder, input__iInvStopOrder));
			}
		}
		return input__iInvStopOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInvStopOrder() {
		return input__iInvStopOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInvStopOrder(WTCInput newInput__iInvStopOrder) {
		WTCInput oldInput__iInvStopOrder = input__iInvStopOrder;
		input__iInvStopOrder = newInput__iInvStopOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT109__INPUT_IINV_STOP_ORDER, oldInput__iInvStopOrder, input__iInvStopOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oTorqueReference() {
		if (output__oTorqueReference != null && output__oTorqueReference.eIsProxy()) {
			InternalEObject oldOutput__oTorqueReference = (InternalEObject)output__oTorqueReference;
			output__oTorqueReference = (WTCOutput)eResolveProxy(oldOutput__oTorqueReference);
			if (output__oTorqueReference != oldOutput__oTorqueReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT109__OUTPUT_OTORQUE_REFERENCE, oldOutput__oTorqueReference, output__oTorqueReference));
			}
		}
		return output__oTorqueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oTorqueReference() {
		return output__oTorqueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oTorqueReference(WTCOutput newOutput__oTorqueReference) {
		WTCOutput oldOutput__oTorqueReference = output__oTorqueReference;
		output__oTorqueReference = newOutput__oTorqueReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT109__OUTPUT_OTORQUE_REFERENCE, oldOutput__oTorqueReference, output__oTorqueReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction getErrorReaction__erStop() {
		if (errorReaction__erStop != null && errorReaction__erStop.eIsProxy()) {
			InternalEObject oldErrorReaction__erStop = (InternalEObject)errorReaction__erStop;
			errorReaction__erStop = (WTCErrorReaction)eResolveProxy(oldErrorReaction__erStop);
			if (errorReaction__erStop != oldErrorReaction__erStop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT109__ERROR_REACTION_ER_STOP, oldErrorReaction__erStop, errorReaction__erStop));
			}
		}
		return errorReaction__erStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction basicGetErrorReaction__erStop() {
		return errorReaction__erStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorReaction__erStop(WTCErrorReaction newErrorReaction__erStop) {
		WTCErrorReaction oldErrorReaction__erStop = errorReaction__erStop;
		errorReaction__erStop = newErrorReaction__erStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT109__ERROR_REACTION_ER_STOP, oldErrorReaction__erStop, errorReaction__erStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT109__INPUT_IINV_HW_RUN:
				if (resolve) return getInput__iInvHwRun();
				return basicGetInput__iInvHwRun();
			case WTSpecPackage.CTRL_UNIT109__INPUT_IVOLTAGE_DROP:
				if (resolve) return getInput__iVoltageDrop();
				return basicGetInput__iVoltageDrop();
			case WTSpecPackage.CTRL_UNIT109__INPUT_ITORQUE_DEMAND:
				if (resolve) return getInput__iTorqueDemand();
				return basicGetInput__iTorqueDemand();
			case WTSpecPackage.CTRL_UNIT109__INPUT_IINV_STOP_ORDER:
				if (resolve) return getInput__iInvStopOrder();
				return basicGetInput__iInvStopOrder();
			case WTSpecPackage.CTRL_UNIT109__OUTPUT_OTORQUE_REFERENCE:
				if (resolve) return getOutput__oTorqueReference();
				return basicGetOutput__oTorqueReference();
			case WTSpecPackage.CTRL_UNIT109__ERROR_REACTION_ER_STOP:
				if (resolve) return getErrorReaction__erStop();
				return basicGetErrorReaction__erStop();
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
			case WTSpecPackage.CTRL_UNIT109__INPUT_IINV_HW_RUN:
				setInput__iInvHwRun((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT109__INPUT_IVOLTAGE_DROP:
				setInput__iVoltageDrop((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT109__INPUT_ITORQUE_DEMAND:
				setInput__iTorqueDemand((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT109__INPUT_IINV_STOP_ORDER:
				setInput__iInvStopOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT109__OUTPUT_OTORQUE_REFERENCE:
				setOutput__oTorqueReference((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT109__ERROR_REACTION_ER_STOP:
				setErrorReaction__erStop((WTCErrorReaction)newValue);
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
			case WTSpecPackage.CTRL_UNIT109__INPUT_IINV_HW_RUN:
				setInput__iInvHwRun((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT109__INPUT_IVOLTAGE_DROP:
				setInput__iVoltageDrop((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT109__INPUT_ITORQUE_DEMAND:
				setInput__iTorqueDemand((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT109__INPUT_IINV_STOP_ORDER:
				setInput__iInvStopOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT109__OUTPUT_OTORQUE_REFERENCE:
				setOutput__oTorqueReference((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT109__ERROR_REACTION_ER_STOP:
				setErrorReaction__erStop((WTCErrorReaction)null);
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
			case WTSpecPackage.CTRL_UNIT109__INPUT_IINV_HW_RUN:
				return input__iInvHwRun != null;
			case WTSpecPackage.CTRL_UNIT109__INPUT_IVOLTAGE_DROP:
				return input__iVoltageDrop != null;
			case WTSpecPackage.CTRL_UNIT109__INPUT_ITORQUE_DEMAND:
				return input__iTorqueDemand != null;
			case WTSpecPackage.CTRL_UNIT109__INPUT_IINV_STOP_ORDER:
				return input__iInvStopOrder != null;
			case WTSpecPackage.CTRL_UNIT109__OUTPUT_OTORQUE_REFERENCE:
				return output__oTorqueReference != null;
			case WTSpecPackage.CTRL_UNIT109__ERROR_REACTION_ER_STOP:
				return errorReaction__erStop != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit109Impl
