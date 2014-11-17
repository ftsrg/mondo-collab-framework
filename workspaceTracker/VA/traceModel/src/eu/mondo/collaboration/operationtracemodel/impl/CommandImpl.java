/**
 */
package operationtracemodel.impl;

import java.util.Collection;

import operationtracemodel.Command;
import operationtracemodel.OperationtracemodelPackage;
import operationtracemodel.Step;

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
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link operationtracemodel.impl.CommandImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link operationtracemodel.impl.CommandImpl#getNextCommand <em>Next Command</em>}</li>
 *   <li>{@link operationtracemodel.impl.CommandImpl#getFirstStep <em>First Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandImpl extends MinimalEObjectImpl.Container implements Command {
	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

	/**
	 * The cached value of the '{@link #getNextCommand() <em>Next Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextCommand()
	 * @generated
	 * @ordered
	 */
	protected Command nextCommand;

	/**
	 * The cached value of the '{@link #getFirstStep() <em>First Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstStep()
	 * @generated
	 * @ordered
	 */
	protected Step firstStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperationtracemodelPackage.Literals.COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<Step>(Step.class, this, OperationtracemodelPackage.COMMAND__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getNextCommand() {
		if (nextCommand != null && nextCommand.eIsProxy()) {
			InternalEObject oldNextCommand = (InternalEObject)nextCommand;
			nextCommand = (Command)eResolveProxy(oldNextCommand);
			if (nextCommand != oldNextCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationtracemodelPackage.COMMAND__NEXT_COMMAND, oldNextCommand, nextCommand));
			}
		}
		return nextCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command basicGetNextCommand() {
		return nextCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextCommand(Command newNextCommand) {
		Command oldNextCommand = nextCommand;
		nextCommand = newNextCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationtracemodelPackage.COMMAND__NEXT_COMMAND, oldNextCommand, nextCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getFirstStep() {
		if (firstStep != null && firstStep.eIsProxy()) {
			InternalEObject oldFirstStep = (InternalEObject)firstStep;
			firstStep = (Step)eResolveProxy(oldFirstStep);
			if (firstStep != oldFirstStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperationtracemodelPackage.COMMAND__FIRST_STEP, oldFirstStep, firstStep));
			}
		}
		return firstStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetFirstStep() {
		return firstStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstStep(Step newFirstStep) {
		Step oldFirstStep = firstStep;
		firstStep = newFirstStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperationtracemodelPackage.COMMAND__FIRST_STEP, oldFirstStep, firstStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperationtracemodelPackage.COMMAND__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
			case OperationtracemodelPackage.COMMAND__STEPS:
				return getSteps();
			case OperationtracemodelPackage.COMMAND__NEXT_COMMAND:
				if (resolve) return getNextCommand();
				return basicGetNextCommand();
			case OperationtracemodelPackage.COMMAND__FIRST_STEP:
				if (resolve) return getFirstStep();
				return basicGetFirstStep();
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
			case OperationtracemodelPackage.COMMAND__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case OperationtracemodelPackage.COMMAND__NEXT_COMMAND:
				setNextCommand((Command)newValue);
				return;
			case OperationtracemodelPackage.COMMAND__FIRST_STEP:
				setFirstStep((Step)newValue);
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
			case OperationtracemodelPackage.COMMAND__STEPS:
				getSteps().clear();
				return;
			case OperationtracemodelPackage.COMMAND__NEXT_COMMAND:
				setNextCommand((Command)null);
				return;
			case OperationtracemodelPackage.COMMAND__FIRST_STEP:
				setFirstStep((Step)null);
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
			case OperationtracemodelPackage.COMMAND__STEPS:
				return steps != null && !steps.isEmpty();
			case OperationtracemodelPackage.COMMAND__NEXT_COMMAND:
				return nextCommand != null;
			case OperationtracemodelPackage.COMMAND__FIRST_STEP:
				return firstStep != null;
		}
		return super.eIsSet(featureID);
	}

} //CommandImpl
