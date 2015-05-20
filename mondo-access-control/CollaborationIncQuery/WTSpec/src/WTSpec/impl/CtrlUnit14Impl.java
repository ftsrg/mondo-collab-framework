/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit14;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit14</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit14Impl#getOutput__oBit <em>Output oBit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit14Impl extends wtcImpl implements CtrlUnit14 {
	/**
	 * The cached value of the '{@link #getOutput__oBit() <em>Output oBit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oBit()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oBit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit14Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oBit() {
		if (output__oBit != null && output__oBit.eIsProxy()) {
			InternalEObject oldOutput__oBit = (InternalEObject)output__oBit;
			output__oBit = (WTCOutput)eResolveProxy(oldOutput__oBit);
			if (output__oBit != oldOutput__oBit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT14__OUTPUT_OBIT, oldOutput__oBit, output__oBit));
			}
		}
		return output__oBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oBit() {
		return output__oBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oBit(WTCOutput newOutput__oBit) {
		WTCOutput oldOutput__oBit = output__oBit;
		output__oBit = newOutput__oBit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT14__OUTPUT_OBIT, oldOutput__oBit, output__oBit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT14__OUTPUT_OBIT:
				if (resolve) return getOutput__oBit();
				return basicGetOutput__oBit();
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
			case WTSpecPackage.CTRL_UNIT14__OUTPUT_OBIT:
				setOutput__oBit((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT14__OUTPUT_OBIT:
				setOutput__oBit((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT14__OUTPUT_OBIT:
				return output__oBit != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit14Impl
