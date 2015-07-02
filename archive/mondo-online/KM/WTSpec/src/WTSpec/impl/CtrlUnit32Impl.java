/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit32;
import WTSpec.WTCOutput;
import WTSpec.WTCParam;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit32</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit32Impl#getOutput__oChangeCmd <em>Output oChange Cmd</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit32Impl#getOutput__oPersistentHour <em>Output oPersistent Hour</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit32Impl#getParameter__pDayChangeHour <em>Parameter pDay Change Hour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit32Impl extends wtcImpl implements CtrlUnit32 {
	/**
	 * The cached value of the '{@link #getOutput__oChangeCmd() <em>Output oChange Cmd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oChangeCmd()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oChangeCmd;

	/**
	 * The cached value of the '{@link #getOutput__oPersistentHour() <em>Output oPersistent Hour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPersistentHour()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPersistentHour;

	/**
	 * The cached value of the '{@link #getParameter__pDayChangeHour() <em>Parameter pDay Change Hour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pDayChangeHour()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pDayChangeHour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit32Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit32();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oChangeCmd() {
		if (output__oChangeCmd != null && output__oChangeCmd.eIsProxy()) {
			InternalEObject oldOutput__oChangeCmd = (InternalEObject)output__oChangeCmd;
			output__oChangeCmd = (WTCOutput)eResolveProxy(oldOutput__oChangeCmd);
			if (output__oChangeCmd != oldOutput__oChangeCmd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT32__OUTPUT_OCHANGE_CMD, oldOutput__oChangeCmd, output__oChangeCmd));
			}
		}
		return output__oChangeCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oChangeCmd() {
		return output__oChangeCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oChangeCmd(WTCOutput newOutput__oChangeCmd) {
		WTCOutput oldOutput__oChangeCmd = output__oChangeCmd;
		output__oChangeCmd = newOutput__oChangeCmd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT32__OUTPUT_OCHANGE_CMD, oldOutput__oChangeCmd, output__oChangeCmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPersistentHour() {
		if (output__oPersistentHour != null && output__oPersistentHour.eIsProxy()) {
			InternalEObject oldOutput__oPersistentHour = (InternalEObject)output__oPersistentHour;
			output__oPersistentHour = (WTCOutput)eResolveProxy(oldOutput__oPersistentHour);
			if (output__oPersistentHour != oldOutput__oPersistentHour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT32__OUTPUT_OPERSISTENT_HOUR, oldOutput__oPersistentHour, output__oPersistentHour));
			}
		}
		return output__oPersistentHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPersistentHour() {
		return output__oPersistentHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPersistentHour(WTCOutput newOutput__oPersistentHour) {
		WTCOutput oldOutput__oPersistentHour = output__oPersistentHour;
		output__oPersistentHour = newOutput__oPersistentHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT32__OUTPUT_OPERSISTENT_HOUR, oldOutput__oPersistentHour, output__oPersistentHour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pDayChangeHour() {
		if (parameter__pDayChangeHour != null && parameter__pDayChangeHour.eIsProxy()) {
			InternalEObject oldParameter__pDayChangeHour = (InternalEObject)parameter__pDayChangeHour;
			parameter__pDayChangeHour = (WTCParam)eResolveProxy(oldParameter__pDayChangeHour);
			if (parameter__pDayChangeHour != oldParameter__pDayChangeHour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT32__PARAMETER_PDAY_CHANGE_HOUR, oldParameter__pDayChangeHour, parameter__pDayChangeHour));
			}
		}
		return parameter__pDayChangeHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pDayChangeHour() {
		return parameter__pDayChangeHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pDayChangeHour(WTCParam newParameter__pDayChangeHour) {
		WTCParam oldParameter__pDayChangeHour = parameter__pDayChangeHour;
		parameter__pDayChangeHour = newParameter__pDayChangeHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT32__PARAMETER_PDAY_CHANGE_HOUR, oldParameter__pDayChangeHour, parameter__pDayChangeHour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT32__OUTPUT_OCHANGE_CMD:
				if (resolve) return getOutput__oChangeCmd();
				return basicGetOutput__oChangeCmd();
			case WTSpecPackage.CTRL_UNIT32__OUTPUT_OPERSISTENT_HOUR:
				if (resolve) return getOutput__oPersistentHour();
				return basicGetOutput__oPersistentHour();
			case WTSpecPackage.CTRL_UNIT32__PARAMETER_PDAY_CHANGE_HOUR:
				if (resolve) return getParameter__pDayChangeHour();
				return basicGetParameter__pDayChangeHour();
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
			case WTSpecPackage.CTRL_UNIT32__OUTPUT_OCHANGE_CMD:
				setOutput__oChangeCmd((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT32__OUTPUT_OPERSISTENT_HOUR:
				setOutput__oPersistentHour((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT32__PARAMETER_PDAY_CHANGE_HOUR:
				setParameter__pDayChangeHour((WTCParam)newValue);
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
			case WTSpecPackage.CTRL_UNIT32__OUTPUT_OCHANGE_CMD:
				setOutput__oChangeCmd((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT32__OUTPUT_OPERSISTENT_HOUR:
				setOutput__oPersistentHour((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT32__PARAMETER_PDAY_CHANGE_HOUR:
				setParameter__pDayChangeHour((WTCParam)null);
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
			case WTSpecPackage.CTRL_UNIT32__OUTPUT_OCHANGE_CMD:
				return output__oChangeCmd != null;
			case WTSpecPackage.CTRL_UNIT32__OUTPUT_OPERSISTENT_HOUR:
				return output__oPersistentHour != null;
			case WTSpecPackage.CTRL_UNIT32__PARAMETER_PDAY_CHANGE_HOUR:
				return parameter__pDayChangeHour != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit32Impl
