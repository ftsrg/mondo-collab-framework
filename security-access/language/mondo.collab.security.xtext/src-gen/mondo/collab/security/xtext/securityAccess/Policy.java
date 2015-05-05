/**
 */
package mondo.collab.security.xtext.securityAccess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.Policy#getName <em>Name</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.Policy#getType <em>Type</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.Policy#getRoles <em>Roles</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.Policy#getImports <em>Imports</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.Policy#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getPolicy_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link mondo.collab.security.xtext.securityAccess.Policy#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link mondo.collab.security.xtext.securityAccess.ConflictResolutionTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see mondo.collab.security.xtext.securityAccess.ConflictResolutionTypes
   * @see #setType(ConflictResolutionTypes)
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getPolicy_Type()
   * @model
   * @generated
   */
  ConflictResolutionTypes getType();

  /**
   * Sets the value of the '{@link mondo.collab.security.xtext.securityAccess.Policy#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see mondo.collab.security.xtext.securityAccess.ConflictResolutionTypes
   * @see #getType()
   * @generated
   */
  void setType(ConflictResolutionTypes value);

  /**
   * Returns the value of the '<em><b>Roles</b></em>' reference list.
   * The list contents are of type {@link mondo.collab.security.xtext.securityAccess.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' reference list.
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getPolicy_Roles()
   * @model
   * @generated
   */
  EList<Role> getRoles();

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link mondo.collab.security.xtext.securityAccess.ImportResource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getPolicy_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportResource> getImports();

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link mondo.collab.security.xtext.securityAccess.Rule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getPolicy_Rules()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRules();

} // Policy
