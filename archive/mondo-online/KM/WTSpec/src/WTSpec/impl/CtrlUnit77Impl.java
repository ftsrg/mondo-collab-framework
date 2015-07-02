/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit77;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit77</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit77Impl#getInput__iYawInhibited <em>Input iYaw Inhibited</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit77Impl#getInput__iYawCwOrder <em>Input iYaw Cw Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit77Impl#getInput__iYawCcwOrder <em>Input iYaw Ccw Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit77Impl#getInput__iFlagIntoWind <em>Input iFlag Into Wind</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit77Impl#getOutput__oOpcYawStatus <em>Output oOpc Yaw Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit77Impl extends wtcImpl implements CtrlUnit77 {
	/**
	 * The cached value of the '{@link #getInput__iYawInhibited() <em>Input iYaw Inhibited</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iYawInhibited()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iYawInhibited;

	/**
	 * The cached value of the '{@link #getInput__iYawCwOrder() <em>Input iYaw Cw Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iYawCwOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iYawCwOrder;

	/**
	 * The cached value of the '{@link #getInput__iYawCcwOrder() <em>Input iYaw Ccw Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iYawCcwOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iYawCcwOrder;

	/**
	 * The cached value of the '{@link #getInput__iFlagIntoWind() <em>Input iFlag Into Wind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iFlagIntoWind()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iFlagIntoWind;

	/**
	 * The cached value of the '{@link #getOutput__oOpcYawStatus() <em>Output oOpc Yaw Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOpcYawStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOpcYawStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit77Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit77();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iYawInhibited() {
		if (input__iYawInhibited != null && input__iYawInhibited.eIsProxy()) {
			InternalEObject oldInput__iYawInhibited = (InternalEObject)input__iYawInhibited;
			input__iYawInhibited = (WTCInput)eResolveProxy(oldInput__iYawInhibited);
			if (input__iYawInhibited != oldInput__iYawInhibited) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_INHIBITED, oldInput__iYawInhibited, input__iYawInhibited));
			}
		}
		return input__iYawInhibited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iYawInhibited() {
		return input__iYawInhibited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iYawInhibited(WTCInput newInput__iYawInhibited) {
		WTCInput oldInput__iYawInhibited = input__iYawInhibited;
		input__iYawInhibited = newInput__iYawInhibited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_INHIBITED, oldInput__iYawInhibited, input__iYawInhibited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iYawCwOrder() {
		if (input__iYawCwOrder != null && input__iYawCwOrder.eIsProxy()) {
			InternalEObject oldInput__iYawCwOrder = (InternalEObject)input__iYawCwOrder;
			input__iYawCwOrder = (WTCInput)eResolveProxy(oldInput__iYawCwOrder);
			if (input__iYawCwOrder != oldInput__iYawCwOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_CW_ORDER, oldInput__iYawCwOrder, input__iYawCwOrder));
			}
		}
		return input__iYawCwOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iYawCwOrder() {
		return input__iYawCwOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iYawCwOrder(WTCInput newInput__iYawCwOrder) {
		WTCInput oldInput__iYawCwOrder = input__iYawCwOrder;
		input__iYawCwOrder = newInput__iYawCwOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_CW_ORDER, oldInput__iYawCwOrder, input__iYawCwOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iYawCcwOrder() {
		if (input__iYawCcwOrder != null && input__iYawCcwOrder.eIsProxy()) {
			InternalEObject oldInput__iYawCcwOrder = (InternalEObject)input__iYawCcwOrder;
			input__iYawCcwOrder = (WTCInput)eResolveProxy(oldInput__iYawCcwOrder);
			if (input__iYawCcwOrder != oldInput__iYawCcwOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_CCW_ORDER, oldInput__iYawCcwOrder, input__iYawCcwOrder));
			}
		}
		return input__iYawCcwOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iYawCcwOrder() {
		return input__iYawCcwOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iYawCcwOrder(WTCInput newInput__iYawCcwOrder) {
		WTCInput oldInput__iYawCcwOrder = input__iYawCcwOrder;
		input__iYawCcwOrder = newInput__iYawCcwOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_CCW_ORDER, oldInput__iYawCcwOrder, input__iYawCcwOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iFlagIntoWind() {
		if (input__iFlagIntoWind != null && input__iFlagIntoWind.eIsProxy()) {
			InternalEObject oldInput__iFlagIntoWind = (InternalEObject)input__iFlagIntoWind;
			input__iFlagIntoWind = (WTCInput)eResolveProxy(oldInput__iFlagIntoWind);
			if (input__iFlagIntoWind != oldInput__iFlagIntoWind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT77__INPUT_IFLAG_INTO_WIND, oldInput__iFlagIntoWind, input__iFlagIntoWind));
			}
		}
		return input__iFlagIntoWind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iFlagIntoWind() {
		return input__iFlagIntoWind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iFlagIntoWind(WTCInput newInput__iFlagIntoWind) {
		WTCInput oldInput__iFlagIntoWind = input__iFlagIntoWind;
		input__iFlagIntoWind = newInput__iFlagIntoWind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT77__INPUT_IFLAG_INTO_WIND, oldInput__iFlagIntoWind, input__iFlagIntoWind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOpcYawStatus() {
		if (output__oOpcYawStatus != null && output__oOpcYawStatus.eIsProxy()) {
			InternalEObject oldOutput__oOpcYawStatus = (InternalEObject)output__oOpcYawStatus;
			output__oOpcYawStatus = (WTCOutput)eResolveProxy(oldOutput__oOpcYawStatus);
			if (output__oOpcYawStatus != oldOutput__oOpcYawStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT77__OUTPUT_OOPC_YAW_STATUS, oldOutput__oOpcYawStatus, output__oOpcYawStatus));
			}
		}
		return output__oOpcYawStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOpcYawStatus() {
		return output__oOpcYawStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOpcYawStatus(WTCOutput newOutput__oOpcYawStatus) {
		WTCOutput oldOutput__oOpcYawStatus = output__oOpcYawStatus;
		output__oOpcYawStatus = newOutput__oOpcYawStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT77__OUTPUT_OOPC_YAW_STATUS, oldOutput__oOpcYawStatus, output__oOpcYawStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_INHIBITED:
				if (resolve) return getInput__iYawInhibited();
				return basicGetInput__iYawInhibited();
			case WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_CW_ORDER:
				if (resolve) return getInput__iYawCwOrder();
				return basicGetInput__iYawCwOrder();
			case WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_CCW_ORDER:
				if (resolve) return getInput__iYawCcwOrder();
				return basicGetInput__iYawCcwOrder();
			case WTSpecPackage.CTRL_UNIT77__INPUT_IFLAG_INTO_WIND:
				if (resolve) return getInput__iFlagIntoWind();
				return basicGetInput__iFlagIntoWind();
			case WTSpecPackage.CTRL_UNIT77__OUTPUT_OOPC_YAW_STATUS:
				if (resolve) return getOutput__oOpcYawStatus();
				return basicGetOutput__oOpcYawStatus();
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
			case WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_INHIBITED:
				setInput__iYawInhibited((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_CW_ORDER:
				setInput__iYawCwOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_CCW_ORDER:
				setInput__iYawCcwOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT77__INPUT_IFLAG_INTO_WIND:
				setInput__iFlagIntoWind((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT77__OUTPUT_OOPC_YAW_STATUS:
				setOutput__oOpcYawStatus((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_INHIBITED:
				setInput__iYawInhibited((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_CW_ORDER:
				setInput__iYawCwOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_CCW_ORDER:
				setInput__iYawCcwOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT77__INPUT_IFLAG_INTO_WIND:
				setInput__iFlagIntoWind((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT77__OUTPUT_OOPC_YAW_STATUS:
				setOutput__oOpcYawStatus((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_INHIBITED:
				return input__iYawInhibited != null;
			case WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_CW_ORDER:
				return input__iYawCwOrder != null;
			case WTSpecPackage.CTRL_UNIT77__INPUT_IYAW_CCW_ORDER:
				return input__iYawCcwOrder != null;
			case WTSpecPackage.CTRL_UNIT77__INPUT_IFLAG_INTO_WIND:
				return input__iFlagIntoWind != null;
			case WTSpecPackage.CTRL_UNIT77__OUTPUT_OOPC_YAW_STATUS:
				return output__oOpcYawStatus != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit77Impl
