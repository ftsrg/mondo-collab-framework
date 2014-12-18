/**
 */
package eu.mondo.collaboration.operationtracemodel;

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
 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelFactory
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
	OperationtracemodelPackage eINSTANCE = eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.mondo.collaboration.operationtracemodel.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.mondo.collaboration.operationtracemodel.impl.TraceImpl
	 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getTrace()
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
	 * The feature id for the '<em><b>Cemetery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__CEMETERY = 2;

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
	 * The meta object id for the '{@link eu.mondo.collaboration.operationtracemodel.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.mondo.collaboration.operationtracemodel.impl.CommandImpl
	 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getCommand()
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
	 * The meta object id for the '{@link eu.mondo.collaboration.operationtracemodel.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.mondo.collaboration.operationtracemodel.impl.StepImpl
	 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getStep()
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
	 * The meta object id for the '{@link eu.mondo.collaboration.operationtracemodel.impl.InsertImpl <em>Insert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.mondo.collaboration.operationtracemodel.impl.InsertImpl
	 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getInsert()
	 * @generated
	 */
	int INSERT = 3;

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
	 * The meta object id for the '{@link eu.mondo.collaboration.operationtracemodel.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.mondo.collaboration.operationtracemodel.impl.UpdateImpl
	 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 4;

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
	 * The meta object id for the '{@link eu.mondo.collaboration.operationtracemodel.impl.RemoveImpl <em>Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.mondo.collaboration.operationtracemodel.impl.RemoveImpl
	 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getRemove()
	 * @generated
	 */
	int REMOVE = 5;

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
	 * The meta object id for the '{@link eu.mondo.collaboration.operationtracemodel.impl.CemeteryImpl <em>Cemetery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.mondo.collaboration.operationtracemodel.impl.CemeteryImpl
	 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getCemetery()
	 * @generated
	 */
	int CEMETERY = 6;

	/**
	 * The feature id for the '<em><b>Removed Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEMETERY__REMOVED_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Cemetery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEMETERY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cemetery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEMETERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.mondo.collaboration.operationtracemodel.impl.InsertAttributeImpl <em>Insert Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.mondo.collaboration.operationtracemodel.impl.InsertAttributeImpl
	 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getInsertAttribute()
	 * @generated
	 */
	int INSERT_ATTRIBUTE = 7;

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
	 * The meta object id for the '{@link eu.mondo.collaboration.operationtracemodel.impl.InsertReferenceImpl <em>Insert Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.mondo.collaboration.operationtracemodel.impl.InsertReferenceImpl
	 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getInsertReference()
	 * @generated
	 */
	int INSERT_REFERENCE = 8;

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
	 * The feature id for the '<em><b>New Value</b></em>' reference.
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
	 * The meta object id for the '{@link eu.mondo.collaboration.operationtracemodel.impl.UpdateAttributeImpl <em>Update Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.mondo.collaboration.operationtracemodel.impl.UpdateAttributeImpl
	 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getUpdateAttribute()
	 * @generated
	 */
	int UPDATE_ATTRIBUTE = 9;

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
	 * The meta object id for the '{@link eu.mondo.collaboration.operationtracemodel.impl.UpdateReferenceImpl <em>Update Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.mondo.collaboration.operationtracemodel.impl.UpdateReferenceImpl
	 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getUpdateReference()
	 * @generated
	 */
	int UPDATE_REFERENCE = 10;

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
	 * The feature id for the '<em><b>Old Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REFERENCE__OLD_VALUE = UPDATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REFERENCE__NEW_VALUE = UPDATE_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link eu.mondo.collaboration.operationtracemodel.impl.RemoveAttributeImpl <em>Remove Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.mondo.collaboration.operationtracemodel.impl.RemoveAttributeImpl
	 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getRemoveAttribute()
	 * @generated
	 */
	int REMOVE_ATTRIBUTE = 11;

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
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE__OLD_VALUE = REMOVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE_FEATURE_COUNT = REMOVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE_OPERATION_COUNT = REMOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.mondo.collaboration.operationtracemodel.impl.RemoveReferenceImpl <em>Remove Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.mondo.collaboration.operationtracemodel.impl.RemoveReferenceImpl
	 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getRemoveReference()
	 * @generated
	 */
	int REMOVE_REFERENCE = 12;

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
	 * The feature id for the '<em><b>Old Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_REFERENCE__OLD_VALUE = REMOVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_REFERENCE_FEATURE_COUNT = REMOVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_REFERENCE_OPERATION_COUNT = REMOVE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link eu.mondo.collaboration.operationtracemodel.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.mondo.collaboration.operationtracemodel.impl.MoveImpl
	 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 13;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__NEXT_STEP = STEP__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__ELEMENT = STEP__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__FEATURE = STEP__FEATURE;

	/**
	 * The feature id for the '<em><b>Old Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__OLD_INDEX = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__NEW_INDEX = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.mondo.collaboration.operationtracemodel.impl.MoveAttributeImpl <em>Move Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.mondo.collaboration.operationtracemodel.impl.MoveAttributeImpl
	 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getMoveAttribute()
	 * @generated
	 */
	int MOVE_ATTRIBUTE = 14;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTRIBUTE__NEXT_STEP = MOVE__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTRIBUTE__ELEMENT = MOVE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTRIBUTE__FEATURE = MOVE__FEATURE;

	/**
	 * The feature id for the '<em><b>Old Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTRIBUTE__OLD_INDEX = MOVE__OLD_INDEX;

	/**
	 * The feature id for the '<em><b>New Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTRIBUTE__NEW_INDEX = MOVE__NEW_INDEX;

	/**
	 * The feature id for the '<em><b>Moved Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTRIBUTE__MOVED_ELEMENT = MOVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTRIBUTE_FEATURE_COUNT = MOVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Move Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTRIBUTE_OPERATION_COUNT = MOVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.mondo.collaboration.operationtracemodel.impl.MoveReferenceImpl <em>Move Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.mondo.collaboration.operationtracemodel.impl.MoveReferenceImpl
	 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getMoveReference()
	 * @generated
	 */
	int MOVE_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_REFERENCE__NEXT_STEP = MOVE__NEXT_STEP;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_REFERENCE__ELEMENT = MOVE__ELEMENT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_REFERENCE__FEATURE = MOVE__FEATURE;

	/**
	 * The feature id for the '<em><b>Old Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_REFERENCE__OLD_INDEX = MOVE__OLD_INDEX;

	/**
	 * The feature id for the '<em><b>New Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_REFERENCE__NEW_INDEX = MOVE__NEW_INDEX;

	/**
	 * The feature id for the '<em><b>Moved Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_REFERENCE__MOVED_ELEMENT = MOVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_REFERENCE_FEATURE_COUNT = MOVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Move Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_REFERENCE_OPERATION_COUNT = MOVE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link eu.mondo.collaboration.operationtracemodel.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.mondo.collaboration.operationtracemodel.Trace#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Trace#getCommands()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Commands();

	/**
	 * Returns the meta object for the reference '{@link eu.mondo.collaboration.operationtracemodel.Trace#getFirstCommand <em>First Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Command</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Trace#getFirstCommand()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_FirstCommand();

	/**
	 * Returns the meta object for the containment reference '{@link eu.mondo.collaboration.operationtracemodel.Trace#getCemetery <em>Cemetery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cemetery</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Trace#getCemetery()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Cemetery();

	/**
	 * Returns the meta object for the reference '{@link eu.mondo.collaboration.operationtracemodel.Trace#getLastCommand <em>Last Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Command</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Trace#getLastCommand()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_LastCommand();

	/**
	 * Returns the meta object for class '{@link eu.mondo.collaboration.operationtracemodel.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.mondo.collaboration.operationtracemodel.Command#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Command#getSteps()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Steps();

	/**
	 * Returns the meta object for the reference '{@link eu.mondo.collaboration.operationtracemodel.Command#getNextCommand <em>Next Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Command</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Command#getNextCommand()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_NextCommand();

	/**
	 * Returns the meta object for the reference '{@link eu.mondo.collaboration.operationtracemodel.Command#getFirstStep <em>First Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Step</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Command#getFirstStep()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_FirstStep();

	/**
	 * Returns the meta object for class '{@link eu.mondo.collaboration.operationtracemodel.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference '{@link eu.mondo.collaboration.operationtracemodel.Step#getNextStep <em>Next Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Step</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Step#getNextStep()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_NextStep();

	/**
	 * Returns the meta object for the reference '{@link eu.mondo.collaboration.operationtracemodel.Step#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Step#getElement()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Element();

	/**
	 * Returns the meta object for the reference '{@link eu.mondo.collaboration.operationtracemodel.Step#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Step#getFeature()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Feature();

	/**
	 * Returns the meta object for class '{@link eu.mondo.collaboration.operationtracemodel.Insert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Insert
	 * @generated
	 */
	EClass getInsert();

	/**
	 * Returns the meta object for class '{@link eu.mondo.collaboration.operationtracemodel.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Update
	 * @generated
	 */
	EClass getUpdate();

	/**
	 * Returns the meta object for class '{@link eu.mondo.collaboration.operationtracemodel.Remove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Remove
	 * @generated
	 */
	EClass getRemove();

	/**
	 * Returns the meta object for class '{@link eu.mondo.collaboration.operationtracemodel.Cemetery <em>Cemetery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cemetery</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Cemetery
	 * @generated
	 */
	EClass getCemetery();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.mondo.collaboration.operationtracemodel.Cemetery#getRemovedElements <em>Removed Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Removed Elements</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Cemetery#getRemovedElements()
	 * @see #getCemetery()
	 * @generated
	 */
	EReference getCemetery_RemovedElements();

	/**
	 * Returns the meta object for class '{@link eu.mondo.collaboration.operationtracemodel.InsertAttribute <em>Insert Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert Attribute</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.InsertAttribute
	 * @generated
	 */
	EClass getInsertAttribute();

	/**
	 * Returns the meta object for the attribute '{@link eu.mondo.collaboration.operationtracemodel.InsertAttribute#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.InsertAttribute#getNewValue()
	 * @see #getInsertAttribute()
	 * @generated
	 */
	EAttribute getInsertAttribute_NewValue();

	/**
	 * Returns the meta object for class '{@link eu.mondo.collaboration.operationtracemodel.InsertReference <em>Insert Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert Reference</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.InsertReference
	 * @generated
	 */
	EClass getInsertReference();

	/**
	 * Returns the meta object for the reference '{@link eu.mondo.collaboration.operationtracemodel.InsertReference#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Value</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.InsertReference#getNewValue()
	 * @see #getInsertReference()
	 * @generated
	 */
	EReference getInsertReference_NewValue();

	/**
	 * Returns the meta object for class '{@link eu.mondo.collaboration.operationtracemodel.UpdateAttribute <em>Update Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Attribute</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.UpdateAttribute
	 * @generated
	 */
	EClass getUpdateAttribute();

	/**
	 * Returns the meta object for the attribute '{@link eu.mondo.collaboration.operationtracemodel.UpdateAttribute#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.UpdateAttribute#getNewValue()
	 * @see #getUpdateAttribute()
	 * @generated
	 */
	EAttribute getUpdateAttribute_NewValue();

	/**
	 * Returns the meta object for the attribute '{@link eu.mondo.collaboration.operationtracemodel.UpdateAttribute#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.UpdateAttribute#getOldValue()
	 * @see #getUpdateAttribute()
	 * @generated
	 */
	EAttribute getUpdateAttribute_OldValue();

	/**
	 * Returns the meta object for class '{@link eu.mondo.collaboration.operationtracemodel.UpdateReference <em>Update Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Reference</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.UpdateReference
	 * @generated
	 */
	EClass getUpdateReference();

	/**
	 * Returns the meta object for the reference '{@link eu.mondo.collaboration.operationtracemodel.UpdateReference#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Value</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.UpdateReference#getOldValue()
	 * @see #getUpdateReference()
	 * @generated
	 */
	EReference getUpdateReference_OldValue();

	/**
	 * Returns the meta object for the reference '{@link eu.mondo.collaboration.operationtracemodel.UpdateReference#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Value</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.UpdateReference#getNewValue()
	 * @see #getUpdateReference()
	 * @generated
	 */
	EReference getUpdateReference_NewValue();

	/**
	 * Returns the meta object for class '{@link eu.mondo.collaboration.operationtracemodel.RemoveAttribute <em>Remove Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Attribute</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.RemoveAttribute
	 * @generated
	 */
	EClass getRemoveAttribute();

	/**
	 * Returns the meta object for the attribute '{@link eu.mondo.collaboration.operationtracemodel.RemoveAttribute#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.RemoveAttribute#getOldValue()
	 * @see #getRemoveAttribute()
	 * @generated
	 */
	EAttribute getRemoveAttribute_OldValue();

	/**
	 * Returns the meta object for class '{@link eu.mondo.collaboration.operationtracemodel.RemoveReference <em>Remove Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Reference</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.RemoveReference
	 * @generated
	 */
	EClass getRemoveReference();

	/**
	 * Returns the meta object for the reference '{@link eu.mondo.collaboration.operationtracemodel.RemoveReference#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Value</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.RemoveReference#getOldValue()
	 * @see #getRemoveReference()
	 * @generated
	 */
	EReference getRemoveReference_OldValue();

	/**
	 * Returns the meta object for class '{@link eu.mondo.collaboration.operationtracemodel.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the attribute '{@link eu.mondo.collaboration.operationtracemodel.Move#getOldIndex <em>Old Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Index</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Move#getOldIndex()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_OldIndex();

	/**
	 * Returns the meta object for the attribute '{@link eu.mondo.collaboration.operationtracemodel.Move#getNewIndex <em>New Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Index</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.Move#getNewIndex()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_NewIndex();

	/**
	 * Returns the meta object for class '{@link eu.mondo.collaboration.operationtracemodel.MoveAttribute <em>Move Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Attribute</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.MoveAttribute
	 * @generated
	 */
	EClass getMoveAttribute();

	/**
	 * Returns the meta object for the attribute '{@link eu.mondo.collaboration.operationtracemodel.MoveAttribute#getMovedElement <em>Moved Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moved Element</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.MoveAttribute#getMovedElement()
	 * @see #getMoveAttribute()
	 * @generated
	 */
	EAttribute getMoveAttribute_MovedElement();

	/**
	 * Returns the meta object for class '{@link eu.mondo.collaboration.operationtracemodel.MoveReference <em>Move Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Reference</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.MoveReference
	 * @generated
	 */
	EClass getMoveReference();

	/**
	 * Returns the meta object for the reference '{@link eu.mondo.collaboration.operationtracemodel.MoveReference#getMovedElement <em>Moved Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Moved Element</em>'.
	 * @see eu.mondo.collaboration.operationtracemodel.MoveReference#getMovedElement()
	 * @see #getMoveReference()
	 * @generated
	 */
	EReference getMoveReference_MovedElement();

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
		 * The meta object literal for the '{@link eu.mondo.collaboration.operationtracemodel.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.mondo.collaboration.operationtracemodel.impl.TraceImpl
		 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getTrace()
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
		 * The meta object literal for the '<em><b>Cemetery</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__CEMETERY = eINSTANCE.getTrace_Cemetery();

		/**
		 * The meta object literal for the '<em><b>Last Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__LAST_COMMAND = eINSTANCE.getTrace_LastCommand();

		/**
		 * The meta object literal for the '{@link eu.mondo.collaboration.operationtracemodel.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.mondo.collaboration.operationtracemodel.impl.CommandImpl
		 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getCommand()
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
		 * The meta object literal for the '{@link eu.mondo.collaboration.operationtracemodel.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.mondo.collaboration.operationtracemodel.impl.StepImpl
		 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getStep()
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
		 * The meta object literal for the '{@link eu.mondo.collaboration.operationtracemodel.impl.InsertImpl <em>Insert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.mondo.collaboration.operationtracemodel.impl.InsertImpl
		 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getInsert()
		 * @generated
		 */
		EClass INSERT = eINSTANCE.getInsert();

		/**
		 * The meta object literal for the '{@link eu.mondo.collaboration.operationtracemodel.impl.UpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.mondo.collaboration.operationtracemodel.impl.UpdateImpl
		 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getUpdate()
		 * @generated
		 */
		EClass UPDATE = eINSTANCE.getUpdate();

		/**
		 * The meta object literal for the '{@link eu.mondo.collaboration.operationtracemodel.impl.RemoveImpl <em>Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.mondo.collaboration.operationtracemodel.impl.RemoveImpl
		 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getRemove()
		 * @generated
		 */
		EClass REMOVE = eINSTANCE.getRemove();

		/**
		 * The meta object literal for the '{@link eu.mondo.collaboration.operationtracemodel.impl.CemeteryImpl <em>Cemetery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.mondo.collaboration.operationtracemodel.impl.CemeteryImpl
		 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getCemetery()
		 * @generated
		 */
		EClass CEMETERY = eINSTANCE.getCemetery();

		/**
		 * The meta object literal for the '<em><b>Removed Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEMETERY__REMOVED_ELEMENTS = eINSTANCE.getCemetery_RemovedElements();

		/**
		 * The meta object literal for the '{@link eu.mondo.collaboration.operationtracemodel.impl.InsertAttributeImpl <em>Insert Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.mondo.collaboration.operationtracemodel.impl.InsertAttributeImpl
		 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getInsertAttribute()
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
		 * The meta object literal for the '{@link eu.mondo.collaboration.operationtracemodel.impl.InsertReferenceImpl <em>Insert Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.mondo.collaboration.operationtracemodel.impl.InsertReferenceImpl
		 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getInsertReference()
		 * @generated
		 */
		EClass INSERT_REFERENCE = eINSTANCE.getInsertReference();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_REFERENCE__NEW_VALUE = eINSTANCE.getInsertReference_NewValue();

		/**
		 * The meta object literal for the '{@link eu.mondo.collaboration.operationtracemodel.impl.UpdateAttributeImpl <em>Update Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.mondo.collaboration.operationtracemodel.impl.UpdateAttributeImpl
		 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getUpdateAttribute()
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
		 * The meta object literal for the '{@link eu.mondo.collaboration.operationtracemodel.impl.UpdateReferenceImpl <em>Update Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.mondo.collaboration.operationtracemodel.impl.UpdateReferenceImpl
		 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getUpdateReference()
		 * @generated
		 */
		EClass UPDATE_REFERENCE = eINSTANCE.getUpdateReference();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_REFERENCE__OLD_VALUE = eINSTANCE.getUpdateReference_OldValue();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_REFERENCE__NEW_VALUE = eINSTANCE.getUpdateReference_NewValue();

		/**
		 * The meta object literal for the '{@link eu.mondo.collaboration.operationtracemodel.impl.RemoveAttributeImpl <em>Remove Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.mondo.collaboration.operationtracemodel.impl.RemoveAttributeImpl
		 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getRemoveAttribute()
		 * @generated
		 */
		EClass REMOVE_ATTRIBUTE = eINSTANCE.getRemoveAttribute();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_ATTRIBUTE__OLD_VALUE = eINSTANCE.getRemoveAttribute_OldValue();

		/**
		 * The meta object literal for the '{@link eu.mondo.collaboration.operationtracemodel.impl.RemoveReferenceImpl <em>Remove Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.mondo.collaboration.operationtracemodel.impl.RemoveReferenceImpl
		 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getRemoveReference()
		 * @generated
		 */
		EClass REMOVE_REFERENCE = eINSTANCE.getRemoveReference();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_REFERENCE__OLD_VALUE = eINSTANCE.getRemoveReference_OldValue();

		/**
		 * The meta object literal for the '{@link eu.mondo.collaboration.operationtracemodel.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.mondo.collaboration.operationtracemodel.impl.MoveImpl
		 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Old Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__OLD_INDEX = eINSTANCE.getMove_OldIndex();

		/**
		 * The meta object literal for the '<em><b>New Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__NEW_INDEX = eINSTANCE.getMove_NewIndex();

		/**
		 * The meta object literal for the '{@link eu.mondo.collaboration.operationtracemodel.impl.MoveAttributeImpl <em>Move Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.mondo.collaboration.operationtracemodel.impl.MoveAttributeImpl
		 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getMoveAttribute()
		 * @generated
		 */
		EClass MOVE_ATTRIBUTE = eINSTANCE.getMoveAttribute();

		/**
		 * The meta object literal for the '<em><b>Moved Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_ATTRIBUTE__MOVED_ELEMENT = eINSTANCE.getMoveAttribute_MovedElement();

		/**
		 * The meta object literal for the '{@link eu.mondo.collaboration.operationtracemodel.impl.MoveReferenceImpl <em>Move Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.mondo.collaboration.operationtracemodel.impl.MoveReferenceImpl
		 * @see eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelPackageImpl#getMoveReference()
		 * @generated
		 */
		EClass MOVE_REFERENCE = eINSTANCE.getMoveReference();

		/**
		 * The meta object literal for the '<em><b>Moved Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_REFERENCE__MOVED_ELEMENT = eINSTANCE.getMoveReference_MovedElement();

	}

} //OperationtracemodelPackage
