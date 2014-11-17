/**
 */
package eu.mondo.collaboration.operationtracemodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.InsertReference;
import eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.impl.InsertReferenceImpl#getNewValue <em>New Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsertReferenceImpl extends InsertImpl implements InsertReference {
	/**
	 * The cached value of the '{@link #getNewValue() <em>New Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected EObject newValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationtracemodelPackage.Literals.INSERT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getNewValue() {
		if (newValue != null && newValue.eIsProxy()) {
			InternalEObject oldNewValue = (InternalEObject)newValue;
			newValue = eResolveProxy(oldNewValue);
			if (newValue != oldNewValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationtracemodelPackage.INSERT_REFERENCE__NEW_VALUE, oldNewValue, newValue));
			}
		}
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetNewValue() {
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewValue(EObject newNewValue) {
		EObject oldNewValue = newValue;
		newValue = newNewValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationtracemodelPackage.INSERT_REFERENCE__NEW_VALUE, oldNewValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationtracemodelPackage.INSERT_REFERENCE__NEW_VALUE:
				if (resolve) return getNewValue();
				return basicGetNewValue();
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
			case OperationtracemodelPackage.INSERT_REFERENCE__NEW_VALUE:
				setNewValue((EObject)newValue);
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
			case OperationtracemodelPackage.INSERT_REFERENCE__NEW_VALUE:
				setNewValue((EObject)null);
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
			case OperationtracemodelPackage.INSERT_REFERENCE__NEW_VALUE:
				return newValue != null;
		}
		return super.eIsSet(featureID);
	}

} //InsertReferenceImpl
