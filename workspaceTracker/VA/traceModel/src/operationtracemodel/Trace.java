/**
 */
package operationtracemodel;

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
 *   <li>{@link operationtracemodel.Trace#getCommands <em>Commands</em>}</li>
 *   <li>{@link operationtracemodel.Trace#getFirstCommand <em>First Command</em>}</li>
 *   <li>{@link operationtracemodel.Trace#getCementary <em>Cementary</em>}</li>
 *   <li>{@link operationtracemodel.Trace#getLastCommand <em>Last Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see operationtracemodel.OperationtracemodelPackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link operationtracemodel.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see operationtracemodel.OperationtracemodelPackage#getTrace_Commands()
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
	 * @see operationtracemodel.OperationtracemodelPackage#getTrace_FirstCommand()
	 * @model
	 * @generated
	 */
	Command getFirstCommand();

	/**
	 * Sets the value of the '{@link operationtracemodel.Trace#getFirstCommand <em>First Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Command</em>' reference.
	 * @see #getFirstCommand()
	 * @generated
	 */
	void setFirstCommand(Command value);

	/**
	 * Returns the value of the '<em><b>Cementary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cementary</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cementary</em>' containment reference.
	 * @see #setCementary(Cemetary)
	 * @see operationtracemodel.OperationtracemodelPackage#getTrace_Cementary()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cemetary getCementary();

	/**
	 * Sets the value of the '{@link operationtracemodel.Trace#getCementary <em>Cementary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cementary</em>' containment reference.
	 * @see #getCementary()
	 * @generated
	 */
	void setCementary(Cemetary value);

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
	 * @see operationtracemodel.OperationtracemodelPackage#getTrace_LastCommand()
	 * @model
	 * @generated
	 */
	Command getLastCommand();

	/**
	 * Sets the value of the '{@link operationtracemodel.Trace#getLastCommand <em>Last Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Command</em>' reference.
	 * @see #getLastCommand()
	 * @generated
	 */
	void setLastCommand(Command value);

} // Trace
