/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit71;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit71</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit71Impl#getInput__iSelect1 <em>Input iSelect1</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit71Impl#getInput__iSelect2 <em>Input iSelect2</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit71Impl#getInput__iSelect3 <em>Input iSelect3</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit71Impl#getInput__iInput1 <em>Input iInput1</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit71Impl#getInput__iInput2 <em>Input iInput2</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit71Impl#getInput__iInput3 <em>Input iInput3</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit71Impl#getOutput__oOutput <em>Output oOutput</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit71Impl#getOutput__oOutputWrongStatus <em>Output oOutput Wrong Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit71Impl extends wtcImpl implements CtrlUnit71 {
	/**
	 * The cached value of the '{@link #getInput__iSelect1() <em>Input iSelect1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iSelect1()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iSelect1;

	/**
	 * The cached value of the '{@link #getInput__iSelect2() <em>Input iSelect2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iSelect2()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iSelect2;

	/**
	 * The cached value of the '{@link #getInput__iSelect3() <em>Input iSelect3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iSelect3()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iSelect3;

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
	 * The cached value of the '{@link #getInput__iInput3() <em>Input iInput3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInput3()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInput3;

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
	 * The cached value of the '{@link #getOutput__oOutputWrongStatus() <em>Output oOutput Wrong Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOutputWrongStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOutputWrongStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit71Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit71();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iSelect1() {
		if (input__iSelect1 != null && input__iSelect1.eIsProxy()) {
			InternalEObject oldInput__iSelect1 = (InternalEObject)input__iSelect1;
			input__iSelect1 = (WTCInput)eResolveProxy(oldInput__iSelect1);
			if (input__iSelect1 != oldInput__iSelect1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT1, oldInput__iSelect1, input__iSelect1));
			}
		}
		return input__iSelect1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iSelect1() {
		return input__iSelect1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iSelect1(WTCInput newInput__iSelect1) {
		WTCInput oldInput__iSelect1 = input__iSelect1;
		input__iSelect1 = newInput__iSelect1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT1, oldInput__iSelect1, input__iSelect1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iSelect2() {
		if (input__iSelect2 != null && input__iSelect2.eIsProxy()) {
			InternalEObject oldInput__iSelect2 = (InternalEObject)input__iSelect2;
			input__iSelect2 = (WTCInput)eResolveProxy(oldInput__iSelect2);
			if (input__iSelect2 != oldInput__iSelect2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT2, oldInput__iSelect2, input__iSelect2));
			}
		}
		return input__iSelect2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iSelect2() {
		return input__iSelect2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iSelect2(WTCInput newInput__iSelect2) {
		WTCInput oldInput__iSelect2 = input__iSelect2;
		input__iSelect2 = newInput__iSelect2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT2, oldInput__iSelect2, input__iSelect2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iSelect3() {
		if (input__iSelect3 != null && input__iSelect3.eIsProxy()) {
			InternalEObject oldInput__iSelect3 = (InternalEObject)input__iSelect3;
			input__iSelect3 = (WTCInput)eResolveProxy(oldInput__iSelect3);
			if (input__iSelect3 != oldInput__iSelect3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT3, oldInput__iSelect3, input__iSelect3));
			}
		}
		return input__iSelect3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iSelect3() {
		return input__iSelect3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iSelect3(WTCInput newInput__iSelect3) {
		WTCInput oldInput__iSelect3 = input__iSelect3;
		input__iSelect3 = newInput__iSelect3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT3, oldInput__iSelect3, input__iSelect3));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT1, oldInput__iInput1, input__iInput1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT2, oldInput__iInput2, input__iInput2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInput3() {
		if (input__iInput3 != null && input__iInput3.eIsProxy()) {
			InternalEObject oldInput__iInput3 = (InternalEObject)input__iInput3;
			input__iInput3 = (WTCInput)eResolveProxy(oldInput__iInput3);
			if (input__iInput3 != oldInput__iInput3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT3, oldInput__iInput3, input__iInput3));
			}
		}
		return input__iInput3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInput3() {
		return input__iInput3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInput3(WTCInput newInput__iInput3) {
		WTCInput oldInput__iInput3 = input__iInput3;
		input__iInput3 = newInput__iInput3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT3, oldInput__iInput3, input__iInput3));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT71__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT71__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOutputWrongStatus() {
		if (output__oOutputWrongStatus != null && output__oOutputWrongStatus.eIsProxy()) {
			InternalEObject oldOutput__oOutputWrongStatus = (InternalEObject)output__oOutputWrongStatus;
			output__oOutputWrongStatus = (WTCOutput)eResolveProxy(oldOutput__oOutputWrongStatus);
			if (output__oOutputWrongStatus != oldOutput__oOutputWrongStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT71__OUTPUT_OOUTPUT_WRONG_STATUS, oldOutput__oOutputWrongStatus, output__oOutputWrongStatus));
			}
		}
		return output__oOutputWrongStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOutputWrongStatus() {
		return output__oOutputWrongStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOutputWrongStatus(WTCOutput newOutput__oOutputWrongStatus) {
		WTCOutput oldOutput__oOutputWrongStatus = output__oOutputWrongStatus;
		output__oOutputWrongStatus = newOutput__oOutputWrongStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT71__OUTPUT_OOUTPUT_WRONG_STATUS, oldOutput__oOutputWrongStatus, output__oOutputWrongStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT1:
				if (resolve) return getInput__iSelect1();
				return basicGetInput__iSelect1();
			case WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT2:
				if (resolve) return getInput__iSelect2();
				return basicGetInput__iSelect2();
			case WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT3:
				if (resolve) return getInput__iSelect3();
				return basicGetInput__iSelect3();
			case WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT1:
				if (resolve) return getInput__iInput1();
				return basicGetInput__iInput1();
			case WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT2:
				if (resolve) return getInput__iInput2();
				return basicGetInput__iInput2();
			case WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT3:
				if (resolve) return getInput__iInput3();
				return basicGetInput__iInput3();
			case WTSpecPackage.CTRL_UNIT71__OUTPUT_OOUTPUT:
				if (resolve) return getOutput__oOutput();
				return basicGetOutput__oOutput();
			case WTSpecPackage.CTRL_UNIT71__OUTPUT_OOUTPUT_WRONG_STATUS:
				if (resolve) return getOutput__oOutputWrongStatus();
				return basicGetOutput__oOutputWrongStatus();
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
			case WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT1:
				setInput__iSelect1((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT2:
				setInput__iSelect2((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT3:
				setInput__iSelect3((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT2:
				setInput__iInput2((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT3:
				setInput__iInput3((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT71__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT71__OUTPUT_OOUTPUT_WRONG_STATUS:
				setOutput__oOutputWrongStatus((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT1:
				setInput__iSelect1((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT2:
				setInput__iSelect2((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT3:
				setInput__iSelect3((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT1:
				setInput__iInput1((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT2:
				setInput__iInput2((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT3:
				setInput__iInput3((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT71__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT71__OUTPUT_OOUTPUT_WRONG_STATUS:
				setOutput__oOutputWrongStatus((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT1:
				return input__iSelect1 != null;
			case WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT2:
				return input__iSelect2 != null;
			case WTSpecPackage.CTRL_UNIT71__INPUT_ISELECT3:
				return input__iSelect3 != null;
			case WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT1:
				return input__iInput1 != null;
			case WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT2:
				return input__iInput2 != null;
			case WTSpecPackage.CTRL_UNIT71__INPUT_IINPUT3:
				return input__iInput3 != null;
			case WTSpecPackage.CTRL_UNIT71__OUTPUT_OOUTPUT:
				return output__oOutput != null;
			case WTSpecPackage.CTRL_UNIT71__OUTPUT_OOUTPUT_WRONG_STATUS:
				return output__oOutputWrongStatus != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit71Impl
