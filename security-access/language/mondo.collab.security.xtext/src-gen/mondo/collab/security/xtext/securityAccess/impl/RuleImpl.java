/**
 */
package mondo.collab.security.xtext.securityAccess.impl;

import java.util.Collection;

import mondo.collab.security.xtext.securityAccess.Binding;
import mondo.collab.security.xtext.securityAccess.Rule;
import mondo.collab.security.xtext.securityAccess.RuleRights;
import mondo.collab.security.xtext.securityAccess.RuleType;
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

import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.impl.RuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.impl.RuleImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.impl.RuleImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.impl.RuleImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule
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
  protected static final RuleType TYPE_EDEFAULT = RuleType.DENY;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected RuleType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getRights() <em>Rights</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRights()
   * @generated
   * @ordered
   */
  protected static final RuleRights RIGHTS_EDEFAULT = RuleRights.READ;

  /**
   * The cached value of the '{@link #getRights() <em>Rights</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRights()
   * @generated
   * @ordered
   */
  protected RuleRights rights = RIGHTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected Pattern pattern;

  /**
   * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindings()
   * @generated
   * @ordered
   */
  protected EList<Binding> bindings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleImpl()
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
    return SecurityAccessPackage.Literals.RULE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityAccessPackage.RULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(RuleType newType)
  {
    RuleType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityAccessPackage.RULE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleRights getRights()
  {
    return rights;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRights(RuleRights newRights)
  {
    RuleRights oldRights = rights;
    rights = newRights == null ? RIGHTS_EDEFAULT : newRights;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityAccessPackage.RULE__RIGHTS, oldRights, rights));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern getPattern()
  {
    if (pattern != null && pattern.eIsProxy())
    {
      InternalEObject oldPattern = (InternalEObject)pattern;
      pattern = (Pattern)eResolveProxy(oldPattern);
      if (pattern != oldPattern)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityAccessPackage.RULE__PATTERN, oldPattern, pattern));
      }
    }
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern basicGetPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPattern(Pattern newPattern)
  {
    Pattern oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityAccessPackage.RULE__PATTERN, oldPattern, pattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Binding> getBindings()
  {
    if (bindings == null)
    {
      bindings = new EObjectContainmentEList<Binding>(Binding.class, this, SecurityAccessPackage.RULE__BINDINGS);
    }
    return bindings;
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
      case SecurityAccessPackage.RULE__BINDINGS:
        return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
      case SecurityAccessPackage.RULE__NAME:
        return getName();
      case SecurityAccessPackage.RULE__TYPE:
        return getType();
      case SecurityAccessPackage.RULE__RIGHTS:
        return getRights();
      case SecurityAccessPackage.RULE__PATTERN:
        if (resolve) return getPattern();
        return basicGetPattern();
      case SecurityAccessPackage.RULE__BINDINGS:
        return getBindings();
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
      case SecurityAccessPackage.RULE__NAME:
        setName((String)newValue);
        return;
      case SecurityAccessPackage.RULE__TYPE:
        setType((RuleType)newValue);
        return;
      case SecurityAccessPackage.RULE__RIGHTS:
        setRights((RuleRights)newValue);
        return;
      case SecurityAccessPackage.RULE__PATTERN:
        setPattern((Pattern)newValue);
        return;
      case SecurityAccessPackage.RULE__BINDINGS:
        getBindings().clear();
        getBindings().addAll((Collection<? extends Binding>)newValue);
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
      case SecurityAccessPackage.RULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SecurityAccessPackage.RULE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case SecurityAccessPackage.RULE__RIGHTS:
        setRights(RIGHTS_EDEFAULT);
        return;
      case SecurityAccessPackage.RULE__PATTERN:
        setPattern((Pattern)null);
        return;
      case SecurityAccessPackage.RULE__BINDINGS:
        getBindings().clear();
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
      case SecurityAccessPackage.RULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SecurityAccessPackage.RULE__TYPE:
        return type != TYPE_EDEFAULT;
      case SecurityAccessPackage.RULE__RIGHTS:
        return rights != RIGHTS_EDEFAULT;
      case SecurityAccessPackage.RULE__PATTERN:
        return pattern != null;
      case SecurityAccessPackage.RULE__BINDINGS:
        return bindings != null && !bindings.isEmpty();
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
    result.append(", rights: ");
    result.append(rights);
    result.append(')');
    return result.toString();
  }

} //RuleImpl
