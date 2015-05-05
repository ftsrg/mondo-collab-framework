/**
 */
package mondo.collab.security.xtext.securityAccess.impl;

import mondo.collab.security.xtext.securityAccess.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityAccessFactoryImpl extends EFactoryImpl implements SecurityAccessFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SecurityAccessFactory init()
  {
    try
    {
      SecurityAccessFactory theSecurityAccessFactory = (SecurityAccessFactory)EPackage.Registry.INSTANCE.getEFactory(SecurityAccessPackage.eNS_URI);
      if (theSecurityAccessFactory != null)
      {
        return theSecurityAccessFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SecurityAccessFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecurityAccessFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SecurityAccessPackage.ACCESS_CONTROL_MODEL: return createAccessControlModel();
      case SecurityAccessPackage.ROLE: return createRole();
      case SecurityAccessPackage.USER: return createUser();
      case SecurityAccessPackage.GROUP: return createGroup();
      case SecurityAccessPackage.POLICY: return createPolicy();
      case SecurityAccessPackage.RULE: return createRule();
      case SecurityAccessPackage.BINDING: return createBinding();
      case SecurityAccessPackage.BIND: return createBind();
      case SecurityAccessPackage.ROLE_BIND: return createRoleBind();
      case SecurityAccessPackage.VALUE_BIND: return createValueBind();
      case SecurityAccessPackage.OBJECT_BIND: return createObjectBind();
      case SecurityAccessPackage.IMPORT_RESOURCE: return createImportResource();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SecurityAccessPackage.RULE_RIGHTS:
        return createRuleRightsFromString(eDataType, initialValue);
      case SecurityAccessPackage.RULE_TYPE:
        return createRuleTypeFromString(eDataType, initialValue);
      case SecurityAccessPackage.CONFLICT_RESOLUTION_TYPES:
        return createConflictResolutionTypesFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SecurityAccessPackage.RULE_RIGHTS:
        return convertRuleRightsToString(eDataType, instanceValue);
      case SecurityAccessPackage.RULE_TYPE:
        return convertRuleTypeToString(eDataType, instanceValue);
      case SecurityAccessPackage.CONFLICT_RESOLUTION_TYPES:
        return convertConflictResolutionTypesToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessControlModel createAccessControlModel()
  {
    AccessControlModelImpl accessControlModel = new AccessControlModelImpl();
    return accessControlModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User createUser()
  {
    UserImpl user = new UserImpl();
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group createGroup()
  {
    GroupImpl group = new GroupImpl();
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Policy createPolicy()
  {
    PolicyImpl policy = new PolicyImpl();
    return policy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bind createBind()
  {
    BindImpl bind = new BindImpl();
    return bind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleBind createRoleBind()
  {
    RoleBindImpl roleBind = new RoleBindImpl();
    return roleBind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueBind createValueBind()
  {
    ValueBindImpl valueBind = new ValueBindImpl();
    return valueBind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectBind createObjectBind()
  {
    ObjectBindImpl objectBind = new ObjectBindImpl();
    return objectBind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportResource createImportResource()
  {
    ImportResourceImpl importResource = new ImportResourceImpl();
    return importResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleRights createRuleRightsFromString(EDataType eDataType, String initialValue)
  {
    RuleRights result = RuleRights.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRuleRightsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleType createRuleTypeFromString(EDataType eDataType, String initialValue)
  {
    RuleType result = RuleType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRuleTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConflictResolutionTypes createConflictResolutionTypesFromString(EDataType eDataType, String initialValue)
  {
    ConflictResolutionTypes result = ConflictResolutionTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConflictResolutionTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecurityAccessPackage getSecurityAccessPackage()
  {
    return (SecurityAccessPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SecurityAccessPackage getPackage()
  {
    return SecurityAccessPackage.eINSTANCE;
  }

} //SecurityAccessFactoryImpl
