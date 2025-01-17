// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupWarmPoolInstanceReusePolicy {
    /**
     * @return Specifies whether instances in the Auto Scaling group can be returned to the warm pool on scale in.
     * 
     */
    private @Nullable Boolean reuseOnScaleIn;

    private GroupWarmPoolInstanceReusePolicy() {}
    /**
     * @return Specifies whether instances in the Auto Scaling group can be returned to the warm pool on scale in.
     * 
     */
    public Optional<Boolean> reuseOnScaleIn() {
        return Optional.ofNullable(this.reuseOnScaleIn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupWarmPoolInstanceReusePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean reuseOnScaleIn;
        public Builder() {}
        public Builder(GroupWarmPoolInstanceReusePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reuseOnScaleIn = defaults.reuseOnScaleIn;
        }

        @CustomType.Setter
        public Builder reuseOnScaleIn(@Nullable Boolean reuseOnScaleIn) {
            this.reuseOnScaleIn = reuseOnScaleIn;
            return this;
        }
        public GroupWarmPoolInstanceReusePolicy build() {
            final var o = new GroupWarmPoolInstanceReusePolicy();
            o.reuseOnScaleIn = reuseOnScaleIn;
            return o;
        }
    }
}
