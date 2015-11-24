package org.mondo.collaboration.security.lens.arbiter;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.mondo.collaboration.security.lens.arbiter.Asset.AttributeAsset;
import org.mondo.collaboration.security.lens.arbiter.Asset.ObjectAsset;
import org.mondo.collaboration.security.lens.arbiter.Asset.ReferenceAsset;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter.OperationKind;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.MACLRuleFactory;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.Role;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.Rule;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.RuleConstraint;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.RuleRights;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.RuleType;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class PermitOverridesResolution implements SecurityArbiter.RuleConflictResolver {

	private static final String DUMMY_RULE_NAME = "newRule";
	private Map<Rule, Integer> ruleToIndex = new HashMap<Rule, Integer>();
	private SecurityArbiter arbiter;
	
	private Table<Role, Asset, TreeSet<SecurityRuleJudgement>> newJudgements = HashBasedTable.create();
	
	public Table<Role, Asset, TreeSet<SecurityRuleJudgement>> getNewJudgements() {
		return newJudgements;
	}

	public SecurityArbiter getArbiter() {
		return arbiter;
	}

	public void setArbiter(SecurityArbiter arbiter) {
		this.arbiter = arbiter;
	}

	private EnumMap<OperationKind, Table<Role, Asset, TreeSet<SecurityRuleJudgement>>> currentRights = new EnumMap<>(
			OperationKind.class);

	public PermitOverridesResolution(List<Rule> rules) {
		super();

		int index = 0;
		for (Rule rule : rules) {
			ruleToIndex.put(rule, index++);
		}
	}

	public EnumMap<OperationKind, Table<Role, Asset, TreeSet<SecurityRuleJudgement>>> getCurrentRights() {
		return currentRights;
	}

	public void setCurrentRights(
			EnumMap<OperationKind, Table<Role, Asset, TreeSet<SecurityRuleJudgement>>> currentRights) {
		this.currentRights = currentRights;
	}
	
	public void process(SecurityRuleJudgement oldJudgement, OperationKind op) {
			
			if (oldJudgement.getAsset() instanceof ObjectAsset) {
				ObjectAsset objectAsset = (ObjectAsset) oldJudgement.getAsset();
				Table<Role, Asset, TreeSet<SecurityRuleJudgement>> allTableJudgements = getCurrentRights().get(op);
				EList<Role> roles = oldJudgement.getRule().getRoles();
				
				for (Role role : roles) {
					Map<Asset, TreeSet<SecurityRuleJudgement>> roleJudgements = allTableJudgements.row(role);
					processObjectAsset(op, role, roleJudgements, objectAsset, oldJudgement);
				}
			}
			if (oldJudgement.getAsset() instanceof AttributeAsset) {
				AttributeAsset attributeAsset = (AttributeAsset) oldJudgement.getAsset();
				Table<Role, Asset, TreeSet<SecurityRuleJudgement>> allTableJudgements = getCurrentRights().get(op);
				EList<Role> roles = oldJudgement.getRule().getRoles();
				
				for (Role role : roles) {
					Map<Asset, TreeSet<SecurityRuleJudgement>> roleJudgements = allTableJudgements.row(role);
					processAttributeAsset(op, role, roleJudgements, attributeAsset, oldJudgement);
				}
			}
			if (oldJudgement.getAsset() instanceof ReferenceAsset) {
				ReferenceAsset referenceAsset = (ReferenceAsset) oldJudgement.getAsset();
				Table<Role, Asset, TreeSet<SecurityRuleJudgement>> allTableJudgements = getCurrentRights().get(op);
				EList<Role> roles = oldJudgement.getRule().getRoles();
				
				for (Role role : roles) {
					Map<Asset, TreeSet<SecurityRuleJudgement>> roleJudgements = allTableJudgements.row(role);
					processReferenceAsset(op, role, roleJudgements, referenceAsset, oldJudgement);
				}
			}
	}
	
	private void processReferenceAsset(OperationKind op, Role role, Map<Asset, TreeSet<SecurityRuleJudgement>> roleJudgements, ReferenceAsset referenceAsset, SecurityRuleJudgement objectJudgement) {
		RuleType referenceRuleType = objectJudgement.getRule().getContraint().getType();
	//	RuleRights referenceRuleRigth = objectJudgement.getRule().getContraint().getRights(); TODO RuleRigths.READ helyére
		Set<Asset> assets = roleJudgements.keySet();
		for (Asset asset : assets) {
			if(asset instanceof ObjectAsset) {
				ObjectAsset objectAsset = (ObjectAsset) asset;
				if(referenceAsset.getSource() == objectAsset.getObject() || referenceAsset.getTarget() == objectAsset.getObject() ) {
					SecurityRuleJudgement objectJugdement = roleJudgements.get(objectAsset).first();
					RuleType objectRuleType = objectJugdement.getRule().getContraint().getType();
					if(objectRuleType == RuleType.DENY && referenceRuleType == RuleType.PERMIT) {
						SecurityRuleJudgement newJudgement = createDummyJudgement(objectAsset, null, RuleRights.READ, RuleType.PERMIT, role);
						arbiter.updateJudgement(op, role, objectAsset, newJudgement, true);
					}
				}
			}
		}
	}

	private void processAttributeAsset(OperationKind op, Role role, Map<Asset, TreeSet<SecurityRuleJudgement>> roleJudgements, AttributeAsset attributeAsset, SecurityRuleJudgement objectJudgement) {
		RuleType attributeRuleType = objectJudgement.getRule().getContraint().getType();

		Set<Asset> assets = roleJudgements.keySet();
		for (Asset asset : assets) {
			if(asset instanceof ObjectAsset) {
				ObjectAsset objectAsset = (ObjectAsset) asset;
				if(attributeAsset.getSource() == objectAsset.getObject()) {
					SecurityRuleJudgement objectJugdement = roleJudgements.get(objectAsset).first();
					RuleType objectRuleType = objectJugdement.getRule().getContraint().getType();
					if(objectRuleType == RuleType.DENY && attributeRuleType == RuleType.PERMIT) {
						SecurityRuleJudgement newJudgement = createDummyJudgement(objectAsset, null, RuleRights.READ, RuleType.PERMIT, role);
						arbiter.updateJudgement(op, role, objectAsset, newJudgement, true);
					}
				}
			}
		}
	}
	
	private void processObjectAsset(OperationKind op, Role role, Map<Asset, TreeSet<SecurityRuleJudgement>> roleJudgements, ObjectAsset objectAsset, SecurityRuleJudgement objectJudgement) {
		RuleType objectType = objectJudgement.getRule().getContraint().getType();

		Set<Asset> assets = roleJudgements.keySet();
		for (Asset asset : assets) {
			if(asset instanceof AttributeAsset) {
				AttributeAsset attributeAsset = (AttributeAsset) asset;
				if(attributeAsset.getSource() == objectAsset.getObject()) {
					SecurityRuleJudgement attributeJugdement = roleJudgements.get(attributeAsset).first();
					RuleType attributeRuleType = attributeJugdement.getRule().getContraint().getType();
					/*if(attributeRuleType == RuleType.DENY && objectType == RuleType.PERMIT) {
						SecurityRuleJudgement newJudgement = createDummyJudgement(attributeAsset, null, RuleRights.READ, RuleType.PERMIT, role);
						arbiter.updateJudgement(op, role, attributeAsset, newJudgement, true);
					}*/
					if(attributeRuleType == RuleType.PERMIT && objectType == RuleType.DENY) {
						SecurityRuleJudgement newJudgement = createDummyJudgement(objectAsset, null, RuleRights.READ, RuleType.PERMIT, role);
						arbiter.updateJudgement(op, role, objectAsset, newJudgement, true);
					}
				}
			}
			else if (asset instanceof ReferenceAsset) {
				ReferenceAsset referenceAsset = (ReferenceAsset) asset;
				if(referenceAsset.getSource() == objectAsset.getObject() || referenceAsset.getTarget() == objectAsset.getObject()) {
					SecurityRuleJudgement referenceJugdement = roleJudgements.get(referenceAsset).first();
					RuleType referenceRuleType = referenceJugdement.getRule().getContraint().getType();
					/*if(referenceRuleType == RuleType.DENY && objectType == RuleType.PERMIT) {
						SecurityRuleJudgement newJudgement = createDummyJudgement(referenceAsset, null, RuleRights.READ, RuleType.PERMIT, role);
						arbiter.updateJudgement(op, role, referenceAsset, newJudgement, true);
					}*/
					if(referenceRuleType == RuleType.PERMIT && objectType == RuleType.DENY) {
						SecurityRuleJudgement newJudgement = createDummyJudgement(objectAsset, null, RuleRights.READ, RuleType.PERMIT, role);
						arbiter.updateJudgement(op, role, objectAsset, newJudgement, true);
					}
				}				
			}
		}
	}

	private SecurityRuleJudgement createDummyJudgement(Asset asset, IPatternMatch justification, RuleRights right, RuleType type, Role role) {
		RuleConstraint rc = MACLRuleFactory.eINSTANCE.createRuleConstraint();
		rc.setRights(right);
		rc.setType(type); 
		Rule newRule = MACLRuleFactory.eINSTANCE.createRule();
		newRule.setContraint(rc);
		newRule.setName(DUMMY_RULE_NAME);
		newRule.setPattern(null);
		SecurityRuleJudgement newJudgement = new SecurityRuleJudgement(newRule,	asset, justification);
		
		if (newJudgements.contains(role, asset)){
		TreeSet<SecurityRuleJudgement> judgements =  newJudgements.get(role, asset);
		judgements.add(newJudgement);
		}
	
		else{
			TreeSet<SecurityRuleJudgement> judgements =  new TreeSet<SecurityRuleJudgement>(this);
			judgements.add(newJudgement);
			newJudgements.put(role, asset, judgements);
		}
		return newJudgement;
	}

	@Override
	public int compare(SecurityRuleJudgement arg0, SecurityRuleJudgement arg1) {
		System.out.println(arg0.getRule().getName());
		System.out.println(arg1.getRule().getName());
		System.out.println("\n");

		System.out.println(ruleToIndex.size());

		RuleRights ruleRights0 = arg0.getRule().getContraint().getRights();
		OperationKind op0 = "READ".equals(ruleRights0.getName().toUpperCase()) ? OperationKind.READ
				: OperationKind.WRITE;
		// RuleRights ruleRights1 = arg1.getRule().getContraint().getRights();
		// OperationKind op1 =
		// "READ".equals(ruleRights1.getName().toUpperCase()) ?
		// OperationKind.READ
		// : OperationKind.WRITE;

		if(arg0.getRule().getName().equals(DUMMY_RULE_NAME) && arg1.getRule().getName().equals(DUMMY_RULE_NAME)) {
			return 0;
		}

		if(arg0.getRule().getName().equals(DUMMY_RULE_NAME) && !arg1.getRule().getName().equals(DUMMY_RULE_NAME)) {
			return -1;
		}
		
		if(!arg0.getRule().getName().equals(DUMMY_RULE_NAME) && arg1.getRule().getName().equals(DUMMY_RULE_NAME)) {
			return 1;
		}

		if(arg0.equals(arg1)) {
			process(arg0, op0);
			return 0;
		}
		
		process(arg0, op0);
		process(arg1, op0);

		if (arg0.getRule().getContraint().getType() == RuleType.PERMIT) {
			return -1;
		}
		return 1;
	}
}
