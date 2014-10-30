/**
 */
package WTSpec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ctrl Unit50</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WTSpec.CtrlUnit50#getOutput__oOutput <em>Output oOutput</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit50#getFault__fFault <em>Fault fFault</em>}</li>
 * </ul>
 * </p>
 *
 * @see WTSpec.WTSpecPackage#getCtrlUnit50()
 * @model
 * @generated
 */
public interface CtrlUnit50 extends wtc {
	/**
	 * Returns the value of the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output oOutput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output oOutput</em>' reference.
	 * @see #setOutput__oOutput(WTCOutput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit50_Output__oOutput()
	 * @model
	 * @generated
	 */
	WTCOutput getOutput__oOutput();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit50#getOutput__oOutput <em>Output oOutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output oOutput</em>' reference.
	 * @see #getOutput__oOutput()
	 * @generated
	 */
	void setOutput__oOutput(WTCOutput value);

	/**
	 * Returns the value of the '<em><b>Fault fFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault fFault</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault fFault</em>' reference.
	 * @see #setFault__fFault(WTCFault)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit50_Fault__fFault()
	 * @model
	 * @generated
	 */
	WTCFault getFault__fFault();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit50#getFault__fFault <em>Fault fFault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault fFault</em>' reference.
	 * @see #getFault__fFault()
	 * @generated
	 */
	void setFault__fFault(WTCFault value);

} // CtrlUnit50
