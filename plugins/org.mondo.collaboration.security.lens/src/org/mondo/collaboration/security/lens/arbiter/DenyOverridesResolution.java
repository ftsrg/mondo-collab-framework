package org.mondo.collaboration.security.lens.arbiter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.Rule;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.RuleType;

public class DenyOverridesResolution implements SecurityArbiter.RuleConflictResolver {

	private Map<Rule, Integer> ruleToIndex = new HashMap<Rule, Integer>();

	public DenyOverridesResolution(List<Rule> rules) {
		super();
		
		int index = 0;
		for (Rule rule : rules) {
			ruleToIndex.put(rule, index++);
		}
	}

	@Override
	public int compare(SecurityRuleJudgement arg0, SecurityRuleJudgement arg1) {
		System.out.println(arg0.getRule().getName());
		System.out.println(arg1.getRule().getName());
		System.out.println("\n");
		 if(arg0.getRule().getContraint().getType() == RuleType.DENY ){
			 return -1;
		 }
		 return 1;
	}


}