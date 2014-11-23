/**
 */
package eu.mondo.collaboration.operationtracemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.MoveAttribute#getMovedElement <em>Moved Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getMoveAttribute()
 * @model
 * @generated
 */
public interface MoveAttribute extends Move {
	/**
	 * Returns the value of the '<em><b>Moved Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moved Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moved Element</em>' attribute.
	 * @see #setMovedElement(Object)
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getMoveAttribute_MovedElement()
	 * @model required="true"
	 * @generated
	 */
	Object getMovedElement();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.MoveAttribute#getMovedElement <em>Moved Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moved Element</em>' attribute.
	 * @see #getMovedElement()
	 * @generated
	 */
	void setMovedElement(Object value);

} // MoveAttribute
