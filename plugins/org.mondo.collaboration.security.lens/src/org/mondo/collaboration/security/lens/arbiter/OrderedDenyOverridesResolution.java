package org.mondo.collaboration.security.lens.arbiter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.Rule;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.RuleType;

public class OrderedDenyOverridesResolution implements SecurityArbiter.RuleConflictResolver {

	private Map<Rule, Integer> ruleToIndex = new HashMap<Rule, Integer>();

	public OrderedDenyOverridesResolution(List<Rule> rules) {
		super();

		int index = 0;
		for (Rule rule : rules) {
			ruleToIndex.put(rule, index++);
		}
	}

	@Override
	public int compare(SecurityRuleJudgement arg0, SecurityRuleJudgement arg1) {
		if (arg0.getRule().getContraint().getType() == RuleType.DENY && getIndex(arg0) > getIndex(arg1)) {
			return -1;
		}
		if (arg0.getRule().getContraint().getType() == RuleType.PERMIT && getIndex(arg0) > getIndex(arg1)) {
			return -1;
		}
		return 1;
	}

	public Integer getIndex(SecurityRuleJudgement arg0) {
		return ruleToIndex.get(arg0.getRule());
	}

}