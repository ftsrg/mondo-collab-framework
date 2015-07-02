/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit28;
import WTSpec.WTCFault;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit28</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit28Impl#getInput__iDigitalInput <em>Input iDigital Input</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit28Impl#getOutput__oAlarmHasBeenReset <em>Output oAlarm Has Been Reset</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit28Impl#getFault__fFault <em>Fault fFault</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit28Impl extends wtcImpl implements CtrlUnit28 {
	/**
	 * The cached value of the '{@link #getInput__iDigitalInput() <em>Input iDigital Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iDigitalInput()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iDigitalInput;

	/**
	 * The cached value of the '{@link #getOutput__oAlarmHasBeenReset() <em>Output oAlarm Has Been Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oAlarmHasBeenReset()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oAlarmHasBeenReset;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit28Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit28();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iDigitalInput() {
		if (input__iDigitalInput != null && input__iDigitalInput.eIsProxy()) {
			InternalEObject oldInput__iDigitalInput = (InternalEObject)input__iDigitalInput;
			input__iDigitalInput = (WTCInput)eResolveProxy(oldInput__iDigitalInput);
			if (input__iDigitalInput != oldInput__iDigitalInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT28__INPUT_IDIGITAL_INPUT, oldInput__iDigitalInput, input__iDigitalInput));
			}
		}
		return input__iDigitalInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iDigitalInput() {
		return input__iDigitalInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iDigitalInput(WTCInput newInput__iDigitalInput) {
		WTCInput oldInput__iDigitalInput = input__iDigitalInput;
		input__iDigitalInput = newInput__iDigitalInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT28__INPUT_IDIGITAL_INPUT, oldInput__iDigitalInput, input__iDigitalInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oAlarmHasBeenReset() {
		if (output__oAlarmHasBeenReset != null && output__oAlarmHasBeenReset.eIsProxy()) {
			InternalEObject oldOutput__oAlarmHasBeenReset = (InternalEObject)output__oAlarmHasBeenReset;
			output__oAlarmHasBeenReset = (WTCOutput)eResolveProxy(oldOutput__oAlarmHasBeenReset);
			if (output__oAlarmHasBeenReset != oldOutput__oAlarmHasBeenReset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT28__OUTPUT_OALARM_HAS_BEEN_RESET, oldOutput__oAlarmHasBeenReset, output__oAlarmHasBeenReset));
			}
		}
		return output__oAlarmHasBeenReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oAlarmHasBeenReset() {
		return output__oAlarmHasBeenReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oAlarmHasBeenReset(WTCOutput newOutput__oAlarmHasBeenReset) {
		WTCOutput oldOutput__oAlarmHasBeenReset = output__oAlarmHasBeenReset;
		output__oAlarmHasBeenReset = newOutput__oAlarmHasBeenReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT28__OUTPUT_OALARM_HAS_BEEN_RESET, oldOutput__oAlarmHasBeenReset, output__oAlarmHasBeenReset));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT28__FAULT_FFAULT, oldFault__fFault, fault__fFault));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT28__FAULT_FFAULT, oldFault__fFault, fault__fFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT28__INPUT_IDIGITAL_INPUT:
				if (resolve) return getInput__iDigitalInput();
				return basicGetInput__iDigitalInput();
			case WTSpecPackage.CTRL_UNIT28__OUTPUT_OALARM_HAS_BEEN_RESET:
				if (resolve) return getOutput__oAlarmHasBeenReset();
				return basicGetOutput__oAlarmHasBeenReset();
			case WTSpecPackage.CTRL_UNIT28__FAULT_FFAULT:
				if (resolve) return getFault__fFault();
				return basicGetFault__fFault();
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
			case WTSpecPackage.CTRL_UNIT28__INPUT_IDIGITAL_INPUT:
				setInput__iDigitalInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT28__OUTPUT_OALARM_HAS_BEEN_RESET:
				setOutput__oAlarmHasBeenReset((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT28__FAULT_FFAULT:
				setFault__fFault((WTCFault)newValue);
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
			case WTSpecPackage.CTRL_UNIT28__INPUT_IDIGITAL_INPUT:
				setInput__iDigitalInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT28__OUTPUT_OALARM_HAS_BEEN_RESET:
				setOutput__oAlarmHasBeenReset((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT28__FAULT_FFAULT:
				setFault__fFault((WTCFault)null);
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
			case WTSpecPackage.CTRL_UNIT28__INPUT_IDIGITAL_INPUT:
				return input__iDigitalInput != null;
			case WTSpecPackage.CTRL_UNIT28__OUTPUT_OALARM_HAS_BEEN_RESET:
				return output__oAlarmHasBeenReset != null;
			case WTSpecPackage.CTRL_UNIT28__FAULT_FFAULT:
				return fault__fFault != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit28Impl
