/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit111;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCTimer;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit111</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit111Impl#getInput__iOrder <em>Input iOrder</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit111Impl#getTimer__tTimer <em>Timer tTimer</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit111Impl#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit111Impl extends wtcImpl implements CtrlUnit111 {
	/**
	 * The cached value of the '{@link #getInput__iOrder() <em>Input iOrder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iOrder;

	/**
	 * The cached value of the '{@link #getTimer__tTimer() <em>Timer tTimer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tTimer()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tTimer;

	/**
	 * The default value of the '{@link #getBhvParam__bpMode() <em>Bhv Param bp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpMode()
	 * @generated
	 * @ordered
	 */
	protected static final String BHV_PARAM_BP_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBhvParam__bpMode() <em>Bhv Param bp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpMode()
	 * @generated
	 * @ordered
	 */
	protected String bhvParam__bpMode = BHV_PARAM_BP_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit111Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit111();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iOrder() {
		if (input__iOrder != null && input__iOrder.eIsProxy()) {
			InternalEObject oldInput__iOrder = (InternalEObject)input__iOrder;
			input__iOrder = (WTCInput)eResolveProxy(oldInput__iOrder);
			if (input__iOrder != oldInput__iOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT111__INPUT_IORDER, oldInput__iOrder, input__iOrder));
			}
		}
		return input__iOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iOrder() {
		return input__iOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iOrder(WTCInput newInput__iOrder) {
		WTCInput oldInput__iOrder = input__iOrder;
		input__iOrder = newInput__iOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT111__INPUT_IORDER, oldInput__iOrder, input__iOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tTimer() {
		if (timer__tTimer != null && timer__tTimer.eIsProxy()) {
			InternalEObject oldTimer__tTimer = (InternalEObject)timer__tTimer;
			timer__tTimer = (WTCTimer)eResolveProxy(oldTimer__tTimer);
			if (timer__tTimer != oldTimer__tTimer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT111__TIMER_TTIMER, oldTimer__tTimer, timer__tTimer));
			}
		}
		return timer__tTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tTimer() {
		return timer__tTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tTimer(WTCTimer newTimer__tTimer) {
		WTCTimer oldTimer__tTimer = timer__tTimer;
		timer__tTimer = newTimer__tTimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT111__TIMER_TTIMER, oldTimer__tTimer, timer__tTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBhvParam__bpMode() {
		return bhvParam__bpMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBhvParam__bpMode(String newBhvParam__bpMode) {
		String oldBhvParam__bpMode = bhvParam__bpMode;
		bhvParam__bpMode = newBhvParam__bpMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT111__BHV_PARAM_BP_MODE, oldBhvParam__bpMode, bhvParam__bpMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT111__INPUT_IORDER:
				if (resolve) return getInput__iOrder();
				return basicGetInput__iOrder();
			case WTSpecPackage.CTRL_UNIT111__TIMER_TTIMER:
				if (resolve) return getTimer__tTimer();
				return basicGetTimer__tTimer();
			case WTSpecPackage.CTRL_UNIT111__BHV_PARAM_BP_MODE:
				return getBhvParam__bpMode();
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
			case WTSpecPackage.CTRL_UNIT111__INPUT_IORDER:
				setInput__iOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT111__TIMER_TTIMER:
				setTimer__tTimer((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT111__BHV_PARAM_BP_MODE:
				setBhvParam__bpMode((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT111__INPUT_IORDER:
				setInput__iOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT111__TIMER_TTIMER:
				setTimer__tTimer((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT111__BHV_PARAM_BP_MODE:
				setBhvParam__bpMode(BHV_PARAM_BP_MODE_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT111__INPUT_IORDER:
				return input__iOrder != null;
			case WTSpecPackage.CTRL_UNIT111__TIMER_TTIMER:
				return timer__tTimer != null;
			case WTSpecPackage.CTRL_UNIT111__BHV_PARAM_BP_MODE:
				return BHV_PARAM_BP_MODE_EDEFAULT == null ? bhvParam__bpMode != null : !BHV_PARAM_BP_MODE_EDEFAULT.equals(bhvParam__bpMode);
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
		result.append(" (BhvParam__bpMode: ");
		result.append(bhvParam__bpMode);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit111Impl
