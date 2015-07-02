/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit23;
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
 * An implementation of the model object '<em><b>Ctrl Unit23</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit23Impl#getInput__iWindSpeed <em>Input iWind Speed</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit23Impl#getInput__iInverterPower <em>Input iInverter Power</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit23Impl#getOutput__oRelationError <em>Output oRelation Error</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit23Impl#getParameter__pWindSpeedLimit <em>Parameter pWind Speed Limit</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit23Impl#getParameter__pInverterPowerLimit <em>Parameter pInverter Power Limit</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit23Impl#getTimer__tWindMinimumTime <em>Timer tWind Minimum Time</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit23Impl#getTimer__tPowerAndWindMinimumTime <em>Timer tPower And Wind Minimum Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit23Impl extends wtcImpl implements CtrlUnit23 {
	/**
	 * The cached value of the '{@link #getInput__iWindSpeed() <em>Input iWind Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iWindSpeed()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iWindSpeed;

	/**
	 * The cached value of the '{@link #getInput__iInverterPower() <em>Input iInverter Power</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInverterPower()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInverterPower;

	/**
	 * The cached value of the '{@link #getOutput__oRelationError() <em>Output oRelation Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oRelationError()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oRelationError;

	/**
	 * The cached value of the '{@link #getParameter__pWindSpeedLimit() <em>Parameter pWind Speed Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pWindSpeedLimit()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pWindSpeedLimit;

	/**
	 * The cached value of the '{@link #getParameter__pInverterPowerLimit() <em>Parameter pInverter Power Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pInverterPowerLimit()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pInverterPowerLimit;

	/**
	 * The cached value of the '{@link #getTimer__tWindMinimumTime() <em>Timer tWind Minimum Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tWindMinimumTime()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tWindMinimumTime;

	/**
	 * The cached value of the '{@link #getTimer__tPowerAndWindMinimumTime() <em>Timer tPower And Wind Minimum Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tPowerAndWindMinimumTime()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tPowerAndWindMinimumTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit23Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iWindSpeed() {
		if (input__iWindSpeed != null && input__iWindSpeed.eIsProxy()) {
			InternalEObject oldInput__iWindSpeed = (InternalEObject)input__iWindSpeed;
			input__iWindSpeed = (WTCInput)eResolveProxy(oldInput__iWindSpeed);
			if (input__iWindSpeed != oldInput__iWindSpeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT23__INPUT_IWIND_SPEED, oldInput__iWindSpeed, input__iWindSpeed));
			}
		}
		return input__iWindSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iWindSpeed() {
		return input__iWindSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iWindSpeed(WTCInput newInput__iWindSpeed) {
		WTCInput oldInput__iWindSpeed = input__iWindSpeed;
		input__iWindSpeed = newInput__iWindSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT23__INPUT_IWIND_SPEED, oldInput__iWindSpeed, input__iWindSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInverterPower() {
		if (input__iInverterPower != null && input__iInverterPower.eIsProxy()) {
			InternalEObject oldInput__iInverterPower = (InternalEObject)input__iInverterPower;
			input__iInverterPower = (WTCInput)eResolveProxy(oldInput__iInverterPower);
			if (input__iInverterPower != oldInput__iInverterPower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT23__INPUT_IINVERTER_POWER, oldInput__iInverterPower, input__iInverterPower));
			}
		}
		return input__iInverterPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInverterPower() {
		return input__iInverterPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInverterPower(WTCInput newInput__iInverterPower) {
		WTCInput oldInput__iInverterPower = input__iInverterPower;
		input__iInverterPower = newInput__iInverterPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT23__INPUT_IINVERTER_POWER, oldInput__iInverterPower, input__iInverterPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oRelationError() {
		if (output__oRelationError != null && output__oRelationError.eIsProxy()) {
			InternalEObject oldOutput__oRelationError = (InternalEObject)output__oRelationError;
			output__oRelationError = (WTCOutput)eResolveProxy(oldOutput__oRelationError);
			if (output__oRelationError != oldOutput__oRelationError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT23__OUTPUT_ORELATION_ERROR, oldOutput__oRelationError, output__oRelationError));
			}
		}
		return output__oRelationError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oRelationError() {
		return output__oRelationError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oRelationError(WTCOutput newOutput__oRelationError) {
		WTCOutput oldOutput__oRelationError = output__oRelationError;
		output__oRelationError = newOutput__oRelationError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT23__OUTPUT_ORELATION_ERROR, oldOutput__oRelationError, output__oRelationError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pWindSpeedLimit() {
		if (parameter__pWindSpeedLimit != null && parameter__pWindSpeedLimit.eIsProxy()) {
			InternalEObject oldParameter__pWindSpeedLimit = (InternalEObject)parameter__pWindSpeedLimit;
			parameter__pWindSpeedLimit = (WTCParam)eResolveProxy(oldParameter__pWindSpeedLimit);
			if (parameter__pWindSpeedLimit != oldParameter__pWindSpeedLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT23__PARAMETER_PWIND_SPEED_LIMIT, oldParameter__pWindSpeedLimit, parameter__pWindSpeedLimit));
			}
		}
		return parameter__pWindSpeedLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pWindSpeedLimit() {
		return parameter__pWindSpeedLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pWindSpeedLimit(WTCParam newParameter__pWindSpeedLimit) {
		WTCParam oldParameter__pWindSpeedLimit = parameter__pWindSpeedLimit;
		parameter__pWindSpeedLimit = newParameter__pWindSpeedLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT23__PARAMETER_PWIND_SPEED_LIMIT, oldParameter__pWindSpeedLimit, parameter__pWindSpeedLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pInverterPowerLimit() {
		if (parameter__pInverterPowerLimit != null && parameter__pInverterPowerLimit.eIsProxy()) {
			InternalEObject oldParameter__pInverterPowerLimit = (InternalEObject)parameter__pInverterPowerLimit;
			parameter__pInverterPowerLimit = (WTCParam)eResolveProxy(oldParameter__pInverterPowerLimit);
			if (parameter__pInverterPowerLimit != oldParameter__pInverterPowerLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT23__PARAMETER_PINVERTER_POWER_LIMIT, oldParameter__pInverterPowerLimit, parameter__pInverterPowerLimit));
			}
		}
		return parameter__pInverterPowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pInverterPowerLimit() {
		return parameter__pInverterPowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pInverterPowerLimit(WTCParam newParameter__pInverterPowerLimit) {
		WTCParam oldParameter__pInverterPowerLimit = parameter__pInverterPowerLimit;
		parameter__pInverterPowerLimit = newParameter__pInverterPowerLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT23__PARAMETER_PINVERTER_POWER_LIMIT, oldParameter__pInverterPowerLimit, parameter__pInverterPowerLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tWindMinimumTime() {
		if (timer__tWindMinimumTime != null && timer__tWindMinimumTime.eIsProxy()) {
			InternalEObject oldTimer__tWindMinimumTime = (InternalEObject)timer__tWindMinimumTime;
			timer__tWindMinimumTime = (WTCTimer)eResolveProxy(oldTimer__tWindMinimumTime);
			if (timer__tWindMinimumTime != oldTimer__tWindMinimumTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT23__TIMER_TWIND_MINIMUM_TIME, oldTimer__tWindMinimumTime, timer__tWindMinimumTime));
			}
		}
		return timer__tWindMinimumTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tWindMinimumTime() {
		return timer__tWindMinimumTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tWindMinimumTime(WTCTimer newTimer__tWindMinimumTime) {
		WTCTimer oldTimer__tWindMinimumTime = timer__tWindMinimumTime;
		timer__tWindMinimumTime = newTimer__tWindMinimumTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT23__TIMER_TWIND_MINIMUM_TIME, oldTimer__tWindMinimumTime, timer__tWindMinimumTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tPowerAndWindMinimumTime() {
		if (timer__tPowerAndWindMinimumTime != null && timer__tPowerAndWindMinimumTime.eIsProxy()) {
			InternalEObject oldTimer__tPowerAndWindMinimumTime = (InternalEObject)timer__tPowerAndWindMinimumTime;
			timer__tPowerAndWindMinimumTime = (WTCTimer)eResolveProxy(oldTimer__tPowerAndWindMinimumTime);
			if (timer__tPowerAndWindMinimumTime != oldTimer__tPowerAndWindMinimumTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT23__TIMER_TPOWER_AND_WIND_MINIMUM_TIME, oldTimer__tPowerAndWindMinimumTime, timer__tPowerAndWindMinimumTime));
			}
		}
		return timer__tPowerAndWindMinimumTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tPowerAndWindMinimumTime() {
		return timer__tPowerAndWindMinimumTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tPowerAndWindMinimumTime(WTCTimer newTimer__tPowerAndWindMinimumTime) {
		WTCTimer oldTimer__tPowerAndWindMinimumTime = timer__tPowerAndWindMinimumTime;
		timer__tPowerAndWindMinimumTime = newTimer__tPowerAndWindMinimumTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT23__TIMER_TPOWER_AND_WIND_MINIMUM_TIME, oldTimer__tPowerAndWindMinimumTime, timer__tPowerAndWindMinimumTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT23__INPUT_IWIND_SPEED:
				if (resolve) return getInput__iWindSpeed();
				return basicGetInput__iWindSpeed();
			case WTSpecPackage.CTRL_UNIT23__INPUT_IINVERTER_POWER:
				if (resolve) return getInput__iInverterPower();
				return basicGetInput__iInverterPower();
			case WTSpecPackage.CTRL_UNIT23__OUTPUT_ORELATION_ERROR:
				if (resolve) return getOutput__oRelationError();
				return basicGetOutput__oRelationError();
			case WTSpecPackage.CTRL_UNIT23__PARAMETER_PWIND_SPEED_LIMIT:
				if (resolve) return getParameter__pWindSpeedLimit();
				return basicGetParameter__pWindSpeedLimit();
			case WTSpecPackage.CTRL_UNIT23__PARAMETER_PINVERTER_POWER_LIMIT:
				if (resolve) return getParameter__pInverterPowerLimit();
				return basicGetParameter__pInverterPowerLimit();
			case WTSpecPackage.CTRL_UNIT23__TIMER_TWIND_MINIMUM_TIME:
				if (resolve) return getTimer__tWindMinimumTime();
				return basicGetTimer__tWindMinimumTime();
			case WTSpecPackage.CTRL_UNIT23__TIMER_TPOWER_AND_WIND_MINIMUM_TIME:
				if (resolve) return getTimer__tPowerAndWindMinimumTime();
				return basicGetTimer__tPowerAndWindMinimumTime();
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
			case WTSpecPackage.CTRL_UNIT23__INPUT_IWIND_SPEED:
				setInput__iWindSpeed((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT23__INPUT_IINVERTER_POWER:
				setInput__iInverterPower((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT23__OUTPUT_ORELATION_ERROR:
				setOutput__oRelationError((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT23__PARAMETER_PWIND_SPEED_LIMIT:
				setParameter__pWindSpeedLimit((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT23__PARAMETER_PINVERTER_POWER_LIMIT:
				setParameter__pInverterPowerLimit((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT23__TIMER_TWIND_MINIMUM_TIME:
				setTimer__tWindMinimumTime((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT23__TIMER_TPOWER_AND_WIND_MINIMUM_TIME:
				setTimer__tPowerAndWindMinimumTime((WTCTimer)newValue);
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
			case WTSpecPackage.CTRL_UNIT23__INPUT_IWIND_SPEED:
				setInput__iWindSpeed((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT23__INPUT_IINVERTER_POWER:
				setInput__iInverterPower((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT23__OUTPUT_ORELATION_ERROR:
				setOutput__oRelationError((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT23__PARAMETER_PWIND_SPEED_LIMIT:
				setParameter__pWindSpeedLimit((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT23__PARAMETER_PINVERTER_POWER_LIMIT:
				setParameter__pInverterPowerLimit((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT23__TIMER_TWIND_MINIMUM_TIME:
				setTimer__tWindMinimumTime((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT23__TIMER_TPOWER_AND_WIND_MINIMUM_TIME:
				setTimer__tPowerAndWindMinimumTime((WTCTimer)null);
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
			case WTSpecPackage.CTRL_UNIT23__INPUT_IWIND_SPEED:
				return input__iWindSpeed != null;
			case WTSpecPackage.CTRL_UNIT23__INPUT_IINVERTER_POWER:
				return input__iInverterPower != null;
			case WTSpecPackage.CTRL_UNIT23__OUTPUT_ORELATION_ERROR:
				return output__oRelationError != null;
			case WTSpecPackage.CTRL_UNIT23__PARAMETER_PWIND_SPEED_LIMIT:
				return parameter__pWindSpeedLimit != null;
			case WTSpecPackage.CTRL_UNIT23__PARAMETER_PINVERTER_POWER_LIMIT:
				return parameter__pInverterPowerLimit != null;
			case WTSpecPackage.CTRL_UNIT23__TIMER_TWIND_MINIMUM_TIME:
				return timer__tWindMinimumTime != null;
			case WTSpecPackage.CTRL_UNIT23__TIMER_TPOWER_AND_WIND_MINIMUM_TIME:
				return timer__tPowerAndWindMinimumTime != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit23Impl
