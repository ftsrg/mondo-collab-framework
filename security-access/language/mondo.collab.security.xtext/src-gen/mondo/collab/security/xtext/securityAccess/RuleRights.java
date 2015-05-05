/**
 */
package mondo.collab.security.xtext.securityAccess;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rule Rights</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getRuleRights()
 * @model
 * @generated
 */
public enum RuleRights implements Enumerator
{
  /**
   * The '<em><b>Read</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #READ_VALUE
   * @generated
   * @ordered
   */
  READ(0, "Read", "R"),

  /**
   * The '<em><b>Write</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WRITE_VALUE
   * @generated
   * @ordered
   */
  WRITE(1, "Write", "W"),

  /**
   * The '<em><b>Read Write</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #READ_WRITE_VALUE
   * @generated
   * @ordered
   */
  READ_WRITE(2, "ReadWrite", "RW");

  /**
   * The '<em><b>Read</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Read</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #READ
   * @model name="Read" literal="R"
   * @generated
   * @ordered
   */
  public static final int READ_VALUE = 0;

  /**
   * The '<em><b>Write</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Write</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WRITE
   * @model name="Write" literal="W"
   * @generated
   * @ordered
   */
  public static final int WRITE_VALUE = 1;

  /**
   * The '<em><b>Read Write</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Read Write</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #READ_WRITE
   * @model name="ReadWrite" literal="RW"
   * @generated
   * @ordered
   */
  public static final int READ_WRITE_VALUE = 2;

  /**
   * An array of all the '<em><b>Rule Rights</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RuleRights[] VALUES_ARRAY =
    new RuleRights[]
    {
      READ,
      WRITE,
      READ_WRITE,
    };

  /**
   * A public read-only list of all the '<em><b>Rule Rights</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RuleRights> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Rule Rights</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RuleRights get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RuleRights result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Rule Rights</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RuleRights getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RuleRights result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Rule Rights</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RuleRights get(int value)
  {
    switch (value)
    {
      case READ_VALUE: return READ;
      case WRITE_VALUE: return WRITE;
      case READ_WRITE_VALUE: return READ_WRITE;
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
  private RuleRights(int value, String name, String literal)
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
  
} //RuleRights
