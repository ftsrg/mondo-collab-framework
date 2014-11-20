/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit58;
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
 * An implementation of the model object '<em><b>Ctrl Unit58</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit58Impl#getInput__iInput <em>Input iInput</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit58Impl#getOutput__oOutput <em>Output oOutput</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit58Impl#getParameter__pParam <em>Parameter pParam</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit58Impl#getBhvParam__bpLogicType <em>Bhv Param bp Logic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit58Impl extends wtcImpl implements CtrlUnit58 {
	/**
	 * The cached value of the '{@link #getInput__iInput() <em>Input iInput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInput()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInput;

	/**
	 * The cached value of the '{@link #getOutput__oOutput() <em>Output oOutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOutput()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOutput;

	/**
	 * The cached value of the '{@link #getParameter__pParam() <em>Parameter pParam</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pParam()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pParam;

	/**
	 * The default value of the '{@link #getBhvParam__bpLogicType() <em>Bhv Param bp Logic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpLogicType()
	 * @generated
	 * @ordered
	 */
	protected static final String BHV_PARAM_BP_LOGIC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBhvParam__bpLogicType() <em>Bhv Param bp Logic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpLogicType()
	 * @generated
	 * @ordered
	 */
	protected String bhvParam__bpLogicType = BHV_PARAM_BP_LOGIC_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit58Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit58();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInput() {
		if (input__iInput != null && input__iInput.eIsProxy()) {
			InternalEObject oldInput__iInput = (InternalEObject)input__iInput;
			input__iInput = (WTCInput)eResolveProxy(oldInput__iInput);
			if (input__iInput != oldInput__iInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT58__INPUT_IINPUT, oldInput__iInput, input__iInput));
			}
		}
		return input__iInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInput() {
		return input__iInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInput(WTCInput newInput__iInput) {
		WTCInput oldInput__iInput = input__iInput;
		input__iInput = newInput__iInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT58__INPUT_IINPUT, oldInput__iInput, input__iInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOutput() {
		if (output__oOutput != null && output__oOutput.eIsProxy()) {
			InternalEObject oldOutput__oOutput = (InternalEObject)output__oOutput;
			output__oOutput = (WTCOutput)eResolveProxy(oldOutput__oOutput);
			if (output__oOutput != oldOutput__oOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT58__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
			}
		}
		return output__oOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOutput() {
		return output__oOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOutput(WTCOutput newOutput__oOutput) {
		WTCOutput oldOutput__oOutput = output__oOutput;
		output__oOutput = newOutput__oOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT58__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pParam() {
		if (parameter__pParam != null && parameter__pParam.eIsProxy()) {
			InternalEObject oldParameter__pParam = (InternalEObject)parameter__pParam;
			parameter__pParam = (WTCParam)eResolveProxy(oldParameter__pParam);
			if (parameter__pParam != oldParameter__pParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT58__PARAMETER_PPARAM, oldParameter__pParam, parameter__pParam));
			}
		}
		return parameter__pParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pParam() {
		return parameter__pParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pParam(WTCParam newParameter__pParam) {
		WTCParam oldParameter__pParam = parameter__pParam;
		parameter__pParam = newParameter__pParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT58__PARAMETER_PPARAM, oldParameter__pParam, parameter__pParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBhvParam__bpLogicType() {
		return bhvParam__bpLogicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBhvParam__bpLogicType(String newBhvParam__bpLogicType) {
		String oldBhvParam__bpLogicType = bhvParam__bpLogicType;
		bhvParam__bpLogicType = newBhvParam__bpLogicType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT58__BHV_PARAM_BP_LOGIC_TYPE, oldBhvParam__bpLogicType, bhvParam__bpLogicType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT58__INPUT_IINPUT:
				if (resolve) return getInput__iInput();
				return basicGetInput__iInput();
			case WTSpecPackage.CTRL_UNIT58__OUTPUT_OOUTPUT:
				if (resolve) return getOutput__oOutput();
				return basicGetOutput__oOutput();
			case WTSpecPackage.CTRL_UNIT58__PARAMETER_PPARAM:
				if (resolve) return getParameter__pParam();
				return basicGetParameter__pParam();
			case WTSpecPackage.CTRL_UNIT58__BHV_PARAM_BP_LOGIC_TYPE:
				return getBhvParam__bpLogicType();
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
			case WTSpecPackage.CTRL_UNIT58__INPUT_IINPUT:
				setInput__iInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT58__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT58__PARAMETER_PPARAM:
				setParameter__pParam((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT58__BHV_PARAM_BP_LOGIC_TYPE:
				setBhvParam__bpLogicType((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT58__INPUT_IINPUT:
				setInput__iInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT58__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT58__PARAMETER_PPARAM:
				setParameter__pParam((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT58__BHV_PARAM_BP_LOGIC_TYPE:
				setBhvParam__bpLogicType(BHV_PARAM_BP_LOGIC_TYPE_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT58__INPUT_IINPUT:
				return input__iInput != null;
			case WTSpecPackage.CTRL_UNIT58__OUTPUT_OOUTPUT:
				return output__oOutput != null;
			case WTSpecPackage.CTRL_UNIT58__PARAMETER_PPARAM:
				return parameter__pParam != null;
			case WTSpecPackage.CTRL_UNIT58__BHV_PARAM_BP_LOGIC_TYPE:
				return BHV_PARAM_BP_LOGIC_TYPE_EDEFAULT == null ? bhvParam__bpLogicType != null : !BHV_PARAM_BP_LOGIC_TYPE_EDEFAULT.equals(bhvParam__bpLogicType);
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
		result.append(" (BhvParam__bpLogicType: ");
		result.append(bhvParam__bpLogicType);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit58Impl
