/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit124;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit124</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit124Impl#getInput__iTorqueVal <em>Input iTorque Val</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit124Impl#getInput__iRolConverter <em>Input iRol Converter</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit124Impl#getOutput__oTorqueRef <em>Output oTorque Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit124Impl extends wtcImpl implements CtrlUnit124 {
	/**
	 * The cached value of the '{@link #getInput__iTorqueVal() <em>Input iTorque Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iTorqueVal()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iTorqueVal;

	/**
	 * The cached value of the '{@link #getInput__iRolConverter() <em>Input iRol Converter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iRolConverter()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iRolConverter;

	/**
	 * The cached value of the '{@link #getOutput__oTorqueRef() <em>Output oTorque Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oTorqueRef()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oTorqueRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit124Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT124;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iTorqueVal() {
		if (input__iTorqueVal != null && input__iTorqueVal.eIsProxy()) {
			InternalEObject oldInput__iTorqueVal = (InternalEObject)input__iTorqueVal;
			input__iTorqueVal = (WTCInput)eResolveProxy(oldInput__iTorqueVal);
			if (input__iTorqueVal != oldInput__iTorqueVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT124__INPUT_ITORQUE_VAL, oldInput__iTorqueVal, input__iTorqueVal));
			}
		}
		return input__iTorqueVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iTorqueVal() {
		return input__iTorqueVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iTorqueVal(WTCInput newInput__iTorqueVal) {
		WTCInput oldInput__iTorqueVal = input__iTorqueVal;
		input__iTorqueVal = newInput__iTorqueVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT124__INPUT_ITORQUE_VAL, oldInput__iTorqueVal, input__iTorqueVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iRolConverter() {
		if (input__iRolConverter != null && input__iRolConverter.eIsProxy()) {
			InternalEObject oldInput__iRolConverter = (InternalEObject)input__iRolConverter;
			input__iRolConverter = (WTCInput)eResolveProxy(oldInput__iRolConverter);
			if (input__iRolConverter != oldInput__iRolConverter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT124__INPUT_IROL_CONVERTER, oldInput__iRolConverter, input__iRolConverter));
			}
		}
		return input__iRolConverter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iRolConverter() {
		return input__iRolConverter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iRolConverter(WTCInput newInput__iRolConverter) {
		WTCInput oldInput__iRolConverter = input__iRolConverter;
		input__iRolConverter = newInput__iRolConverter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT124__INPUT_IROL_CONVERTER, oldInput__iRolConverter, input__iRolConverter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oTorqueRef() {
		if (output__oTorqueRef != null && output__oTorqueRef.eIsProxy()) {
			InternalEObject oldOutput__oTorqueRef = (InternalEObject)output__oTorqueRef;
			output__oTorqueRef = (WTCOutput)eResolveProxy(oldOutput__oTorqueRef);
			if (output__oTorqueRef != oldOutput__oTorqueRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT124__OUTPUT_OTORQUE_REF, oldOutput__oTorqueRef, output__oTorqueRef));
			}
		}
		return output__oTorqueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oTorqueRef() {
		return output__oTorqueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oTorqueRef(WTCOutput newOutput__oTorqueRef) {
		WTCOutput oldOutput__oTorqueRef = output__oTorqueRef;
		output__oTorqueRef = newOutput__oTorqueRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT124__OUTPUT_OTORQUE_REF, oldOutput__oTorqueRef, output__oTorqueRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT124__INPUT_ITORQUE_VAL:
				if (resolve) return getInput__iTorqueVal();
				return basicGetInput__iTorqueVal();
			case WTSpecPackage.CTRL_UNIT124__INPUT_IROL_CONVERTER:
				if (resolve) return getInput__iRolConverter();
				return basicGetInput__iRolConverter();
			case WTSpecPackage.CTRL_UNIT124__OUTPUT_OTORQUE_REF:
				if (resolve) return getOutput__oTorqueRef();
				return basicGetOutput__oTorqueRef();
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
			case WTSpecPackage.CTRL_UNIT124__INPUT_ITORQUE_VAL:
				setInput__iTorqueVal((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT124__INPUT_IROL_CONVERTER:
				setInput__iRolConverter((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT124__OUTPUT_OTORQUE_REF:
				setOutput__oTorqueRef((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT124__INPUT_ITORQUE_VAL:
				setInput__iTorqueVal((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT124__INPUT_IROL_CONVERTER:
				setInput__iRolConverter((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT124__OUTPUT_OTORQUE_REF:
				setOutput__oTorqueRef((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT124__INPUT_ITORQUE_VAL:
				return input__iTorqueVal != null;
			case WTSpecPackage.CTRL_UNIT124__INPUT_IROL_CONVERTER:
				return input__iRolConverter != null;
			case WTSpecPackage.CTRL_UNIT124__OUTPUT_OTORQUE_REF:
				return output__oTorqueRef != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit124Impl
