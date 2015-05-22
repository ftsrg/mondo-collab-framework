/**
 */
package hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy#getPermission <em>Permission</em>}</li>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy#getQuery <em>Query</em>}</li>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyPackage#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends Elements
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyPackage#getPolicy_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Permission</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Permission</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Permission</em>' attribute.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType
   * @see #setPermission(PermissionType)
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyPackage#getPolicy_Permission()
   * @model
   * @generated
   */
  PermissionType getPermission();

  /**
   * Sets the value of the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy#getPermission <em>Permission</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Permission</em>' attribute.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType
   * @see #getPermission()
   * @generated
   */
  void setPermission(PermissionType value);

  /**
   * Returns the value of the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' attribute.
   * @see #setQuery(String)
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyPackage#getPolicy_Query()
   * @model
   * @generated
   */
  String getQuery();

  /**
   * Sets the value of the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy#getQuery <em>Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' attribute.
   * @see #getQuery()
   * @generated
   */
  void setQuery(String value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' attribute.
   * @see #setPattern(String)
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyPackage#getPolicy_Pattern()
   * @model
   * @generated
   */
  String getPattern();

  /**
   * Sets the value of the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy#getPattern <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' attribute.
   * @see #getPattern()
   * @generated
   */
  void setPattern(String value);

} // Policy
