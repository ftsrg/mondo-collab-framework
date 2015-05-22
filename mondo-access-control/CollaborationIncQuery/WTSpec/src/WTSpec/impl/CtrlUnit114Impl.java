/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit114;
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
 * An implementation of the model object '<em><b>Ctrl Unit114</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit114Impl#getInput__iWindDirectionRaw <em>Input iWind Direction Raw</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit114Impl#getInput__iNacelleDirection <em>Input iNacelle Direction</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit114Impl#getOutput__oWindDirection <em>Output oWind Direction</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit114Impl#getOutput__oWindDirectionAverage <em>Output oWind Direction Average</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit114Impl#getOutput__oWindDirectionDispAbsolute <em>Output oWind Direction Disp Absolute</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit114Impl#getOutput__oWindDirectionDispRelative <em>Output oWind Direction Disp Relative</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit114Impl#getParameter__pVaneOffset <em>Parameter pVane Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit114Impl extends wtcImpl implements CtrlUnit114 {
	/**
	 * The cached value of the '{@link #getInput__iWindDirectionRaw() <em>Input iWind Direction Raw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iWindDirectionRaw()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iWindDirectionRaw;

	/**
	 * The cached value of the '{@link #getInput__iNacelleDirection() <em>Input iNacelle Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iNacelleDirection()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iNacelleDirection;

	/**
	 * The cached value of the '{@link #getOutput__oWindDirection() <em>Output oWind Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oWindDirection()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oWindDirection;

	/**
	 * The cached value of the '{@link #getOutput__oWindDirectionAverage() <em>Output oWind Direction Average</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oWindDirectionAverage()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oWindDirectionAverage;

	/**
	 * The cached value of the '{@link #getOutput__oWindDirectionDispAbsolute() <em>Output oWind Direction Disp Absolute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oWindDirectionDispAbsolute()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oWindDirectionDispAbsolute;

	/**
	 * The cached value of the '{@link #getOutput__oWindDirectionDispRelative() <em>Output oWind Direction Disp Relative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oWindDirectionDispRelative()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oWindDirectionDispRelative;

	/**
	 * The cached value of the '{@link #getParameter__pVaneOffset() <em>Parameter pVane Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pVaneOffset()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pVaneOffset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit114Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT114;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iWindDirectionRaw() {
		if (input__iWindDirectionRaw != null && input__iWindDirectionRaw.eIsProxy()) {
			InternalEObject oldInput__iWindDirectionRaw = (InternalEObject)input__iWindDirectionRaw;
			input__iWindDirectionRaw = (WTCInput)eResolveProxy(oldInput__iWindDirectionRaw);
			if (input__iWindDirectionRaw != oldInput__iWindDirectionRaw) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT114__INPUT_IWIND_DIRECTION_RAW, oldInput__iWindDirectionRaw, input__iWindDirectionRaw));
			}
		}
		return input__iWindDirectionRaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iWindDirectionRaw() {
		return input__iWindDirectionRaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iWindDirectionRaw(WTCInput newInput__iWindDirectionRaw) {
		WTCInput oldInput__iWindDirectionRaw = input__iWindDirectionRaw;
		input__iWindDirectionRaw = newInput__iWindDirectionRaw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT114__INPUT_IWIND_DIRECTION_RAW, oldInput__iWindDirectionRaw, input__iWindDirectionRaw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iNacelleDirection() {
		if (input__iNacelleDirection != null && input__iNacelleDirection.eIsProxy()) {
			InternalEObject oldInput__iNacelleDirection = (InternalEObject)input__iNacelleDirection;
			input__iNacelleDirection = (WTCInput)eResolveProxy(oldInput__iNacelleDirection);
			if (input__iNacelleDirection != oldInput__iNacelleDirection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT114__INPUT_INACELLE_DIRECTION, oldInput__iNacelleDirection, input__iNacelleDirection));
			}
		}
		return input__iNacelleDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iNacelleDirection() {
		return input__iNacelleDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iNacelleDirection(WTCInput newInput__iNacelleDirection) {
		WTCInput oldInput__iNacelleDirection = input__iNacelleDirection;
		input__iNacelleDirection = newInput__iNacelleDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT114__INPUT_INACELLE_DIRECTION, oldInput__iNacelleDirection, input__iNacelleDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oWindDirection() {
		if (output__oWindDirection != null && output__oWindDirection.eIsProxy()) {
			InternalEObject oldOutput__oWindDirection = (InternalEObject)output__oWindDirection;
			output__oWindDirection = (WTCOutput)eResolveProxy(oldOutput__oWindDirection);
			if (output__oWindDirection != oldOutput__oWindDirection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION, oldOutput__oWindDirection, output__oWindDirection));
			}
		}
		return output__oWindDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oWindDirection() {
		return output__oWindDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oWindDirection(WTCOutput newOutput__oWindDirection) {
		WTCOutput oldOutput__oWindDirection = output__oWindDirection;
		output__oWindDirection = newOutput__oWindDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION, oldOutput__oWindDirection, output__oWindDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oWindDirectionAverage() {
		if (output__oWindDirectionAverage != null && output__oWindDirectionAverage.eIsProxy()) {
			InternalEObject oldOutput__oWindDirectionAverage = (InternalEObject)output__oWindDirectionAverage;
			output__oWindDirectionAverage = (WTCOutput)eResolveProxy(oldOutput__oWindDirectionAverage);
			if (output__oWindDirectionAverage != oldOutput__oWindDirectionAverage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_AVERAGE, oldOutput__oWindDirectionAverage, output__oWindDirectionAverage));
			}
		}
		return output__oWindDirectionAverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oWindDirectionAverage() {
		return output__oWindDirectionAverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oWindDirectionAverage(WTCOutput newOutput__oWindDirectionAverage) {
		WTCOutput oldOutput__oWindDirectionAverage = output__oWindDirectionAverage;
		output__oWindDirectionAverage = newOutput__oWindDirectionAverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_AVERAGE, oldOutput__oWindDirectionAverage, output__oWindDirectionAverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oWindDirectionDispAbsolute() {
		if (output__oWindDirectionDispAbsolute != null && output__oWindDirectionDispAbsolute.eIsProxy()) {
			InternalEObject oldOutput__oWindDirectionDispAbsolute = (InternalEObject)output__oWindDirectionDispAbsolute;
			output__oWindDirectionDispAbsolute = (WTCOutput)eResolveProxy(oldOutput__oWindDirectionDispAbsolute);
			if (output__oWindDirectionDispAbsolute != oldOutput__oWindDirectionDispAbsolute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_DISP_ABSOLUTE, oldOutput__oWindDirectionDispAbsolute, output__oWindDirectionDispAbsolute));
			}
		}
		return output__oWindDirectionDispAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oWindDirectionDispAbsolute() {
		return output__oWindDirectionDispAbsolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oWindDirectionDispAbsolute(WTCOutput newOutput__oWindDirectionDispAbsolute) {
		WTCOutput oldOutput__oWindDirectionDispAbsolute = output__oWindDirectionDispAbsolute;
		output__oWindDirectionDispAbsolute = newOutput__oWindDirectionDispAbsolute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_DISP_ABSOLUTE, oldOutput__oWindDirectionDispAbsolute, output__oWindDirectionDispAbsolute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oWindDirectionDispRelative() {
		if (output__oWindDirectionDispRelative != null && output__oWindDirectionDispRelative.eIsProxy()) {
			InternalEObject oldOutput__oWindDirectionDispRelative = (InternalEObject)output__oWindDirectionDispRelative;
			output__oWindDirectionDispRelative = (WTCOutput)eResolveProxy(oldOutput__oWindDirectionDispRelative);
			if (output__oWindDirectionDispRelative != oldOutput__oWindDirectionDispRelative) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_DISP_RELATIVE, oldOutput__oWindDirectionDispRelative, output__oWindDirectionDispRelative));
			}
		}
		return output__oWindDirectionDispRelative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oWindDirectionDispRelative() {
		return output__oWindDirectionDispRelative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oWindDirectionDispRelative(WTCOutput newOutput__oWindDirectionDispRelative) {
		WTCOutput oldOutput__oWindDirectionDispRelative = output__oWindDirectionDispRelative;
		output__oWindDirectionDispRelative = newOutput__oWindDirectionDispRelative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_DISP_RELATIVE, oldOutput__oWindDirectionDispRelative, output__oWindDirectionDispRelative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pVaneOffset() {
		if (parameter__pVaneOffset != null && parameter__pVaneOffset.eIsProxy()) {
			InternalEObject oldParameter__pVaneOffset = (InternalEObject)parameter__pVaneOffset;
			parameter__pVaneOffset = (WTCParam)eResolveProxy(oldParameter__pVaneOffset);
			if (parameter__pVaneOffset != oldParameter__pVaneOffset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT114__PARAMETER_PVANE_OFFSET, oldParameter__pVaneOffset, parameter__pVaneOffset));
			}
		}
		return parameter__pVaneOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pVaneOffset() {
		return parameter__pVaneOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pVaneOffset(WTCParam newParameter__pVaneOffset) {
		WTCParam oldParameter__pVaneOffset = parameter__pVaneOffset;
		parameter__pVaneOffset = newParameter__pVaneOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT114__PARAMETER_PVANE_OFFSET, oldParameter__pVaneOffset, parameter__pVaneOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT114__INPUT_IWIND_DIRECTION_RAW:
				if (resolve) return getInput__iWindDirectionRaw();
				return basicGetInput__iWindDirectionRaw();
			case WTSpecPackage.CTRL_UNIT114__INPUT_INACELLE_DIRECTION:
				if (resolve) return getInput__iNacelleDirection();
				return basicGetInput__iNacelleDirection();
			case WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION:
				if (resolve) return getOutput__oWindDirection();
				return basicGetOutput__oWindDirection();
			case WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_AVERAGE:
				if (resolve) return getOutput__oWindDirectionAverage();
				return basicGetOutput__oWindDirectionAverage();
			case WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_DISP_ABSOLUTE:
				if (resolve) return getOutput__oWindDirectionDispAbsolute();
				return basicGetOutput__oWindDirectionDispAbsolute();
			case WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_DISP_RELATIVE:
				if (resolve) return getOutput__oWindDirectionDispRelative();
				return basicGetOutput__oWindDirectionDispRelative();
			case WTSpecPackage.CTRL_UNIT114__PARAMETER_PVANE_OFFSET:
				if (resolve) return getParameter__pVaneOffset();
				return basicGetParameter__pVaneOffset();
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
			case WTSpecPackage.CTRL_UNIT114__INPUT_IWIND_DIRECTION_RAW:
				setInput__iWindDirectionRaw((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT114__INPUT_INACELLE_DIRECTION:
				setInput__iNacelleDirection((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION:
				setOutput__oWindDirection((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_AVERAGE:
				setOutput__oWindDirectionAverage((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_DISP_ABSOLUTE:
				setOutput__oWindDirectionDispAbsolute((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_DISP_RELATIVE:
				setOutput__oWindDirectionDispRelative((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT114__PARAMETER_PVANE_OFFSET:
				setParameter__pVaneOffset((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT114__INPUT_IWIND_DIRECTION_RAW:
				setInput__iWindDirectionRaw((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT114__INPUT_INACELLE_DIRECTION:
				setInput__iNacelleDirection((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION:
				setOutput__oWindDirection((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_AVERAGE:
				setOutput__oWindDirectionAverage((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_DISP_ABSOLUTE:
				setOutput__oWindDirectionDispAbsolute((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_DISP_RELATIVE:
				setOutput__oWindDirectionDispRelative((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT114__PARAMETER_PVANE_OFFSET:
				setParameter__pVaneOffset((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT114__INPUT_IWIND_DIRECTION_RAW:
				return input__iWindDirectionRaw != null;
			case WTSpecPackage.CTRL_UNIT114__INPUT_INACELLE_DIRECTION:
				return input__iNacelleDirection != null;
			case WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION:
				return output__oWindDirection != null;
			case WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_AVERAGE:
				return output__oWindDirectionAverage != null;
			case WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_DISP_ABSOLUTE:
				return output__oWindDirectionDispAbsolute != null;
			case WTSpecPackage.CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_DISP_RELATIVE:
				return output__oWindDirectionDispRelative != null;
			case WTSpecPackage.CTRL_UNIT114__PARAMETER_PVANE_OFFSET:
				return parameter__pVaneOffset != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit114Impl
