/**
 */
package eu.mondo.collaboration.operationtracemodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import eu.mondo.collaboration.operationtracemodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationtracemodelFactoryImpl extends EFactoryImpl implements OperationtracemodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationtracemodelFactory init() {
		try {
			OperationtracemodelFactory theOperationtracemodelFactory = (OperationtracemodelFactory)EPackage.Registry.INSTANCE.getEFactory(OperationtracemodelPackage.eNS_URI);
			if (theOperationtracemodelFactory != null) {
				return theOperationtracemodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperationtracemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationtracemodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OperationtracemodelPackage.TRACE: return createTrace();
			case OperationtracemodelPackage.COMMAND: return createCommand();
			case OperationtracemodelPackage.CEMETARY: return createCemetary();
			case OperationtracemodelPackage.INSERT_ATTRIBUTE: return createInsertAttribute();
			case OperationtracemodelPackage.INSERT_REFERENCE: return createInsertReference();
			case OperationtracemodelPackage.UPDATE_ATTRIBUTE: return createUpdateAttribute();
			case OperationtracemodelPackage.UPDATE_REFERENCE: return createUpdateReference();
			case OperationtracemodelPackage.REMOVE_ATTRIBUTE: return createRemoveAttribute();
			case OperationtracemodelPackage.REMOVE_REFERENCE: return createRemoveReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cemetary createCemetary() {
		CemetaryImpl cemetary = new CemetaryImpl();
		return cemetary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertAttribute createInsertAttribute() {
		InsertAttributeImpl insertAttribute = new InsertAttributeImpl();
		return insertAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertReference createInsertReference() {
		InsertReferenceImpl insertReference = new InsertReferenceImpl();
		return insertReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAttribute createUpdateAttribute() {
		UpdateAttributeImpl updateAttribute = new UpdateAttributeImpl();
		return updateAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateReference createUpdateReference() {
		UpdateReferenceImpl updateReference = new UpdateReferenceImpl();
		return updateReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveAttribute createRemoveAttribute() {
		RemoveAttributeImpl removeAttribute = new RemoveAttributeImpl();
		return removeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveReference createRemoveReference() {
		RemoveReferenceImpl removeReference = new RemoveReferenceImpl();
		return removeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationtracemodelPackage getOperationtracemodelPackage() {
		return (OperationtracemodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OperationtracemodelPackage getPackage() {
		return OperationtracemodelPackage.eINSTANCE;
	}

} //OperationtracemodelFactoryImpl
