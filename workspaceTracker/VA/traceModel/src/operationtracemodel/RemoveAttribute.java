/**
 */
package operationtracemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link operationtracemodel.RemoveAttribute#getOldValue <em>Old Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see operationtracemodel.OperationtracemodelPackage#getRemoveAttribute()
 * @model
 * @generated
 */
public interface RemoveAttribute extends Remove {

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
	 * @see operationtracemodel.OperationtracemodelPackage#getRemoveAttribute_OldValue()
	 * @model required="true"
	 * @generated
	 */
	Object getOldValue();

	/**
	 * Sets the value of the '{@link operationtracemodel.RemoveAttribute#getOldValue <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' attribute.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(Object value);
} // RemoveAttribute
