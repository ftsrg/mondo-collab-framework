/**
 */
package mondo.collab.security.xtext.securityAccess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Control Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.AccessControlModel#getRoles <em>Roles</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.AccessControlModel#getPolicy <em>Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getAccessControlModel()
 * @model
 * @generated
 */
public interface AccessControlModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
   * The list contents are of type {@link mondo.collab.security.xtext.securityAccess.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference list.
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getAccessControlModel_Roles()
   * @model containment="true"
   * @generated
   */
  EList<Role> getRoles();

  /**
   * Returns the value of the '<em><b>Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Policy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policy</em>' containment reference.
   * @see #setPolicy(Policy)
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getAccessControlModel_Policy()
   * @model containment="true"
   * @generated
   */
  Policy getPolicy();

  /**
   * Sets the value of the '{@link mondo.collab.security.xtext.securityAccess.AccessControlModel#getPolicy <em>Policy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Policy</em>' containment reference.
   * @see #getPolicy()
   * @generated
   */
  void setPolicy(Policy value);

} // AccessControlModel
