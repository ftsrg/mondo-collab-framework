/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit90;
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
 * An implementation of the model object '<em><b>Ctrl Unit90</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getInput__iStatusR <em>Input iStatus R</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getInput__iStatusS <em>Input iStatus S</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getInput__iStatusT <em>Input iStatus T</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getInput__iValueR <em>Input iValue R</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getInput__iValueS <em>Input iValue S</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getInput__iValueT <em>Input iValue T</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getOutput__oCosinePhi <em>Output oCosine Phi</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getOutput__oFrequency <em>Output oFrequency</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getOutput__oControlR <em>Output oControl R</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getOutput__oControlS <em>Output oControl S</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getOutput__oControlT <em>Output oControl T</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getOutput__oApparentPower <em>Output oApparent Power</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getOutput__oVoltageR <em>Output oVoltage R</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getOutput__oVoltageS <em>Output oVoltage S</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getOutput__oVoltageT <em>Output oVoltage T</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getOutput__oCurrentR <em>Output oCurrent R</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getOutput__oCurrentS <em>Output oCurrent S</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getOutput__oCurrentT <em>Output oCurrent T</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getParameter__pCurrentFactor <em>Parameter pCurrent Factor</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit90Impl#getParameter__pVoltageFactor <em>Parameter pVoltage Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit90Impl extends wtcImpl implements CtrlUnit90 {
	/**
	 * The cached value of the '{@link #getInput__iStatusR() <em>Input iStatus R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iStatusR()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iStatusR;

	/**
	 * The cached value of the '{@link #getInput__iStatusS() <em>Input iStatus S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iStatusS()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iStatusS;

	/**
	 * The cached value of the '{@link #getInput__iStatusT() <em>Input iStatus T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iStatusT()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iStatusT;

	/**
	 * The cached value of the '{@link #getInput__iValueR() <em>Input iValue R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iValueR()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iValueR;

	/**
	 * The cached value of the '{@link #getInput__iValueS() <em>Input iValue S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iValueS()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iValueS;

	/**
	 * The cached value of the '{@link #getInput__iValueT() <em>Input iValue T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iValueT()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iValueT;

	/**
	 * The cached value of the '{@link #getOutput__oCosinePhi() <em>Output oCosine Phi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oCosinePhi()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oCosinePhi;

	/**
	 * The cached value of the '{@link #getOutput__oFrequency() <em>Output oFrequency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oFrequency()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oFrequency;

	/**
	 * The cached value of the '{@link #getOutput__oControlR() <em>Output oControl R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oControlR()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oControlR;

	/**
	 * The cached value of the '{@link #getOutput__oControlS() <em>Output oControl S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oControlS()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oControlS;

	/**
	 * The cached value of the '{@link #getOutput__oControlT() <em>Output oControl T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oControlT()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oControlT;

	/**
	 * The cached value of the '{@link #getOutput__oApparentPower() <em>Output oApparent Power</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oApparentPower()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oApparentPower;

	/**
	 * The cached value of the '{@link #getOutput__oVoltageR() <em>Output oVoltage R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oVoltageR()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oVoltageR;

	/**
	 * The cached value of the '{@link #getOutput__oVoltageS() <em>Output oVoltage S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oVoltageS()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oVoltageS;

	/**
	 * The cached value of the '{@link #getOutput__oVoltageT() <em>Output oVoltage T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oVoltageT()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oVoltageT;

	/**
	 * The cached value of the '{@link #getOutput__oCurrentR() <em>Output oCurrent R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oCurrentR()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oCurrentR;

	/**
	 * The cached value of the '{@link #getOutput__oCurrentS() <em>Output oCurrent S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oCurrentS()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oCurrentS;

	/**
	 * The cached value of the '{@link #getOutput__oCurrentT() <em>Output oCurrent T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oCurrentT()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oCurrentT;

	/**
	 * The cached value of the '{@link #getParameter__pCurrentFactor() <em>Parameter pCurrent Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pCurrentFactor()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pCurrentFactor;

	/**
	 * The cached value of the '{@link #getParameter__pVoltageFactor() <em>Parameter pVoltage Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pVoltageFactor()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pVoltageFactor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit90Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT90;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iStatusR() {
		if (input__iStatusR != null && input__iStatusR.eIsProxy()) {
			InternalEObject oldInput__iStatusR = (InternalEObject)input__iStatusR;
			input__iStatusR = (WTCInput)eResolveProxy(oldInput__iStatusR);
			if (input__iStatusR != oldInput__iStatusR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_R, oldInput__iStatusR, input__iStatusR));
			}
		}
		return input__iStatusR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iStatusR() {
		return input__iStatusR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iStatusR(WTCInput newInput__iStatusR) {
		WTCInput oldInput__iStatusR = input__iStatusR;
		input__iStatusR = newInput__iStatusR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_R, oldInput__iStatusR, input__iStatusR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iStatusS() {
		if (input__iStatusS != null && input__iStatusS.eIsProxy()) {
			InternalEObject oldInput__iStatusS = (InternalEObject)input__iStatusS;
			input__iStatusS = (WTCInput)eResolveProxy(oldInput__iStatusS);
			if (input__iStatusS != oldInput__iStatusS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_S, oldInput__iStatusS, input__iStatusS));
			}
		}
		return input__iStatusS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iStatusS() {
		return input__iStatusS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iStatusS(WTCInput newInput__iStatusS) {
		WTCInput oldInput__iStatusS = input__iStatusS;
		input__iStatusS = newInput__iStatusS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_S, oldInput__iStatusS, input__iStatusS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iStatusT() {
		if (input__iStatusT != null && input__iStatusT.eIsProxy()) {
			InternalEObject oldInput__iStatusT = (InternalEObject)input__iStatusT;
			input__iStatusT = (WTCInput)eResolveProxy(oldInput__iStatusT);
			if (input__iStatusT != oldInput__iStatusT) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_T, oldInput__iStatusT, input__iStatusT));
			}
		}
		return input__iStatusT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iStatusT() {
		return input__iStatusT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iStatusT(WTCInput newInput__iStatusT) {
		WTCInput oldInput__iStatusT = input__iStatusT;
		input__iStatusT = newInput__iStatusT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_T, oldInput__iStatusT, input__iStatusT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iValueR() {
		if (input__iValueR != null && input__iValueR.eIsProxy()) {
			InternalEObject oldInput__iValueR = (InternalEObject)input__iValueR;
			input__iValueR = (WTCInput)eResolveProxy(oldInput__iValueR);
			if (input__iValueR != oldInput__iValueR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_R, oldInput__iValueR, input__iValueR));
			}
		}
		return input__iValueR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iValueR() {
		return input__iValueR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iValueR(WTCInput newInput__iValueR) {
		WTCInput oldInput__iValueR = input__iValueR;
		input__iValueR = newInput__iValueR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_R, oldInput__iValueR, input__iValueR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iValueS() {
		if (input__iValueS != null && input__iValueS.eIsProxy()) {
			InternalEObject oldInput__iValueS = (InternalEObject)input__iValueS;
			input__iValueS = (WTCInput)eResolveProxy(oldInput__iValueS);
			if (input__iValueS != oldInput__iValueS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_S, oldInput__iValueS, input__iValueS));
			}
		}
		return input__iValueS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iValueS() {
		return input__iValueS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iValueS(WTCInput newInput__iValueS) {
		WTCInput oldInput__iValueS = input__iValueS;
		input__iValueS = newInput__iValueS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_S, oldInput__iValueS, input__iValueS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iValueT() {
		if (input__iValueT != null && input__iValueT.eIsProxy()) {
			InternalEObject oldInput__iValueT = (InternalEObject)input__iValueT;
			input__iValueT = (WTCInput)eResolveProxy(oldInput__iValueT);
			if (input__iValueT != oldInput__iValueT) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_T, oldInput__iValueT, input__iValueT));
			}
		}
		return input__iValueT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iValueT() {
		return input__iValueT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iValueT(WTCInput newInput__iValueT) {
		WTCInput oldInput__iValueT = input__iValueT;
		input__iValueT = newInput__iValueT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_T, oldInput__iValueT, input__iValueT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oCosinePhi() {
		if (output__oCosinePhi != null && output__oCosinePhi.eIsProxy()) {
			InternalEObject oldOutput__oCosinePhi = (InternalEObject)output__oCosinePhi;
			output__oCosinePhi = (WTCOutput)eResolveProxy(oldOutput__oCosinePhi);
			if (output__oCosinePhi != oldOutput__oCosinePhi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__OUTPUT_OCOSINE_PHI, oldOutput__oCosinePhi, output__oCosinePhi));
			}
		}
		return output__oCosinePhi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oCosinePhi() {
		return output__oCosinePhi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oCosinePhi(WTCOutput newOutput__oCosinePhi) {
		WTCOutput oldOutput__oCosinePhi = output__oCosinePhi;
		output__oCosinePhi = newOutput__oCosinePhi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__OUTPUT_OCOSINE_PHI, oldOutput__oCosinePhi, output__oCosinePhi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oFrequency() {
		if (output__oFrequency != null && output__oFrequency.eIsProxy()) {
			InternalEObject oldOutput__oFrequency = (InternalEObject)output__oFrequency;
			output__oFrequency = (WTCOutput)eResolveProxy(oldOutput__oFrequency);
			if (output__oFrequency != oldOutput__oFrequency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__OUTPUT_OFREQUENCY, oldOutput__oFrequency, output__oFrequency));
			}
		}
		return output__oFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oFrequency() {
		return output__oFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oFrequency(WTCOutput newOutput__oFrequency) {
		WTCOutput oldOutput__oFrequency = output__oFrequency;
		output__oFrequency = newOutput__oFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__OUTPUT_OFREQUENCY, oldOutput__oFrequency, output__oFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oControlR() {
		if (output__oControlR != null && output__oControlR.eIsProxy()) {
			InternalEObject oldOutput__oControlR = (InternalEObject)output__oControlR;
			output__oControlR = (WTCOutput)eResolveProxy(oldOutput__oControlR);
			if (output__oControlR != oldOutput__oControlR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_R, oldOutput__oControlR, output__oControlR));
			}
		}
		return output__oControlR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oControlR() {
		return output__oControlR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oControlR(WTCOutput newOutput__oControlR) {
		WTCOutput oldOutput__oControlR = output__oControlR;
		output__oControlR = newOutput__oControlR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_R, oldOutput__oControlR, output__oControlR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oControlS() {
		if (output__oControlS != null && output__oControlS.eIsProxy()) {
			InternalEObject oldOutput__oControlS = (InternalEObject)output__oControlS;
			output__oControlS = (WTCOutput)eResolveProxy(oldOutput__oControlS);
			if (output__oControlS != oldOutput__oControlS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_S, oldOutput__oControlS, output__oControlS));
			}
		}
		return output__oControlS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oControlS() {
		return output__oControlS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oControlS(WTCOutput newOutput__oControlS) {
		WTCOutput oldOutput__oControlS = output__oControlS;
		output__oControlS = newOutput__oControlS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_S, oldOutput__oControlS, output__oControlS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oControlT() {
		if (output__oControlT != null && output__oControlT.eIsProxy()) {
			InternalEObject oldOutput__oControlT = (InternalEObject)output__oControlT;
			output__oControlT = (WTCOutput)eResolveProxy(oldOutput__oControlT);
			if (output__oControlT != oldOutput__oControlT) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_T, oldOutput__oControlT, output__oControlT));
			}
		}
		return output__oControlT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oControlT() {
		return output__oControlT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oControlT(WTCOutput newOutput__oControlT) {
		WTCOutput oldOutput__oControlT = output__oControlT;
		output__oControlT = newOutput__oControlT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_T, oldOutput__oControlT, output__oControlT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oApparentPower() {
		if (output__oApparentPower != null && output__oApparentPower.eIsProxy()) {
			InternalEObject oldOutput__oApparentPower = (InternalEObject)output__oApparentPower;
			output__oApparentPower = (WTCOutput)eResolveProxy(oldOutput__oApparentPower);
			if (output__oApparentPower != oldOutput__oApparentPower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__OUTPUT_OAPPARENT_POWER, oldOutput__oApparentPower, output__oApparentPower));
			}
		}
		return output__oApparentPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oApparentPower() {
		return output__oApparentPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oApparentPower(WTCOutput newOutput__oApparentPower) {
		WTCOutput oldOutput__oApparentPower = output__oApparentPower;
		output__oApparentPower = newOutput__oApparentPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__OUTPUT_OAPPARENT_POWER, oldOutput__oApparentPower, output__oApparentPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oVoltageR() {
		if (output__oVoltageR != null && output__oVoltageR.eIsProxy()) {
			InternalEObject oldOutput__oVoltageR = (InternalEObject)output__oVoltageR;
			output__oVoltageR = (WTCOutput)eResolveProxy(oldOutput__oVoltageR);
			if (output__oVoltageR != oldOutput__oVoltageR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_R, oldOutput__oVoltageR, output__oVoltageR));
			}
		}
		return output__oVoltageR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oVoltageR() {
		return output__oVoltageR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oVoltageR(WTCOutput newOutput__oVoltageR) {
		WTCOutput oldOutput__oVoltageR = output__oVoltageR;
		output__oVoltageR = newOutput__oVoltageR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_R, oldOutput__oVoltageR, output__oVoltageR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oVoltageS() {
		if (output__oVoltageS != null && output__oVoltageS.eIsProxy()) {
			InternalEObject oldOutput__oVoltageS = (InternalEObject)output__oVoltageS;
			output__oVoltageS = (WTCOutput)eResolveProxy(oldOutput__oVoltageS);
			if (output__oVoltageS != oldOutput__oVoltageS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_S, oldOutput__oVoltageS, output__oVoltageS));
			}
		}
		return output__oVoltageS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oVoltageS() {
		return output__oVoltageS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oVoltageS(WTCOutput newOutput__oVoltageS) {
		WTCOutput oldOutput__oVoltageS = output__oVoltageS;
		output__oVoltageS = newOutput__oVoltageS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_S, oldOutput__oVoltageS, output__oVoltageS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oVoltageT() {
		if (output__oVoltageT != null && output__oVoltageT.eIsProxy()) {
			InternalEObject oldOutput__oVoltageT = (InternalEObject)output__oVoltageT;
			output__oVoltageT = (WTCOutput)eResolveProxy(oldOutput__oVoltageT);
			if (output__oVoltageT != oldOutput__oVoltageT) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_T, oldOutput__oVoltageT, output__oVoltageT));
			}
		}
		return output__oVoltageT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oVoltageT() {
		return output__oVoltageT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oVoltageT(WTCOutput newOutput__oVoltageT) {
		WTCOutput oldOutput__oVoltageT = output__oVoltageT;
		output__oVoltageT = newOutput__oVoltageT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_T, oldOutput__oVoltageT, output__oVoltageT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oCurrentR() {
		if (output__oCurrentR != null && output__oCurrentR.eIsProxy()) {
			InternalEObject oldOutput__oCurrentR = (InternalEObject)output__oCurrentR;
			output__oCurrentR = (WTCOutput)eResolveProxy(oldOutput__oCurrentR);
			if (output__oCurrentR != oldOutput__oCurrentR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_R, oldOutput__oCurrentR, output__oCurrentR));
			}
		}
		return output__oCurrentR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oCurrentR() {
		return output__oCurrentR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oCurrentR(WTCOutput newOutput__oCurrentR) {
		WTCOutput oldOutput__oCurrentR = output__oCurrentR;
		output__oCurrentR = newOutput__oCurrentR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_R, oldOutput__oCurrentR, output__oCurrentR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oCurrentS() {
		if (output__oCurrentS != null && output__oCurrentS.eIsProxy()) {
			InternalEObject oldOutput__oCurrentS = (InternalEObject)output__oCurrentS;
			output__oCurrentS = (WTCOutput)eResolveProxy(oldOutput__oCurrentS);
			if (output__oCurrentS != oldOutput__oCurrentS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_S, oldOutput__oCurrentS, output__oCurrentS));
			}
		}
		return output__oCurrentS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oCurrentS() {
		return output__oCurrentS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oCurrentS(WTCOutput newOutput__oCurrentS) {
		WTCOutput oldOutput__oCurrentS = output__oCurrentS;
		output__oCurrentS = newOutput__oCurrentS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_S, oldOutput__oCurrentS, output__oCurrentS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oCurrentT() {
		if (output__oCurrentT != null && output__oCurrentT.eIsProxy()) {
			InternalEObject oldOutput__oCurrentT = (InternalEObject)output__oCurrentT;
			output__oCurrentT = (WTCOutput)eResolveProxy(oldOutput__oCurrentT);
			if (output__oCurrentT != oldOutput__oCurrentT) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_T, oldOutput__oCurrentT, output__oCurrentT));
			}
		}
		return output__oCurrentT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oCurrentT() {
		return output__oCurrentT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oCurrentT(WTCOutput newOutput__oCurrentT) {
		WTCOutput oldOutput__oCurrentT = output__oCurrentT;
		output__oCurrentT = newOutput__oCurrentT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_T, oldOutput__oCurrentT, output__oCurrentT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pCurrentFactor() {
		if (parameter__pCurrentFactor != null && parameter__pCurrentFactor.eIsProxy()) {
			InternalEObject oldParameter__pCurrentFactor = (InternalEObject)parameter__pCurrentFactor;
			parameter__pCurrentFactor = (WTCParam)eResolveProxy(oldParameter__pCurrentFactor);
			if (parameter__pCurrentFactor != oldParameter__pCurrentFactor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__PARAMETER_PCURRENT_FACTOR, oldParameter__pCurrentFactor, parameter__pCurrentFactor));
			}
		}
		return parameter__pCurrentFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pCurrentFactor() {
		return parameter__pCurrentFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pCurrentFactor(WTCParam newParameter__pCurrentFactor) {
		WTCParam oldParameter__pCurrentFactor = parameter__pCurrentFactor;
		parameter__pCurrentFactor = newParameter__pCurrentFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__PARAMETER_PCURRENT_FACTOR, oldParameter__pCurrentFactor, parameter__pCurrentFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pVoltageFactor() {
		if (parameter__pVoltageFactor != null && parameter__pVoltageFactor.eIsProxy()) {
			InternalEObject oldParameter__pVoltageFactor = (InternalEObject)parameter__pVoltageFactor;
			parameter__pVoltageFactor = (WTCParam)eResolveProxy(oldParameter__pVoltageFactor);
			if (parameter__pVoltageFactor != oldParameter__pVoltageFactor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT90__PARAMETER_PVOLTAGE_FACTOR, oldParameter__pVoltageFactor, parameter__pVoltageFactor));
			}
		}
		return parameter__pVoltageFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pVoltageFactor() {
		return parameter__pVoltageFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pVoltageFactor(WTCParam newParameter__pVoltageFactor) {
		WTCParam oldParameter__pVoltageFactor = parameter__pVoltageFactor;
		parameter__pVoltageFactor = newParameter__pVoltageFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT90__PARAMETER_PVOLTAGE_FACTOR, oldParameter__pVoltageFactor, parameter__pVoltageFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_R:
				if (resolve) return getInput__iStatusR();
				return basicGetInput__iStatusR();
			case WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_S:
				if (resolve) return getInput__iStatusS();
				return basicGetInput__iStatusS();
			case WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_T:
				if (resolve) return getInput__iStatusT();
				return basicGetInput__iStatusT();
			case WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_R:
				if (resolve) return getInput__iValueR();
				return basicGetInput__iValueR();
			case WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_S:
				if (resolve) return getInput__iValueS();
				return basicGetInput__iValueS();
			case WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_T:
				if (resolve) return getInput__iValueT();
				return basicGetInput__iValueT();
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCOSINE_PHI:
				if (resolve) return getOutput__oCosinePhi();
				return basicGetOutput__oCosinePhi();
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OFREQUENCY:
				if (resolve) return getOutput__oFrequency();
				return basicGetOutput__oFrequency();
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_R:
				if (resolve) return getOutput__oControlR();
				return basicGetOutput__oControlR();
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_S:
				if (resolve) return getOutput__oControlS();
				return basicGetOutput__oControlS();
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_T:
				if (resolve) return getOutput__oControlT();
				return basicGetOutput__oControlT();
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OAPPARENT_POWER:
				if (resolve) return getOutput__oApparentPower();
				return basicGetOutput__oApparentPower();
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_R:
				if (resolve) return getOutput__oVoltageR();
				return basicGetOutput__oVoltageR();
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_S:
				if (resolve) return getOutput__oVoltageS();
				return basicGetOutput__oVoltageS();
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_T:
				if (resolve) return getOutput__oVoltageT();
				return basicGetOutput__oVoltageT();
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_R:
				if (resolve) return getOutput__oCurrentR();
				return basicGetOutput__oCurrentR();
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_S:
				if (resolve) return getOutput__oCurrentS();
				return basicGetOutput__oCurrentS();
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_T:
				if (resolve) return getOutput__oCurrentT();
				return basicGetOutput__oCurrentT();
			case WTSpecPackage.CTRL_UNIT90__PARAMETER_PCURRENT_FACTOR:
				if (resolve) return getParameter__pCurrentFactor();
				return basicGetParameter__pCurrentFactor();
			case WTSpecPackage.CTRL_UNIT90__PARAMETER_PVOLTAGE_FACTOR:
				if (resolve) return getParameter__pVoltageFactor();
				return basicGetParameter__pVoltageFactor();
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
			case WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_R:
				setInput__iStatusR((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_S:
				setInput__iStatusS((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_T:
				setInput__iStatusT((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_R:
				setInput__iValueR((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_S:
				setInput__iValueS((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_T:
				setInput__iValueT((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCOSINE_PHI:
				setOutput__oCosinePhi((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OFREQUENCY:
				setOutput__oFrequency((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_R:
				setOutput__oControlR((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_S:
				setOutput__oControlS((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_T:
				setOutput__oControlT((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OAPPARENT_POWER:
				setOutput__oApparentPower((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_R:
				setOutput__oVoltageR((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_S:
				setOutput__oVoltageS((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_T:
				setOutput__oVoltageT((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_R:
				setOutput__oCurrentR((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_S:
				setOutput__oCurrentS((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_T:
				setOutput__oCurrentT((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__PARAMETER_PCURRENT_FACTOR:
				setParameter__pCurrentFactor((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT90__PARAMETER_PVOLTAGE_FACTOR:
				setParameter__pVoltageFactor((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_R:
				setInput__iStatusR((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_S:
				setInput__iStatusS((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_T:
				setInput__iStatusT((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_R:
				setInput__iValueR((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_S:
				setInput__iValueS((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_T:
				setInput__iValueT((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCOSINE_PHI:
				setOutput__oCosinePhi((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OFREQUENCY:
				setOutput__oFrequency((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_R:
				setOutput__oControlR((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_S:
				setOutput__oControlS((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_T:
				setOutput__oControlT((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OAPPARENT_POWER:
				setOutput__oApparentPower((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_R:
				setOutput__oVoltageR((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_S:
				setOutput__oVoltageS((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_T:
				setOutput__oVoltageT((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_R:
				setOutput__oCurrentR((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_S:
				setOutput__oCurrentS((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_T:
				setOutput__oCurrentT((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__PARAMETER_PCURRENT_FACTOR:
				setParameter__pCurrentFactor((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT90__PARAMETER_PVOLTAGE_FACTOR:
				setParameter__pVoltageFactor((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_R:
				return input__iStatusR != null;
			case WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_S:
				return input__iStatusS != null;
			case WTSpecPackage.CTRL_UNIT90__INPUT_ISTATUS_T:
				return input__iStatusT != null;
			case WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_R:
				return input__iValueR != null;
			case WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_S:
				return input__iValueS != null;
			case WTSpecPackage.CTRL_UNIT90__INPUT_IVALUE_T:
				return input__iValueT != null;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCOSINE_PHI:
				return output__oCosinePhi != null;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OFREQUENCY:
				return output__oFrequency != null;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_R:
				return output__oControlR != null;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_S:
				return output__oControlS != null;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCONTROL_T:
				return output__oControlT != null;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OAPPARENT_POWER:
				return output__oApparentPower != null;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_R:
				return output__oVoltageR != null;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_S:
				return output__oVoltageS != null;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OVOLTAGE_T:
				return output__oVoltageT != null;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_R:
				return output__oCurrentR != null;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_S:
				return output__oCurrentS != null;
			case WTSpecPackage.CTRL_UNIT90__OUTPUT_OCURRENT_T:
				return output__oCurrentT != null;
			case WTSpecPackage.CTRL_UNIT90__PARAMETER_PCURRENT_FACTOR:
				return parameter__pCurrentFactor != null;
			case WTSpecPackage.CTRL_UNIT90__PARAMETER_PVOLTAGE_FACTOR:
				return parameter__pVoltageFactor != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit90Impl
