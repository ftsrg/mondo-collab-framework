/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit127;
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
 * An implementation of the model object '<em><b>Ctrl Unit127</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit127Impl#getInput__iLowWindActive <em>Input iLow Wind Active</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit127Impl#getInput__iWindDirectionRelAvg <em>Input iWind Direction Rel Avg</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit127Impl#getInput__iTwistAngle <em>Input iTwist Angle</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit127Impl#getInput__iInhibitAutoYaw <em>Input iInhibit Auto Yaw</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit127Impl#getOutput__oRelWindPreCommand <em>Output oRel Wind Pre Command</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit127Impl#getOutput__oFlagIntoWind <em>Output oFlag Into Wind</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit127Impl#getOutput__oExcessiveYawingTime <em>Output oExcessive Yawing Time</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit127Impl#getParameter__pWindDirectionTolerance <em>Parameter pWind Direction Tolerance</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit127Impl#getParameter__pYawFilterTime <em>Parameter pYaw Filter Time</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit127Impl#getParameter__pYawStopAngleLimit <em>Parameter pYaw Stop Angle Limit</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit127Impl#getTimer__tMaximumTimeYawing <em>Timer tMaximum Time Yawing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit127Impl extends wtcImpl implements CtrlUnit127 {
	/**
	 * The cached value of the '{@link #getInput__iLowWindActive() <em>Input iLow Wind Active</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iLowWindActive()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iLowWindActive;

	/**
	 * The cached value of the '{@link #getInput__iWindDirectionRelAvg() <em>Input iWind Direction Rel Avg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iWindDirectionRelAvg()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iWindDirectionRelAvg;

	/**
	 * The cached value of the '{@link #getInput__iTwistAngle() <em>Input iTwist Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iTwistAngle()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iTwistAngle;

	/**
	 * The cached value of the '{@link #getInput__iInhibitAutoYaw() <em>Input iInhibit Auto Yaw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInhibitAutoYaw()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInhibitAutoYaw;

	/**
	 * The cached value of the '{@link #getOutput__oRelWindPreCommand() <em>Output oRel Wind Pre Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oRelWindPreCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oRelWindPreCommand;

	/**
	 * The cached value of the '{@link #getOutput__oFlagIntoWind() <em>Output oFlag Into Wind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oFlagIntoWind()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oFlagIntoWind;

	/**
	 * The cached value of the '{@link #getOutput__oExcessiveYawingTime() <em>Output oExcessive Yawing Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oExcessiveYawingTime()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oExcessiveYawingTime;

	/**
	 * The cached value of the '{@link #getParameter__pWindDirectionTolerance() <em>Parameter pWind Direction Tolerance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pWindDirectionTolerance()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pWindDirectionTolerance;

	/**
	 * The cached value of the '{@link #getParameter__pYawFilterTime() <em>Parameter pYaw Filter Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pYawFilterTime()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pYawFilterTime;

	/**
	 * The cached value of the '{@link #getParameter__pYawStopAngleLimit() <em>Parameter pYaw Stop Angle Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pYawStopAngleLimit()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pYawStopAngleLimit;

	/**
	 * The cached value of the '{@link #getTimer__tMaximumTimeYawing() <em>Timer tMaximum Time Yawing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tMaximumTimeYawing()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tMaximumTimeYawing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit127Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT127;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iLowWindActive() {
		if (input__iLowWindActive != null && input__iLowWindActive.eIsProxy()) {
			InternalEObject oldInput__iLowWindActive = (InternalEObject)input__iLowWindActive;
			input__iLowWindActive = (WTCInput)eResolveProxy(oldInput__iLowWindActive);
			if (input__iLowWindActive != oldInput__iLowWindActive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT127__INPUT_ILOW_WIND_ACTIVE, oldInput__iLowWindActive, input__iLowWindActive));
			}
		}
		return input__iLowWindActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iLowWindActive() {
		return input__iLowWindActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iLowWindActive(WTCInput newInput__iLowWindActive) {
		WTCInput oldInput__iLowWindActive = input__iLowWindActive;
		input__iLowWindActive = newInput__iLowWindActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT127__INPUT_ILOW_WIND_ACTIVE, oldInput__iLowWindActive, input__iLowWindActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iWindDirectionRelAvg() {
		if (input__iWindDirectionRelAvg != null && input__iWindDirectionRelAvg.eIsProxy()) {
			InternalEObject oldInput__iWindDirectionRelAvg = (InternalEObject)input__iWindDirectionRelAvg;
			input__iWindDirectionRelAvg = (WTCInput)eResolveProxy(oldInput__iWindDirectionRelAvg);
			if (input__iWindDirectionRelAvg != oldInput__iWindDirectionRelAvg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT127__INPUT_IWIND_DIRECTION_REL_AVG, oldInput__iWindDirectionRelAvg, input__iWindDirectionRelAvg));
			}
		}
		return input__iWindDirectionRelAvg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iWindDirectionRelAvg() {
		return input__iWindDirectionRelAvg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iWindDirectionRelAvg(WTCInput newInput__iWindDirectionRelAvg) {
		WTCInput oldInput__iWindDirectionRelAvg = input__iWindDirectionRelAvg;
		input__iWindDirectionRelAvg = newInput__iWindDirectionRelAvg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT127__INPUT_IWIND_DIRECTION_REL_AVG, oldInput__iWindDirectionRelAvg, input__iWindDirectionRelAvg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iTwistAngle() {
		if (input__iTwistAngle != null && input__iTwistAngle.eIsProxy()) {
			InternalEObject oldInput__iTwistAngle = (InternalEObject)input__iTwistAngle;
			input__iTwistAngle = (WTCInput)eResolveProxy(oldInput__iTwistAngle);
			if (input__iTwistAngle != oldInput__iTwistAngle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT127__INPUT_ITWIST_ANGLE, oldInput__iTwistAngle, input__iTwistAngle));
			}
		}
		return input__iTwistAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iTwistAngle() {
		return input__iTwistAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iTwistAngle(WTCInput newInput__iTwistAngle) {
		WTCInput oldInput__iTwistAngle = input__iTwistAngle;
		input__iTwistAngle = newInput__iTwistAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT127__INPUT_ITWIST_ANGLE, oldInput__iTwistAngle, input__iTwistAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInhibitAutoYaw() {
		if (input__iInhibitAutoYaw != null && input__iInhibitAutoYaw.eIsProxy()) {
			InternalEObject oldInput__iInhibitAutoYaw = (InternalEObject)input__iInhibitAutoYaw;
			input__iInhibitAutoYaw = (WTCInput)eResolveProxy(oldInput__iInhibitAutoYaw);
			if (input__iInhibitAutoYaw != oldInput__iInhibitAutoYaw) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT127__INPUT_IINHIBIT_AUTO_YAW, oldInput__iInhibitAutoYaw, input__iInhibitAutoYaw));
			}
		}
		return input__iInhibitAutoYaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInhibitAutoYaw() {
		return input__iInhibitAutoYaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInhibitAutoYaw(WTCInput newInput__iInhibitAutoYaw) {
		WTCInput oldInput__iInhibitAutoYaw = input__iInhibitAutoYaw;
		input__iInhibitAutoYaw = newInput__iInhibitAutoYaw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT127__INPUT_IINHIBIT_AUTO_YAW, oldInput__iInhibitAutoYaw, input__iInhibitAutoYaw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oRelWindPreCommand() {
		if (output__oRelWindPreCommand != null && output__oRelWindPreCommand.eIsProxy()) {
			InternalEObject oldOutput__oRelWindPreCommand = (InternalEObject)output__oRelWindPreCommand;
			output__oRelWindPreCommand = (WTCOutput)eResolveProxy(oldOutput__oRelWindPreCommand);
			if (output__oRelWindPreCommand != oldOutput__oRelWindPreCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT127__OUTPUT_OREL_WIND_PRE_COMMAND, oldOutput__oRelWindPreCommand, output__oRelWindPreCommand));
			}
		}
		return output__oRelWindPreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oRelWindPreCommand() {
		return output__oRelWindPreCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oRelWindPreCommand(WTCOutput newOutput__oRelWindPreCommand) {
		WTCOutput oldOutput__oRelWindPreCommand = output__oRelWindPreCommand;
		output__oRelWindPreCommand = newOutput__oRelWindPreCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT127__OUTPUT_OREL_WIND_PRE_COMMAND, oldOutput__oRelWindPreCommand, output__oRelWindPreCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oFlagIntoWind() {
		if (output__oFlagIntoWind != null && output__oFlagIntoWind.eIsProxy()) {
			InternalEObject oldOutput__oFlagIntoWind = (InternalEObject)output__oFlagIntoWind;
			output__oFlagIntoWind = (WTCOutput)eResolveProxy(oldOutput__oFlagIntoWind);
			if (output__oFlagIntoWind != oldOutput__oFlagIntoWind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT127__OUTPUT_OFLAG_INTO_WIND, oldOutput__oFlagIntoWind, output__oFlagIntoWind));
			}
		}
		return output__oFlagIntoWind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oFlagIntoWind() {
		return output__oFlagIntoWind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oFlagIntoWind(WTCOutput newOutput__oFlagIntoWind) {
		WTCOutput oldOutput__oFlagIntoWind = output__oFlagIntoWind;
		output__oFlagIntoWind = newOutput__oFlagIntoWind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT127__OUTPUT_OFLAG_INTO_WIND, oldOutput__oFlagIntoWind, output__oFlagIntoWind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oExcessiveYawingTime() {
		if (output__oExcessiveYawingTime != null && output__oExcessiveYawingTime.eIsProxy()) {
			InternalEObject oldOutput__oExcessiveYawingTime = (InternalEObject)output__oExcessiveYawingTime;
			output__oExcessiveYawingTime = (WTCOutput)eResolveProxy(oldOutput__oExcessiveYawingTime);
			if (output__oExcessiveYawingTime != oldOutput__oExcessiveYawingTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT127__OUTPUT_OEXCESSIVE_YAWING_TIME, oldOutput__oExcessiveYawingTime, output__oExcessiveYawingTime));
			}
		}
		return output__oExcessiveYawingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oExcessiveYawingTime() {
		return output__oExcessiveYawingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oExcessiveYawingTime(WTCOutput newOutput__oExcessiveYawingTime) {
		WTCOutput oldOutput__oExcessiveYawingTime = output__oExcessiveYawingTime;
		output__oExcessiveYawingTime = newOutput__oExcessiveYawingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT127__OUTPUT_OEXCESSIVE_YAWING_TIME, oldOutput__oExcessiveYawingTime, output__oExcessiveYawingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pWindDirectionTolerance() {
		if (parameter__pWindDirectionTolerance != null && parameter__pWindDirectionTolerance.eIsProxy()) {
			InternalEObject oldParameter__pWindDirectionTolerance = (InternalEObject)parameter__pWindDirectionTolerance;
			parameter__pWindDirectionTolerance = (WTCParam)eResolveProxy(oldParameter__pWindDirectionTolerance);
			if (parameter__pWindDirectionTolerance != oldParameter__pWindDirectionTolerance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT127__PARAMETER_PWIND_DIRECTION_TOLERANCE, oldParameter__pWindDirectionTolerance, parameter__pWindDirectionTolerance));
			}
		}
		return parameter__pWindDirectionTolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pWindDirectionTolerance() {
		return parameter__pWindDirectionTolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pWindDirectionTolerance(WTCParam newParameter__pWindDirectionTolerance) {
		WTCParam oldParameter__pWindDirectionTolerance = parameter__pWindDirectionTolerance;
		parameter__pWindDirectionTolerance = newParameter__pWindDirectionTolerance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT127__PARAMETER_PWIND_DIRECTION_TOLERANCE, oldParameter__pWindDirectionTolerance, parameter__pWindDirectionTolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pYawFilterTime() {
		if (parameter__pYawFilterTime != null && parameter__pYawFilterTime.eIsProxy()) {
			InternalEObject oldParameter__pYawFilterTime = (InternalEObject)parameter__pYawFilterTime;
			parameter__pYawFilterTime = (WTCParam)eResolveProxy(oldParameter__pYawFilterTime);
			if (parameter__pYawFilterTime != oldParameter__pYawFilterTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT127__PARAMETER_PYAW_FILTER_TIME, oldParameter__pYawFilterTime, parameter__pYawFilterTime));
			}
		}
		return parameter__pYawFilterTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pYawFilterTime() {
		return parameter__pYawFilterTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pYawFilterTime(WTCParam newParameter__pYawFilterTime) {
		WTCParam oldParameter__pYawFilterTime = parameter__pYawFilterTime;
		parameter__pYawFilterTime = newParameter__pYawFilterTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT127__PARAMETER_PYAW_FILTER_TIME, oldParameter__pYawFilterTime, parameter__pYawFilterTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pYawStopAngleLimit() {
		if (parameter__pYawStopAngleLimit != null && parameter__pYawStopAngleLimit.eIsProxy()) {
			InternalEObject oldParameter__pYawStopAngleLimit = (InternalEObject)parameter__pYawStopAngleLimit;
			parameter__pYawStopAngleLimit = (WTCParam)eResolveProxy(oldParameter__pYawStopAngleLimit);
			if (parameter__pYawStopAngleLimit != oldParameter__pYawStopAngleLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT127__PARAMETER_PYAW_STOP_ANGLE_LIMIT, oldParameter__pYawStopAngleLimit, parameter__pYawStopAngleLimit));
			}
		}
		return parameter__pYawStopAngleLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pYawStopAngleLimit() {
		return parameter__pYawStopAngleLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pYawStopAngleLimit(WTCParam newParameter__pYawStopAngleLimit) {
		WTCParam oldParameter__pYawStopAngleLimit = parameter__pYawStopAngleLimit;
		parameter__pYawStopAngleLimit = newParameter__pYawStopAngleLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT127__PARAMETER_PYAW_STOP_ANGLE_LIMIT, oldParameter__pYawStopAngleLimit, parameter__pYawStopAngleLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tMaximumTimeYawing() {
		if (timer__tMaximumTimeYawing != null && timer__tMaximumTimeYawing.eIsProxy()) {
			InternalEObject oldTimer__tMaximumTimeYawing = (InternalEObject)timer__tMaximumTimeYawing;
			timer__tMaximumTimeYawing = (WTCTimer)eResolveProxy(oldTimer__tMaximumTimeYawing);
			if (timer__tMaximumTimeYawing != oldTimer__tMaximumTimeYawing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT127__TIMER_TMAXIMUM_TIME_YAWING, oldTimer__tMaximumTimeYawing, timer__tMaximumTimeYawing));
			}
		}
		return timer__tMaximumTimeYawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tMaximumTimeYawing() {
		return timer__tMaximumTimeYawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tMaximumTimeYawing(WTCTimer newTimer__tMaximumTimeYawing) {
		WTCTimer oldTimer__tMaximumTimeYawing = timer__tMaximumTimeYawing;
		timer__tMaximumTimeYawing = newTimer__tMaximumTimeYawing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT127__TIMER_TMAXIMUM_TIME_YAWING, oldTimer__tMaximumTimeYawing, timer__tMaximumTimeYawing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT127__INPUT_ILOW_WIND_ACTIVE:
				if (resolve) return getInput__iLowWindActive();
				return basicGetInput__iLowWindActive();
			case WTSpecPackage.CTRL_UNIT127__INPUT_IWIND_DIRECTION_REL_AVG:
				if (resolve) return getInput__iWindDirectionRelAvg();
				return basicGetInput__iWindDirectionRelAvg();
			case WTSpecPackage.CTRL_UNIT127__INPUT_ITWIST_ANGLE:
				if (resolve) return getInput__iTwistAngle();
				return basicGetInput__iTwistAngle();
			case WTSpecPackage.CTRL_UNIT127__INPUT_IINHIBIT_AUTO_YAW:
				if (resolve) return getInput__iInhibitAutoYaw();
				return basicGetInput__iInhibitAutoYaw();
			case WTSpecPackage.CTRL_UNIT127__OUTPUT_OREL_WIND_PRE_COMMAND:
				if (resolve) return getOutput__oRelWindPreCommand();
				return basicGetOutput__oRelWindPreCommand();
			case WTSpecPackage.CTRL_UNIT127__OUTPUT_OFLAG_INTO_WIND:
				if (resolve) return getOutput__oFlagIntoWind();
				return basicGetOutput__oFlagIntoWind();
			case WTSpecPackage.CTRL_UNIT127__OUTPUT_OEXCESSIVE_YAWING_TIME:
				if (resolve) return getOutput__oExcessiveYawingTime();
				return basicGetOutput__oExcessiveYawingTime();
			case WTSpecPackage.CTRL_UNIT127__PARAMETER_PWIND_DIRECTION_TOLERANCE:
				if (resolve) return getParameter__pWindDirectionTolerance();
				return basicGetParameter__pWindDirectionTolerance();
			case WTSpecPackage.CTRL_UNIT127__PARAMETER_PYAW_FILTER_TIME:
				if (resolve) return getParameter__pYawFilterTime();
				return basicGetParameter__pYawFilterTime();
			case WTSpecPackage.CTRL_UNIT127__PARAMETER_PYAW_STOP_ANGLE_LIMIT:
				if (resolve) return getParameter__pYawStopAngleLimit();
				return basicGetParameter__pYawStopAngleLimit();
			case WTSpecPackage.CTRL_UNIT127__TIMER_TMAXIMUM_TIME_YAWING:
				if (resolve) return getTimer__tMaximumTimeYawing();
				return basicGetTimer__tMaximumTimeYawing();
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
			case WTSpecPackage.CTRL_UNIT127__INPUT_ILOW_WIND_ACTIVE:
				setInput__iLowWindActive((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT127__INPUT_IWIND_DIRECTION_REL_AVG:
				setInput__iWindDirectionRelAvg((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT127__INPUT_ITWIST_ANGLE:
				setInput__iTwistAngle((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT127__INPUT_IINHIBIT_AUTO_YAW:
				setInput__iInhibitAutoYaw((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT127__OUTPUT_OREL_WIND_PRE_COMMAND:
				setOutput__oRelWindPreCommand((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT127__OUTPUT_OFLAG_INTO_WIND:
				setOutput__oFlagIntoWind((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT127__OUTPUT_OEXCESSIVE_YAWING_TIME:
				setOutput__oExcessiveYawingTime((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT127__PARAMETER_PWIND_DIRECTION_TOLERANCE:
				setParameter__pWindDirectionTolerance((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT127__PARAMETER_PYAW_FILTER_TIME:
				setParameter__pYawFilterTime((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT127__PARAMETER_PYAW_STOP_ANGLE_LIMIT:
				setParameter__pYawStopAngleLimit((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT127__TIMER_TMAXIMUM_TIME_YAWING:
				setTimer__tMaximumTimeYawing((WTCTimer)newValue);
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
			case WTSpecPackage.CTRL_UNIT127__INPUT_ILOW_WIND_ACTIVE:
				setInput__iLowWindActive((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT127__INPUT_IWIND_DIRECTION_REL_AVG:
				setInput__iWindDirectionRelAvg((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT127__INPUT_ITWIST_ANGLE:
				setInput__iTwistAngle((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT127__INPUT_IINHIBIT_AUTO_YAW:
				setInput__iInhibitAutoYaw((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT127__OUTPUT_OREL_WIND_PRE_COMMAND:
				setOutput__oRelWindPreCommand((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT127__OUTPUT_OFLAG_INTO_WIND:
				setOutput__oFlagIntoWind((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT127__OUTPUT_OEXCESSIVE_YAWING_TIME:
				setOutput__oExcessiveYawingTime((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT127__PARAMETER_PWIND_DIRECTION_TOLERANCE:
				setParameter__pWindDirectionTolerance((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT127__PARAMETER_PYAW_FILTER_TIME:
				setParameter__pYawFilterTime((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT127__PARAMETER_PYAW_STOP_ANGLE_LIMIT:
				setParameter__pYawStopAngleLimit((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT127__TIMER_TMAXIMUM_TIME_YAWING:
				setTimer__tMaximumTimeYawing((WTCTimer)null);
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
			case WTSpecPackage.CTRL_UNIT127__INPUT_ILOW_WIND_ACTIVE:
				return input__iLowWindActive != null;
			case WTSpecPackage.CTRL_UNIT127__INPUT_IWIND_DIRECTION_REL_AVG:
				return input__iWindDirectionRelAvg != null;
			case WTSpecPackage.CTRL_UNIT127__INPUT_ITWIST_ANGLE:
				return input__iTwistAngle != null;
			case WTSpecPackage.CTRL_UNIT127__INPUT_IINHIBIT_AUTO_YAW:
				return input__iInhibitAutoYaw != null;
			case WTSpecPackage.CTRL_UNIT127__OUTPUT_OREL_WIND_PRE_COMMAND:
				return output__oRelWindPreCommand != null;
			case WTSpecPackage.CTRL_UNIT127__OUTPUT_OFLAG_INTO_WIND:
				return output__oFlagIntoWind != null;
			case WTSpecPackage.CTRL_UNIT127__OUTPUT_OEXCESSIVE_YAWING_TIME:
				return output__oExcessiveYawingTime != null;
			case WTSpecPackage.CTRL_UNIT127__PARAMETER_PWIND_DIRECTION_TOLERANCE:
				return parameter__pWindDirectionTolerance != null;
			case WTSpecPackage.CTRL_UNIT127__PARAMETER_PYAW_FILTER_TIME:
				return parameter__pYawFilterTime != null;
			case WTSpecPackage.CTRL_UNIT127__PARAMETER_PYAW_STOP_ANGLE_LIMIT:
				return parameter__pYawStopAngleLimit != null;
			case WTSpecPackage.CTRL_UNIT127__TIMER_TMAXIMUM_TIME_YAWING:
				return timer__tMaximumTimeYawing != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit127Impl
