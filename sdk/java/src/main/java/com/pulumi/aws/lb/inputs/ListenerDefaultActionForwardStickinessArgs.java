// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerDefaultActionForwardStickinessArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionForwardStickinessArgs Empty = new ListenerDefaultActionForwardStickinessArgs();

    /**
     * Time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
     * 
     */
    @Import(name="duration", required=true)
    private Output<Integer> duration;

    /**
     * @return Time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
     * 
     */
    public Output<Integer> duration() {
        return this.duration;
    }

    /**
     * Whether target group stickiness is enabled. Default is `false`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether target group stickiness is enabled. Default is `false`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ListenerDefaultActionForwardStickinessArgs() {}

    private ListenerDefaultActionForwardStickinessArgs(ListenerDefaultActionForwardStickinessArgs $) {
        this.duration = $.duration;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerDefaultActionForwardStickinessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerDefaultActionForwardStickinessArgs $;

        public Builder() {
            $ = new ListenerDefaultActionForwardStickinessArgs();
        }

        public Builder(ListenerDefaultActionForwardStickinessArgs defaults) {
            $ = new ListenerDefaultActionForwardStickinessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param duration Time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
         * 
         * @return builder
         * 
         */
        public Builder duration(Output<Integer> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration Time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
         * 
         * @return builder
         * 
         */
        public Builder duration(Integer duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param enabled Whether target group stickiness is enabled. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether target group stickiness is enabled. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ListenerDefaultActionForwardStickinessArgs build() {
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            return $;
        }
    }

}