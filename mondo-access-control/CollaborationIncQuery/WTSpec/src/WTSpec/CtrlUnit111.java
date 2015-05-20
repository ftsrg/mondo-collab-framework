/**
 */
package WTSpec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ctrl Unit111</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WTSpec.CtrlUnit111#getInput__iOrder <em>Input iOrder</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit111#getTimer__tTimer <em>Timer tTimer</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit111#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see WTSpec.WTSpecPackage#getCtrlUnit111()
 * @model
 * @generated
 */
public interface CtrlUnit111 extends wtc {
	/**
	 * Returns the value of the '<em><b>Input iOrder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input iOrder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input iOrder</em>' reference.
	 * @see #setInput__iOrder(WTCInput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit111_Input__iOrder()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iOrder();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit111#getInput__iOrder <em>Input iOrder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iOrder</em>' reference.
	 * @see #getInput__iOrder()
	 * @generated
	 */
	void setInput__iOrder(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Timer tTimer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer tTimer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer tTimer</em>' reference.
	 * @see #setTimer__tTimer(WTCTimer)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit111_Timer__tTimer()
	 * @model
	 * @generated
	 */
	WTCTimer getTimer__tTimer();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit111#getTimer__tTimer <em>Timer tTimer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer tTimer</em>' reference.
	 * @see #getTimer__tTimer()
	 * @generated
	 */
	void setTimer__tTimer(WTCTimer value);

	/**
	 * Returns the value of the '<em><b>Bhv Param bp Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bhv Param bp Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bhv Param bp Mode</em>' attribute.
	 * @see #setBhvParam__bpMode(String)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit111_BhvParam__bpMode()
	 * @model
	 * @generated
	 */
	String getBhvParam__bpMode();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit111#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bhv Param bp Mode</em>' attribute.
	 * @see #getBhvParam__bpMode()
	 * @generated
	 */
	void setBhvParam__bpMode(String value);

} // CtrlUnit111
