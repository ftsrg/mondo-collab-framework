/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit26;
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
 * An implementation of the model object '<em><b>Ctrl Unit26</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit26Impl#getInput__iCounter <em>Input iCounter</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit26Impl#getInput__iActivator <em>Input iActivator</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit26Impl#getOutput__oCounter <em>Output oCounter</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit26Impl#getOutput__oLimitReached <em>Output oLimit Reached</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit26Impl#getParameter__pLimit <em>Parameter pLimit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit26Impl extends wtcImpl implements CtrlUnit26 {
	/**
	 * The cached value of the '{@link #getInput__iCounter() <em>Input iCounter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iCounter()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iCounter;

	/**
	 * The cached value of the '{@link #getInput__iActivator() <em>Input iActivator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iActivator()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iActivator;

	/**
	 * The cached value of the '{@link #getOutput__oCounter() <em>Output oCounter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oCounter()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oCounter;

	/**
	 * The cached value of the '{@link #getOutput__oLimitReached() <em>Output oLimit Reached</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oLimitReached()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oLimitReached;

	/**
	 * The cached value of the '{@link #getParameter__pLimit() <em>Parameter pLimit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pLimit()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pLimit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit26Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit26();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iCounter() {
		if (input__iCounter != null && input__iCounter.eIsProxy()) {
			InternalEObject oldInput__iCounter = (InternalEObject)input__iCounter;
			input__iCounter = (WTCInput)eResolveProxy(oldInput__iCounter);
			if (input__iCounter != oldInput__iCounter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT26__INPUT_ICOUNTER, oldInput__iCounter, input__iCounter));
			}
		}
		return input__iCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iCounter() {
		return input__iCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iCounter(WTCInput newInput__iCounter) {
		WTCInput oldInput__iCounter = input__iCounter;
		input__iCounter = newInput__iCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT26__INPUT_ICOUNTER, oldInput__iCounter, input__iCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iActivator() {
		if (input__iActivator != null && input__iActivator.eIsProxy()) {
			InternalEObject oldInput__iActivator = (InternalEObject)input__iActivator;
			input__iActivator = (WTCInput)eResolveProxy(oldInput__iActivator);
			if (input__iActivator != oldInput__iActivator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT26__INPUT_IACTIVATOR, oldInput__iActivator, input__iActivator));
			}
		}
		return input__iActivator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iActivator() {
		return input__iActivator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iActivator(WTCInput newInput__iActivator) {
		WTCInput oldInput__iActivator = input__iActivator;
		input__iActivator = newInput__iActivator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT26__INPUT_IACTIVATOR, oldInput__iActivator, input__iActivator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oCounter() {
		if (output__oCounter != null && output__oCounter.eIsProxy()) {
			InternalEObject oldOutput__oCounter = (InternalEObject)output__oCounter;
			output__oCounter = (WTCOutput)eResolveProxy(oldOutput__oCounter);
			if (output__oCounter != oldOutput__oCounter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT26__OUTPUT_OCOUNTER, oldOutput__oCounter, output__oCounter));
			}
		}
		return output__oCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oCounter() {
		return output__oCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oCounter(WTCOutput newOutput__oCounter) {
		WTCOutput oldOutput__oCounter = output__oCounter;
		output__oCounter = newOutput__oCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT26__OUTPUT_OCOUNTER, oldOutput__oCounter, output__oCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oLimitReached() {
		if (output__oLimitReached != null && output__oLimitReached.eIsProxy()) {
			InternalEObject oldOutput__oLimitReached = (InternalEObject)output__oLimitReached;
			output__oLimitReached = (WTCOutput)eResolveProxy(oldOutput__oLimitReached);
			if (output__oLimitReached != oldOutput__oLimitReached) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT26__OUTPUT_OLIMIT_REACHED, oldOutput__oLimitReached, output__oLimitReached));
			}
		}
		return output__oLimitReached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oLimitReached() {
		return output__oLimitReached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oLimitReached(WTCOutput newOutput__oLimitReached) {
		WTCOutput oldOutput__oLimitReached = output__oLimitReached;
		output__oLimitReached = newOutput__oLimitReached;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT26__OUTPUT_OLIMIT_REACHED, oldOutput__oLimitReached, output__oLimitReached));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pLimit() {
		if (parameter__pLimit != null && parameter__pLimit.eIsProxy()) {
			InternalEObject oldParameter__pLimit = (InternalEObject)parameter__pLimit;
			parameter__pLimit = (WTCParam)eResolveProxy(oldParameter__pLimit);
			if (parameter__pLimit != oldParameter__pLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT26__PARAMETER_PLIMIT, oldParameter__pLimit, parameter__pLimit));
			}
		}
		return parameter__pLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pLimit() {
		return parameter__pLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pLimit(WTCParam newParameter__pLimit) {
		WTCParam oldParameter__pLimit = parameter__pLimit;
		parameter__pLimit = newParameter__pLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT26__PARAMETER_PLIMIT, oldParameter__pLimit, parameter__pLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT26__INPUT_ICOUNTER:
				if (resolve) return getInput__iCounter();
				return basicGetInput__iCounter();
			case WTSpecPackage.CTRL_UNIT26__INPUT_IACTIVATOR:
				if (resolve) return getInput__iActivator();
				return basicGetInput__iActivator();
			case WTSpecPackage.CTRL_UNIT26__OUTPUT_OCOUNTER:
				if (resolve) return getOutput__oCounter();
				return basicGetOutput__oCounter();
			case WTSpecPackage.CTRL_UNIT26__OUTPUT_OLIMIT_REACHED:
				if (resolve) return getOutput__oLimitReached();
				return basicGetOutput__oLimitReached();
			case WTSpecPackage.CTRL_UNIT26__PARAMETER_PLIMIT:
				if (resolve) return getParameter__pLimit();
				return basicGetParameter__pLimit();
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
			case WTSpecPackage.CTRL_UNIT26__INPUT_ICOUNTER:
				setInput__iCounter((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT26__INPUT_IACTIVATOR:
				setInput__iActivator((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT26__OUTPUT_OCOUNTER:
				setOutput__oCounter((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT26__OUTPUT_OLIMIT_REACHED:
				setOutput__oLimitReached((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT26__PARAMETER_PLIMIT:
				setParameter__pLimit((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT26__INPUT_ICOUNTER:
				setInput__iCounter((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT26__INPUT_IACTIVATOR:
				setInput__iActivator((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT26__OUTPUT_OCOUNTER:
				setOutput__oCounter((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT26__OUTPUT_OLIMIT_REACHED:
				setOutput__oLimitReached((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT26__PARAMETER_PLIMIT:
				setParameter__pLimit((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT26__INPUT_ICOUNTER:
				return input__iCounter != null;
			case WTSpecPackage.CTRL_UNIT26__INPUT_IACTIVATOR:
				return input__iActivator != null;
			case WTSpecPackage.CTRL_UNIT26__OUTPUT_OCOUNTER:
				return output__oCounter != null;
			case WTSpecPackage.CTRL_UNIT26__OUTPUT_OLIMIT_REACHED:
				return output__oLimitReached != null;
			case WTSpecPackage.CTRL_UNIT26__PARAMETER_PLIMIT:
				return parameter__pLimit != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit26Impl
