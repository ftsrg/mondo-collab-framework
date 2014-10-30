/**
 */
package operationtracemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cementary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link operationtracemodel.Cementary#getDeleted <em>Deleted</em>}</li>
 * </ul>
 * </p>
 *
 * @see operationtracemodel.OperationtracemodelPackage#getCementary()
 * @model
 * @generated
 */
public interface Cementary extends EObject {
	/**
	 * Returns the value of the '<em><b>Deleted</b></em>' containment reference list.
	 * The list contents are of type {@link operationtracemodel.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted</em>' containment reference list.
	 * @see operationtracemodel.OperationtracemodelPackage#getCementary_Deleted()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getDeleted();

} // Cementary
