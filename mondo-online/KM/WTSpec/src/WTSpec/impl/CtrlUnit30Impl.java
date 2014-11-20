/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit30;
import WTSpec.WTCInput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit30</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit30Impl#getInput__iDigitalInput <em>Input iDigital Input</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit30Impl#getInput__iOffOrder <em>Input iOff Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit30Impl extends wtcImpl implements CtrlUnit30 {
	/**
	 * The cached value of the '{@link #getInput__iDigitalInput() <em>Input iDigital Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iDigitalInput()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iDigitalInput;

	/**
	 * The cached value of the '{@link #getInput__iOffOrder() <em>Input iOff Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iOffOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iOffOrder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit30Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit30();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iDigitalInput() {
		if (input__iDigitalInput != null && input__iDigitalInput.eIsProxy()) {
			InternalEObject oldInput__iDigitalInput = (InternalEObject)input__iDigitalInput;
			input__iDigitalInput = (WTCInput)eResolveProxy(oldInput__iDigitalInput);
			if (input__iDigitalInput != oldInput__iDigitalInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT30__INPUT_IDIGITAL_INPUT, oldInput__iDigitalInput, input__iDigitalInput));
			}
		}
		return input__iDigitalInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iDigitalInput() {
		return input__iDigitalInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iDigitalInput(WTCInput newInput__iDigitalInput) {
		WTCInput oldInput__iDigitalInput = input__iDigitalInput;
		input__iDigitalInput = newInput__iDigitalInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT30__INPUT_IDIGITAL_INPUT, oldInput__iDigitalInput, input__iDigitalInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iOffOrder() {
		if (input__iOffOrder != null && input__iOffOrder.eIsProxy()) {
			InternalEObject oldInput__iOffOrder = (InternalEObject)input__iOffOrder;
			input__iOffOrder = (WTCInput)eResolveProxy(oldInput__iOffOrder);
			if (input__iOffOrder != oldInput__iOffOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT30__INPUT_IOFF_ORDER, oldInput__iOffOrder, input__iOffOrder));
			}
		}
		return input__iOffOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iOffOrder() {
		return input__iOffOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iOffOrder(WTCInput newInput__iOffOrder) {
		WTCInput oldInput__iOffOrder = input__iOffOrder;
		input__iOffOrder = newInput__iOffOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT30__INPUT_IOFF_ORDER, oldInput__iOffOrder, input__iOffOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT30__INPUT_IDIGITAL_INPUT:
				if (resolve) return getInput__iDigitalInput();
				return basicGetInput__iDigitalInput();
			case WTSpecPackage.CTRL_UNIT30__INPUT_IOFF_ORDER:
				if (resolve) return getInput__iOffOrder();
				return basicGetInput__iOffOrder();
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
			case WTSpecPackage.CTRL_UNIT30__INPUT_IDIGITAL_INPUT:
				setInput__iDigitalInput((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT30__INPUT_IOFF_ORDER:
				setInput__iOffOrder((WTCInput)newValue);
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
			case WTSpecPackage.CTRL_UNIT30__INPUT_IDIGITAL_INPUT:
				setInput__iDigitalInput((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT30__INPUT_IOFF_ORDER:
				setInput__iOffOrder((WTCInput)null);
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
			case WTSpecPackage.CTRL_UNIT30__INPUT_IDIGITAL_INPUT:
				return input__iDigitalInput != null;
			case WTSpecPackage.CTRL_UNIT30__INPUT_IOFF_ORDER:
				return input__iOffOrder != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit30Impl
