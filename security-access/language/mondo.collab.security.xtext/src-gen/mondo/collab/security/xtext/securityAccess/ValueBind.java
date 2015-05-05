/**
 */
package mondo.collab.security.xtext.securityAccess;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Bind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.ValueBind#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getValueBind()
 * @model
 * @generated
 */
public interface ValueBind extends Bind
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getValueBind_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link mondo.collab.security.xtext.securityAccess.ValueBind#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // ValueBind
