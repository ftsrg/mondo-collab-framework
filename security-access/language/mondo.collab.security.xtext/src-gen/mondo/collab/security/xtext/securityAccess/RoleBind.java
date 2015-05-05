/**
 */
package mondo.collab.security.xtext.securityAccess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Bind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.RoleBind#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getRoleBind()
 * @model
 * @generated
 */
public interface RoleBind extends Bind
{
  /**
   * Returns the value of the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' reference.
   * @see #setRole(Role)
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getRoleBind_Role()
   * @model
   * @generated
   */
  Role getRole();

  /**
   * Sets the value of the '{@link mondo.collab.security.xtext.securityAccess.RoleBind#getRole <em>Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' reference.
   * @see #getRole()
   * @generated
   */
  void setRole(Role value);

} // RoleBind
