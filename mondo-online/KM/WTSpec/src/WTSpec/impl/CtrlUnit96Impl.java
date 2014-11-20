/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit96;
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
 * An implementation of the model object '<em><b>Ctrl Unit96</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit96Impl#getInput__iHMIDisableOrder <em>Input iHMI Disable Order</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit96Impl#getInput__iElementStatus <em>Input iElement Status</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit96Impl#getOutput__oElementRol <em>Output oElement Rol</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit96Impl#getParameter__pMaxElements <em>Parameter pMax Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit96Impl extends wtcImpl implements CtrlUnit96 {
	/**
	 * The cached value of the '{@link #getInput__iHMIDisableOrder() <em>Input iHMI Disable Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iHMIDisableOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iHMIDisableOrder;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit96Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit96();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iHMIDisableOrder() {
		if (input__iHMIDisableOrder != null && input__iHMIDisableOrder.eIsProxy()) {
			InternalEObject oldInput__iHMIDisableOrder = (InternalEObject)input__iHMIDisableOrder;
			input__iHMIDisableOrder = (WTCInput)eResolveProxy(oldInput__iHMIDisableOrder);
			if (input__iHMIDisableOrder != oldInput__iHMIDisableOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT96__INPUT_IHMI_DISABLE_ORDER, oldInput__iHMIDisableOrder, input__iHMIDisableOrder));
			}
		}
		return input__iHMIDisableOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iHMIDisableOrder() {
		return input__iHMIDisableOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iHMIDisableOrder(WTCInput newInput__iHMIDisableOrder) {
		WTCInput oldInput__iHMIDisableOrder = input__iHMIDisableOrder;
		input__iHMIDisableOrder = newInput__iHMIDisableOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT96__INPUT_IHMI_DISABLE_ORDER, oldInput__iHMIDisableOrder, input__iHMIDisableOrder));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT96__INPUT_IELEMENT_STATUS, oldInput__iElementStatus, input__iElementStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT96__INPUT_IELEMENT_STATUS, oldInput__iElementStatus, input__iElementStatus));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT96__OUTPUT_OELEMENT_ROL, oldOutput__oElementRol, output__oElementRol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT96__OUTPUT_OELEMENT_ROL, oldOutput__oElementRol, output__oElementRol));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT96__PARAMETER_PMAX_ELEMENTS, oldParameter__pMaxElements, parameter__pMaxElements));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT96__PARAMETER_PMAX_ELEMENTS, oldParameter__pMaxElements, parameter__pMaxElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT96__INPUT_IHMI_DISABLE_ORDER:
				if (resolve) return getInput__iHMIDisableOrder();
				return basicGetInput__iHMIDisableOrder();
			case WTSpecPackage.CTRL_UNIT96__INPUT_IELEMENT_STATUS:
				if (resolve) return getInput__iElementStatus();
				return basicGetInput__iElementStatus();
			case WTSpecPackage.CTRL_UNIT96__OUTPUT_OELEMENT_ROL:
				if (resolve) return getOutput__oElementRol();
				return basicGetOutput__oElementRol();
			case WTSpecPackage.CTRL_UNIT96__PARAMETER_PMAX_ELEMENTS:
				if (resolve) return getParameter__pMaxElements();
				return basicGetParameter__pMaxElements();
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
			case WTSpecPackage.CTRL_UNIT96__INPUT_IHMI_DISABLE_ORDER:
				setInput__iHMIDisableOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT96__INPUT_IELEMENT_STATUS:
				setInput__iElementStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT96__OUTPUT_OELEMENT_ROL:
				setOutput__oElementRol((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT96__PARAMETER_PMAX_ELEMENTS:
				setParameter__pMaxElements((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT96__INPUT_IHMI_DISABLE_ORDER:
				setInput__iHMIDisableOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT96__INPUT_IELEMENT_STATUS:
				setInput__iElementStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT96__OUTPUT_OELEMENT_ROL:
				setOutput__oElementRol((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT96__PARAMETER_PMAX_ELEMENTS:
				setParameter__pMaxElements((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT96__INPUT_IHMI_DISABLE_ORDER:
				return input__iHMIDisableOrder != null;
			case WTSpecPackage.CTRL_UNIT96__INPUT_IELEMENT_STATUS:
				return input__iElementStatus != null;
			case WTSpecPackage.CTRL_UNIT96__OUTPUT_OELEMENT_ROL:
				return output__oElementRol != null;
			case WTSpecPackage.CTRL_UNIT96__PARAMETER_PMAX_ELEMENTS:
				return parameter__pMaxElements != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit96Impl
