/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit45;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit45</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit45Impl#getInput__iInput <em>Input iInput</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit45Impl#getOutput__oOutput <em>Output oOutput</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit45Impl#getBhvParam__bpType <em>Bhv Param bp Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit45Impl extends wtcImpl implements CtrlUnit45 {
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
	protected CtrlUnit45Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit45();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT45__INPUT_IINPUT, oldInput__iInput, input__iInput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT45__INPUT_IINPUT, oldInput__iInput, input__iInput));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT45__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT45__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT45__BHV_PARAM_BP_TYPE, oldBhvParam__bpType, bhvParam__bpType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT45__INPUT_IINPUT:
				if (resolve) return getInput__iInput();
				return basicGetInput__iInput();
			case WTSpecPackage.CTRL_UNIT45__OUTPUT_OOUTPUT:
				if (resolve) return getOutput__oOutput();
				return basicGetOutput__oOutput();
			case WTSpecPackage.CTRL_UNIT45__BHV_PARAM_BP_TYPE:
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
			case WTSpecPackage.CTRL_UNIT45__INPUT_IINPUT:
				setInput__iInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT45__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT45__BHV_PARAM_BP_TYPE:
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
			case WTSpecPackage.CTRL_UNIT45__INPUT_IINPUT:
				setInput__iInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT45__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT45__BHV_PARAM_BP_TYPE:
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
			case WTSpecPackage.CTRL_UNIT45__INPUT_IINPUT:
				return input__iInput != null;
			case WTSpecPackage.CTRL_UNIT45__OUTPUT_OOUTPUT:
				return output__oOutput != null;
			case WTSpecPackage.CTRL_UNIT45__BHV_PARAM_BP_TYPE:
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

} //CtrlUnit45Impl
