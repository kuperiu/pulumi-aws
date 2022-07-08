// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.outputs;

import com.pulumi.aws.ssm.outputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig;
import com.pulumi.aws.ssm.outputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig;
import com.pulumi.aws.ssm.outputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters {
    /**
     * @return Configuration options for sending command output to CloudWatch Logs. Documented below.
     * 
     */
    private final @Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig cloudwatchConfig;
    /**
     * @return Information about the command(s) to execute.
     * 
     */
    private final @Nullable String comment;
    /**
     * @return The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
     * 
     */
    private final @Nullable String documentHash;
    /**
     * @return SHA-256 or SHA-1. SHA-1 hashes have been deprecated. Valid values: `Sha256` and `Sha1`
     * 
     */
    private final @Nullable String documentHashType;
    /**
     * @return The version of an Automation document to use during task execution.
     * 
     */
    private final @Nullable String documentVersion;
    /**
     * @return Configurations for sending notifications about command status changes on a per-instance basis. Documented below.
     * 
     */
    private final @Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig notificationConfig;
    /**
     * @return The name of the Amazon S3 bucket.
     * 
     */
    private final @Nullable String outputS3Bucket;
    /**
     * @return The Amazon S3 bucket subfolder.
     * 
     */
    private final @Nullable String outputS3KeyPrefix;
    /**
     * @return The parameters for the RUN_COMMAND task execution. Documented below.
     * 
     */
    private final @Nullable List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter> parameters;
    /**
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance window Run Command tasks.
     * 
     */
    private final @Nullable String serviceRoleArn;
    /**
     * @return If this time is reached and the command has not already started executing, it doesn&#39;t run.
     * 
     */
    private final @Nullable Integer timeoutSeconds;

    @CustomType.Constructor
    private MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters(
        @CustomType.Parameter("cloudwatchConfig") @Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig cloudwatchConfig,
        @CustomType.Parameter("comment") @Nullable String comment,
        @CustomType.Parameter("documentHash") @Nullable String documentHash,
        @CustomType.Parameter("documentHashType") @Nullable String documentHashType,
        @CustomType.Parameter("documentVersion") @Nullable String documentVersion,
        @CustomType.Parameter("notificationConfig") @Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig notificationConfig,
        @CustomType.Parameter("outputS3Bucket") @Nullable String outputS3Bucket,
        @CustomType.Parameter("outputS3KeyPrefix") @Nullable String outputS3KeyPrefix,
        @CustomType.Parameter("parameters") @Nullable List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter> parameters,
        @CustomType.Parameter("serviceRoleArn") @Nullable String serviceRoleArn,
        @CustomType.Parameter("timeoutSeconds") @Nullable Integer timeoutSeconds) {
        this.cloudwatchConfig = cloudwatchConfig;
        this.comment = comment;
        this.documentHash = documentHash;
        this.documentHashType = documentHashType;
        this.documentVersion = documentVersion;
        this.notificationConfig = notificationConfig;
        this.outputS3Bucket = outputS3Bucket;
        this.outputS3KeyPrefix = outputS3KeyPrefix;
        this.parameters = parameters;
        this.serviceRoleArn = serviceRoleArn;
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * @return Configuration options for sending command output to CloudWatch Logs. Documented below.
     * 
     */
    public Optional<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig> cloudwatchConfig() {
        return Optional.ofNullable(this.cloudwatchConfig);
    }
    /**
     * @return Information about the command(s) to execute.
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * @return The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
     * 
     */
    public Optional<String> documentHash() {
        return Optional.ofNullable(this.documentHash);
    }
    /**
     * @return SHA-256 or SHA-1. SHA-1 hashes have been deprecated. Valid values: `Sha256` and `Sha1`
     * 
     */
    public Optional<String> documentHashType() {
        return Optional.ofNullable(this.documentHashType);
    }
    /**
     * @return The version of an Automation document to use during task execution.
     * 
     */
    public Optional<String> documentVersion() {
        return Optional.ofNullable(this.documentVersion);
    }
    /**
     * @return Configurations for sending notifications about command status changes on a per-instance basis. Documented below.
     * 
     */
    public Optional<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig> notificationConfig() {
        return Optional.ofNullable(this.notificationConfig);
    }
    /**
     * @return The name of the Amazon S3 bucket.
     * 
     */
    public Optional<String> outputS3Bucket() {
        return Optional.ofNullable(this.outputS3Bucket);
    }
    /**
     * @return The Amazon S3 bucket subfolder.
     * 
     */
    public Optional<String> outputS3KeyPrefix() {
        return Optional.ofNullable(this.outputS3KeyPrefix);
    }
    /**
     * @return The parameters for the RUN_COMMAND task execution. Documented below.
     * 
     */
    public List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) service role to use to publish Amazon Simple Notification Service (Amazon SNS) notifications for maintenance window Run Command tasks.
     * 
     */
    public Optional<String> serviceRoleArn() {
        return Optional.ofNullable(this.serviceRoleArn);
    }
    /**
     * @return If this time is reached and the command has not already started executing, it doesn&#39;t run.
     * 
     */
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig cloudwatchConfig;
        private @Nullable String comment;
        private @Nullable String documentHash;
        private @Nullable String documentHashType;
        private @Nullable String documentVersion;
        private @Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig notificationConfig;
        private @Nullable String outputS3Bucket;
        private @Nullable String outputS3KeyPrefix;
        private @Nullable List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter> parameters;
        private @Nullable String serviceRoleArn;
        private @Nullable Integer timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchConfig = defaults.cloudwatchConfig;
    	      this.comment = defaults.comment;
    	      this.documentHash = defaults.documentHash;
    	      this.documentHashType = defaults.documentHashType;
    	      this.documentVersion = defaults.documentVersion;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.outputS3Bucket = defaults.outputS3Bucket;
    	      this.outputS3KeyPrefix = defaults.outputS3KeyPrefix;
    	      this.parameters = defaults.parameters;
    	      this.serviceRoleArn = defaults.serviceRoleArn;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder cloudwatchConfig(@Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersCloudwatchConfig cloudwatchConfig) {
            this.cloudwatchConfig = cloudwatchConfig;
            return this;
        }
        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }
        public Builder documentHash(@Nullable String documentHash) {
            this.documentHash = documentHash;
            return this;
        }
        public Builder documentHashType(@Nullable String documentHashType) {
            this.documentHashType = documentHashType;
            return this;
        }
        public Builder documentVersion(@Nullable String documentVersion) {
            this.documentVersion = documentVersion;
            return this;
        }
        public Builder notificationConfig(@Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersNotificationConfig notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }
        public Builder outputS3Bucket(@Nullable String outputS3Bucket) {
            this.outputS3Bucket = outputS3Bucket;
            return this;
        }
        public Builder outputS3KeyPrefix(@Nullable String outputS3KeyPrefix) {
            this.outputS3KeyPrefix = outputS3KeyPrefix;
            return this;
        }
        public Builder parameters(@Nullable List<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersParameter... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder serviceRoleArn(@Nullable String serviceRoleArn) {
            this.serviceRoleArn = serviceRoleArn;
            return this;
        }
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }        public MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters build() {
            return new MaintenanceWindowTaskTaskInvocationParametersRunCommandParameters(cloudwatchConfig, comment, documentHash, documentHashType, documentVersion, notificationConfig, outputS3Bucket, outputS3KeyPrefix, parameters, serviceRoleArn, timeoutSeconds);
        }
    }
}