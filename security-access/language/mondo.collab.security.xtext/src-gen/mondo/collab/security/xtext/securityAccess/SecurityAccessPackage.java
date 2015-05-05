/**
 */
package mondo.collab.security.xtext.securityAccess;

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
 * @see mondo.collab.security.xtext.securityAccess.SecurityAccessFactory
 * @model kind="package"
 * @generated
 */
public interface SecurityAccessPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "securityAccess";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.collab.mondo/security/xtext/SecurityAccess";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "securityAccess";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SecurityAccessPackage eINSTANCE = mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl.init();

  /**
   * The meta object id for the '{@link mondo.collab.security.xtext.securityAccess.impl.AccessControlModelImpl <em>Access Control Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mondo.collab.security.xtext.securityAccess.impl.AccessControlModelImpl
   * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getAccessControlModel()
   * @generated
   */
  int ACCESS_CONTROL_MODEL = 0;

  /**
   * The feature id for the '<em><b>Roles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_CONTROL_MODEL__ROLES = 0;

  /**
   * The feature id for the '<em><b>Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_CONTROL_MODEL__POLICY = 1;

  /**
   * The number of structural features of the '<em>Access Control Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_CONTROL_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link mondo.collab.security.xtext.securityAccess.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mondo.collab.security.xtext.securityAccess.impl.RoleImpl
   * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getRole()
   * @generated
   */
  int ROLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link mondo.collab.security.xtext.securityAccess.impl.UserImpl <em>User</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mondo.collab.security.xtext.securityAccess.impl.UserImpl
   * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getUser()
   * @generated
   */
  int USER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__NAME = ROLE__NAME;

  /**
   * The number of structural features of the '<em>User</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link mondo.collab.security.xtext.securityAccess.impl.GroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mondo.collab.security.xtext.securityAccess.impl.GroupImpl
   * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getGroup()
   * @generated
   */
  int GROUP = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NAME = ROLE__NAME;

  /**
   * The feature id for the '<em><b>Users</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__USERS = ROLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mondo.collab.security.xtext.securityAccess.impl.PolicyImpl <em>Policy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mondo.collab.security.xtext.securityAccess.impl.PolicyImpl
   * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getPolicy()
   * @generated
   */
  int POLICY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__TYPE = 1;

  /**
   * The feature id for the '<em><b>Roles</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__ROLES = 2;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__IMPORTS = 3;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY__RULES = 4;

  /**
   * The number of structural features of the '<em>Policy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLICY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link mondo.collab.security.xtext.securityAccess.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mondo.collab.security.xtext.securityAccess.impl.RuleImpl
   * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getRule()
   * @generated
   */
  int RULE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Rights</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__RIGHTS = 2;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__PATTERN = 3;

  /**
   * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__BINDINGS = 4;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link mondo.collab.security.xtext.securityAccess.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mondo.collab.security.xtext.securityAccess.impl.BindingImpl
   * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getBinding()
   * @generated
   */
  int BINDING = 6;

  /**
   * The feature id for the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__PARAM = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__VALUE = 1;

  /**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link mondo.collab.security.xtext.securityAccess.impl.BindImpl <em>Bind</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mondo.collab.security.xtext.securityAccess.impl.BindImpl
   * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getBind()
   * @generated
   */
  int BIND = 7;

  /**
   * The number of structural features of the '<em>Bind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link mondo.collab.security.xtext.securityAccess.impl.RoleBindImpl <em>Role Bind</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mondo.collab.security.xtext.securityAccess.impl.RoleBindImpl
   * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getRoleBind()
   * @generated
   */
  int ROLE_BIND = 8;

  /**
   * The feature id for the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_BIND__ROLE = BIND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Role Bind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_BIND_FEATURE_COUNT = BIND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mondo.collab.security.xtext.securityAccess.impl.ValueBindImpl <em>Value Bind</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mondo.collab.security.xtext.securityAccess.impl.ValueBindImpl
   * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getValueBind()
   * @generated
   */
  int VALUE_BIND = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_BIND__VALUE = BIND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Value Bind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_BIND_FEATURE_COUNT = BIND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mondo.collab.security.xtext.securityAccess.impl.ObjectBindImpl <em>Object Bind</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mondo.collab.security.xtext.securityAccess.impl.ObjectBindImpl
   * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getObjectBind()
   * @generated
   */
  int OBJECT_BIND = 10;

  /**
   * The feature id for the '<em><b>Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_BIND__OBJECT = BIND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Bind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_BIND_FEATURE_COUNT = BIND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mondo.collab.security.xtext.securityAccess.impl.ImportResourceImpl <em>Import Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mondo.collab.security.xtext.securityAccess.impl.ImportResourceImpl
   * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getImportResource()
   * @generated
   */
  int IMPORT_RESOURCE = 11;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_RESOURCE__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_RESOURCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link mondo.collab.security.xtext.securityAccess.RuleRights <em>Rule Rights</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mondo.collab.security.xtext.securityAccess.RuleRights
   * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getRuleRights()
   * @generated
   */
  int RULE_RIGHTS = 12;

  /**
   * The meta object id for the '{@link mondo.collab.security.xtext.securityAccess.RuleType <em>Rule Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mondo.collab.security.xtext.securityAccess.RuleType
   * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getRuleType()
   * @generated
   */
  int RULE_TYPE = 13;

  /**
   * The meta object id for the '{@link mondo.collab.security.xtext.securityAccess.ConflictResolutionTypes <em>Conflict Resolution Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mondo.collab.security.xtext.securityAccess.ConflictResolutionTypes
   * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getConflictResolutionTypes()
   * @generated
   */
  int CONFLICT_RESOLUTION_TYPES = 14;


  /**
   * Returns the meta object for class '{@link mondo.collab.security.xtext.securityAccess.AccessControlModel <em>Access Control Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Access Control Model</em>'.
   * @see mondo.collab.security.xtext.securityAccess.AccessControlModel
   * @generated
   */
  EClass getAccessControlModel();

  /**
   * Returns the meta object for the containment reference list '{@link mondo.collab.security.xtext.securityAccess.AccessControlModel#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Roles</em>'.
   * @see mondo.collab.security.xtext.securityAccess.AccessControlModel#getRoles()
   * @see #getAccessControlModel()
   * @generated
   */
  EReference getAccessControlModel_Roles();

  /**
   * Returns the meta object for the containment reference '{@link mondo.collab.security.xtext.securityAccess.AccessControlModel#getPolicy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Policy</em>'.
   * @see mondo.collab.security.xtext.securityAccess.AccessControlModel#getPolicy()
   * @see #getAccessControlModel()
   * @generated
   */
  EReference getAccessControlModel_Policy();

  /**
   * Returns the meta object for class '{@link mondo.collab.security.xtext.securityAccess.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for the attribute '{@link mondo.collab.security.xtext.securityAccess.Role#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Role#getName()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Name();

  /**
   * Returns the meta object for class '{@link mondo.collab.security.xtext.securityAccess.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User</em>'.
   * @see mondo.collab.security.xtext.securityAccess.User
   * @generated
   */
  EClass getUser();

  /**
   * Returns the meta object for class '{@link mondo.collab.security.xtext.securityAccess.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Group
   * @generated
   */
  EClass getGroup();

  /**
   * Returns the meta object for the reference list '{@link mondo.collab.security.xtext.securityAccess.Group#getUsers <em>Users</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Users</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Group#getUsers()
   * @see #getGroup()
   * @generated
   */
  EReference getGroup_Users();

  /**
   * Returns the meta object for class '{@link mondo.collab.security.xtext.securityAccess.Policy <em>Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Policy</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Policy
   * @generated
   */
  EClass getPolicy();

  /**
   * Returns the meta object for the attribute '{@link mondo.collab.security.xtext.securityAccess.Policy#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Policy#getName()
   * @see #getPolicy()
   * @generated
   */
  EAttribute getPolicy_Name();

  /**
   * Returns the meta object for the attribute '{@link mondo.collab.security.xtext.securityAccess.Policy#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Policy#getType()
   * @see #getPolicy()
   * @generated
   */
  EAttribute getPolicy_Type();

  /**
   * Returns the meta object for the reference list '{@link mondo.collab.security.xtext.securityAccess.Policy#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Roles</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Policy#getRoles()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Roles();

  /**
   * Returns the meta object for the containment reference list '{@link mondo.collab.security.xtext.securityAccess.Policy#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Policy#getImports()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link mondo.collab.security.xtext.securityAccess.Policy#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Policy#getRules()
   * @see #getPolicy()
   * @generated
   */
  EReference getPolicy_Rules();

  /**
   * Returns the meta object for class '{@link mondo.collab.security.xtext.securityAccess.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the attribute '{@link mondo.collab.security.xtext.securityAccess.Rule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Rule#getName()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Name();

  /**
   * Returns the meta object for the attribute '{@link mondo.collab.security.xtext.securityAccess.Rule#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Rule#getType()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Type();

  /**
   * Returns the meta object for the attribute '{@link mondo.collab.security.xtext.securityAccess.Rule#getRights <em>Rights</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rights</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Rule#getRights()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Rights();

  /**
   * Returns the meta object for the reference '{@link mondo.collab.security.xtext.securityAccess.Rule#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pattern</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Rule#getPattern()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Pattern();

  /**
   * Returns the meta object for the containment reference list '{@link mondo.collab.security.xtext.securityAccess.Rule#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bindings</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Rule#getBindings()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Bindings();

  /**
   * Returns the meta object for class '{@link mondo.collab.security.xtext.securityAccess.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for the reference '{@link mondo.collab.security.xtext.securityAccess.Binding#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Param</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Binding#getParam()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_Param();

  /**
   * Returns the meta object for the containment reference '{@link mondo.collab.security.xtext.securityAccess.Binding#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Binding#getValue()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_Value();

  /**
   * Returns the meta object for class '{@link mondo.collab.security.xtext.securityAccess.Bind <em>Bind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bind</em>'.
   * @see mondo.collab.security.xtext.securityAccess.Bind
   * @generated
   */
  EClass getBind();

  /**
   * Returns the meta object for class '{@link mondo.collab.security.xtext.securityAccess.RoleBind <em>Role Bind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Bind</em>'.
   * @see mondo.collab.security.xtext.securityAccess.RoleBind
   * @generated
   */
  EClass getRoleBind();

  /**
   * Returns the meta object for the reference '{@link mondo.collab.security.xtext.securityAccess.RoleBind#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Role</em>'.
   * @see mondo.collab.security.xtext.securityAccess.RoleBind#getRole()
   * @see #getRoleBind()
   * @generated
   */
  EReference getRoleBind_Role();

  /**
   * Returns the meta object for class '{@link mondo.collab.security.xtext.securityAccess.ValueBind <em>Value Bind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Bind</em>'.
   * @see mondo.collab.security.xtext.securityAccess.ValueBind
   * @generated
   */
  EClass getValueBind();

  /**
   * Returns the meta object for the attribute '{@link mondo.collab.security.xtext.securityAccess.ValueBind#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see mondo.collab.security.xtext.securityAccess.ValueBind#getValue()
   * @see #getValueBind()
   * @generated
   */
  EAttribute getValueBind_Value();

  /**
   * Returns the meta object for class '{@link mondo.collab.security.xtext.securityAccess.ObjectBind <em>Object Bind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Bind</em>'.
   * @see mondo.collab.security.xtext.securityAccess.ObjectBind
   * @generated
   */
  EClass getObjectBind();

  /**
   * Returns the meta object for the reference '{@link mondo.collab.security.xtext.securityAccess.ObjectBind#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Object</em>'.
   * @see mondo.collab.security.xtext.securityAccess.ObjectBind#getObject()
   * @see #getObjectBind()
   * @generated
   */
  EReference getObjectBind_Object();

  /**
   * Returns the meta object for class '{@link mondo.collab.security.xtext.securityAccess.ImportResource <em>Import Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Resource</em>'.
   * @see mondo.collab.security.xtext.securityAccess.ImportResource
   * @generated
   */
  EClass getImportResource();

  /**
   * Returns the meta object for the attribute '{@link mondo.collab.security.xtext.securityAccess.ImportResource#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see mondo.collab.security.xtext.securityAccess.ImportResource#getImportURI()
   * @see #getImportResource()
   * @generated
   */
  EAttribute getImportResource_ImportURI();

  /**
   * Returns the meta object for enum '{@link mondo.collab.security.xtext.securityAccess.RuleRights <em>Rule Rights</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Rule Rights</em>'.
   * @see mondo.collab.security.xtext.securityAccess.RuleRights
   * @generated
   */
  EEnum getRuleRights();

  /**
   * Returns the meta object for enum '{@link mondo.collab.security.xtext.securityAccess.RuleType <em>Rule Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Rule Type</em>'.
   * @see mondo.collab.security.xtext.securityAccess.RuleType
   * @generated
   */
  EEnum getRuleType();

  /**
   * Returns the meta object for enum '{@link mondo.collab.security.xtext.securityAccess.ConflictResolutionTypes <em>Conflict Resolution Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Conflict Resolution Types</em>'.
   * @see mondo.collab.security.xtext.securityAccess.ConflictResolutionTypes
   * @generated
   */
  EEnum getConflictResolutionTypes();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SecurityAccessFactory getSecurityAccessFactory();

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
     * The meta object literal for the '{@link mondo.collab.security.xtext.securityAccess.impl.AccessControlModelImpl <em>Access Control Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mondo.collab.security.xtext.securityAccess.impl.AccessControlModelImpl
     * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getAccessControlModel()
     * @generated
     */
    EClass ACCESS_CONTROL_MODEL = eINSTANCE.getAccessControlModel();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCESS_CONTROL_MODEL__ROLES = eINSTANCE.getAccessControlModel_Roles();

    /**
     * The meta object literal for the '<em><b>Policy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCESS_CONTROL_MODEL__POLICY = eINSTANCE.getAccessControlModel_Policy();

    /**
     * The meta object literal for the '{@link mondo.collab.security.xtext.securityAccess.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mondo.collab.security.xtext.securityAccess.impl.RoleImpl
     * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

    /**
     * The meta object literal for the '{@link mondo.collab.security.xtext.securityAccess.impl.UserImpl <em>User</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mondo.collab.security.xtext.securityAccess.impl.UserImpl
     * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getUser()
     * @generated
     */
    EClass USER = eINSTANCE.getUser();

    /**
     * The meta object literal for the '{@link mondo.collab.security.xtext.securityAccess.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mondo.collab.security.xtext.securityAccess.impl.GroupImpl
     * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getGroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '<em><b>Users</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__USERS = eINSTANCE.getGroup_Users();

    /**
     * The meta object literal for the '{@link mondo.collab.security.xtext.securityAccess.impl.PolicyImpl <em>Policy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mondo.collab.security.xtext.securityAccess.impl.PolicyImpl
     * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getPolicy()
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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLICY__TYPE = eINSTANCE.getPolicy_Type();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__ROLES = eINSTANCE.getPolicy_Roles();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__IMPORTS = eINSTANCE.getPolicy_Imports();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLICY__RULES = eINSTANCE.getPolicy_Rules();

    /**
     * The meta object literal for the '{@link mondo.collab.security.xtext.securityAccess.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mondo.collab.security.xtext.securityAccess.impl.RuleImpl
     * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__NAME = eINSTANCE.getRule_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__TYPE = eINSTANCE.getRule_Type();

    /**
     * The meta object literal for the '<em><b>Rights</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__RIGHTS = eINSTANCE.getRule_Rights();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__PATTERN = eINSTANCE.getRule_Pattern();

    /**
     * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__BINDINGS = eINSTANCE.getRule_Bindings();

    /**
     * The meta object literal for the '{@link mondo.collab.security.xtext.securityAccess.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mondo.collab.security.xtext.securityAccess.impl.BindingImpl
     * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getBinding()
     * @generated
     */
    EClass BINDING = eINSTANCE.getBinding();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__PARAM = eINSTANCE.getBinding_Param();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__VALUE = eINSTANCE.getBinding_Value();

    /**
     * The meta object literal for the '{@link mondo.collab.security.xtext.securityAccess.impl.BindImpl <em>Bind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mondo.collab.security.xtext.securityAccess.impl.BindImpl
     * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getBind()
     * @generated
     */
    EClass BIND = eINSTANCE.getBind();

    /**
     * The meta object literal for the '{@link mondo.collab.security.xtext.securityAccess.impl.RoleBindImpl <em>Role Bind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mondo.collab.security.xtext.securityAccess.impl.RoleBindImpl
     * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getRoleBind()
     * @generated
     */
    EClass ROLE_BIND = eINSTANCE.getRoleBind();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_BIND__ROLE = eINSTANCE.getRoleBind_Role();

    /**
     * The meta object literal for the '{@link mondo.collab.security.xtext.securityAccess.impl.ValueBindImpl <em>Value Bind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mondo.collab.security.xtext.securityAccess.impl.ValueBindImpl
     * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getValueBind()
     * @generated
     */
    EClass VALUE_BIND = eINSTANCE.getValueBind();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_BIND__VALUE = eINSTANCE.getValueBind_Value();

    /**
     * The meta object literal for the '{@link mondo.collab.security.xtext.securityAccess.impl.ObjectBindImpl <em>Object Bind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mondo.collab.security.xtext.securityAccess.impl.ObjectBindImpl
     * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getObjectBind()
     * @generated
     */
    EClass OBJECT_BIND = eINSTANCE.getObjectBind();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_BIND__OBJECT = eINSTANCE.getObjectBind_Object();

    /**
     * The meta object literal for the '{@link mondo.collab.security.xtext.securityAccess.impl.ImportResourceImpl <em>Import Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mondo.collab.security.xtext.securityAccess.impl.ImportResourceImpl
     * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getImportResource()
     * @generated
     */
    EClass IMPORT_RESOURCE = eINSTANCE.getImportResource();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_RESOURCE__IMPORT_URI = eINSTANCE.getImportResource_ImportURI();

    /**
     * The meta object literal for the '{@link mondo.collab.security.xtext.securityAccess.RuleRights <em>Rule Rights</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mondo.collab.security.xtext.securityAccess.RuleRights
     * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getRuleRights()
     * @generated
     */
    EEnum RULE_RIGHTS = eINSTANCE.getRuleRights();

    /**
     * The meta object literal for the '{@link mondo.collab.security.xtext.securityAccess.RuleType <em>Rule Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mondo.collab.security.xtext.securityAccess.RuleType
     * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getRuleType()
     * @generated
     */
    EEnum RULE_TYPE = eINSTANCE.getRuleType();

    /**
     * The meta object literal for the '{@link mondo.collab.security.xtext.securityAccess.ConflictResolutionTypes <em>Conflict Resolution Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mondo.collab.security.xtext.securityAccess.ConflictResolutionTypes
     * @see mondo.collab.security.xtext.securityAccess.impl.SecurityAccessPackageImpl#getConflictResolutionTypes()
     * @generated
     */
    EEnum CONFLICT_RESOLUTION_TYPES = eINSTANCE.getConflictResolutionTypes();

  }

} //SecurityAccessPackage
