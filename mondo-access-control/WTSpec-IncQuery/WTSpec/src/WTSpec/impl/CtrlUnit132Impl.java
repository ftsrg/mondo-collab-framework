/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit132;
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
 * An implementation of the model object '<em><b>Ctrl Unit132</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit132Impl#getInput__iTeeth1 <em>Input iTeeth1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit132Impl#getInput__iTeeth2 <em>Input iTeeth2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit132Impl#getInput__iTwistAngle <em>Input iTwist Angle</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit132Impl#getOutput__oTwistAngle <em>Output oTwist Angle</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit132Impl#getParameter__pDegreesPerPulse <em>Parameter pDegrees Per Pulse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit132Impl extends wtcImpl implements CtrlUnit132 {
	/**
	 * The cached value of the '{@link #getInput__iTeeth1() <em>Input iTeeth1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iTeeth1()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iTeeth1;

	/**
	 * The cached value of the '{@link #getInput__iTeeth2() <em>Input iTeeth2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iTeeth2()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iTeeth2;

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
	 * The cached value of the '{@link #getOutput__oTwistAngle() <em>Output oTwist Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oTwistAngle()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oTwistAngle;

	/**
	 * The cached value of the '{@link #getParameter__pDegreesPerPulse() <em>Parameter pDegrees Per Pulse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pDegreesPerPulse()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pDegreesPerPulse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit132Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT132;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iTeeth1() {
		if (input__iTeeth1 != null && input__iTeeth1.eIsProxy()) {
			InternalEObject oldInput__iTeeth1 = (InternalEObject)input__iTeeth1;
			input__iTeeth1 = (WTCInput)eResolveProxy(oldInput__iTeeth1);
			if (input__iTeeth1 != oldInput__iTeeth1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT132__INPUT_ITEETH1, oldInput__iTeeth1, input__iTeeth1));
			}
		}
		return input__iTeeth1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iTeeth1() {
		return input__iTeeth1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iTeeth1(WTCInput newInput__iTeeth1) {
		WTCInput oldInput__iTeeth1 = input__iTeeth1;
		input__iTeeth1 = newInput__iTeeth1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT132__INPUT_ITEETH1, oldInput__iTeeth1, input__iTeeth1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iTeeth2() {
		if (input__iTeeth2 != null && input__iTeeth2.eIsProxy()) {
			InternalEObject oldInput__iTeeth2 = (InternalEObject)input__iTeeth2;
			input__iTeeth2 = (WTCInput)eResolveProxy(oldInput__iTeeth2);
			if (input__iTeeth2 != oldInput__iTeeth2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT132__INPUT_ITEETH2, oldInput__iTeeth2, input__iTeeth2));
			}
		}
		return input__iTeeth2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iTeeth2() {
		return input__iTeeth2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iTeeth2(WTCInput newInput__iTeeth2) {
		WTCInput oldInput__iTeeth2 = input__iTeeth2;
		input__iTeeth2 = newInput__iTeeth2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT132__INPUT_ITEETH2, oldInput__iTeeth2, input__iTeeth2));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT132__INPUT_ITWIST_ANGLE, oldInput__iTwistAngle, input__iTwistAngle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT132__INPUT_ITWIST_ANGLE, oldInput__iTwistAngle, input__iTwistAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oTwistAngle() {
		if (output__oTwistAngle != null && output__oTwistAngle.eIsProxy()) {
			InternalEObject oldOutput__oTwistAngle = (InternalEObject)output__oTwistAngle;
			output__oTwistAngle = (WTCOutput)eResolveProxy(oldOutput__oTwistAngle);
			if (output__oTwistAngle != oldOutput__oTwistAngle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT132__OUTPUT_OTWIST_ANGLE, oldOutput__oTwistAngle, output__oTwistAngle));
			}
		}
		return output__oTwistAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oTwistAngle() {
		return output__oTwistAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oTwistAngle(WTCOutput newOutput__oTwistAngle) {
		WTCOutput oldOutput__oTwistAngle = output__oTwistAngle;
		output__oTwistAngle = newOutput__oTwistAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT132__OUTPUT_OTWIST_ANGLE, oldOutput__oTwistAngle, output__oTwistAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pDegreesPerPulse() {
		if (parameter__pDegreesPerPulse != null && parameter__pDegreesPerPulse.eIsProxy()) {
			InternalEObject oldParameter__pDegreesPerPulse = (InternalEObject)parameter__pDegreesPerPulse;
			parameter__pDegreesPerPulse = (WTCParam)eResolveProxy(oldParameter__pDegreesPerPulse);
			if (parameter__pDegreesPerPulse != oldParameter__pDegreesPerPulse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT132__PARAMETER_PDEGREES_PER_PULSE, oldParameter__pDegreesPerPulse, parameter__pDegreesPerPulse));
			}
		}
		return parameter__pDegreesPerPulse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pDegreesPerPulse() {
		return parameter__pDegreesPerPulse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pDegreesPerPulse(WTCParam newParameter__pDegreesPerPulse) {
		WTCParam oldParameter__pDegreesPerPulse = parameter__pDegreesPerPulse;
		parameter__pDegreesPerPulse = newParameter__pDegreesPerPulse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT132__PARAMETER_PDEGREES_PER_PULSE, oldParameter__pDegreesPerPulse, parameter__pDegreesPerPulse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT132__INPUT_ITEETH1:
				if (resolve) return getInput__iTeeth1();
				return basicGetInput__iTeeth1();
			case WTSpecPackage.CTRL_UNIT132__INPUT_ITEETH2:
				if (resolve) return getInput__iTeeth2();
				return basicGetInput__iTeeth2();
			case WTSpecPackage.CTRL_UNIT132__INPUT_ITWIST_ANGLE:
				if (resolve) return getInput__iTwistAngle();
				return basicGetInput__iTwistAngle();
			case WTSpecPackage.CTRL_UNIT132__OUTPUT_OTWIST_ANGLE:
				if (resolve) return getOutput__oTwistAngle();
				return basicGetOutput__oTwistAngle();
			case WTSpecPackage.CTRL_UNIT132__PARAMETER_PDEGREES_PER_PULSE:
				if (resolve) return getParameter__pDegreesPerPulse();
				return basicGetParameter__pDegreesPerPulse();
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
			case WTSpecPackage.CTRL_UNIT132__INPUT_ITEETH1:
				setInput__iTeeth1((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT132__INPUT_ITEETH2:
				setInput__iTeeth2((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT132__INPUT_ITWIST_ANGLE:
				setInput__iTwistAngle((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT132__OUTPUT_OTWIST_ANGLE:
				setOutput__oTwistAngle((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT132__PARAMETER_PDEGREES_PER_PULSE:
				setParameter__pDegreesPerPulse((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT132__INPUT_ITEETH1:
				setInput__iTeeth1((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT132__INPUT_ITEETH2:
				setInput__iTeeth2((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT132__INPUT_ITWIST_ANGLE:
				setInput__iTwistAngle((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT132__OUTPUT_OTWIST_ANGLE:
				setOutput__oTwistAngle((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT132__PARAMETER_PDEGREES_PER_PULSE:
				setParameter__pDegreesPerPulse((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT132__INPUT_ITEETH1:
				return input__iTeeth1 != null;
			case WTSpecPackage.CTRL_UNIT132__INPUT_ITEETH2:
				return input__iTeeth2 != null;
			case WTSpecPackage.CTRL_UNIT132__INPUT_ITWIST_ANGLE:
				return input__iTwistAngle != null;
			case WTSpecPackage.CTRL_UNIT132__OUTPUT_OTWIST_ANGLE:
				return output__oTwistAngle != null;
			case WTSpecPackage.CTRL_UNIT132__PARAMETER_PDEGREES_PER_PULSE:
				return parameter__pDegreesPerPulse != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit132Impl
