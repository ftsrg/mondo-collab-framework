/**
 */
package eu.mondo.collaboration.operationtracemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.mondo.collaboration.operationtracemodel.OperationtracemodelPackage
 * @generated
 */
public interface OperationtracemodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperationtracemodelFactory eINSTANCE = eu.mondo.collaboration.operationtracemodel.impl.OperationtracemodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	Trace createTrace();

	/**
	 * Returns a new object of class '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command</em>'.
	 * @generated
	 */
	Command createCommand();

	/**
	 * Returns a new object of class '<em>Cemetery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cemetery</em>'.
	 * @generated
	 */
	Cemetery createCemetery();

	/**
	 * Returns a new object of class '<em>Insert Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insert Attribute</em>'.
	 * @generated
	 */
	InsertAttribute createInsertAttribute();

	/**
	 * Returns a new object of class '<em>Insert Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insert Reference</em>'.
	 * @generated
	 */
	InsertReference createInsertReference();

	/**
	 * Returns a new object of class '<em>Update Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Attribute</em>'.
	 * @generated
	 */
	UpdateAttribute createUpdateAttribute();

	/**
	 * Returns a new object of class '<em>Update Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Reference</em>'.
	 * @generated
	 */
	UpdateReference createUpdateReference();

	/**
	 * Returns a new object of class '<em>Remove Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Attribute</em>'.
	 * @generated
	 */
	RemoveAttribute createRemoveAttribute();

	/**
	 * Returns a new object of class '<em>Remove Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Reference</em>'.
	 * @generated
	 */
	RemoveReference createRemoveReference();

	/**
	 * Returns a new object of class '<em>Move Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Attribute</em>'.
	 * @generated
	 */
	MoveAttribute createMoveAttribute();

	/**
	 * Returns a new object of class '<em>Move Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Reference</em>'.
	 * @generated
	 */
	MoveReference createMoveReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OperationtracemodelPackage getOperationtracemodelPackage();

} //OperationtracemodelFactory
