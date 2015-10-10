/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit85;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCParam;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit85</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit85Impl#getInput__iPitchAngle1 <em>Input iPitch Angle1</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit85Impl#getInput__iPitchAngle2 <em>Input iPitch Angle2</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit85Impl#getInput__iPitchAngle3 <em>Input iPitch Angle3</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit85Impl#getOutput__oPitchBrakePosition <em>Output oPitch Brake Position</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit85Impl#getParameter__pPitchMaxBrakeAngle <em>Parameter pPitch Max Brake Angle</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit85Impl#getParameter__pPitchMinBrakeAngle <em>Parameter pPitch Min Brake Angle</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit85Impl#getParameter__pPitchBrakeAngleHysteresis <em>Parameter pPitch Brake Angle Hysteresis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit85Impl extends wtcImpl implements CtrlUnit85 {
	/**
	 * The cached value of the '{@link #getInput__iPitchAngle1() <em>Input iPitch Angle1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPitchAngle1()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPitchAngle1;

	/**
	 * The cached value of the '{@link #getInput__iPitchAngle2() <em>Input iPitch Angle2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPitchAngle2()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPitchAngle2;

	/**
	 * The cached value of the '{@link #getInput__iPitchAngle3() <em>Input iPitch Angle3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPitchAngle3()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPitchAngle3;

	/**
	 * The cached value of the '{@link #getOutput__oPitchBrakePosition() <em>Output oPitch Brake Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPitchBrakePosition()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPitchBrakePosition;

	/**
	 * The cached value of the '{@link #getParameter__pPitchMaxBrakeAngle() <em>Parameter pPitch Max Brake Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPitchMaxBrakeAngle()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPitchMaxBrakeAngle;

	/**
	 * The cached value of the '{@link #getParameter__pPitchMinBrakeAngle() <em>Parameter pPitch Min Brake Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPitchMinBrakeAngle()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPitchMinBrakeAngle;

	/**
	 * The cached value of the '{@link #getParameter__pPitchBrakeAngleHysteresis() <em>Parameter pPitch Brake Angle Hysteresis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPitchBrakeAngleHysteresis()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPitchBrakeAngleHysteresis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit85Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit85();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPitchAngle1() {
		if (input__iPitchAngle1 != null && input__iPitchAngle1.eIsProxy()) {
			InternalEObject oldInput__iPitchAngle1 = (InternalEObject)input__iPitchAngle1;
			input__iPitchAngle1 = (WTCInput)eResolveProxy(oldInput__iPitchAngle1);
			if (input__iPitchAngle1 != oldInput__iPitchAngle1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE1, oldInput__iPitchAngle1, input__iPitchAngle1));
			}
		}
		return input__iPitchAngle1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPitchAngle1() {
		return input__iPitchAngle1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPitchAngle1(WTCInput newInput__iPitchAngle1) {
		WTCInput oldInput__iPitchAngle1 = input__iPitchAngle1;
		input__iPitchAngle1 = newInput__iPitchAngle1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE1, oldInput__iPitchAngle1, input__iPitchAngle1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPitchAngle2() {
		if (input__iPitchAngle2 != null && input__iPitchAngle2.eIsProxy()) {
			InternalEObject oldInput__iPitchAngle2 = (InternalEObject)input__iPitchAngle2;
			input__iPitchAngle2 = (WTCInput)eResolveProxy(oldInput__iPitchAngle2);
			if (input__iPitchAngle2 != oldInput__iPitchAngle2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE2, oldInput__iPitchAngle2, input__iPitchAngle2));
			}
		}
		return input__iPitchAngle2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPitchAngle2() {
		return input__iPitchAngle2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPitchAngle2(WTCInput newInput__iPitchAngle2) {
		WTCInput oldInput__iPitchAngle2 = input__iPitchAngle2;
		input__iPitchAngle2 = newInput__iPitchAngle2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE2, oldInput__iPitchAngle2, input__iPitchAngle2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPitchAngle3() {
		if (input__iPitchAngle3 != null && input__iPitchAngle3.eIsProxy()) {
			InternalEObject oldInput__iPitchAngle3 = (InternalEObject)input__iPitchAngle3;
			input__iPitchAngle3 = (WTCInput)eResolveProxy(oldInput__iPitchAngle3);
			if (input__iPitchAngle3 != oldInput__iPitchAngle3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE3, oldInput__iPitchAngle3, input__iPitchAngle3));
			}
		}
		return input__iPitchAngle3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPitchAngle3() {
		return input__iPitchAngle3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPitchAngle3(WTCInput newInput__iPitchAngle3) {
		WTCInput oldInput__iPitchAngle3 = input__iPitchAngle3;
		input__iPitchAngle3 = newInput__iPitchAngle3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE3, oldInput__iPitchAngle3, input__iPitchAngle3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPitchBrakePosition() {
		if (output__oPitchBrakePosition != null && output__oPitchBrakePosition.eIsProxy()) {
			InternalEObject oldOutput__oPitchBrakePosition = (InternalEObject)output__oPitchBrakePosition;
			output__oPitchBrakePosition = (WTCOutput)eResolveProxy(oldOutput__oPitchBrakePosition);
			if (output__oPitchBrakePosition != oldOutput__oPitchBrakePosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT85__OUTPUT_OPITCH_BRAKE_POSITION, oldOutput__oPitchBrakePosition, output__oPitchBrakePosition));
			}
		}
		return output__oPitchBrakePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPitchBrakePosition() {
		return output__oPitchBrakePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPitchBrakePosition(WTCOutput newOutput__oPitchBrakePosition) {
		WTCOutput oldOutput__oPitchBrakePosition = output__oPitchBrakePosition;
		output__oPitchBrakePosition = newOutput__oPitchBrakePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT85__OUTPUT_OPITCH_BRAKE_POSITION, oldOutput__oPitchBrakePosition, output__oPitchBrakePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPitchMaxBrakeAngle() {
		if (parameter__pPitchMaxBrakeAngle != null && parameter__pPitchMaxBrakeAngle.eIsProxy()) {
			InternalEObject oldParameter__pPitchMaxBrakeAngle = (InternalEObject)parameter__pPitchMaxBrakeAngle;
			parameter__pPitchMaxBrakeAngle = (WTCParam)eResolveProxy(oldParameter__pPitchMaxBrakeAngle);
			if (parameter__pPitchMaxBrakeAngle != oldParameter__pPitchMaxBrakeAngle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_MAX_BRAKE_ANGLE, oldParameter__pPitchMaxBrakeAngle, parameter__pPitchMaxBrakeAngle));
			}
		}
		return parameter__pPitchMaxBrakeAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPitchMaxBrakeAngle() {
		return parameter__pPitchMaxBrakeAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPitchMaxBrakeAngle(WTCParam newParameter__pPitchMaxBrakeAngle) {
		WTCParam oldParameter__pPitchMaxBrakeAngle = parameter__pPitchMaxBrakeAngle;
		parameter__pPitchMaxBrakeAngle = newParameter__pPitchMaxBrakeAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_MAX_BRAKE_ANGLE, oldParameter__pPitchMaxBrakeAngle, parameter__pPitchMaxBrakeAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPitchMinBrakeAngle() {
		if (parameter__pPitchMinBrakeAngle != null && parameter__pPitchMinBrakeAngle.eIsProxy()) {
			InternalEObject oldParameter__pPitchMinBrakeAngle = (InternalEObject)parameter__pPitchMinBrakeAngle;
			parameter__pPitchMinBrakeAngle = (WTCParam)eResolveProxy(oldParameter__pPitchMinBrakeAngle);
			if (parameter__pPitchMinBrakeAngle != oldParameter__pPitchMinBrakeAngle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_MIN_BRAKE_ANGLE, oldParameter__pPitchMinBrakeAngle, parameter__pPitchMinBrakeAngle));
			}
		}
		return parameter__pPitchMinBrakeAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPitchMinBrakeAngle() {
		return parameter__pPitchMinBrakeAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPitchMinBrakeAngle(WTCParam newParameter__pPitchMinBrakeAngle) {
		WTCParam oldParameter__pPitchMinBrakeAngle = parameter__pPitchMinBrakeAngle;
		parameter__pPitchMinBrakeAngle = newParameter__pPitchMinBrakeAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_MIN_BRAKE_ANGLE, oldParameter__pPitchMinBrakeAngle, parameter__pPitchMinBrakeAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPitchBrakeAngleHysteresis() {
		if (parameter__pPitchBrakeAngleHysteresis != null && parameter__pPitchBrakeAngleHysteresis.eIsProxy()) {
			InternalEObject oldParameter__pPitchBrakeAngleHysteresis = (InternalEObject)parameter__pPitchBrakeAngleHysteresis;
			parameter__pPitchBrakeAngleHysteresis = (WTCParam)eResolveProxy(oldParameter__pPitchBrakeAngleHysteresis);
			if (parameter__pPitchBrakeAngleHysteresis != oldParameter__pPitchBrakeAngleHysteresis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_BRAKE_ANGLE_HYSTERESIS, oldParameter__pPitchBrakeAngleHysteresis, parameter__pPitchBrakeAngleHysteresis));
			}
		}
		return parameter__pPitchBrakeAngleHysteresis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPitchBrakeAngleHysteresis() {
		return parameter__pPitchBrakeAngleHysteresis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPitchBrakeAngleHysteresis(WTCParam newParameter__pPitchBrakeAngleHysteresis) {
		WTCParam oldParameter__pPitchBrakeAngleHysteresis = parameter__pPitchBrakeAngleHysteresis;
		parameter__pPitchBrakeAngleHysteresis = newParameter__pPitchBrakeAngleHysteresis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_BRAKE_ANGLE_HYSTERESIS, oldParameter__pPitchBrakeAngleHysteresis, parameter__pPitchBrakeAngleHysteresis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE1:
				if (resolve) return getInput__iPitchAngle1();
				return basicGetInput__iPitchAngle1();
			case WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE2:
				if (resolve) return getInput__iPitchAngle2();
				return basicGetInput__iPitchAngle2();
			case WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE3:
				if (resolve) return getInput__iPitchAngle3();
				return basicGetInput__iPitchAngle3();
			case WTSpecPackage.CTRL_UNIT85__OUTPUT_OPITCH_BRAKE_POSITION:
				if (resolve) return getOutput__oPitchBrakePosition();
				return basicGetOutput__oPitchBrakePosition();
			case WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_MAX_BRAKE_ANGLE:
				if (resolve) return getParameter__pPitchMaxBrakeAngle();
				return basicGetParameter__pPitchMaxBrakeAngle();
			case WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_MIN_BRAKE_ANGLE:
				if (resolve) return getParameter__pPitchMinBrakeAngle();
				return basicGetParameter__pPitchMinBrakeAngle();
			case WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_BRAKE_ANGLE_HYSTERESIS:
				if (resolve) return getParameter__pPitchBrakeAngleHysteresis();
				return basicGetParameter__pPitchBrakeAngleHysteresis();
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
			case WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE1:
				setInput__iPitchAngle1((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE2:
				setInput__iPitchAngle2((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE3:
				setInput__iPitchAngle3((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT85__OUTPUT_OPITCH_BRAKE_POSITION:
				setOutput__oPitchBrakePosition((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_MAX_BRAKE_ANGLE:
				setParameter__pPitchMaxBrakeAngle((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_MIN_BRAKE_ANGLE:
				setParameter__pPitchMinBrakeAngle((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_BRAKE_ANGLE_HYSTERESIS:
				setParameter__pPitchBrakeAngleHysteresis((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE1:
				setInput__iPitchAngle1((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE2:
				setInput__iPitchAngle2((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE3:
				setInput__iPitchAngle3((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT85__OUTPUT_OPITCH_BRAKE_POSITION:
				setOutput__oPitchBrakePosition((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_MAX_BRAKE_ANGLE:
				setParameter__pPitchMaxBrakeAngle((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_MIN_BRAKE_ANGLE:
				setParameter__pPitchMinBrakeAngle((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_BRAKE_ANGLE_HYSTERESIS:
				setParameter__pPitchBrakeAngleHysteresis((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE1:
				return input__iPitchAngle1 != null;
			case WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE2:
				return input__iPitchAngle2 != null;
			case WTSpecPackage.CTRL_UNIT85__INPUT_IPITCH_ANGLE3:
				return input__iPitchAngle3 != null;
			case WTSpecPackage.CTRL_UNIT85__OUTPUT_OPITCH_BRAKE_POSITION:
				return output__oPitchBrakePosition != null;
			case WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_MAX_BRAKE_ANGLE:
				return parameter__pPitchMaxBrakeAngle != null;
			case WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_MIN_BRAKE_ANGLE:
				return parameter__pPitchMinBrakeAngle != null;
			case WTSpecPackage.CTRL_UNIT85__PARAMETER_PPITCH_BRAKE_ANGLE_HYSTERESIS:
				return parameter__pPitchBrakeAngleHysteresis != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit85Impl
