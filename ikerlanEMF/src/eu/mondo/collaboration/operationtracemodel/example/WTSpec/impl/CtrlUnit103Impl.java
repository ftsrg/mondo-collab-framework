/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit103;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit103</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit103Impl#getInput__iInput1 <em>Input iInput1</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit103Impl#getInput__iInput2 <em>Input iInput2</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit103Impl#getOutput__oResult <em>Output oResult</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit103Impl extends wtcImpl implements CtrlUnit103 {
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
	 * The cached value of the '{@link #getOutput__oResult() <em>Output oResult</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oResult()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit103Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit103();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT103__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT103__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT103__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT103__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oResult() {
		if (output__oResult != null && output__oResult.eIsProxy()) {
			InternalEObject oldOutput__oResult = (InternalEObject)output__oResult;
			output__oResult = (WTCOutput)eResolveProxy(oldOutput__oResult);
			if (output__oResult != oldOutput__oResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT103__OUTPUT_ORESULT, oldOutput__oResult, output__oResult));
			}
		}
		return output__oResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oResult() {
		return output__oResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oResult(WTCOutput newOutput__oResult) {
		WTCOutput oldOutput__oResult = output__oResult;
		output__oResult = newOutput__oResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT103__OUTPUT_ORESULT, oldOutput__oResult, output__oResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT103__INPUT_IINPUT1:
				if (resolve) return getInput__iInput1();
				return basicGetInput__iInput1();
			case WTSpecPackage.CTRL_UNIT103__INPUT_IINPUT2:
				if (resolve) return getInput__iInput2();
				return basicGetInput__iInput2();
			case WTSpecPackage.CTRL_UNIT103__OUTPUT_ORESULT:
				if (resolve) return getOutput__oResult();
				return basicGetOutput__oResult();
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
			case WTSpecPackage.CTRL_UNIT103__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT103__INPUT_IINPUT2:
				setInput__iInput2((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT103__OUTPUT_ORESULT:
				setOutput__oResult((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT103__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT103__INPUT_IINPUT2:
				setInput__iInput2((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT103__OUTPUT_ORESULT:
				setOutput__oResult((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT103__INPUT_IINPUT1:
				return input__iInput1 != null;
			case WTSpecPackage.CTRL_UNIT103__INPUT_IINPUT2:
				return input__iInput2 != null;
			case WTSpecPackage.CTRL_UNIT103__OUTPUT_ORESULT:
				return output__oResult != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit103Impl
