/**
 */
package gyak.model.webpage;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gyak.model.webpage.WebpageFactory
 * @model kind="package"
 * @generated
 */
public interface WebpagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webpage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://webpage/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webpage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebpagePackage eINSTANCE = gyak.model.webpage.impl.WebpagePackageImpl.init();

	/**
	 * The meta object id for the '{@link gyak.model.webpage.impl.WebpageImpl <em>Webpage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gyak.model.webpage.impl.WebpageImpl
	 * @see gyak.model.webpage.impl.WebpagePackageImpl#getWebpage()
	 * @generated
	 */
	int WEBPAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__KEYWORDS = 3;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__CATEGORIES = 4;

	/**
	 * The feature id for the '<em><b>Temp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE__TEMP = 5;

	/**
	 * The number of structural features of the '<em>Webpage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBPAGE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link gyak.model.webpage.impl.MyWebImpl <em>My Web</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gyak.model.webpage.impl.MyWebImpl
	 * @see gyak.model.webpage.impl.WebpagePackageImpl#getMyWeb()
	 * @generated
	 */
	int MY_WEB = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_WEB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_WEB__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_WEB__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_WEB__KEYWORDS = 3;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_WEB__EREFERENCE0 = 4;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_WEB__PAGES = 5;

	/**
	 * The number of structural features of the '<em>My Web</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_WEB_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link gyak.model.webpage.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gyak.model.webpage.impl.CategoryImpl
	 * @see gyak.model.webpage.impl.WebpagePackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Articles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ARTICLES = 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link gyak.model.webpage.impl.ArticlesImpl <em>Articles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gyak.model.webpage.impl.ArticlesImpl
	 * @see gyak.model.webpage.impl.WebpagePackageImpl#getArticles()
	 * @generated
	 */
	int ARTICLES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLES__CREATED = 1;

	/**
	 * The feature id for the '<em><b>Ize</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLES__IZE = 2;

	/**
	 * The number of structural features of the '<em>Articles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLES_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link gyak.model.webpage.impl.TempImpl <em>Temp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gyak.model.webpage.impl.TempImpl
	 * @see gyak.model.webpage.impl.WebpagePackageImpl#getTemp()
	 * @generated
	 */
	int TEMP = 4;

	/**
	 * The number of structural features of the '<em>Temp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '<em>calendar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Calendar
	 * @see gyak.model.webpage.impl.WebpagePackageImpl#getcalendar()
	 * @generated
	 */
	int CALENDAR = 5;


	/**
	 * Returns the meta object for class '{@link gyak.model.webpage.Webpage <em>Webpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Webpage</em>'.
	 * @see gyak.model.webpage.Webpage
	 * @generated
	 */
	EClass getWebpage();

	/**
	 * Returns the meta object for the attribute '{@link gyak.model.webpage.Webpage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gyak.model.webpage.Webpage#getName()
	 * @see #getWebpage()
	 * @generated
	 */
	EAttribute getWebpage_Name();

	/**
	 * Returns the meta object for the attribute '{@link gyak.model.webpage.Webpage#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see gyak.model.webpage.Webpage#getTitle()
	 * @see #getWebpage()
	 * @generated
	 */
	EAttribute getWebpage_Title();

	/**
	 * Returns the meta object for the attribute '{@link gyak.model.webpage.Webpage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see gyak.model.webpage.Webpage#getDescription()
	 * @see #getWebpage()
	 * @generated
	 */
	EAttribute getWebpage_Description();

	/**
	 * Returns the meta object for the attribute '{@link gyak.model.webpage.Webpage#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keywords</em>'.
	 * @see gyak.model.webpage.Webpage#getKeywords()
	 * @see #getWebpage()
	 * @generated
	 */
	EAttribute getWebpage_Keywords();

	/**
	 * Returns the meta object for the containment reference '{@link gyak.model.webpage.Webpage#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Categories</em>'.
	 * @see gyak.model.webpage.Webpage#getCategories()
	 * @see #getWebpage()
	 * @generated
	 */
	EReference getWebpage_Categories();

	/**
	 * Returns the meta object for the containment reference '{@link gyak.model.webpage.Webpage#getTemp <em>Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temp</em>'.
	 * @see gyak.model.webpage.Webpage#getTemp()
	 * @see #getWebpage()
	 * @generated
	 */
	EReference getWebpage_Temp();

	/**
	 * Returns the meta object for class '{@link gyak.model.webpage.MyWeb <em>My Web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Web</em>'.
	 * @see gyak.model.webpage.MyWeb
	 * @generated
	 */
	EClass getMyWeb();

	/**
	 * Returns the meta object for the attribute '{@link gyak.model.webpage.MyWeb#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gyak.model.webpage.MyWeb#getName()
	 * @see #getMyWeb()
	 * @generated
	 */
	EAttribute getMyWeb_Name();

	/**
	 * Returns the meta object for the attribute '{@link gyak.model.webpage.MyWeb#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see gyak.model.webpage.MyWeb#getTitle()
	 * @see #getMyWeb()
	 * @generated
	 */
	EAttribute getMyWeb_Title();

	/**
	 * Returns the meta object for the attribute '{@link gyak.model.webpage.MyWeb#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see gyak.model.webpage.MyWeb#getDescription()
	 * @see #getMyWeb()
	 * @generated
	 */
	EAttribute getMyWeb_Description();

	/**
	 * Returns the meta object for the attribute list '{@link gyak.model.webpage.MyWeb#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keywords</em>'.
	 * @see gyak.model.webpage.MyWeb#getKeywords()
	 * @see #getMyWeb()
	 * @generated
	 */
	EAttribute getMyWeb_Keywords();

	/**
	 * Returns the meta object for the reference '{@link gyak.model.webpage.MyWeb#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see gyak.model.webpage.MyWeb#getEReference0()
	 * @see #getMyWeb()
	 * @generated
	 */
	EReference getMyWeb_EReference0();

	/**
	 * Returns the meta object for the containment reference list '{@link gyak.model.webpage.MyWeb#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see gyak.model.webpage.MyWeb#getPages()
	 * @see #getMyWeb()
	 * @generated
	 */
	EReference getMyWeb_Pages();

	/**
	 * Returns the meta object for class '{@link gyak.model.webpage.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see gyak.model.webpage.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link gyak.model.webpage.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gyak.model.webpage.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gyak.model.webpage.Category#getArticles <em>Articles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Articles</em>'.
	 * @see gyak.model.webpage.Category#getArticles()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Articles();

	/**
	 * Returns the meta object for class '{@link gyak.model.webpage.Articles <em>Articles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Articles</em>'.
	 * @see gyak.model.webpage.Articles
	 * @generated
	 */
	EClass getArticles();

	/**
	 * Returns the meta object for the attribute '{@link gyak.model.webpage.Articles#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gyak.model.webpage.Articles#getName()
	 * @see #getArticles()
	 * @generated
	 */
	EAttribute getArticles_Name();

	/**
	 * Returns the meta object for the attribute '{@link gyak.model.webpage.Articles#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see gyak.model.webpage.Articles#getCreated()
	 * @see #getArticles()
	 * @generated
	 */
	EAttribute getArticles_Created();

	/**
	 * Returns the meta object for the reference list '{@link gyak.model.webpage.Articles#getIze <em>Ize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ize</em>'.
	 * @see gyak.model.webpage.Articles#getIze()
	 * @see #getArticles()
	 * @generated
	 */
	EReference getArticles_Ize();

	/**
	 * Returns the meta object for class '{@link gyak.model.webpage.Temp <em>Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temp</em>'.
	 * @see gyak.model.webpage.Temp
	 * @generated
	 */
	EClass getTemp();

	/**
	 * Returns the meta object for data type '{@link java.util.Calendar <em>calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>calendar</em>'.
	 * @see java.util.Calendar
	 * @model instanceClass="java.util.Calendar"
	 * @generated
	 */
	EDataType getcalendar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebpageFactory getWebpageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gyak.model.webpage.impl.WebpageImpl <em>Webpage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gyak.model.webpage.impl.WebpageImpl
		 * @see gyak.model.webpage.impl.WebpagePackageImpl#getWebpage()
		 * @generated
		 */
		EClass WEBPAGE = eINSTANCE.getWebpage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBPAGE__NAME = eINSTANCE.getWebpage_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBPAGE__TITLE = eINSTANCE.getWebpage_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBPAGE__DESCRIPTION = eINSTANCE.getWebpage_Description();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEBPAGE__KEYWORDS = eINSTANCE.getWebpage_Keywords();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBPAGE__CATEGORIES = eINSTANCE.getWebpage_Categories();

		/**
		 * The meta object literal for the '<em><b>Temp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEBPAGE__TEMP = eINSTANCE.getWebpage_Temp();

		/**
		 * The meta object literal for the '{@link gyak.model.webpage.impl.MyWebImpl <em>My Web</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gyak.model.webpage.impl.MyWebImpl
		 * @see gyak.model.webpage.impl.WebpagePackageImpl#getMyWeb()
		 * @generated
		 */
		EClass MY_WEB = eINSTANCE.getMyWeb();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_WEB__NAME = eINSTANCE.getMyWeb_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_WEB__TITLE = eINSTANCE.getMyWeb_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_WEB__DESCRIPTION = eINSTANCE.getMyWeb_Description();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_WEB__KEYWORDS = eINSTANCE.getMyWeb_Keywords();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_WEB__EREFERENCE0 = eINSTANCE.getMyWeb_EReference0();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_WEB__PAGES = eINSTANCE.getMyWeb_Pages();

		/**
		 * The meta object literal for the '{@link gyak.model.webpage.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gyak.model.webpage.impl.CategoryImpl
		 * @see gyak.model.webpage.impl.WebpagePackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Articles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__ARTICLES = eINSTANCE.getCategory_Articles();

		/**
		 * The meta object literal for the '{@link gyak.model.webpage.impl.ArticlesImpl <em>Articles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gyak.model.webpage.impl.ArticlesImpl
		 * @see gyak.model.webpage.impl.WebpagePackageImpl#getArticles()
		 * @generated
		 */
		EClass ARTICLES = eINSTANCE.getArticles();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLES__NAME = eINSTANCE.getArticles_Name();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLES__CREATED = eINSTANCE.getArticles_Created();

		/**
		 * The meta object literal for the '<em><b>Ize</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTICLES__IZE = eINSTANCE.getArticles_Ize();

		/**
		 * The meta object literal for the '{@link gyak.model.webpage.impl.TempImpl <em>Temp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gyak.model.webpage.impl.TempImpl
		 * @see gyak.model.webpage.impl.WebpagePackageImpl#getTemp()
		 * @generated
		 */
		EClass TEMP = eINSTANCE.getTemp();

		/**
		 * The meta object literal for the '<em>calendar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Calendar
		 * @see gyak.model.webpage.impl.WebpagePackageImpl#getcalendar()
		 * @generated
		 */
		EDataType CALENDAR = eINSTANCE.getcalendar();

	}

} //WebpagePackage
