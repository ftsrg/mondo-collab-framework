package org.mondo.collaboration.security.lens.arbiter;

import java.util.List;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.Rule;
import org.mondo.collaboration.security.macl.xtext.rule.mACLRule.RuleType;

public class DenyOverridesResolution implements SecurityArbiter.RuleConflictResolver {

	public DenyOverridesResolution(List<Rule> rules) {
		super();
	}

	@Override
	public int compare(SecurityRuleJudgement arg0, SecurityRuleJudgement arg1) {

		if (arg0.getRule().getContraint().getType() == RuleType.DENY) {
			return -1;
		}
		return 1;
	}

}