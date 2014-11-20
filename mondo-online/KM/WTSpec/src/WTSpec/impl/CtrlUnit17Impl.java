/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit17;
import WTSpec.WTCFault;
import WTSpec.WTCParam;
import WTSpec.WTCTimer;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit17</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit17Impl#getParameter__pParam <em>Parameter pParam</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit17Impl#getFault__fWarning <em>Fault fWarning</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit17Impl#getFault__fFault <em>Fault fFault</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit17Impl#getTimer__tTimer <em>Timer tTimer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit17Impl extends wtcImpl implements CtrlUnit17 {
	/**
	 * The cached value of the '{@link #getParameter__pParam() <em>Parameter pParam</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pParam()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pParam;

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
	 * The cached value of the '{@link #getTimer__tTimer() <em>Timer tTimer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tTimer()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tTimer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit17Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit17();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pParam() {
		if (parameter__pParam != null && parameter__pParam.eIsProxy()) {
			InternalEObject oldParameter__pParam = (InternalEObject)parameter__pParam;
			parameter__pParam = (WTCParam)eResolveProxy(oldParameter__pParam);
			if (parameter__pParam != oldParameter__pParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT17__PARAMETER_PPARAM, oldParameter__pParam, parameter__pParam));
			}
		}
		return parameter__pParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pParam() {
		return parameter__pParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pParam(WTCParam newParameter__pParam) {
		WTCParam oldParameter__pParam = parameter__pParam;
		parameter__pParam = newParameter__pParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT17__PARAMETER_PPARAM, oldParameter__pParam, parameter__pParam));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT17__FAULT_FWARNING, oldFault__fWarning, fault__fWarning));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT17__FAULT_FWARNING, oldFault__fWarning, fault__fWarning));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT17__FAULT_FFAULT, oldFault__fFault, fault__fFault));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT17__FAULT_FFAULT, oldFault__fFault, fault__fFault));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT17__TIMER_TTIMER, oldTimer__tTimer, timer__tTimer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT17__TIMER_TTIMER, oldTimer__tTimer, timer__tTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT17__PARAMETER_PPARAM:
				if (resolve) return getParameter__pParam();
				return basicGetParameter__pParam();
			case WTSpecPackage.CTRL_UNIT17__FAULT_FWARNING:
				if (resolve) return getFault__fWarning();
				return basicGetFault__fWarning();
			case WTSpecPackage.CTRL_UNIT17__FAULT_FFAULT:
				if (resolve) return getFault__fFault();
				return basicGetFault__fFault();
			case WTSpecPackage.CTRL_UNIT17__TIMER_TTIMER:
				if (resolve) return getTimer__tTimer();
				return basicGetTimer__tTimer();
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
			case WTSpecPackage.CTRL_UNIT17__PARAMETER_PPARAM:
				setParameter__pParam((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT17__FAULT_FWARNING:
				setFault__fWarning((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT17__FAULT_FFAULT:
				setFault__fFault((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT17__TIMER_TTIMER:
				setTimer__tTimer((WTCTimer)newValue);
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
			case WTSpecPackage.CTRL_UNIT17__PARAMETER_PPARAM:
				setParameter__pParam((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT17__FAULT_FWARNING:
				setFault__fWarning((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT17__FAULT_FFAULT:
				setFault__fFault((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT17__TIMER_TTIMER:
				setTimer__tTimer((WTCTimer)null);
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
			case WTSpecPackage.CTRL_UNIT17__PARAMETER_PPARAM:
				return parameter__pParam != null;
			case WTSpecPackage.CTRL_UNIT17__FAULT_FWARNING:
				return fault__fWarning != null;
			case WTSpecPackage.CTRL_UNIT17__FAULT_FFAULT:
				return fault__fFault != null;
			case WTSpecPackage.CTRL_UNIT17__TIMER_TTIMER:
				return timer__tTimer != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit17Impl
