// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceErrorHandlingConfig {
    /**
     * @return The Amazon S3 bucket name where the source files are stored.
     * 
     */
    private final @Nullable String bucketName;
    /**
     * @return The object key for the Amazon S3 bucket in which the source files are stored.
     * 
     */
    private final @Nullable String bucketPrefix;
    /**
     * @return Specifies if the flow should fail after the first instance of a failure when attempting to place data in the destination.
     * 
     */
    private final @Nullable Boolean failOnFirstDestinationError;

    @CustomType.Constructor
    private FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceErrorHandlingConfig(
        @CustomType.Parameter("bucketName") @Nullable String bucketName,
        @CustomType.Parameter("bucketPrefix") @Nullable String bucketPrefix,
        @CustomType.Parameter("failOnFirstDestinationError") @Nullable Boolean failOnFirstDestinationError) {
        this.bucketName = bucketName;
        this.bucketPrefix = bucketPrefix;
        this.failOnFirstDestinationError = failOnFirstDestinationError;
    }

    /**
     * @return The Amazon S3 bucket name where the source files are stored.
     * 
     */
    public Optional<String> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }
    /**
     * @return The object key for the Amazon S3 bucket in which the source files are stored.
     * 
     */
    public Optional<String> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }
    /**
     * @return Specifies if the flow should fail after the first instance of a failure when attempting to place data in the destination.
     * 
     */
    public Optional<Boolean> failOnFirstDestinationError() {
        return Optional.ofNullable(this.failOnFirstDestinationError);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceErrorHandlingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bucketName;
        private @Nullable String bucketPrefix;
        private @Nullable Boolean failOnFirstDestinationError;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceErrorHandlingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.failOnFirstDestinationError = defaults.failOnFirstDestinationError;
        }

        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }
        public Builder failOnFirstDestinationError(@Nullable Boolean failOnFirstDestinationError) {
            this.failOnFirstDestinationError = failOnFirstDestinationError;
            return this;
        }        public FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceErrorHandlingConfig build() {
            return new FlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceErrorHandlingConfig(bucketName, bucketPrefix, failOnFirstDestinationError);
        }
    }
}