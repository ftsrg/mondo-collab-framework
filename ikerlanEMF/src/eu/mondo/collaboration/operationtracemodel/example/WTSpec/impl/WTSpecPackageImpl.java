/**
 */
package eu.mondo.collaboration.operationtracemodel.example.WTSpec.impl;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecFactory;
import eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WTSpecPackageImpl extends EPackageImpl implements WTSpecPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "WTSpec.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemFaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemErrorReactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wtcInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wtcOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wtcParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wtcTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wtcFaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wtcErrorReactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wtcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit7EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit8EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit9EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit10EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit11EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit12EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit13EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit14EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit15EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit16EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit17EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit18EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit19EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit20EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit21EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit22EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit23EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit24EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit25EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit26EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit27EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit28EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit29EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit30EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit31EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit32EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit33EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit34EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit35EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit36EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit37EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit38EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit39EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit40EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit41EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit42EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit43EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit44EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit45EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit46EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit47EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit48EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit49EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit50EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit51EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit52EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit53EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit54EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit55EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit56EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit57EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit58EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit59EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit60EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit61EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit62EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit63EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit64EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit65EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit66EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit67EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit68EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit69EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit70EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit71EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit72EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit73EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit74EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit75EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit76EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit77EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit78EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit79EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit80EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit81EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit82EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit83EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit84EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit85EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit86EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit87EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit88EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit89EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit90EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit91EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit92EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit93EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit94EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit95EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit96EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit97EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit98EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit99EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit100EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit101EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit102EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit103EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit104EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit105EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit106EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit107EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit108EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit109EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit110EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit111EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit112EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit113EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit114EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit115EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit116EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit117EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit118EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit119EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit120EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit121EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit122EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit123EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit124EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit125EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit126EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit127EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit128EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit129EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit130EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit131EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit132EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ctrlUnit133EClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eu.mondo.collaboration.operationtracemodel.example.WTSpec.WTSpecPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WTSpecPackageImpl() {
		super(eNS_URI, WTSpecFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WTSpecPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static WTSpecPackage init() {
		if (isInited) return (WTSpecPackage)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI);

		// Obtain or create and register package
		WTSpecPackageImpl theWTSpecPackage = (WTSpecPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WTSpecPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WTSpecPackageImpl());

		isInited = true;

		// Load packages
		theWTSpecPackage.loadPackage();

		// Fix loaded packages
		theWTSpecPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theWTSpecPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WTSpecPackage.eNS_URI, theWTSpecPackage);
		return theWTSpecPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWT() {
		if (wtEClass == null) {
			wtEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(0);
		}
		return wtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWT_SysId() {
        return (EAttribute)getWT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWT_Model() {
        return (EAttribute)getWT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWT_Version() {
        return (EAttribute)getWT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWT_ItsSubsystems() {
        return (EReference)getWT().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWT_ItsInputs() {
        return (EReference)getWT().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWT_ItsOutputs() {
        return (EReference)getWT().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWT_ItsParams() {
        return (EReference)getWT().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWT_ItsTimers() {
        return (EReference)getWT().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWT_ItsFaults() {
        return (EReference)getWT().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWT_ItsVariables() {
        return (EReference)getWT().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWT_ItsErrorReactions() {
        return (EReference)getWT().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemInput() {
		if (systemInputEClass == null) {
			systemInputEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(1);
		}
		return systemInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemInput_SysId() {
        return (EAttribute)getSystemInput().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemOutput() {
		if (systemOutputEClass == null) {
			systemOutputEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(2);
		}
		return systemOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemOutput_SysId() {
        return (EAttribute)getSystemOutput().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemFault() {
		if (systemFaultEClass == null) {
			systemFaultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(3);
		}
		return systemFaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemFault_SysId() {
        return (EAttribute)getSystemFault().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemFault_Value() {
        return (EAttribute)getSystemFault().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemParam() {
		if (systemParamEClass == null) {
			systemParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(4);
		}
		return systemParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemParam_SysId() {
        return (EAttribute)getSystemParam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemParam_Value() {
        return (EAttribute)getSystemParam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemTimer() {
		if (systemTimerEClass == null) {
			systemTimerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(5);
		}
		return systemTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemTimer_SysId() {
        return (EAttribute)getSystemTimer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemTimer_Value() {
        return (EAttribute)getSystemTimer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemVariable() {
		if (systemVariableEClass == null) {
			systemVariableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(6);
		}
		return systemVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemVariable_SysId() {
        return (EAttribute)getSystemVariable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemErrorReaction() {
		if (systemErrorReactionEClass == null) {
			systemErrorReactionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(7);
		}
		return systemErrorReactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemErrorReaction_SysId() {
        return (EAttribute)getSystemErrorReaction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWTCInput() {
		if (wtcInputEClass == null) {
			wtcInputEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(8);
		}
		return wtcInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWTCOutput() {
		if (wtcOutputEClass == null) {
			wtcOutputEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(9);
		}
		return wtcOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWTCParam() {
		if (wtcParamEClass == null) {
			wtcParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(10);
		}
		return wtcParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWTCTimer() {
		if (wtcTimerEClass == null) {
			wtcTimerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(11);
		}
		return wtcTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWTCFault() {
		if (wtcFaultEClass == null) {
			wtcFaultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(12);
		}
		return wtcFaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWTCErrorReaction() {
		if (wtcErrorReactionEClass == null) {
			wtcErrorReactionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(13);
		}
		return wtcErrorReactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubsystem() {
		if (subsystemEClass == null) {
			subsystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(14);
		}
		return subsystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubsystem_SysId() {
        return (EAttribute)getSubsystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubsystem_Description() {
        return (EAttribute)getSubsystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubsystem_ItsWTCs() {
        return (EReference)getSubsystem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubsystem_ItsSubsystems() {
        return (EReference)getSubsystem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwtc() {
		if (wtcEClass == null) {
			wtcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(15);
		}
		return wtcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getwtc_SysId() {
        return (EAttribute)getwtc().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getwtc_Description() {
        return (EAttribute)getwtc().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getwtc_Cycle() {
        return (EAttribute)getwtc().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getwtc_Priority() {
        return (EAttribute)getwtc().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit1() {
		if (ctrlUnit1EClass == null) {
			ctrlUnit1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(16);
		}
		return ctrlUnit1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit1_Input__iTwistAngle() {
        return (EReference)getCtrlUnit1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit1_Output__oNacelleDirection() {
        return (EReference)getCtrlUnit1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit2() {
		if (ctrlUnit2EClass == null) {
			ctrlUnit2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(17);
		}
		return ctrlUnit2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit2_Input__iTwistAngle() {
        return (EReference)getCtrlUnit2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit2_Output__oNorthDirection() {
        return (EReference)getCtrlUnit2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit2_Parameter__pNorthOffset() {
        return (EReference)getCtrlUnit2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit3() {
		if (ctrlUnit3EClass == null) {
			ctrlUnit3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(18);
		}
		return ctrlUnit3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit3_Input__iAccessStateNC2() {
        return (EReference)getCtrlUnit3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit3_Input__iAccessStateTC() {
        return (EReference)getCtrlUnit3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit3_Output__oAccessState() {
        return (EReference)getCtrlUnit3().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit4() {
		if (ctrlUnit4EClass == null) {
			ctrlUnit4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(19);
		}
		return ctrlUnit4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit4_Input__iStatus() {
        return (EReference)getCtrlUnit4().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit4_Input__iOverloadAlarm() {
        return (EReference)getCtrlUnit4().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit4_Input__iAlarmCounter() {
        return (EReference)getCtrlUnit4().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit4_Output__oAlarmCounter() {
        return (EReference)getCtrlUnit4().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit4_Parameter__pAlarmCountLimit() {
        return (EReference)getCtrlUnit4().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit4_Parameter__pTimePeriod() {
        return (EReference)getCtrlUnit4().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit4_Fault__fOverload() {
        return (EReference)getCtrlUnit4().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit4_Timer__tSyncDelay() {
        return (EReference)getCtrlUnit4().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit5() {
		if (ctrlUnit5EClass == null) {
			ctrlUnit5EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(20);
		}
		return ctrlUnit5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit5_Input__iInput1() {
        return (EReference)getCtrlUnit5().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit5_Input__iInput2() {
        return (EReference)getCtrlUnit5().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit5_Output__oResult() {
        return (EReference)getCtrlUnit5().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit6() {
		if (ctrlUnit6EClass == null) {
			ctrlUnit6EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(21);
		}
		return ctrlUnit6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit6_Input__iStatus() {
        return (EReference)getCtrlUnit6().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit6_Input__iOverloadAlarm() {
        return (EReference)getCtrlUnit6().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit6_Input__iAlarmCounter() {
        return (EReference)getCtrlUnit6().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit6_Output__oAlarmCounter() {
        return (EReference)getCtrlUnit6().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit6_Parameter__pTimePeriod() {
        return (EReference)getCtrlUnit6().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit6_Parameter__pOverloadTimeLimit() {
        return (EReference)getCtrlUnit6().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit6_Fault__fOverload() {
        return (EReference)getCtrlUnit6().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit6_Timer__tSyncDelay() {
        return (EReference)getCtrlUnit6().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit7() {
		if (ctrlUnit7EClass == null) {
			ctrlUnit7EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(22);
		}
		return ctrlUnit7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit7_Input__iAnalogInput() {
        return (EReference)getCtrlUnit7().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit7_Output__oAnalogCompensated() {
        return (EReference)getCtrlUnit7().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit8() {
		if (ctrlUnit8EClass == null) {
			ctrlUnit8EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(23);
		}
		return ctrlUnit8EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit8_Input__i1() {
        return (EReference)getCtrlUnit8().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit8_Output__o1() {
        return (EReference)getCtrlUnit8().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit8_Parameter__pDelay() {
        return (EReference)getCtrlUnit8().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit8_BhvParam__bpFilter() {
        return (EAttribute)getCtrlUnit8().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit9() {
		if (ctrlUnit9EClass == null) {
			ctrlUnit9EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(24);
		}
		return ctrlUnit9EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit9_Input__iValueToCheck() {
        return (EReference)getCtrlUnit9().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit9_Input__iDontCheckInput() {
        return (EReference)getCtrlUnit9().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit9_Input__iLimitValue() {
        return (EReference)getCtrlUnit9().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit9_Input__iLimitReset() {
        return (EReference)getCtrlUnit9().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit9_Output__oLimitReached() {
        return (EReference)getCtrlUnit9().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit9_Parameter__pLimitValue() {
        return (EReference)getCtrlUnit9().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit9_Parameter__pLimitReset() {
        return (EReference)getCtrlUnit9().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit9_Timer__tDelay() {
        return (EReference)getCtrlUnit9().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit9_BhvParam__bpMode() {
        return (EAttribute)getCtrlUnit9().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit9_BhvParam__bpLimitsType() {
        return (EAttribute)getCtrlUnit9().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit10() {
		if (ctrlUnit10EClass == null) {
			ctrlUnit10EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(25);
		}
		return ctrlUnit10EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit10_Input__iAnalogInput() {
        return (EReference)getCtrlUnit10().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit10_Output__oAnalogScaled() {
        return (EReference)getCtrlUnit10().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit10_Parameter__pFactor() {
        return (EReference)getCtrlUnit10().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit10_Parameter__pOffset() {
        return (EReference)getCtrlUnit10().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit10_Parameter__pUpLimit() {
        return (EReference)getCtrlUnit10().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit10_Parameter__pUpValue() {
        return (EReference)getCtrlUnit10().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit10_Parameter__pDownLimit() {
        return (EReference)getCtrlUnit10().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit10_Parameter__pDownValue() {
        return (EReference)getCtrlUnit10().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit10_BhvParam__bpOperation() {
        return (EAttribute)getCtrlUnit10().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit11() {
		if (ctrlUnit11EClass == null) {
			ctrlUnit11EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(26);
		}
		return ctrlUnit11EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit11_Input__iInput1() {
        return (EReference)getCtrlUnit11().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit11_Input__iInput2() {
        return (EReference)getCtrlUnit11().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit11_Output__oOutput() {
        return (EReference)getCtrlUnit11().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit12() {
		if (ctrlUnit12EClass == null) {
			ctrlUnit12EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(27);
		}
		return ctrlUnit12EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit12_Input__iPinPosition() {
        return (EReference)getCtrlUnit12().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit12_Input__iInductive() {
        return (EReference)getCtrlUnit12().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit12_Input__iFlInPosition() {
        return (EReference)getCtrlUnit12().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit12_Input__iLockingOrder() {
        return (EReference)getCtrlUnit12().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit12_Input__iLockingSet() {
        return (EReference)getCtrlUnit12().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit12_Output__oPinAutoCmd() {
        return (EReference)getCtrlUnit12().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit12_Parameter__pPinNoBackPos() {
        return (EReference)getCtrlUnit12().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit12_Parameter__pPinExtendedPos() {
        return (EReference)getCtrlUnit12().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit12_Parameter__pPinRetractedPos() {
        return (EReference)getCtrlUnit12().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit12_Parameter__pPinHysteresis() {
        return (EReference)getCtrlUnit12().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit13() {
		if (ctrlUnit13EClass == null) {
			ctrlUnit13EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(28);
		}
		return ctrlUnit13EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit13_Input__iSelect() {
        return (EReference)getCtrlUnit13().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit13_Input__iInput1() {
        return (EReference)getCtrlUnit13().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit13_Input__iInput2() {
        return (EReference)getCtrlUnit13().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit13_Output__oOutput() {
        return (EReference)getCtrlUnit13().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit13_Parameter__pParam1() {
        return (EReference)getCtrlUnit13().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit13_Parameter__pParam2() {
        return (EReference)getCtrlUnit13().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit13_BhvParam__bpType() {
        return (EAttribute)getCtrlUnit13().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit13_BhvParam__bpInputType() {
        return (EAttribute)getCtrlUnit13().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit14() {
		if (ctrlUnit14EClass == null) {
			ctrlUnit14EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(29);
		}
		return ctrlUnit14EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit14_Output__oBit() {
        return (EReference)getCtrlUnit14().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit15() {
		if (ctrlUnit15EClass == null) {
			ctrlUnit15EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(30);
		}
		return ctrlUnit15EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit15_Input__iInput() {
        return (EReference)getCtrlUnit15().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit15_Output__oOutput() {
        return (EReference)getCtrlUnit15().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit15_Parameter__pMask() {
        return (EReference)getCtrlUnit15().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit16() {
		if (ctrlUnit16EClass == null) {
			ctrlUnit16EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(31);
		}
		return ctrlUnit16EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit16_Input__iVarInput() {
        return (EReference)getCtrlUnit16().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit16_Output__oVarOutput() {
        return (EReference)getCtrlUnit16().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit17() {
		if (ctrlUnit17EClass == null) {
			ctrlUnit17EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(32);
		}
		return ctrlUnit17EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit17_Parameter__pParam() {
        return (EReference)getCtrlUnit17().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit17_Fault__fWarning() {
        return (EReference)getCtrlUnit17().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit17_Fault__fFault() {
        return (EReference)getCtrlUnit17().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit17_Timer__tTimer() {
        return (EReference)getCtrlUnit17().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit18() {
		if (ctrlUnit18EClass == null) {
			ctrlUnit18EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(33);
		}
		return ctrlUnit18EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Input__iOrderCw() {
        return (EReference)getCtrlUnit18().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Input__iOrderCcw() {
        return (EReference)getCtrlUnit18().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Input__iFault() {
        return (EReference)getCtrlUnit18().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Input__iCmdDisable() {
        return (EReference)getCtrlUnit18().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Input__iCmdReset() {
        return (EReference)getCtrlUnit18().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Input__iStaReadyToOn() {
        return (EReference)getCtrlUnit18().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Output__oControlWord() {
        return (EReference)getCtrlUnit18().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Parameter__pCmdDisabled() {
        return (EReference)getCtrlUnit18().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Parameter__pCmdEnabled() {
        return (EReference)getCtrlUnit18().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Parameter__pCmdCw() {
        return (EReference)getCtrlUnit18().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Parameter__pCmdCcw() {
        return (EReference)getCtrlUnit18().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Parameter__pCmdReset() {
        return (EReference)getCtrlUnit18().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Parameter__pCmdSwitchOn() {
        return (EReference)getCtrlUnit18().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Parameter__pCmdBraking() {
        return (EReference)getCtrlUnit18().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit18_Timer__tDelay() {
        return (EReference)getCtrlUnit18().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit19() {
		if (ctrlUnit19EClass == null) {
			ctrlUnit19EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(34);
		}
		return ctrlUnit19EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit19_Input__iPitchTorque() {
        return (EReference)getCtrlUnit19().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit19_Output__oPitchRms() {
        return (EReference)getCtrlUnit19().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit19_Parameter__pDivisor() {
        return (EReference)getCtrlUnit19().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit20() {
		if (ctrlUnit20EClass == null) {
			ctrlUnit20EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(35);
		}
		return ctrlUnit20EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit20_Input__iMasterOrder() {
        return (EReference)getCtrlUnit20().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit20_Input__iInverterOrder() {
        return (EReference)getCtrlUnit20().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit20_Input__iChangeOrder() {
        return (EReference)getCtrlUnit20().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit20_Input__iManualStop() {
        return (EReference)getCtrlUnit20().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit20_Output__oMasterSelected() {
        return (EReference)getCtrlUnit20().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit20_Output__oInverterEnabled() {
        return (EReference)getCtrlUnit20().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit20_Output__oForceInvOff() {
        return (EReference)getCtrlUnit20().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit21() {
		if (ctrlUnit21EClass == null) {
			ctrlUnit21EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(36);
		}
		return ctrlUnit21EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit21_Input__iWindDirection() {
        return (EReference)getCtrlUnit21().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit21_Input__iFlagBrakes() {
        return (EReference)getCtrlUnit21().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit21_Input__iFlagIntoWind() {
        return (EReference)getCtrlUnit21().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit21_Output__oBackWindDetected() {
        return (EReference)getCtrlUnit21().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit21_Parameter__pMaxAbsoluteAngle() {
        return (EReference)getCtrlUnit21().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit22() {
		if (ctrlUnit22EClass == null) {
			ctrlUnit22EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(37);
		}
		return ctrlUnit22EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit22_Input__iYawStatus() {
        return (EReference)getCtrlUnit22().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit22_Input__iTwistAngle() {
        return (EReference)getCtrlUnit22().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit22_Input__iMaxTwistCW() {
        return (EReference)getCtrlUnit22().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit22_Input__iMaxTwistCCW() {
        return (EReference)getCtrlUnit22().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit22_Output__oMaxTwistPreCommand() {
        return (EReference)getCtrlUnit22().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit22_Parameter__pMaxTwistHysteresis() {
        return (EReference)getCtrlUnit22().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit22_Fault__fTwistExcessiveCW() {
        return (EReference)getCtrlUnit22().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit22_Fault__fTwistExcessiveCCW() {
        return (EReference)getCtrlUnit22().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit23() {
		if (ctrlUnit23EClass == null) {
			ctrlUnit23EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(38);
		}
		return ctrlUnit23EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit23_Input__iWindSpeed() {
        return (EReference)getCtrlUnit23().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit23_Input__iInverterPower() {
        return (EReference)getCtrlUnit23().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit23_Output__oRelationError() {
        return (EReference)getCtrlUnit23().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit23_Parameter__pWindSpeedLimit() {
        return (EReference)getCtrlUnit23().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit23_Parameter__pInverterPowerLimit() {
        return (EReference)getCtrlUnit23().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit23_Timer__tWindMinimumTime() {
        return (EReference)getCtrlUnit23().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit23_Timer__tPowerAndWindMinimumTime() {
        return (EReference)getCtrlUnit23().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit24() {
		if (ctrlUnit24EClass == null) {
			ctrlUnit24EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(39);
		}
		return ctrlUnit24EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit24_Input__iInverterReady() {
        return (EReference)getCtrlUnit24().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit24_Input__iInverterPower() {
        return (EReference)getCtrlUnit24().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit24_Input__iAlgorithmCommand() {
        return (EReference)getCtrlUnit24().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit24_Parameter__pPowerLimit() {
        return (EReference)getCtrlUnit24().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit24_Fault__fYawProblem() {
        return (EReference)getCtrlUnit24().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit24_Timer__tDelayProblemNotify() {
        return (EReference)getCtrlUnit24().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit24_DecisionSequence__dsDecisionTree() {
        return (EAttribute)getCtrlUnit24().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit25() {
		if (ctrlUnit25EClass == null) {
			ctrlUnit25EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(40);
		}
		return ctrlUnit25EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit25_Input__iStatus() {
        return (EReference)getCtrlUnit25().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit25_Input__iOverloadAlarm() {
        return (EReference)getCtrlUnit25().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit25_Input__iAlarmCounter() {
        return (EReference)getCtrlUnit25().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit25_Output__oAlarmCounter() {
        return (EReference)getCtrlUnit25().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit25_Fault__fOverload() {
        return (EReference)getCtrlUnit25().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit25_Timer__tTimer() {
        return (EReference)getCtrlUnit25().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit25_Timer__tSyncDelay() {
        return (EReference)getCtrlUnit25().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit26() {
		if (ctrlUnit26EClass == null) {
			ctrlUnit26EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(41);
		}
		return ctrlUnit26EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit26_Input__iCounter() {
        return (EReference)getCtrlUnit26().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit26_Input__iActivator() {
        return (EReference)getCtrlUnit26().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit26_Output__oCounter() {
        return (EReference)getCtrlUnit26().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit26_Output__oLimitReached() {
        return (EReference)getCtrlUnit26().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit26_Parameter__pLimit() {
        return (EReference)getCtrlUnit26().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit27() {
		if (ctrlUnit27EClass == null) {
			ctrlUnit27EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(42);
		}
		return ctrlUnit27EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit27_Input__iOrder() {
        return (EReference)getCtrlUnit27().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit27_Input__iFailure() {
        return (EReference)getCtrlUnit27().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit27_Output__oOrder() {
        return (EReference)getCtrlUnit27().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit27_Output__oCounter() {
        return (EReference)getCtrlUnit27().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit27_Parameter__pMaxCount() {
        return (EReference)getCtrlUnit27().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit28() {
		if (ctrlUnit28EClass == null) {
			ctrlUnit28EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(43);
		}
		return ctrlUnit28EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit28_Input__iDigitalInput() {
        return (EReference)getCtrlUnit28().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit28_Output__oAlarmHasBeenReset() {
        return (EReference)getCtrlUnit28().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit28_Fault__fFault() {
        return (EReference)getCtrlUnit28().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit29() {
		if (ctrlUnit29EClass == null) {
			ctrlUnit29EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(44);
		}
		return ctrlUnit29EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit29_Input__iDigitalInput() {
        return (EReference)getCtrlUnit29().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit29_Input__iDontCheckInput() {
        return (EReference)getCtrlUnit29().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit29_Fault__fFault() {
        return (EReference)getCtrlUnit29().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit29_BhvParam__bpResetMode() {
        return (EAttribute)getCtrlUnit29().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit30() {
		if (ctrlUnit30EClass == null) {
			ctrlUnit30EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(45);
		}
		return ctrlUnit30EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit30_Input__iDigitalInput() {
        return (EReference)getCtrlUnit30().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit30_Input__iOffOrder() {
        return (EReference)getCtrlUnit30().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit31() {
		if (ctrlUnit31EClass == null) {
			ctrlUnit31EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(46);
		}
		return ctrlUnit31EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit31_Input__iInput() {
        return (EReference)getCtrlUnit31().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit31_Output__oOutput() {
        return (EReference)getCtrlUnit31().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit31_Parameter__pMask() {
        return (EReference)getCtrlUnit31().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit32() {
		if (ctrlUnit32EClass == null) {
			ctrlUnit32EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(47);
		}
		return ctrlUnit32EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit32_Output__oChangeCmd() {
        return (EReference)getCtrlUnit32().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit32_Output__oPersistentHour() {
        return (EReference)getCtrlUnit32().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit32_Parameter__pDayChangeHour() {
        return (EReference)getCtrlUnit32().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit33() {
		if (ctrlUnit33EClass == null) {
			ctrlUnit33EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(48);
		}
		return ctrlUnit33EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit33_Input__iResetOutput() {
        return (EReference)getCtrlUnit33().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit33_Output__oIsLastError() {
        return (EReference)getCtrlUnit33().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit33_Fault__fFault() {
        return (EReference)getCtrlUnit33().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit34() {
		if (ctrlUnit34EClass == null) {
			ctrlUnit34EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(49);
		}
		return ctrlUnit34EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit34_Input__iInput() {
        return (EReference)getCtrlUnit34().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit34_Input__iFeedback() {
        return (EReference)getCtrlUnit34().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit34_Output__oFaultOn() {
        return (EReference)getCtrlUnit34().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit34_Output__oFaultOff() {
        return (EReference)getCtrlUnit34().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit34_Timer__tDelayOn() {
        return (EReference)getCtrlUnit34().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit34_Timer__tDelayOff() {
        return (EReference)getCtrlUnit34().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit34_BhvParam__bpLogicType() {
        return (EAttribute)getCtrlUnit34().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit35() {
		if (ctrlUnit35EClass == null) {
			ctrlUnit35EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(50);
		}
		return ctrlUnit35EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit35_Input__iFeedback() {
        return (EReference)getCtrlUnit35().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit35_Output__oOutput() {
        return (EReference)getCtrlUnit35().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit35_Fault__fFaultOn() {
        return (EReference)getCtrlUnit35().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit35_Fault__fFaultOff() {
        return (EReference)getCtrlUnit35().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit35_Timer__tDelayOn() {
        return (EReference)getCtrlUnit35().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit35_Timer__tDelayOff() {
        return (EReference)getCtrlUnit35().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit35_BhvParam__bpLogicType() {
        return (EAttribute)getCtrlUnit35().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit36() {
		if (ctrlUnit36EClass == null) {
			ctrlUnit36EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(51);
		}
		return ctrlUnit36EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit36_Input__i1() {
        return (EReference)getCtrlUnit36().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit36_Output__o1() {
        return (EReference)getCtrlUnit36().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit36_Parameter__pDelayOn() {
        return (EReference)getCtrlUnit36().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit36_Parameter__pDelayOff() {
        return (EReference)getCtrlUnit36().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit37() {
		if (ctrlUnit37EClass == null) {
			ctrlUnit37EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(52);
		}
		return ctrlUnit37EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit37_Input__iInput() {
        return (EReference)getCtrlUnit37().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit37_Input__iBadInputQuality() {
        return (EReference)getCtrlUnit37().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit37_Input__iDontCheckInput() {
        return (EReference)getCtrlUnit37().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit37_Output__oSendReset() {
        return (EReference)getCtrlUnit37().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit37_Fault__fFault() {
        return (EReference)getCtrlUnit37().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit37_Timer__tCheckInputDelay() {
        return (EReference)getCtrlUnit37().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit37_BhvParam__bpLogicType() {
        return (EAttribute)getCtrlUnit37().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit38() {
		if (ctrlUnit38EClass == null) {
			ctrlUnit38EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(53);
		}
		return ctrlUnit38EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit38_Input__iInput() {
        return (EReference)getCtrlUnit38().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit38_Input__iDontCheckInput() {
        return (EReference)getCtrlUnit38().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit38_Parameter__pDelay() {
        return (EReference)getCtrlUnit38().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit38_Fault__fFault() {
        return (EReference)getCtrlUnit38().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit38_Timer__tDelay() {
        return (EReference)getCtrlUnit38().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit38_BhvParam__bpLogicType() {
        return (EAttribute)getCtrlUnit38().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit39() {
		if (ctrlUnit39EClass == null) {
			ctrlUnit39EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(54);
		}
		return ctrlUnit39EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit39_Input__iInput() {
        return (EReference)getCtrlUnit39().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit39_Input__iDontCheckInput() {
        return (EReference)getCtrlUnit39().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit39_Fault__fFault() {
        return (EReference)getCtrlUnit39().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit39_Timer__tDelay() {
        return (EReference)getCtrlUnit39().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit39_BhvParam__bpLogicType() {
        return (EAttribute)getCtrlUnit39().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit40() {
		if (ctrlUnit40EClass == null) {
			ctrlUnit40EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(55);
		}
		return ctrlUnit40EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit40_Input__iOrder() {
        return (EReference)getCtrlUnit40().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit40_Output__oOutput() {
        return (EReference)getCtrlUnit40().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit40_Timer__tTimer() {
        return (EReference)getCtrlUnit40().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit41() {
		if (ctrlUnit41EClass == null) {
			ctrlUnit41EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(56);
		}
		return ctrlUnit41EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit41_Input__iInput1() {
        return (EReference)getCtrlUnit41().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit41_Input__iInput2() {
        return (EReference)getCtrlUnit41().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit41_Input__iInput3() {
        return (EReference)getCtrlUnit41().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit41_Output__oOutput() {
        return (EReference)getCtrlUnit41().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit41_Parameter__pParam1() {
        return (EReference)getCtrlUnit41().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit41_Parameter__pParam2() {
        return (EReference)getCtrlUnit41().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit41_Parameter__pParam3() {
        return (EReference)getCtrlUnit41().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit41_Fault__fFault1() {
        return (EReference)getCtrlUnit41().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit41_Fault__fFault2() {
        return (EReference)getCtrlUnit41().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit41_Fault__fFault3() {
        return (EReference)getCtrlUnit41().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit41_ErrorReaction__eReaction1() {
        return (EReference)getCtrlUnit41().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit41_ErrorReaction__eReaction2() {
        return (EReference)getCtrlUnit41().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit41_Guard__gGuardToMain() {
        return (EAttribute)getCtrlUnit41().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit41_Guard__gGuardFromMain() {
        return (EAttribute)getCtrlUnit41().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit41_Guard__gGuardToOn() {
        return (EAttribute)getCtrlUnit41().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit41_Guard__gGuardToOff() {
        return (EAttribute)getCtrlUnit41().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit42() {
		if (ctrlUnit42EClass == null) {
			ctrlUnit42EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(57);
		}
		return ctrlUnit42EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit42_Input__iInput() {
        return (EReference)getCtrlUnit42().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit42_Input__iDontCheckInput() {
        return (EReference)getCtrlUnit42().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit42_Output__oActive() {
        return (EReference)getCtrlUnit42().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit42_Output__oPulsing() {
        return (EReference)getCtrlUnit42().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit42_Timer__tDelay() {
        return (EReference)getCtrlUnit42().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit42_Timer__tActive() {
        return (EReference)getCtrlUnit42().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit43() {
		if (ctrlUnit43EClass == null) {
			ctrlUnit43EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(58);
		}
		return ctrlUnit43EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit43_Input__iInput1() {
        return (EReference)getCtrlUnit43().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit43_Input__iInput2() {
        return (EReference)getCtrlUnit43().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit43_Input__iDontCheckInput() {
        return (EReference)getCtrlUnit43().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit43_Output__oOutput() {
        return (EReference)getCtrlUnit43().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit43_Output__oOutDiv() {
        return (EReference)getCtrlUnit43().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit43_Output__oOutMod() {
        return (EReference)getCtrlUnit43().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit43_Parameter__pDiv() {
        return (EReference)getCtrlUnit43().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit43_Parameter__pParam1() {
        return (EReference)getCtrlUnit43().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit43_Parameter__pParam2() {
        return (EReference)getCtrlUnit43().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit43_BhvParam__bpType() {
        return (EAttribute)getCtrlUnit43().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit44() {
		if (ctrlUnit44EClass == null) {
			ctrlUnit44EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(59);
		}
		return ctrlUnit44EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit44_Input__iInput() {
        return (EReference)getCtrlUnit44().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit44_Output__oOutput() {
        return (EReference)getCtrlUnit44().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit45() {
		if (ctrlUnit45EClass == null) {
			ctrlUnit45EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(60);
		}
		return ctrlUnit45EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit45_Input__iInput() {
        return (EReference)getCtrlUnit45().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit45_Output__oOutput() {
        return (EReference)getCtrlUnit45().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit45_BhvParam__bpType() {
        return (EAttribute)getCtrlUnit45().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit46() {
		if (ctrlUnit46EClass == null) {
			ctrlUnit46EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(61);
		}
		return ctrlUnit46EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit46_Output__oOutput() {
        return (EReference)getCtrlUnit46().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit46_ErrorReaction__erErrorReaction() {
        return (EReference)getCtrlUnit46().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit47() {
		if (ctrlUnit47EClass == null) {
			ctrlUnit47EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(62);
		}
		return ctrlUnit47EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit47_Input__iResetOrder() {
        return (EReference)getCtrlUnit47().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit47_Fault__fResetFault() {
        return (EReference)getCtrlUnit47().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit48() {
		if (ctrlUnit48EClass == null) {
			ctrlUnit48EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(63);
		}
		return ctrlUnit48EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit48_Input__iTemp1() {
        return (EReference)getCtrlUnit48().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit48_Input__iTemp2() {
        return (EReference)getCtrlUnit48().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit48_Input__iTemp3() {
        return (EReference)getCtrlUnit48().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit48_Output__oFan() {
        return (EReference)getCtrlUnit48().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit48_Parameter__pTempLimit1() {
        return (EReference)getCtrlUnit48().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit48_Parameter__pTempLimit2() {
        return (EReference)getCtrlUnit48().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit48_Parameter__pTempLimit3() {
        return (EReference)getCtrlUnit48().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit48_Fault__fFault1() {
        return (EReference)getCtrlUnit48().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit48_ErrorReaction__erReaction1() {
        return (EReference)getCtrlUnit48().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit48_ErrorReaction__erReaction2() {
        return (EReference)getCtrlUnit48().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit49() {
		if (ctrlUnit49EClass == null) {
			ctrlUnit49EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(64);
		}
		return ctrlUnit49EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Input__iInput1() {
        return (EReference)getCtrlUnit49().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Input__iInput2() {
        return (EReference)getCtrlUnit49().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Input__iInput3() {
        return (EReference)getCtrlUnit49().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Input__iInput4() {
        return (EReference)getCtrlUnit49().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Output__oOutputFan1() {
        return (EReference)getCtrlUnit49().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Output__oOutputFan2() {
        return (EReference)getCtrlUnit49().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Parameter__pParam1() {
        return (EReference)getCtrlUnit49().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Parameter__pParam2() {
        return (EReference)getCtrlUnit49().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Parameter__pParam3() {
        return (EReference)getCtrlUnit49().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Parameter__pParam4() {
        return (EReference)getCtrlUnit49().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Fault__fFault1() {
        return (EReference)getCtrlUnit49().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_Timer__tTimer1() {
        return (EReference)getCtrlUnit49().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_ErrorReaction__eReaction1() {
        return (EReference)getCtrlUnit49().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit49_ErrorReaction__eReaction2() {
        return (EReference)getCtrlUnit49().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit49_Guard__gGuardErrors() {
        return (EAttribute)getCtrlUnit49().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit49_Guard__gGuardNoErrors() {
        return (EAttribute)getCtrlUnit49().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit49_Guard__gGuardOffToHi() {
        return (EAttribute)getCtrlUnit49().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit49_Guard__gGuardHiToOff() {
        return (EAttribute)getCtrlUnit49().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit49_Guard__gGuardOffToLow() {
        return (EAttribute)getCtrlUnit49().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit49_Guard__gGuardLowToOff() {
        return (EAttribute)getCtrlUnit49().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit49_Guard__gGuardLowToHi() {
        return (EAttribute)getCtrlUnit49().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit49_Guard__gGuardHiToLow() {
        return (EAttribute)getCtrlUnit49().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit50() {
		if (ctrlUnit50EClass == null) {
			ctrlUnit50EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(65);
		}
		return ctrlUnit50EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit50_Output__oOutput() {
        return (EReference)getCtrlUnit50().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit50_Fault__fFault() {
        return (EReference)getCtrlUnit50().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit51() {
		if (ctrlUnit51EClass == null) {
			ctrlUnit51EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(66);
		}
		return ctrlUnit51EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit51_Parameter__pHour() {
        return (EReference)getCtrlUnit51().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit51_Fault__fFault() {
        return (EReference)getCtrlUnit51().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit52() {
		if (ctrlUnit52EClass == null) {
			ctrlUnit52EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(67);
		}
		return ctrlUnit52EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit52_Input__iVarInput() {
        return (EReference)getCtrlUnit52().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit52_Output__oVarOutput() {
        return (EReference)getCtrlUnit52().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit53() {
		if (ctrlUnit53EClass == null) {
			ctrlUnit53EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(68);
		}
		return ctrlUnit53EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit53_Input__iMachineStatusIndicator() {
        return (EReference)getCtrlUnit53().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit53_Input__iStopConditionIndicator() {
        return (EReference)getCtrlUnit53().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit53_Input__iManualByPass() {
        return (EReference)getCtrlUnit53().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit53_Input__iMotorizing() {
        return (EReference)getCtrlUnit53().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit53_Input__iFlagIntoWind() {
        return (EReference)getCtrlUnit53().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit53_Input__iProtectionCondition() {
        return (EReference)getCtrlUnit53().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit53_Input__iEmergencyCondition() {
        return (EReference)getCtrlUnit53().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit53_Input__iDeenergizeCondition() {
        return (EReference)getCtrlUnit53().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit53_Output__oAutoStopCommand() {
        return (EReference)getCtrlUnit53().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit53_Fault__fRunFault() {
        return (EReference)getCtrlUnit53().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit53_Timer__tStartDelay() {
        return (EReference)getCtrlUnit53().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit53_Timer__tCheckRunFault() {
        return (EReference)getCtrlUnit53().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit53_ErrorReaction__erMotorizing() {
        return (EReference)getCtrlUnit53().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit54() {
		if (ctrlUnit54EClass == null) {
			ctrlUnit54EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(69);
		}
		return ctrlUnit54EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit54_Input__iSafety() {
        return (EReference)getCtrlUnit54().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit54_Input__iLockingOrderSelected() {
        return (EReference)getCtrlUnit54().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit54_Input__iMachineStateL() {
        return (EReference)getCtrlUnit54().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit54_Input__iMachineStateU() {
        return (EReference)getCtrlUnit54().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit54_Input__iMachineStateS() {
        return (EReference)getCtrlUnit54().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit54_Input__iInitialConditions() {
        return (EReference)getCtrlUnit54().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit54_Input__iPinState() {
        return (EReference)getCtrlUnit54().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit54_Output__oLockingOrder() {
        return (EReference)getCtrlUnit54().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit55() {
		if (ctrlUnit55EClass == null) {
			ctrlUnit55EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(70);
		}
		return ctrlUnit55EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit55_Output__oSignal() {
        return (EReference)getCtrlUnit55().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit56() {
		if (ctrlUnit56EClass == null) {
			ctrlUnit56EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(71);
		}
		return ctrlUnit56EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit56_Input__iInternalFailure() {
        return (EReference)getCtrlUnit56().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit56_Output__oInhibit() {
        return (EReference)getCtrlUnit56().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit57() {
		if (ctrlUnit57EClass == null) {
			ctrlUnit57EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(72);
		}
		return ctrlUnit57EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit57_Input__iUp() {
        return (EReference)getCtrlUnit57().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit57_Input__iDown() {
        return (EReference)getCtrlUnit57().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit57_Output__oAnalogOut() {
        return (EReference)getCtrlUnit57().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit57_Parameter__pParam() {
        return (EReference)getCtrlUnit57().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit57_Parameter__pMax() {
        return (EReference)getCtrlUnit57().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit57_Parameter__pMin() {
        return (EReference)getCtrlUnit57().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit58() {
		if (ctrlUnit58EClass == null) {
			ctrlUnit58EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(73);
		}
		return ctrlUnit58EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit58_Input__iInput() {
        return (EReference)getCtrlUnit58().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit58_Output__oOutput() {
        return (EReference)getCtrlUnit58().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit58_Parameter__pParam() {
        return (EReference)getCtrlUnit58().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit58_BhvParam__bpLogicType() {
        return (EAttribute)getCtrlUnit58().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit59() {
		if (ctrlUnit59EClass == null) {
			ctrlUnit59EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(74);
		}
		return ctrlUnit59EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit59_Input__iVarInput() {
        return (EReference)getCtrlUnit59().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit59_Output__oVarOutput() {
        return (EReference)getCtrlUnit59().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit60() {
		if (ctrlUnit60EClass == null) {
			ctrlUnit60EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(75);
		}
		return ctrlUnit60EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Input__iDisconnect() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Input__iStopCommand() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Input__iPitchBraked() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Input__iInverterRpm() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Input__iReadyForOn() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Input__iReadyForRun() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Input__iReadyForRef() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Input__iResetOrder() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Input__iForceInvOff() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Input__iSafetyInput() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Output__oInverterRun() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Output__oInverterToOn() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Parameter__pInverterConnSpeed() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Parameter__pInverterConnSpeedHysteresis() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Fault__fReconnectWarning() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Fault__fReadyRefWarning() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Timer__tConnection() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit60_Timer__tRunningDelay() {
        return (EReference)getCtrlUnit60().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit61() {
		if (ctrlUnit61EClass == null) {
			ctrlUnit61EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(76);
		}
		return ctrlUnit61EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit61_Input__iInverterToOnOrder() {
        return (EReference)getCtrlUnit61().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit61_Input__iInverterReadyRef() {
        return (EReference)getCtrlUnit61().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit61_Input__iRemoteResetOrder() {
        return (EReference)getCtrlUnit61().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit61_Input__iInverterTorqueReg() {
        return (EReference)getCtrlUnit61().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit61_Input__iInverterHwState() {
        return (EReference)getCtrlUnit61().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit61_Input__iResetOrder() {
        return (EReference)getCtrlUnit61().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit61_Input__iMotorizing() {
        return (EReference)getCtrlUnit61().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit61_Output__oInverterToOn() {
        return (EReference)getCtrlUnit61().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit61_Output__oInverterResetCommand() {
        return (EReference)getCtrlUnit61().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit61_Output__oInverterTorqueRef() {
        return (EReference)getCtrlUnit61().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit61_Output__oInverterResetAlarms() {
        return (EReference)getCtrlUnit61().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit61_Fault__fEtherCAT() {
        return (EReference)getCtrlUnit61().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit61_Timer__tResetTime() {
        return (EReference)getCtrlUnit61().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit61_Timer__tDelayBetweenResets() {
        return (EReference)getCtrlUnit61().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit61_ErrorReaction__erStop() {
        return (EReference)getCtrlUnit61().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit62() {
		if (ctrlUnit62EClass == null) {
			ctrlUnit62EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(77);
		}
		return ctrlUnit62EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit62_Input__iInverterTorqueRef() {
        return (EReference)getCtrlUnit62().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit62_Input__iInverterTorqueRefLocking() {
        return (EReference)getCtrlUnit62().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit62_Input__iMotorizing() {
        return (EReference)getCtrlUnit62().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit62_Output__oInverterTorqueRefFinal() {
        return (EReference)getCtrlUnit62().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit62_Output__oInverterMotorizeCommand() {
        return (EReference)getCtrlUnit62().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit63() {
		if (ctrlUnit63EClass == null) {
			ctrlUnit63EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(78);
		}
		return ctrlUnit63EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Input__iAzimuth() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Input__iOrder() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Input__iTargetHole() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Input__iInvReadyRef() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Input__iEncoderSpeed() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Input__iInductiveSensor1() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Input__iInductiveSensor2() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Output__oMotorTorque() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Output__oMotorSense() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Output__oFlIntoPosition() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Output__oStatusFromDll() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Output__oPositionSetpoint() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Output__oTorqueAve() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Output__oErrorAve() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Output__oSpeedAve() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Output__oWref() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Output__oTargetPosition() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Output__oKeepState() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Output__oSeekState() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Output__oMotorize() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Output__oRealObjetive() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Output__oControlMode() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pOffset() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pEncoderOffset() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pNextHoleDegrees() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pPosRate1() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pPosRate2() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pMaxSpeed() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pSampleTime() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pMaxTorque() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pAverageTime() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pSpeedAverageTime() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pMaxAcceleration() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pKpp() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pKps() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pKis() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pFilterOK() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pFilterFreq() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pFilterDamp() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pKp2() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pKp1() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pKi1() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pKi2() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit63_Parameter__pPosBand() {
        return (EReference)getCtrlUnit63().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit63_BhvParam__bpControlMode() {
        return (EAttribute)getCtrlUnit63().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit64() {
		if (ctrlUnit64EClass == null) {
			ctrlUnit64EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(79);
		}
		return ctrlUnit64EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit64_Output__oOutput() {
        return (EReference)getCtrlUnit64().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit64_ErrorReaction__erErrorReaction() {
        return (EReference)getCtrlUnit64().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit65() {
		if (ctrlUnit65EClass == null) {
			ctrlUnit65EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(80);
		}
		return ctrlUnit65EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit65_Output__oOutput() {
        return (EReference)getCtrlUnit65().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit65_Fault__fFault() {
        return (EReference)getCtrlUnit65().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit66() {
		if (ctrlUnit66EClass == null) {
			ctrlUnit66EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(81);
		}
		return ctrlUnit66EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit66_Input__iMaintenancePreventiveButton() {
        return (EReference)getCtrlUnit66().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit66_Input__iMaintenanceCorrectiveButton() {
        return (EReference)getCtrlUnit66().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit66_Input__iDontCheckInput() {
        return (EReference)getCtrlUnit66().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit66_Output__oMaintenanceStatus() {
        return (EReference)getCtrlUnit66().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit66_Fault__fMaintenancePreventive() {
        return (EReference)getCtrlUnit66().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit66_Fault__fMaintenanceCorrective() {
        return (EReference)getCtrlUnit66().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit67() {
		if (ctrlUnit67EClass == null) {
			ctrlUnit67EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(82);
		}
		return ctrlUnit67EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit67_Input__iHMIOrder() {
        return (EReference)getCtrlUnit67().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit67_Input__iElementStatus() {
        return (EReference)getCtrlUnit67().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit67_Input__iMasterPos() {
        return (EReference)getCtrlUnit67().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit67_Output__oElementRol() {
        return (EReference)getCtrlUnit67().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit67_Parameter__pMaxElements() {
        return (EReference)getCtrlUnit67().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit67_BhvParam__bpMode() {
        return (EAttribute)getCtrlUnit67().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit68() {
		if (ctrlUnit68EClass == null) {
			ctrlUnit68EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(83);
		}
		return ctrlUnit68EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit68_Input__iValue1() {
        return (EReference)getCtrlUnit68().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit68_Input__iValue2() {
        return (EReference)getCtrlUnit68().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit68_Output__oResult() {
        return (EReference)getCtrlUnit68().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit68_BhvParam__bpOperationType() {
        return (EAttribute)getCtrlUnit68().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit69() {
		if (ctrlUnit69EClass == null) {
			ctrlUnit69EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(84);
		}
		return ctrlUnit69EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit69_Input__iLocalMaxPower() {
        return (EReference)getCtrlUnit69().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit69_Input__iRemoteMaxPower() {
        return (EReference)getCtrlUnit69().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit69_Input__iTorqueControlMaxPower() {
        return (EReference)getCtrlUnit69().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit69_Output__oMaxPower() {
        return (EReference)getCtrlUnit69().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit69_Parameter__pMaxPower() {
        return (EReference)getCtrlUnit69().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit70() {
		if (ctrlUnit70EClass == null) {
			ctrlUnit70EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(85);
		}
		return ctrlUnit70EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit70_Input__iInput1() {
        return (EReference)getCtrlUnit70().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit70_Input__iInput2() {
        return (EReference)getCtrlUnit70().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit70_Input__iInput3() {
        return (EReference)getCtrlUnit70().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit70_Output__oResult() {
        return (EReference)getCtrlUnit70().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit71() {
		if (ctrlUnit71EClass == null) {
			ctrlUnit71EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(86);
		}
		return ctrlUnit71EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit71_Input__iSelect1() {
        return (EReference)getCtrlUnit71().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit71_Input__iSelect2() {
        return (EReference)getCtrlUnit71().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit71_Input__iSelect3() {
        return (EReference)getCtrlUnit71().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit71_Input__iInput1() {
        return (EReference)getCtrlUnit71().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit71_Input__iInput2() {
        return (EReference)getCtrlUnit71().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit71_Input__iInput3() {
        return (EReference)getCtrlUnit71().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit71_Output__oOutput() {
        return (EReference)getCtrlUnit71().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit71_Output__oOutputWrongStatus() {
        return (EReference)getCtrlUnit71().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit72() {
		if (ctrlUnit72EClass == null) {
			ctrlUnit72EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(87);
		}
		return ctrlUnit72EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit72_Input__iInput() {
        return (EReference)getCtrlUnit72().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit72_Timer__tDelay() {
        return (EReference)getCtrlUnit72().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit73() {
		if (ctrlUnit73EClass == null) {
			ctrlUnit73EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(88);
		}
		return ctrlUnit73EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit73_Input__iInput() {
        return (EReference)getCtrlUnit73().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit73_Output__oOutput() {
        return (EReference)getCtrlUnit73().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit74() {
		if (ctrlUnit74EClass == null) {
			ctrlUnit74EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(89);
		}
		return ctrlUnit74EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit74_Input__iConverterTripped() {
        return (EReference)getCtrlUnit74().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit74_Input__iConverterRunning() {
        return (EReference)getCtrlUnit74().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit74_Output__oOpcCnvOperationMode() {
        return (EReference)getCtrlUnit74().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit75() {
		if (ctrlUnit75EClass == null) {
			ctrlUnit75EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(90);
		}
		return ctrlUnit75EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit75_Input__iMaintenanceStatus() {
        return (EReference)getCtrlUnit75().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit75_Input__iFlBrakes() {
        return (EReference)getCtrlUnit75().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit75_Input__iWTGStopped() {
        return (EReference)getCtrlUnit75().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit75_Input__iGridError() {
        return (EReference)getCtrlUnit75().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit75_Input__iReTwisting() {
        return (EReference)getCtrlUnit75().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit75_Input__iHiWind() {
        return (EReference)getCtrlUnit75().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit75_Input__iHiGust() {
        return (EReference)getCtrlUnit75().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit75_Input__iLowWind() {
        return (EReference)getCtrlUnit75().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit75_Input__iBackWind() {
        return (EReference)getCtrlUnit75().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit75_Input__iEnEstela() {
        return (EReference)getCtrlUnit75().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit75_Output__oOpcTurbineStatus() {
        return (EReference)getCtrlUnit75().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit76() {
		if (ctrlUnit76EClass == null) {
			ctrlUnit76EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(91);
		}
		return ctrlUnit76EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit76_Input__iCtrlYawBrakeStatus() {
        return (EReference)getCtrlUnit76().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit76_Output__oOpcYawBrakeStatus() {
        return (EReference)getCtrlUnit76().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit77() {
		if (ctrlUnit77EClass == null) {
			ctrlUnit77EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(92);
		}
		return ctrlUnit77EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit77_Input__iYawInhibited() {
        return (EReference)getCtrlUnit77().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit77_Input__iYawCwOrder() {
        return (EReference)getCtrlUnit77().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit77_Input__iYawCcwOrder() {
        return (EReference)getCtrlUnit77().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit77_Input__iFlagIntoWind() {
        return (EReference)getCtrlUnit77().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit77_Output__oOpcYawStatus() {
        return (EReference)getCtrlUnit77().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit78() {
		if (ctrlUnit78EClass == null) {
			ctrlUnit78EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(93);
		}
		return ctrlUnit78EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit78_Input__iInput1() {
        return (EReference)getCtrlUnit78().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit78_Input__iInput2() {
        return (EReference)getCtrlUnit78().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit78_Output__oOutput() {
        return (EReference)getCtrlUnit78().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit79() {
		if (ctrlUnit79EClass == null) {
			ctrlUnit79EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(94);
		}
		return ctrlUnit79EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit79_Input__iOverPressureCmd() {
        return (EReference)getCtrlUnit79().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit79_Output__oYawBrakeHighPressureCmd() {
        return (EReference)getCtrlUnit79().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit79_Fault__fYawBrakeBlock() {
        return (EReference)getCtrlUnit79().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit79_Fault__fYawBrakeLoose() {
        return (EReference)getCtrlUnit79().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit79_Fault__fYawBrakeActive() {
        return (EReference)getCtrlUnit79().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit79_Fault__fWarning() {
        return (EReference)getCtrlUnit79().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit79_Fault__fFault() {
        return (EReference)getCtrlUnit79().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit79_DecisionSequence__dsCommands() {
        return (EAttribute)getCtrlUnit79().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit80() {
		if (ctrlUnit80EClass == null) {
			ctrlUnit80EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(95);
		}
		return ctrlUnit80EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit80_Input__iAccessState() {
        return (EReference)getCtrlUnit80().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit80_Input__iMaintenanceStatus() {
        return (EReference)getCtrlUnit80().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit80_Input__iButtonStateNC2() {
        return (EReference)getCtrlUnit80().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit80_Input__iButtonStateTC() {
        return (EReference)getCtrlUnit80().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit80_Input__iButtonStateRemote() {
        return (EReference)getCtrlUnit80().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit80_Output__oButtonState() {
        return (EReference)getCtrlUnit80().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit81() {
		if (ctrlUnit81EClass == null) {
			ctrlUnit81EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(96);
		}
		return ctrlUnit81EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit81_Input__iInput() {
        return (EReference)getCtrlUnit81().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit81_Output__oPercentVal() {
        return (EReference)getCtrlUnit81().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit81_Parameter__pPercent() {
        return (EReference)getCtrlUnit81().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit81_Parameter__pInput() {
        return (EReference)getCtrlUnit81().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit81_BhvParam__bpMode() {
        return (EAttribute)getCtrlUnit81().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit81_BhvParam__bpSelect() {
        return (EAttribute)getCtrlUnit81().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit82() {
		if (ctrlUnit82EClass == null) {
			ctrlUnit82EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(97);
		}
		return ctrlUnit82EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit82_Input__iVarInput() {
        return (EReference)getCtrlUnit82().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit82_Input__iWriteTwistAngleRequest() {
        return (EReference)getCtrlUnit82().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit82_Input__iNewTwistAngleValue() {
        return (EReference)getCtrlUnit82().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit82_Output__oVarOutput() {
        return (EReference)getCtrlUnit82().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit82_Parameter__pMinDifferenceToConsider() {
        return (EReference)getCtrlUnit82().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit82_Timer__tSyncDelay() {
        return (EReference)getCtrlUnit82().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit83() {
		if (ctrlUnit83EClass == null) {
			ctrlUnit83EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(98);
		}
		return ctrlUnit83EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit83_Input__iPinSafetyCmd() {
        return (EReference)getCtrlUnit83().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit83_Input__iPinAutoCmd() {
        return (EReference)getCtrlUnit83().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit83_Input__iPinManualCmd() {
        return (EReference)getCtrlUnit83().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit83_Input__iLockingSet() {
        return (EReference)getCtrlUnit83().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit83_Input__iManualMode() {
        return (EReference)getCtrlUnit83().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit83_Input__iSafetyBlock() {
        return (EReference)getCtrlUnit83().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit83_Output__oPinEnable() {
        return (EReference)getCtrlUnit83().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit83_Output__oPinExtend() {
        return (EReference)getCtrlUnit83().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit83_Output__oPinRetract() {
        return (EReference)getCtrlUnit83().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit84() {
		if (ctrlUnit84EClass == null) {
			ctrlUnit84EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(99);
		}
		return ctrlUnit84EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit84_Input__iAngleGH1() {
        return (EReference)getCtrlUnit84().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit84_Input__iAngleGH2() {
        return (EReference)getCtrlUnit84().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit84_Input__iAngleGH3() {
        return (EReference)getCtrlUnit84().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit84_Input__iStopCommand() {
        return (EReference)getCtrlUnit84().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit84_Input__iFlBrakes() {
        return (EReference)getCtrlUnit84().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit84_Output__oAngleReference1() {
        return (EReference)getCtrlUnit84().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit84_Output__oAngleReference2() {
        return (EReference)getCtrlUnit84().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit84_Output__oAngleReference3() {
        return (EReference)getCtrlUnit84().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit84_Output__oSpeedReference() {
        return (EReference)getCtrlUnit84().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit84_Output__oAccelerationReference() {
        return (EReference)getCtrlUnit84().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit84_Parameter__pPitchBrakeAngle() {
        return (EReference)getCtrlUnit84().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit84_Parameter__pPitchStdSpeed() {
        return (EReference)getCtrlUnit84().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit84_Parameter__pPitchStdAcceleration() {
        return (EReference)getCtrlUnit84().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit84_Parameter__pPitchRegulationSpeed() {
        return (EReference)getCtrlUnit84().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit84_Parameter__pPitchRegulationAcceleration() {
        return (EReference)getCtrlUnit84().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit84_ErrorReaction__erEmergency() {
        return (EReference)getCtrlUnit84().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit85() {
		if (ctrlUnit85EClass == null) {
			ctrlUnit85EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(100);
		}
		return ctrlUnit85EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit85_Input__iPitchAngle1() {
        return (EReference)getCtrlUnit85().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit85_Input__iPitchAngle2() {
        return (EReference)getCtrlUnit85().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit85_Input__iPitchAngle3() {
        return (EReference)getCtrlUnit85().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit85_Output__oPitchBrakePosition() {
        return (EReference)getCtrlUnit85().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit85_Parameter__pPitchMaxBrakeAngle() {
        return (EReference)getCtrlUnit85().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit85_Parameter__pPitchMinBrakeAngle() {
        return (EReference)getCtrlUnit85().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit85_Parameter__pPitchBrakeAngleHysteresis() {
        return (EReference)getCtrlUnit85().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit86() {
		if (ctrlUnit86EClass == null) {
			ctrlUnit86EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(101);
		}
		return ctrlUnit86EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit86_Input__iPitchHwStandby() {
        return (EReference)getCtrlUnit86().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit86_Input__iPitchHwFault() {
        return (EReference)getCtrlUnit86().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit86_Input__iPitchStopCommand() {
        return (EReference)getCtrlUnit86().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit86_Input__iPitchBrakePosition() {
        return (EReference)getCtrlUnit86().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit86_Output__oBrakes() {
        return (EReference)getCtrlUnit86().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit86_Output__oPitchNormalOrder() {
        return (EReference)getCtrlUnit86().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit86_Output__oPitchEmergencyOrder() {
        return (EReference)getCtrlUnit86().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit86_Output__oPitchTestUCapOrder() {
        return (EReference)getCtrlUnit86().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit86_ErrorReaction__erEmergency() {
        return (EReference)getCtrlUnit86().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit86_ErrorReaction__erSecurityLine() {
        return (EReference)getCtrlUnit86().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit87() {
		if (ctrlUnit87EClass == null) {
			ctrlUnit87EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(102);
		}
		return ctrlUnit87EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit87_Input__iExternalOrder() {
        return (EReference)getCtrlUnit87().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit87_Input__iExternalFailure() {
        return (EReference)getCtrlUnit87().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit87_Output__oLubricationOrder() {
        return (EReference)getCtrlUnit87().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit87_Timer__tDelay() {
        return (EReference)getCtrlUnit87().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit88() {
		if (ctrlUnit88EClass == null) {
			ctrlUnit88EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(103);
		}
		return ctrlUnit88EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit88_Input__iPthResetCommand() {
        return (EReference)getCtrlUnit88().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit88_Input__iPthResetOrder() {
        return (EReference)getCtrlUnit88().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit88_Output__oPthResetCommand() {
        return (EReference)getCtrlUnit88().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit88_Output__oPthResetOrder() {
        return (EReference)getCtrlUnit88().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit88_Output__oPthReset() {
        return (EReference)getCtrlUnit88().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit88_Timer__tResetTimer() {
        return (EReference)getCtrlUnit88().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit88_Timer__tTimeBetweenResets() {
        return (EReference)getCtrlUnit88().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit89() {
		if (ctrlUnit89EClass == null) {
			ctrlUnit89EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(104);
		}
		return ctrlUnit89EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Input__iAngleReference1() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Input__iAngleReference2() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Input__iAngleReference3() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Input__iSpeedReference() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Input__iAccelerationReference() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Input__iPitchManualControl() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Input__iPitchManualAngle() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Input__iMaintenanceStatus() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Input__iGeneratorSpeed() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Input__iPitchBraked() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Output__oPitchAngleRef1() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Output__oPitchAngleRef2() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Output__oPitchAngleRef3() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Output__oPitchSpeedRef() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Output__oPitchAccelerationRef() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Output__oPitchStopCommand() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Parameter__pGeneratorSpeed() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Parameter__pPitchBrakeAngle() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Parameter__pPitchStdSpeed() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Parameter__pPitchStdAcceleration() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Fault__fManualStop() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_Timer__tMaxStopOperationLength() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit89_ErrorReaction__erStop() {
        return (EReference)getCtrlUnit89().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit90() {
		if (ctrlUnit90EClass == null) {
			ctrlUnit90EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(105);
		}
		return ctrlUnit90EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Input__iStatusR() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Input__iStatusS() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Input__iStatusT() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Input__iValueR() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Input__iValueS() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Input__iValueT() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Output__oCosinePhi() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Output__oFrequency() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Output__oControlR() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Output__oControlS() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Output__oControlT() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Output__oApparentPower() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Output__oVoltageR() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Output__oVoltageS() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Output__oVoltageT() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Output__oCurrentR() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Output__oCurrentS() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Output__oCurrentT() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Parameter__pCurrentFactor() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit90_Parameter__pVoltageFactor() {
        return (EReference)getCtrlUnit90().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit91() {
		if (ctrlUnit91EClass == null) {
			ctrlUnit91EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(106);
		}
		return ctrlUnit91EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit91_Input__iTemp() {
        return (EReference)getCtrlUnit91().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit91_Input__iDontCheckInput() {
        return (EReference)getCtrlUnit91().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit91_Input__iLimitError() {
        return (EReference)getCtrlUnit91().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit91_Parameter__pLimitReset() {
        return (EReference)getCtrlUnit91().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit91_Fault__fError() {
        return (EReference)getCtrlUnit91().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit91_Timer__tDelay() {
        return (EReference)getCtrlUnit91().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit91_BhvParam__bpMode() {
        return (EAttribute)getCtrlUnit91().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit92() {
		if (ctrlUnit92EClass == null) {
			ctrlUnit92EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(107);
		}
		return ctrlUnit92EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit92_Input__iTemp() {
        return (EReference)getCtrlUnit92().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit92_Input__iDontCheckInput() {
        return (EReference)getCtrlUnit92().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit92_Parameter__pLimitError() {
        return (EReference)getCtrlUnit92().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit92_Parameter__pLimitReset() {
        return (EReference)getCtrlUnit92().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit92_Fault__fError() {
        return (EReference)getCtrlUnit92().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit92_BhvParam__bpMode() {
        return (EAttribute)getCtrlUnit92().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit93() {
		if (ctrlUnit93EClass == null) {
			ctrlUnit93EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(108);
		}
		return ctrlUnit93EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit93_Input__iActualVal() {
        return (EReference)getCtrlUnit93().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit93_Output__oLastVal() {
        return (EReference)getCtrlUnit93().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit93_Parameter__pRateLimiter() {
        return (EReference)getCtrlUnit93().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit94() {
		if (ctrlUnit94EClass == null) {
			ctrlUnit94EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(109);
		}
		return ctrlUnit94EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit94_Input__iResetOrder() {
        return (EReference)getCtrlUnit94().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit94_Output__oValueToReset() {
        return (EReference)getCtrlUnit94().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit95() {
		if (ctrlUnit95EClass == null) {
			ctrlUnit95EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(110);
		}
		return ctrlUnit95EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit95_Input__iTwistAngle() {
        return (EReference)getCtrlUnit95().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit95_Input__iAccessState() {
        return (EReference)getCtrlUnit95().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit95_Output__oTwistAngleLeftLimit() {
        return (EReference)getCtrlUnit95().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit95_Output__oTwistAngleRightLimit() {
        return (EReference)getCtrlUnit95().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit95_Output__oRetwistPreCommand() {
        return (EReference)getCtrlUnit95().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit95_Fault__fTwistExcessiveCW() {
        return (EReference)getCtrlUnit95().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit95_Fault__fTwistExcessiveCCW() {
        return (EReference)getCtrlUnit95().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit96() {
		if (ctrlUnit96EClass == null) {
			ctrlUnit96EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(111);
		}
		return ctrlUnit96EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit96_Input__iHMIDisableOrder() {
        return (EReference)getCtrlUnit96().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit96_Input__iElementStatus() {
        return (EReference)getCtrlUnit96().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit96_Output__oElementRol() {
        return (EReference)getCtrlUnit96().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit96_Parameter__pMaxElements() {
        return (EReference)getCtrlUnit96().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit97() {
		if (ctrlUnit97EClass == null) {
			ctrlUnit97EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(112);
		}
		return ctrlUnit97EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit97_Input__iSafetyLineGeneralStatus() {
        return (EReference)getCtrlUnit97().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit97_Output__oDontCheckEmergency() {
        return (EReference)getCtrlUnit97().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit97_Fault__fSecLoopOff() {
        return (EReference)getCtrlUnit97().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit98() {
		if (ctrlUnit98EClass == null) {
			ctrlUnit98EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(113);
		}
		return ctrlUnit98EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit98_Input__iSafetyLineStopped() {
        return (EReference)getCtrlUnit98().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit98_Output__oEmergencyRearmCommand() {
        return (EReference)getCtrlUnit98().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit99() {
		if (ctrlUnit99EClass == null) {
			ctrlUnit99EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(114);
		}
		return ctrlUnit99EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit99_Input__iSafetyLineGeneralStatus() {
        return (EReference)getCtrlUnit99().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit99_Output__oSafetyLineStartCommand() {
        return (EReference)getCtrlUnit99().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit100() {
		if (ctrlUnit100EClass == null) {
			ctrlUnit100EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(115);
		}
		return ctrlUnit100EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit100_Input__iPinPosition() {
        return (EReference)getCtrlUnit100().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit100_Output__oPinSafetyCmd() {
        return (EReference)getCtrlUnit100().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit100_Parameter__pPinNoBackPos() {
        return (EReference)getCtrlUnit100().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit100_Parameter__pPinExtendedPos() {
        return (EReference)getCtrlUnit100().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit100_Parameter__pPinRetractedPos() {
        return (EReference)getCtrlUnit100().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit100_Parameter__pPinHysteresis() {
        return (EReference)getCtrlUnit100().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit100_BhvParam__bpMode() {
        return (EAttribute)getCtrlUnit100().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit101() {
		if (ctrlUnit101EClass == null) {
			ctrlUnit101EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(116);
		}
		return ctrlUnit101EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit101_Input__iSpeed() {
        return (EReference)getCtrlUnit101().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit101_Input__iPosition() {
        return (EReference)getCtrlUnit101().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit101_Output__oSpeed() {
        return (EReference)getCtrlUnit101().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit101_Output__oSpeedMonitoring() {
        return (EReference)getCtrlUnit101().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit101_Parameter__pOffset() {
        return (EReference)getCtrlUnit101().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit101_Parameter__pConversionFactor() {
        return (EReference)getCtrlUnit101().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit102() {
		if (ctrlUnit102EClass == null) {
			ctrlUnit102EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(117);
		}
		return ctrlUnit102EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit102_Input__iOriginalStatus() {
        return (EReference)getCtrlUnit102().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit102_Input__iResetRequest() {
        return (EReference)getCtrlUnit102().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit102_Output__oFilteredStatus() {
        return (EReference)getCtrlUnit102().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit102_Fault__fFault() {
        return (EReference)getCtrlUnit102().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit103() {
		if (ctrlUnit103EClass == null) {
			ctrlUnit103EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(118);
		}
		return ctrlUnit103EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit103_Input__iInput1() {
        return (EReference)getCtrlUnit103().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit103_Input__iInput2() {
        return (EReference)getCtrlUnit103().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit103_Output__oResult() {
        return (EReference)getCtrlUnit103().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit104() {
		if (ctrlUnit104EClass == null) {
			ctrlUnit104EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(119);
		}
		return ctrlUnit104EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit104_Input__iOrder() {
        return (EReference)getCtrlUnit104().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit104_Output__oOrder() {
        return (EReference)getCtrlUnit104().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit104_Timer__tTimer() {
        return (EReference)getCtrlUnit104().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit104_Timer__tDelay() {
        return (EReference)getCtrlUnit104().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit105() {
		if (ctrlUnit105EClass == null) {
			ctrlUnit105EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(120);
		}
		return ctrlUnit105EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit105_Input__iEntryToCount() {
        return (EReference)getCtrlUnit105().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit105_Input__iResetPartial() {
        return (EReference)getCtrlUnit105().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit105_Output__oSecondsOnTotal() {
        return (EReference)getCtrlUnit105().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit105_Output__oSecondsOnPartial() {
        return (EReference)getCtrlUnit105().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit106() {
		if (ctrlUnit106EClass == null) {
			ctrlUnit106EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(121);
		}
		return ctrlUnit106EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit106_Input__i1() {
        return (EReference)getCtrlUnit106().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit106_Output__o1() {
        return (EReference)getCtrlUnit106().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit106_Timer__t1() {
        return (EReference)getCtrlUnit106().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit106_Timer__t2() {
        return (EReference)getCtrlUnit106().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit106_BhvParam__bpMode() {
        return (EAttribute)getCtrlUnit106().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit107() {
		if (ctrlUnit107EClass == null) {
			ctrlUnit107EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(122);
		}
		return ctrlUnit107EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit107_Fault__fDLLWarning() {
        return (EReference)getCtrlUnit107().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit107_Fault__fDLLError() {
        return (EReference)getCtrlUnit107().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit108() {
		if (ctrlUnit108EClass == null) {
			ctrlUnit108EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(123);
		}
		return ctrlUnit108EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit108_Input__iVoltageDrop() {
        return (EReference)getCtrlUnit108().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit108_Fault__fVoltageDrop() {
        return (EReference)getCtrlUnit108().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit108_Timer__tAutoReset() {
        return (EReference)getCtrlUnit108().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit109() {
		if (ctrlUnit109EClass == null) {
			ctrlUnit109EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(124);
		}
		return ctrlUnit109EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit109_Input__iInvHwRun() {
        return (EReference)getCtrlUnit109().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit109_Input__iVoltageDrop() {
        return (EReference)getCtrlUnit109().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit109_Input__iTorqueDemand() {
        return (EReference)getCtrlUnit109().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit109_Input__iInvStopOrder() {
        return (EReference)getCtrlUnit109().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit109_Output__oTorqueReference() {
        return (EReference)getCtrlUnit109().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit109_ErrorReaction__erStop() {
        return (EReference)getCtrlUnit109().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit110() {
		if (ctrlUnit110EClass == null) {
			ctrlUnit110EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(125);
		}
		return ctrlUnit110EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit110_Input__iManualStopRequest() {
        return (EReference)getCtrlUnit110().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit110_Input__iRemoteStopRequest() {
        return (EReference)getCtrlUnit110().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit110_Input__iManualStartRequest() {
        return (EReference)getCtrlUnit110().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit110_Input__iRemoteStartRequest() {
        return (EReference)getCtrlUnit110().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit110_Input__iStopped() {
        return (EReference)getCtrlUnit110().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit110_Output__oMachineStopOrder() {
        return (EReference)getCtrlUnit110().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit111() {
		if (ctrlUnit111EClass == null) {
			ctrlUnit111EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(126);
		}
		return ctrlUnit111EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit111_Input__iOrder() {
        return (EReference)getCtrlUnit111().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit111_Timer__tTimer() {
        return (EReference)getCtrlUnit111().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit111_BhvParam__bpMode() {
        return (EAttribute)getCtrlUnit111().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit112() {
		if (ctrlUnit112EClass == null) {
			ctrlUnit112EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(127);
		}
		return ctrlUnit112EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit112_Output__oChangeCmd() {
        return (EReference)getCtrlUnit112().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit112_Output__oPersistentDay() {
        return (EReference)getCtrlUnit112().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit112_Parameter__pDayChange() {
        return (EReference)getCtrlUnit112().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit113() {
		if (ctrlUnit113EClass == null) {
			ctrlUnit113EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(128);
		}
		return ctrlUnit113EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit113_Input__iWindSpeed() {
        return (EReference)getCtrlUnit113().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit113_Input__iWindSpeedAverage() {
        return (EReference)getCtrlUnit113().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit113_Output__oExcessiveWindAcceleration() {
        return (EReference)getCtrlUnit113().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit113_Parameter__pConsideredTime() {
        return (EReference)getCtrlUnit113().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit113_Parameter__pWindAccelerationLimit() {
        return (EReference)getCtrlUnit113().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit113_Parameter__pHiWindLimitReset() {
        return (EReference)getCtrlUnit113().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit113_Parameter__pMaxAbsoluteWindSpeed() {
        return (EReference)getCtrlUnit113().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit114() {
		if (ctrlUnit114EClass == null) {
			ctrlUnit114EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(129);
		}
		return ctrlUnit114EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit114_Input__iWindDirectionRaw() {
        return (EReference)getCtrlUnit114().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit114_Input__iNacelleDirection() {
        return (EReference)getCtrlUnit114().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit114_Output__oWindDirection() {
        return (EReference)getCtrlUnit114().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit114_Output__oWindDirectionAverage() {
        return (EReference)getCtrlUnit114().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit114_Output__oWindDirectionDispAbsolute() {
        return (EReference)getCtrlUnit114().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit114_Output__oWindDirectionDispRelative() {
        return (EReference)getCtrlUnit114().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit114_Parameter__pVaneOffset() {
        return (EReference)getCtrlUnit114().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit115() {
		if (ctrlUnit115EClass == null) {
			ctrlUnit115EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(130);
		}
		return ctrlUnit115EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit115_Input__iWindSpeedRaw() {
        return (EReference)getCtrlUnit115().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit115_Output__oWindSpeed() {
        return (EReference)getCtrlUnit115().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit115_Output__oWindSpeedAverage() {
        return (EReference)getCtrlUnit115().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit115_Parameter__pNacelleSlope() {
        return (EReference)getCtrlUnit115().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit115_Parameter__pNacelleOffset() {
        return (EReference)getCtrlUnit115().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit115_Parameter__pWindSpeedAveragePeriod() {
        return (EReference)getCtrlUnit115().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit116() {
		if (ctrlUnit116EClass == null) {
			ctrlUnit116EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(131);
		}
		return ctrlUnit116EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit116_Input__iInhibitAutoYawCondition() {
        return (EReference)getCtrlUnit116().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit116_Input__iInhibitYawCondition() {
        return (EReference)getCtrlUnit116().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit116_Output__oInhibitAutoYaw() {
        return (EReference)getCtrlUnit116().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit116_Output__oInhibitYaw() {
        return (EReference)getCtrlUnit116().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit116_Output__oYawStatus() {
        return (EReference)getCtrlUnit116().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit117() {
		if (ctrlUnit117EClass == null) {
			ctrlUnit117EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(132);
		}
		return ctrlUnit117EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit117_Input__iYawBrakeCommand() {
        return (EReference)getCtrlUnit117().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit117_Input__iYawElectrobrakeStatus() {
        return (EReference)getCtrlUnit117().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit117_Input__iYawHydraulicbrakeStatus() {
        return (EReference)getCtrlUnit117().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit117_Input__iInhibitYaw() {
        return (EReference)getCtrlUnit117().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit117_Output__oYawBrakeStatus() {
        return (EReference)getCtrlUnit117().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit117_Output__oYawElectrobrakeOrder() {
        return (EReference)getCtrlUnit117().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit117_Output__oYawHydraulicbrakeOrder() {
        return (EReference)getCtrlUnit117().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit117_Output__oBrakesSetProblem() {
        return (EReference)getCtrlUnit117().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit117_Output__oBrakesLiftedProblem() {
        return (EReference)getCtrlUnit117().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit117_Timer__tYawBrakeActionsDelay() {
        return (EReference)getCtrlUnit117().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit118() {
		if (ctrlUnit118EClass == null) {
			ctrlUnit118EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(133);
		}
		return ctrlUnit118EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit118_Input__iYawBrakeStatus() {
        return (EReference)getCtrlUnit118().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit118_Input__iRetwistPreCommand() {
        return (EReference)getCtrlUnit118().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit118_Input__iYawBrakeCommand() {
        return (EReference)getCtrlUnit118().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit118_Output__oYawHydraulicbrake2Order() {
        return (EReference)getCtrlUnit118().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit119() {
		if (ctrlUnit119EClass == null) {
			ctrlUnit119EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(134);
		}
		return ctrlUnit119EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit119_Input__iManualYawBrakePreCommand() {
        return (EReference)getCtrlUnit119().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit119_Input__iAutoYawBrakePreCommand() {
        return (EReference)getCtrlUnit119().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit119_Output__oYawBrakeCommand() {
        return (EReference)getCtrlUnit119().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit120() {
		if (ctrlUnit120EClass == null) {
			ctrlUnit120EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(135);
		}
		return ctrlUnit120EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit120_Input__iYawCwFinalButton() {
        return (EReference)getCtrlUnit120().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit120_Input__iYawCcwFinalButton() {
        return (EReference)getCtrlUnit120().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit120_Output__oManualYawPreCommand() {
        return (EReference)getCtrlUnit120().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit121() {
		if (ctrlUnit121EClass == null) {
			ctrlUnit121EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(136);
		}
		return ctrlUnit121EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit121_Input__iManualYawPreCommand() {
        return (EReference)getCtrlUnit121().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit121_Input__iMaxTwistPreCommand() {
        return (EReference)getCtrlUnit121().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit121_Input__iRetwistPreCommand() {
        return (EReference)getCtrlUnit121().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit121_Input__iRelWindPreCommand() {
        return (EReference)getCtrlUnit121().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit121_Output__oYawCommand() {
        return (EReference)getCtrlUnit121().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit122() {
		if (ctrlUnit122EClass == null) {
			ctrlUnit122EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(137);
		}
		return ctrlUnit122EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit122_Input__iYawCommand() {
        return (EReference)getCtrlUnit122().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit122_Input__iYawBrakeStatus() {
        return (EReference)getCtrlUnit122().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit122_Input__iInhibitYaw() {
        return (EReference)getCtrlUnit122().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit122_Output__oYawStatus() {
        return (EReference)getCtrlUnit122().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit122_Output__oYawBrakeCommand() {
        return (EReference)getCtrlUnit122().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit122_Output__oYawCwOrder() {
        return (EReference)getCtrlUnit122().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit122_Output__oYawCcwOrder() {
        return (EReference)getCtrlUnit122().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit122_Timer__tDelayYawingControl() {
        return (EReference)getCtrlUnit122().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit122_Timer__tDelayYawingToStop() {
        return (EReference)getCtrlUnit122().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit123() {
		if (ctrlUnit123EClass == null) {
			ctrlUnit123EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(138);
		}
		return ctrlUnit123EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit123_Input__iUpperStatus() {
        return (EReference)getCtrlUnit123().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit123_Input__iLowerStatus() {
        return (EReference)getCtrlUnit123().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit123_Output__oBrakeStatus() {
        return (EReference)getCtrlUnit123().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit124() {
		if (ctrlUnit124EClass == null) {
			ctrlUnit124EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(139);
		}
		return ctrlUnit124EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit124_Input__iTorqueVal() {
        return (EReference)getCtrlUnit124().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit124_Input__iRolConverter() {
        return (EReference)getCtrlUnit124().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit124_Output__oTorqueRef() {
        return (EReference)getCtrlUnit124().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit125() {
		if (ctrlUnit125EClass == null) {
			ctrlUnit125EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(140);
		}
		return ctrlUnit125EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit125_Input__iInvRol() {
        return (EReference)getCtrlUnit125().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit125_Output__oSpeedRef() {
        return (EReference)getCtrlUnit125().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit125_Parameter__pSpeed() {
        return (EReference)getCtrlUnit125().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit125_Parameter__pOffset() {
        return (EReference)getCtrlUnit125().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit126() {
		if (ctrlUnit126EClass == null) {
			ctrlUnit126EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(141);
		}
		return ctrlUnit126EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit126_Input__iTorqueVal() {
        return (EReference)getCtrlUnit126().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit126_Input__iInvRol() {
        return (EReference)getCtrlUnit126().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit126_Output__oMaxTorque() {
        return (EReference)getCtrlUnit126().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit126_Output__oMinTorque() {
        return (EReference)getCtrlUnit126().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit126_Parameter__pMaxTorque() {
        return (EReference)getCtrlUnit126().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit126_Parameter__pMinTorque() {
        return (EReference)getCtrlUnit126().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit127() {
		if (ctrlUnit127EClass == null) {
			ctrlUnit127EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(142);
		}
		return ctrlUnit127EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit127_Input__iLowWindActive() {
        return (EReference)getCtrlUnit127().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit127_Input__iWindDirectionRelAvg() {
        return (EReference)getCtrlUnit127().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit127_Input__iTwistAngle() {
        return (EReference)getCtrlUnit127().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit127_Input__iInhibitAutoYaw() {
        return (EReference)getCtrlUnit127().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit127_Output__oRelWindPreCommand() {
        return (EReference)getCtrlUnit127().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit127_Output__oFlagIntoWind() {
        return (EReference)getCtrlUnit127().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit127_Output__oExcessiveYawingTime() {
        return (EReference)getCtrlUnit127().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit127_Parameter__pWindDirectionTolerance() {
        return (EReference)getCtrlUnit127().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit127_Parameter__pYawFilterTime() {
        return (EReference)getCtrlUnit127().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit127_Parameter__pYawStopAngleLimit() {
        return (EReference)getCtrlUnit127().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit127_Timer__tMaximumTimeYawing() {
        return (EReference)getCtrlUnit127().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit128() {
		if (ctrlUnit128EClass == null) {
			ctrlUnit128EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(143);
		}
		return ctrlUnit128EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit128_Input__iYawStatus() {
        return (EReference)getCtrlUnit128().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit128_Input__iTwistAngle() {
        return (EReference)getCtrlUnit128().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit128_Output__oYawMotionProblem() {
        return (EReference)getCtrlUnit128().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit128_Parameter__pDegreesPerSecond() {
        return (EReference)getCtrlUnit128().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit128_Timer__tCheckFrequency() {
        return (EReference)getCtrlUnit128().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit129() {
		if (ctrlUnit129EClass == null) {
			ctrlUnit129EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(144);
		}
		return ctrlUnit129EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit129_Input__iYawStatus() {
        return (EReference)getCtrlUnit129().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit129_Input__iYawCurrent1() {
        return (EReference)getCtrlUnit129().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit129_Input__iYawCurrent2() {
        return (EReference)getCtrlUnit129().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit129_Input__iYawCurrent3() {
        return (EReference)getCtrlUnit129().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit129_Input__iYawCurrent4() {
        return (EReference)getCtrlUnit129().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit129_Parameter__pMinimumTorque() {
        return (EReference)getCtrlUnit129().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit129_Parameter__pTorqueDifferenceLimit() {
        return (EReference)getCtrlUnit129().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit129_Fault__fYawMotor() {
        return (EReference)getCtrlUnit129().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit129_Timer__tTimer() {
        return (EReference)getCtrlUnit129().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit130() {
		if (ctrlUnit130EClass == null) {
			ctrlUnit130EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(145);
		}
		return ctrlUnit130EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit130_Output__oYawBrakeHighPressureCmd() {
        return (EReference)getCtrlUnit130().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit130_Fault__fOverpressure() {
        return (EReference)getCtrlUnit130().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit131() {
		if (ctrlUnit131EClass == null) {
			ctrlUnit131EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(146);
		}
		return ctrlUnit131EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit131_Input__iExcessivePressure() {
        return (EReference)getCtrlUnit131().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit131_Input__iBrakeCommand() {
        return (EReference)getCtrlUnit131().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit131_Fault__fCommError() {
        return (EReference)getCtrlUnit131().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit131_Fault__fFault() {
        return (EReference)getCtrlUnit131().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCtrlUnit131_BhvParam__bpLogicType() {
        return (EAttribute)getCtrlUnit131().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit132() {
		if (ctrlUnit132EClass == null) {
			ctrlUnit132EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(147);
		}
		return ctrlUnit132EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit132_Input__iTeeth1() {
        return (EReference)getCtrlUnit132().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit132_Input__iTeeth2() {
        return (EReference)getCtrlUnit132().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit132_Input__iTwistAngle() {
        return (EReference)getCtrlUnit132().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit132_Output__oTwistAngle() {
        return (EReference)getCtrlUnit132().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit132_Parameter__pDegreesPerPulse() {
        return (EReference)getCtrlUnit132().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCtrlUnit133() {
		if (ctrlUnit133EClass == null) {
			ctrlUnit133EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WTSpecPackage.eNS_URI).getEClassifiers().get(148);
		}
		return ctrlUnit133EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit133_Input__iYawStatus() {
        return (EReference)getCtrlUnit133().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit133_Input__iYawCurrent1() {
        return (EReference)getCtrlUnit133().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit133_Input__iYawCurrent2() {
        return (EReference)getCtrlUnit133().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit133_Input__iYawCurrent3() {
        return (EReference)getCtrlUnit133().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit133_Input__iYawCurrent4() {
        return (EReference)getCtrlUnit133().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit133_Input__iOverloadAlarmCounter() {
        return (EReference)getCtrlUnit133().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit133_Output__oOverloadAlarmCounter() {
        return (EReference)getCtrlUnit133().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit133_Parameter__pMaximumTorque() {
        return (EReference)getCtrlUnit133().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit133_Parameter__pMinimumTorque() {
        return (EReference)getCtrlUnit133().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit133_Parameter__pTorqueDifferenceLimit() {
        return (EReference)getCtrlUnit133().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit133_Fault__fFault() {
        return (EReference)getCtrlUnit133().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCtrlUnit133_Timer__tTimer() {
        return (EReference)getCtrlUnit133().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTSpecFactory getWTSpecFactory() {
		return (WTSpecFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("WTSpec." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //WTSpecPackageImpl
