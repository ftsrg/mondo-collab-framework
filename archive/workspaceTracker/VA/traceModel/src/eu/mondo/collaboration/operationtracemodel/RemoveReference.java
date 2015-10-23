/**
 */
package eu.mondo.collaboration.operationtracemodel;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.RemoveReference#getOldValue <em>Old Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getRemoveReference()
 * @model
 * @generated
 */
public interface RemoveReference extends Remove {

	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' reference.
	 * @see #setOldValue(EObject)
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getRemoveReference_OldValue()
	 * @model required="true"
	 * @generated
	 */
	EObject getOldValue();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.RemoveReference#getOldValue <em>Old Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' reference.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(EObject value);
} // RemoveReference
