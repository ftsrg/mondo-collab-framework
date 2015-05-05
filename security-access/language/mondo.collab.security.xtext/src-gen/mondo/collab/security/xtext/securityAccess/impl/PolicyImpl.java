/**
 */
package mondo.collab.security.xtext.securityAccess.impl;

import java.util.Collection;

import mondo.collab.security.xtext.securityAccess.ConflictResolutionTypes;
import mondo.collab.security.xtext.securityAccess.ImportResource;
import mondo.collab.security.xtext.securityAccess.Policy;
import mondo.collab.security.xtext.securityAccess.Role;
import mondo.collab.security.xtext.securityAccess.Rule;
import mondo.collab.security.xtext.securityAccess.SecurityAccessPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.impl.PolicyImpl#getName <em>Name</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.impl.PolicyImpl#getType <em>Type</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.impl.PolicyImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.impl.PolicyImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.impl.PolicyImpl#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyImpl extends MinimalEObjectImpl.Container implements Policy
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ConflictResolutionTypes TYPE_EDEFAULT = ConflictResolutionTypes.DENY_OVERRIDES;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ConflictResolutionTypes type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected EList<Role> roles;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportResource> imports;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<Rule> rules;

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
    return SecurityAccessPackage.Literals.POLICY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityAccessPackage.POLICY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConflictResolutionTypes getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ConflictResolutionTypes newType)
  {
    ConflictResolutionTypes oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityAccessPackage.POLICY__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Role> getRoles()
  {
    if (roles == null)
    {
      roles = new EObjectResolvingEList<Role>(Role.class, this, SecurityAccessPackage.POLICY__ROLES);
    }
    return roles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportResource> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportResource>(ImportResource.class, this, SecurityAccessPackage.POLICY__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rule> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<Rule>(Rule.class, this, SecurityAccessPackage.POLICY__RULES);
    }
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SecurityAccessPackage.POLICY__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case SecurityAccessPackage.POLICY__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SecurityAccessPackage.POLICY__NAME:
        return getName();
      case SecurityAccessPackage.POLICY__TYPE:
        return getType();
      case SecurityAccessPackage.POLICY__ROLES:
        return getRoles();
      case SecurityAccessPackage.POLICY__IMPORTS:
        return getImports();
      case SecurityAccessPackage.POLICY__RULES:
        return getRules();
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
      case SecurityAccessPackage.POLICY__NAME:
        setName((String)newValue);
        return;
      case SecurityAccessPackage.POLICY__TYPE:
        setType((ConflictResolutionTypes)newValue);
        return;
      case SecurityAccessPackage.POLICY__ROLES:
        getRoles().clear();
        getRoles().addAll((Collection<? extends Role>)newValue);
        return;
      case SecurityAccessPackage.POLICY__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportResource>)newValue);
        return;
      case SecurityAccessPackage.POLICY__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends Rule>)newValue);
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
      case SecurityAccessPackage.POLICY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SecurityAccessPackage.POLICY__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case SecurityAccessPackage.POLICY__ROLES:
        getRoles().clear();
        return;
      case SecurityAccessPackage.POLICY__IMPORTS:
        getImports().clear();
        return;
      case SecurityAccessPackage.POLICY__RULES:
        getRules().clear();
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
      case SecurityAccessPackage.POLICY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SecurityAccessPackage.POLICY__TYPE:
        return type != TYPE_EDEFAULT;
      case SecurityAccessPackage.POLICY__ROLES:
        return roles != null && !roles.isEmpty();
      case SecurityAccessPackage.POLICY__IMPORTS:
        return imports != null && !imports.isEmpty();
      case SecurityAccessPackage.POLICY__RULES:
        return rules != null && !rules.isEmpty();
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
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //PolicyImpl
