// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterKubernetesNetworkConfig {
    private String ipFamily;
    /**
     * @return The CIDR block to assign Kubernetes service IP addresses from.
     * 
     */
    private String serviceIpv4Cidr;

    private GetClusterKubernetesNetworkConfig() {}
    public String ipFamily() {
        return this.ipFamily;
    }
    /**
     * @return The CIDR block to assign Kubernetes service IP addresses from.
     * 
     */
    public String serviceIpv4Cidr() {
        return this.serviceIpv4Cidr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterKubernetesNetworkConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ipFamily;
        private String serviceIpv4Cidr;
        public Builder() {}
        public Builder(GetClusterKubernetesNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipFamily = defaults.ipFamily;
    	      this.serviceIpv4Cidr = defaults.serviceIpv4Cidr;
        }

        @CustomType.Setter
        public Builder ipFamily(String ipFamily) {
            this.ipFamily = Objects.requireNonNull(ipFamily);
            return this;
        }
        @CustomType.Setter
        public Builder serviceIpv4Cidr(String serviceIpv4Cidr) {
            this.serviceIpv4Cidr = Objects.requireNonNull(serviceIpv4Cidr);
            return this;
        }
        public GetClusterKubernetesNetworkConfig build() {
            final var o = new GetClusterKubernetesNetworkConfig();
            o.ipFamily = ipFamily;
            o.serviceIpv4Cidr = serviceIpv4Cidr;
            return o;
        }
    }
}
