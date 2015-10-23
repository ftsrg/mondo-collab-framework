/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit51;
import WTSpec.WTCFault;
import WTSpec.WTCParam;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit51</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit51Impl#getParameter__pHour <em>Parameter pHour</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit51Impl#getFault__fFault <em>Fault fFault</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit51Impl extends wtcImpl implements CtrlUnit51 {
	/**
	 * The cached value of the '{@link #getParameter__pHour() <em>Parameter pHour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pHour()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pHour;

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
	protected CtrlUnit51Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT51;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pHour() {
		if (parameter__pHour != null && parameter__pHour.eIsProxy()) {
			InternalEObject oldParameter__pHour = (InternalEObject)parameter__pHour;
			parameter__pHour = (WTCParam)eResolveProxy(oldParameter__pHour);
			if (parameter__pHour != oldParameter__pHour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT51__PARAMETER_PHOUR, oldParameter__pHour, parameter__pHour));
			}
		}
		return parameter__pHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pHour() {
		return parameter__pHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pHour(WTCParam newParameter__pHour) {
		WTCParam oldParameter__pHour = parameter__pHour;
		parameter__pHour = newParameter__pHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT51__PARAMETER_PHOUR, oldParameter__pHour, parameter__pHour));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT51__FAULT_FFAULT, oldFault__fFault, fault__fFault));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT51__FAULT_FFAULT, oldFault__fFault, fault__fFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT51__PARAMETER_PHOUR:
				if (resolve) return getParameter__pHour();
				return basicGetParameter__pHour();
			case WTSpecPackage.CTRL_UNIT51__FAULT_FFAULT:
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
			case WTSpecPackage.CTRL_UNIT51__PARAMETER_PHOUR:
				setParameter__pHour((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT51__FAULT_FFAULT:
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
			case WTSpecPackage.CTRL_UNIT51__PARAMETER_PHOUR:
				setParameter__pHour((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT51__FAULT_FFAULT:
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
			case WTSpecPackage.CTRL_UNIT51__PARAMETER_PHOUR:
				return parameter__pHour != null;
			case WTSpecPackage.CTRL_UNIT51__FAULT_FFAULT:
				return fault__fFault != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit51Impl
