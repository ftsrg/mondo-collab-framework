/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit133;
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
 * An implementation of the model object '<em><b>Ctrl Unit133</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit133Impl#getInput__iYawStatus <em>Input iYaw Status</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit133Impl#getInput__iYawCurrent1 <em>Input iYaw Current1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit133Impl#getInput__iYawCurrent2 <em>Input iYaw Current2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit133Impl#getInput__iYawCurrent3 <em>Input iYaw Current3</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit133Impl#getInput__iYawCurrent4 <em>Input iYaw Current4</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit133Impl#getInput__iOverloadAlarmCounter <em>Input iOverload Alarm Counter</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit133Impl#getOutput__oOverloadAlarmCounter <em>Output oOverload Alarm Counter</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit133Impl#getParameter__pMaximumTorque <em>Parameter pMaximum Torque</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit133Impl#getParameter__pMinimumTorque <em>Parameter pMinimum Torque</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit133Impl#getParameter__pTorqueDifferenceLimit <em>Parameter pTorque Difference Limit</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit133Impl#getFault__fFault <em>Fault fFault</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit133Impl#getTimer__tTimer <em>Timer tTimer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit133Impl extends wtcImpl implements CtrlUnit133 {
	/**
	 * The cached value of the '{@link #getInput__iYawStatus() <em>Input iYaw Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iYawStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iYawStatus;

	/**
	 * The cached value of the '{@link #getInput__iYawCurrent1() <em>Input iYaw Current1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iYawCurrent1()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iYawCurrent1;

	/**
	 * The cached value of the '{@link #getInput__iYawCurrent2() <em>Input iYaw Current2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iYawCurrent2()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iYawCurrent2;

	/**
	 * The cached value of the '{@link #getInput__iYawCurrent3() <em>Input iYaw Current3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iYawCurrent3()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iYawCurrent3;

	/**
	 * The cached value of the '{@link #getInput__iYawCurrent4() <em>Input iYaw Current4</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iYawCurrent4()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iYawCurrent4;

	/**
	 * The cached value of the '{@link #getInput__iOverloadAlarmCounter() <em>Input iOverload Alarm Counter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iOverloadAlarmCounter()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iOverloadAlarmCounter;

	/**
	 * The cached value of the '{@link #getOutput__oOverloadAlarmCounter() <em>Output oOverload Alarm Counter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOverloadAlarmCounter()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOverloadAlarmCounter;

	/**
	 * The cached value of the '{@link #getParameter__pMaximumTorque() <em>Parameter pMaximum Torque</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pMaximumTorque()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pMaximumTorque;

	/**
	 * The cached value of the '{@link #getParameter__pMinimumTorque() <em>Parameter pMinimum Torque</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pMinimumTorque()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pMinimumTorque;

	/**
	 * The cached value of the '{@link #getParameter__pTorqueDifferenceLimit() <em>Parameter pTorque Difference Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pTorqueDifferenceLimit()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pTorqueDifferenceLimit;

	/**
	 * The cached value of the '{@link #getFault__fFault() <em>Fault fFault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fFault()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fFault;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit133Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit133();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iYawStatus() {
		if (input__iYawStatus != null && input__iYawStatus.eIsProxy()) {
			InternalEObject oldInput__iYawStatus = (InternalEObject)input__iYawStatus;
			input__iYawStatus = (WTCInput)eResolveProxy(oldInput__iYawStatus);
			if (input__iYawStatus != oldInput__iYawStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_STATUS, oldInput__iYawStatus, input__iYawStatus));
			}
		}
		return input__iYawStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iYawStatus() {
		return input__iYawStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iYawStatus(WTCInput newInput__iYawStatus) {
		WTCInput oldInput__iYawStatus = input__iYawStatus;
		input__iYawStatus = newInput__iYawStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_STATUS, oldInput__iYawStatus, input__iYawStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iYawCurrent1() {
		if (input__iYawCurrent1 != null && input__iYawCurrent1.eIsProxy()) {
			InternalEObject oldInput__iYawCurrent1 = (InternalEObject)input__iYawCurrent1;
			input__iYawCurrent1 = (WTCInput)eResolveProxy(oldInput__iYawCurrent1);
			if (input__iYawCurrent1 != oldInput__iYawCurrent1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT1, oldInput__iYawCurrent1, input__iYawCurrent1));
			}
		}
		return input__iYawCurrent1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iYawCurrent1() {
		return input__iYawCurrent1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iYawCurrent1(WTCInput newInput__iYawCurrent1) {
		WTCInput oldInput__iYawCurrent1 = input__iYawCurrent1;
		input__iYawCurrent1 = newInput__iYawCurrent1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT1, oldInput__iYawCurrent1, input__iYawCurrent1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iYawCurrent2() {
		if (input__iYawCurrent2 != null && input__iYawCurrent2.eIsProxy()) {
			InternalEObject oldInput__iYawCurrent2 = (InternalEObject)input__iYawCurrent2;
			input__iYawCurrent2 = (WTCInput)eResolveProxy(oldInput__iYawCurrent2);
			if (input__iYawCurrent2 != oldInput__iYawCurrent2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT2, oldInput__iYawCurrent2, input__iYawCurrent2));
			}
		}
		return input__iYawCurrent2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iYawCurrent2() {
		return input__iYawCurrent2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iYawCurrent2(WTCInput newInput__iYawCurrent2) {
		WTCInput oldInput__iYawCurrent2 = input__iYawCurrent2;
		input__iYawCurrent2 = newInput__iYawCurrent2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT2, oldInput__iYawCurrent2, input__iYawCurrent2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iYawCurrent3() {
		if (input__iYawCurrent3 != null && input__iYawCurrent3.eIsProxy()) {
			InternalEObject oldInput__iYawCurrent3 = (InternalEObject)input__iYawCurrent3;
			input__iYawCurrent3 = (WTCInput)eResolveProxy(oldInput__iYawCurrent3);
			if (input__iYawCurrent3 != oldInput__iYawCurrent3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT3, oldInput__iYawCurrent3, input__iYawCurrent3));
			}
		}
		return input__iYawCurrent3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iYawCurrent3() {
		return input__iYawCurrent3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iYawCurrent3(WTCInput newInput__iYawCurrent3) {
		WTCInput oldInput__iYawCurrent3 = input__iYawCurrent3;
		input__iYawCurrent3 = newInput__iYawCurrent3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT3, oldInput__iYawCurrent3, input__iYawCurrent3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iYawCurrent4() {
		if (input__iYawCurrent4 != null && input__iYawCurrent4.eIsProxy()) {
			InternalEObject oldInput__iYawCurrent4 = (InternalEObject)input__iYawCurrent4;
			input__iYawCurrent4 = (WTCInput)eResolveProxy(oldInput__iYawCurrent4);
			if (input__iYawCurrent4 != oldInput__iYawCurrent4) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT4, oldInput__iYawCurrent4, input__iYawCurrent4));
			}
		}
		return input__iYawCurrent4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iYawCurrent4() {
		return input__iYawCurrent4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iYawCurrent4(WTCInput newInput__iYawCurrent4) {
		WTCInput oldInput__iYawCurrent4 = input__iYawCurrent4;
		input__iYawCurrent4 = newInput__iYawCurrent4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT4, oldInput__iYawCurrent4, input__iYawCurrent4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iOverloadAlarmCounter() {
		if (input__iOverloadAlarmCounter != null && input__iOverloadAlarmCounter.eIsProxy()) {
			InternalEObject oldInput__iOverloadAlarmCounter = (InternalEObject)input__iOverloadAlarmCounter;
			input__iOverloadAlarmCounter = (WTCInput)eResolveProxy(oldInput__iOverloadAlarmCounter);
			if (input__iOverloadAlarmCounter != oldInput__iOverloadAlarmCounter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT133__INPUT_IOVERLOAD_ALARM_COUNTER, oldInput__iOverloadAlarmCounter, input__iOverloadAlarmCounter));
			}
		}
		return input__iOverloadAlarmCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iOverloadAlarmCounter() {
		return input__iOverloadAlarmCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iOverloadAlarmCounter(WTCInput newInput__iOverloadAlarmCounter) {
		WTCInput oldInput__iOverloadAlarmCounter = input__iOverloadAlarmCounter;
		input__iOverloadAlarmCounter = newInput__iOverloadAlarmCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT133__INPUT_IOVERLOAD_ALARM_COUNTER, oldInput__iOverloadAlarmCounter, input__iOverloadAlarmCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOverloadAlarmCounter() {
		if (output__oOverloadAlarmCounter != null && output__oOverloadAlarmCounter.eIsProxy()) {
			InternalEObject oldOutput__oOverloadAlarmCounter = (InternalEObject)output__oOverloadAlarmCounter;
			output__oOverloadAlarmCounter = (WTCOutput)eResolveProxy(oldOutput__oOverloadAlarmCounter);
			if (output__oOverloadAlarmCounter != oldOutput__oOverloadAlarmCounter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT133__OUTPUT_OOVERLOAD_ALARM_COUNTER, oldOutput__oOverloadAlarmCounter, output__oOverloadAlarmCounter));
			}
		}
		return output__oOverloadAlarmCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOverloadAlarmCounter() {
		return output__oOverloadAlarmCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOverloadAlarmCounter(WTCOutput newOutput__oOverloadAlarmCounter) {
		WTCOutput oldOutput__oOverloadAlarmCounter = output__oOverloadAlarmCounter;
		output__oOverloadAlarmCounter = newOutput__oOverloadAlarmCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT133__OUTPUT_OOVERLOAD_ALARM_COUNTER, oldOutput__oOverloadAlarmCounter, output__oOverloadAlarmCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pMaximumTorque() {
		if (parameter__pMaximumTorque != null && parameter__pMaximumTorque.eIsProxy()) {
			InternalEObject oldParameter__pMaximumTorque = (InternalEObject)parameter__pMaximumTorque;
			parameter__pMaximumTorque = (WTCParam)eResolveProxy(oldParameter__pMaximumTorque);
			if (parameter__pMaximumTorque != oldParameter__pMaximumTorque) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT133__PARAMETER_PMAXIMUM_TORQUE, oldParameter__pMaximumTorque, parameter__pMaximumTorque));
			}
		}
		return parameter__pMaximumTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pMaximumTorque() {
		return parameter__pMaximumTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pMaximumTorque(WTCParam newParameter__pMaximumTorque) {
		WTCParam oldParameter__pMaximumTorque = parameter__pMaximumTorque;
		parameter__pMaximumTorque = newParameter__pMaximumTorque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT133__PARAMETER_PMAXIMUM_TORQUE, oldParameter__pMaximumTorque, parameter__pMaximumTorque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pMinimumTorque() {
		if (parameter__pMinimumTorque != null && parameter__pMinimumTorque.eIsProxy()) {
			InternalEObject oldParameter__pMinimumTorque = (InternalEObject)parameter__pMinimumTorque;
			parameter__pMinimumTorque = (WTCParam)eResolveProxy(oldParameter__pMinimumTorque);
			if (parameter__pMinimumTorque != oldParameter__pMinimumTorque) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT133__PARAMETER_PMINIMUM_TORQUE, oldParameter__pMinimumTorque, parameter__pMinimumTorque));
			}
		}
		return parameter__pMinimumTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pMinimumTorque() {
		return parameter__pMinimumTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pMinimumTorque(WTCParam newParameter__pMinimumTorque) {
		WTCParam oldParameter__pMinimumTorque = parameter__pMinimumTorque;
		parameter__pMinimumTorque = newParameter__pMinimumTorque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT133__PARAMETER_PMINIMUM_TORQUE, oldParameter__pMinimumTorque, parameter__pMinimumTorque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pTorqueDifferenceLimit() {
		if (parameter__pTorqueDifferenceLimit != null && parameter__pTorqueDifferenceLimit.eIsProxy()) {
			InternalEObject oldParameter__pTorqueDifferenceLimit = (InternalEObject)parameter__pTorqueDifferenceLimit;
			parameter__pTorqueDifferenceLimit = (WTCParam)eResolveProxy(oldParameter__pTorqueDifferenceLimit);
			if (parameter__pTorqueDifferenceLimit != oldParameter__pTorqueDifferenceLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT133__PARAMETER_PTORQUE_DIFFERENCE_LIMIT, oldParameter__pTorqueDifferenceLimit, parameter__pTorqueDifferenceLimit));
			}
		}
		return parameter__pTorqueDifferenceLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pTorqueDifferenceLimit() {
		return parameter__pTorqueDifferenceLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pTorqueDifferenceLimit(WTCParam newParameter__pTorqueDifferenceLimit) {
		WTCParam oldParameter__pTorqueDifferenceLimit = parameter__pTorqueDifferenceLimit;
		parameter__pTorqueDifferenceLimit = newParameter__pTorqueDifferenceLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT133__PARAMETER_PTORQUE_DIFFERENCE_LIMIT, oldParameter__pTorqueDifferenceLimit, parameter__pTorqueDifferenceLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fFault() {
		if (fault__fFault != null && fault__fFault.eIsProxy()) {
			InternalEObject oldFault__fFault = (InternalEObject)fault__fFault;
			fault__fFault = (WTCFault)eResolveProxy(oldFault__fFault);
			if (fault__fFault != oldFault__fFault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT133__FAULT_FFAULT, oldFault__fFault, fault__fFault));
			}
		}
		return fault__fFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fFault() {
		return fault__fFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fFault(WTCFault newFault__fFault) {
		WTCFault oldFault__fFault = fault__fFault;
		fault__fFault = newFault__fFault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT133__FAULT_FFAULT, oldFault__fFault, fault__fFault));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT133__TIMER_TTIMER, oldTimer__tTimer, timer__tTimer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT133__TIMER_TTIMER, oldTimer__tTimer, timer__tTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_STATUS:
				if (resolve) return getInput__iYawStatus();
				return basicGetInput__iYawStatus();
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT1:
				if (resolve) return getInput__iYawCurrent1();
				return basicGetInput__iYawCurrent1();
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT2:
				if (resolve) return getInput__iYawCurrent2();
				return basicGetInput__iYawCurrent2();
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT3:
				if (resolve) return getInput__iYawCurrent3();
				return basicGetInput__iYawCurrent3();
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT4:
				if (resolve) return getInput__iYawCurrent4();
				return basicGetInput__iYawCurrent4();
			case WTSpecPackage.CTRL_UNIT133__INPUT_IOVERLOAD_ALARM_COUNTER:
				if (resolve) return getInput__iOverloadAlarmCounter();
				return basicGetInput__iOverloadAlarmCounter();
			case WTSpecPackage.CTRL_UNIT133__OUTPUT_OOVERLOAD_ALARM_COUNTER:
				if (resolve) return getOutput__oOverloadAlarmCounter();
				return basicGetOutput__oOverloadAlarmCounter();
			case WTSpecPackage.CTRL_UNIT133__PARAMETER_PMAXIMUM_TORQUE:
				if (resolve) return getParameter__pMaximumTorque();
				return basicGetParameter__pMaximumTorque();
			case WTSpecPackage.CTRL_UNIT133__PARAMETER_PMINIMUM_TORQUE:
				if (resolve) return getParameter__pMinimumTorque();
				return basicGetParameter__pMinimumTorque();
			case WTSpecPackage.CTRL_UNIT133__PARAMETER_PTORQUE_DIFFERENCE_LIMIT:
				if (resolve) return getParameter__pTorqueDifferenceLimit();
				return basicGetParameter__pTorqueDifferenceLimit();
			case WTSpecPackage.CTRL_UNIT133__FAULT_FFAULT:
				if (resolve) return getFault__fFault();
				return basicGetFault__fFault();
			case WTSpecPackage.CTRL_UNIT133__TIMER_TTIMER:
				if (resolve) return getTimer__tTimer();
				return basicGetTimer__tTimer();
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
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_STATUS:
				setInput__iYawStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT1:
				setInput__iYawCurrent1((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT2:
				setInput__iYawCurrent2((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT3:
				setInput__iYawCurrent3((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT4:
				setInput__iYawCurrent4((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT133__INPUT_IOVERLOAD_ALARM_COUNTER:
				setInput__iOverloadAlarmCounter((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT133__OUTPUT_OOVERLOAD_ALARM_COUNTER:
				setOutput__oOverloadAlarmCounter((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT133__PARAMETER_PMAXIMUM_TORQUE:
				setParameter__pMaximumTorque((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT133__PARAMETER_PMINIMUM_TORQUE:
				setParameter__pMinimumTorque((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT133__PARAMETER_PTORQUE_DIFFERENCE_LIMIT:
				setParameter__pTorqueDifferenceLimit((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT133__FAULT_FFAULT:
				setFault__fFault((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT133__TIMER_TTIMER:
				setTimer__tTimer((WTCTimer)newValue);
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
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_STATUS:
				setInput__iYawStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT1:
				setInput__iYawCurrent1((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT2:
				setInput__iYawCurrent2((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT3:
				setInput__iYawCurrent3((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT4:
				setInput__iYawCurrent4((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT133__INPUT_IOVERLOAD_ALARM_COUNTER:
				setInput__iOverloadAlarmCounter((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT133__OUTPUT_OOVERLOAD_ALARM_COUNTER:
				setOutput__oOverloadAlarmCounter((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT133__PARAMETER_PMAXIMUM_TORQUE:
				setParameter__pMaximumTorque((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT133__PARAMETER_PMINIMUM_TORQUE:
				setParameter__pMinimumTorque((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT133__PARAMETER_PTORQUE_DIFFERENCE_LIMIT:
				setParameter__pTorqueDifferenceLimit((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT133__FAULT_FFAULT:
				setFault__fFault((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT133__TIMER_TTIMER:
				setTimer__tTimer((WTCTimer)null);
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
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_STATUS:
				return input__iYawStatus != null;
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT1:
				return input__iYawCurrent1 != null;
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT2:
				return input__iYawCurrent2 != null;
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT3:
				return input__iYawCurrent3 != null;
			case WTSpecPackage.CTRL_UNIT133__INPUT_IYAW_CURRENT4:
				return input__iYawCurrent4 != null;
			case WTSpecPackage.CTRL_UNIT133__INPUT_IOVERLOAD_ALARM_COUNTER:
				return input__iOverloadAlarmCounter != null;
			case WTSpecPackage.CTRL_UNIT133__OUTPUT_OOVERLOAD_ALARM_COUNTER:
				return output__oOverloadAlarmCounter != null;
			case WTSpecPackage.CTRL_UNIT133__PARAMETER_PMAXIMUM_TORQUE:
				return parameter__pMaximumTorque != null;
			case WTSpecPackage.CTRL_UNIT133__PARAMETER_PMINIMUM_TORQUE:
				return parameter__pMinimumTorque != null;
			case WTSpecPackage.CTRL_UNIT133__PARAMETER_PTORQUE_DIFFERENCE_LIMIT:
				return parameter__pTorqueDifferenceLimit != null;
			case WTSpecPackage.CTRL_UNIT133__FAULT_FFAULT:
				return fault__fFault != null;
			case WTSpecPackage.CTRL_UNIT133__TIMER_TTIMER:
				return timer__tTimer != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit133Impl
