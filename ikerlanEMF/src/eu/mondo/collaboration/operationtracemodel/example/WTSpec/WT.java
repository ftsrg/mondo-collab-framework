/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.WT#getSysId <em>Sys Id</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.WT#getModel <em>Model</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.WT#getVersion <em>Version</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.WT#getItsSubsystems <em>Its Subsystems</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.WT#getItsInputs <em>Its Inputs</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.WT#getItsOutputs <em>Its Outputs</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.WT#getItsParams <em>Its Params</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.WT#getItsTimers <em>Its Timers</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.WT#getItsFaults <em>Its Faults</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.WT#getItsVariables <em>Its Variables</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.WT#getItsErrorReactions <em>Its Error Reactions</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage#getWT()
 * @model
 * @generated
 */
public interface WT extends EObject {
	/**
	 * Returns the value of the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sys Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys Id</em>' attribute.
	 * @see #setSysId(String)
	 * @see eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage#getWT_SysId()
	 * @model
	 * @generated
	 */
	String getSysId();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.WT#getSysId <em>Sys Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys Id</em>' attribute.
	 * @see #getSysId()
	 * @generated
	 */
	void setSysId(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage#getWT_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.WT#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage#getWT_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.WT#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Its Subsystems</b></em>' containment reference list.
	 * The list contents are of type {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.Subsystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Subsystems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Subsystems</em>' containment reference list.
	 * @see eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage#getWT_ItsSubsystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subsystem> getItsSubsystems();

	/**
	 * Returns the value of the '<em><b>Its Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.SystemInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Inputs</em>' containment reference list.
	 * @see eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage#getWT_ItsInputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemInput> getItsInputs();

	/**
	 * Returns the value of the '<em><b>Its Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.SystemOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Outputs</em>' containment reference list.
	 * @see eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage#getWT_ItsOutputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemOutput> getItsOutputs();

	/**
	 * Returns the value of the '<em><b>Its Params</b></em>' containment reference list.
	 * The list contents are of type {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.SystemParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Params</em>' containment reference list.
	 * @see eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage#getWT_ItsParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemParam> getItsParams();

	/**
	 * Returns the value of the '<em><b>Its Timers</b></em>' containment reference list.
	 * The list contents are of type {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.SystemTimer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Timers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Timers</em>' containment reference list.
	 * @see eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage#getWT_ItsTimers()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemTimer> getItsTimers();

	/**
	 * Returns the value of the '<em><b>Its Faults</b></em>' containment reference list.
	 * The list contents are of type {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.SystemFault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Faults</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Faults</em>' containment reference list.
	 * @see eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage#getWT_ItsFaults()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemFault> getItsFaults();

	/**
	 * Returns the value of the '<em><b>Its Variables</b></em>' containment reference list.
	 * The list contents are of type {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.SystemVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Variables</em>' containment reference list.
	 * @see eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage#getWT_ItsVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemVariable> getItsVariables();

	/**
	 * Returns the value of the '<em><b>Its Error Reactions</b></em>' containment reference list.
	 * The list contents are of type {@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.SystemErrorReaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Error Reactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Error Reactions</em>' containment reference list.
	 * @see eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage#getWT_ItsErrorReactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemErrorReaction> getItsErrorReactions();

} // WT
