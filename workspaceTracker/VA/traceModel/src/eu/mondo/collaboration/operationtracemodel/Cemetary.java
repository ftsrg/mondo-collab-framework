/**
 */
package eu.mondo.collaboration.operationtracemodel;

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
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.Cemetary#getRemovedElements <em>Removed Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getCemetary()
 * @model
 * @generated
 */
public interface Cemetary extends EObject {

	/**
	 * Returns the value of the '<em><b>Removed Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Elements</em>' containment reference list.
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getCemetary_RemovedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getRemovedElements();
} // Cemetary
