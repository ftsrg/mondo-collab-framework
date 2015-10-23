/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit74;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit74</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit74Impl#getInput__iConverterTripped <em>Input iConverter Tripped</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit74Impl#getInput__iConverterRunning <em>Input iConverter Running</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit74Impl#getOutput__oOpcCnvOperationMode <em>Output oOpc Cnv Operation Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit74Impl extends wtcImpl implements CtrlUnit74 {
	/**
	 * The cached value of the '{@link #getInput__iConverterTripped() <em>Input iConverter Tripped</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iConverterTripped()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iConverterTripped;

	/**
	 * The cached value of the '{@link #getInput__iConverterRunning() <em>Input iConverter Running</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iConverterRunning()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iConverterRunning;

	/**
	 * The cached value of the '{@link #getOutput__oOpcCnvOperationMode() <em>Output oOpc Cnv Operation Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOpcCnvOperationMode()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOpcCnvOperationMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit74Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT74;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iConverterTripped() {
		if (input__iConverterTripped != null && input__iConverterTripped.eIsProxy()) {
			InternalEObject oldInput__iConverterTripped = (InternalEObject)input__iConverterTripped;
			input__iConverterTripped = (WTCInput)eResolveProxy(oldInput__iConverterTripped);
			if (input__iConverterTripped != oldInput__iConverterTripped) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT74__INPUT_ICONVERTER_TRIPPED, oldInput__iConverterTripped, input__iConverterTripped));
			}
		}
		return input__iConverterTripped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iConverterTripped() {
		return input__iConverterTripped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iConverterTripped(WTCInput newInput__iConverterTripped) {
		WTCInput oldInput__iConverterTripped = input__iConverterTripped;
		input__iConverterTripped = newInput__iConverterTripped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT74__INPUT_ICONVERTER_TRIPPED, oldInput__iConverterTripped, input__iConverterTripped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iConverterRunning() {
		if (input__iConverterRunning != null && input__iConverterRunning.eIsProxy()) {
			InternalEObject oldInput__iConverterRunning = (InternalEObject)input__iConverterRunning;
			input__iConverterRunning = (WTCInput)eResolveProxy(oldInput__iConverterRunning);
			if (input__iConverterRunning != oldInput__iConverterRunning) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT74__INPUT_ICONVERTER_RUNNING, oldInput__iConverterRunning, input__iConverterRunning));
			}
		}
		return input__iConverterRunning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iConverterRunning() {
		return input__iConverterRunning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iConverterRunning(WTCInput newInput__iConverterRunning) {
		WTCInput oldInput__iConverterRunning = input__iConverterRunning;
		input__iConverterRunning = newInput__iConverterRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT74__INPUT_ICONVERTER_RUNNING, oldInput__iConverterRunning, input__iConverterRunning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOpcCnvOperationMode() {
		if (output__oOpcCnvOperationMode != null && output__oOpcCnvOperationMode.eIsProxy()) {
			InternalEObject oldOutput__oOpcCnvOperationMode = (InternalEObject)output__oOpcCnvOperationMode;
			output__oOpcCnvOperationMode = (WTCOutput)eResolveProxy(oldOutput__oOpcCnvOperationMode);
			if (output__oOpcCnvOperationMode != oldOutput__oOpcCnvOperationMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT74__OUTPUT_OOPC_CNV_OPERATION_MODE, oldOutput__oOpcCnvOperationMode, output__oOpcCnvOperationMode));
			}
		}
		return output__oOpcCnvOperationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOpcCnvOperationMode() {
		return output__oOpcCnvOperationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOpcCnvOperationMode(WTCOutput newOutput__oOpcCnvOperationMode) {
		WTCOutput oldOutput__oOpcCnvOperationMode = output__oOpcCnvOperationMode;
		output__oOpcCnvOperationMode = newOutput__oOpcCnvOperationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT74__OUTPUT_OOPC_CNV_OPERATION_MODE, oldOutput__oOpcCnvOperationMode, output__oOpcCnvOperationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT74__INPUT_ICONVERTER_TRIPPED:
				if (resolve) return getInput__iConverterTripped();
				return basicGetInput__iConverterTripped();
			case WTSpecPackage.CTRL_UNIT74__INPUT_ICONVERTER_RUNNING:
				if (resolve) return getInput__iConverterRunning();
				return basicGetInput__iConverterRunning();
			case WTSpecPackage.CTRL_UNIT74__OUTPUT_OOPC_CNV_OPERATION_MODE:
				if (resolve) return getOutput__oOpcCnvOperationMode();
				return basicGetOutput__oOpcCnvOperationMode();
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
			case WTSpecPackage.CTRL_UNIT74__INPUT_ICONVERTER_TRIPPED:
				setInput__iConverterTripped((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT74__INPUT_ICONVERTER_RUNNING:
				setInput__iConverterRunning((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT74__OUTPUT_OOPC_CNV_OPERATION_MODE:
				setOutput__oOpcCnvOperationMode((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT74__INPUT_ICONVERTER_TRIPPED:
				setInput__iConverterTripped((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT74__INPUT_ICONVERTER_RUNNING:
				setInput__iConverterRunning((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT74__OUTPUT_OOPC_CNV_OPERATION_MODE:
				setOutput__oOpcCnvOperationMode((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT74__INPUT_ICONVERTER_TRIPPED:
				return input__iConverterTripped != null;
			case WTSpecPackage.CTRL_UNIT74__INPUT_ICONVERTER_RUNNING:
				return input__iConverterRunning != null;
			case WTSpecPackage.CTRL_UNIT74__OUTPUT_OOPC_CNV_OPERATION_MODE:
				return output__oOpcCnvOperationMode != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit74Impl
