/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit108;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCFault;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCTimer;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit108</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit108Impl#getInput__iVoltageDrop <em>Input iVoltage Drop</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit108Impl#getFault__fVoltageDrop <em>Fault fVoltage Drop</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit108Impl#getTimer__tAutoReset <em>Timer tAuto Reset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit108Impl extends wtcImpl implements CtrlUnit108 {
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
	 * The cached value of the '{@link #getFault__fVoltageDrop() <em>Fault fVoltage Drop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fVoltageDrop()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fVoltageDrop;

	/**
	 * The cached value of the '{@link #getTimer__tAutoReset() <em>Timer tAuto Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tAutoReset()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tAutoReset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit108Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit108();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT108__INPUT_IVOLTAGE_DROP, oldInput__iVoltageDrop, input__iVoltageDrop));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT108__INPUT_IVOLTAGE_DROP, oldInput__iVoltageDrop, input__iVoltageDrop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fVoltageDrop() {
		if (fault__fVoltageDrop != null && fault__fVoltageDrop.eIsProxy()) {
			InternalEObject oldFault__fVoltageDrop = (InternalEObject)fault__fVoltageDrop;
			fault__fVoltageDrop = (WTCFault)eResolveProxy(oldFault__fVoltageDrop);
			if (fault__fVoltageDrop != oldFault__fVoltageDrop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT108__FAULT_FVOLTAGE_DROP, oldFault__fVoltageDrop, fault__fVoltageDrop));
			}
		}
		return fault__fVoltageDrop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fVoltageDrop() {
		return fault__fVoltageDrop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fVoltageDrop(WTCFault newFault__fVoltageDrop) {
		WTCFault oldFault__fVoltageDrop = fault__fVoltageDrop;
		fault__fVoltageDrop = newFault__fVoltageDrop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT108__FAULT_FVOLTAGE_DROP, oldFault__fVoltageDrop, fault__fVoltageDrop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tAutoReset() {
		if (timer__tAutoReset != null && timer__tAutoReset.eIsProxy()) {
			InternalEObject oldTimer__tAutoReset = (InternalEObject)timer__tAutoReset;
			timer__tAutoReset = (WTCTimer)eResolveProxy(oldTimer__tAutoReset);
			if (timer__tAutoReset != oldTimer__tAutoReset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT108__TIMER_TAUTO_RESET, oldTimer__tAutoReset, timer__tAutoReset));
			}
		}
		return timer__tAutoReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tAutoReset() {
		return timer__tAutoReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tAutoReset(WTCTimer newTimer__tAutoReset) {
		WTCTimer oldTimer__tAutoReset = timer__tAutoReset;
		timer__tAutoReset = newTimer__tAutoReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT108__TIMER_TAUTO_RESET, oldTimer__tAutoReset, timer__tAutoReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT108__INPUT_IVOLTAGE_DROP:
				if (resolve) return getInput__iVoltageDrop();
				return basicGetInput__iVoltageDrop();
			case WTSpecPackage.CTRL_UNIT108__FAULT_FVOLTAGE_DROP:
				if (resolve) return getFault__fVoltageDrop();
				return basicGetFault__fVoltageDrop();
			case WTSpecPackage.CTRL_UNIT108__TIMER_TAUTO_RESET:
				if (resolve) return getTimer__tAutoReset();
				return basicGetTimer__tAutoReset();
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
			case WTSpecPackage.CTRL_UNIT108__INPUT_IVOLTAGE_DROP:
				setInput__iVoltageDrop((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT108__FAULT_FVOLTAGE_DROP:
				setFault__fVoltageDrop((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT108__TIMER_TAUTO_RESET:
				setTimer__tAutoReset((WTCTimer)newValue);
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
			case WTSpecPackage.CTRL_UNIT108__INPUT_IVOLTAGE_DROP:
				setInput__iVoltageDrop((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT108__FAULT_FVOLTAGE_DROP:
				setFault__fVoltageDrop((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT108__TIMER_TAUTO_RESET:
				setTimer__tAutoReset((WTCTimer)null);
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
			case WTSpecPackage.CTRL_UNIT108__INPUT_IVOLTAGE_DROP:
				return input__iVoltageDrop != null;
			case WTSpecPackage.CTRL_UNIT108__FAULT_FVOLTAGE_DROP:
				return fault__fVoltageDrop != null;
			case WTSpecPackage.CTRL_UNIT108__TIMER_TAUTO_RESET:
				return timer__tAutoReset != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit108Impl
