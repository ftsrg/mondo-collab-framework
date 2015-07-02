/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit41;
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
 * An implementation of the model object '<em><b>Ctrl Unit41</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit41Impl#getInput__iInput1 <em>Input iInput1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit41Impl#getInput__iInput2 <em>Input iInput2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit41Impl#getInput__iInput3 <em>Input iInput3</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit41Impl#getOutput__oOutput <em>Output oOutput</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit41Impl#getParameter__pParam1 <em>Parameter pParam1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit41Impl#getParameter__pParam2 <em>Parameter pParam2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit41Impl#getParameter__pParam3 <em>Parameter pParam3</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit41Impl#getFault__fFault1 <em>Fault fFault1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit41Impl#getFault__fFault2 <em>Fault fFault2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit41Impl#getFault__fFault3 <em>Fault fFault3</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit41Impl#getErrorReaction__eReaction1 <em>Error Reaction eReaction1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit41Impl#getErrorReaction__eReaction2 <em>Error Reaction eReaction2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit41Impl#getGuard__gGuardToMain <em>Guard gGuard To Main</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit41Impl#getGuard__gGuardFromMain <em>Guard gGuard From Main</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit41Impl#getGuard__gGuardToOn <em>Guard gGuard To On</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit41Impl#getGuard__gGuardToOff <em>Guard gGuard To Off</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit41Impl extends wtcImpl implements CtrlUnit41 {
	/**
	 * The cached value of the '{@link #getInput__iInput1() <em>Input iInput1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInput1()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInput1;

	/**
	 * The cached value of the '{@link #getInput__iInput2() <em>Input iInput2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInput2()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInput2;

	/**
	 * The cached value of the '{@link #getInput__iInput3() <em>Input iInput3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInput3()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInput3;

	/**
	 * The cached value of the '{@link #getOutput__oOutput() <em>Output oOutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOutput()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOutput;

	/**
	 * The cached value of the '{@link #getParameter__pParam1() <em>Parameter pParam1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pParam1()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pParam1;

	/**
	 * The cached value of the '{@link #getParameter__pParam2() <em>Parameter pParam2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pParam2()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pParam2;

	/**
	 * The cached value of the '{@link #getParameter__pParam3() <em>Parameter pParam3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pParam3()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pParam3;

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
	 * The cached value of the '{@link #getFault__fFault2() <em>Fault fFault2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fFault2()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fFault2;

	/**
	 * The cached value of the '{@link #getFault__fFault3() <em>Fault fFault3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fFault3()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fFault3;

	/**
	 * The cached value of the '{@link #getErrorReaction__eReaction1() <em>Error Reaction eReaction1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorReaction__eReaction1()
	 * @generated
	 * @ordered
	 */
	protected WTCErrorReaction errorReaction__eReaction1;

	/**
	 * The cached value of the '{@link #getErrorReaction__eReaction2() <em>Error Reaction eReaction2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorReaction__eReaction2()
	 * @generated
	 * @ordered
	 */
	protected WTCErrorReaction errorReaction__eReaction2;

	/**
	 * The default value of the '{@link #getGuard__gGuardToMain() <em>Guard gGuard To Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardToMain()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_GGUARD_TO_MAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard__gGuardToMain() <em>Guard gGuard To Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardToMain()
	 * @generated
	 * @ordered
	 */
	protected String guard__gGuardToMain = GUARD_GGUARD_TO_MAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuard__gGuardFromMain() <em>Guard gGuard From Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardFromMain()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_GGUARD_FROM_MAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard__gGuardFromMain() <em>Guard gGuard From Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardFromMain()
	 * @generated
	 * @ordered
	 */
	protected String guard__gGuardFromMain = GUARD_GGUARD_FROM_MAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuard__gGuardToOn() <em>Guard gGuard To On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardToOn()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_GGUARD_TO_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard__gGuardToOn() <em>Guard gGuard To On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardToOn()
	 * @generated
	 * @ordered
	 */
	protected String guard__gGuardToOn = GUARD_GGUARD_TO_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuard__gGuardToOff() <em>Guard gGuard To Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardToOff()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_GGUARD_TO_OFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard__gGuardToOff() <em>Guard gGuard To Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardToOff()
	 * @generated
	 * @ordered
	 */
	protected String guard__gGuardToOff = GUARD_GGUARD_TO_OFF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit41Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit41();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInput1() {
		if (input__iInput1 != null && input__iInput1.eIsProxy()) {
			InternalEObject oldInput__iInput1 = (InternalEObject)input__iInput1;
			input__iInput1 = (WTCInput)eResolveProxy(oldInput__iInput1);
			if (input__iInput1 != oldInput__iInput1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
			}
		}
		return input__iInput1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInput1() {
		return input__iInput1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInput1(WTCInput newInput__iInput1) {
		WTCInput oldInput__iInput1 = input__iInput1;
		input__iInput1 = newInput__iInput1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInput2() {
		if (input__iInput2 != null && input__iInput2.eIsProxy()) {
			InternalEObject oldInput__iInput2 = (InternalEObject)input__iInput2;
			input__iInput2 = (WTCInput)eResolveProxy(oldInput__iInput2);
			if (input__iInput2 != oldInput__iInput2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
			}
		}
		return input__iInput2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInput2() {
		return input__iInput2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInput2(WTCInput newInput__iInput2) {
		WTCInput oldInput__iInput2 = input__iInput2;
		input__iInput2 = newInput__iInput2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInput3() {
		if (input__iInput3 != null && input__iInput3.eIsProxy()) {
			InternalEObject oldInput__iInput3 = (InternalEObject)input__iInput3;
			input__iInput3 = (WTCInput)eResolveProxy(oldInput__iInput3);
			if (input__iInput3 != oldInput__iInput3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT3, oldInput__iInput3, input__iInput3));
			}
		}
		return input__iInput3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInput3() {
		return input__iInput3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInput3(WTCInput newInput__iInput3) {
		WTCInput oldInput__iInput3 = input__iInput3;
		input__iInput3 = newInput__iInput3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT3, oldInput__iInput3, input__iInput3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOutput() {
		if (output__oOutput != null && output__oOutput.eIsProxy()) {
			InternalEObject oldOutput__oOutput = (InternalEObject)output__oOutput;
			output__oOutput = (WTCOutput)eResolveProxy(oldOutput__oOutput);
			if (output__oOutput != oldOutput__oOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT41__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
			}
		}
		return output__oOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOutput() {
		return output__oOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOutput(WTCOutput newOutput__oOutput) {
		WTCOutput oldOutput__oOutput = output__oOutput;
		output__oOutput = newOutput__oOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT41__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pParam1() {
		if (parameter__pParam1 != null && parameter__pParam1.eIsProxy()) {
			InternalEObject oldParameter__pParam1 = (InternalEObject)parameter__pParam1;
			parameter__pParam1 = (WTCParam)eResolveProxy(oldParameter__pParam1);
			if (parameter__pParam1 != oldParameter__pParam1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM1, oldParameter__pParam1, parameter__pParam1));
			}
		}
		return parameter__pParam1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pParam1() {
		return parameter__pParam1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pParam1(WTCParam newParameter__pParam1) {
		WTCParam oldParameter__pParam1 = parameter__pParam1;
		parameter__pParam1 = newParameter__pParam1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM1, oldParameter__pParam1, parameter__pParam1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pParam2() {
		if (parameter__pParam2 != null && parameter__pParam2.eIsProxy()) {
			InternalEObject oldParameter__pParam2 = (InternalEObject)parameter__pParam2;
			parameter__pParam2 = (WTCParam)eResolveProxy(oldParameter__pParam2);
			if (parameter__pParam2 != oldParameter__pParam2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM2, oldParameter__pParam2, parameter__pParam2));
			}
		}
		return parameter__pParam2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pParam2() {
		return parameter__pParam2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pParam2(WTCParam newParameter__pParam2) {
		WTCParam oldParameter__pParam2 = parameter__pParam2;
		parameter__pParam2 = newParameter__pParam2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM2, oldParameter__pParam2, parameter__pParam2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pParam3() {
		if (parameter__pParam3 != null && parameter__pParam3.eIsProxy()) {
			InternalEObject oldParameter__pParam3 = (InternalEObject)parameter__pParam3;
			parameter__pParam3 = (WTCParam)eResolveProxy(oldParameter__pParam3);
			if (parameter__pParam3 != oldParameter__pParam3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM3, oldParameter__pParam3, parameter__pParam3));
			}
		}
		return parameter__pParam3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pParam3() {
		return parameter__pParam3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pParam3(WTCParam newParameter__pParam3) {
		WTCParam oldParameter__pParam3 = parameter__pParam3;
		parameter__pParam3 = newParameter__pParam3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM3, oldParameter__pParam3, parameter__pParam3));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT1, oldFault__fFault1, fault__fFault1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT1, oldFault__fFault1, fault__fFault1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fFault2() {
		if (fault__fFault2 != null && fault__fFault2.eIsProxy()) {
			InternalEObject oldFault__fFault2 = (InternalEObject)fault__fFault2;
			fault__fFault2 = (WTCFault)eResolveProxy(oldFault__fFault2);
			if (fault__fFault2 != oldFault__fFault2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT2, oldFault__fFault2, fault__fFault2));
			}
		}
		return fault__fFault2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fFault2() {
		return fault__fFault2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fFault2(WTCFault newFault__fFault2) {
		WTCFault oldFault__fFault2 = fault__fFault2;
		fault__fFault2 = newFault__fFault2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT2, oldFault__fFault2, fault__fFault2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fFault3() {
		if (fault__fFault3 != null && fault__fFault3.eIsProxy()) {
			InternalEObject oldFault__fFault3 = (InternalEObject)fault__fFault3;
			fault__fFault3 = (WTCFault)eResolveProxy(oldFault__fFault3);
			if (fault__fFault3 != oldFault__fFault3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT3, oldFault__fFault3, fault__fFault3));
			}
		}
		return fault__fFault3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fFault3() {
		return fault__fFault3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fFault3(WTCFault newFault__fFault3) {
		WTCFault oldFault__fFault3 = fault__fFault3;
		fault__fFault3 = newFault__fFault3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT3, oldFault__fFault3, fault__fFault3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction getErrorReaction__eReaction1() {
		if (errorReaction__eReaction1 != null && errorReaction__eReaction1.eIsProxy()) {
			InternalEObject oldErrorReaction__eReaction1 = (InternalEObject)errorReaction__eReaction1;
			errorReaction__eReaction1 = (WTCErrorReaction)eResolveProxy(oldErrorReaction__eReaction1);
			if (errorReaction__eReaction1 != oldErrorReaction__eReaction1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT41__ERROR_REACTION_EREACTION1, oldErrorReaction__eReaction1, errorReaction__eReaction1));
			}
		}
		return errorReaction__eReaction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction basicGetErrorReaction__eReaction1() {
		return errorReaction__eReaction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorReaction__eReaction1(WTCErrorReaction newErrorReaction__eReaction1) {
		WTCErrorReaction oldErrorReaction__eReaction1 = errorReaction__eReaction1;
		errorReaction__eReaction1 = newErrorReaction__eReaction1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT41__ERROR_REACTION_EREACTION1, oldErrorReaction__eReaction1, errorReaction__eReaction1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction getErrorReaction__eReaction2() {
		if (errorReaction__eReaction2 != null && errorReaction__eReaction2.eIsProxy()) {
			InternalEObject oldErrorReaction__eReaction2 = (InternalEObject)errorReaction__eReaction2;
			errorReaction__eReaction2 = (WTCErrorReaction)eResolveProxy(oldErrorReaction__eReaction2);
			if (errorReaction__eReaction2 != oldErrorReaction__eReaction2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT41__ERROR_REACTION_EREACTION2, oldErrorReaction__eReaction2, errorReaction__eReaction2));
			}
		}
		return errorReaction__eReaction2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction basicGetErrorReaction__eReaction2() {
		return errorReaction__eReaction2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorReaction__eReaction2(WTCErrorReaction newErrorReaction__eReaction2) {
		WTCErrorReaction oldErrorReaction__eReaction2 = errorReaction__eReaction2;
		errorReaction__eReaction2 = newErrorReaction__eReaction2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT41__ERROR_REACTION_EREACTION2, oldErrorReaction__eReaction2, errorReaction__eReaction2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard__gGuardToMain() {
		return guard__gGuardToMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard__gGuardToMain(String newGuard__gGuardToMain) {
		String oldGuard__gGuardToMain = guard__gGuardToMain;
		guard__gGuardToMain = newGuard__gGuardToMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_MAIN, oldGuard__gGuardToMain, guard__gGuardToMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard__gGuardFromMain() {
		return guard__gGuardFromMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard__gGuardFromMain(String newGuard__gGuardFromMain) {
		String oldGuard__gGuardFromMain = guard__gGuardFromMain;
		guard__gGuardFromMain = newGuard__gGuardFromMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_FROM_MAIN, oldGuard__gGuardFromMain, guard__gGuardFromMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard__gGuardToOn() {
		return guard__gGuardToOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard__gGuardToOn(String newGuard__gGuardToOn) {
		String oldGuard__gGuardToOn = guard__gGuardToOn;
		guard__gGuardToOn = newGuard__gGuardToOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_ON, oldGuard__gGuardToOn, guard__gGuardToOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard__gGuardToOff() {
		return guard__gGuardToOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard__gGuardToOff(String newGuard__gGuardToOff) {
		String oldGuard__gGuardToOff = guard__gGuardToOff;
		guard__gGuardToOff = newGuard__gGuardToOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_OFF, oldGuard__gGuardToOff, guard__gGuardToOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT1:
				if (resolve) return getInput__iInput1();
				return basicGetInput__iInput1();
			case WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT2:
				if (resolve) return getInput__iInput2();
				return basicGetInput__iInput2();
			case WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT3:
				if (resolve) return getInput__iInput3();
				return basicGetInput__iInput3();
			case WTSpecPackage.CTRL_UNIT41__OUTPUT_OOUTPUT:
				if (resolve) return getOutput__oOutput();
				return basicGetOutput__oOutput();
			case WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM1:
				if (resolve) return getParameter__pParam1();
				return basicGetParameter__pParam1();
			case WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM2:
				if (resolve) return getParameter__pParam2();
				return basicGetParameter__pParam2();
			case WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM3:
				if (resolve) return getParameter__pParam3();
				return basicGetParameter__pParam3();
			case WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT1:
				if (resolve) return getFault__fFault1();
				return basicGetFault__fFault1();
			case WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT2:
				if (resolve) return getFault__fFault2();
				return basicGetFault__fFault2();
			case WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT3:
				if (resolve) return getFault__fFault3();
				return basicGetFault__fFault3();
			case WTSpecPackage.CTRL_UNIT41__ERROR_REACTION_EREACTION1:
				if (resolve) return getErrorReaction__eReaction1();
				return basicGetErrorReaction__eReaction1();
			case WTSpecPackage.CTRL_UNIT41__ERROR_REACTION_EREACTION2:
				if (resolve) return getErrorReaction__eReaction2();
				return basicGetErrorReaction__eReaction2();
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_MAIN:
				return getGuard__gGuardToMain();
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_FROM_MAIN:
				return getGuard__gGuardFromMain();
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_ON:
				return getGuard__gGuardToOn();
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_OFF:
				return getGuard__gGuardToOff();
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
			case WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT2:
				setInput__iInput2((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT3:
				setInput__iInput3((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT41__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM1:
				setParameter__pParam1((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM2:
				setParameter__pParam2((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM3:
				setParameter__pParam3((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT1:
				setFault__fFault1((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT2:
				setFault__fFault2((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT3:
				setFault__fFault3((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT41__ERROR_REACTION_EREACTION1:
				setErrorReaction__eReaction1((WTCErrorReaction)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT41__ERROR_REACTION_EREACTION2:
				setErrorReaction__eReaction2((WTCErrorReaction)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_MAIN:
				setGuard__gGuardToMain((String)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_FROM_MAIN:
				setGuard__gGuardFromMain((String)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_ON:
				setGuard__gGuardToOn((String)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_OFF:
				setGuard__gGuardToOff((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT2:
				setInput__iInput2((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT3:
				setInput__iInput3((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT41__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM1:
				setParameter__pParam1((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM2:
				setParameter__pParam2((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM3:
				setParameter__pParam3((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT1:
				setFault__fFault1((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT2:
				setFault__fFault2((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT3:
				setFault__fFault3((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT41__ERROR_REACTION_EREACTION1:
				setErrorReaction__eReaction1((WTCErrorReaction)null);
				return;
			case WTSpecPackage.CTRL_UNIT41__ERROR_REACTION_EREACTION2:
				setErrorReaction__eReaction2((WTCErrorReaction)null);
				return;
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_MAIN:
				setGuard__gGuardToMain(GUARD_GGUARD_TO_MAIN_EDEFAULT);
				return;
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_FROM_MAIN:
				setGuard__gGuardFromMain(GUARD_GGUARD_FROM_MAIN_EDEFAULT);
				return;
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_ON:
				setGuard__gGuardToOn(GUARD_GGUARD_TO_ON_EDEFAULT);
				return;
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_OFF:
				setGuard__gGuardToOff(GUARD_GGUARD_TO_OFF_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT1:
				return input__iInput1 != null;
			case WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT2:
				return input__iInput2 != null;
			case WTSpecPackage.CTRL_UNIT41__INPUT_IINPUT3:
				return input__iInput3 != null;
			case WTSpecPackage.CTRL_UNIT41__OUTPUT_OOUTPUT:
				return output__oOutput != null;
			case WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM1:
				return parameter__pParam1 != null;
			case WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM2:
				return parameter__pParam2 != null;
			case WTSpecPackage.CTRL_UNIT41__PARAMETER_PPARAM3:
				return parameter__pParam3 != null;
			case WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT1:
				return fault__fFault1 != null;
			case WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT2:
				return fault__fFault2 != null;
			case WTSpecPackage.CTRL_UNIT41__FAULT_FFAULT3:
				return fault__fFault3 != null;
			case WTSpecPackage.CTRL_UNIT41__ERROR_REACTION_EREACTION1:
				return errorReaction__eReaction1 != null;
			case WTSpecPackage.CTRL_UNIT41__ERROR_REACTION_EREACTION2:
				return errorReaction__eReaction2 != null;
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_MAIN:
				return GUARD_GGUARD_TO_MAIN_EDEFAULT == null ? guard__gGuardToMain != null : !GUARD_GGUARD_TO_MAIN_EDEFAULT.equals(guard__gGuardToMain);
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_FROM_MAIN:
				return GUARD_GGUARD_FROM_MAIN_EDEFAULT == null ? guard__gGuardFromMain != null : !GUARD_GGUARD_FROM_MAIN_EDEFAULT.equals(guard__gGuardFromMain);
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_ON:
				return GUARD_GGUARD_TO_ON_EDEFAULT == null ? guard__gGuardToOn != null : !GUARD_GGUARD_TO_ON_EDEFAULT.equals(guard__gGuardToOn);
			case WTSpecPackage.CTRL_UNIT41__GUARD_GGUARD_TO_OFF:
				return GUARD_GGUARD_TO_OFF_EDEFAULT == null ? guard__gGuardToOff != null : !GUARD_GGUARD_TO_OFF_EDEFAULT.equals(guard__gGuardToOff);
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
		result.append(" (Guard__gGuardToMain: ");
		result.append(guard__gGuardToMain);
		result.append(", Guard__gGuardFromMain: ");
		result.append(guard__gGuardFromMain);
		result.append(", Guard__gGuardToOn: ");
		result.append(guard__gGuardToOn);
		result.append(", Guard__gGuardToOff: ");
		result.append(guard__gGuardToOff);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit41Impl
