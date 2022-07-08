// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleDynamodb {
    /**
     * @return The hash key name.
     * 
     */
    private final String hashKeyField;
    /**
     * @return The hash key type. Valid values are &#34;STRING&#34; or &#34;NUMBER&#34;.
     * 
     */
    private final @Nullable String hashKeyType;
    /**
     * @return The hash key value.
     * 
     */
    private final String hashKeyValue;
    /**
     * @return The operation. Valid values are &#34;INSERT&#34;, &#34;UPDATE&#34;, or &#34;DELETE&#34;.
     * 
     */
    private final @Nullable String operation;
    /**
     * @return The action payload.
     * 
     */
    private final @Nullable String payloadField;
    /**
     * @return The range key name.
     * 
     */
    private final @Nullable String rangeKeyField;
    /**
     * @return The range key type. Valid values are &#34;STRING&#34; or &#34;NUMBER&#34;.
     * 
     */
    private final @Nullable String rangeKeyType;
    /**
     * @return The range key value.
     * 
     */
    private final @Nullable String rangeKeyValue;
    /**
     * @return The ARN of the IAM role that grants access to the DynamoDB table.
     * 
     */
    private final String roleArn;
    /**
     * @return The name of the DynamoDB table.
     * 
     */
    private final String tableName;

    @CustomType.Constructor
    private TopicRuleDynamodb(
        @CustomType.Parameter("hashKeyField") String hashKeyField,
        @CustomType.Parameter("hashKeyType") @Nullable String hashKeyType,
        @CustomType.Parameter("hashKeyValue") String hashKeyValue,
        @CustomType.Parameter("operation") @Nullable String operation,
        @CustomType.Parameter("payloadField") @Nullable String payloadField,
        @CustomType.Parameter("rangeKeyField") @Nullable String rangeKeyField,
        @CustomType.Parameter("rangeKeyType") @Nullable String rangeKeyType,
        @CustomType.Parameter("rangeKeyValue") @Nullable String rangeKeyValue,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("tableName") String tableName) {
        this.hashKeyField = hashKeyField;
        this.hashKeyType = hashKeyType;
        this.hashKeyValue = hashKeyValue;
        this.operation = operation;
        this.payloadField = payloadField;
        this.rangeKeyField = rangeKeyField;
        this.rangeKeyType = rangeKeyType;
        this.rangeKeyValue = rangeKeyValue;
        this.roleArn = roleArn;
        this.tableName = tableName;
    }

    /**
     * @return The hash key name.
     * 
     */
    public String hashKeyField() {
        return this.hashKeyField;
    }
    /**
     * @return The hash key type. Valid values are &#34;STRING&#34; or &#34;NUMBER&#34;.
     * 
     */
    public Optional<String> hashKeyType() {
        return Optional.ofNullable(this.hashKeyType);
    }
    /**
     * @return The hash key value.
     * 
     */
    public String hashKeyValue() {
        return this.hashKeyValue;
    }
    /**
     * @return The operation. Valid values are &#34;INSERT&#34;, &#34;UPDATE&#34;, or &#34;DELETE&#34;.
     * 
     */
    public Optional<String> operation() {
        return Optional.ofNullable(this.operation);
    }
    /**
     * @return The action payload.
     * 
     */
    public Optional<String> payloadField() {
        return Optional.ofNullable(this.payloadField);
    }
    /**
     * @return The range key name.
     * 
     */
    public Optional<String> rangeKeyField() {
        return Optional.ofNullable(this.rangeKeyField);
    }
    /**
     * @return The range key type. Valid values are &#34;STRING&#34; or &#34;NUMBER&#34;.
     * 
     */
    public Optional<String> rangeKeyType() {
        return Optional.ofNullable(this.rangeKeyType);
    }
    /**
     * @return The range key value.
     * 
     */
    public Optional<String> rangeKeyValue() {
        return Optional.ofNullable(this.rangeKeyValue);
    }
    /**
     * @return The ARN of the IAM role that grants access to the DynamoDB table.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return The name of the DynamoDB table.
     * 
     */
    public String tableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDynamodb defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hashKeyField;
        private @Nullable String hashKeyType;
        private String hashKeyValue;
        private @Nullable String operation;
        private @Nullable String payloadField;
        private @Nullable String rangeKeyField;
        private @Nullable String rangeKeyType;
        private @Nullable String rangeKeyValue;
        private String roleArn;
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleDynamodb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hashKeyField = defaults.hashKeyField;
    	      this.hashKeyType = defaults.hashKeyType;
    	      this.hashKeyValue = defaults.hashKeyValue;
    	      this.operation = defaults.operation;
    	      this.payloadField = defaults.payloadField;
    	      this.rangeKeyField = defaults.rangeKeyField;
    	      this.rangeKeyType = defaults.rangeKeyType;
    	      this.rangeKeyValue = defaults.rangeKeyValue;
    	      this.roleArn = defaults.roleArn;
    	      this.tableName = defaults.tableName;
        }

        public Builder hashKeyField(String hashKeyField) {
            this.hashKeyField = Objects.requireNonNull(hashKeyField);
            return this;
        }
        public Builder hashKeyType(@Nullable String hashKeyType) {
            this.hashKeyType = hashKeyType;
            return this;
        }
        public Builder hashKeyValue(String hashKeyValue) {
            this.hashKeyValue = Objects.requireNonNull(hashKeyValue);
            return this;
        }
        public Builder operation(@Nullable String operation) {
            this.operation = operation;
            return this;
        }
        public Builder payloadField(@Nullable String payloadField) {
            this.payloadField = payloadField;
            return this;
        }
        public Builder rangeKeyField(@Nullable String rangeKeyField) {
            this.rangeKeyField = rangeKeyField;
            return this;
        }
        public Builder rangeKeyType(@Nullable String rangeKeyType) {
            this.rangeKeyType = rangeKeyType;
            return this;
        }
        public Builder rangeKeyValue(@Nullable String rangeKeyValue) {
            this.rangeKeyValue = rangeKeyValue;
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }        public TopicRuleDynamodb build() {
            return new TopicRuleDynamodb(hashKeyField, hashKeyType, hashKeyValue, operation, payloadField, rangeKeyField, rangeKeyType, rangeKeyValue, roleArn, tableName);
        }
    }
}