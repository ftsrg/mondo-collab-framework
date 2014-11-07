/**
 */
package gyak.model.webpage;

import java.util.Calendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Articles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gyak.model.webpage.Articles#getName <em>Name</em>}</li>
 *   <li>{@link gyak.model.webpage.Articles#getCreated <em>Created</em>}</li>
 *   <li>{@link gyak.model.webpage.Articles#getIze <em>Ize</em>}</li>
 *   <li>{@link gyak.model.webpage.Articles#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @see gyak.model.webpage.WebpagePackage#getArticles()
 * @model
 * @generated
 */
public interface Articles extends EObject {
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
	 * @see gyak.model.webpage.WebpagePackage#getArticles_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gyak.model.webpage.Articles#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Calendar)
	 * @see gyak.model.webpage.WebpagePackage#getArticles_Created()
	 * @model dataType="gyak.model.webpage.calendar"
	 * @generated
	 */
	Calendar getCreated();

	/**
	 * Sets the value of the '{@link gyak.model.webpage.Articles#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Calendar value);

	/**
	 * Returns the value of the '<em><b>Ize</b></em>' reference list.
	 * The list contents are of type {@link gyak.model.webpage.MyWeb}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ize</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ize</em>' reference list.
	 * @see gyak.model.webpage.WebpagePackage#getArticles_Ize()
	 * @model type="gyak.model.webpage.MyWeb"
	 * @generated
	 */
	EList getIze();

	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(EObject)
	 * @see gyak.model.webpage.WebpagePackage#getArticles_EReference0()
	 * @model
	 * @generated
	 */
	EObject getEReference0();

	/**
	 * Sets the value of the '{@link gyak.model.webpage.Articles#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(EObject value);

} // Articles
