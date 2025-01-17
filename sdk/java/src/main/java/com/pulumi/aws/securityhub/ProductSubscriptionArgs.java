// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ProductSubscriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProductSubscriptionArgs Empty = new ProductSubscriptionArgs();

    /**
     * The ARN of the product that generates findings that you want to import into Security Hub - see below.
     * 
     */
    @Import(name="productArn", required=true)
    private Output<String> productArn;

    /**
     * @return The ARN of the product that generates findings that you want to import into Security Hub - see below.
     * 
     */
    public Output<String> productArn() {
        return this.productArn;
    }

    private ProductSubscriptionArgs() {}

    private ProductSubscriptionArgs(ProductSubscriptionArgs $) {
        this.productArn = $.productArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProductSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProductSubscriptionArgs $;

        public Builder() {
            $ = new ProductSubscriptionArgs();
        }

        public Builder(ProductSubscriptionArgs defaults) {
            $ = new ProductSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param productArn The ARN of the product that generates findings that you want to import into Security Hub - see below.
         * 
         * @return builder
         * 
         */
        public Builder productArn(Output<String> productArn) {
            $.productArn = productArn;
            return this;
        }

        /**
         * @param productArn The ARN of the product that generates findings that you want to import into Security Hub - see below.
         * 
         * @return builder
         * 
         */
        public Builder productArn(String productArn) {
            return productArn(Output.of(productArn));
        }

        public ProductSubscriptionArgs build() {
            $.productArn = Objects.requireNonNull($.productArn, "expected parameter 'productArn' to be non-null");
            return $;
        }
    }

}
