/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit107;
import WTSpec.WTCFault;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit107</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit107Impl#getFault__fDLLWarning <em>Fault fDLL Warning</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit107Impl#getFault__fDLLError <em>Fault fDLL Error</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit107Impl extends wtcImpl implements CtrlUnit107 {
	/**
	 * The cached value of the '{@link #getFault__fDLLWarning() <em>Fault fDLL Warning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fDLLWarning()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fDLLWarning;

	/**
	 * The cached value of the '{@link #getFault__fDLLError() <em>Fault fDLL Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fDLLError()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fDLLError;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit107Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit107();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fDLLWarning() {
		if (fault__fDLLWarning != null && fault__fDLLWarning.eIsProxy()) {
			InternalEObject oldFault__fDLLWarning = (InternalEObject)fault__fDLLWarning;
			fault__fDLLWarning = (WTCFault)eResolveProxy(oldFault__fDLLWarning);
			if (fault__fDLLWarning != oldFault__fDLLWarning) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT107__FAULT_FDLL_WARNING, oldFault__fDLLWarning, fault__fDLLWarning));
			}
		}
		return fault__fDLLWarning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fDLLWarning() {
		return fault__fDLLWarning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fDLLWarning(WTCFault newFault__fDLLWarning) {
		WTCFault oldFault__fDLLWarning = fault__fDLLWarning;
		fault__fDLLWarning = newFault__fDLLWarning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT107__FAULT_FDLL_WARNING, oldFault__fDLLWarning, fault__fDLLWarning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fDLLError() {
		if (fault__fDLLError != null && fault__fDLLError.eIsProxy()) {
			InternalEObject oldFault__fDLLError = (InternalEObject)fault__fDLLError;
			fault__fDLLError = (WTCFault)eResolveProxy(oldFault__fDLLError);
			if (fault__fDLLError != oldFault__fDLLError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT107__FAULT_FDLL_ERROR, oldFault__fDLLError, fault__fDLLError));
			}
		}
		return fault__fDLLError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fDLLError() {
		return fault__fDLLError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fDLLError(WTCFault newFault__fDLLError) {
		WTCFault oldFault__fDLLError = fault__fDLLError;
		fault__fDLLError = newFault__fDLLError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT107__FAULT_FDLL_ERROR, oldFault__fDLLError, fault__fDLLError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT107__FAULT_FDLL_WARNING:
				if (resolve) return getFault__fDLLWarning();
				return basicGetFault__fDLLWarning();
			case WTSpecPackage.CTRL_UNIT107__FAULT_FDLL_ERROR:
				if (resolve) return getFault__fDLLError();
				return basicGetFault__fDLLError();
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
			case WTSpecPackage.CTRL_UNIT107__FAULT_FDLL_WARNING:
				setFault__fDLLWarning((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT107__FAULT_FDLL_ERROR:
				setFault__fDLLError((WTCFault)newValue);
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
			case WTSpecPackage.CTRL_UNIT107__FAULT_FDLL_WARNING:
				setFault__fDLLWarning((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT107__FAULT_FDLL_ERROR:
				setFault__fDLLError((WTCFault)null);
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
			case WTSpecPackage.CTRL_UNIT107__FAULT_FDLL_WARNING:
				return fault__fDLLWarning != null;
			case WTSpecPackage.CTRL_UNIT107__FAULT_FDLL_ERROR:
				return fault__fDLLError != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit107Impl
