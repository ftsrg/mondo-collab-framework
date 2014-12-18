/**
 */
package eu.mondo.collaboration.operationtracemodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import eu.mondo.collaboration.operationtracemodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage
 * @generated
 */
public class OperationtracemodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OperationtracemodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationtracemodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OperationtracemodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationtracemodelSwitch<Adapter> modelSwitch =
		new OperationtracemodelSwitch<Adapter>() {
			@Override
			public Adapter caseTrace(Trace object) {
				return createTraceAdapter();
			}
			@Override
			public Adapter caseCommand(Command object) {
				return createCommandAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseInsert(Insert object) {
				return createInsertAdapter();
			}
			@Override
			public Adapter caseUpdate(Update object) {
				return createUpdateAdapter();
			}
			@Override
			public Adapter caseRemove(Remove object) {
				return createRemoveAdapter();
			}
			@Override
			public Adapter caseCemetery(Cemetery object) {
				return createCemeteryAdapter();
			}
			@Override
			public Adapter caseInsertAttribute(InsertAttribute object) {
				return createInsertAttributeAdapter();
			}
			@Override
			public Adapter caseInsertReference(InsertReference object) {
				return createInsertReferenceAdapter();
			}
			@Override
			public Adapter caseUpdateAttribute(UpdateAttribute object) {
				return createUpdateAttributeAdapter();
			}
			@Override
			public Adapter caseUpdateReference(UpdateReference object) {
				return createUpdateReferenceAdapter();
			}
			@Override
			public Adapter caseRemoveAttribute(RemoveAttribute object) {
				return createRemoveAttributeAdapter();
			}
			@Override
			public Adapter caseRemoveReference(RemoveReference object) {
				return createRemoveReferenceAdapter();
			}
			@Override
			public Adapter caseMove(Move object) {
				return createMoveAdapter();
			}
			@Override
			public Adapter caseMoveAttribute(MoveAttribute object) {
				return createMoveAttributeAdapter();
			}
			@Override
			public Adapter caseMoveReference(MoveReference object) {
				return createMoveReferenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eu.mondo.collaboration.operationtracemodel.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.mondo.collaboration.operationtracemodel.Trace
	 * @generated
	 */
	public Adapter createTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.mondo.collaboration.operationtracemodel.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.mondo.collaboration.operationtracemodel.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.mondo.collaboration.operationtracemodel.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.mondo.collaboration.operationtracemodel.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.mondo.collaboration.operationtracemodel.Insert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.mondo.collaboration.operationtracemodel.Insert
	 * @generated
	 */
	public Adapter createInsertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.mondo.collaboration.operationtracemodel.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.mondo.collaboration.operationtracemodel.Update
	 * @generated
	 */
	public Adapter createUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.mondo.collaboration.operationtracemodel.Remove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.mondo.collaboration.operationtracemodel.Remove
	 * @generated
	 */
	public Adapter createRemoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.mondo.collaboration.operationtracemodel.Cemetery <em>Cemetery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.mondo.collaboration.operationtracemodel.Cemetery
	 * @generated
	 */
	public Adapter createCemeteryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.mondo.collaboration.operationtracemodel.InsertAttribute <em>Insert Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.mondo.collaboration.operationtracemodel.InsertAttribute
	 * @generated
	 */
	public Adapter createInsertAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.mondo.collaboration.operationtracemodel.InsertReference <em>Insert Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.mondo.collaboration.operationtracemodel.InsertReference
	 * @generated
	 */
	public Adapter createInsertReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.mondo.collaboration.operationtracemodel.UpdateAttribute <em>Update Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.mondo.collaboration.operationtracemodel.UpdateAttribute
	 * @generated
	 */
	public Adapter createUpdateAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.mondo.collaboration.operationtracemodel.UpdateReference <em>Update Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.mondo.collaboration.operationtracemodel.UpdateReference
	 * @generated
	 */
	public Adapter createUpdateReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.mondo.collaboration.operationtracemodel.RemoveAttribute <em>Remove Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.mondo.collaboration.operationtracemodel.RemoveAttribute
	 * @generated
	 */
	public Adapter createRemoveAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.mondo.collaboration.operationtracemodel.RemoveReference <em>Remove Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.mondo.collaboration.operationtracemodel.RemoveReference
	 * @generated
	 */
	public Adapter createRemoveReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.mondo.collaboration.operationtracemodel.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.mondo.collaboration.operationtracemodel.Move
	 * @generated
	 */
	public Adapter createMoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.mondo.collaboration.operationtracemodel.MoveAttribute <em>Move Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.mondo.collaboration.operationtracemodel.MoveAttribute
	 * @generated
	 */
	public Adapter createMoveAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.mondo.collaboration.operationtracemodel.MoveReference <em>Move Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.mondo.collaboration.operationtracemodel.MoveReference
	 * @generated
	 */
	public Adapter createMoveReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OperationtracemodelAdapterFactory
