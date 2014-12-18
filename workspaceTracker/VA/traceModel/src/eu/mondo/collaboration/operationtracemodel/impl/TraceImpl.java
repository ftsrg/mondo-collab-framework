/**
 */
package eu.mondo.collaboration.operationtracemodel.impl;

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
import eu.mondo.collaboration.operationtracemodel.Cemetery;
import eu.mondo.collaboration.operationtracemodel.Command;
import eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage;
import eu.mondo.collaboration.operationtracemodel.Trace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.impl.TraceImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.impl.TraceImpl#getFirstCommand <em>First Command</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.impl.TraceImpl#getCemetery <em>Cemetery</em>}</li>
 *   <li>{@link eu.mondo.collaboration.operationtracemodel.impl.TraceImpl#getLastCommand <em>Last Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends MinimalEObjectImpl.Container implements Trace {
	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> commands;

	/**
	 * The cached value of the '{@link #getFirstCommand() <em>First Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstCommand()
	 * @generated
	 * @ordered
	 */
	protected Command firstCommand;

	/**
	 * The cached value of the '{@link #getCemetery() <em>Cemetery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCemetery()
	 * @generated
	 * @ordered
	 */
	protected Cemetery cemetery;

	/**
	 * The cached value of the '{@link #getLastCommand() <em>Last Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCommand()
	 * @generated
	 * @ordered
	 */
	protected Command lastCommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationtracemodelPackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<Command>(Command.class, this, OperationtracemodelPackage.TRACE__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getFirstCommand() {
		if (firstCommand != null && firstCommand.eIsProxy()) {
			InternalEObject oldFirstCommand = (InternalEObject)firstCommand;
			firstCommand = (Command)eResolveProxy(oldFirstCommand);
			if (firstCommand != oldFirstCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationtracemodelPackage.TRACE__FIRST_COMMAND, oldFirstCommand, firstCommand));
			}
		}
		return firstCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetFirstCommand() {
		return firstCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstCommand(Command newFirstCommand) {
		Command oldFirstCommand = firstCommand;
		firstCommand = newFirstCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationtracemodelPackage.TRACE__FIRST_COMMAND, oldFirstCommand, firstCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cemetery getCemetery() {
		return cemetery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCemetery(Cemetery newCemetery, NotificationChain msgs) {
		Cemetery oldCemetery = cemetery;
		cemetery = newCemetery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OperationtracemodelPackage.TRACE__CEMETERY, oldCemetery, newCemetery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCemetery(Cemetery newCemetery) {
		if (newCemetery != cemetery) {
			NotificationChain msgs = null;
			if (cemetery != null)
				msgs = ((InternalEObject)cemetery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OperationtracemodelPackage.TRACE__CEMETERY, null, msgs);
			if (newCemetery != null)
				msgs = ((InternalEObject)newCemetery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OperationtracemodelPackage.TRACE__CEMETERY, null, msgs);
			msgs = basicSetCemetery(newCemetery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationtracemodelPackage.TRACE__CEMETERY, newCemetery, newCemetery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getLastCommand() {
		if (lastCommand != null && lastCommand.eIsProxy()) {
			InternalEObject oldLastCommand = (InternalEObject)lastCommand;
			lastCommand = (Command)eResolveProxy(oldLastCommand);
			if (lastCommand != oldLastCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationtracemodelPackage.TRACE__LAST_COMMAND, oldLastCommand, lastCommand));
			}
		}
		return lastCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetLastCommand() {
		return lastCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastCommand(Command newLastCommand) {
		Command oldLastCommand = lastCommand;
		lastCommand = newLastCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationtracemodelPackage.TRACE__LAST_COMMAND, oldLastCommand, lastCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationtracemodelPackage.TRACE__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
			case OperationtracemodelPackage.TRACE__CEMETERY:
				return basicSetCemetery(null, msgs);
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
			case OperationtracemodelPackage.TRACE__COMMANDS:
				return getCommands();
			case OperationtracemodelPackage.TRACE__FIRST_COMMAND:
				if (resolve) return getFirstCommand();
				return basicGetFirstCommand();
			case OperationtracemodelPackage.TRACE__CEMETERY:
				return getCemetery();
			case OperationtracemodelPackage.TRACE__LAST_COMMAND:
				if (resolve) return getLastCommand();
				return basicGetLastCommand();
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
			case OperationtracemodelPackage.TRACE__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends Command>)newValue);
				return;
			case OperationtracemodelPackage.TRACE__FIRST_COMMAND:
				setFirstCommand((Command)newValue);
				return;
			case OperationtracemodelPackage.TRACE__CEMETERY:
				setCemetery((Cemetery)newValue);
				return;
			case OperationtracemodelPackage.TRACE__LAST_COMMAND:
				setLastCommand((Command)newValue);
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
			case OperationtracemodelPackage.TRACE__COMMANDS:
				getCommands().clear();
				return;
			case OperationtracemodelPackage.TRACE__FIRST_COMMAND:
				setFirstCommand((Command)null);
				return;
			case OperationtracemodelPackage.TRACE__CEMETERY:
				setCemetery((Cemetery)null);
				return;
			case OperationtracemodelPackage.TRACE__LAST_COMMAND:
				setLastCommand((Command)null);
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
			case OperationtracemodelPackage.TRACE__COMMANDS:
				return commands != null && !commands.isEmpty();
			case OperationtracemodelPackage.TRACE__FIRST_COMMAND:
				return firstCommand != null;
			case OperationtracemodelPackage.TRACE__CEMETERY:
				return cemetery != null;
			case OperationtracemodelPackage.TRACE__LAST_COMMAND:
				return lastCommand != null;
		}
		return super.eIsSet(featureID);
	}

} //TraceImpl
