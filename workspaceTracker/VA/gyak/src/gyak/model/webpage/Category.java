/**
 */
package gyak.model.webpage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gyak.model.webpage.Category#getName <em>Name</em>}</li>
 *   <li>{@link gyak.model.webpage.Category#getArticles <em>Articles</em>}</li>
 *   <li>{@link gyak.model.webpage.Category#getCattemp <em>Cattemp</em>}</li>
 * </ul>
 * </p>
 *
 * @see gyak.model.webpage.WebpagePackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gyak.model.webpage.WebpagePackage#getCategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gyak.model.webpage.Category#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Articles</b></em>' containment reference list.
	 * The list contents are of type {@link gyak.model.webpage.Articles}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Articles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articles</em>' containment reference list.
	 * @see gyak.model.webpage.WebpagePackage#getCategory_Articles()
	 * @model type="gyak.model.webpage.Articles" containment="true"
	 * @generated
	 */
	EList getArticles();

	/**
	 * Returns the value of the '<em><b>Cattemp</b></em>' reference list.
	 * The list contents are of type {@link gyak.model.webpage.Temp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cattemp</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cattemp</em>' reference list.
	 * @see gyak.model.webpage.WebpagePackage#getCategory_Cattemp()
	 * @model type="gyak.model.webpage.Temp"
	 * @generated
	 */
	EList getCattemp();

} // Category
