/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit8;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTCParam;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit8</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit8Impl#getInput__i1 <em>Input i1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit8Impl#getOutput__o1 <em>Output o1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit8Impl#getParameter__pDelay <em>Parameter pDelay</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit8Impl#getBhvParam__bpFilter <em>Bhv Param bp Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit8Impl extends wtcImpl implements CtrlUnit8 {
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
	 * The cached value of the '{@link #getParameter__pDelay() <em>Parameter pDelay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pDelay()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pDelay;

	/**
	 * The default value of the '{@link #getBhvParam__bpFilter() <em>Bhv Param bp Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String BHV_PARAM_BP_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBhvParam__bpFilter() <em>Bhv Param bp Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpFilter()
	 * @generated
	 * @ordered
	 */
	protected String bhvParam__bpFilter = BHV_PARAM_BP_FILTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit8Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT8;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT8__INPUT_I1, oldInput__i1, input__i1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT8__INPUT_I1, oldInput__i1, input__i1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT8__OUTPUT_O1, oldOutput__o1, output__o1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT8__OUTPUT_O1, oldOutput__o1, output__o1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pDelay() {
		if (parameter__pDelay != null && parameter__pDelay.eIsProxy()) {
			InternalEObject oldParameter__pDelay = (InternalEObject)parameter__pDelay;
			parameter__pDelay = (WTCParam)eResolveProxy(oldParameter__pDelay);
			if (parameter__pDelay != oldParameter__pDelay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT8__PARAMETER_PDELAY, oldParameter__pDelay, parameter__pDelay));
			}
		}
		return parameter__pDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pDelay() {
		return parameter__pDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pDelay(WTCParam newParameter__pDelay) {
		WTCParam oldParameter__pDelay = parameter__pDelay;
		parameter__pDelay = newParameter__pDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT8__PARAMETER_PDELAY, oldParameter__pDelay, parameter__pDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBhvParam__bpFilter() {
		return bhvParam__bpFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBhvParam__bpFilter(String newBhvParam__bpFilter) {
		String oldBhvParam__bpFilter = bhvParam__bpFilter;
		bhvParam__bpFilter = newBhvParam__bpFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT8__BHV_PARAM_BP_FILTER, oldBhvParam__bpFilter, bhvParam__bpFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT8__INPUT_I1:
				if (resolve) return getInput__i1();
				return basicGetInput__i1();
			case WTSpecPackage.CTRL_UNIT8__OUTPUT_O1:
				if (resolve) return getOutput__o1();
				return basicGetOutput__o1();
			case WTSpecPackage.CTRL_UNIT8__PARAMETER_PDELAY:
				if (resolve) return getParameter__pDelay();
				return basicGetParameter__pDelay();
			case WTSpecPackage.CTRL_UNIT8__BHV_PARAM_BP_FILTER:
				return getBhvParam__bpFilter();
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
			case WTSpecPackage.CTRL_UNIT8__INPUT_I1:
				setInput__i1((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT8__OUTPUT_O1:
				setOutput__o1((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT8__PARAMETER_PDELAY:
				setParameter__pDelay((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT8__BHV_PARAM_BP_FILTER:
				setBhvParam__bpFilter((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT8__INPUT_I1:
				setInput__i1((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT8__OUTPUT_O1:
				setOutput__o1((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT8__PARAMETER_PDELAY:
				setParameter__pDelay((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT8__BHV_PARAM_BP_FILTER:
				setBhvParam__bpFilter(BHV_PARAM_BP_FILTER_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT8__INPUT_I1:
				return input__i1 != null;
			case WTSpecPackage.CTRL_UNIT8__OUTPUT_O1:
				return output__o1 != null;
			case WTSpecPackage.CTRL_UNIT8__PARAMETER_PDELAY:
				return parameter__pDelay != null;
			case WTSpecPackage.CTRL_UNIT8__BHV_PARAM_BP_FILTER:
				return BHV_PARAM_BP_FILTER_EDEFAULT == null ? bhvParam__bpFilter != null : !BHV_PARAM_BP_FILTER_EDEFAULT.equals(bhvParam__bpFilter);
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
		result.append(" (BhvParam__bpFilter: ");
		result.append(bhvParam__bpFilter);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit8Impl
