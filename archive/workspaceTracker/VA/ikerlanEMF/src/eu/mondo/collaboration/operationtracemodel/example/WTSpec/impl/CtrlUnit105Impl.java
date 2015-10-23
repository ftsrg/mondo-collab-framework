/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit105;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit105</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit105Impl#getInput__iEntryToCount <em>Input iEntry To Count</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit105Impl#getInput__iResetPartial <em>Input iReset Partial</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit105Impl#getOutput__oSecondsOnTotal <em>Output oSeconds On Total</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit105Impl#getOutput__oSecondsOnPartial <em>Output oSeconds On Partial</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit105Impl extends wtcImpl implements CtrlUnit105 {
	/**
	 * The cached value of the '{@link #getInput__iEntryToCount() <em>Input iEntry To Count</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iEntryToCount()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iEntryToCount;

	/**
	 * The cached value of the '{@link #getInput__iResetPartial() <em>Input iReset Partial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iResetPartial()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iResetPartial;

	/**
	 * The cached value of the '{@link #getOutput__oSecondsOnTotal() <em>Output oSeconds On Total</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oSecondsOnTotal()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oSecondsOnTotal;

	/**
	 * The cached value of the '{@link #getOutput__oSecondsOnPartial() <em>Output oSeconds On Partial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oSecondsOnPartial()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oSecondsOnPartial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit105Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit105();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iEntryToCount() {
		if (input__iEntryToCount != null && input__iEntryToCount.eIsProxy()) {
			InternalEObject oldInput__iEntryToCount = (InternalEObject)input__iEntryToCount;
			input__iEntryToCount = (WTCInput)eResolveProxy(oldInput__iEntryToCount);
			if (input__iEntryToCount != oldInput__iEntryToCount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT105__INPUT_IENTRY_TO_COUNT, oldInput__iEntryToCount, input__iEntryToCount));
			}
		}
		return input__iEntryToCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iEntryToCount() {
		return input__iEntryToCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iEntryToCount(WTCInput newInput__iEntryToCount) {
		WTCInput oldInput__iEntryToCount = input__iEntryToCount;
		input__iEntryToCount = newInput__iEntryToCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT105__INPUT_IENTRY_TO_COUNT, oldInput__iEntryToCount, input__iEntryToCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iResetPartial() {
		if (input__iResetPartial != null && input__iResetPartial.eIsProxy()) {
			InternalEObject oldInput__iResetPartial = (InternalEObject)input__iResetPartial;
			input__iResetPartial = (WTCInput)eResolveProxy(oldInput__iResetPartial);
			if (input__iResetPartial != oldInput__iResetPartial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT105__INPUT_IRESET_PARTIAL, oldInput__iResetPartial, input__iResetPartial));
			}
		}
		return input__iResetPartial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iResetPartial() {
		return input__iResetPartial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iResetPartial(WTCInput newInput__iResetPartial) {
		WTCInput oldInput__iResetPartial = input__iResetPartial;
		input__iResetPartial = newInput__iResetPartial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT105__INPUT_IRESET_PARTIAL, oldInput__iResetPartial, input__iResetPartial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oSecondsOnTotal() {
		if (output__oSecondsOnTotal != null && output__oSecondsOnTotal.eIsProxy()) {
			InternalEObject oldOutput__oSecondsOnTotal = (InternalEObject)output__oSecondsOnTotal;
			output__oSecondsOnTotal = (WTCOutput)eResolveProxy(oldOutput__oSecondsOnTotal);
			if (output__oSecondsOnTotal != oldOutput__oSecondsOnTotal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT105__OUTPUT_OSECONDS_ON_TOTAL, oldOutput__oSecondsOnTotal, output__oSecondsOnTotal));
			}
		}
		return output__oSecondsOnTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oSecondsOnTotal() {
		return output__oSecondsOnTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oSecondsOnTotal(WTCOutput newOutput__oSecondsOnTotal) {
		WTCOutput oldOutput__oSecondsOnTotal = output__oSecondsOnTotal;
		output__oSecondsOnTotal = newOutput__oSecondsOnTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT105__OUTPUT_OSECONDS_ON_TOTAL, oldOutput__oSecondsOnTotal, output__oSecondsOnTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oSecondsOnPartial() {
		if (output__oSecondsOnPartial != null && output__oSecondsOnPartial.eIsProxy()) {
			InternalEObject oldOutput__oSecondsOnPartial = (InternalEObject)output__oSecondsOnPartial;
			output__oSecondsOnPartial = (WTCOutput)eResolveProxy(oldOutput__oSecondsOnPartial);
			if (output__oSecondsOnPartial != oldOutput__oSecondsOnPartial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT105__OUTPUT_OSECONDS_ON_PARTIAL, oldOutput__oSecondsOnPartial, output__oSecondsOnPartial));
			}
		}
		return output__oSecondsOnPartial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oSecondsOnPartial() {
		return output__oSecondsOnPartial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oSecondsOnPartial(WTCOutput newOutput__oSecondsOnPartial) {
		WTCOutput oldOutput__oSecondsOnPartial = output__oSecondsOnPartial;
		output__oSecondsOnPartial = newOutput__oSecondsOnPartial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT105__OUTPUT_OSECONDS_ON_PARTIAL, oldOutput__oSecondsOnPartial, output__oSecondsOnPartial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT105__INPUT_IENTRY_TO_COUNT:
				if (resolve) return getInput__iEntryToCount();
				return basicGetInput__iEntryToCount();
			case WTSpecPackage.CTRL_UNIT105__INPUT_IRESET_PARTIAL:
				if (resolve) return getInput__iResetPartial();
				return basicGetInput__iResetPartial();
			case WTSpecPackage.CTRL_UNIT105__OUTPUT_OSECONDS_ON_TOTAL:
				if (resolve) return getOutput__oSecondsOnTotal();
				return basicGetOutput__oSecondsOnTotal();
			case WTSpecPackage.CTRL_UNIT105__OUTPUT_OSECONDS_ON_PARTIAL:
				if (resolve) return getOutput__oSecondsOnPartial();
				return basicGetOutput__oSecondsOnPartial();
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
			case WTSpecPackage.CTRL_UNIT105__INPUT_IENTRY_TO_COUNT:
				setInput__iEntryToCount((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT105__INPUT_IRESET_PARTIAL:
				setInput__iResetPartial((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT105__OUTPUT_OSECONDS_ON_TOTAL:
				setOutput__oSecondsOnTotal((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT105__OUTPUT_OSECONDS_ON_PARTIAL:
				setOutput__oSecondsOnPartial((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT105__INPUT_IENTRY_TO_COUNT:
				setInput__iEntryToCount((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT105__INPUT_IRESET_PARTIAL:
				setInput__iResetPartial((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT105__OUTPUT_OSECONDS_ON_TOTAL:
				setOutput__oSecondsOnTotal((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT105__OUTPUT_OSECONDS_ON_PARTIAL:
				setOutput__oSecondsOnPartial((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT105__INPUT_IENTRY_TO_COUNT:
				return input__iEntryToCount != null;
			case WTSpecPackage.CTRL_UNIT105__INPUT_IRESET_PARTIAL:
				return input__iResetPartial != null;
			case WTSpecPackage.CTRL_UNIT105__OUTPUT_OSECONDS_ON_TOTAL:
				return output__oSecondsOnTotal != null;
			case WTSpecPackage.CTRL_UNIT105__OUTPUT_OSECONDS_ON_PARTIAL:
				return output__oSecondsOnPartial != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit105Impl
