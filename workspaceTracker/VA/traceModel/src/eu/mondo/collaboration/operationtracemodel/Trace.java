/**
 */
package eu.mondo.collaboration.operationtracemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.Trace#getCommands <em>Commands</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.Trace#getFirstCommand <em>First Command</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.Trace#getCemetary <em>Cemetary</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.Trace#getLastCommand <em>Last Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link eu.mondo.collaboration.operationtracemodel.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getTrace_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommands();

	/**
	 * Returns the value of the '<em><b>First Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Command</em>' reference.
	 * @see #setFirstCommand(Command)
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getTrace_FirstCommand()
	 * @model
	 * @generated
	 */
	Command getFirstCommand();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.Trace#getFirstCommand <em>First Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Command</em>' reference.
	 * @see #getFirstCommand()
	 * @generated
	 */
	void setFirstCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Cemetary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cemetary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cemetary</em>' containment reference.
	 * @see #setCemetary(Cemetary)
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getTrace_Cemetary()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cemetary getCemetary();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.Trace#getCemetary <em>Cemetary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cemetary</em>' containment reference.
	 * @see #getCemetary()
	 * @generated
	 */
	void setCemetary(Cemetary value);

	/**
	 * Returns the value of the '<em><b>Last Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Command</em>' reference.
	 * @see #setLastCommand(Command)
	 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage#getTrace_LastCommand()
	 * @model
	 * @generated
	 */
	Command getLastCommand();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.Trace#getLastCommand <em>Last Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Command</em>' reference.
	 * @see #getLastCommand()
	 * @generated
	 */
	void setLastCommand(Command value);

} // Trace
