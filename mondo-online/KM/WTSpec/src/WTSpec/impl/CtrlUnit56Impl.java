/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit56;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit56</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit56Impl#getInput__iInternalFailure <em>Input iInternal Failure</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit56Impl#getOutput__oInhibit <em>Output oInhibit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit56Impl extends wtcImpl implements CtrlUnit56 {
	/**
	 * The cached value of the '{@link #getInput__iInternalFailure() <em>Input iInternal Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInternalFailure()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInternalFailure;

	/**
	 * The cached value of the '{@link #getOutput__oInhibit() <em>Output oInhibit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oInhibit()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oInhibit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit56Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit56();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInternalFailure() {
		if (input__iInternalFailure != null && input__iInternalFailure.eIsProxy()) {
			InternalEObject oldInput__iInternalFailure = (InternalEObject)input__iInternalFailure;
			input__iInternalFailure = (WTCInput)eResolveProxy(oldInput__iInternalFailure);
			if (input__iInternalFailure != oldInput__iInternalFailure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT56__INPUT_IINTERNAL_FAILURE, oldInput__iInternalFailure, input__iInternalFailure));
			}
		}
		return input__iInternalFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInternalFailure() {
		return input__iInternalFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInternalFailure(WTCInput newInput__iInternalFailure) {
		WTCInput oldInput__iInternalFailure = input__iInternalFailure;
		input__iInternalFailure = newInput__iInternalFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT56__INPUT_IINTERNAL_FAILURE, oldInput__iInternalFailure, input__iInternalFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oInhibit() {
		if (output__oInhibit != null && output__oInhibit.eIsProxy()) {
			InternalEObject oldOutput__oInhibit = (InternalEObject)output__oInhibit;
			output__oInhibit = (WTCOutput)eResolveProxy(oldOutput__oInhibit);
			if (output__oInhibit != oldOutput__oInhibit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT56__OUTPUT_OINHIBIT, oldOutput__oInhibit, output__oInhibit));
			}
		}
		return output__oInhibit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oInhibit() {
		return output__oInhibit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oInhibit(WTCOutput newOutput__oInhibit) {
		WTCOutput oldOutput__oInhibit = output__oInhibit;
		output__oInhibit = newOutput__oInhibit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT56__OUTPUT_OINHIBIT, oldOutput__oInhibit, output__oInhibit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT56__INPUT_IINTERNAL_FAILURE:
				if (resolve) return getInput__iInternalFailure();
				return basicGetInput__iInternalFailure();
			case WTSpecPackage.CTRL_UNIT56__OUTPUT_OINHIBIT:
				if (resolve) return getOutput__oInhibit();
				return basicGetOutput__oInhibit();
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
			case WTSpecPackage.CTRL_UNIT56__INPUT_IINTERNAL_FAILURE:
				setInput__iInternalFailure((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT56__OUTPUT_OINHIBIT:
				setOutput__oInhibit((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT56__INPUT_IINTERNAL_FAILURE:
				setInput__iInternalFailure((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT56__OUTPUT_OINHIBIT:
				setOutput__oInhibit((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT56__INPUT_IINTERNAL_FAILURE:
				return input__iInternalFailure != null;
			case WTSpecPackage.CTRL_UNIT56__OUTPUT_OINHIBIT:
				return output__oInhibit != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit56Impl
