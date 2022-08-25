// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.accessanalyzer.inputs;

import com.pulumi.aws.accessanalyzer.inputs.ArchiveRuleFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ArchiveRuleState extends com.pulumi.resources.ResourceArgs {

    public static final ArchiveRuleState Empty = new ArchiveRuleState();

    /**
     * Analyzer name.
     * 
     */
    @Import(name="analyzerName")
    private @Nullable Output<String> analyzerName;

    /**
     * @return Analyzer name.
     * 
     */
    public Optional<Output<String>> analyzerName() {
        return Optional.ofNullable(this.analyzerName);
    }

    /**
     * The filter criteria for the archive rule. See Filter for more details.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<ArchiveRuleFilterArgs>> filters;

    /**
     * @return The filter criteria for the archive rule. See Filter for more details.
     * 
     */
    public Optional<Output<List<ArchiveRuleFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Rule name.
     * 
     */
    @Import(name="ruleName")
    private @Nullable Output<String> ruleName;

    /**
     * @return Rule name.
     * 
     */
    public Optional<Output<String>> ruleName() {
        return Optional.ofNullable(this.ruleName);
    }

    private ArchiveRuleState() {}

    private ArchiveRuleState(ArchiveRuleState $) {
        this.analyzerName = $.analyzerName;
        this.filters = $.filters;
        this.ruleName = $.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArchiveRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArchiveRuleState $;

        public Builder() {
            $ = new ArchiveRuleState();
        }

        public Builder(ArchiveRuleState defaults) {
            $ = new ArchiveRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param analyzerName Analyzer name.
         * 
         * @return builder
         * 
         */
        public Builder analyzerName(@Nullable Output<String> analyzerName) {
            $.analyzerName = analyzerName;
            return this;
        }

        /**
         * @param analyzerName Analyzer name.
         * 
         * @return builder
         * 
         */
        public Builder analyzerName(String analyzerName) {
            return analyzerName(Output.of(analyzerName));
        }

        /**
         * @param filters The filter criteria for the archive rule. See Filter for more details.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<ArchiveRuleFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters The filter criteria for the archive rule. See Filter for more details.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<ArchiveRuleFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters The filter criteria for the archive rule. See Filter for more details.
         * 
         * @return builder
         * 
         */
        public Builder filters(ArchiveRuleFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param ruleName Rule name.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(@Nullable Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        /**
         * @param ruleName Rule name.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
        }

        public ArchiveRuleState build() {
            return $;
        }
    }

}