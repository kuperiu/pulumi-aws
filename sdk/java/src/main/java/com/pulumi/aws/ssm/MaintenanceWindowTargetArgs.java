// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm;

import com.pulumi.aws.ssm.inputs.MaintenanceWindowTargetTargetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MaintenanceWindowTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTargetArgs Empty = new MaintenanceWindowTargetArgs();

    /**
     * The description of the maintenance window target.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the maintenance window target.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the maintenance window target.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the maintenance window target.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
     * 
     */
    @Import(name="ownerInformation")
    private @Nullable Output<String> ownerInformation;

    /**
     * @return User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
     * 
     */
    public Optional<Output<String>> ownerInformation() {
        return Optional.ofNullable(this.ownerInformation);
    }

    /**
     * The type of target being registered with the Maintenance Window. Possible values are `INSTANCE` and `RESOURCE_GROUP`.
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    /**
     * @return The type of target being registered with the Maintenance Window. Possible values are `INSTANCE` and `RESOURCE_GROUP`.
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }

    /**
     * The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances. For more information about these examples formats see
     * (https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html)
     * 
     */
    @Import(name="targets", required=true)
    private Output<List<MaintenanceWindowTargetTargetArgs>> targets;

    /**
     * @return The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances. For more information about these examples formats see
     * (https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html)
     * 
     */
    public Output<List<MaintenanceWindowTargetTargetArgs>> targets() {
        return this.targets;
    }

    /**
     * The Id of the maintenance window to register the target with.
     * 
     */
    @Import(name="windowId", required=true)
    private Output<String> windowId;

    /**
     * @return The Id of the maintenance window to register the target with.
     * 
     */
    public Output<String> windowId() {
        return this.windowId;
    }

    private MaintenanceWindowTargetArgs() {}

    private MaintenanceWindowTargetArgs(MaintenanceWindowTargetArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.ownerInformation = $.ownerInformation;
        this.resourceType = $.resourceType;
        this.targets = $.targets;
        this.windowId = $.windowId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceWindowTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceWindowTargetArgs $;

        public Builder() {
            $ = new MaintenanceWindowTargetArgs();
        }

        public Builder(MaintenanceWindowTargetArgs defaults) {
            $ = new MaintenanceWindowTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the maintenance window target.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the maintenance window target.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the maintenance window target.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the maintenance window target.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ownerInformation User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
         * 
         * @return builder
         * 
         */
        public Builder ownerInformation(@Nullable Output<String> ownerInformation) {
            $.ownerInformation = ownerInformation;
            return this;
        }

        /**
         * @param ownerInformation User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this Maintenance Window.
         * 
         * @return builder
         * 
         */
        public Builder ownerInformation(String ownerInformation) {
            return ownerInformation(Output.of(ownerInformation));
        }

        /**
         * @param resourceType The type of target being registered with the Maintenance Window. Possible values are `INSTANCE` and `RESOURCE_GROUP`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The type of target being registered with the Maintenance Window. Possible values are `INSTANCE` and `RESOURCE_GROUP`.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param targets The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances. For more information about these examples formats see
         * (https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html)
         * 
         * @return builder
         * 
         */
        public Builder targets(Output<List<MaintenanceWindowTargetTargetArgs>> targets) {
            $.targets = targets;
            return this;
        }

        /**
         * @param targets The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances. For more information about these examples formats see
         * (https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html)
         * 
         * @return builder
         * 
         */
        public Builder targets(List<MaintenanceWindowTargetTargetArgs> targets) {
            return targets(Output.of(targets));
        }

        /**
         * @param targets The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances. For more information about these examples formats see
         * (https://docs.aws.amazon.com/systems-manager/latest/userguide/mw-cli-tutorial-targets-examples.html)
         * 
         * @return builder
         * 
         */
        public Builder targets(MaintenanceWindowTargetTargetArgs... targets) {
            return targets(List.of(targets));
        }

        /**
         * @param windowId The Id of the maintenance window to register the target with.
         * 
         * @return builder
         * 
         */
        public Builder windowId(Output<String> windowId) {
            $.windowId = windowId;
            return this;
        }

        /**
         * @param windowId The Id of the maintenance window to register the target with.
         * 
         * @return builder
         * 
         */
        public Builder windowId(String windowId) {
            return windowId(Output.of(windowId));
        }

        public MaintenanceWindowTargetArgs build() {
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            $.targets = Objects.requireNonNull($.targets, "expected parameter 'targets' to be non-null");
            $.windowId = Objects.requireNonNull($.windowId, "expected parameter 'windowId' to be non-null");
            return $;
        }
    }

}
