/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit10;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCParam;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit10</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit10Impl#getInput__iAnalogInput <em>Input iAnalog Input</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit10Impl#getOutput__oAnalogScaled <em>Output oAnalog Scaled</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit10Impl#getParameter__pFactor <em>Parameter pFactor</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit10Impl#getParameter__pOffset <em>Parameter pOffset</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit10Impl#getParameter__pUpLimit <em>Parameter pUp Limit</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit10Impl#getParameter__pUpValue <em>Parameter pUp Value</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit10Impl#getParameter__pDownLimit <em>Parameter pDown Limit</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit10Impl#getParameter__pDownValue <em>Parameter pDown Value</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit10Impl#getBhvParam__bpOperation <em>Bhv Param bp Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit10Impl extends wtcImpl implements CtrlUnit10 {
	/**
	 * The cached value of the '{@link #getInput__iAnalogInput() <em>Input iAnalog Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iAnalogInput()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iAnalogInput;

	/**
	 * The cached value of the '{@link #getOutput__oAnalogScaled() <em>Output oAnalog Scaled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oAnalogScaled()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oAnalogScaled;

	/**
	 * The cached value of the '{@link #getParameter__pFactor() <em>Parameter pFactor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pFactor()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pFactor;

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
	 * The cached value of the '{@link #getParameter__pUpLimit() <em>Parameter pUp Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pUpLimit()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pUpLimit;

	/**
	 * The cached value of the '{@link #getParameter__pUpValue() <em>Parameter pUp Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pUpValue()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pUpValue;

	/**
	 * The cached value of the '{@link #getParameter__pDownLimit() <em>Parameter pDown Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pDownLimit()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pDownLimit;

	/**
	 * The cached value of the '{@link #getParameter__pDownValue() <em>Parameter pDown Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pDownValue()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pDownValue;

	/**
	 * The default value of the '{@link #getBhvParam__bpOperation() <em>Bhv Param bp Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String BHV_PARAM_BP_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBhvParam__bpOperation() <em>Bhv Param bp Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpOperation()
	 * @generated
	 * @ordered
	 */
	protected String bhvParam__bpOperation = BHV_PARAM_BP_OPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit10Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit10();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iAnalogInput() {
		if (input__iAnalogInput != null && input__iAnalogInput.eIsProxy()) {
			InternalEObject oldInput__iAnalogInput = (InternalEObject)input__iAnalogInput;
			input__iAnalogInput = (WTCInput)eResolveProxy(oldInput__iAnalogInput);
			if (input__iAnalogInput != oldInput__iAnalogInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT10__INPUT_IANALOG_INPUT, oldInput__iAnalogInput, input__iAnalogInput));
			}
		}
		return input__iAnalogInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iAnalogInput() {
		return input__iAnalogInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iAnalogInput(WTCInput newInput__iAnalogInput) {
		WTCInput oldInput__iAnalogInput = input__iAnalogInput;
		input__iAnalogInput = newInput__iAnalogInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT10__INPUT_IANALOG_INPUT, oldInput__iAnalogInput, input__iAnalogInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oAnalogScaled() {
		if (output__oAnalogScaled != null && output__oAnalogScaled.eIsProxy()) {
			InternalEObject oldOutput__oAnalogScaled = (InternalEObject)output__oAnalogScaled;
			output__oAnalogScaled = (WTCOutput)eResolveProxy(oldOutput__oAnalogScaled);
			if (output__oAnalogScaled != oldOutput__oAnalogScaled) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT10__OUTPUT_OANALOG_SCALED, oldOutput__oAnalogScaled, output__oAnalogScaled));
			}
		}
		return output__oAnalogScaled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oAnalogScaled() {
		return output__oAnalogScaled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oAnalogScaled(WTCOutput newOutput__oAnalogScaled) {
		WTCOutput oldOutput__oAnalogScaled = output__oAnalogScaled;
		output__oAnalogScaled = newOutput__oAnalogScaled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT10__OUTPUT_OANALOG_SCALED, oldOutput__oAnalogScaled, output__oAnalogScaled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pFactor() {
		if (parameter__pFactor != null && parameter__pFactor.eIsProxy()) {
			InternalEObject oldParameter__pFactor = (InternalEObject)parameter__pFactor;
			parameter__pFactor = (WTCParam)eResolveProxy(oldParameter__pFactor);
			if (parameter__pFactor != oldParameter__pFactor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT10__PARAMETER_PFACTOR, oldParameter__pFactor, parameter__pFactor));
			}
		}
		return parameter__pFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pFactor() {
		return parameter__pFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pFactor(WTCParam newParameter__pFactor) {
		WTCParam oldParameter__pFactor = parameter__pFactor;
		parameter__pFactor = newParameter__pFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT10__PARAMETER_PFACTOR, oldParameter__pFactor, parameter__pFactor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT10__PARAMETER_POFFSET, oldParameter__pOffset, parameter__pOffset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT10__PARAMETER_POFFSET, oldParameter__pOffset, parameter__pOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pUpLimit() {
		if (parameter__pUpLimit != null && parameter__pUpLimit.eIsProxy()) {
			InternalEObject oldParameter__pUpLimit = (InternalEObject)parameter__pUpLimit;
			parameter__pUpLimit = (WTCParam)eResolveProxy(oldParameter__pUpLimit);
			if (parameter__pUpLimit != oldParameter__pUpLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT10__PARAMETER_PUP_LIMIT, oldParameter__pUpLimit, parameter__pUpLimit));
			}
		}
		return parameter__pUpLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pUpLimit() {
		return parameter__pUpLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pUpLimit(WTCParam newParameter__pUpLimit) {
		WTCParam oldParameter__pUpLimit = parameter__pUpLimit;
		parameter__pUpLimit = newParameter__pUpLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT10__PARAMETER_PUP_LIMIT, oldParameter__pUpLimit, parameter__pUpLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pUpValue() {
		if (parameter__pUpValue != null && parameter__pUpValue.eIsProxy()) {
			InternalEObject oldParameter__pUpValue = (InternalEObject)parameter__pUpValue;
			parameter__pUpValue = (WTCParam)eResolveProxy(oldParameter__pUpValue);
			if (parameter__pUpValue != oldParameter__pUpValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT10__PARAMETER_PUP_VALUE, oldParameter__pUpValue, parameter__pUpValue));
			}
		}
		return parameter__pUpValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pUpValue() {
		return parameter__pUpValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pUpValue(WTCParam newParameter__pUpValue) {
		WTCParam oldParameter__pUpValue = parameter__pUpValue;
		parameter__pUpValue = newParameter__pUpValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT10__PARAMETER_PUP_VALUE, oldParameter__pUpValue, parameter__pUpValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pDownLimit() {
		if (parameter__pDownLimit != null && parameter__pDownLimit.eIsProxy()) {
			InternalEObject oldParameter__pDownLimit = (InternalEObject)parameter__pDownLimit;
			parameter__pDownLimit = (WTCParam)eResolveProxy(oldParameter__pDownLimit);
			if (parameter__pDownLimit != oldParameter__pDownLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT10__PARAMETER_PDOWN_LIMIT, oldParameter__pDownLimit, parameter__pDownLimit));
			}
		}
		return parameter__pDownLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pDownLimit() {
		return parameter__pDownLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pDownLimit(WTCParam newParameter__pDownLimit) {
		WTCParam oldParameter__pDownLimit = parameter__pDownLimit;
		parameter__pDownLimit = newParameter__pDownLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT10__PARAMETER_PDOWN_LIMIT, oldParameter__pDownLimit, parameter__pDownLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pDownValue() {
		if (parameter__pDownValue != null && parameter__pDownValue.eIsProxy()) {
			InternalEObject oldParameter__pDownValue = (InternalEObject)parameter__pDownValue;
			parameter__pDownValue = (WTCParam)eResolveProxy(oldParameter__pDownValue);
			if (parameter__pDownValue != oldParameter__pDownValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT10__PARAMETER_PDOWN_VALUE, oldParameter__pDownValue, parameter__pDownValue));
			}
		}
		return parameter__pDownValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pDownValue() {
		return parameter__pDownValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pDownValue(WTCParam newParameter__pDownValue) {
		WTCParam oldParameter__pDownValue = parameter__pDownValue;
		parameter__pDownValue = newParameter__pDownValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT10__PARAMETER_PDOWN_VALUE, oldParameter__pDownValue, parameter__pDownValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBhvParam__bpOperation() {
		return bhvParam__bpOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBhvParam__bpOperation(String newBhvParam__bpOperation) {
		String oldBhvParam__bpOperation = bhvParam__bpOperation;
		bhvParam__bpOperation = newBhvParam__bpOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT10__BHV_PARAM_BP_OPERATION, oldBhvParam__bpOperation, bhvParam__bpOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT10__INPUT_IANALOG_INPUT:
				if (resolve) return getInput__iAnalogInput();
				return basicGetInput__iAnalogInput();
			case WTSpecPackage.CTRL_UNIT10__OUTPUT_OANALOG_SCALED:
				if (resolve) return getOutput__oAnalogScaled();
				return basicGetOutput__oAnalogScaled();
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PFACTOR:
				if (resolve) return getParameter__pFactor();
				return basicGetParameter__pFactor();
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_POFFSET:
				if (resolve) return getParameter__pOffset();
				return basicGetParameter__pOffset();
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PUP_LIMIT:
				if (resolve) return getParameter__pUpLimit();
				return basicGetParameter__pUpLimit();
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PUP_VALUE:
				if (resolve) return getParameter__pUpValue();
				return basicGetParameter__pUpValue();
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PDOWN_LIMIT:
				if (resolve) return getParameter__pDownLimit();
				return basicGetParameter__pDownLimit();
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PDOWN_VALUE:
				if (resolve) return getParameter__pDownValue();
				return basicGetParameter__pDownValue();
			case WTSpecPackage.CTRL_UNIT10__BHV_PARAM_BP_OPERATION:
				return getBhvParam__bpOperation();
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
			case WTSpecPackage.CTRL_UNIT10__INPUT_IANALOG_INPUT:
				setInput__iAnalogInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT10__OUTPUT_OANALOG_SCALED:
				setOutput__oAnalogScaled((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PFACTOR:
				setParameter__pFactor((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_POFFSET:
				setParameter__pOffset((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PUP_LIMIT:
				setParameter__pUpLimit((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PUP_VALUE:
				setParameter__pUpValue((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PDOWN_LIMIT:
				setParameter__pDownLimit((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PDOWN_VALUE:
				setParameter__pDownValue((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT10__BHV_PARAM_BP_OPERATION:
				setBhvParam__bpOperation((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT10__INPUT_IANALOG_INPUT:
				setInput__iAnalogInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT10__OUTPUT_OANALOG_SCALED:
				setOutput__oAnalogScaled((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PFACTOR:
				setParameter__pFactor((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_POFFSET:
				setParameter__pOffset((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PUP_LIMIT:
				setParameter__pUpLimit((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PUP_VALUE:
				setParameter__pUpValue((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PDOWN_LIMIT:
				setParameter__pDownLimit((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PDOWN_VALUE:
				setParameter__pDownValue((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT10__BHV_PARAM_BP_OPERATION:
				setBhvParam__bpOperation(BHV_PARAM_BP_OPERATION_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT10__INPUT_IANALOG_INPUT:
				return input__iAnalogInput != null;
			case WTSpecPackage.CTRL_UNIT10__OUTPUT_OANALOG_SCALED:
				return output__oAnalogScaled != null;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PFACTOR:
				return parameter__pFactor != null;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_POFFSET:
				return parameter__pOffset != null;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PUP_LIMIT:
				return parameter__pUpLimit != null;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PUP_VALUE:
				return parameter__pUpValue != null;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PDOWN_LIMIT:
				return parameter__pDownLimit != null;
			case WTSpecPackage.CTRL_UNIT10__PARAMETER_PDOWN_VALUE:
				return parameter__pDownValue != null;
			case WTSpecPackage.CTRL_UNIT10__BHV_PARAM_BP_OPERATION:
				return BHV_PARAM_BP_OPERATION_EDEFAULT == null ? bhvParam__bpOperation != null : !BHV_PARAM_BP_OPERATION_EDEFAULT.equals(bhvParam__bpOperation);
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
		result.append(" (BhvParam__bpOperation: ");
		result.append(bhvParam__bpOperation);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit10Impl
