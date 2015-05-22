/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit18;
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
 * An implementation of the model object '<em><b>Ctrl Unit18</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit18Impl#getInput__iOrderCw <em>Input iOrder Cw</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit18Impl#getInput__iOrderCcw <em>Input iOrder Ccw</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit18Impl#getInput__iFault <em>Input iFault</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit18Impl#getInput__iCmdDisable <em>Input iCmd Disable</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit18Impl#getInput__iCmdReset <em>Input iCmd Reset</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit18Impl#getInput__iStaReadyToOn <em>Input iSta Ready To On</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit18Impl#getOutput__oControlWord <em>Output oControl Word</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit18Impl#getParameter__pCmdDisabled <em>Parameter pCmd Disabled</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit18Impl#getParameter__pCmdEnabled <em>Parameter pCmd Enabled</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit18Impl#getParameter__pCmdCw <em>Parameter pCmd Cw</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit18Impl#getParameter__pCmdCcw <em>Parameter pCmd Ccw</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit18Impl#getParameter__pCmdReset <em>Parameter pCmd Reset</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit18Impl#getParameter__pCmdSwitchOn <em>Parameter pCmd Switch On</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit18Impl#getParameter__pCmdBraking <em>Parameter pCmd Braking</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit18Impl#getTimer__tDelay <em>Timer tDelay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit18Impl extends wtcImpl implements CtrlUnit18 {
	/**
	 * The cached value of the '{@link #getInput__iOrderCw() <em>Input iOrder Cw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iOrderCw()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iOrderCw;

	/**
	 * The cached value of the '{@link #getInput__iOrderCcw() <em>Input iOrder Ccw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iOrderCcw()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iOrderCcw;

	/**
	 * The cached value of the '{@link #getInput__iFault() <em>Input iFault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iFault()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iFault;

	/**
	 * The cached value of the '{@link #getInput__iCmdDisable() <em>Input iCmd Disable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iCmdDisable()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iCmdDisable;

	/**
	 * The cached value of the '{@link #getInput__iCmdReset() <em>Input iCmd Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iCmdReset()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iCmdReset;

	/**
	 * The cached value of the '{@link #getInput__iStaReadyToOn() <em>Input iSta Ready To On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iStaReadyToOn()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iStaReadyToOn;

	/**
	 * The cached value of the '{@link #getOutput__oControlWord() <em>Output oControl Word</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oControlWord()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oControlWord;

	/**
	 * The cached value of the '{@link #getParameter__pCmdDisabled() <em>Parameter pCmd Disabled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pCmdDisabled()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pCmdDisabled;

	/**
	 * The cached value of the '{@link #getParameter__pCmdEnabled() <em>Parameter pCmd Enabled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pCmdEnabled()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pCmdEnabled;

	/**
	 * The cached value of the '{@link #getParameter__pCmdCw() <em>Parameter pCmd Cw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pCmdCw()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pCmdCw;

	/**
	 * The cached value of the '{@link #getParameter__pCmdCcw() <em>Parameter pCmd Ccw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pCmdCcw()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pCmdCcw;

	/**
	 * The cached value of the '{@link #getParameter__pCmdReset() <em>Parameter pCmd Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pCmdReset()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pCmdReset;

	/**
	 * The cached value of the '{@link #getParameter__pCmdSwitchOn() <em>Parameter pCmd Switch On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pCmdSwitchOn()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pCmdSwitchOn;

	/**
	 * The cached value of the '{@link #getParameter__pCmdBraking() <em>Parameter pCmd Braking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pCmdBraking()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pCmdBraking;

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
	protected CtrlUnit18Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iOrderCw() {
		if (input__iOrderCw != null && input__iOrderCw.eIsProxy()) {
			InternalEObject oldInput__iOrderCw = (InternalEObject)input__iOrderCw;
			input__iOrderCw = (WTCInput)eResolveProxy(oldInput__iOrderCw);
			if (input__iOrderCw != oldInput__iOrderCw) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT18__INPUT_IORDER_CW, oldInput__iOrderCw, input__iOrderCw));
			}
		}
		return input__iOrderCw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iOrderCw() {
		return input__iOrderCw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iOrderCw(WTCInput newInput__iOrderCw) {
		WTCInput oldInput__iOrderCw = input__iOrderCw;
		input__iOrderCw = newInput__iOrderCw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT18__INPUT_IORDER_CW, oldInput__iOrderCw, input__iOrderCw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iOrderCcw() {
		if (input__iOrderCcw != null && input__iOrderCcw.eIsProxy()) {
			InternalEObject oldInput__iOrderCcw = (InternalEObject)input__iOrderCcw;
			input__iOrderCcw = (WTCInput)eResolveProxy(oldInput__iOrderCcw);
			if (input__iOrderCcw != oldInput__iOrderCcw) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT18__INPUT_IORDER_CCW, oldInput__iOrderCcw, input__iOrderCcw));
			}
		}
		return input__iOrderCcw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iOrderCcw() {
		return input__iOrderCcw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iOrderCcw(WTCInput newInput__iOrderCcw) {
		WTCInput oldInput__iOrderCcw = input__iOrderCcw;
		input__iOrderCcw = newInput__iOrderCcw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT18__INPUT_IORDER_CCW, oldInput__iOrderCcw, input__iOrderCcw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iFault() {
		if (input__iFault != null && input__iFault.eIsProxy()) {
			InternalEObject oldInput__iFault = (InternalEObject)input__iFault;
			input__iFault = (WTCInput)eResolveProxy(oldInput__iFault);
			if (input__iFault != oldInput__iFault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT18__INPUT_IFAULT, oldInput__iFault, input__iFault));
			}
		}
		return input__iFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iFault() {
		return input__iFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iFault(WTCInput newInput__iFault) {
		WTCInput oldInput__iFault = input__iFault;
		input__iFault = newInput__iFault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT18__INPUT_IFAULT, oldInput__iFault, input__iFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iCmdDisable() {
		if (input__iCmdDisable != null && input__iCmdDisable.eIsProxy()) {
			InternalEObject oldInput__iCmdDisable = (InternalEObject)input__iCmdDisable;
			input__iCmdDisable = (WTCInput)eResolveProxy(oldInput__iCmdDisable);
			if (input__iCmdDisable != oldInput__iCmdDisable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT18__INPUT_ICMD_DISABLE, oldInput__iCmdDisable, input__iCmdDisable));
			}
		}
		return input__iCmdDisable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iCmdDisable() {
		return input__iCmdDisable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iCmdDisable(WTCInput newInput__iCmdDisable) {
		WTCInput oldInput__iCmdDisable = input__iCmdDisable;
		input__iCmdDisable = newInput__iCmdDisable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT18__INPUT_ICMD_DISABLE, oldInput__iCmdDisable, input__iCmdDisable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iCmdReset() {
		if (input__iCmdReset != null && input__iCmdReset.eIsProxy()) {
			InternalEObject oldInput__iCmdReset = (InternalEObject)input__iCmdReset;
			input__iCmdReset = (WTCInput)eResolveProxy(oldInput__iCmdReset);
			if (input__iCmdReset != oldInput__iCmdReset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT18__INPUT_ICMD_RESET, oldInput__iCmdReset, input__iCmdReset));
			}
		}
		return input__iCmdReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iCmdReset() {
		return input__iCmdReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iCmdReset(WTCInput newInput__iCmdReset) {
		WTCInput oldInput__iCmdReset = input__iCmdReset;
		input__iCmdReset = newInput__iCmdReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT18__INPUT_ICMD_RESET, oldInput__iCmdReset, input__iCmdReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iStaReadyToOn() {
		if (input__iStaReadyToOn != null && input__iStaReadyToOn.eIsProxy()) {
			InternalEObject oldInput__iStaReadyToOn = (InternalEObject)input__iStaReadyToOn;
			input__iStaReadyToOn = (WTCInput)eResolveProxy(oldInput__iStaReadyToOn);
			if (input__iStaReadyToOn != oldInput__iStaReadyToOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT18__INPUT_ISTA_READY_TO_ON, oldInput__iStaReadyToOn, input__iStaReadyToOn));
			}
		}
		return input__iStaReadyToOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iStaReadyToOn() {
		return input__iStaReadyToOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iStaReadyToOn(WTCInput newInput__iStaReadyToOn) {
		WTCInput oldInput__iStaReadyToOn = input__iStaReadyToOn;
		input__iStaReadyToOn = newInput__iStaReadyToOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT18__INPUT_ISTA_READY_TO_ON, oldInput__iStaReadyToOn, input__iStaReadyToOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oControlWord() {
		if (output__oControlWord != null && output__oControlWord.eIsProxy()) {
			InternalEObject oldOutput__oControlWord = (InternalEObject)output__oControlWord;
			output__oControlWord = (WTCOutput)eResolveProxy(oldOutput__oControlWord);
			if (output__oControlWord != oldOutput__oControlWord) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT18__OUTPUT_OCONTROL_WORD, oldOutput__oControlWord, output__oControlWord));
			}
		}
		return output__oControlWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oControlWord() {
		return output__oControlWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oControlWord(WTCOutput newOutput__oControlWord) {
		WTCOutput oldOutput__oControlWord = output__oControlWord;
		output__oControlWord = newOutput__oControlWord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT18__OUTPUT_OCONTROL_WORD, oldOutput__oControlWord, output__oControlWord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pCmdDisabled() {
		if (parameter__pCmdDisabled != null && parameter__pCmdDisabled.eIsProxy()) {
			InternalEObject oldParameter__pCmdDisabled = (InternalEObject)parameter__pCmdDisabled;
			parameter__pCmdDisabled = (WTCParam)eResolveProxy(oldParameter__pCmdDisabled);
			if (parameter__pCmdDisabled != oldParameter__pCmdDisabled) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_DISABLED, oldParameter__pCmdDisabled, parameter__pCmdDisabled));
			}
		}
		return parameter__pCmdDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pCmdDisabled() {
		return parameter__pCmdDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pCmdDisabled(WTCParam newParameter__pCmdDisabled) {
		WTCParam oldParameter__pCmdDisabled = parameter__pCmdDisabled;
		parameter__pCmdDisabled = newParameter__pCmdDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_DISABLED, oldParameter__pCmdDisabled, parameter__pCmdDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pCmdEnabled() {
		if (parameter__pCmdEnabled != null && parameter__pCmdEnabled.eIsProxy()) {
			InternalEObject oldParameter__pCmdEnabled = (InternalEObject)parameter__pCmdEnabled;
			parameter__pCmdEnabled = (WTCParam)eResolveProxy(oldParameter__pCmdEnabled);
			if (parameter__pCmdEnabled != oldParameter__pCmdEnabled) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_ENABLED, oldParameter__pCmdEnabled, parameter__pCmdEnabled));
			}
		}
		return parameter__pCmdEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pCmdEnabled() {
		return parameter__pCmdEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pCmdEnabled(WTCParam newParameter__pCmdEnabled) {
		WTCParam oldParameter__pCmdEnabled = parameter__pCmdEnabled;
		parameter__pCmdEnabled = newParameter__pCmdEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_ENABLED, oldParameter__pCmdEnabled, parameter__pCmdEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pCmdCw() {
		if (parameter__pCmdCw != null && parameter__pCmdCw.eIsProxy()) {
			InternalEObject oldParameter__pCmdCw = (InternalEObject)parameter__pCmdCw;
			parameter__pCmdCw = (WTCParam)eResolveProxy(oldParameter__pCmdCw);
			if (parameter__pCmdCw != oldParameter__pCmdCw) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_CW, oldParameter__pCmdCw, parameter__pCmdCw));
			}
		}
		return parameter__pCmdCw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pCmdCw() {
		return parameter__pCmdCw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pCmdCw(WTCParam newParameter__pCmdCw) {
		WTCParam oldParameter__pCmdCw = parameter__pCmdCw;
		parameter__pCmdCw = newParameter__pCmdCw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_CW, oldParameter__pCmdCw, parameter__pCmdCw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pCmdCcw() {
		if (parameter__pCmdCcw != null && parameter__pCmdCcw.eIsProxy()) {
			InternalEObject oldParameter__pCmdCcw = (InternalEObject)parameter__pCmdCcw;
			parameter__pCmdCcw = (WTCParam)eResolveProxy(oldParameter__pCmdCcw);
			if (parameter__pCmdCcw != oldParameter__pCmdCcw) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_CCW, oldParameter__pCmdCcw, parameter__pCmdCcw));
			}
		}
		return parameter__pCmdCcw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pCmdCcw() {
		return parameter__pCmdCcw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pCmdCcw(WTCParam newParameter__pCmdCcw) {
		WTCParam oldParameter__pCmdCcw = parameter__pCmdCcw;
		parameter__pCmdCcw = newParameter__pCmdCcw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_CCW, oldParameter__pCmdCcw, parameter__pCmdCcw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pCmdReset() {
		if (parameter__pCmdReset != null && parameter__pCmdReset.eIsProxy()) {
			InternalEObject oldParameter__pCmdReset = (InternalEObject)parameter__pCmdReset;
			parameter__pCmdReset = (WTCParam)eResolveProxy(oldParameter__pCmdReset);
			if (parameter__pCmdReset != oldParameter__pCmdReset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_RESET, oldParameter__pCmdReset, parameter__pCmdReset));
			}
		}
		return parameter__pCmdReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pCmdReset() {
		return parameter__pCmdReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pCmdReset(WTCParam newParameter__pCmdReset) {
		WTCParam oldParameter__pCmdReset = parameter__pCmdReset;
		parameter__pCmdReset = newParameter__pCmdReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_RESET, oldParameter__pCmdReset, parameter__pCmdReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pCmdSwitchOn() {
		if (parameter__pCmdSwitchOn != null && parameter__pCmdSwitchOn.eIsProxy()) {
			InternalEObject oldParameter__pCmdSwitchOn = (InternalEObject)parameter__pCmdSwitchOn;
			parameter__pCmdSwitchOn = (WTCParam)eResolveProxy(oldParameter__pCmdSwitchOn);
			if (parameter__pCmdSwitchOn != oldParameter__pCmdSwitchOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_SWITCH_ON, oldParameter__pCmdSwitchOn, parameter__pCmdSwitchOn));
			}
		}
		return parameter__pCmdSwitchOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pCmdSwitchOn() {
		return parameter__pCmdSwitchOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pCmdSwitchOn(WTCParam newParameter__pCmdSwitchOn) {
		WTCParam oldParameter__pCmdSwitchOn = parameter__pCmdSwitchOn;
		parameter__pCmdSwitchOn = newParameter__pCmdSwitchOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_SWITCH_ON, oldParameter__pCmdSwitchOn, parameter__pCmdSwitchOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pCmdBraking() {
		if (parameter__pCmdBraking != null && parameter__pCmdBraking.eIsProxy()) {
			InternalEObject oldParameter__pCmdBraking = (InternalEObject)parameter__pCmdBraking;
			parameter__pCmdBraking = (WTCParam)eResolveProxy(oldParameter__pCmdBraking);
			if (parameter__pCmdBraking != oldParameter__pCmdBraking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_BRAKING, oldParameter__pCmdBraking, parameter__pCmdBraking));
			}
		}
		return parameter__pCmdBraking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pCmdBraking() {
		return parameter__pCmdBraking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pCmdBraking(WTCParam newParameter__pCmdBraking) {
		WTCParam oldParameter__pCmdBraking = parameter__pCmdBraking;
		parameter__pCmdBraking = newParameter__pCmdBraking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_BRAKING, oldParameter__pCmdBraking, parameter__pCmdBraking));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT18__TIMER_TDELAY, oldTimer__tDelay, timer__tDelay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT18__TIMER_TDELAY, oldTimer__tDelay, timer__tDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT18__INPUT_IORDER_CW:
				if (resolve) return getInput__iOrderCw();
				return basicGetInput__iOrderCw();
			case WTSpecPackage.CTRL_UNIT18__INPUT_IORDER_CCW:
				if (resolve) return getInput__iOrderCcw();
				return basicGetInput__iOrderCcw();
			case WTSpecPackage.CTRL_UNIT18__INPUT_IFAULT:
				if (resolve) return getInput__iFault();
				return basicGetInput__iFault();
			case WTSpecPackage.CTRL_UNIT18__INPUT_ICMD_DISABLE:
				if (resolve) return getInput__iCmdDisable();
				return basicGetInput__iCmdDisable();
			case WTSpecPackage.CTRL_UNIT18__INPUT_ICMD_RESET:
				if (resolve) return getInput__iCmdReset();
				return basicGetInput__iCmdReset();
			case WTSpecPackage.CTRL_UNIT18__INPUT_ISTA_READY_TO_ON:
				if (resolve) return getInput__iStaReadyToOn();
				return basicGetInput__iStaReadyToOn();
			case WTSpecPackage.CTRL_UNIT18__OUTPUT_OCONTROL_WORD:
				if (resolve) return getOutput__oControlWord();
				return basicGetOutput__oControlWord();
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_DISABLED:
				if (resolve) return getParameter__pCmdDisabled();
				return basicGetParameter__pCmdDisabled();
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_ENABLED:
				if (resolve) return getParameter__pCmdEnabled();
				return basicGetParameter__pCmdEnabled();
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_CW:
				if (resolve) return getParameter__pCmdCw();
				return basicGetParameter__pCmdCw();
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_CCW:
				if (resolve) return getParameter__pCmdCcw();
				return basicGetParameter__pCmdCcw();
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_RESET:
				if (resolve) return getParameter__pCmdReset();
				return basicGetParameter__pCmdReset();
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_SWITCH_ON:
				if (resolve) return getParameter__pCmdSwitchOn();
				return basicGetParameter__pCmdSwitchOn();
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_BRAKING:
				if (resolve) return getParameter__pCmdBraking();
				return basicGetParameter__pCmdBraking();
			case WTSpecPackage.CTRL_UNIT18__TIMER_TDELAY:
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
			case WTSpecPackage.CTRL_UNIT18__INPUT_IORDER_CW:
				setInput__iOrderCw((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT18__INPUT_IORDER_CCW:
				setInput__iOrderCcw((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT18__INPUT_IFAULT:
				setInput__iFault((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT18__INPUT_ICMD_DISABLE:
				setInput__iCmdDisable((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT18__INPUT_ICMD_RESET:
				setInput__iCmdReset((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT18__INPUT_ISTA_READY_TO_ON:
				setInput__iStaReadyToOn((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT18__OUTPUT_OCONTROL_WORD:
				setOutput__oControlWord((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_DISABLED:
				setParameter__pCmdDisabled((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_ENABLED:
				setParameter__pCmdEnabled((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_CW:
				setParameter__pCmdCw((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_CCW:
				setParameter__pCmdCcw((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_RESET:
				setParameter__pCmdReset((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_SWITCH_ON:
				setParameter__pCmdSwitchOn((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_BRAKING:
				setParameter__pCmdBraking((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT18__TIMER_TDELAY:
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
			case WTSpecPackage.CTRL_UNIT18__INPUT_IORDER_CW:
				setInput__iOrderCw((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT18__INPUT_IORDER_CCW:
				setInput__iOrderCcw((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT18__INPUT_IFAULT:
				setInput__iFault((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT18__INPUT_ICMD_DISABLE:
				setInput__iCmdDisable((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT18__INPUT_ICMD_RESET:
				setInput__iCmdReset((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT18__INPUT_ISTA_READY_TO_ON:
				setInput__iStaReadyToOn((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT18__OUTPUT_OCONTROL_WORD:
				setOutput__oControlWord((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_DISABLED:
				setParameter__pCmdDisabled((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_ENABLED:
				setParameter__pCmdEnabled((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_CW:
				setParameter__pCmdCw((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_CCW:
				setParameter__pCmdCcw((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_RESET:
				setParameter__pCmdReset((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_SWITCH_ON:
				setParameter__pCmdSwitchOn((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_BRAKING:
				setParameter__pCmdBraking((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT18__TIMER_TDELAY:
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
			case WTSpecPackage.CTRL_UNIT18__INPUT_IORDER_CW:
				return input__iOrderCw != null;
			case WTSpecPackage.CTRL_UNIT18__INPUT_IORDER_CCW:
				return input__iOrderCcw != null;
			case WTSpecPackage.CTRL_UNIT18__INPUT_IFAULT:
				return input__iFault != null;
			case WTSpecPackage.CTRL_UNIT18__INPUT_ICMD_DISABLE:
				return input__iCmdDisable != null;
			case WTSpecPackage.CTRL_UNIT18__INPUT_ICMD_RESET:
				return input__iCmdReset != null;
			case WTSpecPackage.CTRL_UNIT18__INPUT_ISTA_READY_TO_ON:
				return input__iStaReadyToOn != null;
			case WTSpecPackage.CTRL_UNIT18__OUTPUT_OCONTROL_WORD:
				return output__oControlWord != null;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_DISABLED:
				return parameter__pCmdDisabled != null;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_ENABLED:
				return parameter__pCmdEnabled != null;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_CW:
				return parameter__pCmdCw != null;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_CCW:
				return parameter__pCmdCcw != null;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_RESET:
				return parameter__pCmdReset != null;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_SWITCH_ON:
				return parameter__pCmdSwitchOn != null;
			case WTSpecPackage.CTRL_UNIT18__PARAMETER_PCMD_BRAKING:
				return parameter__pCmdBraking != null;
			case WTSpecPackage.CTRL_UNIT18__TIMER_TDELAY:
				return timer__tDelay != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit18Impl
