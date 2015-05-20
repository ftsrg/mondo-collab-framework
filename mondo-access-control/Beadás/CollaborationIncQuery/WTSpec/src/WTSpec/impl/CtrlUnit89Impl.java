/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit89;
import WTSpec.WTCErrorReaction;
import WTSpec.WTCFault;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTCParam;
import WTSpec.WTCTimer;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit89</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getInput__iAngleReference1 <em>Input iAngle Reference1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getInput__iAngleReference2 <em>Input iAngle Reference2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getInput__iAngleReference3 <em>Input iAngle Reference3</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getInput__iSpeedReference <em>Input iSpeed Reference</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getInput__iAccelerationReference <em>Input iAcceleration Reference</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getInput__iPitchManualControl <em>Input iPitch Manual Control</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getInput__iPitchManualAngle <em>Input iPitch Manual Angle</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getInput__iMaintenanceStatus <em>Input iMaintenance Status</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getInput__iGeneratorSpeed <em>Input iGenerator Speed</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getInput__iPitchBraked <em>Input iPitch Braked</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getOutput__oPitchAngleRef1 <em>Output oPitch Angle Ref1</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getOutput__oPitchAngleRef2 <em>Output oPitch Angle Ref2</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getOutput__oPitchAngleRef3 <em>Output oPitch Angle Ref3</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getOutput__oPitchSpeedRef <em>Output oPitch Speed Ref</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getOutput__oPitchAccelerationRef <em>Output oPitch Acceleration Ref</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getOutput__oPitchStopCommand <em>Output oPitch Stop Command</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getParameter__pGeneratorSpeed <em>Parameter pGenerator Speed</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getParameter__pPitchBrakeAngle <em>Parameter pPitch Brake Angle</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getParameter__pPitchStdSpeed <em>Parameter pPitch Std Speed</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getParameter__pPitchStdAcceleration <em>Parameter pPitch Std Acceleration</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getFault__fManualStop <em>Fault fManual Stop</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getTimer__tMaxStopOperationLength <em>Timer tMax Stop Operation Length</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit89Impl#getErrorReaction__erStop <em>Error Reaction er Stop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit89Impl extends wtcImpl implements CtrlUnit89 {
	/**
	 * The cached value of the '{@link #getInput__iAngleReference1() <em>Input iAngle Reference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iAngleReference1()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iAngleReference1;

	/**
	 * The cached value of the '{@link #getInput__iAngleReference2() <em>Input iAngle Reference2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iAngleReference2()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iAngleReference2;

	/**
	 * The cached value of the '{@link #getInput__iAngleReference3() <em>Input iAngle Reference3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iAngleReference3()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iAngleReference3;

	/**
	 * The cached value of the '{@link #getInput__iSpeedReference() <em>Input iSpeed Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iSpeedReference()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iSpeedReference;

	/**
	 * The cached value of the '{@link #getInput__iAccelerationReference() <em>Input iAcceleration Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iAccelerationReference()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iAccelerationReference;

	/**
	 * The cached value of the '{@link #getInput__iPitchManualControl() <em>Input iPitch Manual Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPitchManualControl()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPitchManualControl;

	/**
	 * The cached value of the '{@link #getInput__iPitchManualAngle() <em>Input iPitch Manual Angle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPitchManualAngle()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPitchManualAngle;

	/**
	 * The cached value of the '{@link #getInput__iMaintenanceStatus() <em>Input iMaintenance Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iMaintenanceStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iMaintenanceStatus;

	/**
	 * The cached value of the '{@link #getInput__iGeneratorSpeed() <em>Input iGenerator Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iGeneratorSpeed()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iGeneratorSpeed;

	/**
	 * The cached value of the '{@link #getInput__iPitchBraked() <em>Input iPitch Braked</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iPitchBraked()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iPitchBraked;

	/**
	 * The cached value of the '{@link #getOutput__oPitchAngleRef1() <em>Output oPitch Angle Ref1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPitchAngleRef1()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPitchAngleRef1;

	/**
	 * The cached value of the '{@link #getOutput__oPitchAngleRef2() <em>Output oPitch Angle Ref2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPitchAngleRef2()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPitchAngleRef2;

	/**
	 * The cached value of the '{@link #getOutput__oPitchAngleRef3() <em>Output oPitch Angle Ref3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPitchAngleRef3()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPitchAngleRef3;

	/**
	 * The cached value of the '{@link #getOutput__oPitchSpeedRef() <em>Output oPitch Speed Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPitchSpeedRef()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPitchSpeedRef;

	/**
	 * The cached value of the '{@link #getOutput__oPitchAccelerationRef() <em>Output oPitch Acceleration Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPitchAccelerationRef()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPitchAccelerationRef;

	/**
	 * The cached value of the '{@link #getOutput__oPitchStopCommand() <em>Output oPitch Stop Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPitchStopCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPitchStopCommand;

	/**
	 * The cached value of the '{@link #getParameter__pGeneratorSpeed() <em>Parameter pGenerator Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pGeneratorSpeed()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pGeneratorSpeed;

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
	 * The cached value of the '{@link #getFault__fManualStop() <em>Fault fManual Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fManualStop()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fManualStop;

	/**
	 * The cached value of the '{@link #getTimer__tMaxStopOperationLength() <em>Timer tMax Stop Operation Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tMaxStopOperationLength()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tMaxStopOperationLength;

	/**
	 * The cached value of the '{@link #getErrorReaction__erStop() <em>Error Reaction er Stop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorReaction__erStop()
	 * @generated
	 * @ordered
	 */
	protected WTCErrorReaction errorReaction__erStop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit89Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT89;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iAngleReference1() {
		if (input__iAngleReference1 != null && input__iAngleReference1.eIsProxy()) {
			InternalEObject oldInput__iAngleReference1 = (InternalEObject)input__iAngleReference1;
			input__iAngleReference1 = (WTCInput)eResolveProxy(oldInput__iAngleReference1);
			if (input__iAngleReference1 != oldInput__iAngleReference1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE1, oldInput__iAngleReference1, input__iAngleReference1));
			}
		}
		return input__iAngleReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iAngleReference1() {
		return input__iAngleReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iAngleReference1(WTCInput newInput__iAngleReference1) {
		WTCInput oldInput__iAngleReference1 = input__iAngleReference1;
		input__iAngleReference1 = newInput__iAngleReference1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE1, oldInput__iAngleReference1, input__iAngleReference1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iAngleReference2() {
		if (input__iAngleReference2 != null && input__iAngleReference2.eIsProxy()) {
			InternalEObject oldInput__iAngleReference2 = (InternalEObject)input__iAngleReference2;
			input__iAngleReference2 = (WTCInput)eResolveProxy(oldInput__iAngleReference2);
			if (input__iAngleReference2 != oldInput__iAngleReference2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE2, oldInput__iAngleReference2, input__iAngleReference2));
			}
		}
		return input__iAngleReference2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iAngleReference2() {
		return input__iAngleReference2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iAngleReference2(WTCInput newInput__iAngleReference2) {
		WTCInput oldInput__iAngleReference2 = input__iAngleReference2;
		input__iAngleReference2 = newInput__iAngleReference2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE2, oldInput__iAngleReference2, input__iAngleReference2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iAngleReference3() {
		if (input__iAngleReference3 != null && input__iAngleReference3.eIsProxy()) {
			InternalEObject oldInput__iAngleReference3 = (InternalEObject)input__iAngleReference3;
			input__iAngleReference3 = (WTCInput)eResolveProxy(oldInput__iAngleReference3);
			if (input__iAngleReference3 != oldInput__iAngleReference3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE3, oldInput__iAngleReference3, input__iAngleReference3));
			}
		}
		return input__iAngleReference3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iAngleReference3() {
		return input__iAngleReference3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iAngleReference3(WTCInput newInput__iAngleReference3) {
		WTCInput oldInput__iAngleReference3 = input__iAngleReference3;
		input__iAngleReference3 = newInput__iAngleReference3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE3, oldInput__iAngleReference3, input__iAngleReference3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iSpeedReference() {
		if (input__iSpeedReference != null && input__iSpeedReference.eIsProxy()) {
			InternalEObject oldInput__iSpeedReference = (InternalEObject)input__iSpeedReference;
			input__iSpeedReference = (WTCInput)eResolveProxy(oldInput__iSpeedReference);
			if (input__iSpeedReference != oldInput__iSpeedReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__INPUT_ISPEED_REFERENCE, oldInput__iSpeedReference, input__iSpeedReference));
			}
		}
		return input__iSpeedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iSpeedReference() {
		return input__iSpeedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iSpeedReference(WTCInput newInput__iSpeedReference) {
		WTCInput oldInput__iSpeedReference = input__iSpeedReference;
		input__iSpeedReference = newInput__iSpeedReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__INPUT_ISPEED_REFERENCE, oldInput__iSpeedReference, input__iSpeedReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iAccelerationReference() {
		if (input__iAccelerationReference != null && input__iAccelerationReference.eIsProxy()) {
			InternalEObject oldInput__iAccelerationReference = (InternalEObject)input__iAccelerationReference;
			input__iAccelerationReference = (WTCInput)eResolveProxy(oldInput__iAccelerationReference);
			if (input__iAccelerationReference != oldInput__iAccelerationReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__INPUT_IACCELERATION_REFERENCE, oldInput__iAccelerationReference, input__iAccelerationReference));
			}
		}
		return input__iAccelerationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iAccelerationReference() {
		return input__iAccelerationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iAccelerationReference(WTCInput newInput__iAccelerationReference) {
		WTCInput oldInput__iAccelerationReference = input__iAccelerationReference;
		input__iAccelerationReference = newInput__iAccelerationReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__INPUT_IACCELERATION_REFERENCE, oldInput__iAccelerationReference, input__iAccelerationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPitchManualControl() {
		if (input__iPitchManualControl != null && input__iPitchManualControl.eIsProxy()) {
			InternalEObject oldInput__iPitchManualControl = (InternalEObject)input__iPitchManualControl;
			input__iPitchManualControl = (WTCInput)eResolveProxy(oldInput__iPitchManualControl);
			if (input__iPitchManualControl != oldInput__iPitchManualControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_MANUAL_CONTROL, oldInput__iPitchManualControl, input__iPitchManualControl));
			}
		}
		return input__iPitchManualControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPitchManualControl() {
		return input__iPitchManualControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPitchManualControl(WTCInput newInput__iPitchManualControl) {
		WTCInput oldInput__iPitchManualControl = input__iPitchManualControl;
		input__iPitchManualControl = newInput__iPitchManualControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_MANUAL_CONTROL, oldInput__iPitchManualControl, input__iPitchManualControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPitchManualAngle() {
		if (input__iPitchManualAngle != null && input__iPitchManualAngle.eIsProxy()) {
			InternalEObject oldInput__iPitchManualAngle = (InternalEObject)input__iPitchManualAngle;
			input__iPitchManualAngle = (WTCInput)eResolveProxy(oldInput__iPitchManualAngle);
			if (input__iPitchManualAngle != oldInput__iPitchManualAngle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_MANUAL_ANGLE, oldInput__iPitchManualAngle, input__iPitchManualAngle));
			}
		}
		return input__iPitchManualAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPitchManualAngle() {
		return input__iPitchManualAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPitchManualAngle(WTCInput newInput__iPitchManualAngle) {
		WTCInput oldInput__iPitchManualAngle = input__iPitchManualAngle;
		input__iPitchManualAngle = newInput__iPitchManualAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_MANUAL_ANGLE, oldInput__iPitchManualAngle, input__iPitchManualAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iMaintenanceStatus() {
		if (input__iMaintenanceStatus != null && input__iMaintenanceStatus.eIsProxy()) {
			InternalEObject oldInput__iMaintenanceStatus = (InternalEObject)input__iMaintenanceStatus;
			input__iMaintenanceStatus = (WTCInput)eResolveProxy(oldInput__iMaintenanceStatus);
			if (input__iMaintenanceStatus != oldInput__iMaintenanceStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__INPUT_IMAINTENANCE_STATUS, oldInput__iMaintenanceStatus, input__iMaintenanceStatus));
			}
		}
		return input__iMaintenanceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iMaintenanceStatus() {
		return input__iMaintenanceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iMaintenanceStatus(WTCInput newInput__iMaintenanceStatus) {
		WTCInput oldInput__iMaintenanceStatus = input__iMaintenanceStatus;
		input__iMaintenanceStatus = newInput__iMaintenanceStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__INPUT_IMAINTENANCE_STATUS, oldInput__iMaintenanceStatus, input__iMaintenanceStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iGeneratorSpeed() {
		if (input__iGeneratorSpeed != null && input__iGeneratorSpeed.eIsProxy()) {
			InternalEObject oldInput__iGeneratorSpeed = (InternalEObject)input__iGeneratorSpeed;
			input__iGeneratorSpeed = (WTCInput)eResolveProxy(oldInput__iGeneratorSpeed);
			if (input__iGeneratorSpeed != oldInput__iGeneratorSpeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__INPUT_IGENERATOR_SPEED, oldInput__iGeneratorSpeed, input__iGeneratorSpeed));
			}
		}
		return input__iGeneratorSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iGeneratorSpeed() {
		return input__iGeneratorSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iGeneratorSpeed(WTCInput newInput__iGeneratorSpeed) {
		WTCInput oldInput__iGeneratorSpeed = input__iGeneratorSpeed;
		input__iGeneratorSpeed = newInput__iGeneratorSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__INPUT_IGENERATOR_SPEED, oldInput__iGeneratorSpeed, input__iGeneratorSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iPitchBraked() {
		if (input__iPitchBraked != null && input__iPitchBraked.eIsProxy()) {
			InternalEObject oldInput__iPitchBraked = (InternalEObject)input__iPitchBraked;
			input__iPitchBraked = (WTCInput)eResolveProxy(oldInput__iPitchBraked);
			if (input__iPitchBraked != oldInput__iPitchBraked) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_BRAKED, oldInput__iPitchBraked, input__iPitchBraked));
			}
		}
		return input__iPitchBraked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iPitchBraked() {
		return input__iPitchBraked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iPitchBraked(WTCInput newInput__iPitchBraked) {
		WTCInput oldInput__iPitchBraked = input__iPitchBraked;
		input__iPitchBraked = newInput__iPitchBraked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_BRAKED, oldInput__iPitchBraked, input__iPitchBraked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPitchAngleRef1() {
		if (output__oPitchAngleRef1 != null && output__oPitchAngleRef1.eIsProxy()) {
			InternalEObject oldOutput__oPitchAngleRef1 = (InternalEObject)output__oPitchAngleRef1;
			output__oPitchAngleRef1 = (WTCOutput)eResolveProxy(oldOutput__oPitchAngleRef1);
			if (output__oPitchAngleRef1 != oldOutput__oPitchAngleRef1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF1, oldOutput__oPitchAngleRef1, output__oPitchAngleRef1));
			}
		}
		return output__oPitchAngleRef1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPitchAngleRef1() {
		return output__oPitchAngleRef1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPitchAngleRef1(WTCOutput newOutput__oPitchAngleRef1) {
		WTCOutput oldOutput__oPitchAngleRef1 = output__oPitchAngleRef1;
		output__oPitchAngleRef1 = newOutput__oPitchAngleRef1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF1, oldOutput__oPitchAngleRef1, output__oPitchAngleRef1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPitchAngleRef2() {
		if (output__oPitchAngleRef2 != null && output__oPitchAngleRef2.eIsProxy()) {
			InternalEObject oldOutput__oPitchAngleRef2 = (InternalEObject)output__oPitchAngleRef2;
			output__oPitchAngleRef2 = (WTCOutput)eResolveProxy(oldOutput__oPitchAngleRef2);
			if (output__oPitchAngleRef2 != oldOutput__oPitchAngleRef2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF2, oldOutput__oPitchAngleRef2, output__oPitchAngleRef2));
			}
		}
		return output__oPitchAngleRef2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPitchAngleRef2() {
		return output__oPitchAngleRef2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPitchAngleRef2(WTCOutput newOutput__oPitchAngleRef2) {
		WTCOutput oldOutput__oPitchAngleRef2 = output__oPitchAngleRef2;
		output__oPitchAngleRef2 = newOutput__oPitchAngleRef2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF2, oldOutput__oPitchAngleRef2, output__oPitchAngleRef2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPitchAngleRef3() {
		if (output__oPitchAngleRef3 != null && output__oPitchAngleRef3.eIsProxy()) {
			InternalEObject oldOutput__oPitchAngleRef3 = (InternalEObject)output__oPitchAngleRef3;
			output__oPitchAngleRef3 = (WTCOutput)eResolveProxy(oldOutput__oPitchAngleRef3);
			if (output__oPitchAngleRef3 != oldOutput__oPitchAngleRef3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF3, oldOutput__oPitchAngleRef3, output__oPitchAngleRef3));
			}
		}
		return output__oPitchAngleRef3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPitchAngleRef3() {
		return output__oPitchAngleRef3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPitchAngleRef3(WTCOutput newOutput__oPitchAngleRef3) {
		WTCOutput oldOutput__oPitchAngleRef3 = output__oPitchAngleRef3;
		output__oPitchAngleRef3 = newOutput__oPitchAngleRef3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF3, oldOutput__oPitchAngleRef3, output__oPitchAngleRef3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPitchSpeedRef() {
		if (output__oPitchSpeedRef != null && output__oPitchSpeedRef.eIsProxy()) {
			InternalEObject oldOutput__oPitchSpeedRef = (InternalEObject)output__oPitchSpeedRef;
			output__oPitchSpeedRef = (WTCOutput)eResolveProxy(oldOutput__oPitchSpeedRef);
			if (output__oPitchSpeedRef != oldOutput__oPitchSpeedRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_SPEED_REF, oldOutput__oPitchSpeedRef, output__oPitchSpeedRef));
			}
		}
		return output__oPitchSpeedRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPitchSpeedRef() {
		return output__oPitchSpeedRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPitchSpeedRef(WTCOutput newOutput__oPitchSpeedRef) {
		WTCOutput oldOutput__oPitchSpeedRef = output__oPitchSpeedRef;
		output__oPitchSpeedRef = newOutput__oPitchSpeedRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_SPEED_REF, oldOutput__oPitchSpeedRef, output__oPitchSpeedRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPitchAccelerationRef() {
		if (output__oPitchAccelerationRef != null && output__oPitchAccelerationRef.eIsProxy()) {
			InternalEObject oldOutput__oPitchAccelerationRef = (InternalEObject)output__oPitchAccelerationRef;
			output__oPitchAccelerationRef = (WTCOutput)eResolveProxy(oldOutput__oPitchAccelerationRef);
			if (output__oPitchAccelerationRef != oldOutput__oPitchAccelerationRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ACCELERATION_REF, oldOutput__oPitchAccelerationRef, output__oPitchAccelerationRef));
			}
		}
		return output__oPitchAccelerationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPitchAccelerationRef() {
		return output__oPitchAccelerationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPitchAccelerationRef(WTCOutput newOutput__oPitchAccelerationRef) {
		WTCOutput oldOutput__oPitchAccelerationRef = output__oPitchAccelerationRef;
		output__oPitchAccelerationRef = newOutput__oPitchAccelerationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ACCELERATION_REF, oldOutput__oPitchAccelerationRef, output__oPitchAccelerationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPitchStopCommand() {
		if (output__oPitchStopCommand != null && output__oPitchStopCommand.eIsProxy()) {
			InternalEObject oldOutput__oPitchStopCommand = (InternalEObject)output__oPitchStopCommand;
			output__oPitchStopCommand = (WTCOutput)eResolveProxy(oldOutput__oPitchStopCommand);
			if (output__oPitchStopCommand != oldOutput__oPitchStopCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_STOP_COMMAND, oldOutput__oPitchStopCommand, output__oPitchStopCommand));
			}
		}
		return output__oPitchStopCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPitchStopCommand() {
		return output__oPitchStopCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPitchStopCommand(WTCOutput newOutput__oPitchStopCommand) {
		WTCOutput oldOutput__oPitchStopCommand = output__oPitchStopCommand;
		output__oPitchStopCommand = newOutput__oPitchStopCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_STOP_COMMAND, oldOutput__oPitchStopCommand, output__oPitchStopCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pGeneratorSpeed() {
		if (parameter__pGeneratorSpeed != null && parameter__pGeneratorSpeed.eIsProxy()) {
			InternalEObject oldParameter__pGeneratorSpeed = (InternalEObject)parameter__pGeneratorSpeed;
			parameter__pGeneratorSpeed = (WTCParam)eResolveProxy(oldParameter__pGeneratorSpeed);
			if (parameter__pGeneratorSpeed != oldParameter__pGeneratorSpeed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__PARAMETER_PGENERATOR_SPEED, oldParameter__pGeneratorSpeed, parameter__pGeneratorSpeed));
			}
		}
		return parameter__pGeneratorSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pGeneratorSpeed() {
		return parameter__pGeneratorSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pGeneratorSpeed(WTCParam newParameter__pGeneratorSpeed) {
		WTCParam oldParameter__pGeneratorSpeed = parameter__pGeneratorSpeed;
		parameter__pGeneratorSpeed = newParameter__pGeneratorSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__PARAMETER_PGENERATOR_SPEED, oldParameter__pGeneratorSpeed, parameter__pGeneratorSpeed));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_BRAKE_ANGLE, oldParameter__pPitchBrakeAngle, parameter__pPitchBrakeAngle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_BRAKE_ANGLE, oldParameter__pPitchBrakeAngle, parameter__pPitchBrakeAngle));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_STD_SPEED, oldParameter__pPitchStdSpeed, parameter__pPitchStdSpeed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_STD_SPEED, oldParameter__pPitchStdSpeed, parameter__pPitchStdSpeed));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_STD_ACCELERATION, oldParameter__pPitchStdAcceleration, parameter__pPitchStdAcceleration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_STD_ACCELERATION, oldParameter__pPitchStdAcceleration, parameter__pPitchStdAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fManualStop() {
		if (fault__fManualStop != null && fault__fManualStop.eIsProxy()) {
			InternalEObject oldFault__fManualStop = (InternalEObject)fault__fManualStop;
			fault__fManualStop = (WTCFault)eResolveProxy(oldFault__fManualStop);
			if (fault__fManualStop != oldFault__fManualStop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__FAULT_FMANUAL_STOP, oldFault__fManualStop, fault__fManualStop));
			}
		}
		return fault__fManualStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fManualStop() {
		return fault__fManualStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fManualStop(WTCFault newFault__fManualStop) {
		WTCFault oldFault__fManualStop = fault__fManualStop;
		fault__fManualStop = newFault__fManualStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__FAULT_FMANUAL_STOP, oldFault__fManualStop, fault__fManualStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tMaxStopOperationLength() {
		if (timer__tMaxStopOperationLength != null && timer__tMaxStopOperationLength.eIsProxy()) {
			InternalEObject oldTimer__tMaxStopOperationLength = (InternalEObject)timer__tMaxStopOperationLength;
			timer__tMaxStopOperationLength = (WTCTimer)eResolveProxy(oldTimer__tMaxStopOperationLength);
			if (timer__tMaxStopOperationLength != oldTimer__tMaxStopOperationLength) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__TIMER_TMAX_STOP_OPERATION_LENGTH, oldTimer__tMaxStopOperationLength, timer__tMaxStopOperationLength));
			}
		}
		return timer__tMaxStopOperationLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tMaxStopOperationLength() {
		return timer__tMaxStopOperationLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tMaxStopOperationLength(WTCTimer newTimer__tMaxStopOperationLength) {
		WTCTimer oldTimer__tMaxStopOperationLength = timer__tMaxStopOperationLength;
		timer__tMaxStopOperationLength = newTimer__tMaxStopOperationLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__TIMER_TMAX_STOP_OPERATION_LENGTH, oldTimer__tMaxStopOperationLength, timer__tMaxStopOperationLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction getErrorReaction__erStop() {
		if (errorReaction__erStop != null && errorReaction__erStop.eIsProxy()) {
			InternalEObject oldErrorReaction__erStop = (InternalEObject)errorReaction__erStop;
			errorReaction__erStop = (WTCErrorReaction)eResolveProxy(oldErrorReaction__erStop);
			if (errorReaction__erStop != oldErrorReaction__erStop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT89__ERROR_REACTION_ER_STOP, oldErrorReaction__erStop, errorReaction__erStop));
			}
		}
		return errorReaction__erStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction basicGetErrorReaction__erStop() {
		return errorReaction__erStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorReaction__erStop(WTCErrorReaction newErrorReaction__erStop) {
		WTCErrorReaction oldErrorReaction__erStop = errorReaction__erStop;
		errorReaction__erStop = newErrorReaction__erStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT89__ERROR_REACTION_ER_STOP, oldErrorReaction__erStop, errorReaction__erStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE1:
				if (resolve) return getInput__iAngleReference1();
				return basicGetInput__iAngleReference1();
			case WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE2:
				if (resolve) return getInput__iAngleReference2();
				return basicGetInput__iAngleReference2();
			case WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE3:
				if (resolve) return getInput__iAngleReference3();
				return basicGetInput__iAngleReference3();
			case WTSpecPackage.CTRL_UNIT89__INPUT_ISPEED_REFERENCE:
				if (resolve) return getInput__iSpeedReference();
				return basicGetInput__iSpeedReference();
			case WTSpecPackage.CTRL_UNIT89__INPUT_IACCELERATION_REFERENCE:
				if (resolve) return getInput__iAccelerationReference();
				return basicGetInput__iAccelerationReference();
			case WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_MANUAL_CONTROL:
				if (resolve) return getInput__iPitchManualControl();
				return basicGetInput__iPitchManualControl();
			case WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_MANUAL_ANGLE:
				if (resolve) return getInput__iPitchManualAngle();
				return basicGetInput__iPitchManualAngle();
			case WTSpecPackage.CTRL_UNIT89__INPUT_IMAINTENANCE_STATUS:
				if (resolve) return getInput__iMaintenanceStatus();
				return basicGetInput__iMaintenanceStatus();
			case WTSpecPackage.CTRL_UNIT89__INPUT_IGENERATOR_SPEED:
				if (resolve) return getInput__iGeneratorSpeed();
				return basicGetInput__iGeneratorSpeed();
			case WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_BRAKED:
				if (resolve) return getInput__iPitchBraked();
				return basicGetInput__iPitchBraked();
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF1:
				if (resolve) return getOutput__oPitchAngleRef1();
				return basicGetOutput__oPitchAngleRef1();
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF2:
				if (resolve) return getOutput__oPitchAngleRef2();
				return basicGetOutput__oPitchAngleRef2();
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF3:
				if (resolve) return getOutput__oPitchAngleRef3();
				return basicGetOutput__oPitchAngleRef3();
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_SPEED_REF:
				if (resolve) return getOutput__oPitchSpeedRef();
				return basicGetOutput__oPitchSpeedRef();
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ACCELERATION_REF:
				if (resolve) return getOutput__oPitchAccelerationRef();
				return basicGetOutput__oPitchAccelerationRef();
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_STOP_COMMAND:
				if (resolve) return getOutput__oPitchStopCommand();
				return basicGetOutput__oPitchStopCommand();
			case WTSpecPackage.CTRL_UNIT89__PARAMETER_PGENERATOR_SPEED:
				if (resolve) return getParameter__pGeneratorSpeed();
				return basicGetParameter__pGeneratorSpeed();
			case WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_BRAKE_ANGLE:
				if (resolve) return getParameter__pPitchBrakeAngle();
				return basicGetParameter__pPitchBrakeAngle();
			case WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_STD_SPEED:
				if (resolve) return getParameter__pPitchStdSpeed();
				return basicGetParameter__pPitchStdSpeed();
			case WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_STD_ACCELERATION:
				if (resolve) return getParameter__pPitchStdAcceleration();
				return basicGetParameter__pPitchStdAcceleration();
			case WTSpecPackage.CTRL_UNIT89__FAULT_FMANUAL_STOP:
				if (resolve) return getFault__fManualStop();
				return basicGetFault__fManualStop();
			case WTSpecPackage.CTRL_UNIT89__TIMER_TMAX_STOP_OPERATION_LENGTH:
				if (resolve) return getTimer__tMaxStopOperationLength();
				return basicGetTimer__tMaxStopOperationLength();
			case WTSpecPackage.CTRL_UNIT89__ERROR_REACTION_ER_STOP:
				if (resolve) return getErrorReaction__erStop();
				return basicGetErrorReaction__erStop();
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
			case WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE1:
				setInput__iAngleReference1((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE2:
				setInput__iAngleReference2((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE3:
				setInput__iAngleReference3((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_ISPEED_REFERENCE:
				setInput__iSpeedReference((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IACCELERATION_REFERENCE:
				setInput__iAccelerationReference((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_MANUAL_CONTROL:
				setInput__iPitchManualControl((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_MANUAL_ANGLE:
				setInput__iPitchManualAngle((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IMAINTENANCE_STATUS:
				setInput__iMaintenanceStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IGENERATOR_SPEED:
				setInput__iGeneratorSpeed((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_BRAKED:
				setInput__iPitchBraked((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF1:
				setOutput__oPitchAngleRef1((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF2:
				setOutput__oPitchAngleRef2((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF3:
				setOutput__oPitchAngleRef3((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_SPEED_REF:
				setOutput__oPitchSpeedRef((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ACCELERATION_REF:
				setOutput__oPitchAccelerationRef((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_STOP_COMMAND:
				setOutput__oPitchStopCommand((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__PARAMETER_PGENERATOR_SPEED:
				setParameter__pGeneratorSpeed((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_BRAKE_ANGLE:
				setParameter__pPitchBrakeAngle((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_STD_SPEED:
				setParameter__pPitchStdSpeed((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_STD_ACCELERATION:
				setParameter__pPitchStdAcceleration((WTCParam)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__FAULT_FMANUAL_STOP:
				setFault__fManualStop((WTCFault)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__TIMER_TMAX_STOP_OPERATION_LENGTH:
				setTimer__tMaxStopOperationLength((WTCTimer)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT89__ERROR_REACTION_ER_STOP:
				setErrorReaction__erStop((WTCErrorReaction)newValue);
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
			case WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE1:
				setInput__iAngleReference1((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE2:
				setInput__iAngleReference2((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE3:
				setInput__iAngleReference3((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_ISPEED_REFERENCE:
				setInput__iSpeedReference((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IACCELERATION_REFERENCE:
				setInput__iAccelerationReference((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_MANUAL_CONTROL:
				setInput__iPitchManualControl((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_MANUAL_ANGLE:
				setInput__iPitchManualAngle((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IMAINTENANCE_STATUS:
				setInput__iMaintenanceStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IGENERATOR_SPEED:
				setInput__iGeneratorSpeed((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_BRAKED:
				setInput__iPitchBraked((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF1:
				setOutput__oPitchAngleRef1((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF2:
				setOutput__oPitchAngleRef2((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF3:
				setOutput__oPitchAngleRef3((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_SPEED_REF:
				setOutput__oPitchSpeedRef((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ACCELERATION_REF:
				setOutput__oPitchAccelerationRef((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_STOP_COMMAND:
				setOutput__oPitchStopCommand((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__PARAMETER_PGENERATOR_SPEED:
				setParameter__pGeneratorSpeed((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_BRAKE_ANGLE:
				setParameter__pPitchBrakeAngle((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_STD_SPEED:
				setParameter__pPitchStdSpeed((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_STD_ACCELERATION:
				setParameter__pPitchStdAcceleration((WTCParam)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__FAULT_FMANUAL_STOP:
				setFault__fManualStop((WTCFault)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__TIMER_TMAX_STOP_OPERATION_LENGTH:
				setTimer__tMaxStopOperationLength((WTCTimer)null);
				return;
			case WTSpecPackage.CTRL_UNIT89__ERROR_REACTION_ER_STOP:
				setErrorReaction__erStop((WTCErrorReaction)null);
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
			case WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE1:
				return input__iAngleReference1 != null;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE2:
				return input__iAngleReference2 != null;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IANGLE_REFERENCE3:
				return input__iAngleReference3 != null;
			case WTSpecPackage.CTRL_UNIT89__INPUT_ISPEED_REFERENCE:
				return input__iSpeedReference != null;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IACCELERATION_REFERENCE:
				return input__iAccelerationReference != null;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_MANUAL_CONTROL:
				return input__iPitchManualControl != null;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_MANUAL_ANGLE:
				return input__iPitchManualAngle != null;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IMAINTENANCE_STATUS:
				return input__iMaintenanceStatus != null;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IGENERATOR_SPEED:
				return input__iGeneratorSpeed != null;
			case WTSpecPackage.CTRL_UNIT89__INPUT_IPITCH_BRAKED:
				return input__iPitchBraked != null;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF1:
				return output__oPitchAngleRef1 != null;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF2:
				return output__oPitchAngleRef2 != null;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF3:
				return output__oPitchAngleRef3 != null;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_SPEED_REF:
				return output__oPitchSpeedRef != null;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_ACCELERATION_REF:
				return output__oPitchAccelerationRef != null;
			case WTSpecPackage.CTRL_UNIT89__OUTPUT_OPITCH_STOP_COMMAND:
				return output__oPitchStopCommand != null;
			case WTSpecPackage.CTRL_UNIT89__PARAMETER_PGENERATOR_SPEED:
				return parameter__pGeneratorSpeed != null;
			case WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_BRAKE_ANGLE:
				return parameter__pPitchBrakeAngle != null;
			case WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_STD_SPEED:
				return parameter__pPitchStdSpeed != null;
			case WTSpecPackage.CTRL_UNIT89__PARAMETER_PPITCH_STD_ACCELERATION:
				return parameter__pPitchStdAcceleration != null;
			case WTSpecPackage.CTRL_UNIT89__FAULT_FMANUAL_STOP:
				return fault__fManualStop != null;
			case WTSpecPackage.CTRL_UNIT89__TIMER_TMAX_STOP_OPERATION_LENGTH:
				return timer__tMaxStopOperationLength != null;
			case WTSpecPackage.CTRL_UNIT89__ERROR_REACTION_ER_STOP:
				return errorReaction__erStop != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit89Impl
