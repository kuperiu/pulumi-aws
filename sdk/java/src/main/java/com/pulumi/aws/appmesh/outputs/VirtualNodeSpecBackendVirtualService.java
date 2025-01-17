// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualServiceClientPolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecBackendVirtualService {
    /**
     * @return The client policy for the backend.
     * 
     */
    private @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicy clientPolicy;
    /**
     * @return The name of the virtual service that is acting as a virtual node backend. Must be between 1 and 255 characters in length.
     * 
     */
    private String virtualServiceName;

    private VirtualNodeSpecBackendVirtualService() {}
    /**
     * @return The client policy for the backend.
     * 
     */
    public Optional<VirtualNodeSpecBackendVirtualServiceClientPolicy> clientPolicy() {
        return Optional.ofNullable(this.clientPolicy);
    }
    /**
     * @return The name of the virtual service that is acting as a virtual node backend. Must be between 1 and 255 characters in length.
     * 
     */
    public String virtualServiceName() {
        return this.virtualServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicy clientPolicy;
        private String virtualServiceName;
        public Builder() {}
        public Builder(VirtualNodeSpecBackendVirtualService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientPolicy = defaults.clientPolicy;
    	      this.virtualServiceName = defaults.virtualServiceName;
        }

        @CustomType.Setter
        public Builder clientPolicy(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicy clientPolicy) {
            this.clientPolicy = clientPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder virtualServiceName(String virtualServiceName) {
            this.virtualServiceName = Objects.requireNonNull(virtualServiceName);
            return this;
        }
        public VirtualNodeSpecBackendVirtualService build() {
            final var o = new VirtualNodeSpecBackendVirtualService();
            o.clientPolicy = clientPolicy;
            o.virtualServiceName = virtualServiceName;
            return o;
        }
    }
}
