/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit54;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit54</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit54Impl#getInput__iSafety <em>Input iSafety</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit54Impl#getInput__iLockingOrderSelected <em>Input iLocking Order Selected</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit54Impl#getInput__iMachineStateL <em>Input iMachine State L</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit54Impl#getInput__iMachineStateU <em>Input iMachine State U</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit54Impl#getInput__iMachineStateS <em>Input iMachine State S</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit54Impl#getInput__iInitialConditions <em>Input iInitial Conditions</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit54Impl#getInput__iPinState <em>Input iPin State</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit54Impl#getOutput__oLockingOrder <em>Output oLocking Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit54Impl extends wtcImpl implements CtrlUnit54 {
	/**
	 * The cached value of the '{@link #getInput__iSafety() <em>Input iSafety</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iSafety()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iSafety;

	/**
	 * The cached value of the '{@link #getInput__iLockingOrderSelected() <em>Input iLocking Order Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iLockingOrderSelected()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iLockingOrderSelected;

	/**
	 * The cached value of the '{@link #getInput__iMachineStateL() <em>Input iMachine State L</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iMachineStateL()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iMachineStateL;

	/**
	 * The cached value of the '{@link #getInput__iMachineStateU() <em>Input iMachine State U</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iMachineStateU()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iMachineStateU;

	/**
	 * The cached value of the '{@link #getInput__iMachineStateS() <em>Input iMachine State S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iMachineStateS()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iMachineStateS;

	/**
	 * The cached value of the '{@link #getInput__iInitialConditions() <em>Input iInitial Conditions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInitialConditions()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInitialConditions;

	/**
	 * The cached value of the '{@link #getInput__iPinState() <em>Input iPin State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPinState()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPinState;

	/**
	 * The cached value of the '{@link #getOutput__oLockingOrder() <em>Output oLocking Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oLockingOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oLockingOrder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit54Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT54;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iSafety() {
		if (input__iSafety != null && input__iSafety.eIsProxy()) {
			InternalEObject oldInput__iSafety = (InternalEObject)input__iSafety;
			input__iSafety = (WTCInput)eResolveProxy(oldInput__iSafety);
			if (input__iSafety != oldInput__iSafety) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT54__INPUT_ISAFETY, oldInput__iSafety, input__iSafety));
			}
		}
		return input__iSafety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iSafety() {
		return input__iSafety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iSafety(WTCInput newInput__iSafety) {
		WTCInput oldInput__iSafety = input__iSafety;
		input__iSafety = newInput__iSafety;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT54__INPUT_ISAFETY, oldInput__iSafety, input__iSafety));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iLockingOrderSelected() {
		if (input__iLockingOrderSelected != null && input__iLockingOrderSelected.eIsProxy()) {
			InternalEObject oldInput__iLockingOrderSelected = (InternalEObject)input__iLockingOrderSelected;
			input__iLockingOrderSelected = (WTCInput)eResolveProxy(oldInput__iLockingOrderSelected);
			if (input__iLockingOrderSelected != oldInput__iLockingOrderSelected) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT54__INPUT_ILOCKING_ORDER_SELECTED, oldInput__iLockingOrderSelected, input__iLockingOrderSelected));
			}
		}
		return input__iLockingOrderSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iLockingOrderSelected() {
		return input__iLockingOrderSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iLockingOrderSelected(WTCInput newInput__iLockingOrderSelected) {
		WTCInput oldInput__iLockingOrderSelected = input__iLockingOrderSelected;
		input__iLockingOrderSelected = newInput__iLockingOrderSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT54__INPUT_ILOCKING_ORDER_SELECTED, oldInput__iLockingOrderSelected, input__iLockingOrderSelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iMachineStateL() {
		if (input__iMachineStateL != null && input__iMachineStateL.eIsProxy()) {
			InternalEObject oldInput__iMachineStateL = (InternalEObject)input__iMachineStateL;
			input__iMachineStateL = (WTCInput)eResolveProxy(oldInput__iMachineStateL);
			if (input__iMachineStateL != oldInput__iMachineStateL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_L, oldInput__iMachineStateL, input__iMachineStateL));
			}
		}
		return input__iMachineStateL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iMachineStateL() {
		return input__iMachineStateL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iMachineStateL(WTCInput newInput__iMachineStateL) {
		WTCInput oldInput__iMachineStateL = input__iMachineStateL;
		input__iMachineStateL = newInput__iMachineStateL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_L, oldInput__iMachineStateL, input__iMachineStateL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iMachineStateU() {
		if (input__iMachineStateU != null && input__iMachineStateU.eIsProxy()) {
			InternalEObject oldInput__iMachineStateU = (InternalEObject)input__iMachineStateU;
			input__iMachineStateU = (WTCInput)eResolveProxy(oldInput__iMachineStateU);
			if (input__iMachineStateU != oldInput__iMachineStateU) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_U, oldInput__iMachineStateU, input__iMachineStateU));
			}
		}
		return input__iMachineStateU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iMachineStateU() {
		return input__iMachineStateU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iMachineStateU(WTCInput newInput__iMachineStateU) {
		WTCInput oldInput__iMachineStateU = input__iMachineStateU;
		input__iMachineStateU = newInput__iMachineStateU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_U, oldInput__iMachineStateU, input__iMachineStateU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iMachineStateS() {
		if (input__iMachineStateS != null && input__iMachineStateS.eIsProxy()) {
			InternalEObject oldInput__iMachineStateS = (InternalEObject)input__iMachineStateS;
			input__iMachineStateS = (WTCInput)eResolveProxy(oldInput__iMachineStateS);
			if (input__iMachineStateS != oldInput__iMachineStateS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_S, oldInput__iMachineStateS, input__iMachineStateS));
			}
		}
		return input__iMachineStateS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iMachineStateS() {
		return input__iMachineStateS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iMachineStateS(WTCInput newInput__iMachineStateS) {
		WTCInput oldInput__iMachineStateS = input__iMachineStateS;
		input__iMachineStateS = newInput__iMachineStateS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_S, oldInput__iMachineStateS, input__iMachineStateS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInitialConditions() {
		if (input__iInitialConditions != null && input__iInitialConditions.eIsProxy()) {
			InternalEObject oldInput__iInitialConditions = (InternalEObject)input__iInitialConditions;
			input__iInitialConditions = (WTCInput)eResolveProxy(oldInput__iInitialConditions);
			if (input__iInitialConditions != oldInput__iInitialConditions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT54__INPUT_IINITIAL_CONDITIONS, oldInput__iInitialConditions, input__iInitialConditions));
			}
		}
		return input__iInitialConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInitialConditions() {
		return input__iInitialConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInitialConditions(WTCInput newInput__iInitialConditions) {
		WTCInput oldInput__iInitialConditions = input__iInitialConditions;
		input__iInitialConditions = newInput__iInitialConditions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT54__INPUT_IINITIAL_CONDITIONS, oldInput__iInitialConditions, input__iInitialConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPinState() {
		if (input__iPinState != null && input__iPinState.eIsProxy()) {
			InternalEObject oldInput__iPinState = (InternalEObject)input__iPinState;
			input__iPinState = (WTCInput)eResolveProxy(oldInput__iPinState);
			if (input__iPinState != oldInput__iPinState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT54__INPUT_IPIN_STATE, oldInput__iPinState, input__iPinState));
			}
		}
		return input__iPinState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPinState() {
		return input__iPinState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPinState(WTCInput newInput__iPinState) {
		WTCInput oldInput__iPinState = input__iPinState;
		input__iPinState = newInput__iPinState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT54__INPUT_IPIN_STATE, oldInput__iPinState, input__iPinState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oLockingOrder() {
		if (output__oLockingOrder != null && output__oLockingOrder.eIsProxy()) {
			InternalEObject oldOutput__oLockingOrder = (InternalEObject)output__oLockingOrder;
			output__oLockingOrder = (WTCOutput)eResolveProxy(oldOutput__oLockingOrder);
			if (output__oLockingOrder != oldOutput__oLockingOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT54__OUTPUT_OLOCKING_ORDER, oldOutput__oLockingOrder, output__oLockingOrder));
			}
		}
		return output__oLockingOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oLockingOrder() {
		return output__oLockingOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oLockingOrder(WTCOutput newOutput__oLockingOrder) {
		WTCOutput oldOutput__oLockingOrder = output__oLockingOrder;
		output__oLockingOrder = newOutput__oLockingOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT54__OUTPUT_OLOCKING_ORDER, oldOutput__oLockingOrder, output__oLockingOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT54__INPUT_ISAFETY:
				if (resolve) return getInput__iSafety();
				return basicGetInput__iSafety();
			case WTSpecPackage.CTRL_UNIT54__INPUT_ILOCKING_ORDER_SELECTED:
				if (resolve) return getInput__iLockingOrderSelected();
				return basicGetInput__iLockingOrderSelected();
			case WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_L:
				if (resolve) return getInput__iMachineStateL();
				return basicGetInput__iMachineStateL();
			case WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_U:
				if (resolve) return getInput__iMachineStateU();
				return basicGetInput__iMachineStateU();
			case WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_S:
				if (resolve) return getInput__iMachineStateS();
				return basicGetInput__iMachineStateS();
			case WTSpecPackage.CTRL_UNIT54__INPUT_IINITIAL_CONDITIONS:
				if (resolve) return getInput__iInitialConditions();
				return basicGetInput__iInitialConditions();
			case WTSpecPackage.CTRL_UNIT54__INPUT_IPIN_STATE:
				if (resolve) return getInput__iPinState();
				return basicGetInput__iPinState();
			case WTSpecPackage.CTRL_UNIT54__OUTPUT_OLOCKING_ORDER:
				if (resolve) return getOutput__oLockingOrder();
				return basicGetOutput__oLockingOrder();
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
			case WTSpecPackage.CTRL_UNIT54__INPUT_ISAFETY:
				setInput__iSafety((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT54__INPUT_ILOCKING_ORDER_SELECTED:
				setInput__iLockingOrderSelected((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_L:
				setInput__iMachineStateL((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_U:
				setInput__iMachineStateU((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_S:
				setInput__iMachineStateS((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT54__INPUT_IINITIAL_CONDITIONS:
				setInput__iInitialConditions((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT54__INPUT_IPIN_STATE:
				setInput__iPinState((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT54__OUTPUT_OLOCKING_ORDER:
				setOutput__oLockingOrder((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT54__INPUT_ISAFETY:
				setInput__iSafety((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT54__INPUT_ILOCKING_ORDER_SELECTED:
				setInput__iLockingOrderSelected((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_L:
				setInput__iMachineStateL((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_U:
				setInput__iMachineStateU((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_S:
				setInput__iMachineStateS((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT54__INPUT_IINITIAL_CONDITIONS:
				setInput__iInitialConditions((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT54__INPUT_IPIN_STATE:
				setInput__iPinState((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT54__OUTPUT_OLOCKING_ORDER:
				setOutput__oLockingOrder((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT54__INPUT_ISAFETY:
				return input__iSafety != null;
			case WTSpecPackage.CTRL_UNIT54__INPUT_ILOCKING_ORDER_SELECTED:
				return input__iLockingOrderSelected != null;
			case WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_L:
				return input__iMachineStateL != null;
			case WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_U:
				return input__iMachineStateU != null;
			case WTSpecPackage.CTRL_UNIT54__INPUT_IMACHINE_STATE_S:
				return input__iMachineStateS != null;
			case WTSpecPackage.CTRL_UNIT54__INPUT_IINITIAL_CONDITIONS:
				return input__iInitialConditions != null;
			case WTSpecPackage.CTRL_UNIT54__INPUT_IPIN_STATE:
				return input__iPinState != null;
			case WTSpecPackage.CTRL_UNIT54__OUTPUT_OLOCKING_ORDER:
				return output__oLockingOrder != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit54Impl
