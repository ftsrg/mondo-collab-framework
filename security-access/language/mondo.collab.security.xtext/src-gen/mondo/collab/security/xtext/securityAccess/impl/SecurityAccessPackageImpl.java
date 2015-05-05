/**
 */
package mondo.collab.security.xtext.securityAccess.impl;

import mondo.collab.security.xtext.securityAccess.AccessControlModel;
import mondo.collab.security.xtext.securityAccess.Bind;
import mondo.collab.security.xtext.securityAccess.Binding;
import mondo.collab.security.xtext.securityAccess.ConflictResolutionTypes;
import mondo.collab.security.xtext.securityAccess.Group;
import mondo.collab.security.xtext.securityAccess.ImportResource;
import mondo.collab.security.xtext.securityAccess.ObjectBind;
import mondo.collab.security.xtext.securityAccess.Policy;
import mondo.collab.security.xtext.securityAccess.Role;
import mondo.collab.security.xtext.securityAccess.RoleBind;
import mondo.collab.security.xtext.securityAccess.Rule;
import mondo.collab.security.xtext.securityAccess.RuleRights;
import mondo.collab.security.xtext.securityAccess.RuleType;
import mondo.collab.security.xtext.securityAccess.SecurityAccessFactory;
import mondo.collab.security.xtext.securityAccess.SecurityAccessPackage;
import mondo.collab.security.xtext.securityAccess.User;
import mondo.collab.security.xtext.securityAccess.ValueBind;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.incquery.patternlanguage.patternLanguage.PatternLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityAccessPackageImpl extends EPackageImpl implements SecurityAccessPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accessControlModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass policyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleBindEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueBindEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectBindEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importResourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum ruleRightsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum ruleTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum conflictResolutionTypesEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SecurityAccessPackageImpl()
  {
    super(eNS_URI, SecurityAccessFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SecurityAccessPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SecurityAccessPackage init()
  {
    if (isInited) return (SecurityAccessPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityAccessPackage.eNS_URI);

    // Obtain or create and register package
    SecurityAccessPackageImpl theSecurityAccessPackage = (SecurityAccessPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SecurityAccessPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SecurityAccessPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    PatternLanguagePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSecurityAccessPackage.createPackageContents();

    // Initialize created meta-data
    theSecurityAccessPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSecurityAccessPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SecurityAccessPackage.eNS_URI, theSecurityAccessPackage);
    return theSecurityAccessPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAccessControlModel()
  {
    return accessControlModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccessControlModel_Roles()
  {
    return (EReference)accessControlModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccessControlModel_Policy()
  {
    return (EReference)accessControlModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRole()
  {
    return roleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRole_Name()
  {
    return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUser()
  {
    return userEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroup()
  {
    return groupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroup_Users()
  {
    return (EReference)groupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPolicy()
  {
    return policyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPolicy_Name()
  {
    return (EAttribute)policyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPolicy_Type()
  {
    return (EAttribute)policyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_Roles()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_Imports()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_Rules()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRule_Name()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRule_Type()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRule_Rights()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Pattern()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Bindings()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinding()
  {
    return bindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinding_Param()
  {
    return (EReference)bindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinding_Value()
  {
    return (EReference)bindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBind()
  {
    return bindEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoleBind()
  {
    return roleBindEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoleBind_Role()
  {
    return (EReference)roleBindEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueBind()
  {
    return valueBindEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueBind_Value()
  {
    return (EAttribute)valueBindEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectBind()
  {
    return objectBindEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectBind_Object()
  {
    return (EReference)objectBindEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportResource()
  {
    return importResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportResource_ImportURI()
  {
    return (EAttribute)importResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRuleRights()
  {
    return ruleRightsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRuleType()
  {
    return ruleTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getConflictResolutionTypes()
  {
    return conflictResolutionTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecurityAccessFactory getSecurityAccessFactory()
  {
    return (SecurityAccessFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    accessControlModelEClass = createEClass(ACCESS_CONTROL_MODEL);
    createEReference(accessControlModelEClass, ACCESS_CONTROL_MODEL__ROLES);
    createEReference(accessControlModelEClass, ACCESS_CONTROL_MODEL__POLICY);

    roleEClass = createEClass(ROLE);
    createEAttribute(roleEClass, ROLE__NAME);

    userEClass = createEClass(USER);

    groupEClass = createEClass(GROUP);
    createEReference(groupEClass, GROUP__USERS);

    policyEClass = createEClass(POLICY);
    createEAttribute(policyEClass, POLICY__NAME);
    createEAttribute(policyEClass, POLICY__TYPE);
    createEReference(policyEClass, POLICY__ROLES);
    createEReference(policyEClass, POLICY__IMPORTS);
    createEReference(policyEClass, POLICY__RULES);

    ruleEClass = createEClass(RULE);
    createEAttribute(ruleEClass, RULE__NAME);
    createEAttribute(ruleEClass, RULE__TYPE);
    createEAttribute(ruleEClass, RULE__RIGHTS);
    createEReference(ruleEClass, RULE__PATTERN);
    createEReference(ruleEClass, RULE__BINDINGS);

    bindingEClass = createEClass(BINDING);
    createEReference(bindingEClass, BINDING__PARAM);
    createEReference(bindingEClass, BINDING__VALUE);

    bindEClass = createEClass(BIND);

    roleBindEClass = createEClass(ROLE_BIND);
    createEReference(roleBindEClass, ROLE_BIND__ROLE);

    valueBindEClass = createEClass(VALUE_BIND);
    createEAttribute(valueBindEClass, VALUE_BIND__VALUE);

    objectBindEClass = createEClass(OBJECT_BIND);
    createEReference(objectBindEClass, OBJECT_BIND__OBJECT);

    importResourceEClass = createEClass(IMPORT_RESOURCE);
    createEAttribute(importResourceEClass, IMPORT_RESOURCE__IMPORT_URI);

    // Create enums
    ruleRightsEEnum = createEEnum(RULE_RIGHTS);
    ruleTypeEEnum = createEEnum(RULE_TYPE);
    conflictResolutionTypesEEnum = createEEnum(CONFLICT_RESOLUTION_TYPES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    PatternLanguagePackage thePatternLanguagePackage = (PatternLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(PatternLanguagePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    userEClass.getESuperTypes().add(this.getRole());
    groupEClass.getESuperTypes().add(this.getRole());
    roleBindEClass.getESuperTypes().add(this.getBind());
    valueBindEClass.getESuperTypes().add(this.getBind());
    objectBindEClass.getESuperTypes().add(this.getBind());

    // Initialize classes and features; add operations and parameters
    initEClass(accessControlModelEClass, AccessControlModel.class, "AccessControlModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAccessControlModel_Roles(), this.getRole(), null, "roles", null, 0, -1, AccessControlModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAccessControlModel_Policy(), this.getPolicy(), null, "policy", null, 0, 1, AccessControlModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGroup_Users(), this.getUser(), null, "users", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPolicy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPolicy_Type(), this.getConflictResolutionTypes(), "type", null, 0, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_Roles(), this.getRole(), null, "roles", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_Imports(), this.getImportResource(), null, "imports", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_Rules(), this.getRule(), null, "rules", null, 0, -1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRule_Type(), this.getRuleType(), "type", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRule_Rights(), this.getRuleRights(), "rights", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Pattern(), thePatternLanguagePackage.getPattern(), null, "pattern", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Bindings(), this.getBinding(), null, "bindings", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinding_Param(), thePatternLanguagePackage.getVariable(), null, "param", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinding_Value(), this.getBind(), null, "value", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindEClass, Bind.class, "Bind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(roleBindEClass, RoleBind.class, "RoleBind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRoleBind_Role(), this.getRole(), null, "role", null, 0, 1, RoleBind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueBindEClass, ValueBind.class, "ValueBind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValueBind_Value(), ecorePackage.getEString(), "value", null, 0, 1, ValueBind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectBindEClass, ObjectBind.class, "ObjectBind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectBind_Object(), ecorePackage.getEObject(), null, "object", null, 0, 1, ObjectBind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importResourceEClass, ImportResource.class, "ImportResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportResource_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, ImportResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(ruleRightsEEnum, RuleRights.class, "RuleRights");
    addEEnumLiteral(ruleRightsEEnum, RuleRights.READ);
    addEEnumLiteral(ruleRightsEEnum, RuleRights.WRITE);
    addEEnumLiteral(ruleRightsEEnum, RuleRights.READ_WRITE);

    initEEnum(ruleTypeEEnum, RuleType.class, "RuleType");
    addEEnumLiteral(ruleTypeEEnum, RuleType.DENY);
    addEEnumLiteral(ruleTypeEEnum, RuleType.PERMIT);
    addEEnumLiteral(ruleTypeEEnum, RuleType.OBFUSCATE);

    initEEnum(conflictResolutionTypesEEnum, ConflictResolutionTypes.class, "ConflictResolutionTypes");
    addEEnumLiteral(conflictResolutionTypesEEnum, ConflictResolutionTypes.DENY_OVERRIDES);
    addEEnumLiteral(conflictResolutionTypesEEnum, ConflictResolutionTypes.PERMIT_OVERRIDES);
    addEEnumLiteral(conflictResolutionTypesEEnum, ConflictResolutionTypes.FIRST_APPLICABLE);
    addEEnumLiteral(conflictResolutionTypesEEnum, ConflictResolutionTypes.ONLY_ONE_APPLICABLE_POLICY);
    addEEnumLiteral(conflictResolutionTypesEEnum, ConflictResolutionTypes.ORDERED_DENY_OVERRIDES);
    addEEnumLiteral(conflictResolutionTypesEEnum, ConflictResolutionTypes.ORDERED_PERMIT_OVERRIDES);
    addEEnumLiteral(conflictResolutionTypesEEnum, ConflictResolutionTypes.DENY_UNLESS_PERMIT);
    addEEnumLiteral(conflictResolutionTypesEEnum, ConflictResolutionTypes.PERMIT_UNLESS_DENY);

    // Create resource
    createResource(eNS_URI);
  }

} //SecurityAccessPackageImpl
