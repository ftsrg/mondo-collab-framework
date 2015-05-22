/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit15;
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
 * An implementation of the model object '<em><b>Ctrl Unit15</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit15Impl#getInput__iInput <em>Input iInput</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit15Impl#getOutput__oOutput <em>Output oOutput</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit15Impl#getParameter__pMask <em>Parameter pMask</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit15Impl extends wtcImpl implements CtrlUnit15 {
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
	 * The cached value of the '{@link #getParameter__pMask() <em>Parameter pMask</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pMask()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pMask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit15Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT15;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT15__INPUT_IINPUT, oldInput__iInput, input__iInput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT15__INPUT_IINPUT, oldInput__iInput, input__iInput));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT15__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT15__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pMask() {
		if (parameter__pMask != null && parameter__pMask.eIsProxy()) {
			InternalEObject oldParameter__pMask = (InternalEObject)parameter__pMask;
			parameter__pMask = (WTCParam)eResolveProxy(oldParameter__pMask);
			if (parameter__pMask != oldParameter__pMask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT15__PARAMETER_PMASK, oldParameter__pMask, parameter__pMask));
			}
		}
		return parameter__pMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pMask() {
		return parameter__pMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pMask(WTCParam newParameter__pMask) {
		WTCParam oldParameter__pMask = parameter__pMask;
		parameter__pMask = newParameter__pMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT15__PARAMETER_PMASK, oldParameter__pMask, parameter__pMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT15__INPUT_IINPUT:
				if (resolve) return getInput__iInput();
				return basicGetInput__iInput();
			case WTSpecPackage.CTRL_UNIT15__OUTPUT_OOUTPUT:
				if (resolve) return getOutput__oOutput();
				return basicGetOutput__oOutput();
			case WTSpecPackage.CTRL_UNIT15__PARAMETER_PMASK:
				if (resolve) return getParameter__pMask();
				return basicGetParameter__pMask();
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
			case WTSpecPackage.CTRL_UNIT15__INPUT_IINPUT:
				setInput__iInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT15__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT15__PARAMETER_PMASK:
				setParameter__pMask((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT15__INPUT_IINPUT:
				setInput__iInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT15__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT15__PARAMETER_PMASK:
				setParameter__pMask((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT15__INPUT_IINPUT:
				return input__iInput != null;
			case WTSpecPackage.CTRL_UNIT15__OUTPUT_OOUTPUT:
				return output__oOutput != null;
			case WTSpecPackage.CTRL_UNIT15__PARAMETER_PMASK:
				return parameter__pMask != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit15Impl
