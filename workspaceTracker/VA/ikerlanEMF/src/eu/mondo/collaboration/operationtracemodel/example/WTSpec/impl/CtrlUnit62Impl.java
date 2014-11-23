/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit62;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit62</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit62Impl#getInput__iInverterTorqueRef <em>Input iInverter Torque Ref</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit62Impl#getInput__iInverterTorqueRefLocking <em>Input iInverter Torque Ref Locking</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit62Impl#getInput__iMotorizing <em>Input iMotorizing</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit62Impl#getOutput__oInverterTorqueRefFinal <em>Output oInverter Torque Ref Final</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit62Impl#getOutput__oInverterMotorizeCommand <em>Output oInverter Motorize Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit62Impl extends wtcImpl implements CtrlUnit62 {
	/**
	 * The cached value of the '{@link #getInput__iInverterTorqueRef() <em>Input iInverter Torque Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInverterTorqueRef()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInverterTorqueRef;

	/**
	 * The cached value of the '{@link #getInput__iInverterTorqueRefLocking() <em>Input iInverter Torque Ref Locking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInverterTorqueRefLocking()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInverterTorqueRefLocking;

	/**
	 * The cached value of the '{@link #getInput__iMotorizing() <em>Input iMotorizing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iMotorizing()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iMotorizing;

	/**
	 * The cached value of the '{@link #getOutput__oInverterTorqueRefFinal() <em>Output oInverter Torque Ref Final</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oInverterTorqueRefFinal()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oInverterTorqueRefFinal;

	/**
	 * The cached value of the '{@link #getOutput__oInverterMotorizeCommand() <em>Output oInverter Motorize Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oInverterMotorizeCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oInverterMotorizeCommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit62Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit62();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInverterTorqueRef() {
		if (input__iInverterTorqueRef != null && input__iInverterTorqueRef.eIsProxy()) {
			InternalEObject oldInput__iInverterTorqueRef = (InternalEObject)input__iInverterTorqueRef;
			input__iInverterTorqueRef = (WTCInput)eResolveProxy(oldInput__iInverterTorqueRef);
			if (input__iInverterTorqueRef != oldInput__iInverterTorqueRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT62__INPUT_IINVERTER_TORQUE_REF, oldInput__iInverterTorqueRef, input__iInverterTorqueRef));
			}
		}
		return input__iInverterTorqueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInverterTorqueRef() {
		return input__iInverterTorqueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInverterTorqueRef(WTCInput newInput__iInverterTorqueRef) {
		WTCInput oldInput__iInverterTorqueRef = input__iInverterTorqueRef;
		input__iInverterTorqueRef = newInput__iInverterTorqueRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT62__INPUT_IINVERTER_TORQUE_REF, oldInput__iInverterTorqueRef, input__iInverterTorqueRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInverterTorqueRefLocking() {
		if (input__iInverterTorqueRefLocking != null && input__iInverterTorqueRefLocking.eIsProxy()) {
			InternalEObject oldInput__iInverterTorqueRefLocking = (InternalEObject)input__iInverterTorqueRefLocking;
			input__iInverterTorqueRefLocking = (WTCInput)eResolveProxy(oldInput__iInverterTorqueRefLocking);
			if (input__iInverterTorqueRefLocking != oldInput__iInverterTorqueRefLocking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT62__INPUT_IINVERTER_TORQUE_REF_LOCKING, oldInput__iInverterTorqueRefLocking, input__iInverterTorqueRefLocking));
			}
		}
		return input__iInverterTorqueRefLocking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInverterTorqueRefLocking() {
		return input__iInverterTorqueRefLocking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInverterTorqueRefLocking(WTCInput newInput__iInverterTorqueRefLocking) {
		WTCInput oldInput__iInverterTorqueRefLocking = input__iInverterTorqueRefLocking;
		input__iInverterTorqueRefLocking = newInput__iInverterTorqueRefLocking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT62__INPUT_IINVERTER_TORQUE_REF_LOCKING, oldInput__iInverterTorqueRefLocking, input__iInverterTorqueRefLocking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iMotorizing() {
		if (input__iMotorizing != null && input__iMotorizing.eIsProxy()) {
			InternalEObject oldInput__iMotorizing = (InternalEObject)input__iMotorizing;
			input__iMotorizing = (WTCInput)eResolveProxy(oldInput__iMotorizing);
			if (input__iMotorizing != oldInput__iMotorizing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT62__INPUT_IMOTORIZING, oldInput__iMotorizing, input__iMotorizing));
			}
		}
		return input__iMotorizing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iMotorizing() {
		return input__iMotorizing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iMotorizing(WTCInput newInput__iMotorizing) {
		WTCInput oldInput__iMotorizing = input__iMotorizing;
		input__iMotorizing = newInput__iMotorizing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT62__INPUT_IMOTORIZING, oldInput__iMotorizing, input__iMotorizing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oInverterTorqueRefFinal() {
		if (output__oInverterTorqueRefFinal != null && output__oInverterTorqueRefFinal.eIsProxy()) {
			InternalEObject oldOutput__oInverterTorqueRefFinal = (InternalEObject)output__oInverterTorqueRefFinal;
			output__oInverterTorqueRefFinal = (WTCOutput)eResolveProxy(oldOutput__oInverterTorqueRefFinal);
			if (output__oInverterTorqueRefFinal != oldOutput__oInverterTorqueRefFinal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT62__OUTPUT_OINVERTER_TORQUE_REF_FINAL, oldOutput__oInverterTorqueRefFinal, output__oInverterTorqueRefFinal));
			}
		}
		return output__oInverterTorqueRefFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oInverterTorqueRefFinal() {
		return output__oInverterTorqueRefFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oInverterTorqueRefFinal(WTCOutput newOutput__oInverterTorqueRefFinal) {
		WTCOutput oldOutput__oInverterTorqueRefFinal = output__oInverterTorqueRefFinal;
		output__oInverterTorqueRefFinal = newOutput__oInverterTorqueRefFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT62__OUTPUT_OINVERTER_TORQUE_REF_FINAL, oldOutput__oInverterTorqueRefFinal, output__oInverterTorqueRefFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oInverterMotorizeCommand() {
		if (output__oInverterMotorizeCommand != null && output__oInverterMotorizeCommand.eIsProxy()) {
			InternalEObject oldOutput__oInverterMotorizeCommand = (InternalEObject)output__oInverterMotorizeCommand;
			output__oInverterMotorizeCommand = (WTCOutput)eResolveProxy(oldOutput__oInverterMotorizeCommand);
			if (output__oInverterMotorizeCommand != oldOutput__oInverterMotorizeCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT62__OUTPUT_OINVERTER_MOTORIZE_COMMAND, oldOutput__oInverterMotorizeCommand, output__oInverterMotorizeCommand));
			}
		}
		return output__oInverterMotorizeCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oInverterMotorizeCommand() {
		return output__oInverterMotorizeCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oInverterMotorizeCommand(WTCOutput newOutput__oInverterMotorizeCommand) {
		WTCOutput oldOutput__oInverterMotorizeCommand = output__oInverterMotorizeCommand;
		output__oInverterMotorizeCommand = newOutput__oInverterMotorizeCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT62__OUTPUT_OINVERTER_MOTORIZE_COMMAND, oldOutput__oInverterMotorizeCommand, output__oInverterMotorizeCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT62__INPUT_IINVERTER_TORQUE_REF:
				if (resolve) return getInput__iInverterTorqueRef();
				return basicGetInput__iInverterTorqueRef();
			case WTSpecPackage.CTRL_UNIT62__INPUT_IINVERTER_TORQUE_REF_LOCKING:
				if (resolve) return getInput__iInverterTorqueRefLocking();
				return basicGetInput__iInverterTorqueRefLocking();
			case WTSpecPackage.CTRL_UNIT62__INPUT_IMOTORIZING:
				if (resolve) return getInput__iMotorizing();
				return basicGetInput__iMotorizing();
			case WTSpecPackage.CTRL_UNIT62__OUTPUT_OINVERTER_TORQUE_REF_FINAL:
				if (resolve) return getOutput__oInverterTorqueRefFinal();
				return basicGetOutput__oInverterTorqueRefFinal();
			case WTSpecPackage.CTRL_UNIT62__OUTPUT_OINVERTER_MOTORIZE_COMMAND:
				if (resolve) return getOutput__oInverterMotorizeCommand();
				return basicGetOutput__oInverterMotorizeCommand();
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
			case WTSpecPackage.CTRL_UNIT62__INPUT_IINVERTER_TORQUE_REF:
				setInput__iInverterTorqueRef((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT62__INPUT_IINVERTER_TORQUE_REF_LOCKING:
				setInput__iInverterTorqueRefLocking((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT62__INPUT_IMOTORIZING:
				setInput__iMotorizing((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT62__OUTPUT_OINVERTER_TORQUE_REF_FINAL:
				setOutput__oInverterTorqueRefFinal((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT62__OUTPUT_OINVERTER_MOTORIZE_COMMAND:
				setOutput__oInverterMotorizeCommand((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT62__INPUT_IINVERTER_TORQUE_REF:
				setInput__iInverterTorqueRef((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT62__INPUT_IINVERTER_TORQUE_REF_LOCKING:
				setInput__iInverterTorqueRefLocking((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT62__INPUT_IMOTORIZING:
				setInput__iMotorizing((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT62__OUTPUT_OINVERTER_TORQUE_REF_FINAL:
				setOutput__oInverterTorqueRefFinal((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT62__OUTPUT_OINVERTER_MOTORIZE_COMMAND:
				setOutput__oInverterMotorizeCommand((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT62__INPUT_IINVERTER_TORQUE_REF:
				return input__iInverterTorqueRef != null;
			case WTSpecPackage.CTRL_UNIT62__INPUT_IINVERTER_TORQUE_REF_LOCKING:
				return input__iInverterTorqueRefLocking != null;
			case WTSpecPackage.CTRL_UNIT62__INPUT_IMOTORIZING:
				return input__iMotorizing != null;
			case WTSpecPackage.CTRL_UNIT62__OUTPUT_OINVERTER_TORQUE_REF_FINAL:
				return output__oInverterTorqueRefFinal != null;
			case WTSpecPackage.CTRL_UNIT62__OUTPUT_OINVERTER_MOTORIZE_COMMAND:
				return output__oInverterMotorizeCommand != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit62Impl
