/**
 */
package WTSpec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ctrl Unit108</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WTSpec.CtrlUnit108#getInput__iVoltageDrop <em>Input iVoltage Drop</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit108#getFault__fVoltageDrop <em>Fault fVoltage Drop</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit108#getTimer__tAutoReset <em>Timer tAuto Reset</em>}</li>
 * </ul>
 * </p>
 *
 * @see WTSpec.WTSpecPackage#getCtrlUnit108()
 * @model
 * @generated
 */
public interface CtrlUnit108 extends wtc {
	/**
	 * Returns the value of the '<em><b>Input iVoltage Drop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input iVoltage Drop</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input iVoltage Drop</em>' reference.
	 * @see #setInput__iVoltageDrop(WTCInput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit108_Input__iVoltageDrop()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iVoltageDrop();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit108#getInput__iVoltageDrop <em>Input iVoltage Drop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iVoltage Drop</em>' reference.
	 * @see #getInput__iVoltageDrop()
	 * @generated
	 */
	void setInput__iVoltageDrop(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Fault fVoltage Drop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault fVoltage Drop</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault fVoltage Drop</em>' reference.
	 * @see #setFault__fVoltageDrop(WTCFault)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit108_Fault__fVoltageDrop()
	 * @model
	 * @generated
	 */
	WTCFault getFault__fVoltageDrop();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit108#getFault__fVoltageDrop <em>Fault fVoltage Drop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault fVoltage Drop</em>' reference.
	 * @see #getFault__fVoltageDrop()
	 * @generated
	 */
	void setFault__fVoltageDrop(WTCFault value);

	/**
	 * Returns the value of the '<em><b>Timer tAuto Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer tAuto Reset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer tAuto Reset</em>' reference.
	 * @see #setTimer__tAutoReset(WTCTimer)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit108_Timer__tAutoReset()
	 * @model
	 * @generated
	 */
	WTCTimer getTimer__tAutoReset();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit108#getTimer__tAutoReset <em>Timer tAuto Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer tAuto Reset</em>' reference.
	 * @see #getTimer__tAutoReset()
	 * @generated
	 */
	void setTimer__tAutoReset(WTCTimer value);

} // CtrlUnit108
