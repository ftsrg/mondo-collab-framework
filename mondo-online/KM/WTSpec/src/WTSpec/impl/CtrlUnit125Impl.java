/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit125;
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
 * An implementation of the model object '<em><b>Ctrl Unit125</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit125Impl#getInput__iInvRol <em>Input iInv Rol</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit125Impl#getOutput__oSpeedRef <em>Output oSpeed Ref</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit125Impl#getParameter__pSpeed <em>Parameter pSpeed</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit125Impl#getParameter__pOffset <em>Parameter pOffset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit125Impl extends wtcImpl implements CtrlUnit125 {
	/**
	 * The cached value of the '{@link #getInput__iInvRol() <em>Input iInv Rol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInvRol()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInvRol;

	/**
	 * The cached value of the '{@link #getOutput__oSpeedRef() <em>Output oSpeed Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oSpeedRef()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oSpeedRef;

	/**
	 * The cached value of the '{@link #getParameter__pSpeed() <em>Parameter pSpeed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pSpeed()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pSpeed;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit125Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit125();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInvRol() {
		if (input__iInvRol != null && input__iInvRol.eIsProxy()) {
			InternalEObject oldInput__iInvRol = (InternalEObject)input__iInvRol;
			input__iInvRol = (WTCInput)eResolveProxy(oldInput__iInvRol);
			if (input__iInvRol != oldInput__iInvRol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT125__INPUT_IINV_ROL, oldInput__iInvRol, input__iInvRol));
			}
		}
		return input__iInvRol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInvRol() {
		return input__iInvRol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInvRol(WTCInput newInput__iInvRol) {
		WTCInput oldInput__iInvRol = input__iInvRol;
		input__iInvRol = newInput__iInvRol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT125__INPUT_IINV_ROL, oldInput__iInvRol, input__iInvRol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oSpeedRef() {
		if (output__oSpeedRef != null && output__oSpeedRef.eIsProxy()) {
			InternalEObject oldOutput__oSpeedRef = (InternalEObject)output__oSpeedRef;
			output__oSpeedRef = (WTCOutput)eResolveProxy(oldOutput__oSpeedRef);
			if (output__oSpeedRef != oldOutput__oSpeedRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT125__OUTPUT_OSPEED_REF, oldOutput__oSpeedRef, output__oSpeedRef));
			}
		}
		return output__oSpeedRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oSpeedRef() {
		return output__oSpeedRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oSpeedRef(WTCOutput newOutput__oSpeedRef) {
		WTCOutput oldOutput__oSpeedRef = output__oSpeedRef;
		output__oSpeedRef = newOutput__oSpeedRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT125__OUTPUT_OSPEED_REF, oldOutput__oSpeedRef, output__oSpeedRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pSpeed() {
		if (parameter__pSpeed != null && parameter__pSpeed.eIsProxy()) {
			InternalEObject oldParameter__pSpeed = (InternalEObject)parameter__pSpeed;
			parameter__pSpeed = (WTCParam)eResolveProxy(oldParameter__pSpeed);
			if (parameter__pSpeed != oldParameter__pSpeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT125__PARAMETER_PSPEED, oldParameter__pSpeed, parameter__pSpeed));
			}
		}
		return parameter__pSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pSpeed() {
		return parameter__pSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pSpeed(WTCParam newParameter__pSpeed) {
		WTCParam oldParameter__pSpeed = parameter__pSpeed;
		parameter__pSpeed = newParameter__pSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT125__PARAMETER_PSPEED, oldParameter__pSpeed, parameter__pSpeed));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT125__PARAMETER_POFFSET, oldParameter__pOffset, parameter__pOffset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT125__PARAMETER_POFFSET, oldParameter__pOffset, parameter__pOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT125__INPUT_IINV_ROL:
				if (resolve) return getInput__iInvRol();
				return basicGetInput__iInvRol();
			case WTSpecPackage.CTRL_UNIT125__OUTPUT_OSPEED_REF:
				if (resolve) return getOutput__oSpeedRef();
				return basicGetOutput__oSpeedRef();
			case WTSpecPackage.CTRL_UNIT125__PARAMETER_PSPEED:
				if (resolve) return getParameter__pSpeed();
				return basicGetParameter__pSpeed();
			case WTSpecPackage.CTRL_UNIT125__PARAMETER_POFFSET:
				if (resolve) return getParameter__pOffset();
				return basicGetParameter__pOffset();
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
			case WTSpecPackage.CTRL_UNIT125__INPUT_IINV_ROL:
				setInput__iInvRol((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT125__OUTPUT_OSPEED_REF:
				setOutput__oSpeedRef((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT125__PARAMETER_PSPEED:
				setParameter__pSpeed((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT125__PARAMETER_POFFSET:
				setParameter__pOffset((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT125__INPUT_IINV_ROL:
				setInput__iInvRol((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT125__OUTPUT_OSPEED_REF:
				setOutput__oSpeedRef((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT125__PARAMETER_PSPEED:
				setParameter__pSpeed((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT125__PARAMETER_POFFSET:
				setParameter__pOffset((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT125__INPUT_IINV_ROL:
				return input__iInvRol != null;
			case WTSpecPackage.CTRL_UNIT125__OUTPUT_OSPEED_REF:
				return output__oSpeedRef != null;
			case WTSpecPackage.CTRL_UNIT125__PARAMETER_PSPEED:
				return parameter__pSpeed != null;
			case WTSpecPackage.CTRL_UNIT125__PARAMETER_POFFSET:
				return parameter__pOffset != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit125Impl
