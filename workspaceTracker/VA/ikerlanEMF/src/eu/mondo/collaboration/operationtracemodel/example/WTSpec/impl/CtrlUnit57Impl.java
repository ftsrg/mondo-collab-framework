/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit57;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCParam;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit57</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit57Impl#getInput__iUp <em>Input iUp</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit57Impl#getInput__iDown <em>Input iDown</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit57Impl#getOutput__oAnalogOut <em>Output oAnalog Out</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit57Impl#getParameter__pParam <em>Parameter pParam</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit57Impl#getParameter__pMax <em>Parameter pMax</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit57Impl#getParameter__pMin <em>Parameter pMin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit57Impl extends wtcImpl implements CtrlUnit57 {
	/**
	 * The cached value of the '{@link #getInput__iUp() <em>Input iUp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iUp()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iUp;

	/**
	 * The cached value of the '{@link #getInput__iDown() <em>Input iDown</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iDown()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iDown;

	/**
	 * The cached value of the '{@link #getOutput__oAnalogOut() <em>Output oAnalog Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oAnalogOut()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oAnalogOut;

	/**
	 * The cached value of the '{@link #getParameter__pParam() <em>Parameter pParam</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pParam()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pParam;

	/**
	 * The cached value of the '{@link #getParameter__pMax() <em>Parameter pMax</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pMax()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pMax;

	/**
	 * The cached value of the '{@link #getParameter__pMin() <em>Parameter pMin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pMin()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pMin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit57Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit57();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iUp() {
		if (input__iUp != null && input__iUp.eIsProxy()) {
			InternalEObject oldInput__iUp = (InternalEObject)input__iUp;
			input__iUp = (WTCInput)eResolveProxy(oldInput__iUp);
			if (input__iUp != oldInput__iUp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT57__INPUT_IUP, oldInput__iUp, input__iUp));
			}
		}
		return input__iUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iUp() {
		return input__iUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iUp(WTCInput newInput__iUp) {
		WTCInput oldInput__iUp = input__iUp;
		input__iUp = newInput__iUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT57__INPUT_IUP, oldInput__iUp, input__iUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iDown() {
		if (input__iDown != null && input__iDown.eIsProxy()) {
			InternalEObject oldInput__iDown = (InternalEObject)input__iDown;
			input__iDown = (WTCInput)eResolveProxy(oldInput__iDown);
			if (input__iDown != oldInput__iDown) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT57__INPUT_IDOWN, oldInput__iDown, input__iDown));
			}
		}
		return input__iDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iDown() {
		return input__iDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iDown(WTCInput newInput__iDown) {
		WTCInput oldInput__iDown = input__iDown;
		input__iDown = newInput__iDown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT57__INPUT_IDOWN, oldInput__iDown, input__iDown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oAnalogOut() {
		if (output__oAnalogOut != null && output__oAnalogOut.eIsProxy()) {
			InternalEObject oldOutput__oAnalogOut = (InternalEObject)output__oAnalogOut;
			output__oAnalogOut = (WTCOutput)eResolveProxy(oldOutput__oAnalogOut);
			if (output__oAnalogOut != oldOutput__oAnalogOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT57__OUTPUT_OANALOG_OUT, oldOutput__oAnalogOut, output__oAnalogOut));
			}
		}
		return output__oAnalogOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oAnalogOut() {
		return output__oAnalogOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oAnalogOut(WTCOutput newOutput__oAnalogOut) {
		WTCOutput oldOutput__oAnalogOut = output__oAnalogOut;
		output__oAnalogOut = newOutput__oAnalogOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT57__OUTPUT_OANALOG_OUT, oldOutput__oAnalogOut, output__oAnalogOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pParam() {
		if (parameter__pParam != null && parameter__pParam.eIsProxy()) {
			InternalEObject oldParameter__pParam = (InternalEObject)parameter__pParam;
			parameter__pParam = (WTCParam)eResolveProxy(oldParameter__pParam);
			if (parameter__pParam != oldParameter__pParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT57__PARAMETER_PPARAM, oldParameter__pParam, parameter__pParam));
			}
		}
		return parameter__pParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pParam() {
		return parameter__pParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pParam(WTCParam newParameter__pParam) {
		WTCParam oldParameter__pParam = parameter__pParam;
		parameter__pParam = newParameter__pParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT57__PARAMETER_PPARAM, oldParameter__pParam, parameter__pParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pMax() {
		if (parameter__pMax != null && parameter__pMax.eIsProxy()) {
			InternalEObject oldParameter__pMax = (InternalEObject)parameter__pMax;
			parameter__pMax = (WTCParam)eResolveProxy(oldParameter__pMax);
			if (parameter__pMax != oldParameter__pMax) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT57__PARAMETER_PMAX, oldParameter__pMax, parameter__pMax));
			}
		}
		return parameter__pMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pMax() {
		return parameter__pMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pMax(WTCParam newParameter__pMax) {
		WTCParam oldParameter__pMax = parameter__pMax;
		parameter__pMax = newParameter__pMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT57__PARAMETER_PMAX, oldParameter__pMax, parameter__pMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pMin() {
		if (parameter__pMin != null && parameter__pMin.eIsProxy()) {
			InternalEObject oldParameter__pMin = (InternalEObject)parameter__pMin;
			parameter__pMin = (WTCParam)eResolveProxy(oldParameter__pMin);
			if (parameter__pMin != oldParameter__pMin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT57__PARAMETER_PMIN, oldParameter__pMin, parameter__pMin));
			}
		}
		return parameter__pMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pMin() {
		return parameter__pMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pMin(WTCParam newParameter__pMin) {
		WTCParam oldParameter__pMin = parameter__pMin;
		parameter__pMin = newParameter__pMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT57__PARAMETER_PMIN, oldParameter__pMin, parameter__pMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT57__INPUT_IUP:
				if (resolve) return getInput__iUp();
				return basicGetInput__iUp();
			case WTSpecPackage.CTRL_UNIT57__INPUT_IDOWN:
				if (resolve) return getInput__iDown();
				return basicGetInput__iDown();
			case WTSpecPackage.CTRL_UNIT57__OUTPUT_OANALOG_OUT:
				if (resolve) return getOutput__oAnalogOut();
				return basicGetOutput__oAnalogOut();
			case WTSpecPackage.CTRL_UNIT57__PARAMETER_PPARAM:
				if (resolve) return getParameter__pParam();
				return basicGetParameter__pParam();
			case WTSpecPackage.CTRL_UNIT57__PARAMETER_PMAX:
				if (resolve) return getParameter__pMax();
				return basicGetParameter__pMax();
			case WTSpecPackage.CTRL_UNIT57__PARAMETER_PMIN:
				if (resolve) return getParameter__pMin();
				return basicGetParameter__pMin();
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
			case WTSpecPackage.CTRL_UNIT57__INPUT_IUP:
				setInput__iUp((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT57__INPUT_IDOWN:
				setInput__iDown((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT57__OUTPUT_OANALOG_OUT:
				setOutput__oAnalogOut((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT57__PARAMETER_PPARAM:
				setParameter__pParam((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT57__PARAMETER_PMAX:
				setParameter__pMax((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT57__PARAMETER_PMIN:
				setParameter__pMin((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT57__INPUT_IUP:
				setInput__iUp((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT57__INPUT_IDOWN:
				setInput__iDown((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT57__OUTPUT_OANALOG_OUT:
				setOutput__oAnalogOut((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT57__PARAMETER_PPARAM:
				setParameter__pParam((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT57__PARAMETER_PMAX:
				setParameter__pMax((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT57__PARAMETER_PMIN:
				setParameter__pMin((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT57__INPUT_IUP:
				return input__iUp != null;
			case WTSpecPackage.CTRL_UNIT57__INPUT_IDOWN:
				return input__iDown != null;
			case WTSpecPackage.CTRL_UNIT57__OUTPUT_OANALOG_OUT:
				return output__oAnalogOut != null;
			case WTSpecPackage.CTRL_UNIT57__PARAMETER_PPARAM:
				return parameter__pParam != null;
			case WTSpecPackage.CTRL_UNIT57__PARAMETER_PMAX:
				return parameter__pMax != null;
			case WTSpecPackage.CTRL_UNIT57__PARAMETER_PMIN:
				return parameter__pMin != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit57Impl
