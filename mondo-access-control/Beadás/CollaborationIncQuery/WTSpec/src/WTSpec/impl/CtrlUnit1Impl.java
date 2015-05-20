/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit1;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit1Impl#getInput__iTwistAngle <em>Input iTwist Angle</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit1Impl#getOutput__oNacelleDirection <em>Output oNacelle Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit1Impl extends wtcImpl implements CtrlUnit1 {
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
	 * The cached value of the '{@link #getOutput__oNacelleDirection() <em>Output oNacelle Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oNacelleDirection()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oNacelleDirection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT1;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT1__INPUT_ITWIST_ANGLE, oldInput__iTwistAngle, input__iTwistAngle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT1__INPUT_ITWIST_ANGLE, oldInput__iTwistAngle, input__iTwistAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oNacelleDirection() {
		if (output__oNacelleDirection != null && output__oNacelleDirection.eIsProxy()) {
			InternalEObject oldOutput__oNacelleDirection = (InternalEObject)output__oNacelleDirection;
			output__oNacelleDirection = (WTCOutput)eResolveProxy(oldOutput__oNacelleDirection);
			if (output__oNacelleDirection != oldOutput__oNacelleDirection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT1__OUTPUT_ONACELLE_DIRECTION, oldOutput__oNacelleDirection, output__oNacelleDirection));
			}
		}
		return output__oNacelleDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oNacelleDirection() {
		return output__oNacelleDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oNacelleDirection(WTCOutput newOutput__oNacelleDirection) {
		WTCOutput oldOutput__oNacelleDirection = output__oNacelleDirection;
		output__oNacelleDirection = newOutput__oNacelleDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT1__OUTPUT_ONACELLE_DIRECTION, oldOutput__oNacelleDirection, output__oNacelleDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT1__INPUT_ITWIST_ANGLE:
				if (resolve) return getInput__iTwistAngle();
				return basicGetInput__iTwistAngle();
			case WTSpecPackage.CTRL_UNIT1__OUTPUT_ONACELLE_DIRECTION:
				if (resolve) return getOutput__oNacelleDirection();
				return basicGetOutput__oNacelleDirection();
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
			case WTSpecPackage.CTRL_UNIT1__INPUT_ITWIST_ANGLE:
				setInput__iTwistAngle((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT1__OUTPUT_ONACELLE_DIRECTION:
				setOutput__oNacelleDirection((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT1__INPUT_ITWIST_ANGLE:
				setInput__iTwistAngle((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT1__OUTPUT_ONACELLE_DIRECTION:
				setOutput__oNacelleDirection((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT1__INPUT_ITWIST_ANGLE:
				return input__iTwistAngle != null;
			case WTSpecPackage.CTRL_UNIT1__OUTPUT_ONACELLE_DIRECTION:
				return output__oNacelleDirection != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit1Impl
