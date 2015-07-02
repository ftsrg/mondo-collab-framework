/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit60;
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
 * An implementation of the model object '<em><b>Ctrl Unit60</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getInput__iDisconnect <em>Input iDisconnect</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getInput__iStopCommand <em>Input iStop Command</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getInput__iPitchBraked <em>Input iPitch Braked</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getInput__iInverterRpm <em>Input iInverter Rpm</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getInput__iReadyForOn <em>Input iReady For On</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getInput__iReadyForRun <em>Input iReady For Run</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getInput__iReadyForRef <em>Input iReady For Ref</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getInput__iResetOrder <em>Input iReset Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getInput__iForceInvOff <em>Input iForce Inv Off</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getInput__iSafetyInput <em>Input iSafety Input</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getOutput__oInverterRun <em>Output oInverter Run</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getOutput__oInverterToOn <em>Output oInverter To On</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getParameter__pInverterConnSpeed <em>Parameter pInverter Conn Speed</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getParameter__pInverterConnSpeedHysteresis <em>Parameter pInverter Conn Speed Hysteresis</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getFault__fReconnectWarning <em>Fault fReconnect Warning</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getFault__fReadyRefWarning <em>Fault fReady Ref Warning</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getTimer__tConnection <em>Timer tConnection</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit60Impl#getTimer__tRunningDelay <em>Timer tRunning Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit60Impl extends wtcImpl implements CtrlUnit60 {
	/**
	 * The cached value of the '{@link #getInput__iDisconnect() <em>Input iDisconnect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iDisconnect()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iDisconnect;

	/**
	 * The cached value of the '{@link #getInput__iStopCommand() <em>Input iStop Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iStopCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iStopCommand;

	/**
	 * The cached value of the '{@link #getInput__iPitchBraked() <em>Input iPitch Braked</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPitchBraked()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPitchBraked;

	/**
	 * The cached value of the '{@link #getInput__iInverterRpm() <em>Input iInverter Rpm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInverterRpm()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInverterRpm;

	/**
	 * The cached value of the '{@link #getInput__iReadyForOn() <em>Input iReady For On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iReadyForOn()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iReadyForOn;

	/**
	 * The cached value of the '{@link #getInput__iReadyForRun() <em>Input iReady For Run</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iReadyForRun()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iReadyForRun;

	/**
	 * The cached value of the '{@link #getInput__iReadyForRef() <em>Input iReady For Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iReadyForRef()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iReadyForRef;

	/**
	 * The cached value of the '{@link #getInput__iResetOrder() <em>Input iReset Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iResetOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iResetOrder;

	/**
	 * The cached value of the '{@link #getInput__iForceInvOff() <em>Input iForce Inv Off</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iForceInvOff()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iForceInvOff;

	/**
	 * The cached value of the '{@link #getInput__iSafetyInput() <em>Input iSafety Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iSafetyInput()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iSafetyInput;

	/**
	 * The cached value of the '{@link #getOutput__oInverterRun() <em>Output oInverter Run</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oInverterRun()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oInverterRun;

	/**
	 * The cached value of the '{@link #getOutput__oInverterToOn() <em>Output oInverter To On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oInverterToOn()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oInverterToOn;

	/**
	 * The cached value of the '{@link #getParameter__pInverterConnSpeed() <em>Parameter pInverter Conn Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pInverterConnSpeed()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pInverterConnSpeed;

	/**
	 * The cached value of the '{@link #getParameter__pInverterConnSpeedHysteresis() <em>Parameter pInverter Conn Speed Hysteresis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pInverterConnSpeedHysteresis()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pInverterConnSpeedHysteresis;

	/**
	 * The cached value of the '{@link #getFault__fReconnectWarning() <em>Fault fReconnect Warning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fReconnectWarning()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fReconnectWarning;

	/**
	 * The cached value of the '{@link #getFault__fReadyRefWarning() <em>Fault fReady Ref Warning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fReadyRefWarning()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fReadyRefWarning;

	/**
	 * The cached value of the '{@link #getTimer__tConnection() <em>Timer tConnection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tConnection()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tConnection;

	/**
	 * The cached value of the '{@link #getTimer__tRunningDelay() <em>Timer tRunning Delay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tRunningDelay()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tRunningDelay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit60Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit60();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iDisconnect() {
		if (input__iDisconnect != null && input__iDisconnect.eIsProxy()) {
			InternalEObject oldInput__iDisconnect = (InternalEObject)input__iDisconnect;
			input__iDisconnect = (WTCInput)eResolveProxy(oldInput__iDisconnect);
			if (input__iDisconnect != oldInput__iDisconnect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__INPUT_IDISCONNECT, oldInput__iDisconnect, input__iDisconnect));
			}
		}
		return input__iDisconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iDisconnect() {
		return input__iDisconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iDisconnect(WTCInput newInput__iDisconnect) {
		WTCInput oldInput__iDisconnect = input__iDisconnect;
		input__iDisconnect = newInput__iDisconnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__INPUT_IDISCONNECT, oldInput__iDisconnect, input__iDisconnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iStopCommand() {
		if (input__iStopCommand != null && input__iStopCommand.eIsProxy()) {
			InternalEObject oldInput__iStopCommand = (InternalEObject)input__iStopCommand;
			input__iStopCommand = (WTCInput)eResolveProxy(oldInput__iStopCommand);
			if (input__iStopCommand != oldInput__iStopCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__INPUT_ISTOP_COMMAND, oldInput__iStopCommand, input__iStopCommand));
			}
		}
		return input__iStopCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iStopCommand() {
		return input__iStopCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iStopCommand(WTCInput newInput__iStopCommand) {
		WTCInput oldInput__iStopCommand = input__iStopCommand;
		input__iStopCommand = newInput__iStopCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__INPUT_ISTOP_COMMAND, oldInput__iStopCommand, input__iStopCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPitchBraked() {
		if (input__iPitchBraked != null && input__iPitchBraked.eIsProxy()) {
			InternalEObject oldInput__iPitchBraked = (InternalEObject)input__iPitchBraked;
			input__iPitchBraked = (WTCInput)eResolveProxy(oldInput__iPitchBraked);
			if (input__iPitchBraked != oldInput__iPitchBraked) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__INPUT_IPITCH_BRAKED, oldInput__iPitchBraked, input__iPitchBraked));
			}
		}
		return input__iPitchBraked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPitchBraked() {
		return input__iPitchBraked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPitchBraked(WTCInput newInput__iPitchBraked) {
		WTCInput oldInput__iPitchBraked = input__iPitchBraked;
		input__iPitchBraked = newInput__iPitchBraked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__INPUT_IPITCH_BRAKED, oldInput__iPitchBraked, input__iPitchBraked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInverterRpm() {
		if (input__iInverterRpm != null && input__iInverterRpm.eIsProxy()) {
			InternalEObject oldInput__iInverterRpm = (InternalEObject)input__iInverterRpm;
			input__iInverterRpm = (WTCInput)eResolveProxy(oldInput__iInverterRpm);
			if (input__iInverterRpm != oldInput__iInverterRpm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__INPUT_IINVERTER_RPM, oldInput__iInverterRpm, input__iInverterRpm));
			}
		}
		return input__iInverterRpm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInverterRpm() {
		return input__iInverterRpm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInverterRpm(WTCInput newInput__iInverterRpm) {
		WTCInput oldInput__iInverterRpm = input__iInverterRpm;
		input__iInverterRpm = newInput__iInverterRpm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__INPUT_IINVERTER_RPM, oldInput__iInverterRpm, input__iInverterRpm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iReadyForOn() {
		if (input__iReadyForOn != null && input__iReadyForOn.eIsProxy()) {
			InternalEObject oldInput__iReadyForOn = (InternalEObject)input__iReadyForOn;
			input__iReadyForOn = (WTCInput)eResolveProxy(oldInput__iReadyForOn);
			if (input__iReadyForOn != oldInput__iReadyForOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_ON, oldInput__iReadyForOn, input__iReadyForOn));
			}
		}
		return input__iReadyForOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iReadyForOn() {
		return input__iReadyForOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iReadyForOn(WTCInput newInput__iReadyForOn) {
		WTCInput oldInput__iReadyForOn = input__iReadyForOn;
		input__iReadyForOn = newInput__iReadyForOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_ON, oldInput__iReadyForOn, input__iReadyForOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iReadyForRun() {
		if (input__iReadyForRun != null && input__iReadyForRun.eIsProxy()) {
			InternalEObject oldInput__iReadyForRun = (InternalEObject)input__iReadyForRun;
			input__iReadyForRun = (WTCInput)eResolveProxy(oldInput__iReadyForRun);
			if (input__iReadyForRun != oldInput__iReadyForRun) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_RUN, oldInput__iReadyForRun, input__iReadyForRun));
			}
		}
		return input__iReadyForRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iReadyForRun() {
		return input__iReadyForRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iReadyForRun(WTCInput newInput__iReadyForRun) {
		WTCInput oldInput__iReadyForRun = input__iReadyForRun;
		input__iReadyForRun = newInput__iReadyForRun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_RUN, oldInput__iReadyForRun, input__iReadyForRun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iReadyForRef() {
		if (input__iReadyForRef != null && input__iReadyForRef.eIsProxy()) {
			InternalEObject oldInput__iReadyForRef = (InternalEObject)input__iReadyForRef;
			input__iReadyForRef = (WTCInput)eResolveProxy(oldInput__iReadyForRef);
			if (input__iReadyForRef != oldInput__iReadyForRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_REF, oldInput__iReadyForRef, input__iReadyForRef));
			}
		}
		return input__iReadyForRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iReadyForRef() {
		return input__iReadyForRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iReadyForRef(WTCInput newInput__iReadyForRef) {
		WTCInput oldInput__iReadyForRef = input__iReadyForRef;
		input__iReadyForRef = newInput__iReadyForRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_REF, oldInput__iReadyForRef, input__iReadyForRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iResetOrder() {
		if (input__iResetOrder != null && input__iResetOrder.eIsProxy()) {
			InternalEObject oldInput__iResetOrder = (InternalEObject)input__iResetOrder;
			input__iResetOrder = (WTCInput)eResolveProxy(oldInput__iResetOrder);
			if (input__iResetOrder != oldInput__iResetOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__INPUT_IRESET_ORDER, oldInput__iResetOrder, input__iResetOrder));
			}
		}
		return input__iResetOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iResetOrder() {
		return input__iResetOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iResetOrder(WTCInput newInput__iResetOrder) {
		WTCInput oldInput__iResetOrder = input__iResetOrder;
		input__iResetOrder = newInput__iResetOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__INPUT_IRESET_ORDER, oldInput__iResetOrder, input__iResetOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iForceInvOff() {
		if (input__iForceInvOff != null && input__iForceInvOff.eIsProxy()) {
			InternalEObject oldInput__iForceInvOff = (InternalEObject)input__iForceInvOff;
			input__iForceInvOff = (WTCInput)eResolveProxy(oldInput__iForceInvOff);
			if (input__iForceInvOff != oldInput__iForceInvOff) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__INPUT_IFORCE_INV_OFF, oldInput__iForceInvOff, input__iForceInvOff));
			}
		}
		return input__iForceInvOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iForceInvOff() {
		return input__iForceInvOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iForceInvOff(WTCInput newInput__iForceInvOff) {
		WTCInput oldInput__iForceInvOff = input__iForceInvOff;
		input__iForceInvOff = newInput__iForceInvOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__INPUT_IFORCE_INV_OFF, oldInput__iForceInvOff, input__iForceInvOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iSafetyInput() {
		if (input__iSafetyInput != null && input__iSafetyInput.eIsProxy()) {
			InternalEObject oldInput__iSafetyInput = (InternalEObject)input__iSafetyInput;
			input__iSafetyInput = (WTCInput)eResolveProxy(oldInput__iSafetyInput);
			if (input__iSafetyInput != oldInput__iSafetyInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__INPUT_ISAFETY_INPUT, oldInput__iSafetyInput, input__iSafetyInput));
			}
		}
		return input__iSafetyInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iSafetyInput() {
		return input__iSafetyInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iSafetyInput(WTCInput newInput__iSafetyInput) {
		WTCInput oldInput__iSafetyInput = input__iSafetyInput;
		input__iSafetyInput = newInput__iSafetyInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__INPUT_ISAFETY_INPUT, oldInput__iSafetyInput, input__iSafetyInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oInverterRun() {
		if (output__oInverterRun != null && output__oInverterRun.eIsProxy()) {
			InternalEObject oldOutput__oInverterRun = (InternalEObject)output__oInverterRun;
			output__oInverterRun = (WTCOutput)eResolveProxy(oldOutput__oInverterRun);
			if (output__oInverterRun != oldOutput__oInverterRun) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__OUTPUT_OINVERTER_RUN, oldOutput__oInverterRun, output__oInverterRun));
			}
		}
		return output__oInverterRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oInverterRun() {
		return output__oInverterRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oInverterRun(WTCOutput newOutput__oInverterRun) {
		WTCOutput oldOutput__oInverterRun = output__oInverterRun;
		output__oInverterRun = newOutput__oInverterRun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__OUTPUT_OINVERTER_RUN, oldOutput__oInverterRun, output__oInverterRun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oInverterToOn() {
		if (output__oInverterToOn != null && output__oInverterToOn.eIsProxy()) {
			InternalEObject oldOutput__oInverterToOn = (InternalEObject)output__oInverterToOn;
			output__oInverterToOn = (WTCOutput)eResolveProxy(oldOutput__oInverterToOn);
			if (output__oInverterToOn != oldOutput__oInverterToOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__OUTPUT_OINVERTER_TO_ON, oldOutput__oInverterToOn, output__oInverterToOn));
			}
		}
		return output__oInverterToOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oInverterToOn() {
		return output__oInverterToOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oInverterToOn(WTCOutput newOutput__oInverterToOn) {
		WTCOutput oldOutput__oInverterToOn = output__oInverterToOn;
		output__oInverterToOn = newOutput__oInverterToOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__OUTPUT_OINVERTER_TO_ON, oldOutput__oInverterToOn, output__oInverterToOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pInverterConnSpeed() {
		if (parameter__pInverterConnSpeed != null && parameter__pInverterConnSpeed.eIsProxy()) {
			InternalEObject oldParameter__pInverterConnSpeed = (InternalEObject)parameter__pInverterConnSpeed;
			parameter__pInverterConnSpeed = (WTCParam)eResolveProxy(oldParameter__pInverterConnSpeed);
			if (parameter__pInverterConnSpeed != oldParameter__pInverterConnSpeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__PARAMETER_PINVERTER_CONN_SPEED, oldParameter__pInverterConnSpeed, parameter__pInverterConnSpeed));
			}
		}
		return parameter__pInverterConnSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pInverterConnSpeed() {
		return parameter__pInverterConnSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pInverterConnSpeed(WTCParam newParameter__pInverterConnSpeed) {
		WTCParam oldParameter__pInverterConnSpeed = parameter__pInverterConnSpeed;
		parameter__pInverterConnSpeed = newParameter__pInverterConnSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__PARAMETER_PINVERTER_CONN_SPEED, oldParameter__pInverterConnSpeed, parameter__pInverterConnSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pInverterConnSpeedHysteresis() {
		if (parameter__pInverterConnSpeedHysteresis != null && parameter__pInverterConnSpeedHysteresis.eIsProxy()) {
			InternalEObject oldParameter__pInverterConnSpeedHysteresis = (InternalEObject)parameter__pInverterConnSpeedHysteresis;
			parameter__pInverterConnSpeedHysteresis = (WTCParam)eResolveProxy(oldParameter__pInverterConnSpeedHysteresis);
			if (parameter__pInverterConnSpeedHysteresis != oldParameter__pInverterConnSpeedHysteresis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__PARAMETER_PINVERTER_CONN_SPEED_HYSTERESIS, oldParameter__pInverterConnSpeedHysteresis, parameter__pInverterConnSpeedHysteresis));
			}
		}
		return parameter__pInverterConnSpeedHysteresis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pInverterConnSpeedHysteresis() {
		return parameter__pInverterConnSpeedHysteresis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pInverterConnSpeedHysteresis(WTCParam newParameter__pInverterConnSpeedHysteresis) {
		WTCParam oldParameter__pInverterConnSpeedHysteresis = parameter__pInverterConnSpeedHysteresis;
		parameter__pInverterConnSpeedHysteresis = newParameter__pInverterConnSpeedHysteresis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__PARAMETER_PINVERTER_CONN_SPEED_HYSTERESIS, oldParameter__pInverterConnSpeedHysteresis, parameter__pInverterConnSpeedHysteresis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fReconnectWarning() {
		if (fault__fReconnectWarning != null && fault__fReconnectWarning.eIsProxy()) {
			InternalEObject oldFault__fReconnectWarning = (InternalEObject)fault__fReconnectWarning;
			fault__fReconnectWarning = (WTCFault)eResolveProxy(oldFault__fReconnectWarning);
			if (fault__fReconnectWarning != oldFault__fReconnectWarning) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__FAULT_FRECONNECT_WARNING, oldFault__fReconnectWarning, fault__fReconnectWarning));
			}
		}
		return fault__fReconnectWarning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fReconnectWarning() {
		return fault__fReconnectWarning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fReconnectWarning(WTCFault newFault__fReconnectWarning) {
		WTCFault oldFault__fReconnectWarning = fault__fReconnectWarning;
		fault__fReconnectWarning = newFault__fReconnectWarning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__FAULT_FRECONNECT_WARNING, oldFault__fReconnectWarning, fault__fReconnectWarning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fReadyRefWarning() {
		if (fault__fReadyRefWarning != null && fault__fReadyRefWarning.eIsProxy()) {
			InternalEObject oldFault__fReadyRefWarning = (InternalEObject)fault__fReadyRefWarning;
			fault__fReadyRefWarning = (WTCFault)eResolveProxy(oldFault__fReadyRefWarning);
			if (fault__fReadyRefWarning != oldFault__fReadyRefWarning) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__FAULT_FREADY_REF_WARNING, oldFault__fReadyRefWarning, fault__fReadyRefWarning));
			}
		}
		return fault__fReadyRefWarning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fReadyRefWarning() {
		return fault__fReadyRefWarning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fReadyRefWarning(WTCFault newFault__fReadyRefWarning) {
		WTCFault oldFault__fReadyRefWarning = fault__fReadyRefWarning;
		fault__fReadyRefWarning = newFault__fReadyRefWarning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__FAULT_FREADY_REF_WARNING, oldFault__fReadyRefWarning, fault__fReadyRefWarning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tConnection() {
		if (timer__tConnection != null && timer__tConnection.eIsProxy()) {
			InternalEObject oldTimer__tConnection = (InternalEObject)timer__tConnection;
			timer__tConnection = (WTCTimer)eResolveProxy(oldTimer__tConnection);
			if (timer__tConnection != oldTimer__tConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__TIMER_TCONNECTION, oldTimer__tConnection, timer__tConnection));
			}
		}
		return timer__tConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tConnection() {
		return timer__tConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tConnection(WTCTimer newTimer__tConnection) {
		WTCTimer oldTimer__tConnection = timer__tConnection;
		timer__tConnection = newTimer__tConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__TIMER_TCONNECTION, oldTimer__tConnection, timer__tConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tRunningDelay() {
		if (timer__tRunningDelay != null && timer__tRunningDelay.eIsProxy()) {
			InternalEObject oldTimer__tRunningDelay = (InternalEObject)timer__tRunningDelay;
			timer__tRunningDelay = (WTCTimer)eResolveProxy(oldTimer__tRunningDelay);
			if (timer__tRunningDelay != oldTimer__tRunningDelay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT60__TIMER_TRUNNING_DELAY, oldTimer__tRunningDelay, timer__tRunningDelay));
			}
		}
		return timer__tRunningDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tRunningDelay() {
		return timer__tRunningDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tRunningDelay(WTCTimer newTimer__tRunningDelay) {
		WTCTimer oldTimer__tRunningDelay = timer__tRunningDelay;
		timer__tRunningDelay = newTimer__tRunningDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT60__TIMER_TRUNNING_DELAY, oldTimer__tRunningDelay, timer__tRunningDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT60__INPUT_IDISCONNECT:
				if (resolve) return getInput__iDisconnect();
				return basicGetInput__iDisconnect();
			case WTSpecPackage.CTRL_UNIT60__INPUT_ISTOP_COMMAND:
				if (resolve) return getInput__iStopCommand();
				return basicGetInput__iStopCommand();
			case WTSpecPackage.CTRL_UNIT60__INPUT_IPITCH_BRAKED:
				if (resolve) return getInput__iPitchBraked();
				return basicGetInput__iPitchBraked();
			case WTSpecPackage.CTRL_UNIT60__INPUT_IINVERTER_RPM:
				if (resolve) return getInput__iInverterRpm();
				return basicGetInput__iInverterRpm();
			case WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_ON:
				if (resolve) return getInput__iReadyForOn();
				return basicGetInput__iReadyForOn();
			case WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_RUN:
				if (resolve) return getInput__iReadyForRun();
				return basicGetInput__iReadyForRun();
			case WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_REF:
				if (resolve) return getInput__iReadyForRef();
				return basicGetInput__iReadyForRef();
			case WTSpecPackage.CTRL_UNIT60__INPUT_IRESET_ORDER:
				if (resolve) return getInput__iResetOrder();
				return basicGetInput__iResetOrder();
			case WTSpecPackage.CTRL_UNIT60__INPUT_IFORCE_INV_OFF:
				if (resolve) return getInput__iForceInvOff();
				return basicGetInput__iForceInvOff();
			case WTSpecPackage.CTRL_UNIT60__INPUT_ISAFETY_INPUT:
				if (resolve) return getInput__iSafetyInput();
				return basicGetInput__iSafetyInput();
			case WTSpecPackage.CTRL_UNIT60__OUTPUT_OINVERTER_RUN:
				if (resolve) return getOutput__oInverterRun();
				return basicGetOutput__oInverterRun();
			case WTSpecPackage.CTRL_UNIT60__OUTPUT_OINVERTER_TO_ON:
				if (resolve) return getOutput__oInverterToOn();
				return basicGetOutput__oInverterToOn();
			case WTSpecPackage.CTRL_UNIT60__PARAMETER_PINVERTER_CONN_SPEED:
				if (resolve) return getParameter__pInverterConnSpeed();
				return basicGetParameter__pInverterConnSpeed();
			case WTSpecPackage.CTRL_UNIT60__PARAMETER_PINVERTER_CONN_SPEED_HYSTERESIS:
				if (resolve) return getParameter__pInverterConnSpeedHysteresis();
				return basicGetParameter__pInverterConnSpeedHysteresis();
			case WTSpecPackage.CTRL_UNIT60__FAULT_FRECONNECT_WARNING:
				if (resolve) return getFault__fReconnectWarning();
				return basicGetFault__fReconnectWarning();
			case WTSpecPackage.CTRL_UNIT60__FAULT_FREADY_REF_WARNING:
				if (resolve) return getFault__fReadyRefWarning();
				return basicGetFault__fReadyRefWarning();
			case WTSpecPackage.CTRL_UNIT60__TIMER_TCONNECTION:
				if (resolve) return getTimer__tConnection();
				return basicGetTimer__tConnection();
			case WTSpecPackage.CTRL_UNIT60__TIMER_TRUNNING_DELAY:
				if (resolve) return getTimer__tRunningDelay();
				return basicGetTimer__tRunningDelay();
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
			case WTSpecPackage.CTRL_UNIT60__INPUT_IDISCONNECT:
				setInput__iDisconnect((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_ISTOP_COMMAND:
				setInput__iStopCommand((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IPITCH_BRAKED:
				setInput__iPitchBraked((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IINVERTER_RPM:
				setInput__iInverterRpm((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_ON:
				setInput__iReadyForOn((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_RUN:
				setInput__iReadyForRun((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_REF:
				setInput__iReadyForRef((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IRESET_ORDER:
				setInput__iResetOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IFORCE_INV_OFF:
				setInput__iForceInvOff((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_ISAFETY_INPUT:
				setInput__iSafetyInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT60__OUTPUT_OINVERTER_RUN:
				setOutput__oInverterRun((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT60__OUTPUT_OINVERTER_TO_ON:
				setOutput__oInverterToOn((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT60__PARAMETER_PINVERTER_CONN_SPEED:
				setParameter__pInverterConnSpeed((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT60__PARAMETER_PINVERTER_CONN_SPEED_HYSTERESIS:
				setParameter__pInverterConnSpeedHysteresis((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT60__FAULT_FRECONNECT_WARNING:
				setFault__fReconnectWarning((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT60__FAULT_FREADY_REF_WARNING:
				setFault__fReadyRefWarning((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT60__TIMER_TCONNECTION:
				setTimer__tConnection((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT60__TIMER_TRUNNING_DELAY:
				setTimer__tRunningDelay((WTCTimer)newValue);
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
			case WTSpecPackage.CTRL_UNIT60__INPUT_IDISCONNECT:
				setInput__iDisconnect((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_ISTOP_COMMAND:
				setInput__iStopCommand((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IPITCH_BRAKED:
				setInput__iPitchBraked((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IINVERTER_RPM:
				setInput__iInverterRpm((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_ON:
				setInput__iReadyForOn((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_RUN:
				setInput__iReadyForRun((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_REF:
				setInput__iReadyForRef((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IRESET_ORDER:
				setInput__iResetOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IFORCE_INV_OFF:
				setInput__iForceInvOff((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT60__INPUT_ISAFETY_INPUT:
				setInput__iSafetyInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT60__OUTPUT_OINVERTER_RUN:
				setOutput__oInverterRun((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT60__OUTPUT_OINVERTER_TO_ON:
				setOutput__oInverterToOn((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT60__PARAMETER_PINVERTER_CONN_SPEED:
				setParameter__pInverterConnSpeed((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT60__PARAMETER_PINVERTER_CONN_SPEED_HYSTERESIS:
				setParameter__pInverterConnSpeedHysteresis((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT60__FAULT_FRECONNECT_WARNING:
				setFault__fReconnectWarning((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT60__FAULT_FREADY_REF_WARNING:
				setFault__fReadyRefWarning((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT60__TIMER_TCONNECTION:
				setTimer__tConnection((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT60__TIMER_TRUNNING_DELAY:
				setTimer__tRunningDelay((WTCTimer)null);
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
			case WTSpecPackage.CTRL_UNIT60__INPUT_IDISCONNECT:
				return input__iDisconnect != null;
			case WTSpecPackage.CTRL_UNIT60__INPUT_ISTOP_COMMAND:
				return input__iStopCommand != null;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IPITCH_BRAKED:
				return input__iPitchBraked != null;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IINVERTER_RPM:
				return input__iInverterRpm != null;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_ON:
				return input__iReadyForOn != null;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_RUN:
				return input__iReadyForRun != null;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IREADY_FOR_REF:
				return input__iReadyForRef != null;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IRESET_ORDER:
				return input__iResetOrder != null;
			case WTSpecPackage.CTRL_UNIT60__INPUT_IFORCE_INV_OFF:
				return input__iForceInvOff != null;
			case WTSpecPackage.CTRL_UNIT60__INPUT_ISAFETY_INPUT:
				return input__iSafetyInput != null;
			case WTSpecPackage.CTRL_UNIT60__OUTPUT_OINVERTER_RUN:
				return output__oInverterRun != null;
			case WTSpecPackage.CTRL_UNIT60__OUTPUT_OINVERTER_TO_ON:
				return output__oInverterToOn != null;
			case WTSpecPackage.CTRL_UNIT60__PARAMETER_PINVERTER_CONN_SPEED:
				return parameter__pInverterConnSpeed != null;
			case WTSpecPackage.CTRL_UNIT60__PARAMETER_PINVERTER_CONN_SPEED_HYSTERESIS:
				return parameter__pInverterConnSpeedHysteresis != null;
			case WTSpecPackage.CTRL_UNIT60__FAULT_FRECONNECT_WARNING:
				return fault__fReconnectWarning != null;
			case WTSpecPackage.CTRL_UNIT60__FAULT_FREADY_REF_WARNING:
				return fault__fReadyRefWarning != null;
			case WTSpecPackage.CTRL_UNIT60__TIMER_TCONNECTION:
				return timer__tConnection != null;
			case WTSpecPackage.CTRL_UNIT60__TIMER_TRUNNING_DELAY:
				return timer__tRunningDelay != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit60Impl
