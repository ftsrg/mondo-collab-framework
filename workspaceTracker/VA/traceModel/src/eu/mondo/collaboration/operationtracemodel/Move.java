/**
 */
package eu.mondo.collaboration.operationtracemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.Move#getOldIndex <em>Old Index</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.Move#getNewIndex <em>New Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getMove()
 * @model abstract="true"
 * @generated
 */
public interface Move extends Step {

	/**
	 * Returns the value of the '<em><b>Old Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Index</em>' attribute.
	 * @see #setOldIndex(int)
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getMove_OldIndex()
	 * @model required="true"
	 * @generated
	 */
	int getOldIndex();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.Move#getOldIndex <em>Old Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Index</em>' attribute.
	 * @see #getOldIndex()
	 * @generated
	 */
	void setOldIndex(int value);

	/**
	 * Returns the value of the '<em><b>New Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Index</em>' attribute.
	 * @see #setNewIndex(int)
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getMove_NewIndex()
	 * @model required="true"
	 * @generated
	 */
	int getNewIndex();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.Move#getNewIndex <em>New Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Index</em>' attribute.
	 * @see #getNewIndex()
	 * @generated
	 */
	void setNewIndex(int value);

} // Move
