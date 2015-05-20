/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit49;
import WTSpec.WTCErrorReaction;
import WTSpec.WTCFault;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTCParam;
import WTSpec.WTCTimer;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit49</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getInput__iInput1 <em>Input iInput1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getInput__iInput2 <em>Input iInput2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getInput__iInput3 <em>Input iInput3</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getInput__iInput4 <em>Input iInput4</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getOutput__oOutputFan1 <em>Output oOutput Fan1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getOutput__oOutputFan2 <em>Output oOutput Fan2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getParameter__pParam1 <em>Parameter pParam1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getParameter__pParam2 <em>Parameter pParam2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getParameter__pParam3 <em>Parameter pParam3</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getParameter__pParam4 <em>Parameter pParam4</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getFault__fFault1 <em>Fault fFault1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getTimer__tTimer1 <em>Timer tTimer1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getErrorReaction__eReaction1 <em>Error Reaction eReaction1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getErrorReaction__eReaction2 <em>Error Reaction eReaction2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getGuard__gGuardErrors <em>Guard gGuard Errors</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getGuard__gGuardNoErrors <em>Guard gGuard No Errors</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getGuard__gGuardOffToHi <em>Guard gGuard Off To Hi</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getGuard__gGuardHiToOff <em>Guard gGuard Hi To Off</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getGuard__gGuardOffToLow <em>Guard gGuard Off To Low</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getGuard__gGuardLowToOff <em>Guard gGuard Low To Off</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getGuard__gGuardLowToHi <em>Guard gGuard Low To Hi</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit49Impl#getGuard__gGuardHiToLow <em>Guard gGuard Hi To Low</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit49Impl extends wtcImpl implements CtrlUnit49 {
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
	 * The cached value of the '{@link #getInput__iInput4() <em>Input iInput4</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInput4()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInput4;

	/**
	 * The cached value of the '{@link #getOutput__oOutputFan1() <em>Output oOutput Fan1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOutputFan1()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOutputFan1;

	/**
	 * The cached value of the '{@link #getOutput__oOutputFan2() <em>Output oOutput Fan2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOutputFan2()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOutputFan2;

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
	 * The cached value of the '{@link #getParameter__pParam4() <em>Parameter pParam4</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pParam4()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pParam4;

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
	 * The cached value of the '{@link #getTimer__tTimer1() <em>Timer tTimer1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tTimer1()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tTimer1;

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
	 * The default value of the '{@link #getGuard__gGuardErrors() <em>Guard gGuard Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardErrors()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_GGUARD_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard__gGuardErrors() <em>Guard gGuard Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardErrors()
	 * @generated
	 * @ordered
	 */
	protected String guard__gGuardErrors = GUARD_GGUARD_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuard__gGuardNoErrors() <em>Guard gGuard No Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardNoErrors()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_GGUARD_NO_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard__gGuardNoErrors() <em>Guard gGuard No Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardNoErrors()
	 * @generated
	 * @ordered
	 */
	protected String guard__gGuardNoErrors = GUARD_GGUARD_NO_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuard__gGuardOffToHi() <em>Guard gGuard Off To Hi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardOffToHi()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_GGUARD_OFF_TO_HI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard__gGuardOffToHi() <em>Guard gGuard Off To Hi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardOffToHi()
	 * @generated
	 * @ordered
	 */
	protected String guard__gGuardOffToHi = GUARD_GGUARD_OFF_TO_HI_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuard__gGuardHiToOff() <em>Guard gGuard Hi To Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardHiToOff()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_GGUARD_HI_TO_OFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard__gGuardHiToOff() <em>Guard gGuard Hi To Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardHiToOff()
	 * @generated
	 * @ordered
	 */
	protected String guard__gGuardHiToOff = GUARD_GGUARD_HI_TO_OFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuard__gGuardOffToLow() <em>Guard gGuard Off To Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardOffToLow()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_GGUARD_OFF_TO_LOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard__gGuardOffToLow() <em>Guard gGuard Off To Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardOffToLow()
	 * @generated
	 * @ordered
	 */
	protected String guard__gGuardOffToLow = GUARD_GGUARD_OFF_TO_LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuard__gGuardLowToOff() <em>Guard gGuard Low To Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardLowToOff()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_GGUARD_LOW_TO_OFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard__gGuardLowToOff() <em>Guard gGuard Low To Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardLowToOff()
	 * @generated
	 * @ordered
	 */
	protected String guard__gGuardLowToOff = GUARD_GGUARD_LOW_TO_OFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuard__gGuardLowToHi() <em>Guard gGuard Low To Hi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardLowToHi()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_GGUARD_LOW_TO_HI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard__gGuardLowToHi() <em>Guard gGuard Low To Hi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardLowToHi()
	 * @generated
	 * @ordered
	 */
	protected String guard__gGuardLowToHi = GUARD_GGUARD_LOW_TO_HI_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuard__gGuardHiToLow() <em>Guard gGuard Hi To Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardHiToLow()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_GGUARD_HI_TO_LOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard__gGuardHiToLow() <em>Guard gGuard Hi To Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard__gGuardHiToLow()
	 * @generated
	 * @ordered
	 */
	protected String guard__gGuardHiToLow = GUARD_GGUARD_HI_TO_LOW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit49Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT49;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT3, oldInput__iInput3, input__iInput3));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT3, oldInput__iInput3, input__iInput3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInput4() {
		if (input__iInput4 != null && input__iInput4.eIsProxy()) {
			InternalEObject oldInput__iInput4 = (InternalEObject)input__iInput4;
			input__iInput4 = (WTCInput)eResolveProxy(oldInput__iInput4);
			if (input__iInput4 != oldInput__iInput4) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT4, oldInput__iInput4, input__iInput4));
			}
		}
		return input__iInput4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInput4() {
		return input__iInput4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInput4(WTCInput newInput__iInput4) {
		WTCInput oldInput__iInput4 = input__iInput4;
		input__iInput4 = newInput__iInput4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT4, oldInput__iInput4, input__iInput4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOutputFan1() {
		if (output__oOutputFan1 != null && output__oOutputFan1.eIsProxy()) {
			InternalEObject oldOutput__oOutputFan1 = (InternalEObject)output__oOutputFan1;
			output__oOutputFan1 = (WTCOutput)eResolveProxy(oldOutput__oOutputFan1);
			if (output__oOutputFan1 != oldOutput__oOutputFan1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT49__OUTPUT_OOUTPUT_FAN1, oldOutput__oOutputFan1, output__oOutputFan1));
			}
		}
		return output__oOutputFan1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOutputFan1() {
		return output__oOutputFan1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOutputFan1(WTCOutput newOutput__oOutputFan1) {
		WTCOutput oldOutput__oOutputFan1 = output__oOutputFan1;
		output__oOutputFan1 = newOutput__oOutputFan1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__OUTPUT_OOUTPUT_FAN1, oldOutput__oOutputFan1, output__oOutputFan1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOutputFan2() {
		if (output__oOutputFan2 != null && output__oOutputFan2.eIsProxy()) {
			InternalEObject oldOutput__oOutputFan2 = (InternalEObject)output__oOutputFan2;
			output__oOutputFan2 = (WTCOutput)eResolveProxy(oldOutput__oOutputFan2);
			if (output__oOutputFan2 != oldOutput__oOutputFan2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT49__OUTPUT_OOUTPUT_FAN2, oldOutput__oOutputFan2, output__oOutputFan2));
			}
		}
		return output__oOutputFan2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOutputFan2() {
		return output__oOutputFan2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOutputFan2(WTCOutput newOutput__oOutputFan2) {
		WTCOutput oldOutput__oOutputFan2 = output__oOutputFan2;
		output__oOutputFan2 = newOutput__oOutputFan2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__OUTPUT_OOUTPUT_FAN2, oldOutput__oOutputFan2, output__oOutputFan2));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM1, oldParameter__pParam1, parameter__pParam1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM1, oldParameter__pParam1, parameter__pParam1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM2, oldParameter__pParam2, parameter__pParam2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM2, oldParameter__pParam2, parameter__pParam2));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM3, oldParameter__pParam3, parameter__pParam3));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM3, oldParameter__pParam3, parameter__pParam3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pParam4() {
		if (parameter__pParam4 != null && parameter__pParam4.eIsProxy()) {
			InternalEObject oldParameter__pParam4 = (InternalEObject)parameter__pParam4;
			parameter__pParam4 = (WTCParam)eResolveProxy(oldParameter__pParam4);
			if (parameter__pParam4 != oldParameter__pParam4) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM4, oldParameter__pParam4, parameter__pParam4));
			}
		}
		return parameter__pParam4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pParam4() {
		return parameter__pParam4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pParam4(WTCParam newParameter__pParam4) {
		WTCParam oldParameter__pParam4 = parameter__pParam4;
		parameter__pParam4 = newParameter__pParam4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM4, oldParameter__pParam4, parameter__pParam4));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT49__FAULT_FFAULT1, oldFault__fFault1, fault__fFault1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__FAULT_FFAULT1, oldFault__fFault1, fault__fFault1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tTimer1() {
		if (timer__tTimer1 != null && timer__tTimer1.eIsProxy()) {
			InternalEObject oldTimer__tTimer1 = (InternalEObject)timer__tTimer1;
			timer__tTimer1 = (WTCTimer)eResolveProxy(oldTimer__tTimer1);
			if (timer__tTimer1 != oldTimer__tTimer1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT49__TIMER_TTIMER1, oldTimer__tTimer1, timer__tTimer1));
			}
		}
		return timer__tTimer1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tTimer1() {
		return timer__tTimer1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tTimer1(WTCTimer newTimer__tTimer1) {
		WTCTimer oldTimer__tTimer1 = timer__tTimer1;
		timer__tTimer1 = newTimer__tTimer1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__TIMER_TTIMER1, oldTimer__tTimer1, timer__tTimer1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT49__ERROR_REACTION_EREACTION1, oldErrorReaction__eReaction1, errorReaction__eReaction1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__ERROR_REACTION_EREACTION1, oldErrorReaction__eReaction1, errorReaction__eReaction1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT49__ERROR_REACTION_EREACTION2, oldErrorReaction__eReaction2, errorReaction__eReaction2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__ERROR_REACTION_EREACTION2, oldErrorReaction__eReaction2, errorReaction__eReaction2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard__gGuardErrors() {
		return guard__gGuardErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard__gGuardErrors(String newGuard__gGuardErrors) {
		String oldGuard__gGuardErrors = guard__gGuardErrors;
		guard__gGuardErrors = newGuard__gGuardErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_ERRORS, oldGuard__gGuardErrors, guard__gGuardErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard__gGuardNoErrors() {
		return guard__gGuardNoErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard__gGuardNoErrors(String newGuard__gGuardNoErrors) {
		String oldGuard__gGuardNoErrors = guard__gGuardNoErrors;
		guard__gGuardNoErrors = newGuard__gGuardNoErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_NO_ERRORS, oldGuard__gGuardNoErrors, guard__gGuardNoErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard__gGuardOffToHi() {
		return guard__gGuardOffToHi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard__gGuardOffToHi(String newGuard__gGuardOffToHi) {
		String oldGuard__gGuardOffToHi = guard__gGuardOffToHi;
		guard__gGuardOffToHi = newGuard__gGuardOffToHi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_OFF_TO_HI, oldGuard__gGuardOffToHi, guard__gGuardOffToHi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard__gGuardHiToOff() {
		return guard__gGuardHiToOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard__gGuardHiToOff(String newGuard__gGuardHiToOff) {
		String oldGuard__gGuardHiToOff = guard__gGuardHiToOff;
		guard__gGuardHiToOff = newGuard__gGuardHiToOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_HI_TO_OFF, oldGuard__gGuardHiToOff, guard__gGuardHiToOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard__gGuardOffToLow() {
		return guard__gGuardOffToLow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard__gGuardOffToLow(String newGuard__gGuardOffToLow) {
		String oldGuard__gGuardOffToLow = guard__gGuardOffToLow;
		guard__gGuardOffToLow = newGuard__gGuardOffToLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_OFF_TO_LOW, oldGuard__gGuardOffToLow, guard__gGuardOffToLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard__gGuardLowToOff() {
		return guard__gGuardLowToOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard__gGuardLowToOff(String newGuard__gGuardLowToOff) {
		String oldGuard__gGuardLowToOff = guard__gGuardLowToOff;
		guard__gGuardLowToOff = newGuard__gGuardLowToOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_LOW_TO_OFF, oldGuard__gGuardLowToOff, guard__gGuardLowToOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard__gGuardLowToHi() {
		return guard__gGuardLowToHi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard__gGuardLowToHi(String newGuard__gGuardLowToHi) {
		String oldGuard__gGuardLowToHi = guard__gGuardLowToHi;
		guard__gGuardLowToHi = newGuard__gGuardLowToHi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_LOW_TO_HI, oldGuard__gGuardLowToHi, guard__gGuardLowToHi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard__gGuardHiToLow() {
		return guard__gGuardHiToLow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard__gGuardHiToLow(String newGuard__gGuardHiToLow) {
		String oldGuard__gGuardHiToLow = guard__gGuardHiToLow;
		guard__gGuardHiToLow = newGuard__gGuardHiToLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_HI_TO_LOW, oldGuard__gGuardHiToLow, guard__gGuardHiToLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT1:
				if (resolve) return getInput__iInput1();
				return basicGetInput__iInput1();
			case WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT2:
				if (resolve) return getInput__iInput2();
				return basicGetInput__iInput2();
			case WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT3:
				if (resolve) return getInput__iInput3();
				return basicGetInput__iInput3();
			case WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT4:
				if (resolve) return getInput__iInput4();
				return basicGetInput__iInput4();
			case WTSpecPackage.CTRL_UNIT49__OUTPUT_OOUTPUT_FAN1:
				if (resolve) return getOutput__oOutputFan1();
				return basicGetOutput__oOutputFan1();
			case WTSpecPackage.CTRL_UNIT49__OUTPUT_OOUTPUT_FAN2:
				if (resolve) return getOutput__oOutputFan2();
				return basicGetOutput__oOutputFan2();
			case WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM1:
				if (resolve) return getParameter__pParam1();
				return basicGetParameter__pParam1();
			case WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM2:
				if (resolve) return getParameter__pParam2();
				return basicGetParameter__pParam2();
			case WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM3:
				if (resolve) return getParameter__pParam3();
				return basicGetParameter__pParam3();
			case WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM4:
				if (resolve) return getParameter__pParam4();
				return basicGetParameter__pParam4();
			case WTSpecPackage.CTRL_UNIT49__FAULT_FFAULT1:
				if (resolve) return getFault__fFault1();
				return basicGetFault__fFault1();
			case WTSpecPackage.CTRL_UNIT49__TIMER_TTIMER1:
				if (resolve) return getTimer__tTimer1();
				return basicGetTimer__tTimer1();
			case WTSpecPackage.CTRL_UNIT49__ERROR_REACTION_EREACTION1:
				if (resolve) return getErrorReaction__eReaction1();
				return basicGetErrorReaction__eReaction1();
			case WTSpecPackage.CTRL_UNIT49__ERROR_REACTION_EREACTION2:
				if (resolve) return getErrorReaction__eReaction2();
				return basicGetErrorReaction__eReaction2();
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_ERRORS:
				return getGuard__gGuardErrors();
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_NO_ERRORS:
				return getGuard__gGuardNoErrors();
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_OFF_TO_HI:
				return getGuard__gGuardOffToHi();
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_HI_TO_OFF:
				return getGuard__gGuardHiToOff();
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_OFF_TO_LOW:
				return getGuard__gGuardOffToLow();
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_LOW_TO_OFF:
				return getGuard__gGuardLowToOff();
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_LOW_TO_HI:
				return getGuard__gGuardLowToHi();
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_HI_TO_LOW:
				return getGuard__gGuardHiToLow();
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
			case WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT2:
				setInput__iInput2((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT3:
				setInput__iInput3((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT4:
				setInput__iInput4((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__OUTPUT_OOUTPUT_FAN1:
				setOutput__oOutputFan1((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__OUTPUT_OOUTPUT_FAN2:
				setOutput__oOutputFan2((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM1:
				setParameter__pParam1((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM2:
				setParameter__pParam2((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM3:
				setParameter__pParam3((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM4:
				setParameter__pParam4((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__FAULT_FFAULT1:
				setFault__fFault1((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__TIMER_TTIMER1:
				setTimer__tTimer1((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__ERROR_REACTION_EREACTION1:
				setErrorReaction__eReaction1((WTCErrorReaction)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__ERROR_REACTION_EREACTION2:
				setErrorReaction__eReaction2((WTCErrorReaction)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_ERRORS:
				setGuard__gGuardErrors((String)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_NO_ERRORS:
				setGuard__gGuardNoErrors((String)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_OFF_TO_HI:
				setGuard__gGuardOffToHi((String)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_HI_TO_OFF:
				setGuard__gGuardHiToOff((String)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_OFF_TO_LOW:
				setGuard__gGuardOffToLow((String)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_LOW_TO_OFF:
				setGuard__gGuardLowToOff((String)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_LOW_TO_HI:
				setGuard__gGuardLowToHi((String)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_HI_TO_LOW:
				setGuard__gGuardHiToLow((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT2:
				setInput__iInput2((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT3:
				setInput__iInput3((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT4:
				setInput__iInput4((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT49__OUTPUT_OOUTPUT_FAN1:
				setOutput__oOutputFan1((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT49__OUTPUT_OOUTPUT_FAN2:
				setOutput__oOutputFan2((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM1:
				setParameter__pParam1((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM2:
				setParameter__pParam2((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM3:
				setParameter__pParam3((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM4:
				setParameter__pParam4((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT49__FAULT_FFAULT1:
				setFault__fFault1((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT49__TIMER_TTIMER1:
				setTimer__tTimer1((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT49__ERROR_REACTION_EREACTION1:
				setErrorReaction__eReaction1((WTCErrorReaction)null);
				return;
			case WTSpecPackage.CTRL_UNIT49__ERROR_REACTION_EREACTION2:
				setErrorReaction__eReaction2((WTCErrorReaction)null);
				return;
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_ERRORS:
				setGuard__gGuardErrors(GUARD_GGUARD_ERRORS_EDEFAULT);
				return;
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_NO_ERRORS:
				setGuard__gGuardNoErrors(GUARD_GGUARD_NO_ERRORS_EDEFAULT);
				return;
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_OFF_TO_HI:
				setGuard__gGuardOffToHi(GUARD_GGUARD_OFF_TO_HI_EDEFAULT);
				return;
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_HI_TO_OFF:
				setGuard__gGuardHiToOff(GUARD_GGUARD_HI_TO_OFF_EDEFAULT);
				return;
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_OFF_TO_LOW:
				setGuard__gGuardOffToLow(GUARD_GGUARD_OFF_TO_LOW_EDEFAULT);
				return;
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_LOW_TO_OFF:
				setGuard__gGuardLowToOff(GUARD_GGUARD_LOW_TO_OFF_EDEFAULT);
				return;
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_LOW_TO_HI:
				setGuard__gGuardLowToHi(GUARD_GGUARD_LOW_TO_HI_EDEFAULT);
				return;
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_HI_TO_LOW:
				setGuard__gGuardHiToLow(GUARD_GGUARD_HI_TO_LOW_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT1:
				return input__iInput1 != null;
			case WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT2:
				return input__iInput2 != null;
			case WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT3:
				return input__iInput3 != null;
			case WTSpecPackage.CTRL_UNIT49__INPUT_IINPUT4:
				return input__iInput4 != null;
			case WTSpecPackage.CTRL_UNIT49__OUTPUT_OOUTPUT_FAN1:
				return output__oOutputFan1 != null;
			case WTSpecPackage.CTRL_UNIT49__OUTPUT_OOUTPUT_FAN2:
				return output__oOutputFan2 != null;
			case WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM1:
				return parameter__pParam1 != null;
			case WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM2:
				return parameter__pParam2 != null;
			case WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM3:
				return parameter__pParam3 != null;
			case WTSpecPackage.CTRL_UNIT49__PARAMETER_PPARAM4:
				return parameter__pParam4 != null;
			case WTSpecPackage.CTRL_UNIT49__FAULT_FFAULT1:
				return fault__fFault1 != null;
			case WTSpecPackage.CTRL_UNIT49__TIMER_TTIMER1:
				return timer__tTimer1 != null;
			case WTSpecPackage.CTRL_UNIT49__ERROR_REACTION_EREACTION1:
				return errorReaction__eReaction1 != null;
			case WTSpecPackage.CTRL_UNIT49__ERROR_REACTION_EREACTION2:
				return errorReaction__eReaction2 != null;
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_ERRORS:
				return GUARD_GGUARD_ERRORS_EDEFAULT == null ? guard__gGuardErrors != null : !GUARD_GGUARD_ERRORS_EDEFAULT.equals(guard__gGuardErrors);
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_NO_ERRORS:
				return GUARD_GGUARD_NO_ERRORS_EDEFAULT == null ? guard__gGuardNoErrors != null : !GUARD_GGUARD_NO_ERRORS_EDEFAULT.equals(guard__gGuardNoErrors);
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_OFF_TO_HI:
				return GUARD_GGUARD_OFF_TO_HI_EDEFAULT == null ? guard__gGuardOffToHi != null : !GUARD_GGUARD_OFF_TO_HI_EDEFAULT.equals(guard__gGuardOffToHi);
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_HI_TO_OFF:
				return GUARD_GGUARD_HI_TO_OFF_EDEFAULT == null ? guard__gGuardHiToOff != null : !GUARD_GGUARD_HI_TO_OFF_EDEFAULT.equals(guard__gGuardHiToOff);
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_OFF_TO_LOW:
				return GUARD_GGUARD_OFF_TO_LOW_EDEFAULT == null ? guard__gGuardOffToLow != null : !GUARD_GGUARD_OFF_TO_LOW_EDEFAULT.equals(guard__gGuardOffToLow);
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_LOW_TO_OFF:
				return GUARD_GGUARD_LOW_TO_OFF_EDEFAULT == null ? guard__gGuardLowToOff != null : !GUARD_GGUARD_LOW_TO_OFF_EDEFAULT.equals(guard__gGuardLowToOff);
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_LOW_TO_HI:
				return GUARD_GGUARD_LOW_TO_HI_EDEFAULT == null ? guard__gGuardLowToHi != null : !GUARD_GGUARD_LOW_TO_HI_EDEFAULT.equals(guard__gGuardLowToHi);
			case WTSpecPackage.CTRL_UNIT49__GUARD_GGUARD_HI_TO_LOW:
				return GUARD_GGUARD_HI_TO_LOW_EDEFAULT == null ? guard__gGuardHiToLow != null : !GUARD_GGUARD_HI_TO_LOW_EDEFAULT.equals(guard__gGuardHiToLow);
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
		result.append(" (Guard__gGuardErrors: ");
		result.append(guard__gGuardErrors);
		result.append(", Guard__gGuardNoErrors: ");
		result.append(guard__gGuardNoErrors);
		result.append(", Guard__gGuardOffToHi: ");
		result.append(guard__gGuardOffToHi);
		result.append(", Guard__gGuardHiToOff: ");
		result.append(guard__gGuardHiToOff);
		result.append(", Guard__gGuardOffToLow: ");
		result.append(guard__gGuardOffToLow);
		result.append(", Guard__gGuardLowToOff: ");
		result.append(guard__gGuardLowToOff);
		result.append(", Guard__gGuardLowToHi: ");
		result.append(guard__gGuardLowToHi);
		result.append(", Guard__gGuardHiToLow: ");
		result.append(guard__gGuardHiToLow);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit49Impl
