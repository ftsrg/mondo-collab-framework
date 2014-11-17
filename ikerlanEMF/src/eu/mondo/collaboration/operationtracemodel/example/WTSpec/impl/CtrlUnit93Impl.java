/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit93;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCParam;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit93</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit93Impl#getInput__iActualVal <em>Input iActual Val</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit93Impl#getOutput__oLastVal <em>Output oLast Val</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit93Impl#getParameter__pRateLimiter <em>Parameter pRate Limiter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit93Impl extends wtcImpl implements CtrlUnit93 {
	/**
	 * The cached value of the '{@link #getInput__iActualVal() <em>Input iActual Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iActualVal()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iActualVal;

	/**
	 * The cached value of the '{@link #getOutput__oLastVal() <em>Output oLast Val</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oLastVal()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oLastVal;

	/**
	 * The cached value of the '{@link #getParameter__pRateLimiter() <em>Parameter pRate Limiter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pRateLimiter()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pRateLimiter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit93Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit93();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iActualVal() {
		if (input__iActualVal != null && input__iActualVal.eIsProxy()) {
			InternalEObject oldInput__iActualVal = (InternalEObject)input__iActualVal;
			input__iActualVal = (WTCInput)eResolveProxy(oldInput__iActualVal);
			if (input__iActualVal != oldInput__iActualVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT93__INPUT_IACTUAL_VAL, oldInput__iActualVal, input__iActualVal));
			}
		}
		return input__iActualVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iActualVal() {
		return input__iActualVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iActualVal(WTCInput newInput__iActualVal) {
		WTCInput oldInput__iActualVal = input__iActualVal;
		input__iActualVal = newInput__iActualVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT93__INPUT_IACTUAL_VAL, oldInput__iActualVal, input__iActualVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oLastVal() {
		if (output__oLastVal != null && output__oLastVal.eIsProxy()) {
			InternalEObject oldOutput__oLastVal = (InternalEObject)output__oLastVal;
			output__oLastVal = (WTCOutput)eResolveProxy(oldOutput__oLastVal);
			if (output__oLastVal != oldOutput__oLastVal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT93__OUTPUT_OLAST_VAL, oldOutput__oLastVal, output__oLastVal));
			}
		}
		return output__oLastVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oLastVal() {
		return output__oLastVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oLastVal(WTCOutput newOutput__oLastVal) {
		WTCOutput oldOutput__oLastVal = output__oLastVal;
		output__oLastVal = newOutput__oLastVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT93__OUTPUT_OLAST_VAL, oldOutput__oLastVal, output__oLastVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pRateLimiter() {
		if (parameter__pRateLimiter != null && parameter__pRateLimiter.eIsProxy()) {
			InternalEObject oldParameter__pRateLimiter = (InternalEObject)parameter__pRateLimiter;
			parameter__pRateLimiter = (WTCParam)eResolveProxy(oldParameter__pRateLimiter);
			if (parameter__pRateLimiter != oldParameter__pRateLimiter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT93__PARAMETER_PRATE_LIMITER, oldParameter__pRateLimiter, parameter__pRateLimiter));
			}
		}
		return parameter__pRateLimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pRateLimiter() {
		return parameter__pRateLimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pRateLimiter(WTCParam newParameter__pRateLimiter) {
		WTCParam oldParameter__pRateLimiter = parameter__pRateLimiter;
		parameter__pRateLimiter = newParameter__pRateLimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT93__PARAMETER_PRATE_LIMITER, oldParameter__pRateLimiter, parameter__pRateLimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT93__INPUT_IACTUAL_VAL:
				if (resolve) return getInput__iActualVal();
				return basicGetInput__iActualVal();
			case WTSpecPackage.CTRL_UNIT93__OUTPUT_OLAST_VAL:
				if (resolve) return getOutput__oLastVal();
				return basicGetOutput__oLastVal();
			case WTSpecPackage.CTRL_UNIT93__PARAMETER_PRATE_LIMITER:
				if (resolve) return getParameter__pRateLimiter();
				return basicGetParameter__pRateLimiter();
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
			case WTSpecPackage.CTRL_UNIT93__INPUT_IACTUAL_VAL:
				setInput__iActualVal((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT93__OUTPUT_OLAST_VAL:
				setOutput__oLastVal((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT93__PARAMETER_PRATE_LIMITER:
				setParameter__pRateLimiter((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT93__INPUT_IACTUAL_VAL:
				setInput__iActualVal((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT93__OUTPUT_OLAST_VAL:
				setOutput__oLastVal((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT93__PARAMETER_PRATE_LIMITER:
				setParameter__pRateLimiter((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT93__INPUT_IACTUAL_VAL:
				return input__iActualVal != null;
			case WTSpecPackage.CTRL_UNIT93__OUTPUT_OLAST_VAL:
				return output__oLastVal != null;
			case WTSpecPackage.CTRL_UNIT93__PARAMETER_PRATE_LIMITER:
				return parameter__pRateLimiter != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit93Impl
