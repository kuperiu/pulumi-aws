// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableLocalSecondaryIndexArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableLocalSecondaryIndexArgs Empty = new TableLocalSecondaryIndexArgs();

    /**
     * The name of the index
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the index
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Only required with `INCLUDE` as a
     * projection type; a list of attributes to project into the index. These
     * do not need to be defined as attributes on the table.
     * 
     */
    @Import(name="nonKeyAttributes")
    private @Nullable Output<List<String>> nonKeyAttributes;

    /**
     * @return Only required with `INCLUDE` as a
     * projection type; a list of attributes to project into the index. These
     * do not need to be defined as attributes on the table.
     * 
     */
    public Optional<Output<List<String>>> nonKeyAttributes() {
        return Optional.ofNullable(this.nonKeyAttributes);
    }

    /**
     * One of `ALL`, `INCLUDE` or `KEYS_ONLY`
     * where `ALL` projects every attribute into the index, `KEYS_ONLY`
     * projects just the hash and range key into the index, and `INCLUDE`
     * projects only the keys specified in the _non_key_attributes_
     * parameter.
     * 
     */
    @Import(name="projectionType", required=true)
    private Output<String> projectionType;

    /**
     * @return One of `ALL`, `INCLUDE` or `KEYS_ONLY`
     * where `ALL` projects every attribute into the index, `KEYS_ONLY`
     * projects just the hash and range key into the index, and `INCLUDE`
     * projects only the keys specified in the _non_key_attributes_
     * parameter.
     * 
     */
    public Output<String> projectionType() {
        return this.projectionType;
    }

    /**
     * The name of the range key; must be defined
     * 
     */
    @Import(name="rangeKey", required=true)
    private Output<String> rangeKey;

    /**
     * @return The name of the range key; must be defined
     * 
     */
    public Output<String> rangeKey() {
        return this.rangeKey;
    }

    private TableLocalSecondaryIndexArgs() {}

    private TableLocalSecondaryIndexArgs(TableLocalSecondaryIndexArgs $) {
        this.name = $.name;
        this.nonKeyAttributes = $.nonKeyAttributes;
        this.projectionType = $.projectionType;
        this.rangeKey = $.rangeKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableLocalSecondaryIndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableLocalSecondaryIndexArgs $;

        public Builder() {
            $ = new TableLocalSecondaryIndexArgs();
        }

        public Builder(TableLocalSecondaryIndexArgs defaults) {
            $ = new TableLocalSecondaryIndexArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the index
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the index
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nonKeyAttributes Only required with `INCLUDE` as a
         * projection type; a list of attributes to project into the index. These
         * do not need to be defined as attributes on the table.
         * 
         * @return builder
         * 
         */
        public Builder nonKeyAttributes(@Nullable Output<List<String>> nonKeyAttributes) {
            $.nonKeyAttributes = nonKeyAttributes;
            return this;
        }

        /**
         * @param nonKeyAttributes Only required with `INCLUDE` as a
         * projection type; a list of attributes to project into the index. These
         * do not need to be defined as attributes on the table.
         * 
         * @return builder
         * 
         */
        public Builder nonKeyAttributes(List<String> nonKeyAttributes) {
            return nonKeyAttributes(Output.of(nonKeyAttributes));
        }

        /**
         * @param nonKeyAttributes Only required with `INCLUDE` as a
         * projection type; a list of attributes to project into the index. These
         * do not need to be defined as attributes on the table.
         * 
         * @return builder
         * 
         */
        public Builder nonKeyAttributes(String... nonKeyAttributes) {
            return nonKeyAttributes(List.of(nonKeyAttributes));
        }

        /**
         * @param projectionType One of `ALL`, `INCLUDE` or `KEYS_ONLY`
         * where `ALL` projects every attribute into the index, `KEYS_ONLY`
         * projects just the hash and range key into the index, and `INCLUDE`
         * projects only the keys specified in the _non_key_attributes_
         * parameter.
         * 
         * @return builder
         * 
         */
        public Builder projectionType(Output<String> projectionType) {
            $.projectionType = projectionType;
            return this;
        }

        /**
         * @param projectionType One of `ALL`, `INCLUDE` or `KEYS_ONLY`
         * where `ALL` projects every attribute into the index, `KEYS_ONLY`
         * projects just the hash and range key into the index, and `INCLUDE`
         * projects only the keys specified in the _non_key_attributes_
         * parameter.
         * 
         * @return builder
         * 
         */
        public Builder projectionType(String projectionType) {
            return projectionType(Output.of(projectionType));
        }

        /**
         * @param rangeKey The name of the range key; must be defined
         * 
         * @return builder
         * 
         */
        public Builder rangeKey(Output<String> rangeKey) {
            $.rangeKey = rangeKey;
            return this;
        }

        /**
         * @param rangeKey The name of the range key; must be defined
         * 
         * @return builder
         * 
         */
        public Builder rangeKey(String rangeKey) {
            return rangeKey(Output.of(rangeKey));
        }

        public TableLocalSecondaryIndexArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.projectionType = Objects.requireNonNull($.projectionType, "expected parameter 'projectionType' to be non-null");
            $.rangeKey = Objects.requireNonNull($.rangeKey, "expected parameter 'rangeKey' to be non-null");
            return $;
        }
    }

}