/**
 */
package WTSpec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ctrl Unit60</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WTSpec.CtrlUnit60#getInput__iDisconnect <em>Input iDisconnect</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit60#getInput__iStopCommand <em>Input iStop Command</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit60#getInput__iPitchBraked <em>Input iPitch Braked</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit60#getInput__iInverterRpm <em>Input iInverter Rpm</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit60#getInput__iReadyForOn <em>Input iReady For On</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit60#getInput__iReadyForRun <em>Input iReady For Run</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit60#getInput__iReadyForRef <em>Input iReady For Ref</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit60#getInput__iResetOrder <em>Input iReset Order</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit60#getInput__iForceInvOff <em>Input iForce Inv Off</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit60#getInput__iSafetyInput <em>Input iSafety Input</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit60#getOutput__oInverterRun <em>Output oInverter Run</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit60#getOutput__oInverterToOn <em>Output oInverter To On</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit60#getParameter__pInverterConnSpeed <em>Parameter pInverter Conn Speed</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit60#getParameter__pInverterConnSpeedHysteresis <em>Parameter pInverter Conn Speed Hysteresis</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit60#getFault__fReconnectWarning <em>Fault fReconnect Warning</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit60#getFault__fReadyRefWarning <em>Fault fReady Ref Warning</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit60#getTimer__tConnection <em>Timer tConnection</em>}</li>
 *   <li>{@link WTSpec.CtrlUnit60#getTimer__tRunningDelay <em>Timer tRunning Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see WTSpec.WTSpecPackage#getCtrlUnit60()
 * @model
 * @generated
 */
public interface CtrlUnit60 extends wtc {
	/**
	 * Returns the value of the '<em><b>Input iDisconnect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input iDisconnect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input iDisconnect</em>' reference.
	 * @see #setInput__iDisconnect(WTCInput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Input__iDisconnect()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iDisconnect();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getInput__iDisconnect <em>Input iDisconnect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iDisconnect</em>' reference.
	 * @see #getInput__iDisconnect()
	 * @generated
	 */
	void setInput__iDisconnect(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Input iStop Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input iStop Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input iStop Command</em>' reference.
	 * @see #setInput__iStopCommand(WTCInput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Input__iStopCommand()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iStopCommand();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getInput__iStopCommand <em>Input iStop Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iStop Command</em>' reference.
	 * @see #getInput__iStopCommand()
	 * @generated
	 */
	void setInput__iStopCommand(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Input iPitch Braked</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input iPitch Braked</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input iPitch Braked</em>' reference.
	 * @see #setInput__iPitchBraked(WTCInput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Input__iPitchBraked()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iPitchBraked();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getInput__iPitchBraked <em>Input iPitch Braked</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iPitch Braked</em>' reference.
	 * @see #getInput__iPitchBraked()
	 * @generated
	 */
	void setInput__iPitchBraked(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Input iInverter Rpm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input iInverter Rpm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input iInverter Rpm</em>' reference.
	 * @see #setInput__iInverterRpm(WTCInput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Input__iInverterRpm()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iInverterRpm();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getInput__iInverterRpm <em>Input iInverter Rpm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iInverter Rpm</em>' reference.
	 * @see #getInput__iInverterRpm()
	 * @generated
	 */
	void setInput__iInverterRpm(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Input iReady For On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input iReady For On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input iReady For On</em>' reference.
	 * @see #setInput__iReadyForOn(WTCInput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Input__iReadyForOn()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iReadyForOn();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getInput__iReadyForOn <em>Input iReady For On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iReady For On</em>' reference.
	 * @see #getInput__iReadyForOn()
	 * @generated
	 */
	void setInput__iReadyForOn(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Input iReady For Run</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input iReady For Run</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input iReady For Run</em>' reference.
	 * @see #setInput__iReadyForRun(WTCInput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Input__iReadyForRun()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iReadyForRun();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getInput__iReadyForRun <em>Input iReady For Run</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iReady For Run</em>' reference.
	 * @see #getInput__iReadyForRun()
	 * @generated
	 */
	void setInput__iReadyForRun(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Input iReady For Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input iReady For Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input iReady For Ref</em>' reference.
	 * @see #setInput__iReadyForRef(WTCInput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Input__iReadyForRef()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iReadyForRef();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getInput__iReadyForRef <em>Input iReady For Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iReady For Ref</em>' reference.
	 * @see #getInput__iReadyForRef()
	 * @generated
	 */
	void setInput__iReadyForRef(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Input iReset Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input iReset Order</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input iReset Order</em>' reference.
	 * @see #setInput__iResetOrder(WTCInput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Input__iResetOrder()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iResetOrder();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getInput__iResetOrder <em>Input iReset Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iReset Order</em>' reference.
	 * @see #getInput__iResetOrder()
	 * @generated
	 */
	void setInput__iResetOrder(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Input iForce Inv Off</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input iForce Inv Off</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input iForce Inv Off</em>' reference.
	 * @see #setInput__iForceInvOff(WTCInput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Input__iForceInvOff()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iForceInvOff();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getInput__iForceInvOff <em>Input iForce Inv Off</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iForce Inv Off</em>' reference.
	 * @see #getInput__iForceInvOff()
	 * @generated
	 */
	void setInput__iForceInvOff(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Input iSafety Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input iSafety Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input iSafety Input</em>' reference.
	 * @see #setInput__iSafetyInput(WTCInput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Input__iSafetyInput()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iSafetyInput();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getInput__iSafetyInput <em>Input iSafety Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iSafety Input</em>' reference.
	 * @see #getInput__iSafetyInput()
	 * @generated
	 */
	void setInput__iSafetyInput(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Output oInverter Run</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output oInverter Run</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output oInverter Run</em>' reference.
	 * @see #setOutput__oInverterRun(WTCOutput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Output__oInverterRun()
	 * @model
	 * @generated
	 */
	WTCOutput getOutput__oInverterRun();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getOutput__oInverterRun <em>Output oInverter Run</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output oInverter Run</em>' reference.
	 * @see #getOutput__oInverterRun()
	 * @generated
	 */
	void setOutput__oInverterRun(WTCOutput value);

	/**
	 * Returns the value of the '<em><b>Output oInverter To On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output oInverter To On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output oInverter To On</em>' reference.
	 * @see #setOutput__oInverterToOn(WTCOutput)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Output__oInverterToOn()
	 * @model
	 * @generated
	 */
	WTCOutput getOutput__oInverterToOn();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getOutput__oInverterToOn <em>Output oInverter To On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output oInverter To On</em>' reference.
	 * @see #getOutput__oInverterToOn()
	 * @generated
	 */
	void setOutput__oInverterToOn(WTCOutput value);

	/**
	 * Returns the value of the '<em><b>Parameter pInverter Conn Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter pInverter Conn Speed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter pInverter Conn Speed</em>' reference.
	 * @see #setParameter__pInverterConnSpeed(WTCParam)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Parameter__pInverterConnSpeed()
	 * @model
	 * @generated
	 */
	WTCParam getParameter__pInverterConnSpeed();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getParameter__pInverterConnSpeed <em>Parameter pInverter Conn Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter pInverter Conn Speed</em>' reference.
	 * @see #getParameter__pInverterConnSpeed()
	 * @generated
	 */
	void setParameter__pInverterConnSpeed(WTCParam value);

	/**
	 * Returns the value of the '<em><b>Parameter pInverter Conn Speed Hysteresis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter pInverter Conn Speed Hysteresis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter pInverter Conn Speed Hysteresis</em>' reference.
	 * @see #setParameter__pInverterConnSpeedHysteresis(WTCParam)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Parameter__pInverterConnSpeedHysteresis()
	 * @model
	 * @generated
	 */
	WTCParam getParameter__pInverterConnSpeedHysteresis();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getParameter__pInverterConnSpeedHysteresis <em>Parameter pInverter Conn Speed Hysteresis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter pInverter Conn Speed Hysteresis</em>' reference.
	 * @see #getParameter__pInverterConnSpeedHysteresis()
	 * @generated
	 */
	void setParameter__pInverterConnSpeedHysteresis(WTCParam value);

	/**
	 * Returns the value of the '<em><b>Fault fReconnect Warning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault fReconnect Warning</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault fReconnect Warning</em>' reference.
	 * @see #setFault__fReconnectWarning(WTCFault)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Fault__fReconnectWarning()
	 * @model
	 * @generated
	 */
	WTCFault getFault__fReconnectWarning();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getFault__fReconnectWarning <em>Fault fReconnect Warning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault fReconnect Warning</em>' reference.
	 * @see #getFault__fReconnectWarning()
	 * @generated
	 */
	void setFault__fReconnectWarning(WTCFault value);

	/**
	 * Returns the value of the '<em><b>Fault fReady Ref Warning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault fReady Ref Warning</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault fReady Ref Warning</em>' reference.
	 * @see #setFault__fReadyRefWarning(WTCFault)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Fault__fReadyRefWarning()
	 * @model
	 * @generated
	 */
	WTCFault getFault__fReadyRefWarning();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getFault__fReadyRefWarning <em>Fault fReady Ref Warning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault fReady Ref Warning</em>' reference.
	 * @see #getFault__fReadyRefWarning()
	 * @generated
	 */
	void setFault__fReadyRefWarning(WTCFault value);

	/**
	 * Returns the value of the '<em><b>Timer tConnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer tConnection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer tConnection</em>' reference.
	 * @see #setTimer__tConnection(WTCTimer)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Timer__tConnection()
	 * @model
	 * @generated
	 */
	WTCTimer getTimer__tConnection();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getTimer__tConnection <em>Timer tConnection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer tConnection</em>' reference.
	 * @see #getTimer__tConnection()
	 * @generated
	 */
	void setTimer__tConnection(WTCTimer value);

	/**
	 * Returns the value of the '<em><b>Timer tRunning Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer tRunning Delay</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer tRunning Delay</em>' reference.
	 * @see #setTimer__tRunningDelay(WTCTimer)
	 * @see WTSpec.WTSpecPackage#getCtrlUnit60_Timer__tRunningDelay()
	 * @model
	 * @generated
	 */
	WTCTimer getTimer__tRunningDelay();

	/**
	 * Sets the value of the '{@link WTSpec.CtrlUnit60#getTimer__tRunningDelay <em>Timer tRunning Delay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer tRunning Delay</em>' reference.
	 * @see #getTimer__tRunningDelay()
	 * @generated
	 */
	void setTimer__tRunningDelay(WTCTimer value);

} // CtrlUnit60
