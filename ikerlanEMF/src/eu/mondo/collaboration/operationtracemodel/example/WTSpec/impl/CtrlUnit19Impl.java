/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit19;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCParam;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit19</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit19Impl#getInput__iPitchTorque <em>Input iPitch Torque</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit19Impl#getOutput__oPitchRms <em>Output oPitch Rms</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit19Impl#getParameter__pDivisor <em>Parameter pDivisor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit19Impl extends wtcImpl implements CtrlUnit19 {
	/**
	 * The cached value of the '{@link #getInput__iPitchTorque() <em>Input iPitch Torque</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPitchTorque()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPitchTorque;

	/**
	 * The cached value of the '{@link #getOutput__oPitchRms() <em>Output oPitch Rms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPitchRms()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPitchRms;

	/**
	 * The cached value of the '{@link #getParameter__pDivisor() <em>Parameter pDivisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pDivisor()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pDivisor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit19Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit19();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPitchTorque() {
		if (input__iPitchTorque != null && input__iPitchTorque.eIsProxy()) {
			InternalEObject oldInput__iPitchTorque = (InternalEObject)input__iPitchTorque;
			input__iPitchTorque = (WTCInput)eResolveProxy(oldInput__iPitchTorque);
			if (input__iPitchTorque != oldInput__iPitchTorque) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT19__INPUT_IPITCH_TORQUE, oldInput__iPitchTorque, input__iPitchTorque));
			}
		}
		return input__iPitchTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPitchTorque() {
		return input__iPitchTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPitchTorque(WTCInput newInput__iPitchTorque) {
		WTCInput oldInput__iPitchTorque = input__iPitchTorque;
		input__iPitchTorque = newInput__iPitchTorque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT19__INPUT_IPITCH_TORQUE, oldInput__iPitchTorque, input__iPitchTorque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPitchRms() {
		if (output__oPitchRms != null && output__oPitchRms.eIsProxy()) {
			InternalEObject oldOutput__oPitchRms = (InternalEObject)output__oPitchRms;
			output__oPitchRms = (WTCOutput)eResolveProxy(oldOutput__oPitchRms);
			if (output__oPitchRms != oldOutput__oPitchRms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT19__OUTPUT_OPITCH_RMS, oldOutput__oPitchRms, output__oPitchRms));
			}
		}
		return output__oPitchRms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPitchRms() {
		return output__oPitchRms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPitchRms(WTCOutput newOutput__oPitchRms) {
		WTCOutput oldOutput__oPitchRms = output__oPitchRms;
		output__oPitchRms = newOutput__oPitchRms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT19__OUTPUT_OPITCH_RMS, oldOutput__oPitchRms, output__oPitchRms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pDivisor() {
		if (parameter__pDivisor != null && parameter__pDivisor.eIsProxy()) {
			InternalEObject oldParameter__pDivisor = (InternalEObject)parameter__pDivisor;
			parameter__pDivisor = (WTCParam)eResolveProxy(oldParameter__pDivisor);
			if (parameter__pDivisor != oldParameter__pDivisor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT19__PARAMETER_PDIVISOR, oldParameter__pDivisor, parameter__pDivisor));
			}
		}
		return parameter__pDivisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pDivisor() {
		return parameter__pDivisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pDivisor(WTCParam newParameter__pDivisor) {
		WTCParam oldParameter__pDivisor = parameter__pDivisor;
		parameter__pDivisor = newParameter__pDivisor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT19__PARAMETER_PDIVISOR, oldParameter__pDivisor, parameter__pDivisor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT19__INPUT_IPITCH_TORQUE:
				if (resolve) return getInput__iPitchTorque();
				return basicGetInput__iPitchTorque();
			case WTSpecPackage.CTRL_UNIT19__OUTPUT_OPITCH_RMS:
				if (resolve) return getOutput__oPitchRms();
				return basicGetOutput__oPitchRms();
			case WTSpecPackage.CTRL_UNIT19__PARAMETER_PDIVISOR:
				if (resolve) return getParameter__pDivisor();
				return basicGetParameter__pDivisor();
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
			case WTSpecPackage.CTRL_UNIT19__INPUT_IPITCH_TORQUE:
				setInput__iPitchTorque((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT19__OUTPUT_OPITCH_RMS:
				setOutput__oPitchRms((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT19__PARAMETER_PDIVISOR:
				setParameter__pDivisor((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT19__INPUT_IPITCH_TORQUE:
				setInput__iPitchTorque((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT19__OUTPUT_OPITCH_RMS:
				setOutput__oPitchRms((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT19__PARAMETER_PDIVISOR:
				setParameter__pDivisor((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT19__INPUT_IPITCH_TORQUE:
				return input__iPitchTorque != null;
			case WTSpecPackage.CTRL_UNIT19__OUTPUT_OPITCH_RMS:
				return output__oPitchRms != null;
			case WTSpecPackage.CTRL_UNIT19__PARAMETER_PDIVISOR:
				return parameter__pDivisor != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit19Impl
