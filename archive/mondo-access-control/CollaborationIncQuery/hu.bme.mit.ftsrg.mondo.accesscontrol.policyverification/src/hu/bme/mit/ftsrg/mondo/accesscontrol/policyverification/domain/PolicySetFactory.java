package hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain;

import hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain.common.GlobalEnums.Permission;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain.common.GlobalEnums.Target;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain.common.PolicySet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import com.google.gson.Gson;

public class PolicySetFactory{
	private HashMap<String, ArrayList<PolicySetQuery>> poliySets;
	private Target target;
	private Permission permissionOverride;
	private Permission defaultPermission;
	
	public PolicySetFactory(Target target){
		this.target = target;
		this.poliySets = new HashMap<String, ArrayList<PolicySetQuery>>();
		this.permissionOverride = Permission.DENY;
		this.defaultPermission = Permission.ALLOW;
	}
	public PolicySetFactory(Target target, Permission permissionOverride){
		this.target = target;
		this.poliySets = new HashMap<String, ArrayList<PolicySetQuery>>();
		this.permissionOverride = permissionOverride;
		this.defaultPermission = Permission.ALLOW;
	}
	public PolicySetFactory(Target target, Permission permissionOverride, Permission defaultPermission){
		this.target = target;
		this.poliySets = new HashMap<String, ArrayList<PolicySetQuery>>();
		this.permissionOverride = permissionOverride;
		this.defaultPermission = defaultPermission;
	}
	
	
	/**
	 * A szabályrendszerek gyûjteményét bõvíti a paraméterként átadott szabályrendszerrel
	 * @param policySet
	 */
	protected void addPolicySet(PolicySetQuery policySet){
		String guid = policySet.getGuid();
		ArrayList<PolicySetQuery> tmpList = new ArrayList<PolicySetQuery>();
		if(poliySets.containsKey(guid)){
			tmpList = poliySets.get(guid);
		}
		tmpList.add(policySet);
		poliySets.put(guid, tmpList);
	}
	
	/**
	 * Visszatér egy adott célponthoz tartozó szabályrendszerrel
	 * @param guid
	 * @return
	 */
	public ArrayList<PolicySetQuery> getPolicySet(String guid){
		if(poliySets.containsKey(guid)){
			return poliySets.get(guid);
		} else {
			return new ArrayList<PolicySetQuery>();
		}
	}
	
	/**
	 * JSON forrásfájlból beolvassa a target-nek megfelelõ típusú szabályrendszereket
	 * @param path	Fájl elérési útvonal
	 */
	public void loadDataFromJson(String path){
		Gson gson = new Gson();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(path));
			PolicySet[] policysets = gson.fromJson(reader, PolicySet[].class);
			for (PolicySet policySet : policysets) {
				if(policySet.getTargetType() == this.target){
					addPolicySet(new PolicySetQuery(policySet));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Adott célponthoz tartozó szabályrendszereket értékel ki.
	 * @param engine
	 * @param guid
	 * @return
	 */
	public Permission executeAccessControl(Resource resource, String guid){
		ArrayList<PolicySetQuery> policySets = getPolicySet(guid);
		HashMap<Permission, Boolean> permissionSet = new HashMap<Permission, Boolean>();
		Permission lastPermission = null;
		
		for (PolicySetQuery policySet : policySets) {
			try {
				Permission p = policySet.executePolicyPatterns(resource);
				permissionSet.put(p, true);
				lastPermission = p;
			} catch (IncQueryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(permissionSet.size() > 1){
			Set<Permission> permissions = permissionSet.keySet();
			if(permissions.contains(permissionOverride)){
				return permissionOverride;
			}
			if(permissions.contains(defaultPermission)){
				return defaultPermission;
			}
		} else {
			return lastPermission;
		}
		
		return null;
	}
	
	/**
	 * Beregisztálja az aktuális keresési mintákat
	 */
	public void initPolicyPatterns(Resource resource, String guid){
		ArrayList<PolicySetQuery> policySets = getPolicySet(guid);
		for (PolicySetQuery policySet : policySets) {
			try {
				policySet.initPolicyPatterns(resource);
			} catch (IncQueryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
