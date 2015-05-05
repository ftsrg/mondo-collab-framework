/**
 */
package mondo.collab.security.xtext.securityAccess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.Rule#getName <em>Name</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.Rule#getType <em>Type</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.Rule#getRights <em>Rights</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.Rule#getPattern <em>Pattern</em>}</li>
 *   <li>{@link mondo.collab.security.xtext.securityAccess.Rule#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
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
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link mondo.collab.security.xtext.securityAccess.Rule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link mondo.collab.security.xtext.securityAccess.RuleType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see mondo.collab.security.xtext.securityAccess.RuleType
   * @see #setType(RuleType)
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getRule_Type()
   * @model
   * @generated
   */
  RuleType getType();

  /**
   * Sets the value of the '{@link mondo.collab.security.xtext.securityAccess.Rule#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see mondo.collab.security.xtext.securityAccess.RuleType
   * @see #getType()
   * @generated
   */
  void setType(RuleType value);

  /**
   * Returns the value of the '<em><b>Rights</b></em>' attribute.
   * The literals are from the enumeration {@link mondo.collab.security.xtext.securityAccess.RuleRights}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rights</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rights</em>' attribute.
   * @see mondo.collab.security.xtext.securityAccess.RuleRights
   * @see #setRights(RuleRights)
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getRule_Rights()
   * @model
   * @generated
   */
  RuleRights getRights();

  /**
   * Sets the value of the '{@link mondo.collab.security.xtext.securityAccess.Rule#getRights <em>Rights</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rights</em>' attribute.
   * @see mondo.collab.security.xtext.securityAccess.RuleRights
   * @see #getRights()
   * @generated
   */
  void setRights(RuleRights value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' reference.
   * @see #setPattern(Pattern)
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getRule_Pattern()
   * @model
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link mondo.collab.security.xtext.securityAccess.Rule#getPattern <em>Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

  /**
   * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
   * The list contents are of type {@link mondo.collab.security.xtext.securityAccess.Binding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bindings</em>' containment reference list.
   * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getRule_Bindings()
   * @model containment="true"
   * @generated
   */
  EList<Binding> getBindings();

} // Rule
