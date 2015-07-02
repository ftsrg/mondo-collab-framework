/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit115;
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
 * An implementation of the model object '<em><b>Ctrl Unit115</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit115Impl#getInput__iWindSpeedRaw <em>Input iWind Speed Raw</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit115Impl#getOutput__oWindSpeed <em>Output oWind Speed</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit115Impl#getOutput__oWindSpeedAverage <em>Output oWind Speed Average</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit115Impl#getParameter__pNacelleSlope <em>Parameter pNacelle Slope</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit115Impl#getParameter__pNacelleOffset <em>Parameter pNacelle Offset</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit115Impl#getParameter__pWindSpeedAveragePeriod <em>Parameter pWind Speed Average Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit115Impl extends wtcImpl implements CtrlUnit115 {
	/**
	 * The cached value of the '{@link #getInput__iWindSpeedRaw() <em>Input iWind Speed Raw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iWindSpeedRaw()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iWindSpeedRaw;

	/**
	 * The cached value of the '{@link #getOutput__oWindSpeed() <em>Output oWind Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oWindSpeed()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oWindSpeed;

	/**
	 * The cached value of the '{@link #getOutput__oWindSpeedAverage() <em>Output oWind Speed Average</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oWindSpeedAverage()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oWindSpeedAverage;

	/**
	 * The cached value of the '{@link #getParameter__pNacelleSlope() <em>Parameter pNacelle Slope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pNacelleSlope()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pNacelleSlope;

	/**
	 * The cached value of the '{@link #getParameter__pNacelleOffset() <em>Parameter pNacelle Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pNacelleOffset()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pNacelleOffset;

	/**
	 * The cached value of the '{@link #getParameter__pWindSpeedAveragePeriod() <em>Parameter pWind Speed Average Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pWindSpeedAveragePeriod()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pWindSpeedAveragePeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit115Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit115();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iWindSpeedRaw() {
		if (input__iWindSpeedRaw != null && input__iWindSpeedRaw.eIsProxy()) {
			InternalEObject oldInput__iWindSpeedRaw = (InternalEObject)input__iWindSpeedRaw;
			input__iWindSpeedRaw = (WTCInput)eResolveProxy(oldInput__iWindSpeedRaw);
			if (input__iWindSpeedRaw != oldInput__iWindSpeedRaw) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT115__INPUT_IWIND_SPEED_RAW, oldInput__iWindSpeedRaw, input__iWindSpeedRaw));
			}
		}
		return input__iWindSpeedRaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iWindSpeedRaw() {
		return input__iWindSpeedRaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iWindSpeedRaw(WTCInput newInput__iWindSpeedRaw) {
		WTCInput oldInput__iWindSpeedRaw = input__iWindSpeedRaw;
		input__iWindSpeedRaw = newInput__iWindSpeedRaw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT115__INPUT_IWIND_SPEED_RAW, oldInput__iWindSpeedRaw, input__iWindSpeedRaw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oWindSpeed() {
		if (output__oWindSpeed != null && output__oWindSpeed.eIsProxy()) {
			InternalEObject oldOutput__oWindSpeed = (InternalEObject)output__oWindSpeed;
			output__oWindSpeed = (WTCOutput)eResolveProxy(oldOutput__oWindSpeed);
			if (output__oWindSpeed != oldOutput__oWindSpeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT115__OUTPUT_OWIND_SPEED, oldOutput__oWindSpeed, output__oWindSpeed));
			}
		}
		return output__oWindSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oWindSpeed() {
		return output__oWindSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oWindSpeed(WTCOutput newOutput__oWindSpeed) {
		WTCOutput oldOutput__oWindSpeed = output__oWindSpeed;
		output__oWindSpeed = newOutput__oWindSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT115__OUTPUT_OWIND_SPEED, oldOutput__oWindSpeed, output__oWindSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oWindSpeedAverage() {
		if (output__oWindSpeedAverage != null && output__oWindSpeedAverage.eIsProxy()) {
			InternalEObject oldOutput__oWindSpeedAverage = (InternalEObject)output__oWindSpeedAverage;
			output__oWindSpeedAverage = (WTCOutput)eResolveProxy(oldOutput__oWindSpeedAverage);
			if (output__oWindSpeedAverage != oldOutput__oWindSpeedAverage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT115__OUTPUT_OWIND_SPEED_AVERAGE, oldOutput__oWindSpeedAverage, output__oWindSpeedAverage));
			}
		}
		return output__oWindSpeedAverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oWindSpeedAverage() {
		return output__oWindSpeedAverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oWindSpeedAverage(WTCOutput newOutput__oWindSpeedAverage) {
		WTCOutput oldOutput__oWindSpeedAverage = output__oWindSpeedAverage;
		output__oWindSpeedAverage = newOutput__oWindSpeedAverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT115__OUTPUT_OWIND_SPEED_AVERAGE, oldOutput__oWindSpeedAverage, output__oWindSpeedAverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pNacelleSlope() {
		if (parameter__pNacelleSlope != null && parameter__pNacelleSlope.eIsProxy()) {
			InternalEObject oldParameter__pNacelleSlope = (InternalEObject)parameter__pNacelleSlope;
			parameter__pNacelleSlope = (WTCParam)eResolveProxy(oldParameter__pNacelleSlope);
			if (parameter__pNacelleSlope != oldParameter__pNacelleSlope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT115__PARAMETER_PNACELLE_SLOPE, oldParameter__pNacelleSlope, parameter__pNacelleSlope));
			}
		}
		return parameter__pNacelleSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pNacelleSlope() {
		return parameter__pNacelleSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pNacelleSlope(WTCParam newParameter__pNacelleSlope) {
		WTCParam oldParameter__pNacelleSlope = parameter__pNacelleSlope;
		parameter__pNacelleSlope = newParameter__pNacelleSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT115__PARAMETER_PNACELLE_SLOPE, oldParameter__pNacelleSlope, parameter__pNacelleSlope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pNacelleOffset() {
		if (parameter__pNacelleOffset != null && parameter__pNacelleOffset.eIsProxy()) {
			InternalEObject oldParameter__pNacelleOffset = (InternalEObject)parameter__pNacelleOffset;
			parameter__pNacelleOffset = (WTCParam)eResolveProxy(oldParameter__pNacelleOffset);
			if (parameter__pNacelleOffset != oldParameter__pNacelleOffset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT115__PARAMETER_PNACELLE_OFFSET, oldParameter__pNacelleOffset, parameter__pNacelleOffset));
			}
		}
		return parameter__pNacelleOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pNacelleOffset() {
		return parameter__pNacelleOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pNacelleOffset(WTCParam newParameter__pNacelleOffset) {
		WTCParam oldParameter__pNacelleOffset = parameter__pNacelleOffset;
		parameter__pNacelleOffset = newParameter__pNacelleOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT115__PARAMETER_PNACELLE_OFFSET, oldParameter__pNacelleOffset, parameter__pNacelleOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pWindSpeedAveragePeriod() {
		if (parameter__pWindSpeedAveragePeriod != null && parameter__pWindSpeedAveragePeriod.eIsProxy()) {
			InternalEObject oldParameter__pWindSpeedAveragePeriod = (InternalEObject)parameter__pWindSpeedAveragePeriod;
			parameter__pWindSpeedAveragePeriod = (WTCParam)eResolveProxy(oldParameter__pWindSpeedAveragePeriod);
			if (parameter__pWindSpeedAveragePeriod != oldParameter__pWindSpeedAveragePeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT115__PARAMETER_PWIND_SPEED_AVERAGE_PERIOD, oldParameter__pWindSpeedAveragePeriod, parameter__pWindSpeedAveragePeriod));
			}
		}
		return parameter__pWindSpeedAveragePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pWindSpeedAveragePeriod() {
		return parameter__pWindSpeedAveragePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pWindSpeedAveragePeriod(WTCParam newParameter__pWindSpeedAveragePeriod) {
		WTCParam oldParameter__pWindSpeedAveragePeriod = parameter__pWindSpeedAveragePeriod;
		parameter__pWindSpeedAveragePeriod = newParameter__pWindSpeedAveragePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT115__PARAMETER_PWIND_SPEED_AVERAGE_PERIOD, oldParameter__pWindSpeedAveragePeriod, parameter__pWindSpeedAveragePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT115__INPUT_IWIND_SPEED_RAW:
				if (resolve) return getInput__iWindSpeedRaw();
				return basicGetInput__iWindSpeedRaw();
			case WTSpecPackage.CTRL_UNIT115__OUTPUT_OWIND_SPEED:
				if (resolve) return getOutput__oWindSpeed();
				return basicGetOutput__oWindSpeed();
			case WTSpecPackage.CTRL_UNIT115__OUTPUT_OWIND_SPEED_AVERAGE:
				if (resolve) return getOutput__oWindSpeedAverage();
				return basicGetOutput__oWindSpeedAverage();
			case WTSpecPackage.CTRL_UNIT115__PARAMETER_PNACELLE_SLOPE:
				if (resolve) return getParameter__pNacelleSlope();
				return basicGetParameter__pNacelleSlope();
			case WTSpecPackage.CTRL_UNIT115__PARAMETER_PNACELLE_OFFSET:
				if (resolve) return getParameter__pNacelleOffset();
				return basicGetParameter__pNacelleOffset();
			case WTSpecPackage.CTRL_UNIT115__PARAMETER_PWIND_SPEED_AVERAGE_PERIOD:
				if (resolve) return getParameter__pWindSpeedAveragePeriod();
				return basicGetParameter__pWindSpeedAveragePeriod();
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
			case WTSpecPackage.CTRL_UNIT115__INPUT_IWIND_SPEED_RAW:
				setInput__iWindSpeedRaw((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT115__OUTPUT_OWIND_SPEED:
				setOutput__oWindSpeed((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT115__OUTPUT_OWIND_SPEED_AVERAGE:
				setOutput__oWindSpeedAverage((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT115__PARAMETER_PNACELLE_SLOPE:
				setParameter__pNacelleSlope((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT115__PARAMETER_PNACELLE_OFFSET:
				setParameter__pNacelleOffset((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT115__PARAMETER_PWIND_SPEED_AVERAGE_PERIOD:
				setParameter__pWindSpeedAveragePeriod((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT115__INPUT_IWIND_SPEED_RAW:
				setInput__iWindSpeedRaw((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT115__OUTPUT_OWIND_SPEED:
				setOutput__oWindSpeed((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT115__OUTPUT_OWIND_SPEED_AVERAGE:
				setOutput__oWindSpeedAverage((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT115__PARAMETER_PNACELLE_SLOPE:
				setParameter__pNacelleSlope((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT115__PARAMETER_PNACELLE_OFFSET:
				setParameter__pNacelleOffset((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT115__PARAMETER_PWIND_SPEED_AVERAGE_PERIOD:
				setParameter__pWindSpeedAveragePeriod((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT115__INPUT_IWIND_SPEED_RAW:
				return input__iWindSpeedRaw != null;
			case WTSpecPackage.CTRL_UNIT115__OUTPUT_OWIND_SPEED:
				return output__oWindSpeed != null;
			case WTSpecPackage.CTRL_UNIT115__OUTPUT_OWIND_SPEED_AVERAGE:
				return output__oWindSpeedAverage != null;
			case WTSpecPackage.CTRL_UNIT115__PARAMETER_PNACELLE_SLOPE:
				return parameter__pNacelleSlope != null;
			case WTSpecPackage.CTRL_UNIT115__PARAMETER_PNACELLE_OFFSET:
				return parameter__pNacelleOffset != null;
			case WTSpecPackage.CTRL_UNIT115__PARAMETER_PWIND_SPEED_AVERAGE_PERIOD:
				return parameter__pWindSpeedAveragePeriod != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit115Impl
