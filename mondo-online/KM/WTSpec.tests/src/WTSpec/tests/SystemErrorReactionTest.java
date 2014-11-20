/**
 */
package WTSpec.tests;

import WTSpec.SystemErrorReaction;
import WTSpec.WTSpecFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System Error Reaction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemErrorReactionTest extends WTCErrorReactionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemErrorReactionTest.class);
	}

	/**
	 * Constructs a new System Error Reaction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemErrorReactionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this System Error Reaction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SystemErrorReaction getFixture() {
		return (SystemErrorReaction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WTSpecFactory.eINSTANCE.createSystemErrorReaction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SystemErrorReactionTest
