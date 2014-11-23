/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit21;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCParam;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit21</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit21Impl#getInput__iWindDirection <em>Input iWind Direction</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit21Impl#getInput__iFlagBrakes <em>Input iFlag Brakes</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit21Impl#getInput__iFlagIntoWind <em>Input iFlag Into Wind</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit21Impl#getOutput__oBackWindDetected <em>Output oBack Wind Detected</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit21Impl#getParameter__pMaxAbsoluteAngle <em>Parameter pMax Absolute Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit21Impl extends wtcImpl implements CtrlUnit21 {
	/**
	 * The cached value of the '{@link #getInput__iWindDirection() <em>Input iWind Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iWindDirection()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iWindDirection;

	/**
	 * The cached value of the '{@link #getInput__iFlagBrakes() <em>Input iFlag Brakes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iFlagBrakes()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iFlagBrakes;

	/**
	 * The cached value of the '{@link #getInput__iFlagIntoWind() <em>Input iFlag Into Wind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iFlagIntoWind()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iFlagIntoWind;

	/**
	 * The cached value of the '{@link #getOutput__oBackWindDetected() <em>Output oBack Wind Detected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oBackWindDetected()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oBackWindDetected;

	/**
	 * The cached value of the '{@link #getParameter__pMaxAbsoluteAngle() <em>Parameter pMax Absolute Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pMaxAbsoluteAngle()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pMaxAbsoluteAngle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit21Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit21();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iWindDirection() {
		if (input__iWindDirection != null && input__iWindDirection.eIsProxy()) {
			InternalEObject oldInput__iWindDirection = (InternalEObject)input__iWindDirection;
			input__iWindDirection = (WTCInput)eResolveProxy(oldInput__iWindDirection);
			if (input__iWindDirection != oldInput__iWindDirection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT21__INPUT_IWIND_DIRECTION, oldInput__iWindDirection, input__iWindDirection));
			}
		}
		return input__iWindDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iWindDirection() {
		return input__iWindDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iWindDirection(WTCInput newInput__iWindDirection) {
		WTCInput oldInput__iWindDirection = input__iWindDirection;
		input__iWindDirection = newInput__iWindDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT21__INPUT_IWIND_DIRECTION, oldInput__iWindDirection, input__iWindDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iFlagBrakes() {
		if (input__iFlagBrakes != null && input__iFlagBrakes.eIsProxy()) {
			InternalEObject oldInput__iFlagBrakes = (InternalEObject)input__iFlagBrakes;
			input__iFlagBrakes = (WTCInput)eResolveProxy(oldInput__iFlagBrakes);
			if (input__iFlagBrakes != oldInput__iFlagBrakes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT21__INPUT_IFLAG_BRAKES, oldInput__iFlagBrakes, input__iFlagBrakes));
			}
		}
		return input__iFlagBrakes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iFlagBrakes() {
		return input__iFlagBrakes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iFlagBrakes(WTCInput newInput__iFlagBrakes) {
		WTCInput oldInput__iFlagBrakes = input__iFlagBrakes;
		input__iFlagBrakes = newInput__iFlagBrakes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT21__INPUT_IFLAG_BRAKES, oldInput__iFlagBrakes, input__iFlagBrakes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iFlagIntoWind() {
		if (input__iFlagIntoWind != null && input__iFlagIntoWind.eIsProxy()) {
			InternalEObject oldInput__iFlagIntoWind = (InternalEObject)input__iFlagIntoWind;
			input__iFlagIntoWind = (WTCInput)eResolveProxy(oldInput__iFlagIntoWind);
			if (input__iFlagIntoWind != oldInput__iFlagIntoWind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT21__INPUT_IFLAG_INTO_WIND, oldInput__iFlagIntoWind, input__iFlagIntoWind));
			}
		}
		return input__iFlagIntoWind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iFlagIntoWind() {
		return input__iFlagIntoWind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iFlagIntoWind(WTCInput newInput__iFlagIntoWind) {
		WTCInput oldInput__iFlagIntoWind = input__iFlagIntoWind;
		input__iFlagIntoWind = newInput__iFlagIntoWind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT21__INPUT_IFLAG_INTO_WIND, oldInput__iFlagIntoWind, input__iFlagIntoWind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oBackWindDetected() {
		if (output__oBackWindDetected != null && output__oBackWindDetected.eIsProxy()) {
			InternalEObject oldOutput__oBackWindDetected = (InternalEObject)output__oBackWindDetected;
			output__oBackWindDetected = (WTCOutput)eResolveProxy(oldOutput__oBackWindDetected);
			if (output__oBackWindDetected != oldOutput__oBackWindDetected) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT21__OUTPUT_OBACK_WIND_DETECTED, oldOutput__oBackWindDetected, output__oBackWindDetected));
			}
		}
		return output__oBackWindDetected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oBackWindDetected() {
		return output__oBackWindDetected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oBackWindDetected(WTCOutput newOutput__oBackWindDetected) {
		WTCOutput oldOutput__oBackWindDetected = output__oBackWindDetected;
		output__oBackWindDetected = newOutput__oBackWindDetected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT21__OUTPUT_OBACK_WIND_DETECTED, oldOutput__oBackWindDetected, output__oBackWindDetected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pMaxAbsoluteAngle() {
		if (parameter__pMaxAbsoluteAngle != null && parameter__pMaxAbsoluteAngle.eIsProxy()) {
			InternalEObject oldParameter__pMaxAbsoluteAngle = (InternalEObject)parameter__pMaxAbsoluteAngle;
			parameter__pMaxAbsoluteAngle = (WTCParam)eResolveProxy(oldParameter__pMaxAbsoluteAngle);
			if (parameter__pMaxAbsoluteAngle != oldParameter__pMaxAbsoluteAngle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT21__PARAMETER_PMAX_ABSOLUTE_ANGLE, oldParameter__pMaxAbsoluteAngle, parameter__pMaxAbsoluteAngle));
			}
		}
		return parameter__pMaxAbsoluteAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pMaxAbsoluteAngle() {
		return parameter__pMaxAbsoluteAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pMaxAbsoluteAngle(WTCParam newParameter__pMaxAbsoluteAngle) {
		WTCParam oldParameter__pMaxAbsoluteAngle = parameter__pMaxAbsoluteAngle;
		parameter__pMaxAbsoluteAngle = newParameter__pMaxAbsoluteAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT21__PARAMETER_PMAX_ABSOLUTE_ANGLE, oldParameter__pMaxAbsoluteAngle, parameter__pMaxAbsoluteAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT21__INPUT_IWIND_DIRECTION:
				if (resolve) return getInput__iWindDirection();
				return basicGetInput__iWindDirection();
			case WTSpecPackage.CTRL_UNIT21__INPUT_IFLAG_BRAKES:
				if (resolve) return getInput__iFlagBrakes();
				return basicGetInput__iFlagBrakes();
			case WTSpecPackage.CTRL_UNIT21__INPUT_IFLAG_INTO_WIND:
				if (resolve) return getInput__iFlagIntoWind();
				return basicGetInput__iFlagIntoWind();
			case WTSpecPackage.CTRL_UNIT21__OUTPUT_OBACK_WIND_DETECTED:
				if (resolve) return getOutput__oBackWindDetected();
				return basicGetOutput__oBackWindDetected();
			case WTSpecPackage.CTRL_UNIT21__PARAMETER_PMAX_ABSOLUTE_ANGLE:
				if (resolve) return getParameter__pMaxAbsoluteAngle();
				return basicGetParameter__pMaxAbsoluteAngle();
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
			case WTSpecPackage.CTRL_UNIT21__INPUT_IWIND_DIRECTION:
				setInput__iWindDirection((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT21__INPUT_IFLAG_BRAKES:
				setInput__iFlagBrakes((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT21__INPUT_IFLAG_INTO_WIND:
				setInput__iFlagIntoWind((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT21__OUTPUT_OBACK_WIND_DETECTED:
				setOutput__oBackWindDetected((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT21__PARAMETER_PMAX_ABSOLUTE_ANGLE:
				setParameter__pMaxAbsoluteAngle((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT21__INPUT_IWIND_DIRECTION:
				setInput__iWindDirection((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT21__INPUT_IFLAG_BRAKES:
				setInput__iFlagBrakes((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT21__INPUT_IFLAG_INTO_WIND:
				setInput__iFlagIntoWind((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT21__OUTPUT_OBACK_WIND_DETECTED:
				setOutput__oBackWindDetected((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT21__PARAMETER_PMAX_ABSOLUTE_ANGLE:
				setParameter__pMaxAbsoluteAngle((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT21__INPUT_IWIND_DIRECTION:
				return input__iWindDirection != null;
			case WTSpecPackage.CTRL_UNIT21__INPUT_IFLAG_BRAKES:
				return input__iFlagBrakes != null;
			case WTSpecPackage.CTRL_UNIT21__INPUT_IFLAG_INTO_WIND:
				return input__iFlagIntoWind != null;
			case WTSpecPackage.CTRL_UNIT21__OUTPUT_OBACK_WIND_DETECTED:
				return output__oBackWindDetected != null;
			case WTSpecPackage.CTRL_UNIT21__PARAMETER_PMAX_ABSOLUTE_ANGLE:
				return parameter__pMaxAbsoluteAngle != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit21Impl
