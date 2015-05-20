package eu.mondo.collaboration.accessprotocol.control;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import eu.mondo.collaboration.accessprotocol.utils.StepAttribute;

public class XACMLHelper {
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

	/**
	 * Generates XACML request object for one action
	 * 
	 * @param user
	 *            User ID
	 * @param targets
	 *            Type of target objects
	 * @param action
	 *            Action name
	 * @param attributes
	 *            Attributes of target object which can be used to identify the
	 *            target objects (ie: ID, class, ...)
	 * @return XACML structure
	 */
	public static String createXACMLRequest(String user, String action,
			String target, List<StepAttribute> attributes) {
		String request = "<Request xmlns=\"urn:oasis:names:tc:xacml:3.0:core:schema:wd-17\" CombinedDecision=\"false\" ReturnPolicyIdList=\"false\">\n";

		request += getUserTemplate(user);
		request += getActionTemplate(action);
		request += getResourcesTemplate(target, attributes);

		request += "</Request>";

		return request;
	}

	/**
	 * Generates XACML request object for view the model
	 * 
	 * @param user
	 *            User ID
	 * @return XACML structure
	 */
	public static String createCheckoutRequest(String user) {
		String request = "<Request xmlns=\"urn:oasis:names:tc:xacml:3.0:core:schema:wd-17\" CombinedDecision=\"false\" ReturnPolicyIdList=\"false\">\n";

		request += getUserTemplate(user);
		request += getActionTemplate("View");
		request += getResourcesTemplate(null, null);

		request += "</Request>";

		return request;
	}

	private static String getResourcesTemplate(String target,
			List<StepAttribute> attributes) {
		String requestAttributes = "<Attributes Category=\"urn:oasis:names:tc:xacml:3.0:attribute-category:resource\">\n";
		String targetValue = "";
		if (target != null) {
			targetValue = target;
		}

		requestAttributes += "<Attribute AttributeId=\"resource-type\" IncludeInResult=\"false\">\n"
				+ "<AttributeValue DataType=\"http://www.w3.org/2001/XMLSchema#string\">"
				+ targetValue + "</AttributeValue>\n" + "</Attribute>\n";

		if (attributes != null && attributes.size() > 0) {
			for (StepAttribute attribute : attributes) {
				requestAttributes += getAttributeTemplate(attribute.getName(),
						attribute.getValue());
			}
		} else {
			requestAttributes += getAttributeTemplate(null, null);
		}

		requestAttributes += "</Attributes>\n";

		return requestAttributes;
	}

	private static String getActionTemplate(String action) {
		String actionValue = "";
		if (action != null) {
			actionValue = action;
		}

		return "<Attributes Category=\"urn:oasis:names:tc:xacml:3.0:attribute-category:action\">\n"
				+ "<Attribute AttributeId=\"urn:oasis:names:tc:xacml:1.0:action:action-id\" IncludeInResult=\"false\">\n"
				+ "<AttributeValue DataType=\"http://www.w3.org/2001/XMLSchema#string\">"
				+ actionValue
				+ "</AttributeValue>\n"
				+ "</Attribute>\n"
				+ "</Attributes>\n";
	}

	private static String getUserTemplate(String user) {
		String userValue = "";
		if (user != null) {
			userValue = user;
		}

		return "<Attributes Category=\"urn:oasis:names:tc:xacml:1.0:subject-category:access-subject\">\n"
				+ "<Attribute AttributeId=\"urn:oasis:names:tc:xacml:1.0:subject:subject-id\" IncludeInResult=\"false\">\n"
				+ "<AttributeValue DataType=\"http://www.w3.org/2001/XMLSchema#string\">"
				+ userValue
				+ "</AttributeValue>\n"
				+ "</Attribute>\n"
				+ "</Attributes>\n";
	}

	private static String getAttributeTemplate(String name, String value) {
		String nameValue = "";
		String valueValue = "";
		if (name != null) {
			nameValue = name;
		}
		if (value != null) {
			valueValue = value;
		}

		String requestAttribute = "<Attribute AttributeId=\"resource-attribute-name\" IncludeInResult=\"false\">\n"
				+ "<AttributeValue DataType=\"http://www.w3.org/2001/XMLSchema#string\">"
				+ nameValue
				+ "</AttributeValue>\n"
				+ "</Attribute>\n"
				+ "<Attribute AttributeId=\"resource-attribute-value\" IncludeInResult=\"false\">\n"
				+ "<AttributeValue DataType=\"http://www.w3.org/2001/XMLSchema#string\">"
				+ valueValue + "</AttributeValue>\n" + "</Attribute>\n";
		return requestAttribute;
	}
}
