// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.inputs;

import com.pulumi.aws.appflow.inputs.FlowTriggerConfigTriggerPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowTriggerConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowTriggerConfigArgs Empty = new FlowTriggerConfigArgs();

    /**
     * Specifies the configuration details of a schedule-triggered flow as defined by the user. Currently, these settings only apply to the `Scheduled` trigger type. See Scheduled Trigger Properties for details.
     * 
     */
    @Import(name="triggerProperties")
    private @Nullable Output<FlowTriggerConfigTriggerPropertiesArgs> triggerProperties;

    /**
     * @return Specifies the configuration details of a schedule-triggered flow as defined by the user. Currently, these settings only apply to the `Scheduled` trigger type. See Scheduled Trigger Properties for details.
     * 
     */
    public Optional<Output<FlowTriggerConfigTriggerPropertiesArgs>> triggerProperties() {
        return Optional.ofNullable(this.triggerProperties);
    }

    /**
     * Specifies the type of flow trigger. Valid values are `Scheduled`, `Event`, and `OnDemand`.
     * 
     */
    @Import(name="triggerType", required=true)
    private Output<String> triggerType;

    /**
     * @return Specifies the type of flow trigger. Valid values are `Scheduled`, `Event`, and `OnDemand`.
     * 
     */
    public Output<String> triggerType() {
        return this.triggerType;
    }

    private FlowTriggerConfigArgs() {}

    private FlowTriggerConfigArgs(FlowTriggerConfigArgs $) {
        this.triggerProperties = $.triggerProperties;
        this.triggerType = $.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowTriggerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowTriggerConfigArgs $;

        public Builder() {
            $ = new FlowTriggerConfigArgs();
        }

        public Builder(FlowTriggerConfigArgs defaults) {
            $ = new FlowTriggerConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param triggerProperties Specifies the configuration details of a schedule-triggered flow as defined by the user. Currently, these settings only apply to the `Scheduled` trigger type. See Scheduled Trigger Properties for details.
         * 
         * @return builder
         * 
         */
        public Builder triggerProperties(@Nullable Output<FlowTriggerConfigTriggerPropertiesArgs> triggerProperties) {
            $.triggerProperties = triggerProperties;
            return this;
        }

        /**
         * @param triggerProperties Specifies the configuration details of a schedule-triggered flow as defined by the user. Currently, these settings only apply to the `Scheduled` trigger type. See Scheduled Trigger Properties for details.
         * 
         * @return builder
         * 
         */
        public Builder triggerProperties(FlowTriggerConfigTriggerPropertiesArgs triggerProperties) {
            return triggerProperties(Output.of(triggerProperties));
        }

        /**
         * @param triggerType Specifies the type of flow trigger. Valid values are `Scheduled`, `Event`, and `OnDemand`.
         * 
         * @return builder
         * 
         */
        public Builder triggerType(Output<String> triggerType) {
            $.triggerType = triggerType;
            return this;
        }

        /**
         * @param triggerType Specifies the type of flow trigger. Valid values are `Scheduled`, `Event`, and `OnDemand`.
         * 
         * @return builder
         * 
         */
        public Builder triggerType(String triggerType) {
            return triggerType(Output.of(triggerType));
        }

        public FlowTriggerConfigArgs build() {
            $.triggerType = Objects.requireNonNull($.triggerType, "expected parameter 'triggerType' to be non-null");
            return $;
        }
    }

}
