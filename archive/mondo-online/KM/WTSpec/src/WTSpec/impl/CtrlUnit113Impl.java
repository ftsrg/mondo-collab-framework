/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit113;
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
 * An implementation of the model object '<em><b>Ctrl Unit113</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit113Impl#getInput__iWindSpeed <em>Input iWind Speed</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit113Impl#getInput__iWindSpeedAverage <em>Input iWind Speed Average</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit113Impl#getOutput__oExcessiveWindAcceleration <em>Output oExcessive Wind Acceleration</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit113Impl#getParameter__pConsideredTime <em>Parameter pConsidered Time</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit113Impl#getParameter__pWindAccelerationLimit <em>Parameter pWind Acceleration Limit</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit113Impl#getParameter__pHiWindLimitReset <em>Parameter pHi Wind Limit Reset</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit113Impl#getParameter__pMaxAbsoluteWindSpeed <em>Parameter pMax Absolute Wind Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit113Impl extends wtcImpl implements CtrlUnit113 {
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
	 * The cached value of the '{@link #getInput__iWindSpeedAverage() <em>Input iWind Speed Average</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iWindSpeedAverage()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iWindSpeedAverage;

	/**
	 * The cached value of the '{@link #getOutput__oExcessiveWindAcceleration() <em>Output oExcessive Wind Acceleration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oExcessiveWindAcceleration()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oExcessiveWindAcceleration;

	/**
	 * The cached value of the '{@link #getParameter__pConsideredTime() <em>Parameter pConsidered Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pConsideredTime()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pConsideredTime;

	/**
	 * The cached value of the '{@link #getParameter__pWindAccelerationLimit() <em>Parameter pWind Acceleration Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pWindAccelerationLimit()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pWindAccelerationLimit;

	/**
	 * The cached value of the '{@link #getParameter__pHiWindLimitReset() <em>Parameter pHi Wind Limit Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pHiWindLimitReset()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pHiWindLimitReset;

	/**
	 * The cached value of the '{@link #getParameter__pMaxAbsoluteWindSpeed() <em>Parameter pMax Absolute Wind Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pMaxAbsoluteWindSpeed()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pMaxAbsoluteWindSpeed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit113Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit113();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT113__INPUT_IWIND_SPEED, oldInput__iWindSpeed, input__iWindSpeed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT113__INPUT_IWIND_SPEED, oldInput__iWindSpeed, input__iWindSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iWindSpeedAverage() {
		if (input__iWindSpeedAverage != null && input__iWindSpeedAverage.eIsProxy()) {
			InternalEObject oldInput__iWindSpeedAverage = (InternalEObject)input__iWindSpeedAverage;
			input__iWindSpeedAverage = (WTCInput)eResolveProxy(oldInput__iWindSpeedAverage);
			if (input__iWindSpeedAverage != oldInput__iWindSpeedAverage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT113__INPUT_IWIND_SPEED_AVERAGE, oldInput__iWindSpeedAverage, input__iWindSpeedAverage));
			}
		}
		return input__iWindSpeedAverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iWindSpeedAverage() {
		return input__iWindSpeedAverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iWindSpeedAverage(WTCInput newInput__iWindSpeedAverage) {
		WTCInput oldInput__iWindSpeedAverage = input__iWindSpeedAverage;
		input__iWindSpeedAverage = newInput__iWindSpeedAverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT113__INPUT_IWIND_SPEED_AVERAGE, oldInput__iWindSpeedAverage, input__iWindSpeedAverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oExcessiveWindAcceleration() {
		if (output__oExcessiveWindAcceleration != null && output__oExcessiveWindAcceleration.eIsProxy()) {
			InternalEObject oldOutput__oExcessiveWindAcceleration = (InternalEObject)output__oExcessiveWindAcceleration;
			output__oExcessiveWindAcceleration = (WTCOutput)eResolveProxy(oldOutput__oExcessiveWindAcceleration);
			if (output__oExcessiveWindAcceleration != oldOutput__oExcessiveWindAcceleration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT113__OUTPUT_OEXCESSIVE_WIND_ACCELERATION, oldOutput__oExcessiveWindAcceleration, output__oExcessiveWindAcceleration));
			}
		}
		return output__oExcessiveWindAcceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oExcessiveWindAcceleration() {
		return output__oExcessiveWindAcceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oExcessiveWindAcceleration(WTCOutput newOutput__oExcessiveWindAcceleration) {
		WTCOutput oldOutput__oExcessiveWindAcceleration = output__oExcessiveWindAcceleration;
		output__oExcessiveWindAcceleration = newOutput__oExcessiveWindAcceleration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT113__OUTPUT_OEXCESSIVE_WIND_ACCELERATION, oldOutput__oExcessiveWindAcceleration, output__oExcessiveWindAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pConsideredTime() {
		if (parameter__pConsideredTime != null && parameter__pConsideredTime.eIsProxy()) {
			InternalEObject oldParameter__pConsideredTime = (InternalEObject)parameter__pConsideredTime;
			parameter__pConsideredTime = (WTCParam)eResolveProxy(oldParameter__pConsideredTime);
			if (parameter__pConsideredTime != oldParameter__pConsideredTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT113__PARAMETER_PCONSIDERED_TIME, oldParameter__pConsideredTime, parameter__pConsideredTime));
			}
		}
		return parameter__pConsideredTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pConsideredTime() {
		return parameter__pConsideredTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pConsideredTime(WTCParam newParameter__pConsideredTime) {
		WTCParam oldParameter__pConsideredTime = parameter__pConsideredTime;
		parameter__pConsideredTime = newParameter__pConsideredTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT113__PARAMETER_PCONSIDERED_TIME, oldParameter__pConsideredTime, parameter__pConsideredTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pWindAccelerationLimit() {
		if (parameter__pWindAccelerationLimit != null && parameter__pWindAccelerationLimit.eIsProxy()) {
			InternalEObject oldParameter__pWindAccelerationLimit = (InternalEObject)parameter__pWindAccelerationLimit;
			parameter__pWindAccelerationLimit = (WTCParam)eResolveProxy(oldParameter__pWindAccelerationLimit);
			if (parameter__pWindAccelerationLimit != oldParameter__pWindAccelerationLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT113__PARAMETER_PWIND_ACCELERATION_LIMIT, oldParameter__pWindAccelerationLimit, parameter__pWindAccelerationLimit));
			}
		}
		return parameter__pWindAccelerationLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pWindAccelerationLimit() {
		return parameter__pWindAccelerationLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pWindAccelerationLimit(WTCParam newParameter__pWindAccelerationLimit) {
		WTCParam oldParameter__pWindAccelerationLimit = parameter__pWindAccelerationLimit;
		parameter__pWindAccelerationLimit = newParameter__pWindAccelerationLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT113__PARAMETER_PWIND_ACCELERATION_LIMIT, oldParameter__pWindAccelerationLimit, parameter__pWindAccelerationLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pHiWindLimitReset() {
		if (parameter__pHiWindLimitReset != null && parameter__pHiWindLimitReset.eIsProxy()) {
			InternalEObject oldParameter__pHiWindLimitReset = (InternalEObject)parameter__pHiWindLimitReset;
			parameter__pHiWindLimitReset = (WTCParam)eResolveProxy(oldParameter__pHiWindLimitReset);
			if (parameter__pHiWindLimitReset != oldParameter__pHiWindLimitReset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT113__PARAMETER_PHI_WIND_LIMIT_RESET, oldParameter__pHiWindLimitReset, parameter__pHiWindLimitReset));
			}
		}
		return parameter__pHiWindLimitReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pHiWindLimitReset() {
		return parameter__pHiWindLimitReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pHiWindLimitReset(WTCParam newParameter__pHiWindLimitReset) {
		WTCParam oldParameter__pHiWindLimitReset = parameter__pHiWindLimitReset;
		parameter__pHiWindLimitReset = newParameter__pHiWindLimitReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT113__PARAMETER_PHI_WIND_LIMIT_RESET, oldParameter__pHiWindLimitReset, parameter__pHiWindLimitReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pMaxAbsoluteWindSpeed() {
		if (parameter__pMaxAbsoluteWindSpeed != null && parameter__pMaxAbsoluteWindSpeed.eIsProxy()) {
			InternalEObject oldParameter__pMaxAbsoluteWindSpeed = (InternalEObject)parameter__pMaxAbsoluteWindSpeed;
			parameter__pMaxAbsoluteWindSpeed = (WTCParam)eResolveProxy(oldParameter__pMaxAbsoluteWindSpeed);
			if (parameter__pMaxAbsoluteWindSpeed != oldParameter__pMaxAbsoluteWindSpeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT113__PARAMETER_PMAX_ABSOLUTE_WIND_SPEED, oldParameter__pMaxAbsoluteWindSpeed, parameter__pMaxAbsoluteWindSpeed));
			}
		}
		return parameter__pMaxAbsoluteWindSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pMaxAbsoluteWindSpeed() {
		return parameter__pMaxAbsoluteWindSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pMaxAbsoluteWindSpeed(WTCParam newParameter__pMaxAbsoluteWindSpeed) {
		WTCParam oldParameter__pMaxAbsoluteWindSpeed = parameter__pMaxAbsoluteWindSpeed;
		parameter__pMaxAbsoluteWindSpeed = newParameter__pMaxAbsoluteWindSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT113__PARAMETER_PMAX_ABSOLUTE_WIND_SPEED, oldParameter__pMaxAbsoluteWindSpeed, parameter__pMaxAbsoluteWindSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT113__INPUT_IWIND_SPEED:
				if (resolve) return getInput__iWindSpeed();
				return basicGetInput__iWindSpeed();
			case WTSpecPackage.CTRL_UNIT113__INPUT_IWIND_SPEED_AVERAGE:
				if (resolve) return getInput__iWindSpeedAverage();
				return basicGetInput__iWindSpeedAverage();
			case WTSpecPackage.CTRL_UNIT113__OUTPUT_OEXCESSIVE_WIND_ACCELERATION:
				if (resolve) return getOutput__oExcessiveWindAcceleration();
				return basicGetOutput__oExcessiveWindAcceleration();
			case WTSpecPackage.CTRL_UNIT113__PARAMETER_PCONSIDERED_TIME:
				if (resolve) return getParameter__pConsideredTime();
				return basicGetParameter__pConsideredTime();
			case WTSpecPackage.CTRL_UNIT113__PARAMETER_PWIND_ACCELERATION_LIMIT:
				if (resolve) return getParameter__pWindAccelerationLimit();
				return basicGetParameter__pWindAccelerationLimit();
			case WTSpecPackage.CTRL_UNIT113__PARAMETER_PHI_WIND_LIMIT_RESET:
				if (resolve) return getParameter__pHiWindLimitReset();
				return basicGetParameter__pHiWindLimitReset();
			case WTSpecPackage.CTRL_UNIT113__PARAMETER_PMAX_ABSOLUTE_WIND_SPEED:
				if (resolve) return getParameter__pMaxAbsoluteWindSpeed();
				return basicGetParameter__pMaxAbsoluteWindSpeed();
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
			case WTSpecPackage.CTRL_UNIT113__INPUT_IWIND_SPEED:
				setInput__iWindSpeed((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT113__INPUT_IWIND_SPEED_AVERAGE:
				setInput__iWindSpeedAverage((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT113__OUTPUT_OEXCESSIVE_WIND_ACCELERATION:
				setOutput__oExcessiveWindAcceleration((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT113__PARAMETER_PCONSIDERED_TIME:
				setParameter__pConsideredTime((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT113__PARAMETER_PWIND_ACCELERATION_LIMIT:
				setParameter__pWindAccelerationLimit((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT113__PARAMETER_PHI_WIND_LIMIT_RESET:
				setParameter__pHiWindLimitReset((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT113__PARAMETER_PMAX_ABSOLUTE_WIND_SPEED:
				setParameter__pMaxAbsoluteWindSpeed((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT113__INPUT_IWIND_SPEED:
				setInput__iWindSpeed((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT113__INPUT_IWIND_SPEED_AVERAGE:
				setInput__iWindSpeedAverage((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT113__OUTPUT_OEXCESSIVE_WIND_ACCELERATION:
				setOutput__oExcessiveWindAcceleration((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT113__PARAMETER_PCONSIDERED_TIME:
				setParameter__pConsideredTime((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT113__PARAMETER_PWIND_ACCELERATION_LIMIT:
				setParameter__pWindAccelerationLimit((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT113__PARAMETER_PHI_WIND_LIMIT_RESET:
				setParameter__pHiWindLimitReset((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT113__PARAMETER_PMAX_ABSOLUTE_WIND_SPEED:
				setParameter__pMaxAbsoluteWindSpeed((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT113__INPUT_IWIND_SPEED:
				return input__iWindSpeed != null;
			case WTSpecPackage.CTRL_UNIT113__INPUT_IWIND_SPEED_AVERAGE:
				return input__iWindSpeedAverage != null;
			case WTSpecPackage.CTRL_UNIT113__OUTPUT_OEXCESSIVE_WIND_ACCELERATION:
				return output__oExcessiveWindAcceleration != null;
			case WTSpecPackage.CTRL_UNIT113__PARAMETER_PCONSIDERED_TIME:
				return parameter__pConsideredTime != null;
			case WTSpecPackage.CTRL_UNIT113__PARAMETER_PWIND_ACCELERATION_LIMIT:
				return parameter__pWindAccelerationLimit != null;
			case WTSpecPackage.CTRL_UNIT113__PARAMETER_PHI_WIND_LIMIT_RESET:
				return parameter__pHiWindLimitReset != null;
			case WTSpecPackage.CTRL_UNIT113__PARAMETER_PMAX_ABSOLUTE_WIND_SPEED:
				return parameter__pMaxAbsoluteWindSpeed != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit113Impl
