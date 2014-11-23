/**
 */
package eu.mondo.collaboration.operationtracemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.MoveReference#getMovedElement <em>Moved Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getMoveReference()
 * @model
 * @generated
 */
public interface MoveReference extends Move {
	/**
	 * Returns the value of the '<em><b>Moved Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moved Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moved Element</em>' reference.
	 * @see #setMovedElement(EObject)
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getMoveReference_MovedElement()
	 * @model required="true"
	 * @generated
	 */
	EObject getMovedElement();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.MoveReference#getMovedElement <em>Moved Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moved Element</em>' reference.
	 * @see #getMovedElement()
	 * @generated
	 */
	void setMovedElement(EObject value);

} // MoveReference
