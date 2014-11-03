/**
 */
package WTSpec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ctrl Unit86</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WTSpec.CtrlUnit86#getInput__iPitchHwStandby <em>Input iPitch Hw Standby</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit86#getInput__iPitchHwFault <em>Input iPitch Hw Fault</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit86#getInput__iPitchStopCommand <em>Input iPitch Stop Command</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit86#getInput__iPitchBrakePosition <em>Input iPitch Brake Position</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit86#getOutput__oBrakes <em>Output oBrakes</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit86#getOutput__oPitchNormalOrder <em>Output oPitch Normal Order</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit86#getOutput__oPitchEmergencyOrder <em>Output oPitch Emergency Order</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit86#getOutput__oPitchTestUCapOrder <em>Output oPitch Test UCap Order</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit86#getErrorReaction__erEmergency <em>Error Reaction er Emergency</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit86#getErrorReaction__erSecurityLine <em>Error Reaction er Security Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see WTSpec.WTSpecPackage#getCtrlUnit86()
 * @model
 * @generated
 */
public interface CtrlUnit86 extends wtc {
	/**
	 * Returns the value of the '<em><b>Input iPitch Hw Standby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input iPitch Hw Standby</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input iPitch Hw Standby</em>' reference.
	 * @see #setInput__iPitchHwStandby(WTCInput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit86_Input__iPitchHwStandby()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iPitchHwStandby();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit86#getInput__iPitchHwStandby <em>Input iPitch Hw Standby</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iPitch Hw Standby</em>' reference.
	 * @see #getInput__iPitchHwStandby()
	 * @generated
	 */
	void setInput__iPitchHwStandby(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Input iPitch Hw Fault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input iPitch Hw Fault</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input iPitch Hw Fault</em>' reference.
	 * @see #setInput__iPitchHwFault(WTCInput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit86_Input__iPitchHwFault()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iPitchHwFault();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit86#getInput__iPitchHwFault <em>Input iPitch Hw Fault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iPitch Hw Fault</em>' reference.
	 * @see #getInput__iPitchHwFault()
	 * @generated
	 */
	void setInput__iPitchHwFault(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Input iPitch Stop Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input iPitch Stop Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input iPitch Stop Command</em>' reference.
	 * @see #setInput__iPitchStopCommand(WTCInput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit86_Input__iPitchStopCommand()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iPitchStopCommand();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit86#getInput__iPitchStopCommand <em>Input iPitch Stop Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iPitch Stop Command</em>' reference.
	 * @see #getInput__iPitchStopCommand()
	 * @generated
	 */
	void setInput__iPitchStopCommand(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Input iPitch Brake Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input iPitch Brake Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input iPitch Brake Position</em>' reference.
	 * @see #setInput__iPitchBrakePosition(WTCInput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit86_Input__iPitchBrakePosition()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iPitchBrakePosition();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit86#getInput__iPitchBrakePosition <em>Input iPitch Brake Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iPitch Brake Position</em>' reference.
	 * @see #getInput__iPitchBrakePosition()
	 * @generated
	 */
	void setInput__iPitchBrakePosition(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Output oBrakes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output oBrakes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output oBrakes</em>' reference.
	 * @see #setOutput__oBrakes(WTCOutput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit86_Output__oBrakes()
	 * @model
	 * @generated
	 */
	WTCOutput getOutput__oBrakes();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit86#getOutput__oBrakes <em>Output oBrakes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output oBrakes</em>' reference.
	 * @see #getOutput__oBrakes()
	 * @generated
	 */
	void setOutput__oBrakes(WTCOutput value);

	/**
	 * Returns the value of the '<em><b>Output oPitch Normal Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output oPitch Normal Order</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output oPitch Normal Order</em>' reference.
	 * @see #setOutput__oPitchNormalOrder(WTCOutput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit86_Output__oPitchNormalOrder()
	 * @model
	 * @generated
	 */
	WTCOutput getOutput__oPitchNormalOrder();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit86#getOutput__oPitchNormalOrder <em>Output oPitch Normal Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output oPitch Normal Order</em>' reference.
	 * @see #getOutput__oPitchNormalOrder()
	 * @generated
	 */
	void setOutput__oPitchNormalOrder(WTCOutput value);

	/**
	 * Returns the value of the '<em><b>Output oPitch Emergency Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output oPitch Emergency Order</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output oPitch Emergency Order</em>' reference.
	 * @see #setOutput__oPitchEmergencyOrder(WTCOutput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit86_Output__oPitchEmergencyOrder()
	 * @model
	 * @generated
	 */
	WTCOutput getOutput__oPitchEmergencyOrder();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit86#getOutput__oPitchEmergencyOrder <em>Output oPitch Emergency Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output oPitch Emergency Order</em>' reference.
	 * @see #getOutput__oPitchEmergencyOrder()
	 * @generated
	 */
	void setOutput__oPitchEmergencyOrder(WTCOutput value);

	/**
	 * Returns the value of the '<em><b>Output oPitch Test UCap Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output oPitch Test UCap Order</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output oPitch Test UCap Order</em>' reference.
	 * @see #setOutput__oPitchTestUCapOrder(WTCOutput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit86_Output__oPitchTestUCapOrder()
	 * @model
	 * @generated
	 */
	WTCOutput getOutput__oPitchTestUCapOrder();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit86#getOutput__oPitchTestUCapOrder <em>Output oPitch Test UCap Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output oPitch Test UCap Order</em>' reference.
	 * @see #getOutput__oPitchTestUCapOrder()
	 * @generated
	 */
	void setOutput__oPitchTestUCapOrder(WTCOutput value);

	/**
	 * Returns the value of the '<em><b>Error Reaction er Emergency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Reaction er Emergency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Reaction er Emergency</em>' reference.
	 * @see #setErrorReaction__erEmergency(WTCErrorReaction)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit86_ErrorReaction__erEmergency()
	 * @model
	 * @generated
	 */
	WTCErrorReaction getErrorReaction__erEmergency();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit86#getErrorReaction__erEmergency <em>Error Reaction er Emergency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Reaction er Emergency</em>' reference.
	 * @see #getErrorReaction__erEmergency()
	 * @generated
	 */
	void setErrorReaction__erEmergency(WTCErrorReaction value);

	/**
	 * Returns the value of the '<em><b>Error Reaction er Security Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Reaction er Security Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Reaction er Security Line</em>' reference.
	 * @see #setErrorReaction__erSecurityLine(WTCErrorReaction)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit86_ErrorReaction__erSecurityLine()
	 * @model
	 * @generated
	 */
	WTCErrorReaction getErrorReaction__erSecurityLine();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit86#getErrorReaction__erSecurityLine <em>Error Reaction er Security Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Reaction er Security Line</em>' reference.
	 * @see #getErrorReaction__erSecurityLine()
	 * @generated
	 */
	void setErrorReaction__erSecurityLine(WTCErrorReaction value);

} // CtrlUnit86
