package hu.bme.mit.ftsrg.xacml.access_control;

import hu.bme.mit.ftsrg.xacml.access_control.action.Add;
import hu.bme.mit.ftsrg.xacml.access_control.action.Command;
import hu.bme.mit.ftsrg.xacml.access_control.profiles.User;
import hu.bme.mit.ftsrg.xacml.access_control.profiles.UserDataBase;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.wso2.balana.Balana;
import org.wso2.balana.PDP;
import org.wso2.balana.PDPConfig;
import org.wso2.balana.ParsingException;
import org.wso2.balana.ctx.AbstractResult;
import org.wso2.balana.ctx.AttributeAssignment;
import org.wso2.balana.ctx.ResponseCtx;
import org.wso2.balana.finder.AttributeFinder;
import org.wso2.balana.finder.AttributeFinderModule;
import org.wso2.balana.finder.impl.FileBasedPolicyFinderModule;
import org.wso2.balana.xacml3.Advice;

public class Main {

	private static Balana balana;
	private static boolean debug;

	public static void main(String[] args) {

		debug = false;
		initBalana();

		//Alice parancsai
		User user = UserDataBase.getUser("alice");
		
		ArrayList<Command> queue = new ArrayList<Command>();
		queue.add(new Add(user, "wtc"));
		queue.add(new Add(user, "WTCOutput"));
		queue.add(new Add(user, "WTCInput"));
		
		
		
		boolean commitSuccess = commit(queue);
		System.out.println("========================");
		if(commitSuccess){
			System.out.println("COMMIT SUCCESS!");
		} else {
			System.out.println("COMMIT DENIED!");
		}
		System.out.println("");
		
		
		//Bob parancsai
		User user2 = UserDataBase.getUser("bob");
		
		ArrayList<Command> queue2 = new ArrayList<Command>();
		queue2.add(new Add(user2, "wtc"));
		queue2.add(new Add(user2, "WTCOutput"));
		queue2.add(new Add(user2, "WTCInput"));
		
		
		
		boolean commitSuccess2 = commit(queue2);
		System.out.println("========================");
		if(commitSuccess2){
			System.out.println("COMMIT SUCCESS!");
		} else {
			System.out.println("COMMIT DENIED!");
		}

	}
	
	public static boolean commit(ArrayList<Command> commandQueue){
		boolean success = false;
		
		if(commandQueue != null){
			for(Command c : commandQueue){
				System.out.println(c);
				boolean access = checkAccess(c.getUserName(), c.getObject(), c.getAction());
				if(access == false){
					return false;
				} else {
					success = access;
				}
			}
		}
		
		return success;
	}

	public static boolean checkAccess(String userName, String object, String action) {
		boolean access = false;

		String request = createXACMLRequest(userName, object, action);
		PDP pdp = getPDPNewInstance();
		String response = pdp.evaluate(request);

		if (debug) {
			System.out
					.println("\n======================== XACML Request ====================");
			System.out.println(request);
			System.out
					.println("===========================================================");

			System.out
					.println("\n======================== XACML Response ===================");
			System.out.println(response);
			System.out
					.println("===========================================================");
		}

		try {
			ResponseCtx responseCtx = ResponseCtx
					.getInstance(getXacmlResponse(response));
			AbstractResult result = responseCtx.getResults().iterator().next();
			if (AbstractResult.DECISION_PERMIT == result.getDecision()) {
				access = true;

				if (debug) {
					System.out.println("\n" + userName
							+ " is authorized to perform this action\n\n");
				}
			} else {
				if (debug) {
					System.out.println("\n" + userName
							+ " is NOT authorized to perform this action\n");
					List<Advice> advices = result.getAdvices();
					for (Advice advice : advices) {
						List<AttributeAssignment> assignments = advice
								.getAssignments();
						for (AttributeAssignment assignment : assignments) {
							System.out.println("Advice :  "
									+ assignment.getContent() + "\n\n");
						}
					}
				}
			}
		} catch (ParsingException e) {
			e.printStackTrace();
		}

		return access;

	}

	private static void initBalana() {

		try {
			// using file based policy repository. so set the policy location as
			// system property
			String policyLocation = (new File(".")).getCanonicalPath()
					+ File.separator + "resources";
			System.setProperty(FileBasedPolicyFinderModule.POLICY_DIR_PROPERTY,
					policyLocation);
		} catch (IOException e) {
			System.err.println("Can not locate policy repository");
		}
		// create default instance of Balana
		balana = Balana.getInstance();
	}

	/**
	 * Returns a new PDP instance with new XACML policies
	 *
	 * @return a PDP instance
	 */
	private static PDP getPDPNewInstance() {

		PDPConfig pdpConfig = balana.getPdpConfig();

		// registering new attribute finder. so default PDPConfig is needed to
		// change
		AttributeFinder attributeFinder = pdpConfig.getAttributeFinder();
		List<AttributeFinderModule> finderModules = attributeFinder
				.getModules();
		finderModules.add(new SampleAttributeFinderModule());
		attributeFinder.setModules(finderModules);

		return new PDP(new PDPConfig(attributeFinder,
				pdpConfig.getPolicyFinder(), null, true));
	}

	/**
	 * Creates DOM representation of the XACML request
	 *
	 * @param response
	 *            XACML request as a String object
	 * @return XACML request as a DOM element
	 */
	public static Element getXacmlResponse(String response) {

		ByteArrayInputStream inputStream;
		DocumentBuilderFactory dbf;
		Document doc;

		inputStream = new ByteArrayInputStream(response.getBytes());
		dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);

		try {
			doc = dbf.newDocumentBuilder().parse(inputStream);
		} catch (Exception e) {
			System.err
					.println("DOM of request element can not be created from String");
			return null;
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				System.err
						.println("Error in closing input stream of XACML response");
			}
		}
		return doc.getDocumentElement();
	}

	public static String createXACMLRequest(String userName, String resource,
			String action) {

		return "<Request xmlns=\"urn:oasis:names:tc:xacml:3.0:core:schema:wd-17\" CombinedDecision=\"false\" ReturnPolicyIdList=\"false\">\n"
				+ "<Attributes Category=\"urn:oasis:names:tc:xacml:3.0:attribute-category:action\">\n"
				+ "<Attribute AttributeId=\"actionId\" IncludeInResult=\"false\">\n"
				+ "<AttributeValue DataType=\"http://www.w3.org/2001/XMLSchema#string\">"
				+ action
				+ "</AttributeValue>\n"
				+ "</Attribute>\n"
				+ "</Attributes>\n"
				+ "<Attributes Category=\"urn:oasis:names:tc:xacml:1.0:subject-category:access-subject\">\n"
				+ "<Attribute AttributeId=\"urn:oasis:names:tc:xacml:1.0:subject:subject-id\" IncludeInResult=\"false\">\n"
				+ "<AttributeValue DataType=\"http://www.w3.org/2001/XMLSchema#string\">"
				+ userName
				+ "</AttributeValue>\n"
				+ "</Attribute>\n"
				+ "</Attributes>\n"
				+ "<Attributes Category=\"urn:oasis:names:tc:xacml:3.0:attribute-category:resource\">\n"
				+ "<Attribute AttributeId=\"resource-type\" IncludeInResult=\"false\">\n"
				+ "<AttributeValue DataType=\"http://www.w3.org/2001/XMLSchema#string\">"
				+ resource
				+ "</AttributeValue>\n"
				+ "</Attribute>\n"
				+ "</Attributes>\n" + "</Request>";

	}

}
