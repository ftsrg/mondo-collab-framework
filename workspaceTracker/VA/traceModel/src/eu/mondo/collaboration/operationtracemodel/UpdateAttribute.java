/**
 */
package eu.mondo.collaboration.operationtracemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.UpdateAttribute#getNewValue <em>New Value</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.UpdateAttribute#getOldValue <em>Old Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getUpdateAttribute()
 * @model
 * @generated
 */
public interface UpdateAttribute extends Update {
	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(Object)
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getUpdateAttribute_NewValue()
	 * @model required="true"
	 * @generated
	 */
	Object getNewValue();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.UpdateAttribute#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(Object value);

	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' attribute.
	 * @see #setOldValue(Object)
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getUpdateAttribute_OldValue()
	 * @model required="true"
	 * @generated
	 */
	Object getOldValue();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.UpdateAttribute#getOldValue <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' attribute.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(Object value);

} // UpdateAttribute
