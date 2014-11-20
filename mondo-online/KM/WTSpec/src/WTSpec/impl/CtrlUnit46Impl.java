/**
 */
package WTSpec.impl;

import WTSpec.CtrlUnit46;
import WTSpec.WTCErrorReaction;
import WTSpec.WTCOutput;
import WTSpec.WTSpecPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit46</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.CtrlUnit46Impl#getOutput__oOutput <em>Output oOutput</em>}</li>
 *   <li>{@link WTSpec.impl.CtrlUnit46Impl#getErrorReaction__erErrorReaction <em>Error Reaction er Error Reaction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit46Impl extends wtcImpl implements CtrlUnit46 {
	/**
	 * The cached value of the '{@link #getOutput__oOutput() <em>Output oOutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oOutput()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oOutput;

	/**
	 * The cached value of the '{@link #getErrorReaction__erErrorReaction() <em>Error Reaction er Error Reaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorReaction__erErrorReaction()
	 * @generated
	 * @ordered
	 */
	protected WTCErrorReaction errorReaction__erErrorReaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit46Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getCtrlUnit46();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oOutput() {
		if (output__oOutput != null && output__oOutput.eIsProxy()) {
			InternalEObject oldOutput__oOutput = (InternalEObject)output__oOutput;
			output__oOutput = (WTCOutput)eResolveProxy(oldOutput__oOutput);
			if (output__oOutput != oldOutput__oOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT46__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
			}
		}
		return output__oOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oOutput() {
		return output__oOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oOutput(WTCOutput newOutput__oOutput) {
		WTCOutput oldOutput__oOutput = output__oOutput;
		output__oOutput = newOutput__oOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT46__OUTPUT_OOUTPUT, oldOutput__oOutput, output__oOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction getErrorReaction__erErrorReaction() {
		if (errorReaction__erErrorReaction != null && errorReaction__erErrorReaction.eIsProxy()) {
			InternalEObject oldErrorReaction__erErrorReaction = (InternalEObject)errorReaction__erErrorReaction;
			errorReaction__erErrorReaction = (WTCErrorReaction)eResolveProxy(oldErrorReaction__erErrorReaction);
			if (errorReaction__erErrorReaction != oldErrorReaction__erErrorReaction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecPackage.CTRL_UNIT46__ERROR_REACTION_ER_ERROR_REACTION, oldErrorReaction__erErrorReaction, errorReaction__erErrorReaction));
			}
		}
		return errorReaction__erErrorReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCErrorReaction basicGetErrorReaction__erErrorReaction() {
		return errorReaction__erErrorReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorReaction__erErrorReaction(WTCErrorReaction newErrorReaction__erErrorReaction) {
		WTCErrorReaction oldErrorReaction__erErrorReaction = errorReaction__erErrorReaction;
		errorReaction__erErrorReaction = newErrorReaction__erErrorReaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.CTRL_UNIT46__ERROR_REACTION_ER_ERROR_REACTION, oldErrorReaction__erErrorReaction, errorReaction__erErrorReaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.CTRL_UNIT46__OUTPUT_OOUTPUT:
				if (resolve) return getOutput__oOutput();
				return basicGetOutput__oOutput();
			case WTSpecPackage.CTRL_UNIT46__ERROR_REACTION_ER_ERROR_REACTION:
				if (resolve) return getErrorReaction__erErrorReaction();
				return basicGetErrorReaction__erErrorReaction();
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
			case WTSpecPackage.CTRL_UNIT46__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)newValue);
				return;
			case WTSpecPackage.CTRL_UNIT46__ERROR_REACTION_ER_ERROR_REACTION:
				setErrorReaction__erErrorReaction((WTCErrorReaction)newValue);
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
			case WTSpecPackage.CTRL_UNIT46__OUTPUT_OOUTPUT:
				setOutput__oOutput((WTCOutput)null);
				return;
			case WTSpecPackage.CTRL_UNIT46__ERROR_REACTION_ER_ERROR_REACTION:
				setErrorReaction__erErrorReaction((WTCErrorReaction)null);
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
			case WTSpecPackage.CTRL_UNIT46__OUTPUT_OOUTPUT:
				return output__oOutput != null;
			case WTSpecPackage.CTRL_UNIT46__ERROR_REACTION_ER_ERROR_REACTION:
				return errorReaction__erErrorReaction != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit46Impl
