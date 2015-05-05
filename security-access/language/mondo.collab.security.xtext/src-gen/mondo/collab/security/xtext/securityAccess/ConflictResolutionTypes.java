/**
 */
package mondo.collab.security.xtext.securityAccess;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Conflict Resolution Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mondo.collab.security.xtext.securityAccess.SecurityAccessPackage#getConflictResolutionTypes()
 * @model
 * @generated
 */
public enum ConflictResolutionTypes implements Enumerator
{
  /**
   * The '<em><b>Deny Overrides</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DENY_OVERRIDES_VALUE
   * @generated
   * @ordered
   */
  DENY_OVERRIDES(0, "DenyOverrides", "deny-overrides"),

  /**
   * The '<em><b>Permit Overrides</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PERMIT_OVERRIDES_VALUE
   * @generated
   * @ordered
   */
  PERMIT_OVERRIDES(1, "PermitOverrides", "permit-overrides"),

  /**
   * The '<em><b>First Applicable</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIRST_APPLICABLE_VALUE
   * @generated
   * @ordered
   */
  FIRST_APPLICABLE(2, "FirstApplicable", "first-applicable"),

  /**
   * The '<em><b>Only One Applicable Policy</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONLY_ONE_APPLICABLE_POLICY_VALUE
   * @generated
   * @ordered
   */
  ONLY_ONE_APPLICABLE_POLICY(3, "OnlyOneApplicablePolicy", "only-one-applicable-policy"),

  /**
   * The '<em><b>Ordered Deny Overrides</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ORDERED_DENY_OVERRIDES_VALUE
   * @generated
   * @ordered
   */
  ORDERED_DENY_OVERRIDES(4, "OrderedDenyOverrides", "ordered-deny-overrides"),

  /**
   * The '<em><b>Ordered Permit Overrides</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ORDERED_PERMIT_OVERRIDES_VALUE
   * @generated
   * @ordered
   */
  ORDERED_PERMIT_OVERRIDES(5, "OrderedPermitOverrides", "ordered-permit-overrides"),

  /**
   * The '<em><b>Deny Unless Permit</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DENY_UNLESS_PERMIT_VALUE
   * @generated
   * @ordered
   */
  DENY_UNLESS_PERMIT(6, "DenyUnlessPermit", "deny-unless-permit"),

  /**
   * The '<em><b>Permit Unless Deny</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PERMIT_UNLESS_DENY_VALUE
   * @generated
   * @ordered
   */
  PERMIT_UNLESS_DENY(7, "PermitUnlessDeny", "permit-unless-permit");

  /**
   * The '<em><b>Deny Overrides</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Deny Overrides</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DENY_OVERRIDES
   * @model name="DenyOverrides" literal="deny-overrides"
   * @generated
   * @ordered
   */
  public static final int DENY_OVERRIDES_VALUE = 0;

  /**
   * The '<em><b>Permit Overrides</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Permit Overrides</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PERMIT_OVERRIDES
   * @model name="PermitOverrides" literal="permit-overrides"
   * @generated
   * @ordered
   */
  public static final int PERMIT_OVERRIDES_VALUE = 1;

  /**
   * The '<em><b>First Applicable</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>First Applicable</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FIRST_APPLICABLE
   * @model name="FirstApplicable" literal="first-applicable"
   * @generated
   * @ordered
   */
  public static final int FIRST_APPLICABLE_VALUE = 2;

  /**
   * The '<em><b>Only One Applicable Policy</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Only One Applicable Policy</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONLY_ONE_APPLICABLE_POLICY
   * @model name="OnlyOneApplicablePolicy" literal="only-one-applicable-policy"
   * @generated
   * @ordered
   */
  public static final int ONLY_ONE_APPLICABLE_POLICY_VALUE = 3;

  /**
   * The '<em><b>Ordered Deny Overrides</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ordered Deny Overrides</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ORDERED_DENY_OVERRIDES
   * @model name="OrderedDenyOverrides" literal="ordered-deny-overrides"
   * @generated
   * @ordered
   */
  public static final int ORDERED_DENY_OVERRIDES_VALUE = 4;

  /**
   * The '<em><b>Ordered Permit Overrides</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ordered Permit Overrides</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ORDERED_PERMIT_OVERRIDES
   * @model name="OrderedPermitOverrides" literal="ordered-permit-overrides"
   * @generated
   * @ordered
   */
  public static final int ORDERED_PERMIT_OVERRIDES_VALUE = 5;

  /**
   * The '<em><b>Deny Unless Permit</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Deny Unless Permit</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DENY_UNLESS_PERMIT
   * @model name="DenyUnlessPermit" literal="deny-unless-permit"
   * @generated
   * @ordered
   */
  public static final int DENY_UNLESS_PERMIT_VALUE = 6;

  /**
   * The '<em><b>Permit Unless Deny</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Permit Unless Deny</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PERMIT_UNLESS_DENY
   * @model name="PermitUnlessDeny" literal="permit-unless-permit"
   * @generated
   * @ordered
   */
  public static final int PERMIT_UNLESS_DENY_VALUE = 7;

  /**
   * An array of all the '<em><b>Conflict Resolution Types</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ConflictResolutionTypes[] VALUES_ARRAY =
    new ConflictResolutionTypes[]
    {
      DENY_OVERRIDES,
      PERMIT_OVERRIDES,
      FIRST_APPLICABLE,
      ONLY_ONE_APPLICABLE_POLICY,
      ORDERED_DENY_OVERRIDES,
      ORDERED_PERMIT_OVERRIDES,
      DENY_UNLESS_PERMIT,
      PERMIT_UNLESS_DENY,
    };

  /**
   * A public read-only list of all the '<em><b>Conflict Resolution Types</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ConflictResolutionTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Conflict Resolution Types</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConflictResolutionTypes get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ConflictResolutionTypes result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Conflict Resolution Types</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConflictResolutionTypes getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ConflictResolutionTypes result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Conflict Resolution Types</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConflictResolutionTypes get(int value)
  {
    switch (value)
    {
      case DENY_OVERRIDES_VALUE: return DENY_OVERRIDES;
      case PERMIT_OVERRIDES_VALUE: return PERMIT_OVERRIDES;
      case FIRST_APPLICABLE_VALUE: return FIRST_APPLICABLE;
      case ONLY_ONE_APPLICABLE_POLICY_VALUE: return ONLY_ONE_APPLICABLE_POLICY;
      case ORDERED_DENY_OVERRIDES_VALUE: return ORDERED_DENY_OVERRIDES;
      case ORDERED_PERMIT_OVERRIDES_VALUE: return ORDERED_PERMIT_OVERRIDES;
      case DENY_UNLESS_PERMIT_VALUE: return DENY_UNLESS_PERMIT;
      case PERMIT_UNLESS_DENY_VALUE: return PERMIT_UNLESS_DENY;
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
  private ConflictResolutionTypes(int value, String name, String literal)
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
  
} //ConflictResolutionTypes
