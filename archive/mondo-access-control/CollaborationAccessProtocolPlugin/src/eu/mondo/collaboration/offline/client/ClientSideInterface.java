package eu.mondo.collaboration.offline.client;

import java.util.ArrayList;

import eu.mondo.collaboration.accessprotocol.control.PEPHelper;
import eu.mondo.collaboration.accessprotocol.utils.StepByUser;

public class ClientSideInterface {
	public static boolean commit(ArrayList<StepByUser> stepQueue){
		boolean permission = PEPHelper.checkPermissionForSteps(stepQueue);
		if(permission){
			//calling commit API from MONDO Collab serverside 
			return permission;
		} else {
			//Permission denied
			return permission;
		}
	}
	
	public static boolean checkout(String request){
		boolean permission = PEPHelper.checkAccessByRequest(request);
		if(permission){
			//calling checkout API from MONDO Collab serverside 
			return permission;
		} else {
			//Permission denied
			return permission;
		}
	}
}
