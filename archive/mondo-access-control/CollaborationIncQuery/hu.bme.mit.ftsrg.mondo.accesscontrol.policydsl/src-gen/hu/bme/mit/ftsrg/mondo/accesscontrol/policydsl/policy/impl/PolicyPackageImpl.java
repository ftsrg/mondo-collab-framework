/**
 */
package hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl;

import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Elements;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Model;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyFactory;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyPackage;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.TargetType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyPackageImpl extends EPackageImpl implements PolicyPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

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
  private EClass associationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum permissionTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum targetTypeEEnum = null;

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
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PolicyPackageImpl()
  {
    super(eNS_URI, PolicyFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link PolicyPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PolicyPackage init()
  {
    if (isInited) return (PolicyPackage)EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);

    // Obtain or create and register package
    PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PolicyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PolicyPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePolicyPackage.createPackageContents();

    // Initialize created meta-data
    thePolicyPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePolicyPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PolicyPackage.eNS_URI, thePolicyPackage);
    return thePolicyPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Elements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getPolicy_Permission()
  {
    return (EAttribute)policyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPolicy_Query()
  {
    return (EAttribute)policyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPolicy_Pattern()
  {
    return (EAttribute)policyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssociation()
  {
    return associationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssociation_Teszt()
  {
    return (EAttribute)associationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssociation_DefaultPermission()
  {
    return (EAttribute)associationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssociation_Override()
  {
    return (EAttribute)associationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssociation_Target()
  {
    return (EAttribute)associationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssociation_Target_id()
  {
    return (EAttribute)associationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssociation_Policies()
  {
    return (EReference)associationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElements()
  {
    return elementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPermissionType()
  {
    return permissionTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTargetType()
  {
    return targetTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PolicyFactory getPolicyFactory()
  {
    return (PolicyFactory)getEFactoryInstance();
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
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ELEMENTS);

    policyEClass = createEClass(POLICY);
    createEAttribute(policyEClass, POLICY__NAME);
    createEAttribute(policyEClass, POLICY__PERMISSION);
    createEAttribute(policyEClass, POLICY__QUERY);
    createEAttribute(policyEClass, POLICY__PATTERN);

    associationEClass = createEClass(ASSOCIATION);
    createEAttribute(associationEClass, ASSOCIATION__TESZT);
    createEAttribute(associationEClass, ASSOCIATION__DEFAULT_PERMISSION);
    createEAttribute(associationEClass, ASSOCIATION__OVERRIDE);
    createEAttribute(associationEClass, ASSOCIATION__TARGET);
    createEAttribute(associationEClass, ASSOCIATION__TARGET_ID);
    createEReference(associationEClass, ASSOCIATION__POLICIES);

    elementsEClass = createEClass(ELEMENTS);

    // Create enums
    permissionTypeEEnum = createEEnum(PERMISSION_TYPE);
    targetTypeEEnum = createEEnum(TARGET_TYPE);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    policyEClass.getESuperTypes().add(this.getElements());
    associationEClass.getESuperTypes().add(this.getElements());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Elements(), this.getElements(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPolicy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPolicy_Permission(), this.getPermissionType(), "permission", null, 0, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPolicy_Query(), ecorePackage.getEString(), "query", null, 0, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPolicy_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssociation_Teszt(), ecorePackage.getEString(), "teszt", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssociation_DefaultPermission(), this.getPermissionType(), "defaultPermission", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssociation_Override(), this.getPermissionType(), "override", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssociation_Target(), this.getTargetType(), "target", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssociation_Target_id(), ecorePackage.getEString(), "target_id", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssociation_Policies(), this.getPolicy(), null, "policies", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementsEClass, Elements.class, "Elements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(permissionTypeEEnum, PermissionType.class, "PermissionType");
    addEEnumLiteral(permissionTypeEEnum, PermissionType.UNSET);
    addEEnumLiteral(permissionTypeEEnum, PermissionType.DENY);
    addEEnumLiteral(permissionTypeEEnum, PermissionType.ALLOW);

    initEEnum(targetTypeEEnum, TargetType.class, "TargetType");
    addEEnumLiteral(targetTypeEEnum, TargetType.GROUP);
    addEEnumLiteral(targetTypeEEnum, TargetType.USER);

    // Create resource
    createResource(eNS_URI);
  }

} //PolicyPackageImpl
