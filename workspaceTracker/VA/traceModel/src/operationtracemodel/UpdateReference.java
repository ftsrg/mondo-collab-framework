/**
 */
package operationtracemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link operationtracemodel.UpdateReference#getNewValue <em>New Value</em>}</li>
 *   <li>{@link operationtracemodel.UpdateReference#getOldValue <em>Old Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see operationtracemodel.OperationtracemodelPackage#getUpdateReference()
 * @model
 * @generated
 */
public interface UpdateReference extends Update {
	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(EObject)
	 * @see operationtracemodel.OperationtracemodelPackage#getUpdateReference_NewValue()
	 * @model dataType="operationtracemodel.EObject" required="true"
	 * @generated
	 */
	EObject getNewValue();

	/**
	 * Sets the value of the '{@link operationtracemodel.UpdateReference#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(EObject value);

	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' attribute.
	 * @see #setOldValue(EObject)
	 * @see operationtracemodel.OperationtracemodelPackage#getUpdateReference_OldValue()
	 * @model dataType="operationtracemodel.EObject" required="true"
	 * @generated
	 */
	EObject getOldValue();

	/**
	 * Sets the value of the '{@link operationtracemodel.UpdateReference#getOldValue <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' attribute.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(EObject value);

} // UpdateReference
