/**
 */
package WTSpec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WTSpec.Subsystem#getSysId <em>Sys Id</em>}</li>
 *   <li>{@link WTSpec.Subsystem#getDescription <em>Description</em>}</li>
 *   <li>{@link WTSpec.Subsystem#getItsWTCs <em>Its WT Cs</em>}</li>
 *   <li>{@link WTSpec.Subsystem#getItsSubsystems <em>Its Subsystems</em>}</li>
 * </ul>
 * </p>
 *
 * @see WTSpec.WTSpecPackage#getSubsystem()
 * @model
 * @generated
 */
public interface Subsystem extends EObject {
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
	 * @see WTSpec.WTSpecPackage#getSubsystem_SysId()
	 * @model
	 * @generated
	 */
	String getSysId();

	/**
	 * Sets the value of the '{@link WTSpec.Subsystem#getSysId <em>Sys Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys Id</em>' attribute.
	 * @see #getSysId()
	 * @generated
	 */
	void setSysId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see WTSpec.WTSpecPackage#getSubsystem_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link WTSpec.Subsystem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Its WT Cs</b></em>' containment reference list.
	 * The list contents are of type {@link WTSpec.wtc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its WT Cs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its WT Cs</em>' containment reference list.
	 * @see WTSpec.WTSpecPackage#getSubsystem_ItsWTCs()
	 * @model containment="true"
	 * @generated
	 */
	EList<wtc> getItsWTCs();

	/**
	 * Returns the value of the '<em><b>Its Subsystems</b></em>' containment reference list.
	 * The list contents are of type {@link WTSpec.Subsystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Subsystems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Subsystems</em>' containment reference list.
	 * @see WTSpec.WTSpecPackage#getSubsystem_ItsSubsystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subsystem> getItsSubsystems();

} // Subsystem
