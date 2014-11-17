/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit131;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCFault;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit131</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit131Impl#getInput__iExcessivePressure <em>Input iExcessive Pressure</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit131Impl#getInput__iBrakeCommand <em>Input iBrake Command</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit131Impl#getFault__fCommError <em>Fault fComm Error</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit131Impl#getFault__fFault <em>Fault fFault</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit131Impl#getBhvParam__bpLogicType <em>Bhv Param bp Logic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit131Impl extends wtcImpl implements CtrlUnit131 {
	/**
	 * The cached value of the '{@link #getInput__iExcessivePressure() <em>Input iExcessive Pressure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iExcessivePressure()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iExcessivePressure;

	/**
	 * The cached value of the '{@link #getInput__iBrakeCommand() <em>Input iBrake Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iBrakeCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iBrakeCommand;

	/**
	 * The cached value of the '{@link #getFault__fCommError() <em>Fault fComm Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fCommError()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fCommError;

	/**
	 * The cached value of the '{@link #getFault__fFault() <em>Fault fFault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fFault()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fFault;

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
	protected CtrlUnit131Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit131();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iExcessivePressure() {
		if (input__iExcessivePressure != null && input__iExcessivePressure.eIsProxy()) {
			InternalEObject oldInput__iExcessivePressure = (InternalEObject)input__iExcessivePressure;
			input__iExcessivePressure = (WTCInput)eResolveProxy(oldInput__iExcessivePressure);
			if (input__iExcessivePressure != oldInput__iExcessivePressure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT131__INPUT_IEXCESSIVE_PRESSURE, oldInput__iExcessivePressure, input__iExcessivePressure));
			}
		}
		return input__iExcessivePressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iExcessivePressure() {
		return input__iExcessivePressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iExcessivePressure(WTCInput newInput__iExcessivePressure) {
		WTCInput oldInput__iExcessivePressure = input__iExcessivePressure;
		input__iExcessivePressure = newInput__iExcessivePressure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT131__INPUT_IEXCESSIVE_PRESSURE, oldInput__iExcessivePressure, input__iExcessivePressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iBrakeCommand() {
		if (input__iBrakeCommand != null && input__iBrakeCommand.eIsProxy()) {
			InternalEObject oldInput__iBrakeCommand = (InternalEObject)input__iBrakeCommand;
			input__iBrakeCommand = (WTCInput)eResolveProxy(oldInput__iBrakeCommand);
			if (input__iBrakeCommand != oldInput__iBrakeCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT131__INPUT_IBRAKE_COMMAND, oldInput__iBrakeCommand, input__iBrakeCommand));
			}
		}
		return input__iBrakeCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iBrakeCommand() {
		return input__iBrakeCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iBrakeCommand(WTCInput newInput__iBrakeCommand) {
		WTCInput oldInput__iBrakeCommand = input__iBrakeCommand;
		input__iBrakeCommand = newInput__iBrakeCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT131__INPUT_IBRAKE_COMMAND, oldInput__iBrakeCommand, input__iBrakeCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fCommError() {
		if (fault__fCommError != null && fault__fCommError.eIsProxy()) {
			InternalEObject oldFault__fCommError = (InternalEObject)fault__fCommError;
			fault__fCommError = (WTCFault)eResolveProxy(oldFault__fCommError);
			if (fault__fCommError != oldFault__fCommError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT131__FAULT_FCOMM_ERROR, oldFault__fCommError, fault__fCommError));
			}
		}
		return fault__fCommError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fCommError() {
		return fault__fCommError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fCommError(WTCFault newFault__fCommError) {
		WTCFault oldFault__fCommError = fault__fCommError;
		fault__fCommError = newFault__fCommError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT131__FAULT_FCOMM_ERROR, oldFault__fCommError, fault__fCommError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fFault() {
		if (fault__fFault != null && fault__fFault.eIsProxy()) {
			InternalEObject oldFault__fFault = (InternalEObject)fault__fFault;
			fault__fFault = (WTCFault)eResolveProxy(oldFault__fFault);
			if (fault__fFault != oldFault__fFault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT131__FAULT_FFAULT, oldFault__fFault, fault__fFault));
			}
		}
		return fault__fFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fFault() {
		return fault__fFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fFault(WTCFault newFault__fFault) {
		WTCFault oldFault__fFault = fault__fFault;
		fault__fFault = newFault__fFault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT131__FAULT_FFAULT, oldFault__fFault, fault__fFault));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT131__BHV_PARAM_BP_LOGIC_TYPE, oldBhvParam__bpLogicType, bhvParam__bpLogicType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT131__INPUT_IEXCESSIVE_PRESSURE:
				if (resolve) return getInput__iExcessivePressure();
				return basicGetInput__iExcessivePressure();
			case WTSpecPackage.CTRL_UNIT131__INPUT_IBRAKE_COMMAND:
				if (resolve) return getInput__iBrakeCommand();
				return basicGetInput__iBrakeCommand();
			case WTSpecPackage.CTRL_UNIT131__FAULT_FCOMM_ERROR:
				if (resolve) return getFault__fCommError();
				return basicGetFault__fCommError();
			case WTSpecPackage.CTRL_UNIT131__FAULT_FFAULT:
				if (resolve) return getFault__fFault();
				return basicGetFault__fFault();
			case WTSpecPackage.CTRL_UNIT131__BHV_PARAM_BP_LOGIC_TYPE:
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
			case WTSpecPackage.CTRL_UNIT131__INPUT_IEXCESSIVE_PRESSURE:
				setInput__iExcessivePressure((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT131__INPUT_IBRAKE_COMMAND:
				setInput__iBrakeCommand((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT131__FAULT_FCOMM_ERROR:
				setFault__fCommError((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT131__FAULT_FFAULT:
				setFault__fFault((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT131__BHV_PARAM_BP_LOGIC_TYPE:
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
			case WTSpecPackage.CTRL_UNIT131__INPUT_IEXCESSIVE_PRESSURE:
				setInput__iExcessivePressure((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT131__INPUT_IBRAKE_COMMAND:
				setInput__iBrakeCommand((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT131__FAULT_FCOMM_ERROR:
				setFault__fCommError((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT131__FAULT_FFAULT:
				setFault__fFault((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT131__BHV_PARAM_BP_LOGIC_TYPE:
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
			case WTSpecPackage.CTRL_UNIT131__INPUT_IEXCESSIVE_PRESSURE:
				return input__iExcessivePressure != null;
			case WTSpecPackage.CTRL_UNIT131__INPUT_IBRAKE_COMMAND:
				return input__iBrakeCommand != null;
			case WTSpecPackage.CTRL_UNIT131__FAULT_FCOMM_ERROR:
				return fault__fCommError != null;
			case WTSpecPackage.CTRL_UNIT131__FAULT_FFAULT:
				return fault__fFault != null;
			case WTSpecPackage.CTRL_UNIT131__BHV_PARAM_BP_LOGIC_TYPE:
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

} //CtrlUnit131Impl
