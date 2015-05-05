/**
 */
package mondo.collab.security.xtext.securityAccess.impl;

import mondo.collab.security.xtext.securityAccess.ObjectBind;
import mondo.collab.security.xtext.securityAccess.SecurityAccessPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Bind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.impl.ObjectBindImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectBindImpl extends BindImpl implements ObjectBind
{
  /**
   * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected EObject object;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectBindImpl()
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
    return SecurityAccessPackage.Literals.OBJECT_BIND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getObject()
  {
    if (object != null && object.eIsProxy())
    {
      InternalEObject oldObject = (InternalEObject)object;
      object = eResolveProxy(oldObject);
      if (object != oldObject)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityAccessPackage.OBJECT_BIND__OBJECT, oldObject, object));
      }
    }
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetObject()
  {
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObject(EObject newObject)
  {
    EObject oldObject = object;
    object = newObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityAccessPackage.OBJECT_BIND__OBJECT, oldObject, object));
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
      case SecurityAccessPackage.OBJECT_BIND__OBJECT:
        if (resolve) return getObject();
        return basicGetObject();
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
      case SecurityAccessPackage.OBJECT_BIND__OBJECT:
        setObject((EObject)newValue);
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
      case SecurityAccessPackage.OBJECT_BIND__OBJECT:
        setObject((EObject)null);
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
      case SecurityAccessPackage.OBJECT_BIND__OBJECT:
        return object != null;
    }
    return super.eIsSet(featureID);
  }

} //ObjectBindImpl
