/**
 */
package mondo.collab.security.xtext.securityAccess;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.Group#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends Role
{
  /**
   * Returns the value of the '<em><b>Users</b></em>' reference list.
   * The list contents are of type {@link mondo.collab.security.xtext.securityAccess.User}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Users</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Users</em>' reference list.
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getGroup_Users()
   * @model
   * @generated
   */
  EList<User> getUsers();

} // Group
