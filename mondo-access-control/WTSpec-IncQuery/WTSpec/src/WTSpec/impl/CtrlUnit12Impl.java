/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit12;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTCParam;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit12</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit12Impl#getInput__iPinPosition <em>Input iPin Position</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit12Impl#getInput__iInductive <em>Input iInductive</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit12Impl#getInput__iFlInPosition <em>Input iFl In Position</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit12Impl#getInput__iLockingOrder <em>Input iLocking Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit12Impl#getInput__iLockingSet <em>Input iLocking Set</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit12Impl#getOutput__oPinAutoCmd <em>Output oPin Auto Cmd</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit12Impl#getParameter__pPinNoBackPos <em>Parameter pPin No Back Pos</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit12Impl#getParameter__pPinExtendedPos <em>Parameter pPin Extended Pos</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit12Impl#getParameter__pPinRetractedPos <em>Parameter pPin Retracted Pos</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit12Impl#getParameter__pPinHysteresis <em>Parameter pPin Hysteresis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit12Impl extends wtcImpl implements CtrlUnit12 {
	/**
	 * The cached value of the '{@link #getInput__iPinPosition() <em>Input iPin Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPinPosition()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPinPosition;

	/**
	 * The cached value of the '{@link #getInput__iInductive() <em>Input iInductive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInductive()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInductive;

	/**
	 * The cached value of the '{@link #getInput__iFlInPosition() <em>Input iFl In Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iFlInPosition()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iFlInPosition;

	/**
	 * The cached value of the '{@link #getInput__iLockingOrder() <em>Input iLocking Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iLockingOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iLockingOrder;

	/**
	 * The cached value of the '{@link #getInput__iLockingSet() <em>Input iLocking Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iLockingSet()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iLockingSet;

	/**
	 * The cached value of the '{@link #getOutput__oPinAutoCmd() <em>Output oPin Auto Cmd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPinAutoCmd()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPinAutoCmd;

	/**
	 * The cached value of the '{@link #getParameter__pPinNoBackPos() <em>Parameter pPin No Back Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPinNoBackPos()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPinNoBackPos;

	/**
	 * The cached value of the '{@link #getParameter__pPinExtendedPos() <em>Parameter pPin Extended Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPinExtendedPos()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPinExtendedPos;

	/**
	 * The cached value of the '{@link #getParameter__pPinRetractedPos() <em>Parameter pPin Retracted Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPinRetractedPos()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPinRetractedPos;

	/**
	 * The cached value of the '{@link #getParameter__pPinHysteresis() <em>Parameter pPin Hysteresis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPinHysteresis()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPinHysteresis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit12Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPinPosition() {
		if (input__iPinPosition != null && input__iPinPosition.eIsProxy()) {
			InternalEObject oldInput__iPinPosition = (InternalEObject)input__iPinPosition;
			input__iPinPosition = (WTCInput)eResolveProxy(oldInput__iPinPosition);
			if (input__iPinPosition != oldInput__iPinPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT12__INPUT_IPIN_POSITION, oldInput__iPinPosition, input__iPinPosition));
			}
		}
		return input__iPinPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPinPosition() {
		return input__iPinPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPinPosition(WTCInput newInput__iPinPosition) {
		WTCInput oldInput__iPinPosition = input__iPinPosition;
		input__iPinPosition = newInput__iPinPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT12__INPUT_IPIN_POSITION, oldInput__iPinPosition, input__iPinPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInductive() {
		if (input__iInductive != null && input__iInductive.eIsProxy()) {
			InternalEObject oldInput__iInductive = (InternalEObject)input__iInductive;
			input__iInductive = (WTCInput)eResolveProxy(oldInput__iInductive);
			if (input__iInductive != oldInput__iInductive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT12__INPUT_IINDUCTIVE, oldInput__iInductive, input__iInductive));
			}
		}
		return input__iInductive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInductive() {
		return input__iInductive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInductive(WTCInput newInput__iInductive) {
		WTCInput oldInput__iInductive = input__iInductive;
		input__iInductive = newInput__iInductive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT12__INPUT_IINDUCTIVE, oldInput__iInductive, input__iInductive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iFlInPosition() {
		if (input__iFlInPosition != null && input__iFlInPosition.eIsProxy()) {
			InternalEObject oldInput__iFlInPosition = (InternalEObject)input__iFlInPosition;
			input__iFlInPosition = (WTCInput)eResolveProxy(oldInput__iFlInPosition);
			if (input__iFlInPosition != oldInput__iFlInPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT12__INPUT_IFL_IN_POSITION, oldInput__iFlInPosition, input__iFlInPosition));
			}
		}
		return input__iFlInPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iFlInPosition() {
		return input__iFlInPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iFlInPosition(WTCInput newInput__iFlInPosition) {
		WTCInput oldInput__iFlInPosition = input__iFlInPosition;
		input__iFlInPosition = newInput__iFlInPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT12__INPUT_IFL_IN_POSITION, oldInput__iFlInPosition, input__iFlInPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iLockingOrder() {
		if (input__iLockingOrder != null && input__iLockingOrder.eIsProxy()) {
			InternalEObject oldInput__iLockingOrder = (InternalEObject)input__iLockingOrder;
			input__iLockingOrder = (WTCInput)eResolveProxy(oldInput__iLockingOrder);
			if (input__iLockingOrder != oldInput__iLockingOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT12__INPUT_ILOCKING_ORDER, oldInput__iLockingOrder, input__iLockingOrder));
			}
		}
		return input__iLockingOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iLockingOrder() {
		return input__iLockingOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iLockingOrder(WTCInput newInput__iLockingOrder) {
		WTCInput oldInput__iLockingOrder = input__iLockingOrder;
		input__iLockingOrder = newInput__iLockingOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT12__INPUT_ILOCKING_ORDER, oldInput__iLockingOrder, input__iLockingOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iLockingSet() {
		if (input__iLockingSet != null && input__iLockingSet.eIsProxy()) {
			InternalEObject oldInput__iLockingSet = (InternalEObject)input__iLockingSet;
			input__iLockingSet = (WTCInput)eResolveProxy(oldInput__iLockingSet);
			if (input__iLockingSet != oldInput__iLockingSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT12__INPUT_ILOCKING_SET, oldInput__iLockingSet, input__iLockingSet));
			}
		}
		return input__iLockingSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iLockingSet() {
		return input__iLockingSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iLockingSet(WTCInput newInput__iLockingSet) {
		WTCInput oldInput__iLockingSet = input__iLockingSet;
		input__iLockingSet = newInput__iLockingSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT12__INPUT_ILOCKING_SET, oldInput__iLockingSet, input__iLockingSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPinAutoCmd() {
		if (output__oPinAutoCmd != null && output__oPinAutoCmd.eIsProxy()) {
			InternalEObject oldOutput__oPinAutoCmd = (InternalEObject)output__oPinAutoCmd;
			output__oPinAutoCmd = (WTCOutput)eResolveProxy(oldOutput__oPinAutoCmd);
			if (output__oPinAutoCmd != oldOutput__oPinAutoCmd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT12__OUTPUT_OPIN_AUTO_CMD, oldOutput__oPinAutoCmd, output__oPinAutoCmd));
			}
		}
		return output__oPinAutoCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPinAutoCmd() {
		return output__oPinAutoCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPinAutoCmd(WTCOutput newOutput__oPinAutoCmd) {
		WTCOutput oldOutput__oPinAutoCmd = output__oPinAutoCmd;
		output__oPinAutoCmd = newOutput__oPinAutoCmd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT12__OUTPUT_OPIN_AUTO_CMD, oldOutput__oPinAutoCmd, output__oPinAutoCmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPinNoBackPos() {
		if (parameter__pPinNoBackPos != null && parameter__pPinNoBackPos.eIsProxy()) {
			InternalEObject oldParameter__pPinNoBackPos = (InternalEObject)parameter__pPinNoBackPos;
			parameter__pPinNoBackPos = (WTCParam)eResolveProxy(oldParameter__pPinNoBackPos);
			if (parameter__pPinNoBackPos != oldParameter__pPinNoBackPos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_NO_BACK_POS, oldParameter__pPinNoBackPos, parameter__pPinNoBackPos));
			}
		}
		return parameter__pPinNoBackPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPinNoBackPos() {
		return parameter__pPinNoBackPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPinNoBackPos(WTCParam newParameter__pPinNoBackPos) {
		WTCParam oldParameter__pPinNoBackPos = parameter__pPinNoBackPos;
		parameter__pPinNoBackPos = newParameter__pPinNoBackPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_NO_BACK_POS, oldParameter__pPinNoBackPos, parameter__pPinNoBackPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPinExtendedPos() {
		if (parameter__pPinExtendedPos != null && parameter__pPinExtendedPos.eIsProxy()) {
			InternalEObject oldParameter__pPinExtendedPos = (InternalEObject)parameter__pPinExtendedPos;
			parameter__pPinExtendedPos = (WTCParam)eResolveProxy(oldParameter__pPinExtendedPos);
			if (parameter__pPinExtendedPos != oldParameter__pPinExtendedPos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_EXTENDED_POS, oldParameter__pPinExtendedPos, parameter__pPinExtendedPos));
			}
		}
		return parameter__pPinExtendedPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPinExtendedPos() {
		return parameter__pPinExtendedPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPinExtendedPos(WTCParam newParameter__pPinExtendedPos) {
		WTCParam oldParameter__pPinExtendedPos = parameter__pPinExtendedPos;
		parameter__pPinExtendedPos = newParameter__pPinExtendedPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_EXTENDED_POS, oldParameter__pPinExtendedPos, parameter__pPinExtendedPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPinRetractedPos() {
		if (parameter__pPinRetractedPos != null && parameter__pPinRetractedPos.eIsProxy()) {
			InternalEObject oldParameter__pPinRetractedPos = (InternalEObject)parameter__pPinRetractedPos;
			parameter__pPinRetractedPos = (WTCParam)eResolveProxy(oldParameter__pPinRetractedPos);
			if (parameter__pPinRetractedPos != oldParameter__pPinRetractedPos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_RETRACTED_POS, oldParameter__pPinRetractedPos, parameter__pPinRetractedPos));
			}
		}
		return parameter__pPinRetractedPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPinRetractedPos() {
		return parameter__pPinRetractedPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPinRetractedPos(WTCParam newParameter__pPinRetractedPos) {
		WTCParam oldParameter__pPinRetractedPos = parameter__pPinRetractedPos;
		parameter__pPinRetractedPos = newParameter__pPinRetractedPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_RETRACTED_POS, oldParameter__pPinRetractedPos, parameter__pPinRetractedPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPinHysteresis() {
		if (parameter__pPinHysteresis != null && parameter__pPinHysteresis.eIsProxy()) {
			InternalEObject oldParameter__pPinHysteresis = (InternalEObject)parameter__pPinHysteresis;
			parameter__pPinHysteresis = (WTCParam)eResolveProxy(oldParameter__pPinHysteresis);
			if (parameter__pPinHysteresis != oldParameter__pPinHysteresis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_HYSTERESIS, oldParameter__pPinHysteresis, parameter__pPinHysteresis));
			}
		}
		return parameter__pPinHysteresis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPinHysteresis() {
		return parameter__pPinHysteresis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPinHysteresis(WTCParam newParameter__pPinHysteresis) {
		WTCParam oldParameter__pPinHysteresis = parameter__pPinHysteresis;
		parameter__pPinHysteresis = newParameter__pPinHysteresis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_HYSTERESIS, oldParameter__pPinHysteresis, parameter__pPinHysteresis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT12__INPUT_IPIN_POSITION:
				if (resolve) return getInput__iPinPosition();
				return basicGetInput__iPinPosition();
			case WTSpecPackage.CTRL_UNIT12__INPUT_IINDUCTIVE:
				if (resolve) return getInput__iInductive();
				return basicGetInput__iInductive();
			case WTSpecPackage.CTRL_UNIT12__INPUT_IFL_IN_POSITION:
				if (resolve) return getInput__iFlInPosition();
				return basicGetInput__iFlInPosition();
			case WTSpecPackage.CTRL_UNIT12__INPUT_ILOCKING_ORDER:
				if (resolve) return getInput__iLockingOrder();
				return basicGetInput__iLockingOrder();
			case WTSpecPackage.CTRL_UNIT12__INPUT_ILOCKING_SET:
				if (resolve) return getInput__iLockingSet();
				return basicGetInput__iLockingSet();
			case WTSpecPackage.CTRL_UNIT12__OUTPUT_OPIN_AUTO_CMD:
				if (resolve) return getOutput__oPinAutoCmd();
				return basicGetOutput__oPinAutoCmd();
			case WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_NO_BACK_POS:
				if (resolve) return getParameter__pPinNoBackPos();
				return basicGetParameter__pPinNoBackPos();
			case WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_EXTENDED_POS:
				if (resolve) return getParameter__pPinExtendedPos();
				return basicGetParameter__pPinExtendedPos();
			case WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_RETRACTED_POS:
				if (resolve) return getParameter__pPinRetractedPos();
				return basicGetParameter__pPinRetractedPos();
			case WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_HYSTERESIS:
				if (resolve) return getParameter__pPinHysteresis();
				return basicGetParameter__pPinHysteresis();
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
			case WTSpecPackage.CTRL_UNIT12__INPUT_IPIN_POSITION:
				setInput__iPinPosition((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT12__INPUT_IINDUCTIVE:
				setInput__iInductive((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT12__INPUT_IFL_IN_POSITION:
				setInput__iFlInPosition((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT12__INPUT_ILOCKING_ORDER:
				setInput__iLockingOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT12__INPUT_ILOCKING_SET:
				setInput__iLockingSet((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT12__OUTPUT_OPIN_AUTO_CMD:
				setOutput__oPinAutoCmd((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_NO_BACK_POS:
				setParameter__pPinNoBackPos((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_EXTENDED_POS:
				setParameter__pPinExtendedPos((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_RETRACTED_POS:
				setParameter__pPinRetractedPos((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_HYSTERESIS:
				setParameter__pPinHysteresis((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT12__INPUT_IPIN_POSITION:
				setInput__iPinPosition((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT12__INPUT_IINDUCTIVE:
				setInput__iInductive((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT12__INPUT_IFL_IN_POSITION:
				setInput__iFlInPosition((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT12__INPUT_ILOCKING_ORDER:
				setInput__iLockingOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT12__INPUT_ILOCKING_SET:
				setInput__iLockingSet((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT12__OUTPUT_OPIN_AUTO_CMD:
				setOutput__oPinAutoCmd((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_NO_BACK_POS:
				setParameter__pPinNoBackPos((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_EXTENDED_POS:
				setParameter__pPinExtendedPos((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_RETRACTED_POS:
				setParameter__pPinRetractedPos((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_HYSTERESIS:
				setParameter__pPinHysteresis((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT12__INPUT_IPIN_POSITION:
				return input__iPinPosition != null;
			case WTSpecPackage.CTRL_UNIT12__INPUT_IINDUCTIVE:
				return input__iInductive != null;
			case WTSpecPackage.CTRL_UNIT12__INPUT_IFL_IN_POSITION:
				return input__iFlInPosition != null;
			case WTSpecPackage.CTRL_UNIT12__INPUT_ILOCKING_ORDER:
				return input__iLockingOrder != null;
			case WTSpecPackage.CTRL_UNIT12__INPUT_ILOCKING_SET:
				return input__iLockingSet != null;
			case WTSpecPackage.CTRL_UNIT12__OUTPUT_OPIN_AUTO_CMD:
				return output__oPinAutoCmd != null;
			case WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_NO_BACK_POS:
				return parameter__pPinNoBackPos != null;
			case WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_EXTENDED_POS:
				return parameter__pPinExtendedPos != null;
			case WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_RETRACTED_POS:
				return parameter__pPinRetractedPos != null;
			case WTSpecPackage.CTRL_UNIT12__PARAMETER_PPIN_HYSTERESIS:
				return parameter__pPinHysteresis != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit12Impl
