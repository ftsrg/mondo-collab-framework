/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit75;
import WTSpec.WTCInput;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit75</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit75Impl#getInput__iMaintenanceStatus <em>Input iMaintenance Status</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit75Impl#getInput__iFlBrakes <em>Input iFl Brakes</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit75Impl#getInput__iWTGStopped <em>Input iWTG Stopped</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit75Impl#getInput__iGridError <em>Input iGrid Error</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit75Impl#getInput__iReTwisting <em>Input iRe Twisting</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit75Impl#getInput__iHiWind <em>Input iHi Wind</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit75Impl#getInput__iHiGust <em>Input iHi Gust</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit75Impl#getInput__iLowWind <em>Input iLow Wind</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit75Impl#getInput__iBackWind <em>Input iBack Wind</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit75Impl#getInput__iEnEstela <em>Input iEn Estela</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit75Impl#getOutput__oOpcTurbineStatus <em>Output oOpc Turbine Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit75Impl extends wtcImpl implements CtrlUnit75 {
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
	 * The cached value of the '{@link #getInput__iFlBrakes() <em>Input iFl Brakes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iFlBrakes()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iFlBrakes;

	/**
	 * The cached value of the '{@link #getInput__iWTGStopped() <em>Input iWTG Stopped</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iWTGStopped()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iWTGStopped;

	/**
	 * The cached value of the '{@link #getInput__iGridError() <em>Input iGrid Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iGridError()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iGridError;

	/**
	 * The cached value of the '{@link #getInput__iReTwisting() <em>Input iRe Twisting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iReTwisting()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iReTwisting;

	/**
	 * The cached value of the '{@link #getInput__iHiWind() <em>Input iHi Wind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iHiWind()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iHiWind;

	/**
	 * The cached value of the '{@link #getInput__iHiGust() <em>Input iHi Gust</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iHiGust()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iHiGust;

	/**
	 * The cached value of the '{@link #getInput__iLowWind() <em>Input iLow Wind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iLowWind()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iLowWind;

	/**
	 * The cached value of the '{@link #getInput__iBackWind() <em>Input iBack Wind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iBackWind()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iBackWind;

	/**
	 * The cached value of the '{@link #getInput__iEnEstela() <em>Input iEn Estela</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iEnEstela()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iEnEstela;

	/**
	 * The cached value of the '{@link #getOutput__oOpcTurbineStatus() <em>Output oOpc Turbine Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOpcTurbineStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOpcTurbineStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit75Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.Literals.CTRL_UNIT75;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT75__INPUT_IMAINTENANCE_STATUS, oldInput__iMaintenanceStatus, input__iMaintenanceStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT75__INPUT_IMAINTENANCE_STATUS, oldInput__iMaintenanceStatus, input__iMaintenanceStatus));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT75__INPUT_IFL_BRAKES, oldInput__iFlBrakes, input__iFlBrakes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT75__INPUT_IFL_BRAKES, oldInput__iFlBrakes, input__iFlBrakes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iWTGStopped() {
		if (input__iWTGStopped != null && input__iWTGStopped.eIsProxy()) {
			InternalEObject oldInput__iWTGStopped = (InternalEObject)input__iWTGStopped;
			input__iWTGStopped = (WTCInput)eResolveProxy(oldInput__iWTGStopped);
			if (input__iWTGStopped != oldInput__iWTGStopped) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT75__INPUT_IWTG_STOPPED, oldInput__iWTGStopped, input__iWTGStopped));
			}
		}
		return input__iWTGStopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iWTGStopped() {
		return input__iWTGStopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iWTGStopped(WTCInput newInput__iWTGStopped) {
		WTCInput oldInput__iWTGStopped = input__iWTGStopped;
		input__iWTGStopped = newInput__iWTGStopped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT75__INPUT_IWTG_STOPPED, oldInput__iWTGStopped, input__iWTGStopped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iGridError() {
		if (input__iGridError != null && input__iGridError.eIsProxy()) {
			InternalEObject oldInput__iGridError = (InternalEObject)input__iGridError;
			input__iGridError = (WTCInput)eResolveProxy(oldInput__iGridError);
			if (input__iGridError != oldInput__iGridError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT75__INPUT_IGRID_ERROR, oldInput__iGridError, input__iGridError));
			}
		}
		return input__iGridError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iGridError() {
		return input__iGridError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iGridError(WTCInput newInput__iGridError) {
		WTCInput oldInput__iGridError = input__iGridError;
		input__iGridError = newInput__iGridError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT75__INPUT_IGRID_ERROR, oldInput__iGridError, input__iGridError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iReTwisting() {
		if (input__iReTwisting != null && input__iReTwisting.eIsProxy()) {
			InternalEObject oldInput__iReTwisting = (InternalEObject)input__iReTwisting;
			input__iReTwisting = (WTCInput)eResolveProxy(oldInput__iReTwisting);
			if (input__iReTwisting != oldInput__iReTwisting) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT75__INPUT_IRE_TWISTING, oldInput__iReTwisting, input__iReTwisting));
			}
		}
		return input__iReTwisting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iReTwisting() {
		return input__iReTwisting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iReTwisting(WTCInput newInput__iReTwisting) {
		WTCInput oldInput__iReTwisting = input__iReTwisting;
		input__iReTwisting = newInput__iReTwisting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT75__INPUT_IRE_TWISTING, oldInput__iReTwisting, input__iReTwisting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iHiWind() {
		if (input__iHiWind != null && input__iHiWind.eIsProxy()) {
			InternalEObject oldInput__iHiWind = (InternalEObject)input__iHiWind;
			input__iHiWind = (WTCInput)eResolveProxy(oldInput__iHiWind);
			if (input__iHiWind != oldInput__iHiWind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT75__INPUT_IHI_WIND, oldInput__iHiWind, input__iHiWind));
			}
		}
		return input__iHiWind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iHiWind() {
		return input__iHiWind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iHiWind(WTCInput newInput__iHiWind) {
		WTCInput oldInput__iHiWind = input__iHiWind;
		input__iHiWind = newInput__iHiWind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT75__INPUT_IHI_WIND, oldInput__iHiWind, input__iHiWind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iHiGust() {
		if (input__iHiGust != null && input__iHiGust.eIsProxy()) {
			InternalEObject oldInput__iHiGust = (InternalEObject)input__iHiGust;
			input__iHiGust = (WTCInput)eResolveProxy(oldInput__iHiGust);
			if (input__iHiGust != oldInput__iHiGust) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT75__INPUT_IHI_GUST, oldInput__iHiGust, input__iHiGust));
			}
		}
		return input__iHiGust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iHiGust() {
		return input__iHiGust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iHiGust(WTCInput newInput__iHiGust) {
		WTCInput oldInput__iHiGust = input__iHiGust;
		input__iHiGust = newInput__iHiGust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT75__INPUT_IHI_GUST, oldInput__iHiGust, input__iHiGust));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iLowWind() {
		if (input__iLowWind != null && input__iLowWind.eIsProxy()) {
			InternalEObject oldInput__iLowWind = (InternalEObject)input__iLowWind;
			input__iLowWind = (WTCInput)eResolveProxy(oldInput__iLowWind);
			if (input__iLowWind != oldInput__iLowWind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT75__INPUT_ILOW_WIND, oldInput__iLowWind, input__iLowWind));
			}
		}
		return input__iLowWind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iLowWind() {
		return input__iLowWind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iLowWind(WTCInput newInput__iLowWind) {
		WTCInput oldInput__iLowWind = input__iLowWind;
		input__iLowWind = newInput__iLowWind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT75__INPUT_ILOW_WIND, oldInput__iLowWind, input__iLowWind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iBackWind() {
		if (input__iBackWind != null && input__iBackWind.eIsProxy()) {
			InternalEObject oldInput__iBackWind = (InternalEObject)input__iBackWind;
			input__iBackWind = (WTCInput)eResolveProxy(oldInput__iBackWind);
			if (input__iBackWind != oldInput__iBackWind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT75__INPUT_IBACK_WIND, oldInput__iBackWind, input__iBackWind));
			}
		}
		return input__iBackWind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iBackWind() {
		return input__iBackWind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iBackWind(WTCInput newInput__iBackWind) {
		WTCInput oldInput__iBackWind = input__iBackWind;
		input__iBackWind = newInput__iBackWind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT75__INPUT_IBACK_WIND, oldInput__iBackWind, input__iBackWind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iEnEstela() {
		if (input__iEnEstela != null && input__iEnEstela.eIsProxy()) {
			InternalEObject oldInput__iEnEstela = (InternalEObject)input__iEnEstela;
			input__iEnEstela = (WTCInput)eResolveProxy(oldInput__iEnEstela);
			if (input__iEnEstela != oldInput__iEnEstela) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT75__INPUT_IEN_ESTELA, oldInput__iEnEstela, input__iEnEstela));
			}
		}
		return input__iEnEstela;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iEnEstela() {
		return input__iEnEstela;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iEnEstela(WTCInput newInput__iEnEstela) {
		WTCInput oldInput__iEnEstela = input__iEnEstela;
		input__iEnEstela = newInput__iEnEstela;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT75__INPUT_IEN_ESTELA, oldInput__iEnEstela, input__iEnEstela));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOpcTurbineStatus() {
		if (output__oOpcTurbineStatus != null && output__oOpcTurbineStatus.eIsProxy()) {
			InternalEObject oldOutput__oOpcTurbineStatus = (InternalEObject)output__oOpcTurbineStatus;
			output__oOpcTurbineStatus = (WTCOutput)eResolveProxy(oldOutput__oOpcTurbineStatus);
			if (output__oOpcTurbineStatus != oldOutput__oOpcTurbineStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT75__OUTPUT_OOPC_TURBINE_STATUS, oldOutput__oOpcTurbineStatus, output__oOpcTurbineStatus));
			}
		}
		return output__oOpcTurbineStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOpcTurbineStatus() {
		return output__oOpcTurbineStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOpcTurbineStatus(WTCOutput newOutput__oOpcTurbineStatus) {
		WTCOutput oldOutput__oOpcTurbineStatus = output__oOpcTurbineStatus;
		output__oOpcTurbineStatus = newOutput__oOpcTurbineStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT75__OUTPUT_OOPC_TURBINE_STATUS, oldOutput__oOpcTurbineStatus, output__oOpcTurbineStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT75__INPUT_IMAINTENANCE_STATUS:
				if (resolve) return getInput__iMaintenanceStatus();
				return basicGetInput__iMaintenanceStatus();
			case WTSpecPackage.CTRL_UNIT75__INPUT_IFL_BRAKES:
				if (resolve) return getInput__iFlBrakes();
				return basicGetInput__iFlBrakes();
			case WTSpecPackage.CTRL_UNIT75__INPUT_IWTG_STOPPED:
				if (resolve) return getInput__iWTGStopped();
				return basicGetInput__iWTGStopped();
			case WTSpecPackage.CTRL_UNIT75__INPUT_IGRID_ERROR:
				if (resolve) return getInput__iGridError();
				return basicGetInput__iGridError();
			case WTSpecPackage.CTRL_UNIT75__INPUT_IRE_TWISTING:
				if (resolve) return getInput__iReTwisting();
				return basicGetInput__iReTwisting();
			case WTSpecPackage.CTRL_UNIT75__INPUT_IHI_WIND:
				if (resolve) return getInput__iHiWind();
				return basicGetInput__iHiWind();
			case WTSpecPackage.CTRL_UNIT75__INPUT_IHI_GUST:
				if (resolve) return getInput__iHiGust();
				return basicGetInput__iHiGust();
			case WTSpecPackage.CTRL_UNIT75__INPUT_ILOW_WIND:
				if (resolve) return getInput__iLowWind();
				return basicGetInput__iLowWind();
			case WTSpecPackage.CTRL_UNIT75__INPUT_IBACK_WIND:
				if (resolve) return getInput__iBackWind();
				return basicGetInput__iBackWind();
			case WTSpecPackage.CTRL_UNIT75__INPUT_IEN_ESTELA:
				if (resolve) return getInput__iEnEstela();
				return basicGetInput__iEnEstela();
			case WTSpecPackage.CTRL_UNIT75__OUTPUT_OOPC_TURBINE_STATUS:
				if (resolve) return getOutput__oOpcTurbineStatus();
				return basicGetOutput__oOpcTurbineStatus();
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
			case WTSpecPackage.CTRL_UNIT75__INPUT_IMAINTENANCE_STATUS:
				setInput__iMaintenanceStatus((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IFL_BRAKES:
				setInput__iFlBrakes((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IWTG_STOPPED:
				setInput__iWTGStopped((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IGRID_ERROR:
				setInput__iGridError((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IRE_TWISTING:
				setInput__iReTwisting((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IHI_WIND:
				setInput__iHiWind((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IHI_GUST:
				setInput__iHiGust((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_ILOW_WIND:
				setInput__iLowWind((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IBACK_WIND:
				setInput__iBackWind((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IEN_ESTELA:
				setInput__iEnEstela((WTCInput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT75__OUTPUT_OOPC_TURBINE_STATUS:
				setOutput__oOpcTurbineStatus((WTCOutput)newValue);
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
			case WTSpecPackage.CTRL_UNIT75__INPUT_IMAINTENANCE_STATUS:
				setInput__iMaintenanceStatus((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IFL_BRAKES:
				setInput__iFlBrakes((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IWTG_STOPPED:
				setInput__iWTGStopped((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IGRID_ERROR:
				setInput__iGridError((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IRE_TWISTING:
				setInput__iReTwisting((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IHI_WIND:
				setInput__iHiWind((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IHI_GUST:
				setInput__iHiGust((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_ILOW_WIND:
				setInput__iLowWind((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IBACK_WIND:
				setInput__iBackWind((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IEN_ESTELA:
				setInput__iEnEstela((WTCInput)null);
				return;
			case WTSpecPackage.CTRL_UNIT75__OUTPUT_OOPC_TURBINE_STATUS:
				setOutput__oOpcTurbineStatus((WTCOutput)null);
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
			case WTSpecPackage.CTRL_UNIT75__INPUT_IMAINTENANCE_STATUS:
				return input__iMaintenanceStatus != null;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IFL_BRAKES:
				return input__iFlBrakes != null;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IWTG_STOPPED:
				return input__iWTGStopped != null;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IGRID_ERROR:
				return input__iGridError != null;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IRE_TWISTING:
				return input__iReTwisting != null;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IHI_WIND:
				return input__iHiWind != null;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IHI_GUST:
				return input__iHiGust != null;
			case WTSpecPackage.CTRL_UNIT75__INPUT_ILOW_WIND:
				return input__iLowWind != null;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IBACK_WIND:
				return input__iBackWind != null;
			case WTSpecPackage.CTRL_UNIT75__INPUT_IEN_ESTELA:
				return input__iEnEstela != null;
			case WTSpecPackage.CTRL_UNIT75__OUTPUT_OOPC_TURBINE_STATUS:
				return output__oOpcTurbineStatus != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit75Impl
