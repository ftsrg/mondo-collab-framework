/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit25;
import WTSpec.WTCFault;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTCTimer;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit25</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit25Impl#getInput__iStatus <em>Input iStatus</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit25Impl#getInput__iOverloadAlarm <em>Input iOverload Alarm</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit25Impl#getInput__iAlarmCounter <em>Input iAlarm Counter</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit25Impl#getOutput__oAlarmCounter <em>Output oAlarm Counter</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit25Impl#getFault__fOverload <em>Fault fOverload</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit25Impl#getTimer__tTimer <em>Timer tTimer</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit25Impl#getTimer__tSyncDelay <em>Timer tSync Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit25Impl extends wtcImpl implements CtrlUnit25 {
	/**
	 * The cached value of the '{@link #getInput__iStatus() <em>Input iStatus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iStatus;

	/**
	 * The cached value of the '{@link #getInput__iOverloadAlarm() <em>Input iOverload Alarm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iOverloadAlarm()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iOverloadAlarm;

	/**
	 * The cached value of the '{@link #getInput__iAlarmCounter() <em>Input iAlarm Counter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iAlarmCounter()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iAlarmCounter;

	/**
	 * The cached value of the '{@link #getOutput__oAlarmCounter() <em>Output oAlarm Counter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oAlarmCounter()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oAlarmCounter;

	/**
	 * The cached value of the '{@link #getFault__fOverload() <em>Fault fOverload</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fOverload()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fOverload;

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
	 * The cached value of the '{@link #getTimer__tSyncDelay() <em>Timer tSync Delay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tSyncDelay()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tSyncDelay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit25Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iStatus() {
		if (input__iStatus != null && input__iStatus.eIsProxy()) {
			InternalEObject oldInput__iStatus = (InternalEObject)input__iStatus;
			input__iStatus = (WTCInput)eResolveProxy(oldInput__iStatus);
			if (input__iStatus != oldInput__iStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT25__INPUT_ISTATUS, oldInput__iStatus, input__iStatus));
			}
		}
		return input__iStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iStatus() {
		return input__iStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iStatus(WTCInput newInput__iStatus) {
		WTCInput oldInput__iStatus = input__iStatus;
		input__iStatus = newInput__iStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT25__INPUT_ISTATUS, oldInput__iStatus, input__iStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iOverloadAlarm() {
		if (input__iOverloadAlarm != null && input__iOverloadAlarm.eIsProxy()) {
			InternalEObject oldInput__iOverloadAlarm = (InternalEObject)input__iOverloadAlarm;
			input__iOverloadAlarm = (WTCInput)eResolveProxy(oldInput__iOverloadAlarm);
			if (input__iOverloadAlarm != oldInput__iOverloadAlarm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT25__INPUT_IOVERLOAD_ALARM, oldInput__iOverloadAlarm, input__iOverloadAlarm));
			}
		}
		return input__iOverloadAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iOverloadAlarm() {
		return input__iOverloadAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iOverloadAlarm(WTCInput newInput__iOverloadAlarm) {
		WTCInput oldInput__iOverloadAlarm = input__iOverloadAlarm;
		input__iOverloadAlarm = newInput__iOverloadAlarm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT25__INPUT_IOVERLOAD_ALARM, oldInput__iOverloadAlarm, input__iOverloadAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iAlarmCounter() {
		if (input__iAlarmCounter != null && input__iAlarmCounter.eIsProxy()) {
			InternalEObject oldInput__iAlarmCounter = (InternalEObject)input__iAlarmCounter;
			input__iAlarmCounter = (WTCInput)eResolveProxy(oldInput__iAlarmCounter);
			if (input__iAlarmCounter != oldInput__iAlarmCounter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT25__INPUT_IALARM_COUNTER, oldInput__iAlarmCounter, input__iAlarmCounter));
			}
		}
		return input__iAlarmCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iAlarmCounter() {
		return input__iAlarmCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iAlarmCounter(WTCInput newInput__iAlarmCounter) {
		WTCInput oldInput__iAlarmCounter = input__iAlarmCounter;
		input__iAlarmCounter = newInput__iAlarmCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT25__INPUT_IALARM_COUNTER, oldInput__iAlarmCounter, input__iAlarmCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oAlarmCounter() {
		if (output__oAlarmCounter != null && output__oAlarmCounter.eIsProxy()) {
			InternalEObject oldOutput__oAlarmCounter = (InternalEObject)output__oAlarmCounter;
			output__oAlarmCounter = (WTCOutput)eResolveProxy(oldOutput__oAlarmCounter);
			if (output__oAlarmCounter != oldOutput__oAlarmCounter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT25__OUTPUT_OALARM_COUNTER, oldOutput__oAlarmCounter, output__oAlarmCounter));
			}
		}
		return output__oAlarmCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oAlarmCounter() {
		return output__oAlarmCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oAlarmCounter(WTCOutput newOutput__oAlarmCounter) {
		WTCOutput oldOutput__oAlarmCounter = output__oAlarmCounter;
		output__oAlarmCounter = newOutput__oAlarmCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT25__OUTPUT_OALARM_COUNTER, oldOutput__oAlarmCounter, output__oAlarmCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fOverload() {
		if (fault__fOverload != null && fault__fOverload.eIsProxy()) {
			InternalEObject oldFault__fOverload = (InternalEObject)fault__fOverload;
			fault__fOverload = (WTCFault)eResolveProxy(oldFault__fOverload);
			if (fault__fOverload != oldFault__fOverload) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT25__FAULT_FOVERLOAD, oldFault__fOverload, fault__fOverload));
			}
		}
		return fault__fOverload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fOverload() {
		return fault__fOverload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fOverload(WTCFault newFault__fOverload) {
		WTCFault oldFault__fOverload = fault__fOverload;
		fault__fOverload = newFault__fOverload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT25__FAULT_FOVERLOAD, oldFault__fOverload, fault__fOverload));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT25__TIMER_TTIMER, oldTimer__tTimer, timer__tTimer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT25__TIMER_TTIMER, oldTimer__tTimer, timer__tTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tSyncDelay() {
		if (timer__tSyncDelay != null && timer__tSyncDelay.eIsProxy()) {
			InternalEObject oldTimer__tSyncDelay = (InternalEObject)timer__tSyncDelay;
			timer__tSyncDelay = (WTCTimer)eResolveProxy(oldTimer__tSyncDelay);
			if (timer__tSyncDelay != oldTimer__tSyncDelay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT25__TIMER_TSYNC_DELAY, oldTimer__tSyncDelay, timer__tSyncDelay));
			}
		}
		return timer__tSyncDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tSyncDelay() {
		return timer__tSyncDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tSyncDelay(WTCTimer newTimer__tSyncDelay) {
		WTCTimer oldTimer__tSyncDelay = timer__tSyncDelay;
		timer__tSyncDelay = newTimer__tSyncDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT25__TIMER_TSYNC_DELAY, oldTimer__tSyncDelay, timer__tSyncDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT25__INPUT_ISTATUS:
				if (resolve) return getInput__iStatus();
				return basicGetInput__iStatus();
			case WTSpecPackage.CTRL_UNIT25__INPUT_IOVERLOAD_ALARM:
				if (resolve) return getInput__iOverloadAlarm();
				return basicGetInput__iOverloadAlarm();
			case WTSpecPackage.CTRL_UNIT25__INPUT_IALARM_COUNTER:
				if (resolve) return getInput__iAlarmCounter();
				return basicGetInput__iAlarmCounter();
			case WTSpecPackage.CTRL_UNIT25__OUTPUT_OALARM_COUNTER:
				if (resolve) return getOutput__oAlarmCounter();
				return basicGetOutput__oAlarmCounter();
			case WTSpecPackage.CTRL_UNIT25__FAULT_FOVERLOAD:
				if (resolve) return getFault__fOverload();
				return basicGetFault__fOverload();
			case WTSpecPackage.CTRL_UNIT25__TIMER_TTIMER:
				if (resolve) return getTimer__tTimer();
				return basicGetTimer__tTimer();
			case WTSpecPackage.CTRL_UNIT25__TIMER_TSYNC_DELAY:
				if (resolve) return getTimer__tSyncDelay();
				return basicGetTimer__tSyncDelay();
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
			case WTSpecPackage.CTRL_UNIT25__INPUT_ISTATUS:
				setInput__iStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT25__INPUT_IOVERLOAD_ALARM:
				setInput__iOverloadAlarm((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT25__INPUT_IALARM_COUNTER:
				setInput__iAlarmCounter((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT25__OUTPUT_OALARM_COUNTER:
				setOutput__oAlarmCounter((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT25__FAULT_FOVERLOAD:
				setFault__fOverload((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT25__TIMER_TTIMER:
				setTimer__tTimer((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT25__TIMER_TSYNC_DELAY:
				setTimer__tSyncDelay((WTCTimer)newValue);
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
			case WTSpecPackage.CTRL_UNIT25__INPUT_ISTATUS:
				setInput__iStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT25__INPUT_IOVERLOAD_ALARM:
				setInput__iOverloadAlarm((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT25__INPUT_IALARM_COUNTER:
				setInput__iAlarmCounter((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT25__OUTPUT_OALARM_COUNTER:
				setOutput__oAlarmCounter((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT25__FAULT_FOVERLOAD:
				setFault__fOverload((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT25__TIMER_TTIMER:
				setTimer__tTimer((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT25__TIMER_TSYNC_DELAY:
				setTimer__tSyncDelay((WTCTimer)null);
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
			case WTSpecPackage.CTRL_UNIT25__INPUT_ISTATUS:
				return input__iStatus != null;
			case WTSpecPackage.CTRL_UNIT25__INPUT_IOVERLOAD_ALARM:
				return input__iOverloadAlarm != null;
			case WTSpecPackage.CTRL_UNIT25__INPUT_IALARM_COUNTER:
				return input__iAlarmCounter != null;
			case WTSpecPackage.CTRL_UNIT25__OUTPUT_OALARM_COUNTER:
				return output__oAlarmCounter != null;
			case WTSpecPackage.CTRL_UNIT25__FAULT_FOVERLOAD:
				return fault__fOverload != null;
			case WTSpecPackage.CTRL_UNIT25__TIMER_TTIMER:
				return timer__tTimer != null;
			case WTSpecPackage.CTRL_UNIT25__TIMER_TSYNC_DELAY:
				return timer__tSyncDelay != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit25Impl
