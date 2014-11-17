/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit27;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCParam;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit27</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit27Impl#getInput__iOrder <em>Input iOrder</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit27Impl#getInput__iFailure <em>Input iFailure</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit27Impl#getOutput__oOrder <em>Output oOrder</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit27Impl#getOutput__oCounter <em>Output oCounter</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit27Impl#getParameter__pMaxCount <em>Parameter pMax Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit27Impl extends wtcImpl implements CtrlUnit27 {
	/**
	 * The cached value of the '{@link #getInput__iOrder() <em>Input iOrder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iOrder;

	/**
	 * The cached value of the '{@link #getInput__iFailure() <em>Input iFailure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iFailure()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iFailure;

	/**
	 * The cached value of the '{@link #getOutput__oOrder() <em>Output oOrder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOrder;

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
	 * The cached value of the '{@link #getParameter__pMaxCount() <em>Parameter pMax Count</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pMaxCount()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pMaxCount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit27Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit27();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iOrder() {
		if (input__iOrder != null && input__iOrder.eIsProxy()) {
			InternalEObject oldInput__iOrder = (InternalEObject)input__iOrder;
			input__iOrder = (WTCInput)eResolveProxy(oldInput__iOrder);
			if (input__iOrder != oldInput__iOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT27__INPUT_IORDER, oldInput__iOrder, input__iOrder));
			}
		}
		return input__iOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iOrder() {
		return input__iOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iOrder(WTCInput newInput__iOrder) {
		WTCInput oldInput__iOrder = input__iOrder;
		input__iOrder = newInput__iOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT27__INPUT_IORDER, oldInput__iOrder, input__iOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iFailure() {
		if (input__iFailure != null && input__iFailure.eIsProxy()) {
			InternalEObject oldInput__iFailure = (InternalEObject)input__iFailure;
			input__iFailure = (WTCInput)eResolveProxy(oldInput__iFailure);
			if (input__iFailure != oldInput__iFailure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT27__INPUT_IFAILURE, oldInput__iFailure, input__iFailure));
			}
		}
		return input__iFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iFailure() {
		return input__iFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iFailure(WTCInput newInput__iFailure) {
		WTCInput oldInput__iFailure = input__iFailure;
		input__iFailure = newInput__iFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT27__INPUT_IFAILURE, oldInput__iFailure, input__iFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOrder() {
		if (output__oOrder != null && output__oOrder.eIsProxy()) {
			InternalEObject oldOutput__oOrder = (InternalEObject)output__oOrder;
			output__oOrder = (WTCOutput)eResolveProxy(oldOutput__oOrder);
			if (output__oOrder != oldOutput__oOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT27__OUTPUT_OORDER, oldOutput__oOrder, output__oOrder));
			}
		}
		return output__oOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOrder() {
		return output__oOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOrder(WTCOutput newOutput__oOrder) {
		WTCOutput oldOutput__oOrder = output__oOrder;
		output__oOrder = newOutput__oOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT27__OUTPUT_OORDER, oldOutput__oOrder, output__oOrder));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT27__OUTPUT_OCOUNTER, oldOutput__oCounter, output__oCounter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT27__OUTPUT_OCOUNTER, oldOutput__oCounter, output__oCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pMaxCount() {
		if (parameter__pMaxCount != null && parameter__pMaxCount.eIsProxy()) {
			InternalEObject oldParameter__pMaxCount = (InternalEObject)parameter__pMaxCount;
			parameter__pMaxCount = (WTCParam)eResolveProxy(oldParameter__pMaxCount);
			if (parameter__pMaxCount != oldParameter__pMaxCount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT27__PARAMETER_PMAX_COUNT, oldParameter__pMaxCount, parameter__pMaxCount));
			}
		}
		return parameter__pMaxCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pMaxCount() {
		return parameter__pMaxCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pMaxCount(WTCParam newParameter__pMaxCount) {
		WTCParam oldParameter__pMaxCount = parameter__pMaxCount;
		parameter__pMaxCount = newParameter__pMaxCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT27__PARAMETER_PMAX_COUNT, oldParameter__pMaxCount, parameter__pMaxCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT27__INPUT_IORDER:
				if (resolve) return getInput__iOrder();
				return basicGetInput__iOrder();
			case WTSpecPackage.CTRL_UNIT27__INPUT_IFAILURE:
				if (resolve) return getInput__iFailure();
				return basicGetInput__iFailure();
			case WTSpecPackage.CTRL_UNIT27__OUTPUT_OORDER:
				if (resolve) return getOutput__oOrder();
				return basicGetOutput__oOrder();
			case WTSpecPackage.CTRL_UNIT27__OUTPUT_OCOUNTER:
				if (resolve) return getOutput__oCounter();
				return basicGetOutput__oCounter();
			case WTSpecPackage.CTRL_UNIT27__PARAMETER_PMAX_COUNT:
				if (resolve) return getParameter__pMaxCount();
				return basicGetParameter__pMaxCount();
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
			case WTSpecPackage.CTRL_UNIT27__INPUT_IORDER:
				setInput__iOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT27__INPUT_IFAILURE:
				setInput__iFailure((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT27__OUTPUT_OORDER:
				setOutput__oOrder((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT27__OUTPUT_OCOUNTER:
				setOutput__oCounter((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT27__PARAMETER_PMAX_COUNT:
				setParameter__pMaxCount((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT27__INPUT_IORDER:
				setInput__iOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT27__INPUT_IFAILURE:
				setInput__iFailure((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT27__OUTPUT_OORDER:
				setOutput__oOrder((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT27__OUTPUT_OCOUNTER:
				setOutput__oCounter((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT27__PARAMETER_PMAX_COUNT:
				setParameter__pMaxCount((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT27__INPUT_IORDER:
				return input__iOrder != null;
			case WTSpecPackage.CTRL_UNIT27__INPUT_IFAILURE:
				return input__iFailure != null;
			case WTSpecPackage.CTRL_UNIT27__OUTPUT_OORDER:
				return output__oOrder != null;
			case WTSpecPackage.CTRL_UNIT27__OUTPUT_OCOUNTER:
				return output__oCounter != null;
			case WTSpecPackage.CTRL_UNIT27__PARAMETER_PMAX_COUNT:
				return parameter__pMaxCount != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit27Impl
