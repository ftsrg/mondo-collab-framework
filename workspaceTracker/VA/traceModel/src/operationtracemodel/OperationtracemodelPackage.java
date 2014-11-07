/**
 */
package operationtracemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
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
	 * The meta object id for the '{@link operationtracemodel.impl.RemovedElementImpl <em>Removed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.RemovedElementImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getRemovedElement()
	 * @generated
	 */
	int REMOVED_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Removed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Removed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVED_ELEMENT_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__ELEMENT = STEP__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
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
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__ELEMENT = STEP__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
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
	 * The meta object id for the '{@link operationtracemodel.impl.RemoveImpl <em>Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.RemoveImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getRemove()
	 * @generated
	 */
	int REMOVE = 6;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__NEXT_STEP = STEP__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__ELEMENT = STEP__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__FEATURE = STEP__FEATURE;

	/**
	 * The number of structural features of the '<em>Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

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
	 * The number of structural features of the '<em>Cemetary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEMETARY_FEATURE_COUNT = 0;

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
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ATTRIBUTE__ELEMENT = INSERT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
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
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_REFERENCE__ELEMENT = INSERT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_REFERENCE__FEATURE = INSERT__FEATURE;

	/**
	 * The number of structural features of the '<em>Insert Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_REFERENCE_FEATURE_COUNT = INSERT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ATTRIBUTE__ELEMENT = UPDATE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
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
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REFERENCE__ELEMENT = UPDATE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REFERENCE__FEATURE = UPDATE__FEATURE;

	/**
	 * The number of structural features of the '<em>Update Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REFERENCE_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Update Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REFERENCE_OPERATION_COUNT = UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link operationtracemodel.impl.RemoveAttributeImpl <em>Remove Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.RemoveAttributeImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getRemoveAttribute()
	 * @generated
	 */
	int REMOVE_ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE__NEXT_STEP = REMOVE__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE__ELEMENT = REMOVE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE__FEATURE = REMOVE__FEATURE;

	/**
	 * The number of structural features of the '<em>Remove Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE_FEATURE_COUNT = REMOVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Remove Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE_OPERATION_COUNT = REMOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link operationtracemodel.impl.RemoveReferenceImpl <em>Remove Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see operationtracemodel.impl.RemoveReferenceImpl
	 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getRemoveReference()
	 * @generated
	 */
	int REMOVE_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_REFERENCE__NEXT_STEP = REMOVE__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_REFERENCE__ELEMENT = REMOVE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_REFERENCE__FEATURE = REMOVE__FEATURE;

	/**
	 * The number of structural features of the '<em>Remove Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_REFERENCE_FEATURE_COUNT = REMOVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Remove Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_REFERENCE_OPERATION_COUNT = REMOVE_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the reference '{@link operationtracemodel.Step#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see operationtracemodel.Step#getElement()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Element();

	/**
	 * Returns the meta object for the reference '{@link operationtracemodel.Step#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see operationtracemodel.Step#getFeature()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Feature();

	/**
	 * Returns the meta object for class '{@link operationtracemodel.RemovedElement <em>Removed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Removed Element</em>'.
	 * @see operationtracemodel.RemovedElement
	 * @generated
	 */
	EClass getRemovedElement();

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
	 * Returns the meta object for class '{@link operationtracemodel.Remove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove</em>'.
	 * @see operationtracemodel.Remove
	 * @generated
	 */
	EClass getRemove();

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
	 * Returns the meta object for class '{@link operationtracemodel.RemoveAttribute <em>Remove Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Attribute</em>'.
	 * @see operationtracemodel.RemoveAttribute
	 * @generated
	 */
	EClass getRemoveAttribute();

	/**
	 * Returns the meta object for class '{@link operationtracemodel.RemoveReference <em>Remove Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Reference</em>'.
	 * @see operationtracemodel.RemoveReference
	 * @generated
	 */
	EClass getRemoveReference();

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
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ELEMENT = eINSTANCE.getStep_Element();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__FEATURE = eINSTANCE.getStep_Feature();

		/**
		 * The meta object literal for the '{@link operationtracemodel.impl.RemovedElementImpl <em>Removed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.RemovedElementImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getRemovedElement()
		 * @generated
		 */
		EClass REMOVED_ELEMENT = eINSTANCE.getRemovedElement();

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
		 * The meta object literal for the '{@link operationtracemodel.impl.RemoveImpl <em>Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.RemoveImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getRemove()
		 * @generated
		 */
		EClass REMOVE = eINSTANCE.getRemove();

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
		 * The meta object literal for the '{@link operationtracemodel.impl.RemoveAttributeImpl <em>Remove Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.RemoveAttributeImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getRemoveAttribute()
		 * @generated
		 */
		EClass REMOVE_ATTRIBUTE = eINSTANCE.getRemoveAttribute();

		/**
		 * The meta object literal for the '{@link operationtracemodel.impl.RemoveReferenceImpl <em>Remove Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see operationtracemodel.impl.RemoveReferenceImpl
		 * @see operationtracemodel.impl.OperationtracemodelPackageImpl#getRemoveReference()
		 * @generated
		 */
		EClass REMOVE_REFERENCE = eINSTANCE.getRemoveReference();

	}

} //OperationtracemodelPackage
