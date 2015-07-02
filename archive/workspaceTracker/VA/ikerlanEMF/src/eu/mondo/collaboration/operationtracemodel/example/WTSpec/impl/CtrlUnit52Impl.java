/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit52;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit52</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit52Impl#getInput__iVarInput <em>Input iVar Input</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit52Impl#getOutput__oVarOutput <em>Output oVar Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit52Impl extends wtcImpl implements CtrlUnit52 {
	/**
	 * The cached value of the '{@link #getInput__iVarInput() <em>Input iVar Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iVarInput()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iVarInput;

	/**
	 * The cached value of the '{@link #getOutput__oVarOutput() <em>Output oVar Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oVarOutput()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oVarOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit52Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit52();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iVarInput() {
		if (input__iVarInput != null && input__iVarInput.eIsProxy()) {
			InternalEObject oldInput__iVarInput = (InternalEObject)input__iVarInput;
			input__iVarInput = (WTCInput)eResolveProxy(oldInput__iVarInput);
			if (input__iVarInput != oldInput__iVarInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT52__INPUT_IVAR_INPUT, oldInput__iVarInput, input__iVarInput));
			}
		}
		return input__iVarInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iVarInput() {
		return input__iVarInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iVarInput(WTCInput newInput__iVarInput) {
		WTCInput oldInput__iVarInput = input__iVarInput;
		input__iVarInput = newInput__iVarInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT52__INPUT_IVAR_INPUT, oldInput__iVarInput, input__iVarInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oVarOutput() {
		if (output__oVarOutput != null && output__oVarOutput.eIsProxy()) {
			InternalEObject oldOutput__oVarOutput = (InternalEObject)output__oVarOutput;
			output__oVarOutput = (WTCOutput)eResolveProxy(oldOutput__oVarOutput);
			if (output__oVarOutput != oldOutput__oVarOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT52__OUTPUT_OVAR_OUTPUT, oldOutput__oVarOutput, output__oVarOutput));
			}
		}
		return output__oVarOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oVarOutput() {
		return output__oVarOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oVarOutput(WTCOutput newOutput__oVarOutput) {
		WTCOutput oldOutput__oVarOutput = output__oVarOutput;
		output__oVarOutput = newOutput__oVarOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT52__OUTPUT_OVAR_OUTPUT, oldOutput__oVarOutput, output__oVarOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT52__INPUT_IVAR_INPUT:
				if (resolve) return getInput__iVarInput();
				return basicGetInput__iVarInput();
			case WTSpecPackage.CTRL_UNIT52__OUTPUT_OVAR_OUTPUT:
				if (resolve) return getOutput__oVarOutput();
				return basicGetOutput__oVarOutput();
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
			case WTSpecPackage.CTRL_UNIT52__INPUT_IVAR_INPUT:
				setInput__iVarInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT52__OUTPUT_OVAR_OUTPUT:
				setOutput__oVarOutput((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT52__INPUT_IVAR_INPUT:
				setInput__iVarInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT52__OUTPUT_OVAR_OUTPUT:
				setOutput__oVarOutput((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT52__INPUT_IVAR_INPUT:
				return input__iVarInput != null;
			case WTSpecPackage.CTRL_UNIT52__OUTPUT_OVAR_OUTPUT:
				return output__oVarOutput != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit52Impl
