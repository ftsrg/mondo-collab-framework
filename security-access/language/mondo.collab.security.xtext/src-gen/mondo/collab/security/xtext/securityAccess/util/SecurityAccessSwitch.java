/**
 */
package mondo.collab.security.xtext.securityAccess.util;

import mondo.collab.security.xtext.securityAccess.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage
 * @generated
 */
public class SecurityAccessSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SecurityAccessPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecurityAccessSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SecurityAccessPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SecurityAccessPackage.ACCESS_CONTROL_MODEL:
      {
        AccessControlModel accessControlModel = (AccessControlModel)theEObject;
        T result = caseAccessControlModel(accessControlModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecurityAccessPackage.ROLE:
      {
        Role role = (Role)theEObject;
        T result = caseRole(role);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecurityAccessPackage.USER:
      {
        User user = (User)theEObject;
        T result = caseUser(user);
        if (result == null) result = caseRole(user);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecurityAccessPackage.GROUP:
      {
        Group group = (Group)theEObject;
        T result = caseGroup(group);
        if (result == null) result = caseRole(group);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecurityAccessPackage.POLICY:
      {
        Policy policy = (Policy)theEObject;
        T result = casePolicy(policy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecurityAccessPackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecurityAccessPackage.BINDING:
      {
        Binding binding = (Binding)theEObject;
        T result = caseBinding(binding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecurityAccessPackage.BIND:
      {
        Bind bind = (Bind)theEObject;
        T result = caseBind(bind);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecurityAccessPackage.ROLE_BIND:
      {
        RoleBind roleBind = (RoleBind)theEObject;
        T result = caseRoleBind(roleBind);
        if (result == null) result = caseBind(roleBind);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecurityAccessPackage.VALUE_BIND:
      {
        ValueBind valueBind = (ValueBind)theEObject;
        T result = caseValueBind(valueBind);
        if (result == null) result = caseBind(valueBind);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecurityAccessPackage.OBJECT_BIND:
      {
        ObjectBind objectBind = (ObjectBind)theEObject;
        T result = caseObjectBind(objectBind);
        if (result == null) result = caseBind(objectBind);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SecurityAccessPackage.IMPORT_RESOURCE:
      {
        ImportResource importResource = (ImportResource)theEObject;
        T result = caseImportResource(importResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Access Control Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Access Control Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccessControlModel(AccessControlModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRole(Role object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>User</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUser(User object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroup(Group object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Policy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Policy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePolicy(Policy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinding(Binding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bind</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bind</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBind(Bind object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Bind</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Bind</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleBind(RoleBind object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Bind</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Bind</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueBind(ValueBind object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Bind</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Bind</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectBind(ObjectBind object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportResource(ImportResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SecurityAccessSwitch
