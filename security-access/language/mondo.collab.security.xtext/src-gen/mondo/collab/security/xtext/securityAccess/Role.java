/**
 */
package mondo.collab.security.xtext.securityAccess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.Role#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject
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
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getRole_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link mondo.collab.security.xtext.securityAccess.Role#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Role
