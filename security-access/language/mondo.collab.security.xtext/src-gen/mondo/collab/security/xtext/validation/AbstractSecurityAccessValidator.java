/*
 * generated by Xtext
 */
package mondo.collab.security.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractSecurityAccessValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(mondo.collab.security.xtext.securityAccess.SecurityAccessPackage.eINSTANCE);
		return result;
	}
}
