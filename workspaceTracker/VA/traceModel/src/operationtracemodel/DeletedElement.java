/**
 */
package operationtracemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deleted Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link operationtracemodel.DeletedElement#getDeletedObject <em>Deleted Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see operationtracemodel.OperationtracemodelPackage#getDeletedElement()
 * @model
 * @generated
 */
public interface DeletedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Deleted Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted Object</em>' attribute.
	 * @see #setDeletedObject(Object)
	 * @see operationtracemodel.OperationtracemodelPackage#getDeletedElement_DeletedObject()
	 * @model required="true"
	 * @generated
	 */
	Object getDeletedObject();

	/**
	 * Sets the value of the '{@link operationtracemodel.DeletedElement#getDeletedObject <em>Deleted Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted Object</em>' attribute.
	 * @see #getDeletedObject()
	 * @generated
	 */
	void setDeletedObject(Object value);

} // DeletedElement
