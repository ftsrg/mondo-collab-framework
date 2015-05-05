/**
 */
package mondo.collab.security.xtext.securityAccess.util;

import mondo.collab.security.xtext.securityAccess.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage
 * @generated
 */
public class SecurityAccessAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SecurityAccessPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecurityAccessAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SecurityAccessPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SecurityAccessSwitch<Adapter> modelSwitch =
    new SecurityAccessSwitch<Adapter>()
    {
      @Override
      public Adapter caseAccessControlModel(AccessControlModel object)
      {
        return createAccessControlModelAdapter();
      }
      @Override
      public Adapter caseRole(Role object)
      {
        return createRoleAdapter();
      }
      @Override
      public Adapter caseUser(User object)
      {
        return createUserAdapter();
      }
      @Override
      public Adapter caseGroup(Group object)
      {
        return createGroupAdapter();
      }
      @Override
      public Adapter casePolicy(Policy object)
      {
        return createPolicyAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseBinding(Binding object)
      {
        return createBindingAdapter();
      }
      @Override
      public Adapter caseBind(Bind object)
      {
        return createBindAdapter();
      }
      @Override
      public Adapter caseRoleBind(RoleBind object)
      {
        return createRoleBindAdapter();
      }
      @Override
      public Adapter caseValueBind(ValueBind object)
      {
        return createValueBindAdapter();
      }
      @Override
      public Adapter caseObjectBind(ObjectBind object)
      {
        return createObjectBindAdapter();
      }
      @Override
      public Adapter caseImportResource(ImportResource object)
      {
        return createImportResourceAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link mondo.collab.security.xtext.securityAccess.AccessControlModel <em>Access Control Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mondo.collab.security.xtext.securityAccess.AccessControlModel
   * @generated
   */
  public Adapter createAccessControlModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mondo.collab.security.xtext.securityAccess.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mondo.collab.security.xtext.securityAccess.Role
   * @generated
   */
  public Adapter createRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mondo.collab.security.xtext.securityAccess.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mondo.collab.security.xtext.securityAccess.User
   * @generated
   */
  public Adapter createUserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mondo.collab.security.xtext.securityAccess.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mondo.collab.security.xtext.securityAccess.Group
   * @generated
   */
  public Adapter createGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mondo.collab.security.xtext.securityAccess.Policy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mondo.collab.security.xtext.securityAccess.Policy
   * @generated
   */
  public Adapter createPolicyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mondo.collab.security.xtext.securityAccess.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mondo.collab.security.xtext.securityAccess.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mondo.collab.security.xtext.securityAccess.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mondo.collab.security.xtext.securityAccess.Binding
   * @generated
   */
  public Adapter createBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mondo.collab.security.xtext.securityAccess.Bind <em>Bind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mondo.collab.security.xtext.securityAccess.Bind
   * @generated
   */
  public Adapter createBindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mondo.collab.security.xtext.securityAccess.RoleBind <em>Role Bind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mondo.collab.security.xtext.securityAccess.RoleBind
   * @generated
   */
  public Adapter createRoleBindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mondo.collab.security.xtext.securityAccess.ValueBind <em>Value Bind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mondo.collab.security.xtext.securityAccess.ValueBind
   * @generated
   */
  public Adapter createValueBindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mondo.collab.security.xtext.securityAccess.ObjectBind <em>Object Bind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mondo.collab.security.xtext.securityAccess.ObjectBind
   * @generated
   */
  public Adapter createObjectBindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mondo.collab.security.xtext.securityAccess.ImportResource <em>Import Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mondo.collab.security.xtext.securityAccess.ImportResource
   * @generated
   */
  public Adapter createImportResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SecurityAccessAdapterFactory
