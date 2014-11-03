/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit63;
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
 * An implementation of the model object '<em><b>Ctrl Unit63</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getInput__iAzimuth <em>Input iAzimuth</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getInput__iOrder <em>Input iOrder</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getInput__iTargetHole <em>Input iTarget Hole</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getInput__iInvReadyRef <em>Input iInv Ready Ref</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getInput__iEncoderSpeed <em>Input iEncoder Speed</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getInput__iInductiveSensor1 <em>Input iInductive Sensor1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getInput__iInductiveSensor2 <em>Input iInductive Sensor2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getOutput__oMotorTorque <em>Output oMotor Torque</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getOutput__oMotorSense <em>Output oMotor Sense</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getOutput__oFlIntoPosition <em>Output oFl Into Position</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getOutput__oStatusFromDll <em>Output oStatus From Dll</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getOutput__oPositionSetpoint <em>Output oPosition Setpoint</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getOutput__oTorqueAve <em>Output oTorque Ave</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getOutput__oErrorAve <em>Output oError Ave</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getOutput__oSpeedAve <em>Output oSpeed Ave</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getOutput__oWref <em>Output oWref</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getOutput__oTargetPosition <em>Output oTarget Position</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getOutput__oKeepState <em>Output oKeep State</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getOutput__oSeekState <em>Output oSeek State</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getOutput__oMotorize <em>Output oMotorize</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getOutput__oRealObjetive <em>Output oReal Objetive</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getOutput__oControlMode <em>Output oControl Mode</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pOffset <em>Parameter pOffset</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pEncoderOffset <em>Parameter pEncoder Offset</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pNextHoleDegrees <em>Parameter pNext Hole Degrees</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pPosRate1 <em>Parameter pPos Rate1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pPosRate2 <em>Parameter pPos Rate2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pMaxSpeed <em>Parameter pMax Speed</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pSampleTime <em>Parameter pSample Time</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pMaxTorque <em>Parameter pMax Torque</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pAverageTime <em>Parameter pAverage Time</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pSpeedAverageTime <em>Parameter pSpeed Average Time</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pMaxAcceleration <em>Parameter pMax Acceleration</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pKpp <em>Parameter pKpp</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pKps <em>Parameter pKps</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pKis <em>Parameter pKis</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pFilterOK <em>Parameter pFilter OK</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pFilterFreq <em>Parameter pFilter Freq</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pFilterDamp <em>Parameter pFilter Damp</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pKp2 <em>Parameter pKp2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pKp1 <em>Parameter pKp1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pKi1 <em>Parameter pKi1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pKi2 <em>Parameter pKi2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getParameter__pPosBand <em>Parameter pPos Band</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit63Impl#getBhvParam__bpControlMode <em>Bhv Param bp Control Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit63Impl extends wtcImpl implements CtrlUnit63 {
	/**
	 * The cached value of the '{@link #getInput__iAzimuth() <em>Input iAzimuth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iAzimuth()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iAzimuth;

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
	 * The cached value of the '{@link #getInput__iTargetHole() <em>Input iTarget Hole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iTargetHole()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iTargetHole;

	/**
	 * The cached value of the '{@link #getInput__iInvReadyRef() <em>Input iInv Ready Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInvReadyRef()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInvReadyRef;

	/**
	 * The cached value of the '{@link #getInput__iEncoderSpeed() <em>Input iEncoder Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iEncoderSpeed()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iEncoderSpeed;

	/**
	 * The cached value of the '{@link #getInput__iInductiveSensor1() <em>Input iInductive Sensor1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInductiveSensor1()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInductiveSensor1;

	/**
	 * The cached value of the '{@link #getInput__iInductiveSensor2() <em>Input iInductive Sensor2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInductiveSensor2()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInductiveSensor2;

	/**
	 * The cached value of the '{@link #getOutput__oMotorTorque() <em>Output oMotor Torque</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oMotorTorque()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oMotorTorque;

	/**
	 * The cached value of the '{@link #getOutput__oMotorSense() <em>Output oMotor Sense</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oMotorSense()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oMotorSense;

	/**
	 * The cached value of the '{@link #getOutput__oFlIntoPosition() <em>Output oFl Into Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oFlIntoPosition()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oFlIntoPosition;

	/**
	 * The cached value of the '{@link #getOutput__oStatusFromDll() <em>Output oStatus From Dll</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oStatusFromDll()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oStatusFromDll;

	/**
	 * The cached value of the '{@link #getOutput__oPositionSetpoint() <em>Output oPosition Setpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPositionSetpoint()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPositionSetpoint;

	/**
	 * The cached value of the '{@link #getOutput__oTorqueAve() <em>Output oTorque Ave</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oTorqueAve()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oTorqueAve;

	/**
	 * The cached value of the '{@link #getOutput__oErrorAve() <em>Output oError Ave</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oErrorAve()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oErrorAve;

	/**
	 * The cached value of the '{@link #getOutput__oSpeedAve() <em>Output oSpeed Ave</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oSpeedAve()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oSpeedAve;

	/**
	 * The cached value of the '{@link #getOutput__oWref() <em>Output oWref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oWref()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oWref;

	/**
	 * The cached value of the '{@link #getOutput__oTargetPosition() <em>Output oTarget Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oTargetPosition()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oTargetPosition;

	/**
	 * The cached value of the '{@link #getOutput__oKeepState() <em>Output oKeep State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oKeepState()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oKeepState;

	/**
	 * The cached value of the '{@link #getOutput__oSeekState() <em>Output oSeek State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oSeekState()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oSeekState;

	/**
	 * The cached value of the '{@link #getOutput__oMotorize() <em>Output oMotorize</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oMotorize()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oMotorize;

	/**
	 * The cached value of the '{@link #getOutput__oRealObjetive() <em>Output oReal Objetive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oRealObjetive()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oRealObjetive;

	/**
	 * The cached value of the '{@link #getOutput__oControlMode() <em>Output oControl Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oControlMode()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oControlMode;

	/**
	 * The cached value of the '{@link #getParameter__pOffset() <em>Parameter pOffset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pOffset()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pOffset;

	/**
	 * The cached value of the '{@link #getParameter__pEncoderOffset() <em>Parameter pEncoder Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pEncoderOffset()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pEncoderOffset;

	/**
	 * The cached value of the '{@link #getParameter__pNextHoleDegrees() <em>Parameter pNext Hole Degrees</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pNextHoleDegrees()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pNextHoleDegrees;

	/**
	 * The cached value of the '{@link #getParameter__pPosRate1() <em>Parameter pPos Rate1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPosRate1()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPosRate1;

	/**
	 * The cached value of the '{@link #getParameter__pPosRate2() <em>Parameter pPos Rate2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPosRate2()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPosRate2;

	/**
	 * The cached value of the '{@link #getParameter__pMaxSpeed() <em>Parameter pMax Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pMaxSpeed()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pMaxSpeed;

	/**
	 * The cached value of the '{@link #getParameter__pSampleTime() <em>Parameter pSample Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pSampleTime()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pSampleTime;

	/**
	 * The cached value of the '{@link #getParameter__pMaxTorque() <em>Parameter pMax Torque</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pMaxTorque()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pMaxTorque;

	/**
	 * The cached value of the '{@link #getParameter__pAverageTime() <em>Parameter pAverage Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pAverageTime()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pAverageTime;

	/**
	 * The cached value of the '{@link #getParameter__pSpeedAverageTime() <em>Parameter pSpeed Average Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pSpeedAverageTime()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pSpeedAverageTime;

	/**
	 * The cached value of the '{@link #getParameter__pMaxAcceleration() <em>Parameter pMax Acceleration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pMaxAcceleration()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pMaxAcceleration;

	/**
	 * The cached value of the '{@link #getParameter__pKpp() <em>Parameter pKpp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pKpp()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pKpp;

	/**
	 * The cached value of the '{@link #getParameter__pKps() <em>Parameter pKps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pKps()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pKps;

	/**
	 * The cached value of the '{@link #getParameter__pKis() <em>Parameter pKis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pKis()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pKis;

	/**
	 * The cached value of the '{@link #getParameter__pFilterOK() <em>Parameter pFilter OK</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pFilterOK()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pFilterOK;

	/**
	 * The cached value of the '{@link #getParameter__pFilterFreq() <em>Parameter pFilter Freq</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pFilterFreq()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pFilterFreq;

	/**
	 * The cached value of the '{@link #getParameter__pFilterDamp() <em>Parameter pFilter Damp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pFilterDamp()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pFilterDamp;

	/**
	 * The cached value of the '{@link #getParameter__pKp2() <em>Parameter pKp2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pKp2()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pKp2;

	/**
	 * The cached value of the '{@link #getParameter__pKp1() <em>Parameter pKp1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pKp1()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pKp1;

	/**
	 * The cached value of the '{@link #getParameter__pKi1() <em>Parameter pKi1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pKi1()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pKi1;

	/**
	 * The cached value of the '{@link #getParameter__pKi2() <em>Parameter pKi2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pKi2()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pKi2;

	/**
	 * The cached value of the '{@link #getParameter__pPosBand() <em>Parameter pPos Band</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPosBand()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPosBand;

	/**
	 * The default value of the '{@link #getBhvParam__bpControlMode() <em>Bhv Param bp Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpControlMode()
	 * @generated
	 * @ordered
	 */
	protected static final String BHV_PARAM_BP_CONTROL_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBhvParam__bpControlMode() <em>Bhv Param bp Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpControlMode()
	 * @generated
	 * @ordered
	 */
	protected String bhvParam__bpControlMode = BHV_PARAM_BP_CONTROL_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit63Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT63;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iAzimuth() {
		if (input__iAzimuth != null && input__iAzimuth.eIsProxy()) {
			InternalEObject oldInput__iAzimuth = (InternalEObject)input__iAzimuth;
			input__iAzimuth = (WTCInput)eResolveProxy(oldInput__iAzimuth);
			if (input__iAzimuth != oldInput__iAzimuth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__INPUT_IAZIMUTH, oldInput__iAzimuth, input__iAzimuth));
			}
		}
		return input__iAzimuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iAzimuth() {
		return input__iAzimuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iAzimuth(WTCInput newInput__iAzimuth) {
		WTCInput oldInput__iAzimuth = input__iAzimuth;
		input__iAzimuth = newInput__iAzimuth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__INPUT_IAZIMUTH, oldInput__iAzimuth, input__iAzimuth));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__INPUT_IORDER, oldInput__iOrder, input__iOrder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__INPUT_IORDER, oldInput__iOrder, input__iOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iTargetHole() {
		if (input__iTargetHole != null && input__iTargetHole.eIsProxy()) {
			InternalEObject oldInput__iTargetHole = (InternalEObject)input__iTargetHole;
			input__iTargetHole = (WTCInput)eResolveProxy(oldInput__iTargetHole);
			if (input__iTargetHole != oldInput__iTargetHole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__INPUT_ITARGET_HOLE, oldInput__iTargetHole, input__iTargetHole));
			}
		}
		return input__iTargetHole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iTargetHole() {
		return input__iTargetHole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iTargetHole(WTCInput newInput__iTargetHole) {
		WTCInput oldInput__iTargetHole = input__iTargetHole;
		input__iTargetHole = newInput__iTargetHole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__INPUT_ITARGET_HOLE, oldInput__iTargetHole, input__iTargetHole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInvReadyRef() {
		if (input__iInvReadyRef != null && input__iInvReadyRef.eIsProxy()) {
			InternalEObject oldInput__iInvReadyRef = (InternalEObject)input__iInvReadyRef;
			input__iInvReadyRef = (WTCInput)eResolveProxy(oldInput__iInvReadyRef);
			if (input__iInvReadyRef != oldInput__iInvReadyRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__INPUT_IINV_READY_REF, oldInput__iInvReadyRef, input__iInvReadyRef));
			}
		}
		return input__iInvReadyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInvReadyRef() {
		return input__iInvReadyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInvReadyRef(WTCInput newInput__iInvReadyRef) {
		WTCInput oldInput__iInvReadyRef = input__iInvReadyRef;
		input__iInvReadyRef = newInput__iInvReadyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__INPUT_IINV_READY_REF, oldInput__iInvReadyRef, input__iInvReadyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iEncoderSpeed() {
		if (input__iEncoderSpeed != null && input__iEncoderSpeed.eIsProxy()) {
			InternalEObject oldInput__iEncoderSpeed = (InternalEObject)input__iEncoderSpeed;
			input__iEncoderSpeed = (WTCInput)eResolveProxy(oldInput__iEncoderSpeed);
			if (input__iEncoderSpeed != oldInput__iEncoderSpeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__INPUT_IENCODER_SPEED, oldInput__iEncoderSpeed, input__iEncoderSpeed));
			}
		}
		return input__iEncoderSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iEncoderSpeed() {
		return input__iEncoderSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iEncoderSpeed(WTCInput newInput__iEncoderSpeed) {
		WTCInput oldInput__iEncoderSpeed = input__iEncoderSpeed;
		input__iEncoderSpeed = newInput__iEncoderSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__INPUT_IENCODER_SPEED, oldInput__iEncoderSpeed, input__iEncoderSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInductiveSensor1() {
		if (input__iInductiveSensor1 != null && input__iInductiveSensor1.eIsProxy()) {
			InternalEObject oldInput__iInductiveSensor1 = (InternalEObject)input__iInductiveSensor1;
			input__iInductiveSensor1 = (WTCInput)eResolveProxy(oldInput__iInductiveSensor1);
			if (input__iInductiveSensor1 != oldInput__iInductiveSensor1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__INPUT_IINDUCTIVE_SENSOR1, oldInput__iInductiveSensor1, input__iInductiveSensor1));
			}
		}
		return input__iInductiveSensor1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInductiveSensor1() {
		return input__iInductiveSensor1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInductiveSensor1(WTCInput newInput__iInductiveSensor1) {
		WTCInput oldInput__iInductiveSensor1 = input__iInductiveSensor1;
		input__iInductiveSensor1 = newInput__iInductiveSensor1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__INPUT_IINDUCTIVE_SENSOR1, oldInput__iInductiveSensor1, input__iInductiveSensor1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInductiveSensor2() {
		if (input__iInductiveSensor2 != null && input__iInductiveSensor2.eIsProxy()) {
			InternalEObject oldInput__iInductiveSensor2 = (InternalEObject)input__iInductiveSensor2;
			input__iInductiveSensor2 = (WTCInput)eResolveProxy(oldInput__iInductiveSensor2);
			if (input__iInductiveSensor2 != oldInput__iInductiveSensor2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__INPUT_IINDUCTIVE_SENSOR2, oldInput__iInductiveSensor2, input__iInductiveSensor2));
			}
		}
		return input__iInductiveSensor2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInductiveSensor2() {
		return input__iInductiveSensor2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInductiveSensor2(WTCInput newInput__iInductiveSensor2) {
		WTCInput oldInput__iInductiveSensor2 = input__iInductiveSensor2;
		input__iInductiveSensor2 = newInput__iInductiveSensor2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__INPUT_IINDUCTIVE_SENSOR2, oldInput__iInductiveSensor2, input__iInductiveSensor2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oMotorTorque() {
		if (output__oMotorTorque != null && output__oMotorTorque.eIsProxy()) {
			InternalEObject oldOutput__oMotorTorque = (InternalEObject)output__oMotorTorque;
			output__oMotorTorque = (WTCOutput)eResolveProxy(oldOutput__oMotorTorque);
			if (output__oMotorTorque != oldOutput__oMotorTorque) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTOR_TORQUE, oldOutput__oMotorTorque, output__oMotorTorque));
			}
		}
		return output__oMotorTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oMotorTorque() {
		return output__oMotorTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oMotorTorque(WTCOutput newOutput__oMotorTorque) {
		WTCOutput oldOutput__oMotorTorque = output__oMotorTorque;
		output__oMotorTorque = newOutput__oMotorTorque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTOR_TORQUE, oldOutput__oMotorTorque, output__oMotorTorque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oMotorSense() {
		if (output__oMotorSense != null && output__oMotorSense.eIsProxy()) {
			InternalEObject oldOutput__oMotorSense = (InternalEObject)output__oMotorSense;
			output__oMotorSense = (WTCOutput)eResolveProxy(oldOutput__oMotorSense);
			if (output__oMotorSense != oldOutput__oMotorSense) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTOR_SENSE, oldOutput__oMotorSense, output__oMotorSense));
			}
		}
		return output__oMotorSense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oMotorSense() {
		return output__oMotorSense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oMotorSense(WTCOutput newOutput__oMotorSense) {
		WTCOutput oldOutput__oMotorSense = output__oMotorSense;
		output__oMotorSense = newOutput__oMotorSense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTOR_SENSE, oldOutput__oMotorSense, output__oMotorSense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oFlIntoPosition() {
		if (output__oFlIntoPosition != null && output__oFlIntoPosition.eIsProxy()) {
			InternalEObject oldOutput__oFlIntoPosition = (InternalEObject)output__oFlIntoPosition;
			output__oFlIntoPosition = (WTCOutput)eResolveProxy(oldOutput__oFlIntoPosition);
			if (output__oFlIntoPosition != oldOutput__oFlIntoPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__OUTPUT_OFL_INTO_POSITION, oldOutput__oFlIntoPosition, output__oFlIntoPosition));
			}
		}
		return output__oFlIntoPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oFlIntoPosition() {
		return output__oFlIntoPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oFlIntoPosition(WTCOutput newOutput__oFlIntoPosition) {
		WTCOutput oldOutput__oFlIntoPosition = output__oFlIntoPosition;
		output__oFlIntoPosition = newOutput__oFlIntoPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__OUTPUT_OFL_INTO_POSITION, oldOutput__oFlIntoPosition, output__oFlIntoPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oStatusFromDll() {
		if (output__oStatusFromDll != null && output__oStatusFromDll.eIsProxy()) {
			InternalEObject oldOutput__oStatusFromDll = (InternalEObject)output__oStatusFromDll;
			output__oStatusFromDll = (WTCOutput)eResolveProxy(oldOutput__oStatusFromDll);
			if (output__oStatusFromDll != oldOutput__oStatusFromDll) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__OUTPUT_OSTATUS_FROM_DLL, oldOutput__oStatusFromDll, output__oStatusFromDll));
			}
		}
		return output__oStatusFromDll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oStatusFromDll() {
		return output__oStatusFromDll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oStatusFromDll(WTCOutput newOutput__oStatusFromDll) {
		WTCOutput oldOutput__oStatusFromDll = output__oStatusFromDll;
		output__oStatusFromDll = newOutput__oStatusFromDll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__OUTPUT_OSTATUS_FROM_DLL, oldOutput__oStatusFromDll, output__oStatusFromDll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPositionSetpoint() {
		if (output__oPositionSetpoint != null && output__oPositionSetpoint.eIsProxy()) {
			InternalEObject oldOutput__oPositionSetpoint = (InternalEObject)output__oPositionSetpoint;
			output__oPositionSetpoint = (WTCOutput)eResolveProxy(oldOutput__oPositionSetpoint);
			if (output__oPositionSetpoint != oldOutput__oPositionSetpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__OUTPUT_OPOSITION_SETPOINT, oldOutput__oPositionSetpoint, output__oPositionSetpoint));
			}
		}
		return output__oPositionSetpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPositionSetpoint() {
		return output__oPositionSetpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPositionSetpoint(WTCOutput newOutput__oPositionSetpoint) {
		WTCOutput oldOutput__oPositionSetpoint = output__oPositionSetpoint;
		output__oPositionSetpoint = newOutput__oPositionSetpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__OUTPUT_OPOSITION_SETPOINT, oldOutput__oPositionSetpoint, output__oPositionSetpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oTorqueAve() {
		if (output__oTorqueAve != null && output__oTorqueAve.eIsProxy()) {
			InternalEObject oldOutput__oTorqueAve = (InternalEObject)output__oTorqueAve;
			output__oTorqueAve = (WTCOutput)eResolveProxy(oldOutput__oTorqueAve);
			if (output__oTorqueAve != oldOutput__oTorqueAve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__OUTPUT_OTORQUE_AVE, oldOutput__oTorqueAve, output__oTorqueAve));
			}
		}
		return output__oTorqueAve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oTorqueAve() {
		return output__oTorqueAve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oTorqueAve(WTCOutput newOutput__oTorqueAve) {
		WTCOutput oldOutput__oTorqueAve = output__oTorqueAve;
		output__oTorqueAve = newOutput__oTorqueAve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__OUTPUT_OTORQUE_AVE, oldOutput__oTorqueAve, output__oTorqueAve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oErrorAve() {
		if (output__oErrorAve != null && output__oErrorAve.eIsProxy()) {
			InternalEObject oldOutput__oErrorAve = (InternalEObject)output__oErrorAve;
			output__oErrorAve = (WTCOutput)eResolveProxy(oldOutput__oErrorAve);
			if (output__oErrorAve != oldOutput__oErrorAve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__OUTPUT_OERROR_AVE, oldOutput__oErrorAve, output__oErrorAve));
			}
		}
		return output__oErrorAve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oErrorAve() {
		return output__oErrorAve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oErrorAve(WTCOutput newOutput__oErrorAve) {
		WTCOutput oldOutput__oErrorAve = output__oErrorAve;
		output__oErrorAve = newOutput__oErrorAve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__OUTPUT_OERROR_AVE, oldOutput__oErrorAve, output__oErrorAve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oSpeedAve() {
		if (output__oSpeedAve != null && output__oSpeedAve.eIsProxy()) {
			InternalEObject oldOutput__oSpeedAve = (InternalEObject)output__oSpeedAve;
			output__oSpeedAve = (WTCOutput)eResolveProxy(oldOutput__oSpeedAve);
			if (output__oSpeedAve != oldOutput__oSpeedAve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__OUTPUT_OSPEED_AVE, oldOutput__oSpeedAve, output__oSpeedAve));
			}
		}
		return output__oSpeedAve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oSpeedAve() {
		return output__oSpeedAve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oSpeedAve(WTCOutput newOutput__oSpeedAve) {
		WTCOutput oldOutput__oSpeedAve = output__oSpeedAve;
		output__oSpeedAve = newOutput__oSpeedAve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__OUTPUT_OSPEED_AVE, oldOutput__oSpeedAve, output__oSpeedAve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oWref() {
		if (output__oWref != null && output__oWref.eIsProxy()) {
			InternalEObject oldOutput__oWref = (InternalEObject)output__oWref;
			output__oWref = (WTCOutput)eResolveProxy(oldOutput__oWref);
			if (output__oWref != oldOutput__oWref) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__OUTPUT_OWREF, oldOutput__oWref, output__oWref));
			}
		}
		return output__oWref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oWref() {
		return output__oWref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oWref(WTCOutput newOutput__oWref) {
		WTCOutput oldOutput__oWref = output__oWref;
		output__oWref = newOutput__oWref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__OUTPUT_OWREF, oldOutput__oWref, output__oWref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oTargetPosition() {
		if (output__oTargetPosition != null && output__oTargetPosition.eIsProxy()) {
			InternalEObject oldOutput__oTargetPosition = (InternalEObject)output__oTargetPosition;
			output__oTargetPosition = (WTCOutput)eResolveProxy(oldOutput__oTargetPosition);
			if (output__oTargetPosition != oldOutput__oTargetPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__OUTPUT_OTARGET_POSITION, oldOutput__oTargetPosition, output__oTargetPosition));
			}
		}
		return output__oTargetPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oTargetPosition() {
		return output__oTargetPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oTargetPosition(WTCOutput newOutput__oTargetPosition) {
		WTCOutput oldOutput__oTargetPosition = output__oTargetPosition;
		output__oTargetPosition = newOutput__oTargetPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__OUTPUT_OTARGET_POSITION, oldOutput__oTargetPosition, output__oTargetPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oKeepState() {
		if (output__oKeepState != null && output__oKeepState.eIsProxy()) {
			InternalEObject oldOutput__oKeepState = (InternalEObject)output__oKeepState;
			output__oKeepState = (WTCOutput)eResolveProxy(oldOutput__oKeepState);
			if (output__oKeepState != oldOutput__oKeepState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__OUTPUT_OKEEP_STATE, oldOutput__oKeepState, output__oKeepState));
			}
		}
		return output__oKeepState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oKeepState() {
		return output__oKeepState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oKeepState(WTCOutput newOutput__oKeepState) {
		WTCOutput oldOutput__oKeepState = output__oKeepState;
		output__oKeepState = newOutput__oKeepState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__OUTPUT_OKEEP_STATE, oldOutput__oKeepState, output__oKeepState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oSeekState() {
		if (output__oSeekState != null && output__oSeekState.eIsProxy()) {
			InternalEObject oldOutput__oSeekState = (InternalEObject)output__oSeekState;
			output__oSeekState = (WTCOutput)eResolveProxy(oldOutput__oSeekState);
			if (output__oSeekState != oldOutput__oSeekState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__OUTPUT_OSEEK_STATE, oldOutput__oSeekState, output__oSeekState));
			}
		}
		return output__oSeekState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oSeekState() {
		return output__oSeekState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oSeekState(WTCOutput newOutput__oSeekState) {
		WTCOutput oldOutput__oSeekState = output__oSeekState;
		output__oSeekState = newOutput__oSeekState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__OUTPUT_OSEEK_STATE, oldOutput__oSeekState, output__oSeekState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oMotorize() {
		if (output__oMotorize != null && output__oMotorize.eIsProxy()) {
			InternalEObject oldOutput__oMotorize = (InternalEObject)output__oMotorize;
			output__oMotorize = (WTCOutput)eResolveProxy(oldOutput__oMotorize);
			if (output__oMotorize != oldOutput__oMotorize) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTORIZE, oldOutput__oMotorize, output__oMotorize));
			}
		}
		return output__oMotorize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oMotorize() {
		return output__oMotorize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oMotorize(WTCOutput newOutput__oMotorize) {
		WTCOutput oldOutput__oMotorize = output__oMotorize;
		output__oMotorize = newOutput__oMotorize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTORIZE, oldOutput__oMotorize, output__oMotorize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oRealObjetive() {
		if (output__oRealObjetive != null && output__oRealObjetive.eIsProxy()) {
			InternalEObject oldOutput__oRealObjetive = (InternalEObject)output__oRealObjetive;
			output__oRealObjetive = (WTCOutput)eResolveProxy(oldOutput__oRealObjetive);
			if (output__oRealObjetive != oldOutput__oRealObjetive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__OUTPUT_OREAL_OBJETIVE, oldOutput__oRealObjetive, output__oRealObjetive));
			}
		}
		return output__oRealObjetive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oRealObjetive() {
		return output__oRealObjetive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oRealObjetive(WTCOutput newOutput__oRealObjetive) {
		WTCOutput oldOutput__oRealObjetive = output__oRealObjetive;
		output__oRealObjetive = newOutput__oRealObjetive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__OUTPUT_OREAL_OBJETIVE, oldOutput__oRealObjetive, output__oRealObjetive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oControlMode() {
		if (output__oControlMode != null && output__oControlMode.eIsProxy()) {
			InternalEObject oldOutput__oControlMode = (InternalEObject)output__oControlMode;
			output__oControlMode = (WTCOutput)eResolveProxy(oldOutput__oControlMode);
			if (output__oControlMode != oldOutput__oControlMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__OUTPUT_OCONTROL_MODE, oldOutput__oControlMode, output__oControlMode));
			}
		}
		return output__oControlMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oControlMode() {
		return output__oControlMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oControlMode(WTCOutput newOutput__oControlMode) {
		WTCOutput oldOutput__oControlMode = output__oControlMode;
		output__oControlMode = newOutput__oControlMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__OUTPUT_OCONTROL_MODE, oldOutput__oControlMode, output__oControlMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pOffset() {
		if (parameter__pOffset != null && parameter__pOffset.eIsProxy()) {
			InternalEObject oldParameter__pOffset = (InternalEObject)parameter__pOffset;
			parameter__pOffset = (WTCParam)eResolveProxy(oldParameter__pOffset);
			if (parameter__pOffset != oldParameter__pOffset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_POFFSET, oldParameter__pOffset, parameter__pOffset));
			}
		}
		return parameter__pOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pOffset() {
		return parameter__pOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pOffset(WTCParam newParameter__pOffset) {
		WTCParam oldParameter__pOffset = parameter__pOffset;
		parameter__pOffset = newParameter__pOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_POFFSET, oldParameter__pOffset, parameter__pOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pEncoderOffset() {
		if (parameter__pEncoderOffset != null && parameter__pEncoderOffset.eIsProxy()) {
			InternalEObject oldParameter__pEncoderOffset = (InternalEObject)parameter__pEncoderOffset;
			parameter__pEncoderOffset = (WTCParam)eResolveProxy(oldParameter__pEncoderOffset);
			if (parameter__pEncoderOffset != oldParameter__pEncoderOffset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PENCODER_OFFSET, oldParameter__pEncoderOffset, parameter__pEncoderOffset));
			}
		}
		return parameter__pEncoderOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pEncoderOffset() {
		return parameter__pEncoderOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pEncoderOffset(WTCParam newParameter__pEncoderOffset) {
		WTCParam oldParameter__pEncoderOffset = parameter__pEncoderOffset;
		parameter__pEncoderOffset = newParameter__pEncoderOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PENCODER_OFFSET, oldParameter__pEncoderOffset, parameter__pEncoderOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pNextHoleDegrees() {
		if (parameter__pNextHoleDegrees != null && parameter__pNextHoleDegrees.eIsProxy()) {
			InternalEObject oldParameter__pNextHoleDegrees = (InternalEObject)parameter__pNextHoleDegrees;
			parameter__pNextHoleDegrees = (WTCParam)eResolveProxy(oldParameter__pNextHoleDegrees);
			if (parameter__pNextHoleDegrees != oldParameter__pNextHoleDegrees) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PNEXT_HOLE_DEGREES, oldParameter__pNextHoleDegrees, parameter__pNextHoleDegrees));
			}
		}
		return parameter__pNextHoleDegrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pNextHoleDegrees() {
		return parameter__pNextHoleDegrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pNextHoleDegrees(WTCParam newParameter__pNextHoleDegrees) {
		WTCParam oldParameter__pNextHoleDegrees = parameter__pNextHoleDegrees;
		parameter__pNextHoleDegrees = newParameter__pNextHoleDegrees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PNEXT_HOLE_DEGREES, oldParameter__pNextHoleDegrees, parameter__pNextHoleDegrees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPosRate1() {
		if (parameter__pPosRate1 != null && parameter__pPosRate1.eIsProxy()) {
			InternalEObject oldParameter__pPosRate1 = (InternalEObject)parameter__pPosRate1;
			parameter__pPosRate1 = (WTCParam)eResolveProxy(oldParameter__pPosRate1);
			if (parameter__pPosRate1 != oldParameter__pPosRate1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_RATE1, oldParameter__pPosRate1, parameter__pPosRate1));
			}
		}
		return parameter__pPosRate1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPosRate1() {
		return parameter__pPosRate1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPosRate1(WTCParam newParameter__pPosRate1) {
		WTCParam oldParameter__pPosRate1 = parameter__pPosRate1;
		parameter__pPosRate1 = newParameter__pPosRate1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_RATE1, oldParameter__pPosRate1, parameter__pPosRate1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPosRate2() {
		if (parameter__pPosRate2 != null && parameter__pPosRate2.eIsProxy()) {
			InternalEObject oldParameter__pPosRate2 = (InternalEObject)parameter__pPosRate2;
			parameter__pPosRate2 = (WTCParam)eResolveProxy(oldParameter__pPosRate2);
			if (parameter__pPosRate2 != oldParameter__pPosRate2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_RATE2, oldParameter__pPosRate2, parameter__pPosRate2));
			}
		}
		return parameter__pPosRate2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPosRate2() {
		return parameter__pPosRate2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPosRate2(WTCParam newParameter__pPosRate2) {
		WTCParam oldParameter__pPosRate2 = parameter__pPosRate2;
		parameter__pPosRate2 = newParameter__pPosRate2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_RATE2, oldParameter__pPosRate2, parameter__pPosRate2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pMaxSpeed() {
		if (parameter__pMaxSpeed != null && parameter__pMaxSpeed.eIsProxy()) {
			InternalEObject oldParameter__pMaxSpeed = (InternalEObject)parameter__pMaxSpeed;
			parameter__pMaxSpeed = (WTCParam)eResolveProxy(oldParameter__pMaxSpeed);
			if (parameter__pMaxSpeed != oldParameter__pMaxSpeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_SPEED, oldParameter__pMaxSpeed, parameter__pMaxSpeed));
			}
		}
		return parameter__pMaxSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pMaxSpeed() {
		return parameter__pMaxSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pMaxSpeed(WTCParam newParameter__pMaxSpeed) {
		WTCParam oldParameter__pMaxSpeed = parameter__pMaxSpeed;
		parameter__pMaxSpeed = newParameter__pMaxSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_SPEED, oldParameter__pMaxSpeed, parameter__pMaxSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pSampleTime() {
		if (parameter__pSampleTime != null && parameter__pSampleTime.eIsProxy()) {
			InternalEObject oldParameter__pSampleTime = (InternalEObject)parameter__pSampleTime;
			parameter__pSampleTime = (WTCParam)eResolveProxy(oldParameter__pSampleTime);
			if (parameter__pSampleTime != oldParameter__pSampleTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PSAMPLE_TIME, oldParameter__pSampleTime, parameter__pSampleTime));
			}
		}
		return parameter__pSampleTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pSampleTime() {
		return parameter__pSampleTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pSampleTime(WTCParam newParameter__pSampleTime) {
		WTCParam oldParameter__pSampleTime = parameter__pSampleTime;
		parameter__pSampleTime = newParameter__pSampleTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PSAMPLE_TIME, oldParameter__pSampleTime, parameter__pSampleTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pMaxTorque() {
		if (parameter__pMaxTorque != null && parameter__pMaxTorque.eIsProxy()) {
			InternalEObject oldParameter__pMaxTorque = (InternalEObject)parameter__pMaxTorque;
			parameter__pMaxTorque = (WTCParam)eResolveProxy(oldParameter__pMaxTorque);
			if (parameter__pMaxTorque != oldParameter__pMaxTorque) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_TORQUE, oldParameter__pMaxTorque, parameter__pMaxTorque));
			}
		}
		return parameter__pMaxTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pMaxTorque() {
		return parameter__pMaxTorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pMaxTorque(WTCParam newParameter__pMaxTorque) {
		WTCParam oldParameter__pMaxTorque = parameter__pMaxTorque;
		parameter__pMaxTorque = newParameter__pMaxTorque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_TORQUE, oldParameter__pMaxTorque, parameter__pMaxTorque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pAverageTime() {
		if (parameter__pAverageTime != null && parameter__pAverageTime.eIsProxy()) {
			InternalEObject oldParameter__pAverageTime = (InternalEObject)parameter__pAverageTime;
			parameter__pAverageTime = (WTCParam)eResolveProxy(oldParameter__pAverageTime);
			if (parameter__pAverageTime != oldParameter__pAverageTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PAVERAGE_TIME, oldParameter__pAverageTime, parameter__pAverageTime));
			}
		}
		return parameter__pAverageTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pAverageTime() {
		return parameter__pAverageTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pAverageTime(WTCParam newParameter__pAverageTime) {
		WTCParam oldParameter__pAverageTime = parameter__pAverageTime;
		parameter__pAverageTime = newParameter__pAverageTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PAVERAGE_TIME, oldParameter__pAverageTime, parameter__pAverageTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pSpeedAverageTime() {
		if (parameter__pSpeedAverageTime != null && parameter__pSpeedAverageTime.eIsProxy()) {
			InternalEObject oldParameter__pSpeedAverageTime = (InternalEObject)parameter__pSpeedAverageTime;
			parameter__pSpeedAverageTime = (WTCParam)eResolveProxy(oldParameter__pSpeedAverageTime);
			if (parameter__pSpeedAverageTime != oldParameter__pSpeedAverageTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PSPEED_AVERAGE_TIME, oldParameter__pSpeedAverageTime, parameter__pSpeedAverageTime));
			}
		}
		return parameter__pSpeedAverageTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pSpeedAverageTime() {
		return parameter__pSpeedAverageTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pSpeedAverageTime(WTCParam newParameter__pSpeedAverageTime) {
		WTCParam oldParameter__pSpeedAverageTime = parameter__pSpeedAverageTime;
		parameter__pSpeedAverageTime = newParameter__pSpeedAverageTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PSPEED_AVERAGE_TIME, oldParameter__pSpeedAverageTime, parameter__pSpeedAverageTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pMaxAcceleration() {
		if (parameter__pMaxAcceleration != null && parameter__pMaxAcceleration.eIsProxy()) {
			InternalEObject oldParameter__pMaxAcceleration = (InternalEObject)parameter__pMaxAcceleration;
			parameter__pMaxAcceleration = (WTCParam)eResolveProxy(oldParameter__pMaxAcceleration);
			if (parameter__pMaxAcceleration != oldParameter__pMaxAcceleration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_ACCELERATION, oldParameter__pMaxAcceleration, parameter__pMaxAcceleration));
			}
		}
		return parameter__pMaxAcceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pMaxAcceleration() {
		return parameter__pMaxAcceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pMaxAcceleration(WTCParam newParameter__pMaxAcceleration) {
		WTCParam oldParameter__pMaxAcceleration = parameter__pMaxAcceleration;
		parameter__pMaxAcceleration = newParameter__pMaxAcceleration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_ACCELERATION, oldParameter__pMaxAcceleration, parameter__pMaxAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pKpp() {
		if (parameter__pKpp != null && parameter__pKpp.eIsProxy()) {
			InternalEObject oldParameter__pKpp = (InternalEObject)parameter__pKpp;
			parameter__pKpp = (WTCParam)eResolveProxy(oldParameter__pKpp);
			if (parameter__pKpp != oldParameter__pKpp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PKPP, oldParameter__pKpp, parameter__pKpp));
			}
		}
		return parameter__pKpp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pKpp() {
		return parameter__pKpp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pKpp(WTCParam newParameter__pKpp) {
		WTCParam oldParameter__pKpp = parameter__pKpp;
		parameter__pKpp = newParameter__pKpp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PKPP, oldParameter__pKpp, parameter__pKpp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pKps() {
		if (parameter__pKps != null && parameter__pKps.eIsProxy()) {
			InternalEObject oldParameter__pKps = (InternalEObject)parameter__pKps;
			parameter__pKps = (WTCParam)eResolveProxy(oldParameter__pKps);
			if (parameter__pKps != oldParameter__pKps) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PKPS, oldParameter__pKps, parameter__pKps));
			}
		}
		return parameter__pKps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pKps() {
		return parameter__pKps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pKps(WTCParam newParameter__pKps) {
		WTCParam oldParameter__pKps = parameter__pKps;
		parameter__pKps = newParameter__pKps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PKPS, oldParameter__pKps, parameter__pKps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pKis() {
		if (parameter__pKis != null && parameter__pKis.eIsProxy()) {
			InternalEObject oldParameter__pKis = (InternalEObject)parameter__pKis;
			parameter__pKis = (WTCParam)eResolveProxy(oldParameter__pKis);
			if (parameter__pKis != oldParameter__pKis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PKIS, oldParameter__pKis, parameter__pKis));
			}
		}
		return parameter__pKis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pKis() {
		return parameter__pKis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pKis(WTCParam newParameter__pKis) {
		WTCParam oldParameter__pKis = parameter__pKis;
		parameter__pKis = newParameter__pKis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PKIS, oldParameter__pKis, parameter__pKis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pFilterOK() {
		if (parameter__pFilterOK != null && parameter__pFilterOK.eIsProxy()) {
			InternalEObject oldParameter__pFilterOK = (InternalEObject)parameter__pFilterOK;
			parameter__pFilterOK = (WTCParam)eResolveProxy(oldParameter__pFilterOK);
			if (parameter__pFilterOK != oldParameter__pFilterOK) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_OK, oldParameter__pFilterOK, parameter__pFilterOK));
			}
		}
		return parameter__pFilterOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pFilterOK() {
		return parameter__pFilterOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pFilterOK(WTCParam newParameter__pFilterOK) {
		WTCParam oldParameter__pFilterOK = parameter__pFilterOK;
		parameter__pFilterOK = newParameter__pFilterOK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_OK, oldParameter__pFilterOK, parameter__pFilterOK));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pFilterFreq() {
		if (parameter__pFilterFreq != null && parameter__pFilterFreq.eIsProxy()) {
			InternalEObject oldParameter__pFilterFreq = (InternalEObject)parameter__pFilterFreq;
			parameter__pFilterFreq = (WTCParam)eResolveProxy(oldParameter__pFilterFreq);
			if (parameter__pFilterFreq != oldParameter__pFilterFreq) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_FREQ, oldParameter__pFilterFreq, parameter__pFilterFreq));
			}
		}
		return parameter__pFilterFreq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pFilterFreq() {
		return parameter__pFilterFreq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pFilterFreq(WTCParam newParameter__pFilterFreq) {
		WTCParam oldParameter__pFilterFreq = parameter__pFilterFreq;
		parameter__pFilterFreq = newParameter__pFilterFreq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_FREQ, oldParameter__pFilterFreq, parameter__pFilterFreq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pFilterDamp() {
		if (parameter__pFilterDamp != null && parameter__pFilterDamp.eIsProxy()) {
			InternalEObject oldParameter__pFilterDamp = (InternalEObject)parameter__pFilterDamp;
			parameter__pFilterDamp = (WTCParam)eResolveProxy(oldParameter__pFilterDamp);
			if (parameter__pFilterDamp != oldParameter__pFilterDamp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_DAMP, oldParameter__pFilterDamp, parameter__pFilterDamp));
			}
		}
		return parameter__pFilterDamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pFilterDamp() {
		return parameter__pFilterDamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pFilterDamp(WTCParam newParameter__pFilterDamp) {
		WTCParam oldParameter__pFilterDamp = parameter__pFilterDamp;
		parameter__pFilterDamp = newParameter__pFilterDamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_DAMP, oldParameter__pFilterDamp, parameter__pFilterDamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pKp2() {
		if (parameter__pKp2 != null && parameter__pKp2.eIsProxy()) {
			InternalEObject oldParameter__pKp2 = (InternalEObject)parameter__pKp2;
			parameter__pKp2 = (WTCParam)eResolveProxy(oldParameter__pKp2);
			if (parameter__pKp2 != oldParameter__pKp2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PKP2, oldParameter__pKp2, parameter__pKp2));
			}
		}
		return parameter__pKp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pKp2() {
		return parameter__pKp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pKp2(WTCParam newParameter__pKp2) {
		WTCParam oldParameter__pKp2 = parameter__pKp2;
		parameter__pKp2 = newParameter__pKp2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PKP2, oldParameter__pKp2, parameter__pKp2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pKp1() {
		if (parameter__pKp1 != null && parameter__pKp1.eIsProxy()) {
			InternalEObject oldParameter__pKp1 = (InternalEObject)parameter__pKp1;
			parameter__pKp1 = (WTCParam)eResolveProxy(oldParameter__pKp1);
			if (parameter__pKp1 != oldParameter__pKp1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PKP1, oldParameter__pKp1, parameter__pKp1));
			}
		}
		return parameter__pKp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pKp1() {
		return parameter__pKp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pKp1(WTCParam newParameter__pKp1) {
		WTCParam oldParameter__pKp1 = parameter__pKp1;
		parameter__pKp1 = newParameter__pKp1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PKP1, oldParameter__pKp1, parameter__pKp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pKi1() {
		if (parameter__pKi1 != null && parameter__pKi1.eIsProxy()) {
			InternalEObject oldParameter__pKi1 = (InternalEObject)parameter__pKi1;
			parameter__pKi1 = (WTCParam)eResolveProxy(oldParameter__pKi1);
			if (parameter__pKi1 != oldParameter__pKi1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PKI1, oldParameter__pKi1, parameter__pKi1));
			}
		}
		return parameter__pKi1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pKi1() {
		return parameter__pKi1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pKi1(WTCParam newParameter__pKi1) {
		WTCParam oldParameter__pKi1 = parameter__pKi1;
		parameter__pKi1 = newParameter__pKi1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PKI1, oldParameter__pKi1, parameter__pKi1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pKi2() {
		if (parameter__pKi2 != null && parameter__pKi2.eIsProxy()) {
			InternalEObject oldParameter__pKi2 = (InternalEObject)parameter__pKi2;
			parameter__pKi2 = (WTCParam)eResolveProxy(oldParameter__pKi2);
			if (parameter__pKi2 != oldParameter__pKi2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PKI2, oldParameter__pKi2, parameter__pKi2));
			}
		}
		return parameter__pKi2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pKi2() {
		return parameter__pKi2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pKi2(WTCParam newParameter__pKi2) {
		WTCParam oldParameter__pKi2 = parameter__pKi2;
		parameter__pKi2 = newParameter__pKi2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PKI2, oldParameter__pKi2, parameter__pKi2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPosBand() {
		if (parameter__pPosBand != null && parameter__pPosBand.eIsProxy()) {
			InternalEObject oldParameter__pPosBand = (InternalEObject)parameter__pPosBand;
			parameter__pPosBand = (WTCParam)eResolveProxy(oldParameter__pPosBand);
			if (parameter__pPosBand != oldParameter__pPosBand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_BAND, oldParameter__pPosBand, parameter__pPosBand));
			}
		}
		return parameter__pPosBand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPosBand() {
		return parameter__pPosBand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPosBand(WTCParam newParameter__pPosBand) {
		WTCParam oldParameter__pPosBand = parameter__pPosBand;
		parameter__pPosBand = newParameter__pPosBand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_BAND, oldParameter__pPosBand, parameter__pPosBand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBhvParam__bpControlMode() {
		return bhvParam__bpControlMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBhvParam__bpControlMode(String newBhvParam__bpControlMode) {
		String oldBhvParam__bpControlMode = bhvParam__bpControlMode;
		bhvParam__bpControlMode = newBhvParam__bpControlMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT63__BHV_PARAM_BP_CONTROL_MODE, oldBhvParam__bpControlMode, bhvParam__bpControlMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT63__INPUT_IAZIMUTH:
				if (resolve) return getInput__iAzimuth();
				return basicGetInput__iAzimuth();
			case WTSpecPackage.CTRL_UNIT63__INPUT_IORDER:
				if (resolve) return getInput__iOrder();
				return basicGetInput__iOrder();
			case WTSpecPackage.CTRL_UNIT63__INPUT_ITARGET_HOLE:
				if (resolve) return getInput__iTargetHole();
				return basicGetInput__iTargetHole();
			case WTSpecPackage.CTRL_UNIT63__INPUT_IINV_READY_REF:
				if (resolve) return getInput__iInvReadyRef();
				return basicGetInput__iInvReadyRef();
			case WTSpecPackage.CTRL_UNIT63__INPUT_IENCODER_SPEED:
				if (resolve) return getInput__iEncoderSpeed();
				return basicGetInput__iEncoderSpeed();
			case WTSpecPackage.CTRL_UNIT63__INPUT_IINDUCTIVE_SENSOR1:
				if (resolve) return getInput__iInductiveSensor1();
				return basicGetInput__iInductiveSensor1();
			case WTSpecPackage.CTRL_UNIT63__INPUT_IINDUCTIVE_SENSOR2:
				if (resolve) return getInput__iInductiveSensor2();
				return basicGetInput__iInductiveSensor2();
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTOR_TORQUE:
				if (resolve) return getOutput__oMotorTorque();
				return basicGetOutput__oMotorTorque();
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTOR_SENSE:
				if (resolve) return getOutput__oMotorSense();
				return basicGetOutput__oMotorSense();
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OFL_INTO_POSITION:
				if (resolve) return getOutput__oFlIntoPosition();
				return basicGetOutput__oFlIntoPosition();
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OSTATUS_FROM_DLL:
				if (resolve) return getOutput__oStatusFromDll();
				return basicGetOutput__oStatusFromDll();
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OPOSITION_SETPOINT:
				if (resolve) return getOutput__oPositionSetpoint();
				return basicGetOutput__oPositionSetpoint();
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OTORQUE_AVE:
				if (resolve) return getOutput__oTorqueAve();
				return basicGetOutput__oTorqueAve();
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OERROR_AVE:
				if (resolve) return getOutput__oErrorAve();
				return basicGetOutput__oErrorAve();
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OSPEED_AVE:
				if (resolve) return getOutput__oSpeedAve();
				return basicGetOutput__oSpeedAve();
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OWREF:
				if (resolve) return getOutput__oWref();
				return basicGetOutput__oWref();
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OTARGET_POSITION:
				if (resolve) return getOutput__oTargetPosition();
				return basicGetOutput__oTargetPosition();
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OKEEP_STATE:
				if (resolve) return getOutput__oKeepState();
				return basicGetOutput__oKeepState();
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OSEEK_STATE:
				if (resolve) return getOutput__oSeekState();
				return basicGetOutput__oSeekState();
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTORIZE:
				if (resolve) return getOutput__oMotorize();
				return basicGetOutput__oMotorize();
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OREAL_OBJETIVE:
				if (resolve) return getOutput__oRealObjetive();
				return basicGetOutput__oRealObjetive();
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OCONTROL_MODE:
				if (resolve) return getOutput__oControlMode();
				return basicGetOutput__oControlMode();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_POFFSET:
				if (resolve) return getParameter__pOffset();
				return basicGetParameter__pOffset();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PENCODER_OFFSET:
				if (resolve) return getParameter__pEncoderOffset();
				return basicGetParameter__pEncoderOffset();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PNEXT_HOLE_DEGREES:
				if (resolve) return getParameter__pNextHoleDegrees();
				return basicGetParameter__pNextHoleDegrees();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_RATE1:
				if (resolve) return getParameter__pPosRate1();
				return basicGetParameter__pPosRate1();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_RATE2:
				if (resolve) return getParameter__pPosRate2();
				return basicGetParameter__pPosRate2();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_SPEED:
				if (resolve) return getParameter__pMaxSpeed();
				return basicGetParameter__pMaxSpeed();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PSAMPLE_TIME:
				if (resolve) return getParameter__pSampleTime();
				return basicGetParameter__pSampleTime();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_TORQUE:
				if (resolve) return getParameter__pMaxTorque();
				return basicGetParameter__pMaxTorque();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PAVERAGE_TIME:
				if (resolve) return getParameter__pAverageTime();
				return basicGetParameter__pAverageTime();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PSPEED_AVERAGE_TIME:
				if (resolve) return getParameter__pSpeedAverageTime();
				return basicGetParameter__pSpeedAverageTime();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_ACCELERATION:
				if (resolve) return getParameter__pMaxAcceleration();
				return basicGetParameter__pMaxAcceleration();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKPP:
				if (resolve) return getParameter__pKpp();
				return basicGetParameter__pKpp();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKPS:
				if (resolve) return getParameter__pKps();
				return basicGetParameter__pKps();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKIS:
				if (resolve) return getParameter__pKis();
				return basicGetParameter__pKis();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_OK:
				if (resolve) return getParameter__pFilterOK();
				return basicGetParameter__pFilterOK();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_FREQ:
				if (resolve) return getParameter__pFilterFreq();
				return basicGetParameter__pFilterFreq();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_DAMP:
				if (resolve) return getParameter__pFilterDamp();
				return basicGetParameter__pFilterDamp();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKP2:
				if (resolve) return getParameter__pKp2();
				return basicGetParameter__pKp2();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKP1:
				if (resolve) return getParameter__pKp1();
				return basicGetParameter__pKp1();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKI1:
				if (resolve) return getParameter__pKi1();
				return basicGetParameter__pKi1();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKI2:
				if (resolve) return getParameter__pKi2();
				return basicGetParameter__pKi2();
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_BAND:
				if (resolve) return getParameter__pPosBand();
				return basicGetParameter__pPosBand();
			case WTSpecPackage.CTRL_UNIT63__BHV_PARAM_BP_CONTROL_MODE:
				return getBhvParam__bpControlMode();
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
			case WTSpecPackage.CTRL_UNIT63__INPUT_IAZIMUTH:
				setInput__iAzimuth((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__INPUT_IORDER:
				setInput__iOrder((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__INPUT_ITARGET_HOLE:
				setInput__iTargetHole((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__INPUT_IINV_READY_REF:
				setInput__iInvReadyRef((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__INPUT_IENCODER_SPEED:
				setInput__iEncoderSpeed((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__INPUT_IINDUCTIVE_SENSOR1:
				setInput__iInductiveSensor1((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__INPUT_IINDUCTIVE_SENSOR2:
				setInput__iInductiveSensor2((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTOR_TORQUE:
				setOutput__oMotorTorque((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTOR_SENSE:
				setOutput__oMotorSense((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OFL_INTO_POSITION:
				setOutput__oFlIntoPosition((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OSTATUS_FROM_DLL:
				setOutput__oStatusFromDll((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OPOSITION_SETPOINT:
				setOutput__oPositionSetpoint((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OTORQUE_AVE:
				setOutput__oTorqueAve((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OERROR_AVE:
				setOutput__oErrorAve((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OSPEED_AVE:
				setOutput__oSpeedAve((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OWREF:
				setOutput__oWref((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OTARGET_POSITION:
				setOutput__oTargetPosition((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OKEEP_STATE:
				setOutput__oKeepState((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OSEEK_STATE:
				setOutput__oSeekState((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTORIZE:
				setOutput__oMotorize((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OREAL_OBJETIVE:
				setOutput__oRealObjetive((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OCONTROL_MODE:
				setOutput__oControlMode((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_POFFSET:
				setParameter__pOffset((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PENCODER_OFFSET:
				setParameter__pEncoderOffset((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PNEXT_HOLE_DEGREES:
				setParameter__pNextHoleDegrees((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_RATE1:
				setParameter__pPosRate1((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_RATE2:
				setParameter__pPosRate2((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_SPEED:
				setParameter__pMaxSpeed((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PSAMPLE_TIME:
				setParameter__pSampleTime((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_TORQUE:
				setParameter__pMaxTorque((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PAVERAGE_TIME:
				setParameter__pAverageTime((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PSPEED_AVERAGE_TIME:
				setParameter__pSpeedAverageTime((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_ACCELERATION:
				setParameter__pMaxAcceleration((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKPP:
				setParameter__pKpp((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKPS:
				setParameter__pKps((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKIS:
				setParameter__pKis((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_OK:
				setParameter__pFilterOK((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_FREQ:
				setParameter__pFilterFreq((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_DAMP:
				setParameter__pFilterDamp((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKP2:
				setParameter__pKp2((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKP1:
				setParameter__pKp1((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKI1:
				setParameter__pKi1((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKI2:
				setParameter__pKi2((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_BAND:
				setParameter__pPosBand((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT63__BHV_PARAM_BP_CONTROL_MODE:
				setBhvParam__bpControlMode((String)newValue);
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
			case WTSpecPackage.CTRL_UNIT63__INPUT_IAZIMUTH:
				setInput__iAzimuth((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__INPUT_IORDER:
				setInput__iOrder((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__INPUT_ITARGET_HOLE:
				setInput__iTargetHole((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__INPUT_IINV_READY_REF:
				setInput__iInvReadyRef((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__INPUT_IENCODER_SPEED:
				setInput__iEncoderSpeed((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__INPUT_IINDUCTIVE_SENSOR1:
				setInput__iInductiveSensor1((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__INPUT_IINDUCTIVE_SENSOR2:
				setInput__iInductiveSensor2((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTOR_TORQUE:
				setOutput__oMotorTorque((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTOR_SENSE:
				setOutput__oMotorSense((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OFL_INTO_POSITION:
				setOutput__oFlIntoPosition((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OSTATUS_FROM_DLL:
				setOutput__oStatusFromDll((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OPOSITION_SETPOINT:
				setOutput__oPositionSetpoint((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OTORQUE_AVE:
				setOutput__oTorqueAve((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OERROR_AVE:
				setOutput__oErrorAve((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OSPEED_AVE:
				setOutput__oSpeedAve((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OWREF:
				setOutput__oWref((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OTARGET_POSITION:
				setOutput__oTargetPosition((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OKEEP_STATE:
				setOutput__oKeepState((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OSEEK_STATE:
				setOutput__oSeekState((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTORIZE:
				setOutput__oMotorize((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OREAL_OBJETIVE:
				setOutput__oRealObjetive((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OCONTROL_MODE:
				setOutput__oControlMode((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_POFFSET:
				setParameter__pOffset((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PENCODER_OFFSET:
				setParameter__pEncoderOffset((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PNEXT_HOLE_DEGREES:
				setParameter__pNextHoleDegrees((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_RATE1:
				setParameter__pPosRate1((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_RATE2:
				setParameter__pPosRate2((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_SPEED:
				setParameter__pMaxSpeed((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PSAMPLE_TIME:
				setParameter__pSampleTime((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_TORQUE:
				setParameter__pMaxTorque((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PAVERAGE_TIME:
				setParameter__pAverageTime((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PSPEED_AVERAGE_TIME:
				setParameter__pSpeedAverageTime((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_ACCELERATION:
				setParameter__pMaxAcceleration((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKPP:
				setParameter__pKpp((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKPS:
				setParameter__pKps((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKIS:
				setParameter__pKis((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_OK:
				setParameter__pFilterOK((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_FREQ:
				setParameter__pFilterFreq((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_DAMP:
				setParameter__pFilterDamp((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKP2:
				setParameter__pKp2((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKP1:
				setParameter__pKp1((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKI1:
				setParameter__pKi1((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKI2:
				setParameter__pKi2((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_BAND:
				setParameter__pPosBand((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT63__BHV_PARAM_BP_CONTROL_MODE:
				setBhvParam__bpControlMode(BHV_PARAM_BP_CONTROL_MODE_EDEFAULT);
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
			case WTSpecPackage.CTRL_UNIT63__INPUT_IAZIMUTH:
				return input__iAzimuth != null;
			case WTSpecPackage.CTRL_UNIT63__INPUT_IORDER:
				return input__iOrder != null;
			case WTSpecPackage.CTRL_UNIT63__INPUT_ITARGET_HOLE:
				return input__iTargetHole != null;
			case WTSpecPackage.CTRL_UNIT63__INPUT_IINV_READY_REF:
				return input__iInvReadyRef != null;
			case WTSpecPackage.CTRL_UNIT63__INPUT_IENCODER_SPEED:
				return input__iEncoderSpeed != null;
			case WTSpecPackage.CTRL_UNIT63__INPUT_IINDUCTIVE_SENSOR1:
				return input__iInductiveSensor1 != null;
			case WTSpecPackage.CTRL_UNIT63__INPUT_IINDUCTIVE_SENSOR2:
				return input__iInductiveSensor2 != null;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTOR_TORQUE:
				return output__oMotorTorque != null;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTOR_SENSE:
				return output__oMotorSense != null;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OFL_INTO_POSITION:
				return output__oFlIntoPosition != null;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OSTATUS_FROM_DLL:
				return output__oStatusFromDll != null;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OPOSITION_SETPOINT:
				return output__oPositionSetpoint != null;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OTORQUE_AVE:
				return output__oTorqueAve != null;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OERROR_AVE:
				return output__oErrorAve != null;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OSPEED_AVE:
				return output__oSpeedAve != null;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OWREF:
				return output__oWref != null;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OTARGET_POSITION:
				return output__oTargetPosition != null;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OKEEP_STATE:
				return output__oKeepState != null;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OSEEK_STATE:
				return output__oSeekState != null;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OMOTORIZE:
				return output__oMotorize != null;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OREAL_OBJETIVE:
				return output__oRealObjetive != null;
			case WTSpecPackage.CTRL_UNIT63__OUTPUT_OCONTROL_MODE:
				return output__oControlMode != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_POFFSET:
				return parameter__pOffset != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PENCODER_OFFSET:
				return parameter__pEncoderOffset != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PNEXT_HOLE_DEGREES:
				return parameter__pNextHoleDegrees != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_RATE1:
				return parameter__pPosRate1 != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_RATE2:
				return parameter__pPosRate2 != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_SPEED:
				return parameter__pMaxSpeed != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PSAMPLE_TIME:
				return parameter__pSampleTime != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_TORQUE:
				return parameter__pMaxTorque != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PAVERAGE_TIME:
				return parameter__pAverageTime != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PSPEED_AVERAGE_TIME:
				return parameter__pSpeedAverageTime != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PMAX_ACCELERATION:
				return parameter__pMaxAcceleration != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKPP:
				return parameter__pKpp != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKPS:
				return parameter__pKps != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKIS:
				return parameter__pKis != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_OK:
				return parameter__pFilterOK != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_FREQ:
				return parameter__pFilterFreq != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PFILTER_DAMP:
				return parameter__pFilterDamp != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKP2:
				return parameter__pKp2 != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKP1:
				return parameter__pKp1 != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKI1:
				return parameter__pKi1 != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PKI2:
				return parameter__pKi2 != null;
			case WTSpecPackage.CTRL_UNIT63__PARAMETER_PPOS_BAND:
				return parameter__pPosBand != null;
			case WTSpecPackage.CTRL_UNIT63__BHV_PARAM_BP_CONTROL_MODE:
				return BHV_PARAM_BP_CONTROL_MODE_EDEFAULT == null ? bhvParam__bpControlMode != null : !BHV_PARAM_BP_CONTROL_MODE_EDEFAULT.equals(bhvParam__bpControlMode);
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
		result.append(" (BhvParam__bpControlMode: ");
		result.append(bhvParam__bpControlMode);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit63Impl
