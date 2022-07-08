// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupWarmPoolInstanceReusePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupWarmPoolInstanceReusePolicyArgs Empty = new GroupWarmPoolInstanceReusePolicyArgs();

    /**
     * Specifies whether instances in the Auto Scaling group can be returned to the warm pool on scale in.
     * 
     */
    @Import(name="reuseOnScaleIn")
    private @Nullable Output<Boolean> reuseOnScaleIn;

    /**
     * @return Specifies whether instances in the Auto Scaling group can be returned to the warm pool on scale in.
     * 
     */
    public Optional<Output<Boolean>> reuseOnScaleIn() {
        return Optional.ofNullable(this.reuseOnScaleIn);
    }

    private GroupWarmPoolInstanceReusePolicyArgs() {}

    private GroupWarmPoolInstanceReusePolicyArgs(GroupWarmPoolInstanceReusePolicyArgs $) {
        this.reuseOnScaleIn = $.reuseOnScaleIn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupWarmPoolInstanceReusePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupWarmPoolInstanceReusePolicyArgs $;

        public Builder() {
            $ = new GroupWarmPoolInstanceReusePolicyArgs();
        }

        public Builder(GroupWarmPoolInstanceReusePolicyArgs defaults) {
            $ = new GroupWarmPoolInstanceReusePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param reuseOnScaleIn Specifies whether instances in the Auto Scaling group can be returned to the warm pool on scale in.
         * 
         * @return builder
         * 
         */
        public Builder reuseOnScaleIn(@Nullable Output<Boolean> reuseOnScaleIn) {
            $.reuseOnScaleIn = reuseOnScaleIn;
            return this;
        }

        /**
         * @param reuseOnScaleIn Specifies whether instances in the Auto Scaling group can be returned to the warm pool on scale in.
         * 
         * @return builder
         * 
         */
        public Builder reuseOnScaleIn(Boolean reuseOnScaleIn) {
            return reuseOnScaleIn(Output.of(reuseOnScaleIn));
        }

        public GroupWarmPoolInstanceReusePolicyArgs build() {
            return $;
        }
    }

}