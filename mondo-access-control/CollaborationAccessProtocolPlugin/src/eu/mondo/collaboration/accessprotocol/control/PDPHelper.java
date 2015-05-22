package eu.mondo.collaboration.accessprotocol.control;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.wso2.balana.Balana;
import org.wso2.balana.PDP;
import org.wso2.balana.PDPConfig;
import org.wso2.balana.finder.AttributeFinder;
import org.wso2.balana.finder.AttributeFinderModule;
import org.wso2.balana.finder.impl.FileBasedPolicyFinderModule;

public class PDPHelper {
	private static Balana pdp;
	
	/**
	 * Initialize the static pdp instance
	 */
	public static void initPDP() {
		try {
			String policyLocation = (new File(".")).getCanonicalPath()
					+ File.separator + "resources";
			System.setProperty(FileBasedPolicyFinderModule.POLICY_DIR_PROPERTY,
					policyLocation);
		} catch (IOException e) {
			System.err.println("Can not locate policy repository");
		} catch (Exception e) {
			System.err.println(e.getStackTrace());
		}
		pdp = Balana.getInstance();
	}

	/**
	 * Returns a new PDP instance with new XACML policies
	 *
	 * @return a PDP instance
	 */
	public static PDP getPDPNewInstance() {

		PDPConfig pdpConfig = pdp.getPdpConfig();

		AttributeFinder attributeFinder = pdpConfig.getAttributeFinder();
		List<AttributeFinderModule> finderModules = attributeFinder
				.getModules();
		finderModules.add(new RoleAttributeFinderModule());
		attributeFinder.setModules(finderModules);

		return new PDP(new PDPConfig(attributeFinder,
				pdpConfig.getPolicyFinder(), null, true));
	}
}
