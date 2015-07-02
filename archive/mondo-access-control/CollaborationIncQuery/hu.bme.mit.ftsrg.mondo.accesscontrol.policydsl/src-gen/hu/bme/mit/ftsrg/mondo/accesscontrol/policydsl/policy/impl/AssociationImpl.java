/**
 */
package hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl;

import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyPackage;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.TargetType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.AssociationImpl#getTeszt <em>Teszt</em>}</li>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.AssociationImpl#getDefaultPermission <em>Default Permission</em>}</li>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.AssociationImpl#getOverride <em>Override</em>}</li>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.AssociationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.AssociationImpl#getTarget_id <em>Target id</em>}</li>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.AssociationImpl#getPolicies <em>Policies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends ElementsImpl implements Association
{
  /**
   * The default value of the '{@link #getTeszt() <em>Teszt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeszt()
   * @generated
   * @ordered
   */
  protected static final String TESZT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTeszt() <em>Teszt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeszt()
   * @generated
   * @ordered
   */
  protected String teszt = TESZT_EDEFAULT;

  /**
   * The default value of the '{@link #getDefaultPermission() <em>Default Permission</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultPermission()
   * @generated
   * @ordered
   */
  protected static final PermissionType DEFAULT_PERMISSION_EDEFAULT = PermissionType.UNSET;

  /**
   * The cached value of the '{@link #getDefaultPermission() <em>Default Permission</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultPermission()
   * @generated
   * @ordered
   */
  protected PermissionType defaultPermission = DEFAULT_PERMISSION_EDEFAULT;

  /**
   * The default value of the '{@link #getOverride() <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverride()
   * @generated
   * @ordered
   */
  protected static final PermissionType OVERRIDE_EDEFAULT = PermissionType.UNSET;

  /**
   * The cached value of the '{@link #getOverride() <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverride()
   * @generated
   * @ordered
   */
  protected PermissionType override = OVERRIDE_EDEFAULT;

  /**
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected static final TargetType TARGET_EDEFAULT = TargetType.GROUP;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected TargetType target = TARGET_EDEFAULT;

  /**
   * The default value of the '{@link #getTarget_id() <em>Target id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget_id()
   * @generated
   * @ordered
   */
  protected static final String TARGET_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTarget_id() <em>Target id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget_id()
   * @generated
   * @ordered
   */
  protected String target_id = TARGET_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getPolicies() <em>Policies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicies()
   * @generated
   * @ordered
   */
  protected EList<Policy> policies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssociationImpl()
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
    return PolicyPackage.Literals.ASSOCIATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTeszt()
  {
    return teszt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTeszt(String newTeszt)
  {
    String oldTeszt = teszt;
    teszt = newTeszt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.ASSOCIATION__TESZT, oldTeszt, teszt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PermissionType getDefaultPermission()
  {
    return defaultPermission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultPermission(PermissionType newDefaultPermission)
  {
    PermissionType oldDefaultPermission = defaultPermission;
    defaultPermission = newDefaultPermission == null ? DEFAULT_PERMISSION_EDEFAULT : newDefaultPermission;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.ASSOCIATION__DEFAULT_PERMISSION, oldDefaultPermission, defaultPermission));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PermissionType getOverride()
  {
    return override;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOverride(PermissionType newOverride)
  {
    PermissionType oldOverride = override;
    override = newOverride == null ? OVERRIDE_EDEFAULT : newOverride;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.ASSOCIATION__OVERRIDE, oldOverride, override));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetType getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(TargetType newTarget)
  {
    TargetType oldTarget = target;
    target = newTarget == null ? TARGET_EDEFAULT : newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.ASSOCIATION__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTarget_id()
  {
    return target_id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget_id(String newTarget_id)
  {
    String oldTarget_id = target_id;
    target_id = newTarget_id;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PolicyPackage.ASSOCIATION__TARGET_ID, oldTarget_id, target_id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Policy> getPolicies()
  {
    if (policies == null)
    {
      policies = new EObjectResolvingEList<Policy>(Policy.class, this, PolicyPackage.ASSOCIATION__POLICIES);
    }
    return policies;
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
      case PolicyPackage.ASSOCIATION__TESZT:
        return getTeszt();
      case PolicyPackage.ASSOCIATION__DEFAULT_PERMISSION:
        return getDefaultPermission();
      case PolicyPackage.ASSOCIATION__OVERRIDE:
        return getOverride();
      case PolicyPackage.ASSOCIATION__TARGET:
        return getTarget();
      case PolicyPackage.ASSOCIATION__TARGET_ID:
        return getTarget_id();
      case PolicyPackage.ASSOCIATION__POLICIES:
        return getPolicies();
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
      case PolicyPackage.ASSOCIATION__TESZT:
        setTeszt((String)newValue);
        return;
      case PolicyPackage.ASSOCIATION__DEFAULT_PERMISSION:
        setDefaultPermission((PermissionType)newValue);
        return;
      case PolicyPackage.ASSOCIATION__OVERRIDE:
        setOverride((PermissionType)newValue);
        return;
      case PolicyPackage.ASSOCIATION__TARGET:
        setTarget((TargetType)newValue);
        return;
      case PolicyPackage.ASSOCIATION__TARGET_ID:
        setTarget_id((String)newValue);
        return;
      case PolicyPackage.ASSOCIATION__POLICIES:
        getPolicies().clear();
        getPolicies().addAll((Collection<? extends Policy>)newValue);
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
      case PolicyPackage.ASSOCIATION__TESZT:
        setTeszt(TESZT_EDEFAULT);
        return;
      case PolicyPackage.ASSOCIATION__DEFAULT_PERMISSION:
        setDefaultPermission(DEFAULT_PERMISSION_EDEFAULT);
        return;
      case PolicyPackage.ASSOCIATION__OVERRIDE:
        setOverride(OVERRIDE_EDEFAULT);
        return;
      case PolicyPackage.ASSOCIATION__TARGET:
        setTarget(TARGET_EDEFAULT);
        return;
      case PolicyPackage.ASSOCIATION__TARGET_ID:
        setTarget_id(TARGET_ID_EDEFAULT);
        return;
      case PolicyPackage.ASSOCIATION__POLICIES:
        getPolicies().clear();
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
      case PolicyPackage.ASSOCIATION__TESZT:
        return TESZT_EDEFAULT == null ? teszt != null : !TESZT_EDEFAULT.equals(teszt);
      case PolicyPackage.ASSOCIATION__DEFAULT_PERMISSION:
        return defaultPermission != DEFAULT_PERMISSION_EDEFAULT;
      case PolicyPackage.ASSOCIATION__OVERRIDE:
        return override != OVERRIDE_EDEFAULT;
      case PolicyPackage.ASSOCIATION__TARGET:
        return target != TARGET_EDEFAULT;
      case PolicyPackage.ASSOCIATION__TARGET_ID:
        return TARGET_ID_EDEFAULT == null ? target_id != null : !TARGET_ID_EDEFAULT.equals(target_id);
      case PolicyPackage.ASSOCIATION__POLICIES:
        return policies != null && !policies.isEmpty();
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
    result.append(" (teszt: ");
    result.append(teszt);
    result.append(", defaultPermission: ");
    result.append(defaultPermission);
    result.append(", override: ");
    result.append(override);
    result.append(", target: ");
    result.append(target);
    result.append(", target_id: ");
    result.append(target_id);
    result.append(')');
    return result.toString();
  }

} //AssociationImpl
