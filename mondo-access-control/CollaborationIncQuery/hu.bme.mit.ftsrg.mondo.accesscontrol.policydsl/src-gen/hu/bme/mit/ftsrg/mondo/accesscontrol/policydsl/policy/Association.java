/**
 */
package hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getTeszt <em>Teszt</em>}</li>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getDefaultPermission <em>Default Permission</em>}</li>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getOverride <em>Override</em>}</li>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getTarget_id <em>Target id</em>}</li>
 *   <li>{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getPolicies <em>Policies</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Elements
{
  /**
   * Returns the value of the '<em><b>Teszt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Teszt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Teszt</em>' attribute.
   * @see #setTeszt(String)
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyPackage#getAssociation_Teszt()
   * @model
   * @generated
   */
  String getTeszt();

  /**
   * Sets the value of the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getTeszt <em>Teszt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Teszt</em>' attribute.
   * @see #getTeszt()
   * @generated
   */
  void setTeszt(String value);

  /**
   * Returns the value of the '<em><b>Default Permission</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Permission</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Permission</em>' attribute.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType
   * @see #setDefaultPermission(PermissionType)
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyPackage#getAssociation_DefaultPermission()
   * @model
   * @generated
   */
  PermissionType getDefaultPermission();

  /**
   * Sets the value of the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getDefaultPermission <em>Default Permission</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Permission</em>' attribute.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType
   * @see #getDefaultPermission()
   * @generated
   */
  void setDefaultPermission(PermissionType value);

  /**
   * Returns the value of the '<em><b>Override</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Override</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Override</em>' attribute.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType
   * @see #setOverride(PermissionType)
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyPackage#getAssociation_Override()
   * @model
   * @generated
   */
  PermissionType getOverride();

  /**
   * Sets the value of the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getOverride <em>Override</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Override</em>' attribute.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PermissionType
   * @see #getOverride()
   * @generated
   */
  void setOverride(PermissionType value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * The literals are from the enumeration {@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.TargetType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.TargetType
   * @see #setTarget(TargetType)
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyPackage#getAssociation_Target()
   * @model
   * @generated
   */
  TargetType getTarget();

  /**
   * Sets the value of the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.TargetType
   * @see #getTarget()
   * @generated
   */
  void setTarget(TargetType value);

  /**
   * Returns the value of the '<em><b>Target id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target id</em>' attribute.
   * @see #setTarget_id(String)
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyPackage#getAssociation_Target_id()
   * @model
   * @generated
   */
  String getTarget_id();

  /**
   * Sets the value of the '{@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Association#getTarget_id <em>Target id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target id</em>' attribute.
   * @see #getTarget_id()
   * @generated
   */
  void setTarget_id(String value);

  /**
   * Returns the value of the '<em><b>Policies</b></em>' reference list.
   * The list contents are of type {@link hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.Policy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Policies</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policies</em>' reference list.
   * @see hu.bme.mit.ftsrg.mondo.accesscontrol.policydsl.policy.PolicyPackage#getAssociation_Policies()
   * @model
   * @generated
   */
  EList<Policy> getPolicies();

} // Association
