/**
 */
package operationtracemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link operationtracemodel.Delete#getDeleted <em>Deleted</em>}</li>
 * </ul>
 * </p>
 *
 * @see operationtracemodel.OperationtracemodelPackage#getDelete()
 * @model
 * @generated
 */
public interface Delete extends Step {

	/**
	 * Returns the value of the '<em><b>Deleted</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted</em>' reference.
	 * @see #setDeleted(DeteletedElement)
	 * @see operationtracemodel.OperationtracemodelPackage#getDelete_Deleted()
	 * @model required="true"
	 * @generated
	 */
	DeteletedElement getDeleted();

	/**
	 * Sets the value of the '{@link operationtracemodel.Delete#getDeleted <em>Deleted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted</em>' reference.
	 * @see #getDeleted()
	 * @generated
	 */
	void setDeleted(DeteletedElement value);
} // Delete
