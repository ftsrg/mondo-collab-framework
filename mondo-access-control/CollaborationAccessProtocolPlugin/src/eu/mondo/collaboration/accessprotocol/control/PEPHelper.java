package eu.mondo.collaboration.accessprotocol.control;

import java.util.ArrayList;
import java.util.List;

import org.wso2.balana.PDP;
import org.wso2.balana.ParsingException;
import org.wso2.balana.ctx.AbstractResult;
import org.wso2.balana.ctx.ResponseCtx;

import eu.mondo.collaboration.accessprotocol.utils.StepAttribute;
import eu.mondo.collaboration.accessprotocol.utils.StepByUser;

public class PEPHelper {
	private static boolean debug = true;
	
	public static boolean checkPermissionForSteps(
			ArrayList<StepByUser> commandQueue) {
		boolean success = false;

		if (commandQueue != null) {
			for (StepByUser c : commandQueue) {
				boolean access = checkAccess(c.getUserId(), c.getAction(),
						c.getTarget(), c.getAttributes());
				if (access == false) {
					return false;
				} else {
					success = access;
				}
			}
		}

		return success;
	}

	public static boolean checkAccess(String userName, String action,
			String target, List<StepAttribute> attributes) {
		boolean access = false;

		String request = XACMLHelper.createXACMLRequest(userName, action, target,
				attributes);
		
		access = checkAccessByRequest(request);

		return access;

	}
	
	public static boolean checkAccessByRequest(String request){
		boolean access = false;
		
		PDP pdp = PDPHelper.getPDPNewInstance();

		String response = pdp.evaluate(request);

		if (debug) {
			System.out
					.println("XACML Response:");
			System.out.println(response);
		}

		try {
			ResponseCtx responseCtx = ResponseCtx
					.getInstance(XACMLHelper.getXacmlResponse(response));
			AbstractResult result = responseCtx.getResults().iterator().next();
			if (AbstractResult.DECISION_PERMIT == result.getDecision()) {
				access = true;
			}
		} catch (ParsingException e) {
			e.printStackTrace();
		}

		return access;
	}
}
