/**
 */
package operationtracemodel;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link operationtracemodel.Insert#getInserted <em>Inserted</em>}</li>
 * </ul>
 * </p>
 *
 * @see operationtracemodel.OperationtracemodelPackage#getInsert()
 * @model
 * @generated
 */
public interface Insert extends Step {

	/**
	 * Returns the value of the '<em><b>Inserted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inserted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inserted</em>' attribute.
	 * @see #setInserted(EObject)
	 * @see operationtracemodel.OperationtracemodelPackage#getInsert_Inserted()
	 * @model dataType="operationtracemodel.EObject" required="true"
	 * @generated
	 */
	EObject getInserted();

	/**
	 * Sets the value of the '{@link operationtracemodel.Insert#getInserted <em>Inserted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inserted</em>' attribute.
	 * @see #getInserted()
	 * @generated
	 */
	void setInserted(EObject value);
} // Insert
