/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit128;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCParam;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCTimer;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit128</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit128Impl#getInput__iYawStatus <em>Input iYaw Status</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit128Impl#getInput__iTwistAngle <em>Input iTwist Angle</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit128Impl#getOutput__oYawMotionProblem <em>Output oYaw Motion Problem</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit128Impl#getParameter__pDegreesPerSecond <em>Parameter pDegrees Per Second</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit128Impl#getTimer__tCheckFrequency <em>Timer tCheck Frequency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit128Impl extends wtcImpl implements CtrlUnit128 {
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
	 * The cached value of the '{@link #getInput__iTwistAngle() <em>Input iTwist Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iTwistAngle()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iTwistAngle;

	/**
	 * The cached value of the '{@link #getOutput__oYawMotionProblem() <em>Output oYaw Motion Problem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oYawMotionProblem()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oYawMotionProblem;

	/**
	 * The cached value of the '{@link #getParameter__pDegreesPerSecond() <em>Parameter pDegrees Per Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pDegreesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pDegreesPerSecond;

	/**
	 * The cached value of the '{@link #getTimer__tCheckFrequency() <em>Timer tCheck Frequency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tCheckFrequency()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tCheckFrequency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit128Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit128();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT128__INPUT_IYAW_STATUS, oldInput__iYawStatus, input__iYawStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT128__INPUT_IYAW_STATUS, oldInput__iYawStatus, input__iYawStatus));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT128__INPUT_ITWIST_ANGLE, oldInput__iTwistAngle, input__iTwistAngle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT128__INPUT_ITWIST_ANGLE, oldInput__iTwistAngle, input__iTwistAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oYawMotionProblem() {
		if (output__oYawMotionProblem != null && output__oYawMotionProblem.eIsProxy()) {
			InternalEObject oldOutput__oYawMotionProblem = (InternalEObject)output__oYawMotionProblem;
			output__oYawMotionProblem = (WTCOutput)eResolveProxy(oldOutput__oYawMotionProblem);
			if (output__oYawMotionProblem != oldOutput__oYawMotionProblem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT128__OUTPUT_OYAW_MOTION_PROBLEM, oldOutput__oYawMotionProblem, output__oYawMotionProblem));
			}
		}
		return output__oYawMotionProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oYawMotionProblem() {
		return output__oYawMotionProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oYawMotionProblem(WTCOutput newOutput__oYawMotionProblem) {
		WTCOutput oldOutput__oYawMotionProblem = output__oYawMotionProblem;
		output__oYawMotionProblem = newOutput__oYawMotionProblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT128__OUTPUT_OYAW_MOTION_PROBLEM, oldOutput__oYawMotionProblem, output__oYawMotionProblem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pDegreesPerSecond() {
		if (parameter__pDegreesPerSecond != null && parameter__pDegreesPerSecond.eIsProxy()) {
			InternalEObject oldParameter__pDegreesPerSecond = (InternalEObject)parameter__pDegreesPerSecond;
			parameter__pDegreesPerSecond = (WTCParam)eResolveProxy(oldParameter__pDegreesPerSecond);
			if (parameter__pDegreesPerSecond != oldParameter__pDegreesPerSecond) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT128__PARAMETER_PDEGREES_PER_SECOND, oldParameter__pDegreesPerSecond, parameter__pDegreesPerSecond));
			}
		}
		return parameter__pDegreesPerSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pDegreesPerSecond() {
		return parameter__pDegreesPerSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pDegreesPerSecond(WTCParam newParameter__pDegreesPerSecond) {
		WTCParam oldParameter__pDegreesPerSecond = parameter__pDegreesPerSecond;
		parameter__pDegreesPerSecond = newParameter__pDegreesPerSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT128__PARAMETER_PDEGREES_PER_SECOND, oldParameter__pDegreesPerSecond, parameter__pDegreesPerSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tCheckFrequency() {
		if (timer__tCheckFrequency != null && timer__tCheckFrequency.eIsProxy()) {
			InternalEObject oldTimer__tCheckFrequency = (InternalEObject)timer__tCheckFrequency;
			timer__tCheckFrequency = (WTCTimer)eResolveProxy(oldTimer__tCheckFrequency);
			if (timer__tCheckFrequency != oldTimer__tCheckFrequency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT128__TIMER_TCHECK_FREQUENCY, oldTimer__tCheckFrequency, timer__tCheckFrequency));
			}
		}
		return timer__tCheckFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tCheckFrequency() {
		return timer__tCheckFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tCheckFrequency(WTCTimer newTimer__tCheckFrequency) {
		WTCTimer oldTimer__tCheckFrequency = timer__tCheckFrequency;
		timer__tCheckFrequency = newTimer__tCheckFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT128__TIMER_TCHECK_FREQUENCY, oldTimer__tCheckFrequency, timer__tCheckFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT128__INPUT_IYAW_STATUS:
				if (resolve) return getInput__iYawStatus();
				return basicGetInput__iYawStatus();
			case WTSpecPackage.CTRL_UNIT128__INPUT_ITWIST_ANGLE:
				if (resolve) return getInput__iTwistAngle();
				return basicGetInput__iTwistAngle();
			case WTSpecPackage.CTRL_UNIT128__OUTPUT_OYAW_MOTION_PROBLEM:
				if (resolve) return getOutput__oYawMotionProblem();
				return basicGetOutput__oYawMotionProblem();
			case WTSpecPackage.CTRL_UNIT128__PARAMETER_PDEGREES_PER_SECOND:
				if (resolve) return getParameter__pDegreesPerSecond();
				return basicGetParameter__pDegreesPerSecond();
			case WTSpecPackage.CTRL_UNIT128__TIMER_TCHECK_FREQUENCY:
				if (resolve) return getTimer__tCheckFrequency();
				return basicGetTimer__tCheckFrequency();
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
			case WTSpecPackage.CTRL_UNIT128__INPUT_IYAW_STATUS:
				setInput__iYawStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT128__INPUT_ITWIST_ANGLE:
				setInput__iTwistAngle((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT128__OUTPUT_OYAW_MOTION_PROBLEM:
				setOutput__oYawMotionProblem((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT128__PARAMETER_PDEGREES_PER_SECOND:
				setParameter__pDegreesPerSecond((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT128__TIMER_TCHECK_FREQUENCY:
				setTimer__tCheckFrequency((WTCTimer)newValue);
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
			case WTSpecPackage.CTRL_UNIT128__INPUT_IYAW_STATUS:
				setInput__iYawStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT128__INPUT_ITWIST_ANGLE:
				setInput__iTwistAngle((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT128__OUTPUT_OYAW_MOTION_PROBLEM:
				setOutput__oYawMotionProblem((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT128__PARAMETER_PDEGREES_PER_SECOND:
				setParameter__pDegreesPerSecond((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT128__TIMER_TCHECK_FREQUENCY:
				setTimer__tCheckFrequency((WTCTimer)null);
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
			case WTSpecPackage.CTRL_UNIT128__INPUT_IYAW_STATUS:
				return input__iYawStatus != null;
			case WTSpecPackage.CTRL_UNIT128__INPUT_ITWIST_ANGLE:
				return input__iTwistAngle != null;
			case WTSpecPackage.CTRL_UNIT128__OUTPUT_OYAW_MOTION_PROBLEM:
				return output__oYawMotionProblem != null;
			case WTSpecPackage.CTRL_UNIT128__PARAMETER_PDEGREES_PER_SECOND:
				return parameter__pDegreesPerSecond != null;
			case WTSpecPackage.CTRL_UNIT128__TIMER_TCHECK_FREQUENCY:
				return timer__tCheckFrequency != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit128Impl
