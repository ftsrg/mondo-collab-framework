/**
 */
package mondo.collab.security.xtext.securityAccess;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rule Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getRuleType()
 * @model
 * @generated
 */
public enum RuleType implements Enumerator
{
  /**
   * The '<em><b>Deny</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DENY_VALUE
   * @generated
   * @ordered
   */
  DENY(0, "Deny", "deny"),

  /**
   * The '<em><b>Permit</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PERMIT_VALUE
   * @generated
   * @ordered
   */
  PERMIT(1, "Permit", "permit"),

  /**
   * The '<em><b>Obfuscate</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OBFUSCATE_VALUE
   * @generated
   * @ordered
   */
  OBFUSCATE(2, "Obfuscate", "obfuscate");

  /**
   * The '<em><b>Deny</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Deny</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DENY
   * @model name="Deny" literal="deny"
   * @generated
   * @ordered
   */
  public static final int DENY_VALUE = 0;

  /**
   * The '<em><b>Permit</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Permit</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PERMIT
   * @model name="Permit" literal="permit"
   * @generated
   * @ordered
   */
  public static final int PERMIT_VALUE = 1;

  /**
   * The '<em><b>Obfuscate</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Obfuscate</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OBFUSCATE
   * @model name="Obfuscate" literal="obfuscate"
   * @generated
   * @ordered
   */
  public static final int OBFUSCATE_VALUE = 2;

  /**
   * An array of all the '<em><b>Rule Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RuleType[] VALUES_ARRAY =
    new RuleType[]
    {
      DENY,
      PERMIT,
      OBFUSCATE,
    };

  /**
   * A public read-only list of all the '<em><b>Rule Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RuleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Rule Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RuleType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RuleType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Rule Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RuleType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RuleType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Rule Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RuleType get(int value)
  {
    switch (value)
    {
      case DENY_VALUE: return DENY;
      case PERMIT_VALUE: return PERMIT;
      case OBFUSCATE_VALUE: return OBFUSCATE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private RuleType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //RuleType
