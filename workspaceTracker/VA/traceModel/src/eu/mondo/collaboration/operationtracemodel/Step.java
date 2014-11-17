/**
 */
package eu.mondo.collaboration.operationtracemodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.Step#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.Step#getElement <em>Element</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.Step#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Step</em>' reference.
	 * @see #setNextStep(Step)
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getStep_NextStep()
	 * @model
	 * @generated
	 */
	Step getNextStep();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.Step#getNextStep <em>Next Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Step</em>' reference.
	 * @see #getNextStep()
	 * @generated
	 */
	void setNextStep(Step value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(EObject)
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getStep_Element()
	 * @model required="true"
	 * @generated
	 */
	EObject getElement();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.Step#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getStep_Feature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.Step#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

} // Step
