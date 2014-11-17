/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit43;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCParam;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit43</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit43Impl#getInput__iInput1 <em>Input iInput1</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit43Impl#getInput__iInput2 <em>Input iInput2</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit43Impl#getInput__iDontCheckInput <em>Input iDont Check Input</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit43Impl#getOutput__oOutput <em>Output oOutput</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit43Impl#getOutput__oOutDiv <em>Output oOut Div</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit43Impl#getOutput__oOutMod <em>Output oOut Mod</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit43Impl#getParameter__pDiv <em>Parameter pDiv</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit43Impl#getParameter__pParam1 <em>Parameter pParam1</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit43Impl#getParameter__pParam2 <em>Parameter pParam2</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit43Impl#getBhvParam__bpType <em>Bhv Param bp Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit43Impl extends wtcImpl implements CtrlUnit43 {
	/**
	 * The cached value of the '{@link #getInput__iInput1() <em>Input iInput1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInput1()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInput1;

	/**
	 * The cached value of the '{@link #getInput__iInput2() <em>Input iInput2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInput2()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInput2;

	/**
	 * The cached value of the '{@link #getInput__iDontCheckInput() <em>Input iDont Check Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iDontCheckInput()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iDontCheckInput;

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
	 * The cached value of the '{@link #getOutput__oOutDiv() <em>Output oOut Div</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOutDiv()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOutDiv;

	/**
	 * The cached value of the '{@link #getOutput__oOutMod() <em>Output oOut Mod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOutMod()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOutMod;

	/**
	 * The cached value of the '{@link #getParameter__pDiv() <em>Parameter pDiv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pDiv()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pDiv;

	/**
	 * The cached value of the '{@link #getParameter__pParam1() <em>Parameter pParam1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pParam1()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pParam1;

	/**
	 * The cached value of the '{@link #getParameter__pParam2() <em>Parameter pParam2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pParam2()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pParam2;

	/**
	 * The default value of the '{@link #getBhvParam__bpType() <em>Bhv Param bp Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpType()
	 * @generated
	 * @ordered
	 */
	protected static final String BHV_PARAM_BP_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBhvParam__bpType() <em>Bhv Param bp Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpType()
	 * @generated
	 * @ordered
	 */
	protected String bhvParam__bpType = BHV_PARAM_BP_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit43Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit43();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInput1() {
		if (input__iInput1 != null && input__iInput1.eIsProxy()) {
			InternalEObject oldInput__iInput1 = (InternalEObject)input__iInput1;
			input__iInput1 = (WTCInput)eResolveProxy(oldInput__iInput1);
			if (input__iInput1 != oldInput__iInput1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT43__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
			}
		}
		return input__iInput1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInput1() {
		return input__iInput1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInput1(WTCInput newInput__iInput1) {
		WTCInput oldInput__iInput1 = input__iInput1;
		input__iInput1 = newInput__iInput1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT43__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInput2() {
		if (input__iInput2 != null && input__iInput2.eIsProxy()) {
			InternalEObject oldInput__iInput2 = (InternalEObject)input__iInput2;
			input__iInput2 = (WTCInput)eResolveProxy(oldInput__iInput2);
			if (input__iInput2 != oldInput__iInput2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT43__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
			}
		}
		return input__iInput2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInput2() {
		return input__iInput2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInput2(WTCInput newInput__iInput2) {
		WTCInput oldInput__iInput2 = input__iInput2;
		input__iInput2 = newInput__iInput2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT43__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iDontCheckInput() {
		if (input__iDontCheckInput != null && input__iDontCheckInput.eIsProxy()) {
			InternalEObject oldInput__iDontCheckInput = (InternalEObject)input__iDontCheckInput;
			input__iDontCheckInput = (WTCInput)eResolveProxy(oldInput__iDontCheckInput);
			if (input__iDontCheckInput != oldInput__iDontCheckInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT43__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
			}
		}
		return input__iDontCheckInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iDontCheckInput() {
		return input__iDontCheckInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iDontCheckInput(WTCInput newInput__iDontCheckInput) {
		WTCInput oldInput__iDontCheckInput = input__iDontCheckInput;
		input__iDontCheckInput = newInput__iDontCheckInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT43__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOutDiv() {
		if (output__oOutDiv != null && output__oOutDiv.eIsProxy()) {
			InternalEObject oldOutput__oOutDiv = (InternalEObject)output__oOutDiv;
			output__oOutDiv = (WTCOutput)eResolveProxy(oldOutput__oOutDiv);
			if (output__oOutDiv != oldOutput__oOutDiv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUT_DIV, oldOutput__oOutDiv, output__oOutDiv));
			}
		}
		return output__oOutDiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOutDiv() {
		return output__oOutDiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOutDiv(WTCOutput newOutput__oOutDiv) {
		WTCOutput oldOutput__oOutDiv = output__oOutDiv;
		output__oOutDiv = newOutput__oOutDiv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUT_DIV, oldOutput__oOutDiv, output__oOutDiv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOutMod() {
		if (output__oOutMod != null && output__oOutMod.eIsProxy()) {
			InternalEObject oldOutput__oOutMod = (InternalEObject)output__oOutMod;
			output__oOutMod = (WTCOutput)eResolveProxy(oldOutput__oOutMod);
			if (output__oOutMod != oldOutput__oOutMod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUT_MOD, oldOutput__oOutMod, output__oOutMod));
			}
		}
		return output__oOutMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOutMod() {
		return output__oOutMod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOutMod(WTCOutput newOutput__oOutMod) {
		WTCOutput oldOutput__oOutMod = output__oOutMod;
		output__oOutMod = newOutput__oOutMod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUT_MOD, oldOutput__oOutMod, output__oOutMod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pDiv() {
		if (parameter__pDiv != null && parameter__pDiv.eIsProxy()) {
			InternalEObject oldParameter__pDiv = (InternalEObject)parameter__pDiv;
			parameter__pDiv = (WTCParam)eResolveProxy(oldParameter__pDiv);
			if (parameter__pDiv != oldParameter__pDiv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT43__PARAMETER_PDIV, oldParameter__pDiv, parameter__pDiv));
			}
		}
		return parameter__pDiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pDiv() {
		return parameter__pDiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pDiv(WTCParam newParameter__pDiv) {
		WTCParam oldParameter__pDiv = parameter__pDiv;
		parameter__pDiv = newParameter__pDiv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT43__PARAMETER_PDIV, oldParameter__pDiv, parameter__pDiv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pParam1() {
		if (parameter__pParam1 != null && parameter__pParam1.eIsProxy()) {
			InternalEObject oldParameter__pParam1 = (InternalEObject)parameter__pParam1;
			parameter__pParam1 = (WTCParam)eResolveProxy(oldParameter__pParam1);
			if (parameter__pParam1 != oldParameter__pParam1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT43__PARAMETER_PPARAM1, oldParameter__pParam1, parameter__pParam1));
			}
		}
		return parameter__pParam1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pParam1() {
		return parameter__pParam1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pParam1(WTCParam newParameter__pParam1) {
		WTCParam oldParameter__pParam1 = parameter__pParam1;
		parameter__pParam1 = newParameter__pParam1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT43__PARAMETER_PPARAM1, oldParameter__pParam1, parameter__pParam1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pParam2() {
		if (parameter__pParam2 != null && parameter__pParam2.eIsProxy()) {
			InternalEObject oldParameter__pParam2 = (InternalEObject)parameter__pParam2;
			parameter__pParam2 = (WTCParam)eResolveProxy(oldParameter__pParam2);
			if (parameter__pParam2 != oldParameter__pParam2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT43__PARAMETER_PPARAM2, oldParameter__pParam2, parameter__pParam2));
			}
		}
		return parameter__pParam2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pParam2() {
		return parameter__pParam2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pParam2(WTCParam newParameter__pParam2) {
		WTCParam oldParameter__pParam2 = parameter__pParam2;
		parameter__pParam2 = newParameter__pParam2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT43__PARAMETER_PPARAM2, oldParameter__pParam2, parameter__pParam2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBhvParam__bpType() {
		return bhvParam__bpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBhvParam__bpType(String newBhvParam__bpType) {
		String oldBhvParam__bpType = bhvParam__bpType;
		bhvParam__bpType = newBhvParam__bpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT43__BHV_PARAM_BP_TYPE, oldBhvParam__bpType, bhvParam__bpType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT43__INPUT_IINPUT1:
				if (resolve) return getInput__iInput1();
				return basicGetInput__iInput1();
			case WTSpecPackage.CTRL_UNIT43__INPUT_IINPUT2:
				if (resolve) return getInput__iInput2();
				return basicGetInput__iInput2();
			case WTSpecPackage.CTRL_UNIT43__INPUT_IDONT_CHECK_INPUT:
				if (resolve) return getInput__iDontCheckInput();
				return basicGetInput__iDontCheckInput();
			case WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUTPUT:
				if (resolve) return getOutput__oOutput();
				return basicGetOutput__oOutput();
			case WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUT_DIV:
				if (resolve) return getOutput__oOutDiv();
				return basicGetOutput__oOutDiv();
			case WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUT_MOD:
				if (resolve) return getOutput__oOutMod();
				return basicGetOutput__oOutMod();
			case WTSpecPackage.CTRL_UNIT43__PARAMETER_PDIV:
				if (resolve) return getParameter__pDiv();
				return basicGetParameter__pDiv();
			case WTSpecPackage.CTRL_UNIT43__PARAMETER_PPARAM1:
				if (resolve) return getParameter__pParam1();
				return basicGetParameter__pParam1();
			case WTSpecPackage.CTRL_UNIT43__PARAMETER_PPARAM2:
				if (resolve) return getParameter__pParam2();
				return basicGetParameter__pParam2();
			case WTSpecPackage.CTRL_UNIT43__BHV_PARAM_BP_TYPE:
				return getBhvParam__bpType();
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
			case WTSpecPackage.CTRL_UNIT43__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT43__INPUT_IINPUT2:
				setInput__iInput2((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT43__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUT_DIV:
				setOutput__oOutDiv((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUT_MOD:
				setOutput__oOutMod((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT43__PARAMETER_PDIV:
				setParameter__pDiv((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT43__PARAMETER_PPARAM1:
				setParameter__pParam1((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT43__PARAMETER_PPARAM2:
				setParameter__pParam2((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT43__BHV_PARAM_BP_TYPE:
				setBhvParam__bpType((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT43__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT43__INPUT_IINPUT2:
				setInput__iInput2((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT43__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUT_DIV:
				setOutput__oOutDiv((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUT_MOD:
				setOutput__oOutMod((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT43__PARAMETER_PDIV:
				setParameter__pDiv((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT43__PARAMETER_PPARAM1:
				setParameter__pParam1((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT43__PARAMETER_PPARAM2:
				setParameter__pParam2((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT43__BHV_PARAM_BP_TYPE:
				setBhvParam__bpType(BHV_PARAM_BP_TYPE_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT43__INPUT_IINPUT1:
				return input__iInput1 != null;
			case WTSpecPackage.CTRL_UNIT43__INPUT_IINPUT2:
				return input__iInput2 != null;
			case WTSpecPackage.CTRL_UNIT43__INPUT_IDONT_CHECK_INPUT:
				return input__iDontCheckInput != null;
			case WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUTPUT:
				return output__oOutput != null;
			case WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUT_DIV:
				return output__oOutDiv != null;
			case WTSpecPackage.CTRL_UNIT43__OUTPUT_OOUT_MOD:
				return output__oOutMod != null;
			case WTSpecPackage.CTRL_UNIT43__PARAMETER_PDIV:
				return parameter__pDiv != null;
			case WTSpecPackage.CTRL_UNIT43__PARAMETER_PPARAM1:
				return parameter__pParam1 != null;
			case WTSpecPackage.CTRL_UNIT43__PARAMETER_PPARAM2:
				return parameter__pParam2 != null;
			case WTSpecPackage.CTRL_UNIT43__BHV_PARAM_BP_TYPE:
				return BHV_PARAM_BP_TYPE_EDEFAULT == null ? bhvParam__bpType != null : !BHV_PARAM_BP_TYPE_EDEFAULT.equals(bhvParam__bpType);
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
		result.append(" (BhvParam__bpType: ");
		result.append(bhvParam__bpType);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit43Impl
