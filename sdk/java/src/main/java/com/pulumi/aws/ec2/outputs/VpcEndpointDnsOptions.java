// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpcEndpointDnsOptions {
    /**
     * @return The DNS records created for the endpoint. Valid values are `ipv4`, `dualstack`, `service-defined`, and `ipv6`.
     * 
     */
    private @Nullable String dnsRecordIpType;

    private VpcEndpointDnsOptions() {}
    /**
     * @return The DNS records created for the endpoint. Valid values are `ipv4`, `dualstack`, `service-defined`, and `ipv6`.
     * 
     */
    public Optional<String> dnsRecordIpType() {
        return Optional.ofNullable(this.dnsRecordIpType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcEndpointDnsOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String dnsRecordIpType;
        public Builder() {}
        public Builder(VpcEndpointDnsOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsRecordIpType = defaults.dnsRecordIpType;
        }

        @CustomType.Setter
        public Builder dnsRecordIpType(@Nullable String dnsRecordIpType) {
            this.dnsRecordIpType = dnsRecordIpType;
            return this;
        }
        public VpcEndpointDnsOptions build() {
            final var o = new VpcEndpointDnsOptions();
            o.dnsRecordIpType = dnsRecordIpType;
            return o;
        }
    }
}