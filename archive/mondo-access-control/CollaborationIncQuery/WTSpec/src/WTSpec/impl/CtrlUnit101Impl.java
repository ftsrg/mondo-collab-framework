/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit101;
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
 * An implementation of the model object '<em><b>Ctrl Unit101</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit101Impl#getInput__iSpeed <em>Input iSpeed</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit101Impl#getInput__iPosition <em>Input iPosition</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit101Impl#getOutput__oSpeed <em>Output oSpeed</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit101Impl#getOutput__oSpeedMonitoring <em>Output oSpeed Monitoring</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit101Impl#getParameter__pOffset <em>Parameter pOffset</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit101Impl#getParameter__pConversionFactor <em>Parameter pConversion Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit101Impl extends wtcImpl implements CtrlUnit101 {
	/**
	 * The cached value of the '{@link #getInput__iSpeed() <em>Input iSpeed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iSpeed()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iSpeed;

	/**
	 * The cached value of the '{@link #getInput__iPosition() <em>Input iPosition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPosition()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPosition;

	/**
	 * The cached value of the '{@link #getOutput__oSpeed() <em>Output oSpeed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oSpeed()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oSpeed;

	/**
	 * The cached value of the '{@link #getOutput__oSpeedMonitoring() <em>Output oSpeed Monitoring</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oSpeedMonitoring()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oSpeedMonitoring;

	/**
	 * The cached value of the '{@link #getParameter__pOffset() <em>Parameter pOffset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pOffset()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pOffset;

	/**
	 * The cached value of the '{@link #getParameter__pConversionFactor() <em>Parameter pConversion Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pConversionFactor()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pConversionFactor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit101Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT101;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iSpeed() {
		if (input__iSpeed != null && input__iSpeed.eIsProxy()) {
			InternalEObject oldInput__iSpeed = (InternalEObject)input__iSpeed;
			input__iSpeed = (WTCInput)eResolveProxy(oldInput__iSpeed);
			if (input__iSpeed != oldInput__iSpeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT101__INPUT_ISPEED, oldInput__iSpeed, input__iSpeed));
			}
		}
		return input__iSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iSpeed() {
		return input__iSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iSpeed(WTCInput newInput__iSpeed) {
		WTCInput oldInput__iSpeed = input__iSpeed;
		input__iSpeed = newInput__iSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT101__INPUT_ISPEED, oldInput__iSpeed, input__iSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPosition() {
		if (input__iPosition != null && input__iPosition.eIsProxy()) {
			InternalEObject oldInput__iPosition = (InternalEObject)input__iPosition;
			input__iPosition = (WTCInput)eResolveProxy(oldInput__iPosition);
			if (input__iPosition != oldInput__iPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT101__INPUT_IPOSITION, oldInput__iPosition, input__iPosition));
			}
		}
		return input__iPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPosition() {
		return input__iPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPosition(WTCInput newInput__iPosition) {
		WTCInput oldInput__iPosition = input__iPosition;
		input__iPosition = newInput__iPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT101__INPUT_IPOSITION, oldInput__iPosition, input__iPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oSpeed() {
		if (output__oSpeed != null && output__oSpeed.eIsProxy()) {
			InternalEObject oldOutput__oSpeed = (InternalEObject)output__oSpeed;
			output__oSpeed = (WTCOutput)eResolveProxy(oldOutput__oSpeed);
			if (output__oSpeed != oldOutput__oSpeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT101__OUTPUT_OSPEED, oldOutput__oSpeed, output__oSpeed));
			}
		}
		return output__oSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oSpeed() {
		return output__oSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oSpeed(WTCOutput newOutput__oSpeed) {
		WTCOutput oldOutput__oSpeed = output__oSpeed;
		output__oSpeed = newOutput__oSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT101__OUTPUT_OSPEED, oldOutput__oSpeed, output__oSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oSpeedMonitoring() {
		if (output__oSpeedMonitoring != null && output__oSpeedMonitoring.eIsProxy()) {
			InternalEObject oldOutput__oSpeedMonitoring = (InternalEObject)output__oSpeedMonitoring;
			output__oSpeedMonitoring = (WTCOutput)eResolveProxy(oldOutput__oSpeedMonitoring);
			if (output__oSpeedMonitoring != oldOutput__oSpeedMonitoring) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT101__OUTPUT_OSPEED_MONITORING, oldOutput__oSpeedMonitoring, output__oSpeedMonitoring));
			}
		}
		return output__oSpeedMonitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oSpeedMonitoring() {
		return output__oSpeedMonitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oSpeedMonitoring(WTCOutput newOutput__oSpeedMonitoring) {
		WTCOutput oldOutput__oSpeedMonitoring = output__oSpeedMonitoring;
		output__oSpeedMonitoring = newOutput__oSpeedMonitoring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT101__OUTPUT_OSPEED_MONITORING, oldOutput__oSpeedMonitoring, output__oSpeedMonitoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pOffset() {
		if (parameter__pOffset != null && parameter__pOffset.eIsProxy()) {
			InternalEObject oldParameter__pOffset = (InternalEObject)parameter__pOffset;
			parameter__pOffset = (WTCParam)eResolveProxy(oldParameter__pOffset);
			if (parameter__pOffset != oldParameter__pOffset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT101__PARAMETER_POFFSET, oldParameter__pOffset, parameter__pOffset));
			}
		}
		return parameter__pOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pOffset() {
		return parameter__pOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pOffset(WTCParam newParameter__pOffset) {
		WTCParam oldParameter__pOffset = parameter__pOffset;
		parameter__pOffset = newParameter__pOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT101__PARAMETER_POFFSET, oldParameter__pOffset, parameter__pOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pConversionFactor() {
		if (parameter__pConversionFactor != null && parameter__pConversionFactor.eIsProxy()) {
			InternalEObject oldParameter__pConversionFactor = (InternalEObject)parameter__pConversionFactor;
			parameter__pConversionFactor = (WTCParam)eResolveProxy(oldParameter__pConversionFactor);
			if (parameter__pConversionFactor != oldParameter__pConversionFactor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT101__PARAMETER_PCONVERSION_FACTOR, oldParameter__pConversionFactor, parameter__pConversionFactor));
			}
		}
		return parameter__pConversionFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pConversionFactor() {
		return parameter__pConversionFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pConversionFactor(WTCParam newParameter__pConversionFactor) {
		WTCParam oldParameter__pConversionFactor = parameter__pConversionFactor;
		parameter__pConversionFactor = newParameter__pConversionFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT101__PARAMETER_PCONVERSION_FACTOR, oldParameter__pConversionFactor, parameter__pConversionFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT101__INPUT_ISPEED:
				if (resolve) return getInput__iSpeed();
				return basicGetInput__iSpeed();
			case WTSpecPackage.CTRL_UNIT101__INPUT_IPOSITION:
				if (resolve) return getInput__iPosition();
				return basicGetInput__iPosition();
			case WTSpecPackage.CTRL_UNIT101__OUTPUT_OSPEED:
				if (resolve) return getOutput__oSpeed();
				return basicGetOutput__oSpeed();
			case WTSpecPackage.CTRL_UNIT101__OUTPUT_OSPEED_MONITORING:
				if (resolve) return getOutput__oSpeedMonitoring();
				return basicGetOutput__oSpeedMonitoring();
			case WTSpecPackage.CTRL_UNIT101__PARAMETER_POFFSET:
				if (resolve) return getParameter__pOffset();
				return basicGetParameter__pOffset();
			case WTSpecPackage.CTRL_UNIT101__PARAMETER_PCONVERSION_FACTOR:
				if (resolve) return getParameter__pConversionFactor();
				return basicGetParameter__pConversionFactor();
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
			case WTSpecPackage.CTRL_UNIT101__INPUT_ISPEED:
				setInput__iSpeed((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT101__INPUT_IPOSITION:
				setInput__iPosition((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT101__OUTPUT_OSPEED:
				setOutput__oSpeed((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT101__OUTPUT_OSPEED_MONITORING:
				setOutput__oSpeedMonitoring((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT101__PARAMETER_POFFSET:
				setParameter__pOffset((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT101__PARAMETER_PCONVERSION_FACTOR:
				setParameter__pConversionFactor((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT101__INPUT_ISPEED:
				setInput__iSpeed((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT101__INPUT_IPOSITION:
				setInput__iPosition((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT101__OUTPUT_OSPEED:
				setOutput__oSpeed((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT101__OUTPUT_OSPEED_MONITORING:
				setOutput__oSpeedMonitoring((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT101__PARAMETER_POFFSET:
				setParameter__pOffset((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT101__PARAMETER_PCONVERSION_FACTOR:
				setParameter__pConversionFactor((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT101__INPUT_ISPEED:
				return input__iSpeed != null;
			case WTSpecPackage.CTRL_UNIT101__INPUT_IPOSITION:
				return input__iPosition != null;
			case WTSpecPackage.CTRL_UNIT101__OUTPUT_OSPEED:
				return output__oSpeed != null;
			case WTSpecPackage.CTRL_UNIT101__OUTPUT_OSPEED_MONITORING:
				return output__oSpeedMonitoring != null;
			case WTSpecPackage.CTRL_UNIT101__PARAMETER_POFFSET:
				return parameter__pOffset != null;
			case WTSpecPackage.CTRL_UNIT101__PARAMETER_PCONVERSION_FACTOR:
				return parameter__pConversionFactor != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit101Impl
