// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleStatementOrStatementStatementNotStatement {
    /**
     * @return The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    private final List<RuleGroupRuleStatementOrStatementStatementNotStatementStatement> statements;

    @CustomType.Constructor
    private RuleGroupRuleStatementOrStatementStatementNotStatement(@CustomType.Parameter("statements") List<RuleGroupRuleStatementOrStatementStatementNotStatementStatement> statements) {
        this.statements = statements;
    }

    /**
     * @return The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    public List<RuleGroupRuleStatementOrStatementStatementNotStatementStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementNotStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupRuleStatementOrStatementStatementNotStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementNotStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(List<RuleGroupRuleStatementOrStatementStatementNotStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(RuleGroupRuleStatementOrStatementStatementNotStatementStatement... statements) {
            return statements(List.of(statements));
        }        public RuleGroupRuleStatementOrStatementStatementNotStatement build() {
            return new RuleGroupRuleStatementOrStatementStatementNotStatement(statements);
        }
    }
}