/**
 */
package mondo.collab.security.xtext.securityAccess.impl;

import mondo.collab.security.xtext.securityAccess.SecurityAccessPackage;
import mondo.collab.security.xtext.securityAccess.User;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UserImpl extends RoleImpl implements User
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UserImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SecurityAccessPackage.Literals.USER;
  }

} //UserImpl
