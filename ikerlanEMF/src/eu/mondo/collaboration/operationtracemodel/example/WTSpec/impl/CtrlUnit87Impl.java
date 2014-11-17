/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit87;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCTimer;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit87</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit87Impl#getInput__iExternalOrder <em>Input iExternal Order</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit87Impl#getInput__iExternalFailure <em>Input iExternal Failure</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit87Impl#getOutput__oLubricationOrder <em>Output oLubrication Order</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit87Impl#getTimer__tDelay <em>Timer tDelay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit87Impl extends wtcImpl implements CtrlUnit87 {
	/**
	 * The cached value of the '{@link #getInput__iExternalOrder() <em>Input iExternal Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iExternalOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iExternalOrder;

	/**
	 * The cached value of the '{@link #getInput__iExternalFailure() <em>Input iExternal Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iExternalFailure()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iExternalFailure;

	/**
	 * The cached value of the '{@link #getOutput__oLubricationOrder() <em>Output oLubrication Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oLubricationOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oLubricationOrder;

	/**
	 * The cached value of the '{@link #getTimer__tDelay() <em>Timer tDelay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tDelay()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tDelay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit87Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit87();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iExternalOrder() {
		if (input__iExternalOrder != null && input__iExternalOrder.eIsProxy()) {
			InternalEObject oldInput__iExternalOrder = (InternalEObject)input__iExternalOrder;
			input__iExternalOrder = (WTCInput)eResolveProxy(oldInput__iExternalOrder);
			if (input__iExternalOrder != oldInput__iExternalOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT87__INPUT_IEXTERNAL_ORDER, oldInput__iExternalOrder, input__iExternalOrder));
			}
		}
		return input__iExternalOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iExternalOrder() {
		return input__iExternalOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iExternalOrder(WTCInput newInput__iExternalOrder) {
		WTCInput oldInput__iExternalOrder = input__iExternalOrder;
		input__iExternalOrder = newInput__iExternalOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT87__INPUT_IEXTERNAL_ORDER, oldInput__iExternalOrder, input__iExternalOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iExternalFailure() {
		if (input__iExternalFailure != null && input__iExternalFailure.eIsProxy()) {
			InternalEObject oldInput__iExternalFailure = (InternalEObject)input__iExternalFailure;
			input__iExternalFailure = (WTCInput)eResolveProxy(oldInput__iExternalFailure);
			if (input__iExternalFailure != oldInput__iExternalFailure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT87__INPUT_IEXTERNAL_FAILURE, oldInput__iExternalFailure, input__iExternalFailure));
			}
		}
		return input__iExternalFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iExternalFailure() {
		return input__iExternalFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iExternalFailure(WTCInput newInput__iExternalFailure) {
		WTCInput oldInput__iExternalFailure = input__iExternalFailure;
		input__iExternalFailure = newInput__iExternalFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT87__INPUT_IEXTERNAL_FAILURE, oldInput__iExternalFailure, input__iExternalFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oLubricationOrder() {
		if (output__oLubricationOrder != null && output__oLubricationOrder.eIsProxy()) {
			InternalEObject oldOutput__oLubricationOrder = (InternalEObject)output__oLubricationOrder;
			output__oLubricationOrder = (WTCOutput)eResolveProxy(oldOutput__oLubricationOrder);
			if (output__oLubricationOrder != oldOutput__oLubricationOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT87__OUTPUT_OLUBRICATION_ORDER, oldOutput__oLubricationOrder, output__oLubricationOrder));
			}
		}
		return output__oLubricationOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oLubricationOrder() {
		return output__oLubricationOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oLubricationOrder(WTCOutput newOutput__oLubricationOrder) {
		WTCOutput oldOutput__oLubricationOrder = output__oLubricationOrder;
		output__oLubricationOrder = newOutput__oLubricationOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT87__OUTPUT_OLUBRICATION_ORDER, oldOutput__oLubricationOrder, output__oLubricationOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tDelay() {
		if (timer__tDelay != null && timer__tDelay.eIsProxy()) {
			InternalEObject oldTimer__tDelay = (InternalEObject)timer__tDelay;
			timer__tDelay = (WTCTimer)eResolveProxy(oldTimer__tDelay);
			if (timer__tDelay != oldTimer__tDelay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT87__TIMER_TDELAY, oldTimer__tDelay, timer__tDelay));
			}
		}
		return timer__tDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tDelay() {
		return timer__tDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tDelay(WTCTimer newTimer__tDelay) {
		WTCTimer oldTimer__tDelay = timer__tDelay;
		timer__tDelay = newTimer__tDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT87__TIMER_TDELAY, oldTimer__tDelay, timer__tDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT87__INPUT_IEXTERNAL_ORDER:
				if (resolve) return getInput__iExternalOrder();
				return basicGetInput__iExternalOrder();
			case WTSpecPackage.CTRL_UNIT87__INPUT_IEXTERNAL_FAILURE:
				if (resolve) return getInput__iExternalFailure();
				return basicGetInput__iExternalFailure();
			case WTSpecPackage.CTRL_UNIT87__OUTPUT_OLUBRICATION_ORDER:
				if (resolve) return getOutput__oLubricationOrder();
				return basicGetOutput__oLubricationOrder();
			case WTSpecPackage.CTRL_UNIT87__TIMER_TDELAY:
				if (resolve) return getTimer__tDelay();
				return basicGetTimer__tDelay();
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
			case WTSpecPackage.CTRL_UNIT87__INPUT_IEXTERNAL_ORDER:
				setInput__iExternalOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT87__INPUT_IEXTERNAL_FAILURE:
				setInput__iExternalFailure((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT87__OUTPUT_OLUBRICATION_ORDER:
				setOutput__oLubricationOrder((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT87__TIMER_TDELAY:
				setTimer__tDelay((WTCTimer)newValue);
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
			case WTSpecPackage.CTRL_UNIT87__INPUT_IEXTERNAL_ORDER:
				setInput__iExternalOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT87__INPUT_IEXTERNAL_FAILURE:
				setInput__iExternalFailure((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT87__OUTPUT_OLUBRICATION_ORDER:
				setOutput__oLubricationOrder((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT87__TIMER_TDELAY:
				setTimer__tDelay((WTCTimer)null);
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
			case WTSpecPackage.CTRL_UNIT87__INPUT_IEXTERNAL_ORDER:
				return input__iExternalOrder != null;
			case WTSpecPackage.CTRL_UNIT87__INPUT_IEXTERNAL_FAILURE:
				return input__iExternalFailure != null;
			case WTSpecPackage.CTRL_UNIT87__OUTPUT_OLUBRICATION_ORDER:
				return output__oLubricationOrder != null;
			case WTSpecPackage.CTRL_UNIT87__TIMER_TDELAY:
				return timer__tDelay != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit87Impl
