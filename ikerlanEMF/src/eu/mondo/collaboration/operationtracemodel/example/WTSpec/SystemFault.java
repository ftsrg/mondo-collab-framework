/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Fault</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.SystemFault#getSysId <em>Sys Id</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.SystemFault#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage#getSystemFault()
 * @model
 * @generated
 */
public interface SystemFault extends WTCFault {
	/**
	 * Returns the value of the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sys Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys Id</em>' attribute.
	 * @see #setSysId(String)
	 * @see eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage#getSystemFault_SysId()
	 * @model
	 * @generated
	 */
	String getSysId();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.SystemFault#getSysId <em>Sys Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys Id</em>' attribute.
	 * @see #getSysId()
	 * @generated
	 */
	void setSysId(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage#getSystemFault_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.SystemFault#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // SystemFault
