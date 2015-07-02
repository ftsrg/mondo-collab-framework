/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit48;
import WTSpec.WTCErrorReaction;
import WTSpec.WTCFault;
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
 * An implementation of the model object '<em><b>Ctrl Unit48</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit48Impl#getInput__iTemp1 <em>Input iTemp1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit48Impl#getInput__iTemp2 <em>Input iTemp2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit48Impl#getInput__iTemp3 <em>Input iTemp3</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit48Impl#getOutput__oFan <em>Output oFan</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit48Impl#getParameter__pTempLimit1 <em>Parameter pTemp Limit1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit48Impl#getParameter__pTempLimit2 <em>Parameter pTemp Limit2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit48Impl#getParameter__pTempLimit3 <em>Parameter pTemp Limit3</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit48Impl#getFault__fFault1 <em>Fault fFault1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit48Impl#getErrorReaction__erReaction1 <em>Error Reaction er Reaction1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit48Impl#getErrorReaction__erReaction2 <em>Error Reaction er Reaction2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit48Impl extends wtcImpl implements CtrlUnit48 {
	/**
	 * The cached value of the '{@link #getInput__iTemp1() <em>Input iTemp1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iTemp1()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iTemp1;

	/**
	 * The cached value of the '{@link #getInput__iTemp2() <em>Input iTemp2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iTemp2()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iTemp2;

	/**
	 * The cached value of the '{@link #getInput__iTemp3() <em>Input iTemp3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iTemp3()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iTemp3;

	/**
	 * The cached value of the '{@link #getOutput__oFan() <em>Output oFan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oFan()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oFan;

	/**
	 * The cached value of the '{@link #getParameter__pTempLimit1() <em>Parameter pTemp Limit1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pTempLimit1()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pTempLimit1;

	/**
	 * The cached value of the '{@link #getParameter__pTempLimit2() <em>Parameter pTemp Limit2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pTempLimit2()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pTempLimit2;

	/**
	 * The cached value of the '{@link #getParameter__pTempLimit3() <em>Parameter pTemp Limit3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pTempLimit3()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pTempLimit3;

	/**
	 * The cached value of the '{@link #getFault__fFault1() <em>Fault fFault1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fFault1()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fFault1;

	/**
	 * The cached value of the '{@link #getErrorReaction__erReaction1() <em>Error Reaction er Reaction1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorReaction__erReaction1()
	 * @generated
	 * @ordered
	 */
	protected WTCErrorReaction errorReaction__erReaction1;

	/**
	 * The cached value of the '{@link #getErrorReaction__erReaction2() <em>Error Reaction er Reaction2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorReaction__erReaction2()
	 * @generated
	 * @ordered
	 */
	protected WTCErrorReaction errorReaction__erReaction2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit48Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit48();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iTemp1() {
		if (input__iTemp1 != null && input__iTemp1.eIsProxy()) {
			InternalEObject oldInput__iTemp1 = (InternalEObject)input__iTemp1;
			input__iTemp1 = (WTCInput)eResolveProxy(oldInput__iTemp1);
			if (input__iTemp1 != oldInput__iTemp1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP1, oldInput__iTemp1, input__iTemp1));
			}
		}
		return input__iTemp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iTemp1() {
		return input__iTemp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iTemp1(WTCInput newInput__iTemp1) {
		WTCInput oldInput__iTemp1 = input__iTemp1;
		input__iTemp1 = newInput__iTemp1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP1, oldInput__iTemp1, input__iTemp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iTemp2() {
		if (input__iTemp2 != null && input__iTemp2.eIsProxy()) {
			InternalEObject oldInput__iTemp2 = (InternalEObject)input__iTemp2;
			input__iTemp2 = (WTCInput)eResolveProxy(oldInput__iTemp2);
			if (input__iTemp2 != oldInput__iTemp2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP2, oldInput__iTemp2, input__iTemp2));
			}
		}
		return input__iTemp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iTemp2() {
		return input__iTemp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iTemp2(WTCInput newInput__iTemp2) {
		WTCInput oldInput__iTemp2 = input__iTemp2;
		input__iTemp2 = newInput__iTemp2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP2, oldInput__iTemp2, input__iTemp2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iTemp3() {
		if (input__iTemp3 != null && input__iTemp3.eIsProxy()) {
			InternalEObject oldInput__iTemp3 = (InternalEObject)input__iTemp3;
			input__iTemp3 = (WTCInput)eResolveProxy(oldInput__iTemp3);
			if (input__iTemp3 != oldInput__iTemp3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP3, oldInput__iTemp3, input__iTemp3));
			}
		}
		return input__iTemp3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iTemp3() {
		return input__iTemp3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iTemp3(WTCInput newInput__iTemp3) {
		WTCInput oldInput__iTemp3 = input__iTemp3;
		input__iTemp3 = newInput__iTemp3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP3, oldInput__iTemp3, input__iTemp3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oFan() {
		if (output__oFan != null && output__oFan.eIsProxy()) {
			InternalEObject oldOutput__oFan = (InternalEObject)output__oFan;
			output__oFan = (WTCOutput)eResolveProxy(oldOutput__oFan);
			if (output__oFan != oldOutput__oFan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT48__OUTPUT_OFAN, oldOutput__oFan, output__oFan));
			}
		}
		return output__oFan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oFan() {
		return output__oFan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oFan(WTCOutput newOutput__oFan) {
		WTCOutput oldOutput__oFan = output__oFan;
		output__oFan = newOutput__oFan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT48__OUTPUT_OFAN, oldOutput__oFan, output__oFan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pTempLimit1() {
		if (parameter__pTempLimit1 != null && parameter__pTempLimit1.eIsProxy()) {
			InternalEObject oldParameter__pTempLimit1 = (InternalEObject)parameter__pTempLimit1;
			parameter__pTempLimit1 = (WTCParam)eResolveProxy(oldParameter__pTempLimit1);
			if (parameter__pTempLimit1 != oldParameter__pTempLimit1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT1, oldParameter__pTempLimit1, parameter__pTempLimit1));
			}
		}
		return parameter__pTempLimit1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pTempLimit1() {
		return parameter__pTempLimit1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pTempLimit1(WTCParam newParameter__pTempLimit1) {
		WTCParam oldParameter__pTempLimit1 = parameter__pTempLimit1;
		parameter__pTempLimit1 = newParameter__pTempLimit1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT1, oldParameter__pTempLimit1, parameter__pTempLimit1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pTempLimit2() {
		if (parameter__pTempLimit2 != null && parameter__pTempLimit2.eIsProxy()) {
			InternalEObject oldParameter__pTempLimit2 = (InternalEObject)parameter__pTempLimit2;
			parameter__pTempLimit2 = (WTCParam)eResolveProxy(oldParameter__pTempLimit2);
			if (parameter__pTempLimit2 != oldParameter__pTempLimit2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT2, oldParameter__pTempLimit2, parameter__pTempLimit2));
			}
		}
		return parameter__pTempLimit2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pTempLimit2() {
		return parameter__pTempLimit2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pTempLimit2(WTCParam newParameter__pTempLimit2) {
		WTCParam oldParameter__pTempLimit2 = parameter__pTempLimit2;
		parameter__pTempLimit2 = newParameter__pTempLimit2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT2, oldParameter__pTempLimit2, parameter__pTempLimit2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pTempLimit3() {
		if (parameter__pTempLimit3 != null && parameter__pTempLimit3.eIsProxy()) {
			InternalEObject oldParameter__pTempLimit3 = (InternalEObject)parameter__pTempLimit3;
			parameter__pTempLimit3 = (WTCParam)eResolveProxy(oldParameter__pTempLimit3);
			if (parameter__pTempLimit3 != oldParameter__pTempLimit3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT3, oldParameter__pTempLimit3, parameter__pTempLimit3));
			}
		}
		return parameter__pTempLimit3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pTempLimit3() {
		return parameter__pTempLimit3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pTempLimit3(WTCParam newParameter__pTempLimit3) {
		WTCParam oldParameter__pTempLimit3 = parameter__pTempLimit3;
		parameter__pTempLimit3 = newParameter__pTempLimit3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT3, oldParameter__pTempLimit3, parameter__pTempLimit3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fFault1() {
		if (fault__fFault1 != null && fault__fFault1.eIsProxy()) {
			InternalEObject oldFault__fFault1 = (InternalEObject)fault__fFault1;
			fault__fFault1 = (WTCFault)eResolveProxy(oldFault__fFault1);
			if (fault__fFault1 != oldFault__fFault1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT48__FAULT_FFAULT1, oldFault__fFault1, fault__fFault1));
			}
		}
		return fault__fFault1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fFault1() {
		return fault__fFault1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fFault1(WTCFault newFault__fFault1) {
		WTCFault oldFault__fFault1 = fault__fFault1;
		fault__fFault1 = newFault__fFault1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT48__FAULT_FFAULT1, oldFault__fFault1, fault__fFault1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction getErrorReaction__erReaction1() {
		if (errorReaction__erReaction1 != null && errorReaction__erReaction1.eIsProxy()) {
			InternalEObject oldErrorReaction__erReaction1 = (InternalEObject)errorReaction__erReaction1;
			errorReaction__erReaction1 = (WTCErrorReaction)eResolveProxy(oldErrorReaction__erReaction1);
			if (errorReaction__erReaction1 != oldErrorReaction__erReaction1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT48__ERROR_REACTION_ER_REACTION1, oldErrorReaction__erReaction1, errorReaction__erReaction1));
			}
		}
		return errorReaction__erReaction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction basicGetErrorReaction__erReaction1() {
		return errorReaction__erReaction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorReaction__erReaction1(WTCErrorReaction newErrorReaction__erReaction1) {
		WTCErrorReaction oldErrorReaction__erReaction1 = errorReaction__erReaction1;
		errorReaction__erReaction1 = newErrorReaction__erReaction1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT48__ERROR_REACTION_ER_REACTION1, oldErrorReaction__erReaction1, errorReaction__erReaction1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction getErrorReaction__erReaction2() {
		if (errorReaction__erReaction2 != null && errorReaction__erReaction2.eIsProxy()) {
			InternalEObject oldErrorReaction__erReaction2 = (InternalEObject)errorReaction__erReaction2;
			errorReaction__erReaction2 = (WTCErrorReaction)eResolveProxy(oldErrorReaction__erReaction2);
			if (errorReaction__erReaction2 != oldErrorReaction__erReaction2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT48__ERROR_REACTION_ER_REACTION2, oldErrorReaction__erReaction2, errorReaction__erReaction2));
			}
		}
		return errorReaction__erReaction2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction basicGetErrorReaction__erReaction2() {
		return errorReaction__erReaction2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorReaction__erReaction2(WTCErrorReaction newErrorReaction__erReaction2) {
		WTCErrorReaction oldErrorReaction__erReaction2 = errorReaction__erReaction2;
		errorReaction__erReaction2 = newErrorReaction__erReaction2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT48__ERROR_REACTION_ER_REACTION2, oldErrorReaction__erReaction2, errorReaction__erReaction2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP1:
				if (resolve) return getInput__iTemp1();
				return basicGetInput__iTemp1();
			case WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP2:
				if (resolve) return getInput__iTemp2();
				return basicGetInput__iTemp2();
			case WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP3:
				if (resolve) return getInput__iTemp3();
				return basicGetInput__iTemp3();
			case WTSpecPackage.CTRL_UNIT48__OUTPUT_OFAN:
				if (resolve) return getOutput__oFan();
				return basicGetOutput__oFan();
			case WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT1:
				if (resolve) return getParameter__pTempLimit1();
				return basicGetParameter__pTempLimit1();
			case WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT2:
				if (resolve) return getParameter__pTempLimit2();
				return basicGetParameter__pTempLimit2();
			case WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT3:
				if (resolve) return getParameter__pTempLimit3();
				return basicGetParameter__pTempLimit3();
			case WTSpecPackage.CTRL_UNIT48__FAULT_FFAULT1:
				if (resolve) return getFault__fFault1();
				return basicGetFault__fFault1();
			case WTSpecPackage.CTRL_UNIT48__ERROR_REACTION_ER_REACTION1:
				if (resolve) return getErrorReaction__erReaction1();
				return basicGetErrorReaction__erReaction1();
			case WTSpecPackage.CTRL_UNIT48__ERROR_REACTION_ER_REACTION2:
				if (resolve) return getErrorReaction__erReaction2();
				return basicGetErrorReaction__erReaction2();
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
			case WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP1:
				setInput__iTemp1((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP2:
				setInput__iTemp2((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP3:
				setInput__iTemp3((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT48__OUTPUT_OFAN:
				setOutput__oFan((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT1:
				setParameter__pTempLimit1((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT2:
				setParameter__pTempLimit2((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT3:
				setParameter__pTempLimit3((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT48__FAULT_FFAULT1:
				setFault__fFault1((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT48__ERROR_REACTION_ER_REACTION1:
				setErrorReaction__erReaction1((WTCErrorReaction)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT48__ERROR_REACTION_ER_REACTION2:
				setErrorReaction__erReaction2((WTCErrorReaction)newValue);
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
			case WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP1:
				setInput__iTemp1((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP2:
				setInput__iTemp2((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP3:
				setInput__iTemp3((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT48__OUTPUT_OFAN:
				setOutput__oFan((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT1:
				setParameter__pTempLimit1((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT2:
				setParameter__pTempLimit2((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT3:
				setParameter__pTempLimit3((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT48__FAULT_FFAULT1:
				setFault__fFault1((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT48__ERROR_REACTION_ER_REACTION1:
				setErrorReaction__erReaction1((WTCErrorReaction)null);
				return;
			case WTSpecPackage.CTRL_UNIT48__ERROR_REACTION_ER_REACTION2:
				setErrorReaction__erReaction2((WTCErrorReaction)null);
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
			case WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP1:
				return input__iTemp1 != null;
			case WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP2:
				return input__iTemp2 != null;
			case WTSpecPackage.CTRL_UNIT48__INPUT_ITEMP3:
				return input__iTemp3 != null;
			case WTSpecPackage.CTRL_UNIT48__OUTPUT_OFAN:
				return output__oFan != null;
			case WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT1:
				return parameter__pTempLimit1 != null;
			case WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT2:
				return parameter__pTempLimit2 != null;
			case WTSpecPackage.CTRL_UNIT48__PARAMETER_PTEMP_LIMIT3:
				return parameter__pTempLimit3 != null;
			case WTSpecPackage.CTRL_UNIT48__FAULT_FFAULT1:
				return fault__fFault1 != null;
			case WTSpecPackage.CTRL_UNIT48__ERROR_REACTION_ER_REACTION1:
				return errorReaction__erReaction1 != null;
			case WTSpecPackage.CTRL_UNIT48__ERROR_REACTION_ER_REACTION2:
				return errorReaction__erReaction2 != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit48Impl
