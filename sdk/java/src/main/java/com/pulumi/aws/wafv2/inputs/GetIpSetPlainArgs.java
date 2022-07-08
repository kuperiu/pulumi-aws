// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIpSetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIpSetPlainArgs Empty = new GetIpSetPlainArgs();

    /**
     * The name of the WAFv2 IP Set.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the WAFv2 IP Set.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    @Import(name="scope", required=true)
    private String scope;

    /**
     * @return Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    public String scope() {
        return this.scope;
    }

    private GetIpSetPlainArgs() {}

    private GetIpSetPlainArgs(GetIpSetPlainArgs $) {
        this.name = $.name;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpSetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpSetPlainArgs $;

        public Builder() {
            $ = new GetIpSetPlainArgs();
        }

        public Builder(GetIpSetPlainArgs defaults) {
            $ = new GetIpSetPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the WAFv2 IP Set.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param scope Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            $.scope = scope;
            return this;
        }

        public GetIpSetPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}