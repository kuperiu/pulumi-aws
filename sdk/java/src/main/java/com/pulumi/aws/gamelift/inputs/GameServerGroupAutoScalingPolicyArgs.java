// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.gamelift.inputs;

import com.pulumi.aws.gamelift.inputs.GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GameServerGroupAutoScalingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GameServerGroupAutoScalingPolicyArgs Empty = new GameServerGroupAutoScalingPolicyArgs();

    /**
     * Length of time, in seconds, it takes for a new instance to start
     * new game server processes and register with GameLift FleetIQ.
     * Specifying a warm-up time can be useful, particularly with game servers that take a long time to start up,
     * because it avoids prematurely starting new instances. Defaults to `60`.
     * 
     */
    @Import(name="estimatedInstanceWarmup")
    private @Nullable Output<Integer> estimatedInstanceWarmup;

    /**
     * @return Length of time, in seconds, it takes for a new instance to start
     * new game server processes and register with GameLift FleetIQ.
     * Specifying a warm-up time can be useful, particularly with game servers that take a long time to start up,
     * because it avoids prematurely starting new instances. Defaults to `60`.
     * 
     */
    public Optional<Output<Integer>> estimatedInstanceWarmup() {
        return Optional.ofNullable(this.estimatedInstanceWarmup);
    }

    @Import(name="targetTrackingConfiguration", required=true)
    private Output<GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs> targetTrackingConfiguration;

    public Output<GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs> targetTrackingConfiguration() {
        return this.targetTrackingConfiguration;
    }

    private GameServerGroupAutoScalingPolicyArgs() {}

    private GameServerGroupAutoScalingPolicyArgs(GameServerGroupAutoScalingPolicyArgs $) {
        this.estimatedInstanceWarmup = $.estimatedInstanceWarmup;
        this.targetTrackingConfiguration = $.targetTrackingConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GameServerGroupAutoScalingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GameServerGroupAutoScalingPolicyArgs $;

        public Builder() {
            $ = new GameServerGroupAutoScalingPolicyArgs();
        }

        public Builder(GameServerGroupAutoScalingPolicyArgs defaults) {
            $ = new GameServerGroupAutoScalingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param estimatedInstanceWarmup Length of time, in seconds, it takes for a new instance to start
         * new game server processes and register with GameLift FleetIQ.
         * Specifying a warm-up time can be useful, particularly with game servers that take a long time to start up,
         * because it avoids prematurely starting new instances. Defaults to `60`.
         * 
         * @return builder
         * 
         */
        public Builder estimatedInstanceWarmup(@Nullable Output<Integer> estimatedInstanceWarmup) {
            $.estimatedInstanceWarmup = estimatedInstanceWarmup;
            return this;
        }

        /**
         * @param estimatedInstanceWarmup Length of time, in seconds, it takes for a new instance to start
         * new game server processes and register with GameLift FleetIQ.
         * Specifying a warm-up time can be useful, particularly with game servers that take a long time to start up,
         * because it avoids prematurely starting new instances. Defaults to `60`.
         * 
         * @return builder
         * 
         */
        public Builder estimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
            return estimatedInstanceWarmup(Output.of(estimatedInstanceWarmup));
        }

        public Builder targetTrackingConfiguration(Output<GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs> targetTrackingConfiguration) {
            $.targetTrackingConfiguration = targetTrackingConfiguration;
            return this;
        }

        public Builder targetTrackingConfiguration(GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs targetTrackingConfiguration) {
            return targetTrackingConfiguration(Output.of(targetTrackingConfiguration));
        }

        public GameServerGroupAutoScalingPolicyArgs build() {
            $.targetTrackingConfiguration = Objects.requireNonNull($.targetTrackingConfiguration, "expected parameter 'targetTrackingConfiguration' to be non-null");
            return $;
        }
    }

}