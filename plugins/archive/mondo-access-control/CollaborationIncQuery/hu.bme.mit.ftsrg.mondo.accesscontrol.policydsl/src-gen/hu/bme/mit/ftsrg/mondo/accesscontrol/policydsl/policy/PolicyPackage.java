/**
 */
package hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyFactory
 * @model kind="package"
 * @generated
 */
public interface PolicyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "policy";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bme.hu/mit/ftsrg/mondo/accesscontrol/policydsl/Policy";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "policy";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PolicyPackage eINSTANCE = hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyPackageImpl.init();

  /**
   * The meta object id for the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.ModelImpl
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.ElementsImpl <em>Elements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.ElementsImpl
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyPackageImpl#getElements()
   * @generated
   */
  int ELEMENTS = 3;

  /**
   * The number of structural features of the '<em>Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyImpl <em>Policy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyImpl
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyPackageImpl#getPolicy()
   * @generated
   */
  int POLICY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__NAME = ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Permission</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__PERMISSION = ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__QUERY = ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__PATTERN = ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Policy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.AssociationImpl <em>Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.AssociationImpl
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyPackageImpl#getAssociation()
   * @generated
   */
  int ASSOCIATION = 2;

  /**
   * The feature id for the '<em><b>Teszt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__TESZT = ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default Permission</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__DEFAULT_PERMISSION = ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__OVERRIDE = ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__TARGET = ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Target id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__TARGET_ID = ELEMENTS_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Policies</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__POLICIES = ELEMENTS_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType <em>Permission Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyPackageImpl#getPermissionType()
   * @generated
   */
  int PERMISSION_TYPE = 4;

  /**
   * The meta object id for the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.TargetType <em>Target Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.TargetType
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyPackageImpl#getTargetType()
   * @generated
   */
  int TARGET_TYPE = 5;


  /**
   * Returns the meta object for class '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Policy</em>'.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy
   * @generated
   */
  EClass getPolicy();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy#getName()
   * @see #getPolicy()
   * @generated
   */
  EAttribute getPolicy_Name();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy#getPermission <em>Permission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Permission</em>'.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy#getPermission()
   * @see #getPolicy()
   * @generated
   */
  EAttribute getPolicy_Permission();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query</em>'.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy#getQuery()
   * @see #getPolicy()
   * @generated
   */
  EAttribute getPolicy_Query();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy#getPattern()
   * @see #getPolicy()
   * @generated
   */
  EAttribute getPolicy_Pattern();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association</em>'.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association
   * @generated
   */
  EClass getAssociation();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getTeszt <em>Teszt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Teszt</em>'.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getTeszt()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_Teszt();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getDefaultPermission <em>Default Permission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Permission</em>'.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getDefaultPermission()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_DefaultPermission();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getOverride <em>Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Override</em>'.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getOverride()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_Override();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getTarget()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_Target();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getTarget_id <em>Target id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target id</em>'.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getTarget_id()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_Target_id();

  /**
   * Returns the meta object for the reference list '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getPolicies <em>Policies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Policies</em>'.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getPolicies()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_Policies();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Elements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Elements</em>'.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Elements
   * @generated
   */
  EClass getElements();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType <em>Permission Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Permission Type</em>'.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType
   * @generated
   */
  EEnum getPermissionType();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.TargetType <em>Target Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Target Type</em>'.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.TargetType
   * @generated
   */
  EEnum getTargetType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PolicyFactory getPolicyFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.ModelImpl
     * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyImpl <em>Policy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyImpl
     * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyPackageImpl#getPolicy()
     * @generated
     */
    EClass POLICY = eINSTANCE.getPolicy();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLICY__NAME = eINSTANCE.getPolicy_Name();

    /**
     * The meta object literal for the '<em><b>Permission</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLICY__PERMISSION = eINSTANCE.getPolicy_Permission();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLICY__QUERY = eINSTANCE.getPolicy_Query();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLICY__PATTERN = eINSTANCE.getPolicy_Pattern();

    /**
     * The meta object literal for the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.AssociationImpl
     * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyPackageImpl#getAssociation()
     * @generated
     */
    EClass ASSOCIATION = eINSTANCE.getAssociation();

    /**
     * The meta object literal for the '<em><b>Teszt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSOCIATION__TESZT = eINSTANCE.getAssociation_Teszt();

    /**
     * The meta object literal for the '<em><b>Default Permission</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSOCIATION__DEFAULT_PERMISSION = eINSTANCE.getAssociation_DefaultPermission();

    /**
     * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSOCIATION__OVERRIDE = eINSTANCE.getAssociation_Override();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSOCIATION__TARGET = eINSTANCE.getAssociation_Target();

    /**
     * The meta object literal for the '<em><b>Target id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSOCIATION__TARGET_ID = eINSTANCE.getAssociation_Target_id();

    /**
     * The meta object literal for the '<em><b>Policies</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSOCIATION__POLICIES = eINSTANCE.getAssociation_Policies();

    /**
     * The meta object literal for the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.ElementsImpl <em>Elements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.ElementsImpl
     * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyPackageImpl#getElements()
     * @generated
     */
    EClass ELEMENTS = eINSTANCE.getElements();

    /**
     * The meta object literal for the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType <em>Permission Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType
     * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyPackageImpl#getPermissionType()
     * @generated
     */
    EEnum PERMISSION_TYPE = eINSTANCE.getPermissionType();

    /**
     * The meta object literal for the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.TargetType <em>Target Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.TargetType
     * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.impl.PolicyPackageImpl#getTargetType()
     * @generated
     */
    EEnum TARGET_TYPE = eINSTANCE.getTargetType();

  }

} //PolicyPackage
