/**
 */
package mondo.collab.security.xtext.securityAccess;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage
 * @generated
 */
public interface SecurityAccessFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SecurityAccessFactory eINSTANCE = mondo.collab.security.xtext.securityAccess.impl.SecurityAccessFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Access Control Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Access Control Model</em>'.
   * @generated
   */
  AccessControlModel createAccessControlModel();

  /**
   * Returns a new object of class '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role</em>'.
   * @generated
   */
  Role createRole();

  /**
   * Returns a new object of class '<em>User</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User</em>'.
   * @generated
   */
  User createUser();

  /**
   * Returns a new object of class '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group</em>'.
   * @generated
   */
  Group createGroup();

  /**
   * Returns a new object of class '<em>Policy</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Policy</em>'.
   * @generated
   */
  Policy createPolicy();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding</em>'.
   * @generated
   */
  Binding createBinding();

  /**
   * Returns a new object of class '<em>Bind</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bind</em>'.
   * @generated
   */
  Bind createBind();

  /**
   * Returns a new object of class '<em>Role Bind</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role Bind</em>'.
   * @generated
   */
  RoleBind createRoleBind();

  /**
   * Returns a new object of class '<em>Value Bind</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Bind</em>'.
   * @generated
   */
  ValueBind createValueBind();

  /**
   * Returns a new object of class '<em>Object Bind</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Bind</em>'.
   * @generated
   */
  ObjectBind createObjectBind();

  /**
   * Returns a new object of class '<em>Import Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Resource</em>'.
   * @generated
   */
  ImportResource createImportResource();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SecurityAccessPackage getSecurityAccessPackage();

} //SecurityAccessFactory
