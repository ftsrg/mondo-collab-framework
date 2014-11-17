/**
 */
package eu.mondo.collaboration.operationtracemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import eu.mondo.collaboration.operationtracemodel.Cemetary;
import eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cemetary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.impl.CemetaryImpl#getRemovedElements <em>Removed Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CemetaryImpl extends MinimalEObjectImpl.Container implements Cemetary {
	/**
	 * The cached value of the '{@link #getRemovedElements() <em>Removed Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> removedElements;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CemetaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationtracemodelPackage.Literals.CEMETARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getRemovedElements() {
		if (removedElements == null) {
			removedElements = new EObjectContainmentEList<EObject>(EObject.class, this, OperationtracemodelPackage.CEMETARY__REMOVED_ELEMENTS);
		}
		return removedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationtracemodelPackage.CEMETARY__REMOVED_ELEMENTS:
				return ((InternalEList<?>)getRemovedElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationtracemodelPackage.CEMETARY__REMOVED_ELEMENTS:
				return getRemovedElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OperationtracemodelPackage.CEMETARY__REMOVED_ELEMENTS:
				getRemovedElements().clear();
				getRemovedElements().addAll((Collection<? extends EObject>)newValue);
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
			case OperationtracemodelPackage.CEMETARY__REMOVED_ELEMENTS:
				getRemovedElements().clear();
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
			case OperationtracemodelPackage.CEMETARY__REMOVED_ELEMENTS:
				return removedElements != null && !removedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CemetaryImpl
