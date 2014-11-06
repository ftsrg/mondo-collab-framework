/**
 */
package operationtracemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cemetary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link operationtracemodel.Cemetary#getDeleted <em>Deleted</em>}</li>
 * </ul>
 * </p>
 *
 * @see operationtracemodel.OperationtracemodelPackage#getCemetary()
 * @model
 * @generated
 */
public interface Cemetary extends EObject {
	/**
	 * Returns the value of the '<em><b>Deleted</b></em>' containment reference list.
	 * The list contents are of type {@link operationtracemodel.DeletedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted</em>' containment reference list.
	 * @see operationtracemodel.OperationtracemodelPackage#getCemetary_Deleted()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeletedElement> getDeleted();

} // Cemetary
