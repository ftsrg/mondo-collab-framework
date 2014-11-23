/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit106;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCTimer;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit106</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit106Impl#getInput__i1 <em>Input i1</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit106Impl#getOutput__o1 <em>Output o1</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit106Impl#getTimer__t1 <em>Timer t1</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit106Impl#getTimer__t2 <em>Timer t2</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit106Impl#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit106Impl extends wtcImpl implements CtrlUnit106 {
	/**
	 * The cached value of the '{@link #getInput__i1() <em>Input i1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__i1()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__i1;

	/**
	 * The cached value of the '{@link #getOutput__o1() <em>Output o1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__o1()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__o1;

	/**
	 * The cached value of the '{@link #getTimer__t1() <em>Timer t1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__t1()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__t1;

	/**
	 * The cached value of the '{@link #getTimer__t2() <em>Timer t2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__t2()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__t2;

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
	protected CtrlUnit106Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit106();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__i1() {
		if (input__i1 != null && input__i1.eIsProxy()) {
			InternalEObject oldInput__i1 = (InternalEObject)input__i1;
			input__i1 = (WTCInput)eResolveProxy(oldInput__i1);
			if (input__i1 != oldInput__i1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT106__INPUT_I1, oldInput__i1, input__i1));
			}
		}
		return input__i1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__i1() {
		return input__i1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__i1(WTCInput newInput__i1) {
		WTCInput oldInput__i1 = input__i1;
		input__i1 = newInput__i1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT106__INPUT_I1, oldInput__i1, input__i1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__o1() {
		if (output__o1 != null && output__o1.eIsProxy()) {
			InternalEObject oldOutput__o1 = (InternalEObject)output__o1;
			output__o1 = (WTCOutput)eResolveProxy(oldOutput__o1);
			if (output__o1 != oldOutput__o1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT106__OUTPUT_O1, oldOutput__o1, output__o1));
			}
		}
		return output__o1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__o1() {
		return output__o1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__o1(WTCOutput newOutput__o1) {
		WTCOutput oldOutput__o1 = output__o1;
		output__o1 = newOutput__o1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT106__OUTPUT_O1, oldOutput__o1, output__o1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__t1() {
		if (timer__t1 != null && timer__t1.eIsProxy()) {
			InternalEObject oldTimer__t1 = (InternalEObject)timer__t1;
			timer__t1 = (WTCTimer)eResolveProxy(oldTimer__t1);
			if (timer__t1 != oldTimer__t1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT106__TIMER_T1, oldTimer__t1, timer__t1));
			}
		}
		return timer__t1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__t1() {
		return timer__t1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__t1(WTCTimer newTimer__t1) {
		WTCTimer oldTimer__t1 = timer__t1;
		timer__t1 = newTimer__t1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT106__TIMER_T1, oldTimer__t1, timer__t1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__t2() {
		if (timer__t2 != null && timer__t2.eIsProxy()) {
			InternalEObject oldTimer__t2 = (InternalEObject)timer__t2;
			timer__t2 = (WTCTimer)eResolveProxy(oldTimer__t2);
			if (timer__t2 != oldTimer__t2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT106__TIMER_T2, oldTimer__t2, timer__t2));
			}
		}
		return timer__t2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__t2() {
		return timer__t2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__t2(WTCTimer newTimer__t2) {
		WTCTimer oldTimer__t2 = timer__t2;
		timer__t2 = newTimer__t2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT106__TIMER_T2, oldTimer__t2, timer__t2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT106__BHV_PARAM_BP_MODE, oldBhvParam__bpMode, bhvParam__bpMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT106__INPUT_I1:
				if (resolve) return getInput__i1();
				return basicGetInput__i1();
			case WTSpecPackage.CTRL_UNIT106__OUTPUT_O1:
				if (resolve) return getOutput__o1();
				return basicGetOutput__o1();
			case WTSpecPackage.CTRL_UNIT106__TIMER_T1:
				if (resolve) return getTimer__t1();
				return basicGetTimer__t1();
			case WTSpecPackage.CTRL_UNIT106__TIMER_T2:
				if (resolve) return getTimer__t2();
				return basicGetTimer__t2();
			case WTSpecPackage.CTRL_UNIT106__BHV_PARAM_BP_MODE:
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
			case WTSpecPackage.CTRL_UNIT106__INPUT_I1:
				setInput__i1((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT106__OUTPUT_O1:
				setOutput__o1((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT106__TIMER_T1:
				setTimer__t1((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT106__TIMER_T2:
				setTimer__t2((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT106__BHV_PARAM_BP_MODE:
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
			case WTSpecPackage.CTRL_UNIT106__INPUT_I1:
				setInput__i1((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT106__OUTPUT_O1:
				setOutput__o1((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT106__TIMER_T1:
				setTimer__t1((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT106__TIMER_T2:
				setTimer__t2((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT106__BHV_PARAM_BP_MODE:
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
			case WTSpecPackage.CTRL_UNIT106__INPUT_I1:
				return input__i1 != null;
			case WTSpecPackage.CTRL_UNIT106__OUTPUT_O1:
				return output__o1 != null;
			case WTSpecPackage.CTRL_UNIT106__TIMER_T1:
				return timer__t1 != null;
			case WTSpecPackage.CTRL_UNIT106__TIMER_T2:
				return timer__t2 != null;
			case WTSpecPackage.CTRL_UNIT106__BHV_PARAM_BP_MODE:
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

} //CtrlUnit106Impl
