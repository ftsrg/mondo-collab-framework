/**
 */
package mondo.collab.security.xtext.securityAccess;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Bind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.ObjectBind#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getObjectBind()
 * @model
 * @generated
 */
public interface ObjectBind extends Bind
{
  /**
   * Returns the value of the '<em><b>Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' reference.
   * @see #setObject(EObject)
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getObjectBind_Object()
   * @model
   * @generated
   */
  EObject getObject();

  /**
   * Sets the value of the '{@link mondo.collab.security.xtext.securityAccess.ObjectBind#getObject <em>Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' reference.
   * @see #getObject()
   * @generated
   */
  void setObject(EObject value);

} // ObjectBind
