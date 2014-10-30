/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit36;
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
 * An implementation of the model object '<em><b>Ctrl Unit36</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit36Impl#getInput__i1 <em>Input i1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit36Impl#getOutput__o1 <em>Output o1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit36Impl#getParameter__pDelayOn <em>Parameter pDelay On</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit36Impl#getParameter__pDelayOff <em>Parameter pDelay Off</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit36Impl extends wtcImpl implements CtrlUnit36 {
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
	 * The cached value of the '{@link #getParameter__pDelayOn() <em>Parameter pDelay On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pDelayOn()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pDelayOn;

	/**
	 * The cached value of the '{@link #getParameter__pDelayOff() <em>Parameter pDelay Off</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pDelayOff()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pDelayOff;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit36Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT36;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT36__INPUT_I1, oldInput__i1, input__i1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT36__INPUT_I1, oldInput__i1, input__i1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT36__OUTPUT_O1, oldOutput__o1, output__o1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT36__OUTPUT_O1, oldOutput__o1, output__o1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pDelayOn() {
		if (parameter__pDelayOn != null && parameter__pDelayOn.eIsProxy()) {
			InternalEObject oldParameter__pDelayOn = (InternalEObject)parameter__pDelayOn;
			parameter__pDelayOn = (WTCParam)eResolveProxy(oldParameter__pDelayOn);
			if (parameter__pDelayOn != oldParameter__pDelayOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT36__PARAMETER_PDELAY_ON, oldParameter__pDelayOn, parameter__pDelayOn));
			}
		}
		return parameter__pDelayOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pDelayOn() {
		return parameter__pDelayOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pDelayOn(WTCParam newParameter__pDelayOn) {
		WTCParam oldParameter__pDelayOn = parameter__pDelayOn;
		parameter__pDelayOn = newParameter__pDelayOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT36__PARAMETER_PDELAY_ON, oldParameter__pDelayOn, parameter__pDelayOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pDelayOff() {
		if (parameter__pDelayOff != null && parameter__pDelayOff.eIsProxy()) {
			InternalEObject oldParameter__pDelayOff = (InternalEObject)parameter__pDelayOff;
			parameter__pDelayOff = (WTCParam)eResolveProxy(oldParameter__pDelayOff);
			if (parameter__pDelayOff != oldParameter__pDelayOff) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT36__PARAMETER_PDELAY_OFF, oldParameter__pDelayOff, parameter__pDelayOff));
			}
		}
		return parameter__pDelayOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pDelayOff() {
		return parameter__pDelayOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pDelayOff(WTCParam newParameter__pDelayOff) {
		WTCParam oldParameter__pDelayOff = parameter__pDelayOff;
		parameter__pDelayOff = newParameter__pDelayOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT36__PARAMETER_PDELAY_OFF, oldParameter__pDelayOff, parameter__pDelayOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT36__INPUT_I1:
				if (resolve) return getInput__i1();
				return basicGetInput__i1();
			case WTSpecPackage.CTRL_UNIT36__OUTPUT_O1:
				if (resolve) return getOutput__o1();
				return basicGetOutput__o1();
			case WTSpecPackage.CTRL_UNIT36__PARAMETER_PDELAY_ON:
				if (resolve) return getParameter__pDelayOn();
				return basicGetParameter__pDelayOn();
			case WTSpecPackage.CTRL_UNIT36__PARAMETER_PDELAY_OFF:
				if (resolve) return getParameter__pDelayOff();
				return basicGetParameter__pDelayOff();
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
			case WTSpecPackage.CTRL_UNIT36__INPUT_I1:
				setInput__i1((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT36__OUTPUT_O1:
				setOutput__o1((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT36__PARAMETER_PDELAY_ON:
				setParameter__pDelayOn((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT36__PARAMETER_PDELAY_OFF:
				setParameter__pDelayOff((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT36__INPUT_I1:
				setInput__i1((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT36__OUTPUT_O1:
				setOutput__o1((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT36__PARAMETER_PDELAY_ON:
				setParameter__pDelayOn((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT36__PARAMETER_PDELAY_OFF:
				setParameter__pDelayOff((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT36__INPUT_I1:
				return input__i1 != null;
			case WTSpecPackage.CTRL_UNIT36__OUTPUT_O1:
				return output__o1 != null;
			case WTSpecPackage.CTRL_UNIT36__PARAMETER_PDELAY_ON:
				return parameter__pDelayOn != null;
			case WTSpecPackage.CTRL_UNIT36__PARAMETER_PDELAY_OFF:
				return parameter__pDelayOff != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit36Impl
