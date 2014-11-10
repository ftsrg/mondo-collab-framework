/**
 */
package operationtracemodel.impl;

import operationtracemodel.OperationtracemodelPackage;
import operationtracemodel.RemovedElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Removed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link operationtracemodel.impl.RemovedElementImpl#getRemovedElement <em>Removed Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemovedElementImpl extends MinimalEObjectImpl.Container implements RemovedElement {
	/**
	 * The cached value of the '{@link #getRemovedElement() <em>Removed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovedElement()
	 * @generated
	 * @ordered
	 */
	protected EObject removedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemovedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationtracemodelPackage.Literals.REMOVED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRemovedElement() {
		if (removedElement != null && removedElement.eIsProxy()) {
			InternalEObject oldRemovedElement = (InternalEObject)removedElement;
			removedElement = eResolveProxy(oldRemovedElement);
			if (removedElement != oldRemovedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationtracemodelPackage.REMOVED_ELEMENT__REMOVED_ELEMENT, oldRemovedElement, removedElement));
			}
		}
		return removedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRemovedElement() {
		return removedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovedElement(EObject newRemovedElement) {
		EObject oldRemovedElement = removedElement;
		removedElement = newRemovedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationtracemodelPackage.REMOVED_ELEMENT__REMOVED_ELEMENT, oldRemovedElement, removedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationtracemodelPackage.REMOVED_ELEMENT__REMOVED_ELEMENT:
				if (resolve) return getRemovedElement();
				return basicGetRemovedElement();
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
			case OperationtracemodelPackage.REMOVED_ELEMENT__REMOVED_ELEMENT:
				setRemovedElement((EObject)newValue);
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
			case OperationtracemodelPackage.REMOVED_ELEMENT__REMOVED_ELEMENT:
				setRemovedElement((EObject)null);
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
			case OperationtracemodelPackage.REMOVED_ELEMENT__REMOVED_ELEMENT:
				return removedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //RemovedElementImpl
