/**
 */
package operationtracemodel.impl;

import operationtracemodel.*;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
			case OperationtracemodelPackage.DELETE: return createDelete();
			case OperationtracemodelPackage.CEMETARY: return createCemetary();
			case OperationtracemodelPackage.INSERT_ATTRIBUTE: return createInsertAttribute();
			case OperationtracemodelPackage.INSERT_REFERENCE: return createInsertReference();
			case OperationtracemodelPackage.UPDATE_ATTRIBUTE: return createUpdateAttribute();
			case OperationtracemodelPackage.UPDATE_REFERENCE: return createUpdateReference();
			case OperationtracemodelPackage.DELETE_ATTRIBUTE: return createDeleteAttribute();
			case OperationtracemodelPackage.DELETE_REFERENCE: return createDeleteReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OperationtracemodelPackage.EOBJECT:
				return createEObjectFromString(eDataType, initialValue);
			case OperationtracemodelPackage.NOTIFIER:
				return createNotifierFromString(eDataType, initialValue);
			case OperationtracemodelPackage.ESTRUCTURAL_FEATURE:
				return createEStructuralFeatureFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OperationtracemodelPackage.EOBJECT:
				return convertEObjectToString(eDataType, instanceValue);
			case OperationtracemodelPackage.NOTIFIER:
				return convertNotifierToString(eDataType, instanceValue);
			case OperationtracemodelPackage.ESTRUCTURAL_FEATURE:
				return convertEStructuralFeatureToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
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
	public DeleteAttribute createDeleteAttribute() {
		DeleteAttributeImpl deleteAttribute = new DeleteAttributeImpl();
		return deleteAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteReference createDeleteReference() {
		DeleteReferenceImpl deleteReference = new DeleteReferenceImpl();
		return deleteReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject createEObjectFromString(EDataType eDataType, String initialValue) {
		return (EObject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notifier createNotifierFromString(EDataType eDataType, String initialValue) {
		return (Notifier)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotifierToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature createEStructuralFeatureFromString(EDataType eDataType, String initialValue) {
		return (EStructuralFeature)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEStructuralFeatureToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
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
