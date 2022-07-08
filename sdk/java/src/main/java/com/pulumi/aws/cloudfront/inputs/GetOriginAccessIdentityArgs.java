// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOriginAccessIdentityArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOriginAccessIdentityArgs Empty = new GetOriginAccessIdentityArgs();

    /**
     * The identifier for the distribution. For example: `EDFDVBD632BHDS5`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The identifier for the distribution. For example: `EDFDVBD632BHDS5`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetOriginAccessIdentityArgs() {}

    private GetOriginAccessIdentityArgs(GetOriginAccessIdentityArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOriginAccessIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOriginAccessIdentityArgs $;

        public Builder() {
            $ = new GetOriginAccessIdentityArgs();
        }

        public Builder(GetOriginAccessIdentityArgs defaults) {
            $ = new GetOriginAccessIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The identifier for the distribution. For example: `EDFDVBD632BHDS5`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The identifier for the distribution. For example: `EDFDVBD632BHDS5`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetOriginAccessIdentityArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}