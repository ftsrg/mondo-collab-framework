/**
 */
package eu.mondo.collaboration.operationtracemodel.impl;

import eu.mondo.collaboration.operationtracemodel.MoveAttribute;
import eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.impl.MoveAttributeImpl#getMovedElement <em>Moved Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoveAttributeImpl extends MoveImpl implements MoveAttribute {
	/**
	 * The default value of the '{@link #getMovedElement() <em>Moved Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovedElement()
	 * @generated
	 * @ordered
	 */
	protected static final Object MOVED_ELEMENT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMovedElement() <em>Moved Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovedElement()
	 * @generated
	 * @ordered
	 */
	protected Object movedElement = MOVED_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationtracemodelPackage.Literals.MOVE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMovedElement() {
		return movedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovedElement(Object newMovedElement) {
		Object oldMovedElement = movedElement;
		movedElement = newMovedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationtracemodelPackage.MOVE_ATTRIBUTE__MOVED_ELEMENT, oldMovedElement, movedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OperationtracemodelPackage.MOVE_ATTRIBUTE__MOVED_ELEMENT:
				return getMovedElement();
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
			case OperationtracemodelPackage.MOVE_ATTRIBUTE__MOVED_ELEMENT:
				setMovedElement(newValue);
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
			case OperationtracemodelPackage.MOVE_ATTRIBUTE__MOVED_ELEMENT:
				setMovedElement(MOVED_ELEMENT_EDEFAULT);
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
			case OperationtracemodelPackage.MOVE_ATTRIBUTE__MOVED_ELEMENT:
				return MOVED_ELEMENT_EDEFAULT == null ? movedElement != null : !MOVED_ELEMENT_EDEFAULT.equals(movedElement);
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
		result.append(" (movedElement: ");
		result.append(movedElement);
		result.append(')');
		return result.toString();
	}

} //MoveAttributeImpl
