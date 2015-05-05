/**
 */
package mondo.collab.security.xtext.securityAccess.impl;

import mondo.collab.security.xtext.securityAccess.Bind;
import mondo.collab.security.xtext.securityAccess.Binding;
import mondo.collab.security.xtext.securityAccess.SecurityAccessPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.incquery.patternlanguage.patternLanguage.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.impl.BindingImpl#getParam <em>Param</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.impl.BindingImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding
{
  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected Variable param;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Bind value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingImpl()
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
    return SecurityAccessPackage.Literals.BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getParam()
  {
    if (param != null && param.eIsProxy())
    {
      InternalEObject oldParam = (InternalEObject)param;
      param = (Variable)eResolveProxy(oldParam);
      if (param != oldParam)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityAccessPackage.BINDING__PARAM, oldParam, param));
      }
    }
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetParam()
  {
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParam(Variable newParam)
  {
    Variable oldParam = param;
    param = newParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityAccessPackage.BINDING__PARAM, oldParam, param));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bind getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Bind newValue, NotificationChain msgs)
  {
    Bind oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecurityAccessPackage.BINDING__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Bind newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecurityAccessPackage.BINDING__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecurityAccessPackage.BINDING__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityAccessPackage.BINDING__VALUE, newValue, newValue));
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
      case SecurityAccessPackage.BINDING__VALUE:
        return basicSetValue(null, msgs);
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
      case SecurityAccessPackage.BINDING__PARAM:
        if (resolve) return getParam();
        return basicGetParam();
      case SecurityAccessPackage.BINDING__VALUE:
        return getValue();
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
      case SecurityAccessPackage.BINDING__PARAM:
        setParam((Variable)newValue);
        return;
      case SecurityAccessPackage.BINDING__VALUE:
        setValue((Bind)newValue);
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
      case SecurityAccessPackage.BINDING__PARAM:
        setParam((Variable)null);
        return;
      case SecurityAccessPackage.BINDING__VALUE:
        setValue((Bind)null);
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
      case SecurityAccessPackage.BINDING__PARAM:
        return param != null;
      case SecurityAccessPackage.BINDING__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //BindingImpl
