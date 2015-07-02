/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit55;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit55</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit55Impl#getOutput__oSignal <em>Output oSignal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit55Impl extends wtcImpl implements CtrlUnit55 {
	/**
	 * The cached value of the '{@link #getOutput__oSignal() <em>Output oSignal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oSignal()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oSignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit55Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit55();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oSignal() {
		if (output__oSignal != null && output__oSignal.eIsProxy()) {
			InternalEObject oldOutput__oSignal = (InternalEObject)output__oSignal;
			output__oSignal = (WTCOutput)eResolveProxy(oldOutput__oSignal);
			if (output__oSignal != oldOutput__oSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT55__OUTPUT_OSIGNAL, oldOutput__oSignal, output__oSignal));
			}
		}
		return output__oSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oSignal() {
		return output__oSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oSignal(WTCOutput newOutput__oSignal) {
		WTCOutput oldOutput__oSignal = output__oSignal;
		output__oSignal = newOutput__oSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT55__OUTPUT_OSIGNAL, oldOutput__oSignal, output__oSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT55__OUTPUT_OSIGNAL:
				if (resolve) return getOutput__oSignal();
				return basicGetOutput__oSignal();
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
			case WTSpecPackage.CTRL_UNIT55__OUTPUT_OSIGNAL:
				setOutput__oSignal((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT55__OUTPUT_OSIGNAL:
				setOutput__oSignal((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT55__OUTPUT_OSIGNAL:
				return output__oSignal != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit55Impl
