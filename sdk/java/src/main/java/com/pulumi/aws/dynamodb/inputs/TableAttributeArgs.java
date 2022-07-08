// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TableAttributeArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableAttributeArgs Empty = new TableAttributeArgs();

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
     * Attribute type, which must be a scalar type: `S`, `N`, or `B` for (S)tring, (N)umber or (B)inary data
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Attribute type, which must be a scalar type: `S`, `N`, or `B` for (S)tring, (N)umber or (B)inary data
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private TableAttributeArgs() {}

    private TableAttributeArgs(TableAttributeArgs $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableAttributeArgs $;

        public Builder() {
            $ = new TableAttributeArgs();
        }

        public Builder(TableAttributeArgs defaults) {
            $ = new TableAttributeArgs(Objects.requireNonNull(defaults));
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
         * @param type Attribute type, which must be a scalar type: `S`, `N`, or `B` for (S)tring, (N)umber or (B)inary data
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Attribute type, which must be a scalar type: `S`, `N`, or `B` for (S)tring, (N)umber or (B)inary data
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public TableAttributeArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}