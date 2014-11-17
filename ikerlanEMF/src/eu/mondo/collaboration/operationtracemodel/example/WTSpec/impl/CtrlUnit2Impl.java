/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit2;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCParam;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit2Impl#getInput__iTwistAngle <em>Input iTwist Angle</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit2Impl#getOutput__oNorthDirection <em>Output oNorth Direction</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit2Impl#getParameter__pNorthOffset <em>Parameter pNorth Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit2Impl extends wtcImpl implements CtrlUnit2 {
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
	 * The cached value of the '{@link #getOutput__oNorthDirection() <em>Output oNorth Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oNorthDirection()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oNorthDirection;

	/**
	 * The cached value of the '{@link #getParameter__pNorthOffset() <em>Parameter pNorth Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pNorthOffset()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pNorthOffset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit2();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT2__INPUT_ITWIST_ANGLE, oldInput__iTwistAngle, input__iTwistAngle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT2__INPUT_ITWIST_ANGLE, oldInput__iTwistAngle, input__iTwistAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oNorthDirection() {
		if (output__oNorthDirection != null && output__oNorthDirection.eIsProxy()) {
			InternalEObject oldOutput__oNorthDirection = (InternalEObject)output__oNorthDirection;
			output__oNorthDirection = (WTCOutput)eResolveProxy(oldOutput__oNorthDirection);
			if (output__oNorthDirection != oldOutput__oNorthDirection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT2__OUTPUT_ONORTH_DIRECTION, oldOutput__oNorthDirection, output__oNorthDirection));
			}
		}
		return output__oNorthDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oNorthDirection() {
		return output__oNorthDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oNorthDirection(WTCOutput newOutput__oNorthDirection) {
		WTCOutput oldOutput__oNorthDirection = output__oNorthDirection;
		output__oNorthDirection = newOutput__oNorthDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT2__OUTPUT_ONORTH_DIRECTION, oldOutput__oNorthDirection, output__oNorthDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pNorthOffset() {
		if (parameter__pNorthOffset != null && parameter__pNorthOffset.eIsProxy()) {
			InternalEObject oldParameter__pNorthOffset = (InternalEObject)parameter__pNorthOffset;
			parameter__pNorthOffset = (WTCParam)eResolveProxy(oldParameter__pNorthOffset);
			if (parameter__pNorthOffset != oldParameter__pNorthOffset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT2__PARAMETER_PNORTH_OFFSET, oldParameter__pNorthOffset, parameter__pNorthOffset));
			}
		}
		return parameter__pNorthOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pNorthOffset() {
		return parameter__pNorthOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pNorthOffset(WTCParam newParameter__pNorthOffset) {
		WTCParam oldParameter__pNorthOffset = parameter__pNorthOffset;
		parameter__pNorthOffset = newParameter__pNorthOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT2__PARAMETER_PNORTH_OFFSET, oldParameter__pNorthOffset, parameter__pNorthOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT2__INPUT_ITWIST_ANGLE:
				if (resolve) return getInput__iTwistAngle();
				return basicGetInput__iTwistAngle();
			case WTSpecPackage.CTRL_UNIT2__OUTPUT_ONORTH_DIRECTION:
				if (resolve) return getOutput__oNorthDirection();
				return basicGetOutput__oNorthDirection();
			case WTSpecPackage.CTRL_UNIT2__PARAMETER_PNORTH_OFFSET:
				if (resolve) return getParameter__pNorthOffset();
				return basicGetParameter__pNorthOffset();
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
			case WTSpecPackage.CTRL_UNIT2__INPUT_ITWIST_ANGLE:
				setInput__iTwistAngle((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT2__OUTPUT_ONORTH_DIRECTION:
				setOutput__oNorthDirection((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT2__PARAMETER_PNORTH_OFFSET:
				setParameter__pNorthOffset((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT2__INPUT_ITWIST_ANGLE:
				setInput__iTwistAngle((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT2__OUTPUT_ONORTH_DIRECTION:
				setOutput__oNorthDirection((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT2__PARAMETER_PNORTH_OFFSET:
				setParameter__pNorthOffset((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT2__INPUT_ITWIST_ANGLE:
				return input__iTwistAngle != null;
			case WTSpecPackage.CTRL_UNIT2__OUTPUT_ONORTH_DIRECTION:
				return output__oNorthDirection != null;
			case WTSpecPackage.CTRL_UNIT2__PARAMETER_PNORTH_OFFSET:
				return parameter__pNorthOffset != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit2Impl
