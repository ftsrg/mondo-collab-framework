/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit67;
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
 * An implementation of the model object '<em><b>Ctrl Unit67</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit67Impl#getInput__iHMIOrder <em>Input iHMI Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit67Impl#getInput__iElementStatus <em>Input iElement Status</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit67Impl#getInput__iMasterPos <em>Input iMaster Pos</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit67Impl#getOutput__oElementRol <em>Output oElement Rol</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit67Impl#getParameter__pMaxElements <em>Parameter pMax Elements</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit67Impl#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit67Impl extends wtcImpl implements CtrlUnit67 {
	/**
	 * The cached value of the '{@link #getInput__iHMIOrder() <em>Input iHMI Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iHMIOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iHMIOrder;

	/**
	 * The cached value of the '{@link #getInput__iElementStatus() <em>Input iElement Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iElementStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iElementStatus;

	/**
	 * The cached value of the '{@link #getInput__iMasterPos() <em>Input iMaster Pos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iMasterPos()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iMasterPos;

	/**
	 * The cached value of the '{@link #getOutput__oElementRol() <em>Output oElement Rol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oElementRol()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oElementRol;

	/**
	 * The cached value of the '{@link #getParameter__pMaxElements() <em>Parameter pMax Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pMaxElements()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pMaxElements;

	/**
	 * The default value of the '{@link #getBhvParam__bpMode() <em>Bhv Param bp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpMode()
	 * @generated
	 * @ordered
	 */
	protected static final String BHV_PARAM_BP_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBhvParam__bpMode() <em>Bhv Param bp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpMode()
	 * @generated
	 * @ordered
	 */
	protected String bhvParam__bpMode = BHV_PARAM_BP_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit67Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit67();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iHMIOrder() {
		if (input__iHMIOrder != null && input__iHMIOrder.eIsProxy()) {
			InternalEObject oldInput__iHMIOrder = (InternalEObject)input__iHMIOrder;
			input__iHMIOrder = (WTCInput)eResolveProxy(oldInput__iHMIOrder);
			if (input__iHMIOrder != oldInput__iHMIOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT67__INPUT_IHMI_ORDER, oldInput__iHMIOrder, input__iHMIOrder));
			}
		}
		return input__iHMIOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iHMIOrder() {
		return input__iHMIOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iHMIOrder(WTCInput newInput__iHMIOrder) {
		WTCInput oldInput__iHMIOrder = input__iHMIOrder;
		input__iHMIOrder = newInput__iHMIOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT67__INPUT_IHMI_ORDER, oldInput__iHMIOrder, input__iHMIOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iElementStatus() {
		if (input__iElementStatus != null && input__iElementStatus.eIsProxy()) {
			InternalEObject oldInput__iElementStatus = (InternalEObject)input__iElementStatus;
			input__iElementStatus = (WTCInput)eResolveProxy(oldInput__iElementStatus);
			if (input__iElementStatus != oldInput__iElementStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT67__INPUT_IELEMENT_STATUS, oldInput__iElementStatus, input__iElementStatus));
			}
		}
		return input__iElementStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iElementStatus() {
		return input__iElementStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iElementStatus(WTCInput newInput__iElementStatus) {
		WTCInput oldInput__iElementStatus = input__iElementStatus;
		input__iElementStatus = newInput__iElementStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT67__INPUT_IELEMENT_STATUS, oldInput__iElementStatus, input__iElementStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iMasterPos() {
		if (input__iMasterPos != null && input__iMasterPos.eIsProxy()) {
			InternalEObject oldInput__iMasterPos = (InternalEObject)input__iMasterPos;
			input__iMasterPos = (WTCInput)eResolveProxy(oldInput__iMasterPos);
			if (input__iMasterPos != oldInput__iMasterPos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT67__INPUT_IMASTER_POS, oldInput__iMasterPos, input__iMasterPos));
			}
		}
		return input__iMasterPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iMasterPos() {
		return input__iMasterPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iMasterPos(WTCInput newInput__iMasterPos) {
		WTCInput oldInput__iMasterPos = input__iMasterPos;
		input__iMasterPos = newInput__iMasterPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT67__INPUT_IMASTER_POS, oldInput__iMasterPos, input__iMasterPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oElementRol() {
		if (output__oElementRol != null && output__oElementRol.eIsProxy()) {
			InternalEObject oldOutput__oElementRol = (InternalEObject)output__oElementRol;
			output__oElementRol = (WTCOutput)eResolveProxy(oldOutput__oElementRol);
			if (output__oElementRol != oldOutput__oElementRol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT67__OUTPUT_OELEMENT_ROL, oldOutput__oElementRol, output__oElementRol));
			}
		}
		return output__oElementRol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oElementRol() {
		return output__oElementRol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oElementRol(WTCOutput newOutput__oElementRol) {
		WTCOutput oldOutput__oElementRol = output__oElementRol;
		output__oElementRol = newOutput__oElementRol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT67__OUTPUT_OELEMENT_ROL, oldOutput__oElementRol, output__oElementRol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pMaxElements() {
		if (parameter__pMaxElements != null && parameter__pMaxElements.eIsProxy()) {
			InternalEObject oldParameter__pMaxElements = (InternalEObject)parameter__pMaxElements;
			parameter__pMaxElements = (WTCParam)eResolveProxy(oldParameter__pMaxElements);
			if (parameter__pMaxElements != oldParameter__pMaxElements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT67__PARAMETER_PMAX_ELEMENTS, oldParameter__pMaxElements, parameter__pMaxElements));
			}
		}
		return parameter__pMaxElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pMaxElements() {
		return parameter__pMaxElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pMaxElements(WTCParam newParameter__pMaxElements) {
		WTCParam oldParameter__pMaxElements = parameter__pMaxElements;
		parameter__pMaxElements = newParameter__pMaxElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT67__PARAMETER_PMAX_ELEMENTS, oldParameter__pMaxElements, parameter__pMaxElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBhvParam__bpMode() {
		return bhvParam__bpMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBhvParam__bpMode(String newBhvParam__bpMode) {
		String oldBhvParam__bpMode = bhvParam__bpMode;
		bhvParam__bpMode = newBhvParam__bpMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT67__BHV_PARAM_BP_MODE, oldBhvParam__bpMode, bhvParam__bpMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT67__INPUT_IHMI_ORDER:
				if (resolve) return getInput__iHMIOrder();
				return basicGetInput__iHMIOrder();
			case WTSpecPackage.CTRL_UNIT67__INPUT_IELEMENT_STATUS:
				if (resolve) return getInput__iElementStatus();
				return basicGetInput__iElementStatus();
			case WTSpecPackage.CTRL_UNIT67__INPUT_IMASTER_POS:
				if (resolve) return getInput__iMasterPos();
				return basicGetInput__iMasterPos();
			case WTSpecPackage.CTRL_UNIT67__OUTPUT_OELEMENT_ROL:
				if (resolve) return getOutput__oElementRol();
				return basicGetOutput__oElementRol();
			case WTSpecPackage.CTRL_UNIT67__PARAMETER_PMAX_ELEMENTS:
				if (resolve) return getParameter__pMaxElements();
				return basicGetParameter__pMaxElements();
			case WTSpecPackage.CTRL_UNIT67__BHV_PARAM_BP_MODE:
				return getBhvParam__bpMode();
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
			case WTSpecPackage.CTRL_UNIT67__INPUT_IHMI_ORDER:
				setInput__iHMIOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT67__INPUT_IELEMENT_STATUS:
				setInput__iElementStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT67__INPUT_IMASTER_POS:
				setInput__iMasterPos((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT67__OUTPUT_OELEMENT_ROL:
				setOutput__oElementRol((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT67__PARAMETER_PMAX_ELEMENTS:
				setParameter__pMaxElements((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT67__BHV_PARAM_BP_MODE:
				setBhvParam__bpMode((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT67__INPUT_IHMI_ORDER:
				setInput__iHMIOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT67__INPUT_IELEMENT_STATUS:
				setInput__iElementStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT67__INPUT_IMASTER_POS:
				setInput__iMasterPos((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT67__OUTPUT_OELEMENT_ROL:
				setOutput__oElementRol((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT67__PARAMETER_PMAX_ELEMENTS:
				setParameter__pMaxElements((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT67__BHV_PARAM_BP_MODE:
				setBhvParam__bpMode(BHV_PARAM_BP_MODE_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT67__INPUT_IHMI_ORDER:
				return input__iHMIOrder != null;
			case WTSpecPackage.CTRL_UNIT67__INPUT_IELEMENT_STATUS:
				return input__iElementStatus != null;
			case WTSpecPackage.CTRL_UNIT67__INPUT_IMASTER_POS:
				return input__iMasterPos != null;
			case WTSpecPackage.CTRL_UNIT67__OUTPUT_OELEMENT_ROL:
				return output__oElementRol != null;
			case WTSpecPackage.CTRL_UNIT67__PARAMETER_PMAX_ELEMENTS:
				return parameter__pMaxElements != null;
			case WTSpecPackage.CTRL_UNIT67__BHV_PARAM_BP_MODE:
				return BHV_PARAM_BP_MODE_EDEFAULT == null ? bhvParam__bpMode != null : !BHV_PARAM_BP_MODE_EDEFAULT.equals(bhvParam__bpMode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (BhvParam__bpMode: ");
		result.append(bhvParam__bpMode);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit67Impl
