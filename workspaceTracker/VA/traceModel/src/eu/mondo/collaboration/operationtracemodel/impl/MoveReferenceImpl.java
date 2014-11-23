/**
 */
package eu.mondo.collaboration.operationtracemodel.impl;

import eu.mondo.collaboration.operationtracemodel.MoveReference;
import eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.impl.MoveReferenceImpl#getMovedElement <em>Moved Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoveReferenceImpl extends MoveImpl implements MoveReference {
	/**
	 * The cached value of the '{@link #getMovedElement() <em>Moved Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovedElement()
	 * @generated
	 * @ordered
	 */
	protected EObject movedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationtracemodelPackage.Literals.MOVE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getMovedElement() {
		if (movedElement != null && movedElement.eIsProxy()) {
			InternalEObject oldMovedElement = (InternalEObject)movedElement;
			movedElement = eResolveProxy(oldMovedElement);
			if (movedElement != oldMovedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationtracemodelPackage.MOVE_REFERENCE__MOVED_ELEMENT, oldMovedElement, movedElement));
			}
		}
		return movedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetMovedElement() {
		return movedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovedElement(EObject newMovedElement) {
		EObject oldMovedElement = movedElement;
		movedElement = newMovedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationtracemodelPackage.MOVE_REFERENCE__MOVED_ELEMENT, oldMovedElement, movedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationtracemodelPackage.MOVE_REFERENCE__MOVED_ELEMENT:
				if (resolve) return getMovedElement();
				return basicGetMovedElement();
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
			case OperationtracemodelPackage.MOVE_REFERENCE__MOVED_ELEMENT:
				setMovedElement((EObject)newValue);
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
			case OperationtracemodelPackage.MOVE_REFERENCE__MOVED_ELEMENT:
				setMovedElement((EObject)null);
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
			case OperationtracemodelPackage.MOVE_REFERENCE__MOVED_ELEMENT:
				return movedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //MoveReferenceImpl
