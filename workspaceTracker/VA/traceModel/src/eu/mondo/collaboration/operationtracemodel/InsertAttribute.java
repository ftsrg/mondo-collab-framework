/**
 */
package operationtracemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link operationtracemodel.InsertAttribute#getNewValue <em>New Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see operationtracemodel.OperationtracemodelPackage#getInsertAttribute()
 * @model
 * @generated
 */
public interface InsertAttribute extends Insert {
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
	 * @see operationtracemodel.OperationtracemodelPackage#getInsertAttribute_NewValue()
	 * @model required="true"
	 * @generated
	 */
	Object getNewValue();

	/**
	 * Sets the value of the '{@link operationtracemodel.InsertAttribute#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(Object value);

} // InsertAttribute
