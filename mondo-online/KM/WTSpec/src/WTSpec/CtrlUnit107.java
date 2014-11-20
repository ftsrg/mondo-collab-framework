/**
 */
package WTSpec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ctrl Unit107</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WTSpec.CtrlUnit107#getFault__fDLLWarning <em>Fault fDLL Warning</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit107#getFault__fDLLError <em>Fault fDLL Error</em>}</li>
 * </ul>
 * </p>
 *
 * @see WTSpec.WTSpecPackage#getCtrlUnit107()
 * @model
 * @generated
 */
public interface CtrlUnit107 extends wtc {
	/**
	 * Returns the value of the '<em><b>Fault fDLL Warning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault fDLL Warning</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault fDLL Warning</em>' reference.
	 * @see #setFault__fDLLWarning(WTCFault)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit107_Fault__fDLLWarning()
	 * @model
	 * @generated
	 */
	WTCFault getFault__fDLLWarning();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit107#getFault__fDLLWarning <em>Fault fDLL Warning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault fDLL Warning</em>' reference.
	 * @see #getFault__fDLLWarning()
	 * @generated
	 */
	void setFault__fDLLWarning(WTCFault value);

	/**
	 * Returns the value of the '<em><b>Fault fDLL Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault fDLL Error</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault fDLL Error</em>' reference.
	 * @see #setFault__fDLLError(WTCFault)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit107_Fault__fDLLError()
	 * @model
	 * @generated
	 */
	WTCFault getFault__fDLLError();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit107#getFault__fDLLError <em>Fault fDLL Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault fDLL Error</em>' reference.
	 * @see #getFault__fDLLError()
	 * @generated
	 */
	void setFault__fDLLError(WTCFault value);

} // CtrlUnit107
