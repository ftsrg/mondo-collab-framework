/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit82;
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
 * An implementation of the model object '<em><b>Ctrl Unit82</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit82Impl#getInput__iVarInput <em>Input iVar Input</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit82Impl#getInput__iWriteTwistAngleRequest <em>Input iWrite Twist Angle Request</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit82Impl#getInput__iNewTwistAngleValue <em>Input iNew Twist Angle Value</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit82Impl#getOutput__oVarOutput <em>Output oVar Output</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit82Impl#getParameter__pMinDifferenceToConsider <em>Parameter pMin Difference To Consider</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit82Impl#getTimer__tSyncDelay <em>Timer tSync Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit82Impl extends wtcImpl implements CtrlUnit82 {
	/**
	 * The cached value of the '{@link #getInput__iVarInput() <em>Input iVar Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iVarInput()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iVarInput;

	/**
	 * The cached value of the '{@link #getInput__iWriteTwistAngleRequest() <em>Input iWrite Twist Angle Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iWriteTwistAngleRequest()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iWriteTwistAngleRequest;

	/**
	 * The cached value of the '{@link #getInput__iNewTwistAngleValue() <em>Input iNew Twist Angle Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iNewTwistAngleValue()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iNewTwistAngleValue;

	/**
	 * The cached value of the '{@link #getOutput__oVarOutput() <em>Output oVar Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oVarOutput()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oVarOutput;

	/**
	 * The cached value of the '{@link #getParameter__pMinDifferenceToConsider() <em>Parameter pMin Difference To Consider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pMinDifferenceToConsider()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pMinDifferenceToConsider;

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
	protected CtrlUnit82Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit82();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iVarInput() {
		if (input__iVarInput != null && input__iVarInput.eIsProxy()) {
			InternalEObject oldInput__iVarInput = (InternalEObject)input__iVarInput;
			input__iVarInput = (WTCInput)eResolveProxy(oldInput__iVarInput);
			if (input__iVarInput != oldInput__iVarInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT82__INPUT_IVAR_INPUT, oldInput__iVarInput, input__iVarInput));
			}
		}
		return input__iVarInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iVarInput() {
		return input__iVarInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iVarInput(WTCInput newInput__iVarInput) {
		WTCInput oldInput__iVarInput = input__iVarInput;
		input__iVarInput = newInput__iVarInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT82__INPUT_IVAR_INPUT, oldInput__iVarInput, input__iVarInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iWriteTwistAngleRequest() {
		if (input__iWriteTwistAngleRequest != null && input__iWriteTwistAngleRequest.eIsProxy()) {
			InternalEObject oldInput__iWriteTwistAngleRequest = (InternalEObject)input__iWriteTwistAngleRequest;
			input__iWriteTwistAngleRequest = (WTCInput)eResolveProxy(oldInput__iWriteTwistAngleRequest);
			if (input__iWriteTwistAngleRequest != oldInput__iWriteTwistAngleRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT82__INPUT_IWRITE_TWIST_ANGLE_REQUEST, oldInput__iWriteTwistAngleRequest, input__iWriteTwistAngleRequest));
			}
		}
		return input__iWriteTwistAngleRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iWriteTwistAngleRequest() {
		return input__iWriteTwistAngleRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iWriteTwistAngleRequest(WTCInput newInput__iWriteTwistAngleRequest) {
		WTCInput oldInput__iWriteTwistAngleRequest = input__iWriteTwistAngleRequest;
		input__iWriteTwistAngleRequest = newInput__iWriteTwistAngleRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT82__INPUT_IWRITE_TWIST_ANGLE_REQUEST, oldInput__iWriteTwistAngleRequest, input__iWriteTwistAngleRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iNewTwistAngleValue() {
		if (input__iNewTwistAngleValue != null && input__iNewTwistAngleValue.eIsProxy()) {
			InternalEObject oldInput__iNewTwistAngleValue = (InternalEObject)input__iNewTwistAngleValue;
			input__iNewTwistAngleValue = (WTCInput)eResolveProxy(oldInput__iNewTwistAngleValue);
			if (input__iNewTwistAngleValue != oldInput__iNewTwistAngleValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT82__INPUT_INEW_TWIST_ANGLE_VALUE, oldInput__iNewTwistAngleValue, input__iNewTwistAngleValue));
			}
		}
		return input__iNewTwistAngleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iNewTwistAngleValue() {
		return input__iNewTwistAngleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iNewTwistAngleValue(WTCInput newInput__iNewTwistAngleValue) {
		WTCInput oldInput__iNewTwistAngleValue = input__iNewTwistAngleValue;
		input__iNewTwistAngleValue = newInput__iNewTwistAngleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT82__INPUT_INEW_TWIST_ANGLE_VALUE, oldInput__iNewTwistAngleValue, input__iNewTwistAngleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oVarOutput() {
		if (output__oVarOutput != null && output__oVarOutput.eIsProxy()) {
			InternalEObject oldOutput__oVarOutput = (InternalEObject)output__oVarOutput;
			output__oVarOutput = (WTCOutput)eResolveProxy(oldOutput__oVarOutput);
			if (output__oVarOutput != oldOutput__oVarOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT82__OUTPUT_OVAR_OUTPUT, oldOutput__oVarOutput, output__oVarOutput));
			}
		}
		return output__oVarOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oVarOutput() {
		return output__oVarOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oVarOutput(WTCOutput newOutput__oVarOutput) {
		WTCOutput oldOutput__oVarOutput = output__oVarOutput;
		output__oVarOutput = newOutput__oVarOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT82__OUTPUT_OVAR_OUTPUT, oldOutput__oVarOutput, output__oVarOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pMinDifferenceToConsider() {
		if (parameter__pMinDifferenceToConsider != null && parameter__pMinDifferenceToConsider.eIsProxy()) {
			InternalEObject oldParameter__pMinDifferenceToConsider = (InternalEObject)parameter__pMinDifferenceToConsider;
			parameter__pMinDifferenceToConsider = (WTCParam)eResolveProxy(oldParameter__pMinDifferenceToConsider);
			if (parameter__pMinDifferenceToConsider != oldParameter__pMinDifferenceToConsider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT82__PARAMETER_PMIN_DIFFERENCE_TO_CONSIDER, oldParameter__pMinDifferenceToConsider, parameter__pMinDifferenceToConsider));
			}
		}
		return parameter__pMinDifferenceToConsider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pMinDifferenceToConsider() {
		return parameter__pMinDifferenceToConsider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pMinDifferenceToConsider(WTCParam newParameter__pMinDifferenceToConsider) {
		WTCParam oldParameter__pMinDifferenceToConsider = parameter__pMinDifferenceToConsider;
		parameter__pMinDifferenceToConsider = newParameter__pMinDifferenceToConsider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT82__PARAMETER_PMIN_DIFFERENCE_TO_CONSIDER, oldParameter__pMinDifferenceToConsider, parameter__pMinDifferenceToConsider));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT82__TIMER_TSYNC_DELAY, oldTimer__tSyncDelay, timer__tSyncDelay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT82__TIMER_TSYNC_DELAY, oldTimer__tSyncDelay, timer__tSyncDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT82__INPUT_IVAR_INPUT:
				if (resolve) return getInput__iVarInput();
				return basicGetInput__iVarInput();
			case WTSpecPackage.CTRL_UNIT82__INPUT_IWRITE_TWIST_ANGLE_REQUEST:
				if (resolve) return getInput__iWriteTwistAngleRequest();
				return basicGetInput__iWriteTwistAngleRequest();
			case WTSpecPackage.CTRL_UNIT82__INPUT_INEW_TWIST_ANGLE_VALUE:
				if (resolve) return getInput__iNewTwistAngleValue();
				return basicGetInput__iNewTwistAngleValue();
			case WTSpecPackage.CTRL_UNIT82__OUTPUT_OVAR_OUTPUT:
				if (resolve) return getOutput__oVarOutput();
				return basicGetOutput__oVarOutput();
			case WTSpecPackage.CTRL_UNIT82__PARAMETER_PMIN_DIFFERENCE_TO_CONSIDER:
				if (resolve) return getParameter__pMinDifferenceToConsider();
				return basicGetParameter__pMinDifferenceToConsider();
			case WTSpecPackage.CTRL_UNIT82__TIMER_TSYNC_DELAY:
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
			case WTSpecPackage.CTRL_UNIT82__INPUT_IVAR_INPUT:
				setInput__iVarInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT82__INPUT_IWRITE_TWIST_ANGLE_REQUEST:
				setInput__iWriteTwistAngleRequest((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT82__INPUT_INEW_TWIST_ANGLE_VALUE:
				setInput__iNewTwistAngleValue((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT82__OUTPUT_OVAR_OUTPUT:
				setOutput__oVarOutput((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT82__PARAMETER_PMIN_DIFFERENCE_TO_CONSIDER:
				setParameter__pMinDifferenceToConsider((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT82__TIMER_TSYNC_DELAY:
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
			case WTSpecPackage.CTRL_UNIT82__INPUT_IVAR_INPUT:
				setInput__iVarInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT82__INPUT_IWRITE_TWIST_ANGLE_REQUEST:
				setInput__iWriteTwistAngleRequest((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT82__INPUT_INEW_TWIST_ANGLE_VALUE:
				setInput__iNewTwistAngleValue((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT82__OUTPUT_OVAR_OUTPUT:
				setOutput__oVarOutput((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT82__PARAMETER_PMIN_DIFFERENCE_TO_CONSIDER:
				setParameter__pMinDifferenceToConsider((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT82__TIMER_TSYNC_DELAY:
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
			case WTSpecPackage.CTRL_UNIT82__INPUT_IVAR_INPUT:
				return input__iVarInput != null;
			case WTSpecPackage.CTRL_UNIT82__INPUT_IWRITE_TWIST_ANGLE_REQUEST:
				return input__iWriteTwistAngleRequest != null;
			case WTSpecPackage.CTRL_UNIT82__INPUT_INEW_TWIST_ANGLE_VALUE:
				return input__iNewTwistAngleValue != null;
			case WTSpecPackage.CTRL_UNIT82__OUTPUT_OVAR_OUTPUT:
				return output__oVarOutput != null;
			case WTSpecPackage.CTRL_UNIT82__PARAMETER_PMIN_DIFFERENCE_TO_CONSIDER:
				return parameter__pMinDifferenceToConsider != null;
			case WTSpecPackage.CTRL_UNIT82__TIMER_TSYNC_DELAY:
				return timer__tSyncDelay != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit82Impl
