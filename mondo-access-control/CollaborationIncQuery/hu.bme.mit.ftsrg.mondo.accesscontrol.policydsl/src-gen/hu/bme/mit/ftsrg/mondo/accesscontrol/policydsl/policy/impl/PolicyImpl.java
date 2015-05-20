/**
 */
package hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl;

import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyImpl extends ElementsImpl implements Policy
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPermission() <em>Permission</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermission()
   * @generated
   * @ordered
   */
  protected static final PermissionType PERMISSION_EDEFAULT = PermissionType.UNSET;

  /**
   * The cached value of the '{@link #getPermission() <em>Permission</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermission()
   * @generated
   * @ordered
   */
  protected PermissionType permission = PERMISSION_EDEFAULT;

  /**
   * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected static final String QUERY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected String query = QUERY_EDEFAULT;

  /**
   * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected static final String PATTERN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected String pattern = PATTERN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PolicyImpl()
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
    return PolicyPackage.Literals.POLICY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.POLICY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PermissionType getPermission()
  {
    return permission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPermission(PermissionType newPermission)
  {
    PermissionType oldPermission = permission;
    permission = newPermission == null ? PERMISSION_EDEFAULT : newPermission;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.POLICY__PERMISSION, oldPermission, permission));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQuery()
  {
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery(String newQuery)
  {
    String oldQuery = query;
    query = newQuery;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.POLICY__QUERY, oldQuery, query));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(String newPattern)
  {
    String oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.POLICY__PATTERN, oldPattern, pattern));
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
      case PolicyPackage.POLICY__NAME:
        return getName();
      case PolicyPackage.POLICY__PERMISSION:
        return getPermission();
      case PolicyPackage.POLICY__QUERY:
        return getQuery();
      case PolicyPackage.POLICY__PATTERN:
        return getPattern();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PolicyPackage.POLICY__NAME:
        setName((String)newValue);
        return;
      case PolicyPackage.POLICY__PERMISSION:
        setPermission((PermissionType)newValue);
        return;
      case PolicyPackage.POLICY__QUERY:
        setQuery((String)newValue);
        return;
      case PolicyPackage.POLICY__PATTERN:
        setPattern((String)newValue);
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
      case PolicyPackage.POLICY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PolicyPackage.POLICY__PERMISSION:
        setPermission(PERMISSION_EDEFAULT);
        return;
      case PolicyPackage.POLICY__QUERY:
        setQuery(QUERY_EDEFAULT);
        return;
      case PolicyPackage.POLICY__PATTERN:
        setPattern(PATTERN_EDEFAULT);
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
      case PolicyPackage.POLICY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PolicyPackage.POLICY__PERMISSION:
        return permission != PERMISSION_EDEFAULT;
      case PolicyPackage.POLICY__QUERY:
        return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
      case PolicyPackage.POLICY__PATTERN:
        return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", permission: ");
    result.append(permission);
    result.append(", query: ");
    result.append(query);
    result.append(", pattern: ");
    result.append(pattern);
    result.append(')');
    return result.toString();
  }

} //PolicyImpl
