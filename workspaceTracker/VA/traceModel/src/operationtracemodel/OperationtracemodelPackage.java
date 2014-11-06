/**
 */
package operationtracemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see operationtracemodel.OperationtracemodelFactory
 * @model kind="package"
 * @generated
 */
public interface OperationtracemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "operationtracemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://operationtracemodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "operationtracemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperationtracemodelPackage eINSTANCE = operationtracemodel.impl.OperationtracemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link operationtracemodel.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.TraceImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__COMMANDS = 0;

	/**
	 * The feature id for the '<em><b>First Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__FIRST_COMMAND = 1;

	/**
	 * The feature id for the '<em><b>Cementary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__CEMENTARY = 2;

	/**
	 * The feature id for the '<em><b>Last Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__LAST_COMMAND = 3;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link operationtracemodel.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.CommandImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 1;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__STEPS = 0;

	/**
	 * The feature id for the '<em><b>Next Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NEXT_COMMAND = 1;

	/**
	 * The feature id for the '<em><b>First Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__FIRST_STEP = 2;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link operationtracemodel.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.StepImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 2;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NEXT_STEP = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__FEATURE = 2;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link operationtracemodel.impl.DeletedElementImpl <em>Deleted Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.DeletedElementImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getDeletedElement()
	 * @generated
	 */
	int DELETED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Deleted Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ELEMENT__DELETED_OBJECT = 0;

	/**
	 * The number of structural features of the '<em>Deleted Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Deleted Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link operationtracemodel.impl.InsertImpl <em>Insert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.InsertImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getInsert()
	 * @generated
	 */
	int INSERT = 4;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__NEXT_STEP = STEP__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__ELEMENT = STEP__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__FEATURE = STEP__FEATURE;

	/**
	 * The number of structural features of the '<em>Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link operationtracemodel.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.UpdateImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 5;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__NEXT_STEP = STEP__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__ELEMENT = STEP__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__FEATURE = STEP__FEATURE;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link operationtracemodel.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.DeleteImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 6;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__NEXT_STEP = STEP__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__ELEMENT = STEP__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__FEATURE = STEP__FEATURE;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link operationtracemodel.impl.CemetaryImpl <em>Cemetary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.CemetaryImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getCemetary()
	 * @generated
	 */
	int CEMETARY = 7;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEMETARY__DELETED = 0;

	/**
	 * The number of structural features of the '<em>Cemetary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEMETARY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cemetary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEMETARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link operationtracemodel.impl.InsertAttributeImpl <em>Insert Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.InsertAttributeImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getInsertAttribute()
	 * @generated
	 */
	int INSERT_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ATTRIBUTE__NEXT_STEP = INSERT__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ATTRIBUTE__ELEMENT = INSERT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ATTRIBUTE__FEATURE = INSERT__FEATURE;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ATTRIBUTE__NEW_VALUE = INSERT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Insert Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ATTRIBUTE_FEATURE_COUNT = INSERT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Insert Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ATTRIBUTE_OPERATION_COUNT = INSERT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link operationtracemodel.impl.InsertReferenceImpl <em>Insert Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.InsertReferenceImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getInsertReference()
	 * @generated
	 */
	int INSERT_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_REFERENCE__NEXT_STEP = INSERT__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_REFERENCE__ELEMENT = INSERT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_REFERENCE__FEATURE = INSERT__FEATURE;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_REFERENCE__NEW_VALUE = INSERT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Insert Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_REFERENCE_FEATURE_COUNT = INSERT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Insert Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_REFERENCE_OPERATION_COUNT = INSERT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link operationtracemodel.impl.UpdateAttributeImpl <em>Update Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.UpdateAttributeImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getUpdateAttribute()
	 * @generated
	 */
	int UPDATE_ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE__NEXT_STEP = UPDATE__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE__ELEMENT = UPDATE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE__FEATURE = UPDATE__FEATURE;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE__NEW_VALUE = UPDATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE__OLD_VALUE = UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Update Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE_OPERATION_COUNT = UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link operationtracemodel.impl.UpdateReferenceImpl <em>Update Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.UpdateReferenceImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getUpdateReference()
	 * @generated
	 */
	int UPDATE_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REFERENCE__NEXT_STEP = UPDATE__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REFERENCE__ELEMENT = UPDATE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REFERENCE__FEATURE = UPDATE__FEATURE;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REFERENCE__NEW_VALUE = UPDATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REFERENCE__OLD_VALUE = UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REFERENCE_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Update Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REFERENCE_OPERATION_COUNT = UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link operationtracemodel.impl.DeleteAttributeImpl <em>Delete Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.DeleteAttributeImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getDeleteAttribute()
	 * @generated
	 */
	int DELETE_ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ATTRIBUTE__NEXT_STEP = DELETE__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ATTRIBUTE__ELEMENT = DELETE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ATTRIBUTE__FEATURE = DELETE__FEATURE;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ATTRIBUTE__OLD_VALUE = DELETE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ATTRIBUTE_FEATURE_COUNT = DELETE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delete Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ATTRIBUTE_OPERATION_COUNT = DELETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link operationtracemodel.impl.DeleteReferenceImpl <em>Delete Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.DeleteReferenceImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getDeleteReference()
	 * @generated
	 */
	int DELETE_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_REFERENCE__NEXT_STEP = DELETE__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_REFERENCE__ELEMENT = DELETE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_REFERENCE__FEATURE = DELETE__FEATURE;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_REFERENCE__OLD_VALUE = DELETE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_REFERENCE_FEATURE_COUNT = DELETE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delete Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_REFERENCE_OPERATION_COUNT = DELETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>EObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EObject
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getEObject()
	 * @generated
	 */
	int EOBJECT = 14;


	/**
	 * The meta object id for the '<em>Notifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.notify.Notifier
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getNotifier()
	 * @generated
	 */
	int NOTIFIER = 15;

	/**
	 * The meta object id for the '<em>EStructural Feature</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EStructuralFeature
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getEStructuralFeature()
	 * @generated
	 */
	int ESTRUCTURAL_FEATURE = 16;

	/**
	 * Returns the meta object for class '{@link operationtracemodel.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see operationtracemodel.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link operationtracemodel.Trace#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see operationtracemodel.Trace#getCommands()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Commands();

	/**
	 * Returns the meta object for the reference '{@link operationtracemodel.Trace#getFirstCommand <em>First Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Command</em>'.
	 * @see operationtracemodel.Trace#getFirstCommand()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_FirstCommand();

	/**
	 * Returns the meta object for the containment reference '{@link operationtracemodel.Trace#getCementary <em>Cementary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cementary</em>'.
	 * @see operationtracemodel.Trace#getCementary()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Cementary();

	/**
	 * Returns the meta object for the reference '{@link operationtracemodel.Trace#getLastCommand <em>Last Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Command</em>'.
	 * @see operationtracemodel.Trace#getLastCommand()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_LastCommand();

	/**
	 * Returns the meta object for class '{@link operationtracemodel.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see operationtracemodel.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link operationtracemodel.Command#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see operationtracemodel.Command#getSteps()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Steps();

	/**
	 * Returns the meta object for the reference '{@link operationtracemodel.Command#getNextCommand <em>Next Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Command</em>'.
	 * @see operationtracemodel.Command#getNextCommand()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_NextCommand();

	/**
	 * Returns the meta object for the reference '{@link operationtracemodel.Command#getFirstStep <em>First Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Step</em>'.
	 * @see operationtracemodel.Command#getFirstStep()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_FirstStep();

	/**
	 * Returns the meta object for class '{@link operationtracemodel.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see operationtracemodel.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference '{@link operationtracemodel.Step#getNextStep <em>Next Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Step</em>'.
	 * @see operationtracemodel.Step#getNextStep()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_NextStep();

	/**
	 * Returns the meta object for the attribute '{@link operationtracemodel.Step#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see operationtracemodel.Step#getElement()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Element();

	/**
	 * Returns the meta object for the attribute '{@link operationtracemodel.Step#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see operationtracemodel.Step#getFeature()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Feature();

	/**
	 * Returns the meta object for class '{@link operationtracemodel.DeletedElement <em>Deleted Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deleted Element</em>'.
	 * @see operationtracemodel.DeletedElement
	 * @generated
	 */
	EClass getDeletedElement();

	/**
	 * Returns the meta object for the attribute '{@link operationtracemodel.DeletedElement#getDeletedObject <em>Deleted Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleted Object</em>'.
	 * @see operationtracemodel.DeletedElement#getDeletedObject()
	 * @see #getDeletedElement()
	 * @generated
	 */
	EAttribute getDeletedElement_DeletedObject();

	/**
	 * Returns the meta object for class '{@link operationtracemodel.Insert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert</em>'.
	 * @see operationtracemodel.Insert
	 * @generated
	 */
	EClass getInsert();

	/**
	 * Returns the meta object for class '{@link operationtracemodel.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see operationtracemodel.Update
	 * @generated
	 */
	EClass getUpdate();

	/**
	 * Returns the meta object for class '{@link operationtracemodel.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see operationtracemodel.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link operationtracemodel.Cemetary <em>Cemetary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cemetary</em>'.
	 * @see operationtracemodel.Cemetary
	 * @generated
	 */
	EClass getCemetary();

	/**
	 * Returns the meta object for the containment reference list '{@link operationtracemodel.Cemetary#getDeleted <em>Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deleted</em>'.
	 * @see operationtracemodel.Cemetary#getDeleted()
	 * @see #getCemetary()
	 * @generated
	 */
	EReference getCemetary_Deleted();

	/**
	 * Returns the meta object for class '{@link operationtracemodel.InsertAttribute <em>Insert Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert Attribute</em>'.
	 * @see operationtracemodel.InsertAttribute
	 * @generated
	 */
	EClass getInsertAttribute();

	/**
	 * Returns the meta object for the attribute '{@link operationtracemodel.InsertAttribute#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see operationtracemodel.InsertAttribute#getNewValue()
	 * @see #getInsertAttribute()
	 * @generated
	 */
	EAttribute getInsertAttribute_NewValue();

	/**
	 * Returns the meta object for class '{@link operationtracemodel.InsertReference <em>Insert Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert Reference</em>'.
	 * @see operationtracemodel.InsertReference
	 * @generated
	 */
	EClass getInsertReference();

	/**
	 * Returns the meta object for the attribute '{@link operationtracemodel.InsertReference#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see operationtracemodel.InsertReference#getNewValue()
	 * @see #getInsertReference()
	 * @generated
	 */
	EAttribute getInsertReference_NewValue();

	/**
	 * Returns the meta object for class '{@link operationtracemodel.UpdateAttribute <em>Update Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Attribute</em>'.
	 * @see operationtracemodel.UpdateAttribute
	 * @generated
	 */
	EClass getUpdateAttribute();

	/**
	 * Returns the meta object for the attribute '{@link operationtracemodel.UpdateAttribute#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see operationtracemodel.UpdateAttribute#getNewValue()
	 * @see #getUpdateAttribute()
	 * @generated
	 */
	EAttribute getUpdateAttribute_NewValue();

	/**
	 * Returns the meta object for the attribute '{@link operationtracemodel.UpdateAttribute#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see operationtracemodel.UpdateAttribute#getOldValue()
	 * @see #getUpdateAttribute()
	 * @generated
	 */
	EAttribute getUpdateAttribute_OldValue();

	/**
	 * Returns the meta object for class '{@link operationtracemodel.UpdateReference <em>Update Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Reference</em>'.
	 * @see operationtracemodel.UpdateReference
	 * @generated
	 */
	EClass getUpdateReference();

	/**
	 * Returns the meta object for the attribute '{@link operationtracemodel.UpdateReference#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see operationtracemodel.UpdateReference#getNewValue()
	 * @see #getUpdateReference()
	 * @generated
	 */
	EAttribute getUpdateReference_NewValue();

	/**
	 * Returns the meta object for the attribute '{@link operationtracemodel.UpdateReference#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see operationtracemodel.UpdateReference#getOldValue()
	 * @see #getUpdateReference()
	 * @generated
	 */
	EAttribute getUpdateReference_OldValue();

	/**
	 * Returns the meta object for class '{@link operationtracemodel.DeleteAttribute <em>Delete Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Attribute</em>'.
	 * @see operationtracemodel.DeleteAttribute
	 * @generated
	 */
	EClass getDeleteAttribute();

	/**
	 * Returns the meta object for the reference '{@link operationtracemodel.DeleteAttribute#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Value</em>'.
	 * @see operationtracemodel.DeleteAttribute#getOldValue()
	 * @see #getDeleteAttribute()
	 * @generated
	 */
	EReference getDeleteAttribute_OldValue();

	/**
	 * Returns the meta object for class '{@link operationtracemodel.DeleteReference <em>Delete Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Reference</em>'.
	 * @see operationtracemodel.DeleteReference
	 * @generated
	 */
	EClass getDeleteReference();

	/**
	 * Returns the meta object for the reference '{@link operationtracemodel.DeleteReference#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Value</em>'.
	 * @see operationtracemodel.DeleteReference#getOldValue()
	 * @see #getDeleteReference()
	 * @generated
	 */
	EReference getDeleteReference_OldValue();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.EObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EObject</em>'.
	 * @see org.eclipse.emf.ecore.EObject
	 * @model instanceClass="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	EDataType getEObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.notify.Notifier <em>Notifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Notifier</em>'.
	 * @see org.eclipse.emf.common.notify.Notifier
	 * @model instanceClass="org.eclipse.emf.common.notify.Notifier"
	 * @generated
	 */
	EDataType getNotifier();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.EStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EStructural Feature</em>'.
	 * @see org.eclipse.emf.ecore.EStructuralFeature
	 * @model instanceClass="org.eclipse.emf.ecore.EStructuralFeature"
	 * @generated
	 */
	EDataType getEStructuralFeature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OperationtracemodelFactory getOperationtracemodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link operationtracemodel.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.TraceImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__COMMANDS = eINSTANCE.getTrace_Commands();

		/**
		 * The meta object literal for the '<em><b>First Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__FIRST_COMMAND = eINSTANCE.getTrace_FirstCommand();

		/**
		 * The meta object literal for the '<em><b>Cementary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__CEMENTARY = eINSTANCE.getTrace_Cementary();

		/**
		 * The meta object literal for the '<em><b>Last Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__LAST_COMMAND = eINSTANCE.getTrace_LastCommand();

		/**
		 * The meta object literal for the '{@link operationtracemodel.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.CommandImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__STEPS = eINSTANCE.getCommand_Steps();

		/**
		 * The meta object literal for the '<em><b>Next Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__NEXT_COMMAND = eINSTANCE.getCommand_NextCommand();

		/**
		 * The meta object literal for the '<em><b>First Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__FIRST_STEP = eINSTANCE.getCommand_FirstStep();

		/**
		 * The meta object literal for the '{@link operationtracemodel.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.StepImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Next Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__NEXT_STEP = eINSTANCE.getStep_NextStep();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__ELEMENT = eINSTANCE.getStep_Element();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__FEATURE = eINSTANCE.getStep_Feature();

		/**
		 * The meta object literal for the '{@link operationtracemodel.impl.DeletedElementImpl <em>Deleted Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.DeletedElementImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getDeletedElement()
		 * @generated
		 */
		EClass DELETED_ELEMENT = eINSTANCE.getDeletedElement();

		/**
		 * The meta object literal for the '<em><b>Deleted Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETED_ELEMENT__DELETED_OBJECT = eINSTANCE.getDeletedElement_DeletedObject();

		/**
		 * The meta object literal for the '{@link operationtracemodel.impl.InsertImpl <em>Insert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.InsertImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getInsert()
		 * @generated
		 */
		EClass INSERT = eINSTANCE.getInsert();

		/**
		 * The meta object literal for the '{@link operationtracemodel.impl.UpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.UpdateImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getUpdate()
		 * @generated
		 */
		EClass UPDATE = eINSTANCE.getUpdate();

		/**
		 * The meta object literal for the '{@link operationtracemodel.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.DeleteImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link operationtracemodel.impl.CemetaryImpl <em>Cemetary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.CemetaryImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getCemetary()
		 * @generated
		 */
		EClass CEMETARY = eINSTANCE.getCemetary();

		/**
		 * The meta object literal for the '<em><b>Deleted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEMETARY__DELETED = eINSTANCE.getCemetary_Deleted();

		/**
		 * The meta object literal for the '{@link operationtracemodel.impl.InsertAttributeImpl <em>Insert Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.InsertAttributeImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getInsertAttribute()
		 * @generated
		 */
		EClass INSERT_ATTRIBUTE = eINSTANCE.getInsertAttribute();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_ATTRIBUTE__NEW_VALUE = eINSTANCE.getInsertAttribute_NewValue();

		/**
		 * The meta object literal for the '{@link operationtracemodel.impl.InsertReferenceImpl <em>Insert Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.InsertReferenceImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getInsertReference()
		 * @generated
		 */
		EClass INSERT_REFERENCE = eINSTANCE.getInsertReference();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_REFERENCE__NEW_VALUE = eINSTANCE.getInsertReference_NewValue();

		/**
		 * The meta object literal for the '{@link operationtracemodel.impl.UpdateAttributeImpl <em>Update Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.UpdateAttributeImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getUpdateAttribute()
		 * @generated
		 */
		EClass UPDATE_ATTRIBUTE = eINSTANCE.getUpdateAttribute();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_ATTRIBUTE__NEW_VALUE = eINSTANCE.getUpdateAttribute_NewValue();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_ATTRIBUTE__OLD_VALUE = eINSTANCE.getUpdateAttribute_OldValue();

		/**
		 * The meta object literal for the '{@link operationtracemodel.impl.UpdateReferenceImpl <em>Update Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.UpdateReferenceImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getUpdateReference()
		 * @generated
		 */
		EClass UPDATE_REFERENCE = eINSTANCE.getUpdateReference();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_REFERENCE__NEW_VALUE = eINSTANCE.getUpdateReference_NewValue();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_REFERENCE__OLD_VALUE = eINSTANCE.getUpdateReference_OldValue();

		/**
		 * The meta object literal for the '{@link operationtracemodel.impl.DeleteAttributeImpl <em>Delete Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.DeleteAttributeImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getDeleteAttribute()
		 * @generated
		 */
		EClass DELETE_ATTRIBUTE = eINSTANCE.getDeleteAttribute();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_ATTRIBUTE__OLD_VALUE = eINSTANCE.getDeleteAttribute_OldValue();

		/**
		 * The meta object literal for the '{@link operationtracemodel.impl.DeleteReferenceImpl <em>Delete Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.DeleteReferenceImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getDeleteReference()
		 * @generated
		 */
		EClass DELETE_REFERENCE = eINSTANCE.getDeleteReference();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_REFERENCE__OLD_VALUE = eINSTANCE.getDeleteReference_OldValue();

		/**
		 * The meta object literal for the '<em>EObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.EObject
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getEObject()
		 * @generated
		 */
		EDataType EOBJECT = eINSTANCE.getEObject();

		/**
		 * The meta object literal for the '<em>Notifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.notify.Notifier
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getNotifier()
		 * @generated
		 */
		EDataType NOTIFIER = eINSTANCE.getNotifier();

		/**
		 * The meta object literal for the '<em>EStructural Feature</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.EStructuralFeature
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getEStructuralFeature()
		 * @generated
		 */
		EDataType ESTRUCTURAL_FEATURE = eINSTANCE.getEStructuralFeature();

	}

} //OperationtracemodelPackage
