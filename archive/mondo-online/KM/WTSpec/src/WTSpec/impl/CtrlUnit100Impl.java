/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit100;
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
 * An implementation of the model object '<em><b>Ctrl Unit100</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit100Impl#getInput__iPinPosition <em>Input iPin Position</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit100Impl#getOutput__oPinSafetyCmd <em>Output oPin Safety Cmd</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit100Impl#getParameter__pPinNoBackPos <em>Parameter pPin No Back Pos</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit100Impl#getParameter__pPinExtendedPos <em>Parameter pPin Extended Pos</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit100Impl#getParameter__pPinRetractedPos <em>Parameter pPin Retracted Pos</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit100Impl#getParameter__pPinHysteresis <em>Parameter pPin Hysteresis</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit100Impl#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit100Impl extends wtcImpl implements CtrlUnit100 {
	/**
	 * The cached value of the '{@link #getInput__iPinPosition() <em>Input iPin Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPinPosition()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPinPosition;

	/**
	 * The cached value of the '{@link #getOutput__oPinSafetyCmd() <em>Output oPin Safety Cmd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPinSafetyCmd()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPinSafetyCmd;

	/**
	 * The cached value of the '{@link #getParameter__pPinNoBackPos() <em>Parameter pPin No Back Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPinNoBackPos()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPinNoBackPos;

	/**
	 * The cached value of the '{@link #getParameter__pPinExtendedPos() <em>Parameter pPin Extended Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPinExtendedPos()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPinExtendedPos;

	/**
	 * The cached value of the '{@link #getParameter__pPinRetractedPos() <em>Parameter pPin Retracted Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPinRetractedPos()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPinRetractedPos;

	/**
	 * The cached value of the '{@link #getParameter__pPinHysteresis() <em>Parameter pPin Hysteresis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPinHysteresis()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPinHysteresis;

	/**
	 * The default value of the '{@link #getBhvParam__bpMode() <em>Bhv Param bp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpMode()
	 * @generated
	 * @ordered
	 */
	protected static final String BHV_PARAM_BP_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBhvParam__bpMode() <em>Bhv Param bp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpMode()
	 * @generated
	 * @ordered
	 */
	protected String bhvParam__bpMode = BHV_PARAM_BP_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit100Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit100();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPinPosition() {
		if (input__iPinPosition != null && input__iPinPosition.eIsProxy()) {
			InternalEObject oldInput__iPinPosition = (InternalEObject)input__iPinPosition;
			input__iPinPosition = (WTCInput)eResolveProxy(oldInput__iPinPosition);
			if (input__iPinPosition != oldInput__iPinPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT100__INPUT_IPIN_POSITION, oldInput__iPinPosition, input__iPinPosition));
			}
		}
		return input__iPinPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPinPosition() {
		return input__iPinPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPinPosition(WTCInput newInput__iPinPosition) {
		WTCInput oldInput__iPinPosition = input__iPinPosition;
		input__iPinPosition = newInput__iPinPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT100__INPUT_IPIN_POSITION, oldInput__iPinPosition, input__iPinPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPinSafetyCmd() {
		if (output__oPinSafetyCmd != null && output__oPinSafetyCmd.eIsProxy()) {
			InternalEObject oldOutput__oPinSafetyCmd = (InternalEObject)output__oPinSafetyCmd;
			output__oPinSafetyCmd = (WTCOutput)eResolveProxy(oldOutput__oPinSafetyCmd);
			if (output__oPinSafetyCmd != oldOutput__oPinSafetyCmd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT100__OUTPUT_OPIN_SAFETY_CMD, oldOutput__oPinSafetyCmd, output__oPinSafetyCmd));
			}
		}
		return output__oPinSafetyCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPinSafetyCmd() {
		return output__oPinSafetyCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPinSafetyCmd(WTCOutput newOutput__oPinSafetyCmd) {
		WTCOutput oldOutput__oPinSafetyCmd = output__oPinSafetyCmd;
		output__oPinSafetyCmd = newOutput__oPinSafetyCmd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT100__OUTPUT_OPIN_SAFETY_CMD, oldOutput__oPinSafetyCmd, output__oPinSafetyCmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPinNoBackPos() {
		if (parameter__pPinNoBackPos != null && parameter__pPinNoBackPos.eIsProxy()) {
			InternalEObject oldParameter__pPinNoBackPos = (InternalEObject)parameter__pPinNoBackPos;
			parameter__pPinNoBackPos = (WTCParam)eResolveProxy(oldParameter__pPinNoBackPos);
			if (parameter__pPinNoBackPos != oldParameter__pPinNoBackPos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_NO_BACK_POS, oldParameter__pPinNoBackPos, parameter__pPinNoBackPos));
			}
		}
		return parameter__pPinNoBackPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPinNoBackPos() {
		return parameter__pPinNoBackPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPinNoBackPos(WTCParam newParameter__pPinNoBackPos) {
		WTCParam oldParameter__pPinNoBackPos = parameter__pPinNoBackPos;
		parameter__pPinNoBackPos = newParameter__pPinNoBackPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_NO_BACK_POS, oldParameter__pPinNoBackPos, parameter__pPinNoBackPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPinExtendedPos() {
		if (parameter__pPinExtendedPos != null && parameter__pPinExtendedPos.eIsProxy()) {
			InternalEObject oldParameter__pPinExtendedPos = (InternalEObject)parameter__pPinExtendedPos;
			parameter__pPinExtendedPos = (WTCParam)eResolveProxy(oldParameter__pPinExtendedPos);
			if (parameter__pPinExtendedPos != oldParameter__pPinExtendedPos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_EXTENDED_POS, oldParameter__pPinExtendedPos, parameter__pPinExtendedPos));
			}
		}
		return parameter__pPinExtendedPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPinExtendedPos() {
		return parameter__pPinExtendedPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPinExtendedPos(WTCParam newParameter__pPinExtendedPos) {
		WTCParam oldParameter__pPinExtendedPos = parameter__pPinExtendedPos;
		parameter__pPinExtendedPos = newParameter__pPinExtendedPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_EXTENDED_POS, oldParameter__pPinExtendedPos, parameter__pPinExtendedPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPinRetractedPos() {
		if (parameter__pPinRetractedPos != null && parameter__pPinRetractedPos.eIsProxy()) {
			InternalEObject oldParameter__pPinRetractedPos = (InternalEObject)parameter__pPinRetractedPos;
			parameter__pPinRetractedPos = (WTCParam)eResolveProxy(oldParameter__pPinRetractedPos);
			if (parameter__pPinRetractedPos != oldParameter__pPinRetractedPos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_RETRACTED_POS, oldParameter__pPinRetractedPos, parameter__pPinRetractedPos));
			}
		}
		return parameter__pPinRetractedPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPinRetractedPos() {
		return parameter__pPinRetractedPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPinRetractedPos(WTCParam newParameter__pPinRetractedPos) {
		WTCParam oldParameter__pPinRetractedPos = parameter__pPinRetractedPos;
		parameter__pPinRetractedPos = newParameter__pPinRetractedPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_RETRACTED_POS, oldParameter__pPinRetractedPos, parameter__pPinRetractedPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPinHysteresis() {
		if (parameter__pPinHysteresis != null && parameter__pPinHysteresis.eIsProxy()) {
			InternalEObject oldParameter__pPinHysteresis = (InternalEObject)parameter__pPinHysteresis;
			parameter__pPinHysteresis = (WTCParam)eResolveProxy(oldParameter__pPinHysteresis);
			if (parameter__pPinHysteresis != oldParameter__pPinHysteresis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_HYSTERESIS, oldParameter__pPinHysteresis, parameter__pPinHysteresis));
			}
		}
		return parameter__pPinHysteresis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPinHysteresis() {
		return parameter__pPinHysteresis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPinHysteresis(WTCParam newParameter__pPinHysteresis) {
		WTCParam oldParameter__pPinHysteresis = parameter__pPinHysteresis;
		parameter__pPinHysteresis = newParameter__pPinHysteresis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_HYSTERESIS, oldParameter__pPinHysteresis, parameter__pPinHysteresis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBhvParam__bpMode() {
		return bhvParam__bpMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBhvParam__bpMode(String newBhvParam__bpMode) {
		String oldBhvParam__bpMode = bhvParam__bpMode;
		bhvParam__bpMode = newBhvParam__bpMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT100__BHV_PARAM_BP_MODE, oldBhvParam__bpMode, bhvParam__bpMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT100__INPUT_IPIN_POSITION:
				if (resolve) return getInput__iPinPosition();
				return basicGetInput__iPinPosition();
			case WTSpecPackage.CTRL_UNIT100__OUTPUT_OPIN_SAFETY_CMD:
				if (resolve) return getOutput__oPinSafetyCmd();
				return basicGetOutput__oPinSafetyCmd();
			case WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_NO_BACK_POS:
				if (resolve) return getParameter__pPinNoBackPos();
				return basicGetParameter__pPinNoBackPos();
			case WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_EXTENDED_POS:
				if (resolve) return getParameter__pPinExtendedPos();
				return basicGetParameter__pPinExtendedPos();
			case WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_RETRACTED_POS:
				if (resolve) return getParameter__pPinRetractedPos();
				return basicGetParameter__pPinRetractedPos();
			case WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_HYSTERESIS:
				if (resolve) return getParameter__pPinHysteresis();
				return basicGetParameter__pPinHysteresis();
			case WTSpecPackage.CTRL_UNIT100__BHV_PARAM_BP_MODE:
				return getBhvParam__bpMode();
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
			case WTSpecPackage.CTRL_UNIT100__INPUT_IPIN_POSITION:
				setInput__iPinPosition((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT100__OUTPUT_OPIN_SAFETY_CMD:
				setOutput__oPinSafetyCmd((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_NO_BACK_POS:
				setParameter__pPinNoBackPos((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_EXTENDED_POS:
				setParameter__pPinExtendedPos((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_RETRACTED_POS:
				setParameter__pPinRetractedPos((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_HYSTERESIS:
				setParameter__pPinHysteresis((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT100__BHV_PARAM_BP_MODE:
				setBhvParam__bpMode((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT100__INPUT_IPIN_POSITION:
				setInput__iPinPosition((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT100__OUTPUT_OPIN_SAFETY_CMD:
				setOutput__oPinSafetyCmd((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_NO_BACK_POS:
				setParameter__pPinNoBackPos((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_EXTENDED_POS:
				setParameter__pPinExtendedPos((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_RETRACTED_POS:
				setParameter__pPinRetractedPos((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_HYSTERESIS:
				setParameter__pPinHysteresis((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT100__BHV_PARAM_BP_MODE:
				setBhvParam__bpMode(BHV_PARAM_BP_MODE_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT100__INPUT_IPIN_POSITION:
				return input__iPinPosition != null;
			case WTSpecPackage.CTRL_UNIT100__OUTPUT_OPIN_SAFETY_CMD:
				return output__oPinSafetyCmd != null;
			case WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_NO_BACK_POS:
				return parameter__pPinNoBackPos != null;
			case WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_EXTENDED_POS:
				return parameter__pPinExtendedPos != null;
			case WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_RETRACTED_POS:
				return parameter__pPinRetractedPos != null;
			case WTSpecPackage.CTRL_UNIT100__PARAMETER_PPIN_HYSTERESIS:
				return parameter__pPinHysteresis != null;
			case WTSpecPackage.CTRL_UNIT100__BHV_PARAM_BP_MODE:
				return BHV_PARAM_BP_MODE_EDEFAULT == null ? bhvParam__bpMode != null : !BHV_PARAM_BP_MODE_EDEFAULT.equals(bhvParam__bpMode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (BhvParam__bpMode: ");
		result.append(bhvParam__bpMode);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit100Impl
