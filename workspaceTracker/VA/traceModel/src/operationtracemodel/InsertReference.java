/**
 */
package operationtracemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link operationtracemodel.InsertReference#getNewValue <em>New Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see operationtracemodel.OperationtracemodelPackage#getInsertReference()
 * @model
 * @generated
 */
public interface InsertReference extends Insert {
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
	 * @see operationtracemodel.OperationtracemodelPackage#getInsertReference_NewValue()
	 * @model dataType="operationtracemodel.EObject" required="true"
	 * @generated
	 */
	EObject getNewValue();

	/**
	 * Sets the value of the '{@link operationtracemodel.InsertReference#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(EObject value);

} // InsertReference
