// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudformation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class StackSetInstanceDeploymentTargets {
    private final @Nullable List<String> organizationalUnitIds;

    @CustomType.Constructor
    private StackSetInstanceDeploymentTargets(@CustomType.Parameter("organizationalUnitIds") @Nullable List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
    }

    public List<String> organizationalUnitIds() {
        return this.organizationalUnitIds == null ? List.of() : this.organizationalUnitIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetInstanceDeploymentTargets defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> organizationalUnitIds;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetInstanceDeploymentTargets defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.organizationalUnitIds = defaults.organizationalUnitIds;
        }

        public Builder organizationalUnitIds(@Nullable List<String> organizationalUnitIds) {
            this.organizationalUnitIds = organizationalUnitIds;
            return this;
        }
        public Builder organizationalUnitIds(String... organizationalUnitIds) {
            return organizationalUnitIds(List.of(organizationalUnitIds));
        }        public StackSetInstanceDeploymentTargets build() {
            return new StackSetInstanceDeploymentTargets(organizationalUnitIds);
        }
    }
}