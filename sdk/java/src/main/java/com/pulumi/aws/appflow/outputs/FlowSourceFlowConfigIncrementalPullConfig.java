// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowSourceFlowConfigIncrementalPullConfig {
    /**
     * @return A field that specifies the date time or timestamp field as the criteria to use when importing incremental records from the source.
     * 
     */
    private final @Nullable String datetimeTypeFieldName;

    @CustomType.Constructor
    private FlowSourceFlowConfigIncrementalPullConfig(@CustomType.Parameter("datetimeTypeFieldName") @Nullable String datetimeTypeFieldName) {
        this.datetimeTypeFieldName = datetimeTypeFieldName;
    }

    /**
     * @return A field that specifies the date time or timestamp field as the criteria to use when importing incremental records from the source.
     * 
     */
    public Optional<String> datetimeTypeFieldName() {
        return Optional.ofNullable(this.datetimeTypeFieldName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSourceFlowConfigIncrementalPullConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datetimeTypeFieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSourceFlowConfigIncrementalPullConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datetimeTypeFieldName = defaults.datetimeTypeFieldName;
        }

        public Builder datetimeTypeFieldName(@Nullable String datetimeTypeFieldName) {
            this.datetimeTypeFieldName = datetimeTypeFieldName;
            return this;
        }        public FlowSourceFlowConfigIncrementalPullConfig build() {
            return new FlowSourceFlowConfigIncrementalPullConfig(datetimeTypeFieldName);
        }
    }
}