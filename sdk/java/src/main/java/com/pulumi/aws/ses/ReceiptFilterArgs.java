// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReceiptFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReceiptFilterArgs Empty = new ReceiptFilterArgs();

    /**
     * The IP address or address range to filter, in CIDR notation
     * 
     */
    @Import(name="cidr", required=true)
    private Output<String> cidr;

    /**
     * @return The IP address or address range to filter, in CIDR notation
     * 
     */
    public Output<String> cidr() {
        return this.cidr;
    }

    /**
     * The name of the filter
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the filter
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Block or Allow
     * 
     */
    @Import(name="policy", required=true)
    private Output<String> policy;

    /**
     * @return Block or Allow
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    private ReceiptFilterArgs() {}

    private ReceiptFilterArgs(ReceiptFilterArgs $) {
        this.cidr = $.cidr;
        this.name = $.name;
        this.policy = $.policy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReceiptFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReceiptFilterArgs $;

        public Builder() {
            $ = new ReceiptFilterArgs();
        }

        public Builder(ReceiptFilterArgs defaults) {
            $ = new ReceiptFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidr The IP address or address range to filter, in CIDR notation
         * 
         * @return builder
         * 
         */
        public Builder cidr(Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr The IP address or address range to filter, in CIDR notation
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        /**
         * @param name The name of the filter
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the filter
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policy Block or Allow
         * 
         * @return builder
         * 
         */
        public Builder policy(Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Block or Allow
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public ReceiptFilterArgs build() {
            $.cidr = Objects.requireNonNull($.cidr, "expected parameter 'cidr' to be non-null");
            $.policy = Objects.requireNonNull($.policy, "expected parameter 'policy' to be non-null");
            return $;
        }
    }

}