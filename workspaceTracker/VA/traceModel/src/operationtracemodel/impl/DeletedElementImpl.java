/**
 */
package operationtracemodel.impl;

import operationtracemodel.DeletedElement;
import operationtracemodel.OperationtracemodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deleted Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link operationtracemodel.impl.DeletedElementImpl#getDeletedObject <em>Deleted Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeletedElementImpl extends MinimalEObjectImpl.Container implements DeletedElement {
	/**
	 * The default value of the '{@link #getDeletedObject() <em>Deleted Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedObject()
	 * @generated
	 * @ordered
	 */
	protected static final Object DELETED_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeletedObject() <em>Deleted Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedObject()
	 * @generated
	 * @ordered
	 */
	protected Object deletedObject = DELETED_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeletedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationtracemodelPackage.Literals.DELETED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDeletedObject() {
		return deletedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletedObject(Object newDeletedObject) {
		Object oldDeletedObject = deletedObject;
		deletedObject = newDeletedObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationtracemodelPackage.DELETED_ELEMENT__DELETED_OBJECT, oldDeletedObject, deletedObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationtracemodelPackage.DELETED_ELEMENT__DELETED_OBJECT:
				return getDeletedObject();
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
			case OperationtracemodelPackage.DELETED_ELEMENT__DELETED_OBJECT:
				setDeletedObject(newValue);
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
			case OperationtracemodelPackage.DELETED_ELEMENT__DELETED_OBJECT:
				setDeletedObject(DELETED_OBJECT_EDEFAULT);
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
			case OperationtracemodelPackage.DELETED_ELEMENT__DELETED_OBJECT:
				return DELETED_OBJECT_EDEFAULT == null ? deletedObject != null : !DELETED_OBJECT_EDEFAULT.equals(deletedObject);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (deletedObject: ");
		result.append(deletedObject);
		result.append(')');
		return result.toString();
	}

} //DeletedElementImpl
