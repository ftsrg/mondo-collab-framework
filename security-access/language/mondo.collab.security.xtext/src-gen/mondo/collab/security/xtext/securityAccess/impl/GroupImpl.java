/**
 */
package mondo.collab.security.xtext.securityAccess.impl;

import java.util.Collection;

import mondo.collab.security.xtext.securityAccess.Group;
import mondo.collab.security.xtext.securityAccess.SecurityAccessPackage;
import mondo.collab.security.xtext.securityAccess.User;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.impl.GroupImpl#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends RoleImpl implements Group
{
  /**
   * The cached value of the '{@link #getUsers() <em>Users</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsers()
   * @generated
   * @ordered
   */
  protected EList<User> users;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupImpl()
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
    return SecurityAccessPackage.Literals.GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<User> getUsers()
  {
    if (users == null)
    {
      users = new EObjectResolvingEList<User>(User.class, this, SecurityAccessPackage.GROUP__USERS);
    }
    return users;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SecurityAccessPackage.GROUP__USERS:
        return getUsers();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SecurityAccessPackage.GROUP__USERS:
        getUsers().clear();
        getUsers().addAll((Collection<? extends User>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SecurityAccessPackage.GROUP__USERS:
        getUsers().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SecurityAccessPackage.GROUP__USERS:
        return users != null && !users.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GroupImpl
