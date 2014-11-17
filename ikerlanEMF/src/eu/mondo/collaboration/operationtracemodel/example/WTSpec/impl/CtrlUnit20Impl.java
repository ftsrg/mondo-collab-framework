/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit20;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit20</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit20Impl#getInput__iMasterOrder <em>Input iMaster Order</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit20Impl#getInput__iInverterOrder <em>Input iInverter Order</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit20Impl#getInput__iChangeOrder <em>Input iChange Order</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit20Impl#getInput__iManualStop <em>Input iManual Stop</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit20Impl#getOutput__oMasterSelected <em>Output oMaster Selected</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit20Impl#getOutput__oInverterEnabled <em>Output oInverter Enabled</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit20Impl#getOutput__oForceInvOff <em>Output oForce Inv Off</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit20Impl extends wtcImpl implements CtrlUnit20 {
	/**
	 * The cached value of the '{@link #getInput__iMasterOrder() <em>Input iMaster Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iMasterOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iMasterOrder;

	/**
	 * The cached value of the '{@link #getInput__iInverterOrder() <em>Input iInverter Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInverterOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInverterOrder;

	/**
	 * The cached value of the '{@link #getInput__iChangeOrder() <em>Input iChange Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iChangeOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iChangeOrder;

	/**
	 * The cached value of the '{@link #getInput__iManualStop() <em>Input iManual Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iManualStop()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iManualStop;

	/**
	 * The cached value of the '{@link #getOutput__oMasterSelected() <em>Output oMaster Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oMasterSelected()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oMasterSelected;

	/**
	 * The cached value of the '{@link #getOutput__oInverterEnabled() <em>Output oInverter Enabled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oInverterEnabled()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oInverterEnabled;

	/**
	 * The cached value of the '{@link #getOutput__oForceInvOff() <em>Output oForce Inv Off</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oForceInvOff()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oForceInvOff;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit20Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit20();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iMasterOrder() {
		if (input__iMasterOrder != null && input__iMasterOrder.eIsProxy()) {
			InternalEObject oldInput__iMasterOrder = (InternalEObject)input__iMasterOrder;
			input__iMasterOrder = (WTCInput)eResolveProxy(oldInput__iMasterOrder);
			if (input__iMasterOrder != oldInput__iMasterOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT20__INPUT_IMASTER_ORDER, oldInput__iMasterOrder, input__iMasterOrder));
			}
		}
		return input__iMasterOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iMasterOrder() {
		return input__iMasterOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iMasterOrder(WTCInput newInput__iMasterOrder) {
		WTCInput oldInput__iMasterOrder = input__iMasterOrder;
		input__iMasterOrder = newInput__iMasterOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT20__INPUT_IMASTER_ORDER, oldInput__iMasterOrder, input__iMasterOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInverterOrder() {
		if (input__iInverterOrder != null && input__iInverterOrder.eIsProxy()) {
			InternalEObject oldInput__iInverterOrder = (InternalEObject)input__iInverterOrder;
			input__iInverterOrder = (WTCInput)eResolveProxy(oldInput__iInverterOrder);
			if (input__iInverterOrder != oldInput__iInverterOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT20__INPUT_IINVERTER_ORDER, oldInput__iInverterOrder, input__iInverterOrder));
			}
		}
		return input__iInverterOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInverterOrder() {
		return input__iInverterOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInverterOrder(WTCInput newInput__iInverterOrder) {
		WTCInput oldInput__iInverterOrder = input__iInverterOrder;
		input__iInverterOrder = newInput__iInverterOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT20__INPUT_IINVERTER_ORDER, oldInput__iInverterOrder, input__iInverterOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iChangeOrder() {
		if (input__iChangeOrder != null && input__iChangeOrder.eIsProxy()) {
			InternalEObject oldInput__iChangeOrder = (InternalEObject)input__iChangeOrder;
			input__iChangeOrder = (WTCInput)eResolveProxy(oldInput__iChangeOrder);
			if (input__iChangeOrder != oldInput__iChangeOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT20__INPUT_ICHANGE_ORDER, oldInput__iChangeOrder, input__iChangeOrder));
			}
		}
		return input__iChangeOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iChangeOrder() {
		return input__iChangeOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iChangeOrder(WTCInput newInput__iChangeOrder) {
		WTCInput oldInput__iChangeOrder = input__iChangeOrder;
		input__iChangeOrder = newInput__iChangeOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT20__INPUT_ICHANGE_ORDER, oldInput__iChangeOrder, input__iChangeOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iManualStop() {
		if (input__iManualStop != null && input__iManualStop.eIsProxy()) {
			InternalEObject oldInput__iManualStop = (InternalEObject)input__iManualStop;
			input__iManualStop = (WTCInput)eResolveProxy(oldInput__iManualStop);
			if (input__iManualStop != oldInput__iManualStop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT20__INPUT_IMANUAL_STOP, oldInput__iManualStop, input__iManualStop));
			}
		}
		return input__iManualStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iManualStop() {
		return input__iManualStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iManualStop(WTCInput newInput__iManualStop) {
		WTCInput oldInput__iManualStop = input__iManualStop;
		input__iManualStop = newInput__iManualStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT20__INPUT_IMANUAL_STOP, oldInput__iManualStop, input__iManualStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oMasterSelected() {
		if (output__oMasterSelected != null && output__oMasterSelected.eIsProxy()) {
			InternalEObject oldOutput__oMasterSelected = (InternalEObject)output__oMasterSelected;
			output__oMasterSelected = (WTCOutput)eResolveProxy(oldOutput__oMasterSelected);
			if (output__oMasterSelected != oldOutput__oMasterSelected) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT20__OUTPUT_OMASTER_SELECTED, oldOutput__oMasterSelected, output__oMasterSelected));
			}
		}
		return output__oMasterSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oMasterSelected() {
		return output__oMasterSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oMasterSelected(WTCOutput newOutput__oMasterSelected) {
		WTCOutput oldOutput__oMasterSelected = output__oMasterSelected;
		output__oMasterSelected = newOutput__oMasterSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT20__OUTPUT_OMASTER_SELECTED, oldOutput__oMasterSelected, output__oMasterSelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oInverterEnabled() {
		if (output__oInverterEnabled != null && output__oInverterEnabled.eIsProxy()) {
			InternalEObject oldOutput__oInverterEnabled = (InternalEObject)output__oInverterEnabled;
			output__oInverterEnabled = (WTCOutput)eResolveProxy(oldOutput__oInverterEnabled);
			if (output__oInverterEnabled != oldOutput__oInverterEnabled) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT20__OUTPUT_OINVERTER_ENABLED, oldOutput__oInverterEnabled, output__oInverterEnabled));
			}
		}
		return output__oInverterEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oInverterEnabled() {
		return output__oInverterEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oInverterEnabled(WTCOutput newOutput__oInverterEnabled) {
		WTCOutput oldOutput__oInverterEnabled = output__oInverterEnabled;
		output__oInverterEnabled = newOutput__oInverterEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT20__OUTPUT_OINVERTER_ENABLED, oldOutput__oInverterEnabled, output__oInverterEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oForceInvOff() {
		if (output__oForceInvOff != null && output__oForceInvOff.eIsProxy()) {
			InternalEObject oldOutput__oForceInvOff = (InternalEObject)output__oForceInvOff;
			output__oForceInvOff = (WTCOutput)eResolveProxy(oldOutput__oForceInvOff);
			if (output__oForceInvOff != oldOutput__oForceInvOff) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT20__OUTPUT_OFORCE_INV_OFF, oldOutput__oForceInvOff, output__oForceInvOff));
			}
		}
		return output__oForceInvOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oForceInvOff() {
		return output__oForceInvOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oForceInvOff(WTCOutput newOutput__oForceInvOff) {
		WTCOutput oldOutput__oForceInvOff = output__oForceInvOff;
		output__oForceInvOff = newOutput__oForceInvOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT20__OUTPUT_OFORCE_INV_OFF, oldOutput__oForceInvOff, output__oForceInvOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT20__INPUT_IMASTER_ORDER:
				if (resolve) return getInput__iMasterOrder();
				return basicGetInput__iMasterOrder();
			case WTSpecPackage.CTRL_UNIT20__INPUT_IINVERTER_ORDER:
				if (resolve) return getInput__iInverterOrder();
				return basicGetInput__iInverterOrder();
			case WTSpecPackage.CTRL_UNIT20__INPUT_ICHANGE_ORDER:
				if (resolve) return getInput__iChangeOrder();
				return basicGetInput__iChangeOrder();
			case WTSpecPackage.CTRL_UNIT20__INPUT_IMANUAL_STOP:
				if (resolve) return getInput__iManualStop();
				return basicGetInput__iManualStop();
			case WTSpecPackage.CTRL_UNIT20__OUTPUT_OMASTER_SELECTED:
				if (resolve) return getOutput__oMasterSelected();
				return basicGetOutput__oMasterSelected();
			case WTSpecPackage.CTRL_UNIT20__OUTPUT_OINVERTER_ENABLED:
				if (resolve) return getOutput__oInverterEnabled();
				return basicGetOutput__oInverterEnabled();
			case WTSpecPackage.CTRL_UNIT20__OUTPUT_OFORCE_INV_OFF:
				if (resolve) return getOutput__oForceInvOff();
				return basicGetOutput__oForceInvOff();
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
			case WTSpecPackage.CTRL_UNIT20__INPUT_IMASTER_ORDER:
				setInput__iMasterOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT20__INPUT_IINVERTER_ORDER:
				setInput__iInverterOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT20__INPUT_ICHANGE_ORDER:
				setInput__iChangeOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT20__INPUT_IMANUAL_STOP:
				setInput__iManualStop((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT20__OUTPUT_OMASTER_SELECTED:
				setOutput__oMasterSelected((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT20__OUTPUT_OINVERTER_ENABLED:
				setOutput__oInverterEnabled((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT20__OUTPUT_OFORCE_INV_OFF:
				setOutput__oForceInvOff((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT20__INPUT_IMASTER_ORDER:
				setInput__iMasterOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT20__INPUT_IINVERTER_ORDER:
				setInput__iInverterOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT20__INPUT_ICHANGE_ORDER:
				setInput__iChangeOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT20__INPUT_IMANUAL_STOP:
				setInput__iManualStop((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT20__OUTPUT_OMASTER_SELECTED:
				setOutput__oMasterSelected((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT20__OUTPUT_OINVERTER_ENABLED:
				setOutput__oInverterEnabled((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT20__OUTPUT_OFORCE_INV_OFF:
				setOutput__oForceInvOff((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT20__INPUT_IMASTER_ORDER:
				return input__iMasterOrder != null;
			case WTSpecPackage.CTRL_UNIT20__INPUT_IINVERTER_ORDER:
				return input__iInverterOrder != null;
			case WTSpecPackage.CTRL_UNIT20__INPUT_ICHANGE_ORDER:
				return input__iChangeOrder != null;
			case WTSpecPackage.CTRL_UNIT20__INPUT_IMANUAL_STOP:
				return input__iManualStop != null;
			case WTSpecPackage.CTRL_UNIT20__OUTPUT_OMASTER_SELECTED:
				return output__oMasterSelected != null;
			case WTSpecPackage.CTRL_UNIT20__OUTPUT_OINVERTER_ENABLED:
				return output__oInverterEnabled != null;
			case WTSpecPackage.CTRL_UNIT20__OUTPUT_OFORCE_INV_OFF:
				return output__oForceInvOff != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit20Impl
