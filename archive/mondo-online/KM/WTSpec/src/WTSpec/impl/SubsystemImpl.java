/**
 */
package WTSpec.impl;

import WTSpec.Subsystem;
import WTSpec.WTSpecPackage;
import WTSpec.wtc;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subsystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpec.impl.SubsystemImpl#getSysId <em>Sys Id</em>}</li>
 *   <li>{@link WTSpec.impl.SubsystemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link WTSpec.impl.SubsystemImpl#getItsWTCs <em>Its WT Cs</em>}</li>
 *   <li>{@link WTSpec.impl.SubsystemImpl#getItsSubsystems <em>Its Subsystems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubsystemImpl extends MinimalEObjectImpl.Container implements Subsystem {
	/**
	 * The default value of the '{@link #getSysId() <em>Sys Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysId()
	 * @generated
	 * @ordered
	 */
	protected static final String SYS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSysId() <em>Sys Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysId()
	 * @generated
	 * @ordered
	 */
	protected String sysId = SYS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItsWTCs() <em>Its WT Cs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsWTCs()
	 * @generated
	 * @ordered
	 */
	protected EList<wtc> itsWTCs;

	/**
	 * The cached value of the '{@link #getItsSubsystems() <em>Its Subsystems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsSubsystems()
	 * @generated
	 * @ordered
	 */
	protected EList<Subsystem> itsSubsystems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubsystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecPackage.eINSTANCE.getSubsystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSysId() {
		return sysId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSysId(String newSysId) {
		String oldSysId = sysId;
		sysId = newSysId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.SUBSYSTEM__SYS_ID, oldSysId, sysId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecPackage.SUBSYSTEM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<wtc> getItsWTCs() {
		if (itsWTCs == null) {
			itsWTCs = new EObjectContainmentEList<wtc>(wtc.class, this, WTSpecPackage.SUBSYSTEM__ITS_WT_CS);
		}
		return itsWTCs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subsystem> getItsSubsystems() {
		if (itsSubsystems == null) {
			itsSubsystems = new EObjectContainmentEList<Subsystem>(Subsystem.class, this, WTSpecPackage.SUBSYSTEM__ITS_SUBSYSTEMS);
		}
		return itsSubsystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WTSpecPackage.SUBSYSTEM__ITS_WT_CS:
				return ((InternalEList<?>)getItsWTCs()).basicRemove(otherEnd, msgs);
			case WTSpecPackage.SUBSYSTEM__ITS_SUBSYSTEMS:
				return ((InternalEList<?>)getItsSubsystems()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecPackage.SUBSYSTEM__SYS_ID:
				return getSysId();
			case WTSpecPackage.SUBSYSTEM__DESCRIPTION:
				return getDescription();
			case WTSpecPackage.SUBSYSTEM__ITS_WT_CS:
				return getItsWTCs();
			case WTSpecPackage.SUBSYSTEM__ITS_SUBSYSTEMS:
				return getItsSubsystems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WTSpecPackage.SUBSYSTEM__SYS_ID:
				setSysId((String)newValue);
				return;
			case WTSpecPackage.SUBSYSTEM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WTSpecPackage.SUBSYSTEM__ITS_WT_CS:
				getItsWTCs().clear();
				getItsWTCs().addAll((Collection<? extends wtc>)newValue);
				return;
			case WTSpecPackage.SUBSYSTEM__ITS_SUBSYSTEMS:
				getItsSubsystems().clear();
				getItsSubsystems().addAll((Collection<? extends Subsystem>)newValue);
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
			case WTSpecPackage.SUBSYSTEM__SYS_ID:
				setSysId(SYS_ID_EDEFAULT);
				return;
			case WTSpecPackage.SUBSYSTEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WTSpecPackage.SUBSYSTEM__ITS_WT_CS:
				getItsWTCs().clear();
				return;
			case WTSpecPackage.SUBSYSTEM__ITS_SUBSYSTEMS:
				getItsSubsystems().clear();
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
			case WTSpecPackage.SUBSYSTEM__SYS_ID:
				return SYS_ID_EDEFAULT == null ? sysId != null : !SYS_ID_EDEFAULT.equals(sysId);
			case WTSpecPackage.SUBSYSTEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WTSpecPackage.SUBSYSTEM__ITS_WT_CS:
				return itsWTCs != null && !itsWTCs.isEmpty();
			case WTSpecPackage.SUBSYSTEM__ITS_SUBSYSTEMS:
				return itsSubsystems != null && !itsSubsystems.isEmpty();
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
		result.append(" (sysId: ");
		result.append(sysId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SubsystemImpl
