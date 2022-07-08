// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.outputs;

import com.pulumi.aws.eks.outputs.ClusterEncryptionConfigProvider;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ClusterEncryptionConfig {
    /**
     * @return Configuration block with provider for encryption. Detailed below.
     * 
     */
    private final ClusterEncryptionConfigProvider provider;
    /**
     * @return List of strings with resources to be encrypted. Valid values: `secrets`.
     * 
     */
    private final List<String> resources;

    @CustomType.Constructor
    private ClusterEncryptionConfig(
        @CustomType.Parameter("provider") ClusterEncryptionConfigProvider provider,
        @CustomType.Parameter("resources") List<String> resources) {
        this.provider = provider;
        this.resources = resources;
    }

    /**
     * @return Configuration block with provider for encryption. Detailed below.
     * 
     */
    public ClusterEncryptionConfigProvider provider() {
        return this.provider;
    }
    /**
     * @return List of strings with resources to be encrypted. Valid values: `secrets`.
     * 
     */
    public List<String> resources() {
        return this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEncryptionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterEncryptionConfigProvider provider;
        private List<String> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEncryptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provider = defaults.provider;
    	      this.resources = defaults.resources;
        }

        public Builder provider(ClusterEncryptionConfigProvider provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }
        public Builder resources(List<String> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }        public ClusterEncryptionConfig build() {
            return new ClusterEncryptionConfig(provider, resources);
        }
    }
}