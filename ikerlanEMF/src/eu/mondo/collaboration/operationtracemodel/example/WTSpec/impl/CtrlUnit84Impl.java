/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.CtrlUnit84;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCErrorReaction;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCInput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCOutput;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTCParam;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit84</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit84Impl#getInput__iAngleGH1 <em>Input iAngle GH1</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit84Impl#getInput__iAngleGH2 <em>Input iAngle GH2</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit84Impl#getInput__iAngleGH3 <em>Input iAngle GH3</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit84Impl#getInput__iStopCommand <em>Input iStop Command</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit84Impl#getInput__iFlBrakes <em>Input iFl Brakes</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit84Impl#getOutput__oAngleReference1 <em>Output oAngle Reference1</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit84Impl#getOutput__oAngleReference2 <em>Output oAngle Reference2</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit84Impl#getOutput__oAngleReference3 <em>Output oAngle Reference3</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit84Impl#getOutput__oSpeedReference <em>Output oSpeed Reference</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit84Impl#getOutput__oAccelerationReference <em>Output oAcceleration Reference</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit84Impl#getParameter__pPitchBrakeAngle <em>Parameter pPitch Brake Angle</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit84Impl#getParameter__pPitchStdSpeed <em>Parameter pPitch Std Speed</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit84Impl#getParameter__pPitchStdAcceleration <em>Parameter pPitch Std Acceleration</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit84Impl#getParameter__pPitchRegulationSpeed <em>Parameter pPitch Regulation Speed</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit84Impl#getParameter__pPitchRegulationAcceleration <em>Parameter pPitch Regulation Acceleration</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl.CtrlUnit84Impl#getErrorReaction__erEmergency <em>Error Reaction er Emergency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit84Impl extends wtcImpl implements CtrlUnit84 {
	/**
	 * The cached value of the '{@link #getInput__iAngleGH1() <em>Input iAngle GH1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iAngleGH1()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iAngleGH1;

	/**
	 * The cached value of the '{@link #getInput__iAngleGH2() <em>Input iAngle GH2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iAngleGH2()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iAngleGH2;

	/**
	 * The cached value of the '{@link #getInput__iAngleGH3() <em>Input iAngle GH3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iAngleGH3()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iAngleGH3;

	/**
	 * The cached value of the '{@link #getInput__iStopCommand() <em>Input iStop Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iStopCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iStopCommand;

	/**
	 * The cached value of the '{@link #getInput__iFlBrakes() <em>Input iFl Brakes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iFlBrakes()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iFlBrakes;

	/**
	 * The cached value of the '{@link #getOutput__oAngleReference1() <em>Output oAngle Reference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oAngleReference1()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oAngleReference1;

	/**
	 * The cached value of the '{@link #getOutput__oAngleReference2() <em>Output oAngle Reference2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oAngleReference2()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oAngleReference2;

	/**
	 * The cached value of the '{@link #getOutput__oAngleReference3() <em>Output oAngle Reference3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oAngleReference3()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oAngleReference3;

	/**
	 * The cached value of the '{@link #getOutput__oSpeedReference() <em>Output oSpeed Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oSpeedReference()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oSpeedReference;

	/**
	 * The cached value of the '{@link #getOutput__oAccelerationReference() <em>Output oAcceleration Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oAccelerationReference()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oAccelerationReference;

	/**
	 * The cached value of the '{@link #getParameter__pPitchBrakeAngle() <em>Parameter pPitch Brake Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPitchBrakeAngle()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPitchBrakeAngle;

	/**
	 * The cached value of the '{@link #getParameter__pPitchStdSpeed() <em>Parameter pPitch Std Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPitchStdSpeed()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPitchStdSpeed;

	/**
	 * The cached value of the '{@link #getParameter__pPitchStdAcceleration() <em>Parameter pPitch Std Acceleration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPitchStdAcceleration()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPitchStdAcceleration;

	/**
	 * The cached value of the '{@link #getParameter__pPitchRegulationSpeed() <em>Parameter pPitch Regulation Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPitchRegulationSpeed()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPitchRegulationSpeed;

	/**
	 * The cached value of the '{@link #getParameter__pPitchRegulationAcceleration() <em>Parameter pPitch Regulation Acceleration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pPitchRegulationAcceleration()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pPitchRegulationAcceleration;

	/**
	 * The cached value of the '{@link #getErrorReaction__erEmergency() <em>Error Reaction er Emergency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorReaction__erEmergency()
	 * @generated
	 * @ordered
	 */
	protected WTCErrorReaction errorReaction__erEmergency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit84Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit84();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iAngleGH1() {
		if (input__iAngleGH1 != null && input__iAngleGH1.eIsProxy()) {
			InternalEObject oldInput__iAngleGH1 = (InternalEObject)input__iAngleGH1;
			input__iAngleGH1 = (WTCInput)eResolveProxy(oldInput__iAngleGH1);
			if (input__iAngleGH1 != oldInput__iAngleGH1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH1, oldInput__iAngleGH1, input__iAngleGH1));
			}
		}
		return input__iAngleGH1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iAngleGH1() {
		return input__iAngleGH1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iAngleGH1(WTCInput newInput__iAngleGH1) {
		WTCInput oldInput__iAngleGH1 = input__iAngleGH1;
		input__iAngleGH1 = newInput__iAngleGH1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH1, oldInput__iAngleGH1, input__iAngleGH1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iAngleGH2() {
		if (input__iAngleGH2 != null && input__iAngleGH2.eIsProxy()) {
			InternalEObject oldInput__iAngleGH2 = (InternalEObject)input__iAngleGH2;
			input__iAngleGH2 = (WTCInput)eResolveProxy(oldInput__iAngleGH2);
			if (input__iAngleGH2 != oldInput__iAngleGH2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH2, oldInput__iAngleGH2, input__iAngleGH2));
			}
		}
		return input__iAngleGH2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iAngleGH2() {
		return input__iAngleGH2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iAngleGH2(WTCInput newInput__iAngleGH2) {
		WTCInput oldInput__iAngleGH2 = input__iAngleGH2;
		input__iAngleGH2 = newInput__iAngleGH2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH2, oldInput__iAngleGH2, input__iAngleGH2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iAngleGH3() {
		if (input__iAngleGH3 != null && input__iAngleGH3.eIsProxy()) {
			InternalEObject oldInput__iAngleGH3 = (InternalEObject)input__iAngleGH3;
			input__iAngleGH3 = (WTCInput)eResolveProxy(oldInput__iAngleGH3);
			if (input__iAngleGH3 != oldInput__iAngleGH3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH3, oldInput__iAngleGH3, input__iAngleGH3));
			}
		}
		return input__iAngleGH3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iAngleGH3() {
		return input__iAngleGH3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iAngleGH3(WTCInput newInput__iAngleGH3) {
		WTCInput oldInput__iAngleGH3 = input__iAngleGH3;
		input__iAngleGH3 = newInput__iAngleGH3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH3, oldInput__iAngleGH3, input__iAngleGH3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iStopCommand() {
		if (input__iStopCommand != null && input__iStopCommand.eIsProxy()) {
			InternalEObject oldInput__iStopCommand = (InternalEObject)input__iStopCommand;
			input__iStopCommand = (WTCInput)eResolveProxy(oldInput__iStopCommand);
			if (input__iStopCommand != oldInput__iStopCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT84__INPUT_ISTOP_COMMAND, oldInput__iStopCommand, input__iStopCommand));
			}
		}
		return input__iStopCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iStopCommand() {
		return input__iStopCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iStopCommand(WTCInput newInput__iStopCommand) {
		WTCInput oldInput__iStopCommand = input__iStopCommand;
		input__iStopCommand = newInput__iStopCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT84__INPUT_ISTOP_COMMAND, oldInput__iStopCommand, input__iStopCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iFlBrakes() {
		if (input__iFlBrakes != null && input__iFlBrakes.eIsProxy()) {
			InternalEObject oldInput__iFlBrakes = (InternalEObject)input__iFlBrakes;
			input__iFlBrakes = (WTCInput)eResolveProxy(oldInput__iFlBrakes);
			if (input__iFlBrakes != oldInput__iFlBrakes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT84__INPUT_IFL_BRAKES, oldInput__iFlBrakes, input__iFlBrakes));
			}
		}
		return input__iFlBrakes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iFlBrakes() {
		return input__iFlBrakes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iFlBrakes(WTCInput newInput__iFlBrakes) {
		WTCInput oldInput__iFlBrakes = input__iFlBrakes;
		input__iFlBrakes = newInput__iFlBrakes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT84__INPUT_IFL_BRAKES, oldInput__iFlBrakes, input__iFlBrakes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oAngleReference1() {
		if (output__oAngleReference1 != null && output__oAngleReference1.eIsProxy()) {
			InternalEObject oldOutput__oAngleReference1 = (InternalEObject)output__oAngleReference1;
			output__oAngleReference1 = (WTCOutput)eResolveProxy(oldOutput__oAngleReference1);
			if (output__oAngleReference1 != oldOutput__oAngleReference1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE1, oldOutput__oAngleReference1, output__oAngleReference1));
			}
		}
		return output__oAngleReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oAngleReference1() {
		return output__oAngleReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oAngleReference1(WTCOutput newOutput__oAngleReference1) {
		WTCOutput oldOutput__oAngleReference1 = output__oAngleReference1;
		output__oAngleReference1 = newOutput__oAngleReference1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE1, oldOutput__oAngleReference1, output__oAngleReference1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oAngleReference2() {
		if (output__oAngleReference2 != null && output__oAngleReference2.eIsProxy()) {
			InternalEObject oldOutput__oAngleReference2 = (InternalEObject)output__oAngleReference2;
			output__oAngleReference2 = (WTCOutput)eResolveProxy(oldOutput__oAngleReference2);
			if (output__oAngleReference2 != oldOutput__oAngleReference2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE2, oldOutput__oAngleReference2, output__oAngleReference2));
			}
		}
		return output__oAngleReference2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oAngleReference2() {
		return output__oAngleReference2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oAngleReference2(WTCOutput newOutput__oAngleReference2) {
		WTCOutput oldOutput__oAngleReference2 = output__oAngleReference2;
		output__oAngleReference2 = newOutput__oAngleReference2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE2, oldOutput__oAngleReference2, output__oAngleReference2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oAngleReference3() {
		if (output__oAngleReference3 != null && output__oAngleReference3.eIsProxy()) {
			InternalEObject oldOutput__oAngleReference3 = (InternalEObject)output__oAngleReference3;
			output__oAngleReference3 = (WTCOutput)eResolveProxy(oldOutput__oAngleReference3);
			if (output__oAngleReference3 != oldOutput__oAngleReference3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE3, oldOutput__oAngleReference3, output__oAngleReference3));
			}
		}
		return output__oAngleReference3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oAngleReference3() {
		return output__oAngleReference3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oAngleReference3(WTCOutput newOutput__oAngleReference3) {
		WTCOutput oldOutput__oAngleReference3 = output__oAngleReference3;
		output__oAngleReference3 = newOutput__oAngleReference3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE3, oldOutput__oAngleReference3, output__oAngleReference3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oSpeedReference() {
		if (output__oSpeedReference != null && output__oSpeedReference.eIsProxy()) {
			InternalEObject oldOutput__oSpeedReference = (InternalEObject)output__oSpeedReference;
			output__oSpeedReference = (WTCOutput)eResolveProxy(oldOutput__oSpeedReference);
			if (output__oSpeedReference != oldOutput__oSpeedReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT84__OUTPUT_OSPEED_REFERENCE, oldOutput__oSpeedReference, output__oSpeedReference));
			}
		}
		return output__oSpeedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oSpeedReference() {
		return output__oSpeedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oSpeedReference(WTCOutput newOutput__oSpeedReference) {
		WTCOutput oldOutput__oSpeedReference = output__oSpeedReference;
		output__oSpeedReference = newOutput__oSpeedReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT84__OUTPUT_OSPEED_REFERENCE, oldOutput__oSpeedReference, output__oSpeedReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oAccelerationReference() {
		if (output__oAccelerationReference != null && output__oAccelerationReference.eIsProxy()) {
			InternalEObject oldOutput__oAccelerationReference = (InternalEObject)output__oAccelerationReference;
			output__oAccelerationReference = (WTCOutput)eResolveProxy(oldOutput__oAccelerationReference);
			if (output__oAccelerationReference != oldOutput__oAccelerationReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT84__OUTPUT_OACCELERATION_REFERENCE, oldOutput__oAccelerationReference, output__oAccelerationReference));
			}
		}
		return output__oAccelerationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oAccelerationReference() {
		return output__oAccelerationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oAccelerationReference(WTCOutput newOutput__oAccelerationReference) {
		WTCOutput oldOutput__oAccelerationReference = output__oAccelerationReference;
		output__oAccelerationReference = newOutput__oAccelerationReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT84__OUTPUT_OACCELERATION_REFERENCE, oldOutput__oAccelerationReference, output__oAccelerationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPitchBrakeAngle() {
		if (parameter__pPitchBrakeAngle != null && parameter__pPitchBrakeAngle.eIsProxy()) {
			InternalEObject oldParameter__pPitchBrakeAngle = (InternalEObject)parameter__pPitchBrakeAngle;
			parameter__pPitchBrakeAngle = (WTCParam)eResolveProxy(oldParameter__pPitchBrakeAngle);
			if (parameter__pPitchBrakeAngle != oldParameter__pPitchBrakeAngle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_BRAKE_ANGLE, oldParameter__pPitchBrakeAngle, parameter__pPitchBrakeAngle));
			}
		}
		return parameter__pPitchBrakeAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPitchBrakeAngle() {
		return parameter__pPitchBrakeAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPitchBrakeAngle(WTCParam newParameter__pPitchBrakeAngle) {
		WTCParam oldParameter__pPitchBrakeAngle = parameter__pPitchBrakeAngle;
		parameter__pPitchBrakeAngle = newParameter__pPitchBrakeAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_BRAKE_ANGLE, oldParameter__pPitchBrakeAngle, parameter__pPitchBrakeAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPitchStdSpeed() {
		if (parameter__pPitchStdSpeed != null && parameter__pPitchStdSpeed.eIsProxy()) {
			InternalEObject oldParameter__pPitchStdSpeed = (InternalEObject)parameter__pPitchStdSpeed;
			parameter__pPitchStdSpeed = (WTCParam)eResolveProxy(oldParameter__pPitchStdSpeed);
			if (parameter__pPitchStdSpeed != oldParameter__pPitchStdSpeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_STD_SPEED, oldParameter__pPitchStdSpeed, parameter__pPitchStdSpeed));
			}
		}
		return parameter__pPitchStdSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPitchStdSpeed() {
		return parameter__pPitchStdSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPitchStdSpeed(WTCParam newParameter__pPitchStdSpeed) {
		WTCParam oldParameter__pPitchStdSpeed = parameter__pPitchStdSpeed;
		parameter__pPitchStdSpeed = newParameter__pPitchStdSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_STD_SPEED, oldParameter__pPitchStdSpeed, parameter__pPitchStdSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPitchStdAcceleration() {
		if (parameter__pPitchStdAcceleration != null && parameter__pPitchStdAcceleration.eIsProxy()) {
			InternalEObject oldParameter__pPitchStdAcceleration = (InternalEObject)parameter__pPitchStdAcceleration;
			parameter__pPitchStdAcceleration = (WTCParam)eResolveProxy(oldParameter__pPitchStdAcceleration);
			if (parameter__pPitchStdAcceleration != oldParameter__pPitchStdAcceleration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_STD_ACCELERATION, oldParameter__pPitchStdAcceleration, parameter__pPitchStdAcceleration));
			}
		}
		return parameter__pPitchStdAcceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPitchStdAcceleration() {
		return parameter__pPitchStdAcceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPitchStdAcceleration(WTCParam newParameter__pPitchStdAcceleration) {
		WTCParam oldParameter__pPitchStdAcceleration = parameter__pPitchStdAcceleration;
		parameter__pPitchStdAcceleration = newParameter__pPitchStdAcceleration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_STD_ACCELERATION, oldParameter__pPitchStdAcceleration, parameter__pPitchStdAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPitchRegulationSpeed() {
		if (parameter__pPitchRegulationSpeed != null && parameter__pPitchRegulationSpeed.eIsProxy()) {
			InternalEObject oldParameter__pPitchRegulationSpeed = (InternalEObject)parameter__pPitchRegulationSpeed;
			parameter__pPitchRegulationSpeed = (WTCParam)eResolveProxy(oldParameter__pPitchRegulationSpeed);
			if (parameter__pPitchRegulationSpeed != oldParameter__pPitchRegulationSpeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_REGULATION_SPEED, oldParameter__pPitchRegulationSpeed, parameter__pPitchRegulationSpeed));
			}
		}
		return parameter__pPitchRegulationSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPitchRegulationSpeed() {
		return parameter__pPitchRegulationSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPitchRegulationSpeed(WTCParam newParameter__pPitchRegulationSpeed) {
		WTCParam oldParameter__pPitchRegulationSpeed = parameter__pPitchRegulationSpeed;
		parameter__pPitchRegulationSpeed = newParameter__pPitchRegulationSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_REGULATION_SPEED, oldParameter__pPitchRegulationSpeed, parameter__pPitchRegulationSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pPitchRegulationAcceleration() {
		if (parameter__pPitchRegulationAcceleration != null && parameter__pPitchRegulationAcceleration.eIsProxy()) {
			InternalEObject oldParameter__pPitchRegulationAcceleration = (InternalEObject)parameter__pPitchRegulationAcceleration;
			parameter__pPitchRegulationAcceleration = (WTCParam)eResolveProxy(oldParameter__pPitchRegulationAcceleration);
			if (parameter__pPitchRegulationAcceleration != oldParameter__pPitchRegulationAcceleration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_REGULATION_ACCELERATION, oldParameter__pPitchRegulationAcceleration, parameter__pPitchRegulationAcceleration));
			}
		}
		return parameter__pPitchRegulationAcceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pPitchRegulationAcceleration() {
		return parameter__pPitchRegulationAcceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pPitchRegulationAcceleration(WTCParam newParameter__pPitchRegulationAcceleration) {
		WTCParam oldParameter__pPitchRegulationAcceleration = parameter__pPitchRegulationAcceleration;
		parameter__pPitchRegulationAcceleration = newParameter__pPitchRegulationAcceleration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_REGULATION_ACCELERATION, oldParameter__pPitchRegulationAcceleration, parameter__pPitchRegulationAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction getErrorReaction__erEmergency() {
		if (errorReaction__erEmergency != null && errorReaction__erEmergency.eIsProxy()) {
			InternalEObject oldErrorReaction__erEmergency = (InternalEObject)errorReaction__erEmergency;
			errorReaction__erEmergency = (WTCErrorReaction)eResolveProxy(oldErrorReaction__erEmergency);
			if (errorReaction__erEmergency != oldErrorReaction__erEmergency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT84__ERROR_REACTION_ER_EMERGENCY, oldErrorReaction__erEmergency, errorReaction__erEmergency));
			}
		}
		return errorReaction__erEmergency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction basicGetErrorReaction__erEmergency() {
		return errorReaction__erEmergency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorReaction__erEmergency(WTCErrorReaction newErrorReaction__erEmergency) {
		WTCErrorReaction oldErrorReaction__erEmergency = errorReaction__erEmergency;
		errorReaction__erEmergency = newErrorReaction__erEmergency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT84__ERROR_REACTION_ER_EMERGENCY, oldErrorReaction__erEmergency, errorReaction__erEmergency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH1:
				if (resolve) return getInput__iAngleGH1();
				return basicGetInput__iAngleGH1();
			case WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH2:
				if (resolve) return getInput__iAngleGH2();
				return basicGetInput__iAngleGH2();
			case WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH3:
				if (resolve) return getInput__iAngleGH3();
				return basicGetInput__iAngleGH3();
			case WTSpecPackage.CTRL_UNIT84__INPUT_ISTOP_COMMAND:
				if (resolve) return getInput__iStopCommand();
				return basicGetInput__iStopCommand();
			case WTSpecPackage.CTRL_UNIT84__INPUT_IFL_BRAKES:
				if (resolve) return getInput__iFlBrakes();
				return basicGetInput__iFlBrakes();
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE1:
				if (resolve) return getOutput__oAngleReference1();
				return basicGetOutput__oAngleReference1();
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE2:
				if (resolve) return getOutput__oAngleReference2();
				return basicGetOutput__oAngleReference2();
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE3:
				if (resolve) return getOutput__oAngleReference3();
				return basicGetOutput__oAngleReference3();
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OSPEED_REFERENCE:
				if (resolve) return getOutput__oSpeedReference();
				return basicGetOutput__oSpeedReference();
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OACCELERATION_REFERENCE:
				if (resolve) return getOutput__oAccelerationReference();
				return basicGetOutput__oAccelerationReference();
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_BRAKE_ANGLE:
				if (resolve) return getParameter__pPitchBrakeAngle();
				return basicGetParameter__pPitchBrakeAngle();
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_STD_SPEED:
				if (resolve) return getParameter__pPitchStdSpeed();
				return basicGetParameter__pPitchStdSpeed();
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_STD_ACCELERATION:
				if (resolve) return getParameter__pPitchStdAcceleration();
				return basicGetParameter__pPitchStdAcceleration();
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_REGULATION_SPEED:
				if (resolve) return getParameter__pPitchRegulationSpeed();
				return basicGetParameter__pPitchRegulationSpeed();
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_REGULATION_ACCELERATION:
				if (resolve) return getParameter__pPitchRegulationAcceleration();
				return basicGetParameter__pPitchRegulationAcceleration();
			case WTSpecPackage.CTRL_UNIT84__ERROR_REACTION_ER_EMERGENCY:
				if (resolve) return getErrorReaction__erEmergency();
				return basicGetErrorReaction__erEmergency();
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
			case WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH1:
				setInput__iAngleGH1((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH2:
				setInput__iAngleGH2((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH3:
				setInput__iAngleGH3((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT84__INPUT_ISTOP_COMMAND:
				setInput__iStopCommand((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT84__INPUT_IFL_BRAKES:
				setInput__iFlBrakes((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE1:
				setOutput__oAngleReference1((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE2:
				setOutput__oAngleReference2((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE3:
				setOutput__oAngleReference3((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OSPEED_REFERENCE:
				setOutput__oSpeedReference((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OACCELERATION_REFERENCE:
				setOutput__oAccelerationReference((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_BRAKE_ANGLE:
				setParameter__pPitchBrakeAngle((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_STD_SPEED:
				setParameter__pPitchStdSpeed((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_STD_ACCELERATION:
				setParameter__pPitchStdAcceleration((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_REGULATION_SPEED:
				setParameter__pPitchRegulationSpeed((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_REGULATION_ACCELERATION:
				setParameter__pPitchRegulationAcceleration((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT84__ERROR_REACTION_ER_EMERGENCY:
				setErrorReaction__erEmergency((WTCErrorReaction)newValue);
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
			case WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH1:
				setInput__iAngleGH1((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH2:
				setInput__iAngleGH2((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH3:
				setInput__iAngleGH3((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT84__INPUT_ISTOP_COMMAND:
				setInput__iStopCommand((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT84__INPUT_IFL_BRAKES:
				setInput__iFlBrakes((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE1:
				setOutput__oAngleReference1((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE2:
				setOutput__oAngleReference2((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE3:
				setOutput__oAngleReference3((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OSPEED_REFERENCE:
				setOutput__oSpeedReference((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OACCELERATION_REFERENCE:
				setOutput__oAccelerationReference((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_BRAKE_ANGLE:
				setParameter__pPitchBrakeAngle((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_STD_SPEED:
				setParameter__pPitchStdSpeed((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_STD_ACCELERATION:
				setParameter__pPitchStdAcceleration((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_REGULATION_SPEED:
				setParameter__pPitchRegulationSpeed((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_REGULATION_ACCELERATION:
				setParameter__pPitchRegulationAcceleration((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT84__ERROR_REACTION_ER_EMERGENCY:
				setErrorReaction__erEmergency((WTCErrorReaction)null);
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
			case WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH1:
				return input__iAngleGH1 != null;
			case WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH2:
				return input__iAngleGH2 != null;
			case WTSpecPackage.CTRL_UNIT84__INPUT_IANGLE_GH3:
				return input__iAngleGH3 != null;
			case WTSpecPackage.CTRL_UNIT84__INPUT_ISTOP_COMMAND:
				return input__iStopCommand != null;
			case WTSpecPackage.CTRL_UNIT84__INPUT_IFL_BRAKES:
				return input__iFlBrakes != null;
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE1:
				return output__oAngleReference1 != null;
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE2:
				return output__oAngleReference2 != null;
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE3:
				return output__oAngleReference3 != null;
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OSPEED_REFERENCE:
				return output__oSpeedReference != null;
			case WTSpecPackage.CTRL_UNIT84__OUTPUT_OACCELERATION_REFERENCE:
				return output__oAccelerationReference != null;
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_BRAKE_ANGLE:
				return parameter__pPitchBrakeAngle != null;
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_STD_SPEED:
				return parameter__pPitchStdSpeed != null;
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_STD_ACCELERATION:
				return parameter__pPitchStdAcceleration != null;
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_REGULATION_SPEED:
				return parameter__pPitchRegulationSpeed != null;
			case WTSpecPackage.CTRL_UNIT84__PARAMETER_PPITCH_REGULATION_ACCELERATION:
				return parameter__pPitchRegulationAcceleration != null;
			case WTSpecPackage.CTRL_UNIT84__ERROR_REACTION_ER_EMERGENCY:
				return errorReaction__erEmergency != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit84Impl
