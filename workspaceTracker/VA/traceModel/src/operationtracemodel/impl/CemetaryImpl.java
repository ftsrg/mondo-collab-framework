/**
 */
package operationtracemodel.impl;

import java.util.Collection;
import operationtracemodel.Cemetary;
import operationtracemodel.OperationtracemodelPackage;
import operationtracemodel.RemovedElement;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cemetary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link operationtracemodel.impl.CemetaryImpl#getRemovedElement <em>Removed Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CemetaryImpl extends MinimalEObjectImpl.Container implements Cemetary {
	/**
	 * The cached value of the '{@link #getRemovedElement() <em>Removed Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RemovedElement> removedElement;

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
	public EList<RemovedElement> getRemovedElement() {
		if (removedElement == null) {
			removedElement = new EObjectContainmentEList<RemovedElement>(RemovedElement.class, this, OperationtracemodelPackage.CEMETARY__REMOVED_ELEMENT);
		}
		return removedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationtracemodelPackage.CEMETARY__REMOVED_ELEMENT:
				return ((InternalEList<?>)getRemovedElement()).basicRemove(otherEnd, msgs);
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
			case OperationtracemodelPackage.CEMETARY__REMOVED_ELEMENT:
				return getRemovedElement();
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
			case OperationtracemodelPackage.CEMETARY__REMOVED_ELEMENT:
				getRemovedElement().clear();
				getRemovedElement().addAll((Collection<? extends RemovedElement>)newValue);
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
			case OperationtracemodelPackage.CEMETARY__REMOVED_ELEMENT:
				getRemovedElement().clear();
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
			case OperationtracemodelPackage.CEMETARY__REMOVED_ELEMENT:
				return removedElement != null && !removedElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CemetaryImpl
