// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretVersionState extends com.pulumi.resources.ResourceArgs {

    public static final SecretVersionState Empty = new SecretVersionState();

    /**
     * The ARN of the secret.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the secret.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
     * 
     */
    @Import(name="secretBinary")
    private @Nullable Output<String> secretBinary;

    /**
     * @return Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
     * 
     */
    public Optional<Output<String>> secretBinary() {
        return Optional.ofNullable(this.secretBinary);
    }

    /**
     * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     * 
     */
    @Import(name="secretId")
    private @Nullable Output<String> secretId;

    /**
     * @return Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     * 
     */
    public Optional<Output<String>> secretId() {
        return Optional.ofNullable(this.secretId);
    }

    /**
     * Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
     * 
     */
    @Import(name="secretString")
    private @Nullable Output<String> secretString;

    /**
     * @return Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
     * 
     */
    public Optional<Output<String>> secretString() {
        return Optional.ofNullable(this.secretString);
    }

    /**
     * The unique identifier of the version of the secret.
     * 
     */
    @Import(name="versionId")
    private @Nullable Output<String> versionId;

    /**
     * @return The unique identifier of the version of the secret.
     * 
     */
    public Optional<Output<String>> versionId() {
        return Optional.ofNullable(this.versionId);
    }

    /**
     * Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that&#39;s already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
     * 
     */
    @Import(name="versionStages")
    private @Nullable Output<List<String>> versionStages;

    /**
     * @return Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that&#39;s already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
     * 
     */
    public Optional<Output<List<String>>> versionStages() {
        return Optional.ofNullable(this.versionStages);
    }

    private SecretVersionState() {}

    private SecretVersionState(SecretVersionState $) {
        this.arn = $.arn;
        this.secretBinary = $.secretBinary;
        this.secretId = $.secretId;
        this.secretString = $.secretString;
        this.versionId = $.versionId;
        this.versionStages = $.versionStages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretVersionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretVersionState $;

        public Builder() {
            $ = new SecretVersionState();
        }

        public Builder(SecretVersionState defaults) {
            $ = new SecretVersionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the secret.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the secret.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param secretBinary Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
         * 
         * @return builder
         * 
         */
        public Builder secretBinary(@Nullable Output<String> secretBinary) {
            $.secretBinary = secretBinary;
            return this;
        }

        /**
         * @param secretBinary Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
         * 
         * @return builder
         * 
         */
        public Builder secretBinary(String secretBinary) {
            return secretBinary(Output.of(secretBinary));
        }

        /**
         * @param secretId Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
         * 
         * @return builder
         * 
         */
        public Builder secretId(@Nullable Output<String> secretId) {
            $.secretId = secretId;
            return this;
        }

        /**
         * @param secretId Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
         * 
         * @return builder
         * 
         */
        public Builder secretId(String secretId) {
            return secretId(Output.of(secretId));
        }

        /**
         * @param secretString Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
         * 
         * @return builder
         * 
         */
        public Builder secretString(@Nullable Output<String> secretString) {
            $.secretString = secretString;
            return this;
        }

        /**
         * @param secretString Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
         * 
         * @return builder
         * 
         */
        public Builder secretString(String secretString) {
            return secretString(Output.of(secretString));
        }

        /**
         * @param versionId The unique identifier of the version of the secret.
         * 
         * @return builder
         * 
         */
        public Builder versionId(@Nullable Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        /**
         * @param versionId The unique identifier of the version of the secret.
         * 
         * @return builder
         * 
         */
        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        /**
         * @param versionStages Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that&#39;s already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
         * 
         * @return builder
         * 
         */
        public Builder versionStages(@Nullable Output<List<String>> versionStages) {
            $.versionStages = versionStages;
            return this;
        }

        /**
         * @param versionStages Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that&#39;s already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
         * 
         * @return builder
         * 
         */
        public Builder versionStages(List<String> versionStages) {
            return versionStages(Output.of(versionStages));
        }

        /**
         * @param versionStages Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that&#39;s already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
         * 
         * @return builder
         * 
         */
        public Builder versionStages(String... versionStages) {
            return versionStages(List.of(versionStages));
        }

        public SecretVersionState build() {
            return $;
        }
    }

}