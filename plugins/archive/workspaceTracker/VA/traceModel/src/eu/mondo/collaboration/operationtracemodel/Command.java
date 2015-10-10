/**
 */
package eu.mondo.collaboration.operationtracemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.Command#getSteps <em>Steps</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.Command#getNextCommand <em>Next Command</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.Command#getFirstStep <em>First Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link eu.mondo.collaboration.operationtracemodel.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getCommand_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Next Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Command</em>' reference.
	 * @see #setNextCommand(Command)
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getCommand_NextCommand()
	 * @model
	 * @generated
	 */
	Command getNextCommand();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.Command#getNextCommand <em>Next Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Command</em>' reference.
	 * @see #getNextCommand()
	 * @generated
	 */
	void setNextCommand(Command value);

	/**
	 * Returns the value of the '<em><b>First Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Step</em>' reference.
	 * @see #setFirstStep(Step)
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getCommand_FirstStep()
	 * @model
	 * @generated
	 */
	Step getFirstStep();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.Command#getFirstStep <em>First Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Step</em>' reference.
	 * @see #getFirstStep()
	 * @generated
	 */
	void setFirstStep(Step value);

} // Command
