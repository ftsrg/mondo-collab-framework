package hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain;

import hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain.common.Policy;
import hu.bme.mit.ftsrg.mondo.accesscontrol.policyverification.domain.common.PolicySet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.incquery.runtime.exception.IncQueryException;

public class PolicySetQuery extends PolicySet {
	private List<PolicyQuery> policies;

	public PolicySetQuery(PolicySet policySet) {
		super(policySet);
		this.policies = new ArrayList<PolicyQuery>();
		for (Policy policy : policySet.getPolicies()) {
			policies.add(new PolicyQuery(policy));
		}
	}

	public PolicySetQuery(Target targetType, String guid,
			List<PolicyQuery> policies) {
		super(targetType, guid, null);
		this.policies = policies;
	}

	public PolicySetQuery(Target targetType, String guid,
			List<PolicyQuery> policies, Permission permissionOverride,
			Permission defaultPermission) {
		super(targetType, guid, null, permissionOverride, defaultPermission);
		this.policies = policies;
	}

	public List<PolicyQuery> getPolicyQueries() {
		return policies;
	}

	/**
	 * Kiértékel egy szabályrendszert és visszatér a kiértékelt jogosultsággal.
	 * Az elsõ szabályütközés detektálása esetén viiszatér.
	 * 
	 * @param engine
	 * @return GlobalEnums.Permission | null
	 * @throws IncQueryException
	 */
	public Permission executePolicyPatterns(Resource resource)
			throws IncQueryException {
		return executePolicySet(resource, false);
	}

	/**
	 * Lefuttatja az összes lekérdezést, ezzel inicializálja azokat és
	 * beregisztrálja a változások nyomokövetésére.
	 * 
	 * @param resource
	 * @throws IncQueryException
	 */
	public void initPolicyPatterns(Resource resource) throws IncQueryException {
		executePolicySet(resource, true);
	}

	private Permission executePolicySet(Resource resource,
			boolean initialization) throws IncQueryException {
		boolean permissionDiff = false;
		Permission executedPolicies = null;
		boolean matchFound = false;
		Iterator<PolicyQuery> policyIterator = policies.iterator();
		// A szabálygyûjtemény kiértékelése addig, amíg eltérést nem
		// tapasztalható az alapértelmezett jogosultsággal
		while ((initialization == true || permissionDiff == false)
				&& policyIterator.hasNext()) {
			PolicyQuery policy = (PolicyQuery) policyIterator.next();
			boolean policyMatchFound = policy.executeQueryOnPattern(resource,
					initialization);
			if (initialization == false && policyMatchFound) {
				matchFound = true;
				if (policy.getPermission() != defaultPermission) {
					permissionDiff = true;
					if (policy.getPermission() != executedPolicies) {
						executedPolicies = policy.getPermission();
					}
				}
			}
		}
		if (matchFound) {
			if (permissionDiff == true) {
				// Szabálygyûjteményben található tiltás és engedélyezés is
				// A jogosultság felülíró tulajdonsá dönti el a jogosultás
				// kezelést
				return permissionOverride;
			} else {
				// Szabálygyûjtemény nem mutat eltérést az alapértelmezett
				// jogosultságtól
				return defaultPermission;
			}
		} else {
			// Nincs találat egy szabálynál sem
			return null;
		}
	}
}
