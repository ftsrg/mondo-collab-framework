/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit110;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit110</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit110Impl#getInput__iManualStopRequest <em>Input iManual Stop Request</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit110Impl#getInput__iRemoteStopRequest <em>Input iRemote Stop Request</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit110Impl#getInput__iManualStartRequest <em>Input iManual Start Request</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit110Impl#getInput__iRemoteStartRequest <em>Input iRemote Start Request</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit110Impl#getInput__iStopped <em>Input iStopped</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit110Impl#getOutput__oMachineStopOrder <em>Output oMachine Stop Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit110Impl extends wtcImpl implements CtrlUnit110 {
	/**
	 * The cached value of the '{@link #getInput__iManualStopRequest() <em>Input iManual Stop Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iManualStopRequest()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iManualStopRequest;

	/**
	 * The cached value of the '{@link #getInput__iRemoteStopRequest() <em>Input iRemote Stop Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iRemoteStopRequest()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iRemoteStopRequest;

	/**
	 * The cached value of the '{@link #getInput__iManualStartRequest() <em>Input iManual Start Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iManualStartRequest()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iManualStartRequest;

	/**
	 * The cached value of the '{@link #getInput__iRemoteStartRequest() <em>Input iRemote Start Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iRemoteStartRequest()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iRemoteStartRequest;

	/**
	 * The cached value of the '{@link #getInput__iStopped() <em>Input iStopped</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iStopped()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iStopped;

	/**
	 * The cached value of the '{@link #getOutput__oMachineStopOrder() <em>Output oMachine Stop Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oMachineStopOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oMachineStopOrder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit110Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT110;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iManualStopRequest() {
		if (input__iManualStopRequest != null && input__iManualStopRequest.eIsProxy()) {
			InternalEObject oldInput__iManualStopRequest = (InternalEObject)input__iManualStopRequest;
			input__iManualStopRequest = (WTCInput)eResolveProxy(oldInput__iManualStopRequest);
			if (input__iManualStopRequest != oldInput__iManualStopRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT110__INPUT_IMANUAL_STOP_REQUEST, oldInput__iManualStopRequest, input__iManualStopRequest));
			}
		}
		return input__iManualStopRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iManualStopRequest() {
		return input__iManualStopRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iManualStopRequest(WTCInput newInput__iManualStopRequest) {
		WTCInput oldInput__iManualStopRequest = input__iManualStopRequest;
		input__iManualStopRequest = newInput__iManualStopRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT110__INPUT_IMANUAL_STOP_REQUEST, oldInput__iManualStopRequest, input__iManualStopRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iRemoteStopRequest() {
		if (input__iRemoteStopRequest != null && input__iRemoteStopRequest.eIsProxy()) {
			InternalEObject oldInput__iRemoteStopRequest = (InternalEObject)input__iRemoteStopRequest;
			input__iRemoteStopRequest = (WTCInput)eResolveProxy(oldInput__iRemoteStopRequest);
			if (input__iRemoteStopRequest != oldInput__iRemoteStopRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT110__INPUT_IREMOTE_STOP_REQUEST, oldInput__iRemoteStopRequest, input__iRemoteStopRequest));
			}
		}
		return input__iRemoteStopRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iRemoteStopRequest() {
		return input__iRemoteStopRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iRemoteStopRequest(WTCInput newInput__iRemoteStopRequest) {
		WTCInput oldInput__iRemoteStopRequest = input__iRemoteStopRequest;
		input__iRemoteStopRequest = newInput__iRemoteStopRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT110__INPUT_IREMOTE_STOP_REQUEST, oldInput__iRemoteStopRequest, input__iRemoteStopRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iManualStartRequest() {
		if (input__iManualStartRequest != null && input__iManualStartRequest.eIsProxy()) {
			InternalEObject oldInput__iManualStartRequest = (InternalEObject)input__iManualStartRequest;
			input__iManualStartRequest = (WTCInput)eResolveProxy(oldInput__iManualStartRequest);
			if (input__iManualStartRequest != oldInput__iManualStartRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT110__INPUT_IMANUAL_START_REQUEST, oldInput__iManualStartRequest, input__iManualStartRequest));
			}
		}
		return input__iManualStartRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iManualStartRequest() {
		return input__iManualStartRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iManualStartRequest(WTCInput newInput__iManualStartRequest) {
		WTCInput oldInput__iManualStartRequest = input__iManualStartRequest;
		input__iManualStartRequest = newInput__iManualStartRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT110__INPUT_IMANUAL_START_REQUEST, oldInput__iManualStartRequest, input__iManualStartRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iRemoteStartRequest() {
		if (input__iRemoteStartRequest != null && input__iRemoteStartRequest.eIsProxy()) {
			InternalEObject oldInput__iRemoteStartRequest = (InternalEObject)input__iRemoteStartRequest;
			input__iRemoteStartRequest = (WTCInput)eResolveProxy(oldInput__iRemoteStartRequest);
			if (input__iRemoteStartRequest != oldInput__iRemoteStartRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT110__INPUT_IREMOTE_START_REQUEST, oldInput__iRemoteStartRequest, input__iRemoteStartRequest));
			}
		}
		return input__iRemoteStartRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iRemoteStartRequest() {
		return input__iRemoteStartRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iRemoteStartRequest(WTCInput newInput__iRemoteStartRequest) {
		WTCInput oldInput__iRemoteStartRequest = input__iRemoteStartRequest;
		input__iRemoteStartRequest = newInput__iRemoteStartRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT110__INPUT_IREMOTE_START_REQUEST, oldInput__iRemoteStartRequest, input__iRemoteStartRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iStopped() {
		if (input__iStopped != null && input__iStopped.eIsProxy()) {
			InternalEObject oldInput__iStopped = (InternalEObject)input__iStopped;
			input__iStopped = (WTCInput)eResolveProxy(oldInput__iStopped);
			if (input__iStopped != oldInput__iStopped) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT110__INPUT_ISTOPPED, oldInput__iStopped, input__iStopped));
			}
		}
		return input__iStopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iStopped() {
		return input__iStopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iStopped(WTCInput newInput__iStopped) {
		WTCInput oldInput__iStopped = input__iStopped;
		input__iStopped = newInput__iStopped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT110__INPUT_ISTOPPED, oldInput__iStopped, input__iStopped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oMachineStopOrder() {
		if (output__oMachineStopOrder != null && output__oMachineStopOrder.eIsProxy()) {
			InternalEObject oldOutput__oMachineStopOrder = (InternalEObject)output__oMachineStopOrder;
			output__oMachineStopOrder = (WTCOutput)eResolveProxy(oldOutput__oMachineStopOrder);
			if (output__oMachineStopOrder != oldOutput__oMachineStopOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT110__OUTPUT_OMACHINE_STOP_ORDER, oldOutput__oMachineStopOrder, output__oMachineStopOrder));
			}
		}
		return output__oMachineStopOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oMachineStopOrder() {
		return output__oMachineStopOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oMachineStopOrder(WTCOutput newOutput__oMachineStopOrder) {
		WTCOutput oldOutput__oMachineStopOrder = output__oMachineStopOrder;
		output__oMachineStopOrder = newOutput__oMachineStopOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT110__OUTPUT_OMACHINE_STOP_ORDER, oldOutput__oMachineStopOrder, output__oMachineStopOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT110__INPUT_IMANUAL_STOP_REQUEST:
				if (resolve) return getInput__iManualStopRequest();
				return basicGetInput__iManualStopRequest();
			case WTSpecPackage.CTRL_UNIT110__INPUT_IREMOTE_STOP_REQUEST:
				if (resolve) return getInput__iRemoteStopRequest();
				return basicGetInput__iRemoteStopRequest();
			case WTSpecPackage.CTRL_UNIT110__INPUT_IMANUAL_START_REQUEST:
				if (resolve) return getInput__iManualStartRequest();
				return basicGetInput__iManualStartRequest();
			case WTSpecPackage.CTRL_UNIT110__INPUT_IREMOTE_START_REQUEST:
				if (resolve) return getInput__iRemoteStartRequest();
				return basicGetInput__iRemoteStartRequest();
			case WTSpecPackage.CTRL_UNIT110__INPUT_ISTOPPED:
				if (resolve) return getInput__iStopped();
				return basicGetInput__iStopped();
			case WTSpecPackage.CTRL_UNIT110__OUTPUT_OMACHINE_STOP_ORDER:
				if (resolve) return getOutput__oMachineStopOrder();
				return basicGetOutput__oMachineStopOrder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT110__INPUT_IMANUAL_STOP_REQUEST:
				setInput__iManualStopRequest((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT110__INPUT_IREMOTE_STOP_REQUEST:
				setInput__iRemoteStopRequest((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT110__INPUT_IMANUAL_START_REQUEST:
				setInput__iManualStartRequest((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT110__INPUT_IREMOTE_START_REQUEST:
				setInput__iRemoteStartRequest((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT110__INPUT_ISTOPPED:
				setInput__iStopped((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT110__OUTPUT_OMACHINE_STOP_ORDER:
				setOutput__oMachineStopOrder((WTCOutput)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT110__INPUT_IMANUAL_STOP_REQUEST:
				setInput__iManualStopRequest((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT110__INPUT_IREMOTE_STOP_REQUEST:
				setInput__iRemoteStopRequest((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT110__INPUT_IMANUAL_START_REQUEST:
				setInput__iManualStartRequest((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT110__INPUT_IREMOTE_START_REQUEST:
				setInput__iRemoteStartRequest((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT110__INPUT_ISTOPPED:
				setInput__iStopped((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT110__OUTPUT_OMACHINE_STOP_ORDER:
				setOutput__oMachineStopOrder((WTCOutput)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT110__INPUT_IMANUAL_STOP_REQUEST:
				return input__iManualStopRequest != null;
			case WTSpecPackage.CTRL_UNIT110__INPUT_IREMOTE_STOP_REQUEST:
				return input__iRemoteStopRequest != null;
			case WTSpecPackage.CTRL_UNIT110__INPUT_IMANUAL_START_REQUEST:
				return input__iManualStartRequest != null;
			case WTSpecPackage.CTRL_UNIT110__INPUT_IREMOTE_START_REQUEST:
				return input__iRemoteStartRequest != null;
			case WTSpecPackage.CTRL_UNIT110__INPUT_ISTOPPED:
				return input__iStopped != null;
			case WTSpecPackage.CTRL_UNIT110__OUTPUT_OMACHINE_STOP_ORDER:
				return output__oMachineStopOrder != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit110Impl
