/**
 */
package mondo.collab.security.xtext.securityAccess.impl;

import java.util.Collection;

import mondo.collab.security.xtext.securityAccess.AccessControlModel;
import mondo.collab.security.xtext.securityAccess.Policy;
import mondo.collab.security.xtext.securityAccess.Role;
import mondo.collab.security.xtext.securityAccess.SecurityAccessPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Control Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.impl.AccessControlModelImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.impl.AccessControlModelImpl#getPolicy <em>Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessControlModelImpl extends MinimalEObjectImpl.Container implements AccessControlModel
{
  /**
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected EList<Role> roles;

  /**
   * The cached value of the '{@link #getPolicy() <em>Policy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicy()
   * @generated
   * @ordered
   */
  protected Policy policy;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AccessControlModelImpl()
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
    return SecurityAccessPackage.Literals.ACCESS_CONTROL_MODEL;
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
      roles = new EObjectContainmentEList<Role>(Role.class, this, SecurityAccessPackage.ACCESS_CONTROL_MODEL__ROLES);
    }
    return roles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Policy getPolicy()
  {
    return policy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPolicy(Policy newPolicy, NotificationChain msgs)
  {
    Policy oldPolicy = policy;
    policy = newPolicy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecurityAccessPackage.ACCESS_CONTROL_MODEL__POLICY, oldPolicy, newPolicy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPolicy(Policy newPolicy)
  {
    if (newPolicy != policy)
    {
      NotificationChain msgs = null;
      if (policy != null)
        msgs = ((InternalEObject)policy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecurityAccessPackage.ACCESS_CONTROL_MODEL__POLICY, null, msgs);
      if (newPolicy != null)
        msgs = ((InternalEObject)newPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecurityAccessPackage.ACCESS_CONTROL_MODEL__POLICY, null, msgs);
      msgs = basicSetPolicy(newPolicy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityAccessPackage.ACCESS_CONTROL_MODEL__POLICY, newPolicy, newPolicy));
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
      case SecurityAccessPackage.ACCESS_CONTROL_MODEL__ROLES:
        return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
      case SecurityAccessPackage.ACCESS_CONTROL_MODEL__POLICY:
        return basicSetPolicy(null, msgs);
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
      case SecurityAccessPackage.ACCESS_CONTROL_MODEL__ROLES:
        return getRoles();
      case SecurityAccessPackage.ACCESS_CONTROL_MODEL__POLICY:
        return getPolicy();
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
      case SecurityAccessPackage.ACCESS_CONTROL_MODEL__ROLES:
        getRoles().clear();
        getRoles().addAll((Collection<? extends Role>)newValue);
        return;
      case SecurityAccessPackage.ACCESS_CONTROL_MODEL__POLICY:
        setPolicy((Policy)newValue);
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
      case SecurityAccessPackage.ACCESS_CONTROL_MODEL__ROLES:
        getRoles().clear();
        return;
      case SecurityAccessPackage.ACCESS_CONTROL_MODEL__POLICY:
        setPolicy((Policy)null);
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
      case SecurityAccessPackage.ACCESS_CONTROL_MODEL__ROLES:
        return roles != null && !roles.isEmpty();
      case SecurityAccessPackage.ACCESS_CONTROL_MODEL__POLICY:
        return policy != null;
    }
    return super.eIsSet(featureID);
  }

} //AccessControlModelImpl
